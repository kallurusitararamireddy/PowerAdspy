package com.power.testcases;

import org.testng.annotations.Test;

import com.power.qa.base.TestBase;
import com.power.qa.pages.BasePage;
import com.power.qa.pages.DashboardPage;

public class Verify_Linkedin_Dashboard_Filters extends TestBase{
	
	@Test
	public void Verify_Linkedin_Filters () throws InterruptedException {
		//extent.createTest("Dashboard_test");		
		DashboardPage dp = new DashboardPage(getDriver());		
		dp.Linkedin_Search();
		
		
	}

}
