package com.planet.denticon.pom;

import org.openqa.selenium.By;

public interface IReports {
 By TAB_REPORT=By.id("MenuBar_aMenuReports");
 By LNK_DAILY_REPORT=By.xpath(".//*[@id='menuReports']/a[1]");
 By RBTN_EXECUTIVE_SUMMARY=By.id("rbExecSumm");
 By ICON_START_DATE=By.id("imgStartDt");
 By ICON_END_DATE=By.id("imgStartDt");
 By BTN_PRINT_PREVIEW=By.id("btnPrint");
 By LST_START_DATE=By.xpath(".//*[contains(@id, 'CalendarExtender2')]");
 By LST_END_DATE=By.xpath(".//*[contains(@id, 'CalendarExtender3')]");
 By PDF_REPORT_EXECUTION_SUMMARY=By.xpath(".//*[@id='pageContainer1']/xhtml:div[2]/xhtml:div[2]");
}
