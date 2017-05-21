package com.planet.denticon.login;
import java.util.Properties;
import org.testng.annotations.Test;
import com.planet.denticon.pom.ILogin;
import com.planet.denticon.utilities.CommonMethods;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class Login {
	String filePath=System.getProperty("user.dir") + "\\src\\main\\resources\\login.properties";
	String username="";
	String password="";
	ExtentReports repo;
	ExtentTest logger;
	Properties prop= new Properties();
	boolean flag=false;
	@Test
	public void login() {
		String stepInfo="";
		try{
			Thread.sleep(1000);
			repo=CommonMethods.getReport(repo);
			logger=repo.startTest("Denticon Login");
			username=CommonMethods.readDatafromProps(filePath,"user");
			password=CommonMethods.readDatafromProps(filePath,"password");
			flag=CommonMethods.sendText(ILogin.TXT_USERNAME, username);
			
			if(flag)
				logger.log(LogStatus.PASS, "Entered Username::"+username);
			else
				logger.log(LogStatus.FAIL, "Entered Username::"+username);

			flag=CommonMethods.sendText(ILogin.TXT_PASSWORD, password);
			if(flag)
				logger.log(LogStatus.PASS, "Entered password::"+password);
			else
				logger.log(LogStatus.FAIL, "Entered password::"+password);

			flag = CommonMethods.clickIfEnable(ILogin.BTN_GO);	
			if(flag)
				logger.log(LogStatus.PASS, "Clicked on Go button");
			else
				logger.log(LogStatus.FAIL, "Clicked on Go button");
			Thread.sleep(3000);

			CommonMethods.isElementPresent(ILogin.LNK_SIGNOFF);
			logger.log(LogStatus.PASS, "Successfully logged into Denticon");
			CommonMethods.closeReport(repo, logger);
			Thread.sleep(3000);

		}
		catch(Exception e){	  
		}

	}
}
