package org.runner;

import java.io.IOException;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.baseclass.zoho.ZohoBaseClass;
import com.config.zoho.ZhConfigHelper;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src\\test\\java\\org\\feature\\Zoho.feature",
glue = "org.stepdefinition")

public class ZohoRunnerClass {
	
	public static WebDriver driver;
	
	@BeforeClass
	public static void setUp() throws IOException {
		String browser =ZhConfigHelper.getInstance().getBrowser();
		driver= ZohoBaseClass.browserLaunch(browser);
	}
	
	@AfterClass
	public static void tearDown() {
		
		ZohoBaseClass.closeBrowser();
	}

}
