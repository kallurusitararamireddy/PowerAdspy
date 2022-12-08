package com.power.testcases;

import java.util.Iterator;
import java.util.Set;

import org.testng.Reporter;
import org.testng.annotations.Test;

import com.power.qa.base.TestBase;
import com.power.qa.pages.Gdn_SortBy_VerificationPage;

public class Verify_Gdn_SortBy_TestScript extends TestBase {
@Test
public void Verify_Gdn_SortBy_TestScript () throws Exception 
{
	Gdn_SortBy_VerificationPage gdn_sortBy=new Gdn_SortBy_VerificationPage(getDriver());
	gdn_sortBy.Gdnpage();
	gdn_sortBy.Gdn_SortBy_Newest();
}

}
