package com.power.testcases;

import org.testng.annotations.Test;

import com.power.qa.base.TestBase;
import com.power.qa.pages.InstagramDashBoardSortByPage;

public class Verify_Instagram_DashBoard_SortBy extends TestBase{

	@Test()
	public void verify_Instagram_Sortby() throws InterruptedException {
		
		InstagramDashBoardSortByPage sortBy=new InstagramDashBoardSortByPage(getDriver());
		sortBy.verify_Instagram_Dasboard();
	}
}
