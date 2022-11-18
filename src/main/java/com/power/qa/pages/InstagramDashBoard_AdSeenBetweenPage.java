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

public class InstagramDashBoard_AdSeenBetweenPage extends BasePage{

	public InstagramDashBoard_AdSeenBetweenPage(WebDriver driver) {
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
	
	@FindBy(xpath="//span[text()='Ad Seen Between :']/following-sibling::div//div[@id='ads_timepicker']")
	WebElement ads_Seen_Between_Button;
	
	@FindBy(xpath="(//li[text()='All'])[1]")
	WebElement all_Button;
	
	@FindBy(xpath="//div[@class='ad_date']")
	WebElement current_Image_Date;
	
	@FindBy(xpath="//a[text()='Show Analytics']")
	WebElement showAnalytics_Button;
	
	@FindBy(xpath="//div[@id='last_seen1']")
	WebElement Last_Seen_childWindow;
	
	@FindBy(xpath="(//li[text()='Today'])[1]")
	WebElement today_Button;
	
	@FindBy(xpath="(//li[text()='Yesterday'])[1]")
	WebElement yesterday_Button;
	
	@FindBy(xpath="(//li[text()='Last Seven Days'])[1]")
	WebElement Last_Seven_Days_Button;
	
	@FindBy(xpath="(//li[text()='Last Thirty Days'])[1]")
	WebElement Last_Thirty_Days_Button;
	
	@FindBy(xpath="(//li[text()='This Month'])[1]")
	WebElement This_Month_Button;
	
	@FindBy(xpath="(//li[text()='Last Month'])[1]")
	WebElement Last_Month_Button;
	
	@FindBy(xpath="(//li[text()='Custom Range'])[1]")
	WebElement Custom_Range_Button;
	
	@FindBy(xpath="//td[text()='1']")
	WebElement custom_startDate;
	
	@FindBy(xpath="//td[text()='15']")
	WebElement custom_endDate;
	
	public void verify_instagram_dashboard_addSeenBetween() throws InterruptedException {
	
	Reporter.log("<B><font color = 'orange'> Step1 -</font> Logged into PowerAdSpy Application");
	String Page_titel = driver.getTitle();
	System.out.println(Page_titel);
	Reporter.log("<B><font color = 'orange'> Step2 -</font> I am on the page :" + Page_titel);

	//helper.waitForPageToLoad();
	helper.waitFor(Logo);
	helper.highLightElement(driver, Logo);
	Assert.assertTrue(Logo.isDisplayed(), "Power Ad Spy Logo is Dispalyed");
	Reporter.log("<B><font color = 'orange'> Step3 -</font> Power Ad Spy Logo is Displayed");
	
	helper.waitFor(Instagram);
	helper.highLightElement(driver, Instagram);
	Instagram.click();
	Assert.assertTrue(Instagram.isDisplayed(), "Clicked on Instagram ");
	Reporter.log("<B><font color = 'orange'> Step4 -</font> Clicked On Instagram Icon");
	//helper.waitForPageToLoad();
	
	//ALL
	Reporter.log("<B><font color = 'green'> Ads Seen Between : All -</font> ");
	   
    helper.waitFor(clearSearchField);
	helper.highLightElement(driver, clearSearchField);
	helper.jsCLick(clearSearchField);
	Reporter.log("<B><font color = 'orange'> Step 1 -</font> Clicked On clear search.");
	
	helper.waitFor(ads_Seen_Between_Button);
	helper.highLightElement(driver, ads_Seen_Between_Button);
	ads_Seen_Between_Button.click();
	Reporter.log("<B><font color = 'orange'> Step 2 -</font> Clicked On Ads Seen Between.");
	
	helper.waitFor(all_Button);
	helper.highLightElement(driver, all_Button);
	helper.jsCLick(all_Button);
	Reporter.log("<B><font color = 'orange'> Step 3 -</font> Clicked On Ads Seen Between all_Button.");
	
	helper.waitFor(search_bar);
	helper.highLightElement(driver, search_bar);
	helper.jsCLick(search_bar);
	Reporter.log("<B><font color = 'orange'> Step 4 -</font> Clicked On Search Bar.");
	//helper.waitForPageToLoad();
	
	helper.waitFor(toatal_Count_Ads);
	helper.highLightElement(driver, toatal_Count_Ads);
	helper.jsCLick(toatal_Count_Ads);
	String Total_Ads_Count_All=toatal_Count_Ads.getText();
	Reporter.log("<B><font color = 'orange'> Step 5 -</font> Total_Ads_Count_All= " + Total_Ads_Count_All);
	
	helper.waitFor(current_Image_Date);
	try {
	helper.highLightElement(driver, current_Image_Date);
	String current_Date_All = current_Image_Date.getText();
	System.out.println("current_Date_All : " + current_Date_All);
	Reporter.log("<B><font color = 'orange'> Step 6 -</font> Clicked On current_Date_All Image = " + current_Date_All);
	
	helper.Scrollintoview(showAnalytics_Button);
	helper.waitFor(showAnalytics_Button);
	helper.highLightElement(driver, showAnalytics_Button);
	helper.jsCLick(showAnalytics_Button);
	Reporter.log("<B><font color = 'orange'> Step 7 -</font> Clicked on showAnalytics Button");
	
	Set<String> S1=driver.getWindowHandles();
    Iterator<String>it=S1.iterator();
    String parent=it.next();
    String child=it.next();
    
    driver.switchTo().window(child);
	
    helper.waitForPageToLoad();
    helper.Scrollintoview(Last_Seen_childWindow);
    helper.waitFor(Last_Seen_childWindow);
    helper.highLightElement(driver, Last_Seen_childWindow);
    String lastSeenDate = Last_Seen_childWindow.getText();
    Reporter.log("<B><font color = 'orange'> Step 8 -</font> Last_Seen_childWindow AdDetails Page= " +  lastSeenDate);
    
    driver.close();
    
    driver.switchTo().window(parent);
    
	String joinString = null;
	//	String[] actualDate = null;
		
		String[] splitString = lastSeenDate.split(" ");
		for(int i=0;i<splitString.length-2;i++) {
			String actualDate=splitString[i]; 
			joinString= splitString[i+1]+" "+ splitString[i]+" " + splitString[i+2];
		//	System.out.println("splitString : " + splitString[i]);
			System.out.println("lastseen Date in All: " + joinString);
		}
	Assert.assertEquals(current_Date_All, joinString);
	
	}catch (Exception e) {
		 Reporter.log("<B><font color = 'orange'> Step 6 -</font> Oops! Looks like we don't have data for this search criteria yet.");
		 
	}
    
    // Today
    
    Reporter.log("<B><font color = 'green'> Ads Seen Between : Today -</font> ");
	 
    helper.Scrollintoview(clearSearchField);
    helper.waitFor(clearSearchField);
	helper.highLightElement(driver, clearSearchField);
	helper.jsCLick(clearSearchField);
	Reporter.log("<B><font color = 'orange'> Step 1 -</font> Clicked On clear search.");
	
	helper.waitFor(ads_Seen_Between_Button);
	helper.highLightElement(driver, ads_Seen_Between_Button);
	ads_Seen_Between_Button.click();
	Reporter.log("<B><font color = 'orange'> Step 2 -</font> Clicked On Ads Seen Between.");
    
	helper.waitFor(today_Button);
	helper.highLightElement(driver, today_Button);
	helper.jsCLick(today_Button);
	Reporter.log("<B><font color = 'orange'> Step  3-</font> Clicked On today_Button in Ads Seen Between.");
	
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
	try
	{
	helper.highLightElement(driver, current_Image_Date);
	String current_Date_today = current_Image_Date.getText();
	System.out.println("current_Date_Today : " + current_Date_today);
	Reporter.log("<B><font color = 'orange'> Step 6 -</font> Clicked On current_Date_today Image = " + current_Date_today);
		
	helper.Scrollintoview(showAnalytics_Button);
	helper.waitFor(showAnalytics_Button);
	helper.highLightElement(driver, showAnalytics_Button);
	helper.jsCLick(showAnalytics_Button);
	Reporter.log("<B><font color = 'orange'> Step 7 -</font> Clicked on showAnalytics Button");
	
	Set<String> S2=driver.getWindowHandles();
    Iterator<String>it1=S2.iterator();
    String parent1=it1.next();
    String child1=it1.next();
    
    driver.switchTo().window(child1);
    
    helper.waitForPageToLoad();
    helper.Scrollintoview(Last_Seen_childWindow);
    helper.waitFor(Last_Seen_childWindow);
    helper.highLightElement(driver, Last_Seen_childWindow);
    String lastSeenDate_today = Last_Seen_childWindow.getText();
    Reporter.log("<B><font color = 'orange'> Step 8 -</font> Last_Seen_childWindow AdDetails Page= " +  lastSeenDate_today);
    
    driver.close();
    
    driver.switchTo().window(parent1);
    
	String joinString = null;
	//	String[] actualDate = null;
		
		String[] splitString = lastSeenDate_today.split(" ");
		for(int i=0;i<splitString.length-2;i++) {
			String actualDate=splitString[i]; 
			joinString= splitString[i+1]+" "+ splitString[i]+" " + splitString[i+2];
		//	System.out.println("splitString : " + splitString[i]);
			System.out.println("lastseen Date in Today: " + joinString);
		}
	Assert.assertEquals(current_Date_today, joinString);
    }
     catch(Exception e){
    	System.out.println("Oops! Looks like we don't have data for this search criteria yet.");
    	 Reporter.log("<B><font color = 'orange'> Step 6 -</font> Oops! Looks like we don't have data for this search criteria yet.");
    }
   
    //yesterday
    
    Reporter.log("<B><font color = 'green'> Ads Seen Between : Yesterday -</font> ");
	
    helper.Scrollintoview(clearSearchField);
    helper.waitFor(clearSearchField);
	helper.highLightElement(driver, clearSearchField);
	helper.jsCLick(clearSearchField);
	Reporter.log("<B><font color = 'orange'> Step 1 -</font> Clicked On clear search.");
	
	helper.waitFor(ads_Seen_Between_Button);
	helper.highLightElement(driver, ads_Seen_Between_Button);
	ads_Seen_Between_Button.click();
	Reporter.log("<B><font color = 'orange'> Step 2 -</font> Clicked On Ads Seen Between.");
    
	helper.waitFor(yesterday_Button);
	helper.highLightElement(driver, yesterday_Button);
	helper.jsCLick(yesterday_Button);
	Reporter.log("<B><font color = 'orange'> Step 3 -</font> Clicked On yesterday_Button in Ads Seen Between.");
	
	helper.waitFor(search_bar);
	helper.highLightElement(driver, search_bar);
	helper.jsCLick(search_bar);
	Reporter.log("<B><font color = 'orange'> Step 4 -</font> Clicked On Search Bar.");
	helper.waitForPageToLoad();
	
	helper.waitFor(toatal_Count_Ads);
	helper.highLightElement(driver, toatal_Count_Ads);
	helper.jsCLick(toatal_Count_Ads);
	String Total_Ads_Count_Yesterday=toatal_Count_Ads.getText();
	Reporter.log("<B><font color = 'orange'> Step 5 -</font> Total_Ads_Count_Yesterday= " + Total_Ads_Count_Yesterday);
    
	helper.waitFor(current_Image_Date);
	try{
	helper.highLightElement(driver, current_Image_Date);
	String current_Date_yeserday = current_Image_Date.getText();
	System.out.println("current_Date_Yesterday : " + current_Date_yeserday);
	Reporter.log("<B><font color = 'orange'> Step 6 -</font> Clicked On current_Date_yesterday Image = " + current_Date_yeserday);
	
	helper.Scrollintoview(showAnalytics_Button);
	helper.waitFor(showAnalytics_Button);
	helper.highLightElement(driver, showAnalytics_Button);
	helper.jsCLick(showAnalytics_Button);
	Reporter.log("<B><font color = 'orange'> Step 7 -</font> Clicked on showAnalytics Button");
	
	Set<String> S3=driver.getWindowHandles();
    Iterator<String>it2=S3.iterator();
    String parent2=it2.next();
    String child2=it2.next();
    
    driver.switchTo().window(child2);
    
    helper.waitForPageToLoad();
    helper.waitFor(Last_Seen_childWindow);
    helper.highLightElement(driver, Last_Seen_childWindow);
    String lastSeenDate_yesterday = Last_Seen_childWindow.getText();
    Reporter.log("<B><font color = 'orange'> Step 8 -</font> Last_Seen_childWindow AdDetails Page= " +  lastSeenDate_yesterday);
    
    driver.close();
    
    driver.switchTo().window(parent2);
    
	String joinString = null;
	//	String[] actualDate = null;
		
		String[] splitString = lastSeenDate_yesterday.split(" ");
		for(int i=0;i<splitString.length-2;i++) {
			String actualDate=splitString[i]; 
			joinString= splitString[i+1]+" "+ splitString[i]+" " + splitString[i+2];
		//	System.out.println("splitString : " + splitString[i]);
			System.out.println("lastseen Date in Yesterday: " + joinString);
		}
	Assert.assertEquals(current_Date_yeserday, joinString);
    }
    catch(Exception e) {
    	System.out.println("Oops! Looks like we don't have data for this search criteria yet.");
    	 Reporter.log("<B><font color = 'orange'> Step 6 -</font> Oops! Looks like we don't have data for this search criteria yet.");
    }
    
    //Last seen Seven Days
    
    Reporter.log("<B><font color = 'green'> Ads Seen Between : Last_Seven_Days_Button -</font> ");
	 
    helper.Scrollintoview(clearSearchField);
    helper.waitFor(clearSearchField);
	helper.highLightElement(driver, clearSearchField);
	helper.jsCLick(clearSearchField);
	Reporter.log("<B><font color = 'orange'> Step 1 -</font> Clicked On clear search.");
	
	helper.waitFor(ads_Seen_Between_Button);
	helper.highLightElement(driver, ads_Seen_Between_Button);
	ads_Seen_Between_Button.click();
	Reporter.log("<B><font color = 'orange'> Step 2 -</font> Clicked On Ads Seen Between.");
    
	helper.waitFor(Last_Seven_Days_Button);
	helper.highLightElement(driver, Last_Seven_Days_Button);
	helper.jsCLick(Last_Seven_Days_Button);
	Reporter.log("<B><font color = 'orange'> Step 3 -</font> Clicked On Last_Seven_Days_Button in Ads Seen Between.");
	
	helper.waitFor(search_bar);
	helper.highLightElement(driver, search_bar);
	helper.jsCLick(search_bar);
	Reporter.log("<B><font color = 'orange'> Step 4 -</font> Clicked On Search Bar.");
//	helper.waitForPageToLoad();
	
	helper.waitFor(toatal_Count_Ads);
	helper.highLightElement(driver, toatal_Count_Ads);
	helper.jsCLick(toatal_Count_Ads);
	String Total_Ads_Count_LastSevenDays=toatal_Count_Ads.getText();
	Reporter.log("<B><font color = 'orange'> Step 5 -</font> Total_Ads_Count_LastSevenDays= " + Total_Ads_Count_LastSevenDays);
	
    helper.waitFor(current_Image_Date);
    try {
	helper.highLightElement(driver, current_Image_Date);
	String current_Date_Last_Seven_Days = current_Image_Date.getText();
	System.out.println("current_Date_LastSevenDays : " + current_Date_Last_Seven_Days);
	Reporter.log("<B><font color = 'orange'> Step 6 -</font> Clicked On Last_Seven_Days Image = " + current_Date_Last_Seven_Days);
	
	helper.Scrollintoview(clearSearchField);
	helper.waitFor(showAnalytics_Button);
	helper.highLightElement(driver, showAnalytics_Button);
	helper.jsCLick(showAnalytics_Button);
	Reporter.log("<B><font color = 'orange'> Step 7 -</font> Clicked on showAnalytics Button");
	
	Set<String> S4=driver.getWindowHandles();
    Iterator<String>it3=S4.iterator();
    String parent3=it3.next();
    String child3=it3.next();
    
    driver.switchTo().window(child3);
    
    helper.waitForPageToLoad();
    helper.waitFor(Last_Seen_childWindow);
    helper.highLightElement(driver, Last_Seen_childWindow);
    helper.Scrollintoview(Last_Seen_childWindow);
    String lastSeenDate_Last_Seven_Days = Last_Seen_childWindow.getText();
    Reporter.log("<B><font color = 'orange'> Step 8 -</font> Last_Seen_childWindow AdDetails Page= " +  lastSeenDate_Last_Seven_Days);
    
    driver.close();
    
    driver.switchTo().window(parent3);
    
    String joinString = null;
	//	String[] actualDate = null;
		
		String[] splitString = lastSeenDate_Last_Seven_Days.split(" ");
		for(int i=0;i<splitString.length-2;i++) {
			String actualDate=splitString[i]; 
			joinString= splitString[i+1]+" "+ splitString[i]+" " + splitString[i+2];
		//	System.out.println("splitString : " + splitString[i]);
			System.out.println("lastseen Date in Last Seven Days: " + joinString);
		}
	Assert.assertEquals(current_Date_Last_Seven_Days, joinString);
    }
    catch(Exception e) {
    	System.out.println("Oops! Looks like we don't have data for this search criteria yet.");
    	 Reporter.log("<B><font color = 'orange'> Step 6 -</font> Oops! Looks like we don't have data for this search criteria yet.");
    }
    
    //Last Seen Thirty Days
    
    Reporter.log("<B><font color = 'green'> Ads Seen Between : _Last Thirty Days -</font> ");
	  
    helper.waitFor(clearSearchField);
	helper.highLightElement(driver, clearSearchField);
	helper.jsCLick(clearSearchField);
	Reporter.log("<B><font color = 'orange'> Step 1 -</font> Clicked On clear search.");
	
	helper.waitFor(ads_Seen_Between_Button);
	helper.highLightElement(driver, ads_Seen_Between_Button);
	ads_Seen_Between_Button.click();
	Reporter.log("<B><font color = 'orange'> Step 2 -</font> Clicked On Ads Seen Between.");
    
	helper.waitFor(Last_Thirty_Days_Button);
	helper.highLightElement(driver, Last_Thirty_Days_Button);
	helper.jsCLick(Last_Thirty_Days_Button);
	Reporter.log("<B><font color = 'orange'> Step 3 -</font> Clicked On Last_Thirty_Days_Button in Ads Seen Between.");
	
	helper.waitFor(search_bar);
	helper.highLightElement(driver, search_bar);
	helper.jsCLick(search_bar);
	Reporter.log("<B><font color = 'orange'> Step 4 -</font> Clicked On Search Bar.");
	helper.waitForPageToLoad();
	
	helper.waitFor(toatal_Count_Ads);
	helper.highLightElement(driver, toatal_Count_Ads);
	helper.jsCLick(toatal_Count_Ads);
	String Total_Ads_Count_LastThirtDays=toatal_Count_Ads.getText();
	Reporter.log("<B><font color = 'orange'> Step 5 -</font> Total_Ads_Count_LastThirtDays= " + Total_Ads_Count_LastThirtDays);
	
    helper.waitFor(current_Image_Date);
    try {
	helper.highLightElement(driver, current_Image_Date);
	String current_Date_Last_Thirty_Days = current_Image_Date.getText();
	System.out.println("current_Date_LastThirtyDays  : " + current_Date_Last_Thirty_Days);
	Reporter.log("<B><font color = 'orange'> Step 6 -</font> Clicked On Last_Thirty_Days Image = " + current_Date_Last_Thirty_Days);
	
	helper.waitFor(showAnalytics_Button);
	helper.highLightElement(driver, showAnalytics_Button);
	helper.jsCLick(showAnalytics_Button);
	Reporter.log("<B><font color = 'orange'> Step 7 -</font> Clicked on showAnalytics Button");
	
	Set<String> S4=driver.getWindowHandles();
    Iterator<String>it3=S4.iterator();
    String parent3=it3.next();
    String child3=it3.next();
    
    driver.switchTo().window(child3);
    
    helper.waitForPageToLoad();
    helper.waitFor(Last_Seen_childWindow);
    helper.highLightElement(driver, Last_Seen_childWindow);
    String lastSeenDate_Last_Thirty_Days = Last_Seen_childWindow.getText();
    Reporter.log("<B><font color = 'orange'> Step 8 -</font> Last_Seen_childWindow AdDetails Page= " +  lastSeenDate_Last_Thirty_Days);
    
    driver.close();
    
    driver.switchTo().window(parent3);
    
    String joinString = null;
	//	String[] actualDate = null;
		
		String[] splitString = lastSeenDate_Last_Thirty_Days.split(" ");
		for(int i=0;i<splitString.length-2;i++) {
			String actualDate=splitString[i]; 
			joinString= splitString[i+1]+" "+ splitString[i]+" " + splitString[i+2];
		//	System.out.println("splitString : " + splitString[i]);
			System.out.println("lastseen Date in Last Thirty Days: " + joinString);
		}
	Assert.assertEquals(current_Date_Last_Thirty_Days, joinString);
    }
    catch(Exception e) {
    	System.out.println("Oops! Looks like we don't have data for this search criteria yet.");
    	 Reporter.log("<B><font color = 'orange'> Step 6 -</font> Oops! Looks like we don't have data for this search criteria yet.");
    }
    
    //This Month

 
    Reporter.log("<B><font color = 'green'> Ads Seen Between :This_Month_Button -</font> ");
	  
    helper.waitFor(clearSearchField);
	helper.highLightElement(driver, clearSearchField);
	helper.jsCLick(clearSearchField);
	Reporter.log("<B><font color = 'orange'> Step 1 -</font> Clicked On clear search.");
	
	helper.waitFor(ads_Seen_Between_Button);
	helper.highLightElement(driver, ads_Seen_Between_Button);
	ads_Seen_Between_Button.click();
	Reporter.log("<B><font color = 'orange'> Step 2 -</font> Clicked On Ads Seen Between.");
    
	helper.waitFor(This_Month_Button);
	helper.highLightElement(driver, This_Month_Button);
	helper.jsCLick(This_Month_Button);
	Reporter.log("<B><font color = 'orange'> Step 3 -</font> Clicked On This_Month_Button in Ads Seen Between.");
	
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
	String current_Date_This_Month = current_Image_Date.getText();
	System.out.println("current_Date_ThisMonth : " + current_Date_This_Month);
	Reporter.log("<B><font color = 'orange'> Step 6 -</font> Clicked On This Month Image = " + current_Date_This_Month);
	
	helper.waitFor(showAnalytics_Button);
	helper.highLightElement(driver, showAnalytics_Button);
	helper.jsCLick(showAnalytics_Button);
	Reporter.log("<B><font color = 'orange'> Step 7 -</font> Clicked on showAnalytics Button");
	
	Set<String> S5=driver.getWindowHandles();
    Iterator<String>it4=S5.iterator();
    String parent4=it4.next();
    String child4=it4.next();
    
    driver.switchTo().window(child4);
    
    helper.waitForPageToLoad();
    helper.waitFor(Last_Seen_childWindow);
    helper.highLightElement(driver, Last_Seen_childWindow);
    String lastSeenDate_This_Month= Last_Seen_childWindow.getText();
    Reporter.log("<B><font color = 'orange'> Step 8 -</font> Last_Seen_childWindow AdDetails Page= " +  lastSeenDate_This_Month);
    
    driver.close();
    
    driver.switchTo().window(parent4);
    
    String joinString = null;
	//	String[] actualDate = null;
		
		String[] splitString = lastSeenDate_This_Month.split(" ");
		for(int i=0;i<splitString.length-2;i++) {
			String actualDate=splitString[i]; 
			joinString= splitString[i+1]+" "+ splitString[i]+" " + splitString[i+2];
		//	System.out.println("splitString : " + splitString[i]);
			System.out.println("lastseen Date in This Month: " + joinString);
		}
	Assert.assertEquals(current_Date_This_Month, joinString);
    }
    catch(Exception e) {
    	System.out.println("Oops! Looks like we don't have data for this search criteria yet.");
    	 Reporter.log("<B><font color = 'orange'> Step 6 -</font> Oops! Looks like we don't have data for this search criteria yet.");
    }
    
//    Last Month
    
    Reporter.log("<B><font color = 'green'> Ads Seen Between :This_Month_Button -</font> ");
	  
    helper.waitFor(clearSearchField);
	helper.highLightElement(driver, clearSearchField);
	helper.jsCLick(clearSearchField);
	Reporter.log("<B><font color = 'orange'> Step 1 -</font> Clicked On clear search.");
	
	helper.waitFor(ads_Seen_Between_Button);
	helper.highLightElement(driver, ads_Seen_Between_Button);
	ads_Seen_Between_Button.click();
	Reporter.log("<B><font color = 'orange'> Step 2 -</font> Clicked On Ads Seen Between.");
    
	helper.waitFor(Last_Month_Button);
	helper.highLightElement(driver, Last_Month_Button);
	helper.jsCLick(Last_Month_Button);
	Reporter.log("<B><font color = 'orange'> Step 3 -</font> Clicked On Last_Month_Button in Ads Seen Between.");
	
	helper.waitFor(search_bar);
	helper.highLightElement(driver, search_bar);
	helper.jsCLick(search_bar);
	Reporter.log("<B><font color = 'orange'> Step 4 -</font> Clicked On Search Bar.");
	helper.waitForPageToLoad();
	
	helper.waitFor(toatal_Count_Ads);
	helper.highLightElement(driver, toatal_Count_Ads);
	helper.jsCLick(toatal_Count_Ads);
	String Total_Ads_Count_LastMonth=toatal_Count_Ads.getText();
	Reporter.log("<B><font color = 'orange'> Step 5 -</font> Total_Ads_Count_LastMonth= " + Total_Ads_Count_LastMonth);
	
    helper.waitFor(current_Image_Date);
    try {
	helper.highLightElement(driver, current_Image_Date);
	String current_Date_Last_Month = current_Image_Date.getText();
	System.out.println("current_Date_LastMonth : " + current_Date_Last_Month);
	Reporter.log("<B><font color = 'orange'> Step 6 -</font> Clicked On Last Month Image = " + current_Date_Last_Month);
	
	helper.waitFor(showAnalytics_Button);
	helper.highLightElement(driver, showAnalytics_Button);
	helper.jsCLick(showAnalytics_Button);
	Reporter.log("<B><font color = 'orange'> Step 7 -</font> Clicked on showAnalytics Button");
	
	Set<String> S6=driver.getWindowHandles();
    Iterator<String>it5=S6.iterator();
    String parent5=it5.next();
    String child5=it5.next();
    
    driver.switchTo().window(child5);
    
    helper.waitForPageToLoad();
    helper.waitFor(Last_Seen_childWindow);
    helper.highLightElement(driver, Last_Seen_childWindow);
    String lastSeenDate_Date_Last_Month= Last_Seen_childWindow.getText();
    Reporter.log("<B><font color = 'orange'> Step 8 -</font> Last_Seen_childWindow AdDetails Page= " +  lastSeenDate_Date_Last_Month);
    
    driver.close();
    
    driver.switchTo().window(parent5);
    
    String joinString = null;
   	//	String[] actualDate = null;
   		
   		String[] splitString = lastSeenDate_Date_Last_Month.split(" ");
   		for(int i=0;i<splitString.length-2;i++) {
   			String actualDate=splitString[i]; 
   			joinString= splitString[i+1]+" "+ splitString[i]+" " + splitString[i+2];
   		//	System.out.println("splitString : " + splitString[i]);
   			System.out.println("lastseen Date in Last Month: " + joinString);
   		}
   	Assert.assertEquals(current_Date_Last_Month, joinString);
    }
    catch(Exception e) {
    	System.out.println("Oops! Looks like we don't have data for this search criteria yet.");
    	 Reporter.log("<B><font color = 'orange'> Step 6 -</font> Oops! Looks like we don't have data for this search criteria yet.");
    }

    //Custom 
    
    Reporter.log("<B><font color = 'green'> Ads Seen Between :Custom_Range_Button -</font> ");
	  
    helper.waitFor(clearSearchField);
	helper.highLightElement(driver, clearSearchField);
	helper.jsCLick(clearSearchField);
	Reporter.log("<B><font color = 'orange'> Step 1 -</font> Clicked On clear search.");
	
	helper.waitFor(ads_Seen_Between_Button);
	helper.highLightElement(driver, ads_Seen_Between_Button);
	ads_Seen_Between_Button.click();
	Reporter.log("<B><font color = 'orange'> Step 2 -</font> Clicked On Ads Seen Between.");
    
	helper.waitFor(Custom_Range_Button);
	helper.highLightElement(driver, Custom_Range_Button);
	helper.jsCLick(Custom_Range_Button);
	Reporter.log("<B><font color = 'orange'> Step 3 -</font> Clicked On Custom_Range_Button in Ads Seen Between.");
	helper.waitForPageToLoad();
	
	helper.waitFor(custom_startDate);
	helper.highLightElement(driver, custom_startDate);
//	helper.jsCLick(custom_startDate);
	custom_startDate.click();
	Reporter.log("<B><font color = 'orange'> Step 4 -</font> Clicked On custom_startDate in Ads Seen Between.");
	helper.waitForPageToLoad();

	helper.waitFor(custom_endDate);
	helper.highLightElement(driver, custom_endDate);
//	helper.jsCLick(custom_endDate);
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
	Reporter.log("<B><font color = 'orange'> Step 7 -</font> Total_Ads_Count_Custom= " + Total_Ads_Count_Custom);
	
    helper.waitFor(current_Image_Date);
    try {
	helper.highLightElement(driver, current_Image_Date);
	String current_Date_custom_Date = current_Image_Date.getText();
	System.out.println("current_Date_Custom : " + current_Date_custom_Date);
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
    helper.waitFor(Last_Seen_childWindow);
    helper.highLightElement(driver, Last_Seen_childWindow);
    String lastSeenDate_Date_Custom= Last_Seen_childWindow.getText();
    Reporter.log("<B><font color = 'orange'> Step 10 -</font> Last_Seen_childWindow AdDetails Page= " +  lastSeenDate_Date_Custom);
    
    driver.close();
    
    driver.switchTo().window(parent6);
    
    String joinString = null;
   	//	String[] actualDate = null;
   		
   		String[] splitString = lastSeenDate_Date_Custom.split(" ");
   		for(int i=0;i<splitString.length-2;i++) {
   			String actualDate=splitString[i]; 
   			joinString= splitString[i+1]+" "+ splitString[i]+" " + splitString[i+2];
   		//	System.out.println("splitString : " + splitString[i]);
   			System.out.println("lastseen Date in child Window: " + joinString);
   		}
   	Assert.assertEquals(current_Date_custom_Date, joinString);
    }
    catch(Exception e) {
    	System.out.println("Oops! Looks like we don't have data for this search criteria yet.");
    	 Reporter.log("<B><font color = 'orange'> Step 8 -</font> Oops! Looks like we don't have data for this search criteria yet.");
    }

	}
	
}
