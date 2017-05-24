package com.planet.denticon.reporting;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import com.planet.denticon.DriverManager;
import com.planet.denticon.pom.IReports;
import com.planet.denticon.utilities.CommonMethods;
public class ViewReport {
	String startDate="10";
	String endDate="27";
	String stepInfo="";
	boolean flag=false;
	@Test
	public void f() {
		dailyReport();
	}
	public void dailyReport(){
		try{
			stepInfo="Click on Reporting tab";
			flag=CommonMethods.clickIfEnable(IReports.TAB_REPORT);
			stepInfo="Click on Daily Reporting";
			flag=CommonMethods.clickIfEnable(IReports.LNK_DAILY_REPORT);
			stepInfo="Select Executive Summary";
			flag=CommonMethods.clickIfEnable(IReports.RBTN_EXECUTIVE_SUMMARY);
			Thread.sleep(2000);
			stepInfo="Select Start Date, Click on calender Icon ";
			flag=CommonMethods.clickIfEnable(IReports.ICON_START_DATE);
			Thread.sleep(2000);
			List<WebElement> lst_startDate=new ArrayList<WebElement>();
			lst_startDate=DriverManager.getDriver().findElements(IReports.LST_START_DATE);
			for(int i=0;i<lst_startDate.size();i++){
				if(lst_startDate.get(i).getText().trim().equalsIgnoreCase(startDate)){
					lst_startDate.get(i).click();
					break;
				}
			}
			
			stepInfo="Select End Date, Click on calender Icon ";
			Thread.sleep(2000);
			flag=CommonMethods.clickIfEnable(IReports.ICON_END_DATE);
			Thread.sleep(2000);
			List<WebElement> lst_endDate=new ArrayList<WebElement>();
			lst_endDate=DriverManager.getDriver().findElements(IReports.LST_END_DATE);
			for(int i=0;i<lst_endDate.size();i++){
				if(lst_endDate.get(i).getText().trim().equalsIgnoreCase(endDate)){
					lst_endDate.get(i).click();
					break;
				}
			}
			
			stepInfo="Click on Print Preview Icon ";
			flag=CommonMethods.clickIfEnable(IReports.BTN_PRINT_PREVIEW);
			
			
			String parentWindow=DriverManager.getDriver().getWindowHandle();
			Set<String> windowHandles = DriverManager.getDriver().getWindowHandles();
			for (String window : windowHandles) {
				DriverManager.getDriver().switchTo().window(window);
			}
			
			stepInfo="Verify Execution Summary report with Title";
			Thread.sleep(5000);
			flag=CommonMethods.isElementPresent(IReports.PDF_REPORT_EXECUTION_SUMMARY);
			
			DriverManager.getDriver().close();
			DriverManager.getDriver().switchTo().window(parentWindow);
		}
		catch(Exception e){}
	}
}
