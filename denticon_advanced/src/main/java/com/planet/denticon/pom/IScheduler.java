package com.planet.denticon.pom;

import org.openqa.selenium.By;

public interface IScheduler {

	/////////////////////////Add/Edit Appointment///////////////////////////////////
	By TAB_SCHEDULER=By.id("MenuBar_aMenuScheduler");
	By TAB_SCHEDULER_DD=By.id("aMenuScheduler");
	By ICON_CALENDER=By.id("ApptMenu_imgDate");
	By LST_DATES=By.id("calCell");
	//By SLC_TIME_APPOINTMENT=By.xpath("//*[@id='ancSched']/div[3]");
	By SLC_TIME_APPOINTMENT=By.xpath("//div[@class='c']");
	
	By TAB_BOOKEDAPP=By.xpath(".//*[@id='ancSched']/div[19]/table/tbody/tr[2]/td[2]");
	By BTN_ADD_NEW_APPOINTMENT=By.cssSelector("#divAdd New Appointment...");
	By BTN_ADD=By.id("cmdAdd");
	By BTN_SAVE=By.id("cmdSave");
	By LNK_NEW_APPT=By.id("ApptMenu_ancNewAppt");
	By LNK_FIND_SLOT=By.id("ApptMenu_ancFindSlot");
	By BTN_FINDSLOT=By.id("cmdFindSlot");
	By SLC_SLOT=By.xpath(".//*[@id='DGApptmts']/tbody/tr[5]/td[3]");
	By APPNT_SLOT=By.xpath(".//*[@id='ancFS']/div");
	By TXT_PATIENTSEARCH=By.id("txtSearch");
	By BTN_SEARCH=By.id("cmdSearch");
	By SLC_FIRST_PATIENT=By.id("1");
	
	///////////////Find Appointment/////////////////////////////////////////////////
	By LNK_FIND_APPT=By.id("ApptMenu_ancFindAppt");
	By EXISTING_APPOINTMENT=By.id("1791");
}
