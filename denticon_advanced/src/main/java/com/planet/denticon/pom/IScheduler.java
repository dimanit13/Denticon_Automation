package com.planet.denticon.pom;

import org.openqa.selenium.By;

public interface IScheduler {

	By TAB_SCHEDULER=By.id("MenuBar_aMenuScheduler");
	By ICON_CALENDER=By.id("ApptMenu_imgDate");
	By LST_DATES=By.id("calCell");
	By SLC_TIME_APPOINTMENT=By.cssSelector("#div101~152~212^08:00 AM");
	By BTN_ADD_NEW_APPOINTMENT=By.cssSelector("#divAdd New Appointment...");
}
