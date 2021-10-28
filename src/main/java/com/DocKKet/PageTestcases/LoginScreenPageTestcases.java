package com.DocKKet.PageTestcases;

import java.io.IOException;
import org.testng.annotations.Test;

import com.DocKKet.PageFunctions.LoginScreenPageFunctions;

import MobileSetUp.AndroidProperties;

public class LoginScreenPageTestcases extends AndroidProperties {
	
	@Test(description = "Verify that a user can login to the application with valid credentials" , priority = 2)
	public void LoginTest() throws IOException {
				
		LoginScreenPageFunctions funcall = new LoginScreenPageFunctions();
		funcall.successfulLoginFunctionality();
		
		System.out.println("succesfully navigated to Homescreen using valid credential");
		
	}

}
