package com.planet.denticon;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class Config {
	private static RemoteWebDriver driver;
	public static RemoteWebDriver setupBrowser(String browsername, String url){
		try{
		switch(browsername)
		{
		case "chrome":
			System.setProperty("webdriver.chrome.driver", "E:\\Selenium_Test\\denticon_advanced\\src\\main\\resources\\chromedriver.exe");
			driver=new ChromeDriver();
			break;
		case "ie":
			System.setProperty("webdriver.ie.driver", "E:\\Selenium_Test\\denticon_advanced\\src\\main\\resources\\IEDriverServer.exe");
			driver=new InternetExplorerDriver();
			break;
		case "ff":
			System.setProperty("webdriver.gecko.driver","E:\\Selenium_Test\\denticon_advanced\\src\\main\\resources\\geckodriver.exe");
			driver = new FirefoxDriver();
			break;
		case "safari":
			
		default:
			System.out.println("Browser not found");
		}
		driver.get(url);
		driver.manage().window().maximize();
		}catch(Exception e){
			e.printStackTrace();
		}
		
		return driver;
	}
}