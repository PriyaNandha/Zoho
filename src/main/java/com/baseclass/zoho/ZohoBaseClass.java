package com.baseclass.zoho;

import java.io.File;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class ZohoBaseClass {
	
	public static WebDriver driver;
	
	public static WebDriver browserLaunch(String browser) {
		
		if (browser.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\GOD\\eclipse-workspace\\MiniProject2\\Browser\\chromedriver.exe");
			
			driver= new ChromeDriver();
		}else if (browser.equalsIgnoreCase("edge")) {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\GOD\\eclipse-workspace\\MiniProject2\\Browser\\chromedriver.exe");

			driver= new ChromeDriver();
		}else {
			System.out.println("invalid browser");
		}
		driver.manage().window().maximize();
		return driver;
	}
	
	public static void launchUrl(String string) {
		driver.get(string);
	}
	public static void implicitWait() {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
	}
	public static void clickOnElement(WebElement element) {
		
		element.click();
		
	}

	public static void userInput(WebElement element, String value) {
		
		element.sendKeys(value);
		
	}
	public static void screenshot(String filename) throws Exception {
		Date d = new Date();
		String filename1 = d.toString().replace(':', '_') + ".png";
//		TakesScreenshot screenshot = (TakesScreenshot) driver;
		Files.copy(((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE),
				new File("C:\\Users\\GOD\\eclipse-workspace\\Zoho\\Screenshot" + filename +" " + filename1));
	}
	
	public static void closeUrl() {
		driver.close();
	}
	
	public static void closeBrowser() {
		driver.quit();
	}

	public static void sleep() throws InterruptedException {
		Thread.sleep(5000);
	}
	
	
}
