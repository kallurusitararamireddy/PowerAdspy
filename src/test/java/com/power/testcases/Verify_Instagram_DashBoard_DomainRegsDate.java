package com.power.testcases;

import org.testng.annotations.Test;

import com.power.qa.base.TestBase;
import com.power.qa.pages.InstagramDomainRegistrationDatePage;

public class Verify_Instagram_DashBoard_DomainRegsDate extends TestBase {

	@Test
	public void verify_domain_Regs_Date() throws InterruptedException {
		InstagramDomainRegistrationDatePage domainRegsDate=new InstagramDomainRegistrationDatePage(getDriver());
		domainRegsDate.getDomainRegsDate();
	}
}
