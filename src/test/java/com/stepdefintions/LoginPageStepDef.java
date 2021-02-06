
package com.stepdefintions;

import io.cucumber.java.en.When;
import org.junit.Assert;

import com.factory.DriverFactory;
import com.pages.LoginPage;
import com.util.CommonUtilies;

import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginPageStepDef {
    
	public CommonUtilies commonUtilies = new CommonUtilies();
	public LoginPage loginPage = new LoginPage(DriverFactory.getDriver());
	String title;
    
	@Given("user is on login page")
	public void user_is_on_login_page() {
		commonUtilies.lauchBrowser();
	}

	@When("user gets the title of the page")
	public void user_gets_the_title_of_the_page() {
		title = loginPage.getLoginPageTitle();
	}

	@Then("page title should be {string}")
	public void page_title_should_be(String string) {
		System.out.println(" Title of page is " + title);
		Assert.assertEquals(title, "Login - My Store");
	}

	@Then("forgot your password link should be displayed")
	public void forgot_your_password_link_should_be_displayed() {
		Assert.assertTrue(loginPage.isForgotPasswordLink());
       
	}

	@Then("Home page title should be displayed as {string}")
	public void homePageTitle(String string) {
		title = loginPage.getLoginPageTitle();
		System.out.println(" Title of page is " + title);
		Assert.assertEquals(title, "My account - My Store");
	}

	@When("user enters username {string} and password {string}")
	public void user_enters_username_and_password(String string, String string2) {
		loginPage.enterCredentials("Ravichandra1841997@gmail.com", "Avicii1997@");
	}

	@When("user clicks on Login button")
	public void user_clicks_on_login_button() {
		loginPage.doClick();
	}

}
