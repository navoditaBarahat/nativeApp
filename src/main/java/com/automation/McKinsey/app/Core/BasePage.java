package com.automation.McKinsey.app.Core;

import java.io.File;
import java.io.FileInputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.cucumber.listener.Reporter;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class BasePage {
		
	public static AndroidDriver<MobileElement> driver = null;
	public Logger logger=Logger.getLogger("BasePage");
			
	public BasePage() throws Exception {
		/*this.driver = driver;
        PageFactory.initElements(new AppiumFieldDecorator(driver, 10, TimeUnit.SECONDS), this);*/
		PropertyConfigurator.configure("log4j.properties");
		logger.info("BasePage Class initialized");
		
	}
			
	public void launchApp() throws MalformedURLException {
		DesiredCapabilities caps = new DesiredCapabilities();
		caps.setCapability("platformName",Config.readConfig("platformName"));
		caps.setCapability("deviceName",Config.readConfig("deviceName"));
		caps.setCapability("app", System.getProperty("user.dir")+ Config.readConfig("pathToApk"));
		caps.setCapability("appActivity",Config.readConfig("appActivity"));
	    caps.setCapability("appPackage",Config.readConfig("appPackage"));
		driver = new AndroidDriver<MobileElement>(new URL("http://0.0.0.0:4723/wd/hub"), caps);
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	}
	
	public void writeExtentReport() {
		FileReaderManager.getInstance().getConfigReader();
		Reporter.loadXMLConfig(new File(Config.readConfig("reportConfigPath")));
		Reporter.setSystemInfo("User Name", System.getProperty("user.name"));
		Reporter.setSystemInfo("Time Zone", System.getProperty("user.timezone"));
		Reporter.setSystemInfo("Machine", 	"Windows 10" + "64 Bit");
		Reporter.setSystemInfo("Selenium", "3.7.0");
		Reporter.setSystemInfo("Maven", "3.5.2");
		Reporter.setSystemInfo("Java Version", "1.8.0_151");
		}
}

