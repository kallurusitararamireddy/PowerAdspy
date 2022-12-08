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

public class InstagramDashBoardSortByPage extends BasePage{
	
	public InstagramDashBoardSortByPage(WebDriver driver) {
		super(TestBase.getDriver());
	}

	Helpers helper=new Helpers();

	@FindBy(xpath = "//img[@class='active_pg_logo img-fluid']")
	WebElement Logo;

	@FindBy(css = "a#insta_ads > img")
	WebElement Instagram;
	
	@FindBy(xpath="//a[@id='clear-filter']")
	WebElement clearSearchField;
	
	@FindBy(xpath="//span[text()='Newest']")
	WebElement sortBy_DropDown;
	
	@FindBy(id="search-ads")
	WebElement search_bar;
	
	@FindBy(id="totaladscount")
	WebElement toatal_Count_Ads;
	
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
	
	@FindBy(xpath="//a[text()='Newest']")
	WebElement newest_Button;
	
	@FindBy(xpath="//div[@id='last_seen1']")
	WebElement Last_Seen_childWindow;
	
	@FindBy(xpath="//a[text()='Last Seen']")
	WebElement lastSeen_Button;
	
	@FindBy(xpath="//div[@class='ad_date']")
	WebElement current_date_lastSeen;
	
	@FindBy(xpath="//a[text()='Running Longest']")
	WebElement runningLongest_Button;
	
	@FindBy(xpath="//div[@class='ad_date']")
	WebElement current_date_runningLongest;
	
	@FindBy(id="days_running1")
	WebElement total_Running_Days;
	
	@FindBy(xpath="//a[text()='Domain Registration Date']")
	WebElement domain_Reg_Date_Button;
	
	@FindBy(id="domain_date")
	WebElement Domain_Rgsd_Date;

	public void verify_Instagram_Dasboard() throws InterruptedException {
		
		Reporter.log("<B><font color = 'Burgundy'> Step1 -</font> Logged into PowerAdSpy Application");
		String Page_titel = driver.getTitle();
		System.out.println(Page_titel);
		Reporter.log("<B><font color = 'Burgundy'> Step2 -</font> I am on the page :" + Page_titel);

	//	helper.waitForPageToLoad();
		helper.waitFor(Logo);
		helper.highLightElement(driver, Logo);
		Assert.assertTrue(Logo.isDisplayed(), "Power Ad Spy Logo is Dispalyed");
		Reporter.log("<B><font color = 'Burgundy'> Step3 -</font> Power Ad Spy Logo is Displayed");
		
		helper.waitFor(Instagram);
		helper.highLightElement(driver, Instagram);
		Instagram.click();
		Assert.assertTrue(Instagram.isDisplayed(), "Clicked on Instagram ");
		Reporter.log("<B><font color = 'Burgundy'> Step4 -</font> Clicked On Instagram Icon");
		//helper.waitForPageToLoad();
		
		String Page_titel_1 = driver.getTitle();
		System.out.println(Page_titel);
		Reporter.log("<B><font color = 'purple'> Step5 -</font> I am on the page :" + Page_titel_1);
		
	
		Reporter.log("");
		Reporter.log("<B><font color = 'green'> Newest field -</font> ");
		
		//newest 
		
		helper.waitFor(clearSearchField);
		helper.highLightElement(driver, clearSearchField);
		helper.jsCLick(clearSearchField);
		Reporter.log("<B><font color = 'orange'> Step 1 -</font> Clicked On clear search.");
		
		helper.waitFor(sortBy_DropDown);
		helper.highLightElement(driver, sortBy_DropDown);
		helper.jsCLick(sortBy_DropDown);
		Reporter.log("<B><font color = 'orange'> Step 2 -</font> Clicked On sortBy.");
		//helper.waitForPageToLoad();
		
		helper.waitFor(newest_Button);
		helper.highLightElement(driver, newest_Button);
		helper.jsCLick(newest_Button);
		Reporter.log("<B><font color = 'orange'> Step 3 -</font> Clicked On Newest button.");
		
		helper.waitFor(search_bar);
		helper.highLightElement(driver, search_bar);
		helper.jsCLick(search_bar);
		Reporter.log("<B><font color = 'orange'> Step 4 -</font> Clicked On Search Bar.");
		
		
		helper.waitFor(toatal_Count_Ads);
		helper.highLightElement(driver, toatal_Count_Ads);
		helper.jsCLick(toatal_Count_Ads);
		String Total_Ads_Count_newest=toatal_Count_Ads.getText();
		Reporter.log("<B><font color = 'orange'> Step 5 -</font> Total_Ads_Count_newest= " + Total_Ads_Count_newest);
		//helper.waitForPageToLoad();
		
		Reporter.log("");
		Reporter.log("<B><font color = 'Blue-Violet'> 1st Ad -</font> ");
		
		helper.Scrollintoview(current_date1);
		helper.waitFor(current_date1);
		try {
		helper.highLightElement(driver, current_date1);
		String imageDate=current_date1.getText();
		System.out.println("currentDatenewest : " + imageDate);
		Reporter.log("<B><font color = 'blue'> ==> -</font> CurrentDatenewest Image in Instagram DashBoard= " + imageDate);
		
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
		
		Set<String> S1=driver.getWindowHandles();
	    Iterator<String>it=S1.iterator();
	    String parent=it.next();
	    String child=it.next();
	    
	    driver.switchTo().window(child);
	   
	    helper.waitForPageToLoad();
	    helper.waitFor(Last_Seen_childWindow);
	    helper.highLightElement(driver, Last_Seen_childWindow);
	    String lastSeenDate = Last_Seen_childWindow.getText();
	    System.out.println("Last_Seen_childWindow : " + lastSeenDate);
	    Reporter.log("<B><font color = 'blue'> ==> -</font> LastScene_date AdDetails Page= " +  lastSeenDate);
	    
	    driver.close();
	    
	    driver.switchTo().window(parent);
	    
		String joinString = null;
		//	String[] actualDate = null;
			
			String[] splitString = lastSeenDate.split(" ");
			for(int i=0;i<splitString.length-2;i++) {
				String actualDate=splitString[i]; 
				joinString= splitString[i+1]+" "+ splitString[i]+" " + splitString[i+2];
			//	System.out.println("splitString : " + splitString[i]);				System.out.println("lastseen Date in Newest: " + joinString);
			}
		//	System.out.println("lastseen Date in Newest: " + joinString);
		Assert.assertEquals(imageDate, joinString);
		Reporter.log("<B><font color = 'blue'> ==> -</font> Image Date = "+" "+imageDate+"    ::    " + "Last Seeen Date = "+joinString+" "+" are same == PASS");

		}
		catch(Exception e) {
			 Reporter.log("<B><font color = 'orange'> Step 6 -</font> Oops! Looks like we don't have data for this search criteria yet.");
		}
	    
		Reporter.log("");
		Reporter.log("<B><font color = 'Blue-Violet'> 2st Ad -</font> ");
		
		helper.Scrollintoview(current_date2);
		helper.waitFor(current_date2);
		try {
		helper.highLightElement(driver, current_date2);
		String imageDate=current_date2.getText();
		System.out.println("currentDatenewest : " + imageDate);
		Reporter.log("<B><font color = 'blue'> ==> -</font> CurrentDatenewest Image in Instagram DashBoard= " + imageDate);
		
		helper.Scrollintoview(showAnalytics_Button2);
		helper.waitFor(showAnalytics_Button2);
		helper.highLightElement(driver, showAnalytics_Button2);
		String linkText = showAnalytics_Button2.getAttribute("href");
		System.out.println("linkText : " + linkText);
		
		String idString = null;
			
			String[] splitStringid = linkText.split("/");
			for(int i=0;i<splitStringid.length;i++) {
				String actualDate=splitStringid[splitStringid.length-1]; 
				System.out.println("actualDate : " + actualDate);
				Reporter.log("<B><font color = 'blue'> ==> -</font> ID of the 2nd Ad = " + actualDate);
				break;
			}
			
		helper.jsCLick(showAnalytics_Button2);
		Reporter.log("<B><font color = 'blue'> ==> -</font> Clicked on showAnalytics Button");
		
		Set<String> S1=driver.getWindowHandles();
	    Iterator<String>it=S1.iterator();
	    String parent=it.next();
	    String child=it.next();
	    
	    driver.switchTo().window(child);
	   
	    helper.waitForPageToLoad();
	    helper.waitFor(Last_Seen_childWindow);
	    helper.highLightElement(driver, Last_Seen_childWindow);
	    String lastSeenDate = Last_Seen_childWindow.getText();
	    System.out.println("Last_Seen_childWindow : " + lastSeenDate);
	    Reporter.log("<B><font color = 'blue'> ==> -</font> LastScene_date AdDetails Page= " +  lastSeenDate);
	    
	    driver.close();
	    
	    driver.switchTo().window(parent);
	    
		String joinString = null;
		//	String[] actualDate = null;
			
			String[] splitString = lastSeenDate.split(" ");
			for(int i=0;i<splitString.length-2;i++) {
				String actualDate=splitString[i]; 
				joinString= splitString[i+1]+" "+ splitString[i]+" " + splitString[i+2];
			//	System.out.println("splitString : " + splitString[i]);				System.out.println("lastseen Date in Newest: " + joinString);
			}
		//	System.out.println("lastseen Date in Newest: " + joinString);
		Assert.assertEquals(imageDate, joinString);
		Reporter.log("<B><font color = 'blue'> ==> -</font> Image Date = "+" "+imageDate+"    ::    " + "Last Seeen Date = "+joinString+" "+" are same == PASS");

		}
		catch(Exception e) {
			 Reporter.log("<B><font color = 'orange'> Step 6 -</font> Oops! Looks like we don't have data for this search criteria yet.");
		}
		
		Reporter.log("");
		Reporter.log("<B><font color = 'Blue-Violet'> 3th Ad -</font> ");
		
		helper.Scrollintoview(current_date3);
		helper.waitFor(current_date3);
		try {
		helper.highLightElement(driver, current_date3);
		String imageDate=current_date3.getText();
		System.out.println("currentDatenewest : " + imageDate);
		Reporter.log("<B><font color = 'blue'> ==> -</font> CurrentDatenewest Image in Instagram DashBoard= " + imageDate);
		
		helper.Scrollintoview(showAnalytics_Button3);
		helper.waitFor(showAnalytics_Button3);
		helper.highLightElement(driver, showAnalytics_Button3);
		
		String linkText = showAnalytics_Button3.getAttribute("href");
		System.out.println("linkText : " + linkText);
		
		String idString = null;
			
			String[] splitStringid = linkText.split("/");
			for(int i=0;i<splitStringid.length;i++) {
				String actualDate=splitStringid[splitStringid.length-1]; 
				System.out.println("actualDate : " + actualDate);
				Reporter.log("<B><font color = 'blue'> ==> -</font> ID of the 1st Ad = " + actualDate);
				break;
			}
			
		helper.jsCLick(showAnalytics_Button3);
		Reporter.log("<B><font color = 'blue'> ==> -</font> Clicked on showAnalytics Button");
		
		Set<String> S1=driver.getWindowHandles();
	    Iterator<String>it=S1.iterator();
	    String parent=it.next();
	    String child=it.next();
	    
	    driver.switchTo().window(child);
	   
	    helper.waitForPageToLoad();
	    helper.waitFor(Last_Seen_childWindow);
	    helper.highLightElement(driver, Last_Seen_childWindow);
	    String lastSeenDate = Last_Seen_childWindow.getText();
	    System.out.println("Last_Seen_childWindow : " + lastSeenDate);
	    Reporter.log("<B><font color = 'blue'> ==> -</font> LastScene_date AdDetails Page= " +  lastSeenDate);
	    
	    driver.close();
	    
	    driver.switchTo().window(parent);
	    
		String joinString = null;
		//	String[] actualDate = null;
			
			String[] splitString = lastSeenDate.split(" ");
			for(int i=0;i<splitString.length-2;i++) {
				String actualDate=splitString[i]; 
				joinString= splitString[i+1]+" "+ splitString[i]+" " + splitString[i+2];
			//	System.out.println("splitString : " + splitString[i]);				System.out.println("lastseen Date in Newest: " + joinString);
			}
		//	System.out.println("lastseen Date in Newest: " + joinString);
		Assert.assertEquals(imageDate, joinString);
		Reporter.log("<B><font color = 'blue'> ==> -</font> Image Date = "+" "+imageDate+"    ::    " + "Last Seeen Date = "+joinString+" "+" are same == PASS");

		}
		catch(Exception e) {
			 Reporter.log("<B><font color = 'orange'> Step 6 -</font> Oops! Looks like we don't have data for this search criteria yet.");
		}
		
		Reporter.log("");
		Reporter.log("<B><font color = 'Blue-Violet'> 4th Ad -</font> ");
		
		helper.Scrollintoview(current_date4);
		helper.waitFor(current_date4);
		try {
		helper.highLightElement(driver, current_date4);
		String imageDate=current_date4.getText();
		System.out.println("currentDatenewest : " + imageDate);
		Reporter.log("<B><font color = 'blue'> ==> -</font> CurrentDatenewest Image in Instagram DashBoard= " + imageDate);
		
		helper.Scrollintoview(showAnalytics_Button4);
		helper.waitFor(showAnalytics_Button4);
		helper.highLightElement(driver, showAnalytics_Button4);
		
		String linkText = showAnalytics_Button4.getAttribute("href");
		System.out.println("linkText : " + linkText);
		
		String idString = null;
			
			String[] splitStringid = linkText.split("/");
			for(int i=0;i<splitStringid.length;i++) {
				String actualDate=splitStringid[splitStringid.length-1]; 
				System.out.println("actualDate : " + actualDate);
				Reporter.log("<B><font color = 'blue'> ==> -</font> ID of the 4th Ad = " + actualDate);
				break;
			}
			
		helper.jsCLick(showAnalytics_Button4);
		Reporter.log("<B><font color = 'red'> ==> -</font> Clicked on showAnalytics Button");
		
		Set<String> S1=driver.getWindowHandles();
	    Iterator<String>it=S1.iterator();
	    String parent=it.next();
	    String child=it.next();
	    
	    driver.switchTo().window(child);
	   
	    helper.waitForPageToLoad();
	    helper.waitFor(Last_Seen_childWindow);
	    helper.highLightElement(driver, Last_Seen_childWindow);
	    String lastSeenDate = Last_Seen_childWindow.getText();
	    System.out.println("Last_Seen_childWindow : " + lastSeenDate);
	    Reporter.log("<B><font color = 'blue'> ==> -</font> LastScene_date AdDetails Page= " +  lastSeenDate);
	    
	    driver.close();
	    
	    driver.switchTo().window(parent);
	    
		String joinString = null;
		//	String[] actualDate = null;
			
			String[] splitString = lastSeenDate.split(" ");
			for(int i=0;i<splitString.length-2;i++) {
				String actualDate=splitString[i]; 
				joinString= splitString[i+1]+" "+ splitString[i]+" " + splitString[i+2];
			//	System.out.println("splitString : " + splitString[i]);				System.out.println("lastseen Date in Newest: " + joinString);
			}
		//	System.out.println("lastseen Date in Newest: " + joinString);
		Assert.assertEquals(imageDate, joinString);
		Reporter.log("<B><font color = 'blue'> ==> -</font> Image Date = "+" "+imageDate+"    ::    " + "Last Seeen Date = "+joinString+" "+" are same == PASS");

		}
		catch(Exception e) {
			 Reporter.log("<B><font color = 'orange'> Step 6 -</font> Oops! Looks like we don't have data for this search criteria yet.");
		}
		
		Reporter.log("");
		Reporter.log("<B><font color = 'Blue-Violet'> 5th Ad -</font> ");
		
		helper.Scrollintoview(current_date5);
		helper.waitFor(current_date5);
		try {
		helper.highLightElement(driver, current_date5);
		String imageDate=current_date5.getText();
		System.out.println("currentDatenewest : " + imageDate);
		Reporter.log("<B><font color = 'blue'> ==> -</font> CurrentDatenewest Image in Instagram DashBoard= " + imageDate);
		
		helper.Scrollintoview(showAnalytics_Button5);
		helper.waitFor(showAnalytics_Button5);
		helper.highLightElement(driver, showAnalytics_Button5);
		
		String linkText = showAnalytics_Button5.getAttribute("href");
		System.out.println("linkText : " + linkText);
		
		String idString = null;
			
			String[] splitStringid = linkText.split("/");
			for(int i=0;i<splitStringid.length;i++) {
				String actualDate=splitStringid[splitStringid.length-1]; 
				System.out.println("actualDate : " + actualDate);
				Reporter.log("<B><font color = 'blue'> ==> -</font> ID of the 5th Ad = " + actualDate);
				break;
			}
			
		helper.jsCLick(showAnalytics_Button5);
		Reporter.log("<B><font color = 'blue'> ==> -</font> Clicked on showAnalytics Button");
		
		Set<String> S1=driver.getWindowHandles();
	    Iterator<String>it=S1.iterator();
	    String parent=it.next();
	    String child=it.next();
	    
	    driver.switchTo().window(child);
	   
	    helper.waitForPageToLoad();
	    helper.waitFor(Last_Seen_childWindow);
	    helper.highLightElement(driver, Last_Seen_childWindow);
	    String lastSeenDate = Last_Seen_childWindow.getText();
	    System.out.println("Last_Seen_childWindow : " + lastSeenDate);
	    Reporter.log("<B><font color = 'blue'> ==> -</font> LastScene_date AdDetails Page= " +  lastSeenDate);
	    
	    driver.close();
	    
	    driver.switchTo().window(parent);
	    
		String joinString = null;
		//	String[] actualDate = null;
			
			String[] splitString = lastSeenDate.split(" ");
			for(int i=0;i<splitString.length-2;i++) {
				String actualDate=splitString[i]; 
				joinString= splitString[i+1]+" "+ splitString[i]+" " + splitString[i+2];
			//	System.out.println("splitString : " + splitString[i]);				System.out.println("lastseen Date in Newest: " + joinString);
			}
		//	System.out.println("lastseen Date in Newest: " + joinString);
		Assert.assertEquals(imageDate, joinString);
		Reporter.log("<B><font color = 'blue'> ==> -</font> Image Date = "+" "+imageDate+"    ::    " + "Last Seeen Date = "+joinString+" "+" are same == PASS");

		}
		catch(Exception e) {
			 Reporter.log("<B><font color = 'orange'> Step 6 -</font> Oops! Looks like we don't have data for this search criteria yet.");
		}
		
		Reporter.log("");
		Reporter.log("<B><font color = 'Blue-Violet'> 6th Ad -</font> ");
		
		helper.Scrollintoview(current_date6);
		helper.waitFor(current_date6);
		try {
		helper.highLightElement(driver, current_date6);
		String imageDate=current_date6.getText();
		System.out.println("currentDatenewest : " + imageDate);
		Reporter.log("<B><font color = 'blue'> ==> -</font> CurrentDatenewest Image in Instagram DashBoard= " + imageDate);
		
		helper.Scrollintoview(showAnalytics_Button6);
		helper.waitFor(showAnalytics_Button6);
		helper.highLightElement(driver, showAnalytics_Button6);
		
		String linkText = showAnalytics_Button6.getAttribute("href");
		System.out.println("linkText : " + linkText);
		
		String idString = null;
			
			String[] splitStringid = linkText.split("/");
			for(int i=0;i<splitStringid.length;i++) {
				String actualDate=splitStringid[splitStringid.length-1]; 
				System.out.println("actualDate : " + actualDate);
				Reporter.log("<B><font color = 'blue'> ==> -</font> ID of the 6th Ad = " + actualDate);
				break;
			}
			
		helper.jsCLick(showAnalytics_Button6);
		Reporter.log("<B><font color = 'blue'> ==> -</font> Clicked on showAnalytics Button");
		
		Set<String> S1=driver.getWindowHandles();
	    Iterator<String>it=S1.iterator();
	    String parent=it.next();
	    String child=it.next();
	    
	    driver.switchTo().window(child);
	   
	    helper.waitForPageToLoad();
	    helper.waitFor(Last_Seen_childWindow);
	    helper.highLightElement(driver, Last_Seen_childWindow);
	    String lastSeenDate = Last_Seen_childWindow.getText();
	    System.out.println("Last_Seen_childWindow : " + lastSeenDate);
	    Reporter.log("<B><font color = 'blue'> ==> -</font> LastScene_date AdDetails Page= " +  lastSeenDate);
	    
	    driver.close();
	    
	    driver.switchTo().window(parent);
	    
		String joinString = null;
		//	String[] actualDate = null;
			
			String[] splitString = lastSeenDate.split(" ");
			for(int i=0;i<splitString.length-2;i++) {
				String actualDate=splitString[i]; 
				joinString= splitString[i+1]+" "+ splitString[i]+" " + splitString[i+2];
			//	System.out.println("splitString : " + splitString[i]);				System.out.println("lastseen Date in Newest: " + joinString);
			}
		//	System.out.println("lastseen Date in Newest: " + joinString);
		Assert.assertEquals(imageDate, joinString);
		Reporter.log("<B><font color = 'blue'> ==> -</font> Image Date = "+" "+imageDate+"    ::    " + "Last Seeen Date = "+joinString+" "+" are same == PASS");

		}
		catch(Exception e) {
			 Reporter.log("<B><font color = 'orange'> Step 6 -</font> Oops! Looks like we don't have data for this search criteria yet.");
		}
		
		Reporter.log("");
		Reporter.log("<B><font color = 'Blue-Violet'> 7th Ad -</font> ");
		
		helper.Scrollintoview(current_date7);
		helper.waitFor(current_date7);
		try {
		helper.highLightElement(driver, current_date7);
		String imageDate=current_date7.getText();
		System.out.println("currentDatenewest : " + imageDate);
		Reporter.log("<B><font color = 'blue'> ==> -</font> CurrentDatenewest Image in Instagram DashBoard= " + imageDate);
		
		helper.Scrollintoview(showAnalytics_Button7);
		helper.waitFor(showAnalytics_Button7);
		helper.highLightElement(driver, showAnalytics_Button7);
		
		String linkText = showAnalytics_Button7.getAttribute("href");
		System.out.println("linkText : " + linkText);
		
		String idString = null;
			
			String[] splitStringid = linkText.split("/");
			for(int i=0;i<splitStringid.length;i++) {
				String actualDate=splitStringid[splitStringid.length-1]; 
				System.out.println("actualDate : " + actualDate);
				Reporter.log("<B><font color = 'blue'> ==> -</font> ID of the 7th Ad = " + actualDate);
				break;
			}
			
		helper.jsCLick(showAnalytics_Button7);
		Reporter.log("<B><font color = 'blue'> ==> -</font> Clicked on showAnalytics Button");
		
		Set<String> S1=driver.getWindowHandles();
	    Iterator<String>it=S1.iterator();
	    String parent=it.next();
	    String child=it.next();
	    
	    driver.switchTo().window(child);
	   
	    helper.waitForPageToLoad();
	    helper.waitFor(Last_Seen_childWindow);
	    helper.highLightElement(driver, Last_Seen_childWindow);
	    String lastSeenDate = Last_Seen_childWindow.getText();
	    System.out.println("Last_Seen_childWindow : " + lastSeenDate);
	    Reporter.log("<B><font color = 'blue'> ==> -</font> LastScene_date AdDetails Page= " +  lastSeenDate);
	    
	    driver.close();
	    
	    driver.switchTo().window(parent);
	    
		String joinString = null;
		//	String[] actualDate = null;
			
			String[] splitString = lastSeenDate.split(" ");
			for(int i=0;i<splitString.length-2;i++) {
				String actualDate=splitString[i]; 
				joinString= splitString[i+1]+" "+ splitString[i]+" " + splitString[i+2];
			//	System.out.println("splitString : " + splitString[i]);				System.out.println("lastseen Date in Newest: " + joinString);
			}
		//	System.out.println("lastseen Date in Newest: " + joinString);
		Assert.assertEquals(imageDate, joinString);
		Reporter.log("<B><font color = 'blue'> ==> -</font> Image Date = "+" "+imageDate+"    ::    " + "Last Seeen Date = "+joinString+" "+" are same == PASS");

		}
		catch(Exception e) {
			 Reporter.log("<B><font color = 'orange'> Step 6 -</font> Oops! Looks like we don't have data for this search criteria yet.");
		}
		
		Reporter.log("");
		Reporter.log("<B><font color = 'Blue-Violet'> 8th Ad -</font> ");
		
		helper.Scrollintoview(current_date8);
		helper.waitFor(current_date8);
		try {
		helper.highLightElement(driver, current_date8);
		String imageDate=current_date8.getText();
		System.out.println("currentDatenewest : " + imageDate);
		Reporter.log("<B><font color = 'blue'> ==> -</font> CurrentDatenewest Image in Instagram DashBoard= " + imageDate);
		
		helper.Scrollintoview(showAnalytics_Button8);
		helper.waitFor(showAnalytics_Button8);
		helper.highLightElement(driver, showAnalytics_Button8);
		
		String linkText = showAnalytics_Button8.getAttribute("href");
		System.out.println("linkText : " + linkText);
		
		String idString = null;
			
			String[] splitStringid = linkText.split("/");
			for(int i=0;i<splitStringid.length;i++) {
				String actualDate=splitStringid[splitStringid.length-1]; 
				System.out.println("actualDate : " + actualDate);
				Reporter.log("<B><font color = 'blue'> ==> -</font> ID of the 8th Ad = " + actualDate);
				break;
			}
		
		helper.jsCLick(showAnalytics_Button8);
		Reporter.log("<B><font color = 'blue'> ==> -</font> Clicked on showAnalytics Button");
		
		Set<String> S1=driver.getWindowHandles();
	    Iterator<String>it=S1.iterator();
	    String parent=it.next();
	    String child=it.next();
	    
	    driver.switchTo().window(child);
	   
	    helper.waitForPageToLoad();
	    helper.waitFor(Last_Seen_childWindow);
	    helper.highLightElement(driver, Last_Seen_childWindow);
	    String lastSeenDate = Last_Seen_childWindow.getText();
	    System.out.println("Last_Seen_childWindow : " + lastSeenDate);
	    Reporter.log("<B><font color = 'blue'> ==> -</font> LastScene_date AdDetails Page= " +  lastSeenDate);
	    
	    driver.close();
	    
	    driver.switchTo().window(parent);
	    
		String joinString = null;
		//	String[] actualDate = null;
			
			String[] splitString = lastSeenDate.split(" ");
			for(int i=0;i<splitString.length-2;i++) {
				String actualDate=splitString[i]; 
				joinString= splitString[i+1]+" "+ splitString[i]+" " + splitString[i+2];
			//	System.out.println("splitString : " + splitString[i]);				System.out.println("lastseen Date in Newest: " + joinString);
			}
		//	System.out.println("lastseen Date in Newest: " + joinString);
		Assert.assertEquals(imageDate, joinString);
		Reporter.log("<B><font color = 'blue'> ==> -</font> Image Date = "+" "+imageDate+"    ::    " + "Last Seeen Date = "+joinString+" "+" are same == PASS");

		}
		catch(Exception e) {
			 Reporter.log("<B><font color = 'orange'> Step 6 -</font> Oops! Looks like we don't have data for this search criteria yet.");
		}
		
		Reporter.log("");
		Reporter.log("<B><font color = 'Blue-Violet'> 9th Ad -</font> ");
		
		helper.Scrollintoview(current_date9);
		helper.waitFor(current_date9);
		try {
		helper.highLightElement(driver, current_date9);
		String imageDate=current_date9.getText();
		System.out.println("currentDatenewest : " + imageDate);
		Reporter.log("<B><font color = 'blue'> ==> -</font> CurrentDatenewest Image in Instagram DashBoard= " + imageDate);
		
		helper.Scrollintoview(showAnalytics_Button9);
		helper.waitFor(showAnalytics_Button9);
		helper.highLightElement(driver, showAnalytics_Button9);
		
		String linkText = showAnalytics_Button9.getAttribute("href");
		System.out.println("linkText : " + linkText);
		
		String idString = null;
			
			String[] splitStringid = linkText.split("/");
			for(int i=0;i<splitStringid.length;i++) {
				String actualDate=splitStringid[splitStringid.length-1]; 
				System.out.println("actualDate : " + actualDate);
				Reporter.log("<B><font color = 'blue'> ==> -</font> ID of the 9th Ad = " + actualDate);
				break;
			}
		helper.jsCLick(showAnalytics_Button9);
		Reporter.log("<B><font color = 'blue'> ==> -</font> Clicked on showAnalytics Button");
		
		Set<String> S1=driver.getWindowHandles();
	    Iterator<String>it=S1.iterator();
	    String parent=it.next();
	    String child=it.next();
	    
	    driver.switchTo().window(child);
	   
	    helper.waitForPageToLoad();
	    helper.waitFor(Last_Seen_childWindow);
	    helper.highLightElement(driver, Last_Seen_childWindow);
	    String lastSeenDate = Last_Seen_childWindow.getText();
	    System.out.println("Last_Seen_childWindow : " + lastSeenDate);
	    Reporter.log("<B><font color = 'blue'> ==> -</font> LastScene_date AdDetails Page= " +  lastSeenDate);
	    
	    driver.close();
	    
	    driver.switchTo().window(parent);
	    
		String joinString = null;
		//	String[] actualDate = null;
			
			String[] splitString = lastSeenDate.split(" ");
			for(int i=0;i<splitString.length-2;i++) {
				String actualDate=splitString[i]; 
				joinString= splitString[i+1]+" "+ splitString[i]+" " + splitString[i+2];
			//	System.out.println("splitString : " + splitString[i]);				System.out.println("lastseen Date in Newest: " + joinString);
			}
		//	System.out.println("lastseen Date in Newest: " + joinString);
		Assert.assertEquals(imageDate, joinString);
		Reporter.log("<B><font color = 'blue'> ==> -</font> Image Date = "+" "+imageDate+"    ::    " + "Last Seeen Date = "+joinString+" "+" are same == PASS");

		}
		catch(Exception e) {
			 Reporter.log("<B><font color = 'orange'> Step 6 -</font> Oops! Looks like we don't have data for this search criteria yet.");
		}
		
		Reporter.log("");
		Reporter.log("<B><font color = 'Blue-Violet'> 10th Ad -</font> ");
		
		helper.Scrollintoview(current_date10);
		helper.waitFor(current_date10);
		try {
		helper.highLightElement(driver, current_date10);
		String imageDate=current_date10.getText();
		System.out.println("currentDatenewest : " + imageDate);
		Reporter.log("<B><font color = 'blue'> ==> -</font> CurrentDatenewest Image in Instagram DashBoard= " + imageDate);
		
		helper.Scrollintoview(showAnalytics_Button10);
		helper.waitFor(showAnalytics_Button10);
		helper.highLightElement(driver, showAnalytics_Button10);
		
		String linkText = showAnalytics_Button10.getAttribute("href");
		System.out.println("linkText : " + linkText);
		
		String idString = null;
			
			String[] splitStringid = linkText.split("/");
			for(int i=0;i<splitStringid.length;i++) {
				String actualDate=splitStringid[splitStringid.length-1]; 
				System.out.println("actualDate : " + actualDate);
				Reporter.log("<B><font color = 'blue'> ==> -</font> ID of the 10th Ad = " + actualDate);
				break;
			}
		helper.jsCLick(showAnalytics_Button10);
		Reporter.log("<B><font color = 'blue'> ==> -</font> Clicked on showAnalytics Button");
		
		Set<String> S1=driver.getWindowHandles();
	    Iterator<String>it=S1.iterator();
	    String parent=it.next();
	    String child=it.next();
	    
	    driver.switchTo().window(child);
	   
	    helper.waitForPageToLoad();
	    helper.waitFor(Last_Seen_childWindow);
	    helper.highLightElement(driver, Last_Seen_childWindow);
	    String lastSeenDate = Last_Seen_childWindow.getText();
	    System.out.println("Last_Seen_childWindow : " + lastSeenDate);
	    Reporter.log("<B><font color = 'blue'> ==> -</font> LastScene_date AdDetails Page= " +  lastSeenDate);
	    
	    driver.close();
	    
	    driver.switchTo().window(parent);
	    
		String joinString = null;
		//	String[] actualDate = null;
			
			String[] splitString = lastSeenDate.split(" ");
			for(int i=0;i<splitString.length-2;i++) {
				String actualDate=splitString[i]; 
				joinString= splitString[i+1]+" "+ splitString[i]+" " + splitString[i+2];
			//	System.out.println("splitString : " + splitString[i]);				System.out.println("lastseen Date in Newest: " + joinString);
			}
		//	System.out.println("lastseen Date in Newest: " + joinString);
		Assert.assertEquals(imageDate, joinString);
		Reporter.log("<B><font color = 'blue'> ==> -</font> Image Date = "+" "+imageDate+"    ::    " + "Last Seeen Date = "+joinString+" "+" are same == PASS");

		}
		catch(Exception e) {
			 Reporter.log("<B><font color = 'orange'> Step 6 -</font> Oops! Looks like we don't have data for this search criteria yet.");
		}
		
		Reporter.log("");
		Reporter.log("<B><font color = 'Blue-Violet'> 11th Ad -</font> ");
		
		helper.Scrollintoview(current_date11);
		helper.waitFor(current_date11);
		try {
		helper.highLightElement(driver, current_date11);
		String imageDate=current_date11.getText();
		System.out.println("currentDatenewest : " + imageDate);
		Reporter.log("<B><font color = 'blue'> ==> -</font> CurrentDatenewest Image in Instagram DashBoard= " + imageDate);
		
		helper.Scrollintoview(showAnalytics_Button11);
		helper.waitFor(showAnalytics_Button11);
		helper.highLightElement(driver, showAnalytics_Button11);
		
		String linkText = showAnalytics_Button11.getAttribute("href");
		System.out.println("linkText : " + linkText);
		
		String idString = null;
			
			String[] splitStringid = linkText.split("/");
			for(int i=0;i<splitStringid.length;i++) {
				String actualDate=splitStringid[splitStringid.length-1]; 
				System.out.println("actualDate : " + actualDate);
				Reporter.log("<B><font color = 'blue'> ==> -</font> ID of the 11th Ad = " + actualDate);
				break;
			}
			
		helper.jsCLick(showAnalytics_Button11);
		Reporter.log("<B><font color = 'blue'> ==> -</font> Clicked on showAnalytics Button");
		
		Set<String> S1=driver.getWindowHandles();
	    Iterator<String>it=S1.iterator();
	    String parent=it.next();
	    String child=it.next();
	    
	    driver.switchTo().window(child);
	   
	    helper.waitForPageToLoad();
	    helper.waitFor(Last_Seen_childWindow);
	    helper.highLightElement(driver, Last_Seen_childWindow);
	    String lastSeenDate = Last_Seen_childWindow.getText();
	    System.out.println("Last_Seen_childWindow : " + lastSeenDate);
	    Reporter.log("<B><font color = 'blue'> ==> -</font> LastScene_date AdDetails Page= " +  lastSeenDate);
	    
	    driver.close();
	    
	    driver.switchTo().window(parent);
	    
		String joinString = null;
		//	String[] actualDate = null;
			
			String[] splitString = lastSeenDate.split(" ");
			for(int i=0;i<splitString.length-2;i++) {
				String actualDate=splitString[i]; 
				joinString= splitString[i+1]+" "+ splitString[i]+" " + splitString[i+2];
			//	System.out.println("splitString : " + splitString[i]);				System.out.println("lastseen Date in Newest: " + joinString);
			}
		//	System.out.println("lastseen Date in Newest: " + joinString);
		Assert.assertEquals(imageDate, joinString);
		Reporter.log("<B><font color = 'blue'> ==> -</font> Image Date = "+" "+imageDate+"    ::    " + "Last Seeen Date = "+joinString+" "+" are same == PASS");

		}
		catch(Exception e) {
			 Reporter.log("<B><font color = 'orange'> Step 6 -</font> Oops! Looks like we don't have data for this search criteria yet.");
		}
		
		Reporter.log("");
		Reporter.log("<B><font color = 'Blue-Violet'> 12th Ad -</font> ");
		
		helper.Scrollintoview(current_date12);
		helper.waitFor(current_date12);
		try {
		helper.highLightElement(driver, current_date12);
		String imageDate=current_date12.getText();
		System.out.println("currentDatenewest : " + imageDate);
		Reporter.log("<B><font color = 'blue'> ==> -</font> CurrentDatenewest Image in Instagram DashBoard= " + imageDate);
		
		helper.Scrollintoview(showAnalytics_Button12);
		helper.waitFor(showAnalytics_Button12);
		helper.highLightElement(driver, showAnalytics_Button12);
		
		String linkText = showAnalytics_Button12.getAttribute("href");
		System.out.println("linkText : " + linkText);
		
		String idString = null;
			
			String[] splitStringid = linkText.split("/");
			for(int i=0;i<splitStringid.length;i++) {
				String actualDate=splitStringid[splitStringid.length-1]; 
				System.out.println("actualDate : " + actualDate);
				Reporter.log("<B><font color = 'blue'> ==> -</font> ID of the 12th Ad = " + actualDate);
				break;
			}
		helper.jsCLick(showAnalytics_Button12);
		Reporter.log("<B><font color = 'blue'> ==> -</font> Clicked on showAnalytics Button");
		
		Set<String> S1=driver.getWindowHandles();
	    Iterator<String>it=S1.iterator();
	    String parent=it.next();
	    String child=it.next();
	    
	    driver.switchTo().window(child);
	   
	    helper.waitForPageToLoad();
	    helper.waitFor(Last_Seen_childWindow);
	    helper.highLightElement(driver, Last_Seen_childWindow);
	    String lastSeenDate = Last_Seen_childWindow.getText();
	    System.out.println("Last_Seen_childWindow : " + lastSeenDate);
	    Reporter.log("<B><font color = 'blue'> ==> -</font> LastScene_date AdDetails Page= " +  lastSeenDate);
	    
	    driver.close();
	    
	    driver.switchTo().window(parent);
	    
		String joinString = null;
		//	String[] actualDate = null;
			
			String[] splitString = lastSeenDate.split(" ");
			for(int i=0;i<splitString.length-2;i++) {
				String actualDate=splitString[i]; 
				joinString= splitString[i+1]+" "+ splitString[i]+" " + splitString[i+2];
			//	System.out.println("splitString : " + splitString[i]);				System.out.println("lastseen Date in Newest: " + joinString);
			}
		//	System.out.println("lastseen Date in Newest: " + joinString);
		Assert.assertEquals(imageDate, joinString);
		Reporter.log("<B><font color = 'blue'> ==> -</font> Image Date = "+" "+imageDate+"    ::    " + "Last Seeen Date = "+joinString+" "+" are same == PASS");

		}
		catch(Exception e) {
			 Reporter.log("<B><font color = 'orange'> Step 6 -</font> Oops! Looks like we don't have data for this search criteria yet.");
		}
	
		Reporter.log("");
		Reporter.log("<B><font color = 'Blue-Violet'> 13th Ad -</font> ");
		
		helper.Scrollintoview(current_date13);
		helper.waitFor(current_date13);
		try {
		helper.highLightElement(driver, current_date13);
		String imageDate=current_date13.getText();
		System.out.println("imageDate : " + imageDate);
		Reporter.log("<B><font color = 'blue'> ==> -</font> CurrentDatenewest Image in Instagram DashBoard= " + imageDate);
		
		helper.Scrollintoview(showAnalytics_Button13);
		helper.waitFor(showAnalytics_Button13);
		helper.highLightElement(driver, showAnalytics_Button13);
		
		String linkText = showAnalytics_Button13.getAttribute("href");
		System.out.println("linkText : " + linkText);
		
		String idString = null;
			
			String[] splitStringid = linkText.split("/");
			for(int i=0;i<splitStringid.length;i++) {
				String actualDate=splitStringid[splitStringid.length-1]; 
				System.out.println("actualDate : " + actualDate);
				Reporter.log("<B><font color = 'blue'> ==> -</font> ID of the 13th Ad = " + actualDate);
				break;
			}
		helper.jsCLick(showAnalytics_Button13);
		Reporter.log("<B><font color = 'blue'> ==> -</font> Clicked on showAnalytics Button");
		
		Set<String> S1=driver.getWindowHandles();
	    Iterator<String>it=S1.iterator();
	    String parent=it.next();
	    String child=it.next();
	    
	    driver.switchTo().window(child);
	   
	    helper.waitForPageToLoad();
	    helper.waitFor(Last_Seen_childWindow);
	    helper.highLightElement(driver, Last_Seen_childWindow);
	    String lastSeenDate = Last_Seen_childWindow.getText();
	    System.out.println("Last_Seen_childWindow : " + lastSeenDate);
	    Reporter.log("<B><font color = 'blue'> ==> -</font> LastScene_date AdDetails Page= " +  lastSeenDate);
	    
	    driver.close();
	    
	    driver.switchTo().window(parent);
	    
		String joinString = null;
		//	String[] actualDate = null;
			
			String[] splitString = lastSeenDate.split(" ");
			for(int i=0;i<splitString.length-2;i++) {
				String actualDate=splitString[i]; 
				joinString= splitString[i+1]+" "+ splitString[i]+" " + splitString[i+2];
			//	System.out.println("splitString : " + splitString[i]);				System.out.println("lastseen Date in Newest: " + joinString);
			}
		//	System.out.println("lastseen Date in Newest: " + joinString);
		Assert.assertEquals(imageDate, joinString);
		Reporter.log("<B><font color = 'blue'> ==> -</font> Image Date = "+" "+imageDate+"    ::    " + "Last Seeen Date = "+joinString+" "+" are same == PASS");

		}
		catch(Exception e) {
			 Reporter.log("<B><font color = 'orange'> Step 6 -</font> Oops! Looks like we don't have data for this search criteria yet.");
		}
		
		Reporter.log("");
		Reporter.log("<B><font color = 'Blue-Violet'> 14th Ad -</font> ");
		
		helper.Scrollintoview(current_date14);
		helper.waitFor(current_date14);
		try {
		helper.highLightElement(driver, current_date14);
		String imageDate=current_date14.getText();
		System.out.println("imageDate : " + imageDate);
		Reporter.log("<B><font color = 'blue'> ==> -</font> CurrentDatenewest Image in Instagram DashBoard= " + imageDate);
		
		helper.Scrollintoview(showAnalytics_Button14);
		helper.waitFor(showAnalytics_Button14);
		helper.highLightElement(driver, showAnalytics_Button14);
		
		String linkText = showAnalytics_Button14.getAttribute("href");
		System.out.println("linkText : " + linkText);
		
		String idString = null;
			
			String[] splitStringid = linkText.split("/");
			for(int i=0;i<splitStringid.length;i++) {
				String actualDate=splitStringid[splitStringid.length-1]; 
				System.out.println("actualDate : " + actualDate);
				Reporter.log("<B><font color = 'blue'> ==> -</font> ID of the 14th Ad = " + actualDate);
				break;
			}
		helper.jsCLick(showAnalytics_Button14);
		Reporter.log("<B><font color = 'blue'> ==> -</font> Clicked on showAnalytics Button");
		
		Set<String> S1=driver.getWindowHandles();
	    Iterator<String>it=S1.iterator();
	    String parent=it.next();
	    String child=it.next();
	    
	    driver.switchTo().window(child);
	   
	    helper.waitForPageToLoad();
	    helper.waitFor(Last_Seen_childWindow);
	    helper.highLightElement(driver, Last_Seen_childWindow);
	    String lastSeenDate = Last_Seen_childWindow.getText();
	    System.out.println("Last_Seen_childWindow : " + lastSeenDate);
	    Reporter.log("<B><font color = 'blue'> ==> -</font> LastScene_date AdDetails Page= " +  lastSeenDate);
	    
	    driver.close();
	    
	    driver.switchTo().window(parent);
	    
		String joinString = null;
		//	String[] actualDate = null;
			
			String[] splitString = lastSeenDate.split(" ");
			for(int i=0;i<splitString.length-2;i++) {
				String actualDate=splitString[i]; 
				joinString= splitString[i+1]+" "+ splitString[i]+" " + splitString[i+2];
			//	System.out.println("splitString : " + splitString[i]);				System.out.println("lastseen Date in Newest: " + joinString);
			}
		//	System.out.println("lastseen Date in Newest: " + joinString);
		Assert.assertEquals(imageDate, joinString);
		Reporter.log("<B><font color = 'blue'> ==> -</font> Image Date = "+" "+imageDate+"    ::    " + "Last Seeen Date = "+joinString+" "+" are same == PASS");

		}
		catch(Exception e) {
			 Reporter.log("<B><font color = 'orange'> Step 6 -</font> Oops! Looks like we don't have data for this search criteria yet.");
		}
		
		Reporter.log("");
		Reporter.log("<B><font color = 'Blue-Violet'> 15th Ad -</font> ");
		
		helper.Scrollintoview(current_date15);
		helper.waitFor(current_date15);
		try {
		helper.highLightElement(driver, current_date15);
		String imageDate=current_date15.getText();
		System.out.println("currentDatenewest : " + imageDate);
		Reporter.log("<B><font color = 'blue'> ==> -</font> CurrentDatenewest Image in Instagram DashBoard= " + imageDate);
		
		helper.Scrollintoview(showAnalytics_Button15);
		helper.waitFor(showAnalytics_Button15);
		helper.highLightElement(driver, showAnalytics_Button15);
		
		String linkText = showAnalytics_Button15.getAttribute("href");
		System.out.println("linkText : " + linkText);
		
		String idString = null;
			
			String[] splitStringid = linkText.split("/");
			for(int i=0;i<splitStringid.length;i++) {
				String actualDate=splitStringid[splitStringid.length-1]; 
				System.out.println("actualDate : " + actualDate);
				Reporter.log("<B><font color = 'blue'> ==> -</font> ID of the 15th Ad = " + actualDate);
				break;
			}
		helper.jsCLick(showAnalytics_Button15);
		Reporter.log("<B><font color = 'blue'> ==> -</font> Clicked on showAnalytics Button");
		
		Set<String> S1=driver.getWindowHandles();
	    Iterator<String>it=S1.iterator();
	    String parent=it.next();
	    String child=it.next();
	    
	    driver.switchTo().window(child);
	   
	    helper.waitForPageToLoad();
	    helper.waitFor(Last_Seen_childWindow);
	    helper.highLightElement(driver, Last_Seen_childWindow);
	    String lastSeenDate = Last_Seen_childWindow.getText();
	    System.out.println("Last_Seen_childWindow : " + lastSeenDate);
	    Reporter.log("<B><font color = 'blue'> ==> -</font> LastScene_date AdDetails Page= " +  lastSeenDate);
	    
	    driver.close();
	    
	    driver.switchTo().window(parent);
	    
		String joinString = null;
		//	String[] actualDate = null;
			
			String[] splitString = lastSeenDate.split(" ");
			for(int i=0;i<splitString.length-2;i++) {
				String actualDate=splitString[i]; 
				joinString= splitString[i+1]+" "+ splitString[i]+" " + splitString[i+2];
			//	System.out.println("splitString : " + splitString[i]);				System.out.println("lastseen Date in Newest: " + joinString);
			}
		//	System.out.println("lastseen Date in Newest: " + joinString);
		Assert.assertEquals(imageDate, joinString);
		Reporter.log("<B><font color = 'blue'> ==> -</font> Image Date = "+" "+imageDate+"    ::    " + "Last Seeen Date = "+joinString+" "+" are same == PASS");

		}
		catch(Exception e) {
			 Reporter.log("<B><font color = 'orange'> Step 6 -</font> Oops! Looks like we don't have data for this search criteria yet.");
		}
	/*	
		
		Reporter.log("");
		Reporter.log("<B><font color = 'green'> LastSeen field -</font>");

	    //last seen
	    
		helper.Scrollintoview(clearSearchField);
	    helper.waitFor(clearSearchField);
		helper.highLightElement(driver, clearSearchField);
		helper.jsCLick(clearSearchField);
		Reporter.log("<B><font color = 'orange'> Step 1 -</font> Clicked On clear search.");
		

		helper.waitFor(sortBy_DropDown);
		helper.highLightElement(driver, sortBy_DropDown);
		helper.jsCLick(sortBy_DropDown);
		Reporter.log("<B><font color = 'orange'> Step 2 -</font> Clicked On sortBy.");
	//	helper.waitForPageToLoad();
		
		helper.waitFor(lastSeen_Button);
		helper.highLightElement(driver, lastSeen_Button);
		helper.jsCLick(lastSeen_Button);
		Reporter.log("<B><font color = 'orange'> Step 3 -</font> Clicked On lastSeen_Button.");
		
		helper.waitFor(search_bar);
		helper.highLightElement(driver, search_bar);
		helper.jsCLick(search_bar);
		Reporter.log("<B><font color = 'orange'> Step 4 -</font> Clicked On Search Bar.");

		helper.waitFor(toatal_Count_Ads);
		helper.highLightElement(driver, toatal_Count_Ads);
		helper.jsCLick(toatal_Count_Ads);
		String Total_Ads_Count_lastseen=toatal_Count_Ads.getText();
		Reporter.log("<B><font color = 'orange'> Step 5 -</font> Total_Ads_Count_lastseen= " + Total_Ads_Count_lastseen);
		helper.waitForPageToLoad();
		
		Reporter.log("");
		Reporter.log("<B><font color = 'Blue-Violet'> 1st Ad -</font> ");
		
		helper.Scrollintoview(current_date1);
		helper.waitFor(current_date1);
		try {
		helper.highLightElement(driver, current_date1);
		String imageDate=current_date1.getText();
		System.out.println("currentDateLatest : " + imageDate);
		Reporter.log("<B><font color = 'blue'> ==> -</font> CurrentDateLatest Image in Instagram DashBoard = " + imageDate);
		
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
	    helper.waitFor(Last_Seen_childWindow);
	    helper.highLightElement(driver, Last_Seen_childWindow);
	    String lastSeenDate1 = Last_Seen_childWindow.getText();
	    System.out.println("Last_Seen_childWindow : " + lastSeenDate1 );
	    Reporter.log("<B><font color = 'blue'> ==> -</font> Clicked on lastSeenDate1 = " +  lastSeenDate1);
	    
	    driver.close();
	    
	    driver.switchTo().window(parent1);
	    
	    	String joinString = null;
			
			String[] splitString1 = lastSeenDate1.split(" ");
			for(int i=0;i<splitString1.length-2;i++) {
				String actualDate=splitString1[i]; 
				joinString= splitString1[i+1]+" "+ splitString1[i]+" " + splitString1[i+2];
			//	System.out.println("splitString : " + splitString[i]);
			//	System.out.println("lastseen Date in LastSeen: " + joinString1);
			}
			System.out.println("lastseen Date in LastSeen: " + joinString);
		Assert.assertEquals(imageDate, joinString);
		Reporter.log("<B><font color = 'blue'> ==> -</font> Image Date = "+" "+imageDate+"    ::    " + "Last Seeen Date = "+joinString+" "+" are same == PASS");

		}
		catch (Exception e) {
			 Reporter.log("<B><font color = 'orange'> Step 6 -</font> Oops! Looks like we don't have data for this search criteria yet.");
		}
		
		Reporter.log("");
		Reporter.log("<B><font color = 'Blue-Violet'> 2nd Ad -</font> ");
		
		helper.Scrollintoview(current_date2);
		helper.waitFor(current_date2);
		try {
		helper.highLightElement(driver, current_date2);
		String imageDate=current_date2.getText();
		System.out.println("currentDateLatest : " + imageDate);
		Reporter.log("<B><font color = 'blue'> ==> -</font> CurrentDateLatest Image in Instagram DashBoard = " + imageDate);
		
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
	    helper.waitFor(Last_Seen_childWindow);
	    helper.highLightElement(driver, Last_Seen_childWindow);
	    String lastSeenDate1 = Last_Seen_childWindow.getText();
	    System.out.println("Last_Seen_childWindow : " + lastSeenDate1 );
	    Reporter.log("<B><font color = 'blue'> ==> -</font> Clicked on lastSeenDate1 = " +  lastSeenDate1);
	    
	    driver.close();
	    
	    driver.switchTo().window(parent1);
	    
	    	String joinString = null;
			
			String[] splitString1 = lastSeenDate1.split(" ");
			for(int i=0;i<splitString1.length-2;i++) {
				String actualDate=splitString1[i]; 
				joinString= splitString1[i+1]+" "+ splitString1[i]+" " + splitString1[i+2];
			//	System.out.println("splitString : " + splitString[i]);
			//	System.out.println("lastseen Date in LastSeen: " + joinString1);
			}
			System.out.println("lastseen Date in LastSeen: " + joinString);
		Assert.assertEquals(imageDate, joinString);
		Reporter.log("<B><font color = 'blue'> ==> -</font> Image Date = "+" "+imageDate+"    ::    " + "Last Seeen Date = "+joinString+" "+" are same == PASS");

		}
		catch (Exception e) {
			 Reporter.log("<B><font color = 'orange'> Step 6 -</font> Oops! Looks like we don't have data for this search criteria yet.");
		}
		

		Reporter.log("");
		Reporter.log("<B><font color = 'Blue-Violet'> 3rd Ad -</font> ");
		
		helper.Scrollintoview(current_date3);
		helper.waitFor(current_date3);
		try {
		helper.highLightElement(driver, current_date3);
		String imageDate=current_date3.getText();
		System.out.println("currentDateLatest : " + imageDate);
		Reporter.log("<B><font color = 'blue'> ==> -</font> CurrentDateLatest Image in Instagram DashBoard = " + imageDate);
		
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
	    helper.waitFor(Last_Seen_childWindow);
	    helper.highLightElement(driver, Last_Seen_childWindow);
	    String lastSeenDate1 = Last_Seen_childWindow.getText();
	    System.out.println("Last_Seen_childWindow : " + lastSeenDate1 );
	    Reporter.log("<B><font color = 'blue'> ==> -</font> Clicked on lastSeenDate1 = " +  lastSeenDate1);
	    
	    driver.close();
	    
	    driver.switchTo().window(parent1);
	    
	    	String joinString = null;
			
			String[] splitString1 = lastSeenDate1.split(" ");
			for(int i=0;i<splitString1.length-2;i++) {
				String actualDate=splitString1[i]; 
				joinString= splitString1[i+1]+" "+ splitString1[i]+" " + splitString1[i+2];
			//	System.out.println("splitString : " + splitString[i]);
			//	System.out.println("lastseen Date in LastSeen: " + joinString1);
			}
			System.out.println("lastseen Date in LastSeen: " + joinString);
		Assert.assertEquals(imageDate, joinString);
		Reporter.log("<B><font color = 'blue'> ==> -</font> Image Date = "+" "+imageDate+"    ::    " + "Last Seeen Date = "+joinString+" "+" are same == PASS");

		}
		catch (Exception e) {
			 Reporter.log("<B><font color = 'orange'> Step 6 -</font> Oops! Looks like we don't have data for this search criteria yet.");
		}
		

		Reporter.log("");
		Reporter.log("<B><font color = 'Blue-Violet'> 4th Ad -</font> ");
		
		helper.Scrollintoview(current_date4);
		helper.waitFor(current_date4);
		try {
		helper.highLightElement(driver, current_date4);
		String imageDate=current_date4.getText();
		System.out.println("currentDateLatest : " + imageDate);
		Reporter.log("<B><font color = 'blue'> ==> -</font> CurrentDateLatest Image in Instagram DashBoard = " + imageDate);
		
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
	    helper.waitFor(Last_Seen_childWindow);
	    helper.highLightElement(driver, Last_Seen_childWindow);
	    String lastSeenDate1 = Last_Seen_childWindow.getText();
	    System.out.println("Last_Seen_childWindow : " + lastSeenDate1 );
	    Reporter.log("<B><font color = 'blue'> ==> -</font> Clicked on lastSeenDate1 = " +  lastSeenDate1);
	    
	    driver.close();
	    
	    driver.switchTo().window(parent1);
	    
	    	String joinString = null;
			
			String[] splitString1 = lastSeenDate1.split(" ");
			for(int i=0;i<splitString1.length-2;i++) {
				String actualDate=splitString1[i]; 
				joinString= splitString1[i+1]+" "+ splitString1[i]+" " + splitString1[i+2];
			//	System.out.println("splitString : " + splitString[i]);
			//	System.out.println("lastseen Date in LastSeen: " + joinString1);
			}
			System.out.println("lastseen Date in LastSeen: " + joinString);
		Assert.assertEquals(imageDate, joinString);
		Reporter.log("<B><font color = 'blue'> ==> -</font> Image Date = "+" "+imageDate+"    ::    " + "Last Seeen Date = "+joinString+" "+" are same == PASS");

		}
		catch (Exception e) {
			 Reporter.log("<B><font color = 'orange'> Step 6 -</font> Oops! Looks like we don't have data for this search criteria yet.");
		}
		

		Reporter.log("");
		Reporter.log("<B><font color = 'Blue-Violet'> 5th Ad -</font> ");
		
		helper.Scrollintoview(current_date5);
		helper.waitFor(current_date5);
		try {
		helper.highLightElement(driver, current_date5);
		String imageDate=current_date5.getText();
		System.out.println("currentDateLatest : " + imageDate);
		Reporter.log("<B><font color = 'blue'> ==> -</font> CurrentDateLatest Image in Instagram DashBoard = " + imageDate);
		
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
	    helper.waitFor(Last_Seen_childWindow);
	    helper.highLightElement(driver, Last_Seen_childWindow);
	    String lastSeenDate1 = Last_Seen_childWindow.getText();
	    System.out.println("Last_Seen_childWindow : " + lastSeenDate1 );
	    Reporter.log("<B><font color = 'blue'> ==> -</font> Clicked on lastSeenDate = " +  lastSeenDate1);
	    
	    driver.close();
	    
	    driver.switchTo().window(parent1);
	    
	    	String joinString = null;
			
			String[] splitString1 = lastSeenDate1.split(" ");
			for(int i=0;i<splitString1.length-2;i++) {
				String actualDate=splitString1[i]; 
				joinString= splitString1[i+1]+" "+ splitString1[i]+" " + splitString1[i+2];
			//	System.out.println("splitString : " + splitString[i]);
			//	System.out.println("lastseen Date in LastSeen: " + joinString1);
			}
			System.out.println("lastseen Date in LastSeen: " + joinString);
		Assert.assertEquals(imageDate, joinString);
		Reporter.log("<B><font color = 'blue'> ==> -</font> Image Date = "+" "+imageDate+"    ::    " + "Last Seeen Date = "+joinString+" "+" are same == PASS");

		}
		catch (Exception e) {
			 Reporter.log("<B><font color = 'orange'> Step 6 -</font> Oops! Looks like we don't have data for this search criteria yet.");
		}
		

		Reporter.log("");
		Reporter.log("<B><font color = 'Blue-Violet'> 6th Ad -</font> ");
		
		helper.Scrollintoview(current_date6);
		helper.waitFor(current_date6);
		try {
		helper.highLightElement(driver, current_date6);
		String imageDate=current_date6.getText();
		System.out.println("currentDateLatest : " + imageDate);
		Reporter.log("<B><font color = 'blue'> ==> -</font> CurrentDateLatest Image in Instagram DashBoard = " + imageDate);
		
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
	    helper.waitFor(Last_Seen_childWindow);
	    helper.highLightElement(driver, Last_Seen_childWindow);
	    String lastSeenDate1 = Last_Seen_childWindow.getText();
	    System.out.println("Last_Seen_childWindow : " + lastSeenDate1 );
	    Reporter.log("<B><font color = 'blue'> ==> -</font> Clicked on lastSeenDate = " +  lastSeenDate1);
	    
	    driver.close();
	    
	    driver.switchTo().window(parent1);
	    
	    	String joinString = null;
			
			String[] splitString1 = lastSeenDate1.split(" ");
			for(int i=0;i<splitString1.length-2;i++) {
				String actualDate=splitString1[i]; 
				joinString= splitString1[i+1]+" "+ splitString1[i]+" " + splitString1[i+2];
			//	System.out.println("splitString : " + splitString[i]);
			//	System.out.println("lastseen Date in LastSeen: " + joinString1);
			}
			System.out.println("lastseen Date in LastSeen: " + joinString);
		Assert.assertEquals(imageDate, joinString);
		Reporter.log("<B><font color = 'blue'> ==> -</font> Image Date = "+" "+imageDate+"    ::    " + "Last Seeen Date = "+joinString+" "+" are same == PASS");

		}
		catch (Exception e) {
			 Reporter.log("<B><font color = 'orange'> Step 6 -</font> Oops! Looks like we don't have data for this search criteria yet.");
		}
		

		Reporter.log("");
		Reporter.log("<B><font color = 'Blue-Violet'> 7th Ad -</font> ");
		
		helper.Scrollintoview(current_date7);
		helper.waitFor(current_date7);
		try {
		helper.highLightElement(driver, current_date7);
		String imageDate=current_date7.getText();
		System.out.println("currentDateLatest : " + imageDate);
		Reporter.log("<B><font color = 'blue'> ==> -</font> CurrentDateLatest Image in Instagram DashBoard = " + imageDate);
		
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
	    helper.waitFor(Last_Seen_childWindow);
	    helper.highLightElement(driver, Last_Seen_childWindow);
	    String lastSeenDate1 = Last_Seen_childWindow.getText();
	    System.out.println("Last_Seen_childWindow : " + lastSeenDate1 );
	    Reporter.log("<B><font color = 'blue'> ==> -</font> Clicked on lastSeenDate = " +  lastSeenDate1);
	    
	    driver.close();
	    
	    driver.switchTo().window(parent1);
	    
	    	String joinString = null;
			
			String[] splitString1 = lastSeenDate1.split(" ");
			for(int i=0;i<splitString1.length-2;i++) {
				String actualDate=splitString1[i]; 
				joinString= splitString1[i+1]+" "+ splitString1[i]+" " + splitString1[i+2];
			//	System.out.println("splitString : " + splitString[i]);
			//	System.out.println("lastseen Date in LastSeen: " + joinString1);
			}
			System.out.println("lastseen Date in LastSeen: " + joinString);
		Assert.assertEquals(imageDate, joinString);
		Reporter.log("<B><font color = 'blue'> ==> -</font> Image Date = "+" "+imageDate+"    ::    " + "Last Seeen Date = "+joinString+" "+" are same == PASS");

		}
		catch (Exception e) {
			 Reporter.log("<B><font color = 'orange'> Step 6 -</font> Oops! Looks like we don't have data for this search criteria yet.");
		}
		
		Reporter.log("");
		Reporter.log("<B><font color = 'Blue-Violet'> 8th Ad -</font> ");
		
		helper.Scrollintoview(current_date8);
		helper.waitFor(current_date8);
		try {
		helper.highLightElement(driver, current_date8);
		String imageDate=current_date8.getText();
		System.out.println("currentDateLatest : " + imageDate);
		Reporter.log("<B><font color = 'blue'> ==> -</font> CurrentDateLatest Image in Instagram DashBoard = " + imageDate);
		
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
	    helper.waitFor(Last_Seen_childWindow);
	    helper.highLightElement(driver, Last_Seen_childWindow);
	    String lastSeenDate1 = Last_Seen_childWindow.getText();
	    System.out.println("Last_Seen_childWindow : " + lastSeenDate1 );
	    Reporter.log("<B><font color = 'blue'> ==> -</font> Clicked on lastSeenDate = " +  lastSeenDate1);
	    
	    driver.close();
	    
	    driver.switchTo().window(parent1);
	    
	    	String joinString = null;
			
			String[] splitString1 = lastSeenDate1.split(" ");
			for(int i=0;i<splitString1.length-2;i++) {
				String actualDate=splitString1[i]; 
				joinString= splitString1[i+1]+" "+ splitString1[i]+" " + splitString1[i+2];
			//	System.out.println("splitString : " + splitString[i]);
			//	System.out.println("lastseen Date in LastSeen: " + joinString1);
			}
			System.out.println("lastseen Date in LastSeen: " + joinString);
		Assert.assertEquals(imageDate, joinString);
		Reporter.log("<B><font color = 'blue'> ==> -</font> Image Date = "+" "+imageDate+"    ::    " + "Last Seeen Date = "+joinString+" "+" are same == PASS");

		}
		catch (Exception e) {
			 Reporter.log("<B><font color = 'orange'> Step 6 -</font> Oops! Looks like we don't have data for this search criteria yet.");
		}
		
		Reporter.log("");
		Reporter.log("<B><font color = 'Blue-Violet'> 9th Ad -</font> ");
		
		helper.Scrollintoview(current_date9);
		helper.waitFor(current_date9);
		try {
		helper.highLightElement(driver, current_date9);
		String imageDate=current_date9.getText();
		System.out.println("currentDateLatest : " + imageDate);
		Reporter.log("<B><font color = 'blue'> ==> -</font> CurrentDateLatest Image in Instagram DashBoard = " + imageDate);
		
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
	    helper.waitFor(Last_Seen_childWindow);
	    helper.highLightElement(driver, Last_Seen_childWindow);
	    String lastSeenDate1 = Last_Seen_childWindow.getText();
	    System.out.println("Last_Seen_childWindow : " + lastSeenDate1 );
	    Reporter.log("<B><font color = 'blue'> ==> -</font> Clicked on lastSeenDate = " +  lastSeenDate1);
	    
	    driver.close();
	    
	    driver.switchTo().window(parent1);
	    
	    	String joinString = null;
			
			String[] splitString1 = lastSeenDate1.split(" ");
			for(int i=0;i<splitString1.length-2;i++) {
				String actualDate=splitString1[i]; 
				joinString= splitString1[i+1]+" "+ splitString1[i]+" " + splitString1[i+2];
			//	System.out.println("splitString : " + splitString[i]);
			//	System.out.println("lastseen Date in LastSeen: " + joinString1);
			}
			System.out.println("lastseen Date in LastSeen: " + joinString);
		Assert.assertEquals(imageDate, joinString);
		Reporter.log("<B><font color = 'blue'> ==> -</font> Image Date = "+" "+imageDate+"    ::    " + "Last Seeen Date = "+joinString+" "+" are same == PASS");

		}
		catch (Exception e) {
			 Reporter.log("<B><font color = 'orange'> Step 6 -</font> Oops! Looks like we don't have data for this search criteria yet.");
		}
		
		Reporter.log("");
		Reporter.log("<B><font color = 'Blue-Violet'> 11th Ad -</font> ");
		
		helper.Scrollintoview(current_date11);
		helper.waitFor(current_date11);
		try {
		helper.highLightElement(driver, current_date11);
		String imageDate=current_date11.getText();
		System.out.println("currentDateLatest : " + imageDate);
		Reporter.log("<B><font color = 'blue'> ==> -</font> CurrentDateLatest Image in Instagram DashBoard = " + imageDate);
		
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
	    helper.waitFor(Last_Seen_childWindow);
	    helper.highLightElement(driver, Last_Seen_childWindow);
	    String lastSeenDate1 = Last_Seen_childWindow.getText();
	    System.out.println("Last_Seen_childWindow : " + lastSeenDate1 );
	    Reporter.log("<B><font color = 'blue'> ==> -</font> Clicked on lastSeenDate = " +  lastSeenDate1);
	    
	    driver.close();
	    
	    driver.switchTo().window(parent1);
	    
	    	String joinString = null;
			
			String[] splitString1 = lastSeenDate1.split(" ");
			for(int i=0;i<splitString1.length-2;i++) {
				String actualDate=splitString1[i]; 
				joinString= splitString1[i+1]+" "+ splitString1[i]+" " + splitString1[i+2];
			//	System.out.println("splitString : " + splitString[i]);
			//	System.out.println("lastseen Date in LastSeen: " + joinString1);
			}
			System.out.println("lastseen Date in LastSeen: " + joinString);
		Assert.assertEquals(imageDate, joinString);
		Reporter.log("<B><font color = 'blue'> ==> -</font> Image Date = "+" "+imageDate+"    ::    " + "Last Seeen Date = "+joinString+" "+" are same == PASS");

		}
		catch (Exception e) {
			 Reporter.log("<B><font color = 'orange'> Step 6 -</font> Oops! Looks like we don't have data for this search criteria yet.");
		}
		
		Reporter.log("");
		Reporter.log("<B><font color = 'Blue-Violet'> 12th Ad -</font> ");
		
		helper.Scrollintoview(current_date12);
		helper.waitFor(current_date12);
		try {
		helper.highLightElement(driver, current_date12);
		String imageDate=current_date12.getText();
		System.out.println("currentDateLatest : " + imageDate);
		Reporter.log("<B><font color = 'blue'> ==> -</font> CurrentDateLatest Image in Instagram DashBoard = " + imageDate);
		
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
	    helper.waitFor(Last_Seen_childWindow);
	    helper.highLightElement(driver, Last_Seen_childWindow);
	    String lastSeenDate1 = Last_Seen_childWindow.getText();
	    System.out.println("Last_Seen_childWindow : " + lastSeenDate1 );
	    Reporter.log("<B><font color = 'blue'> ==> -</font> Clicked on lastSeenDate = " +  lastSeenDate1);
	    
	    driver.close();
	    
	    driver.switchTo().window(parent1);
	    
	    	String joinString = null;
			
			String[] splitString1 = lastSeenDate1.split(" ");
			for(int i=0;i<splitString1.length-2;i++) {
				String actualDate=splitString1[i]; 
				joinString= splitString1[i+1]+" "+ splitString1[i]+" " + splitString1[i+2];
			//	System.out.println("splitString : " + splitString[i]);
			//	System.out.println("lastseen Date in LastSeen: " + joinString1);
			}
			System.out.println("lastseen Date in LastSeen: " + joinString);
		Assert.assertEquals(imageDate, joinString);
		Reporter.log("<B><font color = 'blue'> ==> -</font> Image Date = "+" "+imageDate+"    ::    " + "Last Seeen Date = "+joinString+" "+" are same == PASS");

		}
		catch (Exception e) {
			 Reporter.log("<B><font color = 'orange'> Step 6 -</font> Oops! Looks like we don't have data for this search criteria yet.");
		}
		
		Reporter.log("");
		Reporter.log("<B><font color = 'Blue-Violet'> 13th Ad -</font> ");
		
		helper.Scrollintoview(current_date13);
		helper.waitFor(current_date13);
		try {
		helper.highLightElement(driver, current_date13);
		String imageDate=current_date13.getText();
		System.out.println("currentDateLatest : " + imageDate);
		Reporter.log("<B><font color = 'blue'> ==> -</font> CurrentDateLatest Image in Instagram DashBoard = " + imageDate);
		
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
	    helper.waitFor(Last_Seen_childWindow);
	    helper.highLightElement(driver, Last_Seen_childWindow);
	    String lastSeenDate1 = Last_Seen_childWindow.getText();
	    System.out.println("Last_Seen_childWindow : " + lastSeenDate1 );
	    Reporter.log("<B><font color = 'blue'> ==> -</font> Clicked on lastSeenDate = " +  lastSeenDate1);
	    
	    driver.close();
	    
	    driver.switchTo().window(parent1);
	    
	    	String joinString = null;
			
			String[] splitString1 = lastSeenDate1.split(" ");
			for(int i=0;i<splitString1.length-2;i++) {
				String actualDate=splitString1[i]; 
				joinString= splitString1[i+1]+" "+ splitString1[i]+" " + splitString1[i+2];
			//	System.out.println("splitString : " + splitString[i]);
			//	System.out.println("lastseen Date in LastSeen: " + joinString1);
			}
			System.out.println("lastseen Date in LastSeen: " + joinString);
		Assert.assertEquals(imageDate, joinString);
		Reporter.log("<B><font color = 'blue'> ==> -</font> Image Date = "+" "+imageDate+"    ::    " + "Last Seeen Date = "+joinString+" "+" are same == PASS");

		}
		catch (Exception e) {
			 Reporter.log("<B><font color = 'orange'> Step 6 -</font> Oops! Looks like we don't have data for this search criteria yet.");
		}
		
		Reporter.log("");
		Reporter.log("<B><font color = 'Blue-Violet'> 14th Ad -</font> ");
		
		helper.Scrollintoview(current_date14);
		helper.waitFor(current_date14);
		try {
		helper.highLightElement(driver, current_date14);
		String imageDate=current_date14.getText();
		System.out.println("currentDateLatest : " + imageDate);
		Reporter.log("<B><font color = 'blue'> ==> -</font> CurrentDateLatest Image in Instagram DashBoard = " + imageDate);
		
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
	    helper.waitFor(Last_Seen_childWindow);
	    helper.highLightElement(driver, Last_Seen_childWindow);
	    String lastSeenDate1 = Last_Seen_childWindow.getText();
	    System.out.println("Last_Seen_childWindow : " + lastSeenDate1 );
	    Reporter.log("<B><font color = 'blue'> ==> -</font> Clicked on lastSeenDate = " +  lastSeenDate1);
	    
	    driver.close();
	    
	    driver.switchTo().window(parent1);
	    
	    	String joinString = null;
			
			String[] splitString1 = lastSeenDate1.split(" ");
			for(int i=0;i<splitString1.length-2;i++) {
				String actualDate=splitString1[i]; 
				joinString= splitString1[i+1]+" "+ splitString1[i]+" " + splitString1[i+2];
			//	System.out.println("splitString : " + splitString[i]);
			//	System.out.println("lastseen Date in LastSeen: " + joinString1);
			}
			System.out.println("lastseen Date in LastSeen: " + joinString);
		Assert.assertEquals(imageDate, joinString);
		Reporter.log("<B><font color = 'blue'> ==> -</font> Image Date = "+" "+imageDate+"    ::    " + "Last Seeen Date = "+joinString+" "+" are same == PASS");

		}
		catch (Exception e) {
			 Reporter.log("<B><font color = 'orange'> Step 6 -</font> Oops! Looks like we don't have data for this search criteria yet.");
		}
		
		Reporter.log("");
		Reporter.log("<B><font color = 'Blue-Violet'> 15th Ad -</font> ");
		
		helper.Scrollintoview(current_date15);
		helper.waitFor(current_date15);
		try {
		helper.highLightElement(driver, current_date15);
		String imageDate=current_date15.getText();
		System.out.println("currentDateLatest : " + imageDate);
		Reporter.log("<B><font color = 'blue'> ==> -</font> CurrentDateLatest Image in Instagram DashBoard = " + imageDate);
		
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
	    helper.waitFor(Last_Seen_childWindow);
	    helper.highLightElement(driver, Last_Seen_childWindow);
	    String lastSeenDate1 = Last_Seen_childWindow.getText();
	    System.out.println("Last_Seen_childWindow : " + lastSeenDate1 );
	    Reporter.log("<B><font color = 'blue'> ==> -</font> Clicked on lastSeenDate = " +  lastSeenDate1);
	    
	    driver.close();
	    
	    driver.switchTo().window(parent1);
	    
	    	String joinString = null;
			
			String[] splitString1 = lastSeenDate1.split(" ");
			for(int i=0;i<splitString1.length-2;i++) {
				String actualDate=splitString1[i]; 
				joinString= splitString1[i+1]+" "+ splitString1[i]+" " + splitString1[i+2];
			//	System.out.println("splitString : " + splitString[i]);
			//	System.out.println("lastseen Date in LastSeen: " + joinString1);
			}
			System.out.println("lastseen Date in LastSeen: " + joinString);
		Assert.assertEquals(imageDate, joinString);
		Reporter.log("<B><font color = 'blue'> ==> -</font> Image Date = "+" "+imageDate+"    ::    " + "Last Seeen Date = "+joinString+" "+" are same == PASS");

		}
		catch (Exception e) {
			 Reporter.log("<B><font color = 'orange'> Step 6 -</font> Oops! Looks like we don't have data for this search criteria yet.");
		}
/*		//running longest
		
		Reporter.log("");
		Reporter.log("<B><font color = 'green'> Running longest field -</font> ");
	    
		helper.Scrollintoview(clearSearchField);
	    helper.waitFor(clearSearchField);
		helper.highLightElement(driver, clearSearchField);
		helper.jsCLick(clearSearchField);
		Reporter.log("<B><font color = 'orange'> Step 1 -</font> Clicked On clear search.");
		
		helper.waitFor(sortBy_DropDown);
		helper.highLightElement(driver, sortBy_DropDown);
		helper.jsCLick(sortBy_DropDown);
		Reporter.log("<B><font color = 'orange'> Step 2 -</font> Clicked On sortBy.");
	//	helper.waitForPageToLoad();
		
		helper.waitFor(runningLongest_Button);
		helper.highLightElement(driver, runningLongest_Button);
		helper.jsCLick(runningLongest_Button);
		Reporter.log("<B><font color = 'orange'> Step 3 -</font> Clicked On runningLongest_Button.");
		
		helper.waitFor(search_bar);
		helper.highLightElement(driver, search_bar);
		helper.jsCLick(search_bar);
		Reporter.log("<B><font color = 'orange'> Step 4 -</font> Clicked On Search Bar.");
		
		helper.waitFor(toatal_Count_Ads);
		helper.highLightElement(driver, toatal_Count_Ads);
		helper.jsCLick(toatal_Count_Ads);
		String Total_Ads_Count_runningLongest=toatal_Count_Ads.getText();
		Reporter.log("<B><font color = 'orange'> Step 5 -</font> Total_Ads_Count_runningLongest= " + Total_Ads_Count_runningLongest);
	//	helper.waitForPageToLoad();
		
		Reporter.log("");
		Reporter.log("<B><font color = 'Blue-Violet'> --1st Ad-- -</font> ");
		helper.waitFor(current_date1);
		try {
		helper.highLightElement(driver, current_date1);
		String currentDate_runningLongest=current_date1.getText();
		Reporter.log("<B><font color = 'blue'> ==> -</font>  RunningLongest Image Date in Instagram DashBoard= " + currentDate_runningLongest);
		
		helper.Scrollintoview(showAnalytics_Button1);
		helper.waitFor(showAnalytics_Button1);
		helper.highLightElement(driver, showAnalytics_Button1);
		helper.jsCLick(showAnalytics_Button1);
		Reporter.log("<B><font color = 'blue'> ==> -</font> Clicked on showAnalytics Button");
		
		Set<String> S3=driver.getWindowHandles();
	    Iterator<String>it2=S3.iterator();
	    String parent2=it2.next();
	    String child2=it2.next();
	    
	    driver.switchTo().window(child2);
	    
	 //   helper.waitForPageToLoad();
	    helper.waitFor(total_Running_Days);
	    helper.highLightElement(driver, total_Running_Days);
	    total_Running_Days.click();
	    String total_number_Running_Days = total_Running_Days.getText();
	    System.out.println("total_number_Running_Days : " + total_number_Running_Days);
	    Reporter.log("<B><font color = 'blue'> ==> -</font> Clicked on total_number_Running_Days = " +  total_number_Running_Days);
	    
	    driver.close();
	    
	    driver.switchTo().window(parent2);
	    
		}
		catch (Exception e) {
			Reporter.log("<B><font color = 'green'> Running longest field -</font> ");
		}
		
		Reporter.log("");
		Reporter.log("<B><font color = 'Blue-Violet'> --2nd Ad-- -</font> ");
		
		helper.waitFor(current_date1);
		try {
		helper.highLightElement(driver, current_date1);
		String currentDate_runningLongest=current_date1.getText();
		Reporter.log("<B><font color = 'red'> ==> -</font> RunningLongest Image Date in Instagram DashBoard= " + currentDate_runningLongest);
		
		helper.Scrollintoview(showAnalytics_Button2);
		helper.waitFor(showAnalytics_Button2);
		helper.highLightElement(driver, showAnalytics_Button2);
		helper.jsCLick(showAnalytics_Button2);
		Reporter.log("<B><font color = 'red'> ==> -</font> Clicked on showAnalytics Button");
		
		Set<String> S3=driver.getWindowHandles();
	    Iterator<String>it2=S3.iterator();
	    String parent2=it2.next();
	    String child2=it2.next();
	    
	    driver.switchTo().window(child2);
	    
	 //   helper.waitForPageToLoad();
	    helper.waitFor(total_Running_Days);
	    helper.highLightElement(driver, total_Running_Days);
	    total_Running_Days.click();
	    String total_number_Running_Days = total_Running_Days.getText();
	    System.out.println("total_number_Running_Days : " + total_number_Running_Days);
	    Reporter.log("<B><font color = 'red'> ==> -</font> Clicked on total_number_Running_Days = " +  total_number_Running_Days);
	    
	    driver.close();
	    
	    driver.switchTo().window(parent2);
	    
		}
		catch (Exception e) {
			Reporter.log("<B><font color = 'green'> Running longest field -</font> ");
		}
		Reporter.log("");
		Reporter.log("<B><font color = 'Blue-Violet'> --3rd Ad-- -</font> ");
		
		helper.waitFor(current_date1);
		try {
		helper.highLightElement(driver, current_date1);
		String currentDate_runningLongest=current_date1.getText();
		Reporter.log("<B><font color = 'blue'> ==> -</font> RunningLongest Image Date in Instagram DashBoard= " + currentDate_runningLongest);
		
		helper.Scrollintoview(showAnalytics_Button3);
		helper.waitFor(showAnalytics_Button3);
		helper.highLightElement(driver, showAnalytics_Button3);
		helper.jsCLick(showAnalytics_Button3);
		Reporter.log("<B><font color = 'blue'> ==> -</font> Clicked on showAnalytics Button");
		
		Set<String> S3=driver.getWindowHandles();
	    Iterator<String>it2=S3.iterator();
	    String parent2=it2.next();
	    String child2=it2.next();
	    
	    driver.switchTo().window(child2);
	    
	 //   helper.waitForPageToLoad();
	    helper.waitFor(total_Running_Days);
	    helper.highLightElement(driver, total_Running_Days);
	    total_Running_Days.click();
	    String total_number_Running_Days = total_Running_Days.getText();
	    System.out.println("total_number_Running_Days : " + total_number_Running_Days);
	    Reporter.log("<B><font color = 'blue'> ==> -</font> Clicked on total_number_Running_Days = " +  total_number_Running_Days);
	    
	    driver.close();
	    
	    driver.switchTo().window(parent2);
	    
		}
		catch (Exception e) {
			Reporter.log("<B><font color = 'red'> Running longest field -</font> ");
		}
		Reporter.log("");
		Reporter.log("<B><font color = 'Blue-Violet'> --4th Ad-- -</font> ");
		
		helper.waitFor(current_date1);
		try {
		helper.highLightElement(driver, current_date1);
		String currentDate_runningLongest=current_date1.getText();
		Reporter.log("<B><font color = 'red'> ==> -</font> RunningLongest Image Date in Instagram DashBoard= " + currentDate_runningLongest);
		
		helper.Scrollintoview(showAnalytics_Button4);
		helper.waitFor(showAnalytics_Button4);
		helper.highLightElement(driver, showAnalytics_Button4);
		helper.jsCLick(showAnalytics_Button4);
		Reporter.log("<B><font color = 'red'> ==> -</font> Clicked on showAnalytics Button");
		
		Set<String> S3=driver.getWindowHandles();
	    Iterator<String>it2=S3.iterator();
	    String parent2=it2.next();
	    String child2=it2.next();
	    
	    driver.switchTo().window(child2);
	    
	 //   helper.waitForPageToLoad();
	    helper.waitFor(total_Running_Days);
	    helper.highLightElement(driver, total_Running_Days);
	    total_Running_Days.click();
	    String total_number_Running_Days = total_Running_Days.getText();
	    System.out.println("total_number_Running_Days : " + total_number_Running_Days);
	    Reporter.log("<B><font color = 'red'> ==> -</font> Clicked on total_number_Running_Days = " +  total_number_Running_Days);
	    
	    driver.close();
	    
	    driver.switchTo().window(parent2);
	    
		}
		catch (Exception e) {
			Reporter.log("<B><font color = 'green'> Running longest field -</font> ");
		}
		
		Reporter.log("");
		Reporter.log("<B><font color = 'Blue-Violet'> --5th Ad-- -</font> ");
		
		helper.waitFor(current_date1);
		try {
		helper.highLightElement(driver, current_date1);
		String currentDate_runningLongest=current_date1.getText();
		Reporter.log("<B><font color = 'blue'> ==> -</font> RunningLongest Image Date in Instagram DashBoard= " + currentDate_runningLongest);
		
		helper.Scrollintoview(showAnalytics_Button5);
		helper.waitFor(showAnalytics_Button5);
		helper.highLightElement(driver, showAnalytics_Button5);
		helper.jsCLick(showAnalytics_Button5);
		Reporter.log("<B><font color = 'blue'> ==> -</font> Clicked on showAnalytics Button");
		
		Set<String> S3=driver.getWindowHandles();
	    Iterator<String>it2=S3.iterator();
	    String parent2=it2.next();
	    String child2=it2.next();
	    
	    driver.switchTo().window(child2);
	    
	 //   helper.waitForPageToLoad();
	    helper.waitFor(total_Running_Days);
	    helper.highLightElement(driver, total_Running_Days);
	    total_Running_Days.click();
	    String total_number_Running_Days = total_Running_Days.getText();
	    System.out.println("total_number_Running_Days : " + total_number_Running_Days);
	    Reporter.log("<B><font color = 'blue'> ==> -</font> Clicked on total_number_Running_Days = " +  total_number_Running_Days);
	    
	    driver.close();
	    
	    driver.switchTo().window(parent2);
	    
		}
		catch (Exception e) {
			Reporter.log("<B><font color = 'green'> Running longest field -</font> ");
		}
		
		Reporter.log("");
		Reporter.log("<B><font color = 'Blue-Violet'> --6th Ad-- -</font> ");
		
		helper.waitFor(current_date1);
		try {
		helper.highLightElement(driver, current_date1);
		String currentDate_runningLongest=current_date1.getText();
		Reporter.log("<B><font color = 'red'> ==> -</font> RunningLongest Image Date in Instagram DashBoard= " + currentDate_runningLongest);
		
		helper.Scrollintoview(showAnalytics_Button6);
		helper.waitFor(showAnalytics_Button6);
		helper.highLightElement(driver, showAnalytics_Button6);
		helper.jsCLick(showAnalytics_Button6);
		Reporter.log("<B><font color = 'red'> ==> -</font> Clicked on showAnalytics Button");
		
		Set<String> S3=driver.getWindowHandles();
	    Iterator<String>it2=S3.iterator();
	    String parent2=it2.next();
	    String child2=it2.next();
	    
	    driver.switchTo().window(child2);
	    
	 //   helper.waitForPageToLoad();
	    helper.waitFor(total_Running_Days);
	    helper.highLightElement(driver, total_Running_Days);
	    total_Running_Days.click();
	    String total_number_Running_Days = total_Running_Days.getText();
	    System.out.println("total_number_Running_Days : " + total_number_Running_Days);
	    Reporter.log("<B><font color = 'red'> ==> -</font> Clicked on total_number_Running_Days = " +  total_number_Running_Days);
	    
	    driver.close();
	    
	    driver.switchTo().window(parent2);
	    
		}
		catch (Exception e) {
			Reporter.log("<B><font color = 'green'> Running longest field -</font> ");
		}
	
		Reporter.log("");
		Reporter.log("<B><font color = 'Blue-Violet'> --7th Ad-- -</font> ");
		
		helper.waitFor(current_date1);
		try {
		helper.highLightElement(driver, current_date1);
		String currentDate_runningLongest=current_date1.getText();
		Reporter.log("<B><font color = 'blue'> ==> -</font> RunningLongest Image Date in Instagram DashBoard= " + currentDate_runningLongest);
		
		//
		helper.waitForPageToLoad();
	//	helper.Scrollintoview(showAnalytics_Button7);
		helper.waitFor(showAnalytics_Button7);
		helper.highLightElement(driver, showAnalytics_Button7);
		helper.jsCLick(showAnalytics_Button7);
		Reporter.log("<B><font color = 'blue'> ==> -</font> Clicked on showAnalytics Button");
		
		Set<String> S3=driver.getWindowHandles();
	    Iterator<String>it2=S3.iterator();
	    String parent2=it2.next();
	    String child2=it2.next();
	    
	    driver.switchTo().window(child2);
	    
	 //   helper.waitForPageToLoad();
	    helper.waitFor(total_Running_Days);
	    helper.highLightElement(driver, total_Running_Days);
	    total_Running_Days.click();
	    String total_number_Running_Days = total_Running_Days.getText();
	    System.out.println("total_number_Running_Days : " + total_number_Running_Days);
	    Reporter.log("<B><font color = 'blue'> ==> -</font> Clicked on total_number_Running_Days = " +  total_number_Running_Days);
	    
	    driver.close();
	    
	    driver.switchTo().window(parent2);
	    
		}
		catch (Exception e) {
			Reporter.log("<B><font color = 'green'> Running longest field -</font> ");
		}
		Reporter.log("");
		Reporter.log("<B><font color = 'Blue-Violet'> --8th Ad-- -</font> ");
		
		helper.waitFor(current_date1);
		try {
		helper.highLightElement(driver, current_date1);
		String currentDate_runningLongest=current_date1.getText();
		Reporter.log("<B><font color = 'red'> ==> -</font> RunningLongest Image Date in Instagram DashBoard= " + currentDate_runningLongest);
		
		helper.Scrollintoview(showAnalytics_Button8);
		helper.waitFor(showAnalytics_Button8);
		helper.highLightElement(driver, showAnalytics_Button8);
		helper.jsCLick(showAnalytics_Button8);
		Reporter.log("<B><font color = 'red'> ==> -</font> Clicked on showAnalytics Button");
		
		Set<String> S3=driver.getWindowHandles();
	    Iterator<String>it2=S3.iterator();
	    String parent2=it2.next();
	    String child2=it2.next();
	    
	    driver.switchTo().window(child2);
	    
	 //   helper.waitForPageToLoad();
	    helper.waitFor(total_Running_Days);
	    helper.highLightElement(driver, total_Running_Days);
	    total_Running_Days.click();
	    String total_number_Running_Days = total_Running_Days.getText();
	    System.out.println("total_number_Running_Days : " + total_number_Running_Days);
	    Reporter.log("<B><font color = 'red'> ==> -</font> Clicked on total_number_Running_Days = " +  total_number_Running_Days);
	    
	    driver.close();
	    
	    driver.switchTo().window(parent2);
	    
		}
		catch (Exception e) {
			Reporter.log("<B><font color = 'green'> Running longest field -</font> ");
		}
		
		Reporter.log("");
		Reporter.log("<B><font color = 'Blue-Violet'> --9th Ad-- -</font> ");
		helper.waitFor(current_date1);
		try {
		helper.highLightElement(driver, current_date1);
		String currentDate_runningLongest=current_date1.getText();
		Reporter.log("<B><font color = 'blue'> ==> -</font> RunningLongest Image Date in Instagram DashBoard= " + currentDate_runningLongest);
		
		helper.Scrollintoview(showAnalytics_Button9);
		helper.waitFor(showAnalytics_Button9);
		helper.highLightElement(driver, showAnalytics_Button9);
		helper.jsCLick(showAnalytics_Button9);
		Reporter.log("<B><font color = 'blue'> ==> -</font> Clicked on showAnalytics Button");
		
		Set<String> S3=driver.getWindowHandles();
	    Iterator<String>it2=S3.iterator();
	    String parent2=it2.next();
	    String child2=it2.next();
	    
	    driver.switchTo().window(child2);
	    
	 //   helper.waitForPageToLoad();
	    helper.waitFor(total_Running_Days);
	    helper.highLightElement(driver, total_Running_Days);
	    total_Running_Days.click();
	    String total_number_Running_Days = total_Running_Days.getText();
	    System.out.println("total_number_Running_Days : " + total_number_Running_Days);
	    Reporter.log("<B><font color = 'blue'> ==> -</font> Clicked on total_number_Running_Days = " +  total_number_Running_Days);
	    
	    driver.close();
	    
	    driver.switchTo().window(parent2);
	    
		}
		catch (Exception e) {
			Reporter.log("<B><font color = 'green'> Running longest field -</font> ");
		}
		
		Reporter.log("");
		Reporter.log("<B><font color = 'Blue-Violet'> --10th Ad-- -</font> ");
		helper.waitFor(current_date1);
		try {
		helper.highLightElement(driver, current_date1);
		String currentDate_runningLongest=current_date1.getText();
		Reporter.log("<B><font color = 'red'> ==> -</font> RunningLongest Image Date in Instagram DashBoard= " + currentDate_runningLongest);
		
		helper.Scrollintoview(showAnalytics_Button10);
		helper.waitFor(showAnalytics_Button10);
		helper.highLightElement(driver, showAnalytics_Button10);
		helper.jsCLick(showAnalytics_Button10);
		Reporter.log("<B><font color = 'red'> ==> -</font> Clicked on showAnalytics Button");
		
		Set<String> S3=driver.getWindowHandles();
	    Iterator<String>it2=S3.iterator();
	    String parent2=it2.next();
	    String child2=it2.next();
	    
	    driver.switchTo().window(child2);
	    
	 //   helper.waitForPageToLoad();
	    helper.waitFor(total_Running_Days);
	    helper.highLightElement(driver, total_Running_Days);
	    total_Running_Days.click();
	    String total_number_Running_Days = total_Running_Days.getText();
	    System.out.println("total_number_Running_Days : " + total_number_Running_Days);
	    Reporter.log("<B><font color = 'red'> ==> -</font> Clicked on total_number_Running_Days = " +  total_number_Running_Days);
	    
	    driver.close();
	    
	    driver.switchTo().window(parent2);
	    
		}
		catch (Exception e) {
			Reporter.log("<B><font color = 'green'> Running longest field -</font> ");
		}
		Reporter.log("");
		Reporter.log("<B><font color = 'Blue-Violet'> --11th Ad-- -</font> ");
		
		helper.waitFor(current_date1);
		try {
		helper.highLightElement(driver, current_date1);
		String currentDate_runningLongest=current_date1.getText();
		Reporter.log("<B><font color = 'blue'> ==> -</font> RunningLongest Image Date in Instagram DashBoard= " + currentDate_runningLongest);
		
		helper.Scrollintoview(showAnalytics_Button10);
		helper.waitFor(showAnalytics_Button10);
		helper.highLightElement(driver, showAnalytics_Button10);
		helper.jsCLick(showAnalytics_Button10);
		Reporter.log("<B><font color = 'blue'> ==> -</font> Clicked on showAnalytics Button");
		
		Set<String> S3=driver.getWindowHandles();
	    Iterator<String>it2=S3.iterator();
	    String parent2=it2.next();
	    String child2=it2.next();
	    
	    driver.switchTo().window(child2);
	    
	 //   helper.waitForPageToLoad();
	    helper.waitFor(total_Running_Days);
	    helper.highLightElement(driver, total_Running_Days);
	    total_Running_Days.click();
	    String total_number_Running_Days = total_Running_Days.getText();
	    System.out.println("total_number_Running_Days : " + total_number_Running_Days);
	    Reporter.log("<B><font color = 'blue'> ==> -</font> Clicked on total_number_Running_Days = " +  total_number_Running_Days);
	    
	    driver.close();
	    
	    driver.switchTo().window(parent2);
	    
		}
		catch (Exception e) {
			Reporter.log("<B><font color = 'green'> Running longest field -</font> ");
		}
		
		Reporter.log("");
		Reporter.log("<B><font color = 'Blue-Violet'> --12th Ad-- -</font> ");
		helper.waitFor(current_date1);
		try {
		helper.highLightElement(driver, current_date1);
		String currentDate_runningLongest=current_date1.getText();
		Reporter.log("<B><font color = 'red'> ==> -</font> RunningLongest Image Date in Instagram DashBoard= " + currentDate_runningLongest);
		
		helper.Scrollintoview(showAnalytics_Button12);
		helper.waitFor(showAnalytics_Button12);
		helper.highLightElement(driver, showAnalytics_Button12);
		helper.jsCLick(showAnalytics_Button12);
		Reporter.log("<B><font color = 'red'> ==> -</font> Clicked on showAnalytics Button");
		
		Set<String> S3=driver.getWindowHandles();
	    Iterator<String>it2=S3.iterator();
	    String parent2=it2.next();
	    String child2=it2.next();
	    
	    driver.switchTo().window(child2);
	    
	 //   helper.waitForPageToLoad();
	    helper.waitFor(total_Running_Days);
	    helper.highLightElement(driver, total_Running_Days);
	    total_Running_Days.click();
	    String total_number_Running_Days = total_Running_Days.getText();
	    System.out.println("total_number_Running_Days : " + total_number_Running_Days);
	    Reporter.log("<B><font color = 'red'> ==> -</font> Clicked on total_number_Running_Days = " +  total_number_Running_Days);
	    
	    driver.close();
	    
	    driver.switchTo().window(parent2);
	    
		}
		catch (Exception e) {
			Reporter.log("<B><font color = 'green'> Running longest field -</font> ");
		}
	
		Reporter.log("");
		Reporter.log("<B><font color = 'Blue-Violet'> --13th Ad-- -</font> ");
		helper.waitFor(current_date1);
		try {
		helper.highLightElement(driver, current_date1);
		String currentDate_runningLongest=current_date1.getText();
		Reporter.log("<B><font color = 'blue'> ==> -</font> RunningLongest Image Date in Instagram DashBoard= " + currentDate_runningLongest);
		
		helper.Scrollintoview(showAnalytics_Button13);
		helper.waitFor(showAnalytics_Button13);
		helper.highLightElement(driver, showAnalytics_Button13);
		helper.jsCLick(showAnalytics_Button13);
		Reporter.log("<B><font color = 'blue'> ==> -</font> Clicked on showAnalytics Button");
		
		Set<String> S3=driver.getWindowHandles();
	    Iterator<String>it2=S3.iterator();
	    String parent2=it2.next();
	    String child2=it2.next();
	    
	    driver.switchTo().window(child2);
	    
	 //   helper.waitForPageToLoad();
	    helper.waitFor(total_Running_Days);
	    helper.highLightElement(driver, total_Running_Days);
	    total_Running_Days.click();
	    String total_number_Running_Days = total_Running_Days.getText();
	    System.out.println("total_number_Running_Days : " + total_number_Running_Days);
	    Reporter.log("<B><font color = 'blue'> ==> -</font> Clicked on total_number_Running_Days = " +  total_number_Running_Days);
	    
	    driver.close();
	    
	    driver.switchTo().window(parent2);
	    
		}
		catch (Exception e) {
			Reporter.log("<B><font color = 'green'> Running longest field -</font> ");
		}
		Reporter.log("");
		Reporter.log("<B><font color = 'Blue-Violet'> --14th Ad-- -</font> ");
		
		helper.waitFor(current_date1);
		try {
		helper.highLightElement(driver, current_date1);
		String currentDate_runningLongest=current_date1.getText();
		Reporter.log("<B><font color = 'red'> ==> -</font> RunningLongest Image Date in Instagram DashBoard= " + currentDate_runningLongest);
		
		helper.Scrollintoview(showAnalytics_Button14);
		helper.waitFor(showAnalytics_Button14);
		helper.highLightElement(driver, showAnalytics_Button14);
		helper.jsCLick(showAnalytics_Button14);
		Reporter.log("<B><font color = 'red'> ==> -</font> Clicked on showAnalytics Button");
		
		Set<String> S3=driver.getWindowHandles();
	    Iterator<String>it2=S3.iterator();
	    String parent2=it2.next();
	    String child2=it2.next();
	    
	    driver.switchTo().window(child2);
	    
	 //   helper.waitForPageToLoad();
	    helper.waitFor(total_Running_Days);
	    helper.highLightElement(driver, total_Running_Days);
	    total_Running_Days.click();
	    String total_number_Running_Days = total_Running_Days.getText();
	    System.out.println("total_number_Running_Days : " + total_number_Running_Days);
	    Reporter.log("<B><font color = 'red'> ==> -</font> Clicked on total_number_Running_Days = " +  total_number_Running_Days);
	    
	    driver.close();
	    
	    driver.switchTo().window(parent2);
	    
		}
		catch (Exception e) {
			Reporter.log("<B><font color = 'green'> Running longest field -</font> ");
		}
		
		Reporter.log("");
		Reporter.log("<B><font color = 'Blue-Violet'> --15th Ad-- -</font> ");
		helper.waitFor(current_date1);
		try {
		helper.highLightElement(driver, current_date1);
		String currentDate_runningLongest=current_date1.getText();
		Reporter.log("<B><font color = 'blue'> ==> -</font> RunningLongest Image Date in Instagram DashBoard= " + currentDate_runningLongest);
		
		helper.Scrollintoview(showAnalytics_Button15);
		helper.waitFor(showAnalytics_Button15);
		helper.highLightElement(driver, showAnalytics_Button15);
		helper.jsCLick(showAnalytics_Button15);
		Reporter.log("<B><font color = 'blue'> ==> -</font> Clicked on showAnalytics Button");
		
		Set<String> S3=driver.getWindowHandles();
	    Iterator<String>it2=S3.iterator();
	    String parent2=it2.next();
	    String child2=it2.next();
	    
	    driver.switchTo().window(child2);
	    
	 //   helper.waitForPageToLoad();
	    helper.waitFor(total_Running_Days);
	    helper.highLightElement(driver, total_Running_Days);
	    total_Running_Days.click();
	    String total_number_Running_Days = total_Running_Days.getText();
	    System.out.println("total_number_Running_Days : " + total_number_Running_Days);
	    Reporter.log("<B><font color = 'blue'> ==> -</font> Clicked on total_number_Running_Days = " +  total_number_Running_Days);
	    
	    driver.close();
	    
	    driver.switchTo().window(parent2);
	    
		}
		catch (Exception e) {
			Reporter.log("<B><font color = 'green'> Running longest field -</font> ");
		}
		
		helper.waitFor(current_date1);
		try {
		helper.highLightElement(driver, current_date1);
		String currentDate_runningLongest=current_date1.getText();
		Reporter.log("<B><font color = 'orange'> Step 6 -</font> RunningLongest Image Date in Instagram DashBoard= " + currentDate_runningLongest);
		
		helper.Scrollintoview(showAnalytics_Button15);
		helper.waitFor(showAnalytics_Button15);
		helper.highLightElement(driver, showAnalytics_Button15);
		helper.jsCLick(showAnalytics_Button15);
		Reporter.log("<B><font color = 'orange'> Step 7-</font> Clicked on showAnalytics Button");
		
		Set<String> S3=driver.getWindowHandles();
	    Iterator<String>it2=S3.iterator();
	    String parent2=it2.next();
	    String child2=it2.next();
	    
	    driver.switchTo().window(child2);
	    
	 //   helper.waitForPageToLoad();
	    helper.waitFor(total_Running_Days);
	    helper.highLightElement(driver, total_Running_Days);
	    total_Running_Days.click();
	    String total_number_Running_Days = total_Running_Days.getText();
	    System.out.println("total_number_Running_Days : " + total_number_Running_Days);
	    Reporter.log("<B><font color = 'orange'> Step 8 -</font> Clicked on total_number_Running_Days = " +  total_number_Running_Days);
	    
	    driver.close();
	    
	    driver.switchTo().window(parent2);
	    
		}
		catch (Exception e) {
			Reporter.log("<B><font color = 'green'> Running longest field -</font> ");
		}
		
	 
		Reporter.log("");
		Reporter.log("<B><font color = 'green'> Domain Register date field -</font> ");
	    
	    //domain register date
	    
	    helper.Scrollintoview(clearSearchField);
	    helper.waitFor(clearSearchField);
		helper.highLightElement(driver, clearSearchField);
		helper.jsCLick(clearSearchField);
		Reporter.log("<B><font color = 'orange'> Step 1 -</font> Clicked On clear search.");
		
		helper.waitFor(sortBy_DropDown);
		helper.highLightElement(driver, sortBy_DropDown);
		helper.jsCLick(sortBy_DropDown);
		Reporter.log("<B><font color = 'orange'> Step 2 -</font> Clicked On sortBy.");
	//	helper.waitForPageToLoad();
		
		helper.waitFor(domain_Reg_Date_Button);
		helper.highLightElement(driver, domain_Reg_Date_Button);
		helper.jsCLick(domain_Reg_Date_Button);
		Reporter.log("<B><font color = 'orange'> Step 3 -</font> Clicked On domain_Reg_Date_Button.");
		
		helper.waitFor(search_bar);
		helper.highLightElement(driver, search_bar);
		helper.jsCLick(search_bar);
		Reporter.log("<B><font color = 'orange'> Step 4 -</font> Clicked On Search Bar.");
		
		
		helper.waitFor(toatal_Count_Ads);
		helper.highLightElement(driver, toatal_Count_Ads);
		helper.jsCLick(toatal_Count_Ads);
		String Total_Ads_Count_DomainRegDate=toatal_Count_Ads.getText();
		Reporter.log("<B><font color = 'orange'> Step 5 -</font> Total_Ads_Count_newest= " + Total_Ads_Count_DomainRegDate);
	//	helper.waitForPageToLoad();
		
		Reporter.log("");
		Reporter.log("<B><font color = 'Blue-Violet'> --1st Ad-- -</font> ");
		
		helper.Scrollintoview(current_date1);
		helper.waitFor(current_date1);
		try {
		helper.highLightElement(driver, current_date1);
		String currentDate_DomainRegDate=current_date1.getText();
		Reporter.log("<B><font color = 'blue'> ==> -</font> CurrentDate_DomainRegDate Image in Instagram DashBoard= " + currentDate_DomainRegDate);
		
		helper.Scrollintoview(showAnalytics_Button1);
		helper.waitFor(showAnalytics_Button1);
		helper.highLightElement(driver, showAnalytics_Button1);
		helper.jsCLick(showAnalytics_Button1);
		Reporter.log("<B><font color = 'blue'> ==> -</font> Clicked on showAnalytics Button");
		
		Set<String> S4=driver.getWindowHandles();
	    Iterator<String>it3=S4.iterator();
	    String parent3=it3.next();
	    String child3=it3.next();
		
	    driver.switchTo().window(child3);
		
	    helper.waitForPageToLoad();
		helper.waitFor(Domain_Rgsd_Date);
		helper.highLightElement(driver, Domain_Rgsd_Date);
		Domain_Rgsd_Date.click();
		String actual_Domain_reg_date1 = Domain_Rgsd_Date.getText();
		System.out.println("actual_Domain_reg_date : " + actual_Domain_reg_date1);
		Reporter.log("<B><font color = 'blue'> ==> -</font> Clicked on Domain Registration Date = " + actual_Domain_reg_date1);
		
		driver.close();
		
		driver.switchTo().window(parent3);
		}
		catch (Exception e) {
			Reporter.log("<B><font color = 'green'> Domain Registration Date -</font> ");
		}
		
		Reporter.log("");
		Reporter.log("<B><font color = 'Blue-Violet'> --2nd Ad-- -</font> ");
		
		helper.Scrollintoview(current_date2);
		helper.waitFor(current_date2);
		try {
		helper.highLightElement(driver, current_date2);
		String currentDate_DomainRegDate=current_date2.getText();
		Reporter.log("<B><font color = 'blue'> ==> -</font> CurrentDate_DomainRegDate Image in Instagram DashBoard= " + currentDate_DomainRegDate);
		
		helper.Scrollintoview(showAnalytics_Button2);
		helper.waitFor(showAnalytics_Button2);
		helper.highLightElement(driver, showAnalytics_Button2);
		helper.jsCLick(showAnalytics_Button2);
		Reporter.log("<B><font color = 'blue'> ==> -</font> Clicked on showAnalytics Button");
		
		Set<String> S4=driver.getWindowHandles();
	    Iterator<String>it3=S4.iterator();
	    String parent3=it3.next();
	    String child3=it3.next();
		
	    driver.switchTo().window(child3);
		
	    helper.waitForPageToLoad();
		helper.waitFor(Domain_Rgsd_Date);
		helper.highLightElement(driver, Domain_Rgsd_Date);
		Domain_Rgsd_Date.click();
		String actual_Domain_reg_date2 = Domain_Rgsd_Date.getText();
		System.out.println("actual_Domain_reg_date : " + actual_Domain_reg_date2);
		Reporter.log("<B><font color = 'blue'> ==> -</font> Clicked on Domain Registration Date = " + actual_Domain_reg_date2);
	
		driver.close();
		
		driver.switchTo().window(parent3);
	
		}
		catch (Exception e) {
			Reporter.log("<B><font color = 'green'> Domain Registration Date -</font> ");
		}
		
		Reporter.log("");
		Reporter.log("<B><font color = 'Blue-Violet'> --3rd Ad-- -</font> ");
		
		helper.Scrollintoview(current_date3);
		helper.waitFor(current_date3);
		try {
		helper.highLightElement(driver, current_date3);
		String currentDate_DomainRegDate=current_date3.getText();
		Reporter.log("<B><font color = 'blue'> ==> -</font> CurrentDate_DomainRegDate Image in Instagram DashBoard= " + currentDate_DomainRegDate);
		
		helper.Scrollintoview(showAnalytics_Button3);
		helper.waitFor(showAnalytics_Button3);
		helper.highLightElement(driver, showAnalytics_Button3);
		helper.jsCLick(showAnalytics_Button3);
		Reporter.log("<B><font color = 'blue'> ==> -</font> Clicked on showAnalytics Button");
		
		Set<String> S4=driver.getWindowHandles();
	    Iterator<String>it3=S4.iterator();
	    String parent3=it3.next();
	    String child3=it3.next();
		
	    driver.switchTo().window(child3);
		
	    helper.waitForPageToLoad();
		helper.waitFor(Domain_Rgsd_Date);
		helper.highLightElement(driver, Domain_Rgsd_Date);
		Domain_Rgsd_Date.click();
		String actual_Domain_reg_date3 = Domain_Rgsd_Date.getText();
		System.out.println("actual_Domain_reg_date : " + actual_Domain_reg_date3);
		Reporter.log("<B><font color = 'blue'> ==> -</font> Clicked on Domain Registration Date = " + actual_Domain_reg_date3);
		
		driver.close();
		
		driver.switchTo().window(parent3);
		}
		catch (Exception e) {
			Reporter.log("<B><font color = 'green'> Domain Registration Date -</font> ");
		}
		
		Reporter.log("");
		Reporter.log("<B><font color = 'Blue-Violet'> --4th Ad-- -</font> ");
		
		helper.Scrollintoview(current_date4);
		helper.waitFor(current_date4);
		try {
		helper.highLightElement(driver, current_date4);
		String currentDate_DomainRegDate=current_date4.getText();
		Reporter.log("<B><font color = 'blue'> ==> -</font> CurrentDate_DomainRegDate Image in Instagram DashBoard= " + currentDate_DomainRegDate);
		
		helper.Scrollintoview(showAnalytics_Button4);
		helper.waitFor(showAnalytics_Button4);
		helper.highLightElement(driver, showAnalytics_Button4);
		helper.jsCLick(showAnalytics_Button4);
		Reporter.log("<B><font color = 'blue'> ==> -</font> Clicked on showAnalytics Button");
		
		Set<String> S4=driver.getWindowHandles();
	    Iterator<String>it3=S4.iterator();
	    String parent3=it3.next();
	    String child3=it3.next();
		
	    driver.switchTo().window(child3);
		
	    helper.waitForPageToLoad();
		helper.waitFor(Domain_Rgsd_Date);
		helper.highLightElement(driver, Domain_Rgsd_Date);
		Domain_Rgsd_Date.click();
		String actual_Domain_reg_date = Domain_Rgsd_Date.getText();
		System.out.println("actual_Domain_reg_date : " + actual_Domain_reg_date);
		Reporter.log("<B><font color = 'blue'> ==> -</font> Clicked on Domain Registration Date = " + actual_Domain_reg_date);
		
		driver.close();
		
		driver.switchTo().window(parent3);
		}
		catch (Exception e) {
			Reporter.log("<B><font color = 'green'> Domain Registration Date -</font> ");
		}
		
		Reporter.log("");
		Reporter.log("<B><font color = 'Blue-Violet'> --5th Ad-- -</font> ");
		
		helper.Scrollintoview(current_date5);
		helper.waitFor(current_date5);
		try {
		helper.highLightElement(driver, current_date5);
		String currentDate_DomainRegDate=current_date5.getText();
		Reporter.log("<B><font color = 'blue'> ==> -</font> CurrentDate_DomainRegDate Image in Instagram DashBoard= " + currentDate_DomainRegDate);
		
		helper.Scrollintoview(showAnalytics_Button5);
		helper.waitFor(showAnalytics_Button5);
		helper.highLightElement(driver, showAnalytics_Button5);
		helper.jsCLick(showAnalytics_Button5);
		Reporter.log("<B><font color = 'blue'> ==> -</font> Clicked on showAnalytics Button");
		
		Set<String> S4=driver.getWindowHandles();
	    Iterator<String>it3=S4.iterator();
	    String parent3=it3.next();
	    String child3=it3.next();
		
	    driver.switchTo().window(child3);
		
	    helper.waitForPageToLoad();
		helper.waitFor(Domain_Rgsd_Date);
		helper.highLightElement(driver, Domain_Rgsd_Date);
		Domain_Rgsd_Date.click();
		String actual_Domain_reg_date = Domain_Rgsd_Date.getText();
		System.out.println("actual_Domain_reg_date : " + actual_Domain_reg_date);
		Reporter.log("<B><font color = 'blue'> ==> -</font> Clicked on Domain Registration Date = " + actual_Domain_reg_date);
		
		driver.close();
		
		driver.switchTo().window(parent3);
		}
		catch (Exception e) {
			Reporter.log("<B><font color = 'green'> Domain Registration Date -</font> ");
		}
		
		Reporter.log("");
		Reporter.log("<B><font color = 'Blue-Violet'> --6th Ad-- -</font> ");
		
		helper.Scrollintoview(current_date6);
		helper.waitFor(current_date6);
		try {
		helper.highLightElement(driver, current_date6);
		String currentDate_DomainRegDate=current_date6.getText();
		Reporter.log("<B><font color = 'blue'> ==> -</font> CurrentDate_DomainRegDate Image in Instagram DashBoard= " + currentDate_DomainRegDate);
		
		helper.Scrollintoview(showAnalytics_Button6);
		helper.waitFor(showAnalytics_Button6);
		helper.highLightElement(driver, showAnalytics_Button6);
		helper.jsCLick(showAnalytics_Button6);
		Reporter.log("<B><font color = 'blue'> ==> -</font> Clicked on showAnalytics Button");
		
		Set<String> S4=driver.getWindowHandles();
	    Iterator<String>it3=S4.iterator();
	    String parent3=it3.next();
	    String child3=it3.next();
		
	    driver.switchTo().window(child3);
		
	    helper.waitForPageToLoad();
		helper.waitFor(Domain_Rgsd_Date);
		helper.highLightElement(driver, Domain_Rgsd_Date);
		Domain_Rgsd_Date.click();
		String actual_Domain_reg_date = Domain_Rgsd_Date.getText();
		System.out.println("actual_Domain_reg_date : " + actual_Domain_reg_date);
		Reporter.log("<B><font color = 'blue'> ==> -</font> Clicked on Domain Registration Date = " + actual_Domain_reg_date);
		
		driver.close();
		
		driver.switchTo().window(parent3);
		}
		catch (Exception e) {
			Reporter.log("<B><font color = 'green'> Domain Registration Date -</font> ");
		}
		Reporter.log("");
		Reporter.log("<B><font color = 'Blue-Violet'> --7th Ad-- -</font> ");
		
		helper.Scrollintoview(current_date7);
		helper.waitFor(current_date7);
		try {
		helper.highLightElement(driver, current_date7);
		String currentDate_DomainRegDate=current_date7.getText();
		Reporter.log("<B><font color = 'blue'> ==> -</font> CurrentDate_DomainRegDate Image in Instagram DashBoard= " + currentDate_DomainRegDate);
		
		helper.Scrollintoview(showAnalytics_Button7);
		helper.waitFor(showAnalytics_Button7);
		helper.highLightElement(driver, showAnalytics_Button7);
		helper.jsCLick(showAnalytics_Button7);
		Reporter.log("<B><font color = 'blue'> ==> -</font> Clicked on showAnalytics Button");
		
		Set<String> S4=driver.getWindowHandles();
	    Iterator<String>it3=S4.iterator();
	    String parent3=it3.next();
	    String child3=it3.next();
		
	    driver.switchTo().window(child3);
		
	    helper.waitForPageToLoad();
		helper.waitFor(Domain_Rgsd_Date);
		helper.highLightElement(driver, Domain_Rgsd_Date);
		Domain_Rgsd_Date.click();
		String actual_Domain_reg_date = Domain_Rgsd_Date.getText();
		System.out.println("actual_Domain_reg_date : " + actual_Domain_reg_date);
		Reporter.log("<B><font color = 'blue'> ==> -</font> Clicked on Domain Registration Date = " + actual_Domain_reg_date);
		
		driver.close();
		
		driver.switchTo().window(parent3);
		}
		catch (Exception e) {
			Reporter.log("<B><font color = 'green'> Domain Registration Date -</font> ");
		}
		
		Reporter.log("");
		Reporter.log("<B><font color = 'Blue-Violet'> --8th Ad-- -</font> ");
		
		helper.Scrollintoview(current_date8);
		helper.waitFor(current_date8);
		try {
		helper.highLightElement(driver, current_date8);
		String currentDate_DomainRegDate=current_date8.getText();
		Reporter.log("<B><font color = 'blue'> ==> -</font> CurrentDate_DomainRegDate Image in Instagram DashBoard= " + currentDate_DomainRegDate);
		
		helper.Scrollintoview(showAnalytics_Button8);
		helper.waitFor(showAnalytics_Button8);
		helper.highLightElement(driver, showAnalytics_Button8);
		helper.jsCLick(showAnalytics_Button8);
		Reporter.log("<B><font color = 'blue'> ==> -</font> Clicked on showAnalytics Button");
		
		Set<String> S4=driver.getWindowHandles();
	    Iterator<String>it3=S4.iterator();
	    String parent3=it3.next();
	    String child3=it3.next();
		
	    driver.switchTo().window(child3);
		
	    helper.waitForPageToLoad();
		helper.waitFor(Domain_Rgsd_Date);
		helper.highLightElement(driver, Domain_Rgsd_Date);
		Domain_Rgsd_Date.click();
		String actual_Domain_reg_date = Domain_Rgsd_Date.getText();
		System.out.println("actual_Domain_reg_date : " + actual_Domain_reg_date);
		Reporter.log("<B><font color = 'blue'> ==> -</font> Clicked on Domain Registration Date = " + actual_Domain_reg_date);
		
		driver.close();
		
		driver.switchTo().window(parent3);
		}
		catch (Exception e) {
			Reporter.log("<B><font color = 'green'> Domain Registration Date -</font> ");
		}
		
		Reporter.log("");
		Reporter.log("<B><font color = 'Blue-Violet'> --9th Ad-- -</font> ");
		
		helper.Scrollintoview(current_date9);
		helper.waitFor(current_date9);
		try {
		helper.highLightElement(driver, current_date9);
		String currentDate_DomainRegDate=current_date9.getText();
		Reporter.log("<B><font color = 'blue'> ==> -</font> CurrentDate_DomainRegDate Image in Instagram DashBoard= " + currentDate_DomainRegDate);
		
		helper.Scrollintoview(showAnalytics_Button9);
		helper.waitFor(showAnalytics_Button9);
		helper.highLightElement(driver, showAnalytics_Button9);
		helper.jsCLick(showAnalytics_Button9);
		Reporter.log("<B><font color = 'blue'> ==> -</font> Clicked on showAnalytics Button");
		
		Set<String> S4=driver.getWindowHandles();
	    Iterator<String>it3=S4.iterator();
	    String parent3=it3.next();
	    String child3=it3.next();
		
	    driver.switchTo().window(child3);
		
	    helper.waitForPageToLoad();
		helper.waitFor(Domain_Rgsd_Date);
		helper.highLightElement(driver, Domain_Rgsd_Date);
		Domain_Rgsd_Date.click();
		String actual_Domain_reg_date = Domain_Rgsd_Date.getText();
		System.out.println("actual_Domain_reg_date : " + actual_Domain_reg_date);
		Reporter.log("<B><font color = 'blue'> ==> -</font> Clicked on Domain Registration Date = " + actual_Domain_reg_date);
		
		driver.close();
		
		driver.switchTo().window(parent3);
		}
		catch (Exception e) {
			Reporter.log("<B><font color = 'green'> Domain Registration Date -</font> ");
		}
		
		Reporter.log("");
		Reporter.log("<B><font color = 'Blue-Violet'> --10th Ad-- -</font> ");
		
		helper.Scrollintoview(current_date10);
		helper.waitFor(current_date10);
		try {
		helper.highLightElement(driver, current_date10);
		String currentDate_DomainRegDate=current_date10.getText();
		Reporter.log("<B><font color = 'blue'> ==> -</font> CurrentDate_DomainRegDate Image in Instagram DashBoard= " + currentDate_DomainRegDate);
		
		helper.Scrollintoview(showAnalytics_Button10);
		helper.waitFor(showAnalytics_Button10);
		helper.highLightElement(driver, showAnalytics_Button10);
		helper.jsCLick(showAnalytics_Button10);
		Reporter.log("<B><font color = 'blue'> ==> -</font> Clicked on showAnalytics Button");
		
		Set<String> S4=driver.getWindowHandles();
	    Iterator<String>it3=S4.iterator();
	    String parent3=it3.next();
	    String child3=it3.next();
		
	    driver.switchTo().window(child3);
		
	    helper.waitForPageToLoad();
		helper.waitFor(Domain_Rgsd_Date);
		helper.highLightElement(driver, Domain_Rgsd_Date);
		Domain_Rgsd_Date.click();
		String actual_Domain_reg_date = Domain_Rgsd_Date.getText();
		System.out.println("actual_Domain_reg_date : " + actual_Domain_reg_date);
		Reporter.log("<B><font color = 'blue'> ==> -</font> Clicked on Domain Registration Date = " + actual_Domain_reg_date);
		
		driver.close();
		
		driver.switchTo().window(parent3);
		}
		catch (Exception e) {
			Reporter.log("<B><font color = 'green'> Domain Registration Date -</font> ");
		}
		
		Reporter.log("");
		Reporter.log("<B><font color = 'Blue-Violet'> --11th Ad-- -</font> ");
		
		helper.Scrollintoview(current_date11);
		helper.waitFor(current_date11);
		try {
		helper.highLightElement(driver, current_date11);
		String currentDate_DomainRegDate=current_date11.getText();
		Reporter.log("<B><font color = 'blue'> ==> -</font> CurrentDate_DomainRegDate Image in Instagram DashBoard= " + currentDate_DomainRegDate);
		
		helper.Scrollintoview(showAnalytics_Button11);
		helper.waitFor(showAnalytics_Button11);
		helper.highLightElement(driver, showAnalytics_Button11);
		helper.jsCLick(showAnalytics_Button11);
		Reporter.log("<B><font color = 'blue'> ==> -</font> Clicked on showAnalytics Button");
		
		Set<String> S4=driver.getWindowHandles();
	    Iterator<String>it3=S4.iterator();
	    String parent3=it3.next();
	    String child3=it3.next();
		
	    driver.switchTo().window(child3);
		
	    helper.waitForPageToLoad();
		helper.waitFor(Domain_Rgsd_Date);
		helper.highLightElement(driver, Domain_Rgsd_Date);
		Domain_Rgsd_Date.click();
		String actual_Domain_reg_date = Domain_Rgsd_Date.getText();
		System.out.println("actual_Domain_reg_date : " + actual_Domain_reg_date);
		Reporter.log("<B><font color = 'blue'> ==> -</font> Clicked on Domain Registration Date = " + actual_Domain_reg_date);
		
		driver.close();
		
		driver.switchTo().window(parent3);
		}
		catch (Exception e) {
			Reporter.log("<B><font color = 'green'> Domain Registration Date -</font> ");
		}
		
		Reporter.log("");
		Reporter.log("<B><font color = 'Blue-Violet'> --12th Ad-- -</font> ");
		
		helper.Scrollintoview(current_date12);
		helper.waitFor(current_date12);
		try {
		helper.highLightElement(driver, current_date12);
		String currentDate_DomainRegDate=current_date12.getText();
		Reporter.log("<B><font color = 'blue'> ==> -</font> CurrentDate_DomainRegDate Image in Instagram DashBoard= " + currentDate_DomainRegDate);
		
		helper.Scrollintoview(showAnalytics_Button12);
		helper.waitFor(showAnalytics_Button12);
		helper.highLightElement(driver, showAnalytics_Button12);
		helper.jsCLick(showAnalytics_Button12);
		Reporter.log("<B><font color = 'blue'> ==> -</font> Clicked on showAnalytics Button");
		
		Set<String> S4=driver.getWindowHandles();
	    Iterator<String>it3=S4.iterator();
	    String parent3=it3.next();
	    String child3=it3.next();
		
	    driver.switchTo().window(child3);
		
	    helper.waitForPageToLoad();
		helper.waitFor(Domain_Rgsd_Date);
		helper.highLightElement(driver, Domain_Rgsd_Date);
		Domain_Rgsd_Date.click();
		String actual_Domain_reg_date = Domain_Rgsd_Date.getText();
		System.out.println("actual_Domain_reg_date : " + actual_Domain_reg_date);
		Reporter.log("<B><font color = 'blue'> ==> -</font> Clicked on Domain Registration Date = " + actual_Domain_reg_date);
		
		driver.close();
		
		driver.switchTo().window(parent3);
		}
		catch (Exception e) {
			Reporter.log("<B><font color = 'green'> Domain Registration Date -</font> ");
		}
		
		Reporter.log("");
		Reporter.log("<B><font color = 'Blue-Violet'> --13th Ad-- -</font> ");
		
		helper.Scrollintoview(current_date13);
		helper.waitFor(current_date13);
		try {
		helper.highLightElement(driver, current_date13);
		String currentDate_DomainRegDate=current_date13.getText();
		Reporter.log("<B><font color = 'blue'> ==> -</font> CurrentDate_DomainRegDate Image in Instagram DashBoard= " + currentDate_DomainRegDate);
		
		helper.Scrollintoview(showAnalytics_Button13);
		helper.waitFor(showAnalytics_Button13);
		helper.highLightElement(driver, showAnalytics_Button13);
		helper.jsCLick(showAnalytics_Button13);
		Reporter.log("<B><font color = 'blue'> ==> -</font> Clicked on showAnalytics Button");
		
		Set<String> S4=driver.getWindowHandles();
	    Iterator<String>it3=S4.iterator();
	    String parent3=it3.next();
	    String child3=it3.next();
		
	    driver.switchTo().window(child3);
		
	    helper.waitForPageToLoad();
		helper.waitFor(Domain_Rgsd_Date);
		helper.highLightElement(driver, Domain_Rgsd_Date);
		Domain_Rgsd_Date.click();
		String actual_Domain_reg_date = Domain_Rgsd_Date.getText();
		System.out.println("actual_Domain_reg_date : " + actual_Domain_reg_date);
		Reporter.log("<B><font color = 'blue'> ==> -</font> Clicked on Domain Registration Date = " + actual_Domain_reg_date);
		
		driver.close();
		
		driver.switchTo().window(parent3);
		}
		catch (Exception e) {
			Reporter.log("<B><font color = 'green'> Domain Registration Date -</font> ");
		}
		
		Reporter.log("");
		Reporter.log("<B><font color = 'Blue-Violet'> --14th Ad-- -</font> ");
		
		helper.Scrollintoview(current_date14);
		helper.waitFor(current_date14);
		try {
		helper.highLightElement(driver, current_date14);
		String currentDate_DomainRegDate=current_date14.getText();
		Reporter.log("<B><font color = 'blue'> ==> -</font> CurrentDate_DomainRegDate Image in Instagram DashBoard= " + currentDate_DomainRegDate);
		
		helper.Scrollintoview(showAnalytics_Button14);
		helper.waitFor(showAnalytics_Button14);
		helper.highLightElement(driver, showAnalytics_Button14);
		helper.jsCLick(showAnalytics_Button14);
		Reporter.log("<B><font color = 'blue'> ==> -</font> Clicked on showAnalytics Button");
		
		Set<String> S4=driver.getWindowHandles();
	    Iterator<String>it3=S4.iterator();
	    String parent3=it3.next();
	    String child3=it3.next();
		
	    driver.switchTo().window(child3);
		
	    helper.waitForPageToLoad();
		helper.waitFor(Domain_Rgsd_Date);
		helper.highLightElement(driver, Domain_Rgsd_Date);
		Domain_Rgsd_Date.click();
		String actual_Domain_reg_date = Domain_Rgsd_Date.getText();
		System.out.println("actual_Domain_reg_date : " + actual_Domain_reg_date);
		Reporter.log("<B><font color = 'blue'> ==> -</font> Clicked on Domain Registration Date = " + actual_Domain_reg_date);
		
		driver.close();
		
		driver.switchTo().window(parent3);
		}
		catch (Exception e) {
			Reporter.log("<B><font color = 'green'> Domain Registration Date -</font> ");
		}
		
		Reporter.log("");
		Reporter.log("<B><font color = 'Blue-Violet'> --15th Ad-- -</font> ");
		
		helper.Scrollintoview(current_date15);
		helper.waitFor(current_date15);
		try {
		helper.highLightElement(driver, current_date15);
		String currentDate_DomainRegDate=current_date15.getText();
		Reporter.log("<B><font color = 'blue'> ==> -</font> CurrentDate_DomainRegDate Image in Instagram DashBoard= " + currentDate_DomainRegDate);
		
		helper.Scrollintoview(showAnalytics_Button15);
		helper.waitFor(showAnalytics_Button15);
		helper.highLightElement(driver, showAnalytics_Button15);
		helper.jsCLick(showAnalytics_Button15);
		Reporter.log("<B><font color = 'blue'> ==> -</font> Clicked on showAnalytics Button");
		
		Set<String> S4=driver.getWindowHandles();
	    Iterator<String>it3=S4.iterator();
	    String parent3=it3.next();
	    String child3=it3.next();
		
	    driver.switchTo().window(child3);
		
	    helper.waitForPageToLoad();
		helper.waitFor(Domain_Rgsd_Date);
		helper.highLightElement(driver, Domain_Rgsd_Date);
		Domain_Rgsd_Date.click();
		String actual_Domain_reg_date = Domain_Rgsd_Date.getText();
		System.out.println("actual_Domain_reg_date : " + actual_Domain_reg_date);
		Reporter.log("<B><font color = 'blue'> ==> -</font> Clicked on Domain Registration Date = " + actual_Domain_reg_date);
		
		driver.close();
		
		driver.switchTo().window(parent3);
		}
		catch (Exception e) {
			Reporter.log("<B><font color = 'green'> Domain Registration Date -</font> ");
		}*/
	}
}
