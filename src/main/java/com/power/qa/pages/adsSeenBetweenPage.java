package com.power.qa.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import org.testng.Reporter;

import com.power.qa.base.TestBase;
import com.power.qa.util.Helpers;

public class adsSeenBetweenPage extends BasePage {
	
	public adsSeenBetweenPage(WebDriver driver)  {
		super(TestBase.getDriver());
	}

	Helpers helper=new Helpers();	
	
	@FindBy(xpath = "//img[@class='active_pg_logo img-fluid']")
	WebElement Logo;
	
	@FindBy(id="fb_ads")
	WebElement faceBookModuleLink;

	
	@FindBy(xpath="//span[text()='Ad Seen Between :']/./following-sibling::div//span")
	WebElement adSeenDropDown;
	
	@FindBy(xpath="/html/body/div[8]")
	WebElement dropdoeun;
	
	@FindBy(xpath= "//*[@id=\"clear-filter\"]" )
	WebElement Input_SearchBy_DomainName;
	
	@FindBy(xpath="(//li[text()='Today'])[1]")
	WebElement allSeenTodayButton;
	
	@FindBy(xpath="//*[@id=\"search-ads\"]")
	WebElement searchButton;
	
	@FindBy(xpath="(//li[text()='Last Month'])[1]")
	WebElement lastMontButton;
	public void getadSeenMethod() throws InterruptedException {
		
		Reporter.log("<B><font color = 'orange'> Step1 -</font> Logged into PowerAdSpy Application");
		String Page_titel = driver.getTitle();
		System.out.println(Page_titel);
		Reporter.log("<B><font color = 'orange'> Step2 -</font> I am on the page :" + Page_titel);

		helper.waitForPageToLoad();
		helper.waitFor(Logo);
		helper.highLightElement(driver, Logo);
		Assert.assertTrue(Logo.isDisplayed(), "Power Ad Spy Logo is Dispalyed");
		Reporter.log("<B><font color = 'orange'> Step3 -</font> Power Ad Spy Logo is Displayed");
		
		helper.waitFor(faceBookModuleLink);
		helper.highLightElement(driver, faceBookModuleLink);
		helper.jsCLick(faceBookModuleLink);
		Assert.assertTrue(faceBookModuleLink.isDisplayed(), "facebook Module is clicked");
		Reporter.log("<B><font color = 'orange'> Step 4 -</font> Power Ad Spy facebook Module is Dispalyed");
		
	
		/*helper.waitForPageToLoad();
		helper.waitFor(adSeenDropDown);
		helper.highLightElement(driver, adSeenDropDown);
		helper.jsCLick(adSeenDropDown);
		
	
			helper.waitFor(allSeenTodayButton);
			helper.highLightElement(driver, allSeenTodayButton);
			helper.jsCLick(allSeenTodayButton);

			helper.waitFor(searchButton);
			helper.highLightElement(driver, searchButton);
			helper.jsCLick(searchButton);
		
			helper.waitFor(Input_SearchBy_DomainName);
			helper.highLightElement(driver, Input_SearchBy_DomainName);
			helper.jsCLick(Input_SearchBy_DomainName);
			
			helper.waitFor(adSeenDropDown);
			helper.highLightElement(driver, adSeenDropDown);
			helper.jsCLick(adSeenDropDown);
			
			helper.waitFor(lastMontButton);
			helper.highLightElement(driver, lastMontButton);
			helper.jsCLick(lastMontButton);
	
			helper.waitFor(searchButton);
			helper.highLightElement(driver, searchButton);
			helper.jsCLick(searchButton);
		
		
			
			helper.waitFor(Input_SearchBy_DomainName);
			helper.highLightElement(driver, Input_SearchBy_DomainName);
			helper.jsCLick(Input_SearchBy_DomainName);
		
		*/
		
		
	}
	
	
	
}


