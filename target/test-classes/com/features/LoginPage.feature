Feature: Login page feature 

Scenario: Login page title 
	Given user is on login page 
	When user gets the title of the page 
	Then page title should be "Title" 
	
Scenario: Forgot Password link 
	Given user is on login page 
	Then forgot your password link should be displayed 
@test	
Scenario: Login with correct credentials 
	Given user is on login page 
	When user enters username "username" and password "password" 
	And user clicks on Login button 
	Then user gets the title of the page 
	And page title should be displayed as "Title" 
