package com.power.testcases;

import org.testng.annotations.Test;

import com.power.qa.base.TestBase;
import com.power.qa.pages.Reddit_SortBy_VerificationPage;

public class Verify_Reddit_SortBy_TestScript extends TestBase {

	@Test
	public void Verify_Reddit_SortBy_TestScript () throws Exception {
		
		Reddit_SortBy_VerificationPage RedditSortBy = new Reddit_SortBy_VerificationPage(getDriver());
		RedditSortBy.Redditpage();
		RedditSortBy.Reddit_SortBy_Newest();
		
	}
}
