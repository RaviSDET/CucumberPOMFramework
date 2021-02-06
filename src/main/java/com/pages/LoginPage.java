package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage {

	// LoginPage page = PageFactory.intElements(driver,LoginPage.class)

	public WebDriver driver;

	public By emailId = By.id("email");

	public By password = By.id("passwd");

	public By sigin = By.xpath("//span[normalize-space()='Sign in']");

	public By forgotpwdlink = By.xpath("//a[normalize-space()='Forgot your password?']");

	public LoginPage(WebDriver driver) {
		this.driver = driver;
	}

	// Actions

	public void enterCredentials(String username, String pwd) {
		driver.findElement(emailId).sendKeys(username);
		driver.findElement(password).sendKeys(pwd);

	}

	public void doClick() {
		driver.findElement(sigin).click();
	}

	public String getLoginPageTitle() {
		return driver.getTitle();
	}

	public boolean isForgotPasswordLink() {
		return driver.findElement(forgotpwdlink).isDisplayed();
	}

}
