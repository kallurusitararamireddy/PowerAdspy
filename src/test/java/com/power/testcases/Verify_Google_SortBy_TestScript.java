package com.power.testcases;

import org.testng.annotations.Test;

import com.power.qa.base.TestBase;
import com.power.qa.pages.Google_SortBy_VerificationPage;

public class Verify_Google_SortBy_TestScript extends TestBase {
@Test	
public void Verify_Google_SortBy_TestScript() throws Exception
{
	Google_SortBy_VerificationPage google_SortBy=new  Google_SortBy_VerificationPage(getDriver());
	google_SortBy.Googlepage();
	google_SortBy.Google_SortBy_Newest();
}
}
