package com.planet.denticon;

import org.openqa.selenium.remote.RemoteWebDriver;

public class DriverManager {
	private static ThreadLocal<RemoteWebDriver> webDrivers = new ThreadLocal<RemoteWebDriver>();

	public DriverManager() {
      //Default Constructor
	}
   
	public static RemoteWebDriver getDriver() {
		
		return webDrivers.get();
	}

	public static void setWebDriver(RemoteWebDriver driver) {
		webDrivers.set(driver);
	}



}
