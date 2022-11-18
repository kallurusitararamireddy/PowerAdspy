	package com.power.testcases;

import org.testng.annotations.Test;

import com.power.qa.base.TestBase;
import com.power.qa.pages.InstagramPostDateBetweenPage;

public class Verify_Instagram_DashBoard_PostDateBetween extends TestBase {

	@Test
	public void verify_Post_Date() throws InterruptedException{

		InstagramPostDateBetweenPage postDateBetween= new InstagramPostDateBetweenPage(getDriver());
		
		postDateBetween.getPostDateBetween();
	}
}
