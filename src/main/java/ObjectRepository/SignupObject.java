package ObjectRepository;

import org.openqa.selenium.By;

public class SignupObject {
	
	public static By close_add=By.cssSelector(".fancybox-item.fancybox-close");
	public static By Most = By.cssSelector(".menu-link[title='Most Downloaded']");
	public static By Select_item = By.cssSelector(".product-info>h2>a[title='Customer Relationship Management Free Powerpoint Templates Slides']");
	public static By Downloaded = By.cssSelector(".download-wishlist-button>div");
	public static By create = By.cssSelector(".buttons-set>button[title='Create an Account']");
	public static By Email = By.id("email_address");
	public static By FName = By.id("firstname");
	public static By lastname = By.id("lastname");
	public static By password = By.id("password");
	public static By Cpassword = By.id("confirmation");
	public static By Captcha = By.id("captcha_user_create");
	//public static By reload_Captcha = By.id("captcha-reload");
	public static By take_Captcha = By.id("#user_create");
	public static By Signup=By.cssSelector("#form-validate >div.buttons-set>button");
	//buttons-set>button
	public static By check_logout_cta = By.cssSelector("#user-nav>li:nth-child(2)>ul>li:last-child");
	
	// validation user created account details
	public static By MyAccount = By.cssSelector(".signin-link[title='My Account']");
	public static By RegEmail=By.cssSelector(".box-content>p>br:nth-child(1)");
	
	public static By logout=By.cssSelector(".signin-link[title='Sign Out']");
			
	//error message
	public static By Email_AddressVal = By.id("advice-required-entry-email_address");
	public static By FNVal = By.id("advice-required-entry-firstname");
	public static By LNVal = By.id("advice-required-entry-lastname");
	public static By Signup_errormessage = By.cssSelector(".error-msg");
	public static By password_errormessage = By.id("advice-validate-password-password");
	public static By repeat_errormessage = By.cssSelector("advice-required-entry-confirmation");
	public static By captcha = By.cssSelector("advice-required-entry-captcha_user_create");
	
}


