package com.DocKKet.PageFunctions;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;
import MobileSetUp.AndroidProperties;

import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.DocKKet.PageObjects.HomeScreenPageObjects;

public class HomeScreenPageFunctions extends AndroidProperties {
	

	InputStream inputStream;


	public void homeScreenFunctionality() throws IOException {
		
		// ----------------------properties setup---------------------------
		try {
			Properties prop = new Properties();
			String propFileName = "config.properties";

			inputStream = getClass().getClassLoader().getResourceAsStream(propFileName);

			if (inputStream != null) {
				prop.load(inputStream);
			} else {
				throw new FileNotFoundException("property file '" + propFileName + "' not found in the classpath");
			}
			
			Thread.sleep(6000);

			// ----------------------creating Company and site using valid data----------------------------			

			WebDriverWait wait = new WebDriverWait(driver,1000);		
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("android.widget.EditText")));
			
			driver.findElementByXPath(HomeScreenPageObjects.companyName).click();

			Actions companyNameaction=new Actions(driver);
			companyNameaction.sendKeys(prop.getProperty("companyName")).perform();
			
			Thread.sleep(6000);

			driver.findElementByXPath(HomeScreenPageObjects.country).click();
			
			Thread.sleep(6000);

			driver.findElementByAccessibilityId(HomeScreenPageObjects.dropdownIreland).click();
			
			Thread.sleep(6000);

			driver.findElementByXPath(HomeScreenPageObjects.siteName).click();

			Actions siteNameaction=new Actions(driver);
			siteNameaction.sendKeys(prop.getProperty("siteName")).perform();
			
			Thread.sleep(6000);
			
			driver.findElementByAccessibilityId(HomeScreenPageObjects.createCompany).click();

		} catch (Exception e) {
			System.out.println("Exception: " + e);
		} finally {
			inputStream.close();
		}		

	}
	public void successfulHomescreenSetup() throws IOException {

		HomeScreenPageFunctions properties  = new HomeScreenPageFunctions();
		properties.homeScreenFunctionality();

	}

}
