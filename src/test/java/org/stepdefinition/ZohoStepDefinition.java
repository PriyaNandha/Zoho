package org.stepdefinition;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.runner.ZohoRunnerClass;

import com.baseclass.zoho.ZohoBaseClass;
import com.config.zoho.ZhConfigHelper;
import com.homepage.datadriven.zoho.XLSXReader;
import com.pom.zoho.ZohoPom;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ZohoStepDefinition extends ZohoBaseClass {

	public static WebDriver driver = ZohoRunnerClass.driver;
	public static String userName;
	public static String passWord;
	ZohoPom zhpom = new ZohoPom(driver);

	@Given("user Lauch The Application Url")
	public void user_lauch_the_application_url() throws IOException {
		String url = ZhConfigHelper.getInstance().getUrl();
		launchUrl(url);

		implicitWait();

		clickOnElement(zhpom.getCreateAccount());
	}

	@When("user Enter The Username")
	public void user_enter_the_username() throws IOException {
		userName = XLSXReader.particularData("Project", 1, 1);
		String emailid = ZhConfigHelper.getInstance().getEmailid();
		ZohoBaseClass.userInput(zhpom.getEmailId(), emailid);
	}

	@When("user Enter The Password")
	public void user_enter_the_password() throws IOException {
		passWord = XLSXReader.particularData("Project", 1, 2);
		String password = ZhConfigHelper.getInstance().getPassword();
		ZohoBaseClass.userInput(zhpom.getPassWord(), password);
	}

	@When("user Click The CheckBox")
	public void user_click_the_check_box() throws InterruptedException {

		Thread.sleep(5000);

		ZohoBaseClass.clickOnElement(zhpom.getCheckBox());

	}


	@When("take The Screenshot")
	public void take_the_screenshot() throws Exception {
		ZohoBaseClass.sleep();
		ZohoBaseClass.screenshot("zoho");
	}



	@Then("close The Application Url")
	public void close_the_application_url() {
		closeUrl();
	}

}
