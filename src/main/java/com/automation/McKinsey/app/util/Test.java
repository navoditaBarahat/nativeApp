
package com.automation.McKinsey.app.util;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class Test {
	//WebDriver driver = null;
	public static AndroidDriver<MobileElement> driver;
	public static void main (String args[]) throws MalformedURLException {

		DesiredCapabilities caps = new DesiredCapabilities();
		caps.setCapability("platformName", "Android");
		caps.setCapability("deviceName", "ZY223V7W5M");
		caps.setCapability("app", System.getProperty("user.dir")+ "\\resources\\selendroid-test-app-0.17.0.apk");
		
		caps.setCapability("appActivity", ".HomeScreenActivity");
		 caps.setCapability("appPackage", "io.selendroid.testapp");
		driver = new AndroidDriver<MobileElement>(new URL("http://0.0.0.0:4723/wd/hub"), caps);
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		caps.setCapability("deviceReadyTimeout","10");
		System.out.println(driver.getTitle());
	}
}
