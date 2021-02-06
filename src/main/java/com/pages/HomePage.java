package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {

	public WebDriver driver;

	public By womentab = By.xpath("//a[@title='Women']");

	public By dresses = By.xpath("(//a[@title='Dresses'])[1]");

	public By tshirts = By.xpath("(//a[@title='T-shirts'])[1]");

	public By dresstype = By.xpath("//img[@title='Faded Short Sleeve T-shirts']");

	public By cart = By.xpath("//span[normalize-space()='Add to cart']");
	
	
	
	//  //a[@class='addToWishlist wishlistProd_3']

	public HomePage(WebDriver driver) {
		this.driver = driver;
	}

	public void clickOnItem() {
		driver.findElement(womentab).click();
		driver.findElement(dresstype).click();
		
	}

	public void clickOnCart() {
	
		driver.findElement(cart).click();
	}
	
}
