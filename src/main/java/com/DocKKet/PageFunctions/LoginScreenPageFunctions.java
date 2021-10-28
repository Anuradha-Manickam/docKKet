package com.DocKKet.PageFunctions;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.DocKKet.PageObjects.LoginScreenPageObjects;

import MobileSetUp.AndroidProperties;

public class LoginScreenPageFunctions extends AndroidProperties {
	
InputStream inputStream;
	
	public void successfulLoginFunctionality() throws IOException {
		
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

			// ----------------------Login using valid credentials----------------------------			

			WebDriverWait wait = new WebDriverWait(driver,800);
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("android.widget.EditText")));

			//-----------Enter valid email to login--------------------
			driver.findElementByXPath(LoginScreenPageObjects.loginEmail).click();

			Actions emailaction=new Actions(driver);
			emailaction.sendKeys(prop.getProperty("validEmail")).perform();

			driver.findElementByAccessibilityId(LoginScreenPageObjects.loginNext).click();
			
			Thread.sleep(10000);

			// --------------Enter valid password to login----------------
			driver.findElementByXPath(LoginScreenPageObjects.loginPassword).click();

			Actions passwordaction=new Actions(driver);
			passwordaction.sendKeys(prop.getProperty("validPassword")).perform();

			driver.findElementByAccessibilityId(LoginScreenPageObjects.loginbutton).click();

			System.out.println("completed login process");

		} catch (Exception e) {
			System.out.println("Exception: " + e);
		} finally {
			inputStream.close();
		}		

	}

	public void successfullLoginsetup() throws IOException {

		LoginScreenPageFunctions properties = new LoginScreenPageFunctions();
		properties.successfullLoginsetup();

	}

}
