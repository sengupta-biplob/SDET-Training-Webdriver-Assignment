package com.ibm.jigsaw.sdet.webdriver.assignment.pageobjects.base;



import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

import org.openqa.selenium.StaleElementReferenceException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import org.openqa.selenium.support.ui.ExpectedConditions;

import org.openqa.selenium.support.ui.WebDriverWait;

import com.ibm.jigsaw.sdet.webdriver.assignment.common.WebdriverBean;

public class BasePageObject {

	public WebDriver driver;
	protected WebDriverWait wait;
	

	public BasePageObject() {
		driver = WebdriverBean.getWebdriver();
		this.wait = new WebDriverWait(driver, 30);

	}

	/**********************************************************************************
	 ** VERIFY MESSAGE
	 *
	 * Asserts whether the Actual Message displayed matches the expected message.
	 * 
	 * @param String: expectedText, String:actualText *
	 * 
	 * @author Biplob Sengupta
	 *
	 **********************************************************************************/
	public void verifyMessage(String expectedText, String actualText) {
		
		Assert.assertTrue("Actual Message: \"" + actualText + "\" does not match the Expected message: \""+ expectedText + "\"",
				expectedText.equals(actualText));
	}

	/**********************************************************************************
	 ** VERIFY PAGE TITLE
	 *
	 * Asserts whether the Actual Page Title matches the Expected Page title.
	 * 
	 * @param String: expectedPageTitle
	 * @throws InterruptedException *
	 * 
	 * @author Biplob Sengupta *
	 *
	 **********************************************************************************/
	public void verifyPageTitle(String expectedTitle) throws InterruptedException {
		Assert.assertTrue("Actual Page Title does not match the Expected Page title",
				expectedTitle.equals(getPageTitle()));
	}

	/**********************************************************************************
	 ** CLICK ENTER METHOD
	 *
	 * Click the element using by mimicking the keyboard Enter key press Waits for
	 * the element to be clickable Attempts 20 times before giving up
	 * 
	 * @param WebeElement: element
	 * 
	 * @author Biplob Sengupta
	 **********************************************************************************/
	public void clickElement(WebElement element) {

		boolean clicked = false;
		int attempts = 0;

		while (!clicked && attempts < 20) {

			this.wait.until(ExpectedConditions.elementToBeClickable(element));

			element.sendKeys(Keys.ENTER);

			clicked = true;

			attempts++;
		}

	}

	/**********************************************************************************
	 ** CLICK ENTER METHOD
	 *
	 * Click the element using by mimicking mouse navigation to the element and then
	 * clicking Waits for the element to be clickable Handles
	 * StateelementReferenceException *
	 * 
	 * @param WebeElement: element
	 * 
	 * @author Biplob Sengupta
	 * 
	 **********************************************************************************/
	public void actionMoveAndClick(WebElement element) throws Exception {

		Actions ob = new Actions(driver);

		try {
			this.wait.until(ExpectedConditions.elementToBeClickable(element)).isEnabled();

			if (!element.isSelected()) {
				ob.moveToElement(element).click().build().perform();
			}

		} catch (StaleElementReferenceException elementUpdated) {
			WebElement elementToClick = element;
			Boolean elementPresent = wait.until(ExpectedConditions.elementToBeClickable(elementToClick)).isEnabled();

			if (elementPresent == true) {
				if (!element.isSelected()) {
					ob.moveToElement(elementToClick).click().build().perform();
				}

			}

		} catch (Exception e) {

			Assert.fail("Unable to Action Move and Click on the WebElement, Exception: " + e.getMessage());

		}

	}

	/**********************************************************************************
	 ** SEND KEYS METHOD
	 *
	 * Populates the text box with the String passed in. Waits for the webelement
	 * 
	 * 
	 * @param WebeElement: element, String: Text to write
	 * 
	 * @author Biplob Sengupta
	 * 
	 **********************************************************************************/
	public void populateTextField(WebElement element, String textToSend) throws Exception {

		try {
			this.WaitUntilWebElementIsVisible(element);
			element.clear();
			element.sendKeys(textToSend);

		} catch (Exception e) {
			Assert.fail("Cannot populate text box, Exception: " + e.getMessage());

		}

	}

	/**********************************************************************************
	 ** WAIT METHODS
	 **********************************************************************************/
	public boolean WaitUntilWebElementIsVisible(WebElement element) {
		try {
			this.wait.until(ExpectedConditions.visibilityOf(element));

			return true;
		} catch (Exception e) {
			Assert.fail("WebElement is NOT visible, Exception: " + e.getMessage());
			return false;
		}
	}

	public boolean WaitUntilWebElementIsVisibleUsingByLocator(By element) {
		try {
			this.wait.until(ExpectedConditions.visibilityOfElementLocated(element));

			return true;
		} catch (Exception e) {

			Assert.fail("WebElement is NOT visible, Exception: " + e.getMessage());
			return false;
		}
	}

	public boolean isElementClickable(WebElement element) {
		try {
			this.wait.until(ExpectedConditions.elementToBeClickable(element));

			return true;
		} catch (Exception e) {

			return false;
		}
	}

	public boolean waitUntilPreLoadElementDissapears(By element) {
		return this.wait.until(ExpectedConditions.invisibilityOfElementLocated(element));
	}

	/**********************************************************************************
	 ** PAGE METHODS
	 * 
	 * @throws Throwable
	 **********************************************************************************/
	public void loadUrl(String url) {

		try {
			driver.get(url);

		} catch (Exception e) {
			Assert.fail("Unable to load url: " + url);
		}

	}

	public String getCurrentURL() {
		try {
			String url = driver.getCurrentUrl();

			return url;
		} catch (Exception e) {

			return e.getMessage();
		}
	}

	@SuppressWarnings("static-access")
	public String getTextFromElement(WebElement element) throws InterruptedException {

		String text = new String();

		if (isElementClickable(element)) {
			try {
				text = element.getText();
			} catch (Exception e) {

				Thread.currentThread().sleep(5000);
				text = element.getText();
			}
		}
		if (text.equals(null)) {

			Thread.currentThread().sleep(5000);
			text = element.getText();
		}
		return text;
	}

	public String getAttributeValueFromElement(WebElement element, String value) throws Throwable {
		String text = new String();

		if (isElementClickable(element)) {
			try {
				text = element.getAttribute(value);
			} catch (Exception e) {
			}
		}
		return text;

	}

	@SuppressWarnings("static-access")
	public String getPageTitle() throws InterruptedException {
		Thread.currentThread().sleep(2000);
		return driver.getTitle();
	}

}
