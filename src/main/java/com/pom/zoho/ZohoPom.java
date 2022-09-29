package com.pom.zoho;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ZohoPom {
	
		public WebDriver driver;
	
		public ZohoPom(WebDriver driver2) {
			this.driver = driver2;
			PageFactory.initElements(driver, this);
		}

		@FindBy(xpath = "//a[text()='Free Sign Up']")
		private WebElement createaccount;
		
		@FindBy(xpath = "//div[@class='signup-box']//descendant::input[@type='email']")
		private WebElement emailid;
		
		@FindBy(xpath = "//div[@class='signup-box']//descendant::input[@type='password']")
		private WebElement password;
		
		@FindBy(xpath = "//div[@class='signup-box']//descendant::span[@class='unchecked']")
		private WebElement clickcheckbox;
		
		public WebElement getCheckBox() {
			return clickcheckbox;
		}
		
		public WebElement getPassWord() {
			return password;
		}
		
		public WebElement getEmailId() {
			return emailid;
		}
		
		public WebElement getCreateAccount() {
			return createaccount;
			
		}

	

}
