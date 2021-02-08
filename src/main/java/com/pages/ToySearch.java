package com.pages;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ToySearch {

	public WebDriver driver;

	public By popup = By.xpath("//div[@class='shopee-popup__close-btn']//*[local-name()='svg']");

	public By searchitem = By.xpath("//input[@placeholder='Tinder: 50% OFF storewide!']");

	public By searchbutton = By.cssSelector("button[type='button']");

	public By price = By.xpath("//span[@class='_1xk7ak']");

	//public By product = By.xpath("//div[@class='_1NoI8_ A6gE1J _1co5xN']");

	String product_name;
	String product_price;
	int int_product_price;

	public ToySearch(WebDriver driver) {
		this.driver = driver;
	}

	// Actions

	public void clickOnPopup() {
		driver.findElement(popup).click();
	}

	public void enterItemAndClick() {
		driver.findElement(searchitem).sendKeys("Toy");
		driver.findElement(searchbutton).click();

	}

	public void getMaximumPrice() {
		List<WebElement> list = driver.findElements(price);

		// List<WebElement> list_of_products = driver.findElements(product);

		HashMap<Integer, String> map_final_products = new HashMap<Integer, String>();

		for (int i = 0; i < list.size(); i++) {

			product_price = list.get(i).getText();// Iterate and fetch product price
			// product_name = list_of_products.get(i).getText();// Iterate and fetch product
			// name

			product_price = product_price.replaceAll("[^0-9]", "");// Replace anything wil space other than numbers
			int int_prouct_price = Integer.parseInt(product_price);// Convert to Integer
			System.out.println(int_prouct_price);
			map_final_products.put(int_product_price, product_name);
		}

		Set<Integer> allkeys = map_final_products.keySet();
		ArrayList<Integer> array_list_values_product_prices = new ArrayList<Integer>(allkeys);

		Collections.sort(array_list_values_product_prices);

		// Highest Product is
		int high_price = array_list_values_product_prices.get(array_list_values_product_prices.size() - 1);
		// System.out.println(product_name);
		System.out.println("maximum price is " + high_price);

		Collection<String> allValues = map_final_products.values();
		ArrayList<String> array_list_values_product_names = new ArrayList<String>(allValues);
		System.out.println(array_list_values_product_names);
	}
}
