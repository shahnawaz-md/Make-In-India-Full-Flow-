package com.makeInIndia.Modules;

import org.openqa.selenium.JavascriptExecutor;

import com.makeInIndia.Pages.CreateHomePage;
import com.makeInIndia.Test.SelTestCase;
import com.makeInIndia.Utils.Log;



public class HomePageAction extends SelTestCase {
	
	public static void executeEventsOnHomePage() throws InterruptedException {
		Log.info("Events Going to Performed on HomePage ");
		
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy(0,500)", "");
		
		Log.info("Scrolling down the page");
		
		// Clicking on Social Media link
		CreateHomePage.PageDetails.PageLinks.homepageSocialMedialink.click();
		Thread.sleep(5000);
		Log.info("Clicking on Social Media Link");
		CreateHomePage.PageDetails.homelink.click();
		Thread.sleep(2000);
		Log.info("Clicking on HomePage Link");
		
		JavascriptExecutor jse1 = (JavascriptExecutor)driver;
		jse1.executeScript("window.scrollBy(0,500)", "");
		
		Log.info("Scrolling down the page");
		
		// Clicking on Make In India Week Link
		CreateHomePage.PageDetails.PageLinks.homepageMakeInIndiaWeekLink.click();
		Thread.sleep(5000);
		Log.info("Clicking on Make In India Week Link");
		CreateHomePage.PageDetails.homelink.click();
		Thread.sleep(2000);
		Log.info("Clicking on HomePage Link");
		
		JavascriptExecutor jse2 = (JavascriptExecutor)driver;
		jse2.executeScript("window.scrollBy(0,500)", "");
		
		Log.info("Scrolling down the page");
		
		// Clicking on Construction link
		CreateHomePage.PageDetails.PageLinks.homepageConstructionLink.click();
		Thread.sleep(5000);
		Log.info("Clicking on Construction Link");
		CreateHomePage.PageDetails.homelink.click();
		Thread.sleep(2000);
		Log.info("Clicking on HomePage Link");
		
		// Clicking on Events Link
		CreateHomePage.PageDetails.PageLinks.homepageEventsLink.click();
		Thread.sleep(5000);
		Log.info("Clicking on Events Link");
		CreateHomePage.PageDetails.homelink.click();
		Thread.sleep(2000);
		Log.info("Clicking on HomePage Link");
		
		// Clicking on Electrical Machinery link
		CreateHomePage.PageDetails.PageLinks.homepageElectricalMachineryLink.click();
		Thread.sleep(5000);
		Log.info("Clicking on Electrical Machinery Link");
		CreateHomePage.PageDetails.homelink.click();
		Thread.sleep(2000);
		Log.info("Clicking on HomePage Link");
		
		// Clicking on Renewable Energy link
		CreateHomePage.PageDetails.PageLinks.homepageRenewableEnergyLink.click();
		Thread.sleep(5000);
		Log.info("Clicking on Renewable Energy Link");
		CreateHomePage.PageDetails.homelink.click();
		Thread.sleep(2000);
		Log.info("Clicking on HomePage Link");
		
		// Clicking on National Manufacturing link
		CreateHomePage.PageDetails.PageLinks.homepageNationalManufacturingLink.click();
		Thread.sleep(5000);
		Log.info("Clicking on National Manufacturing Link");
		CreateHomePage.PageDetails.homelink.click();
		Thread.sleep(2000);
		Log.info("Clicking on HomePage Link");
						
		// Clicking on Ease Of Doing Business link
		CreateHomePage.PageDetails.PageLinks.homepageEODBLink.click();
		Thread.sleep(5000);
		Log.info("Clicking on EODB Link");
		CreateHomePage.PageDetails.homelink.click();
		Thread.sleep(2000);
		Log.info("Clicking on HomePage Link");
		
		
		// Clicking on Social Media Image link
		String originalHandle = driver.getWindowHandle();

		CreateHomePage.PageDetails.PageLinks.PageImageLinks.homepageSocialMediaImagelink.click();
		Thread.sleep(5000);
		Log.info("Clicking on Social Media Image Link");
		
		Log.info("Link opened in a new tab");
	    for(String handle : driver.getWindowHandles()) {
	        if (!handle.equals(originalHandle)) {
	            driver.switchTo().window(handle);
	            Thread.sleep(5000);
	            driver.close();
	            Log.info("Closing the new tab");
	        }
	    }

	    driver.switchTo().window(originalHandle);
	    
	 // Clicking on Make In India Week Image link
	 String originalHandle1 = driver.getWindowHandle();  
	 
	 CreateHomePage.PageDetails.PageLinks.PageImageLinks.homepageMakeInIndiaWeekImagelink.click();
	 Thread.sleep(5000);
		Log.info("Clicking on Make In India Week Image Link");
		
		Log.info("Link opened in a new tab");
	    for(String handle : driver.getWindowHandles()) {
	        if (!handle.equals(originalHandle)) {
	            driver.switchTo().window(handle);
	            Thread.sleep(5000);
	            driver.close();
	            Log.info("Closing the new tab");
	        }
	    }

	    driver.switchTo().window(originalHandle1);   
	    
	 // Clicking on Construction Image link
	 	CreateHomePage.PageDetails.PageLinks.PageImageLinks.homepageConstructionImagelink.click();
	 	Thread.sleep(2000);
	 	Log.info("Clicking on Construction Image Link");
	 	CreateHomePage.PageDetails.homelink.click();
	 	Thread.sleep(2000);
	 	Log.info("Clicking on HomePage Link");
	 	
	 // Clicking on Events Image link
	 	CreateHomePage.PageDetails.PageLinks.PageImageLinks.homepageEventsImageLink.click();
	 	Thread.sleep(2000);
	 	Log.info("Clicking on Events Image Link");
	 	CreateHomePage.PageDetails.homelink.click();
	 	Thread.sleep(2000);
	 	Log.info("Clicking on HomePage Link");
	 	
	 // Clicking on Electrical Machinery Image link
	 	CreateHomePage.PageDetails.PageLinks.PageImageLinks.homepageElectricalMachineryImageLink.click();
	 	Thread.sleep(2000);
	 	Log.info("Clicking on Electrical Machinery image Link");
	 	CreateHomePage.PageDetails.homelink.click();
	 	Thread.sleep(2000);
	 	Log.info("Clicking on HomePage Link");	
	 	
	 // Clicking on Renewable Energy Image link
	 	CreateHomePage.PageDetails.PageLinks.PageImageLinks.homepageRenewableEnergyImageLink.click();
	 	Thread.sleep(2000);
	 	Log.info("Clicking on Renewable Energy Image Link");
	 	CreateHomePage.PageDetails.homelink.click();
	 	Thread.sleep(2000);
	 	Log.info("Clicking on HomePage Link"); 	
	    
	 // Clicking on National Manufacturing Image link
	 	CreateHomePage.PageDetails.PageLinks.PageImageLinks.homepageNationalManufacturingImageLink.click();
	 	Thread.sleep(2000);
	 	Log.info("Clicking on National Manufacturing Image Link");
	 	CreateHomePage.PageDetails.homelink.click();
	 	Thread.sleep(2000);
	 	Log.info("Clicking on HomePage Link");
		 	 	 	
	 // Clicking on Ease Of Doing Business Image link
	 	CreateHomePage.PageDetails.PageLinks.PageImageLinks.homepageEODBImageLink.click();
	 	Thread.sleep(2000);
	 	Log.info("Clicking on EODB Image Link");
	 	CreateHomePage.PageDetails.homelink.click();
	 	Thread.sleep(2000);
	 	Log.info("Clicking on HomePage Link");
	 	
	 	}
	
	}
