package com.ibm.jigsaw.sdet.webdriver.assignment.common;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class WebdriverBean {
	
	private static WebDriver driver;
	
	public WebdriverBean() {		
		
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "/src/test/resources/Drivers/chromedriver.exe");
		
		driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);		
		
	}
	
	public static WebDriver getWebdriver() {
		return driver;
	}

}
