package com.ibm.jigsaw.sdet.webdriver.assignment.pageobjects.eLearning;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.ibm.jigsaw.sdet.webdriver.assignment.pageobjects.base.BasePageObject;

public class eLearning_SocialNetworkPageObject extends BasePageObject {
	
	public @FindBy(xpath = "/html[1]/body[1]/main[1]/section[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/a[1]/img[1]")
				WebElement ELEARNING_SOCIALNETWORK_COMPOSEEMAIL_BTN;
	public @FindBy(xpath = "//input[@type='search']") WebElement ELEARNING_SOCIALNETWORK_SENDTO_TXTBOX;
	public @FindBy(xpath = "//input[@id='compose_message_title']") WebElement ELEARNING_SOCIALNETWORK_SUBJECT_TXTBOX;
	public @FindBy(xpath = "//body[@class='cke_editable cke_editable_themed cke_contents_ltr cke_show_borders']//p") WebElement ELEARNING_SOCIALNETWORK_MESSAGEBODY_TXTBOX;
	public @FindBy(xpath = "//li[contains(@class, '--highlighted')]") WebElement ELEARNING_SOCIALNETWORK_SELECTUSERNAME_OPTION;
	public @FindBy(xpath = "//body[@class='cke_editable cke_editable_themed cke_contents_ltr cke_show_borders']//p") WebElement ELEARNING_SOCIALNETWORK_SENDMESSAGE_BTN;
	public @FindBy(xpath = "//div[@class='alert alert-success']") WebElement ELEARNING_SOCIALNETWORK_MSGBOX;
	
	public eLearning_SocialNetworkPageObject() {
		PageFactory.initElements(driver, this);
	}
	
	
	
	public void clickElement(String elementogicalName) throws Exception {


		switch(elementogicalName) {

		case "ELEARNING_SOCIALNETWORK_COMPOSEEMAIL_BTN":
			actionMoveAndClick(ELEARNING_SOCIALNETWORK_COMPOSEEMAIL_BTN);
			break;
			
		case "ELEARNING_SOCIALNETWORK_SENDMESSAGE_BTN":
			actionMoveAndClick(ELEARNING_SOCIALNETWORK_SENDMESSAGE_BTN);
			break;
			
		case "ELEARNING_SOCIALNETWORK_SELECTUSERNAME_OPTION":
			actionMoveAndClick(ELEARNING_SOCIALNETWORK_SELECTUSERNAME_OPTION);
			break;		

		default: 
			throw new Exception("USER DEFINED EXCEPTION: " + elementogicalName + " not found on the eLearning Social Network Page");
		}

	}

	public void populateField(String elementogicalName, String text) throws Exception {		

		switch(elementogicalName) {

		case "ELEARNING_SOCIALNETWORK_SENDTO_TXTBOX":
			populateTextField(ELEARNING_SOCIALNETWORK_SENDTO_TXTBOX, text);
			break;

		case "ELEARNING_SOCIALNETWORK_SUBJECT_TXTBOX":
			populateTextField(ELEARNING_SOCIALNETWORK_SUBJECT_TXTBOX, text);
			break;
			
		case "ELEARNING_SOCIALNETWORK_MESSAGEBODY_TXTBOX":
			populateTextField(ELEARNING_SOCIALNETWORK_MESSAGEBODY_TXTBOX, text);
			break;			
		
		default: 
			throw new Exception("USER DEFINED EXCEPTION: " + elementogicalName + " not forund on the eLearning Social Network Page");
		}
	}
	
	
public void verifyDisplayMessage(String elementLogicalName, String expectedText) throws Exception {
		
		switch(elementLogicalName) {
		
		case "ELEARNING_SOCIALNETWORK_MSGBOX":
			verifyMessage(expectedText, getTextFromElement(ELEARNING_SOCIALNETWORK_MSGBOX));
			break;	
		
			
		default: 
			throw new Exception("USER DEFINED EXCEPTION: " + elementLogicalName + " not forund on the eLearning Social Network Page");
		}
		
	}
	

}
