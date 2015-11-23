package com.makeInIndia.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class CreateMumbaiWeekPage {
	
	private WebDriver driver;
	
	public  CreateMumbaiWeekPage(WebDriver driver) {
		
		this.driver = driver;
		
	}
	
	public static class MumbaiWeekPageDetails {
		
		@FindBy(how = How.ID, using = "ui-accordion-accordionM-header-0")
		public static WebElement accordionMakeInIndiaCentre;
		
		@FindBy(how = How.ID, using = "ui-accordion-accordionM-header-1")
		public static WebElement accordionSectors;
		
		@FindBy(how = How.ID, using = "ui-accordion-accordionM-header-2")
		public static WebElement accordionAsiaBusinessForum;
		
		@FindBy(how = How.ID, using = "ui-accordion-accordionM-header-3")
		public static WebElement accordionMakeInIndiaAwards;
		
		@FindBy(how = How.ID, using = "ui-accordion-accordionM-header-4")
		public static WebElement accordionDesignConference;
		
		@FindBy(how = How.ID, using = "ui-accordion-accordionM-header-5")
		public static WebElement accordionReimaginingMumbai;
		
		@FindBy(how = How.ID, using = "ui-accordion-accordionM-header-6")
		public static WebElement accordionMaharashtraNight;
		
		@FindBy(how = How.ID, using = "ui-accordion-accordionM-header-7")
		public static WebElement accordionHackathon;
		
		@FindBy(how = How.ID, using = "ui-accordion-accordionM-header-8")
		public static WebElement accordionCollateralEvents;
		
		@FindBy(how = How.ID, using = "ui-accordion-accordionM-header-9")
		public static WebElement accordionSchedule;
		
		@FindBy(how = How.ID, using = "ui-accordion-accordionM-header-10")
		public static WebElement accordionVenue;
		
		@FindBy(how = How.ID, using = "ui-accordion-accordionM-header-11")
		public static WebElement accordionContactUs;
		
		
		public static class RegistrationForm {
			
			@FindBy(how = How.XPATH, using = ".//*[@id='p_p_id_56_INSTANCE_LR0qnlZeoLzZ_']/div/div/div/div/div/section/div[4]/a/h3")
			public static WebElement registrationLink ;
			
			
		}
		
	}
	
	

}
