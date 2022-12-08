package com.power.testcases;

import org.testng.annotations.Test;

import com.power.qa.base.TestBase;
import com.power.qa.pages.PinterestDashBoard_SortByPage;

public class Verify_Pinterest_DashBoard_SortByTest extends TestBase{

	@Test
	public void verify_Pinterest_SortBy() throws InterruptedException {
		PinterestDashBoard_SortByPage pinterest=new PinterestDashBoard_SortByPage(getDriver());
		pinterest.verify_pinterest_Dashboard();
	}
}
