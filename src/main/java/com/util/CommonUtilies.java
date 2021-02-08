package com.util;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.factory.DriverFactory;

public class CommonUtilies {

	public WebDriver driver;

	public void lauchBrowser() {
		DriverFactory.getDriver()
				.get("https://shopee.sg");
	}
     
	public void waitMethod() {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		WebElement ele =wait.until(ExpectedConditions.elementToBeClickable(By.xpath("xpath_of_element_to_be_clicked")));
		ele.click();
		
	}
	
	
}
