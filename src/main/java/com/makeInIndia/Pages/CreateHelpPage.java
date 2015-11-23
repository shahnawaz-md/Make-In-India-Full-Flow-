package com.makeInIndia.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class CreateHelpPage {
	
	private WebDriver driver;
	
	public CreateHelpPage(WebDriver driver) {
		this.driver = driver;
	}
	
	public static class HelpPageDetails {
		
		@FindBy(how = How.ID, using = "ui-accordion-accordionHelp-header-0")
		public static WebElement directoryAccordion;
		
		@FindBy(how = How.ID, using = "accHelp_info_1-1")
		public static WebElement ministryOfCommerceAndIndustryAccordion;
		
		@FindBy(how = How.ID, using = "accHelp_info_1-2")
		public static WebElement ministryOfCommerceAndIndustryStatesAccordion;
		
		@FindBy(how = How.ID, using = "accHelp_info_1-3")
		public static WebElement ministryOfCommerceAndIndustryUTAccordion;
		
		public static class MinistryOfCommerceAndIndustry {
			
			@FindBy(how = How.ID, using = "accHelp_info_2-1")
			public static WebElement chemicalsAndPetrochemicalsAccordion;
			
			@FindBy(how = How.ID, using = "accHelp_info_2-2")
			public static WebElement civilAviationAccordion;
			
			@FindBy(how = How.ID, using = "accHelp_info_2-3")
			public static WebElement departmentOfDefenceProductionAccordion;
			
			public static class MinistryOfCommerceAndIndustryStates {
				
				@FindBy(how = How.ID, using = "accHelp_info_2-29")
				public static WebElement arunachalPradeshAccordion;
				
				@FindBy(how = How.ID, using = "accHelp_info_2-30")
				public static WebElement BiharAccordion;
				
				@FindBy(how = How.ID, using = "accHelp_info_2-31")
				public static WebElement raipurAccordion;
				
				public static class MinistryOfCommerceAndIndustryUT {
					
					@FindBy(how = How.ID, using = "accHelp_info_2-45")
					public static WebElement andamanAndNicobarAccordion;
					
					@FindBy(how = How.ID, using = "accHelp_info_2-46")
					public static WebElement chandigarhAccordion;
					
					@FindBy(how = How.ID, using = "accHelp_info_2-47")
					public static WebElement chandigarhHaryanaAccordion;
				}
			}
			
			
			
		}
		
		
	}
	
	

}
