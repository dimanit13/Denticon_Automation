package com.planet.denticon.pom;

import org.openqa.selenium.By;

public interface ICharting {

	By TAB_CHARTING=By.id("MenuBar_aMenuCharting");
	By LNK_PATIENT_CHART=By.linkText("Patient Chart");
	By PAGE_PATIEN_CHRT=By.id("HelpBar_SpanPageTitle");
	By TAB_PRE_EXISTING=By.xpath(".//*[@id='ui-id-1']/span");
	By SLC_TOOTH=By.id("i22rect");
	By BTN_MISSING=By.id("cmdPxMissing");
	By TITLE_MISSING=By.xpath("//path[contains(@title, 'Missing')]");
	By BTN_IMPACTED=By.id("cmdPxImpacted");
	By BTN_IMPLANT=By.id("cmdPxImplant");
	By BTN_RESTORATION=By.id("cmdPxCrown");
	By BTN_DECAY=By.id("cmdPxDecay");
	By BTN_BRIDGE=By.id("cmdPxBridge");
	By BTN_DENTURE=By.id("");
	By BTN_EXTRACTION=By.id("");
	By TAB_TX_PLANS=By.xpath(".//*[@id='ui-id-3']/span");
	
	
}
