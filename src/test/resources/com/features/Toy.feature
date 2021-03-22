Feature: Toy search feature 

Scenario: Toy search 
	Given user is on the homepage and clicks on cancel popup 
	When user enters "Toy" in search bar and clicks on search button 
    Then Search for maximum price of toy and save 
	