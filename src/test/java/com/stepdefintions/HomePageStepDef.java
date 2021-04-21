package com.stepdefintions;

import com.factory.DriverFactory;
import com.pages.HomePage;
import com.util.CommonUtilies;

import io.cucumber.java.en.Then;

public class HomePageStepDef {

	// CommonUtilies commonUtilies = new CommonUtilies(DriverFactory.getDriver());
	HomePage homePage = new HomePage(DriverFactory.getDriver());

	@Then("user clicks on {string} tab button")
	public void user_clicks_on_tab_button(String string) {
		homePage.clickOnItem();
	}

	@Then("user select desire dress and click on add to cart")
	public void user_select_desire_dress_and_click_on_add_to_cart() {

		//commonUtilies.waitMethod();

		homePage.clickOnCart();
		
		//Automationtesting
	}

}
