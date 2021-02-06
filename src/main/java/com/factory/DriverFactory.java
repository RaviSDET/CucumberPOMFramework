package com.factory;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DriverFactory {

	public WebDriver driver;

	public static ThreadLocal<WebDriver> tloc = new ThreadLocal<>();

	public WebDriver initializeDriver(String browser) {

		if (browser.equals("chrome")) {
			WebDriverManager.chromedriver().setup();
			tloc.set(new ChromeDriver());
		} else if (browser.equals("firefox")) {
			WebDriverManager.chromedriver().setup();
			tloc.set(new FirefoxDriver());
		} else {
			System.out.println("provide proper broswer name" + browser);
		}

		getDriver().manage().window().maximize();
		getDriver().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		getDriver().manage().deleteAllCookies();
		return getDriver();

	}

	public static WebDriver getDriver() {
		return tloc.get();
	}

}
