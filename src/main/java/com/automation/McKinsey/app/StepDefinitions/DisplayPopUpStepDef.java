package com.automation.McKinsey.app.StepDefinitions;

import com.automation.McKinsey.app.Core.Config;
import com.automation.McKinsey.app.Core.ReadData;
import com.automation.McKinsey.app.pages.SelendriodPage;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.When;

public class DisplayPopUpStepDef{
	
public DisplayPopUpStepDef() throws Exception {
		super();
	}

	SelendriodPage page = new SelendriodPage();
	
	String assertionError = null;
	
	@Before
	public void testSetup() throws Exception {
		System.out.println("here");
		page.launchApp();
	}
	
	@After
	public void ExtentReport() {
		//page.writeExtentReport();
		//page.driver.removeApp(Config.readConfig("pathToApk"));
		page.driver.quit();
		}
	
	@When("^User Click on Display Pop Up$")
	public void Display_PopUp() {
		page.clickDisplayPopUp();
	}
}
