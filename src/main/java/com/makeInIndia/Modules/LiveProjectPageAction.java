package com.makeInIndia.Modules;

import org.openqa.selenium.JavascriptExecutor;

import com.makeInIndia.Pages.CreateHomePage;
import com.makeInIndia.Pages.CreateLiveProjectPage;
import com.makeInIndia.Test.SelTestCase;
import com.makeInIndia.Utils.Log;

public class LiveProjectPageAction extends SelTestCase {
	
	public static void executeEventsOnLiveProjectPage() throws InterruptedException {
		Log.info("Events Going to Performed on LiveProject Page ");
		
		// Clicking on live Project link
		CreateHomePage.PageDetails.liveProjectlink.click();
		Thread.sleep(5000);
		Log.info("Clicking on Live Project link");
		
		// Clicking on Summary accordion
		CreateLiveProjectPage.LiveProjectAccordion.summarylink.click();
		Thread.sleep(5000);
		Log.info("Clicking on Summary Accordion ");
		
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy(0,1000)", "");
		
		Log.info("Scrolling down the page");
		Thread.sleep(5000);
		
		// Clicking on Delhi-Mumbai Industrial Corridor accordion
		CreateLiveProjectPage.LiveProjectAccordion.delhiMumbaiIndustrialCorridorlink.click();
		Thread.sleep(5000);
		Log.info("Clicking on Delhi-Mumbai Industrial Corridor Accordion ");
		
		JavascriptExecutor jse1 = (JavascriptExecutor)driver;
		jse1.executeScript("window.scrollBy(0,1000)", "");
		Log.info("Scrolling down the page");
		Thread.sleep(5000);
		
		// Clicking on Bengaluru Mumbai Economic Corridor accordion
		CreateLiveProjectPage.LiveProjectAccordion.bengaluruMumbaiEconomicCorridorlink.click();
		Thread.sleep(5000);
		Log.info("Clicking on Bengaluru-Mumbai Economic Corridor Accordion ");
		
		// Clicking on Chennai bengaluru Industrial Corridor Project accordion
		CreateLiveProjectPage.LiveProjectAccordion.chennaiBengaluruIndustrialCorridorProjectlink.click();
		Thread.sleep(5000);
		Log.info("Clicking on Chennai-Bengaluru Industrial Corridor Accordion ");
		
		// Clicking on Vizag Chennai Industrial Corridor accordion
		CreateLiveProjectPage.LiveProjectAccordion.vizagChennaiIndustrialCorridorlink.click();
		Thread.sleep(5000);
		Log.info("Clicking on Vizag-Chennai Industrial Corridor Accordion ");
		
		// Clicking on Amritsar Kolkata Industrial Corridor accordion
		CreateLiveProjectPage.LiveProjectAccordion.amritsarKolkataIndustrialCorridorlink.click();
		Thread.sleep(5000);
		Log.info("Clicking on Amritsar-Kolkata Industrial Corridor Accordion ");
		CreateLiveProjectPage.LiveProjectAccordion.amritsarKolkataIndustrialCorridorlink.click();
		Log.info("Clicking on Amritsar-Kolkata Industrial Corridor Accordion ");
		Thread.sleep(5000);
		
		JavascriptExecutor jse2 = (JavascriptExecutor)driver;
		jse2.executeScript("window.scrollBy(0,-500)", "");
		
		Log.info("Scrolling Up the page");
		Thread.sleep(5000);
		
	}
}
