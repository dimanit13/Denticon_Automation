package com.planet.denticon.charting;

import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.NoSuchElementException;
import org.testng.annotations.Test;

import com.planet.denticon.DriverManager;
import com.planet.denticon.pom.ICharting;
import com.planet.denticon.utilities.CommonMethods;


public class SPatientCharting {
	String stepInfo="";
	boolean flag=false;
	@Test(description="Verify Patient Charting functionality")
	public void verifyPatientChartingTab() {
		if(verifyPatientChartPage())
			System.out.println("Patient Charting page verification passed");
		else
			System.out.println("Patient Charting page verification failed");

		/*if(VerifyMarkingMissinTooth())
			System.out.println("Tooth is marked as missing");
		else
			System.out.println("Tooth is not marked as missing");*/
	}
	public boolean verifyPatientChartPage(){
		try{
			stepInfo="Click on Charting tab";
			flag=CommonMethods.clickIfEnable(ICharting.TAB_CHARTING);
			stepInfo="Select Patient Chart";
			flag=CommonMethods.clickIfEnable(ICharting.LNK_PATIENT_CHART);
			stepInfo="verify Patient chart page is displayed";
			Thread.sleep(2000);
			flag=CommonMethods.isElementPresent(ICharting.PAGE_PATIEN_CHRT);
		}
		catch (Exception e) {
			e.getStackTrace();
		}
		return flag;
	}
	public boolean VerifyMarkedMissinTooth(){
		try{
			flag=verifyPatientChartPage();
			stepInfo="Click on Pre-existing tab";
			Thread.sleep(6000);
			flag=CommonMethods.clickIfEnable(ICharting.TAB_PRE_EXISTING);
			stepInfo="Select tooth";
			Thread.sleep(15000);
			flag=CommonMethods.clickIfEnable(ICharting.SLC_TOOTH);
			Alert alert=DriverManager.getDriver().switchTo().alert();
			alert.accept();
			stepInfo="Clicking on missing button";
			flag=CommonMethods.clickIfEnable(ICharting.BTN_MISSING);
			stepInfo="Verify the tooth is marked as missing";

			flag=CommonMethods.isElementPresent(ICharting.TITLE_MISSING);
			System.out.println("Tooth is marked as missing::"+flag);


		}
		catch (Exception e) {
			e.getStackTrace();
		}
		return flag;		
	}
	public boolean VerifyImpactedMissinTooth(){
		
		try{

			flag=verifyPatientChartPage();
			stepInfo="Click on Pre-existing tab";
			Thread.sleep(6000);
			flag=CommonMethods.clickIfEnable(ICharting.TAB_PRE_EXISTING);
			stepInfo="Select tooth";
			Thread.sleep(15000);
			flag=CommonMethods.clickIfEnable(ICharting.SLC_TOOTH);
			Alert alert=DriverManager.getDriver().switchTo().alert();
			alert.accept();
			stepInfo="Clicking on missing button";
			flag=CommonMethods.clickIfEnable(ICharting.BTN_IMPACTED);
			stepInfo="Verify the tooth is marked as missing";

			flag=CommonMethods.isElementPresent(ICharting.TITLE_MISSING);
			System.out.println("Tooth is marked as missing::"+flag);


		
		}
	catch (Exception e) {
		e.getStackTrace();
	}
	return flag;
}
}