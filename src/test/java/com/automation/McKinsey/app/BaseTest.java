package com.automation.McKinsey.app;

import java.io.File;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import com.automation.McKinsey.app.Core.BasePage;
import com.automation.McKinsey.app.Core.Config;
import com.automation.McKinsey.app.Core.FileReaderManager;
import com.automation.McKinsey.app.Core.ReadData;
import com.cucumber.listener.Reporter;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class BaseTest extends BasePage {
	
	public BaseTest(AndroidDriver<MobileElement> driver) throws Exception {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public String[] data = null; 

	public String[] testData() {
		String[] data = ReadData.ReadCSV("TestDemo", ",", System.getProperty("user.dir")+"\\TestData\\Data");
		return data;
	}
	
	@BeforeTest
	public void testSetup() throws Exception {
		System.out.println("here");
		launchApp();
		data = testData();
	}
	
	@AfterTest
	public void writeExtentReport() {
		writeExtentReport();
		}
 }


