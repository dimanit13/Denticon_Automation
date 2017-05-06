package com.planet.denticon.login;
import java.util.Properties;
import org.testng.annotations.Test;
import com.planet.denticon.pom.ILogin;
import com.planet.denticon.utilities.CommonMethods;

public class Login {
	String filePath=System.getProperty("user.dir") + "\\src\\main\\resources\\login.properties";
	String username="";
	String password="";
	Properties prop= new Properties();
	@Test
	public void login() {
		try{
			Thread.sleep(1000);
			username=CommonMethods.readDatafromProps(filePath,"user");
			password=CommonMethods.readDatafromProps(filePath,"password");
			CommonMethods.sendText(ILogin.TXT_USERNAME, username);			
			CommonMethods.sendText(ILogin.TXT_PASSWORD, password);
			CommonMethods.clickIfEnable(ILogin.BTN_GO);			
			Thread.sleep(3000);
			
		}
		catch(Exception e){	  
		}

	}
}
