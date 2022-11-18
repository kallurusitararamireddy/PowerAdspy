package com.power.testcases;

import org.testng.annotations.Test;

import com.power.qa.base.TestBase;
import com.power.qa.pages.Facebook_Domain_Registration_Date_Verification_Page;

public class Verify_Facebook_Domain_Registration_Date_TestScript extends TestBase
{
	@Test
	public void Facebook_Domain_Registration_Date_TestScript() throws Exception
	{
		Facebook_Domain_Registration_Date_Verification_Page DomainRegDV=new Facebook_Domain_Registration_Date_Verification_Page(getDriver());
		DomainRegDV.FacebookPage();
	//	DomainRegDV.DomainRegistrationDate_All();
	//	DomainRegDV.DomainRegistrationDate_Today();
		DomainRegDV.DomainRegistrationDate_yesterday();
	//	DomainRegDV.DomainRegistrationDate_Last_7_Days();
		
	}
}
