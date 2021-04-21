Feature: Home page feature 
@test
Scenario: Home page title 
	Given user is on login page 
	When user enters username "username" and password "password" 
	And user clicks on Login button 
	Then user gets the title of the page 
	And  Home page title should be displayed as "Title" 
	Then user clicks on "women" tab button 
	Then user select desire dress and click on add to cart 
