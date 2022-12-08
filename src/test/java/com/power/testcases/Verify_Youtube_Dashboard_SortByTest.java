package com.power.testcases;

import org.testng.annotations.Test;

import com.power.qa.base.TestBase;
import com.power.qa.pages.youtubeDashboard_SortByPage;

public class Verify_Youtube_Dashboard_SortByTest extends TestBase{

	@Test
	public void verify_sortby_Page() throws InterruptedException {
		
		youtubeDashboard_SortByPage youtube=new youtubeDashboard_SortByPage(getDriver());
		youtube.verify_youtube_Dashboard();
	}
}
