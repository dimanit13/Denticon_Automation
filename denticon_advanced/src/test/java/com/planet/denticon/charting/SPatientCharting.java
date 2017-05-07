package com.planet.denticon.charting;

import org.testng.annotations.Test;
import com.planet.denticon.pom.ICharting;
import com.planet.denticon.utilities.CommonMethods;

public class SPatientCharting {
	String stepInfo="";
	boolean flag=false;
	@Test
	public void verifyPatientChartingTab() {
		if(verifyPatientChartPage())
			System.out.println("Patient Charting page verification passed");
		else
			System.out.println("Patient Charting page verification failed");
	}
	public boolean verifyPatientChartPage(){
		stepInfo="Click on Charting tab";
		flag=CommonMethods.clickIfEnable(ICharting.TAB_CHARTING);
		stepInfo="Select Patient Chart";
		flag=CommonMethods.clickIfEnable(ICharting.LNK_PATIENT_CHART);
		stepInfo="verify Patient chart page is displayed";
		flag=CommonMethods.isElementPresent(ICharting.PAGE_PATIEN_CHRT);
		return flag;

	}
}
