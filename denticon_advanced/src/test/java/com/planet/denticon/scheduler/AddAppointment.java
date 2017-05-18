package com.planet.denticon.scheduler;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import com.planet.denticon.DriverManager;
import com.planet.denticon.pom.IScheduler;
import com.planet.denticon.utilities.CommonMethods;


public class AddAppointment {
	String stepInfo="";
	boolean flag=false;
	String date="18";
	@Test
	public void bookAppointment() {
		try {
			stepInfo="Click on schedular tab";
			flag=CommonMethods.clickIfEnable(IScheduler.TAB_SCHEDULER);
			Thread.sleep(2000);
			stepInfo="switch to new window";
			String parentWindow=DriverManager.getDriver().getWindowHandle();
			Set<String> windowHandles = DriverManager.getDriver().getWindowHandles();
			for (String window : windowHandles) {
				DriverManager.getDriver().switchTo().window(window);
			}
			DateFormat df = new SimpleDateFormat("MM/dd/yyyy");
			Date dateobj = new Date();
			System.out.println(df.format(dateobj));
			Thread.sleep(2000);
				
			stepInfo="Click on Calender Icon to select date";
			Thread.sleep(2000);
			flag=CommonMethods.clickIfEnable(IScheduler.ICON_CALENDER);
			stepInfo="select date ";
			List<WebElement> lst=new ArrayList<WebElement>();
			lst=DriverManager.getDriver().findElements(IScheduler.LST_DATES);
			for(int i=0;i<lst.size();i++){
				//System.out.println(lst.get(i).getText());
				if(lst.get(i).getText().trim().equalsIgnoreCase(date)){
					lst.get(i).click();
					break;
				}
			}
			
			stepInfo="Right click on select time";
			Thread.sleep(5000);
			Actions action = new Actions(DriverManager.getDriver()).contextClick(DriverManager.getDriver().findElement(IScheduler.SLC_TIME_APPOINTMENT));
			action.build().perform();
			Thread.sleep(2000);
			flag=CommonMethods.clickIfEnable(IScheduler.BTN_ADD_NEW_APPOINTMENT);

			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		stepInfo="";
	}
}
