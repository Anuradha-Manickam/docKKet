package com.DocKKet.PageFunctions;

import MobileSetUp.AndroidProperties;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.DocKKet.PageObjects.SplashScreenPageObjects;


public class SplashScreenPageFunctions extends AndroidProperties {
	
	public void splashFunctionality() {
		
		WebDriverWait wait = new WebDriverWait(driver,400);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("android.widget.Button")));

		// OnBoard screen 1
        driver.findElementByAccessibilityId(SplashScreenPageObjects.splashScreen1).click();
		
		// OnBoard screen 2
		driver.findElementByAccessibilityId(SplashScreenPageObjects.splashScreen1).click();
		
		// OnBoard screen 3
		driver.findElementByAccessibilityId(SplashScreenPageObjects.splashScreen3).click();

		System.out.println("End of splash screen");

	}
	
	

}
