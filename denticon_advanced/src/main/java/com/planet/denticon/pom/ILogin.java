package com.planet.denticon.pom;

import org.openqa.selenium.By;

public interface ILogin {

	By TXT_USERNAME = By.id("txtUserName");
	By TXT_PASSWORD = By.id("txtPassword");
	By BTN_GO = By.id("Submit1"); 
	By LNK_SIGNOFF = By.linkText("Logout");

}
