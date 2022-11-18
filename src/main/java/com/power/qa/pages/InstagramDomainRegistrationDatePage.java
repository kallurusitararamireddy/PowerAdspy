package com.power.qa.pages;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import org.testng.Reporter;

import com.power.qa.base.TestBase;
import com.power.qa.util.Helpers;

public class InstagramDomainRegistrationDatePage extends BasePage{


		
	public  InstagramDomainRegistrationDatePage(WebDriver driver) {
		super(TestBase.getDriver());
		
	}

		Helpers helper=new Helpers();

		@FindBy(xpath = "//img[@class='active_pg_logo img-fluid']")
		WebElement Logo;

		@FindBy(css = "a#insta_ads > img")
		WebElement Instagram;
		
		@FindBy(xpath="//a[@id='clear-filter']")
		WebElement clearSearchField;
		
		@FindBy(id="search-ads")
		WebElement search_bar;
		
		@FindBy(id="totaladscount")
		WebElement toatal_Count_Ads;
		
		@FindBy(xpath="//div[@id='domain_ads_timepicker']")
		WebElement domain_Reg_Date_DropDown;
		
		@FindBy(xpath="(//li[text()='All'])[3]")
		WebElement domain_Reg_Date_All;
		
		@FindBy(xpath="//div[@class='ad_date']")
		WebElement current_Image_Date;
		
		@FindBy(xpath="//a[text()='Show Analytics']")
		WebElement showAnalytics_Button;
		
		@FindBy(xpath="//div[@id='last_seen1']")
		WebElement Last_Seen_childWindow;
		
		@FindBy(xpath="//div[@id='domain_date']")
		WebElement domain_reg_Date;
		
		@FindBy(xpath="(//li[text()='Today'])[3]")
		WebElement domain_Reg_Date_Today;
		
		@FindBy(xpath="(//li[text()='Yesterday'])[3]")
		WebElement domain_Reg_Date_Yesterday;
		
		@FindBy(xpath="(//li[text()='Last Seven Days'])[3]")
		WebElement domain_Reg_Date_LastSevenDays;
		
		@FindBy(xpath="(//li[text()='Last Thirty Days'])[3]")
		WebElement domain_Reg_Date_LastThirtyDays;
		
		@FindBy(xpath="(//li[text()='This Month'])[3]")
		WebElement domain_Reg_Date_ThisMonth;
		
		@FindBy(xpath="(//li[text()='Last Month'])[3]")
		WebElement domain_Reg_Date_LastMonth;
		
		@FindBy(xpath="(//li[text()='Custom Range'])[3]")
		WebElement domain_Reg_Date_Custom;
		
		@FindBy(xpath="//td[text()='1']")
		WebElement custom_startDate;
		
		@FindBy(xpath="//td[text()='15']")
		WebElement custom_endDate;
		
		public void getDomainRegsDate() throws InterruptedException {
			
			Reporter.log("<B><font color = 'orange'> Step1 -</font> Logged into PowerAdSpy Application");
			String Page_titel = driver.getTitle();
			System.out.println(Page_titel);
			Reporter.log("<B><font color = 'orange'> Step2 -</font> I am on the page :" + Page_titel);

			helper.waitForPageToLoad();
			helper.waitFor(Logo);
			helper.highLightElement(driver, Logo);
			Assert.assertTrue(Logo.isDisplayed(), "Power Ad Spy Logo is Dispalyed");
			Reporter.log("<B><font color = 'orange'> Step3 -</font> Power Ad Spy Logo is Displayed");
			
			helper.waitFor(Instagram);
			helper.highLightElement(driver, Instagram);
			Instagram.click();
			Assert.assertTrue(Instagram.isDisplayed(), "Clicked on Instagram ");
			Reporter.log("<B><font color = 'orange'> Step4 -</font> Clicked On Instagram Icon");
			helper.waitForPageToLoad();
			
			//ALL
			
			Reporter.log("<B><font color = 'green'> Domain Registration Date : All -</font> ");
			
		    helper.waitFor(clearSearchField);
			helper.highLightElement(driver, clearSearchField);
			helper.jsCLick(clearSearchField);
			Reporter.log("<B><font color = 'orange'> Step 1 -</font> Clicked On clear search.");
			
		    helper.waitFor(domain_Reg_Date_DropDown);
			helper.highLightElement(driver, domain_Reg_Date_DropDown);
			helper.jsCLick(domain_Reg_Date_DropDown);
			Reporter.log("<B><font color = 'orange'> Step 2 -</font> Clicked On Domain Registration Date DropDown.");
			
			helper.waitFor(domain_Reg_Date_All);
			helper.highLightElement(driver, domain_Reg_Date_All);
			helper.jsCLick(domain_Reg_Date_All);
			Reporter.log("<B><font color = 'orange'> Step 3 -</font> Clicked On Domain Registration Date All.");
			
			helper.waitFor(search_bar);
			helper.highLightElement(driver, search_bar);
			helper.jsCLick(search_bar);
			Reporter.log("<B><font color = 'orange'> Step 4 -</font> Clicked On Search Bar.");
			helper.waitForPageToLoad();
			
			helper.waitFor(toatal_Count_Ads);
			helper.highLightElement(driver, toatal_Count_Ads);
			helper.jsCLick(toatal_Count_Ads);
			String Total_Ads_Count_All=toatal_Count_Ads.getText();
			Reporter.log("<B><font color = 'orange'> Step 5 -</font> Total_Ads_Count_All= " + Total_Ads_Count_All);
			
			helper.waitFor(current_Image_Date);
			try {
			helper.highLightElement(driver, current_Image_Date);
			String imageDate = current_Image_Date.getText();
			helper.jsCLick(current_Image_Date);
			Reporter.log("<B><font color = 'orange'> Step 6 -</font> Clicked On Current Image Date = " + imageDate);

			helper.waitFor(showAnalytics_Button);
			helper.highLightElement(driver, showAnalytics_Button);
			helper.jsCLick(showAnalytics_Button);
			Reporter.log("<B><font color = 'orange'> Step 7 -</font> Clicked On ShowAnalytics Button.");

			Set<String> S1=driver.getWindowHandles();
		    Iterator<String>it=S1.iterator();
		    String parent=it.next();
		    String child=it.next();
		    
		    driver.switchTo().window(child);
		    
		    helper.waitForPageToLoad();
		    helper.waitFor(Last_Seen_childWindow);
		    helper.highLightElement(driver, Last_Seen_childWindow);
		    String lastSeenDate = Last_Seen_childWindow.getText();
		    Reporter.log("<B><font color = 'orange'> Step 8 -</font> LastScene_date AdDetails Page= " +  lastSeenDate);
			
		    helper.waitForPageToLoad();
		    helper.waitFor(domain_reg_Date);
		    helper.highLightElement(driver, domain_reg_Date);
		    String domainRegDate = domain_reg_Date.getText();
		    Reporter.log("<B><font color = 'orange'> Step 9 -</font> Domain Registration Date in AdDetails Page= " +  domainRegDate);
		    
		    driver.close();
		    
		    driver.switchTo().window(parent);
		    
		    String joinString = null;
			//	String[] actualDate = null;
				
				String[] splitString = lastSeenDate.split(" ");
				for(int i=0;i<splitString.length-2;i++) {
					String actualDate=splitString[i]; 
					joinString= splitString[i+1]+" "+ splitString[i]+" " + splitString[i+2];
				//	System.out.println("splitString : " + splitString[i]);
					System.out.println("lastseen Date in Newest: " + joinString);
				}
			Assert.assertEquals(imageDate, joinString);
			Reporter.log("<B><font color = 'orange'> Step 10 -</font> Image Date = "+" "+imageDate+"    ::    " + "Last Seeen Date = "+joinString+" "+" are same == PASS");
			}
			catch (Exception e) {
		    	 Reporter.log("<B><font color = 'orange'> Step 6 -</font> Oops! Looks like we don't have data for this search criteria yet.");
			}
			
			//Today
			Reporter.log("<B><font color = 'green'> Domain Registration Date : Today -</font> ");
			
		    helper.waitFor(clearSearchField);
			helper.highLightElement(driver, clearSearchField);
			helper.jsCLick(clearSearchField);
			Reporter.log("<B><font color = 'orange'> Step 1 -</font> Clicked On clear search.");
			
		    helper.waitFor(domain_Reg_Date_DropDown);
			helper.highLightElement(driver, domain_Reg_Date_DropDown);
			helper.jsCLick(domain_Reg_Date_DropDown);
			Reporter.log("<B><font color = 'orange'> Step 2 -</font> Clicked On Domain Registration Date DropDown.");
			
			helper.waitFor(domain_Reg_Date_Today);
			helper.highLightElement(driver, domain_Reg_Date_Today);
			helper.jsCLick(domain_Reg_Date_Today);
			Reporter.log("<B><font color = 'orange'> Step 3 -</font> Clicked On Domain Registration Date Today.");
			
			helper.waitFor(search_bar);
			helper.highLightElement(driver, search_bar);
			helper.jsCLick(search_bar);
			Reporter.log("<B><font color = 'orange'> Step 4 -</font> Clicked On Search Bar.");
			helper.waitForPageToLoad();
			
			helper.waitFor(toatal_Count_Ads);
			helper.highLightElement(driver, toatal_Count_Ads);
			helper.jsCLick(toatal_Count_Ads);
			String Total_Ads_Count_Today=toatal_Count_Ads.getText();
			Reporter.log("<B><font color = 'orange'> Step 5 -</font> Total_Ads_Count_Today= " + Total_Ads_Count_Today);
			
			helper.waitFor(current_Image_Date);
			try {
			helper.highLightElement(driver, current_Image_Date);
			String imageDate = current_Image_Date.getText();
			helper.jsCLick(current_Image_Date);
			Reporter.log("<B><font color = 'orange'> Step 6 -</font> Clicked On Current Image Date = " + imageDate);

			helper.waitFor(showAnalytics_Button);
			helper.highLightElement(driver, showAnalytics_Button);
			helper.jsCLick(showAnalytics_Button);
			Reporter.log("<B><font color = 'orange'> Step 7 -</font> Clicked On ShowAnalytics Button.");

			Set<String> S1=driver.getWindowHandles();
		    Iterator<String>it=S1.iterator();
		    String parent=it.next();
		    String child=it.next();
		    
		    driver.switchTo().window(child);
		    
		    helper.waitForPageToLoad();
		    helper.waitFor(Last_Seen_childWindow);
		    helper.highLightElement(driver, Last_Seen_childWindow);
		    String lastSeenDate = Last_Seen_childWindow.getText();
		    Reporter.log("<B><font color = 'orange'> Step 8 -</font> LastScene_date AdDetails Page= " +  lastSeenDate);
			
		    helper.waitForPageToLoad();
		    helper.waitFor(domain_reg_Date);
		    helper.highLightElement(driver, domain_reg_Date);
		    String domainRegDate = domain_reg_Date.getText();
		    Reporter.log("<B><font color = 'orange'> Step 9 -</font> Domain Registration Date in AdDetails Page= " +  domainRegDate);
		    
		    driver.close();
			
		    
		    driver.switchTo().window(parent);
		    
		    String joinString = null;
			//	String[] actualDate = null;
				
				String[] splitString = domainRegDate.split(" ");
				for(int i=0;i<splitString.length-2;i++) {
					String actualDate=splitString[i]; 
					joinString= splitString[i+1]+" "+ splitString[i]+" " + splitString[i+2];
				//	System.out.println("splitString : " + splitString[i]);
					System.out.println("lastseen Date in Newest: " + joinString);
				}
			Assert.assertEquals(imageDate, joinString);
			Reporter.log("<B><font color = 'orange'> Step 10 -</font> Image Date = "+" "+imageDate+"    ::    " + "Last Seeen Date = "+joinString+" "+" are same == PASS");
			}
			catch (Exception e) {
		    	 Reporter.log("<B><font color = 'orange'> Step 6 -</font> Oops! Looks like we don't have data for this search criteria yet.");
			}
			
			//Yesterday
			
			Reporter.log("<B><font color = 'green'> Domain Registration Date : Yesterday -</font> ");
			
		    helper.waitFor(clearSearchField);
			helper.highLightElement(driver, clearSearchField);
			helper.jsCLick(clearSearchField);
			Reporter.log("<B><font color = 'orange'> Step 1 -</font> Clicked On clear search.");
			
		    helper.waitFor(domain_Reg_Date_DropDown);
			helper.highLightElement(driver, domain_Reg_Date_DropDown);
			helper.jsCLick(domain_Reg_Date_DropDown);
			Reporter.log("<B><font color = 'orange'> Step 2 -</font> Clicked On Domain Registration Date DropDown.");
			
			helper.waitFor(domain_Reg_Date_Yesterday);
			helper.highLightElement(driver, domain_Reg_Date_Yesterday);
			helper.jsCLick(domain_Reg_Date_Yesterday);
			Reporter.log("<B><font color = 'orange'> Step 3 -</font> Clicked On Domain Registration Date Yesterday.");
			
			helper.waitFor(search_bar);
			helper.highLightElement(driver, search_bar);
			helper.jsCLick(search_bar);
			Reporter.log("<B><font color = 'orange'> Step 4 -</font> Clicked On Search Bar.");
			helper.waitForPageToLoad();
			
			helper.waitFor(toatal_Count_Ads);
			helper.highLightElement(driver, toatal_Count_Ads);
			helper.jsCLick(toatal_Count_Ads);
			String Total_Ads_Count_Yesterday=toatal_Count_Ads.getText();
			Reporter.log("<B><font color = 'orange'> Step 5 -</font> Total_Ads_Count_All= " + Total_Ads_Count_Yesterday);
			
			helper.waitFor(current_Image_Date);
			try {
			helper.highLightElement(driver, current_Image_Date);
			String imageDate = current_Image_Date.getText();
			helper.jsCLick(current_Image_Date);
			Reporter.log("<B><font color = 'orange'> Step 6 -</font> Clicked On Current Image Date.");

			helper.waitFor(showAnalytics_Button);
			helper.highLightElement(driver, showAnalytics_Button);
			helper.jsCLick(showAnalytics_Button);
			Reporter.log("<B><font color = 'orange'> Step 7 -</font> Clicked On ShowAnalytics Button.");

			Set<String> S1=driver.getWindowHandles();
		    Iterator<String>it=S1.iterator();
		    String parent=it.next();
		    String child=it.next();
		    
		    driver.switchTo().window(child);
		    
		    helper.waitForPageToLoad();
		    helper.waitFor(Last_Seen_childWindow);
		    helper.highLightElement(driver, Last_Seen_childWindow);
		    String lastSeenDate = Last_Seen_childWindow.getText();
		    Reporter.log("<B><font color = 'orange'> Step 8 -</font> LastScene_date AdDetails Page= " +  lastSeenDate);
			
		    helper.waitForPageToLoad();
		    helper.waitFor(domain_reg_Date);
		    helper.highLightElement(driver, domain_reg_Date);
		    String domainRegDate = domain_reg_Date.getText();
		    Reporter.log("<B><font color = 'orange'> Step 9 -</font> Domain Registration Date in AdDetails Page= " +  domainRegDate);
		    
		    
		    driver.close();
			
		    driver.switchTo().window(parent);
		    
		    String joinString = null;
			//	String[] actualDate = null;
				
				String[] splitString = domainRegDate.split(" ");
				for(int i=0;i<splitString.length-2;i++) {
					String actualDate=splitString[i]; 
					joinString= splitString[i+1]+" "+ splitString[i]+" " + splitString[i+2];
				//	System.out.println("splitString : " + splitString[i]);
					System.out.println("lastseen Date in Newest: " + joinString);
				}
			Assert.assertEquals(imageDate, joinString);
			Reporter.log("<B><font color = 'orange'> Step 10 -</font> Image Date = "+" "+imageDate+"    ::    " + "Last Seeen Date = "+joinString+" "+" are same == PASS");
			}
			catch (Exception e) {
		    	 Reporter.log("<B><font color = 'orange'> Step 6 -</font> Oops! Looks like we don't have data for this search criteria yet.");
			}
			
			//Last Seven Days
			
			Reporter.log("<B><font color = 'green'> Domain Registration Date : Last Seven Days -</font> ");
			
		    helper.waitFor(clearSearchField);
			helper.highLightElement(driver, clearSearchField);
			helper.jsCLick(clearSearchField);
			Reporter.log("<B><font color = 'orange'> Step 1 -</font> Clicked On clear search.");
			
		    helper.waitFor(domain_Reg_Date_DropDown);
			helper.highLightElement(driver, domain_Reg_Date_DropDown);
			helper.jsCLick(domain_Reg_Date_DropDown);
			Reporter.log("<B><font color = 'orange'> Step 2 -</font> Clicked On Domain Registration Date DropDown.");
			
			helper.waitFor(domain_Reg_Date_LastSevenDays);
			helper.highLightElement(driver, domain_Reg_Date_LastSevenDays);
			helper.jsCLick(domain_Reg_Date_LastSevenDays);
			Reporter.log("<B><font color = 'orange'> Step 3 -</font> Clicked On Domain Registration Date Last Seven Days.");
			
			helper.waitFor(search_bar);
			helper.highLightElement(driver, search_bar);
			helper.jsCLick(search_bar);
			Reporter.log("<B><font color = 'orange'> Step 4 -</font> Clicked On Search Bar.");
			
			helper.waitForPageToLoad();
			
			helper.waitFor(toatal_Count_Ads);
			helper.highLightElement(driver, toatal_Count_Ads);
			helper.jsCLick(toatal_Count_Ads);
			String Total_Ads_Count_LastSevenDays=toatal_Count_Ads.getText();
			Reporter.log("<B><font color = 'orange'> Step 5 -</font> Total_Ads_Count_LastSevenDays= " + Total_Ads_Count_LastSevenDays);
			
			
			helper.waitFor(current_Image_Date);
			try {
			helper.highLightElement(driver, current_Image_Date);
			helper.jsCLick(current_Image_Date);
			Reporter.log("<B><font color = 'orange'> Step 6 -</font> Clicked On Current Image Date.");

			helper.waitFor(showAnalytics_Button);
			helper.highLightElement(driver, showAnalytics_Button);
			helper.jsCLick(showAnalytics_Button);
			Reporter.log("<B><font color = 'orange'> Step 7 -</font> Clicked On ShowAnalytics Button.");

			Set<String> S1=driver.getWindowHandles();
		    Iterator<String>it=S1.iterator();
		    String parent=it.next();
		    String child=it.next();
		    
		    driver.switchTo().window(child);
			
		    helper.waitForPageToLoad();
		    helper.waitFor(domain_reg_Date);
		    helper.highLightElement(driver, domain_reg_Date);
		    String domainRegDate = domain_reg_Date.getText();
		    Reporter.log("<B><font color = 'orange'> Step 8 -</font> Domain Registration Date in AdDetails Page= " +  domainRegDate);
		    
		    
		    driver.close();
			
		    driver.switchTo().window(parent);
			}
			catch (Exception e) {
		    	 Reporter.log("<B><font color = 'orange'> Step 6 -</font> Oops! Looks like we don't have data for this search criteria yet.");
			}
			
			//Last Thirty Days
			
			
			Reporter.log("<B><font color = 'green'> Domain Registration Date : Last Thirty Days -</font> ");
			
		    helper.waitFor(clearSearchField);
			helper.highLightElement(driver, clearSearchField);
			helper.jsCLick(clearSearchField);
			Reporter.log("<B><font color = 'orange'> Step 1 -</font> Clicked On clear search.");
			
		    helper.waitFor(domain_Reg_Date_DropDown);
			helper.highLightElement(driver, domain_Reg_Date_DropDown);
			helper.jsCLick(domain_Reg_Date_DropDown);
			Reporter.log("<B><font color = 'orange'> Step 2 -</font> Clicked On Domain Registration Date DropDown.");
			
			helper.waitFor(domain_Reg_Date_LastThirtyDays);
			helper.highLightElement(driver, domain_Reg_Date_LastThirtyDays);
			helper.jsCLick(domain_Reg_Date_LastThirtyDays);
			Reporter.log("<B><font color = 'orange'> Step 3 -</font> Clicked On Domain Registration Date Last Thirty Days.");
			
			helper.waitFor(search_bar);
			helper.highLightElement(driver, search_bar);
			helper.jsCLick(search_bar);
			Reporter.log("<B><font color = 'orange'> Step 4 -</font> Clicked On Search Bar.");
			
			helper.waitFor(toatal_Count_Ads);
			helper.highLightElement(driver, toatal_Count_Ads);
			helper.jsCLick(toatal_Count_Ads);
			String Total_Ads_Count_LastThirtyDays=toatal_Count_Ads.getText();
			Reporter.log("<B><font color = 'orange'> Step 5 -</font> Total_Ads_Count_LastThirtyDays= " + Total_Ads_Count_LastThirtyDays);
			helper.waitForPageToLoad();
			
			helper.waitFor(current_Image_Date);
			try {
			helper.highLightElement(driver, current_Image_Date);
			helper.jsCLick(current_Image_Date);
			Reporter.log("<B><font color = 'orange'> Step 6 -</font> Clicked On Current Image Date.");

			helper.waitFor(showAnalytics_Button);
			helper.highLightElement(driver, showAnalytics_Button);
			helper.jsCLick(showAnalytics_Button);
			Reporter.log("<B><font color = 'orange'> Step 7 -</font> Clicked On ShowAnalytics Button.");

			Set<String> S1=driver.getWindowHandles();
		    Iterator<String>it=S1.iterator();
		    String parent=it.next();
		    String child=it.next();
		    
		    driver.switchTo().window(child);
			
		    helper.waitForPageToLoad();
		    helper.waitFor(domain_reg_Date);
		    helper.highLightElement(driver, domain_reg_Date);
		    String domainRegDate = domain_reg_Date.getText();
		    Reporter.log("<B><font color = 'orange'> Step 8 -</font> Domain Registration Date in AdDetails Page= " +  domainRegDate);
		    
		    driver.close();
			
		    driver.switchTo().window(parent);
			}
			catch (Exception e) {
		    	 Reporter.log("<B><font color = 'orange'> Step 6 -</font> Oops! Looks like we don't have data for this search criteria yet.");
			}
			
			//This Month
			
			
			Reporter.log("<B><font color = 'green'> Domain Registration Date : This Month -</font> ");
			
		    helper.waitFor(clearSearchField);
			helper.highLightElement(driver, clearSearchField);
			helper.jsCLick(clearSearchField);
			Reporter.log("<B><font color = 'orange'> Step 1 -</font> Clicked On clear search.");
			
		    helper.waitFor(domain_Reg_Date_DropDown);
			helper.highLightElement(driver, domain_Reg_Date_DropDown);
			helper.jsCLick(domain_Reg_Date_DropDown);
			Reporter.log("<B><font color = 'orange'> Step 2 -</font> Clicked On Domain Registration Date DropDown.");
			
			helper.waitFor(domain_Reg_Date_ThisMonth);
			helper.highLightElement(driver, domain_Reg_Date_ThisMonth);
			helper.jsCLick(domain_Reg_Date_ThisMonth);
			Reporter.log("<B><font color = 'orange'> Step 3 -</font> Clicked On Domain Registration Date This Month.");
			
			helper.waitFor(search_bar);
			helper.highLightElement(driver, search_bar);
			helper.jsCLick(search_bar);
			Reporter.log("<B><font color = 'orange'> Step 4 -</font> Clicked On Search Bar.");
			
			helper.waitForPageToLoad();
			
			helper.waitFor(toatal_Count_Ads);
			helper.highLightElement(driver, toatal_Count_Ads);
			helper.jsCLick(toatal_Count_Ads);
			String Total_Ads_Count_ThisMonth=toatal_Count_Ads.getText();
			Reporter.log("<B><font color = 'orange'> Step 5 -</font> Total_Ads_Count_ThisMonth= " + Total_Ads_Count_ThisMonth);
			
			
			helper.waitFor(current_Image_Date);
			try {
			helper.highLightElement(driver, current_Image_Date);
			helper.jsCLick(current_Image_Date);
			Reporter.log("<B><font color = 'orange'> Step 6 -</font> Clicked On Current Image Date.");

			helper.waitFor(showAnalytics_Button);
			helper.highLightElement(driver, showAnalytics_Button);
			helper.jsCLick(showAnalytics_Button);
			Reporter.log("<B><font color = 'orange'> Step 7 -</font> Clicked On ShowAnalytics Button.");

			Set<String> S1=driver.getWindowHandles();
		    Iterator<String>it=S1.iterator();
		    String parent=it.next();
		    String child=it.next();
		    
		    driver.switchTo().window(child);
			
		    helper.waitForPageToLoad();
		    helper.waitFor(domain_reg_Date);
		    helper.highLightElement(driver, domain_reg_Date);
		    String domainRegDate = domain_reg_Date.getText();
		    Reporter.log("<B><font color = 'orange'> Step 8 -</font> Domain Registration Date in AdDetails Page= " +  domainRegDate);
		    
		    
		    driver.close();
			
		    driver.switchTo().window(parent);
			}
			catch (Exception e) {
		    	 Reporter.log("<B><font color = 'orange'> Step 6 -</font> Oops! Looks like we don't have data for this search criteria yet.");
			}
			
			//Last Month
			
			Reporter.log("<B><font color = 'green'> Domain Registration Date : Last Month -</font> ");
			
		    helper.waitFor(clearSearchField);
			helper.highLightElement(driver, clearSearchField);
			helper.jsCLick(clearSearchField);
			Reporter.log("<B><font color = 'orange'> Step 1 -</font> Clicked On clear search.");
			
		    helper.waitFor(domain_Reg_Date_DropDown);
			helper.highLightElement(driver, domain_Reg_Date_DropDown);
			helper.jsCLick(domain_Reg_Date_DropDown);
			Reporter.log("<B><font color = 'orange'> Step 2 -</font> Clicked On Domain Registration Date DropDown.");
			
			helper.waitFor(domain_Reg_Date_LastMonth);
			helper.highLightElement(driver, domain_Reg_Date_LastMonth);
			helper.jsCLick(domain_Reg_Date_LastMonth);
			Reporter.log("<B><font color = 'orange'> Step 3 -</font> Clicked On Domain Registration Date Last Month.");
			
			helper.waitFor(search_bar);
			helper.highLightElement(driver, search_bar);
			helper.jsCLick(search_bar);
			Reporter.log("<B><font color = 'orange'> Step 4 -</font> Clicked On Search Bar.");
			
			helper.waitFor(toatal_Count_Ads);
			helper.highLightElement(driver, toatal_Count_Ads);
			helper.jsCLick(toatal_Count_Ads);
			String Total_Ads_Count_LastMonth=toatal_Count_Ads.getText();
			Reporter.log("<B><font color = 'orange'> Step 5 -</font> Total_Ads_Count_LastMonth= " + Total_Ads_Count_LastMonth);
			helper.waitForPageToLoad();
			
			helper.waitFor(current_Image_Date);
			try {
			helper.highLightElement(driver, current_Image_Date);
			helper.jsCLick(current_Image_Date);
			Reporter.log("<B><font color = 'orange'> Step 6 -</font> Clicked On Current Image Date.");

			helper.waitFor(showAnalytics_Button);
			helper.highLightElement(driver, showAnalytics_Button);
			helper.jsCLick(showAnalytics_Button);
			Reporter.log("<B><font color = 'orange'> Step 7 -</font> Clicked On ShowAnalytics Button.");

			Set<String> S1=driver.getWindowHandles();
		    Iterator<String>it=S1.iterator();
		    String parent=it.next();
		    String child=it.next();
		    
		    driver.switchTo().window(child);
			
		    helper.waitForPageToLoad();
		    helper.waitFor(domain_reg_Date);
		    helper.highLightElement(driver, domain_reg_Date);
		    String domainRegDate = domain_reg_Date.getText();
		    Reporter.log("<B><font color = 'orange'> Step 8 -</font> Domain Registration Date in AdDetails Page= " +  domainRegDate);
		    
		    
		    driver.close();
			
		    driver.switchTo().window(parent);
			}
			catch (Exception e) {
		    	 Reporter.log("<B><font color = 'orange'> Step 6 -</font> Oops! Looks like we don't have data for this search criteria yet.");
			}
			
			//Custom
			
			 Reporter.log("<B><font color = 'green'> Domain Registration Date :Custom Range -</font> ");
			  
			    helper.waitFor(clearSearchField);
				helper.highLightElement(driver, clearSearchField);
				helper.jsCLick(clearSearchField);
				Reporter.log("<B><font color = 'orange'> Step 1 -</font> Clicked On clear search.");
				
				helper.waitFor(domain_Reg_Date_DropDown);
				helper.highLightElement(driver, domain_Reg_Date_DropDown);
				domain_Reg_Date_DropDown.click();
				Reporter.log("<B><font color = 'orange'> Step 2 -</font> Clicked On Domain Registration Date DropDown.");
			    
				helper.waitFor(domain_Reg_Date_Custom);
				helper.highLightElement(driver, domain_Reg_Date_Custom);
				helper.jsCLick(domain_Reg_Date_Custom);
				Reporter.log("<B><font color = 'orange'> Step 3 -</font> Clicked On Custom in Domain Registration Date.");
				helper.waitForPageToLoad();
				
				helper.waitFor(custom_startDate);
				helper.highLightElement(driver, custom_startDate);
//				helper.jsCLick(custom_startDate);
				custom_startDate.click(); 
				Reporter.log("<B><font color = 'orange'> Step 4 -</font> Clicked On custom_startDate in Ads Seen Between.");
				helper.waitForPageToLoad();

				helper.waitFor(custom_endDate);
				helper.highLightElement(driver, custom_endDate);
//				helper.jsCLick(custom_endDate);
				custom_endDate.click();
				Reporter.log("<B><font color = 'orange'> Step 5 -</font> Clicked On custom_endDate in Ads Seen Between.");
				
				helper.waitFor(search_bar);
				helper.highLightElement(driver, search_bar);
				helper.jsCLick(search_bar);
				Reporter.log("<B><font color = 'orange'> Step 6 -</font> Clicked On Search Bar.");
				helper.waitForPageToLoad();
				
				helper.waitFor(toatal_Count_Ads);
				helper.highLightElement(driver, toatal_Count_Ads);
				helper.jsCLick(toatal_Count_Ads);
				String Total_Ads_Count_Custom=toatal_Count_Ads.getText();
				Reporter.log("<B><font color = 'orange'> Step7 -</font> Total_Ads_Count_Custom= " + Total_Ads_Count_Custom);
				helper.waitForPageToLoad();
				
			    helper.waitFor(current_Image_Date);
			    try {
				helper.highLightElement(driver, current_Image_Date);
				String current_Date_custom_Date = current_Image_Date.getText();
				System.out.println("current_Date_All : " + current_Date_custom_Date);
				Reporter.log("<B><font color = 'orange'> Step 8 -</font> Clicked On Custom Month Image = " + current_Date_custom_Date);
				
				helper.waitFor(showAnalytics_Button);
				helper.highLightElement(driver, showAnalytics_Button);
				helper.jsCLick(showAnalytics_Button);
				Reporter.log("<B><font color = 'orange'> Step 9 -</font> Clicked on showAnalytics Button");
				
				Set<String> S7=driver.getWindowHandles();
			    Iterator<String>it6=S7.iterator();
			    String parent6=it6.next();
			    String child6=it6.next();
			    
			    driver.switchTo().window(child6);
			    
			    helper.waitForPageToLoad();
			    helper.waitFor(domain_reg_Date);
			    helper.highLightElement(driver, domain_reg_Date);
			    String domainRegDate = domain_reg_Date.getText();
			    Reporter.log("<B><font color = 'orange'> Step 10 -</font> Domain Registration Date in AdDetails Page= " +  domainRegDate);
			    
			    
			    driver.switchTo().window(parent6);
			    }
			    catch(Exception e) {
			    	System.out.println("Oops! Looks like we don't have data for this search criteria yet.");
			    	 Reporter.log("<B><font color = 'orange'> Step 8 -</font> Oops! Looks like we don't have data for this search criteria yet.");
			    }
			
		
		}
	}


