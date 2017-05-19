package com.planet.denticon.pom;

import org.openqa.selenium.By;

public interface IPatient {
	
		By TAB_PATIENT=By.id("MenuBar_aMenuPatient");
		By LNK_ADD_NEW_PATIENT=By.linkText("Add New Patient");
		By Patient_Info_Title=By.xpath("//*[@id='HelpBar_SpanPageTitle']");
		
		By Personal_Info_Title=By.xpath("//*[@id='Table5']/tbody/tr[1]/td");
		By SLC_NickTitle=By.xpath("//*[@id='Table5']/tbody/tr[2]/td[1]");
		
		By SLC_TITLE_NICKNAME= By.id("Title_Title");
		By TXT_Nick= By.id("txtNickName");
		By CHK_Patient=By.xpath("//*[@id='btnCheckPat']");
		
		By SLC_Last_First_Name=By.xpath("//*[@id='Table5']/tbody/tr[3]/td[1]");
		By TXT_Last_Name=By.xpath("//*[@id='txtLastName']");
		By TXT_First_Name=By.xpath("//*[@id='txtFirstName']");
		By TXT_MidI=By.xpath("//*[@id='txtMidInit']");
		By SLC_Address=By.xpath("//*[@id='Table5']/tbody/tr[4]/td[1]");
		By TXT_Address=By.xpath("//*[@id='txtAddr']");
		By SLC_City_ZIP=By.xpath("//*[@id='Table5']/tbody/tr[6]/td[1]");
		By TXT_City=By.xpath("//*[@id='txtCity']");
		By SCR_City=By.xpath("//*[@id='State_State']");
		By TXT_ZIP=By.xpath("//*[@id='txtZipCode_ZipCode']");
		
		By SLC_Email=By.xpath("//*[@id='Table5']/tbody/tr[7]/td[1]");
		By TXT_Email=By.xpath("//*[@id='txtEmail']");
		By SLC_Bdate=By.xpath("//*[@id='Table5']/tbody/tr[8]/td[1]");
		By TXT_Bdate=By.xpath("//*[@id='txtBirthDate']");
		By SLC_MaritalStatus=By.xpath("//*[@id='Table5']/tbody/tr[9]/td[1]");
		By SCR_MStatus=By.xpath("/*[@id='MStatus_MStatus']");
		
		By SLC_HCGN=By.xpath("//*[@id='Table5']/tbody/tr[10]/td[1]");
		By TXT_HCGN=By.xpath("//*[@id='txtPowerOfAttorneyName']");
		By SLC_Age=By.xpath("/*[@id='Table5']/tbody/tr[8]/td[3]");
		By TXT_Age=By.xpath("//*[@id='txtAge']");
		By SLC_Sex=By.xpath("//*[@id='Table5']/tbody/tr[9]/td[3]");
		By TXT_Sex=By.xpath("//*[@id='Table5']/tbody/tr[10]/td[1]");
		By SLC_HCGP=By.xpath("//*[@id='Table5']/tbody/tr[10]/td[3]");
		By TXT_HCGP=By.xpath("//*[@id='txtPowerOfAttorneyPhone_PhoneNumber_text']");
		
		By SLC_PatientStatus=By.xpath("//*[@id='Table5']/tbody/tr[11]/td[1]");
		By CHK_Active=By.xpath("//*[@id='Table5']/tbody/tr[12]/td[1]/label[1]");
		By CHK_ABenifits=By.xpath("//*[@id='Table5']/tbody/tr[12]/td[1]/label[2]");
		By CHK_HIPAAAgreement=By.xpath("//*[@id='Table5']/tbody/tr[12]/td[1]/label[3]");
		By CHK_Nocorrespondence=By.xpath("//*[@id='Table5']/tbody/tr[12]/td[1]/label[4]");
		By CHK_NoAutomail=By.xpath("//*[@id='Table5']/tbody/tr[12]/td[1]/label[5]");
		By CHK_AutoSMS=By.xpath("//*[@id='Table5']/tbody/tr[12]/td[1]/label[6]");
		
		By SLC_CoverageType=By.xpath("//*[@id='Table5']/tbody/tr[11]/td[2]");
		By CHK_NoCvg=By.xpath("//*[@id='Table5']/tbody/tr[12]/td[1]/label[1]");
		By CHK_PrimaryDental=By.xpath("//*[@id='Table5']/tbody/tr[12]/td[1]/label[1]");
		By CHK_SecondaryDental=By.xpath("//*[@id='Table5']/tbody/tr[12]/td[1]/label[1]");
		By CHK_PrimaryMedical=By.xpath("//*[@id='Table5']/tbody/tr[12]/td[1]/label[1]");
		By CHK_SecondaryMedical=By.xpath("//*[@id='Table5']/tbody/tr[12]/td[1]/label[1]");
		
		By SLC_Ethinicity=By.xpath(".//*[@id='Table5']/tbody/tr[18]/td[1]");
		By SCR_Ethinicity=By.xpath("//*[@id='cmbNHSEthnicity']");
		
		By SLC_PatientNotes=By.xpath("//*[@id='Table5']/tbody/tr[19]/td[1]");
		By SLC_DataStamp=By.xpath(".//*[@id='btnDateStamp']");
		By TXT_PatientNotes=By.xpath("//*[@id='txtNotes']");
		
		By SLC_RelToRes=By.xpath("//*[@id='Table5']/tbody/tr[3]/td[3]");
		By TXT_RelToRes=By.xpath("//*[@id='Table5']/tbody/tr[3]/td[4]");
		By SLC_ChartNo=By.xpath("//*[@id='txtChart']");
		By TXT_ChartNo=By.xpath("//*[@id='txtChart']");
		By SLC_SSN=By.xpath("//*[@id='Table5']/tbody/tr[5]/td[2]");
		By TXT_SSN=By.xpath("//*[@id='txtSSN_SSNTel_text']");
		
		By SLC_HomeNo=By.xpath("//*[@id='Table5']/tbody/tr[6]/td[3]");
		By TXT_HomenO=By.xpath("//*[@id='txtHomePh_PhoneNumber_text']");
		
		By SLC_WorkNo=By.xpath("//*[@id='Table5']/tbody/tr[6]/td[5]");
		By TXT_WorkNo=By.xpath("//*[@id='txtWorkPh_PhoneNumber_text']");
		
		By SLC_CellNo=By.xpath("//*[@id='Table5']/tbody/tr[7]/td[3]");
		By TXT_CellNo=By.xpath("//*[@id='txtCellPh_PhoneNumber_text']");
		
		By SLC_DrivingLic=By.xpath("//*[@id='Table5']/tbody/tr[7]/td[5]]");
		By TXT_DrivingLic=By.xpath("//*[@id='txtDrvLic']");
		
		By SLC_Student=By.xpath("//*[@id='Table5']/tbody/tr[8]/td[5]");
		By TXT_Student=By.xpath("//*[@id='cmbStudent']");
		
		By SLC_MedId=By.xpath("//*[@id='Table5']/tbody/tr[8]/td[7]");
		By TXT_MedID=By.xpath("//*[@id='txtMedID']");
		
		By SLC_SchoolName=By.xpath("//*[@id='Table5']/tbody/tr[9]/td[5]");
		By TXT_SchoolName=By.xpath("//*[@id='txtSchName']");
		
		By SLC_EmergencyContact=By.xpath("//*[@id='Table5']/tbody/tr[10]/td[5]");
		By TXT_EmergencyContact=By.xpath("//*[@id='txtEmergencyContact']");
		
		By SLC_EmergencyPhone=By.xpath("//*[@id='Table5']/tbody/tr[10]/td[7]");
		By TXT_EmergencyPhone=By.xpath("//*[@id='txtEmergencyPhone_PhoneNumber_text']");
		
		By SLC_Office=By.xpath("//*[@id='Table5']/tbody/tr[11]/td[3]");
		By SLC_FeeSchedule=By.xpath("//*[@id='Table5']/tbody/tr[12]/td[3]");
		By TXT_FeeSchedule=By.xpath("//*[@id='ddlFeeSchedule']");
		
		By SLC_PrefProvider=By.xpath("//*[@id='Table5']/tbody/tr[13]/td[1]");
		By TXT_PrefProvider=By.xpath("//*[@id='PrefProvider_PrefProvider']");
		
		By SLC_PrefHygenist=By.xpath("//*[@id='Table5']/tbody/tr[14]/td[1]");
		By TXT_PrefHygenist=By.xpath("//*[@id='Hygienist_Hygienist']");
		
		By SLC_ReferralType=By.xpath("//*[@id='Table5']/tbody/tr[15]/td[1]");
		By TXT_ReferralType=By.xpath("//*[@id='ReferralType_ReferralType']");
		
		By SLC_ReferredBy=By.xpath("//*[@id='Table5']/tbody/tr[16]/td[1]");
		By TXT_ReferredBy=By.xpath("//*[@id='txtRefBy']");
		
		By SLC_ReferredTo=By.xpath("//*[@id='Table5']/tbody/tr[17]/td[1]");
		By TXT_ReferredTo=By.xpath("//*[@id='ReferralOut_ReferralOut']");
		
		By SLC_ReferedToDate=By.xpath("//*[@id='Table5']/tbody/tr[18]/td[5]");
		By TXT_ReferedToDate=By.xpath("//*[@id='txtRefOutDate']");
		
}
