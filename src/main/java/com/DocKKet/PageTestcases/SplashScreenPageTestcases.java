package com.DocKKet.PageTestcases;

import org.testng.annotations.Test;

import com.DocKKet.PageFunctions.SplashScreenPageFunctions;

import MobileSetUp.AndroidProperties;


public class SplashScreenPageTestcases extends AndroidProperties {
	
	@Test(description =  "Verify that the user can successfully navigates to login screen" , priority = 1)
	public void splashTest() {
				
		SplashScreenPageFunctions funcall = new SplashScreenPageFunctions();
		funcall.splashFunctionality();
		
		System.out.println("succesfully navigated to Login screen");
		
	}

}
