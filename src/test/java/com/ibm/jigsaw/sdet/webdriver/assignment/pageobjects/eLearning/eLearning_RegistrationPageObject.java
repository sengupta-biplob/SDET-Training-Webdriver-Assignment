package com.ibm.jigsaw.sdet.webdriver.assignment.pageobjects.eLearning;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.ibm.jigsaw.sdet.webdriver.assignment.pageobjects.base.BasePageObject;

public class eLearning_RegistrationPageObject extends BasePageObject {
	
	
	public @FindBy(id = "registration_firstname") WebElement ELEARNING_REGISTRATIONPAGE_FIRSTNAME_TXTBOX;
	public @FindBy(id = "registration_lastname") WebElement ELEARNING_REGISTRATIONPAGE_LASTNAME_TXTBOX;
	public @FindBy(id = "registration_email") WebElement ELEARNING_REGISTRATIONPAGE_EMAIL_TXTBOX;
	public @FindBy(id = "username") WebElement ELEARNING_REGISTRATIONPAGE_USERNAME_TXTBOX;
	public @FindBy(id = "pass1") WebElement ELEARNING_REGISTRATIONPAGE_PWD_TXTBOX;
	public @FindBy(id = "pass2") WebElement ELEARNING_REGISTRATIONPAGE_CONFIRMPWD_TXTBOX;
	public @FindBy(id = "registration_phone") WebElement ELEARNING_REGISTRATIONPAGE_PHONE_TXTBOX;
	public @FindBy(id = "registration_submit") WebElement ELEARNING_REGISTRATIONPAGE_REGISTER_BTN;
	public @FindBy(xpath = "/html[1]/body[1]/main[1]/section[1]/div[1]/div[2]/div[1]/p[2]") WebElement ELEARNING_REGISTRATIONPAGE_MSGBOX_01;
	public @FindBy(xpath = "/html[1]/body[1]/main[1]/section[1]/div[1]/div[2]/div[1]/form[1]/fieldset[1]/p[1]") WebElement ELEARNING_REGISTRATIONPAGE_MSGBOX_02;
	
	
	public eLearning_RegistrationPageObject() {
		PageFactory.initElements(driver, this);
	}
	
	
	public void clickElement(String elementogicalName) throws Exception {


		switch(elementogicalName) {

		case "ELEARNING_REGISTRATIONPAGE_REGISTER_BTN":
			actionMoveAndClick(ELEARNING_REGISTRATIONPAGE_REGISTER_BTN);
			break;

		

		default: 
			throw new Exception("USER DEFINED EXCEPTION: " + elementogicalName + " not found on the eLearning Registration Page");
		}

	}

	public void populateField(String elementogicalName, String text) throws Exception {		

		switch(elementogicalName) {

		case "ELEARNING_REGISTRATIONPAGE_FIRSTNAME_TXTBOX":
			populateTextField(ELEARNING_REGISTRATIONPAGE_FIRSTNAME_TXTBOX, text);
			break;

		case "ELEARNING_REGISTRATIONPAGE_LASTNAME_TXTBOX":
			populateTextField(ELEARNING_REGISTRATIONPAGE_LASTNAME_TXTBOX, text);
			break;
			
		case "ELEARNING_REGISTRATIONPAGE_EMAIL_TXTBOX":
			populateTextField(ELEARNING_REGISTRATIONPAGE_EMAIL_TXTBOX, text);
			break;
			
		case "ELEARNING_REGISTRATIONPAGE_USERNAME_TXTBOX":
			populateTextField(ELEARNING_REGISTRATIONPAGE_USERNAME_TXTBOX, text);
			break;
			
		case "ELEARNING_REGISTRATIONPAGE_PWD_TXTBOX":
			populateTextField(ELEARNING_REGISTRATIONPAGE_PWD_TXTBOX, text);
			break;
			
		case "ELEARNING_REGISTRATIONPAGE_CONFIRMPWD_TXTBOX":
			populateTextField(ELEARNING_REGISTRATIONPAGE_CONFIRMPWD_TXTBOX, text);
			break;
			
		case "ELEARNING_REGISTRATIONPAGE_PHONE_TXTBOX":
			populateTextField(ELEARNING_REGISTRATIONPAGE_PHONE_TXTBOX, text);
			break;

		default: 
			throw new Exception("USER DEFINED EXCEPTION: " + elementogicalName + " not forund on the eLearning Registration Page");
		}
	}
	
	public void verifyDisplayMessage(String elementLogicalName, String expectedText) throws Exception {
		
		switch(elementLogicalName) {
		
		case "ELEARNING_REGISTRATIONPAGE_MSGBOX_01":
			//System.out.println("Actual Msg: " + getTextFromElement(ELEARNING_REGISTRATIONPAGE_MSGBOX));
			verifyMessage(expectedText, getTextFromElement(ELEARNING_REGISTRATIONPAGE_MSGBOX_01));
			break;
			
		case "ELEARNING_REGISTRATIONPAGE_MSGBOX_02":
			//System.out.println("Actual Msg: " + getTextFromElement(ELEARNING_REGISTRATIONPAGE_MSGBOX));
			verifyMessage(expectedText, getTextFromElement(ELEARNING_REGISTRATIONPAGE_MSGBOX_02));
			break;
			
		default: 
			throw new Exception("USER DEFINED EXCEPTION: " + elementLogicalName + " not forund on the eLearning Registration Page");
		}
		
	}
	

}
