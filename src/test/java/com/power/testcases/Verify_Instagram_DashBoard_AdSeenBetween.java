package com.power.testcases;

import org.testng.annotations.Test;

import com.power.qa.base.TestBase;
import com.power.qa.pages.InstagramDashBoard_AdSeenBetweenPage;

public class Verify_Instagram_DashBoard_AdSeenBetween extends TestBase{
	
	@Test
	public void verify_instagram_dasboard_adseenBetween() throws InterruptedException {

	InstagramDashBoard_AdSeenBetweenPage adsSeenBetween=new InstagramDashBoard_AdSeenBetweenPage(getDriver());
	adsSeenBetween.verify_instagram_dashboard_addSeenBetween();

  }
}
