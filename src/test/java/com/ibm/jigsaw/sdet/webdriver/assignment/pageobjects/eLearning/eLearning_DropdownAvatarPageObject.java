package com.ibm.jigsaw.sdet.webdriver.assignment.pageobjects.eLearning;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.ibm.jigsaw.sdet.webdriver.assignment.pageobjects.base.BasePageObject;

public class eLearning_DropdownAvatarPageObject extends BasePageObject {

	public @FindBy(xpath = "/html[1]/body[1]/main[1]/header[1]/nav[1]/div[1]/div[2]/ul[2]/li[2]/a[1]/span[2]") WebElement ELEARNING_AVATAR_DROPDOWN_BTN;
	public @FindBy(xpath = "/html[1]/body[1]/main[1]/header[1]/nav[1]/div[1]/div[2]/ul[2]/li[2]/ul[1]/li[1]/div[1]/p[1]") WebElement ELEARNING_AVATAR_EMAIL_MSGBOX;
	public @FindBy(xpath = "//a[@title='Inbox']") WebElement ELEARNING_AVATAR_INBOX_LINK;

	public eLearning_DropdownAvatarPageObject() {
		PageFactory.initElements(driver, this);
	}

	public void clickElement(String elementogicalName) throws Exception {

		switch (elementogicalName) {

		case "ELEARNING_AVATAR_DROPDOWN_BTN":
			actionMoveAndClick(ELEARNING_AVATAR_DROPDOWN_BTN);
			break;

		case "ELEARNING_AVATAR_INBOX_LINK":
			actionMoveAndClick(ELEARNING_AVATAR_INBOX_LINK);
			break;

		default:
			throw new Exception(
					"USER DEFINED EXCEPTION: " + elementogicalName + " not found on the eLearning Avatar Dropdown");
		}

	}

	public void verifyDisplayMessage(String elementLogicalName, String expectedText) throws Exception {

		switch (elementLogicalName) {

		case "ELEARNING_AVATAR_EMAIL_MSGBOX":
			verifyMessage(expectedText, getTextFromElement(ELEARNING_AVATAR_EMAIL_MSGBOX));
			break;

		default:
			throw new Exception(
					"USER DEFINED EXCEPTION: " + elementLogicalName + " not forund on the eLearning Avatar Dropdown");
		}

	}

}
