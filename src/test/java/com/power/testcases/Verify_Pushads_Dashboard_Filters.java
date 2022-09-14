package com.power.testcases;

import org.testng.annotations.Test;

import com.power.qa.base.TestBase;
import com.power.qa.pages.DashboardPage;

public class Verify_Pushads_Dashboard_Filters extends TestBase {
	@Test
	public void Verify_Pushads_Filters () throws InterruptedException {
		//extent.createTest("Dashboard_test");		
		DashboardPage dp = new DashboardPage(getDriver());		
		dp.Pushad_Search();
		
		
	}

}
