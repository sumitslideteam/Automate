package TestRunner.loginSteps;
import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.interactions.Actions;
import ObjectRepository.SignupObject;
import TestRunner.SetupClass;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import webApp.PerformAction;

public class SignUp_Step extends SetupClass {
	PerformAction wait = new PerformAction();
	JavascriptExecutor js = (JavascriptExecutor) driver;
	Actions act = new Actions(driver);

	// Open web site URl
	@Given("^Navigates to website url\\.$")
	public void navigates_to_website_url() throws InterruptedException {
		// Maximize Windows
		driver.get(AppURL);
		Thread.sleep(2000);
		webelement = driver.findElement(SignupObject.close_add);
		webelement.click();
		Thread.sleep(2000);
		log.info("It's opening the website URL");

	}

	@Then("^Click on Most Downloaded link\\.$")
	public void click_most_download() throws InterruptedException {
		webelement = driver.findElement(SignupObject.Most);
		webelement.click();
		wait.implictywait(driver);
		Thread.sleep(6000);
	}

	@Then("^Select a product items\\.$")
	public void select_product() throws InterruptedException {
		webelement = driver.findElement(SignupObject.Select_item);
		webelement.click();
		wait.implictywait(driver);
		Thread.sleep(2000);
	}

	@Then("^Click on Download this presentation link\\.$")
	public void click_on_Download_this_presentation_link() throws InterruptedException {

		webelement = driver.findElement(SignupObject.Downloaded);
		webelement.click();
		Thread.sleep(1000);
	}

	@Then("^Click on Create an Account CTA\\.$")
	public void reate_an_Account_CTA() throws InterruptedException {
		webelement = driver.findElement(SignupObject.create);
		webelement.click();
		Thread.sleep(1000);
	}

	@Then("^Enter Email Address as \"([^\"]*)\"\\.$")
	public void enter_Email_Address_as(String email) throws Throwable {
		webelement = driver.findElement(SignupObject.Email);
		webelement.click();
		wait.implictywait(driver);
		webelement.clear();
		wait.implictywait(driver);
		webelement.sendKeys(email);
		wait.implictywait(driver);
		log.info("It's entering the user email Address");
	}

	@Then("^Enter First Name as \"([^\"]*)\"\\.$")
	public void enter_First_Name_as(String Fname) throws Throwable {
		webelement = driver.findElement(SignupObject.FName);
		webelement.click();
		wait.implictywait(driver);
		webelement.clear();
		wait.implictywait(driver);
		webelement.sendKeys(Fname);
		wait.implictywait(driver);
		log.info("It's entering the user First Name");
	}

	@Then("^Enter Last Name as \"([^\"]*)\"\\.$")
	public void enter_Last_Name_as(String LName) throws Throwable {
		webelement = driver.findElement(SignupObject.lastname);
		webelement.click();
		wait.implictywait(driver);
		webelement.clear();
		wait.implictywait(driver);
		webelement.sendKeys(LName);
		wait.implictywait(driver);
		log.info("It's entering the user Last Name");
	}

	@Then("^Enter Password as \"([^\"]*)\"\\.$")
	public void enter_password(String pwd) {
		webelement = driver.findElement(SignupObject.password);
		webelement.click();
		wait.implictywait(driver);
		webelement.clear();
		wait.implictywait(driver);
		webelement.sendKeys(pwd);
		wait.implictywait(driver);
		log.info("It's entering the user password");
	}

	@Then("^Enter Confirm password as \"([^\"]*)\"\\.$")
	public void enter_Confirm_password_as(String Cpswd) throws Throwable {
		webelement = driver.findElement(SignupObject.Cpassword);
		wait.implictywait(driver);
		webelement.click();
		wait.implictywait(driver);
		webelement.clear();
		wait.implictywait(driver);
		webelement.sendKeys(Cpswd);
		wait.implictywait(driver);
		log.info("It's entering the user password");
	}

	@Then("^Enter the captcha\\.$")
	public void enter_the_captcha() throws InterruptedException {
		webelement = driver.findElement(SignupObject.Captcha);
		webelement.click();
		wait.implictywait(driver);
		Thread.sleep(3000);
		log.info("It's entering the user password");
	}

	@Then("^click on Signup button\\.$")
	public void click_on_Signup_button() throws Throwable {
		webelement = driver.findElement(SignupObject.Signup);
		wait.implictywait(driver);
		js.executeScript("arguments[0].click();", webelement);
		wait.implictywait(driver);
		Thread.sleep(1000);
	}

	@Then("^Verify \"([^\"]*)\" validation message for Email Address\\.$")
	public void verify_validation_message_for_Email_Address(String Email) {
		try {
			String Email_validation = driver.findElement(SignupObject.Email_AddressVal).getText();
			wait.implictywait(driver);
		} catch (NoSuchElementException nc) {
			
	}
	}

	@Then("^Verify \"([^\"]*)\" validation message for First Name\\.$")
	public void verify_validation_message_for_First_Name(String Fn)  {
		try {
			String Fname = driver.findElement(SignupObject.FNVal).getText();
			wait.implictywait(driver);
			Assert.assertEquals(Fname, Fn);
			wait.implictywait(driver);
	} catch (NoSuchElementException nd) {
	
	}
	}

	@Then("^Verify \"([^\"]*)\" validation message forLast Name\\.$")
	public void verify_validation_message_forLast_Name(String LastName)  {
		try {
			String LName_vali = driver.findElement(SignupObject.LNVal).getText();
			wait.implictywait(driver);
			Assert.assertEquals(LName_vali,LastName);
			System.out.println(LName_vali);
			System.out.println(LastName);
		
	} catch (NoSuchElementException ne) {
		
	}
	}

	@Then("^Verify \"([^\"]*)\" validation message for Password\\.$")
	public void verify_validation_message_for_password(String pwd)  {
		// Write code here that turns the phrase above into concrete actions
		try {
			String password_validation = driver.findElement(SignupObject.password_errormessage).getText();
			wait.implictywait(driver);
			Assert.assertEquals(password_validation, pwd);
	
} catch (NoSuchElementException nf) {
		
	}
	}
	
	@Then("^Verify \"([^\"]*)\" validation message for Confirm_password\\.$")
	public void verify_validation_message_for_Confirm_password(String Cpass) {
		try {
			String Email_validation = driver.findElement(SignupObject.repeat_errormessage).getText();
			Assert.assertEquals(Email_validation, Cpass);
	
} catch (NoSuchElementException ng) {
		
	}
	}

	@Then("^Verify \"([^\"]*)\" message for all invalid credentials\\.$")
	public void message_for_all_invalid_credentials(String arg1) {
		wait.implictywait(driver);
	
	}

	
}