package hooks;

import io.cucumber.java.AfterAll;
import io.cucumber.java.BeforeAll;
import io.cucumber.java.Scenario;
import io.qameta.allure.Allure;
import utilities.ConfigReader;
import utilities.LoggerLoad;

import org.openqa.selenium.WebDriver;

import driverFactory.DriverFactory;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import java.io.ByteArrayInputStream;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;


public class AppHook {
	private static WebDriver driver;
	private static DriverFactory baseclass;
	

	// @BeforeAll hook method..> This method will be executed before all scenarios:
	/*
	 * This method reads the browser type from a configuration file, initializes
	 * the DriverFactory class, and initializes the WebDriver instance using the
	 * initializeWebdriver method
	 */

	@BeforeAll
	public static void launchbrowser()  throws Throwable {
		
		//Get Browser Type
		LoggerLoad.info("Loading Config file");
	
		ConfigReader.readConfig(); //reads config.properties file and load them into properties object
		
		String browser = ConfigReader.getbrowser(); //gets the browser property from the properties object
		System.out.println(ConfigReader.getbrowser());
		
		baseclass = new DriverFactory(); //creates DriverFactory object
		driver = baseclass.initialize(browser); // creates and returns Webdriver object for the browser passed as parameter
		LoggerLoad.info("Intializing" + browser +"driver");
		
	}
	
	//@AfterStep hook method. This method will be executed after each step:
		/*
		 * This method checks if the scenario has failed and takes a screenshot using
		 * the WebDriver's getScreenshotAs method. The screenshot is then attached to
		 * the scenario and also attached to the Allure report.
		 */	
	
	@AfterStep
	public void afterstep(Scenario scenario) {
		if (scenario.isFailed()) {
			LoggerLoad.error("Steps Failed , Taking Screenshot");
			final byte[] screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
			scenario.attach(screenshot, "image/png", "My screenshot");
			Allure.attachment("Myscreenshot",new ByteArrayInputStream(((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES)));
	
	}
	}

	//This method closes the WebDriver instance using the closeDriver method in the DriverFactory class.
	
	@AfterAll
public static void after() throws InterruptedException {
	LoggerLoad.info("Closing Driver");
	Thread.sleep(5000);
	baseclass.closeallDriver();		}

	}
