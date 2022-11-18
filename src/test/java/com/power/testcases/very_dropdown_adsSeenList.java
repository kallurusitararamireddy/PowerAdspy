package com.power.testcases;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import com.power.qa.base.TestBase;
import com.power.qa.pages.adsSeenBetweenPage;

public class very_dropdown_adsSeenList extends TestBase {
	
	
	
	@Test
	public void test() throws InterruptedException {
	
		
		adsSeenBetweenPage ad=new adsSeenBetweenPage(getDriver());
	ad.getadSeenMethod();
	
	}
}
