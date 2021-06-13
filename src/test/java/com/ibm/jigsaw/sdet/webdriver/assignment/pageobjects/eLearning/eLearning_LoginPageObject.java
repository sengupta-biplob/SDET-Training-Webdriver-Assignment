package com.ibm.jigsaw.sdet.webdriver.assignment.pageobjects.eLearning;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.ibm.jigsaw.sdet.webdriver.assignment.pageobjects.base.BasePageObject;

public class eLearning_LoginPageObject extends BasePageObject {

	public @FindBy(id = "login") WebElement ELEARNING_LOGINPAGE_USERNAME_TXTBOX;
	public @FindBy(id = "password") WebElement ELEARNING_LOGINPAGE_PASSWORD_TXTBOX;
	public @FindBy(id = "form-login_submitAuth") WebElement ELEARNING_LOGINPAGE_LOGIN_BTN;
	public @FindBy(partialLinkText = "Sign up!") WebElement ELEARNING_LOGINPAGE_SIGNUP_LINK;

	public eLearning_LoginPageObject() {
		PageFactory.initElements(driver, this);
	}

	public void navigateTo(String url) {
		loadUrl(url);
	}

	public void clickElement(String elementogicalName) throws Exception {


		switch(elementogicalName) {

		case "ELEARNING_LOGINPAGE_LOGIN_BTN":
			actionMoveAndClick(ELEARNING_LOGINPAGE_LOGIN_BTN);
			break;

		case "ELEARNING_LOGINPAGE_SIGNUP_LINK":			
			actionMoveAndClick(ELEARNING_LOGINPAGE_SIGNUP_LINK);
			break;

		default: 
			throw new Exception("USER DEFINED EXCEPTION: " + elementogicalName + " not found on the eLearning Login Page");
		}

	}

	public void populateField(String elementogicalName, String text) throws Exception {		

		switch(elementogicalName) {

		case "ELEARNING_LOGINPAGE_USERNAME_TXTBOX":
			populateTextField(ELEARNING_LOGINPAGE_USERNAME_TXTBOX, text);
			break;

		case "ELEARNING_LOGINPAGE_PASSWORD_TXTBOX":
			populateTextField(ELEARNING_LOGINPAGE_PASSWORD_TXTBOX, text);
			break;

		default: 
			throw new Exception("USER DEFINED EXCEPTION: " + elementogicalName + " not forund on the eLearning Login Page");
		}
	}

}


