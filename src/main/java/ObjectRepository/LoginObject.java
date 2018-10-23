package ObjectRepository;

import org.openqa.selenium.By;

public class LoginObject {
	public static By UserId=By.id("email");
	public static By userpass = By.id("pass");
	public static By login = By.id("send2");
	
	// Error message for invalid data
	public static By uesremail_val=By.id("advice-required-entry-email");
	public static By error_val=By.id("advice-required-entry-email");
	public static By pass_val=By.id("advice-required-entry-pass");
	public static By passlength_val=By.id("advice-validate-password-pass");
	
	public static By sign_in= By.cssSelector(".account-login>ul>li>ul>li>span");
	

}
