package com.planet.denticon.scheduler;

import java.util.Set;

import org.testng.annotations.Test;

import com.planet.denticon.DriverManager;
import com.planet.denticon.pom.IScheduler;
import com.planet.denticon.utilities.CommonMethods;

public class FindAppointment {
	String stepInfo="";
	boolean flag=false;
  @Test
  public void f() {
	  findAppointment();
  }
  public void findAppointment(){
	  try{
	  stepInfo="Click on schedular tab";
		flag=CommonMethods.clickIfEnable(IScheduler.TAB_SCHEDULER);
		Thread.sleep(2000);
		stepInfo="switch to new window";
		String parentWindow=DriverManager.getDriver().getWindowHandle();
		Set<String> windowHandles = DriverManager.getDriver().getWindowHandles();
		for (String window : windowHandles) {
			DriverManager.getDriver().switchTo().window(window);
		}
		flag=CommonMethods.isAlertPresent();
		System.out.println(flag);
		stepInfo="Click on Schedular tab";
		Thread.sleep(2000);
		flag=CommonMethods.clickIfEnable(IScheduler.TAB_SCHEDULER_DD);
		stepInfo="Click on Find Appointment";
		Thread.sleep(2000);
		flag=CommonMethods.clickIfEnable(IScheduler.LNK_FIND_APPT);
		stepInfo="Search the patient by last name ";
		Thread.sleep(3000);
		flag=CommonMethods.sendText(IScheduler.TXT_PATIENTSEARCH,"chun");
		stepInfo="Click on Search button";
		flag=CommonMethods.clickIfEnable(IScheduler.BTN_SEARCH);
		stepInfo="Select Appointment";
		Thread.sleep(3000);
		flag=CommonMethods.isElementPresent(IScheduler.EXISTING_APPOINTMENT);
		DriverManager.getDriver().close();
		DriverManager.getDriver().switchTo().window(parentWindow);
		
	  }catch(Exception e){
		  
	  }
  }
}
