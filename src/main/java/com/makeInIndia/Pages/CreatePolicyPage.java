package com.makeInIndia.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class CreatePolicyPage {
	
private WebDriver driver;
	
	public CreatePolicyPage(WebDriver driver) {
		this.driver = driver;
	}
	
	public static class PolicyPageDetails {
		
		@FindBy(how = How.XPATH, using = ".//*[@id='p_p_id_56_INSTANCE_WRoPqBr4Z6C3_']/div/div/div/section/div/div[1]/div/a[2]/p")
		public static WebElement newInitiativeslink;
		
		@FindBy(how = How.XPATH, using = ".//*[@id='p_p_id_56_INSTANCE_WRoPqBr4Z6C3_']/div/div/div/section/div/div[2]/div/a[2]/p")
		public static WebElement foreignDirectInvestmentlink;
		
		@FindBy(how = How.XPATH, using = ".//*[@id='p_p_id_56_INSTANCE_WRoPqBr4Z6C3_']/div/div/div/section/div/div[3]/div/a[2]/p")
		public static WebElement intellectualPropertyFactslink;
		
		@FindBy(how = How.XPATH, using = ".//*[@id='p_p_id_56_INSTANCE_WRoPqBr4Z6C3_']/div/div/div/section/div/div[4]/div/a[2]/p")
		public static WebElement nationalManufacturinglink;
	}
	
}
