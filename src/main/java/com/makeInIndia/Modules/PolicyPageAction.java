package com.makeInIndia.Modules;

import com.makeInIndia.Pages.CreateHomePage;
import com.makeInIndia.Pages.CreatePolicyPage;
import com.makeInIndia.Test.SelTestCase;
import com.makeInIndia.Utils.Log;

public class PolicyPageAction extends SelTestCase {
	
	public static void executeEventsOnPoliciesPage() throws InterruptedException {
		Log.info("Events Going to Performed on Policy Page ");
		
		// Clicking on Policies link
		CreateHomePage.PageDetails.policieslink.click();
		Thread.sleep(5000);
		Log.info("Clicking on PoliciesPage link");
		
		// Clicking on New Initiative link
		CreatePolicyPage.PolicyPageDetails.newInitiativeslink.click();
		Thread.sleep(5000);
		Log.info("Clicking on New Initiative link");
		CreateHomePage.PageDetails.policieslink.click();
		Thread.sleep(2000);
		Log.info("Clicking on PoliciesPage link");
		
		// Clicking on Foreign Direct Investment link
		CreatePolicyPage.PolicyPageDetails.foreignDirectInvestmentlink.click();
		Thread.sleep(5000);
		Log.info("Clicking on Foreign Direct Investment link");
		CreateHomePage.PageDetails.policieslink.click();
		Thread.sleep(2000);
		Log.info("Clicking on PoliciesPage link");
		
		// Clicking on Intellectual Property Facts link
		CreatePolicyPage.PolicyPageDetails.intellectualPropertyFactslink.click();
		Thread.sleep(5000);
		Log.info("Clicking on Intellectual Property Facts link");
		CreateHomePage.PageDetails.policieslink.click();
		Thread.sleep(2000);
		Log.info("Clicking on PoliciesPage link");
		
		// Clicking on National Manufacturing link
		CreatePolicyPage.PolicyPageDetails.nationalManufacturinglink.click();
		Thread.sleep(5000);
		Log.info("Clicking on National Manufacturing link");
		CreateHomePage.PageDetails.policieslink.click();
		Thread.sleep(2000);
		Log.info("Clicking on PoliciesPage link");
		

	}
}
