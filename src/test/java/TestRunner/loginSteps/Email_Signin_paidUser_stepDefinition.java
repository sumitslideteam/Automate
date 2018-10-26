package TestRunner.loginSteps;

import java.util.Random;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;

import ObjectRepository.LoginObject;
import ObjectRepository.SignupObject;
import TestRunner.SetupClass;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import webApp.PerformAction;

public class Email_Signin_paidUser_stepDefinition extends SetupClass {

		PerformAction wait = new PerformAction();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		Random rad = new Random();

		// Open web site URl
		@Given("^Open application URL$")
		public void navigates_to_website_url() throws InterruptedException {
			// Maximize Windows
			driver.get("https://www.slideteam.net");
			Thread.sleep(2000);
			try {
				webelement = driver.findElement(SignupObject.close_add);
				webelement.click();
				Thread.sleep(2000);
				log.info("It's opening the website URL");
			} catch (NoSuchElementException popup) {
			}

			try {
				WebElement logout = driver.findElement(By.cssSelector(".signin-link[title='Sign Out']"));
				if (logout.isEnabled()) {
					logout.click();
					Thread.sleep(1000);
				}
			} catch (NoSuchElementException Ext) {

			}
		}

		@Then("^Click on Complete ppts$")
		public void click_most_download() throws InterruptedException {
			webelement = driver.findElement(SignupObject.Most);
			webelement.click();
			wait.implictywait(driver);
			Thread.sleep(1000);
		}

		@Then("^Select a product as Project Scoping Powerpoint$")
		public void select_product() throws InterruptedException {
			webelement = driver.findElement(SignupObject.Select_item);
			webelement.click();
			wait.implictywait(driver);
			Thread.sleep(2000);
		}

		@Then("^Click on download this presentation link$")
		public void click_on_Download_this_presentation_link() throws InterruptedException {
			webelement = driver.findElement(SignupObject.Downloaded);
			webelement.click();
		}

		@Then("^Enter a user email$")
		public void enter_user_email_address_as() {

			webelement = driver.findElement(LoginObject.UserId);
			webelement.click();
			wait.implictywait(driver);
			webelement.clear();
			wait.implictywait(driver);
			webelement.sendKeys("shadab.sqa@gmail.com");
			wait.implictywait(driver);

		}

		@Then("^Enter the user password$")
		public void enter_user_password_as() throws Throwable {
			webelement = driver.findElement(LoginObject.userpass);
			webelement.click();
			wait.implictywait(driver);
			webelement.clear();
			wait.implictywait(driver);
			webelement.sendKeys("Test@1234");
			wait.implictywait(driver);

		}

		@Then("^click on Login cta$")
		public void click_on_Login_button() throws Throwable {
			webelement = driver.findElement(LoginObject.login);
			wait.implictywait(driver);
			webelement.click();
			wait.implictywait(driver);
			Thread.sleep(1000);

			try {
				WebElement close = driver.findElement(By.cssSelector(".fancybox-item.fancybox-close"));
				wait.implictywait(driver);
				close.click();
				Thread.sleep(500);
			} catch (NoSuchElementException nonpop) {

			}
		}

		@Then("^the download this presenetion link is appeared$")
		public void verify_uesr_validation_message_for_Email_Address() throws Throwable {

			try {
				String Email_test = driver.findElement(SignupObject.Downloaded).getText();
				wait.implictywait(driver);
				String Expected_Cta = "Download this presentation";
				Assert.assertEquals(Expected_Cta, Email_test);
				wait.implictywait(driver);
				Thread.sleep(1000);
			} catch (NoSuchElementException er) {

			}
		}
	
}

