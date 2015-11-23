package com.makeInIndia.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class CreateSectorPage {
	
private WebDriver driver;
	
	public CreateSectorPage(WebDriver driver) {
		this.driver = driver;
	}
	
	public static class Sectors {
		
		@FindBy(how = How.XPATH, using = ".//*[@id='p_p_id_56_INSTANCE_EIudhXhoPLXe_']/div/div/div/section/div/div[1]/div/a[2]/p")
		public static WebElement automobilelink;
		
		@FindBy(how = How.XPATH, using = ".//*[@id='p_p_id_56_INSTANCE_EIudhXhoPLXe_']/div/div/div/section/div/div[2]/div/a[2]/p")
		public static WebElement automobileComponentslink;
		
		@FindBy(how = How.XPATH, using = ".//*[@id='p_p_id_56_INSTANCE_EIudhXhoPLXe_']/div/div/div/section/div/div[3]/div/a[2]/p")
		public static WebElement aviationlink;
		
		@FindBy(how = How.XPATH, using = ".//*[@id='p_p_id_56_INSTANCE_EIudhXhoPLXe_']/div/div/div/section/div/div[4]/div/a[2]/p")
		public static WebElement biotechnologylink;
		
		@FindBy(how = How.XPATH, using = ".//*[@id='p_p_id_56_INSTANCE_EIudhXhoPLXe_']/div/div/div/section/div/div[5]/div/a[2]/p")
		public static WebElement chemicalslink;
		
		@FindBy(how = How.XPATH, using = ".//*[@id='p_p_id_56_INSTANCE_EIudhXhoPLXe_']/div/div/div/section/div/div[6]/div/a[2]/p")
		public static WebElement constructionlink;
		
		@FindBy(how = How.XPATH, using = ".//*[@id='p_p_id_56_INSTANCE_EIudhXhoPLXe_']/div/div/div/section/div/div[7]/div/a[2]/p")
		public static WebElement defenceManufacturinglink;
		
		@FindBy(how = How.XPATH, using = ".//*[@id='p_p_id_56_INSTANCE_EIudhXhoPLXe_']/div/div/div/section/div/div[8]/div/a[2]/p")
		public static WebElement electricalMachinerylink;
		
		@FindBy(how = How.XPATH, using = ".//*[@id='p_p_id_56_INSTANCE_EIudhXhoPLXe_']/div/div/div/section/div/div[9]/div/a[2]/p")
		public static WebElement electronicSystemslink;
		
		@FindBy(how = How.XPATH, using = ".//*[@id='p_p_id_56_INSTANCE_EIudhXhoPLXe_']/div/div/div/section/div/div[10]/div/a[2]/p")
		public static WebElement foodprocessinglink;
		
		@FindBy(how = How.XPATH, using = ".//*[@id='p_p_id_56_INSTANCE_EIudhXhoPLXe_']/div/div/div/section/div/div[11]/div/a[2]/p")
		public static WebElement itAndBPMlink;
		
		@FindBy(how = How.XPATH, using = ".//*[@id='p_p_id_56_INSTANCE_EIudhXhoPLXe_']/div/div/div/section/div/div[12]/div/a[2]/p")
		public static WebElement leatherlink;
		
		@FindBy(how = How.XPATH, using = ".//*[@id='p_p_id_56_INSTANCE_EIudhXhoPLXe_']/div/div/div/section/div/div[13]/div/a[2]/p")
		public static WebElement mediaAndEntertainmentlink;
		
		@FindBy(how = How.XPATH, using = ".//*[@id='p_p_id_56_INSTANCE_EIudhXhoPLXe_']/div/div/div/section/div/div[14]/div/a[2]/p")
		public static WebElement mininglink;
		
		@FindBy(how = How.XPATH, using = ".//*[@id='p_p_id_56_INSTANCE_EIudhXhoPLXe_']/div/div/div/section/div/div[15]/div/a[2]/p")
		public static WebElement oilAndGaslink;
		
		@FindBy(how = How.XPATH, using = ".//*[@id='p_p_id_56_INSTANCE_EIudhXhoPLXe_']/div/div/div/section/div/div[16]/div/a[2]/p")
		public static WebElement pharmaceuticalslink;
		
		@FindBy(how = How.XPATH, using = ".//*[@id='p_p_id_56_INSTANCE_EIudhXhoPLXe_']/div/div/div/section/div/div[17]/div/a[2]/p")
		public static WebElement portsAndShippinglink;
		
		@FindBy(how = How.XPATH, using = ".//*[@id='p_p_id_56_INSTANCE_EIudhXhoPLXe_']/div/div/div/section/div/div[18]/div/a[2]/p")
		public static WebElement railwayslink;
		
		@FindBy(how = How.XPATH, using = ".//*[@id='p_p_id_56_INSTANCE_EIudhXhoPLXe_']/div/div/div/section/div/div[19]/div/a[2]/p")
		public static WebElement renewableEnergylink;
		
		@FindBy(how = How.XPATH, using = ".//*[@id='p_p_id_56_INSTANCE_EIudhXhoPLXe_']/div/div/div/section/div/div[20]/div/a[2]/p")
		public static WebElement roadsAndHighwayslink;
		
		@FindBy(how = How.XPATH, using = ".//*[@id='p_p_id_56_INSTANCE_EIudhXhoPLXe_']/div/div/div/section/div/div[21]/div/a[2]/p")
		public static WebElement spacelink;
		
		@FindBy(how = How.XPATH, using = ".//*[@id='p_p_id_56_INSTANCE_EIudhXhoPLXe_']/div/div/div/section/div/div[22]/div/a[2]/p")
		public static WebElement textilesAndGarmentslink;
		
		@FindBy(how = How.XPATH, using = ".//*[@id='p_p_id_56_INSTANCE_EIudhXhoPLXe_']/div/div/div/section/div/div[23]/div/a[2]/p")
		public static WebElement thermalPowerlink;
		
		@FindBy(how = How.XPATH, using = ".//*[@id='p_p_id_56_INSTANCE_EIudhXhoPLXe_']/div/div/div/section/div/div[24]/div/a[2]/p")
		public static WebElement tourismAndHospitalitylink;
		
		@FindBy(how = How.XPATH, using = ".//*[@id='p_p_id_56_INSTANCE_EIudhXhoPLXe_']/div/div/div/section/div/div[25]/div/a[2]/p")
		public static WebElement wellnesslink;
		
		public static class SectorsAccordian {
			
			@FindBy(how = How.XPATH, using = ".//*[@id='ui-accordion-accordion-header-0']")
			public static WebElement automobileSummary;
			
			@FindBy(how = How.XPATH, using = ".//*[@id='ui-accordion-accordion-header-1']")
			public static WebElement automobileReasonsToInvest;
			
			@FindBy(how = How.XPATH, using = ".//*[@id='ui-accordion-accordion-header-0']")
			public static WebElement automobileComponentsSummary;
			
			@FindBy(how = How.XPATH, using = ".//*[@id='ui-accordion-accordion-header-1']")
			public static WebElement automobileComponentsReasonsToInvest;
			
			@FindBy(how = How.XPATH, using = ".//*[@id='ui-accordion-accordion-header-0']")
			public static WebElement aviationSummary;
			
			@FindBy(how = How.XPATH, using = ".//*[@id='ui-accordion-accordion-header-1']")
			public static WebElement aviationReasonsToInvest;
			
			@FindBy(how = How.XPATH, using = ".//*[@id='ui-accordion-accordion-header-0']")
			public static WebElement biotechnologySummary;
			
			@FindBy(how = How.XPATH, using = ".//*[@id='ui-accordion-accordion-header-1']")
			public static WebElement biotechnologyReasonsToInvest;
		}
		
	}
}
