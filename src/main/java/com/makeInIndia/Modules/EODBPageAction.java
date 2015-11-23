package com.makeInIndia.Modules;

import org.openqa.selenium.JavascriptExecutor;

import com.makeInIndia.Pages.CreateEODBPage;
import com.makeInIndia.Pages.CreateHomePage;
import com.makeInIndia.Test.SelTestCase;
import com.makeInIndia.Utils.Log;

public class EODBPageAction extends SelTestCase {
	
	public static void executeEventsOnEODBPage() throws InterruptedException {
		Log.info("Events Going to Performed on EODB Page ");
		
		// Clicking on EODB link
		CreateHomePage.PageDetails.easeOfDoingBusinesslink.click();
		Thread.sleep(5000);
		Log.info("Clicking on EODB link");
		
		// Clicking on Central Government Initiative link
		CreateEODBPage.EODBPageDetails.centralGovernmentInitiativeslink.click();
		Thread.sleep(5000);
		Log.info("Clicking on Central Government Initiatives link");
		
		// Clicking on Actions Completed Accordion
		CreateEODBPage.EODBPageDetails.EODBPageAccordions.centralGovernmentInitiativesaccordion0.click();
		Thread.sleep(2000);
		Log.info("Clicking on Actions Completed Accordion");
		
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy(0,1000)", "");
		
		Log.info("Scrolling down the page");
		
		// Clicking on Measures Underway Accordion
		CreateEODBPage.EODBPageDetails.EODBPageAccordions.centralGovernmentInitiativesaccordion1.click();
		Thread.sleep(2000);
		Log.info("Clicking on Measures Underway Accordion");
		
		// Clicking on EODB link
		CreateHomePage.PageDetails.easeOfDoingBusinesslink.click();
		Thread.sleep(2000);
		Log.info("Clicking on EODB link");
		
		// Clicking on State Government Initiative link
		CreateEODBPage.EODBPageDetails.stateGovernmentInitiativeslink.click();
		Thread.sleep(5000);
		Log.info("Clicking on State Government Initiatives link");
		
		// Clicking on Actions Completed Accordion
		CreateEODBPage.EODBPageDetails.EODBPageAccordions.stateGovernmentInitiativesaccordion0.click();
		Thread.sleep(2000);
		Log.info("Clicking on Actions Completed Accordion");
		
		JavascriptExecutor jse1 = (JavascriptExecutor)driver;
		jse1.executeScript("window.scrollBy(0,1000)", "");
		
		Log.info("Scrolling down the page");
		
		// Clicking on Measures Underway Accordion
		CreateEODBPage.EODBPageDetails.EODBPageAccordions.stateGovernmentInitiativesaccordion1.click();
		Thread.sleep(2000);
		Log.info("Clicking on Measures Underway Accordion");
		
		// Clicking on EODB link
		CreateHomePage.PageDetails.easeOfDoingBusinesslink.click();
		Thread.sleep(2000);
		Log.info("Clicking on EODB link");

	}
}
