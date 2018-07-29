package com.automation.McKinsey.app.pages;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.automation.McKinsey.app.Core.BasePage;
import com.automation.McKinsey.app.Core.Config;
import com.automation.McKinsey.app.Core.ReadData;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.*;

public class SelendriodPage extends BasePage{
		
	public SelendriodPage() throws Exception {
		super();
	}

	String title1 = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout[2]/android.widget.LinearLayout/android.widget.TextView[1]";
	String ENBtn = "//android.widget.Button[@content-desc='buttonTestCD']";
	String inputBox = "//android.widget.EditText[@content-desc='my_text_fieldCD']";
	String msgTitle = "android:id/message";
	String buttnNO = "android:id/button2";
	String checkBox = "io.selendroid.testapp:id/input_adds_check_box";
	String displayPopUpBtn = "io.selendroid.testapp:id/showPopupWindowButton";
	
	public String[] testData() {
		String[] data = ReadData.ReadCSV("TestCase1", ",", System.getProperty("user.dir")+Config.readConfig("dataFileName"));
		return data;
	}
	
	public String verifyTitle() throws Exception {
	String title = driver.findElement(By.xpath(title1)).getText();
	return title;
	}
			
	public void clickENButton() throws Exception {
		Thread.sleep(50000);
		driver.findElement(By.xpath(ENBtn)).click();
		//ENButton.click();
		logger.info("Clicked on ENButton");
	}
	
	public String popUpTitle() {
		String title=driver.findElement(By.id(msgTitle)).getText();
		return title;
	}
	
	public void clickNoOnPopUp() {
		//click no
		driver.findElement(By.id(buttnNO)).click();
		//btnNO.click();
		logger.info("Clicked on NO button");
	}	
		
	public String enterText(String testData) {
		driver.findElement(By.xpath(inputBox)).sendKeys(testData);
		String text = driver.findElement(By.xpath(inputBox)).getText();
		logger.info("entered text in text box");
		return text;
	}	
		
	public void clearText() {
		driver.findElement(By.xpath(inputBox)).clear();
		logger.info("Cleared text from text box");
	}
	
	public void checkBoxAction(String action) {
		
		WebElement chkBox = driver.findElement(By.id(checkBox));
		if(action.equalsIgnoreCase("check")) {
			if(chkBox.getAttribute("checked").equalsIgnoreCase("false")) {
				chkBox.click();
				logger.info("I accept adds");
			}
			else
				logger.info("Check box already checked");							
		}
		else if(action.equalsIgnoreCase("uncheck"))
		{
			if(chkBox.getAttribute("checked").equalsIgnoreCase("false")) {
				logger.info("Check box already unchecked");
			}
			else {
				chkBox.click();
				logger.info("Check box unchecked");
			}
		}
	}
	
	public void clickDisplayPopUp() {
		driver.findElement(By.id(displayPopUpBtn)).click();
		logger.info("DisplayPopUpButton clicked");
	}
	
}
