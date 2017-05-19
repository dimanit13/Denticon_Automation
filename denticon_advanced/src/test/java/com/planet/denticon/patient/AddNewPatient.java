package com.planet.denticon.patient;

import java.util.Properties;

import org.testng.annotations.Test;

import com.planet.denticon.pom.IPatient;
import com.planet.denticon.utilities.CommonMethods;

public class AddNewPatient {
	String stepInfo="";
	boolean flag=false;
	String filePath=System.getProperty("user.dir") + "\\src\\main\\resources\\login.properties";
	@Test
	public void f() {
		try {
			String nickname=CommonMethods.readDatafromProps(filePath,"Nickname");
			String lastName=CommonMethods.readDatafromProps(filePath,"LastName");
			String firstName=CommonMethods.readDatafromProps(filePath,"LastName");
			String city=CommonMethods.readDatafromProps(filePath,"City");
			
			stepInfo="Click on Patient tab";
			flag=CommonMethods.clickIfEnable(IPatient.TAB_PATIENT);
			stepInfo="Click on add new patient";
			flag=CommonMethods.clickIfEnable(IPatient.LNK_ADD_NEW_PATIENT);
			stepInfo="Select title";
			flag=CommonMethods.listSelect(IPatient.SLC_TITLE_NICKNAME, "Mr.");
			stepInfo="Enter the nick name";
			flag=CommonMethods.sendText(IPatient.TXT_Nick,nickname);
			stepInfo="Enter last name";
			flag=CommonMethods.sendText(IPatient.TXT_Last_Name, lastName);
			stepInfo="Enter first name";
			flag=CommonMethods.sendText(IPatient.TXT_First_Name, firstName);
			stepInfo="Click on City";
			
			
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
