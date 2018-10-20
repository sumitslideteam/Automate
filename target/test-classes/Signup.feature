@signupTest 
Feature: signup Test On Web Application 
Scenario: 

	Given Navigates to website url. 
	Then Click on Most Downloaded link. 
	Then Select a product items. 
	Then Click on Download this presentation link. 
	Then Click on Create an Account CTA. 
	
Scenario Outline: Data driving for invalid data forsign-up. 
	Then Enter Email Address as "<Email Address>". 
	Then Enter First Name as "<First Name>". 
	Then Enter Last Name as "<Last Name>". 
	Then Enter Password as "<Password>". 
	Then Enter Confirm password as "<Confirm_password>". 
	Then Enter the captcha. 
	Then click on Signup button. 
	Then Verify "<Email AddressVal>" validation message for Email Address. 
	Then Verify "<First NameVal>" validation message for First Name. 
	Then Verify "<Last NameVal>" validation message forLast Name. 
	Then Verify "<PasswordVal>" validation message for Password. 
	Then Verify "<Confirm_passwordVal>" validation message for Confirm_password. 
	Then Verify "<SignUp_val_Msg>" message for all invalid credentials. 
	Examples: 
		|Email Address       |  First Name     | Last Name   |  Password       | Confirm_password   |  Email AddressVal        | First NameVal              |Last NameVal              |PasswordVal                                                                    |   Confirm_passwordVal                 |SignUp_val_Msg                                                                                                                                               |
		|                    |                 |             |                 |                    |This is a required field. |This is a required field.   |This is a required field. |This is a required field.                                                      |    This is a required field.          |                                                                                                                                                             |
		|qwr@gmail.com       |    Test         |             |                 |                    |                          |                            |This is a required field. |This is a required field.                                                      |This is a required field.              |                                                                                                                                                             |
		|qwr@gmail.com       |    Test         |   Test      |                 |                    |                          |                            |                          |This is a required field.                                                      |This is a required field.              |                                                                                                                                                             |
		|qwr@gmail.com       |    Test         |   Test      |   1234          |                    |                          |                            |                          |Please enter 6 or more characters. Leading or trailing spaces will be ignored. |This is a required field.              |                                                                                                                                                             |
		|qwr@gmail.com       |    Test         |   Test      |    123456       |         654221     |                          |                            |                          |                                                                               | Please make sure your passwords match.|                                                                                                                                                             |                                                                                                                                
		|qwr@gmail.com       |    Test         |   Test      |  123456         |   123456           |                          |                            |                          |                                                                               |                                       |There is already an account with this email address. If you are sure that it is your email address, click here to get your password and access your account. |                               
		
Scenario Outline: Data driving for valid sign-up. 
	Then Enter Email "<Email Address>". 
	Then Enter First Name as "<First Name>". 
	Then Enter Last Name as "<Last Name>". 
	Then Enter Password as "<Password>". 
	Then Enter Confirm password as "<Confirm_password>". 
	Then Enter the captcha. 
	Then click on Signup button. 
	Examples: 
		|Email Address       |  First Name     | Last Name   |  Password       | Confirm_password   | 
		|qwr@gmail.com       |    Test         |   Test      |  123456         |   123456           |            
Scenario: 
	Given After signup see the price page. 
	Then Select price subscription 
	Then apply the coupon code 
	Then verify the applied coupon code