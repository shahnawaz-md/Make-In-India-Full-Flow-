package com.makeInIndia.Modules;

import com.makeInIndia.Pages.CreateHomePage;
import com.makeInIndia.Pages.CreateHelpPage;
import com.makeInIndia.Test.SelTestCase;
import com.makeInIndia.Utils.Log;

public class HelpPageAction extends SelTestCase {
	
	public static void executeEventsOnHelpPage() throws InterruptedException {
		Log.info("Events Going to Performed on Help Page ");
		
		// Clicking on Help link
		CreateHomePage.PageDetails.helplink.click();
		Thread.sleep(5000);
		Log.info("Clicking on Help link");
		
		// Clicking on Directory Accordion
		CreateHelpPage.HelpPageDetails.directoryAccordion.click();
		Thread.sleep(1000);
		Log.info("Clicking on Directory Accordion");
		
		// Clicking on Ministry Of Commerce And Industry Accordion
		CreateHelpPage.HelpPageDetails.ministryOfCommerceAndIndustryAccordion.click();
		Thread.sleep(1000);
		Log.info("Clicking on Ministry Of Commerce And Industry Accordion");
		
		// Clicking on Chemicals And Petrochemicals Accordion
		CreateHelpPage.HelpPageDetails.MinistryOfCommerceAndIndustry.chemicalsAndPetrochemicalsAccordion.click();
		Thread.sleep(1000);
		Log.info("Clicking on Chemicals And Petrochemicals Accordion");
		
		// Clicking on Civil Aviation Accordion
		CreateHelpPage.HelpPageDetails.MinistryOfCommerceAndIndustry.civilAviationAccordion.click();
		Thread.sleep(1000);
		Log.info("Clicking on Civil Aviation Accordion");
		
		// Clicking on Department Of Defence Production Accordion
		CreateHelpPage.HelpPageDetails.MinistryOfCommerceAndIndustry.departmentOfDefenceProductionAccordion.click();
		Thread.sleep(1000);
		Log.info("Clicking on Department Of Defence Production Accordion");
		
		// Clicking on Ministry Of Commerce And Industry(States) Accordion
		CreateHelpPage.HelpPageDetails.ministryOfCommerceAndIndustryStatesAccordion.click();
		Thread.sleep(1000);
		Log.info("Clicking on Ministry Of Commerce And Industry(States) Accordion");
		
		// Clicking on Arunachal Pradesh Accordion
		CreateHelpPage.HelpPageDetails.MinistryOfCommerceAndIndustry.MinistryOfCommerceAndIndustryStates.arunachalPradeshAccordion.click();
		Thread.sleep(1000);
		Log.info("Clicking on Arunachal Pradesh Accordion");
				
		// Clicking on Bihar Accordion
		CreateHelpPage.HelpPageDetails.MinistryOfCommerceAndIndustry.MinistryOfCommerceAndIndustryStates.BiharAccordion.click();
		Thread.sleep(1000);
		Log.info("Clicking on Bihar Accordion");
				
		// Clicking on Raipur Accordion
		CreateHelpPage.HelpPageDetails.MinistryOfCommerceAndIndustry.MinistryOfCommerceAndIndustryStates.raipurAccordion.click();
		Thread.sleep(1000);
		Log.info("Clicking on Raipur Accordion");
		
		// Clicking on Ministry Of Commerce And Industry(UT) Accordion
		CreateHelpPage.HelpPageDetails.ministryOfCommerceAndIndustryUTAccordion.click();
		Thread.sleep(1000);
		Log.info("Clicking on Ministry Of Commerce And Industry(UT) Accorion");
				
		// Clicking on Andaman And Nicobar Accordion
		CreateHelpPage.HelpPageDetails.MinistryOfCommerceAndIndustry.MinistryOfCommerceAndIndustryStates.MinistryOfCommerceAndIndustryUT.andamanAndNicobarAccordion.click();
		Thread.sleep(1000);
		Log.info("Clicking on Andaman And Nicobar Accordion");
						
		// Clicking on Chandigarh Accordion
		CreateHelpPage.HelpPageDetails.MinistryOfCommerceAndIndustry.MinistryOfCommerceAndIndustryStates.MinistryOfCommerceAndIndustryUT.chandigarhAccordion.click();
		Thread.sleep(1000);
		Log.info("Clicking on Chandigarh Accordion");
						
		// Clicking on Chandigarh And Haryana Accordion
		CreateHelpPage.HelpPageDetails.MinistryOfCommerceAndIndustry.MinistryOfCommerceAndIndustryStates.MinistryOfCommerceAndIndustryUT.chandigarhHaryanaAccordion.click();
		Thread.sleep(1000);
		Log.info("Clicking on Chandigarh And Haryana Accordion");
		
		// Clicking on Help link
		CreateHomePage.PageDetails.helplink.click();
		Thread.sleep(5000);
		Log.info("Clicking on Help link");

	}
}