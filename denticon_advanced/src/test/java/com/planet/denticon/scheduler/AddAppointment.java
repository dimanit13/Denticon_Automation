package com.planet.denticon.scheduler;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.Alert;
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
	String date="24";
	@Test
	public void appointments() {
		addAppointment();
		//editAppointment();
	}
	public void addAppointment(){
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
			flag=CommonMethods.isAlertPresent();
			System.out.println(flag);
			stepInfo="Click on Schedular tab";
			flag=CommonMethods.clickIfEnable(IScheduler.TAB_SCHEDULER_DD);
			stepInfo="Click on Find Slot";
			flag=CommonMethods.clickIfEnable(IScheduler.LNK_FIND_SLOT);
			
			Thread.sleep(2000);
			stepInfo="Click on find slot button";
			flag=CommonMethods.clickIfEnable(IScheduler.BTN_FINDSLOT);
			stepInfo="Select Slot";
			Thread.sleep(3000);
			flag=CommonMethods.clickIfEnable(IScheduler.SLC_SLOT);
			Thread.sleep(3000);
			stepInfo="select slot on appointment page";
			flag=CommonMethods.clickIfEnable(IScheduler.APPNT_SLOT);
			Thread.sleep(3000);
			stepInfo="Again click on schedular";
			flag=CommonMethods.clickIfEnable(IScheduler.TAB_SCHEDULER_DD);
			stepInfo="Click on New Appt";
			Thread.sleep(3000);
			flag=CommonMethods.clickIfEnable(IScheduler.LNK_NEW_APPT);
			
			stepInfo="Search the patient by last name ";
			Thread.sleep(3000);
			flag=CommonMethods.sendText(IScheduler.TXT_PATIENTSEARCH,"a");
			stepInfo="Click on Search button";
			flag=CommonMethods.clickIfEnable(IScheduler.BTN_SEARCH);
			stepInfo="Select Patient";
			Thread.sleep(3000);
			flag=CommonMethods.clickIfEnable(IScheduler.SLC_FIRST_PATIENT);
			
			stepInfo="click on add button";
			Thread.sleep(3000);
			flag=CommonMethods.clickIfEnable(IScheduler.BTN_ADD);
			stepInfo="click on save button";
			Thread.sleep(3000);
			flag=CommonMethods.clickIfEnable(IScheduler.BTN_SAVE);
			DriverManager.getDriver().close();
			DriverManager.getDriver().switchTo().window(parentWindow);
		}
		catch(Exception e){
			
		}
		
	}
	public void editAppointment(){

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
			flag=CommonMethods.isAlertPresent();
			DateFormat df = new SimpleDateFormat("MM/dd/yyyy");
			Date dateobj = new Date();
			System.out.println(df.format(dateobj));
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
			//DriverManager.getDriver().findElement(By.id("aMenuPatient"));
			//flag=CommonMethods.isElementPresent(IScheduler.SLC_TIME_APPOINTMENT);

			stepInfo="Right click on select time";
			Thread.sleep(8000);

			Actions builder = new Actions(DriverManager.getDriver());
			builder.contextClick(DriverManager.getDriver().findElement(IScheduler.TAB_BOOKEDAPP)).perform();
			Thread.sleep(3000);
			builder.contextClick(DriverManager.getDriver().findElement(IScheduler.TAB_BOOKEDAPP)).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).perform();			
			Thread.sleep(5000);


		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		stepInfo="";
	
	}
}
