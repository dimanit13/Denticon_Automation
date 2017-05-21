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
		//addAppointment();
		editAppointment();
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

			/*Thread.sleep(3000);
			Alert alert=DriverManager.getDriver().switchTo().alert();
			alert.accept();*/
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
			Thread.sleep(3000);
			stepInfo="select time for which you want to book an appointment";
			List<WebElement> lst1=new ArrayList<WebElement>();
			lst=DriverManager.getDriver().findElements(IScheduler.SLC_TIME_APPOINTMENT);
			lst1.get(1).click();
			//flag=CommonMethods.clickIfEnable(IScheduler.SLC_TIME_APPOINTMENT);
			Thread.sleep(3000);
			stepInfo="Click on Schedular tab";
			flag=CommonMethods.clickIfEnable(IScheduler.TAB_SCHEDULER_DD);
			
			
			
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

			/*Thread.sleep(3000);
			Alert alert=DriverManager.getDriver().switchTo().alert();
			alert.accept();*/
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
			//DriverManager.getDriver().findElement(By.id("aMenuPatient"));
			//flag=CommonMethods.isElementPresent(IScheduler.SLC_TIME_APPOINTMENT);

			stepInfo="Right click on select time";
			Thread.sleep(8000);

			Actions builder = new Actions(DriverManager.getDriver());
			builder.contextClick(DriverManager.getDriver().findElement(IScheduler.TAB_BOOKEDAPP)).perform();
			Thread.sleep(3000);
			builder.contextClick(DriverManager.getDriver().findElement(IScheduler.TAB_BOOKEDAPP)).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).perform();
			Thread.sleep(3000);

			//contextClick(DriverManager.getDriver().findElement(IScheduler.SLC_TIME_APPOINTMENT)).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).perform();

			Thread.sleep(5000);
			//flag=CommonMethods.clickIfEnable(IScheduler.BTN_ADD_NEW_APPOINTMENT);


		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		stepInfo="";
	
	}
}
