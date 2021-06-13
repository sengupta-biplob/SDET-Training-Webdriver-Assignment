package com.ibm.jigsaw.sdet.webdriver.assignment.test_runners.eLearning;

import java.io.IOException;

import io.cucumber.core.cli.Main;

public class LoginFeatureTestRunner {
	
	public static void main(String[] args) {
		
		try {
			Runtime.getRuntime().exec("taskkill /F /IM chromedriver.exe");
		} catch (IOException e) {
			
			e.printStackTrace();
		}
	
	Main.main(new String[] { 
            "--glue", "com.ibm.jigsaw.sdet.webdriver.assignment.step_definations", 
            "--tags", "@SignUp", 
            "./src/test/resources/features/" 
            });
	}
	
	

}

