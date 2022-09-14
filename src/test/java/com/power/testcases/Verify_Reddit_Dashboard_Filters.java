package com.power.testcases;

import org.testng.annotations.Test;

import com.power.qa.base.TestBase;
import com.power.qa.pages.DashboardPage;

public class Verify_Reddit_Dashboard_Filters extends TestBase {
	@Test
	public void Verify_Reddit_Filters () throws InterruptedException {
		//extent.createTest("Dashboard_test");		
		DashboardPage dp = new DashboardPage(getDriver());		
		dp.Reddit_Search();
		
		
	}

}
