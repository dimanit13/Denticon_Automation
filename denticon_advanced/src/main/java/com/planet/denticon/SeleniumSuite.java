package com.planet.denticon;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;

public class SeleniumSuite {
	public RemoteWebDriver driver;
	ExtentReports repo;
	ExtentTest logger;

	@BeforeTest
	@Parameters({"browserType","url"})
	public RemoteWebDriver setUpSuite(String browserType, String url) {
		Config config = new Config();
		if (driver == null) {
			driver = com.planet.denticon.DriverManager.getDriver();
			driver = config.setupBrowser(browserType, url);
			com.planet.denticon.DriverManager.setWebDriver(driver);
		}
		return driver;
	}
	@AfterTest
	public void afterTest(){
		driver.close();
		driver.quit();
	}
}