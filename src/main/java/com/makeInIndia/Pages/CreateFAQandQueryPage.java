package com.makeInIndia.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class CreateFAQandQueryPage {
	
	private WebDriver driver;
	
	public CreateFAQandQueryPage(WebDriver driver) { 
		this.driver= driver;
	}
	
	public static class FaqPageDetails {
		
		@FindBy(how = How.ID, using = "_miiqueryfaq_WAR_MIIUbiqueportlet_INSTANCE_S0Pru0tz3toK_question")
		public static WebElement searchTextBox;
		
		@FindBy(how = How.ID, using = "ansButton")
		public static WebElement searchButton;
		
		@FindBy(how = How.XPATH, using = ".//*[@id='faq_instr']/ul/li[3]/a")
		public static WebElement clickHereLink;
		
		public static class QueryForm {
			
			@FindBy(how = How.ID, using = "_miiquerysubmission_WAR_MIIUbiqueportlet_INSTANCE_U02ozVb8o4w2_First_Name")
			public static WebElement firstNameTextBox;
			
			@FindBy(how = How.ID, using = "_miiquerysubmission_WAR_MIIUbiqueportlet_INSTANCE_U02ozVb8o4w2_Last_Name")
			public static WebElement lastNameTextBox;
			
			@FindBy(how = How.ID, using = "_miiquerysubmission_WAR_MIIUbiqueportlet_INSTANCE_U02ozVb8o4w2_Mail_Id")
			public static WebElement EmailTextBox;
			
			@FindBy(how = How.ID, using = "_miiquerysubmission_WAR_MIIUbiqueportlet_INSTANCE_U02ozVb8o4w2_phone")
			public static WebElement contactNumberTextBox;
			
			@FindBy(how = How.ID, using = "_miiquerysubmission_WAR_MIIUbiqueportlet_INSTANCE_U02ozVb8o4w2_Question")
			public static WebElement queryTitleTextBox;
			
			@FindBy(how = How.ID, using = "_miiquerysubmission_WAR_MIIUbiqueportlet_INSTANCE_U02ozVb8o4w2_sectors")
			public static WebElement selectSectors;
			
			@FindBy(how = How.ID, using = "_miiquerysubmission_WAR_MIIUbiqueportlet_INSTANCE_U02ozVb8o4w2_country")
			public static WebElement selectCountry;
			
			@FindBy(how = How.ID, using = "_miiquerysubmission_WAR_MIIUbiqueportlet_INSTANCE_U02ozVb8o4w2_Feedback")
			public static WebElement queryDetailTextBox;
			
			@FindBy(how = How.ID, using = "submit_btn")
			public static WebElement submitButton;
		}
	}
}
