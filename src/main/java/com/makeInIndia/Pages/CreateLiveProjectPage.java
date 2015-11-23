package com.makeInIndia.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class CreateLiveProjectPage {
	
private WebDriver driver;
	
	public CreateLiveProjectPage(WebDriver driver) {
		this.driver = driver;
	}
	
	public static class LiveProjectAccordion {
		
		@FindBy(how = How.XPATH, using = ".//*[@id='ui-accordion-accordion-header-0']")
		public static WebElement summarylink;
		
		@FindBy(how = How.XPATH, using = ".//*[@id='ui-accordion-accordion-header-1']")
		public static WebElement delhiMumbaiIndustrialCorridorlink;
		
		@FindBy(how = How.XPATH, using = ".//*[@id='ui-accordion-accordion-header-2']")
		public static WebElement bengaluruMumbaiEconomicCorridorlink;
		
		@FindBy(how = How.XPATH, using = ".//*[@id='ui-accordion-accordion-header-3']")
		public static WebElement chennaiBengaluruIndustrialCorridorProjectlink;
		
		@FindBy(how = How.XPATH, using = ".//*[@id='ui-accordion-accordion-header-4']")
		public static WebElement vizagChennaiIndustrialCorridorlink;
		
		@FindBy(how = How.XPATH, using = ".//*[@id='ui-accordion-accordion-header-5']")
		public static WebElement amritsarKolkataIndustrialCorridorlink;
		
	}

}
