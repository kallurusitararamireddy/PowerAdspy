package com.power.testcases;

import org.testng.annotations.Test;

import com.power.qa.base.TestBase;
import com.power.qa.pages.QuoraDashBoard_SortByPage;

public class Verify_Quora_DashBoard_SortByTest extends TestBase {

	@Test
	public void verify_Quora_Dashboard() throws InterruptedException {
		QuoraDashBoard_SortByPage quora=new QuoraDashBoard_SortByPage(getDriver());
		quora.verify_Quora_Dashboard();
	}
	
}
