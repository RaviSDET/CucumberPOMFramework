package com.stepdefintions;

import org.openqa.selenium.WebDriver;

import com.factory.DriverFactory;
import com.pages.LoginPage;
import com.pages.ToySearch;
import com.util.CommonUtilies;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ToySearchStepDef {
	
	public ToySearch toySearch = new ToySearch(DriverFactory.getDriver());
	public CommonUtilies commonUtilies = new CommonUtilies();
	

	@Given("user is on the homepage and clicks on cancel popup")
	public void user_is_on_homepage() {
		commonUtilies.lauchBrowser();
		toySearch.clickOnPopup();
	}

	@When("user enters {string} in search bar and clicks on search button")
	public void user_enters_in_search_bar_and_clicks_on_search_button(String string) {
		toySearch.enterItemAndClick();
	}
   
	
	@Then("Search for maximum price of toy")
	public void search_for_maximum_price_of_toy() {
		toySearch.getMaximumPrice();
	}
	
	
	
	

}
