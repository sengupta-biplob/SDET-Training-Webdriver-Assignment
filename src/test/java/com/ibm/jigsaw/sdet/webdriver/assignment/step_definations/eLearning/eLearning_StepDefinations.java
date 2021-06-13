package com.ibm.jigsaw.sdet.webdriver.assignment.step_definations.eLearning;


import com.ibm.jigsaw.sdet.webdriver.assignment.common.WebdriverBean;
import com.ibm.jigsaw.sdet.webdriver.assignment.pageobjects.eLearning.eLearning_DropdownAvatarPageObject;
import com.ibm.jigsaw.sdet.webdriver.assignment.pageobjects.eLearning.eLearning_LoginPageObject;
import com.ibm.jigsaw.sdet.webdriver.assignment.pageobjects.eLearning.eLearning_RegistrationPageObject;
import com.ibm.jigsaw.sdet.webdriver.assignment.pageobjects.eLearning.eLearning_SocialNetworkPageObject;

import io.cucumber.java.After;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;


public class eLearning_StepDefinations {

	private eLearning_LoginPageObject elearning_LogingPageObject;
	private eLearning_RegistrationPageObject elearning_RegistrationPageObject;
	private eLearning_DropdownAvatarPageObject elearning_DropdownAvatarPageObject;
	private eLearning_SocialNetworkPageObject elearning_SocialNetworkPageObject;

	
	
	public eLearning_StepDefinations (WebdriverBean driver, eLearning_LoginPageObject elearning_LogingPageObject, eLearning_RegistrationPageObject elearning_RegistrationPageObject,
			eLearning_DropdownAvatarPageObject elearning_DropdownAvatarPageObject, eLearning_SocialNetworkPageObject elearning_SocialNetworkPageObject) {
		
		
		this.elearning_LogingPageObject = elearning_LogingPageObject;
		this.elearning_RegistrationPageObject = elearning_RegistrationPageObject;
		this.elearning_DropdownAvatarPageObject = elearning_DropdownAvatarPageObject;
		this.elearning_SocialNetworkPageObject = elearning_SocialNetworkPageObject;
	}
	
	@After
	public void testTearDown() {
		WebdriverBean.getWebdriver().quit();
	}


	
	
	@Given("^We navigate to eLearning Portal via \"([^\"]*)\"$")
	public void we_navigate_to_eLearning_Portal_via(String url) throws Throwable {
		elearning_LogingPageObject.navigateTo(url);
	}


	@Then("^We click on \"([^\"]*)\" on \"([^\"]*)\"$")
	public void we_click_on_on(String elementName, String pageName) throws Throwable {

		switch(pageName.toUpperCase()) {

		case "LOGIN PAGE":
			elearning_LogingPageObject.clickElement(elementName);
			break;

		case "REGISTRATION PAGE":
			elearning_RegistrationPageObject.clickElement(elementName);
			break;
			
		case "AVATAR DROPDOWN":
			elearning_DropdownAvatarPageObject.clickElement(elementName);
			break;
			
		case "SOCIAL NETWORK PAGE":
			elearning_SocialNetworkPageObject.clickElement(elementName);
			break;
		}
	}

	@Then("^We populate \"([^\"]*)\" with \"([^\"]*)\" on \"([^\"]*)\"$")
	public void we_populate_with_on(String elementName, String text, String pageName) throws Throwable {

		switch(pageName.toUpperCase()) {

		case "LOGIN PAGE":
			elearning_LogingPageObject.populateField(elementName, text);
			break;

		case "REGISTRATION PAGE":
			elearning_RegistrationPageObject.populateField(elementName, text);
			break;
			
		case "SOCIAL NETWORK PAGE":
			elearning_SocialNetworkPageObject.populateField(elementName, text);
			break;
		}

	}
	
	@Then("^We verify message displayed as \"([^\"]*)\" at \"([^\"]*)\" on \"([^\"]*)\"$")
	public void we_verify_message_displayed_as(String msg, String elementName, String pageName) throws Throwable {
		
		switch(pageName.toUpperCase()) {

		case "LOGIN PAGE":
			// Call verify method on Login Page
			break;

		case "REGISTRATION PAGE":
			elearning_RegistrationPageObject.verifyDisplayMessage(elementName, msg);
			break;
			
		case "AVATAR DROPDOWN":
			elearning_DropdownAvatarPageObject.verifyDisplayMessage(elementName, msg);
			break;
		}
	}



}
