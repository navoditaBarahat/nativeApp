package com.automation.McKinsey.app.pages;

import com.automation.McKinsey.app.Core.Config;
import com.automation.McKinsey.app.Core.ReadData;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class InputBoxStepDef{

	public InputBoxStepDef() throws Exception {
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
		//page.driver.quit();
		}
	
	@When("^User Enters text in Input Box$")
	public void input() {
		String[] data = page.testData();
		page.enterText(data[1]);
	}
	
	@Then("^User clears the text from Input box$")
	public void Clear_Text() {
		page.clearText();
	}
	
}
