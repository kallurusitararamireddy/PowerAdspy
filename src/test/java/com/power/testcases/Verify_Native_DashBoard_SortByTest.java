package com.power.testcases;

import org.testng.annotations.Test;

import com.power.qa.base.TestBase;
import com.power.qa.pages.NativeDashboard_SortByPage;

public class Verify_Native_DashBoard_SortByTest extends TestBase{

	@Test
	public void verify_Native_Sortby() throws InterruptedException {
		
		NativeDashboard_SortByPage nativeLink=new NativeDashboard_SortByPage(getDriver());
		nativeLink.verify_Native_Dashboard();
	}
}
