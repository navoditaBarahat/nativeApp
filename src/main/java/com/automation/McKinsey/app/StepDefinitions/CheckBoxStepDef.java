package com.automation.McKinsey.app.StepDefinitions;

import com.automation.McKinsey.app.Core.Config;
import com.automation.McKinsey.app.Core.ReadData;
import com.automation.McKinsey.app.pages.SelendriodPage;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class CheckBoxStepDef {

	public CheckBoxStepDef() throws Exception {
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
	
	@When("^User uncheck the Check box$")
	public void Uncheck_CheckBox() {
		String[] data = page.testData(); 
		page.checkBoxAction(data[2]);
	}
	
	@Then("^User check the check box$")
	public void Check_The_CheckBox() {
		String[] data = page.testData();
		page.checkBoxAction(data[3]);
	}
}
