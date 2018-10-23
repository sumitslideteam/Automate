@signInTest 
Feature: signup Test On Web Application 
Scenario: 
	Given Navigates to website url. 
	Then Click on Most Downloaded link. 
	Then Select a product items. 
	Then Click on Download this presentation link. 
	Then Click on Sign an Account CTA. 
	
	
Scenario Outline: 
	Then Enter user email address as "<Email Address>". 
	Then Enter user password as "<Password>". 
	Then Click on Login button. 
	Then Verify uesr "<Email AddressVal>" validation message for Email Address. 
	Then Verify user "<PasswordVal>" validation message for Password. 
	Then Verify user "<Signin_error_Msg>" message for all invalid credentials. 
	Examples: 
		|Email Address       |password | Email AddressVal          |    PasswordVal           |Signin_error_Msg           |
		|                    |         | This is a required field. |This is a required field. |                           |
		|test@@gmail.com     |         |                           |                          |                           | 
		|test@gmail.com      |         |                           |This is a required field. |                           |
		|test@gmail.com      |test@1234|                           |                          | Invalid login or password.|