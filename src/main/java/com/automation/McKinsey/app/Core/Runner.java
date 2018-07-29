package com.automation.McKinsey.app.Core;

import java.io.File;

import org.junit.AfterClass;
import org.junit.runner.RunWith;

import com.cucumber.listener.Reporter;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
features= "src/resources/",
glue = "com/automation/McKinsey/app/StepDefinitions",
plugin = {"pretty", "html:target/cucumber-reports"})


public class Runner {
	//plugin = { "com.cucumber.listener.ExtentCucumberFormatter:target/cucumber-reports/report.html"}	
	//tags= {"@ENButton","@InputBox","@CheckBox","@Display_PopUp"})//to generate cucumber reports - qastuffs.blogspot.in
}
