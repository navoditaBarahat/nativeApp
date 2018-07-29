package com.automation.McKinsey.app.StepDefinitions;

import static org.testng.Assert.assertEquals;

import com.automation.McKinsey.app.Core.Config;
import com.automation.McKinsey.app.Core.ReadData;
import com.automation.McKinsey.app.pages.SelendriodPage;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class ENBtnStepDef{
	//public AndroidDriver<MobileElement> driver = null;		
	public ENBtnStepDef() throws Exception{
	super();	
	}
	
	SelendriodPage page = new SelendriodPage();
		
	String assertionError = null;

	@Before
	public void testSetup() throws Exception {
		page.launchApp();
	}
	
	/*@After
	public void ExtentReport() {
		//page.writeExtentReport();
		//page.driver.removeApp(Config.readConfig("pathToApk"));
		page.driver.quit();
		}*/
	
	@Given("^User is on the home page$")
	public void User_On_HomePage() throws Exception {
		String title = page.verifyTitle();
		try {
			assertEquals(title, "Hello Default Locale, Selendroid-test-app!");
			page.logger.info("User is on Home Page");
		} catch (AssertionError ae) {
			assertionError = ae.toString();
			page.logger.info(assertionError);
		}
	}
	
	@When("^User Clicks on EN button$")
	public void User_Clicks_On_En_Button() throws Exception {
		page.clickENButton();
	}
	
	@Then("^PopUp is Displayed$")
	public void PopUp_Displayed() {
		String popUpTitle = page.popUpTitle();
		try {
			assertEquals(popUpTitle, "This will end the activity");
			page.logger.info("This will end the activity");
		} catch (AssertionError ae) {
			assertionError = ae.toString();
			page.logger.info(assertionError);
		}
	}
	
	@And("^User clicks on No button$")
	public void PopUp_Display() {
		page.clickNoOnPopUp();
	}
}
