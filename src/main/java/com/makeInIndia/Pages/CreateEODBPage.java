package com.makeInIndia.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class CreateEODBPage {
	
	private WebDriver driver;
	
	public CreateEODBPage(WebDriver driver) {
	this.driver = driver;

	}
	
	public static class EODBPageDetails {
		
		@FindBy(how = How.XPATH, using = ".//*[@id='p_p_id_56_INSTANCE_r6S1CMN10DHA_']/div/div/div/section/div/div[1]/div/a[2]/p")
		public static WebElement centralGovernmentInitiativeslink;
		
		@FindBy(how = How.XPATH, using = ".//*[@id='p_p_id_56_INSTANCE_r6S1CMN10DHA_']/div/div/div/section/div/div[2]/div/a[2]/p")
		public static WebElement stateGovernmentInitiativeslink;
		
		public static class EODBPageAccordions {
			
			@FindBy(how = How.XPATH, using = ".//*[@id='ui-accordion-accordion-header-0']")
			public static WebElement centralGovernmentInitiativesaccordion0;
			
			@FindBy(how = How.XPATH, using = ".//*[@id='ui-accordion-accordion-header-1']")
			public static WebElement centralGovernmentInitiativesaccordion1;
			
			@FindBy(how = How.XPATH, using = ".//*[@id='ui-accordion-accordion-header-0']")
			public static WebElement stateGovernmentInitiativesaccordion0;
			
			@FindBy(how = How.XPATH, using = ".//*[@id='ui-accordion-accordion-header-1']")
			public static WebElement stateGovernmentInitiativesaccordion1;
			
		}
	}
}