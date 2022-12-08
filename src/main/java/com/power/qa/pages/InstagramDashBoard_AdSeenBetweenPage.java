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
	
	@FindBy(xpath="(//div[@class='card_col_1']//div[@class='ad_date'])[1]")
	WebElement current_date1;
	
	@FindBy(xpath="(//div[@class='card_col_2']//div[@class='ad_date'])[1]")
	WebElement current_date2;
	
	@FindBy(xpath="(//div[@class='card_col_3']//div[@class='ad_date'])[1]")
	WebElement current_date3;
	
	@FindBy(xpath="(//div[@class='card_col_1']//div[@class='ad_date'])[2]")
	WebElement current_date4;
	
	@FindBy(xpath="(//div[@class='card_col_2']//div[@class='ad_date'])[2]")
	WebElement current_date5;
	
	@FindBy(xpath="(//div[@class='card_col_3']//div[@class='ad_date'])[2]")
	WebElement current_date6;

	@FindBy(xpath="(//div[@class='card_col_1']//div[@class='ad_date'])[3]")
	WebElement current_date7;
	
	@FindBy(xpath="(//div[@class='card_col_2']//div[@class='ad_date'])[3]")
	WebElement current_date8;
	
	@FindBy(xpath="(//div[@class='card_col_3']//div[@class='ad_date'])[3]")
	WebElement current_date9;
	
	@FindBy(xpath="(//div[@class='card_col_1']//div[@class='ad_date'])[4]")
	WebElement current_date10;
	
	@FindBy(xpath="(//div[@class='card_col_2']//div[@class='ad_date'])[4]")
	WebElement current_date11;
	
	@FindBy(xpath="(//div[@class='card_col_3']//div[@class='ad_date'])[4]")
	WebElement current_date12;
	
	@FindBy(xpath="(//div[@class='card_col_1']//div[@class='ad_date'])[5]")
	WebElement current_date13;
	
	@FindBy(xpath="(//div[@class='card_col_2']//div[@class='ad_date'])[5]")
	WebElement current_date14;
	
	@FindBy(xpath="(//div[@class='card_col_3']//div[@class='ad_date'])[5]")
	WebElement current_date15;
	
	@FindBy(xpath="(//div[@class='card_col_1']//a[text()='Show Analytics'])[1]")
	WebElement showAnalytics_Button1;
	
	@FindBy(xpath="(//div[@class='card_col_2']//a[text()='Show Analytics'])[1]")
	WebElement showAnalytics_Button2;
	
	@FindBy(xpath="(//div[@class='card_col_3']//a[text()='Show Analytics'])[1]")
	WebElement showAnalytics_Button3;
	
	@FindBy(xpath="(//div[@class='card_col_1']//a[text()='Show Analytics'])[2]")
	WebElement showAnalytics_Button4;
	
	@FindBy(xpath="(//div[@class='card_col_2']//a[text()='Show Analytics'])[2]")
	WebElement showAnalytics_Button5;
	
	@FindBy(xpath="(//div[@class='card_col_3']//a[text()='Show Analytics'])[2]")
	WebElement showAnalytics_Button6;
	
	@FindBy(xpath="(//div[@class='card_col_1']//a[text()='Show Analytics'])[3]")
	WebElement showAnalytics_Button7;
	
	@FindBy(xpath="(//div[@class='card_col_2']//a[text()='Show Analytics'])[3]")
	WebElement showAnalytics_Button8;
	
	@FindBy(xpath="(//div[@class='card_col_3']//a[text()='Show Analytics'])[3]")
	WebElement showAnalytics_Button9;
	
	@FindBy(xpath="(//div[@class='card_col_1']//a[text()='Show Analytics'])[4]")
	WebElement showAnalytics_Button10;
	
	@FindBy(xpath="(//div[@class='card_col_2']//a[text()='Show Analytics'])[4]")
	WebElement showAnalytics_Button11;
	
	@FindBy(xpath="(//div[@class='card_col_3']//a[text()='Show Analytics'])[4]")
	WebElement showAnalytics_Button12;
	
	@FindBy(xpath="(//div[@class='card_col_1']//a[text()='Show Analytics'])[5]")
	WebElement showAnalytics_Button13;
	
	@FindBy(xpath="(//div[@class='card_col_2']//a[text()='Show Analytics'])[5]")
	WebElement showAnalytics_Button14;
	
	@FindBy(xpath="(//div[@class='card_col_3']//a[text()='Show Analytics'])[5]")
	WebElement showAnalytics_Button15;
	
	
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
	
	@FindBy(xpath="//th[@class='prev available']")
	WebElement previousMonthButton;
	
	@FindBy(xpath="//th[@class='next available']")
	WebElement nextMonthButton;
	
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
	helper.waitForPageToLoad();
	/*
	//ALL
	Reporter.log("");
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
	helper.waitForPageToLoad();
	
	helper.waitFor(toatal_Count_Ads);
	helper.highLightElement(driver, toatal_Count_Ads);
	helper.jsCLick(toatal_Count_Ads);
	String Total_Ads_Count_All=toatal_Count_Ads.getText();
	Reporter.log("<B><font color = 'orange'> Step 5 -</font> Total_Ads_Count_All= " + Total_Ads_Count_All);
	
	Reporter.log("");
	Reporter.log("<B><font color = 'Blue-Violet'> 1st -</font> ");
	
	
	try {
	helper.Scrollintoview(current_date1);
	helper.waitFor(current_date1);
	helper.highLightElement(driver, current_date1);
	String imageDate = current_date1.getText();
	System.out.println("current_Date_All : " + imageDate);
	Reporter.log("<B><font color = 'blue'> ==> -</font> Clicked On current_Date_All Image = " + imageDate);
	
	helper.Scrollintoview(showAnalytics_Button1);
	helper.waitFor(showAnalytics_Button1);
	helper.highLightElement(driver, showAnalytics_Button1);
	String linkText1 = showAnalytics_Button1.getAttribute("href");
	helper.getAdID(linkText1);
	helper.jsCLick(showAnalytics_Button1);
	Reporter.log("<B><font color = 'blue'> ==> -</font> Clicked on showAnalytics Button");
	
	Set<String> S1=driver.getWindowHandles();
    Iterator<String>it=S1.iterator();
    String parent=it.next();
    String child=it.next();
    
    driver.switchTo().window(child);
	
    helper.waitForPageToLoad();
    helper.Scrollintoview(Last_Seen_childWindow);
    helper.waitFor(Last_Seen_childWindow);
    helper.highLightElement(driver, Last_Seen_childWindow);
    String lastSeenDate_All = Last_Seen_childWindow.getText();
    Reporter.log("<B><font color = 'blue'> ==> -</font> Last_Seen_childWindow AdDetails Page= " +  lastSeenDate_All);
    
    driver.close();
    
    driver.switchTo().window(parent);
  
    helper.getLastseenDate(lastSeenDate_All, imageDate);
	}catch (Exception e) {
		 Reporter.log("<B><font color = 'orange'> Step 6 -</font> Oops! Looks like we don't have data for this search criteria yet.");
		 
	}
	
	Reporter.log("");
	Reporter.log("<B><font color = 'Blue-Violet'> 2nd -</font> ");
	
	
	try {
	helper.Scrollintoview(current_date2);
	helper.waitFor(current_date2);
	helper.highLightElement(driver, current_date2);
	String imageDate = current_date2.getText();
	System.out.println("current_Date_All : " + imageDate);
	Reporter.log("<B><font color = 'blue'> ==> -</font> Clicked On current_Date_All Image = " + imageDate);
	
	helper.Scrollintoview(showAnalytics_Button2);
	helper.waitFor(showAnalytics_Button2);
	helper.highLightElement(driver, showAnalytics_Button2);
	String linkText1 = showAnalytics_Button2.getAttribute("href");
	helper.getAdID(linkText1);
	helper.jsCLick(showAnalytics_Button2);
	Reporter.log("<B><font color = 'blue'> ==> -</font> Clicked on showAnalytics Button");
	
	Set<String> S1=driver.getWindowHandles();
    Iterator<String>it=S1.iterator();
    String parent=it.next();
    String child=it.next();
    
    driver.switchTo().window(child);
	
    helper.waitForPageToLoad();
    helper.Scrollintoview(Last_Seen_childWindow);
    helper.waitFor(Last_Seen_childWindow);
    helper.highLightElement(driver, Last_Seen_childWindow);
    String lastSeenDate_All = Last_Seen_childWindow.getText();
    Reporter.log("<B><font color = 'blue'> ==> -</font> Last_Seen_childWindow AdDetails Page= " +  lastSeenDate_All);
    
    driver.close();
    
    driver.switchTo().window(parent);
    
    helper.getLastseenDate(lastSeenDate_All, imageDate);
	}catch (Exception e) {
		 Reporter.log("<B><font color = 'orange'> Step 6 -</font> Oops! Looks like we don't have data for this search criteria yet.");
		 
	}

	Reporter.log("");
	Reporter.log("<B><font color = 'Blue-Violet'> 3rd -</font> ");
	
	
	try {
	helper.Scrollintoview(current_date3);	
	helper.waitFor(current_date3);
	helper.highLightElement(driver, current_date3);
	String imageDate = current_date3.getText();
	System.out.println("current_Date_All : " + imageDate);
	Reporter.log("<B><font color = 'blue'> ==> -</font> Clicked On current_Date_All Image = " + imageDate);
	
	helper.Scrollintoview(showAnalytics_Button3);
	helper.waitFor(showAnalytics_Button3);
	helper.highLightElement(driver, showAnalytics_Button3);
	String linkText1 = showAnalytics_Button3.getAttribute("href");
	helper.getAdID(linkText1);
	helper.jsCLick(showAnalytics_Button3);
	Reporter.log("<B><font color = 'blue'> ==> -</font> Clicked on showAnalytics Button");
	
	Set<String> S1=driver.getWindowHandles();
    Iterator<String>it=S1.iterator();
    String parent=it.next();
    String child=it.next();
    
    driver.switchTo().window(child);
	
    helper.waitForPageToLoad();
    helper.Scrollintoview(Last_Seen_childWindow);
    helper.waitFor(Last_Seen_childWindow);
    helper.highLightElement(driver, Last_Seen_childWindow);
    String lastSeenDate_All = Last_Seen_childWindow.getText();
    Reporter.log("<B><font color = 'blue'> ==> -</font> Last_Seen_childWindow AdDetails Page= " +  lastSeenDate_All);
    
    driver.close();
    
    driver.switchTo().window(parent);
    
	helper.getLastseenDate(lastSeenDate_All, imageDate);
	}catch (Exception e) {
		 Reporter.log("<B><font color = 'orange'> Step 6 -</font> Oops! Looks like we don't have data for this search criteria yet.");
		 
	}
	
	Reporter.log("");
	Reporter.log("<B><font color = 'Blue-Violet'> 4th -</font> ");
	
	try {
	helper.Scrollintoview(current_date4);
	helper.waitFor(current_date4);
	helper.highLightElement(driver, current_date4);
	String imageDate = current_date4.getText();
	System.out.println("current_Date_All : " + imageDate);
	Reporter.log("<B><font color = 'blue'> ==> -</font> Clicked On current_Date_All Image = " + imageDate);
	
	helper.Scrollintoview(showAnalytics_Button4);
	helper.waitFor(showAnalytics_Button4);
	helper.highLightElement(driver, showAnalytics_Button4);
	String linkText1 = showAnalytics_Button4.getAttribute("href");
	helper.getAdID(linkText1);
	helper.jsCLick(showAnalytics_Button4);
	Reporter.log("<B><font color = 'blue'> ==> -</font> Clicked on showAnalytics Button");
	
	Set<String> S1=driver.getWindowHandles();
    Iterator<String>it=S1.iterator();
    String parent=it.next();
    String child=it.next();
    
    driver.switchTo().window(child);
	
    helper.waitForPageToLoad();
    helper.Scrollintoview(Last_Seen_childWindow);
    helper.waitFor(Last_Seen_childWindow);
    helper.highLightElement(driver, Last_Seen_childWindow);
    String lastSeenDate_All = Last_Seen_childWindow.getText();
    Reporter.log("<B><font color = 'blue'> ==> -</font> Last_Seen_childWindow AdDetails Page= " +  lastSeenDate_All);
    
    driver.close();
    
    driver.switchTo().window(parent);
    
	helper.getLastseenDate(lastSeenDate_All, imageDate);
	}catch (Exception e) {
		 Reporter.log("<B><font color = 'orange'> Step 6 -</font> Oops! Looks like we don't have data for this search criteria yet.");
		 
	}
	
	Reporter.log("");
	Reporter.log("<B><font color = 'Blue-Violet'> 5th -</font> ");
	
	try {
	helper.Scrollintoview(current_date5);
	helper.waitFor(current_date5);
	helper.highLightElement(driver, current_date5);
	String imageDate = current_date5.getText();
	System.out.println("current_Date_All : " + imageDate);
	Reporter.log("<B><font color = 'blue'> ==> -</font> Clicked On current_Date_All Image = " + imageDate);
	
	helper.Scrollintoview(showAnalytics_Button5);
	helper.waitFor(showAnalytics_Button5);
	helper.highLightElement(driver, showAnalytics_Button5);
	String linkText1 = showAnalytics_Button5.getAttribute("href");
	helper.getAdID(linkText1);
	helper.jsCLick(showAnalytics_Button5);
	Reporter.log("<B><font color = 'blue'> ==> -</font> Clicked on showAnalytics Button");
	
	Set<String> S1=driver.getWindowHandles();
    Iterator<String>it=S1.iterator();
    String parent=it.next();
    String child=it.next();
    
    driver.switchTo().window(child);
	
    helper.waitForPageToLoad();
    helper.Scrollintoview(Last_Seen_childWindow);
    helper.waitFor(Last_Seen_childWindow);
    helper.highLightElement(driver, Last_Seen_childWindow);
    String lastSeenDate_All = Last_Seen_childWindow.getText();
    Reporter.log("<B><font color = 'blue'> ==> -</font> Last_Seen_childWindow AdDetails Page= " +  lastSeenDate_All);
    
    driver.close();
    
    driver.switchTo().window(parent);
    
    helper.getLastseenDate(lastSeenDate_All, imageDate);
	}catch (Exception e) {
		 Reporter.log("<B><font color = 'orange'> Step 6 -</font> Oops! Looks like we don't have data for this search criteria yet.");
		 
	}
	
	Reporter.log("");
	Reporter.log("<B><font color = 'Blue-Violet'> 6th -</font> ");
	
	try {
	helper.Scrollintoview(current_date6);
	helper.waitFor(current_date6);
	helper.highLightElement(driver, current_date6);
	String imageDate = current_date6.getText();
	System.out.println("current_Date_All : " + imageDate);
	Reporter.log("<B><font color = 'blue'> ==> -</font> Clicked On current_Date_All Image = " + imageDate);
	
	helper.Scrollintoview(showAnalytics_Button6);
	helper.waitFor(showAnalytics_Button6);
	helper.highLightElement(driver, showAnalytics_Button6);
	String linkText1 = showAnalytics_Button6.getAttribute("href");
	helper.getAdID(linkText1);
	helper.jsCLick(showAnalytics_Button6);
	Reporter.log("<B><font color = 'blue'> ==> -</font> Clicked on showAnalytics Button");
	
	Set<String> S1=driver.getWindowHandles();
    Iterator<String>it=S1.iterator();
    String parent=it.next();
    String child=it.next();
    
    driver.switchTo().window(child);
	
    helper.waitForPageToLoad();
    helper.Scrollintoview(Last_Seen_childWindow);
    helper.waitFor(Last_Seen_childWindow);
    helper.highLightElement(driver, Last_Seen_childWindow);
    String lastSeenDate_All = Last_Seen_childWindow.getText();
    Reporter.log("<B><font color = 'blue'> ==> -</font> Last_Seen_childWindow AdDetails Page= " +  lastSeenDate_All);
    
    driver.close();
    
    driver.switchTo().window(parent);
   
    helper.getLastseenDate(lastSeenDate_All, imageDate);
	}catch (Exception e) {
		 Reporter.log("<B><font color = 'orange'> Step 6 -</font> Oops! Looks like we don't have data for this search criteria yet.");
		 
	}
	
	Reporter.log("");
	Reporter.log("<B><font color = 'Blue-Violet'> 7th -</font> ");
	
	try {
	helper.Scrollintoview(current_date7);
	helper.waitFor(current_date7);
	helper.highLightElement(driver, current_date7);
	String imageDate = current_date7.getText();
	System.out.println("current_Date_All : " + imageDate);
	Reporter.log("<B><font color = 'blue'> ==> -</font> Clicked On current_Date_All Image = " + imageDate);
	
	helper.Scrollintoview(showAnalytics_Button7);
	helper.waitFor(showAnalytics_Button7);
	helper.highLightElement(driver, showAnalytics_Button7);
	String linkText1 = showAnalytics_Button7.getAttribute("href");
	helper.getAdID(linkText1);
	helper.jsCLick(showAnalytics_Button7);
	Reporter.log("<B><font color = 'blue'> ==> -</font> Clicked on showAnalytics Button");
	
	Set<String> S1=driver.getWindowHandles();
    Iterator<String>it=S1.iterator();
    String parent=it.next();
    String child=it.next();
    
    driver.switchTo().window(child);
	
    helper.waitForPageToLoad();
    helper.Scrollintoview(Last_Seen_childWindow);
    helper.waitFor(Last_Seen_childWindow);
    helper.highLightElement(driver, Last_Seen_childWindow);
    String lastSeenDate_All = Last_Seen_childWindow.getText();
    Reporter.log("<B><font color = 'blue'> ==> -</font> Last_Seen_childWindow AdDetails Page= " +  lastSeenDate_All);
    
    driver.close();
    
    driver.switchTo().window(parent);
 
    helper.getLastseenDate(lastSeenDate_All, imageDate);
	}catch (Exception e) {
		 Reporter.log("<B><font color = 'orange'> Step 6 -</font> Oops! Looks like we don't have data for this search criteria yet.");
		 
	}
	
	Reporter.log("");
	Reporter.log("<B><font color = 'Blue-Violet'> 8th -</font> ");
	
	try {
	helper.Scrollintoview(current_date8);
	helper.waitFor(current_date8);
	helper.highLightElement(driver, current_date8);
	String imageDate = current_date8.getText();
	System.out.println("current_Date_All : " + imageDate);
	Reporter.log("<B><font color = 'blue'> ==> -</font> Clicked On current_Date_All Image = " + imageDate);
	
	helper.Scrollintoview(showAnalytics_Button8);
	helper.waitFor(showAnalytics_Button8);
	helper.highLightElement(driver, showAnalytics_Button8);
	String linkText1 = showAnalytics_Button8.getAttribute("href");
	helper.getAdID(linkText1);
	helper.jsCLick(showAnalytics_Button8);
	Reporter.log("<B><font color = 'blue'> ==> -</font> Clicked on showAnalytics Button");
	
	Set<String> S1=driver.getWindowHandles();
    Iterator<String>it=S1.iterator();
    String parent=it.next();
    String child=it.next();
    
    driver.switchTo().window(child);
	
    helper.waitForPageToLoad();
    helper.Scrollintoview(Last_Seen_childWindow);
    helper.waitFor(Last_Seen_childWindow);
    helper.highLightElement(driver, Last_Seen_childWindow);
    String lastSeenDate_All = Last_Seen_childWindow.getText();
    Reporter.log("<B><font color = 'blue'> ==> -</font> Last_Seen_childWindow AdDetails Page= " +  lastSeenDate_All);
    
    driver.close();
    
    driver.switchTo().window(parent);
    
	helper.getLastseenDate(lastSeenDate_All, imageDate);
	
	}catch (Exception e) {
		 Reporter.log("<B><font color = 'orange'> Step 6 -</font> Oops! Looks like we don't have data for this search criteria yet.");
		 
	}
	
	Reporter.log("");
	Reporter.log("<B><font color = 'Blue-Violet'> 9th -</font> ");
	
	try {
	helper.Scrollintoview(current_date9);	
	helper.waitFor(current_date9);
	helper.highLightElement(driver, current_date9);
	String imageDate = current_date9.getText();
	System.out.println("current_Date_All : " + imageDate);
	Reporter.log("<B><font color = 'blue'> ==> -</font> Clicked On current_Date_All Image = " + imageDate);
	
	helper.Scrollintoview(showAnalytics_Button9);
	helper.waitFor(showAnalytics_Button9);
	helper.highLightElement(driver, showAnalytics_Button9);
	String linkText1 = showAnalytics_Button9.getAttribute("href");
	helper.getAdID(linkText1);
	helper.jsCLick(showAnalytics_Button9);
	Reporter.log("<B><font color = 'blue'> ==> -</font> Clicked on showAnalytics Button");
	
	Set<String> S1=driver.getWindowHandles();
    Iterator<String>it=S1.iterator();
    String parent=it.next();
    String child=it.next();
    
    driver.switchTo().window(child);
	
    helper.waitForPageToLoad();
    helper.Scrollintoview(Last_Seen_childWindow);
    helper.waitFor(Last_Seen_childWindow);
    helper.highLightElement(driver, Last_Seen_childWindow);
    String lastSeenDate_All = Last_Seen_childWindow.getText();
    Reporter.log("<B><font color = 'blue'> ==> -</font> Last_Seen_childWindow AdDetails Page= " +  lastSeenDate_All);
    
    driver.close();
    
    driver.switchTo().window(parent);
    
	helper.getLastseenDate(lastSeenDate_All, imageDate);
	
	}catch (Exception e) {
		 Reporter.log("<B><font color = 'orange'> Step 6 -</font> Oops! Looks like we don't have data for this search criteria yet.");
		 
	}
	
	Reporter.log("");
	Reporter.log("<B><font color = 'Blue-Violet'> 10th -</font> ");
	
	try {
//	helper.Scrollintoview(current_date10);
	helper.waitFor(current_date10);
	helper.highLightElement(driver, current_date10);
	String imageDate = current_date10.getText();
	System.out.println("current_Date_All : " + imageDate);
	Reporter.log("<B><font color = 'blue'> ==> -</font> Clicked On current_Date_All Image = " + imageDate);
	
	helper.Scrollintoview(showAnalytics_Button10);
	helper.waitFor(showAnalytics_Button10);
	helper.highLightElement(driver, showAnalytics_Button10);
	String linkText1 = showAnalytics_Button10.getAttribute("href");
	helper.getAdID(linkText1);
	helper.jsCLick(showAnalytics_Button10);
	Reporter.log("<B><font color = 'blue'> ==> -</font> Clicked on showAnalytics Button");
	
	Set<String> S1=driver.getWindowHandles();
    Iterator<String>it=S1.iterator();
    String parent=it.next();
    String child=it.next();
    
    driver.switchTo().window(child);
	
    helper.waitForPageToLoad();
    helper.Scrollintoview(Last_Seen_childWindow);
    helper.waitFor(Last_Seen_childWindow);
    helper.highLightElement(driver, Last_Seen_childWindow);
    String lastSeenDate_All = Last_Seen_childWindow.getText();
    Reporter.log("<B><font color = 'blue'> ==> -</font> Last_Seen_childWindow AdDetails Page= " +  lastSeenDate_All);
    
    driver.close();
    
    driver.switchTo().window(parent);
    
	helper.getLastseenDate(lastSeenDate_All, imageDate);
	
	}catch (Exception e) {
		 Reporter.log("<B><font color = 'orange'> Step 6 -</font> Oops! Looks like we don't have data for this search criteria yet.");
		 
	}

	Reporter.log("");
	Reporter.log("<B><font color = 'Blue-Violet'> 11th -</font> ");
	
	try {
	helper.Scrollintoview(current_date11);
	helper.waitFor(current_date11);
	helper.highLightElement(driver, current_date11);
	String imageDate = current_date11.getText();
	System.out.println("current_Date_All : " + imageDate);
	Reporter.log("<B><font color = 'blue'> ==> -</font> Clicked On current_Date_All Image = " + imageDate);
	
	helper.Scrollintoview(showAnalytics_Button11);
	helper.waitFor(showAnalytics_Button11);
	helper.highLightElement(driver, showAnalytics_Button11);
	String linkText1 = showAnalytics_Button11.getAttribute("href");
	helper.getAdID(linkText1);
	helper.jsCLick(showAnalytics_Button11);
	Reporter.log("<B><font color = 'blue'> ==> -</font> Clicked on showAnalytics Button");
	
	Set<String> S1=driver.getWindowHandles();
    Iterator<String>it=S1.iterator();
    String parent=it.next();
    String child=it.next();
    
    driver.switchTo().window(child);
	
    helper.waitForPageToLoad();
    helper.Scrollintoview(Last_Seen_childWindow);
    helper.waitFor(Last_Seen_childWindow);
    helper.highLightElement(driver, Last_Seen_childWindow);
    String lastSeenDate_All = Last_Seen_childWindow.getText();
    Reporter.log("<B><font color = 'blue'> ==> -</font> Last_Seen_childWindow AdDetails Page= " +  lastSeenDate_All);
    
    driver.close();
    
    driver.switchTo().window(parent);
    
    helper.getLastseenDate(lastSeenDate_All, imageDate);
    
	}catch (Exception e) {
		 Reporter.log("<B><font color = 'orange'> Step 6 -</font> Oops! Looks like we don't have data for this search criteria yet.");
		 
	}
	

	Reporter.log("");
	Reporter.log("<B><font color = 'Blue-Violet'> 12th -</font> ");
	
	try {
	helper.Scrollintoview(current_date12);
	helper.waitFor(current_date12);
	helper.highLightElement(driver, current_date12);
	String imageDate = current_date12.getText();
	System.out.println("current_Date_All : " + imageDate);
	Reporter.log("<B><font color = 'blue'> ==> -</font> Clicked On current_Date_All Image = " + imageDate);
	
	helper.Scrollintoview(showAnalytics_Button12);
	helper.waitFor(showAnalytics_Button12);
	helper.highLightElement(driver, showAnalytics_Button12);
	String linkText1 = showAnalytics_Button12.getAttribute("href");
	helper.getAdID(linkText1);
	helper.jsCLick(showAnalytics_Button12);
	Reporter.log("<B><font color = 'blue'> ==> -</font> Clicked on showAnalytics Button");
	
	Set<String> S1=driver.getWindowHandles();
    Iterator<String>it=S1.iterator();
    String parent=it.next();
    String child=it.next();
    
    driver.switchTo().window(child);
	
    helper.waitForPageToLoad();
    helper.Scrollintoview(Last_Seen_childWindow);
    helper.waitFor(Last_Seen_childWindow);
    helper.highLightElement(driver, Last_Seen_childWindow);
    String lastSeenDate_All = Last_Seen_childWindow.getText();
    Reporter.log("<B><font color = 'blue'> ==> -</font> Last_Seen_childWindow AdDetails Page= " +  lastSeenDate_All);
    
    driver.close();
    
    driver.switchTo().window(parent);
    
	helper.getLastseenDate(lastSeenDate_All, imageDate);
	
	}catch (Exception e) {
		 Reporter.log("<B><font color = 'orange'> Step 6 -</font> Oops! Looks like we don't have data for this search criteria yet.");
		 
	}
	

	Reporter.log("");
	Reporter.log("<B><font color = 'Blue-Violet'> 13th -</font> ");
	
	try {
	helper.Scrollintoview(current_date13);
	helper.waitFor(current_date13);
	helper.highLightElement(driver, current_date13);
	String imageDate = current_date13.getText();
	System.out.println("current_Date_All : " + imageDate);
	Reporter.log("<B><font color = 'blue'> ==> -</font> Clicked On current_Date_All Image = " + imageDate);
	
	helper.Scrollintoview(showAnalytics_Button13);
	helper.waitFor(showAnalytics_Button13);
	helper.highLightElement(driver, showAnalytics_Button13);
	String linkText1 = showAnalytics_Button13.getAttribute("href");
	helper.getAdID(linkText1);
	helper.jsCLick(showAnalytics_Button13);
	Reporter.log("<B><font color = 'blue'> ==> -</font> Clicked on showAnalytics Button");
	
	Set<String> S1=driver.getWindowHandles();
    Iterator<String>it=S1.iterator();
    String parent=it.next();
    String child=it.next();
    
    driver.switchTo().window(child);
	
    helper.waitForPageToLoad();
    helper.Scrollintoview(Last_Seen_childWindow);
    helper.waitFor(Last_Seen_childWindow);
    helper.highLightElement(driver, Last_Seen_childWindow);
    String lastSeenDate_All = Last_Seen_childWindow.getText();
    Reporter.log("<B><font color = 'blue'> ==> -</font> Last_Seen_childWindow AdDetails Page= " +  lastSeenDate_All);
    
    driver.close();
    
    driver.switchTo().window(parent);
    
	helper.getLastseenDate(lastSeenDate_All, imageDate);
	}catch (Exception e) {
		 Reporter.log("<B><font color = 'orange'> Step 6 -</font> Oops! Looks like we don't have data for this search criteria yet.");
		 
	}

	Reporter.log("");
	Reporter.log("<B><font color = 'Blue-Violet'> 14th -</font> ");
	
	try {
	helper.Scrollintoview(current_date14);
	helper.waitFor(current_date14);
	helper.highLightElement(driver, current_date14);
	String imageDate = current_date14.getText();
	System.out.println("current_Date_All : " + imageDate);
	Reporter.log("<B><font color = 'blue'> ==> -</font> Clicked On current_Date_All Image = " + imageDate);
	
	helper.Scrollintoview(showAnalytics_Button14);
	helper.waitFor(showAnalytics_Button14);
	helper.highLightElement(driver, showAnalytics_Button14);
	String linkText1 = showAnalytics_Button14.getAttribute("href");
	helper.getAdID(linkText1);
	helper.jsCLick(showAnalytics_Button14);
	Reporter.log("<B><font color = 'blue'> ==> -</font> Clicked on showAnalytics Button");
	
	Set<String> S1=driver.getWindowHandles();
    Iterator<String>it=S1.iterator();
    String parent=it.next();
    String child=it.next();
    
    driver.switchTo().window(child);
	
    helper.waitForPageToLoad();
    helper.Scrollintoview(Last_Seen_childWindow);
    helper.waitFor(Last_Seen_childWindow);
    helper.highLightElement(driver, Last_Seen_childWindow);
    String lastSeenDate_All = Last_Seen_childWindow.getText();
    Reporter.log("<B><font color = 'blue'> ==> -</font> Last_Seen_childWindow AdDetails Page= " +  lastSeenDate_All);
    
    driver.close();
    
    driver.switchTo().window(parent);
    
    helper.getLastseenDate(lastSeenDate_All, imageDate);
	}catch (Exception e) {
		 Reporter.log("<B><font color = 'orange'> Step 6 -</font> Oops! Looks like we don't have data for this search criteria yet.");
		 
	}

	Reporter.log("");
	Reporter.log("<B><font color = 'Blue-Violet'> 15th -</font> ");
	
	try {
	helper.Scrollintoview(current_date15);
	helper.waitFor(current_date15);
	helper.highLightElement(driver, current_date15);
	String imageDate = current_date15.getText();
	System.out.println("current_Date_All : " + imageDate);
	Reporter.log("<B><font color = 'blue'> ==> -</font> Clicked On current_Date_All Image = " + imageDate);
	
	helper.Scrollintoview(showAnalytics_Button15);
	helper.waitFor(showAnalytics_Button15);
	helper.highLightElement(driver, showAnalytics_Button15);
	String linkText1 = showAnalytics_Button15.getAttribute("href");
	helper.getAdID(linkText1);
	helper.jsCLick(showAnalytics_Button15);
	Reporter.log("<B><font color = 'blue'> ==> -</font> Clicked on showAnalytics Button");
	
	Set<String> S1=driver.getWindowHandles();
    Iterator<String>it=S1.iterator();
    String parent=it.next();
    String child=it.next();
    
    driver.switchTo().window(child);
	
    helper.waitForPageToLoad();
    helper.Scrollintoview(Last_Seen_childWindow);
    helper.waitFor(Last_Seen_childWindow);
    helper.highLightElement(driver, Last_Seen_childWindow);
    String lastSeenDate_All = Last_Seen_childWindow.getText();
    Reporter.log("<B><font color = 'blue'> ==> -</font> Last_Seen_childWindow AdDetails Page= " +  lastSeenDate_All);
    
    driver.close();
    
    driver.switchTo().window(parent);
    
    helper.getLastseenDate(lastSeenDate_All, imageDate);
	}catch (Exception e) {
		 Reporter.log("<B><font color = 'orange'> Step 6 -</font> Oops! Looks like we don't have data for this search criteria yet.");
		 
	}
	
   // Today
	Reporter.log("");
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
	
	Reporter.log("");
	Reporter.log("<B><font color = 'Blue-Violet'> 1st Ad -</font> ");
	
	helper.waitFor(current_date1);	
	try
	{
	helper.highLightElement(driver, current_date1);
	String imageDate = current_date1.getText();
	System.out.println("current_Date_Today : " + imageDate);
	Reporter.log("<B><font color = 'blue'> ==> -</font> Clicked On current_Date_today Image = " + imageDate);
		
	helper.Scrollintoview(showAnalytics_Button1);
	helper.waitFor(showAnalytics_Button1);
	helper.highLightElement(driver, showAnalytics_Button1);
	helper.jsCLick(showAnalytics_Button1);
	Reporter.log("<B><font color = 'blue'> ==> -</font> Clicked on showAnalytics Button");
	
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
    Reporter.log("<B><font color = 'blue'> ==> -</font> Last_Seen_childWindow AdDetails Page= " +  lastSeenDate_today);
    
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
	Assert.assertEquals(imageDate, joinString);
	Reporter.log("<B><font color = 'blue'> ==> -</font> Image Date = "+" "+imageDate+"    ::    " + "Last Seeen Date = "+joinString+" "+" are same == PASS");

    }
     catch(Exception e){
    	System.out.println("Oops! Looks like we don't have data for this search criteria yet.");
    	 Reporter.log("<B><font color = 'red'> ==> -</font> Oops! Looks like we don't have data for this search criteria yet.");
    }
   
	Reporter.log("");
	Reporter.log("<B><font color = 'Blue-Violet'> 2nd Ad -</font> ");
	
	helper.waitFor(current_date2);	
	try
	{
	helper.highLightElement(driver, current_date2);
	String imageDate = current_date2.getText();
	System.out.println("current_Date_Today : " + imageDate);
	Reporter.log("<B><font color = 'blue'> ==> -</font> Clicked On current_Date_today Image = " + imageDate);
		
	helper.Scrollintoview(showAnalytics_Button2);
	helper.waitFor(showAnalytics_Button2);
	helper.highLightElement(driver, showAnalytics_Button2);
	helper.jsCLick(showAnalytics_Button2);
	Reporter.log("<B><font color = 'blue'> ==> -</font> Clicked on showAnalytics Button");
	
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
    Reporter.log("<B><font color = 'blue'> ==> -</font> Last_Seen_childWindow AdDetails Page= " +  lastSeenDate_today);
    
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
	Assert.assertEquals(imageDate, joinString);
	Reporter.log("<B><font color = 'blue'> ==> -</font> Image Date = "+" "+imageDate+"    ::    " + "Last Seeen Date = "+joinString+" "+" are same == PASS");

    }
     catch(Exception e){
    	System.out.println("Oops! Looks like we don't have data for this search criteria yet.");
    	 Reporter.log("<B><font color = 'red'> ==> -</font> Oops! Looks like we don't have data for this search criteria yet.");
    }
	
	Reporter.log("");
	Reporter.log("<B><font color = 'Blue-Violet'> 3rd Ad -</font> ");
	
	helper.waitFor(current_date3);	
	try
	{
	helper.highLightElement(driver, current_date3);
	String imageDate = current_date3.getText();
	System.out.println("current_Date_Today : " + imageDate);
	Reporter.log("<B><font color = 'blue'> ==> -</font> Clicked On current_Date_today Image = " + imageDate);
		
	helper.Scrollintoview(showAnalytics_Button3);
	helper.waitFor(showAnalytics_Button3);
	helper.highLightElement(driver, showAnalytics_Button3);
	helper.jsCLick(showAnalytics_Button3);
	Reporter.log("<B><font color = 'blue'> ==> -</font> Clicked on showAnalytics Button");
	
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
    Reporter.log("<B><font color = 'blue'> ==> -</font> Last_Seen_childWindow AdDetails Page= " +  lastSeenDate_today);
    
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
	Assert.assertEquals(imageDate, joinString);
	Reporter.log("<B><font color = 'blue'> ==> -</font> Image Date = "+" "+imageDate+"    ::    " + "Last Seeen Date = "+joinString+" "+" are same == PASS");

    }
     catch(Exception e){
    	System.out.println("Oops! Looks like we don't have data for this search criteria yet.");
    	 Reporter.log("<B><font color = 'red'> ==> -</font> Oops! Looks like we don't have data for this search criteria yet.");
    }
	
	Reporter.log("");
	Reporter.log("<B><font color = 'Blue-Violet'> 4th Ad -</font> ");
	
	helper.waitFor(current_date4);	
	try
	{
	helper.highLightElement(driver, current_date4);
	String imageDate = current_date4.getText();
	System.out.println("current_Date_Today : " + imageDate);
	Reporter.log("<B><font color = 'blue'> ==> -</font> Clicked On current_Date_today Image = " + imageDate);
		
	helper.Scrollintoview(showAnalytics_Button4);
	helper.waitFor(showAnalytics_Button4);
	helper.highLightElement(driver, showAnalytics_Button4);
	helper.jsCLick(showAnalytics_Button4);
	Reporter.log("<B><font color = 'blue'> ==> -</font> Clicked on showAnalytics Button");
	
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
    Reporter.log("<B><font color = 'blue'> ==> -</font> Last_Seen_childWindow AdDetails Page= " +  lastSeenDate_today);
    
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
	Assert.assertEquals(imageDate, joinString);
	Reporter.log("<B><font color = 'blue'> ==> -</font> Image Date = "+" "+imageDate+"    ::    " + "Last Seeen Date = "+joinString+" "+" are same == PASS");

    }
     catch(Exception e){
    	System.out.println("Oops! Looks like we don't have data for this search criteria yet.");
    	 Reporter.log("<B><font color = 'red'> ==> -</font> Oops! Looks like we don't have data for this search criteria yet.");
    }
	Reporter.log("");
	Reporter.log("<B><font color = 'Blue-Violet'> 5th Ad -</font> ");
	
	helper.waitFor(current_date5);	
	try
	{
	helper.highLightElement(driver, current_date5);
	String imageDate = current_date5.getText();
	System.out.println("current_Date_Today : " + imageDate);
	Reporter.log("<B><font color = 'blue'> ==> -</font> Clicked On current_Date_today Image = " + imageDate);
		
	helper.Scrollintoview(showAnalytics_Button5);
	helper.waitFor(showAnalytics_Button5);
	helper.highLightElement(driver, showAnalytics_Button5);
	helper.jsCLick(showAnalytics_Button5);
	Reporter.log("<B><font color = 'blue'> ==> -</font> Clicked on showAnalytics Button");
	
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
    Reporter.log("<B><font color = 'blue'> ==> -</font> Last_Seen_childWindow AdDetails Page= " +  lastSeenDate_today);
    
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
	Assert.assertEquals(imageDate, joinString);
	Reporter.log("<B><font color = 'blue'> ==> -</font> Image Date = "+" "+imageDate+"    ::    " + "Last Seeen Date = "+joinString+" "+" are same == PASS");

    }
     catch(Exception e){
    	System.out.println("Oops! Looks like we don't have data for this search criteria yet.");
    	 Reporter.log("<B><font color = 'red'> ==> -</font> Oops! Looks like we don't have data for this search criteria yet.");
    }
	
	Reporter.log("");
	Reporter.log("<B><font color = 'Blue-Violet'> 6th Ad -</font> ");
	
	helper.waitFor(current_date6);	
	try
	{
	helper.highLightElement(driver, current_date6);
	String imageDate = current_date6.getText();
	System.out.println("current_Date_Today : " + imageDate);
	Reporter.log("<B><font color = 'blue'> ==> -</font> Clicked On current_Date_today Image = " + imageDate);
		
	helper.Scrollintoview(showAnalytics_Button6);
	helper.waitFor(showAnalytics_Button6);
	helper.highLightElement(driver, showAnalytics_Button6);
	helper.jsCLick(showAnalytics_Button6);
	Reporter.log("<B><font color = 'blue'> ==> -</font> Clicked on showAnalytics Button");
	
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
    Reporter.log("<B><font color = 'blue'> ==> -</font> Last_Seen_childWindow AdDetails Page= " +  lastSeenDate_today);
    
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
	Assert.assertEquals(imageDate, joinString);
	Reporter.log("<B><font color = 'blue'> ==> -</font> Image Date = "+" "+imageDate+"    ::    " + "Last Seeen Date = "+joinString+" "+" are same == PASS");

    }
     catch(Exception e){
    	System.out.println("Oops! Looks like we don't have data for this search criteria yet.");
    	 Reporter.log("<B><font color = 'red'> ==> -</font> Oops! Looks like we don't have data for this search criteria yet.");
    }
	
	Reporter.log("");
	Reporter.log("<B><font color = 'Blue-Violet'> 7th Ad -</font> ");
	
	helper.waitFor(current_date7);	
	try
	{
	helper.highLightElement(driver, current_date7);
	String imageDate = current_date7.getText();
	System.out.println("current_Date_Today : " + imageDate);
	Reporter.log("<B><font color = 'blue'> ==> -</font> Clicked On current_Date_today Image = " + imageDate);
		
	helper.Scrollintoview(showAnalytics_Button7);
	helper.waitFor(showAnalytics_Button7);
	helper.highLightElement(driver, showAnalytics_Button7);
	helper.jsCLick(showAnalytics_Button7);
	Reporter.log("<B><font color = 'blue'> ==> -</font> Clicked on showAnalytics Button");
	
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
    Reporter.log("<B><font color = 'blue'> ==> -</font> Last_Seen_childWindow AdDetails Page= " +  lastSeenDate_today);
    
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
	Assert.assertEquals(imageDate, joinString);
	Reporter.log("<B><font color = 'blue'> ==> -</font> Image Date = "+" "+imageDate+"    ::    " + "Last Seeen Date = "+joinString+" "+" are same == PASS");

    }
     catch(Exception e){
    	System.out.println("Oops! Looks like we don't have data for this search criteria yet.");
    	 Reporter.log("<B><font color = 'red'> ==> -</font> Oops! Looks like we don't have data for this search criteria yet.");
    }
	
	Reporter.log("");
	Reporter.log("<B><font color = 'Blue-Violet'> 8th Ad -</font> ");
	
	helper.waitFor(current_date8);	
	try
	{
	helper.highLightElement(driver, current_date8);
	String imageDate = current_date8.getText();
	System.out.println("current_Date_Today : " + imageDate);
	Reporter.log("<B><font color = 'blue'> ==> -</font> Clicked On current_Date_today Image = " + imageDate);
		
	helper.Scrollintoview(showAnalytics_Button8);
	helper.waitFor(showAnalytics_Button8);
	helper.highLightElement(driver, showAnalytics_Button8);
	helper.jsCLick(showAnalytics_Button8);
	Reporter.log("<B><font color = 'blue'> ==> -</font> Clicked on showAnalytics Button");
	
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
    Reporter.log("<B><font color = 'blue'> ==> -</font> Last_Seen_childWindow AdDetails Page= " +  lastSeenDate_today);
    
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
	Assert.assertEquals(imageDate, joinString);
	Reporter.log("<B><font color = 'blue'> ==> -</font> Image Date = "+" "+imageDate+"    ::    " + "Last Seeen Date = "+joinString+" "+" are same == PASS");

    }
     catch(Exception e){
    	System.out.println("Oops! Looks like we don't have data for this search criteria yet.");
    	 Reporter.log("<B><font color = 'red'> ==> -</font> Oops! Looks like we don't have data for this search criteria yet.");
    }
	
	Reporter.log("");
	Reporter.log("<B><font color = 'Blue-Violet'> 9th Ad -</font> ");
	
	helper.waitFor(current_date9);	
	try
	{
	helper.highLightElement(driver, current_date9);
	String imageDate = current_date9.getText();
	System.out.println("current_Date_Today : " + imageDate);
	Reporter.log("<B><font color = 'blue'> ==> -</font> Clicked On current_Date_today Image = " + imageDate);
		
	helper.Scrollintoview(showAnalytics_Button9);
	helper.waitFor(showAnalytics_Button9);
	helper.highLightElement(driver, showAnalytics_Button9);
	helper.jsCLick(showAnalytics_Button9);
	Reporter.log("<B><font color = 'blue'> ==> -</font> Clicked on showAnalytics Button");
	
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
    Reporter.log("<B><font color = 'blue'> ==> -</font> Last_Seen_childWindow AdDetails Page= " +  lastSeenDate_today);
    
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
	Assert.assertEquals(imageDate, joinString);
	Reporter.log("<B><font color = 'blue'> ==> -</font> Image Date = "+" "+imageDate+"    ::    " + "Last Seeen Date = "+joinString+" "+" are same == PASS");

    }
     catch(Exception e){
    	System.out.println("Oops! Looks like we don't have data for this search criteria yet.");
    	 Reporter.log("<B><font color = 'red'> ==> -</font> Oops! Looks like we don't have data for this search criteria yet.");
    }
	
	Reporter.log("");
	Reporter.log("<B><font color = 'Blue-Violet'> 10th Ad -</font> ");
	
	helper.waitFor(current_date10);	
	try
	{
	helper.highLightElement(driver, current_date10);
	String imageDate = current_date10.getText();
	System.out.println("current_Date_Today : " + imageDate);
	Reporter.log("<B><font color = 'blue'> ==> -</font> Clicked On current_Date_today Image = " + imageDate);
		
	helper.Scrollintoview(showAnalytics_Button10);
	helper.waitFor(showAnalytics_Button10);
	helper.highLightElement(driver, showAnalytics_Button10);
	helper.jsCLick(showAnalytics_Button10);
	Reporter.log("<B><font color = 'blue'> ==> -</font> Clicked on showAnalytics Button");
	
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
    Reporter.log("<B><font color = 'blue'> ==> -</font> Last_Seen_childWindow AdDetails Page= " +  lastSeenDate_today);
    
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
	Assert.assertEquals(imageDate, joinString);
	Reporter.log("<B><font color = 'blue'> ==> -</font> Image Date = "+" "+imageDate+"    ::    " + "Last Seeen Date = "+joinString+" "+" are same == PASS");

    }
     catch(Exception e){
    	System.out.println("Oops! Looks like we don't have data for this search criteria yet.");
    	 Reporter.log("<B><font color = 'red'> ==> -</font> Oops! Looks like we don't have data for this search criteria yet.");
    }
	
	Reporter.log("");
	Reporter.log("<B><font color = 'Blue-Violet'> 11th Ad -</font> ");
	
	helper.waitFor(current_date11);	
	try
	{
	helper.highLightElement(driver, current_date11);
	String imageDate = current_date11.getText();
	System.out.println("current_Date_Today : " + imageDate);
	Reporter.log("<B><font color = 'blue'> ==> -</font> Clicked On current_Date_today Image = " + imageDate);
		
	helper.Scrollintoview(showAnalytics_Button11);
	helper.waitFor(showAnalytics_Button11);
	helper.highLightElement(driver, showAnalytics_Button11);
	helper.jsCLick(showAnalytics_Button11);
	Reporter.log("<B><font color = 'blue'> ==> -</font> Clicked on showAnalytics Button");
	
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
    Reporter.log("<B><font color = 'blue'> ==> -</font> Last_Seen_childWindow AdDetails Page= " +  lastSeenDate_today);
    
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
	Assert.assertEquals(imageDate, joinString);
	Reporter.log("<B><font color = 'blue'> ==> -</font> Image Date = "+" "+imageDate+"    ::    " + "Last Seeen Date = "+joinString+" "+" are same == PASS");

    }
     catch(Exception e){
    	System.out.println("Oops! Looks like we don't have data for this search criteria yet.");
    	 Reporter.log("<B><font color = 'red'> ==> -</font> Oops! Looks like we don't have data for this search criteria yet.");
    }
	
	Reporter.log("");
	Reporter.log("<B><font color = 'Blue-Violet'> 12th Ad -</font> ");
	
	helper.waitFor(current_date12);	
	try
	{
	helper.highLightElement(driver, current_date12);
	String imageDate = current_date12.getText();
	System.out.println("current_Date_Today : " + imageDate);
	Reporter.log("<B><font color = 'blue'> ==> -</font> Clicked On current_Date_today Image = " + imageDate);
		
	helper.Scrollintoview(showAnalytics_Button12);
	helper.waitFor(showAnalytics_Button12);
	helper.highLightElement(driver, showAnalytics_Button12);
	helper.jsCLick(showAnalytics_Button12);
	Reporter.log("<B><font color = 'blue'> ==> -</font> Clicked on showAnalytics Button");
	
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
    Reporter.log("<B><font color = 'blue'> ==> -</font> Last_Seen_childWindow AdDetails Page= " +  lastSeenDate_today);
    
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
	Assert.assertEquals(imageDate, joinString);
	Reporter.log("<B><font color = 'blue'> ==> -</font> Image Date = "+" "+imageDate+"    ::    " + "Last Seeen Date = "+joinString+" "+" are same == PASS");

    }
     catch(Exception e){
    	System.out.println("Oops! Looks like we don't have data for this search criteria yet.");
    	 Reporter.log("<B><font color = 'red'> ==> -</font> Oops! Looks like we don't have data for this search criteria yet.");
    }
	
	Reporter.log("");
	Reporter.log("<B><font color = 'Blue-Violet'> 13th Ad -</font> ");
	
	helper.waitFor(current_date13);	
	try
	{
	helper.highLightElement(driver, current_date13);
	String imageDate = current_date13.getText();
	System.out.println("current_Date_Today : " + imageDate);
	Reporter.log("<B><font color = 'blue'> ==> -</font> Clicked On current_Date_today Image = " + imageDate);
		
	helper.Scrollintoview(showAnalytics_Button13);
	helper.waitFor(showAnalytics_Button13);
	helper.highLightElement(driver, showAnalytics_Button13);
	helper.jsCLick(showAnalytics_Button13);
	Reporter.log("<B><font color = 'blue'> ==> -</font> Clicked on showAnalytics Button");
	
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
    Reporter.log("<B><font color = 'blue'> ==> -</font> Last_Seen_childWindow AdDetails Page= " +  lastSeenDate_today);
    
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
	Assert.assertEquals(imageDate, joinString);
	Reporter.log("<B><font color = 'blue'> ==> -</font> Image Date = "+" "+imageDate+"    ::    " + "Last Seeen Date = "+joinString+" "+" are same == PASS");

    }
     catch(Exception e){
    	System.out.println("Oops! Looks like we don't have data for this search criteria yet.");
    	 Reporter.log("<B><font color = 'red'> ==> -</font> Oops! Looks like we don't have data for this search criteria yet.");
    }
	
	Reporter.log("");
	Reporter.log("<B><font color = 'Blue-Violet'> 14th Ad -</font> ");
	
	helper.waitFor(current_date14);	
	try
	{
	helper.highLightElement(driver, current_date14);
	String imageDate = current_date14.getText();
	System.out.println("current_Date_Today : " + imageDate);
	Reporter.log("<B><font color = 'blue'> ==> -</font> Clicked On current_Date_today Image = " + imageDate);
		
	helper.Scrollintoview(showAnalytics_Button14);
	helper.waitFor(showAnalytics_Button14);
	helper.highLightElement(driver, showAnalytics_Button14);
	helper.jsCLick(showAnalytics_Button14);
	Reporter.log("<B><font color = 'blue'> ==> -</font> Clicked on showAnalytics Button");
	
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
    Reporter.log("<B><font color = 'blue'> ==> -</font> Last_Seen_childWindow AdDetails Page= " +  lastSeenDate_today);
    
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
	Assert.assertEquals(imageDate, joinString);
	Reporter.log("<B><font color = 'blue'> ==> -</font> Image Date = "+" "+imageDate+"    ::    " + "Last Seeen Date = "+joinString+" "+" are same == PASS");

    }
     catch(Exception e){
    	System.out.println("Oops! Looks like we don't have data for this search criteria yet.");
    	 Reporter.log("<B><font color = 'red'> ==> -</font> Oops! Looks like we don't have data for this search criteria yet.");
    }
	
	Reporter.log("");
	Reporter.log("<B><font color = 'Blue-Violet'> 15th Ad -</font> ");
	
	helper.waitFor(current_date15);	
	try
	{
	helper.highLightElement(driver, current_date15);
	String imageDate = current_date15.getText();
	System.out.println("current_Date_Today : " + imageDate);
	Reporter.log("<B><font color = 'blue'> ==> -</font> Clicked On current_Date_today Image = " + imageDate);
		
	helper.Scrollintoview(showAnalytics_Button15);
	helper.waitFor(showAnalytics_Button15);
	helper.highLightElement(driver, showAnalytics_Button15);
	helper.jsCLick(showAnalytics_Button15);
	Reporter.log("<B><font color = 'blue'> ==> -</font> Clicked on showAnalytics Button");
	
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
    Reporter.log("<B><font color = 'blue'> ==> -</font> Last_Seen_childWindow AdDetails Page= " +  lastSeenDate_today);
    
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
	Assert.assertEquals(imageDate, joinString);
	Reporter.log("<B><font color = 'blue'> ==> -</font> Image Date = "+" "+imageDate+"    ::    " + "Last Seeen Date = "+joinString+" "+" are same == PASS");

    }
     catch(Exception e){
    	System.out.println("Oops! Looks like we don't have data for this search criteria yet.");
    	 Reporter.log("<B><font color = 'red'> ==> -</font> Oops! Looks like we don't have data for this search criteria yet.");
    }
	
    //yesterday
   
	Reporter.log("");
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
	
	Reporter.log("");
	Reporter.log("<B><font color = 'Blue-Violet'> 1st Ad -</font> ");
	
	helper.waitFor(current_date1);
	try{
	helper.highLightElement(driver, current_date1);
	String imageDate = current_date1.getText();
	System.out.println("current_Date_Yesterday : " + imageDate);
	Reporter.log("<B><font color = 'blue'> ==> -</font> Clicked On current_Date_yesterday Image = " + imageDate);
	
	helper.Scrollintoview(showAnalytics_Button1);
	helper.waitFor(showAnalytics_Button1);
	helper.highLightElement(driver, showAnalytics_Button1);
	String linkText = showAnalytics_Button1.getAttribute("href");
	System.out.println("linkText : " + linkText);
	
	String idString = null;
		
		String[] splitStringid = linkText.split("/");
		for(int i=0;i<splitStringid.length;i++) {
			String actualDate=splitStringid[splitStringid.length-1]; 
			System.out.println("actualDate : " + actualDate);
			Reporter.log("<B><font color = 'blue'> ==> -</font> ID of the 1st Ad = " + actualDate);
			break;
		}
		
	
	helper.jsCLick(showAnalytics_Button1);
	Reporter.log("<B><font color = 'blue'> ==> -</font> Clicked on showAnalytics Button");
	
	Set<String> S3=driver.getWindowHandles();
    Iterator<String>it2=S3.iterator();
    String parent2=it2.next();
    String child2=it2.next();
    
    driver.switchTo().window(child2);
    
    helper.waitForPageToLoad();
    helper.waitFor(Last_Seen_childWindow);
    helper.highLightElement(driver, Last_Seen_childWindow);
    String lastSeenDate_yesterday = Last_Seen_childWindow.getText();
    Reporter.log("<B><font color = 'blue'> ==> -</font> Last_Seen_childWindow AdDetails Page= " +  lastSeenDate_yesterday);
    
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
	Assert.assertEquals(imageDate, joinString);
	Reporter.log("<B><font color = 'blue'> ==> -</font> Image Date = "+" "+imageDate+"    ::    " + "Last Seeen Date = "+joinString+" "+" are same == PASS");

    }
    catch(Exception e) {
    	System.out.println("Oops! Looks like we don't have data for this search criteria yet.");
    	 Reporter.log("<B><font color = 'red'> ==> -</font> Oops! Looks like we don't have data for this search criteria yet.");
    }


	Reporter.log("");
	Reporter.log("<B><font color = 'Blue-Violet'> 2nd Ad -</font> ");
	
	helper.waitFor(current_date2);
	try{
	helper.highLightElement(driver, current_date2);
	String imageDate = current_date2.getText();
	System.out.println("current_Date_Yesterday : " + imageDate);
	Reporter.log("<B><font color = 'blue'> ==> -</font> Clicked On current_Date_yesterday Image = " + imageDate);
	
	helper.highLightElement(driver, showAnalytics_Button2);
	String linkText = showAnalytics_Button2.getAttribute("href");
	helper.Scrollintoview(showAnalytics_Button2);
	helper.waitFor(showAnalytics_Button2);
	helper.highLightElement(driver, showAnalytics_Button2);
	
	helper.highLightElement(driver, showAnalytics_Button2);
	String linkText1 = showAnalytics_Button2.getAttribute("href");
	
	String idString = null;
	
	String[] splitStringid = linkText1.split("/");
	for(int i=0;i<splitStringid.length;i++) {
		String actualDate=splitStringid[splitStringid.length-1]; 
		System.out.println("actualDate : " + actualDate);
		Reporter.log("<B><font color = 'blue'> ==> -</font> ID of the 2nd Ad = " + actualDate);
		break;
	}
	helper.jsCLick(showAnalytics_Button2);
	Reporter.log("<B><font color = 'blue'> ==> -</font> Clicked on showAnalytics Button");
	
	Set<String> S3=driver.getWindowHandles();
    Iterator<String>it2=S3.iterator();
    String parent2=it2.next();
    String child2=it2.next();
    
    driver.switchTo().window(child2);
    
    helper.waitForPageToLoad();
    helper.waitFor(Last_Seen_childWindow);
    helper.highLightElement(driver, Last_Seen_childWindow);
    String lastSeenDate_yesterday = Last_Seen_childWindow.getText();
    Reporter.log("<B><font color = 'blue'> ==> -</font> Last_Seen_childWindow AdDetails Page= " +  lastSeenDate_yesterday);
    
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
	Assert.assertEquals(imageDate, joinString);
	Reporter.log("<B><font color = 'blue'> ==> -</font> Image Date = "+" "+imageDate+"    ::    " + "Last Seeen Date = "+joinString+" "+" are same == PASS");

    }
    catch(Exception e) {
    	System.out.println("Oops! Looks like we don't have data for this search criteria yet.");
    	 Reporter.log("<B><font color = 'red'> ==> -</font> Oops! Looks like we don't have data for this search criteria yet.");
    }
	

	Reporter.log("");
	Reporter.log("<B><font color = 'Blue-Violet'> 3rd Ad -</font> ");
	
	helper.waitFor(current_date3);
	try{
	helper.highLightElement(driver, current_date3);
	String imageDate = current_date3.getText();
	System.out.println("current_Date_Yesterday : " + imageDate);
	Reporter.log("<B><font color = 'blue'> ==> -</font> Clicked On current_Date_yesterday Image = " + imageDate);
	
	helper.Scrollintoview(showAnalytics_Button3);
	helper.waitFor(showAnalytics_Button3);
	helper.highLightElement(driver, showAnalytics_Button3);
	
	helper.highLightElement(driver, showAnalytics_Button3);
	String linkText1 = showAnalytics_Button3.getAttribute("href");
	
	String idString = null;
	
	String[] splitStringid = linkText1.split("/");
	for(int i=0;i<splitStringid.length;i++) {
		String actualDate=splitStringid[splitStringid.length-1]; 
		System.out.println("actualDate : " + actualDate);
		Reporter.log("<B><font color = 'blue'> ==> -</font> ID of the 3rd Ad = " + actualDate);
		break;
	}
	
	helper.jsCLick(showAnalytics_Button3);
	Reporter.log("<B><font color = 'blue'> ==> -</font> Clicked on showAnalytics Button");
	
	Set<String> S3=driver.getWindowHandles();
    Iterator<String>it2=S3.iterator();
    String parent2=it2.next();
    String child2=it2.next();
    
    driver.switchTo().window(child2);
    
    helper.waitForPageToLoad();
    helper.waitFor(Last_Seen_childWindow);
    helper.highLightElement(driver, Last_Seen_childWindow);
    String lastSeenDate_yesterday = Last_Seen_childWindow.getText();
    Reporter.log("<B><font color = 'blue'> ==> -</font> Last_Seen_childWindow AdDetails Page= " +  lastSeenDate_yesterday);
    
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
	Assert.assertEquals(imageDate, joinString);
	Reporter.log("<B><font color = 'blue'> ==> -</font> Image Date = "+" "+imageDate+"    ::    " + "Last Seeen Date = "+joinString+" "+" are same == PASS");

    }
    catch(Exception e) {
    	System.out.println("Oops! Looks like we don't have data for this search criteria yet.");
    	 Reporter.log("<B><font color = 'red'> ==> -</font> Oops! Looks like we don't have data for this search criteria yet.");
    }
	

	Reporter.log("");
	Reporter.log("<B><font color = 'Blue-Violet'> 4th Ad -</font> ");
	
	helper.waitFor(current_date4);
	try{
	helper.highLightElement(driver, current_date4);
	String imageDate = current_date4.getText();
	System.out.println("current_Date_Yesterday : " + imageDate);
	Reporter.log("<B><font color = 'blue'> ==> -</font> Clicked On current_Date_yesterday Image = " + imageDate);
	
	helper.Scrollintoview(showAnalytics_Button4);
	helper.waitFor(showAnalytics_Button4);
	helper.highLightElement(driver, showAnalytics_Button4);
	
	helper.highLightElement(driver, showAnalytics_Button4);
	String linkText1 = showAnalytics_Button4.getAttribute("href");
	
	String idString = null;
	
	String[] splitStringid = linkText1.split("/");
	for(int i=0;i<splitStringid.length;i++) {
		String actualDate=splitStringid[splitStringid.length-1]; 
		System.out.println("actualDate : " + actualDate);
		Reporter.log("<B><font color = 'blue'> ==> -</font> ID of the 4th Ad = " + actualDate);
		break;
	}
	
	helper.jsCLick(showAnalytics_Button4);
	Reporter.log("<B><font color = 'blue'> ==> -</font> Clicked on showAnalytics Button");
	
	Set<String> S3=driver.getWindowHandles();
    Iterator<String>it2=S3.iterator();
    String parent2=it2.next();
    String child2=it2.next();
    
    driver.switchTo().window(child2);
    
    helper.waitForPageToLoad();
    helper.waitFor(Last_Seen_childWindow);
    helper.highLightElement(driver, Last_Seen_childWindow);
    String lastSeenDate_yesterday = Last_Seen_childWindow.getText();
    Reporter.log("<B><font color = 'blue'> ==> -</font> Last_Seen_childWindow AdDetails Page= " +  lastSeenDate_yesterday);
    
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
	Assert.assertEquals(imageDate, joinString);
	Reporter.log("<B><font color = 'blue'> ==> -</font> Image Date = "+" "+imageDate+"    ::    " + "Last Seeen Date = "+joinString+" "+" are same == PASS");

    }
    catch(Exception e) {
    	System.out.println("Oops! Looks like we don't have data for this search criteria yet.");
    	 Reporter.log("<B><font color = 'red'> ==> -</font> Oops! Looks like we don't have data for this search criteria yet.");
    }
	

	Reporter.log("");
	Reporter.log("<B><font color = 'Blue-Violet'> 5th Ad -</font> ");
	
	helper.waitFor(current_date5);
	try{
	helper.highLightElement(driver, current_date5);
	String imageDate = current_date5.getText();
	System.out.println("current_Date_Yesterday : " + imageDate);
	Reporter.log("<B><font color = 'blue'> ==> -</font> Clicked On current_Date_yesterday Image = " + imageDate);
	
	helper.Scrollintoview(showAnalytics_Button5);
	helper.waitFor(showAnalytics_Button5);
	helper.highLightElement(driver, showAnalytics_Button5);
	
	helper.highLightElement(driver, showAnalytics_Button5);
	String linkText1 = showAnalytics_Button5.getAttribute("href");
	
	String idString = null;
	
	String[] splitStringid = linkText1.split("/");
	for(int i=0;i<splitStringid.length;i++) {
		String actualDate=splitStringid[splitStringid.length-1]; 
		System.out.println("actualDate : " + actualDate);
		Reporter.log("<B><font color = 'blue'> ==> -</font> ID of the 5th Ad = " + actualDate);
		break;
	}
	
	helper.jsCLick(showAnalytics_Button5);
	Reporter.log("<B><font color = 'blue'> ==> -</font> Clicked on showAnalytics Button");
	
	Set<String> S3=driver.getWindowHandles();
    Iterator<String>it2=S3.iterator();
    String parent2=it2.next();
    String child2=it2.next();
    
    driver.switchTo().window(child2);
    
    helper.waitForPageToLoad();
    helper.waitFor(Last_Seen_childWindow);
    helper.highLightElement(driver, Last_Seen_childWindow);
    String lastSeenDate_yesterday = Last_Seen_childWindow.getText();
    Reporter.log("<B><font color = 'blue'> ==> -</font> Last_Seen_childWindow AdDetails Page= " +  lastSeenDate_yesterday);
    
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
	Assert.assertEquals(imageDate, joinString);
	Reporter.log("<B><font color = 'blue'> ==> -</font> Image Date = "+" "+imageDate+"    ::    " + "Last Seeen Date = "+joinString+" "+" are same == PASS");

    }
    catch(Exception e) {
    	System.out.println("Oops! Looks like we don't have data for this search criteria yet.");
    	 Reporter.log("<B><font color = 'red'> ==> -</font> Oops! Looks like we don't have data for this search criteria yet.");
    }
	

	Reporter.log("");
	Reporter.log("<B><font color = 'Blue-Violet'> 6th Ad -</font> ");
	
	helper.waitFor(current_date6);
	try{
	helper.highLightElement(driver, current_date6);
	String imageDate = current_date6.getText();
	System.out.println("current_Date_Yesterday : " + imageDate);
	Reporter.log("<B><font color = 'blue'> ==> -</font> Clicked On current_Date_yesterday Image = " + imageDate);
	
	helper.Scrollintoview(showAnalytics_Button6);
	helper.waitFor(showAnalytics_Button6);
	helper.highLightElement(driver, showAnalytics_Button6);
	
	helper.highLightElement(driver, showAnalytics_Button6);
	String linkText1 = showAnalytics_Button6.getAttribute("href");
	
	String idString = null;
	
	String[] splitStringid = linkText1.split("/");
	for(int i=0;i<splitStringid.length;i++) {
		String actualDate=splitStringid[splitStringid.length-1]; 
		System.out.println("actualDate : " + actualDate);
		Reporter.log("<B><font color = 'blue'> ==> -</font> ID of the 6th Ad = " + actualDate);
		break;
	}
	
	helper.jsCLick(showAnalytics_Button6);
	Reporter.log("<B><font color = 'blue'> ==> -</font> Clicked on showAnalytics Button");
	
	Set<String> S3=driver.getWindowHandles();
    Iterator<String>it2=S3.iterator();
    String parent2=it2.next();
    String child2=it2.next();
    
    driver.switchTo().window(child2);
    
    helper.waitForPageToLoad();
    helper.waitFor(Last_Seen_childWindow);
    helper.highLightElement(driver, Last_Seen_childWindow);
    String lastSeenDate_yesterday = Last_Seen_childWindow.getText();
    Reporter.log("<B><font color = 'blue'> ==> -</font> Last_Seen_childWindow AdDetails Page= " +  lastSeenDate_yesterday);
    
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
	Assert.assertEquals(imageDate, joinString);
	Reporter.log("<B><font color = 'blue'> ==> -</font> Image Date = "+" "+imageDate+"    ::    " + "Last Seeen Date = "+joinString+" "+" are same == PASS");

    }
    catch(Exception e) {
    	System.out.println("Oops! Looks like we don't have data for this search criteria yet.");
    	 Reporter.log("<B><font color = 'red'> ==> -</font> Oops! Looks like we don't have data for this search criteria yet.");
    }
	

	Reporter.log("");
	Reporter.log("<B><font color = 'Blue-Violet'> 7th Ad -</font> ");
	
	helper.waitFor(current_date7);
	try{
	helper.highLightElement(driver, current_date7);
	String imageDate = current_date7.getText();
	System.out.println("current_Date_Yesterday : " + imageDate);
	Reporter.log("<B><font color = 'blue'> ==> -</font> Clicked On current_Date_yesterday Image = " + imageDate);
	
	helper.Scrollintoview(showAnalytics_Button7);
	helper.waitFor(showAnalytics_Button7);
	helper.highLightElement(driver, showAnalytics_Button7);
	
	helper.highLightElement(driver, showAnalytics_Button7);
	String linkText1 = showAnalytics_Button7.getAttribute("href");
	
	String idString = null;
	
	String[] splitStringid = linkText1.split("/");
	for(int i=0;i<splitStringid.length;i++) {
		String actualDate=splitStringid[splitStringid.length-1]; 
		System.out.println("actualDate : " + actualDate);
		Reporter.log("<B><font color = 'blue'> ==> -</font> ID of the 7th Ad = " + actualDate);
		break;
	}
	
	helper.jsCLick(showAnalytics_Button7);
	Reporter.log("<B><font color = 'blue'> ==> -</font> Clicked on showAnalytics Button");
	
	Set<String> S3=driver.getWindowHandles();
    Iterator<String>it2=S3.iterator();
    String parent2=it2.next();
    String child2=it2.next();
    
    driver.switchTo().window(child2);
    
    helper.waitForPageToLoad();
    helper.waitFor(Last_Seen_childWindow);
    helper.highLightElement(driver, Last_Seen_childWindow);
    String lastSeenDate_yesterday = Last_Seen_childWindow.getText();
    Reporter.log("<B><font color = 'blue'> ==> -</font> Last_Seen_childWindow AdDetails Page= " +  lastSeenDate_yesterday);
    
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
	Assert.assertEquals(imageDate, joinString);
	Reporter.log("<B><font color = 'blue'> ==> -</font> Image Date = "+" "+imageDate+"    ::    " + "Last Seeen Date = "+joinString+" "+" are same == PASS");

    }
    catch(Exception e) {
    	System.out.println("Oops! Looks like we don't have data for this search criteria yet.");
    	 Reporter.log("<B><font color = 'red'> ==> -</font> Oops! Looks like we don't have data for this search criteria yet.");
    }
	

	Reporter.log("");
	Reporter.log("<B><font color = 'Blue-Violet'> 8th Ad -</font> ");
	
	helper.waitFor(current_date8);
	try{
	helper.highLightElement(driver, current_date8);
	String imageDate = current_date8.getText();
	System.out.println("current_Date_Yesterday : " + imageDate);
	Reporter.log("<B><font color = 'blue'> ==> -</font> Clicked On current_Date_yesterday Image = " + imageDate);
	
	helper.Scrollintoview(showAnalytics_Button8);
	helper.waitFor(showAnalytics_Button8);
	helper.highLightElement(driver, showAnalytics_Button8);
	
	helper.highLightElement(driver, showAnalytics_Button8);
	String linkText1 = showAnalytics_Button8.getAttribute("href");
	
	String idString = null;
	
	String[] splitStringid = linkText1.split("/");
	for(int i=0;i<splitStringid.length;i++) {
		String actualDate=splitStringid[splitStringid.length-1]; 
		System.out.println("actualDate : " + actualDate);
		Reporter.log("<B><font color = 'blue'> ==> -</font> ID of the 8th Ad = " + actualDate);
		break;
	}
	
	helper.jsCLick(showAnalytics_Button8);
	Reporter.log("<B><font color = 'blue'> ==> -</font> Clicked on showAnalytics Button");
	
	Set<String> S3=driver.getWindowHandles();
    Iterator<String>it2=S3.iterator();
    String parent2=it2.next();
    String child2=it2.next();
    
    driver.switchTo().window(child2);
    
    helper.waitForPageToLoad();
    helper.waitFor(Last_Seen_childWindow);
    helper.highLightElement(driver, Last_Seen_childWindow);
    String lastSeenDate_yesterday = Last_Seen_childWindow.getText();
    Reporter.log("<B><font color = 'blue'> ==> -</font> Last_Seen_childWindow AdDetails Page= " +  lastSeenDate_yesterday);
    
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
	Assert.assertEquals(imageDate, joinString);
	Reporter.log("<B><font color = 'blue'> ==> -</font> Image Date = "+" "+imageDate+"    ::    " + "Last Seeen Date = "+joinString+" "+" are same == PASS");

    }
    catch(Exception e) {
    	System.out.println("Oops! Looks like we don't have data for this search criteria yet.");
    	 Reporter.log("<B><font color = 'red'> ==> -</font> Oops! Looks like we don't have data for this search criteria yet.");
    }
	

	Reporter.log("");
	Reporter.log("<B><font color = 'Blue-Violet'> 9th Ad -</font> ");
	
	helper.waitFor(current_date9);
	try{
	helper.highLightElement(driver, current_date9);
	String imageDate = current_date9.getText();
	System.out.println("current_Date_Yesterday : " + imageDate);
	Reporter.log("<B><font color = 'blue'> ==> -</font> Clicked On current_Date_yesterday Image = " + imageDate);
	
	helper.Scrollintoview(showAnalytics_Button9);
	helper.waitFor(showAnalytics_Button9);
	helper.highLightElement(driver, showAnalytics_Button9);
	
	helper.highLightElement(driver, showAnalytics_Button9);
	String linkText1 = showAnalytics_Button9.getAttribute("href");
	
	String idString = null;
	
	String[] splitStringid = linkText1.split("/");
	for(int i=0;i<splitStringid.length;i++) {
		String actualDate=splitStringid[splitStringid.length-1]; 
		System.out.println("actualDate : " + actualDate);
		Reporter.log("<B><font color = 'blue'> ==> -</font> ID of the 9th Ad = " + actualDate);
		break;
	}
	
	helper.jsCLick(showAnalytics_Button9);
	Reporter.log("<B><font color = 'blue'> ==> -</font> Clicked on showAnalytics Button");
	
	Set<String> S3=driver.getWindowHandles();
    Iterator<String>it2=S3.iterator();
    String parent2=it2.next();
    String child2=it2.next();
    
    driver.switchTo().window(child2);
    
    helper.waitForPageToLoad();
    helper.waitFor(Last_Seen_childWindow);
    helper.highLightElement(driver, Last_Seen_childWindow);
    String lastSeenDate_yesterday = Last_Seen_childWindow.getText();
    Reporter.log("<B><font color = 'blue'> ==> -</font> Last_Seen_childWindow AdDetails Page= " +  lastSeenDate_yesterday);
    
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
	Assert.assertEquals(imageDate, joinString);
	Reporter.log("<B><font color = 'blue'> ==> -</font> Image Date = "+" "+imageDate+"    ::    " + "Last Seeen Date = "+joinString+" "+" are same == PASS");

    }
    catch(Exception e) {
    	System.out.println("Oops! Looks like we don't have data for this search criteria yet.");
    	 Reporter.log("<B><font color = 'red'> ==> -</font> Oops! Looks like we don't have data for this search criteria yet.");
    }
	

	Reporter.log("");
	Reporter.log("<B><font color = 'Blue-Violet'> 10th Ad -</font> ");
	
	helper.waitFor(current_date10);
	try{
	helper.highLightElement(driver, current_date10);
	String imageDate = current_date10.getText();
	System.out.println("current_Date_Yesterday : " + imageDate);
	Reporter.log("<B><font color = 'blue'> ==> -</font> Clicked On current_Date_yesterday Image = " + imageDate);
	
	helper.Scrollintoview(showAnalytics_Button10);
	helper.waitFor(showAnalytics_Button10);
	helper.highLightElement(driver, showAnalytics_Button10);
	
	helper.highLightElement(driver, showAnalytics_Button10);
	String linkText1 = showAnalytics_Button10.getAttribute("href");
	
	String idString = null;
	
	String[] splitStringid = linkText1.split("/");
	for(int i=0;i<splitStringid.length;i++) {
		String actualDate=splitStringid[splitStringid.length-1]; 
		System.out.println("actualDate : " + actualDate);
		Reporter.log("<B><font color = 'blue'> ==> -</font> ID of the 10th Ad = " + actualDate);
		break;
	}
	
	helper.jsCLick(showAnalytics_Button10);
	Reporter.log("<B><font color = 'blue'> ==> -</font> Clicked on showAnalytics Button");
	
	Set<String> S3=driver.getWindowHandles();
    Iterator<String>it2=S3.iterator();
    String parent2=it2.next();
    String child2=it2.next();
    
    driver.switchTo().window(child2);
    
    helper.waitForPageToLoad();
    helper.waitFor(Last_Seen_childWindow);
    helper.highLightElement(driver, Last_Seen_childWindow);
    String lastSeenDate_yesterday = Last_Seen_childWindow.getText();
    Reporter.log("<B><font color = 'blue'> ==> -</font> Last_Seen_childWindow AdDetails Page= " +  lastSeenDate_yesterday);
    
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
	Assert.assertEquals(imageDate, joinString);
	Reporter.log("<B><font color = 'blue'> ==> -</font> Image Date = "+" "+imageDate+"    ::    " + "Last Seeen Date = "+joinString+" "+" are same == PASS");

    }
    catch(Exception e) {
    	System.out.println("Oops! Looks like we don't have data for this search criteria yet.");
    	 Reporter.log("<B><font color = 'red'> ==> -</font> Oops! Looks like we don't have data for this search criteria yet.");
    }
	

	Reporter.log("");
	Reporter.log("<B><font color = 'Blue-Violet'> 11th Ad -</font> ");
	
	helper.waitFor(current_date11);
	try{
	helper.highLightElement(driver, current_date11);
	String imageDate = current_date11.getText();
	System.out.println("current_Date_Yesterday : " + imageDate);
	Reporter.log("<B><font color = 'blue'> ==> -</font> Clicked On current_Date_yesterday Image = " + imageDate);
	
	helper.Scrollintoview(showAnalytics_Button11);
	helper.waitFor(showAnalytics_Button11);
	helper.highLightElement(driver, showAnalytics_Button11);
	
	helper.highLightElement(driver, showAnalytics_Button11);
	String linkText1 = showAnalytics_Button11.getAttribute("href");
	
	String idString = null;
	
	String[] splitStringid = linkText1.split("/");
	for(int i=0;i<splitStringid.length;i++) {
		String actualDate=splitStringid[splitStringid.length-1]; 
		System.out.println("actualDate : " + actualDate);
		Reporter.log("<B><font color = 'blue'> ==> -</font> ID of the 11th Ad = " + actualDate);
		break;
	}
	
	
	helper.jsCLick(showAnalytics_Button11);
	Reporter.log("<B><font color = 'blue'> ==> -</font> Clicked on showAnalytics Button");
	
	Set<String> S3=driver.getWindowHandles();
    Iterator<String>it2=S3.iterator();
    String parent2=it2.next();
    String child2=it2.next();
    
    driver.switchTo().window(child2);
    
    helper.waitForPageToLoad();
    helper.waitFor(Last_Seen_childWindow);
    helper.highLightElement(driver, Last_Seen_childWindow);
    String lastSeenDate_yesterday = Last_Seen_childWindow.getText();
    Reporter.log("<B><font color = 'blue'> ==> -</font> Last_Seen_childWindow AdDetails Page= " +  lastSeenDate_yesterday);
    
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
	Assert.assertEquals(imageDate, joinString);
	Reporter.log("<B><font color = 'blue'> ==> -</font> Image Date = "+" "+imageDate+"    ::    " + "Last Seeen Date = "+joinString+" "+" are same == PASS");

    }
    catch(Exception e) {
    	System.out.println("Oops! Looks like we don't have data for this search criteria yet.");
    	 Reporter.log("<B><font color = 'red'> ==> -</font> Oops! Looks like we don't have data for this search criteria yet.");
    }
	

	Reporter.log("");
	Reporter.log("<B><font color = 'Blue-Violet'> 12th Ad -</font> ");
	
	helper.waitFor(current_date12);
	try{
	helper.highLightElement(driver, current_date12);
	String imageDate = current_date12.getText();
	System.out.println("current_Date_Yesterday : " + imageDate);
	Reporter.log("<B><font color = 'blue'> ==> -</font> Clicked On current_Date_yesterday Image = " + imageDate);
	
	helper.Scrollintoview(showAnalytics_Button12);
	helper.waitFor(showAnalytics_Button12);
	helper.highLightElement(driver, showAnalytics_Button12);
	
	helper.highLightElement(driver, showAnalytics_Button12);
	String linkText1 = showAnalytics_Button12.getAttribute("href");
	
	String idString = null;
	
	String[] splitStringid = linkText1.split("/");
	for(int i=0;i<splitStringid.length;i++) {
		String actualDate=splitStringid[splitStringid.length-1]; 
		System.out.println("actualDate : " + actualDate);
		Reporter.log("<B><font color = 'blue'> ==> -</font> ID of the 12th Ad = " + actualDate);
		break;
	}
	
	helper.jsCLick(showAnalytics_Button12);
	Reporter.log("<B><font color = 'blue'> ==> -</font> Clicked on showAnalytics Button");
	
	Set<String> S3=driver.getWindowHandles();
    Iterator<String>it2=S3.iterator();
    String parent2=it2.next();
    String child2=it2.next();
    
    driver.switchTo().window(child2);
    
    helper.waitForPageToLoad();
    helper.waitFor(Last_Seen_childWindow);
    helper.highLightElement(driver, Last_Seen_childWindow);
    String lastSeenDate_yesterday = Last_Seen_childWindow.getText();
    Reporter.log("<B><font color = 'blue'> ==> -</font> Last_Seen_childWindow AdDetails Page= " +  lastSeenDate_yesterday);
    
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
	Assert.assertEquals(imageDate, joinString);
	Reporter.log("<B><font color = 'blue'> ==> -</font> Image Date = "+" "+imageDate+"    ::    " + "Last Seeen Date = "+joinString+" "+" are same == PASS");

    }
    catch(Exception e) {
    	System.out.println("Oops! Looks like we don't have data for this search criteria yet.");
    	 Reporter.log("<B><font color = 'red'> ==> -</font> Oops! Looks like we don't have data for this search criteria yet.");
    }
	

	Reporter.log("");
	Reporter.log("<B><font color = 'Blue-Violet'> 13th Ad -</font> ");
	
	helper.waitFor(current_date13);
	try{
	helper.highLightElement(driver, current_date13);
	String imageDate = current_date13.getText();
	System.out.println("current_Date_Yesterday : " + imageDate);
	Reporter.log("<B><font color = 'blue'> ==> -</font> Clicked On current_Date_yesterday Image = " + imageDate);
	
	helper.Scrollintoview(showAnalytics_Button13);
	helper.waitFor(showAnalytics_Button13);
	helper.highLightElement(driver, showAnalytics_Button13);
	
	helper.highLightElement(driver, showAnalytics_Button13);
	String linkText1 = showAnalytics_Button13.getAttribute("href");
	
	String idString = null;
	
	String[] splitStringid = linkText1.split("/");
	for(int i=0;i<splitStringid.length;i++) {
		String actualDate=splitStringid[splitStringid.length-1]; 
		System.out.println("actualDate : " + actualDate);
		Reporter.log("<B><font color = 'blue'> ==> -</font> ID of the 13th Ad = " + actualDate);
		break;
	}
	
	
	helper.jsCLick(showAnalytics_Button13);
	Reporter.log("<B><font color = 'blue'> ==> -</font> Clicked on showAnalytics Button");
	
	Set<String> S3=driver.getWindowHandles();
    Iterator<String>it2=S3.iterator();
    String parent2=it2.next();
    String child2=it2.next();
    
    driver.switchTo().window(child2);
    
    helper.waitForPageToLoad();
    helper.waitFor(Last_Seen_childWindow);
    helper.highLightElement(driver, Last_Seen_childWindow);
    String lastSeenDate_yesterday = Last_Seen_childWindow.getText();
    Reporter.log("<B><font color = 'blue'> ==> -</font> Last_Seen_childWindow AdDetails Page= " +  lastSeenDate_yesterday);
    
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
	Assert.assertEquals(imageDate, joinString);
	Reporter.log("<B><font color = 'blue'> ==> -</font> Image Date = "+" "+imageDate+"    ::    " + "Last Seeen Date = "+joinString+" "+" are same == PASS");

    }
    catch(Exception e) {
    	System.out.println("Oops! Looks like we don't have data for this search criteria yet.");
    	 Reporter.log("<B><font color = 'red'> ==> -</font> Oops! Looks like we don't have data for this search criteria yet.");
    }
	

	Reporter.log("");
	Reporter.log("<B><font color = 'Blue-Violet'> 14th Ad -</font> ");
	
	helper.waitFor(current_date14);
	try{
	helper.highLightElement(driver, current_date14);
	String imageDate = current_date14.getText();
	System.out.println("current_Date_Yesterday : " + imageDate);
	Reporter.log("<B><font color = 'blue'> ==> -</font> Clicked On current_Date_yesterday Image = " + imageDate);
	
	helper.Scrollintoview(showAnalytics_Button14);
	helper.waitFor(showAnalytics_Button14);
	helper.highLightElement(driver, showAnalytics_Button14);
	
	helper.highLightElement(driver, showAnalytics_Button14);
	String linkText1 = showAnalytics_Button14.getAttribute("href");
	
	String idString = null;
	
	String[] splitStringid = linkText1.split("/");
	for(int i=0;i<splitStringid.length;i++) {
		String actualDate=splitStringid[splitStringid.length-1]; 
		System.out.println("actualDate : " + actualDate);
		Reporter.log("<B><font color = 'blue'> ==> -</font> ID of the 14th Ad = " + actualDate);
		break;
	}
	
	
	helper.jsCLick(showAnalytics_Button14);
	Reporter.log("<B><font color = 'blue'> ==> -</font> Clicked on showAnalytics Button");
	
	Set<String> S3=driver.getWindowHandles();
    Iterator<String>it2=S3.iterator();
    String parent2=it2.next();
    String child2=it2.next();
    
    driver.switchTo().window(child2);
    
    helper.waitForPageToLoad();
    helper.waitFor(Last_Seen_childWindow);
    helper.highLightElement(driver, Last_Seen_childWindow);
    String lastSeenDate_yesterday = Last_Seen_childWindow.getText();
    Reporter.log("<B><font color = 'blue'> ==> -</font> Last_Seen_childWindow AdDetails Page= " +  lastSeenDate_yesterday);
    
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
	Assert.assertEquals(imageDate, joinString);
	Reporter.log("<B><font color = 'blue'> ==> -</font> Image Date = "+" "+imageDate+"    ::    " + "Last Seeen Date = "+joinString+" "+" are same == PASS");

    }
    catch(Exception e) {
    	System.out.println("Oops! Looks like we don't have data for this search criteria yet.");
    	 Reporter.log("<B><font color = 'red'> ==> -</font> Oops! Looks like we don't have data for this search criteria yet.");
    }
	

	Reporter.log("");
	Reporter.log("<B><font color = 'Blue-Violet'> 15th Ad -</font> ");
	
	helper.waitFor(current_date15);
	try{
	helper.highLightElement(driver, current_date15);
	String imageDate = current_date15.getText();
	System.out.println("current_Date_Yesterday : " + imageDate);
	Reporter.log("<B><font color = 'blue'> ==> -</font> Clicked On current_Date_yesterday Image = " + imageDate);
	
	helper.Scrollintoview(showAnalytics_Button15);
	helper.waitFor(showAnalytics_Button15);
	helper.highLightElement(driver, showAnalytics_Button15);
	
	helper.highLightElement(driver, showAnalytics_Button15);
	String linkText1 = showAnalytics_Button15.getAttribute("href");
	
	String idString = null;
	
	String[] splitStringid = linkText1.split("/");
	for(int i=0;i<splitStringid.length;i++) {
		String actualDate=splitStringid[splitStringid.length-1]; 
		System.out.println("actualDate : " + actualDate);
		Reporter.log("<B><font color = 'blue'> ==> -</font> ID of the 15th Ad = " + actualDate);
		break;
	}
	
	helper.jsCLick(showAnalytics_Button15);
	Reporter.log("<B><font color = 'blue'> ==> -</font> Clicked on showAnalytics Button");
	
	Set<String> S3=driver.getWindowHandles();
    Iterator<String>it2=S3.iterator();
    String parent2=it2.next();
    String child2=it2.next();
    
    driver.switchTo().window(child2);
    
    helper.waitForPageToLoad();
    helper.waitFor(Last_Seen_childWindow);
    helper.highLightElement(driver, Last_Seen_childWindow);
    String lastSeenDate_yesterday = Last_Seen_childWindow.getText();
    Reporter.log("<B><font color = 'blue'> ==> -</font> Last_Seen_childWindow AdDetails Page= " +  lastSeenDate_yesterday);
    
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
	Assert.assertEquals(imageDate, joinString);
	Reporter.log("<B><font color = 'blue'> ==> -</font> Image Date = "+" "+imageDate+"    ::    " + "Last Seeen Date = "+joinString+" "+" are same == PASS");

    }
    catch(Exception e) {
    	System.out.println("Oops! Looks like we don't have data for this search criteria yet.");
    	 Reporter.log("<B><font color = 'red'> ==> -</font> Oops! Looks like we don't have data for this search criteria yet.");
    }
   
    //Last seen Seven Days
    Reporter.log("");
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


	Reporter.log("");
	Reporter.log("<B><font color = 'Blue-Violet'> 1st Ad -</font> ");
    helper.waitFor(current_date1);
    try {
	helper.highLightElement(driver, current_date1);
	String imageDate = current_date1.getText();
	System.out.println("current_Date_LastSevenDays : " + imageDate);
	Reporter.log("<B><font color = 'blue'> ==> -</font> Clicked On Last_Seven_Days Image = " + imageDate);
	
	helper.Scrollintoview(showAnalytics_Button1);
	helper.waitFor(showAnalytics_Button1);
	helper.highLightElement(driver, showAnalytics_Button1);
	
	helper.highLightElement(driver, showAnalytics_Button1);
	String linkText1 = showAnalytics_Button1.getAttribute("href");
	
	String idString = null;
	
	String[] splitStringid = linkText1.split("/");
	for(int i=0;i<splitStringid.length;i++) {
		String actualDate=splitStringid[splitStringid.length-1]; 
		System.out.println("actualDate : " + actualDate);
		Reporter.log("<B><font color = 'blue'> ==> -</font> ID of the 1st Ad = " + actualDate);
		break;
	}
	helper.jsCLick(showAnalytics_Button1);
	Reporter.log("<B><font color = 'blue'> ==> -</font> Clicked on showAnalytics Button");
	
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
    Reporter.log("<B><font color = 'blue'> ==> -</font> Last_Seen_childWindow AdDetails Page= " +  lastSeenDate_Last_Seven_Days);
    
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
	Assert.assertEquals(imageDate, joinString);
	Reporter.log("<B><font color = 'blue'> ==> -</font> Image Date = "+" "+imageDate+"    ::    " + "Last Seeen Date = "+joinString+" "+" are same == PASS");

    }
    catch(Exception e) {
    	System.out.println("Oops! Looks like we don't have data for this search criteria yet.");
    	 Reporter.log("<B><font color = 'red'> ==> -</font> Oops! Looks like we don't have data for this search criteria yet.");
    }
    
	Reporter.log("");
	Reporter.log("<B><font color = 'Blue-Violet'> 2nd Ad -</font> ");
    helper.waitFor(current_date2);
    try {
	helper.highLightElement(driver, current_date2);
	String imageDate = current_date2.getText();
	System.out.println("current_Date_LastSevenDays : " + imageDate);
	Reporter.log("<B><font color = 'blue'> ==> -</font> Clicked On Last_Seven_Days Image = " + imageDate);
	
	helper.Scrollintoview(showAnalytics_Button2);
	helper.waitFor(showAnalytics_Button2);
	helper.highLightElement(driver, showAnalytics_Button2);
	
	helper.highLightElement(driver, showAnalytics_Button2);
	String linkText1 = showAnalytics_Button2.getAttribute("href");
	
	String idString = null;
	
	String[] splitStringid = linkText1.split("/");
	for(int i=0;i<splitStringid.length;i++) {
		String actualDate=splitStringid[splitStringid.length-1]; 
		System.out.println("actualDate : " + actualDate);
		Reporter.log("<B><font color = 'blue'> ==> -</font> ID of the 2nd Ad = " + actualDate);
		break;
	}
	helper.jsCLick(showAnalytics_Button2);
	Reporter.log("<B><font color = 'blue'> ==> -</font> Clicked on showAnalytics Button");
	
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
    Reporter.log("<B><font color = 'blue'> ==> -</font> Last_Seen_childWindow AdDetails Page= " +  lastSeenDate_Last_Seven_Days);
    
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
	Assert.assertEquals(imageDate, joinString);
	Reporter.log("<B><font color = 'blue'> ==> -</font> Image Date = "+" "+imageDate+"    ::    " + "Last Seeen Date = "+joinString+" "+" are same == PASS");

    }
    catch(Exception e) {
    	System.out.println("Oops! Looks like we don't have data for this search criteria yet.");
    	 Reporter.log("<B><font color = 'red'> ==> -</font> Oops! Looks like we don't have data for this search criteria yet.");
    }
    
    Reporter.log("");
	Reporter.log("<B><font color = 'Blue-Violet'> 3rd Ad -</font> ");
    helper.waitFor(current_date3);
    try {
	helper.highLightElement(driver, current_date3);
	String imageDate = current_date3.getText();
	System.out.println("current_Date_LastSevenDays : " + imageDate);
	Reporter.log("<B><font color = 'blue'> ==> -</font> Clicked On Last_Seven_Days Image = " + imageDate);
	
	helper.Scrollintoview(showAnalytics_Button3);
	helper.waitFor(showAnalytics_Button3);
	helper.highLightElement(driver, showAnalytics_Button3);
	
	helper.highLightElement(driver, showAnalytics_Button3);
	String linkText1 = showAnalytics_Button3.getAttribute("href");
	
	String idString = null;
	
	String[] splitStringid = linkText1.split("/");
	for(int i=0;i<splitStringid.length;i++) {
		String actualDate=splitStringid[splitStringid.length-1]; 
		System.out.println("actualDate : " + actualDate);
		Reporter.log("<B><font color = 'blue'> ==> -</font> ID of the 3rd Ad = " + actualDate);
		break;
	}
	helper.jsCLick(showAnalytics_Button3);
	Reporter.log("<B><font color = 'blue'> ==> -</font> Clicked on showAnalytics Button");
	
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
    Reporter.log("<B><font color = 'blue'> ==> -</font> Last_Seen_childWindow AdDetails Page= " +  lastSeenDate_Last_Seven_Days);
    
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
	Assert.assertEquals(imageDate, joinString);
	Reporter.log("<B><font color = 'blue'> ==> -</font> Image Date = "+" "+imageDate+"    ::    " + "Last Seeen Date = "+joinString+" "+" are same == PASS");

    }
    catch(Exception e) {
    	System.out.println("Oops! Looks like we don't have data for this search criteria yet.");
    	 Reporter.log("<B><font color = 'red'> ==> -</font> Oops! Looks like we don't have data for this search criteria yet.");
    }
    
    Reporter.log("");
	Reporter.log("<B><font color = 'Blue-Violet'> 4th Ad -</font> ");
    helper.waitFor(current_date4);
    try {
	helper.highLightElement(driver, current_date4);
	String imageDate = current_date4.getText();
	System.out.println("current_Date_LastSevenDays : " + imageDate);
	Reporter.log("<B><font color = 'blue'> ==> -</font> Clicked On Last_Seven_Days Image = " + imageDate);
	
	helper.Scrollintoview(showAnalytics_Button4);
	helper.waitFor(showAnalytics_Button4);
	helper.highLightElement(driver, showAnalytics_Button4);
	
	helper.highLightElement(driver, showAnalytics_Button4);
	String linkText1 = showAnalytics_Button4.getAttribute("href");
	
	String idString = null;
	
	String[] splitStringid = linkText1.split("/");
	for(int i=0;i<splitStringid.length;i++) {
		String actualDate=splitStringid[splitStringid.length-1]; 
		System.out.println("actualDate : " + actualDate);
		Reporter.log("<B><font color = 'blue'> ==> -</font> ID of the 4th Ad = " + actualDate);
		break;
	}
	helper.jsCLick(showAnalytics_Button4);
	Reporter.log("<B><font color = 'blue'> ==> -</font> Clicked on showAnalytics Button");
	
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
    Reporter.log("<B><font color = 'blue'> ==> -</font> Last_Seen_childWindow AdDetails Page= " +  lastSeenDate_Last_Seven_Days);
    
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
	Assert.assertEquals(imageDate, joinString);
	Reporter.log("<B><font color = 'blue'> ==> -</font> Image Date = "+" "+imageDate+"    ::    " + "Last Seeen Date = "+joinString+" "+" are same == PASS");

    }
    catch(Exception e) {
    	System.out.println("Oops! Looks like we don't have data for this search criteria yet.");
    	 Reporter.log("<B><font color = 'red'> ==> -</font> Oops! Looks like we don't have data for this search criteria yet.");
    }
    
    Reporter.log("");
	Reporter.log("<B><font color = 'Blue-Violet'> 5th Ad -</font> ");
    helper.waitFor(current_date5);
    try {
	helper.highLightElement(driver, current_date5);
	String imageDate = current_date5.getText();
	System.out.println("current_Date_LastSevenDays : " + imageDate);
	Reporter.log("<B><font color = 'blue'> ==> -</font> Clicked On Last_Seven_Days Image = " + imageDate);
	
	helper.Scrollintoview(showAnalytics_Button5);
	helper.waitFor(showAnalytics_Button5);
	helper.highLightElement(driver, showAnalytics_Button5);
	
	helper.highLightElement(driver, showAnalytics_Button5);
	String linkText1 = showAnalytics_Button5.getAttribute("href");
	
	String idString = null;
	
	String[] splitStringid = linkText1.split("/");
	for(int i=0;i<splitStringid.length;i++) {
		String actualDate=splitStringid[splitStringid.length-1]; 
		System.out.println("actualDate : " + actualDate);
		Reporter.log("<B><font color = 'blue'> ==> -</font> ID of the 5th Ad = " + actualDate);
		break;
	}
	helper.jsCLick(showAnalytics_Button5);
	Reporter.log("<B><font color = 'blue'> ==> -</font> Clicked on showAnalytics Button");
	
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
    Reporter.log("<B><font color = 'blue'> ==> -</font> Last_Seen_childWindow AdDetails Page= " +  lastSeenDate_Last_Seven_Days);
    
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
	Assert.assertEquals(imageDate, joinString);
	Reporter.log("<B><font color = 'blue'> ==> -</font> Image Date = "+" "+imageDate+"    ::    " + "Last Seeen Date = "+joinString+" "+" are same == PASS");

    }
    catch(Exception e) {
    	System.out.println("Oops! Looks like we don't have data for this search criteria yet.");
    	 Reporter.log("<B><font color = 'red'> ==> -</font> Oops! Looks like we don't have data for this search criteria yet.");
    }
    
    Reporter.log("");
	Reporter.log("<B><font color = 'Blue-Violet'> 6th Ad -</font> ");
    helper.waitFor(current_date6);
    try {
	helper.highLightElement(driver, current_date6);
	String imageDate = current_date6.getText();
	System.out.println("current_Date_LastSevenDays : " + imageDate);
	Reporter.log("<B><font color = 'blue'> ==> -</font> Clicked On Last_Seven_Days Image = " + imageDate);
	
	helper.Scrollintoview(showAnalytics_Button6);
	helper.waitFor(showAnalytics_Button6);
	helper.highLightElement(driver, showAnalytics_Button6);
	
	helper.highLightElement(driver, showAnalytics_Button6);
	String linkText1 = showAnalytics_Button6.getAttribute("href");
	
	String idString = null;
	
	String[] splitStringid = linkText1.split("/");
	for(int i=0;i<splitStringid.length;i++) {
		String actualDate=splitStringid[splitStringid.length-1]; 
		System.out.println("actualDate : " + actualDate);
		Reporter.log("<B><font color = 'blue'> ==> -</font> ID of the 6th Ad = " + actualDate);
		break;
	}
	helper.jsCLick(showAnalytics_Button6);
	Reporter.log("<B><font color = 'blue'> ==> -</font> Clicked on showAnalytics Button");
	
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
    Reporter.log("<B><font color = 'blue'> ==> -</font> Last_Seen_childWindow AdDetails Page= " +  lastSeenDate_Last_Seven_Days);
    
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
	Assert.assertEquals(imageDate, joinString);
	Reporter.log("<B><font color = 'blue'> ==> -</font> Image Date = "+" "+imageDate+"    ::    " + "Last Seeen Date = "+joinString+" "+" are same == PASS");

    }
    catch(Exception e) {
    	System.out.println("Oops! Looks like we don't have data for this search criteria yet.");
    	 Reporter.log("<B><font color = 'red'> ==> -</font> Oops! Looks like we don't have data for this search criteria yet.");
    }
    
    Reporter.log("");
	Reporter.log("<B><font color = 'Blue-Violet'> 7th Ad -</font> ");
    helper.waitFor(current_date7);
    try {
	helper.highLightElement(driver, current_date7);
	String imageDate = current_date7.getText();
	System.out.println("current_Date_LastSevenDays : " + imageDate);
	Reporter.log("<B><font color = 'blue'> ==> -</font> Clicked On Last_Seven_Days Image = " + imageDate);
	
	helper.Scrollintoview(showAnalytics_Button7);
	helper.waitFor(showAnalytics_Button7);
	helper.highLightElement(driver, showAnalytics_Button7);
	
	helper.highLightElement(driver, showAnalytics_Button7);
	String linkText1 = showAnalytics_Button7.getAttribute("href");
	
	String idString = null;
	
	String[] splitStringid = linkText1.split("/");
	for(int i=0;i<splitStringid.length;i++) {
		String actualDate=splitStringid[splitStringid.length-1]; 
		System.out.println("actualDate : " + actualDate);
		Reporter.log("<B><font color = 'blue'> ==> -</font> ID of the 7th Ad = " + actualDate);
		break;
	}
	helper.jsCLick(showAnalytics_Button7);
	Reporter.log("<B><font color = 'blue'> ==> -</font> Clicked on showAnalytics Button");
	
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
    Reporter.log("<B><font color = 'blue'> ==> -</font> Last_Seen_childWindow AdDetails Page= " +  lastSeenDate_Last_Seven_Days);
    
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
	Assert.assertEquals(imageDate, joinString);
	Reporter.log("<B><font color = 'blue'> ==> -</font> Image Date = "+" "+imageDate+"    ::    " + "Last Seeen Date = "+joinString+" "+" are same == PASS");

    }
    catch(Exception e) {
    	System.out.println("Oops! Looks like we don't have data for this search criteria yet.");
    	 Reporter.log("<B><font color = 'red'> ==> -</font> Oops! Looks like we don't have data for this search criteria yet.");
    }
    
    Reporter.log("");
	Reporter.log("<B><font color = 'Blue-Violet'> 8th Ad -</font> ");
    helper.waitFor(current_date8);
    try {
	helper.highLightElement(driver, current_date8);
	String imageDate = current_date8.getText();
	System.out.println("current_Date_LastSevenDays : " + imageDate);
	Reporter.log("<B><font color = 'blue'> ==> -</font> Clicked On Last_Seven_Days Image = " + imageDate);
	
	helper.Scrollintoview(showAnalytics_Button8);
	helper.waitFor(showAnalytics_Button8);
	helper.highLightElement(driver, showAnalytics_Button8);
	
	helper.highLightElement(driver, showAnalytics_Button8);
	String linkText1 = showAnalytics_Button8.getAttribute("href");
	
	String idString = null;
	
	String[] splitStringid = linkText1.split("/");
	for(int i=0;i<splitStringid.length;i++) {
		String actualDate=splitStringid[splitStringid.length-1]; 
		System.out.println("actualDate : " + actualDate);
		Reporter.log("<B><font color = 'blue'> ==> -</font> ID of the 8th Ad = " + actualDate);
		break;
	}
	helper.jsCLick(showAnalytics_Button8);
	Reporter.log("<B><font color = 'blue'> ==> -</font> Clicked on showAnalytics Button");
	
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
    Reporter.log("<B><font color = 'blue'> ==> -</font> Last_Seen_childWindow AdDetails Page= " +  lastSeenDate_Last_Seven_Days);
    
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
	Assert.assertEquals(imageDate, joinString);
	Reporter.log("<B><font color = 'blue'> ==> -</font> Image Date = "+" "+imageDate+"    ::    " + "Last Seeen Date = "+joinString+" "+" are same == PASS");

    }
    catch(Exception e) {
    	System.out.println("Oops! Looks like we don't have data for this search criteria yet.");
    	 Reporter.log("<B><font color = 'red'> ==> -</font> Oops! Looks like we don't have data for this search criteria yet.");
    }
    
    Reporter.log("");
	Reporter.log("<B><font color = 'Blue-Violet'> 9th Ad -</font> ");
    helper.waitFor(current_date9);
    try {
	helper.highLightElement(driver, current_date9);
	String imageDate = current_date9.getText();
	System.out.println("current_Date_LastSevenDays : " + imageDate);
	Reporter.log("<B><font color = 'blue'> ==> -</font> Clicked On Last_Seven_Days Image = " + imageDate);
	
	helper.Scrollintoview(showAnalytics_Button9);
	helper.waitFor(showAnalytics_Button9);
	helper.highLightElement(driver, showAnalytics_Button9);
	
	helper.highLightElement(driver, showAnalytics_Button9);
	String linkText1 = showAnalytics_Button9.getAttribute("href");
	
	String idString = null;
	
	String[] splitStringid = linkText1.split("/");
	for(int i=0;i<splitStringid.length;i++) {
		String actualDate=splitStringid[splitStringid.length-1]; 
		System.out.println("actualDate : " + actualDate);
		Reporter.log("<B><font color = 'blue'> ==> -</font> ID of the 9th Ad = " + actualDate);
		break;
	}
	helper.jsCLick(showAnalytics_Button9);
	Reporter.log("<B><font color = 'blue'> ==> -</font> Clicked on showAnalytics Button");
	
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
    Reporter.log("<B><font color = 'blue'> ==> -</font> Last_Seen_childWindow AdDetails Page= " +  lastSeenDate_Last_Seven_Days);
    
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
	Assert.assertEquals(imageDate, joinString);
	Reporter.log("<B><font color = 'blue'> ==> -</font> Image Date = "+" "+imageDate+"    ::    " + "Last Seeen Date = "+joinString+" "+" are same == PASS");

    }
    catch(Exception e) {
    	System.out.println("Oops! Looks like we don't have data for this search criteria yet.");
    	 Reporter.log("<B><font color = 'red'> ==> -</font> Oops! Looks like we don't have data for this search criteria yet.");
    }
    
    Reporter.log("");
	Reporter.log("<B><font color = 'Blue-Violet'> 10th Ad -</font> ");
    helper.waitFor(current_date10);
    try {
	helper.highLightElement(driver, current_date10);
	String imageDate = current_date10.getText();
	System.out.println("current_Date_LastSevenDays : " + imageDate);
	Reporter.log("<B><font color = 'blue'> ==> -</font> Clicked On Last_Seven_Days Image = " + imageDate);
	
	helper.Scrollintoview(showAnalytics_Button10);
	helper.waitFor(showAnalytics_Button10);
	helper.highLightElement(driver, showAnalytics_Button10);
	
	helper.highLightElement(driver, showAnalytics_Button10);
	String linkText1 = showAnalytics_Button10.getAttribute("href");
	
	String idString = null;
	
	String[] splitStringid = linkText1.split("/");
	for(int i=0;i<splitStringid.length;i++) {
		String actualDate=splitStringid[splitStringid.length-1]; 
		System.out.println("actualDate : " + actualDate);
		Reporter.log("<B><font color = 'blue'> ==> -</font> ID of the 10th Ad = " + actualDate);
		break;
	}
	helper.jsCLick(showAnalytics_Button10);
	Reporter.log("<B><font color = 'blue'> ==> -</font> Clicked on showAnalytics Button");
	
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
    Reporter.log("<B><font color = 'blue'> ==> -</font> Last_Seen_childWindow AdDetails Page= " +  lastSeenDate_Last_Seven_Days);
    
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
	Assert.assertEquals(imageDate, joinString);
	Reporter.log("<B><font color = 'blue'> ==> -</font> Image Date = "+" "+imageDate+"    ::    " + "Last Seeen Date = "+joinString+" "+" are same == PASS");

    }
    catch(Exception e) {
    	System.out.println("Oops! Looks like we don't have data for this search criteria yet.");
    	 Reporter.log("<B><font color = 'red'> ==> -</font> Oops! Looks like we don't have data for this search criteria yet.");
    }
    
    Reporter.log("");
	Reporter.log("<B><font color = 'Blue-Violet'> 11th Ad -</font> ");
    helper.waitFor(current_date11);
    try {
	helper.highLightElement(driver, current_date11);
	String imageDate = current_date11.getText();
	System.out.println("current_Date_LastSevenDays : " + imageDate);
	Reporter.log("<B><font color = 'blue'> ==> -</font> Clicked On Last_Seven_Days Image = " + imageDate);
	
	helper.Scrollintoview(showAnalytics_Button11);
	helper.waitFor(showAnalytics_Button11);
	helper.highLightElement(driver, showAnalytics_Button11);
	
	helper.highLightElement(driver, showAnalytics_Button11);
	String linkText1 = showAnalytics_Button11.getAttribute("href");
	
	String idString = null;
	
	String[] splitStringid = linkText1.split("/");
	for(int i=0;i<splitStringid.length;i++) {
		String actualDate=splitStringid[splitStringid.length-1]; 
		System.out.println("actualDate : " + actualDate);
		Reporter.log("<B><font color = 'blue'> ==> -</font> ID of the 11th Ad = " + actualDate);
		break;
	}
	helper.jsCLick(showAnalytics_Button11);
	Reporter.log("<B><font color = 'blue'> ==> -</font> Clicked on showAnalytics Button");
	
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
    Reporter.log("<B><font color = 'blue'> ==> -</font> Last_Seen_childWindow AdDetails Page= " +  lastSeenDate_Last_Seven_Days);
    
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
	Assert.assertEquals(imageDate, joinString);
	Reporter.log("<B><font color = 'blue'> ==> -</font> Image Date = "+" "+imageDate+"    ::    " + "Last Seeen Date = "+joinString+" "+" are same == PASS");

    }
    catch(Exception e) {
    	System.out.println("Oops! Looks like we don't have data for this search criteria yet.");
    	 Reporter.log("<B><font color = 'red'> ==> -</font> Oops! Looks like we don't have data for this search criteria yet.");
    }
    
    Reporter.log("");
	Reporter.log("<B><font color = 'Blue-Violet'> 12th Ad -</font> ");
    helper.waitFor(current_date12);
    try {
	helper.highLightElement(driver, current_date12);
	String imageDate = current_date12.getText();
	System.out.println("current_Date_LastSevenDays : " + imageDate);
	Reporter.log("<B><font color = 'blue'> ==> -</font> Clicked On Last_Seven_Days Image = " + imageDate);
	
	helper.Scrollintoview(showAnalytics_Button12);
	helper.waitFor(showAnalytics_Button12);
	helper.highLightElement(driver, showAnalytics_Button12);
	
	helper.highLightElement(driver, showAnalytics_Button12);
	String linkText1 = showAnalytics_Button12.getAttribute("href");
	
	String idString = null;
	
	String[] splitStringid = linkText1.split("/");
	for(int i=0;i<splitStringid.length;i++) {
		String actualDate=splitStringid[splitStringid.length-1]; 
		System.out.println("actualDate : " + actualDate);
		Reporter.log("<B><font color = 'blue'> ==> -</font> ID of the 12th Ad = " + actualDate);
		break;
	}
	helper.jsCLick(showAnalytics_Button12);
	Reporter.log("<B><font color = 'blue'> ==> -</font> Clicked on showAnalytics Button");
	
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
    Reporter.log("<B><font color = 'blue'> ==> -</font> Last_Seen_childWindow AdDetails Page= " +  lastSeenDate_Last_Seven_Days);
    
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
	Assert.assertEquals(imageDate, joinString);
	Reporter.log("<B><font color = 'blue'> ==> -</font> Image Date = "+" "+imageDate+"    ::    " + "Last Seeen Date = "+joinString+" "+" are same == PASS");

    }
    catch(Exception e) {
    	System.out.println("Oops! Looks like we don't have data for this search criteria yet.");
    	 Reporter.log("<B><font color = 'red'> ==> -</font> Oops! Looks like we don't have data for this search criteria yet.");
    }
    
    Reporter.log("");
	Reporter.log("<B><font color = 'Blue-Violet'> 13th Ad -</font> ");
    helper.waitFor(current_date13);
    try {
	helper.highLightElement(driver, current_date13);
	String imageDate = current_date13.getText();
	System.out.println("current_Date_LastSevenDays : " + imageDate);
	Reporter.log("<B><font color = 'blue'> ==> -</font> Clicked On Last_Seven_Days Image = " + imageDate);
	
	helper.Scrollintoview(showAnalytics_Button13);
	helper.waitFor(showAnalytics_Button13);
	helper.highLightElement(driver, showAnalytics_Button13);
	
	helper.highLightElement(driver, showAnalytics_Button13);
	String linkText1 = showAnalytics_Button13.getAttribute("href");
	
	String idString = null;
	
	String[] splitStringid = linkText1.split("/");
	for(int i=0;i<splitStringid.length;i++) {
		String actualDate=splitStringid[splitStringid.length-1]; 
		System.out.println("actualDate : " + actualDate);
		Reporter.log("<B><font color = 'blue'> ==> -</font> ID of the 13th Ad = " + actualDate);
		break;
	}
	helper.jsCLick(showAnalytics_Button13);
	Reporter.log("<B><font color = 'blue'> ==> -</font> Clicked on showAnalytics Button");
	
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
    Reporter.log("<B><font color = 'blue'> ==> -</font> Last_Seen_childWindow AdDetails Page= " +  lastSeenDate_Last_Seven_Days);
    
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
	Assert.assertEquals(imageDate, joinString);
	Reporter.log("<B><font color = 'blue'> ==> -</font> Image Date = "+" "+imageDate+"    ::    " + "Last Seeen Date = "+joinString+" "+" are same == PASS");

    }
    catch(Exception e) {
    	System.out.println("Oops! Looks like we don't have data for this search criteria yet.");
    	 Reporter.log("<B><font color = 'red'> ==> -</font> Oops! Looks like we don't have data for this search criteria yet.");
    }
    
    Reporter.log("");
	Reporter.log("<B><font color = 'Blue-Violet'> 14th Ad -</font> ");
    helper.waitFor(current_date14);
    try {
	helper.highLightElement(driver, current_date14);
	String imageDate = current_date14.getText();
	System.out.println("current_Date_LastSevenDays : " + imageDate);
	Reporter.log("<B><font color = 'blue'> ==> -</font> Clicked On Last_Seven_Days Image = " + imageDate);
	
	helper.Scrollintoview(showAnalytics_Button14);
	helper.waitFor(showAnalytics_Button14);
	helper.highLightElement(driver, showAnalytics_Button14);
	
	helper.highLightElement(driver, showAnalytics_Button14);
	String linkText1 = showAnalytics_Button14.getAttribute("href");
	
	String idString = null;
	
	String[] splitStringid = linkText1.split("/");
	for(int i=0;i<splitStringid.length;i++) {
		String actualDate=splitStringid[splitStringid.length-1]; 
		System.out.println("actualDate : " + actualDate);
		Reporter.log("<B><font color = 'blue'> ==> -</font> ID of the 14th Ad = " + actualDate);
		break;
	}
	helper.jsCLick(showAnalytics_Button14);
	Reporter.log("<B><font color = 'blue'> ==> -</font> Clicked on showAnalytics Button");
	
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
    Reporter.log("<B><font color = 'blue'> ==> -</font> Last_Seen_childWindow AdDetails Page= " +  lastSeenDate_Last_Seven_Days);
    
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
	Assert.assertEquals(imageDate, joinString);
	Reporter.log("<B><font color = 'blue'> ==> -</font> Image Date = "+" "+imageDate+"    ::    " + "Last Seeen Date = "+joinString+" "+" are same == PASS");

    }
    catch(Exception e) {
    	System.out.println("Oops! Looks like we don't have data for this search criteria yet.");
    	 Reporter.log("<B><font color = 'red'> ==> -</font> Oops! Looks like we don't have data for this search criteria yet.");
    }
    
    Reporter.log("");
	Reporter.log("<B><font color = 'Blue-Violet'> 15th Ad -</font> ");
    helper.waitFor(current_date15);
    try {
	helper.highLightElement(driver, current_date15);
	String imageDate = current_date15.getText();
	System.out.println("current_Date_LastSevenDays : " + imageDate);
	Reporter.log("<B><font color = 'blue'> ==> -</font> Clicked On Last_Seven_Days Image = " + imageDate);
	
	helper.Scrollintoview(showAnalytics_Button15);
	helper.waitFor(showAnalytics_Button15);
	helper.highLightElement(driver, showAnalytics_Button15);
	
	helper.highLightElement(driver, showAnalytics_Button15);
	String linkText1 = showAnalytics_Button15.getAttribute("href");
	
	String idString = null;
	
	String[] splitStringid = linkText1.split("/");
	for(int i=0;i<splitStringid.length;i++) {
		String actualDate=splitStringid[splitStringid.length-1]; 
		System.out.println("actualDate : " + actualDate);
		Reporter.log("<B><font color = 'blue'> ==> -</font> ID of the 15th Ad = " + actualDate);
		break;
	}
	helper.jsCLick(showAnalytics_Button15);
	Reporter.log("<B><font color = 'blue'> ==> -</font> Clicked on showAnalytics Button");
	
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
    Reporter.log("<B><font color = 'blue'> ==> -</font> Last_Seen_childWindow AdDetails Page= " +  lastSeenDate_Last_Seven_Days);
    
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
	Assert.assertEquals(imageDate, joinString);
	Reporter.log("<B><font color = 'blue'> ==> -</font> Image Date = "+" "+imageDate+"    ::    " + "Last Seeen Date = "+joinString+" "+" are same == PASS");

    }
    catch(Exception e) {
    	System.out.println("Oops! Looks like we don't have data for this search criteria yet.");
    	 Reporter.log("<B><font color = 'red'> ==> -</font> Oops! Looks like we don't have data for this search criteria yet.");
    }
    
    //Last Seen Thirty Days
    
	Reporter.log("");
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
	
	Reporter.log("");
	Reporter.log("<B><font color = 'Blue-Violet'> 1st Ad -</font> ");

    try {
   	helper.Scrollintoview(current_date1);
    helper.waitFor(current_date1);
	helper.highLightElement(driver, current_date1);
	String imageDate = current_date1.getText();
	System.out.println("current_Date_LastThirtyDays  : " + imageDate);
	Reporter.log("<B><font color = 'blue'> ==> -</font> Clicked On Last_Thirty_Days Image = " + imageDate);
	
	helper.Scrollintoview(showAnalytics_Button1);
	helper.waitFor(showAnalytics_Button1);
	helper.highLightElement(driver, showAnalytics_Button1);
	helper.highLightElement(driver, showAnalytics_Button1);
	String linkText1 = showAnalytics_Button1.getAttribute("href");
	helper.getAdID(linkText1);
	helper.jsCLick(showAnalytics_Button1);
	Reporter.log("<B><font color = 'blue'> ==> -</font> Clicked on showAnalytics Button");
	
	Set<String> S4=driver.getWindowHandles();
    Iterator<String>it3=S4.iterator();
    String parent3=it3.next();
    String child3=it3.next();
    
    driver.switchTo().window(child3);
    
    helper.waitForPageToLoad();
    helper.waitFor(Last_Seen_childWindow);
    helper.highLightElement(driver, Last_Seen_childWindow);
    String lastSeenDate_Last_Thirty_Days = Last_Seen_childWindow.getText();
    Reporter.log("<B><font color = 'blue'> ==> -</font> Last_Seen_childWindow AdDetails Page= " +  lastSeenDate_Last_Thirty_Days);
    
    driver.close();
    
    driver.switchTo().window(parent3);

    helper.getLastseenDate(lastSeenDate_Last_Thirty_Days, imageDate);
    }
    catch(Exception e) {
    	System.out.println("Oops! Looks like we don't have data for this search criteria yet.");
    	 Reporter.log("<B><font color = 'red'> ==> -</font> Oops! Looks like we don't have data for this search criteria yet.");
    }
   
	Reporter.log("");
	Reporter.log("<B><font color = 'Blue-Violet'> 2nd Ad -</font> ");
	
    try {
   	helper.Scrollintoview(current_date2);
    helper.waitFor(current_date2);
	helper.highLightElement(driver, current_date2);
	String imageDate = current_date2.getText();
	System.out.println("current_Date_LastThirtyDays  : " + imageDate);
	Reporter.log("<B><font color = 'blue'> ==> -</font> Clicked On Last_Thirty_Days Image = " + imageDate);
	
	helper.Scrollintoview(showAnalytics_Button2);
	helper.waitFor(showAnalytics_Button2);
	helper.highLightElement(driver, showAnalytics_Button2);
	String linkText1 = showAnalytics_Button2.getAttribute("href");
	helper.getAdID(linkText1);
	helper.jsCLick(showAnalytics_Button2);
	Reporter.log("<B><font color = 'blue'> ==> -</font> Clicked on showAnalytics Button");
	
	Set<String> S4=driver.getWindowHandles();
    Iterator<String>it3=S4.iterator();
    String parent3=it3.next();
    String child3=it3.next();
    
    driver.switchTo().window(child3);
    
    helper.waitForPageToLoad();
    helper.waitFor(Last_Seen_childWindow);
    helper.highLightElement(driver, Last_Seen_childWindow);
    String lastSeenDate_Last_Thirty_Days = Last_Seen_childWindow.getText();
    Reporter.log("<B><font color = 'blue'> ==> -</font> Last_Seen_childWindow AdDetails Page= " +  lastSeenDate_Last_Thirty_Days);
    
    driver.close();
    
    driver.switchTo().window(parent3);
 
    helper.getLastseenDate(lastSeenDate_Last_Thirty_Days, imageDate);
    }
    catch(Exception e) {
    	System.out.println("Oops! Looks like we don't have data for this search criteria yet.");
    	 Reporter.log("<B><font color = 'red'> ==> -</font> Oops! Looks like we don't have data for this search criteria yet.");
    }
   
    Reporter.log("");
	Reporter.log("<B><font color = 'Blue-Violet'> 3rd Ad -</font> ");
	
    try {
   	helper.Scrollintoview(current_date3);
    helper.waitFor(current_date3);
	helper.highLightElement(driver, current_date3);
	String imageDate = current_date3.getText();
	System.out.println("current_Date_LastThirtyDays  : " + imageDate);
	Reporter.log("<B><font color = 'blue'> ==> -</font> Clicked On Last_Thirty_Days Image = " + imageDate);
	
	helper.Scrollintoview(showAnalytics_Button3);
	helper.waitFor(showAnalytics_Button3);
	helper.highLightElement(driver, showAnalytics_Button3);
	String linkText1 = showAnalytics_Button3.getAttribute("href");
	helper.getAdID(linkText1);
	helper.jsCLick(showAnalytics_Button3);
	Reporter.log("<B><font color = 'blue'> ==> -</font> Clicked on showAnalytics Button");
	
	Set<String> S4=driver.getWindowHandles();
    Iterator<String>it3=S4.iterator();
    String parent3=it3.next();
    String child3=it3.next();
    
    driver.switchTo().window(child3);
    
    helper.waitForPageToLoad();
    helper.waitFor(Last_Seen_childWindow);
    helper.highLightElement(driver, Last_Seen_childWindow);
    String lastSeenDate_Last_Thirty_Days = Last_Seen_childWindow.getText();
    Reporter.log("<B><font color = 'blue'> ==> -</font> Last_Seen_childWindow AdDetails Page= " +  lastSeenDate_Last_Thirty_Days);
    
    driver.close();
    
    driver.switchTo().window(parent3);
    
    helper.getLastseenDate(lastSeenDate_Last_Thirty_Days, imageDate);
    }
    catch(Exception e) {
    	System.out.println("Oops! Looks like we don't have data for this search criteria yet.");
    	 Reporter.log("<B><font color = 'red'> ==> -</font> Oops! Looks like we don't have data for this search criteria yet.");
    }
    
    Reporter.log("");
  	Reporter.log("<B><font color = 'Blue-Violet'> 4th Ad -</font> ");
  
    try {
    helper.Scrollintoview(current_date4);
    helper.waitFor(current_date4);
  	helper.highLightElement(driver, current_date4);
  	String imageDate = current_date4.getText();
  	System.out.println("current_Date_LastThirtyDays  : " + imageDate);
  	Reporter.log("<B><font color = 'blue'> ==> -</font> Clicked On Last_Thirty_Days Image = " + imageDate);
  	
  	helper.Scrollintoview(showAnalytics_Button4);
  	helper.waitFor(showAnalytics_Button4);
  	helper.highLightElement(driver, showAnalytics_Button4);
	String linkText1 = showAnalytics_Button4.getAttribute("href");
	helper.getAdID(linkText1);
  	helper.jsCLick(showAnalytics_Button4);
  	Reporter.log("<B><font color = 'blue'> ==> -</font> Clicked on showAnalytics Button");
  	
  	Set<String> S4=driver.getWindowHandles();
      Iterator<String>it3=S4.iterator();
      String parent3=it3.next();
      String child3=it3.next();
      
      driver.switchTo().window(child3);
      
      helper.waitForPageToLoad();
      helper.waitFor(Last_Seen_childWindow);
      helper.highLightElement(driver, Last_Seen_childWindow);
      String lastSeenDate_Last_Thirty_Days = Last_Seen_childWindow.getText();
      Reporter.log("<B><font color = 'blue'> ==> -</font> Last_Seen_childWindow AdDetails Page= " +  lastSeenDate_Last_Thirty_Days);
      
      driver.close();
      
      driver.switchTo().window(parent3);
      
      helper.getLastseenDate(lastSeenDate_Last_Thirty_Days, imageDate);
      }
      catch(Exception e) {
      	System.out.println("Oops! Looks like we don't have data for this search criteria yet.");
      	 Reporter.log("<B><font color = 'red'> ==> -</font> Oops! Looks like we don't have data for this search criteria yet.");
      }
      
      Reporter.log("");
  	Reporter.log("<B><font color = 'Blue-Violet'> 5th Ad -</font> ");
 
    try {
	helper.Scrollintoview(current_date5);
    helper.waitFor(current_date5);
  	helper.highLightElement(driver, current_date5);
  	String imageDate = current_date5.getText();
  	System.out.println("current_Date_LastThirtyDays  : " + imageDate);
  	Reporter.log("<B><font color = 'blue'> ==> -</font> Clicked On Last_Thirty_Days Image = " + imageDate);
  	
  	helper.Scrollintoview(showAnalytics_Button5);
  	helper.waitFor(showAnalytics_Button5);
  	helper.highLightElement(driver, showAnalytics_Button5);
	String linkText1 = showAnalytics_Button5.getAttribute("href");
	helper.getAdID(linkText1);
  	helper.jsCLick(showAnalytics_Button5);
  	Reporter.log("<B><font color = 'blue'> ==> -</font> Clicked on showAnalytics Button");
  	
  	Set<String> S4=driver.getWindowHandles();
      Iterator<String>it3=S4.iterator();
      String parent3=it3.next();
      String child3=it3.next();
      
      driver.switchTo().window(child3);
      
      helper.waitForPageToLoad();
      helper.waitFor(Last_Seen_childWindow);
      helper.highLightElement(driver, Last_Seen_childWindow);
      String lastSeenDate_Last_Thirty_Days = Last_Seen_childWindow.getText();
      Reporter.log("<B><font color = 'blue'> ==> -</font> Last_Seen_childWindow AdDetails Page= " +  lastSeenDate_Last_Thirty_Days);
      
      driver.close();
      
      driver.switchTo().window(parent3);
      
      helper.getLastseenDate(lastSeenDate_Last_Thirty_Days, imageDate);
      }
      catch(Exception e) {
      	System.out.println("Oops! Looks like we don't have data for this search criteria yet.");
      	 Reporter.log("<B><font color = 'red'> ==> -</font> Oops! Looks like we don't have data for this search criteria yet.");
      }
      
      Reporter.log("");
  	Reporter.log("<B><font color = 'Blue-Violet'> 6th Ad -</font> ");
  
    try {
    helper.Scrollintoview(current_date6);
    helper.waitFor(current_date6);	  
  	helper.highLightElement(driver, current_date6);
  	String imageDate = current_date6.getText();
  	System.out.println("current_Date_LastThirtyDays  : " + imageDate);
  	Reporter.log("<B><font color = 'blue'> ==> -</font> Clicked On Last_Thirty_Days Image = " + imageDate);
  	
  	helper.Scrollintoview(showAnalytics_Button6);
  	helper.waitFor(showAnalytics_Button6);
  	helper.highLightElement(driver, showAnalytics_Button6);
	String linkText1 = showAnalytics_Button6.getAttribute("href");
	helper.getAdID(linkText1);
  	helper.jsCLick(showAnalytics_Button6);
  	Reporter.log("<B><font color = 'blue'> ==> -</font> Clicked on showAnalytics Button");
  	
  	Set<String> S4=driver.getWindowHandles();
      Iterator<String>it3=S4.iterator();
      String parent3=it3.next();
      String child3=it3.next();
      
      driver.switchTo().window(child3);
      
      helper.waitForPageToLoad();
      helper.waitFor(Last_Seen_childWindow);
      helper.highLightElement(driver, Last_Seen_childWindow);
      String lastSeenDate_Last_Thirty_Days = Last_Seen_childWindow.getText();
      Reporter.log("<B><font color = 'blue'> ==> -</font> Last_Seen_childWindow AdDetails Page= " +  lastSeenDate_Last_Thirty_Days);
      
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
  	Assert.assertEquals(imageDate, joinString);
  	Reporter.log("<B><font color = 'blue'> ==> -</font> Image Date = "+" "+imageDate+"    ::    " + "Last Seeen Date = "+joinString+" "+" are same == PASS");

      }
      catch(Exception e) {
      	System.out.println("Oops! Looks like we don't have data for this search criteria yet.");
      	 Reporter.log("<B><font color = 'red'> ==> -</font> Oops! Looks like we don't have data for this search criteria yet.");
      }
      
      Reporter.log("");
  	Reporter.log("<B><font color = 'Blue-Violet'> 7th Ad -</font> ");
  	helper.Scrollintoview(current_date7);
      helper.waitFor(current_date7);
      try {
  	helper.highLightElement(driver, current_date7);
  	String imageDate = current_date7.getText();
  	System.out.println("current_Date_LastThirtyDays  : " + imageDate);
  	Reporter.log("<B><font color = 'blue'> ==> -</font> Clicked On Last_Thirty_Days Image = " + imageDate);
  	
  	helper.Scrollintoview(showAnalytics_Button7);
  	helper.waitFor(showAnalytics_Button7);
  	helper.highLightElement(driver, showAnalytics_Button7);
  	
  	helper.highLightElement(driver, showAnalytics_Button7);
	String linkText1 = showAnalytics_Button7.getAttribute("href");
	
	String idString = null;
	
	String[] splitStringid = linkText1.split("/");
	for(int i=0;i<splitStringid.length;i++) {
		String actualDate=splitStringid[splitStringid.length-1]; 
		System.out.println("actualDate : " + actualDate);
		Reporter.log("<B><font color = 'blue'> ==> -</font> ID of the 7th Ad = " + actualDate);
		break;
	}
  	helper.jsCLick(showAnalytics_Button7);
  	Reporter.log("<B><font color = 'blue'> ==> -</font> Clicked on showAnalytics Button");
  	
  	Set<String> S4=driver.getWindowHandles();
      Iterator<String>it3=S4.iterator();
      String parent3=it3.next();
      String child3=it3.next();
      
      driver.switchTo().window(child3);
      
      helper.waitForPageToLoad();
      helper.waitFor(Last_Seen_childWindow);
      helper.highLightElement(driver, Last_Seen_childWindow);
      String lastSeenDate_Last_Thirty_Days = Last_Seen_childWindow.getText();
      Reporter.log("<B><font color = 'blue'> ==> -</font> Last_Seen_childWindow AdDetails Page= " +  lastSeenDate_Last_Thirty_Days);
      
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
  	Assert.assertEquals(imageDate, joinString);
  	Reporter.log("<B><font color = 'blue'> ==> -</font> Image Date = "+" "+imageDate+"    ::    " + "Last Seeen Date = "+joinString+" "+" are same == PASS");

      }
      catch(Exception e) {
      	System.out.println("Oops! Looks like we don't have data for this search criteria yet.");
      	 Reporter.log("<B><font color = 'red'> ==> -</font> Oops! Looks like we don't have data for this search criteria yet.");
      }
      
      Reporter.log("");
  	Reporter.log("<B><font color = 'Blue-Violet'> 8th Ad -</font> ");
  	helper.Scrollintoview(current_date8);
      helper.waitFor(current_date8);
      try {
  	helper.highLightElement(driver, current_date8);
  	String imageDate = current_date8.getText();
  	System.out.println("current_Date_LastThirtyDays  : " + imageDate);
  	Reporter.log("<B><font color = 'blue'> ==> -</font> Clicked On Last_Thirty_Days Image = " + imageDate);
  	
  	helper.Scrollintoview(showAnalytics_Button8);
  	helper.waitFor(showAnalytics_Button8);
  	helper.highLightElement(driver, showAnalytics_Button8);
  	
  	helper.highLightElement(driver, showAnalytics_Button8);
	String linkText1 = showAnalytics_Button8.getAttribute("href");
	
	String idString = null;
	
	String[] splitStringid = linkText1.split("/");
	for(int i=0;i<splitStringid.length;i++) {
		String actualDate=splitStringid[splitStringid.length-1]; 
		System.out.println("actualDate : " + actualDate);
		Reporter.log("<B><font color = 'blue'> ==> -</font> ID of the 8th Ad = " + actualDate);
		break;
	}
  	helper.jsCLick(showAnalytics_Button8);
  	Reporter.log("<B><font color = 'blue'> ==> -</font> Clicked on showAnalytics Button");
  	
  	Set<String> S4=driver.getWindowHandles();
      Iterator<String>it3=S4.iterator();
      String parent3=it3.next();
      String child3=it3.next();
      
      driver.switchTo().window(child3);
      
      helper.waitForPageToLoad();
      helper.waitFor(Last_Seen_childWindow);
      helper.highLightElement(driver, Last_Seen_childWindow);
      String lastSeenDate_Last_Thirty_Days = Last_Seen_childWindow.getText();
      Reporter.log("<B><font color = 'blue'> ==> -</font> Last_Seen_childWindow AdDetails Page= " +  lastSeenDate_Last_Thirty_Days);
      
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
  	Assert.assertEquals(imageDate, joinString);
  	Reporter.log("<B><font color = 'blue'> ==> -</font> Image Date = "+" "+imageDate+"    ::    " + "Last Seeen Date = "+joinString+" "+" are same == PASS");

      }
      catch(Exception e) {
      	System.out.println("Oops! Looks like we don't have data for this search criteria yet.");
      	 Reporter.log("<B><font color = 'red'> ==> -</font> Oops! Looks like we don't have data for this search criteria yet.");
      }
      
      Reporter.log("");
  	Reporter.log("<B><font color = 'Blue-Violet'> 9th Ad -</font> ");
  	helper.Scrollintoview(current_date9);
      helper.waitFor(current_date9);
      try {
  	helper.highLightElement(driver, current_date9);
  	String imageDate = current_date9.getText();
  	System.out.println("current_Date_LastThirtyDays  : " + imageDate);
  	Reporter.log("<B><font color = 'blue'> ==> -</font> Clicked On Last_Thirty_Days Image = " + imageDate);
  	
  	helper.Scrollintoview(showAnalytics_Button9);
  	helper.waitFor(showAnalytics_Button9);
  	helper.highLightElement(driver, showAnalytics_Button9);
  	
  	helper.highLightElement(driver, showAnalytics_Button9);
	String linkText1 = showAnalytics_Button9.getAttribute("href");
	
	String idString = null;
	
	String[] splitStringid = linkText1.split("/");
	for(int i=0;i<splitStringid.length;i++) {
		String actualDate=splitStringid[splitStringid.length-1]; 
		System.out.println("actualDate : " + actualDate);
		Reporter.log("<B><font color = 'blue'> ==> -</font> ID of the 9th Ad = " + actualDate);
		break;
	}
  	helper.jsCLick(showAnalytics_Button9);
  	Reporter.log("<B><font color = 'blue'> ==> -</font> Clicked on showAnalytics Button");
  	
  	Set<String> S4=driver.getWindowHandles();
      Iterator<String>it3=S4.iterator();
      String parent3=it3.next();
      String child3=it3.next();
      
      driver.switchTo().window(child3);
      
      helper.waitForPageToLoad();
      helper.waitFor(Last_Seen_childWindow);
      helper.highLightElement(driver, Last_Seen_childWindow);
      String lastSeenDate_Last_Thirty_Days = Last_Seen_childWindow.getText();
      Reporter.log("<B><font color = 'blue'> ==> -</font> Last_Seen_childWindow AdDetails Page= " +  lastSeenDate_Last_Thirty_Days);
      
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
  	Assert.assertEquals(imageDate, joinString);
  	Reporter.log("<B><font color = 'blue'> ==> -</font> Image Date = "+" "+imageDate+"    ::    " + "Last Seeen Date = "+joinString+" "+" are same == PASS");

      }
      catch(Exception e) {
      	System.out.println("Oops! Looks like we don't have data for this search criteria yet.");
      	 Reporter.log("<B><font color = 'red'> ==> -</font> Oops! Looks like we don't have data for this search criteria yet.");
      }
      
      Reporter.log("");
  	Reporter.log("<B><font color = 'Blue-Violet'> 10th Ad -</font> ");
  	helper.Scrollintoview(current_date10);
      helper.waitFor(current_date10);
      try {
  	helper.highLightElement(driver, current_date10);
  	String imageDate = current_date10.getText();
  	System.out.println("current_Date_LastThirtyDays  : " + imageDate);
  	Reporter.log("<B><font color = 'blue'> ==> -</font> Clicked On Last_Thirty_Days Image = " + imageDate);
  	
  	helper.Scrollintoview(showAnalytics_Button10);
  	helper.waitFor(showAnalytics_Button10);
  	helper.highLightElement(driver, showAnalytics_Button10);
  	
  	helper.highLightElement(driver, showAnalytics_Button10);
	String linkText1 = showAnalytics_Button10.getAttribute("href");
	
	String idString = null;
	
	String[] splitStringid = linkText1.split("/");
	for(int i=0;i<splitStringid.length;i++) {
		String actualDate=splitStringid[splitStringid.length-1]; 
		System.out.println("actualDate : " + actualDate);
		Reporter.log("<B><font color = 'blue'> ==> -</font> ID of the 10th Ad = " + actualDate);
		break;
	}
  	helper.jsCLick(showAnalytics_Button10);
  	Reporter.log("<B><font color = 'blue'> ==> -</font> Clicked on showAnalytics Button");
  	
  	Set<String> S4=driver.getWindowHandles();
      Iterator<String>it3=S4.iterator();
      String parent3=it3.next();
      String child3=it3.next();
      
      driver.switchTo().window(child3);
      
      helper.waitForPageToLoad();
      helper.waitFor(Last_Seen_childWindow);
      helper.highLightElement(driver, Last_Seen_childWindow);
      String lastSeenDate_Last_Thirty_Days = Last_Seen_childWindow.getText();
      Reporter.log("<B><font color = 'blue'> ==> -</font> Last_Seen_childWindow AdDetails Page= " +  lastSeenDate_Last_Thirty_Days);
      
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
  	Assert.assertEquals(imageDate, joinString);
  	Reporter.log("<B><font color = 'blue'> ==> -</font> Image Date = "+" "+imageDate+"    ::    " + "Last Seeen Date = "+joinString+" "+" are same == PASS");

      }
      catch(Exception e) {
      	System.out.println("Oops! Looks like we don't have data for this search criteria yet.");
      	 Reporter.log("<B><font color = 'red'> ==> -</font> Oops! Looks like we don't have data for this search criteria yet.");
      }
      
      Reporter.log("");
  	Reporter.log("<B><font color = 'Blue-Violet'> 11th Ad -</font> ");
  	helper.Scrollintoview(current_date11);
      helper.waitFor(current_date11);
      try {
  	helper.highLightElement(driver, current_date11);
  	String imageDate = current_date11.getText();
  	System.out.println("current_Date_LastThirtyDays  : " + imageDate);
  	Reporter.log("<B><font color = 'blue'> ==> -</font> Clicked On Last_Thirty_Days Image = " + imageDate);
  	
  	helper.Scrollintoview(showAnalytics_Button11);
  	helper.waitFor(showAnalytics_Button11);
  	helper.highLightElement(driver, showAnalytics_Button11);
  	
  	helper.highLightElement(driver, showAnalytics_Button11);
	String linkText1 = showAnalytics_Button11.getAttribute("href");
	
	String idString = null;
	
	String[] splitStringid = linkText1.split("/");
	for(int i=0;i<splitStringid.length;i++) {
		String actualDate=splitStringid[splitStringid.length-1]; 
		System.out.println("actualDate : " + actualDate);
		Reporter.log("<B><font color = 'blue'> ==> -</font> ID of the 11th Ad = " + actualDate);
		break;
	}
  	helper.jsCLick(showAnalytics_Button11);
  	Reporter.log("<B><font color = 'blue'> ==> -</font> Clicked on showAnalytics Button");
  	
  	Set<String> S4=driver.getWindowHandles();
      Iterator<String>it3=S4.iterator();
      String parent3=it3.next();
      String child3=it3.next();
      
      driver.switchTo().window(child3);
      
      helper.waitForPageToLoad();
      helper.waitFor(Last_Seen_childWindow);
      helper.highLightElement(driver, Last_Seen_childWindow);
      String lastSeenDate_Last_Thirty_Days = Last_Seen_childWindow.getText();
      Reporter.log("<B><font color = 'blue'> ==> -</font> Last_Seen_childWindow AdDetails Page= " +  lastSeenDate_Last_Thirty_Days);
      
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
  	Assert.assertEquals(imageDate, joinString);
  	Reporter.log("<B><font color = 'blue'> ==> -</font> Image Date = "+" "+imageDate+"    ::    " + "Last Seeen Date = "+joinString+" "+" are same == PASS");

      }
      catch(Exception e) {
      	System.out.println("Oops! Looks like we don't have data for this search criteria yet.");
      	 Reporter.log("<B><font color = 'red'> ==> -</font> Oops! Looks like we don't have data for this search criteria yet.");
      }
      
      Reporter.log("");
  	Reporter.log("<B><font color = 'Blue-Violet'> 12 Ad -</font> ");
  	helper.Scrollintoview(current_date12);
      helper.waitFor(current_date12);
      try {
  	helper.highLightElement(driver, current_date12);
  	String imageDate = current_date12.getText();
  	System.out.println("current_Date_LastThirtyDays  : " + imageDate);
  	Reporter.log("<B><font color = 'blue'> ==> -</font> Clicked On Last_Thirty_Days Image = " + imageDate);
  	
  	helper.Scrollintoview(showAnalytics_Button12);
  	helper.waitFor(showAnalytics_Button12);
  	helper.highLightElement(driver, showAnalytics_Button12);
  	
  	helper.highLightElement(driver, showAnalytics_Button12);
	String linkText1 = showAnalytics_Button12.getAttribute("href");
	
	String idString = null;
	
	String[] splitStringid = linkText1.split("/");
	for(int i=0;i<splitStringid.length;i++) {
		String actualDate=splitStringid[splitStringid.length-1]; 
		System.out.println("actualDate : " + actualDate);
		Reporter.log("<B><font color = 'blue'> ==> -</font> ID of the 12th Ad = " + actualDate);
		break;
	}
  	helper.jsCLick(showAnalytics_Button12);
  	Reporter.log("<B><font color = 'blue'> ==> -</font> Clicked on showAnalytics Button");
  	
  	Set<String> S4=driver.getWindowHandles();
      Iterator<String>it3=S4.iterator();
      String parent3=it3.next();
      String child3=it3.next();
      
      driver.switchTo().window(child3);
      
      helper.waitForPageToLoad();
      helper.waitFor(Last_Seen_childWindow);
      helper.highLightElement(driver, Last_Seen_childWindow);
      String lastSeenDate_Last_Thirty_Days = Last_Seen_childWindow.getText();
      Reporter.log("<B><font color = 'blue'> ==> -</font> Last_Seen_childWindow AdDetails Page= " +  lastSeenDate_Last_Thirty_Days);
      
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
  	Assert.assertEquals(imageDate, joinString);
  	Reporter.log("<B><font color = 'blue'> ==> -</font> Image Date = "+" "+imageDate+"    ::    " + "Last Seeen Date = "+joinString+" "+" are same == PASS");

      }
      catch(Exception e) {
      	System.out.println("Oops! Looks like we don't have data for this search criteria yet.");
      	 Reporter.log("<B><font color = 'red'> ==> -</font> Oops! Looks like we don't have data for this search criteria yet.");
      }
      
      Reporter.log("");
  	Reporter.log("<B><font color = 'Blue-Violet'> 13th Ad -</font> ");
  	helper.Scrollintoview(current_date13);
      helper.waitFor(current_date13);
      try {
  	helper.highLightElement(driver, current_date13);
  	String imageDate = current_date13.getText();
  	System.out.println("current_Date_LastThirtyDays  : " + imageDate);
  	Reporter.log("<B><font color = 'blue'> ==> -</font> Clicked On Last_Thirty_Days Image = " + imageDate);
  	
  	helper.Scrollintoview(showAnalytics_Button13);
  	helper.waitFor(showAnalytics_Button13);
  	helper.highLightElement(driver, showAnalytics_Button13);
  	
  	helper.highLightElement(driver, showAnalytics_Button13);
	String linkText1 = showAnalytics_Button13.getAttribute("href");
	
	String idString = null;
	
	String[] splitStringid = linkText1.split("/");
	for(int i=0;i<splitStringid.length;i++) {
		String actualDate=splitStringid[splitStringid.length-1]; 
		System.out.println("actualDate : " + actualDate);
		Reporter.log("<B><font color = 'blue'> ==> -</font> ID of the 13th Ad = " + actualDate);
		break;
	}
  	helper.jsCLick(showAnalytics_Button13);
  	Reporter.log("<B><font color = 'blue'> ==> -</font> Clicked on showAnalytics Button");
  	
  	Set<String> S4=driver.getWindowHandles();
      Iterator<String>it3=S4.iterator();
      String parent3=it3.next();
      String child3=it3.next();
      
      driver.switchTo().window(child3);
      
      helper.waitForPageToLoad();
      helper.waitFor(Last_Seen_childWindow);
      helper.highLightElement(driver, Last_Seen_childWindow);
      String lastSeenDate_Last_Thirty_Days = Last_Seen_childWindow.getText();
      Reporter.log("<B><font color = 'blue'> ==> -</font> Last_Seen_childWindow AdDetails Page= " +  lastSeenDate_Last_Thirty_Days);
      
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
  	Assert.assertEquals(imageDate, joinString);
  	Reporter.log("<B><font color = 'blue'> ==> -</font> Image Date = "+" "+imageDate+"    ::    " + "Last Seeen Date = "+joinString+" "+" are same == PASS");

      }
      catch(Exception e) {
      	System.out.println("Oops! Looks like we don't have data for this search criteria yet.");
      	 Reporter.log("<B><font color = 'red'> ==> -</font> Oops! Looks like we don't have data for this search criteria yet.");
      }
      
      Reporter.log("");
  	Reporter.log("<B><font color = 'Blue-Violet'> 14th Ad -</font> ");
  	helper.Scrollintoview(current_date14);
      helper.waitFor(current_date14);
      try {
  	helper.highLightElement(driver, current_date14);
  	String imageDate = current_date14.getText();
  	System.out.println("current_Date_LastThirtyDays  : " + imageDate);
  	Reporter.log("<B><font color = 'blue'> ==> -</font> Clicked On Last_Thirty_Days Image = " + imageDate);
  	
  	helper.Scrollintoview(showAnalytics_Button14);
  	helper.waitFor(showAnalytics_Button14);
  	helper.highLightElement(driver, showAnalytics_Button14);
  	
  	helper.highLightElement(driver, showAnalytics_Button14);
	String linkText1 = showAnalytics_Button14.getAttribute("href");
	
	String idString = null;
	
	String[] splitStringid = linkText1.split("/");
	for(int i=0;i<splitStringid.length;i++) {
		String actualDate=splitStringid[splitStringid.length-1]; 
		System.out.println("actualDate : " + actualDate);
		Reporter.log("<B><font color = 'blue'> ==> -</font> ID of the 14th Ad = " + actualDate);
		break;
	}
  	helper.jsCLick(showAnalytics_Button14);
  	Reporter.log("<B><font color = 'blue'> ==> -</font> Clicked on showAnalytics Button");
  	
  	Set<String> S4=driver.getWindowHandles();
      Iterator<String>it3=S4.iterator();
      String parent3=it3.next();
      String child3=it3.next();
      
      driver.switchTo().window(child3);
      
      helper.waitForPageToLoad();
      helper.waitFor(Last_Seen_childWindow);
      helper.highLightElement(driver, Last_Seen_childWindow);
      String lastSeenDate_Last_Thirty_Days = Last_Seen_childWindow.getText();
      Reporter.log("<B><font color = 'blue'> ==> -</font> Last_Seen_childWindow AdDetails Page= " +  lastSeenDate_Last_Thirty_Days);
      
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
  	Assert.assertEquals(imageDate, joinString);
  	Reporter.log("<B><font color = 'blue'> ==> -</font> Image Date = "+" "+imageDate+"    ::    " + "Last Seeen Date = "+joinString+" "+" are same == PASS");

      }
      catch(Exception e) {
      	System.out.println("Oops! Looks like we don't have data for this search criteria yet.");
      	 Reporter.log("<B><font color = 'red'> ==> -</font> Oops! Looks like we don't have data for this search criteria yet.");
      }
      
      Reporter.log("");
  	Reporter.log("<B><font color = 'Blue-Violet'> 15th Ad -</font> ");
  	helper.Scrollintoview(current_date15);
      helper.waitFor(current_date15);
      try {
  	helper.highLightElement(driver, current_date15);
  	String imageDate = current_date15.getText();
  	System.out.println("current_Date_LastThirtyDays  : " + imageDate);
  	Reporter.log("<B><font color = 'blue'> ==> -</font> Clicked On Last_Thirty_Days Image = " + imageDate);
  	
  	helper.Scrollintoview(showAnalytics_Button15);
  	helper.waitFor(showAnalytics_Button15);
  	helper.highLightElement(driver, showAnalytics_Button15);
  	
  	helper.highLightElement(driver, showAnalytics_Button15);
	String linkText1 = showAnalytics_Button15.getAttribute("href");
	
	String idString = null;
	
	String[] splitStringid = linkText1.split("/");
	for(int i=0;i<splitStringid.length;i++) {
		String actualDate=splitStringid[splitStringid.length-1]; 
		System.out.println("actualDate : " + actualDate);
		Reporter.log("<B><font color = 'blue'> ==> -</font> ID of the 15th Ad = " + actualDate);
		break;
	}
  	helper.jsCLick(showAnalytics_Button15);
  	Reporter.log("<B><font color = 'blue'> ==> -</font> Clicked on showAnalytics Button");
  	
  	Set<String> S4=driver.getWindowHandles();
      Iterator<String>it3=S4.iterator();
      String parent3=it3.next();
      String child3=it3.next();
      
      driver.switchTo().window(child3);
      
      helper.waitForPageToLoad();
      helper.waitFor(Last_Seen_childWindow);
      helper.highLightElement(driver, Last_Seen_childWindow);
      String lastSeenDate_Last_Thirty_Days = Last_Seen_childWindow.getText();
      Reporter.log("<B><font color = 'blue'> ==> -</font> Last_Seen_childWindow AdDetails Page= " +  lastSeenDate_Last_Thirty_Days);
      
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
  	Assert.assertEquals(imageDate, joinString);
  	Reporter.log("<B><font color = 'blue'> ==> -</font> Image Date = "+" "+imageDate+"    ::    " + "Last Seeen Date = "+joinString+" "+" are same == PASS");

      }
      catch(Exception e) {
      	System.out.println("Oops! Looks like we don't have data for this search criteria yet.");
      	 Reporter.log("<B><font color = 'red'> ==> -</font> Oops! Looks like we don't have data for this search criteria yet.");
      }
   		//This Month

	Reporter.log("");
    Reporter.log("<B><font color = 'green'> Ads Seen Between :This_Month_Button -</font> ");
	  
    helper.waitFor(clearSearchField);
	helper.highLightElement(driver, clearSearchField);
	helper.jsCLick(clearSearchField);
	Reporter.log("<B><font color = 'orange'> Step 1 -</font> Clicked On clear search.");
	
	helper.waitFor(ads_Seen_Between_Button);
	helper.highLightElement(driver, ads_Seen_Between_Button);
	helper.jsCLick(ads_Seen_Between_Button);
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
	
	Reporter.log("");
	Reporter.log("<B><font color = 'Blue-Violet'> 1st Ad -</font> ");
	
	
    try {
  	helper.Scrollintoview(current_date1);
    helper.waitFor(current_date1);
	helper.highLightElement(driver, current_date1);
	String imageDate = current_date1.getText();
	System.out.println("current_Date_ThisMonth : " + imageDate);
	Reporter.log("<B><font color = 'blue'> ==> -</font> Clicked On This Month Image = " + imageDate);
	
	helper.Scrollintoview(showAnalytics_Button1);
	helper.waitFor(showAnalytics_Button1);
	helper.highLightElement(driver, showAnalytics_Button1);
	helper.highLightElement(driver, showAnalytics_Button1);
	String linkText1 = showAnalytics_Button1.getAttribute("href");
	helper.getAdID(linkText1);
	helper.jsCLick(showAnalytics_Button1);
	Reporter.log("<B><font color = 'blue'> ==> -</font> Clicked on showAnalytics Button");
	
	Set<String> S5=driver.getWindowHandles();
    Iterator<String>it4=S5.iterator();
    String parent4=it4.next();
    String child4=it4.next();
    
    driver.switchTo().window(child4);
    
    helper.waitForPageToLoad();
    helper.waitFor(Last_Seen_childWindow);
    helper.highLightElement(driver, Last_Seen_childWindow);
    String lastSeenDate_This_Month= Last_Seen_childWindow.getText();
    Reporter.log("<B><font color = 'blue'> ==> -</font> Last_Seen_childWindow AdDetails Page= " +  lastSeenDate_This_Month);
    
    driver.close();
    
    driver.switchTo().window(parent4);
    
    helper.getLastseenDate(lastSeenDate_This_Month, imageDate);
    }
    catch(Exception e) {
    	System.out.println("Oops! Looks like we don't have data for this search criteria yet.");
    	 Reporter.log("<B><font color = 'red'> ==> -</font> Oops! Looks like we don't have data for this search criteria yet.");
    }
    

	Reporter.log("");
	Reporter.log("<B><font color = 'Blue-Violet'> 2nd Ad -</font> ");
	
	
    try {
   	helper.Scrollintoview(current_date2);
    helper.waitFor(current_date2);
	helper.highLightElement(driver, current_date2);
	String imageDate = current_date2.getText();
	System.out.println("current_Date_ThisMonth : " + imageDate);
	Reporter.log("<B><font color = 'blue'> ==> -</font> Clicked On This Month Image = " + imageDate);
	
	helper.Scrollintoview(showAnalytics_Button2);
	helper.waitFor(showAnalytics_Button2);
	helper.highLightElement(driver, showAnalytics_Button2);
	helper.highLightElement(driver, showAnalytics_Button2);
	String linkText1 = showAnalytics_Button2.getAttribute("href");
	helper.getAdID(linkText1);
	helper.jsCLick(showAnalytics_Button2);
	Reporter.log("<B><font color = 'blue'> ==> -</font> Clicked on showAnalytics Button");
	
	Set<String> S5=driver.getWindowHandles();
    Iterator<String>it4=S5.iterator();
    String parent4=it4.next();
    String child4=it4.next();
    
    driver.switchTo().window(child4);
    
    helper.waitForPageToLoad();
    helper.waitFor(Last_Seen_childWindow);
    helper.highLightElement(driver, Last_Seen_childWindow);
    String lastSeenDate_This_Month= Last_Seen_childWindow.getText();
    Reporter.log("<B><font color = 'blue'> ==> -</font> Last_Seen_childWindow AdDetails Page= " +  lastSeenDate_This_Month);
    
    driver.close();
    
    driver.switchTo().window(parent4);
    
    helper.getLastseenDate(lastSeenDate_This_Month, imageDate);
    }
    catch(Exception e) {
    	System.out.println("Oops! Looks like we don't have data for this search criteria yet.");
    	 Reporter.log("<B><font color = 'red'> ==> -</font> Oops! Looks like we don't have data for this search criteria yet.");
    }
    

	Reporter.log("");
	Reporter.log("<B><font color = 'Blue-Violet'> 3rd Ad -</font> ");
	
	
    try {
   	helper.Scrollintoview(current_date3);
    helper.waitFor(current_date3);
	helper.highLightElement(driver, current_date3);
	String imageDate = current_date3.getText();
	System.out.println("current_Date_ThisMonth : " + imageDate);
	Reporter.log("<B><font color = 'blue'> ==> -</font> Clicked On This Month Image = " + imageDate);
	
	helper.Scrollintoview(showAnalytics_Button3);
	helper.waitFor(showAnalytics_Button3);
	helper.highLightElement(driver, showAnalytics_Button3);
	helper.highLightElement(driver, showAnalytics_Button3);
	String linkText1 = showAnalytics_Button3.getAttribute("href");
	helper.getAdID(linkText1);
	helper.jsCLick(showAnalytics_Button3);
	Reporter.log("<B><font color = 'blue'> ==> -</font> Clicked on showAnalytics Button");
	
	Set<String> S5=driver.getWindowHandles();
    Iterator<String>it4=S5.iterator();
    String parent4=it4.next();
    String child4=it4.next();
    
    driver.switchTo().window(child4);
    
    helper.waitForPageToLoad();
    helper.waitFor(Last_Seen_childWindow);
    helper.highLightElement(driver, Last_Seen_childWindow);
    String lastSeenDate_This_Month= Last_Seen_childWindow.getText();
    Reporter.log("<B><font color = 'blue'> ==> -</font> Last_Seen_childWindow AdDetails Page= " +  lastSeenDate_This_Month);
    
    driver.close();
    
    driver.switchTo().window(parent4);
  
    helper.getLastseenDate(lastSeenDate_This_Month, imageDate);
    }
    catch(Exception e) {
    	System.out.println("Oops! Looks like we don't have data for this search criteria yet.");
    	 Reporter.log("<B><font color = 'red'> ==> -</font> Oops! Looks like we don't have data for this search criteria yet.");
    }
    

	Reporter.log("");
	Reporter.log("<B><font color = 'Blue-Violet'> 4th Ad -</font> ");
	
	
    try {
   	helper.Scrollintoview(current_date4);
    helper.waitFor(current_date4);
	helper.highLightElement(driver, current_date4);
	String imageDate = current_date4.getText();
	System.out.println("current_Date_ThisMonth : " + imageDate);
	Reporter.log("<B><font color = 'blue'> ==> -</font> Clicked On This Month Image = " + imageDate);
	
	helper.Scrollintoview(showAnalytics_Button4);
	helper.waitFor(showAnalytics_Button4);
	helper.highLightElement(driver, showAnalytics_Button4);
	helper.highLightElement(driver, showAnalytics_Button4);
	String linkText1 = showAnalytics_Button4.getAttribute("href");
	helper.getAdID(linkText1);
	helper.jsCLick(showAnalytics_Button4);
	Reporter.log("<B><font color = 'blue'> ==> -</font> Clicked on showAnalytics Button");
	
	Set<String> S5=driver.getWindowHandles();
    Iterator<String>it4=S5.iterator();
    String parent4=it4.next();
    String child4=it4.next();
    
    driver.switchTo().window(child4);
    
    helper.waitForPageToLoad();
    helper.waitFor(Last_Seen_childWindow);
    helper.highLightElement(driver, Last_Seen_childWindow);
    String lastSeenDate_This_Month= Last_Seen_childWindow.getText();
    Reporter.log("<B><font color = 'blue'> ==> -</font> Last_Seen_childWindow AdDetails Page= " +  lastSeenDate_This_Month);
    
    driver.close();
    
    driver.switchTo().window(parent4);

    helper.getLastseenDate(lastSeenDate_This_Month, imageDate);
    }
    catch(Exception e) {
    	System.out.println("Oops! Looks like we don't have data for this search criteria yet.");
    	 Reporter.log("<B><font color = 'red'> ==> -</font> Oops! Looks like we don't have data for this search criteria yet.");
    }
    
    Reporter.log("");
	Reporter.log("<B><font color = 'Blue-Violet'> 5th Ad -</font> ");
	

    try {
   	helper.Scrollintoview(current_date5);
    helper.waitFor(current_date5);
	helper.highLightElement(driver, current_date5);
	String imageDate = current_date5.getText();
	System.out.println("current_Date_ThisMonth : " + imageDate);
	Reporter.log("<B><font color = 'blue'> ==> -</font> Clicked On This Month Image = " + imageDate);
	
	helper.Scrollintoview(showAnalytics_Button5);
	helper.waitFor(showAnalytics_Button5);
	helper.highLightElement(driver, showAnalytics_Button5);
	helper.highLightElement(driver, showAnalytics_Button5);
	String linkText1 = showAnalytics_Button5.getAttribute("href");
	helper.getAdID(linkText1);
	helper.jsCLick(showAnalytics_Button5);
	Reporter.log("<B><font color = 'blue'> ==> -</font> Clicked on showAnalytics Button");
	
	Set<String> S5=driver.getWindowHandles();
    Iterator<String>it4=S5.iterator();
    String parent4=it4.next();
    String child4=it4.next();
    
    driver.switchTo().window(child4);
    
    helper.waitForPageToLoad();
    helper.waitFor(Last_Seen_childWindow);
    helper.highLightElement(driver, Last_Seen_childWindow);
    String lastSeenDate_This_Month= Last_Seen_childWindow.getText();
    Reporter.log("<B><font color = 'blue'> ==> -</font> Last_Seen_childWindow AdDetails Page= " +  lastSeenDate_This_Month);
    
    driver.close();
    
    driver.switchTo().window(parent4);
    
    helper.getLastseenDate(lastSeenDate_This_Month, imageDate);
    }
    catch(Exception e) {
    	System.out.println("Oops! Looks like we don't have data for this search criteria yet.");
    	 Reporter.log("<B><font color = 'red'> ==> -</font> Oops! Looks like we don't have data for this search criteria yet.");
    }
    
    Reporter.log("");
	Reporter.log("<B><font color = 'Blue-Violet'> 6th Ad -</font> ");
	
	
    try {
   	helper.Scrollintoview(current_date6);
    helper.waitFor(current_date6);
	helper.highLightElement(driver, current_date6);
	String imageDate = current_date6.getText();
	System.out.println("current_Date_ThisMonth : " + imageDate);
	Reporter.log("<B><font color = 'blue'> ==> -</font> Clicked On This Month Image = " + imageDate);
	
	helper.Scrollintoview(showAnalytics_Button6);
	helper.waitFor(showAnalytics_Button6);
	helper.highLightElement(driver, showAnalytics_Button6);
	helper.highLightElement(driver, showAnalytics_Button6);
	String linkText1 = showAnalytics_Button6.getAttribute("href");
	helper.getAdID(linkText1);
	helper.jsCLick(showAnalytics_Button6);
	Reporter.log("<B><font color = 'blue'> ==> -</font> Clicked on showAnalytics Button");
	
	Set<String> S5=driver.getWindowHandles();
    Iterator<String>it4=S5.iterator();
    String parent4=it4.next();
    String child4=it4.next();
    
    driver.switchTo().window(child4);
    
    helper.waitForPageToLoad();
    helper.waitFor(Last_Seen_childWindow);
    helper.highLightElement(driver, Last_Seen_childWindow);
    String lastSeenDate_This_Month= Last_Seen_childWindow.getText();
    Reporter.log("<B><font color = 'blue'> ==> -</font> Last_Seen_childWindow AdDetails Page= " +  lastSeenDate_This_Month);
    
    driver.close();
    
    driver.switchTo().window(parent4);

    helper.getLastseenDate(lastSeenDate_This_Month, imageDate);
    }
    catch(Exception e) {
    	System.out.println("Oops! Looks like we don't have data for this search criteria yet.");
    	 Reporter.log("<B><font color = 'red'> ==> -</font> Oops! Looks like we don't have data for this search criteria yet.");
    }
    
    Reporter.log("");
	Reporter.log("<B><font color = 'Blue-Violet'> 7th Ad -</font> ");
	
	
    try {
   	helper.Scrollintoview(current_date7);
    helper.waitFor(current_date7);
	helper.highLightElement(driver, current_date7);
	String imageDate = current_date7.getText();
	System.out.println("current_Date_ThisMonth : " + imageDate);
	Reporter.log("<B><font color = 'blue'> ==> -</font> Clicked On This Month Image = " + imageDate);
	
	helper.Scrollintoview(showAnalytics_Button7);
	helper.waitFor(showAnalytics_Button7);
	helper.highLightElement(driver, showAnalytics_Button7);
	helper.highLightElement(driver, showAnalytics_Button7);
	String linkText1 = showAnalytics_Button7.getAttribute("href");
	helper.getAdID(linkText1);
	helper.jsCLick(showAnalytics_Button7);
	Reporter.log("<B><font color = 'blue'> ==> -</font> Clicked on showAnalytics Button");
	
	Set<String> S5=driver.getWindowHandles();
    Iterator<String>it4=S5.iterator();
    String parent4=it4.next();
    String child4=it4.next();
    
    driver.switchTo().window(child4);
    
    helper.waitForPageToLoad();
    helper.waitFor(Last_Seen_childWindow);
    helper.highLightElement(driver, Last_Seen_childWindow);
    String lastSeenDate_This_Month= Last_Seen_childWindow.getText();
    Reporter.log("<B><font color = 'blue'> ==> -</font> Last_Seen_childWindow AdDetails Page= " +  lastSeenDate_This_Month);
    
    driver.close();
    
    driver.switchTo().window(parent4);
    
    helper.getLastseenDate(lastSeenDate_This_Month, imageDate);
    }
    catch(Exception e) {
    	System.out.println("Oops! Looks like we don't have data for this search criteria yet.");
    	 Reporter.log("<B><font color = 'red'> ==> -</font> Oops! Looks like we don't have data for this search criteria yet.");
    }
    
    Reporter.log("");
	Reporter.log("<B><font color = 'Blue-Violet'> 8th Ad -</font> ");
	

    try {
   	helper.Scrollintoview(current_date8);
    helper.waitFor(current_date8);
	helper.highLightElement(driver, current_date8);
	String imageDate = current_date8.getText();
	System.out.println("current_Date_ThisMonth : " + imageDate);
	Reporter.log("<B><font color = 'blue'> ==> -</font> Clicked On This Month Image = " + imageDate);
	
	helper.Scrollintoview(showAnalytics_Button8);
	helper.waitFor(showAnalytics_Button8);
	helper.highLightElement(driver, showAnalytics_Button8);
	String linkText1 = showAnalytics_Button8.getAttribute("href");
	helper.getAdID(linkText1);
	helper.jsCLick(showAnalytics_Button8);
	Reporter.log("<B><font color = 'blue'> ==> -</font> Clicked on showAnalytics Button");
	
	Set<String> S5=driver.getWindowHandles();
    Iterator<String>it4=S5.iterator();
    String parent4=it4.next();
    String child4=it4.next();
    
    driver.switchTo().window(child4);
    
    helper.waitForPageToLoad();
    helper.waitFor(Last_Seen_childWindow);
    helper.highLightElement(driver, Last_Seen_childWindow);
    String lastSeenDate_This_Month= Last_Seen_childWindow.getText();
    Reporter.log("<B><font color = 'blue'> ==> -</font> Last_Seen_childWindow AdDetails Page= " +  lastSeenDate_This_Month);
    
    driver.close();
    
    driver.switchTo().window(parent4);
    
    helper.getLastseenDate(lastSeenDate_This_Month, imageDate);
    }
    catch(Exception e) {
    	System.out.println("Oops! Looks like we don't have data for this search criteria yet.");
    	 Reporter.log("<B><font color = 'red'> ==> -</font> Oops! Looks like we don't have data for this search criteria yet.");
    }
    
    Reporter.log("");
	Reporter.log("<B><font color = 'Blue-Violet'> 9th Ad -</font> ");
	
	
    try {
  	helper.Scrollintoview(current_date9);
    helper.waitFor(current_date9);
	helper.highLightElement(driver, current_date9);
	String imageDate = current_date9.getText();
	System.out.println("current_Date_ThisMonth : " + imageDate);
	Reporter.log("<B><font color = 'blue'> ==> -</font> Clicked On This Month Image = " + imageDate);
	
	helper.Scrollintoview(showAnalytics_Button9);
	helper.waitFor(showAnalytics_Button9);
	helper.highLightElement(driver, showAnalytics_Button9);
	String linkText1 = showAnalytics_Button9.getAttribute("href");
	helper.getAdID(linkText1);
	helper.jsCLick(showAnalytics_Button9);
	Reporter.log("<B><font color = 'blue'> ==> -</font> Clicked on showAnalytics Button");
	
	Set<String> S5=driver.getWindowHandles();
    Iterator<String>it4=S5.iterator();
    String parent4=it4.next();
    String child4=it4.next();
    
    driver.switchTo().window(child4);
    
    helper.waitForPageToLoad();
    helper.waitFor(Last_Seen_childWindow);
    helper.highLightElement(driver, Last_Seen_childWindow);
    String lastSeenDate_This_Month= Last_Seen_childWindow.getText();
    Reporter.log("<B><font color = 'blue'> ==> -</font> Last_Seen_childWindow AdDetails Page= " +  lastSeenDate_This_Month);
    
    driver.close();
    
    driver.switchTo().window(parent4);
    
    helper.getLastseenDate(lastSeenDate_This_Month, imageDate);
    }
    catch(Exception e) {
    	System.out.println("Oops! Looks like we don't have data for this search criteria yet.");
    	 Reporter.log("<B><font color = 'red'> ==> -</font> Oops! Looks like we don't have data for this search criteria yet.");
    }
    
    Reporter.log("");
	Reporter.log("<B><font color = 'Blue-Violet'> 10th Ad -</font> ");
	
    try {
 	helper.Scrollintoview(current_date10);
    helper.waitFor(current_date10);
	helper.highLightElement(driver, current_date10);
	String imageDate = current_date10.getText();
	System.out.println("current_Date_ThisMonth : " + imageDate);
	Reporter.log("<B><font color = 'blue'> ==> -</font> Clicked On This Month Image = " + imageDate);
	
	helper.Scrollintoview(showAnalytics_Button10);
	helper.waitFor(showAnalytics_Button10);
	helper.highLightElement(driver, showAnalytics_Button10);
	String linkText1 = showAnalytics_Button10.getAttribute("href");
	helper.getAdID(linkText1);
	helper.jsCLick(showAnalytics_Button10);
	Reporter.log("<B><font color = 'blue'> ==> -</font> Clicked on showAnalytics Button");
	
	Set<String> S5=driver.getWindowHandles();
    Iterator<String>it4=S5.iterator();
    String parent4=it4.next();
    String child4=it4.next();
    
    driver.switchTo().window(child4);
    
    helper.waitForPageToLoad();
    helper.waitFor(Last_Seen_childWindow);
    helper.highLightElement(driver, Last_Seen_childWindow);
    String lastSeenDate_This_Month= Last_Seen_childWindow.getText();
    Reporter.log("<B><font color = 'blue'> ==> -</font> Last_Seen_childWindow AdDetails Page= " +  lastSeenDate_This_Month);
    
    driver.close();
    
    driver.switchTo().window(parent4);
    
    helper.getLastseenDate(lastSeenDate_This_Month, imageDate);
    }
    catch(Exception e) {
    	System.out.println("Oops! Looks like we don't have data for this search criteria yet.");
    	 Reporter.log("<B><font color = 'red'> ==> -</font> Oops! Looks like we don't have data for this search criteria yet.");
    }
    
    Reporter.log("");
	Reporter.log("<B><font color = 'Blue-Violet'> 11th Ad -</font> ");
	
	
    try {
   	helper.Scrollintoview(current_date11);
    helper.waitFor(current_date11);
	helper.highLightElement(driver, current_date11);
	String imageDate = current_date11.getText();
	System.out.println("current_Date_ThisMonth : " + imageDate);
	Reporter.log("<B><font color = 'blue'> ==> -</font> Clicked On This Month Image = " + imageDate);
	
	helper.Scrollintoview(showAnalytics_Button11);
	helper.waitFor(showAnalytics_Button11);
	helper.highLightElement(driver, showAnalytics_Button11);
	helper.highLightElement(driver, showAnalytics_Button11);
	String linkText1 = showAnalytics_Button11.getAttribute("href");
	helper.getAdID(linkText1);
	helper.jsCLick(showAnalytics_Button11);
	Reporter.log("<B><font color = 'blue'> ==> -</font> Clicked on showAnalytics Button");
	
	Set<String> S5=driver.getWindowHandles();
    Iterator<String>it4=S5.iterator();
    String parent4=it4.next();
    String child4=it4.next();
    
    driver.switchTo().window(child4);
    
    helper.waitForPageToLoad();
    helper.waitFor(Last_Seen_childWindow);
    helper.highLightElement(driver, Last_Seen_childWindow);
    String lastSeenDate_This_Month= Last_Seen_childWindow.getText();
    Reporter.log("<B><font color = 'blue'> ==> -</font> Last_Seen_childWindow AdDetails Page= " +  lastSeenDate_This_Month);
    
    driver.close();
    
    driver.switchTo().window(parent4);
    
    helper.getLastseenDate(lastSeenDate_This_Month, imageDate);
    }
    catch(Exception e) {
    	System.out.println("Oops! Looks like we don't have data for this search criteria yet.");
    	 Reporter.log("<B><font color = 'red'> ==> -</font> Oops! Looks like we don't have data for this search criteria yet.");
    }
    
    Reporter.log("");
	Reporter.log("<B><font color = 'Blue-Violet'> 12th Ad -</font> ");
	

    try {
   	helper.Scrollintoview(current_date12);
    helper.waitFor(current_date12);
	helper.highLightElement(driver, current_date12);
	String imageDate = current_date12.getText();
	System.out.println("current_Date_ThisMonth : " + imageDate);
	Reporter.log("<B><font color = 'blue'> ==> -</font> Clicked On This Month Image = " + imageDate);
	
	helper.Scrollintoview(showAnalytics_Button12);
	helper.waitFor(showAnalytics_Button12);
	helper.highLightElement(driver, showAnalytics_Button12);
	String linkText1 = showAnalytics_Button12.getAttribute("href");
	helper.getAdID(linkText1);
	helper.jsCLick(showAnalytics_Button12);
	Reporter.log("<B><font color = 'blue'> ==> -</font> Clicked on showAnalytics Button");
	
	Set<String> S5=driver.getWindowHandles();
    Iterator<String>it4=S5.iterator();
    String parent4=it4.next();
    String child4=it4.next();
    
    driver.switchTo().window(child4);
    
    helper.waitForPageToLoad();
    helper.waitFor(Last_Seen_childWindow);
    helper.highLightElement(driver, Last_Seen_childWindow);
    String lastSeenDate_This_Month= Last_Seen_childWindow.getText();
    Reporter.log("<B><font color = 'blue'> ==> -</font> Last_Seen_childWindow AdDetails Page= " +  lastSeenDate_This_Month);
    
    driver.close();
    
    driver.switchTo().window(parent4);
    
    helper.getLastseenDate(lastSeenDate_This_Month, imageDate);
    }
    catch(Exception e) {
    	System.out.println("Oops! Looks like we don't have data for this search criteria yet.");
    	 Reporter.log("<B><font color = 'red'> ==> -</font> Oops! Looks like we don't have data for this search criteria yet.");
    }
    
    Reporter.log("");
	Reporter.log("<B><font color = 'Blue-Violet'> 13th Ad -</font> ");
	
	
    try {
   	helper.Scrollintoview(current_date13);
    helper.waitFor(current_date13);
	helper.highLightElement(driver, current_date13);
	String imageDate = current_date13.getText();
	System.out.println("current_Date_ThisMonth : " + imageDate);
	Reporter.log("<B><font color = 'blue'> ==> -</font> Clicked On This Month Image = " + imageDate);
	
	helper.Scrollintoview(showAnalytics_Button13);
	helper.waitFor(showAnalytics_Button13);
	helper.highLightElement(driver, showAnalytics_Button13);
	String linkText1 = showAnalytics_Button13.getAttribute("href");
	helper.getAdID(linkText1);
	helper.jsCLick(showAnalytics_Button13);
	Reporter.log("<B><font color = 'blue'> ==> -</font> Clicked on showAnalytics Button");
	
	Set<String> S5=driver.getWindowHandles();
    Iterator<String>it4=S5.iterator();
    String parent4=it4.next();
    String child4=it4.next();
    
    driver.switchTo().window(child4);
    
    helper.waitForPageToLoad();
    helper.waitFor(Last_Seen_childWindow);
    helper.highLightElement(driver, Last_Seen_childWindow);
    String lastSeenDate_This_Month= Last_Seen_childWindow.getText();
    Reporter.log("<B><font color = 'blue'> ==> -</font> Last_Seen_childWindow AdDetails Page= " +  lastSeenDate_This_Month);
    
    driver.close();
    
    driver.switchTo().window(parent4);
    
    helper.getLastseenDate(lastSeenDate_This_Month, imageDate);
    }
    catch(Exception e) {
    	System.out.println("Oops! Looks like we don't have data for this search criteria yet.");
    	 Reporter.log("<B><font color = 'red'> ==> -</font> Oops! Looks like we don't have data for this search criteria yet.");
    }
    
    Reporter.log("");
	Reporter.log("<B><font color = 'Blue-Violet'> 14th Ad -</font> ");
	
    try {
   	helper.Scrollintoview(current_date14);
    helper.waitFor(current_date14);
	helper.highLightElement(driver, current_date14);
	String imageDate = current_date14.getText();
	System.out.println("current_Date_ThisMonth : " + imageDate);
	Reporter.log("<B><font color = 'blue'> ==> -</font> Clicked On This Month Image = " + imageDate);
	
	helper.Scrollintoview(showAnalytics_Button14);
	helper.waitFor(showAnalytics_Button14);
	helper.highLightElement(driver, showAnalytics_Button14);
	String linkText1 = showAnalytics_Button14.getAttribute("href");
	helper.getAdID(linkText1);
	helper.jsCLick(showAnalytics_Button14);
	Reporter.log("<B><font color = 'blue'> ==> -</font> Clicked on showAnalytics Button");
	
	Set<String> S5=driver.getWindowHandles();
    Iterator<String>it4=S5.iterator();
    String parent4=it4.next();
    String child4=it4.next();
    
    driver.switchTo().window(child4);
    
    helper.waitForPageToLoad();
    helper.waitFor(Last_Seen_childWindow);
    helper.highLightElement(driver, Last_Seen_childWindow);
    String lastSeenDate_This_Month= Last_Seen_childWindow.getText();
    Reporter.log("<B><font color = 'blue'> ==> -</font> Last_Seen_childWindow AdDetails Page= " +  lastSeenDate_This_Month);
    
    driver.close();
    
    driver.switchTo().window(parent4);
    
    helper.getLastseenDate(lastSeenDate_This_Month, imageDate);
    }
    catch(Exception e) {
    	System.out.println("Oops! Looks like we don't have data for this search criteria yet.");
    	 Reporter.log("<B><font color = 'red'> ==> -</font> Oops! Looks like we don't have data for this search criteria yet.");
    }
    
    Reporter.log("");
	Reporter.log("<B><font color = 'Blue-Violet'> 15th Ad -</font> ");
	
	
    try {
   	helper.Scrollintoview(current_date15);
    helper.waitFor(current_date15);
	helper.highLightElement(driver, current_date15);
	String imageDate = current_date15.getText();
	System.out.println("current_Date_ThisMonth : " + imageDate);
	Reporter.log("<B><font color = 'blue'> ==> -</font> Clicked On This Month Image = " + imageDate);
	
	helper.Scrollintoview(showAnalytics_Button15);
	helper.waitFor(showAnalytics_Button15);
	helper.highLightElement(driver, showAnalytics_Button15);
	helper.highLightElement(driver, showAnalytics_Button15);
	String linkText1 = showAnalytics_Button15.getAttribute("href");
	helper.getAdID(linkText1);
	helper.jsCLick(showAnalytics_Button15);
	Reporter.log("<B><font color = 'blue'> ==> -</font> Clicked on showAnalytics Button");
	
	Set<String> S5=driver.getWindowHandles();
    Iterator<String>it4=S5.iterator();
    String parent4=it4.next();
    String child4=it4.next();
    
    driver.switchTo().window(child4);
    
    helper.waitForPageToLoad();
    helper.waitFor(Last_Seen_childWindow);
    helper.highLightElement(driver, Last_Seen_childWindow);
    String lastSeenDate_This_Month= Last_Seen_childWindow.getText();
    Reporter.log("<B><font color = 'blue'> ==> -</font> Last_Seen_childWindow AdDetails Page= " +  lastSeenDate_This_Month);
    
    driver.close();
    
    driver.switchTo().window(parent4);
    
    helper.getLastseenDate(lastSeenDate_This_Month, imageDate);
    }
    catch(Exception e) {
    	System.out.println("Oops! Looks like we don't have data for this search criteria yet.");
    	 Reporter.log("<B><font color = 'red'> ==> -</font> Oops! Looks like we don't have data for this search criteria yet.");
    }
   
//    Last Month
	Reporter.log("");
    Reporter.log("<B><font color = 'green'> Ads Seen Between :Last Month -</font> ");
	  
    helper.waitFor(clearSearchField);
	helper.highLightElement(driver, clearSearchField);
	helper.jsCLick(clearSearchField);
	Reporter.log("<B><font color = 'orange'> Step 1 -</font> Clicked On clear search.");
	
	helper.waitFor(ads_Seen_Between_Button);
	helper.highLightElement(driver, ads_Seen_Between_Button);
	helper.jsCLick(ads_Seen_Between_Button);
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
	
	Reporter.log("");
	Reporter.log("<B><font color = 'Blue-Violet'> 1st Ad -</font> ");
	
	
    try {
   	helper.Scrollintoview(current_date1);
    helper.waitFor(current_date1);	
	helper.highLightElement(driver, current_date1);
	String imageDate = current_date1.getText();
	System.out.println("current_Date_LastMonth : " + imageDate);
	Reporter.log("<B><font color = 'blue'> ==> -</font> Clicked On Last Month Image = " + imageDate);
	
	helper.Scrollintoview(showAnalytics_Button1);
	helper.waitFor(showAnalytics_Button1);
	helper.highLightElement(driver, showAnalytics_Button1);
	helper.highLightElement(driver, showAnalytics_Button1);
	String linkText1 = showAnalytics_Button1.getAttribute("href");
	helper.getAdID(linkText1);
	helper.jsCLick(showAnalytics_Button1);
	Reporter.log("<B><font color = 'blue'> ==> -</font> Clicked on showAnalytics Button");
	
	Set<String> S6=driver.getWindowHandles();
    Iterator<String>it5=S6.iterator();
    String parent5=it5.next();
    String child5=it5.next();
    
    driver.switchTo().window(child5);
    
    helper.waitForPageToLoad();
    helper.waitFor(Last_Seen_childWindow);
    helper.highLightElement(driver, Last_Seen_childWindow);
    String lastSeenDate_Date_Last_Month= Last_Seen_childWindow.getText();
    Reporter.log("<B><font color = 'blue'> ==> -</font> Last_Seen_childWindow AdDetails Page= " +  lastSeenDate_Date_Last_Month);
    
    driver.close();
    
    driver.switchTo().window(parent5);
   
    helper.getLastseenDate(lastSeenDate_Date_Last_Month,imageDate);
    
    }
    catch(Exception e) {
    	System.out.println("Oops! Looks like we don't have data for this search criteria yet.");
    	 Reporter.log("<B><font color = 'red'> ==> -</font> Oops! Looks like we don't have data for this search criteria yet.");
    }
    
	Reporter.log("");
	Reporter.log("<B><font color = 'Blue-Violet'> 2nd Ad -</font> ");
	
	
    try {
   	helper.Scrollintoview(current_date2);
    helper.waitFor(current_date2);
	helper.highLightElement(driver, current_date2);
	String imageDate = current_date2.getText();
	System.out.println("current_Date_LastMonth : " + imageDate);
	Reporter.log("<B><font color = 'blue'> ==> -</font> Clicked On Last Month Image = " + imageDate);
	
	helper.Scrollintoview(showAnalytics_Button2);
	helper.waitFor(showAnalytics_Button2);
	helper.highLightElement(driver, showAnalytics_Button2);
	helper.highLightElement(driver, showAnalytics_Button2);
	String linkText1 = showAnalytics_Button2.getAttribute("href");
	helper.getAdID(linkText1);
	helper.jsCLick(showAnalytics_Button2);
	Reporter.log("<B><font color = 'blue'> ==> -</font> Clicked on showAnalytics Button");
	
	Set<String> S6=driver.getWindowHandles();
    Iterator<String>it5=S6.iterator();
    String parent5=it5.next();
    String child5=it5.next();
    
    driver.switchTo().window(child5);
    
    helper.waitForPageToLoad();
    helper.waitFor(Last_Seen_childWindow);
    helper.highLightElement(driver, Last_Seen_childWindow);
    String lastSeenDate_Date_Last_Month= Last_Seen_childWindow.getText();
    Reporter.log("<B><font color = 'blue'> ==> -</font> Last_Seen_childWindow AdDetails Page= " +  lastSeenDate_Date_Last_Month);
    
    driver.close();
    
    driver.switchTo().window(parent5);
    
    helper.getLastseenDate(lastSeenDate_Date_Last_Month, imageDate);
    
    }
    catch(Exception e) {
    	System.out.println("Oops! Looks like we don't have data for this search criteria yet.");
    	 Reporter.log("<B><font color = 'red'> ==> -</font> Oops! Looks like we don't have data for this search criteria yet.");
    }
    
	Reporter.log("");
	Reporter.log("<B><font color = 'Blue-Violet'> 3rd Ad -</font> ");
	
	
    try {
   	helper.Scrollintoview(current_date3);
    helper.waitFor(current_date3);
	helper.highLightElement(driver, current_date3);
	String imageDate = current_date3.getText();
	System.out.println("current_Date_LastMonth : " + imageDate);
	Reporter.log("<B><font color = 'blue'> ==> -</font> Clicked On Last Month Image = " + imageDate);
	
	helper.Scrollintoview(showAnalytics_Button3);
	helper.waitFor(showAnalytics_Button3);
	helper.highLightElement(driver, showAnalytics_Button3);
	helper.highLightElement(driver, showAnalytics_Button3);
	String linkText1 = showAnalytics_Button3.getAttribute("href");
	helper.getAdID(linkText1);
	helper.jsCLick(showAnalytics_Button3);
	Reporter.log("<B><font color = 'blue'> ==> -</font> Clicked on showAnalytics Button");
	
	Set<String> S6=driver.getWindowHandles();
    Iterator<String>it5=S6.iterator();
    String parent5=it5.next();
    String child5=it5.next();
    
    driver.switchTo().window(child5);
    
    helper.waitForPageToLoad();
    helper.waitFor(Last_Seen_childWindow);
    helper.highLightElement(driver, Last_Seen_childWindow);
    String lastSeenDate_Date_Last_Month= Last_Seen_childWindow.getText();
    Reporter.log("<B><font color = 'blue'> ==> -</font> Last_Seen_childWindow AdDetails Page= " +  lastSeenDate_Date_Last_Month);
    
    driver.close();
    
    driver.switchTo().window(parent5);
    
    helper.getLastseenDate(lastSeenDate_Date_Last_Month, imageDate);

    }
    catch(Exception e) {
    	System.out.println("Oops! Looks like we don't have data for this search criteria yet.");
    	 Reporter.log("<B><font color = 'red'> ==> -</font> Oops! Looks like we don't have data for this search criteria yet.");
    }
    

	Reporter.log("");
	Reporter.log("<B><font color = 'Blue-Violet'> 4th Ad -</font> ");
	
	
    try {
   	helper.Scrollintoview(current_date4);
    helper.waitFor(current_date4);
	helper.highLightElement(driver, current_date4);
	String imageDate = current_date4.getText();
	System.out.println("current_Date_LastMonth : " + imageDate);
	Reporter.log("<B><font color = 'blue'> ==> -</font> Clicked On Last Month Image = " + imageDate);
	
	helper.Scrollintoview(showAnalytics_Button4);
	helper.waitFor(showAnalytics_Button4);
	helper.highLightElement(driver, showAnalytics_Button4);
	helper.highLightElement(driver, showAnalytics_Button4);
	String linkText1 = showAnalytics_Button4.getAttribute("href");
	helper.getAdID(linkText1);
	helper.jsCLick(showAnalytics_Button4);
	Reporter.log("<B><font color = 'blue'> ==> -</font> Clicked on showAnalytics Button");
	
	Set<String> S6=driver.getWindowHandles();
    Iterator<String>it5=S6.iterator();
    String parent5=it5.next();
    String child5=it5.next();
    
    driver.switchTo().window(child5);
    
    helper.waitForPageToLoad();
    helper.waitFor(Last_Seen_childWindow);
    helper.highLightElement(driver, Last_Seen_childWindow);
    String lastSeenDate_Date_Last_Month= Last_Seen_childWindow.getText();
    Reporter.log("<B><font color = 'blue'> ==> -</font> Last_Seen_childWindow AdDetails Page= " +  lastSeenDate_Date_Last_Month);
    
    driver.close();
    
    driver.switchTo().window(parent5);
   
    helper.getLastseenDate(lastSeenDate_Date_Last_Month, imageDate);
   
    }
    catch(Exception e) {
    	System.out.println("Oops! Looks like we don't have data for this search criteria yet.");
    	 Reporter.log("<B><font color = 'red'> ==> -</font> Oops! Looks like we don't have data for this search criteria yet.");
    }
    

	Reporter.log("");
	Reporter.log("<B><font color = 'Blue-Violet'> 5th Ad -</font> ");
	
	
    try {
   	helper.Scrollintoview(current_date5);
    helper.waitFor(current_date5);
	helper.highLightElement(driver, current_date5);
	String imageDate = current_date5.getText();
	System.out.println("current_Date_LastMonth : " + imageDate);
	Reporter.log("<B><font color = 'blue'> ==> -</font> Clicked On Last Month Image = " + imageDate);
	
	helper.Scrollintoview(showAnalytics_Button5);
	helper.waitFor(showAnalytics_Button5);
	helper.highLightElement(driver, showAnalytics_Button5);
	helper.highLightElement(driver, showAnalytics_Button5);
	String linkText1 = showAnalytics_Button5.getAttribute("href");
	helper.getAdID(linkText1);
	helper.jsCLick(showAnalytics_Button5);
	Reporter.log("<B><font color = 'blue'> ==> -</font> Clicked on showAnalytics Button");
	
	Set<String> S6=driver.getWindowHandles();
    Iterator<String>it5=S6.iterator();
    String parent5=it5.next();
    String child5=it5.next();
    
    driver.switchTo().window(child5);
    
    helper.waitForPageToLoad();
    helper.waitFor(Last_Seen_childWindow);
    helper.highLightElement(driver, Last_Seen_childWindow);
    String lastSeenDate_Date_Last_Month= Last_Seen_childWindow.getText();
    Reporter.log("<B><font color = 'blue'> ==> -</font> Last_Seen_childWindow AdDetails Page= " +  lastSeenDate_Date_Last_Month);
    
    driver.close();
    
    driver.switchTo().window(parent5);
    
    helper.getLastseenDate(lastSeenDate_Date_Last_Month, imageDate);
    

    }
    catch(Exception e) {
    	System.out.println("Oops! Looks like we don't have data for this search criteria yet.");
    	 Reporter.log("<B><font color = 'red'> ==> -</font> Oops! Looks like we don't have data for this search criteria yet.");
    }
    

	Reporter.log("");
	Reporter.log("<B><font color = 'Blue-Violet'> 6th Ad -</font> ");
	
	
    try {
   	helper.Scrollintoview(current_date6);
    helper.waitFor(current_date6);
	helper.highLightElement(driver, current_date6);
	String imageDate = current_date6.getText();
	System.out.println("current_Date_LastMonth : " + imageDate);
	Reporter.log("<B><font color = 'blue'> ==> -</font> Clicked On Last Month Image = " + imageDate);
	
	helper.Scrollintoview(showAnalytics_Button6);
	helper.waitFor(showAnalytics_Button6);
	helper.highLightElement(driver, showAnalytics_Button6);
	helper.highLightElement(driver, showAnalytics_Button6);
	String linkText1 = showAnalytics_Button6.getAttribute("href");
	helper.getAdID(linkText1);
	helper.jsCLick(showAnalytics_Button6);
	Reporter.log("<B><font color = 'blue'> ==> -</font> Clicked on showAnalytics Button");
	
	Set<String> S6=driver.getWindowHandles();
    Iterator<String>it5=S6.iterator();
    String parent5=it5.next();
    String child5=it5.next();
    
    driver.switchTo().window(child5);
    
    helper.waitForPageToLoad();
    helper.waitFor(Last_Seen_childWindow);
    helper.highLightElement(driver, Last_Seen_childWindow);
    String lastSeenDate_Date_Last_Month= Last_Seen_childWindow.getText();
    Reporter.log("<B><font color = 'blue'> ==> -</font> Last_Seen_childWindow AdDetails Page= " +  lastSeenDate_Date_Last_Month);
    
    driver.close();
    
    driver.switchTo().window(parent5);
    
    helper.getLastseenDate(lastSeenDate_Date_Last_Month, imageDate);

    }
    catch(Exception e) {
    	System.out.println("Oops! Looks like we don't have data for this search criteria yet.");
    	 Reporter.log("<B><font color = 'red'> ==> -</font> Oops! Looks like we don't have data for this search criteria yet.");
    }
    

	Reporter.log("");
	Reporter.log("<B><font color = 'Blue-Violet'> 7th Ad -</font> ");
	

    try {
   	helper.Scrollintoview(current_date7);
    helper.waitFor(current_date7);
	helper.highLightElement(driver, current_date7);
	String imageDate = current_date7.getText();
	System.out.println("current_Date_LastMonth : " + imageDate);
	Reporter.log("<B><font color = 'blue'> ==> -</font> Clicked On Last Month Image = " + imageDate);
	
	helper.Scrollintoview(showAnalytics_Button7);
	helper.waitFor(showAnalytics_Button7);
	helper.highLightElement(driver, showAnalytics_Button7);
	helper.highLightElement(driver, showAnalytics_Button7);
	String linkText1 = showAnalytics_Button7.getAttribute("href");
	helper.getAdID(linkText1);
	helper.jsCLick(showAnalytics_Button7);
	Reporter.log("<B><font color = 'blue'> ==> -</font> Clicked on showAnalytics Button");
	
	Set<String> S6=driver.getWindowHandles();
    Iterator<String>it5=S6.iterator();
    String parent5=it5.next();
    String child5=it5.next();
    
    driver.switchTo().window(child5);
    
    helper.waitForPageToLoad();
    helper.waitFor(Last_Seen_childWindow);
    helper.highLightElement(driver, Last_Seen_childWindow);
    String lastSeenDate_Date_Last_Month= Last_Seen_childWindow.getText();
    Reporter.log("<B><font color = 'blue'> ==> -</font> Last_Seen_childWindow AdDetails Page= " +  lastSeenDate_Date_Last_Month);
    
    driver.close();
    
    driver.switchTo().window(parent5);
    
    helper.getLastseenDate(lastSeenDate_Date_Last_Month, imageDate);
    

    }
    catch(Exception e) {
    	System.out.println("Oops! Looks like we don't have data for this search criteria yet.");
    	 Reporter.log("<B><font color = 'red'> ==> -</font> Oops! Looks like we don't have data for this search criteria yet.");
    }
    

	Reporter.log("");
	Reporter.log("<B><font color = 'Blue-Violet'> 8th Ad -</font> ");
	
	
    try {
   	helper.Scrollintoview(current_date8);
    helper.waitFor(current_date8);
	helper.highLightElement(driver, current_date8);
	String imageDate = current_date8.getText();
	System.out.println("current_Date_LastMonth : " + imageDate);
	Reporter.log("<B><font color = 'blue'> ==> -</font> Clicked On Last Month Image = " + imageDate);
	
	helper.Scrollintoview(showAnalytics_Button8);
	helper.waitFor(showAnalytics_Button8);
	helper.highLightElement(driver, showAnalytics_Button8);
	helper.highLightElement(driver, showAnalytics_Button8);
	String linkText1 = showAnalytics_Button8.getAttribute("href");
	helper.getAdID(linkText1);
	helper.jsCLick(showAnalytics_Button8);
	Reporter.log("<B><font color = 'blue'> ==> -</font> Clicked on showAnalytics Button");
	
	Set<String> S6=driver.getWindowHandles();
    Iterator<String>it5=S6.iterator();
    String parent5=it5.next();
    String child5=it5.next();
    
    driver.switchTo().window(child5);
    
    helper.waitForPageToLoad();
    helper.waitFor(Last_Seen_childWindow);
    helper.highLightElement(driver, Last_Seen_childWindow);
    String lastSeenDate_Date_Last_Month= Last_Seen_childWindow.getText();
    Reporter.log("<B><font color = 'blue'> ==> -</font> Last_Seen_childWindow AdDetails Page= " +  lastSeenDate_Date_Last_Month);
    
    driver.close();
    
    driver.switchTo().window(parent5);
    
    helper.getLastseenDate(lastSeenDate_Date_Last_Month, imageDate);
 
    }
    catch(Exception e) {
    	System.out.println("Oops! Looks like we don't have data for this search criteria yet.");
    	 Reporter.log("<B><font color = 'red'> ==> -</font> Oops! Looks like we don't have data for this search criteria yet.");
    }
    

	Reporter.log("");
	Reporter.log("<B><font color = 'Blue-Violet'> 9th Ad -</font> ");
	

    try {
   	helper.Scrollintoview(current_date9);
    helper.waitFor(current_date9);
	helper.highLightElement(driver, current_date9);
	String imageDate = current_date9.getText();
	System.out.println("current_Date_LastMonth : " + imageDate);
	Reporter.log("<B><font color = 'blue'> ==> -</font> Clicked On Last Month Image = " + imageDate);
	
	helper.Scrollintoview(showAnalytics_Button9);
	helper.waitFor(showAnalytics_Button9);
	helper.highLightElement(driver, showAnalytics_Button9);
	helper.highLightElement(driver, showAnalytics_Button9);
	String linkText1 = showAnalytics_Button9.getAttribute("href");
	helper.getAdID(linkText1);
	helper.jsCLick(showAnalytics_Button9);
	Reporter.log("<B><font color = 'blue'> ==> -</font> Clicked on showAnalytics Button");
	
	Set<String> S6=driver.getWindowHandles();
    Iterator<String>it5=S6.iterator();
    String parent5=it5.next();
    String child5=it5.next();
    
    driver.switchTo().window(child5);
    
    helper.waitForPageToLoad();
    helper.waitFor(Last_Seen_childWindow);
    helper.highLightElement(driver, Last_Seen_childWindow);
    String lastSeenDate_Date_Last_Month= Last_Seen_childWindow.getText();
    Reporter.log("<B><font color = 'blue'> ==> -</font> Last_Seen_childWindow AdDetails Page= " +  lastSeenDate_Date_Last_Month);
    
    driver.close();
    
    driver.switchTo().window(parent5);

    helper.getLastseenDate(lastSeenDate_Date_Last_Month, imageDate);
    }
    catch(Exception e) {
    	System.out.println("Oops! Looks like we don't have data for this search criteria yet.");
    	 Reporter.log("<B><font color = 'red'> ==> -</font> Oops! Looks like we don't have data for this search criteria yet.");
    }
    

	Reporter.log("");
	Reporter.log("<B><font color = 'Blue-Violet'> 10th Ad -</font> ");
	
	
    try {
   	helper.Scrollintoview(current_date10);
    helper.waitFor(current_date10);
	helper.highLightElement(driver, current_date10);
	String imageDate = current_date10.getText();
	System.out.println("current_Date_LastMonth : " + imageDate);
	Reporter.log("<B><font color = 'blue'> ==> -</font> Clicked On Last Month Image = " + imageDate);
	
	helper.Scrollintoview(showAnalytics_Button10);
	helper.waitFor(showAnalytics_Button10);
	helper.highLightElement(driver, showAnalytics_Button10);
	helper.highLightElement(driver, showAnalytics_Button10);
	String linkText1 = showAnalytics_Button10.getAttribute("href");
	helper.getAdID(linkText1);
	helper.jsCLick(showAnalytics_Button10);
	Reporter.log("<B><font color = 'blue'> ==> -</font> Clicked on showAnalytics Button");
	
	Set<String> S6=driver.getWindowHandles();
    Iterator<String>it5=S6.iterator();
    String parent5=it5.next();
    String child5=it5.next();
    
    driver.switchTo().window(child5);
    
    helper.waitForPageToLoad();
    helper.waitFor(Last_Seen_childWindow);
    helper.highLightElement(driver, Last_Seen_childWindow);
    String lastSeenDate_Date_Last_Month= Last_Seen_childWindow.getText();
    Reporter.log("<B><font color = 'blue'> ==> -</font> Last_Seen_childWindow AdDetails Page= " +  lastSeenDate_Date_Last_Month);
    
    driver.close();
    
    driver.switchTo().window(parent5);
    
    helper.getLastseenDate(lastSeenDate_Date_Last_Month, imageDate);
    
    }
    catch(Exception e) {
    	System.out.println("Oops! Looks like we don't have data for this search criteria yet.");
    	 Reporter.log("<B><font color = 'red'> ==> -</font> Oops! Looks like we don't have data for this search criteria yet.");
    }
    

	Reporter.log("");
	Reporter.log("<B><font color = 'Blue-Violet'> 11th Ad -</font> ");
	
	
    try {
   	helper.Scrollintoview(current_date11);
    helper.waitFor(current_date11);
	helper.highLightElement(driver, current_date11);
	String imageDate = current_date11.getText();
	System.out.println("current_Date_LastMonth : " + imageDate);
	Reporter.log("<B><font color = 'blue'> ==> -</font> Clicked On Last Month Image = " + imageDate);
	
	helper.Scrollintoview(showAnalytics_Button11);
	helper.waitFor(showAnalytics_Button11);
	helper.highLightElement(driver, showAnalytics_Button11);
	helper.highLightElement(driver, showAnalytics_Button11);
	String linkText1 = showAnalytics_Button11.getAttribute("href");
	helper.getAdID(linkText1);
	helper.jsCLick(showAnalytics_Button11);
	Reporter.log("<B><font color = 'blue'> ==> -</font> Clicked on showAnalytics Button");
	
	Set<String> S6=driver.getWindowHandles();
    Iterator<String>it5=S6.iterator();
    String parent5=it5.next();
    String child5=it5.next();
    
    driver.switchTo().window(child5);
    
    helper.waitForPageToLoad();
    helper.waitFor(Last_Seen_childWindow);
    helper.highLightElement(driver, Last_Seen_childWindow);
    String lastSeenDate_Date_Last_Month= Last_Seen_childWindow.getText();
    Reporter.log("<B><font color = 'blue'> ==> -</font> Last_Seen_childWindow AdDetails Page= " +  lastSeenDate_Date_Last_Month);
    
    driver.close();
    
    driver.switchTo().window(parent5);
    
    helper.getLastseenDate(lastSeenDate_Date_Last_Month, imageDate);
    }
    catch(Exception e) {
    	System.out.println("Oops! Looks like we don't have data for this search criteria yet.");
    	 Reporter.log("<B><font color = 'red'> ==> -</font> Oops! Looks like we don't have data for this search criteria yet.");
    }
    

	Reporter.log("");
	Reporter.log("<B><font color = 'Blue-Violet'> 12th Ad -</font> ");
	
	
    try {
   	helper.Scrollintoview(current_date12);
    helper.waitFor(current_date12);
	helper.highLightElement(driver, current_date12);
	String imageDate = current_date12.getText();
	System.out.println("current_Date_LastMonth : " + imageDate);
	Reporter.log("<B><font color = 'blue'> ==> -</font> Clicked On Last Month Image = " + imageDate);
	
	helper.Scrollintoview(showAnalytics_Button12);
	helper.waitFor(showAnalytics_Button12);
	helper.highLightElement(driver, showAnalytics_Button12);
	helper.highLightElement(driver, showAnalytics_Button12);
	String linkText1 = showAnalytics_Button12.getAttribute("href");
	helper.getAdID(linkText1);
	helper.jsCLick(showAnalytics_Button12);
	Reporter.log("<B><font color = 'blue'> ==> -</font> Clicked on showAnalytics Button");
	
	Set<String> S6=driver.getWindowHandles();
    Iterator<String>it5=S6.iterator();
    String parent5=it5.next();
    String child5=it5.next();
    
    driver.switchTo().window(child5);
    
    helper.waitForPageToLoad();
    helper.waitFor(Last_Seen_childWindow);
    helper.highLightElement(driver, Last_Seen_childWindow);
    String lastSeenDate_Date_Last_Month= Last_Seen_childWindow.getText();
    Reporter.log("<B><font color = 'blue'> ==> -</font> Last_Seen_childWindow AdDetails Page= " +  lastSeenDate_Date_Last_Month);
    
    driver.close();
    
    driver.switchTo().window(parent5);
    
    helper.getLastseenDate(lastSeenDate_Date_Last_Month, imageDate);

    }
    catch(Exception e) {
    	System.out.println("Oops! Looks like we don't have data for this search criteria yet.");
    	 Reporter.log("<B><font color = 'red'> ==> -</font> Oops! Looks like we don't have data for this search criteria yet.");
    }
    

	Reporter.log("");
	Reporter.log("<B><font color = 'Blue-Violet'> 13th Ad -</font> ");
	
	
    try {
   	helper.Scrollintoview(current_date13);
    helper.waitFor(current_date13);    	
	helper.highLightElement(driver, current_date13);
	String imageDate = current_date13.getText();
	System.out.println("current_Date_LastMonth : " + imageDate);
	Reporter.log("<B><font color = 'blue'> ==> -</font> Clicked On Last Month Image = " + imageDate);
	
	helper.Scrollintoview(showAnalytics_Button13);
	helper.waitFor(showAnalytics_Button13);
	helper.highLightElement(driver, showAnalytics_Button13);
	helper.highLightElement(driver, showAnalytics_Button13);
	String linkText1 = showAnalytics_Button13.getAttribute("href");
	helper.getAdID(linkText1);
	helper.jsCLick(showAnalytics_Button13);
	Reporter.log("<B><font color = 'blue'> ==> -</font> Clicked on showAnalytics Button");
	
	Set<String> S6=driver.getWindowHandles();
    Iterator<String>it5=S6.iterator();
    String parent5=it5.next();
    String child5=it5.next();
    
    driver.switchTo().window(child5);
    
    helper.waitForPageToLoad();
    helper.waitFor(Last_Seen_childWindow);
    helper.highLightElement(driver, Last_Seen_childWindow);
    String lastSeenDate_Date_Last_Month= Last_Seen_childWindow.getText();
    Reporter.log("<B><font color = 'blue'> ==> -</font> Last_Seen_childWindow AdDetails Page= " +  lastSeenDate_Date_Last_Month);
    
    driver.close();
    
    driver.switchTo().window(parent5);
    
    helper.getLastseenDate(lastSeenDate_Date_Last_Month, imageDate);
    }
    catch(Exception e) {
    	System.out.println("Oops! Looks like we don't have data for this search criteria yet.");
    	 Reporter.log("<B><font color = 'red'> ==> -</font> Oops! Looks like we don't have data for this search criteria yet.");
    }
    

	Reporter.log("");
	Reporter.log("<B><font color = 'Blue-Violet'> 14th Ad -</font> ");
	
	
    try {
   	helper.Scrollintoview(current_date14);
    helper.waitFor(current_date14);
	helper.highLightElement(driver, current_date14);
	String imageDate = current_date14.getText();
	System.out.println("current_Date_LastMonth : " + imageDate);
	Reporter.log("<B><font color = 'blue'> ==> -</font> Clicked On Last Month Image = " + imageDate);
	
	helper.Scrollintoview(showAnalytics_Button14);
	helper.waitFor(showAnalytics_Button14);
	helper.highLightElement(driver, showAnalytics_Button14);
	helper.highLightElement(driver, showAnalytics_Button14);
	String linkText1 = showAnalytics_Button14.getAttribute("href");
	helper.getAdID(linkText1);
	helper.jsCLick(showAnalytics_Button14);
	Reporter.log("<B><font color = 'blue'> ==> -</font> Clicked on showAnalytics Button");
	
	Set<String> S6=driver.getWindowHandles();
    Iterator<String>it5=S6.iterator();
    String parent5=it5.next();
    String child5=it5.next();
    
    driver.switchTo().window(child5);
    
    helper.waitForPageToLoad();
    helper.waitFor(Last_Seen_childWindow);
    helper.highLightElement(driver, Last_Seen_childWindow);
    String lastSeenDate_Date_Last_Month= Last_Seen_childWindow.getText();
    Reporter.log("<B><font color = 'blue'> ==> -</font> Last_Seen_childWindow AdDetails Page= " +  lastSeenDate_Date_Last_Month);
    
    driver.close();
    
    driver.switchTo().window(parent5);
    
    helper.getLastseenDate(lastSeenDate_Date_Last_Month, imageDate);
    
    }
    catch(Exception e) {
    	System.out.println("Oops! Looks like we don't have data for this search criteria yet.");
    	 Reporter.log("<B><font color = 'red'> ==> -</font> Oops! Looks like we don't have data for this search criteria yet.");
    }
    

	Reporter.log("");
	Reporter.log("<B><font color = 'Blue-Violet'> 15th Ad -</font> ");
	
	
    try {
   	helper.Scrollintoview(current_date15);
    helper.waitFor(current_date15);
	helper.highLightElement(driver, current_date15);
	String imageDate = current_date15.getText();
	System.out.println("current_Date_LastMonth : " + imageDate);
	Reporter.log("<B><font color = 'blue'> ==> -</font> Clicked On Last Month Image = " + imageDate);
	
	helper.Scrollintoview(showAnalytics_Button15);
	helper.waitFor(showAnalytics_Button15);
	helper.highLightElement(driver, showAnalytics_Button15);
	String linkText1 = showAnalytics_Button15.getAttribute("href");
	helper.getAdID(linkText1);
	helper.jsCLick(showAnalytics_Button15);
	Reporter.log("<B><font color = 'blue'> ==> -</font> Clicked on showAnalytics Button");
	
	Set<String> S6=driver.getWindowHandles();
    Iterator<String>it5=S6.iterator();
    String parent5=it5.next();
    String child5=it5.next();
    
    driver.switchTo().window(child5);
    
    helper.waitForPageToLoad();
    helper.waitFor(Last_Seen_childWindow);
    helper.highLightElement(driver, Last_Seen_childWindow);
    String lastSeenDate_Date_Last_Month= Last_Seen_childWindow.getText();
    Reporter.log("<B><font color = 'blue'> ==> -</font> Last_Seen_childWindow AdDetails Page= " +  lastSeenDate_Date_Last_Month);
    
    driver.close();
    
    driver.switchTo().window(parent5);
 
    helper.getLastseenDate(lastSeenDate_Date_Last_Month, imageDate);
    
    }
    catch(Exception e) {
    	System.out.println("Oops! Looks like we don't have data for this search criteria yet.");
    	 Reporter.log("<B><font color = 'red'> ==> -</font> Oops! Looks like we don't have data for this search criteria yet.");
    }
*/
    //Custom 
    Reporter.log("");
    Reporter.log("<B><font color = 'green'> Ads Seen Between :Custom_Range_Button -</font> ");
	  
    helper.waitFor(clearSearchField);
	helper.highLightElement(driver, clearSearchField);
	helper.jsCLick(clearSearchField);
	Reporter.log("<B><font color = 'orange'> Step 1 -</font> Clicked On clear search.");
	
	helper.waitFor(ads_Seen_Between_Button);
	helper.highLightElement(driver, ads_Seen_Between_Button);
	helper.jsCLick(ads_Seen_Between_Button);
	Reporter.log("<B><font color = 'orange'> Step 2 -</font> Clicked On Ads Seen Between.");
    
	helper.waitFor(Custom_Range_Button);
	helper.highLightElement(driver, Custom_Range_Button);
	helper.jsCLick(Custom_Range_Button);
	Reporter.log("<B><font color = 'orange'> Step 3 -</font> Clicked On Custom_Range_Button in Ads Seen Between.");
	helper.waitForPageToLoad();
	
	helper.waitFor(previousMonthButton);
	helper.highLightElement(driver, previousMonthButton);
	previousMonthButton.click();
	Reporter.log("<B><font color = 'orange'> Step 4 -</font> Clicked On Previous Month Button In Calender.");
	
	helper.waitFor(previousMonthButton);
	helper.highLightElement(driver, previousMonthButton);
	previousMonthButton.click();
	Reporter.log("<B><font color = 'orange'> Step 5 -</font> Clicked On Previous Month Button In Calender.");
	
	helper.waitFor(nextMonthButton);
	helper.highLightElement(driver, nextMonthButton);
	nextMonthButton.click();
	Reporter.log("<B><font color = 'orange'> Step 7 -</font> Clicked On Next Month Button In Calender.");
	
	helper.waitFor(custom_startDate);
	helper.highLightElement(driver, custom_startDate);
//	helper.jsCLick(custom_startDate);
	custom_startDate.click();
	Reporter.log("<B><font color = 'orange'> Step 8 -</font> Clicked On custom_startDate in Ads Seen Between.");
	helper.waitForPageToLoad();

	helper.waitFor(custom_endDate);
	helper.highLightElement(driver, custom_endDate);
//	helper.jsCLick(custom_endDate);
	custom_endDate.click();
	Reporter.log("<B><font color = 'orange'> Step95 -</font> Clicked On custom_endDate in Ads Seen Between.");
	
	helper.waitFor(search_bar);
	helper.highLightElement(driver, search_bar);
	helper.jsCLick(search_bar);
	Reporter.log("<B><font color = 'orange'> Step 10 -</font> Clicked On Search Bar.");
	helper.waitForPageToLoad();
	
	helper.waitFor(toatal_Count_Ads);
	helper.highLightElement(driver, toatal_Count_Ads);
	helper.jsCLick(toatal_Count_Ads);
	String Total_Ads_Count_Custom=toatal_Count_Ads.getText();
	Reporter.log("<B><font color = 'orange'> Step 11 -</font> Total_Ads_Count_Custom= " + Total_Ads_Count_Custom);
	
	Reporter.log("");
	Reporter.log("<B><font color = 'Blue-Violet'> 1st Ad -</font> ");
	
    try {
   	helper.Scrollintoview(current_date1);
    helper.waitFor(current_date1);
	helper.highLightElement(driver, current_date1);
	String imageDate = current_date1.getText();
	System.out.println("current_Date_Custom : " + imageDate);
	Reporter.log("<B><font color = 'blue'> ==> -</font> Clicked On Custom Month Image = " + imageDate);
	
	helper.Scrollintoview(showAnalytics_Button1);
	helper.waitFor(showAnalytics_Button1);
	helper.highLightElement(driver, showAnalytics_Button1);
	String linkText1 = showAnalytics_Button1.getAttribute("href");
	helper.getAdID(linkText1);
	helper.jsCLick(showAnalytics_Button1);
	Reporter.log("<B><font color = 'blue'> ==> -</font> Clicked on showAnalytics Button");
	
	Set<String> S7=driver.getWindowHandles();
    Iterator<String>it6=S7.iterator();
    String parent6=it6.next();
    String child6=it6.next();
    
    driver.switchTo().window(child6);
    
    helper.waitForPageToLoad();
    helper.waitFor(Last_Seen_childWindow);
    helper.highLightElement(driver, Last_Seen_childWindow);
    String lastSeenDate_Date_Custom= Last_Seen_childWindow.getText();
    Reporter.log("<B><font color = 'blue'> ==> -</font> Last_Seen_childWindow AdDetails Page= " +  lastSeenDate_Date_Custom);
    
    driver.close();
    
    driver.switchTo().window(parent6);
    
    helper.getLastseenDate(lastSeenDate_Date_Custom, imageDate);
    }
    catch(Exception e) {
    	System.out.println("Oops! Looks like we don't have data for this search criteria yet.");
    	 Reporter.log("<B><font color = 'red'> ==> -</font> Oops! Looks like we don't have data for this search criteria yet.");
    }

	Reporter.log("");
	Reporter.log("<B><font color = 'Blue-Violet'> 2nd Ad -</font> ");
	
    try {
   	helper.Scrollintoview(current_date2);
    helper.waitFor(current_date2);
	helper.highLightElement(driver, current_date2);
	String imageDate = current_date2.getText();
	System.out.println("current_Date_Custom : " + imageDate);
	Reporter.log("<B><font color = 'blue'> ==> -</font> Clicked On Custom Month Image = " + imageDate);
	
	helper.Scrollintoview(showAnalytics_Button2);
	helper.waitFor(showAnalytics_Button2);
	helper.highLightElement(driver, showAnalytics_Button2);
	String linkText1 = showAnalytics_Button2.getAttribute("href");
	helper.getAdID(linkText1);
	helper.jsCLick(showAnalytics_Button2);
	Reporter.log("<B><font color = 'blue'> ==> -</font> Clicked on showAnalytics Button");
	
	Set<String> S7=driver.getWindowHandles();
    Iterator<String>it6=S7.iterator();
    String parent6=it6.next();
    String child6=it6.next();
    
    driver.switchTo().window(child6);
    
    helper.waitForPageToLoad();
    helper.waitFor(Last_Seen_childWindow);
    helper.highLightElement(driver, Last_Seen_childWindow);
    String lastSeenDate_Date_Custom= Last_Seen_childWindow.getText();
    Reporter.log("<B><font color = 'blue'> ==> -</font> Last_Seen_childWindow AdDetails Page= " +  lastSeenDate_Date_Custom);
    
    driver.close();
    
    driver.switchTo().window(parent6);
    
    helper.getLastseenDate(lastSeenDate_Date_Custom, imageDate);
    }
    catch(Exception e) {
    	System.out.println("Oops! Looks like we don't have data for this search criteria yet.");
    	 Reporter.log("<B><font color = 'red'> ==> -</font> Oops! Looks like we don't have data for this search criteria yet.");
    }
    
	Reporter.log("");
	Reporter.log("<B><font color = 'Blue-Violet'> 3rd Ad -</font> ");
	
    try {
   	helper.Scrollintoview(current_date3);
    helper.waitFor(current_date3);
	helper.highLightElement(driver, current_date3);
	String imageDate = current_date3.getText();
	System.out.println("current_Date_Custom : " + imageDate);
	Reporter.log("<B><font color = 'blue'> ==> -</font> Clicked On Custom Month Image = " + imageDate);
	
	helper.Scrollintoview(showAnalytics_Button3);
	helper.waitFor(showAnalytics_Button3);
	helper.highLightElement(driver, showAnalytics_Button3);
	String linkText1 = showAnalytics_Button3.getAttribute("href");
	helper.getAdID(linkText1);
	helper.jsCLick(showAnalytics_Button3);
	Reporter.log("<B><font color = 'blue'> ==> -</font> Clicked on showAnalytics Button");
	
	Set<String> S7=driver.getWindowHandles();
    Iterator<String>it6=S7.iterator();
    String parent6=it6.next();
    String child6=it6.next();
    
    driver.switchTo().window(child6);
    
    helper.waitForPageToLoad();
    helper.waitFor(Last_Seen_childWindow);
    helper.highLightElement(driver, Last_Seen_childWindow);
    String lastSeenDate_Date_Custom= Last_Seen_childWindow.getText();
    Reporter.log("<B><font color = 'blue'> ==> -</font> Last_Seen_childWindow AdDetails Page= " +  lastSeenDate_Date_Custom);
    
    driver.close();
    
    driver.switchTo().window(parent6);
    
    helper.getLastseenDate(lastSeenDate_Date_Custom, imageDate);
    }
    catch(Exception e) {
    	System.out.println("Oops! Looks like we don't have data for this search criteria yet.");
    	 Reporter.log("<B><font color = 'red'> ==> -</font> Oops! Looks like we don't have data for this search criteria yet.");
    }
    
	Reporter.log("");
	Reporter.log("<B><font color = 'Blue-Violet'> 4th Ad -</font> ");
	
    try {
   	helper.Scrollintoview(current_date4);
    helper.waitFor(current_date4);
	helper.highLightElement(driver, current_date4);
	String imageDate = current_date4.getText();
	System.out.println("current_Date_Custom : " + imageDate);
	Reporter.log("<B><font color = 'blue'> ==> -</font> Clicked On Custom Month Image = " + imageDate);
	
	helper.Scrollintoview(showAnalytics_Button4);
	helper.waitFor(showAnalytics_Button4);
	helper.highLightElement(driver, showAnalytics_Button4);
	String linkText1 = showAnalytics_Button4.getAttribute("href");
	helper.getAdID(linkText1);
	helper.jsCLick(showAnalytics_Button4);
	Reporter.log("<B><font color = 'blue'> ==> -</font> Clicked on showAnalytics Button");
	
	Set<String> S7=driver.getWindowHandles();
    Iterator<String>it6=S7.iterator();
    String parent6=it6.next();
    String child6=it6.next();
    
    driver.switchTo().window(child6);
    
    helper.waitForPageToLoad();
    helper.waitFor(Last_Seen_childWindow);
    helper.highLightElement(driver, Last_Seen_childWindow);
    String lastSeenDate_Date_Custom= Last_Seen_childWindow.getText();
    Reporter.log("<B><font color = 'blue'> ==> -</font> Last_Seen_childWindow AdDetails Page= " +  lastSeenDate_Date_Custom);
    
    driver.close();
    
    driver.switchTo().window(parent6);
    
    helper.getLastseenDate(lastSeenDate_Date_Custom, imageDate);
    }
    catch(Exception e) {
    	System.out.println("Oops! Looks like we don't have data for this search criteria yet.");
    	 Reporter.log("<B><font color = 'red'> ==> -</font> Oops! Looks like we don't have data for this search criteria yet.");
    }
    
	Reporter.log("");
	Reporter.log("<B><font color = 'Blue-Violet'> 5th Ad -</font> ");
	
	
    try {
   	helper.Scrollintoview(current_date5);
    helper.waitFor(current_date5);
	helper.highLightElement(driver, current_date5);
	String imageDate = current_date5.getText();
	System.out.println("current_Date_Custom : " + imageDate);
	Reporter.log("<B><font color = 'blue'> ==> -</font> Clicked On Custom Month Image = " + imageDate);
	
	helper.Scrollintoview(showAnalytics_Button5);
	helper.waitFor(showAnalytics_Button5);
	helper.highLightElement(driver, showAnalytics_Button5);
	String linkText1 = showAnalytics_Button4.getAttribute("href");
	helper.getAdID(linkText1);
	helper.jsCLick(showAnalytics_Button5);
	Reporter.log("<B><font color = 'blue'> ==> -</font> Clicked on showAnalytics Button");
	
	Set<String> S7=driver.getWindowHandles();
    Iterator<String>it6=S7.iterator();
    String parent6=it6.next();
    String child6=it6.next();
    
    driver.switchTo().window(child6);
    
    helper.waitForPageToLoad();
    helper.waitFor(Last_Seen_childWindow);
    helper.highLightElement(driver, Last_Seen_childWindow);
    String lastSeenDate_Date_Custom= Last_Seen_childWindow.getText();
    Reporter.log("<B><font color = 'blue'> ==> -</font> Last_Seen_childWindow AdDetails Page= " +  lastSeenDate_Date_Custom);
    
    driver.close();
    
    driver.switchTo().window(parent6);
    
    helper.getLastseenDate(lastSeenDate_Date_Custom, imageDate);
    }
    catch(Exception e) {
    	System.out.println("Oops! Looks like we don't have data for this search criteria yet.");
    	 Reporter.log("<B><font color = 'red'> ==> -</font> Oops! Looks like we don't have data for this search criteria yet.");
    }
    
	Reporter.log("");
	Reporter.log("<B><font color = 'Blue-Violet'> 6th Ad -</font> ");
	
	
    try {
   	helper.Scrollintoview(current_date6);
    helper.waitFor(current_date6);
	helper.highLightElement(driver, current_date6);
	String imageDate = current_date6.getText();
	System.out.println("current_Date_Custom : " + imageDate);
	Reporter.log("<B><font color = 'blue'> ==> -</font> Clicked On Custom Month Image = " + imageDate);
	
	helper.Scrollintoview(showAnalytics_Button6);
	helper.waitFor(showAnalytics_Button6);
	helper.highLightElement(driver, showAnalytics_Button6);
	String linkText1 = showAnalytics_Button6.getAttribute("href");
	helper.getAdID(linkText1);
	helper.jsCLick(showAnalytics_Button6);
	Reporter.log("<B><font color = 'blue'> ==> -</font> Clicked on showAnalytics Button");
	
	Set<String> S7=driver.getWindowHandles();
    Iterator<String>it6=S7.iterator();
    String parent6=it6.next();
    String child6=it6.next();
    
    driver.switchTo().window(child6);
    
    helper.waitForPageToLoad();
    helper.waitFor(Last_Seen_childWindow);
    helper.highLightElement(driver, Last_Seen_childWindow);
    String lastSeenDate_Date_Custom= Last_Seen_childWindow.getText();
    Reporter.log("<B><font color = 'blue'> ==> -</font> Last_Seen_childWindow AdDetails Page= " +  lastSeenDate_Date_Custom);
    
    driver.close();
    
    driver.switchTo().window(parent6);
    
    helper.getLastseenDate(lastSeenDate_Date_Custom, imageDate);
    }
    catch(Exception e) {
    	System.out.println("Oops! Looks like we don't have data for this search criteria yet.");
    	 Reporter.log("<B><font color = 'red'> ==> -</font> Oops! Looks like we don't have data for this search criteria yet.");
    }
    
	Reporter.log("");
	Reporter.log("<B><font color = 'Blue-Violet'> 7th Ad -</font> ");
	
	
    try {
   	helper.Scrollintoview(current_date7);
    helper.waitFor(current_date7);
	helper.highLightElement(driver, current_date7);
	String imageDate = current_date7.getText();
	System.out.println("current_Date_Custom : " + imageDate);
	Reporter.log("<B><font color = 'blue'> ==> -</font> Clicked On Custom Month Image = " + imageDate);
	
	helper.Scrollintoview(showAnalytics_Button7);
	helper.waitFor(showAnalytics_Button7);
	helper.highLightElement(driver, showAnalytics_Button7);
	String linkText1 = showAnalytics_Button7.getAttribute("href");
	helper.getAdID(linkText1);
	helper.jsCLick(showAnalytics_Button7);
	Reporter.log("<B><font color = 'blue'> ==> -</font> Clicked on showAnalytics Button");
	
	Set<String> S7=driver.getWindowHandles();
    Iterator<String>it6=S7.iterator();
    String parent6=it6.next();
    String child6=it6.next();
    
    driver.switchTo().window(child6);
    
    helper.waitForPageToLoad();
    helper.waitFor(Last_Seen_childWindow);
    helper.highLightElement(driver, Last_Seen_childWindow);
    String lastSeenDate_Date_Custom= Last_Seen_childWindow.getText();
    Reporter.log("<B><font color = 'blue'> ==> -</font> Last_Seen_childWindow AdDetails Page= " +  lastSeenDate_Date_Custom);
    
    driver.close();
    
    driver.switchTo().window(parent6);
    
    helper.getLastseenDate(lastSeenDate_Date_Custom, imageDate);
    }
    catch(Exception e) {
    	System.out.println("Oops! Looks like we don't have data for this search criteria yet.");
    	 Reporter.log("<B><font color = 'red'> ==> -</font> Oops! Looks like we don't have data for this search criteria yet.");
    }
    
	Reporter.log("");
	Reporter.log("<B><font color = 'Blue-Violet'> 8th Ad -</font> ");
	
	
    try {
   	helper.Scrollintoview(current_date8);
    helper.waitFor(current_date8);
	helper.highLightElement(driver, current_date8);
	String imageDate = current_date8.getText();
	System.out.println("current_Date_Custom : " + imageDate);
	Reporter.log("<B><font color = 'blue'> ==> -</font> Clicked On Custom Month Image = " + imageDate);
	
	helper.Scrollintoview(showAnalytics_Button8);
	helper.waitFor(showAnalytics_Button8);
	helper.highLightElement(driver, showAnalytics_Button8);
	String linkText1 = showAnalytics_Button8.getAttribute("href");
	helper.getAdID(linkText1);
	helper.jsCLick(showAnalytics_Button8);
	Reporter.log("<B><font color = 'blue'> ==> -</font> Clicked on showAnalytics Button");
	
	Set<String> S7=driver.getWindowHandles();
    Iterator<String>it6=S7.iterator();
    String parent6=it6.next();
    String child6=it6.next();
    
    driver.switchTo().window(child6);
    
    helper.waitForPageToLoad();
    helper.waitFor(Last_Seen_childWindow);
    helper.highLightElement(driver, Last_Seen_childWindow);
    String lastSeenDate_Date_Custom= Last_Seen_childWindow.getText();
    Reporter.log("<B><font color = 'blue'> ==> -</font> Last_Seen_childWindow AdDetails Page= " +  lastSeenDate_Date_Custom);
    
    driver.close();
    
    driver.switchTo().window(parent6);
    
    helper.getLastseenDate(lastSeenDate_Date_Custom, imageDate);
    }
    catch(Exception e) {
    	System.out.println("Oops! Looks like we don't have data for this search criteria yet.");
    	 Reporter.log("<B><font color = 'red'> ==> -</font> Oops! Looks like we don't have data for this search criteria yet.");
    }
    
	Reporter.log("");
	Reporter.log("<B><font color = 'Blue-Violet'> 9th Ad -</font> ");
	
	
    try {
   	helper.Scrollintoview(current_date9);
    helper.waitFor(current_date9);
	helper.highLightElement(driver, current_date9);
	String imageDate = current_date9.getText();
	System.out.println("current_Date_Custom : " + imageDate);
	Reporter.log("<B><font color = 'blue'> ==> -</font> Clicked On Custom Month Image = " + imageDate);
	
	helper.Scrollintoview(showAnalytics_Button9);
	helper.waitFor(showAnalytics_Button9);
	helper.highLightElement(driver, showAnalytics_Button9);
	String linkText1 = showAnalytics_Button9.getAttribute("href");
	helper.getAdID(linkText1);
	helper.jsCLick(showAnalytics_Button9);
	Reporter.log("<B><font color = 'blue'> ==> -</font> Clicked on showAnalytics Button");
	
	Set<String> S7=driver.getWindowHandles();
    Iterator<String>it6=S7.iterator();
    String parent6=it6.next();
    String child6=it6.next();
    
    driver.switchTo().window(child6);
    
    helper.waitForPageToLoad();
    helper.waitFor(Last_Seen_childWindow);
    helper.highLightElement(driver, Last_Seen_childWindow);
    String lastSeenDate_Date_Custom= Last_Seen_childWindow.getText();
    Reporter.log("<B><font color = 'blue'> ==> -</font> Last_Seen_childWindow AdDetails Page= " +  lastSeenDate_Date_Custom);
    
    driver.close();
    
    driver.switchTo().window(parent6);
    
    helper.getLastseenDate(lastSeenDate_Date_Custom, imageDate);
    }
    catch(Exception e) {
    	System.out.println("Oops! Looks like we don't have data for this search criteria yet.");
    	 Reporter.log("<B><font color = 'red'> ==> -</font> Oops! Looks like we don't have data for this search criteria yet.");
    }
    
	Reporter.log("");
	Reporter.log("<B><font color = 'Blue-Violet'> 10th Ad -</font> ");
	
	
    try {
   	helper.Scrollintoview(current_date10);
    helper.waitFor(current_date10);
	helper.highLightElement(driver, current_date10);
	String imageDate = current_date10.getText();
	System.out.println("current_Date_Custom : " + imageDate);
	Reporter.log("<B><font color = 'blue'> ==> -</font> Clicked On Custom Month Image = " + imageDate);
	
	helper.Scrollintoview(showAnalytics_Button10);
	helper.waitFor(showAnalytics_Button10);
	helper.highLightElement(driver, showAnalytics_Button10);
	String linkText1 = showAnalytics_Button10.getAttribute("href");
	helper.getAdID(linkText1);
	helper.jsCLick(showAnalytics_Button10);
	Reporter.log("<B><font color = 'blue'> ==> -</font> Clicked on showAnalytics Button");
	
	Set<String> S7=driver.getWindowHandles();
    Iterator<String>it6=S7.iterator();
    String parent6=it6.next();
    String child6=it6.next();
    
    driver.switchTo().window(child6);
    
    helper.waitForPageToLoad();
    helper.waitFor(Last_Seen_childWindow);
    helper.highLightElement(driver, Last_Seen_childWindow);
    String lastSeenDate_Date_Custom= Last_Seen_childWindow.getText();
    Reporter.log("<B><font color = 'blue'> ==> -</font> Last_Seen_childWindow AdDetails Page= " +  lastSeenDate_Date_Custom);
    
    driver.close();
    
    driver.switchTo().window(parent6);
    
    helper.getLastseenDate(lastSeenDate_Date_Custom, imageDate);
    }
    catch(Exception e) {
    	System.out.println("Oops! Looks like we don't have data for this search criteria yet.");
    	 Reporter.log("<B><font color = 'red'> ==> -</font> Oops! Looks like we don't have data for this search criteria yet.");
    }
    
	Reporter.log("");
	Reporter.log("<B><font color = 'Blue-Violet'> 11 Ad -</font> ");
	
	
    try {
   	helper.Scrollintoview(current_date11);
    helper.waitFor(current_date11);
	helper.highLightElement(driver, current_date11);
	String imageDate = current_date11.getText();
	System.out.println("current_Date_Custom : " + imageDate);
	Reporter.log("<B><font color = 'blue'> ==> -</font> Clicked On Custom Month Image = " + imageDate);
	
	helper.Scrollintoview(showAnalytics_Button11);
	helper.waitFor(showAnalytics_Button11);
	helper.highLightElement(driver, showAnalytics_Button11);
	String linkText1 = showAnalytics_Button11.getAttribute("href");
	helper.getAdID(linkText1);
	helper.jsCLick(showAnalytics_Button11);
	Reporter.log("<B><font color = 'blue'> ==> -</font> Clicked on showAnalytics Button");
	
	Set<String> S7=driver.getWindowHandles();
    Iterator<String>it6=S7.iterator();
    String parent6=it6.next();
    String child6=it6.next();
    
    driver.switchTo().window(child6);
    
    helper.waitForPageToLoad();
    helper.waitFor(Last_Seen_childWindow);
    helper.highLightElement(driver, Last_Seen_childWindow);
    String lastSeenDate_Date_Custom= Last_Seen_childWindow.getText();
    Reporter.log("<B><font color = 'blue'> ==> -</font> Last_Seen_childWindow AdDetails Page= " +  lastSeenDate_Date_Custom);
    
    driver.close();
    
    driver.switchTo().window(parent6);
    
    helper.getLastseenDate(lastSeenDate_Date_Custom, imageDate);
    }
    catch(Exception e) {
    	System.out.println("Oops! Looks like we don't have data for this search criteria yet.");
    	 Reporter.log("<B><font color = 'red'> ==> -</font> Oops! Looks like we don't have data for this search criteria yet.");
    }
    
	Reporter.log("");
	Reporter.log("<B><font color = 'Blue-Violet'> 12th Ad -</font> ");
	
    try {
   	helper.Scrollintoview(current_date12);
    helper.waitFor(current_date12);
	helper.highLightElement(driver, current_date12);
	String imageDate = current_date12.getText();
	System.out.println("current_Date_Custom : " + imageDate);
	Reporter.log("<B><font color = 'blue'> ==> -</font> Clicked On Custom Month Image = " + imageDate);
	
	helper.Scrollintoview(showAnalytics_Button12);
	helper.waitFor(showAnalytics_Button12);
	helper.highLightElement(driver, showAnalytics_Button12);
	String linkText1 = showAnalytics_Button12.getAttribute("href");
	helper.getAdID(linkText1);
	helper.jsCLick(showAnalytics_Button12);
	Reporter.log("<B><font color = 'blue'> ==> -</font> Clicked on showAnalytics Button");
	
	Set<String> S7=driver.getWindowHandles();
    Iterator<String>it6=S7.iterator();
    String parent6=it6.next();
    String child6=it6.next();
    
    driver.switchTo().window(child6);
    
    helper.waitForPageToLoad();
    helper.waitFor(Last_Seen_childWindow);
    helper.highLightElement(driver, Last_Seen_childWindow);
    String lastSeenDate_Date_Custom= Last_Seen_childWindow.getText();
    Reporter.log("<B><font color = 'blue'> ==> -</font> Last_Seen_childWindow AdDetails Page= " +  lastSeenDate_Date_Custom);
    
    driver.close();
    
    driver.switchTo().window(parent6);
    
    helper.getLastseenDate(lastSeenDate_Date_Custom, imageDate);
    }
    catch(Exception e) {
    	System.out.println("Oops! Looks like we don't have data for this search criteria yet.");
    	 Reporter.log("<B><font color = 'red'> ==> -</font> Oops! Looks like we don't have data for this search criteria yet.");
    }
    
	Reporter.log("");
	Reporter.log("<B><font color = 'Blue-Violet'> 13th Ad -</font> ");
	
	
    try {
   	helper.Scrollintoview(current_date13);
    helper.waitFor(current_date13);
	helper.highLightElement(driver, current_date13);
	String imageDate = current_date13.getText();
	System.out.println("current_Date_Custom : " + imageDate);
	Reporter.log("<B><font color = 'blue'> ==> -</font> Clicked On Custom Month Image = " + imageDate);
	
	helper.Scrollintoview(showAnalytics_Button13);
	helper.waitFor(showAnalytics_Button13);
	helper.highLightElement(driver, showAnalytics_Button13);
	String linkText1 = showAnalytics_Button13.getAttribute("href");
	helper.getAdID(linkText1);
	helper.jsCLick(showAnalytics_Button13);
	Reporter.log("<B><font color = 'blue'> ==> -</font> Clicked on showAnalytics Button");
	
	Set<String> S7=driver.getWindowHandles();
    Iterator<String>it6=S7.iterator();
    String parent6=it6.next();
    String child6=it6.next();
    
    driver.switchTo().window(child6);
    
    helper.waitForPageToLoad();
    helper.waitFor(Last_Seen_childWindow);
    helper.highLightElement(driver, Last_Seen_childWindow);
    String lastSeenDate_Date_Custom= Last_Seen_childWindow.getText();
    Reporter.log("<B><font color = 'blue'> ==> -</font> Last_Seen_childWindow AdDetails Page= " +  lastSeenDate_Date_Custom);
    
    
    driver.close();
    
    driver.switchTo().window(parent6);
  
    helper.getLastseenDate(lastSeenDate_Date_Custom, imageDate);
    }
    catch(Exception e) {
    	System.out.println("Oops! Looks like we don't have data for this search criteria yet.");
    	 Reporter.log("<B><font color = 'red'> ==> -</font> Oops! Looks like we don't have data for this search criteria yet.");
    }
    
	Reporter.log("");
	Reporter.log("<B><font color = 'Blue-Violet'> 14th Ad -</font> ");
	
    try {
   	helper.Scrollintoview(current_date14);
    helper.waitFor(current_date14);
	helper.highLightElement(driver, current_date14);
	String imageDate = current_date14.getText();
	System.out.println("current_Date_Custom : " + imageDate);
	Reporter.log("<B><font color = 'blue'> ==> -</font> Clicked On Custom Month Image = " + imageDate);
	
	helper.Scrollintoview(showAnalytics_Button14);
	helper.waitFor(showAnalytics_Button14);
	helper.highLightElement(driver, showAnalytics_Button14);
	String linkText1 = showAnalytics_Button14.getAttribute("href");
	helper.getAdID(linkText1);
	helper.jsCLick(showAnalytics_Button14);
	Reporter.log("<B><font color = 'blue'> ==> -</font> Clicked on showAnalytics Button");
	
	Set<String> S7=driver.getWindowHandles();
    Iterator<String>it6=S7.iterator();
    String parent6=it6.next();
    String child6=it6.next();
    
    driver.switchTo().window(child6);
    
    helper.waitForPageToLoad();
    helper.waitFor(Last_Seen_childWindow);
    helper.highLightElement(driver, Last_Seen_childWindow);
    String lastSeenDate_Date_Custom= Last_Seen_childWindow.getText();
    Reporter.log("<B><font color = 'blue'> ==> -</font> Last_Seen_childWindow AdDetails Page= " +  lastSeenDate_Date_Custom);
    
    driver.close();
    
    driver.switchTo().window(parent6);
   
    helper.getLastseenDate(lastSeenDate_Date_Custom, imageDate);
    }
    catch(Exception e) {
    	System.out.println("Oops! Looks like we don't have data for this search criteria yet.");
    	 Reporter.log("<B><font color = 'red'> ==> -</font> Oops! Looks like we don't have data for this search criteria yet.");
    }
    
	Reporter.log("");
	Reporter.log("<B><font color = 'Blue-Violet'> 15th Ad -</font> ");
	
	
    try {
   	helper.Scrollintoview(current_date15);
    helper.waitFor(current_date15);
	helper.highLightElement(driver, current_date15);
	String imageDate = current_date15.getText();
	System.out.println("current_Date_Custom : " + imageDate);
	Reporter.log("<B><font color = 'blue'> ==> -</font> Clicked On Custom Month Image = " + imageDate);
	
	helper.Scrollintoview(showAnalytics_Button15);
	helper.waitFor(showAnalytics_Button15);
	helper.highLightElement(driver, showAnalytics_Button15);
	String linkText1 = showAnalytics_Button15.getAttribute("href");
	helper.getAdID(linkText1);
	helper.jsCLick(showAnalytics_Button15);
	Reporter.log("<B><font color = 'blue'> ==> -</font> Clicked on showAnalytics Button");
	
	Set<String> S7=driver.getWindowHandles();
    Iterator<String>it6=S7.iterator();
    String parent6=it6.next();
    String child6=it6.next();
    
    driver.switchTo().window(child6);
    
    helper.waitForPageToLoad();
    helper.waitFor(Last_Seen_childWindow);
    helper.highLightElement(driver, Last_Seen_childWindow);
    String lastSeenDate_Date_Custom= Last_Seen_childWindow.getText();
    Reporter.log("<B><font color = 'blue'> ==> -</font> Last_Seen_childWindow AdDetails Page= " +  lastSeenDate_Date_Custom);
    
    driver.close();
    
    driver.switchTo().window(parent6);
    
    helper.getLastseenDate(lastSeenDate_Date_Custom, imageDate);
    }
    catch(Exception e) {
    	System.out.println("Oops! Looks like we don't have data for this search criteria yet.");
    	 Reporter.log("<B><font color = 'red'> ==> -</font> Oops! Looks like we don't have data for this search criteria yet.");
    }
   
   
    }

}
