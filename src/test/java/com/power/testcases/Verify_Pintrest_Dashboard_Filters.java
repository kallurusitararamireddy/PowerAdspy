package com.power.testcases;

import org.testng.annotations.Test;

import com.power.qa.base.TestBase;
import com.power.qa.pages.DashboardPage;

public class Verify_Pintrest_Dashboard_Filters extends TestBase{
	@Test
	public void Verify_Pintrest_Filters () throws InterruptedException {
		//extent.createTest("Dashboard_test");		
		DashboardPage dp = new DashboardPage(getDriver());		
		dp.Pintrest_Search();
		
		
	}

}
