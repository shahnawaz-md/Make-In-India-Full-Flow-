package com.makeInIndia.Test;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.makeInIndia.Modules.EODBPageAction;
import com.makeInIndia.Modules.FAQandQueryFormAction;
import com.makeInIndia.Modules.HelpPageAction;
import com.makeInIndia.Modules.HomePageAction;
import com.makeInIndia.Modules.LiveProjectPageAction;
import com.makeInIndia.Modules.PolicyPageAction;
import com.makeInIndia.Modules.SectorsPageAction;
import com.makeInIndia.Pages.CreateEODBPage;
import com.makeInIndia.Pages.CreateFAQandQueryPage;
import com.makeInIndia.Pages.CreateHelpPage;
import com.makeInIndia.Pages.CreateHomePage;
import com.makeInIndia.Pages.CreateLiveProjectPage;
import com.makeInIndia.Pages.CreatePolicyPage;
import com.makeInIndia.Pages.CreateSectorPage;


public class SanityTest extends SelTestCase {

	@Test
	public void HomePage() throws InterruptedException {
		PageFactory.initElements(driver, CreateHomePage.class);
		PageFactory.initElements(driver, CreateHomePage.PageDetails.class);
		PageFactory.initElements(driver, CreateHomePage.PageDetails.PageLinks.class);
		PageFactory.initElements(driver, CreateHomePage.PageDetails.PageLinks.PageImageLinks.class);
		PageFactory.initElements(driver, CreateSectorPage.class);
		PageFactory.initElements(driver, CreateSectorPage.Sectors.class);
		PageFactory.initElements(driver, CreateLiveProjectPage.class);
		PageFactory.initElements(driver, CreateLiveProjectPage.LiveProjectAccordion.class);
		PageFactory.initElements(driver, CreatePolicyPage.class);
		PageFactory.initElements(driver, CreatePolicyPage.PolicyPageDetails.class);
		PageFactory.initElements(driver, CreateEODBPage.class);
		PageFactory.initElements(driver, CreateEODBPage.EODBPageDetails.class);
		PageFactory.initElements(driver, CreateEODBPage.EODBPageDetails.EODBPageAccordions.class);
		PageFactory.initElements(driver, CreateFAQandQueryPage.class);
		PageFactory.initElements(driver, CreateFAQandQueryPage.FaqPageDetails.class);
		PageFactory.initElements(driver, CreateFAQandQueryPage.FaqPageDetails.QueryForm.class);
		PageFactory.initElements(driver, CreateHelpPage.class);
		PageFactory.initElements(driver, CreateHelpPage.HelpPageDetails.class);
		PageFactory.initElements(driver, CreateHelpPage.HelpPageDetails.MinistryOfCommerceAndIndustry.class);
		PageFactory.initElements(driver, CreateHelpPage.HelpPageDetails.MinistryOfCommerceAndIndustry.MinistryOfCommerceAndIndustryStates.class);
		PageFactory.initElements(driver, CreateHelpPage.HelpPageDetails.MinistryOfCommerceAndIndustry.MinistryOfCommerceAndIndustryStates.MinistryOfCommerceAndIndustryUT.class);
		
		HomePageAction.executeEventsOnHomePage();
		Thread.sleep(1000);
		SectorsPageAction.executeEventsOnSectorPage();
		Thread.sleep(1000);
		LiveProjectPageAction.executeEventsOnLiveProjectPage();
		Thread.sleep(1000);
		PolicyPageAction.executeEventsOnPoliciesPage();
		Thread.sleep(1000);
		EODBPageAction.executeEventsOnEODBPage();
		Thread.sleep(1000);
		FAQandQueryFormAction.executeEventsOnFAQandQueryFormPage();
		Thread.sleep(1000);
		HelpPageAction.executeEventsOnHelpPage();
		Thread.sleep(1000);
		
	}
				
		/*//@Test
		public void SectorPage() throws InterruptedException {
		PageFactory.initElements(driver, CreateHomePage.class);
		PageFactory.initElements(driver, CreateHomePage.PageDetails.class);	
		PageFactory.initElements(driver, CreateSectorPage.class);
		PageFactory.initElements(driver, CreateSectorPage.Sectors.class);
					
		SectorsPageAction.executeEventsOnSectorPage();
		Thread.sleep(1000);
	}
		
		//@Test
		public void LiveProjectPage() throws InterruptedException {
		PageFactory.initElements(driver, CreateHomePage.class);
		PageFactory.initElements(driver, CreateHomePage.PageDetails.class);	
		PageFactory.initElements(driver, CreateLiveProjectPage.class);
		PageFactory.initElements(driver, CreateLiveProjectPage.LiveProjectAccordion.class);
					
		LiveProjectPageAction.executeEventsOnLiveProjectPage();
		Thread.sleep(1000);
	
		}
		
		//@Test
		public void PoliciesPage() throws InterruptedException {
		PageFactory.initElements(driver, CreateHomePage.class);
		PageFactory.initElements(driver, CreateHomePage.PageDetails.class);	
		PageFactory.initElements(driver, CreatePolicyPage.class);
		PageFactory.initElements(driver, CreatePolicyPage.PolicyPageDetails.class);
					
		PolicyPageAction.executeEventsOnPoliciesPage();
		Thread.sleep(1000);
	
		}
		
		//@Test
		public void EODBPage() throws InterruptedException {
		PageFactory.initElements(driver, CreateHomePage.class);
		PageFactory.initElements(driver, CreateHomePage.PageDetails.class);	
		PageFactory.initElements(driver, CreateEODBPage.class);
		PageFactory.initElements(driver, CreateEODBPage.EODBPageDetails.class);
		PageFactory.initElements(driver, CreateEODBPage.EODBPageDetails.EODBPageAccordions.class);
					
		EODBPageAction.executeEventsOnEODBPage();
		Thread.sleep(1000);
	
		}
		
		//@Test
		public void FaqAndQueryFormPage() throws InterruptedException {
		PageFactory.initElements(driver, CreateHomePage.class);
		PageFactory.initElements(driver, CreateHomePage.PageDetails.class);	
		PageFactory.initElements(driver, CreateFAQandQueryPage.class);
		PageFactory.initElements(driver, CreateFAQandQueryPage.FaqPageDetails.class);
		PageFactory.initElements(driver, CreateFAQandQueryPage.FaqPageDetails.QueryForm.class);
					
		FAQandQueryFormAction.executeEventsOnFAQandQueryFormPage();
		Thread.sleep(1000);
	
		}
		
		//@Test
		public void HelpPage() throws InterruptedException {
		PageFactory.initElements(driver, CreateHomePage.class);
		PageFactory.initElements(driver, CreateHomePage.PageDetails.class);	
		PageFactory.initElements(driver, CreateHelpPage.class);
		PageFactory.initElements(driver, CreateHelpPage.HelpPageDetails.class);
		PageFactory.initElements(driver, CreateHelpPage.HelpPageDetails.MinistryOfCommerceAndIndustry.class);
		PageFactory.initElements(driver, CreateHelpPage.HelpPageDetails.MinistryOfCommerceAndIndustry.MinistryOfCommerceAndIndustryStates.class);
		PageFactory.initElements(driver, CreateHelpPage.HelpPageDetails.MinistryOfCommerceAndIndustry.MinistryOfCommerceAndIndustryStates.MinistryOfCommerceAndIndustryUT.class);
					
		HelpPageAction.executeEventsOnHelpPage();
		Thread.sleep(1000);
	
		}*/
	
}
