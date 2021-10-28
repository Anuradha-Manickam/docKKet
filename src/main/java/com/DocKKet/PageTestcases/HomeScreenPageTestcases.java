package com.DocKKet.PageTestcases;


import java.io.IOException;
import org.testng.annotations.Test;

import com.DocKKet.PageFunctions.HomeScreenPageFunctions;

import MobileSetUp.AndroidProperties;

public class HomeScreenPageTestcases extends AndroidProperties {

	@Test(description = "Verify that a user can create Company and Site using valid Data"  , priority = 3)
	public void homeScreenTests() throws IOException {

		HomeScreenPageFunctions  funcall = new  HomeScreenPageFunctions ();
		funcall.homeScreenFunctionality();

		System.out.println("succesfully created Company and Site");
	}
}
