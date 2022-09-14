package com.power.testcases;

import org.testng.annotations.Test;

import com.power.qa.base.TestBase;
import com.power.qa.pages.DashboardPage;

public class Verify_Twitter_Dashboard_Filters extends TestBase {
	
	@Test
	public void Verify_Twitter_Filters () throws InterruptedException {
		//extent.createTest("Dashboard_test");		
		DashboardPage dp = new DashboardPage(getDriver());		
		dp.Twitter_Search();
		
		
	}

}
