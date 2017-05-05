package com.planet.denticon.login;

import org.openqa.selenium.Alert;
import org.testng.annotations.Test;
import com.planet.denticon.pom.ILogin;
import com.planet.denticon.utilities.CommonMethods;

public class Logout {
	@Test
	public void logout() {
		try {
			CommonMethods.clickIfEnable(ILogin.LNK_SIGNOFF);
			Alert alert = com.planet.denticon.DriverManager.getDriver().switchTo().alert();
			alert.accept();
			Thread.sleep(2000);
		} catch (Exception e) {

			e.printStackTrace();
		}

	}
}
