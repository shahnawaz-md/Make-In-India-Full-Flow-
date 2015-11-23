package com.makeInIndia.Modules;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.Select;

import com.makeInIndia.Pages.CreateHomePage;
import com.makeInIndia.Pages.CreateFAQandQueryPage;
import com.makeInIndia.Test.SelTestCase;
import com.makeInIndia.Utils.Log;

public class FAQandQueryFormAction extends SelTestCase {
	
	public static void executeEventsOnFAQandQueryFormPage() throws InterruptedException {
		Log.info("Events Going to Performed on Faq Page ");
		
		// Clicking on Faq link
		CreateHomePage.PageDetails.faqlink.click();
		Thread.sleep(5000);
		Log.info("Clicking on FAQ link");
		
		// Clearing the search TextBox
		CreateFAQandQueryPage.FaqPageDetails.searchTextBox.clear();
		Thread.sleep(1000);
		Log.info("Clearing the Search Textbox");
		
		// Entering data on the search TextBox
		CreateFAQandQueryPage.FaqPageDetails.searchTextBox.sendKeys("Visa");
		Thread.sleep(1000);
		Log.info("Entering the Text Visa on the Search Textbox");
		CreateFAQandQueryPage.FaqPageDetails.searchTextBox.sendKeys(Keys.DOWN);
		Thread.sleep(1000);
		Log.info("Arrow Down");
		CreateFAQandQueryPage.FaqPageDetails.searchTextBox.sendKeys(Keys.ENTER);
		Thread.sleep(1000);
		Log.info("Clicking Enter Key");
		
		//Scrolling down the Page
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy(0,500)", "");
		Thread.sleep(1000);
		Log.info("Scrolling down the page");
		
		// Clicking on Faq link
		CreateHomePage.PageDetails.faqlink.click();
		Thread.sleep(5000);
		Log.info("Clicking on FAQ link");
		
		// Clicking on Here link
		CreateFAQandQueryPage.FaqPageDetails.clickHereLink.click();
		Thread.sleep(2000);
		Log.info("Clicking on QueryForm link");
		
		// Entering First Name
		CreateFAQandQueryPage.FaqPageDetails.QueryForm.firstNameTextBox.sendKeys("Shahnawaz");
		Thread.sleep(2000);
		Log.info("Entering First Name");
		
		// Entering Last Name
		CreateFAQandQueryPage.FaqPageDetails.QueryForm.lastNameTextBox.sendKeys("Md");
		Thread.sleep(2000);
		Log.info("Entering Last Name");
		
		// Entering Email Id
		CreateFAQandQueryPage.FaqPageDetails.QueryForm.EmailTextBox.sendKeys("Shahnawaz@ubiquesystems.co.in");
		Thread.sleep(2000);
		Log.info("Entering Email Id");
		
		// Entering Contact Number
		CreateFAQandQueryPage.FaqPageDetails.QueryForm.contactNumberTextBox.sendKeys("8820593072");
		Thread.sleep(2000);
		Log.info("Entering Contact Number");
		
		Thread.sleep(5000);
		Log.info("Entering Captcha Manually");
		
		// Entering Query Title
		CreateFAQandQueryPage.FaqPageDetails.QueryForm.queryTitleTextBox.sendKeys("Testing@Ubique");
		Thread.sleep(2000);
		Log.info("Entering Query Title");
		
		// Select Sectors Type
		Select sector = new Select(CreateFAQandQueryPage.FaqPageDetails.QueryForm.selectSectors);
		sector.selectByValue("AVIATION");
		Thread.sleep(2000);
		Log.info("Selecting the Sectors");
				
		// Select Sectors Type
		Select country = new Select(CreateFAQandQueryPage.FaqPageDetails.QueryForm.selectCountry);
		country.selectByValue("INDIA");
		Thread.sleep(2000);
		Log.info("Selecting the Country");
		
		// Entering Query Detail
		CreateFAQandQueryPage.FaqPageDetails.QueryForm.queryDetailTextBox.sendKeys("This is for testing purpose");
		Thread.sleep(2000);
		Log.info("Entering Query Detail");
		
		// Clicking on Submit Button
		CreateFAQandQueryPage.FaqPageDetails.QueryForm.submitButton.click();
		Thread.sleep(2000);
		Log.info("Clicking on Submit Button");
		
		// Clicking on Faq link
		CreateHomePage.PageDetails.faqlink.click();
		Thread.sleep(5000);
		Log.info("Clicking on FAQ link");
		
		
		

	}
}