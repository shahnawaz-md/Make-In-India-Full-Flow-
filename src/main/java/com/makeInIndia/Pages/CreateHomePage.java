package com.makeInIndia.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class CreateHomePage {
	
	private WebDriver driver;
	
	public CreateHomePage(WebDriver driver) {
		this.driver = driver;
	}
	
	public static class PageDetails {
		
		@FindBy(how = How.XPATH, using = ".//*[@id='bodyWrapper']/div[1]/div/div/header/nav/ul/li[1]/a/span")
		public static WebElement homelink;
		
		@FindBy(how = How.XPATH, using = ".//*[@id='bodyWrapper']/div[1]/div/div/header/nav/ul/li[2]/a/span")
		public static WebElement makeInIndiaWeeklink;
		
		@FindBy(how = How.XPATH, using = ".//*[@id='bodyWrapper']/div[1]/div/div/header/nav/ul/li[3]/a/span")
		public static WebElement sectorlink;
		
		@FindBy(how = How.XPATH, using = ".//*[@id='bodyWrapper']/div[1]/div/div/header/nav/ul/li[4]/a/span")
		public static WebElement liveProjectlink;
		
		@FindBy(how = How.XPATH, using = ".//*[@id='bodyWrapper']/div[1]/div/div/header/nav/ul/li[5]/a/span")
		public static WebElement policieslink;
	
		@FindBy(how = How.XPATH, using = ".//*[@id='bodyWrapper']/div[1]/div/div/header/nav/ul/li[6]/a/span")
		public static WebElement easeOfDoingBusinesslink;
		
		@FindBy(how = How.XPATH, using = ".//*[@id='bodyWrapper']/div[1]/div/div/header/nav/ul/li[7]/a/span")
		public static WebElement faqlink;
		
		@FindBy(how = How.XPATH, using = ".//*[@id='bodyWrapper']/div[1]/div/div/header/nav/ul/li[8]/a/span")
		public static WebElement helplink;
		
		public static class PageLinks {
		
		@FindBy(how = How.XPATH, using = ".//*[@id='hmeArticleContainer']/div/article[1]/div[1]/ul/li/span/a")
		public static WebElement homepageSocialMedialink;
		
		@FindBy(how = How.XPATH, using = ".//*[@id='hmeArticleContainer']/div/article[4]/div[1]/ul/li/span/a")
		public static WebElement homepageMakeInIndiaWeekLink;
		
		@FindBy(how = How.XPATH, using = ".//*[@id='hmeArticleContainer']/div/article[7]/div[1]/ul/li/span/a")
		public static WebElement homepageConstructionLink;
		
		@FindBy(how = How.XPATH, using = ".//*[@id='hmeArticleContainer']/div/article[2]/div[1]/ul/li/span/a")
		public static WebElement homepageEventsLink;
		
		@FindBy(how = How.XPATH, using = ".//*[@id='hmeArticleContainer']/div/article[5]/div[1]/ul/li/span/a")
		public static WebElement homepageElectricalMachineryLink;
		
		@FindBy(how = How.XPATH, using = ".//*[@id='hmeArticleContainer']/div/article[8]/div[1]/ul/li/span/a")
		public static WebElement homepageRenewableEnergyLink;
		
		@FindBy(how = How.XPATH, using = ".//*[@id='hmeArticleContainer']/div/article[6]/div[1]/ul/li/span/a")
		public static WebElement homepageNationalManufacturingLink;
		
		@FindBy(how = How.XPATH, using = ".//*[@id='hmeArticleContainer']/div/article[9]/div[1]/ul/li/span/a")
		public static WebElement homepageEODBLink;
		
		public static class PageImageLinks {
			
			@FindBy(how = How.XPATH, using = ".//*[@id='hmeArticleContainer']/div/article[1]/div[2]/a/img")
			public static WebElement homepageSocialMediaImagelink;
			
			@FindBy(how = How.XPATH, using = ".//*[@id='hmeArticleContainer']/div/article[4]/div[2]/a/img")
			public static WebElement homepageMakeInIndiaWeekImagelink;
			
			@FindBy(how = How.XPATH, using = ".//*[@id='hmeArticleContainer']/div/article[7]/div[2]/a/img")
			public static WebElement homepageConstructionImagelink;
			
			@FindBy(how = How.XPATH, using = ".//*[@id='hmeArticleContainer']/div/article[2]/div[2]/a/img")
			public static WebElement homepageEventsImageLink;
			
			@FindBy(how = How.XPATH, using = ".//*[@id='hmeArticleContainer']/div/article[5]/div[2]/a/img")
			public static WebElement homepageElectricalMachineryImageLink;
			
			@FindBy(how = How.XPATH, using = ".//*[@id='hmeArticleContainer']/div/article[8]/div[2]/a/img")
			public static WebElement homepageRenewableEnergyImageLink;
			
			@FindBy(how = How.XPATH, using = ".//*[@id='hmeArticleContainer']/div/article[6]/div[2]/a/img")
			public static WebElement homepageNationalManufacturingImageLink;
			
			@FindBy(how = How.XPATH, using = ".//*[@id='hmeArticleContainer']/div/article[9]/div[2]/a/img")
			public static WebElement homepageEODBImageLink;
			
			}
		
		}

	}
}
