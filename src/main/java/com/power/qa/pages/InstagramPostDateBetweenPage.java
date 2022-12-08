package com.power.qa.pages;

import java.time.LocalDate;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import org.testng.Reporter;

import com.power.qa.base.TestBase;
import com.power.qa.util.Helpers;

public class InstagramPostDateBetweenPage extends BasePage{

	public InstagramPostDateBetweenPage(WebDriver driver) {
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
	
	@FindBy(xpath="//span[@id='post_timefilter']")
	WebElement post_Date_Between_DropDown;
	
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
	
	@FindBy(xpath="(//li[text()='All'])[2]")
	WebElement post_Date_Between_All;
	
	@FindBy(xpath="//div[@class='ad_date']")
	WebElement current_Image_Date;
	
	@FindBy(xpath="//a[text()='Show Analytics']")
	WebElement showAnalytics_Button;
	
	@FindBy(xpath="//div[@id='post_date1']")
	WebElement post_Date;
	
	@FindBy(xpath="//div[@id='last_seen1']")
	WebElement Last_Seen_childWindow;
	
	@FindBy(xpath="(//li[text()='Today'])[2]")
	WebElement post_Date_Between_Today;
	
	@FindBy(xpath="(//li[text()='Yesterday'])[2]")
	WebElement post_Date_Between_Yesterday;
	
	@FindBy(xpath="(//li[text()='Last Seven Days'])[2]")
	WebElement post_Date_Between_LastSevenDays;
	
	@FindBy(xpath="(//li[text()='Last Thirty Days'])[2]")
	WebElement post_Date_Between_LastThirtyDays;
	
	@FindBy(xpath="(//li[text()='This Month'])[2]")
	WebElement post_Date_Between_ThisMonth;
	
	@FindBy(xpath="(//li[text()='Last Month'])[2]")
	WebElement post_Date_Between_LastMonth;
	
	@FindBy(xpath="(//li[text()='Custom Range'])[2]")
	WebElement post_Date_Between_Custom;
	
	@FindBy(xpath="//th[@class='prev available']")
	WebElement previousMonthButton;
	
	@FindBy(xpath="//th[@class='next available']")
	WebElement nextMonthButton;
	
	@FindBy(xpath="//td[text()='1']")
	WebElement custom_startDate;
	
	@FindBy(xpath="//td[text()='10']")
	WebElement custom_endDate;
	
	public void getPostDateBetween() throws InterruptedException {
		
		Reporter.log("<B><font color = 'purple'> Step1 -</font> Logged into PowerAdSpy Application");
		String Page_titel = driver.getTitle();
		System.out.println(Page_titel);
		Reporter.log("<B><font color = 'purple'> Step2 -</font> I am on the page :" + Page_titel);

		helper.waitForPageToLoad();
		helper.waitFor(Logo);
		helper.highLightElement(driver, Logo);
		Assert.assertTrue(Logo.isDisplayed(), "Power Ad Spy Logo is Dispalyed");
		Reporter.log("<B><font color = 'purple'> Step3 -</font> Power Ad Spy Logo is Displayed");
		
		helper.waitFor(Instagram);
		helper.highLightElement(driver, Instagram);
		Instagram.click();
		Assert.assertTrue(Instagram.isDisplayed(), "Clicked on Instagram ");
		Reporter.log("<B><font color = 'purple'> Step4 -</font> Clicked On Instagram Icon");
		helper.waitForPageToLoad();
		
		String Page_titel_1 = driver.getTitle();
		System.out.println(Page_titel);
		Reporter.log("<B><font color = 'purple'> Step5 -</font> I am on the page :" + Page_titel_1);
		
		//ALL
	/*	
		Reporter.log("");
		Reporter.log("<B><font color = 'green'> Post Date Between : All -</font> ");
		
	    helper.waitFor(clearSearchField);
		helper.highLightElement(driver, clearSearchField);
		helper.jsCLick(clearSearchField);
		Reporter.log("<B><font color = 'orange'> Step 1 -</font> Clicked On clear search.");
		
	    helper.waitFor(post_Date_Between_DropDown);
		helper.highLightElement(driver, post_Date_Between_DropDown);
		helper.jsCLick(post_Date_Between_DropDown);
		Reporter.log("<B><font color = 'orange'> Step 2 -</font> Clicked On Post Date Between DropDown.");
		
		helper.waitFor(post_Date_Between_All);
		helper.highLightElement(driver, post_Date_Between_All);
		helper.jsCLick(post_Date_Between_All);
		Reporter.log("<B><font color = 'orange'> Step 3 -</font> Clicked On Post Date Between All.");
		
		helper.waitFor(search_bar);
		helper.highLightElement(driver, search_bar);
		helper.jsCLick(search_bar);
		Reporter.log("<B><font color = 'orange'> Step 4 -</font> Clicked On Search Bar.");
		
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
		helper.jsCLick(current_Image_Date);
		Reporter.log("<B><font color = 'blue'> ==> -</font> Clicked On Current Image Date : " + imageDate);

		helper.Scrollintoview(showAnalytics_Button1);
		helper.waitFor(showAnalytics_Button1);
		helper.highLightElement(driver, showAnalytics_Button1);
		String linkText1 = showAnalytics_Button1.getAttribute("href");
		helper.getAdID(linkText1);
		helper.jsCLick(showAnalytics_Button1);
		Reporter.log("<B><font color = 'blue'> ==> -</font> Clicked On ShowAnalytics Button.");

		Set<String> S1=driver.getWindowHandles();
	    Iterator<String>it=S1.iterator();
	    String parent=it.next();
	    String child=it.next();
	    
	    
	    driver.switchTo().window(child);
	    
	    helper.waitForPageToLoad();
	    helper.waitFor(Last_Seen_childWindow);
	    helper.Scrollintoview(Last_Seen_childWindow);
	    helper.highLightElement(driver, Last_Seen_childWindow);
	    String lastSeenDate = Last_Seen_childWindow.getText();
	    Reporter.log("<B><font color = 'blue'> ==> -</font> LastScene_date AdDetails Page= " +  lastSeenDate);
	
	    helper.Scrollintoview(post_Date);
	    helper.waitFor(post_Date);
	    helper.highLightElement(driver, post_Date);
	    String postSeenDate = post_Date.getText();
	    Reporter.log("<B><font color = 'blue'> ==> -</font> Post Date in AdDetails Page= " +  postSeenDate);
	      
	    driver.close();
	    
	    driver.switchTo().window(parent);
	    
	    helper.getLastseenDate(lastSeenDate, imageDate);
		}
		catch (Exception e) {
	    	 Reporter.log("<B><font color = 'red'> ==> -</font> Oops! Looks like we don't have data for this search criteria yet.");
		}
		
		Reporter.log("");
		Reporter.log("<B><font color = 'Blue-Violet'> 2nd -</font> ");
		
		try {
		helper.Scrollintoview(current_date2);
		helper.waitFor(current_date2);
		helper.highLightElement(driver, current_date2);
		String imageDate = current_date2.getText();
		helper.jsCLick(current_Image_Date);
		Reporter.log("<B><font color = 'blue'> ==> -</font> Clicked On Current Image Date : " + imageDate);

		helper.Scrollintoview(showAnalytics_Button2);
		helper.waitFor(showAnalytics_Button2);
		helper.highLightElement(driver, showAnalytics_Button2);
		String linkText1 = showAnalytics_Button2.getAttribute("href");
		helper.getAdID(linkText1);
		helper.jsCLick(showAnalytics_Button2);
		Reporter.log("<B><font color = 'blue'> ==> -</font> Clicked On ShowAnalytics Button.");

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
	    Reporter.log("<B><font color = 'blue'> ==> -</font> LastScene_date AdDetails Page= " +  lastSeenDate);
		
	    helper.Scrollintoview(post_Date);
	    helper.waitFor(post_Date);
	    helper.highLightElement(driver, post_Date);
	    String postSeenDate = post_Date.getText();
	    Reporter.log("<B><font color = 'blue'> ==> -</font> Post Date in AdDetails Page= " +  postSeenDate);
	      
	    driver.close();
	    
	    driver.switchTo().window(parent);
	    
	    helper.getLastseenDate(lastSeenDate, imageDate);
		}
		catch (Exception e) {
	    	 Reporter.log("<B><font color = 'red'> ==> -</font> Oops! Looks like we don't have data for this search criteria yet.");
		}
		
		Reporter.log("");
		Reporter.log("<B><font color = 'Blue-Violet'> 3rd -</font> ");
		
		try {
		helper.Scrollintoview(current_date3);
		helper.waitFor(current_date3);
		helper.highLightElement(driver, current_date3);
		String imageDate = current_date3.getText();
		helper.jsCLick(current_Image_Date);
		Reporter.log("<B><font color = 'blue'> ==> -</font> Clicked On Current Image Date : " + imageDate);

		helper.Scrollintoview(showAnalytics_Button3);
		helper.waitFor(showAnalytics_Button3);
		helper.highLightElement(driver, showAnalytics_Button3);
		String linkText1 = showAnalytics_Button3.getAttribute("href");
		helper.getAdID(linkText1);
		helper.jsCLick(showAnalytics_Button3);
		Reporter.log("<B><font color = 'blue'> ==> -</font> Clicked On ShowAnalytics Button.");

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
	    Reporter.log("<B><font color = 'blue'> ==> -</font> LastScene_date AdDetails Page= " +  lastSeenDate);
		
	    helper.Scrollintoview(post_Date);
	    helper.waitFor(post_Date);
	    helper.highLightElement(driver, post_Date);
	    String postSeenDate = post_Date.getText();
	    Reporter.log("<B><font color = 'blue'> ==> -</font> Post Date in AdDetails Page= " +  postSeenDate);
	      
	    driver.close();
	    
	    driver.switchTo().window(parent);
	    
	    helper.getLastseenDate(lastSeenDate, imageDate);
		}
		catch (Exception e) {
	    	 Reporter.log("<B><font color = 'red'> ==> -</font> Oops! Looks like we don't have data for this search criteria yet.");
		}
		
		Reporter.log("");
		Reporter.log("<B><font color = 'Blue-Violet'> 4th -</font> ");
		
		try {
		helper.Scrollintoview(current_date4);
		helper.waitFor(current_date4);
		helper.highLightElement(driver, current_date4);
		String imageDate = current_date4.getText();
		helper.jsCLick(current_Image_Date);
		Reporter.log("<B><font color = 'blue'> ==> -</font> Clicked On Current Image Date : " + imageDate);

		helper.Scrollintoview(showAnalytics_Button4);
		helper.waitFor(showAnalytics_Button4);
		helper.highLightElement(driver, showAnalytics_Button4);
		String linkText1 = showAnalytics_Button4.getAttribute("href");
		helper.getAdID(linkText1);
		helper.jsCLick(showAnalytics_Button4);
		Reporter.log("<B><font color = 'blue'> ==> -</font> Clicked On ShowAnalytics Button.");

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
	    Reporter.log("<B><font color = 'blue'> ==> -</font> LastScene_date AdDetails Page= " +  lastSeenDate);
		
	    helper.Scrollintoview(post_Date);
	    helper.waitFor(post_Date);
	    helper.highLightElement(driver, post_Date);
	    String postSeenDate = post_Date.getText();
	    Reporter.log("<B><font color = 'blue'> ==> -</font> Post Date in AdDetails Page= " +  postSeenDate);
	      
	    driver.close();
	    
	    driver.switchTo().window(parent);
	    
	    helper.getLastseenDate(lastSeenDate, imageDate);
		}
		catch (Exception e) {
	    	 Reporter.log("<B><font color = 'red'> ==> -</font> Oops! Looks like we don't have data for this search criteria yet.");
		}
		
		Reporter.log("");
		Reporter.log("<B><font color = 'Blue-Violet'> 5th -</font> ");
		
		try {
		helper.Scrollintoview(current_date5);
		helper.waitFor(current_date5);
		helper.highLightElement(driver, current_date5);
		String imageDate = current_date5.getText();
		helper.jsCLick(current_Image_Date);
		Reporter.log("<B><font color = 'blue'> ==> -</font> Clicked On Current Image Date : " + imageDate);

		helper.Scrollintoview(showAnalytics_Button5);
		helper.waitFor(showAnalytics_Button5);
		helper.highLightElement(driver, showAnalytics_Button5);
		String linkText1 = showAnalytics_Button5.getAttribute("href");
		helper.getAdID(linkText1);
		helper.jsCLick(showAnalytics_Button5);
		Reporter.log("<B><font color = 'blue'> ==> -</font> Clicked On ShowAnalytics Button.");

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
	    Reporter.log("<B><font color = 'blue'> ==> -</font> LastScene_date AdDetails Page= " +  lastSeenDate);
		
	    helper.Scrollintoview(post_Date);
	    helper.waitFor(post_Date);
	    helper.highLightElement(driver, post_Date);
	    String postSeenDate = post_Date.getText();
	    Reporter.log("<B><font color = 'blue'> ==> -</font> Post Date in AdDetails Page= " +  postSeenDate);
	      
	    driver.close();
	    
	    driver.switchTo().window(parent);
	    
	    helper.getLastseenDate(lastSeenDate, imageDate);
		}
		catch (Exception e) {
	    	 Reporter.log("<B><font color = 'red'> ==> -</font> Oops! Looks like we don't have data for this search criteria yet.");
		}
		
		Reporter.log("");
		Reporter.log("<B><font color = 'Blue-Violet'> 6th -</font> ");
		
		try {
		helper.Scrollintoview(current_date6);
		helper.waitFor(current_date6);
		helper.highLightElement(driver, current_date6);
		String imageDate = current_date6.getText();
		helper.jsCLick(current_Image_Date);
		Reporter.log("<B><font color = 'blue'> ==> -</font> Clicked On Current Image Date : " + imageDate);

		helper.Scrollintoview(showAnalytics_Button6);
		helper.waitFor(showAnalytics_Button6);
		helper.highLightElement(driver, showAnalytics_Button6);
		String linkText1 = showAnalytics_Button6.getAttribute("href");
		helper.getAdID(linkText1);
		helper.jsCLick(showAnalytics_Button6);
		Reporter.log("<B><font color = 'blue'> ==> -</font> Clicked On ShowAnalytics Button.");

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
	    Reporter.log("<B><font color = 'blue'> ==> -</font> LastScene_date AdDetails Page= " +  lastSeenDate);
		
	    helper.Scrollintoview(post_Date);
	    helper.waitFor(post_Date);
	    helper.highLightElement(driver, post_Date);
	    String postSeenDate = post_Date.getText();
	    Reporter.log("<B><font color = 'blue'> ==> -</font> Post Date in AdDetails Page= " +  postSeenDate);
	      
	    driver.close();
	    
	    driver.switchTo().window(parent);
	    
	    helper.getLastseenDate(lastSeenDate, imageDate);
		}
		catch (Exception e) {
	    	 Reporter.log("<B><font color = 'red'> ==> -</font> Oops! Looks like we don't have data for this search criteria yet.");
		}
		
		Reporter.log("");
		Reporter.log("<B><font color = 'Blue-Violet'> 7th -</font> ");
		
		try {
		helper.Scrollintoview(current_date7);
		helper.waitFor(current_date7);
		helper.highLightElement(driver, current_date7);
		String imageDate = current_date7.getText();
		helper.jsCLick(current_Image_Date);
		Reporter.log("<B><font color = 'blue'> ==> -</font> Clicked On Current Image Date : " + imageDate);

		helper.Scrollintoview(showAnalytics_Button7);
		helper.waitFor(showAnalytics_Button7);
		helper.highLightElement(driver, showAnalytics_Button7);
		String linkText1 = showAnalytics_Button7.getAttribute("href");
		helper.getAdID(linkText1);
		helper.jsCLick(showAnalytics_Button7);
		Reporter.log("<B><font color = 'blue'> ==> -</font> Clicked On ShowAnalytics Button.");

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
	    Reporter.log("<B><font color = 'blue'> ==> -</font> LastScene_date AdDetails Page= " +  lastSeenDate);
		
	    helper.Scrollintoview(post_Date);
	    helper.waitFor(post_Date);
	    helper.highLightElement(driver, post_Date);
	    String postSeenDate = post_Date.getText();
	    Reporter.log("<B><font color = 'blue'> ==> -</font> Post Date in AdDetails Page= " +  postSeenDate);
	      
	    driver.close();
	    
	    driver.switchTo().window(parent);
	    
	    helper.getLastseenDate(lastSeenDate, imageDate);
		}
		catch (Exception e) {
	    	 Reporter.log("<B><font color = 'red'> ==> -</font> Oops! Looks like we don't have data for this search criteria yet.");
		}
		
		Reporter.log("");
		Reporter.log("<B><font color = 'Blue-Violet'> 8th -</font> ");
		
		try {
		helper.Scrollintoview(current_date8);
		helper.waitFor(current_date8);
		helper.highLightElement(driver, current_date8);
		String imageDate = current_date8.getText();
		helper.jsCLick(current_Image_Date);
		Reporter.log("<B><font color = 'blue'> ==> -</font> Clicked On Current Image Date : " + imageDate);

		helper.Scrollintoview(showAnalytics_Button8);
		helper.waitFor(showAnalytics_Button8);
		helper.highLightElement(driver, showAnalytics_Button8);
		String linkText1 = showAnalytics_Button8.getAttribute("href");
		helper.getAdID(linkText1);
		helper.jsCLick(showAnalytics_Button8);
		Reporter.log("<B><font color = 'blue'> ==> -</font> Clicked On ShowAnalytics Button.");

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
	    Reporter.log("<B><font color = 'blue'> ==> -</font> LastScene_date AdDetails Page= " +  lastSeenDate);
		
	    helper.Scrollintoview(post_Date);
	    helper.waitFor(post_Date);
	    helper.highLightElement(driver, post_Date);
	    String postSeenDate = post_Date.getText();
	    Reporter.log("<B><font color = 'blue'> ==> -</font> Post Date in AdDetails Page= " +  postSeenDate);
	      
	    driver.close();
	    
	    driver.switchTo().window(parent);
	    
	    helper.getLastseenDate(lastSeenDate, imageDate);
		}
		catch (Exception e) {
	    	 Reporter.log("<B><font color = 'red'> ==> -</font> Oops! Looks like we don't have data for this search criteria yet.");
		}
		
		Reporter.log("");
		Reporter.log("<B><font color = 'Blue-Violet'> 9th -</font> ");
		
		try {
		helper.Scrollintoview(current_date9);
		helper.waitFor(current_date9);
		helper.highLightElement(driver, current_date9);
		String imageDate = current_date9.getText();
		helper.jsCLick(current_Image_Date);
		Reporter.log("<B><font color = 'blue'> ==> -</font> Clicked On Current Image Date : " + imageDate);

		helper.Scrollintoview(showAnalytics_Button9);
		helper.waitFor(showAnalytics_Button9);
		helper.highLightElement(driver, showAnalytics_Button9);
		String linkText1 = showAnalytics_Button9.getAttribute("href");
		helper.getAdID(linkText1);
		helper.jsCLick(showAnalytics_Button9);
		Reporter.log("<B><font color = 'blue'> ==> -</font> Clicked On ShowAnalytics Button.");

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
	    Reporter.log("<B><font color = 'blue'> ==> -</font> LastScene_date AdDetails Page= " +  lastSeenDate);
		
	    helper.Scrollintoview(post_Date);
	    helper.waitFor(post_Date);
	    helper.highLightElement(driver, post_Date);
	    String postSeenDate = post_Date.getText();
	    Reporter.log("<B><font color = 'blue'> ==> -</font> Post Date in AdDetails Page= " +  postSeenDate);
	      
	    driver.close();
	    
	    driver.switchTo().window(parent);
	    
	    helper.getLastseenDate(lastSeenDate, imageDate);
		}
		catch (Exception e) {
	    	 Reporter.log("<B><font color = 'red'> ==> -</font> Oops! Looks like we don't have data for this search criteria yet.");
		}
		
		Reporter.log("");
		Reporter.log("<B><font color = 'Blue-Violet'> 10th -</font> ");
		
		try {
		helper.Scrollintoview(current_date10);
		helper.waitFor(current_date10);
		helper.highLightElement(driver, current_date10);
		String imageDate = current_date10.getText();
		helper.jsCLick(current_Image_Date);
		Reporter.log("<B><font color = 'blue'> ==> -</font> Clicked On Current Image Date : " + imageDate);

		helper.Scrollintoview(showAnalytics_Button10);
		helper.waitFor(showAnalytics_Button10);
		helper.highLightElement(driver, showAnalytics_Button10);
		String linkText1 = showAnalytics_Button10.getAttribute("href");
		helper.getAdID(linkText1);
		helper.jsCLick(showAnalytics_Button10);
		Reporter.log("<B><font color = 'blue'> ==> -</font> Clicked On ShowAnalytics Button.");

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
	    Reporter.log("<B><font color = 'blue'> ==> -</font> LastScene_date AdDetails Page= " +  lastSeenDate);
		
	    helper.Scrollintoview(post_Date);
	    helper.waitFor(post_Date);
	    helper.highLightElement(driver, post_Date);
	    String postSeenDate = post_Date.getText();
	    Reporter.log("<B><font color = 'blue'> ==> -</font> Post Date in AdDetails Page= " +  postSeenDate);
	      
	    driver.close();
	    
	    driver.switchTo().window(parent);
	    
	    helper.getLastseenDate(lastSeenDate, imageDate);
		}
		catch (Exception e) {
	    	 Reporter.log("<B><font color = 'red'> ==> -</font> Oops! Looks like we don't have data for this search criteria yet.");
		}
		
		Reporter.log("");
		Reporter.log("<B><font color = 'Blue-Violet'> 11th -</font> ");
		
		try {
		helper.Scrollintoview(current_date11);
		helper.waitFor(current_date11);
		helper.highLightElement(driver, current_date11);
		String imageDate = current_date11.getText();
		helper.jsCLick(current_Image_Date);
		Reporter.log("<B><font color = 'blue'> ==> -</font> Clicked On Current Image Date : " + imageDate);

		helper.Scrollintoview(showAnalytics_Button11);
		helper.waitFor(showAnalytics_Button11);
		helper.highLightElement(driver, showAnalytics_Button11);
		String linkText1 = showAnalytics_Button11.getAttribute("href");
		helper.getAdID(linkText1);
		helper.jsCLick(showAnalytics_Button11);
		Reporter.log("<B><font color = 'blue'> ==> -</font> Clicked On ShowAnalytics Button.");

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
	    Reporter.log("<B><font color = 'blue'> ==> -</font> LastScene_date AdDetails Page= " +  lastSeenDate);
		
	    helper.Scrollintoview(post_Date);
	    helper.waitFor(post_Date);
	    helper.highLightElement(driver, post_Date);
	    String postSeenDate = post_Date.getText();
	    Reporter.log("<B><font color = 'blue'> ==> -</font> Post Date in AdDetails Page= " +  postSeenDate);
	      
	    driver.close();
	    
	    driver.switchTo().window(parent);
	    
	    helper.getLastseenDate(lastSeenDate, imageDate);
		}
		catch (Exception e) {
	    	 Reporter.log("<B><font color = 'red'> ==> -</font> Oops! Looks like we don't have data for this search criteria yet.");
		}
		
		Reporter.log("");
		Reporter.log("<B><font color = 'Blue-Violet'> 12th -</font> ");
		
		try {
		helper.Scrollintoview(current_date12);
		helper.waitFor(current_date12);
		helper.highLightElement(driver, current_date12);
		String imageDate = current_date12.getText();
		helper.jsCLick(current_Image_Date);
		Reporter.log("<B><font color = 'blue'> ==> -</font> Clicked On Current Image Date : " + imageDate);

		helper.Scrollintoview(showAnalytics_Button12);
		helper.waitFor(showAnalytics_Button12);
		helper.highLightElement(driver, showAnalytics_Button12);
		String linkText1 = showAnalytics_Button12.getAttribute("href");
		helper.getAdID(linkText1);
		helper.jsCLick(showAnalytics_Button12);
		Reporter.log("<B><font color = 'blue'> ==> -</font> Clicked On ShowAnalytics Button.");

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
	    Reporter.log("<B><font color = 'blue'> ==> -</font> LastScene_date AdDetails Page= " +  lastSeenDate);
		
	    helper.Scrollintoview(post_Date);
	    helper.waitFor(post_Date);
	    helper.highLightElement(driver, post_Date);
	    String postSeenDate = post_Date.getText();
	    Reporter.log("<B><font color = 'blue'> ==> -</font> Post Date in AdDetails Page= " +  postSeenDate);
	      
	    driver.close();
	    
	    driver.switchTo().window(parent);
	    
	    helper.getLastseenDate(lastSeenDate, imageDate);
		}
		catch (Exception e) {
	    	 Reporter.log("<B><font color = 'red'> ==> -</font> Oops! Looks like we don't have data for this search criteria yet.");
		}
		
		Reporter.log("");
		Reporter.log("<B><font color = 'Blue-Violet'> 13th -</font> ");
		
		try {
		helper.Scrollintoview(current_date13);
		helper.waitFor(current_date13);
		helper.highLightElement(driver, current_date13);
		String imageDate = current_date13.getText();
		helper.jsCLick(current_Image_Date);
		Reporter.log("<B><font color = 'blue'> ==> -</font> Clicked On Current Image Date : " + imageDate);

		helper.Scrollintoview(showAnalytics_Button13);
		helper.waitFor(showAnalytics_Button13);
		helper.highLightElement(driver, showAnalytics_Button13);
		String linkText1 = showAnalytics_Button13.getAttribute("href");
		helper.getAdID(linkText1);
		helper.jsCLick(showAnalytics_Button13);
		Reporter.log("<B><font color = 'blue'> ==> -</font> Clicked On ShowAnalytics Button.");

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
	    Reporter.log("<B><font color = 'blue'> ==> -</font> LastScene_date AdDetails Page= " +  lastSeenDate);
		
	    helper.Scrollintoview(post_Date);
	    helper.waitFor(post_Date);
	    helper.highLightElement(driver, post_Date);
	    String postSeenDate = post_Date.getText();
	    Reporter.log("<B><font color = 'blue'> ==> -</font> Post Date in AdDetails Page= " +  postSeenDate);
	      
	    driver.close();
	    
	    driver.switchTo().window(parent);
	    
	    helper.getLastseenDate(lastSeenDate, imageDate);
		}
		catch (Exception e) {
	    	 Reporter.log("<B><font color = 'red'> ==> -</font> Oops! Looks like we don't have data for this search criteria yet.");
		}
		
		Reporter.log("");
		Reporter.log("<B><font color = 'Blue-Violet'> 14th -</font> ");
		
		try {
		helper.Scrollintoview(current_date14);
		helper.waitFor(current_date14);
		helper.highLightElement(driver, current_date14);
		String imageDate = current_date14.getText();
		helper.jsCLick(current_Image_Date);
		Reporter.log("<B><font color = 'blue'> ==> -</font> Clicked On Current Image Date : " + imageDate);

		helper.Scrollintoview(showAnalytics_Button14);
		helper.waitFor(showAnalytics_Button14);
		helper.highLightElement(driver, showAnalytics_Button14);
		String linkText1 = showAnalytics_Button14.getAttribute("href");
		helper.getAdID(linkText1);
		helper.jsCLick(showAnalytics_Button14);
		Reporter.log("<B><font color = 'blue'> ==> -</font> Clicked On ShowAnalytics Button.");

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
	    Reporter.log("<B><font color = 'blue'> ==> -</font> LastScene_date AdDetails Page= " +  lastSeenDate);
		
	    helper.Scrollintoview(post_Date);
	    helper.waitFor(post_Date);
	    helper.highLightElement(driver, post_Date);
	    String postSeenDate = post_Date.getText();
	    Reporter.log("<B><font color = 'blue'> ==> -</font> Post Date in AdDetails Page= " +  postSeenDate);
	      
	    driver.close();
	    
	    driver.switchTo().window(parent);
	    
	    helper.getLastseenDate(lastSeenDate, imageDate);
		}
		catch (Exception e) {
	    	 Reporter.log("<B><font color = 'red'> ==> -</font> Oops! Looks like we don't have data for this search criteria yet.");
		}
		
		Reporter.log("");
		Reporter.log("<B><font color = 'Blue-Violet'> 15th -</font> ");
		
		try {
		helper.Scrollintoview(current_date15);
		helper.waitFor(current_date15);
		helper.highLightElement(driver, current_date15);
		String imageDate = current_date15.getText();
		helper.jsCLick(current_Image_Date);
		Reporter.log("<B><font color = 'blue'> ==> -</font> Clicked On Current Image Date : " + imageDate);

		helper.Scrollintoview(showAnalytics_Button15);
		helper.waitFor(showAnalytics_Button15);
		helper.highLightElement(driver, showAnalytics_Button15);
		String linkText1 = showAnalytics_Button15.getAttribute("href");
		helper.getAdID(linkText1);
		helper.jsCLick(showAnalytics_Button15);
		Reporter.log("<B><font color = 'blue'> ==> -</font> Clicked On ShowAnalytics Button.");

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
	    Reporter.log("<B><font color = 'blue'> ==> -</font> LastScene_date AdDetails Page= " +  lastSeenDate);
		
	    helper.Scrollintoview(post_Date);
	    helper.waitFor(post_Date);
	    helper.highLightElement(driver, post_Date);
	    String postSeenDate = post_Date.getText();
	    Reporter.log("<B><font color = 'blue'> ==> -</font> Post Date in AdDetails Page= " +  postSeenDate);
	      
	    driver.close();
	    
	    driver.switchTo().window(parent);
	    
	    helper.getLastseenDate(lastSeenDate, imageDate);
		}
		catch (Exception e) {
	    	 Reporter.log("<B><font color = 'red'> ==> -</font> Oops! Looks like we don't have data for this search criteria yet.");
		}
		
		//Today
		Reporter.log("");
		Reporter.log("<B><font color = 'green'> Post Date Between : Today -</font> ");
		
	    helper.waitFor(clearSearchField);
		helper.highLightElement(driver, clearSearchField);
		helper.jsCLick(clearSearchField);
		Reporter.log("<B><font color = 'orange'> Step 1 -</font> Clicked On clear search.");
		
	    helper.waitFor(post_Date_Between_DropDown);
		helper.highLightElement(driver, post_Date_Between_DropDown);
		helper.jsCLick(post_Date_Between_DropDown);
		Reporter.log("<B><font color = 'orange'> Step 2 -</font> Clicked On Post Date Between DropDown.");
		
		Thread.sleep(3000);
		
		helper.waitFor(post_Date_Between_Today);
		helper.highLightElement(driver, post_Date_Between_Today);
		helper.jsCLick(post_Date_Between_Today);
		Reporter.log("<B><font color = 'orange'> Step 3 -</font> Clicked On Post Date Between Today.");
		
		helper.waitFor(search_bar);
		helper.highLightElement(driver, search_bar);
		helper.jsCLick(search_bar);
		Reporter.log("<B><font color = 'orange'> Step 4 -</font> Clicked On Search Bar.");
		
		helper.waitFor(toatal_Count_Ads);
		helper.highLightElement(driver, toatal_Count_Ads);
		helper.jsCLick(toatal_Count_Ads);
		String Total_Ads_Count_Today=toatal_Count_Ads.getText();
		Reporter.log("<B><font color = 'orange'> Step 5 -</font> Total_Ads_Count_Today= " + Total_Ads_Count_Today);

		Reporter.log("");
		Reporter.log("<B><font color = 'Blue-Violet'> 1st -</font> ");
		
		try {
		helper.Scrollintoview(current_date1);
		helper.waitFor(current_date1);
		helper.highLightElement(driver, current_date1);
		String imageDate = current_date1.getText();
		helper.jsCLick(current_date1);
		Reporter.log("<B><font color = 'blue'> ==> -</font> Clicked On Current Image Date: " + imageDate );
		
		helper.Scrollintoview(showAnalytics_Button1);
		helper.waitFor(showAnalytics_Button1);
		helper.highLightElement(driver, showAnalytics_Button1);
		String linkText1 = showAnalytics_Button1.getAttribute("href");
		helper.getAdID(linkText1);
		helper.jsCLick(showAnalytics_Button1);
		Reporter.log("<B><font color = 'blue'> ==> -</font> Clicked On ShowAnalytics Button.");

		Set<String> S1=driver.getWindowHandles();
	    Iterator<String>it=S1.iterator();
	    String parent=it.next();
	    String child=it.next();
	    
	    driver.switchTo().window(child);
		
	    helper.waitForPageToLoad();
	    helper.waitFor(Last_Seen_childWindow);
	    helper.highLightElement(driver, Last_Seen_childWindow);
	    String lastSeenDate = Last_Seen_childWindow.getText();
	    Reporter.log("<B><font color = 'blue'> ==> -</font> LastScene_date AdDetails Page= " +  lastSeenDate);
	    
	    helper.Scrollintoview(post_Date);
	    helper.waitFor(post_Date);
	    helper.highLightElement(driver, post_Date);
	    String postSeenDate = post_Date.getText();
	    Reporter.log("<B><font color = 'blue'> ==> -</font> Post Date in AdDetails Page= " +  postSeenDate);
	    
	    driver.close();
		
	    driver.switchTo().window(parent);
	    

	    helper.getLastseenDate(lastSeenDate, imageDate);
		}
		catch (Exception e) {
	    	 Reporter.log("<B><font color = 'red'> ==> -</font> Oops! Looks like we don't have data for this search criteria yet.");
		}
		
		Reporter.log("");
		Reporter.log("<B><font color = 'Blue-Violet'> 2nd -</font> ");
		
		try {
		helper.Scrollintoview(current_date2);
		helper.waitFor(current_date2);
		helper.highLightElement(driver, current_date2);
		String imageDate = current_date2.getText();
		helper.jsCLick(current_date2);
		Reporter.log("<B><font color = 'blue'> ==> -</font> Clicked On Current Image Date: " + imageDate );
		
		helper.Scrollintoview(showAnalytics_Button2);
		helper.waitFor(showAnalytics_Button2);
		helper.highLightElement(driver, showAnalytics_Button2);
		String linkText1 = showAnalytics_Button2.getAttribute("href");
		helper.getAdID(linkText1);
		helper.jsCLick(showAnalytics_Button2);
		Reporter.log("<B><font color = 'blue'> ==> -</font> Clicked On ShowAnalytics Button.");

		Set<String> S1=driver.getWindowHandles();
	    Iterator<String>it=S1.iterator();
	    String parent=it.next();
	    String child=it.next();
	    
	    driver.switchTo().window(child);
		
	    helper.waitForPageToLoad();
	    helper.waitFor(Last_Seen_childWindow);
	    helper.highLightElement(driver, Last_Seen_childWindow);
	    String lastSeenDate = Last_Seen_childWindow.getText();
	    Reporter.log("<B><font color = 'blue'> ==> -</font> LastScene_date AdDetails Page= " +  lastSeenDate);
	    
	    helper.Scrollintoview(post_Date);
	    helper.waitFor(post_Date);
	    helper.highLightElement(driver, post_Date);
	    String postSeenDate = post_Date.getText();
	    Reporter.log("<B><font color = 'blue'> ==> -</font> Post Date in AdDetails Page= " +  postSeenDate);
	    
	    driver.close();
		
	    driver.switchTo().window(parent);
	   
	    helper.getLastseenDate(lastSeenDate, imageDate);
		}
		catch (Exception e) {
	    	 Reporter.log("<B><font color = 'red'> ==> -</font> Oops! Looks like we don't have data for this search criteria yet.");
		}
		
		Reporter.log("");
		Reporter.log("<B><font color = 'Blue-Violet'> 3rd -</font> ");
		
		try {
		helper.Scrollintoview(current_date3);
		helper.waitFor(current_date3);
		helper.highLightElement(driver, current_date3);
		String imageDate = current_date3.getText();
		helper.jsCLick(current_date3);
		Reporter.log("<B><font color = 'blue'> ==> -</font> Clicked On Current Image Date: " + imageDate);
		
		helper.Scrollintoview(showAnalytics_Button3);
		helper.waitFor(showAnalytics_Button3);
		helper.highLightElement(driver, showAnalytics_Button3);
		String linkText1 = showAnalytics_Button3.getAttribute("href");
		helper.getAdID(linkText1);
		helper.jsCLick(showAnalytics_Button3);
		Reporter.log("<B><font color = 'blue'> ==> -</font> Clicked On ShowAnalytics Button.");

		Set<String> S1=driver.getWindowHandles();
	    Iterator<String>it=S1.iterator();
	    String parent=it.next();
	    String child=it.next();
	    
	    driver.switchTo().window(child);
		
	    helper.waitForPageToLoad();
	    helper.waitFor(Last_Seen_childWindow);
	    helper.highLightElement(driver, Last_Seen_childWindow);
	    String lastSeenDate = Last_Seen_childWindow.getText();
	    Reporter.log("<B><font color = 'blue'> ==> -</font> LastScene_date AdDetails Page= " +  lastSeenDate);
	    
	    helper.Scrollintoview(post_Date);
	    helper.waitFor(post_Date);
	    helper.highLightElement(driver, post_Date);
	    String postSeenDate = post_Date.getText();
	    Reporter.log("<B><font color = 'blue'> ==> -</font> Post Date in AdDetails Page= " +  postSeenDate);
	    
	    driver.close();
		
	    driver.switchTo().window(parent);
	   
	    helper.getLastseenDate(lastSeenDate, imageDate);
		}
		catch (Exception e) {
	    	 Reporter.log("<B><font color = 'red'> ==> -</font> Oops! Looks like we don't have data for this search criteria yet.");
		}
		
		Reporter.log("");
		Reporter.log("<B><font color = 'Blue-Violet'> 4th -</font> ");
		
		try {
		helper.Scrollintoview(current_date4);
		helper.waitFor(current_date4);
		helper.highLightElement(driver, current_date4);
		String imageDate = current_date4.getText();
		helper.jsCLick(current_date4);
		Reporter.log("<B><font color = 'blue'> ==> -</font> Clicked On Current Image Date: " + imageDate);
		
		helper.Scrollintoview(showAnalytics_Button4);
		helper.waitFor(showAnalytics_Button4);
		helper.highLightElement(driver, showAnalytics_Button4);
		String linkText1 = showAnalytics_Button4.getAttribute("href");
		helper.getAdID(linkText1);
		helper.jsCLick(showAnalytics_Button4);
		Reporter.log("<B><font color = 'blue'> ==> -</font> Clicked On ShowAnalytics Button.");

		Set<String> S1=driver.getWindowHandles();
	    Iterator<String>it=S1.iterator();
	    String parent=it.next();
	    String child=it.next();
	    
	    driver.switchTo().window(child);
		
	    helper.waitForPageToLoad();
	    helper.waitFor(Last_Seen_childWindow);
	    helper.highLightElement(driver, Last_Seen_childWindow);
	    String lastSeenDate = Last_Seen_childWindow.getText();
	    Reporter.log("<B><font color = 'blue'> ==> -</font> LastScene_date AdDetails Page= " +  lastSeenDate);
	    
	    helper.Scrollintoview(post_Date);
	    helper.waitFor(post_Date);
	    helper.highLightElement(driver, post_Date);
	    String postSeenDate = post_Date.getText();
	    Reporter.log("<B><font color = 'blue'> ==> -</font> Post Date in AdDetails Page= " +  postSeenDate);
	    
	    driver.close();
		
	    driver.switchTo().window(parent);
	   
	    helper.getLastseenDate(lastSeenDate, imageDate);
		}
		catch (Exception e) {
	    	 Reporter.log("<B><font color = 'red'> ==> -</font> Oops! Looks like we don't have data for this search criteria yet.");
		}
		
		Reporter.log("");
		Reporter.log("<B><font color = 'Blue-Violet'> 5th -</font> ");
		
		try {
		helper.Scrollintoview(current_date5);
		helper.waitFor(current_date5);
		helper.highLightElement(driver, current_date5);
		String imageDate = current_date5.getText();
		helper.jsCLick(current_date5);
		Reporter.log("<B><font color = 'blue'> ==> -</font> Clicked On Current Image Date: "+ imageDate);
		
		helper.Scrollintoview(showAnalytics_Button5);
		helper.waitFor(showAnalytics_Button5);
		helper.highLightElement(driver, showAnalytics_Button5);
		String linkText1 = showAnalytics_Button5.getAttribute("href");
		helper.getAdID(linkText1);
		helper.jsCLick(showAnalytics_Button5);
		Reporter.log("<B><font color = 'blue'> ==> -</font> Clicked On ShowAnalytics Button.");

		Set<String> S1=driver.getWindowHandles();
	    Iterator<String>it=S1.iterator();
	    String parent=it.next();
	    String child=it.next();
	    
	    driver.switchTo().window(child);
		
	    helper.waitForPageToLoad();
	    helper.waitFor(Last_Seen_childWindow);
	    helper.highLightElement(driver, Last_Seen_childWindow);
	    String lastSeenDate = Last_Seen_childWindow.getText();
	    Reporter.log("<B><font color = 'blue'> ==> -</font> LastScene_date AdDetails Page= " +  lastSeenDate);
	    
	    helper.Scrollintoview(post_Date);
	    helper.waitFor(post_Date);
	    helper.highLightElement(driver, post_Date);
	    String postSeenDate = post_Date.getText();
	    Reporter.log("<B><font color = 'blue'> ==> -</font> Post Date in AdDetails Page= " +  postSeenDate);
	    
	    driver.close();
		
	    driver.switchTo().window(parent);
	   
	    helper.getLastseenDate(lastSeenDate, imageDate);
		}
		catch (Exception e) {
	    	 Reporter.log("<B><font color = 'red'> ==> -</font> Oops! Looks like we don't have data for this search criteria yet.");
		}
		
		Reporter.log("");
		Reporter.log("<B><font color = 'Blue-Violet'> 6th -</font> ");
		
		try {
		helper.Scrollintoview(current_date6);
		helper.waitFor(current_date6);
		helper.highLightElement(driver, current_date6);
		String imageDate = current_date6.getText();
		helper.jsCLick(current_date6);
		Reporter.log("<B><font color = 'blue'> ==> -</font> Clicked On Current Image Date: " + imageDate);
		
		helper.Scrollintoview(showAnalytics_Button6);
		helper.waitFor(showAnalytics_Button6);
		helper.highLightElement(driver, showAnalytics_Button6);
		String linkText1 = showAnalytics_Button6.getAttribute("href");
		helper.getAdID(linkText1);
		helper.jsCLick(showAnalytics_Button6);
		Reporter.log("<B><font color = 'blue'> ==> -</font> Clicked On ShowAnalytics Button.");

		Set<String> S1=driver.getWindowHandles();
	    Iterator<String>it=S1.iterator();
	    String parent=it.next();
	    String child=it.next();
	    
	    driver.switchTo().window(child);
		
	    helper.waitForPageToLoad();
	    helper.waitFor(Last_Seen_childWindow);
	    helper.highLightElement(driver, Last_Seen_childWindow);
	    String lastSeenDate = Last_Seen_childWindow.getText();
	    Reporter.log("<B><font color = 'blue'> ==> -</font> LastScene_date AdDetails Page= " +  lastSeenDate);
	    
	    helper.Scrollintoview(post_Date);
	    helper.waitFor(post_Date);
	    helper.highLightElement(driver, post_Date);
	    String postSeenDate = post_Date.getText();
	    Reporter.log("<B><font color = 'blue'> ==> -</font> Post Date in AdDetails Page= " +  postSeenDate);
	    
	    driver.close();
		
	    driver.switchTo().window(parent);
	   
	    helper.getLastseenDate(lastSeenDate, imageDate);
		}
		catch (Exception e) {
	    	 Reporter.log("<B><font color = 'red'> ==> -</font> Oops! Looks like we don't have data for this search criteria yet.");
		}
		
		Reporter.log("");
		Reporter.log("<B><font color = 'Blue-Violet'> 7th -</font> ");
		
		try {
		helper.Scrollintoview(current_date7);
		helper.waitFor(current_date7);
		helper.highLightElement(driver, current_date7);
		String imageDate = current_date7.getText();
		helper.jsCLick(current_date7);
		Reporter.log("<B><font color = 'blue'> ==> -</font> Clicked On Current Image Date: " + imageDate);
		
		helper.Scrollintoview(showAnalytics_Button7);
		helper.waitFor(showAnalytics_Button7);
		helper.highLightElement(driver, showAnalytics_Button7);
		String linkText1 = showAnalytics_Button7.getAttribute("href");
		helper.getAdID(linkText1);
		helper.jsCLick(showAnalytics_Button7);
		Reporter.log("<B><font color = 'blue'> ==> -</font> Clicked On ShowAnalytics Button.");

		Set<String> S1=driver.getWindowHandles();
	    Iterator<String>it=S1.iterator();
	    String parent=it.next();
	    String child=it.next();
	    
	    driver.switchTo().window(child);
		
	    helper.waitForPageToLoad();
	    helper.waitFor(Last_Seen_childWindow);
	    helper.highLightElement(driver, Last_Seen_childWindow);
	    String lastSeenDate = Last_Seen_childWindow.getText();
	    Reporter.log("<B><font color = 'blue'> ==> -</font> LastScene_date AdDetails Page= " +  lastSeenDate);
	    
	    helper.Scrollintoview(post_Date);
	    helper.waitFor(post_Date);
	    helper.highLightElement(driver, post_Date);
	    String postSeenDate = post_Date.getText();
	    Reporter.log("<B><font color = 'blue'> ==> -</font> Post Date in AdDetails Page= " +  postSeenDate);
	    
	    driver.close();
		
	    driver.switchTo().window(parent);
	   
	    helper.getLastseenDate(lastSeenDate, imageDate);
		}
		catch (Exception e) {
	    	 Reporter.log("<B><font color = 'red'> ==> -</font> Oops! Looks like we don't have data for this search criteria yet.");
		}
		
		Reporter.log("");
		Reporter.log("<B><font color = 'Blue-Violet'> 8th -</font> ");
		
		try {
		helper.Scrollintoview(current_date8);
		helper.waitFor(current_date8);
		helper.highLightElement(driver, current_date8);
		String imageDate = current_date8.getText();
		helper.jsCLick(current_date8);
		Reporter.log("<B><font color = 'blue'> ==> -</font> Clicked On Current Image Date: " + imageDate);
		
		helper.Scrollintoview(showAnalytics_Button8);
		helper.waitFor(showAnalytics_Button8);
		helper.highLightElement(driver, showAnalytics_Button8);
		String linkText1 = showAnalytics_Button8.getAttribute("href");
		helper.getAdID(linkText1);
		helper.jsCLick(showAnalytics_Button8);
		Reporter.log("<B><font color = 'blue'> ==> -</font> Clicked On ShowAnalytics Button.");

		Set<String> S1=driver.getWindowHandles();
	    Iterator<String>it=S1.iterator();
	    String parent=it.next();
	    String child=it.next();
	    
	    driver.switchTo().window(child);
		
	    helper.waitForPageToLoad();
	    helper.waitFor(Last_Seen_childWindow);
	    helper.highLightElement(driver, Last_Seen_childWindow);
	    String lastSeenDate = Last_Seen_childWindow.getText();
	    Reporter.log("<B><font color = 'blue'> ==> -</font> LastScene_date AdDetails Page= " +  lastSeenDate);
	    
	    helper.Scrollintoview(post_Date);
	    helper.waitFor(post_Date);
	    helper.highLightElement(driver, post_Date);
	    String postSeenDate = post_Date.getText();
	    Reporter.log("<B><font color = 'blue'> ==> -</font> Post Date in AdDetails Page= " +  postSeenDate);
	    
	    driver.close();
		
	    driver.switchTo().window(parent);
	   
	    helper.getLastseenDate(lastSeenDate, imageDate);
		}
		catch (Exception e) {
	    	 Reporter.log("<B><font color = 'red'> ==> -</font> Oops! Looks like we don't have data for this search criteria yet.");
		}
		
		Reporter.log("");
		Reporter.log("<B><font color = 'Blue-Violet'> 9th -</font> ");
		
		try {
		helper.Scrollintoview(current_date9);
		helper.waitFor(current_date9);
		helper.highLightElement(driver, current_date9);
		String imageDate = current_date9.getText();
		helper.jsCLick(current_date9);
		Reporter.log("<B><font color = 'blue'> ==> -</font> Clicked On Current Image Date: " + imageDate);
		
		helper.Scrollintoview(showAnalytics_Button9);
		helper.waitFor(showAnalytics_Button9);
		helper.highLightElement(driver, showAnalytics_Button9);
		String linkText1 = showAnalytics_Button9.getAttribute("href");
		helper.getAdID(linkText1);
		helper.jsCLick(showAnalytics_Button9);
		Reporter.log("<B><font color = 'blue'> ==> -</font> Clicked On ShowAnalytics Button.");

		Set<String> S1=driver.getWindowHandles();
	    Iterator<String>it=S1.iterator();
	    String parent=it.next();
	    String child=it.next();
	    
	    driver.switchTo().window(child);
		
	    helper.waitForPageToLoad();
	    helper.waitFor(Last_Seen_childWindow);
	    helper.highLightElement(driver, Last_Seen_childWindow);
	    String lastSeenDate = Last_Seen_childWindow.getText();
	    Reporter.log("<B><font color = 'blue'> ==> -</font> LastScene_date AdDetails Page= " +  lastSeenDate);
	    
	    helper.Scrollintoview(post_Date);
	    helper.waitFor(post_Date);
	    helper.highLightElement(driver, post_Date);
	    String postSeenDate = post_Date.getText();
	    Reporter.log("<B><font color = 'blue'> ==> -</font> Post Date in AdDetails Page= " +  postSeenDate);
	    
	    driver.close();
		
	    driver.switchTo().window(parent);
	   
	    helper.getLastseenDate(lastSeenDate, imageDate);
		}
		catch (Exception e) {
	    	 Reporter.log("<B><font color = 'red'> ==> -</font> Oops! Looks like we don't have data for this search criteria yet.");
		}
		
		Reporter.log("");
		Reporter.log("<B><font color = 'Blue-Violet'> 10th -</font> ");
		
		try {
		helper.Scrollintoview(current_date10);
		helper.waitFor(current_date10);
		helper.highLightElement(driver, current_date10);
		String imageDate = current_date10.getText();
		helper.jsCLick(current_date10);
		Reporter.log("<B><font color = 'blue'> ==> -</font> Clicked On Current Image Date: " + imageDate);
		
		helper.Scrollintoview(showAnalytics_Button10);
		helper.waitFor(showAnalytics_Button10);
		helper.highLightElement(driver, showAnalytics_Button10);
		String linkText1 = showAnalytics_Button10.getAttribute("href");
		helper.getAdID(linkText1);
		helper.jsCLick(showAnalytics_Button10);
		Reporter.log("<B><font color = 'blue'> ==> -</font> Clicked On ShowAnalytics Button.");

		Set<String> S1=driver.getWindowHandles();
	    Iterator<String>it=S1.iterator();
	    String parent=it.next();
	    String child=it.next();
	    
	    driver.switchTo().window(child);
		
	    helper.waitForPageToLoad();
	    helper.waitFor(Last_Seen_childWindow);
	    helper.highLightElement(driver, Last_Seen_childWindow);
	    String lastSeenDate = Last_Seen_childWindow.getText();
	    Reporter.log("<B><font color = 'blue'> ==> -</font> LastScene_date AdDetails Page= " +  lastSeenDate);
	    
	    helper.Scrollintoview(post_Date);
	    helper.waitFor(post_Date);
	    helper.highLightElement(driver, post_Date);
	    String postSeenDate = post_Date.getText();
	    Reporter.log("<B><font color = 'blue'> ==> -</font> Post Date in AdDetails Page= " +  postSeenDate);
	    
	    driver.close();
		
	    driver.switchTo().window(parent);
	   
	    helper.getLastseenDate(lastSeenDate, imageDate);
		}
		catch (Exception e) {
	    	 Reporter.log("<B><font color = 'red'> ==> -</font> Oops! Looks like we don't have data for this search criteria yet.");
		}
		
		Reporter.log("");
		Reporter.log("<B><font color = 'Blue-Violet'> 11th -</font> ");
		
		try {
		helper.Scrollintoview(current_date11);
		helper.waitFor(current_date11);
		helper.highLightElement(driver, current_date11);
		String imageDate = current_date11.getText();
		helper.jsCLick(current_date11);
		Reporter.log("<B><font color = 'blue'> ==> -</font> Clicked On Current Image Date: " + imageDate);
		
		helper.Scrollintoview(showAnalytics_Button11);
		helper.waitFor(showAnalytics_Button11);
		helper.highLightElement(driver, showAnalytics_Button11);
		String linkText1 = showAnalytics_Button11.getAttribute("href");
		helper.getAdID(linkText1);
		helper.jsCLick(showAnalytics_Button11);
		Reporter.log("<B><font color = 'blue'> ==> -</font> Clicked On ShowAnalytics Button.");

		Set<String> S1=driver.getWindowHandles();
	    Iterator<String>it=S1.iterator();
	    String parent=it.next();
	    String child=it.next();
	    
	    driver.switchTo().window(child);
		
	    helper.waitForPageToLoad();
	    helper.waitFor(Last_Seen_childWindow);
	    helper.highLightElement(driver, Last_Seen_childWindow);
	    String lastSeenDate = Last_Seen_childWindow.getText();
	    Reporter.log("<B><font color = 'blue'> ==> -</font> LastScene_date AdDetails Page= " +  lastSeenDate);
	    
	    helper.Scrollintoview(post_Date);
	    helper.waitFor(post_Date);
	    helper.highLightElement(driver, post_Date);
	    String postSeenDate = post_Date.getText();
	    Reporter.log("<B><font color = 'blue'> ==> -</font> Post Date in AdDetails Page= " +  postSeenDate);
	    
	    driver.close();
		
	    driver.switchTo().window(parent);
	   
	    helper.getLastseenDate(lastSeenDate, imageDate);
		}
		catch (Exception e) {
	    	 Reporter.log("<B><font color = 'red'> ==> -</font> Oops! Looks like we don't have data for this search criteria yet.");
		}
		
		Reporter.log("");
		Reporter.log("<B><font color = 'Blue-Violet'> 12th -</font> ");
		
		try {
		helper.Scrollintoview(current_date12);
		helper.waitFor(current_date12);
		helper.highLightElement(driver, current_date12);
		String imageDate = current_date12.getText();
		helper.jsCLick(current_date12);
		Reporter.log("<B><font color = 'blue'> ==> -</font> Clicked On Current Image Date: " + imageDate);
		
		helper.Scrollintoview(showAnalytics_Button12);
		helper.waitFor(showAnalytics_Button12);
		helper.highLightElement(driver, showAnalytics_Button12);
		String linkText1 = showAnalytics_Button12.getAttribute("href");
		helper.getAdID(linkText1);
		helper.jsCLick(showAnalytics_Button12);
		Reporter.log("<B><font color = 'blue'> ==> -</font> Clicked On ShowAnalytics Button.");

		Set<String> S1=driver.getWindowHandles();
	    Iterator<String>it=S1.iterator();
	    String parent=it.next();
	    String child=it.next();
	    
	    driver.switchTo().window(child);
		
	    helper.waitForPageToLoad();
	    helper.waitFor(Last_Seen_childWindow);
	    helper.highLightElement(driver, Last_Seen_childWindow);
	    String lastSeenDate = Last_Seen_childWindow.getText();
	    Reporter.log("<B><font color = 'blue'> ==> -</font> LastScene_date AdDetails Page= " +  lastSeenDate);
	    
	    helper.Scrollintoview(post_Date);
	    helper.waitFor(post_Date);
	    helper.highLightElement(driver, post_Date);
	    String postSeenDate = post_Date.getText();
	    Reporter.log("<B><font color = 'blue'> ==> -</font> Post Date in AdDetails Page= " +  postSeenDate);
	    
	    driver.close();
		
	    driver.switchTo().window(parent);
	   
	    helper.getLastseenDate(lastSeenDate, imageDate);
		}
		catch (Exception e) {
	    	 Reporter.log("<B><font color = 'red'> ==> -</font> Oops! Looks like we don't have data for this search criteria yet.");
		}
		
		Reporter.log("");
		Reporter.log("<B><font color = 'Blue-Violet'> 13th -</font> ");
		
		try {
		helper.Scrollintoview(current_date13);
		helper.waitFor(current_date13);
		helper.highLightElement(driver, current_date13);
		String imageDate = current_date13.getText();
		helper.jsCLick(current_date13);
		Reporter.log("<B><font color = 'blue'> ==> -</font> Clicked On Current Image Date: " + imageDate);
		
		helper.Scrollintoview(showAnalytics_Button13);
		helper.waitFor(showAnalytics_Button13);
		helper.highLightElement(driver, showAnalytics_Button13);
		String linkText1 = showAnalytics_Button13.getAttribute("href");
		helper.getAdID(linkText1);
		helper.jsCLick(showAnalytics_Button13);
		Reporter.log("<B><font color = 'blue'> ==> -</font> Clicked On ShowAnalytics Button.");

		Set<String> S1=driver.getWindowHandles();
	    Iterator<String>it=S1.iterator();
	    String parent=it.next();
	    String child=it.next();
	    
	    driver.switchTo().window(child);
		
	    helper.waitForPageToLoad();
	    helper.waitFor(Last_Seen_childWindow);
	    helper.highLightElement(driver, Last_Seen_childWindow);
	    String lastSeenDate = Last_Seen_childWindow.getText();
	    Reporter.log("<B><font color = 'blue'> ==> -</font> LastScene_date AdDetails Page= " +  lastSeenDate);
	    
	    helper.Scrollintoview(post_Date);
	    helper.waitFor(post_Date);
	    helper.highLightElement(driver, post_Date);
	    String postSeenDate = post_Date.getText();
	    Reporter.log("<B><font color = 'blue'> ==> -</font> Post Date in AdDetails Page= " +  postSeenDate);
	    
	    driver.close();
		
	    driver.switchTo().window(parent);
	   
	    helper.getLastseenDate(lastSeenDate, imageDate);
		}
		catch (Exception e) {
	    	 Reporter.log("<B><font color = 'red'> ==> -</font> Oops! Looks like we don't have data for this search criteria yet.");
		}
		
		Reporter.log("");
		Reporter.log("<B><font color = 'Blue-Violet'> 14th -</font> ");
		
		try {
		helper.Scrollintoview(current_date14);
		helper.waitFor(current_date14);
		helper.highLightElement(driver, current_date14);
		String imageDate = current_date14.getText();
		helper.jsCLick(current_date14);
		Reporter.log("<B><font color = 'blue'> ==> -</font> Clicked On Current Image Date: " + imageDate);
		
		helper.Scrollintoview(showAnalytics_Button14);
		helper.waitFor(showAnalytics_Button14);
		helper.highLightElement(driver, showAnalytics_Button14);
		String linkText1 = showAnalytics_Button14.getAttribute("href");
		helper.getAdID(linkText1);
		helper.jsCLick(showAnalytics_Button14);
		Reporter.log("<B><font color = 'blue'> ==> -</font> Clicked On ShowAnalytics Button.");

		Set<String> S1=driver.getWindowHandles();
	    Iterator<String>it=S1.iterator();
	    String parent=it.next();
	    String child=it.next();
	    
	    driver.switchTo().window(child);
		
	    helper.waitForPageToLoad();
	    helper.waitFor(Last_Seen_childWindow);
	    helper.highLightElement(driver, Last_Seen_childWindow);
	    String lastSeenDate = Last_Seen_childWindow.getText();
	    Reporter.log("<B><font color = 'blue'> ==> -</font> LastScene_date AdDetails Page= " +  lastSeenDate);
	    
	    helper.Scrollintoview(post_Date);
	    helper.waitFor(post_Date);
	    helper.highLightElement(driver, post_Date);
	    String postSeenDate = post_Date.getText();
	    Reporter.log("<B><font color = 'blue'> ==> -</font> Post Date in AdDetails Page= " +  postSeenDate);
	    
	    driver.close();
		
	    driver.switchTo().window(parent);
	   
	    helper.getLastseenDate(lastSeenDate, imageDate);
		}
		catch (Exception e) {
	    	 Reporter.log("<B><font color = 'red'> ==> -</font> Oops! Looks like we don't have data for this search criteria yet.");
		}
		
		Reporter.log("");
		Reporter.log("<B><font color = 'Blue-Violet'> 15th -</font> ");
		
		try {
		helper.Scrollintoview(current_date15);
		helper.waitFor(current_date15);
		helper.highLightElement(driver, current_date15);
		String imageDate = current_date15.getText();
		helper.jsCLick(current_date15);
		Reporter.log("<B><font color = 'blue'> ==> -</font> Clicked On Current Image Date: " + imageDate);
		
		helper.Scrollintoview(showAnalytics_Button15);
		helper.waitFor(showAnalytics_Button15);
		helper.highLightElement(driver, showAnalytics_Button15);
		String linkText1 = showAnalytics_Button15.getAttribute("href");
		helper.getAdID(linkText1);
		helper.jsCLick(showAnalytics_Button15);
		Reporter.log("<B><font color = 'blue'> ==> -</font> Clicked On ShowAnalytics Button.");

		Set<String> S1=driver.getWindowHandles();
	    Iterator<String>it=S1.iterator();
	    String parent=it.next();
	    String child=it.next();
	    
	    driver.switchTo().window(child);
		
	    helper.waitForPageToLoad();
	    helper.waitFor(Last_Seen_childWindow);
	    helper.highLightElement(driver, Last_Seen_childWindow);
	    String lastSeenDate = Last_Seen_childWindow.getText();
	    Reporter.log("<B><font color = 'blue'> ==> -</font> LastScene_date AdDetails Page= " +  lastSeenDate);
	    
	    helper.Scrollintoview(post_Date);
	    helper.waitFor(post_Date);
	    helper.highLightElement(driver, post_Date);
	    String postSeenDate = post_Date.getText();
	    Reporter.log("<B><font color = 'blue'> ==> -</font> Post Date in AdDetails Page= " +  postSeenDate);
	    
	    driver.close();
		
	    driver.switchTo().window(parent);
	   
	    helper.getLastseenDate(lastSeenDate, imageDate);
		}
		catch (Exception e) {
	    	 Reporter.log("<B><font color = 'red'> ==> -</font> Oops! Looks like we don't have data for this search criteria yet.");
		}
	*/	
		//Yesterday
		Reporter.log("");
		Reporter.log("<B><font color = 'green'> Post Date Between : Yesterday -</font> ");
		
	    helper.waitFor(clearSearchField);
		helper.highLightElement(driver, clearSearchField);
		helper.jsCLick(clearSearchField);
		Reporter.log("<B><font color = 'orange'> Step 1 -</font> Clicked On clear search.");
		
	    helper.waitFor(post_Date_Between_DropDown);
		helper.highLightElement(driver, post_Date_Between_DropDown);
		helper.jsCLick(post_Date_Between_DropDown);
		Reporter.log("<B><font color = 'orange'> Step 2 -</font> Clicked On Post Date Between DropDown.");
		
		helper.waitFor(post_Date_Between_Yesterday);
		helper.highLightElement(driver, post_Date_Between_Yesterday);
		helper.jsCLick(post_Date_Between_Yesterday);
		Reporter.log("<B><font color = 'orange'> Step 3 -</font> Clicked On Post Date Between Yesterday.");
		
		helper.waitFor(search_bar);
		helper.highLightElement(driver, search_bar);
		helper.jsCLick(search_bar);
		Reporter.log("<B><font color = 'orange'> Step 4 -</font> Clicked On Search Bar.");
		

		helper.waitFor(toatal_Count_Ads);
		helper.highLightElement(driver, toatal_Count_Ads);
		helper.jsCLick(toatal_Count_Ads);
		String Total_Ads_Count_Yesterday=toatal_Count_Ads.getText();
		Reporter.log("<B><font color = 'orange'> Step 5 -</font> Total_Ads_Count_Yesterday= " + Total_Ads_Count_Yesterday);
		
		Reporter.log("");
		Reporter.log("<B><font color = 'Blue-Violet'> 1st Ad-</font> ");
		
		try {
		helper.Scrollintoview(current_date1);
		helper.waitFor(current_date1);
		helper.highLightElement(driver, current_date1);
		String imageDate = current_date1.getText();
		helper.jsCLick(current_date1);
		Reporter.log("<B><font color = 'blue'> ==> -</font> Clicked On Current Image Date: " + imageDate);
	
		helper.Scrollintoview(showAnalytics_Button1);
		helper.waitFor(showAnalytics_Button1);
		helper.highLightElement(driver, showAnalytics_Button1);
		String linkText1 = showAnalytics_Button1.getAttribute("href");
		helper.getAdID(linkText1);
		helper.jsCLick(showAnalytics_Button1);
		Reporter.log("<B><font color = 'blue'> ==> -</font> Clicked On ShowAnalytics Button.");

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
	    Reporter.log("<B><font color = 'blue'> ==> -</font> LastScene_date AdDetails Page= " +  lastSeenDate);
		
	    helper.Scrollintoview(post_Date);
	    helper.waitFor(post_Date);
	    helper.highLightElement(driver, post_Date);
	    String postSeenDate = post_Date.getText();
	    Reporter.log("<B><font color = 'blue'> ==> -</font> Post Date in AdDetails Page= " +  postSeenDate);
	    
	    driver.close();
		
	    driver.switchTo().window(parent);
	   
	//    helper.getLastseenDate(lastSeenDate, imageDate);
	   }
		catch (Exception e) {
	    	 Reporter.log("<B><font color = 'red'> ==> -</font> Oops! Looks like we don't have data for this search criteria yet.");
		}
		
		Reporter.log("");
		Reporter.log("<B><font color = 'Blue-Violet'> 2nd Ad-</font> ");
		
		try {
		helper.Scrollintoview(current_date2);
		helper.waitFor(current_date2);
		helper.highLightElement(driver, current_date2);
		String imageDate = current_date2.getText();
		helper.jsCLick(current_date2);
		Reporter.log("<B><font color = 'blue'> ==> -</font> Clicked On Current Image Date: " + imageDate);
	
		helper.Scrollintoview(showAnalytics_Button2);
		helper.waitFor(showAnalytics_Button2);
		helper.highLightElement(driver, showAnalytics_Button2);
		String linkText1 = showAnalytics_Button2.getAttribute("href");
		helper.getAdID(linkText1);
		helper.jsCLick(showAnalytics_Button2);
		Reporter.log("<B><font color = 'blue'> ==> -</font> Clicked On ShowAnalytics Button.");

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
	    Reporter.log("<B><font color = 'blue'> ==> -</font> LastScene_date AdDetails Page= " +  lastSeenDate);
		
	    helper.Scrollintoview(post_Date);
	    helper.waitFor(post_Date);
	    helper.highLightElement(driver, post_Date);
	    String postSeenDate = post_Date.getText();
	    Reporter.log("<B><font color = 'blue'> ==> -</font> Post Date in AdDetails Page= " +  postSeenDate);
	    
	    driver.close();
		
	    driver.switchTo().window(parent);
	   
	//    helper.getLastseenDate(lastSeenDate, imageDate);
	   }
		catch (Exception e) {
	    	 Reporter.log("<B><font color = 'red'> ==> -</font> Oops! Looks like we don't have data for this search criteria yet.");
		}
		
		Reporter.log("");
		Reporter.log("<B><font color = 'Blue-Violet'> 3rd Ad-</font> ");
		
		try {
		helper.Scrollintoview(current_date3);
		helper.waitFor(current_date3);
		helper.highLightElement(driver, current_date3);
		String imageDate = current_date3.getText();
		helper.jsCLick(current_date3);
		Reporter.log("<B><font color = 'blue'> ==> -</font> Clicked On Current Image Date: " + imageDate);
	
		helper.Scrollintoview(showAnalytics_Button3);
		helper.waitFor(showAnalytics_Button3);
		helper.highLightElement(driver, showAnalytics_Button3);
		String linkText1 = showAnalytics_Button3.getAttribute("href");
		helper.getAdID(linkText1);
		helper.jsCLick(showAnalytics_Button3);
		Reporter.log("<B><font color = 'blue'> ==> -</font> Clicked On ShowAnalytics Button.");

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
	    Reporter.log("<B><font color = 'blue'> ==> -</font> LastScene_date AdDetails Page= " +  lastSeenDate);
		
	    helper.Scrollintoview(post_Date);
	    helper.waitFor(post_Date);
	    helper.highLightElement(driver, post_Date);
	    String postSeenDate = post_Date.getText();
	    Reporter.log("<B><font color = 'blue'> ==> -</font> Post Date in AdDetails Page= " +  postSeenDate);
	    
	    driver.close();
		
	    driver.switchTo().window(parent);
	   
	//    helper.getLastseenDate(lastSeenDate, imageDate);
	   }
		catch (Exception e) {
	    	 Reporter.log("<B><font color = 'red'> ==> -</font> Oops! Looks like we don't have data for this search criteria yet.");
		}
		
		Reporter.log("");
		Reporter.log("<B><font color = 'Blue-Violet'> 4th Ad-</font> ");
		
		try {
		helper.Scrollintoview(current_date4);
		helper.waitFor(current_date4);
		helper.highLightElement(driver, current_date4);
		String imageDate = current_date4.getText();
		helper.jsCLick(current_date4);
		Reporter.log("<B><font color = 'blue'> ==> -</font> Clicked On Current Image Date: " + imageDate);
	
		helper.Scrollintoview(showAnalytics_Button4);
		helper.waitFor(showAnalytics_Button4);
		helper.highLightElement(driver, showAnalytics_Button4);
		String linkText1 = showAnalytics_Button4.getAttribute("href");
		helper.getAdID(linkText1);
		helper.jsCLick(showAnalytics_Button4);
		Reporter.log("<B><font color = 'blue'> ==> -</font> Clicked On ShowAnalytics Button.");

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
	    Reporter.log("<B><font color = 'blue'> ==> -</font> LastScene_date AdDetails Page= " +  lastSeenDate);
		
	    helper.Scrollintoview(post_Date);
	    helper.waitFor(post_Date);
	    helper.highLightElement(driver, post_Date);
	    String postSeenDate = post_Date.getText();
	    Reporter.log("<B><font color = 'blue'> ==> -</font> Post Date in AdDetails Page= " +  postSeenDate);
	    
	    driver.close();
		
	    driver.switchTo().window(parent);
	   
	   }
		catch (Exception e) {
	    	 Reporter.log("<B><font color = 'red'> ==> -</font> Oops! Looks like we don't have data for this search criteria yet.");
		}
		
		Reporter.log("");
		Reporter.log("<B><font color = 'Blue-Violet'> 5th Ad-</font> ");
		
		try {
		helper.Scrollintoview(current_date5);
		helper.waitFor(current_date5);
		helper.highLightElement(driver, current_date5);
		String imageDate = current_date5.getText();
		helper.jsCLick(current_date5);
		Reporter.log("<B><font color = 'blue'> ==> -</font> Clicked On Current Image Date: " + imageDate);
	
		helper.Scrollintoview(showAnalytics_Button5);
		helper.waitFor(showAnalytics_Button5);
		helper.highLightElement(driver, showAnalytics_Button5);
		String linkText1 = showAnalytics_Button5.getAttribute("href");
		helper.getAdID(linkText1);
		helper.jsCLick(showAnalytics_Button5);
		Reporter.log("<B><font color = 'blue'> ==> -</font> Clicked On ShowAnalytics Button.");

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
	    Reporter.log("<B><font color = 'blue'> ==> -</font> LastScene_date AdDetails Page= " +  lastSeenDate);
		
	    helper.Scrollintoview(post_Date);
	    helper.waitFor(post_Date);
	    helper.highLightElement(driver, post_Date);
	    String postSeenDate = post_Date.getText();
	    Reporter.log("<B><font color = 'blue'> ==> -</font> Post Date in AdDetails Page= " +  postSeenDate);
	    
	    driver.close();
		
	    driver.switchTo().window(parent);
	   
	   }
		catch (Exception e) {
	    	 Reporter.log("<B><font color = 'red'> ==> -</font> Oops! Looks like we don't have data for this search criteria yet.");
		}
		
		Reporter.log("");
		Reporter.log("<B><font color = 'Blue-Violet'> 6th Ad-</font> ");
		
		try {
		helper.Scrollintoview(current_date6);
		helper.waitFor(current_date6);
		helper.highLightElement(driver, current_date6);
		String imageDate = current_date6.getText();
		helper.jsCLick(current_date6);
		Reporter.log("<B><font color = 'blue'> ==> -</font> Clicked On Current Image Date: " + imageDate);
	
		helper.Scrollintoview(showAnalytics_Button6);
		helper.waitFor(showAnalytics_Button6);
		helper.highLightElement(driver, showAnalytics_Button6);
		String linkText1 = showAnalytics_Button6.getAttribute("href");
		helper.getAdID(linkText1);
		helper.jsCLick(showAnalytics_Button6);
		Reporter.log("<B><font color = 'blue'> ==> -</font> Clicked On ShowAnalytics Button.");

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
	    Reporter.log("<B><font color = 'blue'> ==> -</font> LastScene_date AdDetails Page= " +  lastSeenDate);
		
	    helper.Scrollintoview(post_Date);
	    helper.waitFor(post_Date);
	    helper.highLightElement(driver, post_Date);
	    String postSeenDate = post_Date.getText();
	    Reporter.log("<B><font color = 'blue'> ==> -</font> Post Date in AdDetails Page= " +  postSeenDate);
	    
	    driver.close();
		
	    driver.switchTo().window(parent);
	   
	   }
		catch (Exception e) {
	    	 Reporter.log("<B><font color = 'red'> ==> -</font> Oops! Looks like we don't have data for this search criteria yet.");
		}
		
		Reporter.log("");
		Reporter.log("<B><font color = 'Blue-Violet'> 7th Ad-</font> ");
		
		try {
		helper.Scrollintoview(current_date7);
		helper.waitFor(current_date7);
		helper.highLightElement(driver, current_date7);
		String imageDate = current_date7.getText();
		helper.jsCLick(current_date7);
		Reporter.log("<B><font color = 'blue'> ==> -</font> Clicked On Current Image Date: " + imageDate);
	
		helper.Scrollintoview(showAnalytics_Button7);
		helper.waitFor(showAnalytics_Button7);
		helper.highLightElement(driver, showAnalytics_Button7);
		String linkText1 = showAnalytics_Button7.getAttribute("href");
		helper.getAdID(linkText1);
		helper.jsCLick(showAnalytics_Button7);
		Reporter.log("<B><font color = 'blue'> ==> -</font> Clicked On ShowAnalytics Button.");

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
	    Reporter.log("<B><font color = 'blue'> ==> -</font> LastScene_date AdDetails Page= " +  lastSeenDate);
		
	    helper.Scrollintoview(post_Date);
	    helper.waitFor(post_Date);
	    helper.highLightElement(driver, post_Date);
	    String postSeenDate = post_Date.getText();
	    Reporter.log("<B><font color = 'blue'> ==> -</font> Post Date in AdDetails Page= " +  postSeenDate);
	    
	    driver.close();
		
	    driver.switchTo().window(parent);
	   
	   }
		catch (Exception e) {
	    	 Reporter.log("<B><font color = 'red'> ==> -</font> Oops! Looks like we don't have data for this search criteria yet.");
		}
		
		Reporter.log("");
		Reporter.log("<B><font color = 'Blue-Violet'> 8th Ad-</font> ");
		
		try {
		helper.Scrollintoview(current_date8);
		helper.waitFor(current_date8);
		helper.highLightElement(driver, current_date8);
		String imageDate = current_date8.getText();
		helper.jsCLick(current_date8);
		Reporter.log("<B><font color = 'blue'> ==> -</font> Clicked On Current Image Date: " + imageDate);
	
		helper.Scrollintoview(showAnalytics_Button8);
		helper.waitFor(showAnalytics_Button8);
		helper.highLightElement(driver, showAnalytics_Button8);
		String linkText1 = showAnalytics_Button8.getAttribute("href");
		helper.getAdID(linkText1);
		helper.jsCLick(showAnalytics_Button8);
		Reporter.log("<B><font color = 'blue'> ==> -</font> Clicked On ShowAnalytics Button.");

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
	    Reporter.log("<B><font color = 'blue'> ==> -</font> LastScene_date AdDetails Page= " +  lastSeenDate);
		
	    helper.Scrollintoview(post_Date);
	    helper.waitFor(post_Date);
	    helper.highLightElement(driver, post_Date);
	    String postSeenDate = post_Date.getText();
	    Reporter.log("<B><font color = 'blue'> ==> -</font> Post Date in AdDetails Page= " +  postSeenDate);
	    
	    driver.close();
		
	    driver.switchTo().window(parent);
	   
	   }
		catch (Exception e) {
	    	 Reporter.log("<B><font color = 'red'> ==> -</font> Oops! Looks like we don't have data for this search criteria yet.");
		}
		
		Reporter.log("");
		Reporter.log("<B><font color = 'Blue-Violet'> 9th Ad-</font> ");
		
		try {
		helper.Scrollintoview(current_date9);
		helper.waitFor(current_date9);
		helper.highLightElement(driver, current_date9);
		String imageDate = current_date9.getText();
		helper.jsCLick(current_date9);
		Reporter.log("<B><font color = 'blue'> ==> -</font> Clicked On Current Image Date: " + imageDate);
	
		helper.Scrollintoview(showAnalytics_Button9);
		helper.waitFor(showAnalytics_Button9);
		helper.highLightElement(driver, showAnalytics_Button9);
		String linkText1 = showAnalytics_Button9.getAttribute("href");
		helper.getAdID(linkText1);
		helper.jsCLick(showAnalytics_Button9);
		Reporter.log("<B><font color = 'blue'> ==> -</font> Clicked On ShowAnalytics Button.");

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
	    Reporter.log("<B><font color = 'blue'> ==> -</font> LastScene_date AdDetails Page= " +  lastSeenDate);
		
	    helper.Scrollintoview(post_Date);
	    helper.waitFor(post_Date);
	    helper.highLightElement(driver, post_Date);
	    String postSeenDate = post_Date.getText();
	    Reporter.log("<B><font color = 'blue'> ==> -</font> Post Date in AdDetails Page= " +  postSeenDate);
	    
	    driver.close();
		
	    driver.switchTo().window(parent);
	   
	   }
		catch (Exception e) {
	    	 Reporter.log("<B><font color = 'red'> ==> -</font> Oops! Looks like we don't have data for this search criteria yet.");
		}
		
		Reporter.log("");
		Reporter.log("<B><font color = 'Blue-Violet'> 10th Ad-</font> ");
		
		try {
		helper.Scrollintoview(current_date10);
		helper.waitFor(current_date10);
		helper.highLightElement(driver, current_date10);
		String imageDate = current_date10.getText();
		helper.jsCLick(current_date10);
		Reporter.log("<B><font color = 'blue'> ==> -</font> Clicked On Current Image Date: " + imageDate);
	
		helper.Scrollintoview(showAnalytics_Button10);
		helper.waitFor(showAnalytics_Button10);
		helper.highLightElement(driver, showAnalytics_Button10);
		String linkText1 = showAnalytics_Button10.getAttribute("href");
		helper.getAdID(linkText1);
		helper.jsCLick(showAnalytics_Button10);
		Reporter.log("<B><font color = 'blue'> ==> -</font> Clicked On ShowAnalytics Button.");

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
	    Reporter.log("<B><font color = 'blue'> ==> -</font> LastScene_date AdDetails Page= " +  lastSeenDate);
		
	    helper.Scrollintoview(post_Date);
	    helper.waitFor(post_Date);
	    helper.highLightElement(driver, post_Date);
	    String postSeenDate = post_Date.getText();
	    Reporter.log("<B><font color = 'blue'> ==> -</font> Post Date in AdDetails Page= " +  postSeenDate);
	    
	    driver.close();
		
	    driver.switchTo().window(parent);
	   
	   }
		catch (Exception e) {
	    	 Reporter.log("<B><font color = 'red'> ==> -</font> Oops! Looks like we don't have data for this search criteria yet.");
		}
		
		Reporter.log("");
		Reporter.log("<B><font color = 'Blue-Violet'> 11th Ad-</font> ");
		
		try {
		helper.Scrollintoview(current_date11);
		helper.waitFor(current_date11);
		helper.highLightElement(driver, current_date11);
		String imageDate = current_date11.getText();
		helper.jsCLick(current_date11);
		Reporter.log("<B><font color = 'blue'> ==> -</font> Clicked On Current Image Date: " + imageDate);
	
		helper.Scrollintoview(showAnalytics_Button11);
		helper.waitFor(showAnalytics_Button11);
		helper.highLightElement(driver, showAnalytics_Button11);
		String linkText1 = showAnalytics_Button11.getAttribute("href");
		helper.getAdID(linkText1);
		helper.jsCLick(showAnalytics_Button11);
		Reporter.log("<B><font color = 'blue'> ==> -</font> Clicked On ShowAnalytics Button.");

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
	    Reporter.log("<B><font color = 'blue'> ==> -</font> LastScene_date AdDetails Page= " +  lastSeenDate);
		
	    helper.Scrollintoview(post_Date);
	    helper.waitFor(post_Date);
	    helper.highLightElement(driver, post_Date);
	    String postSeenDate = post_Date.getText();
	    Reporter.log("<B><font color = 'blue'> ==> -</font> Post Date in AdDetails Page= " +  postSeenDate);
	    
	    driver.close();
		
	    driver.switchTo().window(parent);
	   
	   }
		catch (Exception e) {
	    	 Reporter.log("<B><font color = 'red'> ==> -</font> Oops! Looks like we don't have data for this search criteria yet.");
		}
		
		Reporter.log("");
		Reporter.log("<B><font color = 'Blue-Violet'> 12th Ad-</font> ");
		
		try {
		helper.Scrollintoview(current_date12);
		helper.waitFor(current_date12);
		helper.highLightElement(driver, current_date12);
		String imageDate = current_date12.getText();
		helper.jsCLick(current_date12);
		Reporter.log("<B><font color = 'blue'> ==> -</font> Clicked On Current Image Date: " + imageDate);
	
		helper.Scrollintoview(showAnalytics_Button12);
		helper.waitFor(showAnalytics_Button12);
		helper.highLightElement(driver, showAnalytics_Button12);
		String linkText1 = showAnalytics_Button12.getAttribute("href");
		helper.getAdID(linkText1);
		helper.jsCLick(showAnalytics_Button12);
		Reporter.log("<B><font color = 'blue'> ==> -</font> Clicked On ShowAnalytics Button.");

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
	    Reporter.log("<B><font color = 'blue'> ==> -</font> LastScene_date AdDetails Page= " +  lastSeenDate);
		
	    helper.Scrollintoview(post_Date);
	    helper.waitFor(post_Date);
	    helper.highLightElement(driver, post_Date);
	    String postSeenDate = post_Date.getText();
	    Reporter.log("<B><font color = 'blue'> ==> -</font> Post Date in AdDetails Page= " +  postSeenDate);
	    
	    driver.close();
		
	    driver.switchTo().window(parent);
	   
	   }
		catch (Exception e) {
	    	 Reporter.log("<B><font color = 'red'> ==> -</font> Oops! Looks like we don't have data for this search criteria yet.");
		}
		
		Reporter.log("");
		Reporter.log("<B><font color = 'Blue-Violet'> 13th Ad-</font> ");
		
		try {
		helper.Scrollintoview(current_date13);
		helper.waitFor(current_date13);
		helper.highLightElement(driver, current_date13);
		String imageDate = current_date13.getText();
		helper.jsCLick(current_date13);
		Reporter.log("<B><font color = 'blue'> ==> -</font> Clicked On Current Image Date: " + imageDate);
	
		helper.Scrollintoview(showAnalytics_Button13);
		helper.waitFor(showAnalytics_Button13);
		helper.highLightElement(driver, showAnalytics_Button13);
		String linkText1 = showAnalytics_Button13.getAttribute("href");
		helper.getAdID(linkText1);
		helper.jsCLick(showAnalytics_Button13);
		Reporter.log("<B><font color = 'blue'> ==> -</font> Clicked On ShowAnalytics Button.");

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
	    Reporter.log("<B><font color = 'blue'> ==> -</font> LastScene_date AdDetails Page= " +  lastSeenDate);
		
	    helper.Scrollintoview(post_Date);
	    helper.waitFor(post_Date);
	    helper.highLightElement(driver, post_Date);
	    String postSeenDate = post_Date.getText();
	    Reporter.log("<B><font color = 'blue'> ==> -</font> Post Date in AdDetails Page= " +  postSeenDate);
	    
	    driver.close();
		
	    driver.switchTo().window(parent);
	   
	   }
		catch (Exception e) {
	    	 Reporter.log("<B><font color = 'red'> ==> -</font> Oops! Looks like we don't have data for this search criteria yet.");
		}
		
		Reporter.log("");
		Reporter.log("<B><font color = 'Blue-Violet'> 14th Ad-</font> ");
		
		try {
		helper.Scrollintoview(current_date14);
		helper.waitFor(current_date14);
		helper.highLightElement(driver, current_date14);
		String imageDate = current_date14.getText();
		helper.jsCLick(current_date14);
		Reporter.log("<B><font color = 'blue'> ==> -</font> Clicked On Current Image Date: " + imageDate);
	
		helper.Scrollintoview(showAnalytics_Button14);
		helper.waitFor(showAnalytics_Button14);
		helper.highLightElement(driver, showAnalytics_Button14);
		String linkText1 = showAnalytics_Button14.getAttribute("href");
		helper.getAdID(linkText1);
		helper.jsCLick(showAnalytics_Button14);
		Reporter.log("<B><font color = 'blue'> ==> -</font> Clicked On ShowAnalytics Button.");

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
	    Reporter.log("<B><font color = 'blue'> ==> -</font> LastScene_date AdDetails Page= " +  lastSeenDate);
		
	    helper.Scrollintoview(post_Date);
	    helper.waitFor(post_Date);
	    helper.highLightElement(driver, post_Date);
	    String postSeenDate = post_Date.getText();
	    Reporter.log("<B><font color = 'blue'> ==> -</font> Post Date in AdDetails Page= " +  postSeenDate);
	    
	    driver.close();
		
	    driver.switchTo().window(parent);
	   
	   }
		catch (Exception e) {
	    	 Reporter.log("<B><font color = 'red'> ==> -</font> Oops! Looks like we don't have data for this search criteria yet.");
		}
		
		Reporter.log("");
		Reporter.log("<B><font color = 'Blue-Violet'> 15th Ad-</font> ");
		
		try {
		helper.Scrollintoview(current_date15);
		helper.waitFor(current_date15);
		helper.highLightElement(driver, current_date15);
		String imageDate = current_date15.getText();
		helper.jsCLick(current_date15);
		Reporter.log("<B><font color = 'blue'> ==> -</font> Clicked On Current Image Date: " + imageDate);
	
		helper.Scrollintoview(showAnalytics_Button15);
		helper.waitFor(showAnalytics_Button15);
		helper.highLightElement(driver, showAnalytics_Button15);
		String linkText1 = showAnalytics_Button15.getAttribute("href");
		helper.getAdID(linkText1);
		helper.jsCLick(showAnalytics_Button15);
		Reporter.log("<B><font color = 'blue'> ==> -</font> Clicked On ShowAnalytics Button.");

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
	    Reporter.log("<B><font color = 'blue'> ==> -</font> LastScene_date AdDetails Page= " +  lastSeenDate);
		
	    helper.Scrollintoview(post_Date);
	    helper.waitFor(post_Date);
	    helper.highLightElement(driver, post_Date);
	    String postSeenDate = post_Date.getText();
	    Reporter.log("<B><font color = 'blue'> ==> -</font> Post Date in AdDetails Page= " +  postSeenDate);
	    
	    driver.close();
		
	    driver.switchTo().window(parent);
	   
	   }
		catch (Exception e) {
	    	 Reporter.log("<B><font color = 'red'> ==> -</font> Oops! Looks like we don't have data for this search criteria yet.");
		}
/*	//Last Seven Days
	
		Reporter.log("");
		Reporter.log("<B><font color = 'green'> Post Date Between : Last Seven Days -</font> ");
		
	    helper.waitFor(clearSearchField);
		helper.highLightElement(driver, clearSearchField);
		helper.jsCLick(clearSearchField);
		Reporter.log("<B><font color = 'orange'> Step 1 -</font> Clicked On clear search.");
		
	    helper.waitFor(post_Date_Between_DropDown);
		helper.highLightElement(driver, post_Date_Between_DropDown);
		helper.jsCLick(post_Date_Between_DropDown);
		Reporter.log("<B><font color = 'orange'> Step 2 -</font> Clicked On Post Date Between DropDown.");
		
		helper.waitFor(post_Date_Between_LastSevenDays);
		helper.highLightElement(driver, post_Date_Between_LastSevenDays);
		helper.jsCLick(post_Date_Between_LastSevenDays);
		Reporter.log("<B><font color = 'orange'> Step 3 -</font> Clicked On Post Date Between Last Seven Days.");
		
		helper.Scrollintoview(search_bar);
		helper.waitFor(search_bar);
		helper.highLightElement(driver, search_bar);
		helper.jsCLick(search_bar);
		Reporter.log("<B><font color = 'orange'> Step 4 -</font> Clicked On Search Bar.");
		
		helper.waitFor(toatal_Count_Ads);
		helper.highLightElement(driver, toatal_Count_Ads);
		helper.jsCLick(toatal_Count_Ads);
		String Total_Ads_Count_LastSevenDays=toatal_Count_Ads.getText();
		Reporter.log("<B><font color = 'orange'> Step 5 -</font> Total_Ads_Count_LastSevenDays= " + Total_Ads_Count_LastSevenDays);
		
		Reporter.log("");
		Reporter.log("<B><font color = 'Blue-Violet'> 1st Ad-</font> ");
		
		try {
		helper.Scrollintoview(current_date1);
		helper.waitFor(current_date1);
		helper.highLightElement(driver, current_date1);
		String imageDate = current_date1.getText();
		helper.jsCLick(current_date1);
		Reporter.log("<B><font color = 'blue'> ==> -</font> Clicked On Current Image Date = " + imageDate);

		helper.Scrollintoview(showAnalytics_Button1);
		helper.waitFor(showAnalytics_Button1);
		helper.highLightElement(driver, showAnalytics_Button1);
		String linkText1 = showAnalytics_Button1.getAttribute("href");
		helper.getAdID(linkText1);
		helper.jsCLick(showAnalytics_Button1);
		Reporter.log("<B><font color = 'blue'> ==> -</font> Clicked On ShowAnalytics Button.");

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
	    Reporter.log("<B><font color = 'blue'> ==> -</font> LastScene_date AdDetails Page= " +  lastSeenDate);
		
	    helper.Scrollintoview(post_Date);
	    helper.waitFor(post_Date);
	    helper.highLightElement(driver, post_Date);
	    String postSeenDate = post_Date.getText();
	    Reporter.log("<B><font color = 'blue'> ==> -</font> Post Date in AdDetails Page= " +  postSeenDate);
	    
	    driver.close();
		
	    driver.switchTo().window(parent);

		}
		catch (Exception e) {
	    	 Reporter.log("<B><font color = 'red'> ==> -</font> Oops! Looks like we don't have data for this search criteria yet.");
		}
		
		Reporter.log("");
		Reporter.log("<B><font color = 'Blue-Violet'> 2nd Ad-</font> ");
		
		try {
		helper.Scrollintoview(current_date2);
		helper.waitFor(current_date2);
		helper.highLightElement(driver, current_date2);
		String imageDate = current_date2.getText();
		helper.jsCLick(current_date2);
		Reporter.log("<B><font color = 'blue'> ==> -</font> Clicked On Current Image Date = " + imageDate);

		helper.Scrollintoview(showAnalytics_Button2);
		helper.waitFor(showAnalytics_Button2);
		helper.highLightElement(driver, showAnalytics_Button2);
		String linkText1 = showAnalytics_Button2.getAttribute("href");
		helper.getAdID(linkText1);
		helper.jsCLick(showAnalytics_Button2);
		Reporter.log("<B><font color = 'blue'> ==> -</font> Clicked On ShowAnalytics Button.");

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
	    Reporter.log("<B><font color = 'blue'> ==> -</font> LastScene_date AdDetails Page= " +  lastSeenDate);
		
	    helper.Scrollintoview(post_Date);
	    helper.waitFor(post_Date);
	    helper.highLightElement(driver, post_Date);
	    String postSeenDate = post_Date.getText();
	    Reporter.log("<B><font color = 'blue'> ==> -</font> Post Date in AdDetails Page= " +  postSeenDate);
	    
	    driver.close();
		
	    driver.switchTo().window(parent);

		}
		catch (Exception e) {
	    	 Reporter.log("<B><font color = 'red'> ==> -</font> Oops! Looks like we don't have data for this search criteria yet.");
		}
		
		Reporter.log("");
		Reporter.log("<B><font color = 'Blue-Violet'> 3rd Ad-</font> ");
		
		try {
		helper.Scrollintoview(current_date3);
		helper.waitFor(current_date3);
		helper.highLightElement(driver, current_date3);
		String imageDate = current_date3.getText();
		helper.jsCLick(current_date3);
		Reporter.log("<B><font color = 'blue'> ==> -</font> Clicked On Current Image Date = " + imageDate);

		helper.Scrollintoview(showAnalytics_Button3);
		helper.waitFor(showAnalytics_Button3);
		helper.highLightElement(driver, showAnalytics_Button3);
		String linkText1 = showAnalytics_Button3.getAttribute("href");
		helper.getAdID(linkText1);
		helper.jsCLick(showAnalytics_Button3);
		Reporter.log("<B><font color = 'blue'> ==> -</font> Clicked On ShowAnalytics Button.");

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
	    Reporter.log("<B><font color = 'blue'> ==> -</font> LastScene_date AdDetails Page= " +  lastSeenDate);
		
	    helper.Scrollintoview(post_Date);
	    helper.waitFor(post_Date);
	    helper.highLightElement(driver, post_Date);
	    String postSeenDate = post_Date.getText();
	    Reporter.log("<B><font color = 'blue'> ==> -</font> Post Date in AdDetails Page= " +  postSeenDate);
	    
	    driver.close();
		
	    driver.switchTo().window(parent);

		}
		catch (Exception e) {
	    	 Reporter.log("<B><font color = 'red'> ==> -</font> Oops! Looks like we don't have data for this search criteria yet.");
		}
		
		Reporter.log("");
		Reporter.log("<B><font color = 'Blue-Violet'> 4th Ad-</font> ");
		
		try {
		helper.Scrollintoview(current_date4);
		helper.waitFor(current_date4);
		helper.highLightElement(driver, current_date4);
		String imageDate = current_date4.getText();
		helper.jsCLick(current_date4);
		Reporter.log("<B><font color = 'blue'> ==> -</font> Clicked On Current Image Date = " + imageDate);

		helper.Scrollintoview(showAnalytics_Button4);
		helper.waitFor(showAnalytics_Button4);
		helper.highLightElement(driver, showAnalytics_Button4);
		String linkText1 = showAnalytics_Button4.getAttribute("href");
		helper.getAdID(linkText1);
		helper.jsCLick(showAnalytics_Button4);
		Reporter.log("<B><font color = 'blue'> ==> -</font> Clicked On ShowAnalytics Button.");

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
	    Reporter.log("<B><font color = 'blue'> ==> -</font> LastScene_date AdDetails Page= " +  lastSeenDate);
		
	    helper.Scrollintoview(post_Date);
	    helper.waitFor(post_Date);
	    helper.highLightElement(driver, post_Date);
	    String postSeenDate = post_Date.getText();
	    Reporter.log("<B><font color = 'blue'> ==> -</font> Post Date in AdDetails Page= " +  postSeenDate);
	    
	    driver.close();
		
	    driver.switchTo().window(parent);

		}
		catch (Exception e) {
	    	 Reporter.log("<B><font color = 'red'> ==> -</font> Oops! Looks like we don't have data for this search criteria yet.");
		}
		
		Reporter.log("");
		Reporter.log("<B><font color = 'Blue-Violet'> 5th Ad-</font> ");
		
		try {
		helper.Scrollintoview(current_date5);
		helper.waitFor(current_date5);
		helper.highLightElement(driver, current_date5);
		String imageDate = current_date5.getText();
		helper.jsCLick(current_date5);
		Reporter.log("<B><font color = 'blue'> ==> -</font> Clicked On Current Image Date = " + imageDate);

		helper.Scrollintoview(showAnalytics_Button5);
		helper.waitFor(showAnalytics_Button5);
		helper.highLightElement(driver, showAnalytics_Button5);
		String linkText1 = showAnalytics_Button5.getAttribute("href");
		helper.getAdID(linkText1);
		helper.jsCLick(showAnalytics_Button5);
		Reporter.log("<B><font color = 'blue'> ==> -</font> Clicked On ShowAnalytics Button.");

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
	    Reporter.log("<B><font color = 'blue'> ==> -</font> LastScene_date AdDetails Page= " +  lastSeenDate);
		
	    helper.Scrollintoview(post_Date);
	    helper.waitFor(post_Date);
	    helper.highLightElement(driver, post_Date);
	    String postSeenDate = post_Date.getText();
	    Reporter.log("<B><font color = 'blue'> ==> -</font> Post Date in AdDetails Page= " +  postSeenDate);
	    
	    driver.close();
		
	    driver.switchTo().window(parent);

		}
		catch (Exception e) {
	    	 Reporter.log("<B><font color = 'red'> ==> -</font> Oops! Looks like we don't have data for this search criteria yet.");
		}
		
		Reporter.log("");
		Reporter.log("<B><font color = 'Blue-Violet'> 6th Ad-</font> ");
		
		try {
		helper.Scrollintoview(current_date6);
		helper.waitFor(current_date6);
		helper.highLightElement(driver, current_date6);
		String imageDate = current_date6.getText();
		helper.jsCLick(current_date6);
		Reporter.log("<B><font color = 'blue'> ==> -</font> Clicked On Current Image Date = " + imageDate);

		helper.Scrollintoview(showAnalytics_Button6);
		helper.waitFor(showAnalytics_Button6);
		helper.highLightElement(driver, showAnalytics_Button6);
		String linkText1 = showAnalytics_Button6.getAttribute("href");
		helper.getAdID(linkText1);
		helper.jsCLick(showAnalytics_Button6);
		Reporter.log("<B><font color = 'blue'> ==> -</font> Clicked On ShowAnalytics Button.");

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
	    Reporter.log("<B><font color = 'blue'> ==> -</font> LastScene_date AdDetails Page= " +  lastSeenDate);
		
	    helper.Scrollintoview(post_Date);
	    helper.waitFor(post_Date);
	    helper.highLightElement(driver, post_Date);
	    String postSeenDate = post_Date.getText();
	    Reporter.log("<B><font color = 'blue'> ==> -</font> Post Date in AdDetails Page= " +  postSeenDate);
	    
	    driver.close();
		
	    driver.switchTo().window(parent);

		}
		catch (Exception e) {
	    	 Reporter.log("<B><font color = 'red'> ==> -</font> Oops! Looks like we don't have data for this search criteria yet.");
		}
		
		Reporter.log("");
		Reporter.log("<B><font color = 'Blue-Violet'> 7th Ad-</font> ");
		
		try {
		helper.Scrollintoview(current_date7);
		helper.waitFor(current_date7);
		helper.highLightElement(driver, current_date7);
		String imageDate = current_date7.getText();
		helper.jsCLick(current_date7);
		Reporter.log("<B><font color = 'blue'> ==> -</font> Clicked On Current Image Date = " + imageDate);

		helper.Scrollintoview(showAnalytics_Button7);
		helper.waitFor(showAnalytics_Button7);
		helper.highLightElement(driver, showAnalytics_Button7);
		String linkText1 = showAnalytics_Button7.getAttribute("href");
		helper.getAdID(linkText1);
		helper.jsCLick(showAnalytics_Button7);
		Reporter.log("<B><font color = 'blue'> ==> -</font> Clicked On ShowAnalytics Button.");

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
	    Reporter.log("<B><font color = 'blue'> ==> -</font> LastScene_date AdDetails Page= " +  lastSeenDate);
		
	    helper.Scrollintoview(post_Date);
	    helper.waitFor(post_Date);
	    helper.highLightElement(driver, post_Date);
	    String postSeenDate = post_Date.getText();
	    Reporter.log("<B><font color = 'blue'> ==> -</font> Post Date in AdDetails Page= " +  postSeenDate);
	    
	    driver.close();
		
	    driver.switchTo().window(parent);

		}
		catch (Exception e) {
	    	 Reporter.log("<B><font color = 'red'> ==> -</font> Oops! Looks like we don't have data for this search criteria yet.");
		}
		
		Reporter.log("");
		Reporter.log("<B><font color = 'Blue-Violet'> 8th Ad-</font> ");
		
		try {
		helper.Scrollintoview(current_date8);
		helper.waitFor(current_date8);
		helper.highLightElement(driver, current_date8);
		String imageDate = current_date8.getText();
		helper.jsCLick(current_date8);
		Reporter.log("<B><font color = 'blue'> ==> -</font> Clicked On Current Image Date = " + imageDate);

		helper.Scrollintoview(showAnalytics_Button8);
		helper.waitFor(showAnalytics_Button8);
		helper.highLightElement(driver, showAnalytics_Button8);
		String linkText1 = showAnalytics_Button8.getAttribute("href");
		helper.getAdID(linkText1);
		helper.jsCLick(showAnalytics_Button8);
		Reporter.log("<B><font color = 'blue'> ==> -</font> Clicked On ShowAnalytics Button.");

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
	    Reporter.log("<B><font color = 'blue'> ==> -</font> LastScene_date AdDetails Page= " +  lastSeenDate);
		
	    helper.Scrollintoview(post_Date);
	    helper.waitFor(post_Date);
	    helper.highLightElement(driver, post_Date);
	    String postSeenDate = post_Date.getText();
	    Reporter.log("<B><font color = 'blue'> ==> -</font> Post Date in AdDetails Page= " +  postSeenDate);
	    
	    driver.close();
		
	    driver.switchTo().window(parent);

		}
		catch (Exception e) {
	    	 Reporter.log("<B><font color = 'red'> ==> -</font> Oops! Looks like we don't have data for this search criteria yet.");
		}
		
		Reporter.log("");
		Reporter.log("<B><font color = 'Blue-Violet'> 9th Ad-</font> ");
		
		try {
		helper.Scrollintoview(current_date9);
		helper.waitFor(current_date9);
		helper.highLightElement(driver, current_date9);
		String imageDate = current_date9.getText();
		helper.jsCLick(current_date9);
		Reporter.log("<B><font color = 'blue'> ==> -</font> Clicked On Current Image Date = " + imageDate);

		helper.Scrollintoview(showAnalytics_Button9);
		helper.waitFor(showAnalytics_Button9);
		helper.highLightElement(driver, showAnalytics_Button9);
		String linkText1 = showAnalytics_Button9.getAttribute("href");
		helper.getAdID(linkText1);
		helper.jsCLick(showAnalytics_Button9);
		Reporter.log("<B><font color = 'blue'> ==> -</font> Clicked On ShowAnalytics Button.");

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
	    Reporter.log("<B><font color = 'blue'> ==> -</font> LastScene_date AdDetails Page= " +  lastSeenDate);
		
	    helper.Scrollintoview(post_Date);
	    helper.waitFor(post_Date);
	    helper.highLightElement(driver, post_Date);
	    String postSeenDate = post_Date.getText();
	    Reporter.log("<B><font color = 'blue'> ==> -</font> Post Date in AdDetails Page= " +  postSeenDate);
	    
	    driver.close();
		
	    driver.switchTo().window(parent);

		}
		catch (Exception e) {
	    	 Reporter.log("<B><font color = 'red'> ==> -</font> Oops! Looks like we don't have data for this search criteria yet.");
		}
		
		Reporter.log("");
		Reporter.log("<B><font color = 'Blue-Violet'> 10th Ad-</font> ");
		
		try {
		helper.Scrollintoview(current_date10);
		helper.waitFor(current_date10);
		helper.highLightElement(driver, current_date10);
		String imageDate = current_date10.getText();
		helper.jsCLick(current_date10);
		Reporter.log("<B><font color = 'blue'> ==> -</font> Clicked On Current Image Date = " + imageDate);

		helper.Scrollintoview(showAnalytics_Button10);
		helper.waitFor(showAnalytics_Button10);
		helper.highLightElement(driver, showAnalytics_Button10);
		String linkText1 = showAnalytics_Button10.getAttribute("href");
		helper.getAdID(linkText1);
		helper.jsCLick(showAnalytics_Button10);
		Reporter.log("<B><font color = 'blue'> ==> -</font> Clicked On ShowAnalytics Button.");

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
	    Reporter.log("<B><font color = 'blue'> ==> -</font> LastScene_date AdDetails Page= " +  lastSeenDate);
		
	    helper.Scrollintoview(post_Date);
	    helper.waitFor(post_Date);
	    helper.highLightElement(driver, post_Date);
	    String postSeenDate = post_Date.getText();
	    Reporter.log("<B><font color = 'blue'> ==> -</font> Post Date in AdDetails Page= " +  postSeenDate);
	    
	    driver.close();
		
	    driver.switchTo().window(parent);

		}
		catch (Exception e) {
	    	 Reporter.log("<B><font color = 'red'> ==> -</font> Oops! Looks like we don't have data for this search criteria yet.");
		}
		
		Reporter.log("");
		Reporter.log("<B><font color = 'Blue-Violet'> 11th Ad-</font> ");
		
		try {
		helper.Scrollintoview(current_date11);
		helper.waitFor(current_date11);
		helper.highLightElement(driver, current_date11);
		String imageDate = current_date11.getText();
		helper.jsCLick(current_date11);
		Reporter.log("<B><font color = 'blue'> ==> -</font> Clicked On Current Image Date = " + imageDate);

		helper.Scrollintoview(showAnalytics_Button11);
		helper.waitFor(showAnalytics_Button11);
		helper.highLightElement(driver, showAnalytics_Button11);
		String linkText1 = showAnalytics_Button11.getAttribute("href");
		helper.getAdID(linkText1);
		helper.jsCLick(showAnalytics_Button11);
		Reporter.log("<B><font color = 'blue'> ==> -</font> Clicked On ShowAnalytics Button.");

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
	    Reporter.log("<B><font color = 'blue'> ==> -</font> LastScene_date AdDetails Page= " +  lastSeenDate);
		
	    helper.Scrollintoview(post_Date);
	    helper.waitFor(post_Date);
	    helper.highLightElement(driver, post_Date);
	    String postSeenDate = post_Date.getText();
	    Reporter.log("<B><font color = 'blue'> ==> -</font> Post Date in AdDetails Page= " +  postSeenDate);
	    
	    driver.close();
		
	    driver.switchTo().window(parent);

		}
		catch (Exception e) {
	    	 Reporter.log("<B><font color = 'red'> ==> -</font> Oops! Looks like we don't have data for this search criteria yet.");
		}
		
		Reporter.log("");
		Reporter.log("<B><font color = 'Blue-Violet'> 12th Ad-</font> ");
		
		try {
		helper.Scrollintoview(current_date12);
		helper.waitFor(current_date12);
		helper.highLightElement(driver, current_date12);
		String imageDate = current_date12.getText();
		helper.jsCLick(current_date12);
		Reporter.log("<B><font color = 'blue'> ==> -</font> Clicked On Current Image Date = " + imageDate);

		helper.Scrollintoview(showAnalytics_Button12);
		helper.waitFor(showAnalytics_Button12);
		helper.highLightElement(driver, showAnalytics_Button12);
		String linkText1 = showAnalytics_Button12.getAttribute("href");
		helper.getAdID(linkText1);
		helper.jsCLick(showAnalytics_Button12);
		Reporter.log("<B><font color = 'blue'> ==> -</font> Clicked On ShowAnalytics Button.");

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
	    Reporter.log("<B><font color = 'blue'> ==> -</font> LastScene_date AdDetails Page= " +  lastSeenDate);
		
	    helper.Scrollintoview(post_Date);
	    helper.waitFor(post_Date);
	    helper.highLightElement(driver, post_Date);
	    String postSeenDate = post_Date.getText();
	    Reporter.log("<B><font color = 'blue'> ==> -</font> Post Date in AdDetails Page= " +  postSeenDate);
	    
	    driver.close();
		
	    driver.switchTo().window(parent);

		}
		catch (Exception e) {
	    	 Reporter.log("<B><font color = 'red'> ==> -</font> Oops! Looks like we don't have data for this search criteria yet.");
		}
		
		Reporter.log("");
		Reporter.log("<B><font color = 'Blue-Violet'> 13th Ad-</font> ");
		
		try {
		helper.Scrollintoview(current_date13);
		helper.waitFor(current_date13);
		helper.highLightElement(driver, current_date13);
		String imageDate = current_date13.getText();
		helper.jsCLick(current_date13);
		Reporter.log("<B><font color = 'blue'> ==> -</font> Clicked On Current Image Date = " + imageDate);

		helper.Scrollintoview(showAnalytics_Button13);
		helper.waitFor(showAnalytics_Button13);
		helper.highLightElement(driver, showAnalytics_Button13);
		String linkText1 = showAnalytics_Button13.getAttribute("href");
		helper.getAdID(linkText1);
		helper.jsCLick(showAnalytics_Button13);
		Reporter.log("<B><font color = 'blue'> ==> -</font> Clicked On ShowAnalytics Button.");

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
	    Reporter.log("<B><font color = 'blue'> ==> -</font> LastScene_date AdDetails Page= " +  lastSeenDate);
		
	    helper.Scrollintoview(post_Date);
	    helper.waitFor(post_Date);
	    helper.highLightElement(driver, post_Date);
	    String postSeenDate = post_Date.getText();
	    Reporter.log("<B><font color = 'blue'> ==> -</font> Post Date in AdDetails Page= " +  postSeenDate);
	    
	    driver.close();
		
	    driver.switchTo().window(parent);

		}
		catch (Exception e) {
	    	 Reporter.log("<B><font color = 'red'> ==> -</font> Oops! Looks like we don't have data for this search criteria yet.");
		}
		
		Reporter.log("");
		Reporter.log("<B><font color = 'Blue-Violet'> 14th Ad-</font> ");
		
		try {
		helper.Scrollintoview(current_date14);
		helper.waitFor(current_date14);
		helper.highLightElement(driver, current_date14);
		String imageDate = current_date14.getText();
		helper.jsCLick(current_date14);
		Reporter.log("<B><font color = 'blue'> ==> -</font> Clicked On Current Image Date = " + imageDate);

		helper.Scrollintoview(showAnalytics_Button14);
		helper.waitFor(showAnalytics_Button14);
		helper.highLightElement(driver, showAnalytics_Button14);
		String linkText1 = showAnalytics_Button14.getAttribute("href");
		helper.getAdID(linkText1);
		helper.jsCLick(showAnalytics_Button14);
		Reporter.log("<B><font color = 'blue'> ==> -</font> Clicked On ShowAnalytics Button.");

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
	    Reporter.log("<B><font color = 'blue'> ==> -</font> LastScene_date AdDetails Page= " +  lastSeenDate);
		
	    helper.Scrollintoview(post_Date);
	    helper.waitFor(post_Date);
	    helper.highLightElement(driver, post_Date);
	    String postSeenDate = post_Date.getText();
	    Reporter.log("<B><font color = 'blue'> ==> -</font> Post Date in AdDetails Page= " +  postSeenDate);
	    
	    driver.close();
		
	    driver.switchTo().window(parent);

		}
		catch (Exception e) {
	    	 Reporter.log("<B><font color = 'red'> ==> -</font> Oops! Looks like we don't have data for this search criteria yet.");
		}
		
		Reporter.log("");
		Reporter.log("<B><font color = 'Blue-Violet'> 15th Ad-</font> ");
		
		try {
		helper.Scrollintoview(current_date15);
		helper.waitFor(current_date15);
		helper.highLightElement(driver, current_date15);
		String imageDate = current_date15.getText();
		helper.jsCLick(current_date15);
		Reporter.log("<B><font color = 'blue'> ==> -</font> Clicked On Current Image Date = " + imageDate);

		helper.Scrollintoview(showAnalytics_Button15);
		helper.waitFor(showAnalytics_Button15);
		helper.highLightElement(driver, showAnalytics_Button15);
		String linkText1 = showAnalytics_Button15.getAttribute("href");
		helper.getAdID(linkText1);
		helper.jsCLick(showAnalytics_Button15);
		Reporter.log("<B><font color = 'blue'> ==> -</font> Clicked On ShowAnalytics Button.");

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
	    Reporter.log("<B><font color = 'blue'> ==> -</font> LastScene_date AdDetails Page= " +  lastSeenDate);
		
	    helper.Scrollintoview(post_Date);
	    helper.waitFor(post_Date);
	    helper.highLightElement(driver, post_Date);
	    String postSeenDate = post_Date.getText();
	    Reporter.log("<B><font color = 'blue'> ==> -</font> Post Date in AdDetails Page= " +  postSeenDate);
	    
	    driver.close();
		
	    driver.switchTo().window(parent);

		}
		catch (Exception e) {
	    	 Reporter.log("<B><font color = 'red'> ==> -</font> Oops! Looks like we don't have data for this search criteria yet.");
		}
		
		//Last Thirty Days
		
		Reporter.log("");
		Reporter.log("<B><font color = 'green'> Post Date Between : Last Thirty Days -</font> ");
		
	    helper.waitFor(clearSearchField);
		helper.highLightElement(driver, clearSearchField);
		helper.jsCLick(clearSearchField);
		Reporter.log("<B><font color = 'orange'> Step 1 -</font> Clicked On clear search.");
		
		helper.waitForPageToLoad();
	    helper.waitFor(post_Date_Between_DropDown);
		helper.highLightElement(driver, post_Date_Between_DropDown);
		helper.jsCLick(post_Date_Between_DropDown);
		Reporter.log("<B><font color = 'orange'> Step 2 -</font> Clicked On Post Date Between DropDown.");
		
		helper.waitFor(post_Date_Between_LastThirtyDays);
		helper.highLightElement(driver, post_Date_Between_LastThirtyDays);
		helper.jsCLick(post_Date_Between_LastThirtyDays);
		Reporter.log("<B><font color = 'orange'> Step 3 -</font> Clicked On Post Date Between Last Thirty Days.");
		
		helper.waitFor(search_bar);
		helper.highLightElement(driver, search_bar);
		helper.jsCLick(search_bar);
		Reporter.log("<B><font color = 'orange'> Step 4 -</font> Clicked On Search Bar.");
		
		helper.waitForPageToLoad();
		helper.waitFor(toatal_Count_Ads);
		helper.highLightElement(driver, toatal_Count_Ads);
		helper.jsCLick(toatal_Count_Ads);
		String Total_Ads_Count_LastThirtyDays=toatal_Count_Ads.getText();
		Reporter.log("<B><font color = 'orange'> Step 5 -</font> Total_Ads_Count_LastThirtyDays= " + Total_Ads_Count_LastThirtyDays);
		
		Reporter.log("");
		Reporter.log("<B><font color = 'Blue-Violet'> 1st Ad-</font> ");
		
		try {
		helper.Scrollintoview(current_date1);
		helper.waitFor(current_date1);
		helper.highLightElement(driver, current_date1);
		String imageDate = current_date1.getText();
		helper.jsCLick(current_date1);
		Reporter.log("<B><font color = 'blue'> ==> -</font> Clicked On Current Image Date = " + imageDate);

		helper.Scrollintoview(showAnalytics_Button1);
		helper.waitFor(showAnalytics_Button1);
		helper.highLightElement(driver, showAnalytics_Button1);
		String linkText1 = showAnalytics_Button1.getAttribute("href");
		helper.getAdID(linkText1);
		helper.jsCLick(showAnalytics_Button1);
		Reporter.log("<B><font color = 'blue'> ==> -</font> Clicked On ShowAnalytics Button.");

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
	    Reporter.log("<B><font color = 'blue'> ==> -</font> LastScene_date AdDetails Page= " +  lastSeenDate);
		
	    helper.Scrollintoview(post_Date);
	    helper.waitFor(post_Date);
	    helper.highLightElement(driver, post_Date);
	    String postSeenDate = post_Date.getText();
	    Reporter.log("<B><font color = 'blue'> ==> -</font> Post Date in AdDetails Page= " +  postSeenDate);
	    
	    driver.close();
		
	    driver.switchTo().window(parent);
	    
	    helper.getPostDate(postSeenDate, imageDate);
	    
		}
		catch (Exception e) {
	    	 Reporter.log("<B><font color = 'red'> ==> -</font> Oops! Looks like we don't have data for this search criteria yet.");
		}
		
		Reporter.log("");
		Reporter.log("<B><font color = 'Blue-Violet'> 2nd Ad-</font> ");
		
		try {
		helper.Scrollintoview(current_date2);
		helper.waitFor(current_date2);
		helper.highLightElement(driver, current_date2);
		String imageDate = current_date2.getText();
		helper.jsCLick(current_date2);
		Reporter.log("<B><font color = 'blue'> ==> -</font> Clicked On Current Image Date = " + imageDate);

		helper.Scrollintoview(showAnalytics_Button2);
		helper.waitFor(showAnalytics_Button2);
		helper.highLightElement(driver, showAnalytics_Button2);
		String linkText1 = showAnalytics_Button2.getAttribute("href");
		helper.getAdID(linkText1);
		helper.jsCLick(showAnalytics_Button2);
		Reporter.log("<B><font color = 'blue'> ==> -</font> Clicked On ShowAnalytics Button.");

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
	    Reporter.log("<B><font color = 'blue'> ==> -</font> LastScene_date AdDetails Page= " +  lastSeenDate);
		
	    helper.Scrollintoview(post_Date);
	    helper.waitFor(post_Date);
	    helper.highLightElement(driver, post_Date);
	    String postSeenDate = post_Date.getText();
	    Reporter.log("<B><font color = 'blue'> ==> -</font> Post Date in AdDetails Page= " +  postSeenDate);
	    
	    driver.close();
		
	    driver.switchTo().window(parent);
	    
	    helper.getPostDate(postSeenDate, imageDate);
	    
		}
		catch (Exception e) {
	    	 Reporter.log("<B><font color = 'red'> ==> -</font> Oops! Looks like we don't have data for this search criteria yet.");
		}
		
		Reporter.log("");
		Reporter.log("<B><font color = 'Blue-Violet'> 3rd Ad-</font> ");
		
		try {
		helper.Scrollintoview(current_date3);
		helper.waitFor(current_date3);
		helper.highLightElement(driver, current_date3);
		String imageDate = current_date3.getText();
		helper.jsCLick(current_date3);
		Reporter.log("<B><font color = 'blue'> ==> -</font> Clicked On Current Image Date = " + imageDate);

		helper.Scrollintoview(showAnalytics_Button3);
		helper.waitFor(showAnalytics_Button3);
		helper.highLightElement(driver, showAnalytics_Button3);
		String linkText1 = showAnalytics_Button3.getAttribute("href");
		helper.getAdID(linkText1);
		helper.jsCLick(showAnalytics_Button3);
		Reporter.log("<B><font color = 'blue'> ==> -</font> Clicked On ShowAnalytics Button.");

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
	    Reporter.log("<B><font color = 'blue'> ==> -</font> LastScene_date AdDetails Page= " +  lastSeenDate);
		
	    helper.Scrollintoview(post_Date);
	    helper.waitFor(post_Date);
	    helper.highLightElement(driver, post_Date);
	    String postSeenDate = post_Date.getText();
	    Reporter.log("<B><font color = 'blue'> ==> -</font> Post Date in AdDetails Page= " +  postSeenDate);
	    
	    driver.close();
		
	    driver.switchTo().window(parent);
	    
	    helper.getPostDate(postSeenDate, imageDate);
	    
		}
		catch (Exception e) {
	    	 Reporter.log("<B><font color = 'red'> ==> -</font> Oops! Looks like we don't have data for this search criteria yet.");
		}
		
		Reporter.log("");
		Reporter.log("<B><font color = 'Blue-Violet'> 4th Ad-</font> ");
		
		try {
		helper.Scrollintoview(current_date4);
		helper.waitFor(current_date4);
		helper.highLightElement(driver, current_date4);
		String imageDate = current_date4.getText();
		helper.jsCLick(current_date4);
		Reporter.log("<B><font color = 'blue'> ==> -</font> Clicked On Current Image Date = " + imageDate);

		helper.Scrollintoview(showAnalytics_Button4);
		helper.waitFor(showAnalytics_Button4);
		helper.highLightElement(driver, showAnalytics_Button4);
		String linkText1 = showAnalytics_Button4.getAttribute("href");
		helper.getAdID(linkText1);
		helper.jsCLick(showAnalytics_Button4);
		Reporter.log("<B><font color = 'blue'> ==> -</font> Clicked On ShowAnalytics Button.");

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
	    Reporter.log("<B><font color = 'blue'> ==> -</font> LastScene_date AdDetails Page= " +  lastSeenDate);
		
	    helper.Scrollintoview(post_Date);
	    helper.waitFor(post_Date);
	    helper.highLightElement(driver, post_Date);
	    String postSeenDate = post_Date.getText();
	    Reporter.log("<B><font color = 'blue'> ==> -</font> Post Date in AdDetails Page= " +  postSeenDate);
	    
	    driver.close();
		
	    driver.switchTo().window(parent);
	    
	    helper.getPostDate(postSeenDate, imageDate);
	    
		}
		catch (Exception e) {
	    	 Reporter.log("<B><font color = 'red'> ==> -</font> Oops! Looks like we don't have data for this search criteria yet.");
		}
		
		Reporter.log("");
		Reporter.log("<B><font color = 'Blue-Violet'> 5th Ad-</font> ");
		
		try {
		helper.Scrollintoview(current_date5);
		helper.waitFor(current_date5);
		helper.highLightElement(driver, current_date5);
		String imageDate = current_date5.getText();
		helper.jsCLick(current_date5);
		Reporter.log("<B><font color = 'blue'> ==> -</font> Clicked On Current Image Date = " + imageDate);

		helper.Scrollintoview(showAnalytics_Button5);
		helper.waitFor(showAnalytics_Button5);
		helper.highLightElement(driver, showAnalytics_Button5);
		String linkText1 = showAnalytics_Button5.getAttribute("href");
		helper.getAdID(linkText1);
		helper.jsCLick(showAnalytics_Button5);
		Reporter.log("<B><font color = 'blue'> ==> -</font> Clicked On ShowAnalytics Button.");

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
	    Reporter.log("<B><font color = 'blue'> ==> -</font> LastScene_date AdDetails Page= " +  lastSeenDate);
		
	    helper.Scrollintoview(post_Date);
	    helper.waitFor(post_Date);
	    helper.highLightElement(driver, post_Date);
	    String postSeenDate = post_Date.getText();
	    Reporter.log("<B><font color = 'blue'> ==> -</font> Post Date in AdDetails Page= " +  postSeenDate);
	    
	    driver.close();
		
	    driver.switchTo().window(parent);
	    
	    helper.getPostDate(postSeenDate, imageDate);
	    
		}
		catch (Exception e) {
	    	 Reporter.log("<B><font color = 'red'> ==> -</font> Oops! Looks like we don't have data for this search criteria yet.");
		}
		
		Reporter.log("");
		Reporter.log("<B><font color = 'Blue-Violet'> 6th Ad-</font> ");
		
		try {
		helper.Scrollintoview(current_date6);
		helper.waitFor(current_date6);
		helper.highLightElement(driver, current_date6);
		String imageDate = current_date6.getText();
		helper.jsCLick(current_date6);
		Reporter.log("<B><font color = 'blue'> ==> -</font> Clicked On Current Image Date = " + imageDate);

		helper.Scrollintoview(showAnalytics_Button6);
		helper.waitFor(showAnalytics_Button6);
		helper.highLightElement(driver, showAnalytics_Button6);
		String linkText1 = showAnalytics_Button6.getAttribute("href");
		helper.getAdID(linkText1);
		helper.jsCLick(showAnalytics_Button6);
		Reporter.log("<B><font color = 'blue'> ==> -</font> Clicked On ShowAnalytics Button.");

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
	    Reporter.log("<B><font color = 'blue'> ==> -</font> LastScene_date AdDetails Page= " +  lastSeenDate);
		
	    helper.Scrollintoview(post_Date);
	    helper.waitFor(post_Date);
	    helper.highLightElement(driver, post_Date);
	    String postSeenDate = post_Date.getText();
	    Reporter.log("<B><font color = 'blue'> ==> -</font> Post Date in AdDetails Page= " +  postSeenDate);
	    
	    driver.close();
		
	    driver.switchTo().window(parent);
	    
	    helper.getPostDate(postSeenDate, imageDate);
	    
		}
		catch (Exception e) {
	    	 Reporter.log("<B><font color = 'red'> ==> -</font> Oops! Looks like we don't have data for this search criteria yet.");
		}
		
		Reporter.log("");
		Reporter.log("<B><font color = 'Blue-Violet'> 7th Ad-</font> ");
		
		try {
		helper.Scrollintoview(current_date7);
		helper.waitFor(current_date7);
		helper.highLightElement(driver, current_date7);
		String imageDate = current_date7.getText();
		helper.jsCLick(current_date7);
		Reporter.log("<B><font color = 'blue'> ==> -</font> Clicked On Current Image Date = " + imageDate);

		helper.Scrollintoview(showAnalytics_Button7);
		helper.waitFor(showAnalytics_Button7);
		helper.highLightElement(driver, showAnalytics_Button7);
		String linkText1 = showAnalytics_Button7.getAttribute("href");
		helper.getAdID(linkText1);
		helper.jsCLick(showAnalytics_Button7);
		Reporter.log("<B><font color = 'blue'> ==> -</font> Clicked On ShowAnalytics Button.");

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
	    Reporter.log("<B><font color = 'blue'> ==> -</font> LastScene_date AdDetails Page= " +  lastSeenDate);
		
	    helper.Scrollintoview(post_Date);
	    helper.waitFor(post_Date);
	    helper.highLightElement(driver, post_Date);
	    String postSeenDate = post_Date.getText();
	    Reporter.log("<B><font color = 'blue'> ==> -</font> Post Date in AdDetails Page= " +  postSeenDate);
	    
	    driver.close();
		
	    driver.switchTo().window(parent);
	    
	    helper.getPostDate(postSeenDate, imageDate);
	    
		}
		catch (Exception e) {
	    	 Reporter.log("<B><font color = 'red'> ==> -</font> Oops! Looks like we don't have data for this search criteria yet.");
		}
		
		Reporter.log("");
		Reporter.log("<B><font color = 'Blue-Violet'> 7th Ad-</font> ");
		
		try {
		helper.Scrollintoview(current_date7);
		helper.waitFor(current_date7);
		helper.highLightElement(driver, current_date7);
		String imageDate = current_date7.getText();
		helper.jsCLick(current_date7);
		Reporter.log("<B><font color = 'blue'> ==> -</font> Clicked On Current Image Date = " + imageDate);

		helper.Scrollintoview(showAnalytics_Button7);
		helper.waitFor(showAnalytics_Button7);
		helper.highLightElement(driver, showAnalytics_Button7);
		String linkText1 = showAnalytics_Button7.getAttribute("href");
		helper.getAdID(linkText1);
		helper.jsCLick(showAnalytics_Button7);
		Reporter.log("<B><font color = 'blue'> ==> -</font> Clicked On ShowAnalytics Button.");

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
	    Reporter.log("<B><font color = 'blue'> ==> -</font> LastScene_date AdDetails Page= " +  lastSeenDate);
		
	    helper.Scrollintoview(post_Date);
	    helper.waitFor(post_Date);
	    helper.highLightElement(driver, post_Date);
	    String postSeenDate = post_Date.getText();
	    Reporter.log("<B><font color = 'blue'> ==> -</font> Post Date in AdDetails Page= " +  postSeenDate);
	    
	    driver.close();
		
	    driver.switchTo().window(parent);
	    
	    helper.getPostDate(postSeenDate, imageDate);
	    
		}
		catch (Exception e) {
	    	 Reporter.log("<B><font color = 'red'> ==> -</font> Oops! Looks like we don't have data for this search criteria yet.");
		}
		
		Reporter.log("");
		Reporter.log("<B><font color = 'Blue-Violet'> 8th Ad-</font> ");
		
		try {
		helper.Scrollintoview(current_date8);
		helper.waitFor(current_date8);
		helper.highLightElement(driver, current_date8);
		String imageDate = current_date8.getText();
		helper.jsCLick(current_date8);
		Reporter.log("<B><font color = 'blue'> ==> -</font> Clicked On Current Image Date = " + imageDate);

		helper.Scrollintoview(showAnalytics_Button8);
		helper.waitFor(showAnalytics_Button8);
		helper.highLightElement(driver, showAnalytics_Button8);
		String linkText1 = showAnalytics_Button8.getAttribute("href");
		helper.getAdID(linkText1);
		helper.jsCLick(showAnalytics_Button8);
		Reporter.log("<B><font color = 'blue'> ==> -</font> Clicked On ShowAnalytics Button.");

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
	    Reporter.log("<B><font color = 'blue'> ==> -</font> LastScene_date AdDetails Page= " +  lastSeenDate);
		
	    helper.Scrollintoview(post_Date);
	    helper.waitFor(post_Date);
	    helper.highLightElement(driver, post_Date);
	    String postSeenDate = post_Date.getText();
	    Reporter.log("<B><font color = 'blue'> ==> -</font> Post Date in AdDetails Page= " +  postSeenDate);
	    
	    driver.close();
		
	    driver.switchTo().window(parent);
	    
	    helper.getPostDate(postSeenDate, imageDate);
	    
		}
		catch (Exception e) {
	    	 Reporter.log("<B><font color = 'red'> ==> -</font> Oops! Looks like we don't have data for this search criteria yet.");
		}
		
		Reporter.log("");
		Reporter.log("<B><font color = 'Blue-Violet'> 9th Ad-</font> ");
		
		try {
		helper.Scrollintoview(current_date9);
		helper.waitFor(current_date9);
		helper.highLightElement(driver, current_date9);
		String imageDate = current_date9.getText();
		helper.jsCLick(current_date9);
		Reporter.log("<B><font color = 'blue'> ==> -</font> Clicked On Current Image Date = " + imageDate);

		helper.Scrollintoview(showAnalytics_Button9);
		helper.waitFor(showAnalytics_Button9);
		helper.highLightElement(driver, showAnalytics_Button9);
		String linkText1 = showAnalytics_Button9.getAttribute("href");
		helper.getAdID(linkText1);
		helper.jsCLick(showAnalytics_Button9);
		Reporter.log("<B><font color = 'blue'> ==> -</font> Clicked On ShowAnalytics Button.");

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
	    Reporter.log("<B><font color = 'blue'> ==> -</font> LastScene_date AdDetails Page= " +  lastSeenDate);
		
	    helper.Scrollintoview(post_Date);
	    helper.waitFor(post_Date);
	    helper.highLightElement(driver, post_Date);
	    String postSeenDate = post_Date.getText();
	    Reporter.log("<B><font color = 'blue'> ==> -</font> Post Date in AdDetails Page= " +  postSeenDate);
	    
	    driver.close();
		
	    driver.switchTo().window(parent);
	    
	    helper.getPostDate(postSeenDate, imageDate);
	    
		}
		catch (Exception e) {
	    	 Reporter.log("<B><font color = 'red'> ==> -</font> Oops! Looks like we don't have data for this search criteria yet.");
		}
		
		Reporter.log("");
		Reporter.log("<B><font color = 'Blue-Violet'> 10th Ad-</font> ");
		
		try {
		helper.Scrollintoview(current_date10);
		helper.waitFor(current_date10);
		helper.highLightElement(driver, current_date10);
		String imageDate = current_date10.getText();
		helper.jsCLick(current_date10);
		Reporter.log("<B><font color = 'blue'> ==> -</font> Clicked On Current Image Date = " + imageDate);

		helper.Scrollintoview(showAnalytics_Button10);
		helper.waitFor(showAnalytics_Button10);
		helper.highLightElement(driver, showAnalytics_Button10);
		String linkText1 = showAnalytics_Button10.getAttribute("href");
		helper.getAdID(linkText1);
		helper.jsCLick(showAnalytics_Button10);
		Reporter.log("<B><font color = 'blue'> ==> -</font> Clicked On ShowAnalytics Button.");

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
	    Reporter.log("<B><font color = 'blue'> ==> -</font> LastScene_date AdDetails Page= " +  lastSeenDate);
		
	    helper.Scrollintoview(post_Date);
	    helper.waitFor(post_Date);
	    helper.highLightElement(driver, post_Date);
	    String postSeenDate = post_Date.getText();
	    Reporter.log("<B><font color = 'blue'> ==> -</font> Post Date in AdDetails Page= " +  postSeenDate);
	    
	    driver.close();
		
	    driver.switchTo().window(parent);
	    
	    helper.getPostDate(postSeenDate, imageDate);
	    
		}
		catch (Exception e) {
	    	 Reporter.log("<B><font color = 'red'> ==> -</font> Oops! Looks like we don't have data for this search criteria yet.");
		}
		
		Reporter.log("");
		Reporter.log("<B><font color = 'Blue-Violet'> 11th Ad-</font> ");
		
		try {
		helper.Scrollintoview(current_date11);
		helper.waitFor(current_date11);
		helper.highLightElement(driver, current_date11);
		String imageDate = current_date11.getText();
		helper.jsCLick(current_date11);
		Reporter.log("<B><font color = 'blue'> ==> -</font> Clicked On Current Image Date = " + imageDate);

		helper.Scrollintoview(showAnalytics_Button11);
		helper.waitFor(showAnalytics_Button11);
		helper.highLightElement(driver, showAnalytics_Button11);
		String linkText1 = showAnalytics_Button11.getAttribute("href");
		helper.getAdID(linkText1);
		helper.jsCLick(showAnalytics_Button11);
		Reporter.log("<B><font color = 'blue'> ==> -</font> Clicked On ShowAnalytics Button.");

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
	    Reporter.log("<B><font color = 'blue'> ==> -</font> LastScene_date AdDetails Page= " +  lastSeenDate);
		
	    helper.Scrollintoview(post_Date);
	    helper.waitFor(post_Date);
	    helper.highLightElement(driver, post_Date);
	    String postSeenDate = post_Date.getText();
	    Reporter.log("<B><font color = 'blue'> ==> -</font> Post Date in AdDetails Page= " +  postSeenDate);
	    
	    driver.close();
		
	    driver.switchTo().window(parent);
	    
	    helper.getPostDate(postSeenDate, imageDate);
	    
		}
		catch (Exception e) {
	    	 Reporter.log("<B><font color = 'red'> ==> -</font> Oops! Looks like we don't have data for this search criteria yet.");
		}
		
		Reporter.log("");
		Reporter.log("<B><font color = 'Blue-Violet'> 12th Ad-</font> ");
		
		try {
		helper.Scrollintoview(current_date12);
		helper.waitFor(current_date12);
		helper.highLightElement(driver, current_date12);
		String imageDate = current_date12.getText();
		helper.jsCLick(current_date12);
		Reporter.log("<B><font color = 'blue'> ==> -</font> Clicked On Current Image Date = " + imageDate);

		helper.Scrollintoview(showAnalytics_Button12);
		helper.waitFor(showAnalytics_Button12);
		helper.highLightElement(driver, showAnalytics_Button12);
		String linkText1 = showAnalytics_Button12.getAttribute("href");
		helper.getAdID(linkText1);
		helper.jsCLick(showAnalytics_Button12);
		Reporter.log("<B><font color = 'blue'> ==> -</font> Clicked On ShowAnalytics Button.");

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
	    Reporter.log("<B><font color = 'blue'> ==> -</font> LastScene_date AdDetails Page= " +  lastSeenDate);
		
	    helper.Scrollintoview(post_Date);
	    helper.waitFor(post_Date);
	    helper.highLightElement(driver, post_Date);
	    String postSeenDate = post_Date.getText();
	    Reporter.log("<B><font color = 'blue'> ==> -</font> Post Date in AdDetails Page= " +  postSeenDate);
	    
	    driver.close();
		
	    driver.switchTo().window(parent);
	    
	    helper.getPostDate(postSeenDate, imageDate);
	    
		}
		catch (Exception e) {
	    	 Reporter.log("<B><font color = 'red'> ==> -</font> Oops! Looks like we don't have data for this search criteria yet.");
		}
		
		Reporter.log("");
		Reporter.log("<B><font color = 'Blue-Violet'> 13th Ad-</font> ");
		
		try {
		helper.Scrollintoview(current_date13);
		helper.waitFor(current_date13);
		helper.highLightElement(driver, current_date13);
		String imageDate = current_date13.getText();
		helper.jsCLick(current_date13);
		Reporter.log("<B><font color = 'blue'> ==> -</font> Clicked On Current Image Date = " + imageDate);

		helper.Scrollintoview(showAnalytics_Button13);
		helper.waitFor(showAnalytics_Button13);
		helper.highLightElement(driver, showAnalytics_Button13);
		String linkText1 = showAnalytics_Button13.getAttribute("href");
		helper.getAdID(linkText1);
		helper.jsCLick(showAnalytics_Button13);
		Reporter.log("<B><font color = 'blue'> ==> -</font> Clicked On ShowAnalytics Button.");

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
	    Reporter.log("<B><font color = 'blue'> ==> -</font> LastScene_date AdDetails Page= " +  lastSeenDate);
		
	    helper.Scrollintoview(post_Date);
	    helper.waitFor(post_Date);
	    helper.highLightElement(driver, post_Date);
	    String postSeenDate = post_Date.getText();
	    Reporter.log("<B><font color = 'blue'> ==> -</font> Post Date in AdDetails Page= " +  postSeenDate);
	    
	    driver.close();
		
	    driver.switchTo().window(parent);
	    
	    helper.getPostDate(postSeenDate, imageDate);
	    
		}
		catch (Exception e) {
	    	 Reporter.log("<B><font color = 'red'> ==> -</font> Oops! Looks like we don't have data for this search criteria yet.");
		}
		
		Reporter.log("");
		Reporter.log("<B><font color = 'Blue-Violet'> 14th Ad-</font> ");
		
		try {
		helper.Scrollintoview(current_date14);
		helper.waitFor(current_date14);
		helper.highLightElement(driver, current_date14);
		String imageDate = current_date14.getText();
		helper.jsCLick(current_date14);
		Reporter.log("<B><font color = 'blue'> ==> -</font> Clicked On Current Image Date = " + imageDate);

		helper.Scrollintoview(showAnalytics_Button14);
		helper.waitFor(showAnalytics_Button14);
		helper.highLightElement(driver, showAnalytics_Button14);
		String linkText1 = showAnalytics_Button14.getAttribute("href");
		helper.getAdID(linkText1);
		helper.jsCLick(showAnalytics_Button14);
		Reporter.log("<B><font color = 'blue'> ==> -</font> Clicked On ShowAnalytics Button.");

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
	    Reporter.log("<B><font color = 'blue'> ==> -</font> LastScene_date AdDetails Page= " +  lastSeenDate);
		
	    helper.Scrollintoview(post_Date);
	    helper.waitFor(post_Date);
	    helper.highLightElement(driver, post_Date);
	    String postSeenDate = post_Date.getText();
	    Reporter.log("<B><font color = 'blue'> ==> -</font> Post Date in AdDetails Page= " +  postSeenDate);
	    
	    driver.close();
		
	    driver.switchTo().window(parent);
	    
	    helper.getPostDate(postSeenDate, imageDate);
	    
		}
		catch (Exception e) {
	    	 Reporter.log("<B><font color = 'red'> ==> -</font> Oops! Looks like we don't have data for this search criteria yet.");
		}
		
		Reporter.log("");
		Reporter.log("<B><font color = 'Blue-Violet'> 15th Ad-</font> ");
		
		try {
		helper.Scrollintoview(current_date15);
		helper.waitFor(current_date15);
		helper.highLightElement(driver, current_date15);
		String imageDate = current_date15.getText();
		helper.jsCLick(current_date15);
		Reporter.log("<B><font color = 'blue'> ==> -</font> Clicked On Current Image Date = " + imageDate);

		helper.Scrollintoview(showAnalytics_Button15);
		helper.waitFor(showAnalytics_Button15);
		helper.highLightElement(driver, showAnalytics_Button15);
		String linkText1 = showAnalytics_Button15.getAttribute("href");
		helper.getAdID(linkText1);
		helper.jsCLick(showAnalytics_Button15);
		Reporter.log("<B><font color = 'blue'> ==> -</font> Clicked On ShowAnalytics Button.");

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
	    Reporter.log("<B><font color = 'blue'> ==> -</font> LastScene_date AdDetails Page= " +  lastSeenDate);
		
	    helper.Scrollintoview(post_Date);
	    helper.waitFor(post_Date);
	    helper.highLightElement(driver, post_Date);
	    String postSeenDate = post_Date.getText();
	    Reporter.log("<B><font color = 'blue'> ==> -</font> Post Date in AdDetails Page= " +  postSeenDate);
	    
	    driver.close();
		
	    driver.switchTo().window(parent);
	    
	    helper.getPostDate(postSeenDate, imageDate);
	    
		}
		catch (Exception e) {
	    	 Reporter.log("<B><font color = 'red'> ==> -</font> Oops! Looks like we don't have data for this search criteria yet.");
		}
	
		//This Month
		
		Reporter.log("");
		Reporter.log("<B><font color = 'green'> Post Date Between : This Month -</font> ");
		
	    helper.waitFor(clearSearchField);
		helper.highLightElement(driver, clearSearchField);
		helper.jsCLick(clearSearchField);
		Reporter.log("<B><font color = 'orange'> Step 1 -</font> Clicked On clear search.");
		
		helper.waitForPageToLoad();
	    helper.waitFor(post_Date_Between_DropDown);
		helper.highLightElement(driver, post_Date_Between_DropDown);
		helper.jsCLick(post_Date_Between_DropDown);
		Reporter.log("<B><font color = 'orange'> Step 2 -</font> Clicked On Post Date Between DropDown.");
		
		helper.waitFor(post_Date_Between_ThisMonth);
		helper.highLightElement(driver, post_Date_Between_ThisMonth);
		helper.jsCLick(post_Date_Between_ThisMonth);
		Reporter.log("<B><font color = 'orange'> Step 3 -</font> Clicked On Post Date Between This Month.");
		
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
		Reporter.log("<B><font color = 'Blue-Violet'> 1st Ad-</font> ");
		
		try {
		helper.Scrollintoview(current_date1);
		helper.waitFor(current_date1);
		helper.highLightElement(driver, current_date1);
		String imageDate = current_date1.getText();
		helper.jsCLick(current_date1);
		Reporter.log("<B><font color = 'blue'> ==> -</font> Clicked On Current Image Date = " + imageDate);

		helper.Scrollintoview(showAnalytics_Button1);
		helper.waitFor(showAnalytics_Button1);
		helper.highLightElement(driver, showAnalytics_Button1);
		String linkText1 = showAnalytics_Button1.getAttribute("href");
		helper.getAdID(linkText1);
		helper.jsCLick(showAnalytics_Button1);
		Reporter.log("<B><font color = 'blue'> ==> -</font> Clicked On ShowAnalytics Button.");

		Set<String> S1=driver.getWindowHandles();
	    Iterator<String>it=S1.iterator();
	    String parent=it.next();
	    String child=it.next();
	    
	    driver.switchTo().window(child);
	    
	    helper.waitForPageToLoad();
	    helper.waitFor(Last_Seen_childWindow);
	    helper.highLightElement(driver, Last_Seen_childWindow);
	    String lastSeenDate = Last_Seen_childWindow.getText();
	    Reporter.log("<B><font color = 'blue'> ==> -</font> LastScene_date AdDetails Page= " +  lastSeenDate);
		
	    helper.waitForPageToLoad();
	    helper.waitFor(post_Date);
	    helper.highLightElement(driver, post_Date);
	    String postSeenDate = post_Date.getText();
	    Reporter.log("<B><font color = 'blue'> ==> -</font> Post Date in AdDetails Page= " +  postSeenDate);
	    
	    driver.close();
		
	    driver.switchTo().window(parent);
	    
	    helper.getPostDate(postSeenDate, imageDate);
		}
		catch (Exception e) {
	    	 Reporter.log("<B><font color = 'red'> ==> -</font> Oops! Looks like we don't have data for this search criteria yet.");
		}
		
		Reporter.log("");
		Reporter.log("<B><font color = 'Blue-Violet'> 2nd Ad-</font> ");
		
		try {
		helper.Scrollintoview(current_date2);
		helper.waitFor(current_date2);
		helper.highLightElement(driver, current_date2);
		String imageDate = current_date2.getText();
		helper.jsCLick(current_date2);
		Reporter.log("<B><font color = 'blue'> ==> -</font> Clicked On Current Image Date = " + imageDate);

		helper.Scrollintoview(showAnalytics_Button2);
		helper.waitFor(showAnalytics_Button2);
		helper.highLightElement(driver, showAnalytics_Button2);
		String linkText1 = showAnalytics_Button2.getAttribute("href");
		helper.getAdID(linkText1);
		helper.jsCLick(showAnalytics_Button2);
		Reporter.log("<B><font color = 'blue'> ==> -</font> Clicked On ShowAnalytics Button.");

		Set<String> S1=driver.getWindowHandles();
	    Iterator<String>it=S1.iterator();
	    String parent=it.next();
	    String child=it.next();
	    
	    driver.switchTo().window(child);
	    
	    helper.waitForPageToLoad();
	    helper.waitFor(Last_Seen_childWindow);
	    helper.highLightElement(driver, Last_Seen_childWindow);
	    String lastSeenDate = Last_Seen_childWindow.getText();
	    Reporter.log("<B><font color = 'blue'> ==> -</font> LastScene_date AdDetails Page= " +  lastSeenDate);
		
	    helper.waitForPageToLoad();
	    helper.waitFor(post_Date);
	    helper.highLightElement(driver, post_Date);
	    String postSeenDate = post_Date.getText();
	    Reporter.log("<B><font color = 'blue'> ==> -</font> Post Date in AdDetails Page= " +  postSeenDate);
	    
	    driver.close();
		
	    driver.switchTo().window(parent);
	    
	    helper.getPostDate(postSeenDate, imageDate);
		}
		catch (Exception e) {
	    	 Reporter.log("<B><font color = 'red'> ==> -</font> Oops! Looks like we don't have data for this search criteria yet.");
		}
		
		Reporter.log("");
		Reporter.log("<B><font color = 'Blue-Violet'> 3rd Ad-</font> ");
		
		try {
		helper.Scrollintoview(current_date3);
		helper.waitFor(current_date3);
		helper.highLightElement(driver, current_date3);
		String imageDate = current_date3.getText();
		helper.jsCLick(current_date3);
		Reporter.log("<B><font color = 'blue'> ==> -</font> Clicked On Current Image Date = " + imageDate);

		helper.Scrollintoview(showAnalytics_Button3);
		helper.waitFor(showAnalytics_Button3);
		helper.highLightElement(driver, showAnalytics_Button3);
		String linkText1 = showAnalytics_Button3.getAttribute("href");
		helper.getAdID(linkText1);
		helper.jsCLick(showAnalytics_Button3);
		Reporter.log("<B><font color = 'blue'> ==> -</font> Clicked On ShowAnalytics Button.");

		Set<String> S1=driver.getWindowHandles();
	    Iterator<String>it=S1.iterator();
	    String parent=it.next();
	    String child=it.next();
	    
	    driver.switchTo().window(child);
	    
	    helper.waitForPageToLoad();
	    helper.waitFor(Last_Seen_childWindow);
	    helper.highLightElement(driver, Last_Seen_childWindow);
	    String lastSeenDate = Last_Seen_childWindow.getText();
	    Reporter.log("<B><font color = 'blue'> ==> -</font> LastScene_date AdDetails Page= " +  lastSeenDate);
		
	    helper.waitForPageToLoad();
	    helper.waitFor(post_Date);
	    helper.highLightElement(driver, post_Date);
	    String postSeenDate = post_Date.getText();
	    Reporter.log("<B><font color = 'blue'> ==> -</font> Post Date in AdDetails Page= " +  postSeenDate);
	    
	    driver.close();
		
	    driver.switchTo().window(parent);
	    
	    helper.getPostDate(postSeenDate, imageDate);
		}
		catch (Exception e) {
	    	 Reporter.log("<B><font color = 'red'> ==> -</font> Oops! Looks like we don't have data for this search criteria yet.");
		}
		
		Reporter.log("");
		Reporter.log("<B><font color = 'Blue-Violet'> 4th Ad-</font> ");
		
		try {
		helper.Scrollintoview(current_date4);
		helper.waitFor(current_date4);
		helper.highLightElement(driver, current_date4);
		String imageDate = current_date4.getText();
		helper.jsCLick(current_date4);
		Reporter.log("<B><font color = 'blue'> ==> -</font> Clicked On Current Image Date = " + imageDate);

		helper.Scrollintoview(showAnalytics_Button4);
		helper.waitFor(showAnalytics_Button4);
		helper.highLightElement(driver, showAnalytics_Button4);
		String linkText1 = showAnalytics_Button4.getAttribute("href");
		helper.getAdID(linkText1);
		helper.jsCLick(showAnalytics_Button4);
		Reporter.log("<B><font color = 'blue'> ==> -</font> Clicked On ShowAnalytics Button.");

		Set<String> S1=driver.getWindowHandles();
	    Iterator<String>it=S1.iterator();
	    String parent=it.next();
	    String child=it.next();
	    
	    driver.switchTo().window(child);
	    
	    helper.waitForPageToLoad();
	    helper.waitFor(Last_Seen_childWindow);
	    helper.highLightElement(driver, Last_Seen_childWindow);
	    String lastSeenDate = Last_Seen_childWindow.getText();
	    Reporter.log("<B><font color = 'blue'> ==> -</font> LastScene_date AdDetails Page= " +  lastSeenDate);
		
	    helper.waitForPageToLoad();
	    helper.waitFor(post_Date);
	    helper.highLightElement(driver, post_Date);
	    String postSeenDate = post_Date.getText();
	    Reporter.log("<B><font color = 'blue'> ==> -</font> Post Date in AdDetails Page= " +  postSeenDate);
	    
	    driver.close();
		
	    driver.switchTo().window(parent);
	    
	    helper.getPostDate(postSeenDate, imageDate);
		}
		catch (Exception e) {
	    	 Reporter.log("<B><font color = 'red'> ==> -</font> Oops! Looks like we don't have data for this search criteria yet.");
		}
		
		Reporter.log("");
		Reporter.log("<B><font color = 'Blue-Violet'> 5th Ad-</font> ");
		
		try {
		helper.Scrollintoview(current_date5);
		helper.waitFor(current_date5);
		helper.highLightElement(driver, current_date5);
		String imageDate = current_date5.getText();
		helper.jsCLick(current_date5);
		Reporter.log("<B><font color = 'blue'> ==> -</font> Clicked On Current Image Date = " + imageDate);

		helper.Scrollintoview(showAnalytics_Button5);
		helper.waitFor(showAnalytics_Button5);
		helper.highLightElement(driver, showAnalytics_Button5);
		String linkText1 = showAnalytics_Button5.getAttribute("href");
		helper.getAdID(linkText1);
		helper.jsCLick(showAnalytics_Button5);
		Reporter.log("<B><font color = 'blue'> ==> -</font> Clicked On ShowAnalytics Button.");

		Set<String> S1=driver.getWindowHandles();
	    Iterator<String>it=S1.iterator();
	    String parent=it.next();
	    String child=it.next();
	    
	    driver.switchTo().window(child);
	    
	    helper.waitForPageToLoad();
	    helper.waitFor(Last_Seen_childWindow);
	    helper.highLightElement(driver, Last_Seen_childWindow);
	    String lastSeenDate = Last_Seen_childWindow.getText();
	    Reporter.log("<B><font color = 'blue'> ==> -</font> LastScene_date AdDetails Page= " +  lastSeenDate);
		
	    helper.waitForPageToLoad();
	    helper.waitFor(post_Date);
	    helper.highLightElement(driver, post_Date);
	    String postSeenDate = post_Date.getText();
	    Reporter.log("<B><font color = 'blue'> ==> -</font> Post Date in AdDetails Page= " +  postSeenDate);
	    
	    driver.close();
		
	    driver.switchTo().window(parent);
	    
	    helper.getPostDate(postSeenDate, imageDate);
		}
		catch (Exception e) {
	    	 Reporter.log("<B><font color = 'red'> ==> -</font> Oops! Looks like we don't have data for this search criteria yet.");
		}
		
		Reporter.log("");
		Reporter.log("<B><font color = 'Blue-Violet'> 6th Ad-</font> ");
		
		try {
		helper.Scrollintoview(current_date6);
		helper.waitFor(current_date6);
		helper.highLightElement(driver, current_date6);
		String imageDate = current_date6.getText();
		helper.jsCLick(current_date6);
		Reporter.log("<B><font color = 'blue'> ==> -</font> Clicked On Current Image Date = " + imageDate);

		helper.Scrollintoview(showAnalytics_Button6);
		helper.waitFor(showAnalytics_Button6);
		helper.highLightElement(driver, showAnalytics_Button6);
		String linkText1 = showAnalytics_Button6.getAttribute("href");
		helper.getAdID(linkText1);
		helper.jsCLick(showAnalytics_Button6);
		Reporter.log("<B><font color = 'blue'> ==> -</font> Clicked On ShowAnalytics Button.");

		Set<String> S1=driver.getWindowHandles();
	    Iterator<String>it=S1.iterator();
	    String parent=it.next();
	    String child=it.next();
	    
	    driver.switchTo().window(child);
	    
	    helper.waitForPageToLoad();
	    helper.waitFor(Last_Seen_childWindow);
	    helper.highLightElement(driver, Last_Seen_childWindow);
	    String lastSeenDate = Last_Seen_childWindow.getText();
	    Reporter.log("<B><font color = 'blue'> ==> -</font> LastScene_date AdDetails Page= " +  lastSeenDate);
		
	    helper.waitForPageToLoad();
	    helper.waitFor(post_Date);
	    helper.highLightElement(driver, post_Date);
	    String postSeenDate = post_Date.getText();
	    Reporter.log("<B><font color = 'blue'> ==> -</font> Post Date in AdDetails Page= " +  postSeenDate);
	    
	    driver.close();
		
	    driver.switchTo().window(parent);
	    
	    helper.getPostDate(postSeenDate, imageDate);
		}
		catch (Exception e) {
	    	 Reporter.log("<B><font color = 'red'> ==> -</font> Oops! Looks like we don't have data for this search criteria yet.");
		}
		
		Reporter.log("");
		Reporter.log("<B><font color = 'Blue-Violet'> 7th Ad-</font> ");
		
		try {
		helper.Scrollintoview(current_date7);
		helper.waitFor(current_date7);
		helper.highLightElement(driver, current_date7);
		String imageDate = current_date7.getText();
		helper.jsCLick(current_date7);
		Reporter.log("<B><font color = 'blue'> ==> -</font> Clicked On Current Image Date = " + imageDate);

		helper.Scrollintoview(showAnalytics_Button7);
		helper.waitFor(showAnalytics_Button7);
		helper.highLightElement(driver, showAnalytics_Button7);
		String linkText1 = showAnalytics_Button7.getAttribute("href");
		helper.getAdID(linkText1);
		helper.jsCLick(showAnalytics_Button7);
		Reporter.log("<B><font color = 'blue'> ==> -</font> Clicked On ShowAnalytics Button.");

		Set<String> S1=driver.getWindowHandles();
	    Iterator<String>it=S1.iterator();
	    String parent=it.next();
	    String child=it.next();
	    
	    driver.switchTo().window(child);
	    
	    helper.waitForPageToLoad();
	    helper.waitFor(Last_Seen_childWindow);
	    helper.highLightElement(driver, Last_Seen_childWindow);
	    String lastSeenDate = Last_Seen_childWindow.getText();
	    Reporter.log("<B><font color = 'blue'> ==> -</font> LastScene_date AdDetails Page= " +  lastSeenDate);
		
	    helper.waitForPageToLoad();
	    helper.waitFor(post_Date);
	    helper.highLightElement(driver, post_Date);
	    String postSeenDate = post_Date.getText();
	    Reporter.log("<B><font color = 'blue'> ==> -</font> Post Date in AdDetails Page= " +  postSeenDate);
	    
	    driver.close();
		
	    driver.switchTo().window(parent);
	    
	    helper.getPostDate(postSeenDate, imageDate);
		}
		catch (Exception e) {
	    	 Reporter.log("<B><font color = 'red'> ==> -</font> Oops! Looks like we don't have data for this search criteria yet.");
		}
		
		Reporter.log("");
		Reporter.log("<B><font color = 'Blue-Violet'> 8th Ad-</font> ");
		
		try {
		helper.Scrollintoview(current_date8);
		helper.waitFor(current_date8);
		helper.highLightElement(driver, current_date8);
		String imageDate = current_date8.getText();
		helper.jsCLick(current_date8);
		Reporter.log("<B><font color = 'blue'> ==> -</font> Clicked On Current Image Date = " + imageDate);

		helper.Scrollintoview(showAnalytics_Button8);
		helper.waitFor(showAnalytics_Button8);
		helper.highLightElement(driver, showAnalytics_Button8);
		String linkText1 = showAnalytics_Button8.getAttribute("href");
		helper.getAdID(linkText1);
		helper.jsCLick(showAnalytics_Button8);
		Reporter.log("<B><font color = 'blue'> ==> -</font> Clicked On ShowAnalytics Button.");

		Set<String> S1=driver.getWindowHandles();
	    Iterator<String>it=S1.iterator();
	    String parent=it.next();
	    String child=it.next();
	    
	    driver.switchTo().window(child);
	    
	    helper.waitForPageToLoad();
	    helper.waitFor(Last_Seen_childWindow);
	    helper.highLightElement(driver, Last_Seen_childWindow);
	    String lastSeenDate = Last_Seen_childWindow.getText();
	    Reporter.log("<B><font color = 'blue'> ==> -</font> LastScene_date AdDetails Page= " +  lastSeenDate);
		
	    helper.waitForPageToLoad();
	    helper.waitFor(post_Date);
	    helper.highLightElement(driver, post_Date);
	    String postSeenDate = post_Date.getText();
	    Reporter.log("<B><font color = 'blue'> ==> -</font> Post Date in AdDetails Page= " +  postSeenDate);
	    
	    driver.close();
		
	    driver.switchTo().window(parent);
	    
	    helper.getPostDate(postSeenDate, imageDate);
		}
		catch (Exception e) {
	    	 Reporter.log("<B><font color = 'red'> ==> -</font> Oops! Looks like we don't have data for this search criteria yet.");
		}
		
		Reporter.log("");
		Reporter.log("<B><font color = 'Blue-Violet'> 9th Ad-</font> ");
		
		try {
		helper.Scrollintoview(current_date9);
		helper.waitFor(current_date9);
		helper.highLightElement(driver, current_date9);
		String imageDate = current_date9.getText();
		helper.jsCLick(current_date9);
		Reporter.log("<B><font color = 'blue'> ==> -</font> Clicked On Current Image Date = " + imageDate);

		helper.Scrollintoview(showAnalytics_Button9);
		helper.waitFor(showAnalytics_Button9);
		helper.highLightElement(driver, showAnalytics_Button9);
		String linkText1 = showAnalytics_Button9.getAttribute("href");
		helper.getAdID(linkText1);
		helper.jsCLick(showAnalytics_Button9);
		Reporter.log("<B><font color = 'blue'> ==> -</font> Clicked On ShowAnalytics Button.");

		Set<String> S1=driver.getWindowHandles();
	    Iterator<String>it=S1.iterator();
	    String parent=it.next();
	    String child=it.next();
	    
	    driver.switchTo().window(child);
	    
	    helper.waitForPageToLoad();
	    helper.waitFor(Last_Seen_childWindow);
	    helper.highLightElement(driver, Last_Seen_childWindow);
	    String lastSeenDate = Last_Seen_childWindow.getText();
	    Reporter.log("<B><font color = 'blue'> ==> -</font> LastScene_date AdDetails Page= " +  lastSeenDate);
		
	    helper.waitForPageToLoad();
	    helper.waitFor(post_Date);
	    helper.highLightElement(driver, post_Date);
	    String postSeenDate = post_Date.getText();
	    Reporter.log("<B><font color = 'blue'> ==> -</font> Post Date in AdDetails Page= " +  postSeenDate);
	    
	    driver.close();
		
	    driver.switchTo().window(parent);
	    
	    helper.getPostDate(postSeenDate, imageDate);
		}
		catch (Exception e) {
	    	 Reporter.log("<B><font color = 'red'> ==> -</font> Oops! Looks like we don't have data for this search criteria yet.");
		}
		
		Reporter.log("");
		Reporter.log("<B><font color = 'Blue-Violet'> 10th Ad-</font> ");
		
		try {
		helper.Scrollintoview(current_date10);
		helper.waitFor(current_date10);
		helper.highLightElement(driver, current_date10);
		String imageDate = current_date10.getText();
		helper.jsCLick(current_date10);
		Reporter.log("<B><font color = 'blue'> ==> -</font> Clicked On Current Image Date = " + imageDate);

		helper.Scrollintoview(showAnalytics_Button10);
		helper.waitFor(showAnalytics_Button10);
		helper.highLightElement(driver, showAnalytics_Button10);
		String linkText1 = showAnalytics_Button10.getAttribute("href");
		helper.getAdID(linkText1);
		helper.jsCLick(showAnalytics_Button10);
		Reporter.log("<B><font color = 'blue'> ==> -</font> Clicked On ShowAnalytics Button.");

		Set<String> S1=driver.getWindowHandles();
	    Iterator<String>it=S1.iterator();
	    String parent=it.next();
	    String child=it.next();
	    
	    driver.switchTo().window(child);
	    
	    helper.waitForPageToLoad();
	    helper.waitFor(Last_Seen_childWindow);
	    helper.highLightElement(driver, Last_Seen_childWindow);
	    String lastSeenDate = Last_Seen_childWindow.getText();
	    Reporter.log("<B><font color = 'blue'> ==> -</font> LastScene_date AdDetails Page= " +  lastSeenDate);
		
	    helper.waitForPageToLoad();
	    helper.waitFor(post_Date);
	    helper.highLightElement(driver, post_Date);
	    String postSeenDate = post_Date.getText();
	    Reporter.log("<B><font color = 'blue'> ==> -</font> Post Date in AdDetails Page= " +  postSeenDate);
	    
	    driver.close();
		
	    driver.switchTo().window(parent);
	    
	    helper.getPostDate(postSeenDate, imageDate);
		}
		catch (Exception e) {
	    	 Reporter.log("<B><font color = 'red'> ==> -</font> Oops! Looks like we don't have data for this search criteria yet.");
		}
		
		Reporter.log("");
		Reporter.log("<B><font color = 'Blue-Violet'> 11th Ad-</font> ");
		
		try {
		helper.Scrollintoview(current_date11);
		helper.waitFor(current_date11);
		helper.highLightElement(driver, current_date11);
		String imageDate = current_date11.getText();
		helper.jsCLick(current_date11);
		Reporter.log("<B><font color = 'blue'> ==> -</font> Clicked On Current Image Date = " + imageDate);

		helper.Scrollintoview(showAnalytics_Button11);
		helper.waitFor(showAnalytics_Button11);
		helper.highLightElement(driver, showAnalytics_Button11);
		String linkText1 = showAnalytics_Button11.getAttribute("href");
		helper.getAdID(linkText1);
		helper.jsCLick(showAnalytics_Button11);
		Reporter.log("<B><font color = 'blue'> ==> -</font> Clicked On ShowAnalytics Button.");

		Set<String> S1=driver.getWindowHandles();
	    Iterator<String>it=S1.iterator();
	    String parent=it.next();
	    String child=it.next();
	    
	    driver.switchTo().window(child);
	    
	    helper.waitForPageToLoad();
	    helper.waitFor(Last_Seen_childWindow);
	    helper.highLightElement(driver, Last_Seen_childWindow);
	    String lastSeenDate = Last_Seen_childWindow.getText();
	    Reporter.log("<B><font color = 'blue'> ==> -</font> LastScene_date AdDetails Page= " +  lastSeenDate);
		
	    helper.waitForPageToLoad();
	    helper.waitFor(post_Date);
	    helper.highLightElement(driver, post_Date);
	    String postSeenDate = post_Date.getText();
	    Reporter.log("<B><font color = 'blue'> ==> -</font> Post Date in AdDetails Page= " +  postSeenDate);
	    
	    driver.close();
		
	    driver.switchTo().window(parent);
	    
	    helper.getPostDate(postSeenDate, imageDate);
		}
		catch (Exception e) {
	    	 Reporter.log("<B><font color = 'red'> ==> -</font> Oops! Looks like we don't have data for this search criteria yet.");
		}
		
		Reporter.log("");
		Reporter.log("<B><font color = 'Blue-Violet'> 12th Ad-</font> ");
		
		try {
		helper.Scrollintoview(current_date12);
		helper.waitFor(current_date12);
		helper.highLightElement(driver, current_date12);
		String imageDate = current_date12.getText();
		helper.jsCLick(current_date12);
		Reporter.log("<B><font color = 'blue'> ==> -</font> Clicked On Current Image Date = " + imageDate);

		helper.Scrollintoview(showAnalytics_Button12);
		helper.waitFor(showAnalytics_Button12);
		helper.highLightElement(driver, showAnalytics_Button12);
		String linkText1 = showAnalytics_Button12.getAttribute("href");
		helper.getAdID(linkText1);
		helper.jsCLick(showAnalytics_Button12);
		Reporter.log("<B><font color = 'blue'> ==> -</font> Clicked On ShowAnalytics Button.");

		Set<String> S1=driver.getWindowHandles();
	    Iterator<String>it=S1.iterator();
	    String parent=it.next();
	    String child=it.next();
	    
	    driver.switchTo().window(child);
	    
	    helper.waitForPageToLoad();
	    helper.waitFor(Last_Seen_childWindow);
	    helper.highLightElement(driver, Last_Seen_childWindow);
	    String lastSeenDate = Last_Seen_childWindow.getText();
	    Reporter.log("<B><font color = 'blue'> ==> -</font> LastScene_date AdDetails Page= " +  lastSeenDate);
		
	    helper.waitForPageToLoad();
	    helper.waitFor(post_Date);
	    helper.highLightElement(driver, post_Date);
	    String postSeenDate = post_Date.getText();
	    Reporter.log("<B><font color = 'blue'> ==> -</font> Post Date in AdDetails Page= " +  postSeenDate);
	    
	    driver.close();
		
	    driver.switchTo().window(parent);
	    
	    helper.getPostDate(postSeenDate, imageDate);
		}
		catch (Exception e) {
	    	 Reporter.log("<B><font color = 'red'> ==> -</font> Oops! Looks like we don't have data for this search criteria yet.");
		}
		
		Reporter.log("");
		Reporter.log("<B><font color = 'Blue-Violet'> 13th Ad-</font> ");
		
		try {
		helper.Scrollintoview(current_date13);
		helper.waitFor(current_date13);
		helper.highLightElement(driver, current_date13);
		String imageDate = current_date13.getText();
		helper.jsCLick(current_date13);
		Reporter.log("<B><font color = 'blue'> ==> -</font> Clicked On Current Image Date = " + imageDate);

		helper.Scrollintoview(showAnalytics_Button13);
		helper.waitFor(showAnalytics_Button13);
		helper.highLightElement(driver, showAnalytics_Button13);
		String linkText1 = showAnalytics_Button13.getAttribute("href");
		helper.getAdID(linkText1);
		helper.jsCLick(showAnalytics_Button13);
		Reporter.log("<B><font color = 'blue'> ==> -</font> Clicked On ShowAnalytics Button.");

		Set<String> S1=driver.getWindowHandles();
	    Iterator<String>it=S1.iterator();
	    String parent=it.next();
	    String child=it.next();
	    
	    driver.switchTo().window(child);
	    
	    helper.waitForPageToLoad();
	    helper.waitFor(Last_Seen_childWindow);
	    helper.highLightElement(driver, Last_Seen_childWindow);
	    String lastSeenDate = Last_Seen_childWindow.getText();
	    Reporter.log("<B><font color = 'blue'> ==> -</font> LastScene_date AdDetails Page= " +  lastSeenDate);
		
	    helper.waitForPageToLoad();
	    helper.waitFor(post_Date);
	    helper.highLightElement(driver, post_Date);
	    String postSeenDate = post_Date.getText();
	    Reporter.log("<B><font color = 'blue'> ==> -</font> Post Date in AdDetails Page= " +  postSeenDate);
	    
	    driver.close();
		
	    driver.switchTo().window(parent);
	    
	    helper.getPostDate(postSeenDate, imageDate);
		}
		catch (Exception e) {
	    	 Reporter.log("<B><font color = 'red'> ==> -</font> Oops! Looks like we don't have data for this search criteria yet.");
		}
		
		Reporter.log("");
		Reporter.log("<B><font color = 'Blue-Violet'> 14th Ad-</font> ");
		
		try {
		helper.Scrollintoview(current_date14);
		helper.waitFor(current_date14);
		helper.highLightElement(driver, current_date14);
		String imageDate = current_date14.getText();
		helper.jsCLick(current_date14);
		Reporter.log("<B><font color = 'blue'> ==> -</font> Clicked On Current Image Date = " + imageDate);

		helper.Scrollintoview(showAnalytics_Button14);
		helper.waitFor(showAnalytics_Button14);
		helper.highLightElement(driver, showAnalytics_Button14);
		String linkText1 = showAnalytics_Button14.getAttribute("href");
		helper.getAdID(linkText1);
		helper.jsCLick(showAnalytics_Button14);
		Reporter.log("<B><font color = 'blue'> ==> -</font> Clicked On ShowAnalytics Button.");

		Set<String> S1=driver.getWindowHandles();
	    Iterator<String>it=S1.iterator();
	    String parent=it.next();
	    String child=it.next();
	    
	    driver.switchTo().window(child);
	    
	    helper.waitForPageToLoad();
	    helper.waitFor(Last_Seen_childWindow);
	    helper.highLightElement(driver, Last_Seen_childWindow);
	    String lastSeenDate = Last_Seen_childWindow.getText();
	    Reporter.log("<B><font color = 'blue'> ==> -</font> LastScene_date AdDetails Page= " +  lastSeenDate);
		
	    helper.waitForPageToLoad();
	    helper.waitFor(post_Date);
	    helper.highLightElement(driver, post_Date);
	    String postSeenDate = post_Date.getText();
	    Reporter.log("<B><font color = 'blue'> ==> -</font> Post Date in AdDetails Page= " +  postSeenDate);
	    
	    driver.close();
		
	    driver.switchTo().window(parent);
	    
	    helper.getPostDate(postSeenDate, imageDate);
		}
		catch (Exception e) {
	    	 Reporter.log("<B><font color = 'red'> ==> -</font> Oops! Looks like we don't have data for this search criteria yet.");
		}
		
		Reporter.log("");
		Reporter.log("<B><font color = 'Blue-Violet'> 15th Ad-</font> ");
		
		try {
		helper.Scrollintoview(current_date15);
		helper.waitFor(current_date15);
		helper.highLightElement(driver, current_date15);
		String imageDate = current_date15.getText();
		helper.jsCLick(current_date15);
		Reporter.log("<B><font color = 'blue'> ==> -</font> Clicked On Current Image Date = " + imageDate);

		helper.Scrollintoview(showAnalytics_Button15);
		helper.waitFor(showAnalytics_Button15);
		helper.highLightElement(driver, showAnalytics_Button15);
		String linkText1 = showAnalytics_Button15.getAttribute("href");
		helper.getAdID(linkText1);
		helper.jsCLick(showAnalytics_Button15);
		Reporter.log("<B><font color = 'blue'> ==> -</font> Clicked On ShowAnalytics Button.");

		Set<String> S1=driver.getWindowHandles();
	    Iterator<String>it=S1.iterator();
	    String parent=it.next();
	    String child=it.next();
	    
	    driver.switchTo().window(child);
	    
	    helper.waitForPageToLoad();
	    helper.waitFor(Last_Seen_childWindow);
	    helper.highLightElement(driver, Last_Seen_childWindow);
	    String lastSeenDate = Last_Seen_childWindow.getText();
	    Reporter.log("<B><font color = 'blue'> ==> -</font> LastScene_date AdDetails Page= " +  lastSeenDate);
		
	    helper.waitForPageToLoad();
	    helper.waitFor(post_Date);
	    helper.highLightElement(driver, post_Date);
	    String postSeenDate = post_Date.getText();
	    Reporter.log("<B><font color = 'blue'> ==> -</font> Post Date in AdDetails Page= " +  postSeenDate);
	    
	    driver.close();
		
	    driver.switchTo().window(parent);
	    
	    helper.getPostDate(postSeenDate, imageDate);
		}
		catch (Exception e) {
	    	 Reporter.log("<B><font color = 'red'> ==> -</font> Oops! Looks like we don't have data for this search criteria yet.");
		}
		
		//Last Month
		
		Reporter.log("");
		Reporter.log("<B><font color = 'green'> Post Date Between : Last Month -</font> ");
		
	    helper.waitFor(clearSearchField);
		helper.highLightElement(driver, clearSearchField);
		helper.jsCLick(clearSearchField);
		Reporter.log("<B><font color = 'orange'> Step 1 -</font> Clicked On clear search.");
		
		helper.waitForPageToLoad();
	    helper.waitFor(post_Date_Between_DropDown);
		helper.highLightElement(driver, post_Date_Between_DropDown);
		helper.jsCLick(post_Date_Between_DropDown);
		Reporter.log("<B><font color = 'orange'> Step 2 -</font> Clicked On Post Date Between DropDown.");
		
		helper.waitFor(post_Date_Between_LastMonth);
		helper.highLightElement(driver, post_Date_Between_LastMonth);
		helper.jsCLick(post_Date_Between_LastMonth);
		Reporter.log("<B><font color = 'orange'> Step 3 -</font> Clicked On Post Date Between Last Month.");
		
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
		Reporter.log("<B><font color = 'Blue-Violet'> 1st Ad-</font> ");
		
		try {
		helper.Scrollintoview(current_date1);
		helper.waitFor(current_date1);
		helper.highLightElement(driver, current_date1);
		String imageDate = current_date1.getText();
		helper.jsCLick(current_date1);
		Reporter.log("<B><font color = 'blue'> ==> -</font> Clicked On Current Image Date." + imageDate);

		helper.Scrollintoview(showAnalytics_Button1);
		helper.waitFor(showAnalytics_Button1);
		helper.highLightElement(driver, showAnalytics_Button1);
		String linkText1 = showAnalytics_Button1.getAttribute("href");
		helper.getAdID(linkText1);
		helper.jsCLick(showAnalytics_Button1);
		Reporter.log("<B><font color = 'blue'> ==> -</font> Clicked On ShowAnalytics Button.");

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
	    Reporter.log("<B><font color = 'blue'> ==> -</font> LastScene_date AdDetails Page= " +  lastSeenDate);
		
	    helper.Scrollintoview(post_Date);
	    helper.waitFor(post_Date);
	    helper.highLightElement(driver, post_Date);
	    String postSeenDate = post_Date.getText();
	    Reporter.log("<B><font color = 'blue'> ==> -</font> Post Date in AdDetails Page= " +  postSeenDate);
	    
	    driver.close();
		
	    driver.switchTo().window(parent);
	    
	    helper.getPostDate(postSeenDate, imageDate);
		}
		catch (Exception e) {
	    	 Reporter.log("<B><font color = 'red'> ==> -</font> Oops! Looks like we don't have data for this search criteria yet.");
		}
		
		Reporter.log("");
		Reporter.log("<B><font color = 'Blue-Violet'> 2nd Ad-</font> ");
		
		try {
		helper.Scrollintoview(current_date2);
		helper.waitFor(current_date2);
		helper.highLightElement(driver, current_date2);
		String imageDate = current_date2.getText();
		helper.jsCLick(current_date2);
		Reporter.log("<B><font color = 'blue'> ==> -</font> Clicked On Current Image Date." + imageDate);

		helper.Scrollintoview(showAnalytics_Button2);
		helper.waitFor(showAnalytics_Button2);
		helper.highLightElement(driver, showAnalytics_Button2);
		String linkText1 = showAnalytics_Button2.getAttribute("href");
		helper.getAdID(linkText1);
		helper.jsCLick(showAnalytics_Button2);
		Reporter.log("<B><font color = 'blue'> ==> -</font> Clicked On ShowAnalytics Button.");

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
	    Reporter.log("<B><font color = 'blue'> ==> -</font> LastScene_date AdDetails Page= " +  lastSeenDate);
		
	    helper.Scrollintoview(post_Date);
	    helper.waitFor(post_Date);
	    helper.highLightElement(driver, post_Date);
	    String postSeenDate = post_Date.getText();
	    Reporter.log("<B><font color = 'blue'> ==> -</font> Post Date in AdDetails Page= " +  postSeenDate);
	    
	    driver.close();
		
	    driver.switchTo().window(parent);
	    
	    helper.getPostDate(postSeenDate, imageDate);
		}
		catch (Exception e) {
	    	 Reporter.log("<B><font color = 'red'> ==> -</font> Oops! Looks like we don't have data for this search criteria yet.");
		}
		
		Reporter.log("");
		Reporter.log("<B><font color = 'Blue-Violet'> 3rd Ad-</font> ");
		
		try {
		helper.Scrollintoview(current_date3);
		helper.waitFor(current_date3);
		helper.highLightElement(driver, current_date3);
		String imageDate = current_date3.getText();
		helper.jsCLick(current_date3);
		Reporter.log("<B><font color = 'blue'> ==> -</font> Clicked On Current Image Date." + imageDate);

		helper.Scrollintoview(showAnalytics_Button3);
		helper.waitFor(showAnalytics_Button3);
		helper.highLightElement(driver, showAnalytics_Button3);
		String linkText1 = showAnalytics_Button3.getAttribute("href");
		helper.getAdID(linkText1);
		helper.jsCLick(showAnalytics_Button3);
		Reporter.log("<B><font color = 'blue'> ==> -</font> Clicked On ShowAnalytics Button.");

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
	    Reporter.log("<B><font color = 'blue'> ==> -</font> LastScene_date AdDetails Page= " +  lastSeenDate);
		
	    helper.Scrollintoview(post_Date);
	    helper.waitFor(post_Date);
	    helper.highLightElement(driver, post_Date);
	    String postSeenDate = post_Date.getText();
	    Reporter.log("<B><font color = 'blue'> ==> -</font> Post Date in AdDetails Page= " +  postSeenDate);
	    
	    driver.close();
		
	    driver.switchTo().window(parent);
	    
	    helper.getPostDate(postSeenDate, imageDate);
		}
		catch (Exception e) {
	    	 Reporter.log("<B><font color = 'red'> ==> -</font> Oops! Looks like we don't have data for this search criteria yet.");
		}
		
		Reporter.log("");
		Reporter.log("<B><font color = 'Blue-Violet'> 4th Ad-</font> ");
		
		try {
		helper.Scrollintoview(current_date4);
		helper.waitFor(current_date4);
		helper.highLightElement(driver, current_date4);
		String imageDate = current_date4.getText();
		helper.jsCLick(current_date4);
		Reporter.log("<B><font color = 'blue'> ==> -</font> Clicked On Current Image Date." + imageDate);

		helper.Scrollintoview(showAnalytics_Button4);
		helper.waitFor(showAnalytics_Button4);
		helper.highLightElement(driver, showAnalytics_Button4);
		String linkText1 = showAnalytics_Button4.getAttribute("href");
		helper.getAdID(linkText1);
		helper.jsCLick(showAnalytics_Button4);
		Reporter.log("<B><font color = 'blue'> ==> -</font> Clicked On ShowAnalytics Button.");

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
	    Reporter.log("<B><font color = 'blue'> ==> -</font> LastScene_date AdDetails Page= " +  lastSeenDate);
		
	    helper.Scrollintoview(post_Date);
	    helper.waitFor(post_Date);
	    helper.highLightElement(driver, post_Date);
	    String postSeenDate = post_Date.getText();
	    Reporter.log("<B><font color = 'blue'> ==> -</font> Post Date in AdDetails Page= " +  postSeenDate);
	    
	    driver.close();
		
	    driver.switchTo().window(parent);
	    
	    helper.getPostDate(postSeenDate, imageDate);
		}
		catch (Exception e) {
	    	 Reporter.log("<B><font color = 'red'> ==> -</font> Oops! Looks like we don't have data for this search criteria yet.");
		}
		
		Reporter.log("");
		Reporter.log("<B><font color = 'Blue-Violet'> 5th Ad-</font> ");
		
		try {
		helper.Scrollintoview(current_date5);
		helper.waitFor(current_date5);
		helper.highLightElement(driver, current_date5);
		String imageDate = current_date5.getText();
		helper.jsCLick(current_date5);
		Reporter.log("<B><font color = 'blue'> ==> -</font> Clicked On Current Image Date." + imageDate);

		helper.Scrollintoview(showAnalytics_Button5);
		helper.waitFor(showAnalytics_Button5);
		helper.highLightElement(driver, showAnalytics_Button5);
		String linkText1 = showAnalytics_Button5.getAttribute("href");
		helper.getAdID(linkText1);
		helper.jsCLick(showAnalytics_Button5);
		Reporter.log("<B><font color = 'blue'> ==> -</font> Clicked On ShowAnalytics Button.");

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
	    Reporter.log("<B><font color = 'blue'> ==> -</font> LastScene_date AdDetails Page= " +  lastSeenDate);
		
	    helper.Scrollintoview(post_Date);
	    helper.waitFor(post_Date);
	    helper.highLightElement(driver, post_Date);
	    String postSeenDate = post_Date.getText();
	    Reporter.log("<B><font color = 'blue'> ==> -</font> Post Date in AdDetails Page= " +  postSeenDate);
	    
	    driver.close();
		
	    driver.switchTo().window(parent);
	    
	    helper.getPostDate(postSeenDate, imageDate);
		}
		catch (Exception e) {
	    	 Reporter.log("<B><font color = 'red'> ==> -</font> Oops! Looks like we don't have data for this search criteria yet.");
		}
		
		Reporter.log("");
		Reporter.log("<B><font color = 'Blue-Violet'> 6th Ad-</font> ");
		
		try {
		helper.Scrollintoview(current_date6);
		helper.waitFor(current_date6);
		helper.highLightElement(driver, current_date6);
		String imageDate = current_date6.getText();
		helper.jsCLick(current_date6);
		Reporter.log("<B><font color = 'blue'> ==> -</font> Clicked On Current Image Date." + imageDate);

		helper.Scrollintoview(showAnalytics_Button6);
		helper.waitFor(showAnalytics_Button6);
		helper.highLightElement(driver, showAnalytics_Button6);
		String linkText1 = showAnalytics_Button6.getAttribute("href");
		helper.getAdID(linkText1);
		helper.jsCLick(showAnalytics_Button6);
		Reporter.log("<B><font color = 'blue'> ==> -</font> Clicked On ShowAnalytics Button.");

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
	    Reporter.log("<B><font color = 'blue'> ==> -</font> LastScene_date AdDetails Page= " +  lastSeenDate);
		
	    helper.Scrollintoview(post_Date);
	    helper.waitFor(post_Date);
	    helper.highLightElement(driver, post_Date);
	    String postSeenDate = post_Date.getText();
	    Reporter.log("<B><font color = 'blue'> ==> -</font> Post Date in AdDetails Page= " +  postSeenDate);
	    
	    driver.close();
		
	    driver.switchTo().window(parent);
	    
	    helper.getPostDate(postSeenDate, imageDate);
		}
		catch (Exception e) {
	    	 Reporter.log("<B><font color = 'red'> ==> -</font> Oops! Looks like we don't have data for this search criteria yet.");
		}
		
		Reporter.log("");
		Reporter.log("<B><font color = 'Blue-Violet'> 7th Ad-</font> ");
		
		try {
		helper.Scrollintoview(current_date7);
		helper.waitFor(current_date7);
		helper.highLightElement(driver, current_date7);
		String imageDate = current_date7.getText();
		helper.jsCLick(current_date7);
		Reporter.log("<B><font color = 'blue'> ==> -</font> Clicked On Current Image Date." + imageDate);

		helper.Scrollintoview(showAnalytics_Button7);
		helper.waitFor(showAnalytics_Button7);
		helper.highLightElement(driver, showAnalytics_Button7);
		String linkText1 = showAnalytics_Button7.getAttribute("href");
		helper.getAdID(linkText1);
		helper.jsCLick(showAnalytics_Button7);
		Reporter.log("<B><font color = 'blue'> ==> -</font> Clicked On ShowAnalytics Button.");

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
	    Reporter.log("<B><font color = 'blue'> ==> -</font> LastScene_date AdDetails Page= " +  lastSeenDate);
		
	    helper.Scrollintoview(post_Date);
	    helper.waitFor(post_Date);
	    helper.highLightElement(driver, post_Date);
	    String postSeenDate = post_Date.getText();
	    Reporter.log("<B><font color = 'blue'> ==> -</font> Post Date in AdDetails Page= " +  postSeenDate);
	    
	    driver.close();
		
	    driver.switchTo().window(parent);
	    
	    helper.getPostDate(postSeenDate, imageDate);
		}
		catch (Exception e) {
	    	 Reporter.log("<B><font color = 'red'> ==> -</font> Oops! Looks like we don't have data for this search criteria yet.");
		}
		
		Reporter.log("");
		Reporter.log("<B><font color = 'Blue-Violet'> 8th Ad-</font> ");
		
		try {
		helper.Scrollintoview(current_date8);
		helper.waitFor(current_date8);
		helper.highLightElement(driver, current_date8);
		String imageDate = current_date8.getText();
		helper.jsCLick(current_date8);
		Reporter.log("<B><font color = 'blue'> ==> -</font> Clicked On Current Image Date." + imageDate);

		helper.Scrollintoview(showAnalytics_Button8);
		helper.waitFor(showAnalytics_Button8);
		helper.highLightElement(driver, showAnalytics_Button8);
		String linkText1 = showAnalytics_Button8.getAttribute("href");
		helper.getAdID(linkText1);
		helper.jsCLick(showAnalytics_Button8);
		Reporter.log("<B><font color = 'blue'> ==> -</font> Clicked On ShowAnalytics Button.");

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
	    Reporter.log("<B><font color = 'blue'> ==> -</font> LastScene_date AdDetails Page= " +  lastSeenDate);
		
	    helper.Scrollintoview(post_Date);
	    helper.waitFor(post_Date);
	    helper.highLightElement(driver, post_Date);
	    String postSeenDate = post_Date.getText();
	    Reporter.log("<B><font color = 'blue'> ==> -</font> Post Date in AdDetails Page= " +  postSeenDate);
	    
	    driver.close();
		
	    driver.switchTo().window(parent);
	    
	    helper.getPostDate(postSeenDate, imageDate);
		}
		catch (Exception e) {
	    	 Reporter.log("<B><font color = 'red'> ==> -</font> Oops! Looks like we don't have data for this search criteria yet.");
		}
		
		Reporter.log("");
		Reporter.log("<B><font color = 'Blue-Violet'> 9th Ad-</font> ");
		
		try {
		helper.Scrollintoview(current_date9);
		helper.waitFor(current_date9);
		helper.highLightElement(driver, current_date9);
		String imageDate = current_date9.getText();
		helper.jsCLick(current_date9);
		Reporter.log("<B><font color = 'blue'> ==> -</font> Clicked On Current Image Date." + imageDate);

		helper.Scrollintoview(showAnalytics_Button9);
		helper.waitFor(showAnalytics_Button9);
		helper.highLightElement(driver, showAnalytics_Button9);
		String linkText1 = showAnalytics_Button9.getAttribute("href");
		helper.getAdID(linkText1);
		helper.jsCLick(showAnalytics_Button9);
		Reporter.log("<B><font color = 'blue'> ==> -</font> Clicked On ShowAnalytics Button.");

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
	    Reporter.log("<B><font color = 'blue'> ==> -</font> LastScene_date AdDetails Page= " +  lastSeenDate);
		
	    helper.Scrollintoview(post_Date);
	    helper.waitFor(post_Date);
	    helper.highLightElement(driver, post_Date);
	    String postSeenDate = post_Date.getText();
	    Reporter.log("<B><font color = 'blue'> ==> -</font> Post Date in AdDetails Page= " +  postSeenDate);
	    
	    driver.close();
		
	    driver.switchTo().window(parent);
	    
	    helper.getPostDate(postSeenDate, imageDate);
		}
		catch (Exception e) {
	    	 Reporter.log("<B><font color = 'red'> ==> -</font> Oops! Looks like we don't have data for this search criteria yet.");
		}
		
		Reporter.log("");
		Reporter.log("<B><font color = 'Blue-Violet'> 10th Ad-</font> ");
		
		try {
		helper.Scrollintoview(current_date10);
		helper.waitFor(current_date10);
		helper.highLightElement(driver, current_date10);
		String imageDate = current_date10.getText();
		helper.jsCLick(current_date10);
		Reporter.log("<B><font color = 'blue'> ==> -</font> Clicked On Current Image Date." + imageDate);

		helper.Scrollintoview(showAnalytics_Button10);
		helper.waitFor(showAnalytics_Button10);
		helper.highLightElement(driver, showAnalytics_Button10);
		String linkText1 = showAnalytics_Button10.getAttribute("href");
		helper.getAdID(linkText1);
		helper.jsCLick(showAnalytics_Button10);
		Reporter.log("<B><font color = 'blue'> ==> -</font> Clicked On ShowAnalytics Button.");

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
	    Reporter.log("<B><font color = 'blue'> ==> -</font> LastScene_date AdDetails Page= " +  lastSeenDate);
		
	    helper.Scrollintoview(post_Date);
	    helper.waitFor(post_Date);
	    helper.highLightElement(driver, post_Date);
	    String postSeenDate = post_Date.getText();
	    Reporter.log("<B><font color = 'blue'> ==> -</font> Post Date in AdDetails Page= " +  postSeenDate);
	    
	    driver.close();
		
	    driver.switchTo().window(parent);
	    
	    helper.getPostDate(postSeenDate, imageDate);
		}
		catch (Exception e) {
	    	 Reporter.log("<B><font color = 'red'> ==> -</font> Oops! Looks like we don't have data for this search criteria yet.");
		}
		
		Reporter.log("");
		Reporter.log("<B><font color = 'Blue-Violet'> 11th Ad-</font> ");
		
		try {
		helper.Scrollintoview(current_date11);
		helper.waitFor(current_date11);
		helper.highLightElement(driver, current_date11);
		String imageDate = current_date11.getText();
		helper.jsCLick(current_date11);
		Reporter.log("<B><font color = 'blue'> ==> -</font> Clicked On Current Image Date." + imageDate);

		helper.Scrollintoview(showAnalytics_Button11);
		helper.waitFor(showAnalytics_Button11);
		helper.highLightElement(driver, showAnalytics_Button11);
		String linkText1 = showAnalytics_Button11.getAttribute("href");
		helper.getAdID(linkText1);
		helper.jsCLick(showAnalytics_Button11);
		Reporter.log("<B><font color = 'blue'> ==> -</font> Clicked On ShowAnalytics Button.");

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
	    Reporter.log("<B><font color = 'blue'> ==> -</font> LastScene_date AdDetails Page= " +  lastSeenDate);
		
	    helper.Scrollintoview(post_Date);
	    helper.waitFor(post_Date);
	    helper.highLightElement(driver, post_Date);
	    String postSeenDate = post_Date.getText();
	    Reporter.log("<B><font color = 'blue'> ==> -</font> Post Date in AdDetails Page= " +  postSeenDate);
	    
	    driver.close();
		
	    driver.switchTo().window(parent);
	    
	    helper.getPostDate(postSeenDate, imageDate);
		}
		catch (Exception e) {
	    	 Reporter.log("<B><font color = 'red'> ==> -</font> Oops! Looks like we don't have data for this search criteria yet.");
		}
		
		Reporter.log("");
		Reporter.log("<B><font color = 'Blue-Violet'> 12th Ad-</font> ");
		
		try {
		helper.Scrollintoview(current_date12);
		helper.waitFor(current_date12);
		helper.highLightElement(driver, current_date12);
		String imageDate = current_date12.getText();
		helper.jsCLick(current_date12);
		Reporter.log("<B><font color = 'blue'> ==> -</font> Clicked On Current Image Date." + imageDate);

		helper.Scrollintoview(showAnalytics_Button12);
		helper.waitFor(showAnalytics_Button12);
		helper.highLightElement(driver, showAnalytics_Button12);
		String linkText1 = showAnalytics_Button12.getAttribute("href");
		helper.getAdID(linkText1);
		helper.jsCLick(showAnalytics_Button12);
		Reporter.log("<B><font color = 'blue'> ==> -</font> Clicked On ShowAnalytics Button.");

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
	    Reporter.log("<B><font color = 'blue'> ==> -</font> LastScene_date AdDetails Page= " +  lastSeenDate);
		
	    helper.Scrollintoview(post_Date);
	    helper.waitFor(post_Date);
	    helper.highLightElement(driver, post_Date);
	    String postSeenDate = post_Date.getText();
	    Reporter.log("<B><font color = 'blue'> ==> -</font> Post Date in AdDetails Page= " +  postSeenDate);
	    
	    driver.close();
		
	    driver.switchTo().window(parent);
	    
	    helper.getPostDate(postSeenDate, imageDate);
		}
		catch (Exception e) {
	    	 Reporter.log("<B><font color = 'red'> ==> -</font> Oops! Looks like we don't have data for this search criteria yet.");
		}
		
		Reporter.log("");
		Reporter.log("<B><font color = 'Blue-Violet'> 13th Ad-</font> ");
		
		try {
		helper.Scrollintoview(current_date13);
		helper.waitFor(current_date13);
		helper.highLightElement(driver, current_date13);
		String imageDate = current_date13.getText();
		helper.jsCLick(current_date13);
		Reporter.log("<B><font color = 'blue'> ==> -</font> Clicked On Current Image Date." + imageDate);

		helper.Scrollintoview(showAnalytics_Button13);
		helper.waitFor(showAnalytics_Button13);
		helper.highLightElement(driver, showAnalytics_Button13);
		String linkText1 = showAnalytics_Button13.getAttribute("href");
		helper.getAdID(linkText1);
		helper.jsCLick(showAnalytics_Button13);
		Reporter.log("<B><font color = 'blue'> ==> -</font> Clicked On ShowAnalytics Button.");

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
	    Reporter.log("<B><font color = 'blue'> ==> -</font> LastScene_date AdDetails Page= " +  lastSeenDate);
		
	    helper.Scrollintoview(post_Date);
	    helper.waitFor(post_Date);
	    helper.highLightElement(driver, post_Date);
	    String postSeenDate = post_Date.getText();
	    Reporter.log("<B><font color = 'blue'> ==> -</font> Post Date in AdDetails Page= " +  postSeenDate);
	    
	    driver.close();
		
	    driver.switchTo().window(parent);
	    
	    helper.getPostDate(postSeenDate, imageDate);
		}
		catch (Exception e) {
	    	 Reporter.log("<B><font color = 'red'> ==> -</font> Oops! Looks like we don't have data for this search criteria yet.");
		}
		
		Reporter.log("");
		Reporter.log("<B><font color = 'Blue-Violet'> 14th Ad-</font> ");
		
		try {
		helper.Scrollintoview(current_date14);
		helper.waitFor(current_date14);
		helper.highLightElement(driver, current_date14);
		String imageDate = current_date14.getText();
		helper.jsCLick(current_date14);
		Reporter.log("<B><font color = 'blue'> ==> -</font> Clicked On Current Image Date." + imageDate);

		helper.Scrollintoview(showAnalytics_Button14);
		helper.waitFor(showAnalytics_Button14);
		helper.highLightElement(driver, showAnalytics_Button14);
		String linkText1 = showAnalytics_Button14.getAttribute("href");
		helper.getAdID(linkText1);
		helper.jsCLick(showAnalytics_Button14);
		Reporter.log("<B><font color = 'blue'> ==> -</font> Clicked On ShowAnalytics Button.");

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
	    Reporter.log("<B><font color = 'blue'> ==> -</font> LastScene_date AdDetails Page= " +  lastSeenDate);
		
	    helper.Scrollintoview(post_Date);
	    helper.waitFor(post_Date);
	    helper.highLightElement(driver, post_Date);
	    String postSeenDate = post_Date.getText();
	    Reporter.log("<B><font color = 'blue'> ==> -</font> Post Date in AdDetails Page= " +  postSeenDate);
	    
	    driver.close();
		
	    driver.switchTo().window(parent);
	    
	    helper.getPostDate(postSeenDate, imageDate);
		}
		catch (Exception e) {
	    	 Reporter.log("<B><font color = 'red'> ==> -</font> Oops! Looks like we don't have data for this search criteria yet.");
		}
		
		Reporter.log("");
		Reporter.log("<B><font color = 'Blue-Violet'> 15th Ad-</font> ");
		
		try {
		helper.Scrollintoview(current_date15);
		helper.waitFor(current_date15);
		helper.highLightElement(driver, current_date15);
		String imageDate = current_date15.getText();
		helper.jsCLick(current_date15);
		Reporter.log("<B><font color = 'blue'> ==> -</font> Clicked On Current Image Date." + imageDate);

		helper.Scrollintoview(showAnalytics_Button15);
		helper.waitFor(showAnalytics_Button15);
		helper.highLightElement(driver, showAnalytics_Button15);
		String linkText1 = showAnalytics_Button15.getAttribute("href");
		helper.getAdID(linkText1);
		helper.jsCLick(showAnalytics_Button15);
		Reporter.log("<B><font color = 'blue'> ==> -</font> Clicked On ShowAnalytics Button.");

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
	    Reporter.log("<B><font color = 'blue'> ==> -</font> LastScene_date AdDetails Page= " +  lastSeenDate);
		
	    helper.Scrollintoview(post_Date);
	    helper.waitFor(post_Date);
	    helper.highLightElement(driver, post_Date);
	    String postSeenDate = post_Date.getText();
	    Reporter.log("<B><font color = 'blue'> ==> -</font> Post Date in AdDetails Page= " +  postSeenDate);
	    
	    driver.close();
		
	    driver.switchTo().window(parent);
	    
	    helper.getPostDate(postSeenDate, imageDate);
		}
		catch (Exception e) {
	    	 Reporter.log("<B><font color = 'red'> ==> -</font> Oops! Looks like we don't have data for this search criteria yet.");
		}
	
		//Custom
		
		 Reporter.log("");
		 Reporter.log("<B><font color = 'green'> Ads Seen Between :Custom Range -</font> ");
		  
		    helper.waitFor(clearSearchField);
			helper.highLightElement(driver, clearSearchField);
			helper.jsCLick(clearSearchField);
			Reporter.log("<B><font color = 'orange'> Step 1 -</font> Clicked On clear search.");
			
			helper.waitForPageToLoad();
			helper.waitFor(post_Date_Between_DropDown);
			helper.highLightElement(driver, post_Date_Between_DropDown);
			post_Date_Between_DropDown.click();
			Reporter.log("<B><font color = 'orange'> Step 2 -</font> Clicked On Post Date Between DropDown.");
			
			helper.waitFor(post_Date_Between_Custom);
			helper.highLightElement(driver, post_Date_Between_Custom);
			helper.jsCLick(post_Date_Between_Custom);
			Reporter.log("<B><font color = 'orange'> Step 3 -</font> Clicked On Next Month Button In Calender.");
			helper.waitForPageToLoad();
			
			helper.waitFor(previousMonthButton);
			helper.highLightElement(driver, previousMonthButton);
		//	previousMonthButton.click();
			helper.jsCLick(previousMonthButton);
			Reporter.log("<B><font color = 'orange'> Step 4 -</font> Clicked On Previous Month Button In Calender.");
			
			helper.waitFor(previousMonthButton);
			helper.highLightElement(driver, previousMonthButton);
//			previousMonthButton.click();
			helper.jsCLick(previousMonthButton);
			Reporter.log("<B><font color = 'orange'> Step 5 -</font> Clicked On Previous Month Button In Calender.");
			
			helper.waitFor(previousMonthButton);
			helper.highLightElement(driver, previousMonthButton);
//			previousMonthButton.click();
			helper.jsCLick(previousMonthButton);
			Reporter.log("<B><font color = 'orange'> Step 6 -</font> Clicked On Previous Month Button In Calender.");
			
			helper.waitFor(nextMonthButton);
			helper.highLightElement(driver, nextMonthButton);
//			nextMonthButton.click();
			helper.jsCLick(nextMonthButton);
			Reporter.log("<B><font color = 'orange'> Step 7 -</font> Clicked On Next Month Button In Calender.");
			
			helper.waitFor(custom_startDate);
			helper.highLightElement(driver, custom_startDate);
//			helper.jsCLick(custom_startDate);
			custom_startDate.click();
			Reporter.log("<B><font color = 'orange'> Step 8 -</font> Clicked On custom_startDate in Ads Seen Between.");
			
			helper.waitForPageToLoad();
			helper.Scrollintoview(custom_endDate);
			helper.waitFor(custom_endDate);
			helper.highLightElement(driver, custom_endDate);
			custom_endDate.click();
//			helper.jsCLick(custom_endDate);
			Reporter.log("<B><font color = 'orange'> Step 9 -</font> Clicked On custom_endDate in Ads Seen Between.");
			
			helper.waitForPageToLoad();
			helper.waitFor(search_bar);
			helper.highLightElement(driver, search_bar);
			helper.jsCLick(search_bar);
			Reporter.log("<B><font color = 'orange'> Step 10 -</font> Clicked On Search Bar.");
			helper.waitForPageToLoad();
			
			helper.waitFor(current_Image_Date);
			helper.highLightElement(driver, current_Image_Date);
		//	String imageDate = current_Image_Date.getText();
			helper.jsCLick(current_Image_Date);
			Reporter.log("<B><font color = 'orange'> Step 11 -</font> Clicked On Custom in Post Date Between.");
			
			helper.waitFor(toatal_Count_Ads);
			helper.highLightElement(driver, toatal_Count_Ads);
			helper.jsCLick(toatal_Count_Ads);
			String Total_Ads_Count_Custom=toatal_Count_Ads.getText();
			Reporter.log("<B><font color = 'orange'> Step 12 -</font> Total_Ads_Count_Custom= " + Total_Ads_Count_Custom);
			
			Reporter.log("");
			Reporter.log("<B><font color = 'Blue-Violet'> 1st Ad-</font> ");
			
		    try {
		    helper.Scrollintoview(current_date1);
		    helper.waitFor(current_date1);
			helper.highLightElement(driver, current_date1);
			String imageDate = current_date1.getText();
			System.out.println("current_Date_All : " + imageDate);
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
		    helper.Scrollintoview(Last_Seen_childWindow);
		    helper.waitFor(Last_Seen_childWindow);
		    helper.highLightElement(driver, Last_Seen_childWindow);
		    String lastSeenDate = Last_Seen_childWindow.getText();
		    Reporter.log("<B><font color = 'blue'> ==> -</font> LastScene_date AdDetails Page= " +  lastSeenDate);
		    
		    helper.Scrollintoview(post_Date);
		    helper.waitFor(post_Date);
		    helper.highLightElement(driver, post_Date);
		    String postSeenDate = post_Date.getText();
		    Reporter.log("<B><font color = 'blue'> ==> -</font> Post Date in AdDetails Page= " +  postSeenDate);
		    
		    driver.close();
		    
		    driver.switchTo().window(parent6);
		    
		    helper.getPostDate(postSeenDate, imageDate);
		    }
		    catch(Exception e) {
		    	System.out.println("Oops! Looks like we don't have data for this search criteria yet.");
		    	 Reporter.log("<B><font color = 'red'> ==> -</font> Oops! Looks like we don't have data for this search criteria yet.");
		    }
		    
		    Reporter.log("");
			Reporter.log("<B><font color = 'Blue-Violet'> 2nd Ad-</font> ");
			
		    try {
		    helper.Scrollintoview(current_date2);
		    helper.waitFor(current_date2);
			helper.highLightElement(driver, current_date2);
			String imageDate = current_date2.getText();
			System.out.println("current_Date_All : " + imageDate);
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
		    helper.Scrollintoview(Last_Seen_childWindow);
		    helper.waitFor(Last_Seen_childWindow);
		    helper.highLightElement(driver, Last_Seen_childWindow);
		    String lastSeenDate = Last_Seen_childWindow.getText();
		    Reporter.log("<B><font color = 'blue'> ==> -</font> LastScene_date AdDetails Page= " +  lastSeenDate);
		    
		    helper.Scrollintoview(post_Date);
		    helper.waitFor(post_Date);
		    helper.highLightElement(driver, post_Date);
		    String postSeenDate = post_Date.getText();
		    Reporter.log("<B><font color = 'blue'> ==> -</font> Post Date in AdDetails Page= " +  postSeenDate);
		    
		    driver.close();
		    
		    driver.switchTo().window(parent6);
		    
		    helper.getPostDate(postSeenDate, imageDate);
		    }
		    catch(Exception e) {
		    	System.out.println("Oops! Looks like we don't have data for this search criteria yet.");
		    	 Reporter.log("<B><font color = 'red'> ==> -</font> Oops! Looks like we don't have data for this search criteria yet.");
		    }
		    
		    Reporter.log("");
			Reporter.log("<B><font color = 'Blue-Violet'> 3rd Ad-</font> ");
			
		    try {
		    helper.Scrollintoview(current_date3);
		    helper.waitFor(current_date3);
			helper.highLightElement(driver, current_date3);
			String imageDate = current_date3.getText();
			System.out.println("current_Date_All : " + imageDate);
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
		    helper.Scrollintoview(Last_Seen_childWindow);
		    helper.waitFor(Last_Seen_childWindow);
		    helper.highLightElement(driver, Last_Seen_childWindow);
		    String lastSeenDate = Last_Seen_childWindow.getText();
		    Reporter.log("<B><font color = 'blue'> ==> -</font> LastScene_date AdDetails Page= " +  lastSeenDate);
		    
		    helper.Scrollintoview(post_Date);
		    helper.waitFor(post_Date);
		    helper.highLightElement(driver, post_Date);
		    String postSeenDate = post_Date.getText();
		    Reporter.log("<B><font color = 'blue'> ==> -</font> Post Date in AdDetails Page= " +  postSeenDate);
		    
		    driver.close();
		    
		    driver.switchTo().window(parent6);
		    
		    helper.getPostDate(postSeenDate, imageDate);
		    }
		    catch(Exception e) {
		    	System.out.println("Oops! Looks like we don't have data for this search criteria yet.");
		    	 Reporter.log("<B><font color = 'red'> ==> -</font> Oops! Looks like we don't have data for this search criteria yet.");
		    }
		    
		    Reporter.log("");
			Reporter.log("<B><font color = 'Blue-Violet'> 4th Ad-</font> ");
			
		    try {
		    helper.Scrollintoview(current_date4);
		    helper.waitFor(current_date4);
			helper.highLightElement(driver, current_date4);
			String imageDate = current_date4.getText();
			System.out.println("current_Date_All : " + imageDate);
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
		    helper.Scrollintoview(Last_Seen_childWindow);
		    helper.waitFor(Last_Seen_childWindow);
		    helper.highLightElement(driver, Last_Seen_childWindow);
		    String lastSeenDate = Last_Seen_childWindow.getText();
		    Reporter.log("<B><font color = 'blue'> ==> -</font> LastScene_date AdDetails Page= " +  lastSeenDate);
		    
		    helper.Scrollintoview(post_Date);
		    helper.waitFor(post_Date);
		    helper.highLightElement(driver, post_Date);
		    String postSeenDate = post_Date.getText();
		    Reporter.log("<B><font color = 'blue'> ==> -</font> Post Date in AdDetails Page= " +  postSeenDate);
		    
		    driver.close();
		    
		    driver.switchTo().window(parent6);
		    
		    helper.getPostDate(postSeenDate, imageDate);
		    }
		    catch(Exception e) {
		    	System.out.println("Oops! Looks like we don't have data for this search criteria yet.");
		    	 Reporter.log("<B><font color = 'red'> ==> -</font> Oops! Looks like we don't have data for this search criteria yet.");
		    }
		    
		    Reporter.log("");
			Reporter.log("<B><font color = 'Blue-Violet'> 5th Ad-</font> ");
			
		    try {
		    helper.Scrollintoview(current_date5);
		    helper.waitFor(current_date5);
			helper.highLightElement(driver, current_date5);
			String imageDate = current_date5.getText();
			System.out.println("current_Date_All : " + imageDate);
			Reporter.log("<B><font color = 'blue'> ==> -</font> Clicked On Custom Month Image = " + imageDate);
			
			helper.Scrollintoview(showAnalytics_Button5);
			helper.waitFor(showAnalytics_Button5);
			helper.highLightElement(driver, showAnalytics_Button5);
			String linkText1 = showAnalytics_Button5.getAttribute("href");
			helper.getAdID(linkText1);
			helper.jsCLick(showAnalytics_Button5);
			Reporter.log("<B><font color = 'blue'> ==> -</font> Clicked on showAnalytics Button");
			
			Set<String> S7=driver.getWindowHandles();
		    Iterator<String>it6=S7.iterator();
		    String parent6=it6.next();
		    String child6=it6.next();
		    
		    driver.switchTo().window(child6);
		    
		    helper.waitForPageToLoad();
		    helper.Scrollintoview(Last_Seen_childWindow);
		    helper.waitFor(Last_Seen_childWindow);
		    helper.highLightElement(driver, Last_Seen_childWindow);
		    String lastSeenDate = Last_Seen_childWindow.getText();
		    Reporter.log("<B><font color = 'blue'> ==> -</font> LastScene_date AdDetails Page= " +  lastSeenDate);
		    
		    helper.Scrollintoview(post_Date);
		    helper.waitFor(post_Date);
		    helper.highLightElement(driver, post_Date);
		    String postSeenDate = post_Date.getText();
		    Reporter.log("<B><font color = 'blue'> ==> -</font> Post Date in AdDetails Page= " +  postSeenDate);
		    
		    driver.close();
		    
		    driver.switchTo().window(parent6);
		    
		    helper.getPostDate(postSeenDate, imageDate);
		    }
		    catch(Exception e) {
		    	System.out.println("Oops! Looks like we don't have data for this search criteria yet.");
		    	 Reporter.log("<B><font color = 'red'> ==> -</font> Oops! Looks like we don't have data for this search criteria yet.");
		    }
		    
		    Reporter.log("");
			Reporter.log("<B><font color = 'Blue-Violet'> 6th Ad-</font> ");
			
		    try {
		    helper.Scrollintoview(current_date6);
		    helper.waitFor(current_date6);
			helper.highLightElement(driver, current_date6);
			String imageDate = current_date6.getText();
			System.out.println("current_Date_All : " + imageDate);
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
		    helper.Scrollintoview(Last_Seen_childWindow);
		    helper.waitFor(Last_Seen_childWindow);
		    helper.highLightElement(driver, Last_Seen_childWindow);
		    String lastSeenDate = Last_Seen_childWindow.getText();
		    Reporter.log("<B><font color = 'blue'> ==> -</font> LastScene_date AdDetails Page= " +  lastSeenDate);
		    
		    helper.Scrollintoview(post_Date);
		    helper.waitFor(post_Date);
		    helper.highLightElement(driver, post_Date);
		    String postSeenDate = post_Date.getText();
		    Reporter.log("<B><font color = 'blue'> ==> -</font> Post Date in AdDetails Page= " +  postSeenDate);
		    
		    driver.close();
		    
		    driver.switchTo().window(parent6);
		    
		    helper.getPostDate(postSeenDate, imageDate);
		    }
		    catch(Exception e) {
		    	System.out.println("Oops! Looks like we don't have data for this search criteria yet.");
		    	 Reporter.log("<B><font color = 'red'> ==> -</font> Oops! Looks like we don't have data for this search criteria yet.");
		    }
		    
		    Reporter.log("");
			Reporter.log("<B><font color = 'Blue-Violet'> 7th Ad-</font> ");
			
		    try {
		    helper.Scrollintoview(current_date7);
		    helper.waitFor(current_date7);
			helper.highLightElement(driver, current_date7);
			String imageDate = current_date7.getText();
			System.out.println("current_Date_All : " + imageDate);
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
		    helper.Scrollintoview(Last_Seen_childWindow);
		    helper.waitFor(Last_Seen_childWindow);
		    helper.highLightElement(driver, Last_Seen_childWindow);
		    String lastSeenDate = Last_Seen_childWindow.getText();
		    Reporter.log("<B><font color = 'blue'> ==> -</font> LastScene_date AdDetails Page= " +  lastSeenDate);
		    
		    helper.Scrollintoview(post_Date);
		    helper.waitFor(post_Date);
		    helper.highLightElement(driver, post_Date);
		    String postSeenDate = post_Date.getText();
		    Reporter.log("<B><font color = 'blue'> ==> -</font> Post Date in AdDetails Page= " +  postSeenDate);
		    
		    driver.close();
		    
		    driver.switchTo().window(parent6);
		    
		    helper.getPostDate(postSeenDate, imageDate);
		    }
		    catch(Exception e) {
		    	System.out.println("Oops! Looks like we don't have data for this search criteria yet.");
		    	 Reporter.log("<B><font color = 'red'> ==> -</font> Oops! Looks like we don't have data for this search criteria yet.");
		    }
		    
		    Reporter.log("");
			Reporter.log("<B><font color = 'Blue-Violet'> 8th Ad-</font> ");
			
		    try {
		    helper.Scrollintoview(current_date8);
		    helper.waitFor(current_date8);
			helper.highLightElement(driver, current_date8);
			String imageDate = current_date8.getText();
			System.out.println("current_Date_All : " + imageDate);
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
		    helper.Scrollintoview(Last_Seen_childWindow);
		    helper.waitFor(Last_Seen_childWindow);
		    helper.highLightElement(driver, Last_Seen_childWindow);
		    String lastSeenDate = Last_Seen_childWindow.getText();
		    Reporter.log("<B><font color = 'blue'> ==> -</font> LastScene_date AdDetails Page= " +  lastSeenDate);
		    
		    helper.Scrollintoview(post_Date);
		    helper.waitFor(post_Date);
		    helper.highLightElement(driver, post_Date);
		    String postSeenDate = post_Date.getText();
		    Reporter.log("<B><font color = 'blue'> ==> -</font> Post Date in AdDetails Page= " +  postSeenDate);
		    
		    driver.close();
		    
		    driver.switchTo().window(parent6);
		    
		    helper.getPostDate(postSeenDate, imageDate);
		    }
		    catch(Exception e) {
		    	System.out.println("Oops! Looks like we don't have data for this search criteria yet.");
		    	 Reporter.log("<B><font color = 'red'> ==> -</font> Oops! Looks like we don't have data for this search criteria yet.");
		    }
		    
		    Reporter.log("");
			Reporter.log("<B><font color = 'Blue-Violet'> 9th Ad-</font> ");
			
		    try {
		    helper.Scrollintoview(current_date9);
		    helper.waitFor(current_date9);
			helper.highLightElement(driver, current_date9);
			String imageDate = current_date9.getText();
			System.out.println("current_Date_All : " + imageDate);
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
		    helper.Scrollintoview(Last_Seen_childWindow);
		    helper.waitFor(Last_Seen_childWindow);
		    helper.highLightElement(driver, Last_Seen_childWindow);
		    String lastSeenDate = Last_Seen_childWindow.getText();
		    Reporter.log("<B><font color = 'blue'> ==> -</font> LastScene_date AdDetails Page= " +  lastSeenDate);
		    
		    helper.Scrollintoview(post_Date);
		    helper.waitFor(post_Date);
		    helper.highLightElement(driver, post_Date);
		    String postSeenDate = post_Date.getText();
		    Reporter.log("<B><font color = 'blue'> ==> -</font> Post Date in AdDetails Page= " +  postSeenDate);
		    
		    driver.close();
		    
		    driver.switchTo().window(parent6);
		    
		    helper.getPostDate(postSeenDate, imageDate);
		    }
		    catch(Exception e) {
		    	System.out.println("Oops! Looks like we don't have data for this search criteria yet.");
		    	 Reporter.log("<B><font color = 'red'> ==> -</font> Oops! Looks like we don't have data for this search criteria yet.");
		    }
		    
		    Reporter.log("");
			Reporter.log("<B><font color = 'Blue-Violet'> 10th Ad-</font> ");
			
		    try {
		    helper.Scrollintoview(current_date10);
		    helper.waitFor(current_date10);
			helper.highLightElement(driver, current_date10);
			String imageDate = current_date10.getText();
			System.out.println("current_Date_All : " + imageDate);
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
		    helper.Scrollintoview(Last_Seen_childWindow);
		    helper.waitFor(Last_Seen_childWindow);
		    helper.highLightElement(driver, Last_Seen_childWindow);
		    String lastSeenDate = Last_Seen_childWindow.getText();
		    Reporter.log("<B><font color = 'blue'> ==> -</font> LastScene_date AdDetails Page= " +  lastSeenDate);
		    
		    helper.Scrollintoview(post_Date);
		    helper.waitFor(post_Date);
		    helper.highLightElement(driver, post_Date);
		    String postSeenDate = post_Date.getText();
		    Reporter.log("<B><font color = 'blue'> ==> -</font> Post Date in AdDetails Page= " +  postSeenDate);
		    
		    driver.close();
		    
		    driver.switchTo().window(parent6);
		    
		    helper.getPostDate(postSeenDate, imageDate);
		    }
		    catch(Exception e) {
		    	System.out.println("Oops! Looks like we don't have data for this search criteria yet.");
		    	 Reporter.log("<B><font color = 'red'> ==> -</font> Oops! Looks like we don't have data for this search criteria yet.");
		    }
		    
		    Reporter.log("");
			Reporter.log("<B><font color = 'Blue-Violet'> 11th Ad-</font> ");
			
		    try {
		    helper.Scrollintoview(current_date11);
		    helper.waitFor(current_date11);
			helper.highLightElement(driver, current_date11);
			String imageDate = current_date11.getText();
			System.out.println("current_Date_All : " + imageDate);
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
		    helper.Scrollintoview(Last_Seen_childWindow);
		    helper.waitFor(Last_Seen_childWindow);
		    helper.highLightElement(driver, Last_Seen_childWindow);
		    String lastSeenDate = Last_Seen_childWindow.getText();
		    Reporter.log("<B><font color = 'blue'> ==> -</font> LastScene_date AdDetails Page= " +  lastSeenDate);
		    
		    helper.Scrollintoview(post_Date);
		    helper.waitFor(post_Date);
		    helper.highLightElement(driver, post_Date);
		    String postSeenDate = post_Date.getText();
		    Reporter.log("<B><font color = 'blue'> ==> -</font> Post Date in AdDetails Page= " +  postSeenDate);
		    
		    driver.close();
		    
		    driver.switchTo().window(parent6);
		    
		    helper.getPostDate(postSeenDate, imageDate);
		    }
		    catch(Exception e) {
		    	System.out.println("Oops! Looks like we don't have data for this search criteria yet.");
		    	 Reporter.log("<B><font color = 'red'> ==> -</font> Oops! Looks like we don't have data for this search criteria yet.");
		    }
		    
		    Reporter.log("");
			Reporter.log("<B><font color = 'Blue-Violet'> 12th Ad-</font> ");
			
		    try {
		    helper.Scrollintoview(current_date12);
		    helper.waitFor(current_date12);
			helper.highLightElement(driver, current_date12);
			String imageDate = current_date12.getText();
			System.out.println("current_Date_All : " + imageDate);
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
		    helper.Scrollintoview(Last_Seen_childWindow);
		    helper.waitFor(Last_Seen_childWindow);
		    helper.highLightElement(driver, Last_Seen_childWindow);
		    String lastSeenDate = Last_Seen_childWindow.getText();
		    Reporter.log("<B><font color = 'blue'> ==> -</font> LastScene_date AdDetails Page= " +  lastSeenDate);
		    
		    helper.Scrollintoview(post_Date);
		    helper.waitFor(post_Date);
		    helper.highLightElement(driver, post_Date);
		    String postSeenDate = post_Date.getText();
		    Reporter.log("<B><font color = 'blue'> ==> -</font> Post Date in AdDetails Page= " +  postSeenDate);
		    
		    driver.close();
		    
		    driver.switchTo().window(parent6);
		    
		    helper.getPostDate(postSeenDate, imageDate);
		    }
		    catch(Exception e) {
		    	System.out.println("Oops! Looks like we don't have data for this search criteria yet.");
		    	 Reporter.log("<B><font color = 'red'> ==> -</font> Oops! Looks like we don't have data for this search criteria yet.");
		    }
		    
		    Reporter.log("");
			Reporter.log("<B><font color = 'Blue-Violet'> 13th Ad-</font> ");
			
		    try {
		    helper.Scrollintoview(current_date13);
		    helper.waitFor(current_date13);
			helper.highLightElement(driver, current_date13);
			String imageDate = current_date13.getText();
			System.out.println("current_Date_All : " + imageDate);
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
		    helper.Scrollintoview(Last_Seen_childWindow);
		    helper.waitFor(Last_Seen_childWindow);
		    helper.highLightElement(driver, Last_Seen_childWindow);
		    String lastSeenDate = Last_Seen_childWindow.getText();
		    Reporter.log("<B><font color = 'blue'> ==> -</font> LastScene_date AdDetails Page= " +  lastSeenDate);
		    
		    helper.Scrollintoview(post_Date);
		    helper.waitFor(post_Date);
		    helper.highLightElement(driver, post_Date);
		    String postSeenDate = post_Date.getText();
		    Reporter.log("<B><font color = 'blue'> ==> -</font> Post Date in AdDetails Page= " +  postSeenDate);
		    
		    driver.close();
		    
		    driver.switchTo().window(parent6);
		    
		    helper.getPostDate(postSeenDate, imageDate);
		    }
		    catch(Exception e) {
		    	System.out.println("Oops! Looks like we don't have data for this search criteria yet.");
		    	 Reporter.log("<B><font color = 'red'> ==> -</font> Oops! Looks like we don't have data for this search criteria yet.");
		    }
		    
		    Reporter.log("");
			Reporter.log("<B><font color = 'Blue-Violet'> 14th Ad-</font> ");
			
		    try {
		    helper.Scrollintoview(current_date14);
		    helper.waitFor(current_date14);
			helper.highLightElement(driver, current_date14);
			String imageDate = current_date14.getText();
			System.out.println("current_Date_All : " + imageDate);
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
		    helper.Scrollintoview(Last_Seen_childWindow);
		    helper.waitFor(Last_Seen_childWindow);
		    helper.highLightElement(driver, Last_Seen_childWindow);
		    String lastSeenDate = Last_Seen_childWindow.getText();
		    Reporter.log("<B><font color = 'blue'> ==> -</font> LastScene_date AdDetails Page= " +  lastSeenDate);
		    
		    helper.Scrollintoview(post_Date);
		    helper.waitFor(post_Date);
		    helper.highLightElement(driver, post_Date);
		    String postSeenDate = post_Date.getText();
		    Reporter.log("<B><font color = 'blue'> ==> -</font> Post Date in AdDetails Page= " +  postSeenDate);
		    
		    driver.close();
		    
		    driver.switchTo().window(parent6);
		    
		    helper.getPostDate(postSeenDate, imageDate);
		    }
		    catch(Exception e) {
		    	System.out.println("Oops! Looks like we don't have data for this search criteria yet.");
		    	 Reporter.log("<B><font color = 'red'> ==> -</font> Oops! Looks like we don't have data for this search criteria yet.");
		    }
		    
		    Reporter.log("");
			Reporter.log("<B><font color = 'Blue-Violet'> 15th Ad-</font> ");
			
		    try {
		    helper.Scrollintoview(current_date15);
		    helper.waitFor(current_date15);
			helper.highLightElement(driver, current_date15);
			String imageDate = current_date15.getText();
			System.out.println("current_Date_All : " + imageDate);
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
		    helper.Scrollintoview(Last_Seen_childWindow);
		    helper.waitFor(Last_Seen_childWindow);
		    helper.highLightElement(driver, Last_Seen_childWindow);
		    String lastSeenDate = Last_Seen_childWindow.getText();
		    Reporter.log("<B><font color = 'blue'> ==> -</font> LastScene_date AdDetails Page= " +  lastSeenDate);
		    
		    helper.Scrollintoview(post_Date);
		    helper.waitFor(post_Date);
		    helper.highLightElement(driver, post_Date);
		    String postSeenDate = post_Date.getText();
		    Reporter.log("<B><font color = 'blue'> ==> -</font> Post Date in AdDetails Page= " +  postSeenDate);
		    
		    driver.close();
		    
		    driver.switchTo().window(parent6);
		    
		    helper.getPostDate(postSeenDate, imageDate);
		    }
		    catch(Exception e) {
		    	System.out.println("Oops! Looks like we don't have data for this search criteria yet.");
		    	 Reporter.log("<B><font color = 'red'> ==> -</font> Oops! Looks like we don't have data for this search criteria yet.");
		    }
		    */
		}
	}
