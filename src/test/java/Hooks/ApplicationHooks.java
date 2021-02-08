package Hooks;

import io.cucumber.java.en.When;

import java.util.Properties;

import org.junit.Assert;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import com.factory.DriverFactory;
import com.util.ConfigReader;

import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.cucumber.java.After;

public class ApplicationHooks {

	public DriverFactory driverFactory;
	private WebDriver driver;
	public ConfigReader configReader;
	public Properties prop;

	@Before(order = 0)
	public void getProperties() {
		configReader = new ConfigReader();
		prop = configReader.initializeProperties();

	}

	@Before(order = 1)
	public void launchBrowser() {
		String browsername = prop.getProperty("browser");
		driverFactory = new DriverFactory();
		driver = driverFactory.initializeDriver(browsername);

	}

	@After(order = 0)
	public void quitBrowser() {

		driver.quit();
	}

//	@After(order = 1)
//	public void tearDown(Scenario scenario) {
//		if (scenario.isFailed()) {
//			String screenshotName = scenario.getName().replaceAll(" ", "_");
//			byte[] sourcepath = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
//			scenario.attach(sourcepath, "img/png", screenshotName);
//		}
//	}

}
