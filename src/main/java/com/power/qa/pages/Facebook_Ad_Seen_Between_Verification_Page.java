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

@SuppressWarnings("static-access")
public class Facebook_Ad_Seen_Between_Verification_Page extends BasePage 
{

	Helpers helper=new Helpers();

	public Facebook_Ad_Seen_Between_Verification_Page(WebDriver driver) throws InterruptedException 
	{
		super(TestBase.getDriver());
	}

	@FindBy(xpath = "//img[@class='active_pg_logo img-fluid']")
	WebElement Logo;

	@FindBy(css = "a#fb_ads > img")
	WebElement fb;

	@FindBy(xpath = "//span[@class='dropdown-label dropdown_filter']")
	WebElement sortBy;

	@FindBy(xpath = "//a[normalize-space()='Newest']")
	WebElement SortBy_Newest;

	@FindBy(id = "search-ads")
	WebElement searchButton;

	@FindBy(id = "ads_timepicker")
	WebElement adSeenbetweenfilter;

	@FindBy(xpath = "//li[@class='active']")
	WebElement adSeenbetween_all;

	@FindBy(id ="totaladscount")
	WebElement totaladscount_ad;

	@FindBy(xpath ="//div[@class='ad_date']")
	WebElement Date1;

	@FindBy(xpath = "//a[text()='Show Analytics']")
	WebElement showAnalytics;

	@FindBy(xpath = "//div[@id='last_seen1']")
	WebElement lastSeen;

	@FindBy(css = ".clear_filters")
	WebElement Clear_Filters;

	@FindBy(xpath = "//li[@class='active']")
	WebElement adSeenbetween_today;

	@FindBy(xpath = "(//li[text()='Yesterday'])[1]")
	WebElement adSeenbetween_yesterday;

	@FindBy(xpath = "//li[text()='Last Seven Days']")  // dev site
//	@FindBy(xpath = "//li[text()='Last 7 Days']")  // main site
	WebElement adSeenbetween_last_Seven_Days;

	//@FindBy(xpath = "//body/div[6]/div[1]/ul[1]/li[5]")  //dev site
	@FindBy(xpath = "//li[text()='Last Thirty Days']")
//	@FindBy(xpath = "//li[text()='Last 30 Days']")		//main site
	WebElement adSeenBetween_last_Thirty_days;

	@FindBy(xpath = "(//li[text()='This Month'])[1]")
	WebElement adSeenBetween_this_month;

	@FindBy(xpath = "(//li[text()='Last Month'])[1]")
	WebElement adSeenBetween_last_month;

	@FindBy(xpath = "(//li[text()='Custom Range'])[1]")
	WebElement adSeenBetween_customrange;

//	@FindBy(xpath = "(//td[@class='weekend available' and @data-title='r1c0'])[1]")
	@FindBy(xpath="//td[text()='1']")
	WebElement adSeenBetween_Start_range1;

//	@FindBy(xpath = "//td[@class='available in-range' and @data-title='r4c3' and text()='26']")
	 @FindBy(xpath="//td[text()='15']")
	 WebElement adSeenBetween_end_range2;
	


	public void FacebookPage()
	{
		Reporter.log("<B><font color = 'orange'> Step1 -</font> Logged into PowerAdSpy Application");
		String Page_titel = driver.getTitle();
		System.out.println(Page_titel);
		Reporter.log("<B><font color = 'orange'> Step2 -</font> I am on the page :" + Page_titel);

		helper.waitForPageToLoad();
		helper.waitFor(Logo);
		helper.highLightElement(driver, Logo);
		Assert.assertTrue(Logo.isDisplayed(), "Power Ad Spy Logo is Dispalyed");
		Reporter.log("<B><font color = 'orange'> Step3 -</font> Power Ad Spy Logo is Displayed");

		helper.waitFor(fb);
		helper.highLightElement(driver, fb);
		fb.click();
		Assert.assertTrue(fb.isDisplayed(), "PowerAdSpy | Facebook Dashboard");
		Reporter.log("<B><font color = 'orange'> Step4 -</font> Clicked On FaceBook Icon");
		helper.waitForPageToLoad();

		Reporter.log("       " );
		Reporter.log("<B><font color = 'red'>  - ShortBy Newest Step will Start from here </font>  ");
		helper.waitFor(sortBy);
		helper.highLightElement(driver, sortBy);
		sortBy.click();
		Reporter.log("<B><font color = 'orange'> Step1 -</font> Clicked On sortBy Icon");

		helper.waitFor(SortBy_Newest);
		helper.highLightElement(driver, SortBy_Newest);
		SortBy_Newest.click();
		Reporter.log("<B><font color = 'orange'> Step2 -</font> Clicked On SortBy Newest Icon");

		helper.waitFor(searchButton);
		helper.highLightElement(driver, searchButton);
		searchButton.click();
		Reporter.log("<B><font color = 'orange'> Step3 -</font> Clicked On search Button Icon");
		helper.waitForPageToLoad();
	}


	public void AdSeenBetween_All() throws InterruptedException
	{
		String lastimageDate1= null;
		System.out.println();
		System.out.println("-ShortBy Newest -Ad Seen Between -All:");
		Reporter.log("<B><font color = 'red'>  -ShortBy Newest -Ad Seen Between All Step will Start from here  </font> ");
		helper.waitFor(adSeenbetweenfilter);
		helper.highLightElement(driver, adSeenbetweenfilter);
		adSeenbetweenfilter.click();
		Reporter.log("<B><font color = 'orange'> Step4 -</font> Clicked On Ad Seen between filter Icon");

		helper.waitFor(adSeenbetween_all);
		helper.highLightElement(driver, adSeenbetween_all);
		adSeenbetween_all.click();
		Reporter.log("<B><font color = 'orange'> Step5 -</font> Clicked On Ad Seen between All Icon");

		helper.waitFor(searchButton);
		helper.highLightElement(driver, searchButton);
		searchButton.click();
		Reporter.log("<B><font color = 'orange'> Step6 -</font> Clicked On search Button Icon");
		helper.waitForPageToLoad();

		String totaladscount=totaladscount_ad.getText();
		System.out.println("Totaladscount: "+totaladscount);
		Reporter.log("<B><font color = 'orange'> Step7 -</font>  Total Ad Count is :" +totaladscount);

		String imageDate=Date1.getText();
		Reporter.log("<B><font color = 'orange'> Step9 -</font> Image Date is :"+imageDate);
		System.out.println("Current Image Date: "+imageDate);
		
		try {
			helper.waitFor(showAnalytics);
			helper.highLightElement(driver, showAnalytics);
			helper.jsScrollintoview(showAnalytics);
			showAnalytics.click();
			Reporter.log("<B><font color = 'orange'> Step8 -</font> Clicked On Show Analytics Icon");
			helper.waitForPageToLoad();

			String parent=driver.getWindowHandle();
			Set<String>s=driver.getWindowHandles();
			Iterator<String> I1= s.iterator();
			while(I1.hasNext())
			{
				String child_window=I1.next();
				if(!parent.equals(child_window))
				{
					driver.switchTo().window(child_window);
					helper.waitForPageToLoad();
					System.out.println(driver.switchTo().window(child_window).getTitle());
					lastimageDate1 = lastSeen.getText();
					System.out.println("Analytics Image Last Seen Date: "+lastimageDate1);
					Reporter.log("<B><font color = 'orange'> Step10 -</font> Image Date of Last Seen is :"+lastimageDate1);
					driver.close();
				}
			}

			driver.switchTo().window(parent);
			String	date_format_lastseen = null;
			   String[] splitString = lastimageDate1.split(" ");
			      for(int i=0;i<splitString.length-2;i++) {
			    //    String actualDate=splitString[i]; 
			    	  date_format_lastseen= splitString[i+1]+" "+ splitString[i]+" " + splitString[i+2];
			       
			      //  System.out.println("splitString : " + splitString[i]);
			        System.out.println("Change Date format lastseen Date: " + date_format_lastseen);
			        System.out.println("Image last seen Date: " + imageDate);
			      }
			  
			    	Assert.assertEquals(imageDate, date_format_lastseen);
				    Reporter.log("<B><font color = 'orange'> Step12 -</font> Both Last Seen Date are Matching in Assert Pass :"+imageDate+ " == " +date_format_lastseen);
				    System.out.println("Both Last Seen Date are Matching in Assert Pass :"+imageDate+ " == " +date_format_lastseen);
		} 
		catch (Exception e)
		{

			// TODO: handle exception
			System.out.println("Image is not able:   Opp!Looks like we don't have data for this search criteria yet.\r\n"
					+ "But don't worry, Spidey is on the crawl now and it will scrape ads for this search criteria for you ASAP.");

			Reporter.log("<B><font color = 'orange'> Step9 -</font> Image is not able:   Opp!Looks like we don't have data for this search criteria yet.\\r\\n\"\r\n"
					+ "				+ \"But don't worry, Spidey is on the crawl now and it will scrape ads for this search criteria for you ASAP.");
		}

		/*	helper.waitFor(Clear_Filters);
		helper.highLightElement(driver, Clear_Filters);
		helper.jsScrollintoview(Clear_Filters);
		Clear_Filters.click();
		Reporter.log("<B><font color = 'orange'> Step10 -</font> Clicked On Clear Filters Icon");
		helper.waitForPageToLoad();*/


	}
	public void AdSeenBetween_Today() throws InterruptedException
	{

		System.out.println();
		System.out.println("-ShortBy Newest -Ad Seen Between -Today:");
		Reporter.log("      ");
		Reporter.log("<B><font color = 'red'>  - ShortBy Newest Step will Start from here </font>  ");
		helper.waitFor(sortBy);
		helper.highLightElement(driver, sortBy);
		helper.jsScrollintoview(sortBy);
		sortBy.click();
		Reporter.log("<B><font color = 'orange'> Step1 -</font> Clicked On sortBy Icon");

		helper.waitFor(SortBy_Newest);
		helper.highLightElement(driver, SortBy_Newest);
		SortBy_Newest.click();
		Reporter.log("<B><font color = 'orange'> Step2 -</font> Clicked On SortBy Newest Icon");

		helper.waitFor(searchButton);
		helper.highLightElement(driver, searchButton);
		helper.jsScrollintoview(searchButton);
		searchButton.click();
		Reporter.log("<B><font color = 'orange'> Step3 -</font> Clicked On Search Button Icon");
		helper.waitForPageToLoad();

		Reporter.log("<B><font color = 'red'> -ShortBy Newest -Ad Seen Between Today Step will Start from here </font> ");
		helper.waitFor(adSeenbetweenfilter);
		helper.highLightElement(driver, adSeenbetweenfilter);
		helper.jsScrollintoview(adSeenbetweenfilter);
		adSeenbetweenfilter.click();
		Reporter.log("<B><font color = 'orange'> Step4 -</font> Clicked On Ad Seen between filter Icon");

		helper.waitFor(adSeenbetween_today);
		helper.highLightElement(driver, adSeenbetween_today);
		helper.jsScrollintoview(adSeenbetween_today);
		adSeenbetween_today.click();
		Reporter.log("<B><font color = 'orange'> Step5 -</font> Clicked On Ad Seen between Today Icon");

		helper.waitFor(searchButton);
		helper.highLightElement(driver, searchButton);
		helper.jsScrollintoview(searchButton);
		searchButton.click();
		Reporter.log("<B><font color = 'orange'> Step6 -</font> Clicked On search Button Icon");
		helper.waitForPageToLoad();

		String totaladscount=totaladscount_ad.getText();
		System.out.println("Totaladscount: "+totaladscount);
		Reporter.log("<B><font color = 'orange'> Step7 -</font>  Total Ad Count is :"+ totaladscount);
		
		String  imageDate= Date1.getText();
		Reporter.log("<B><font color = 'orange'> Step9 -</font> Image Date is :"+imageDate);
		System.out.println("Current Date: "+imageDate);
		  try {
		helper.waitFor(showAnalytics);
		helper.highLightElement(driver, showAnalytics);
		helper.jsScrollintoview(showAnalytics);
		showAnalytics.click();
		Reporter.log("<B><font color = 'orange'> Step8 -</font> Clicked On Show Analytics Icon");
		helper.waitForPageToLoad();
		
		Set<String> S2=driver.getWindowHandles();
	    Iterator<String>it1=S2.iterator();
	    String parent1=it1.next();
	    String child1=it1.next();
	    
	    driver.switchTo().window(child1);

	    helper.waitForPageToLoad();
	    helper.waitFor(lastSeen);
	    helper.highLightElement(driver, lastSeen);
	    String lastSeenDate_today = lastSeen.getText();
	    Reporter.log("<B><font color = 'orange'> Step 8 -</font> Last_Seen_childWindow AdDetails Page= " +  lastSeenDate_today);
	    System.out.println("lastSeenDate_today: "+lastSeenDate_today);
	    
	    
	    driver.close();
	   
	    driver.switchTo().window(parent1);
	//    System.out.println("lastSeenDate_today: "+lastSeenDate_today);
	    

	    String joinString = null;
	     //  String[] actualDate = null;
	       
	       String[] splitString = lastSeenDate_today.split(" ");
	       for(int i=0;i<splitString.length-2;i++) {
	         String actualDate=splitString[i]; 
	         joinString= splitString[i+1]+" "+ splitString[i]+" " + splitString[i+2];
	       //  System.out.println("splitString : " + splitString[i]);
	         System.out.println("lastseen Date in child Window: " + joinString);
	       }
	     Assert.assertEquals(imageDate, joinString);
	     Reporter.log("<B><font color = 'orange'> Step12 -</font> Both Last Seen Date are Matching in Assert Pass :"+imageDate+ " == " +joinString);
		    System.out.println("Both Last Seen Date are Matching in Assert Pass :"+imageDate+ " == " +joinString);
	    }
	    catch(Exception e) {
	    	System.out.println("Image is not able:   Opp!Looks like we don't have data for this search criteria yet.\r\n"
					+ "But don't worry, Spidey is on the crawl now and it will scrape ads for this search criteria for you ASAP.");

			Reporter.log("<B><font color = 'orange'> Step8 -</font> Image is not able:   Opp! Looks like we don't have data for this search criteria yet."
					+ "   But don't worry, Spidey is on the crawl now and it will scrape ads for this search criteria for you ASAP.");
	    }


	}

	public void AdSeenBetween_Yesterday() throws InterruptedException
	{
		String date_format_lastseen=null;
		String lastimageDate1=null;
		
		System.out.println();
		Reporter.log("      ");
		System.out.println("-ShortBy Newest -Ad Seen Between Yesterday:");
		Reporter.log("<B><font color = 'red'>  - ShortBy Newest Step will Start from here </font>  ");
		helper.waitFor(sortBy);
		helper.highLightElement(driver, sortBy);
		helper.jsScrollintoview(sortBy);
		sortBy.click();
		Reporter.log("<B><font color = 'orange'> Step1 -</font> Clicked On sortBy Icon");

		helper.waitFor(SortBy_Newest);
		helper.highLightElement(driver, SortBy_Newest);
		SortBy_Newest.click();
		Reporter.log("<B><font color = 'orange'> Step2 -</font> Clicked On SortBy Newest Icon");

		helper.waitFor(searchButton);
		helper.highLightElement(driver, searchButton);
		helper.jsScrollintoview(searchButton);
		searchButton.click();
		Reporter.log("<B><font color = 'orange'> Step3 -</font> Clicked On search Button Icon");
		helper.waitForPageToLoad();

		Reporter.log("<B><font color = 'red'>  - ShortBy Newest -Ad Seen Between Yesterday Step will Start from here </font> ");
		helper.waitFor(adSeenbetweenfilter);
		helper.highLightElement(driver, adSeenbetweenfilter);
		helper.jsScrollintoview(adSeenbetweenfilter);
		adSeenbetweenfilter.click();
		Reporter.log("<B><font color = 'orange'> Step4 -</font> Clicked On Ad Seen between filter Icon");

		helper.waitFor(adSeenbetween_yesterday);
		helper.highLightElement(driver, adSeenbetween_yesterday);
		helper.jsScrollintoview(adSeenbetween_yesterday);
		adSeenbetween_yesterday.click();
		Reporter.log("<B><font color = 'orange'> Step5 -</font> Clicked On Ad Seen Between Yesterday Icon");

		helper.waitFor(searchButton);
		helper.highLightElement(driver, searchButton);
		helper.jsScrollintoview(searchButton);
		searchButton.click();
		Reporter.log("<B><font color = 'orange'> Step6 -</font> Clicked On Search Button Icon");
		helper.waitForPageToLoad();

		String totaladscount=totaladscount_ad.getText();
		System.out.println("Totaladscount: "+totaladscount);
		Reporter.log("<B><font color = 'orange'> Step7 -</font>  Total Ad Count is :"+ totaladscount);

		helper.waitFor(showAnalytics);
		try 
		{
			helper.highLightElement(driver, showAnalytics);
			helper.jsScrollintoview(showAnalytics);
			showAnalytics.click();
			Reporter.log("<B><font color = 'orange'> Step8 -</font> Clicked On Show Analytics Icon");
			helper.waitForPageToLoad();
			String imageDate=Date1.getText();
			Reporter.log("<B><font color = 'orange'> Step9 -</font> Image Date is :"+imageDate);
			System.out.println("Current Image Date: "+imageDate);

			String parent=driver.getWindowHandle();
			Set<String>s=driver.getWindowHandles();
			// Now iterate using Iterator
			Iterator<String> I1= s.iterator();
			while(I1.hasNext())
			{
				String child_window=I1.next();
				if(!parent.equals(child_window))
				{
					driver.switchTo().window(child_window);
					helper.waitForPageToLoad();
					System.out.println(driver.switchTo().window(child_window).getTitle());
					lastimageDate1 = lastSeen.getText();
					System.out.println("Analytics Image Last Seen Date: "+lastimageDate1);
					Reporter.log("<B><font color = 'orange'> Step10 -</font> Image Date of Last Seen is :"+lastimageDate1);

					driver.close();
				}
			}

			driver.switchTo().window(parent);
			 String[] splitString = lastimageDate1.split(" ");
		      for(int i=0;i<splitString.length-2;i++) {
		    //    String actualDate=splitString[i]; 
		    	  date_format_lastseen= splitString[i+1]+" "+ splitString[i]+" " + splitString[i+2];
		       
		      //  System.out.println("splitString : " + splitString[i]);
		        System.out.println("Change Date format lastseen Date: " + date_format_lastseen);
		        System.out.println("Image last seen Date: " + imageDate);
		      }
		  
		    	Assert.assertEquals(imageDate, date_format_lastseen);
			    Reporter.log("<B><font color = 'orange'> Step12 -</font> Both Last Seen Date are Matching in Assert Pass :"+imageDate+ " == " +date_format_lastseen);
			    System.out.println("Both Last Seen Date are Matching in Assert Pass :"+imageDate+ " == " +date_format_lastseen);
		} 
		catch (Exception e)
		{


			System.out.println("Image is not able:   Opp!Looks like we don't have data for this search criteria yet.\r\n"
					+ "But don't worry, Spidey is on the crawl now and it will scrape ads for this search criteria for you ASAP.");

			Reporter.log("<B><font color = 'orange'> Step8 -</font> Image is not able:   Opp!Looks like we don't have data for this search criteria yet."
					+ "But don't worry, Spidey is on the crawl now and it will scrape ads for this search criteria for you ASAP.");
		}
	}
	public void AdSeenBetween_Last_Seven_Days() throws InterruptedException
	{
		System.out.println();
		Reporter.log("      ");
		System.out.println("-ShortBy Ad Newest -Seen Between Last Seven Days:");

		Reporter.log("<B><font color = 'red'>  - ShortBy Newest Step will Start from here </font>  ");
		helper.waitFor(sortBy);
		helper.highLightElement(driver, sortBy);
		helper.jsScrollintoview(sortBy);
		sortBy.click();
		Reporter.log("<B><font color = 'orange'> Step1 -</font> Clicked On sortBy Icon");

		helper.waitFor(SortBy_Newest);
		helper.highLightElement(driver, SortBy_Newest);
		SortBy_Newest.click();
		Reporter.log("<B><font color = 'orange'> Step2 -</font> Clicked On SortBy Newest Icon");

		helper.waitFor(searchButton);
		helper.highLightElement(driver, searchButton);
		helper.jsScrollintoview(searchButton);
		searchButton.click();
		Reporter.log("<B><font color = 'orange'> Step3 -</font> Clicked On search Button Icon");
		helper.waitForPageToLoad();

		Reporter.log("<B><font color = 'red'>  - ShortBy Newest -Ad Seen Between Last Seven Days Step will Start from here </font> ");
		helper.waitFor(adSeenbetweenfilter);
		helper.highLightElement(driver, adSeenbetweenfilter);
		helper.jsScrollintoview(adSeenbetweenfilter);
		adSeenbetweenfilter.click();
		Reporter.log("<B><font color = 'orange'> Step4 -</font> Clicked On Ad Seen between filter Icon");

		helper.waitFor(adSeenbetween_last_Seven_Days);
		helper.highLightElement(driver, adSeenbetween_last_Seven_Days);
		helper.jsScrollintoview(adSeenbetween_last_Seven_Days);
		adSeenbetween_last_Seven_Days.click();
		Reporter.log("<B><font color = 'orange'> Step5 -</font> Clicked On Ad Seen Between Last Seven Days Icon");

		helper.waitFor(searchButton);
		helper.highLightElement(driver, searchButton);
		helper.jsScrollintoview(searchButton);
		searchButton.click();
		Reporter.log("<B><font color = 'orange'> Step6 -</font> Clicked On Search Button Icon");
		helper.waitForPageToLoad();

		String totaladscount=totaladscount_ad.getText();
		System.out.println("Totaladscount: "+totaladscount);
		Reporter.log("<B><font color = 'orange'> Step7 -</font>  Total Ad Count is :"+ totaladscount);
		
		String  imageDate= Date1.getText();
		Reporter.log("<B><font color = 'orange'> Step9 -</font> Image Date is :"+imageDate);
		System.out.println("Current Date: "+imageDate);
		  try {
		helper.waitFor(showAnalytics);
		helper.highLightElement(driver, showAnalytics);
		helper.jsScrollintoview(showAnalytics);
		showAnalytics.click();
		Reporter.log("<B><font color = 'orange'> Step8 -</font> Clicked On Show Analytics Icon");
		helper.waitForPageToLoad();
		
		Set<String> S2=driver.getWindowHandles();
	    Iterator<String>it1=S2.iterator();
	    String parent1=it1.next();
	    String child1=it1.next();
	    
	    driver.switchTo().window(child1);

	    helper.waitForPageToLoad();
	    helper.waitFor(lastSeen);
	    helper.highLightElement(driver,lastSeen);
	    helper.jsScrollintoview(lastSeen);
//	    System.out.println("Testing last Seen Adresss: "+lastSeen);
	    String   lastSeenDate_today=null;
	     lastSeenDate_today = lastSeen.getText();
	    Reporter.log("<B><font color = 'orange'> Step 8 -</font> Last_Seen_childWindow AdDetails Page= " +  lastSeenDate_today);
	    System.out.println("lastSeenDate_today: "+lastSeenDate_today);
	    
	    
	    driver.close();
	   
	    driver.switchTo().window(parent1);
	   System.out.println("lastSeenDate_today1: "+lastSeenDate_today);
	    

	    String join = null;
	     //  String[] actualDate = null;
	       
	       String[] splitString = lastSeenDate_today.split(" ");
	       for(int i=0;i<splitString.length-2;i++) {
	         String actualDate=splitString[i]; 
	         join= splitString[i+1]+" "+ splitString[i]+" " + splitString[i+2];
	       //  System.out.println("splitString : " + splitString[i]);
	         System.out.println("lastseen Date: " + join);
	       }
	     Assert.assertEquals(imageDate, join);
	     Reporter.log("<B><font color = 'orange'> Step12 -</font> Both Last Seen Date are Matching in Assert Pass :"+imageDate+ " == " +join);
		    System.out.println("Both Last Seen Date are Matching in Assert Pass :"+imageDate+ " == " +join);
	    }
	    catch(Exception e) {
	    	System.out.println("Image is not able:   Opp!Looks like we don't have data for this search criteria yet.\r\n"
					+ "But don't worry, Spidey is on the crawl now and it will scrape ads for this search criteria for you ASAP.");

			Reporter.log("<B><font color = 'orange'> Step8 -</font> Image is not able:   Opp! Looks like we don't have data for this search criteria yet."
					+ "   But don't worry, Spidey is on the crawl now and it will scrape ads for this search criteria for you ASAP.");
	    }
		
		

	}

	public void AdSeenBetween_Last_Thirty_Days() throws InterruptedException 
	{
		String date_format_lastseen=null;
		String lastimageDate1=null;
		
		System.out.println();
		Reporter.log("      ");
		System.out.println("-ShortBy Newest -Ad Seen Between Last Thirty Days:");
		Reporter.log("<B><font color = 'red'>  -ShortBy Newest Step will Start from here </font>  ");
		helper.waitFor(sortBy);
		helper.highLightElement(driver, sortBy);
		helper.jsScrollintoview(sortBy);
		sortBy.click();
		Reporter.log("<B><font color = 'orange'> Step1 -</font> Clicked On sortBy Icon");

		helper.waitFor(SortBy_Newest);
		helper.highLightElement(driver, SortBy_Newest);
		SortBy_Newest.click();
		Reporter.log("<B><font color = 'orange'> Step2 -</font> Clicked On SortBy Newest Icon");

		helper.waitFor(searchButton);
		helper.highLightElement(driver, searchButton);
		helper.jsScrollintoview(searchButton);
		searchButton.click();
		Reporter.log("<B><font color = 'orange'> Step3 -</font> Clicked On search Button Icon");
		helper.waitForPageToLoad();

		Reporter.log("<B><font color = 'red'> - ShortBy Newest -Ad Seen Between Last Thirty Days Step will Start from here </font> "); 

		helper.waitFor(adSeenbetweenfilter); 
		helper.highLightElement(driver,adSeenbetweenfilter); 
		helper.jsScrollintoview(adSeenbetweenfilter);
		adSeenbetweenfilter.click(); 
		Reporter.log("<B><font color = 'orange'> Step4 -</font> Clicked On Ad Seen between filter Icon");

		helper.waitFor(adSeenBetween_last_Thirty_days);
		helper.highLightElement(driver, adSeenBetween_last_Thirty_days);
		helper.jsScrollintoview(adSeenBetween_last_Thirty_days);
		adSeenBetween_last_Thirty_days.click();
		Reporter.log("<B><font color = 'orange'> Step5 -</font> Clicked On Ad Seen Between Last Thirty Days Icon");

		helper.waitFor(searchButton); 
		helper.highLightElement(driver, searchButton);
		helper.jsScrollintoview(searchButton); 
		searchButton.click(); 
		Reporter.log("<B><font color = 'orange'> Step6 -</font> Clicked On Search Button Icon"); 
		helper.waitForPageToLoad();

		String totaladscount=totaladscount_ad.getText();
		System.out.println("Totaladscount: "+totaladscount);
		Reporter.log("<B><font color = 'orange'> Step7 -</font>  Total Ad Count is :"+ totaladscount); 

		helper.waitFor(showAnalytics); 
		try 
		{ 
			helper.highLightElement(driver,showAnalytics); 
			helper.jsScrollintoview(showAnalytics);
			showAnalytics.click(); 
			Reporter.log("<B><font color = 'orange'> Step8 -</font> Clicked On Show Analytics Icon"); 
			helper.waitForPageToLoad(); 
			String imageDate=Date1.getText();
			Reporter.log("<B><font color = 'orange'> Step9 -</font> Image Date is :"+imageDate); 
			System.out.println("Current Image Date: "+imageDate);

			String parent=driver.getWindowHandle();
			Set<String>s=driver.getWindowHandles(); 
			Iterator<String> I1= s.iterator(); while(I1.hasNext()) 
			{ 
				String child_window=I1.next(); 
				if(!parent.equals(child_window))
				{
					driver.switchTo().window(child_window); helper.waitForPageToLoad();
					System.out.println(driver.switchTo().window(child_window).getTitle()); 
					lastimageDate1 = lastSeen.getText();
					System.out.println("Analytics Image Last Seen Date: "+lastimageDate1);
					Reporter.log("<B><font color = 'orange'> Step10 -</font> Image Date of Last Seen is :"+lastimageDate1);
					driver.close();
				} 
			}
			driver.switchTo().window(parent);
			 String[] splitString = lastimageDate1.split(" ");
		      for(int i=0;i<splitString.length-2;i++) {
		    //    String actualDate=splitString[i]; 
		    	  date_format_lastseen= splitString[i+1]+" "+ splitString[i]+" " + splitString[i+2];
		       
		      //  System.out.println("splitString : " + splitString[i]);
		        System.out.println("Change Date format lastseen Date: " + date_format_lastseen);
		        System.out.println("Image last seen Date: " + imageDate);
		      }
		  
		    	Assert.assertEquals(imageDate, date_format_lastseen);
			    Reporter.log("<B><font color = 'orange'> Step12 -</font> Both Last Seen Date are Matching in Assert Pass :"+imageDate+ " == " +date_format_lastseen);
			    System.out.println("Both Last Seen Date are Matching in Assert Pass :"+imageDate+ " == " +date_format_lastseen);
		} 
		catch (Exception e) 
		{
			System.out.println("Image is not able:   Opp!Looks like we don't have data for this search criteria yet.\r\n"
					+ "But don't worry, Spidey is on the crawl now and it will scrape ads for this search criteria for you ASAP.");
			Reporter.log("<B><font color = 'orange'> Step8 -</font> Image is not able:   Opp!Looks like we don't have data for this search criteria yet."
					+ "But don't worry, Spidey is on the crawl now and it will scrape ads for this search criteria for you ASAP."); 
		}
	}
	public void AdSeenBetween_This_Month() throws InterruptedException
	{
	
		System.out.println();
		Reporter.log("      ");
		System.out.println("-ShortBy Newest -Seen Between This Month:");
		Reporter.log("<B><font color = 'red'>  - ShortBy Newest Step will Start from here </font>  ");
		helper.waitFor(sortBy);
		helper.highLightElement(driver, sortBy);
		helper.jsScrollintoview(sortBy);
		sortBy.click();
		Reporter.log("<B><font color = 'orange'> Step1 -</font> Clicked On sortBy Icon");

		helper.waitFor(SortBy_Newest);
		helper.highLightElement(driver, SortBy_Newest);
		SortBy_Newest.click();
		Reporter.log("<B><font color = 'orange'> Step2 -</font> Clicked On SortBy Newest Icon");

		helper.waitFor(searchButton);
		helper.highLightElement(driver, searchButton);
		helper.jsScrollintoview(searchButton);
		searchButton.click();
		Reporter.log("<B><font color = 'orange'> Step3 -</font> Clicked On search Button Icon");
		helper.waitForPageToLoad();

		Reporter.log("<B><font color = 'red'>  -ShortBy Newest -Ad Seen Between This Month Step will Start from here </font> ");
		helper.waitFor(adSeenbetweenfilter);
		helper.highLightElement(driver, adSeenbetweenfilter);
		helper.jsScrollintoview(adSeenbetweenfilter);
		adSeenbetweenfilter.click();
		Reporter.log("<B><font color = 'orange'> Step4 -</font> Clicked On Ad Seen between filter Icon");

		helper.waitFor(adSeenBetween_this_month);
		helper.highLightElement(driver, adSeenBetween_this_month);
		helper.jsScrollintoview(adSeenBetween_this_month);
		adSeenBetween_this_month.click();
		Reporter.log("<B><font color = 'orange'> Step5 -</font> Clicked On Ad Seen Between This Month Icon");

		helper.waitFor(searchButton);
		helper.highLightElement(driver, searchButton);
		helper.jsScrollintoview(searchButton);
		searchButton.click();
		Reporter.log("<B><font color = 'orange'> Step6 -</font> Clicked On Search Button Icon");
		helper.waitForPageToLoad();

		String totaladscount=totaladscount_ad.getText();
		System.out.println("Totaladscount: "+totaladscount);
		Reporter.log("<B><font color = 'orange'> Step7 -</font>  Total Ad Count is :"+ totaladscount);

		String  imageDate= Date1.getText();
		Reporter.log("<B><font color = 'orange'> Step9 -</font> Image Date is :"+imageDate);
		System.out.println("Current Date: "+imageDate);
		  try {
		helper.waitFor(showAnalytics);
		helper.highLightElement(driver, showAnalytics);
		helper.jsScrollintoview(showAnalytics);
		showAnalytics.click();
		Reporter.log("<B><font color = 'orange'> Step8 -</font> Clicked On Show Analytics Icon");
		helper.waitForPageToLoad();
		
		Set<String> S2=driver.getWindowHandles();
	    Iterator<String>it1=S2.iterator();
	    String parent1=it1.next();
	    String child1=it1.next();
	    
	    driver.switchTo().window(child1);

	    helper.waitForPageToLoad();
	    helper.waitFor(lastSeen);
	    helper.highLightElement(driver,lastSeen);
	    helper.jsScrollintoview(lastSeen);
//	    System.out.println("Testing last Seen Adresss: "+lastSeen);
	    String   lastSeenDate_today=null;
	     lastSeenDate_today = lastSeen.getText();
	    Reporter.log("<B><font color = 'orange'> Step 8 -</font> Last_Seen_childWindow AdDetails Page= " +  lastSeenDate_today);
	    System.out.println("lastSeenDate_today: "+lastSeenDate_today);
	    
	    
	    driver.close();
	   
	    driver.switchTo().window(parent1);
	   System.out.println("lastSeenDate_today1: "+lastSeenDate_today);
	    

	    String join = null;
	     //  String[] actualDate = null;
	       
	       String[] splitString = lastSeenDate_today.split(" ");
	       for(int i=0;i<splitString.length-2;i++) {
	         String actualDate=splitString[i]; 
	         join= splitString[i+1]+" "+ splitString[i]+" " + splitString[i+2];
	       //  System.out.println("splitString : " + splitString[i]);
	         System.out.println("lastseen Date: " + join);
	       }
	     Assert.assertEquals(imageDate, join);
	     Reporter.log("<B><font color = 'orange'> Step12 -</font> Both Last Seen Date are Matching in Assert Pass :"+imageDate+ " == " +join);
		    System.out.println("Both Last Seen Date are Matching in Assert Pass :"+imageDate+ " == " +join);
	    }
	    catch(Exception e) {
	    	System.out.println("Image is not able:   Opp!Looks like we don't have data for this search criteria yet.\r\n"
					+ "But don't worry, Spidey is on the crawl now and it will scrape ads for this search criteria for you ASAP.");

			Reporter.log("<B><font color = 'orange'> Step8 -</font> Image is not able:   Opp! Looks like we don't have data for this search criteria yet."
					+ "   But don't worry, Spidey is on the crawl now and it will scrape ads for this search criteria for you ASAP.");
	    }
		
	}
	public void AdSeenBetween_Last_Month() throws InterruptedException
	{
		String lastimageDate1= null;
		System.out.println();
		Reporter.log("      ");
		System.out.println("-SortBy Newest -Ad Seen Between Last Month: ");
		Reporter.log("<B><font color = 'red'>  - ShortBy Newest Step will Start from here </font>  ");
		helper.waitFor(sortBy);
		helper.highLightElement(driver, sortBy);
		helper.jsScrollintoview(sortBy);
		sortBy.click();
		Reporter.log("<B><font color = 'orange'> Step1 -</font> Clicked On sortBy Icon");
		
		helper.waitFor(SortBy_Newest);
		helper.highLightElement(driver,SortBy_Newest);
		SortBy_Newest.click();
		Reporter.log("<B><font color = 'orange'> Step2 -</font> Clicked On SortBy Newest Icon");
		
		helper.waitFor(searchButton);
		helper.highLightElement(driver,searchButton);
		helper.jsScrollintoview(searchButton);
		searchButton.click();
		Reporter.log("<B><font color = 'orange'> Step3 -</font> Clicked On search Button Icon");
		helper.waitForPageToLoad();
		
		Reporter.log("<B><font color = 'red'>  -ShortBy Newest -Ad Seen Between Last Month Step will Start from here </font> ");
		helper.waitFor(adSeenbetweenfilter);
		helper.highLightElement(driver, adSeenbetweenfilter);
		helper.jsScrollintoview(adSeenbetweenfilter);
		adSeenbetweenfilter.click();
		Reporter.log("<B><font color = 'orange'> Step4 -</font> Clicked On ad Seen between filter Icon");
		
		helper.waitFor(adSeenBetween_last_month);
		helper.highLightElement(driver,adSeenBetween_last_month);
		helper.jsScrollintoview(adSeenBetween_last_month);
		adSeenBetween_last_month.click();
		Reporter.log("<B><font color = 'orange'> Step5 -</font> Clicked On Ad Seen Between Last Month Icon");
		
		helper.waitFor(searchButton);
		helper.highLightElement(driver, searchButton);
		helper.jsScrollintoview(searchButton);
		searchButton.click();
		Reporter.log("<B><font color = 'orange'> Step6 -</font> Clicked On Search Button Icon");
		helper.waitForPageToLoad();

		String totaladscount=totaladscount_ad.getText();
		System.out.println("Totaladscount: "+totaladscount);
		Reporter.log("<B><font color = 'orange'> Step7 -</font>  Total Ad Count is :"+ totaladscount);

		helper.waitFor(showAnalytics);
		try {
			helper.highLightElement(driver, showAnalytics);
			helper.jsScrollintoview(showAnalytics);
			showAnalytics.click();
			Reporter.log("<B><font color = 'orange'> Step8 -</font> Clicked On Show Analytics Icon");
			helper.waitForPageToLoad();
			String imageDate=Date1.getText();
			Reporter.log("<B><font color = 'orange'> Step9 -</font> Image Date is :"+imageDate);
			System.out.println("Current Image Date: "+imageDate);

			String parent=driver.getWindowHandle();
			Set<String>s=driver.getWindowHandles();

			Iterator<String> I1= s.iterator();
			while(I1.hasNext())
			{
				String child_window=I1.next();
				if(!parent.equals(child_window))
				{
					driver.switchTo().window(child_window);
					helper.waitForPageToLoad();
					System.out.println(driver.switchTo().window(child_window).getTitle());
					lastimageDate1 = lastSeen.getText();
					System.out.println("Analytics Image Last Seen Date: "+lastimageDate1);
					Reporter.log("<B><font color = 'orange'> Step10 -</font> Image Date of Last Seen is :"+lastimageDate1);
					driver.close();
				}
			}
			driver.switchTo().window(parent);
			String date_format_lastseen= null;
		      String[] splitString = lastimageDate1.split(" ");
		      for(int i=0;i<splitString.length-2;i++) {
		    //    String actualDate=splitString[i]; 
		    	  date_format_lastseen= splitString[i+1]+" "+ splitString[i]+" " + splitString[i+2];
		       
		      //  System.out.println("splitString : " + splitString[i]);
		        System.out.println("Change Date format lastseen Date: " + date_format_lastseen);
		        System.out.println("Image last seen Date: " + imageDate);
		      }
		  
		    	Assert.assertEquals(imageDate, date_format_lastseen);
			    Reporter.log("<B><font color = 'orange'> Step12 -</font> Both Last Seen Date are Matching in Assert Pass :"+imageDate+ " == " +date_format_lastseen);
			    System.out.println("Both Last Seen Date are Matching in Assert Pass :"+imageDate+ " == " +date_format_lastseen);
		}
		catch (Exception e)
		{

			// TODO: handle exception
			System.out.println("Image is not able:   Opp!Looks like we don't have data for this search criteria yet.\r\n"
					+ "But don't worry, Spidey is on the crawl now and it will scrape ads for this search criteria for you ASAP.");

			Reporter.log("<B><font color = 'orange'> Step9 -</font> Image is not able:   Opp!Looks like we don't have data for this search criteria yet.\\r\\n\"\r\n"
					+ "				+ \"But don't worry, Spidey is on the crawl now and it will scrape ads for this search criteria for you ASAP.");
		}
	}



	public void AdSeenBetween_CustomRange() throws InterruptedException
	{
		String lastimageDate1= null;
		System.out.println();
		Reporter.log("      ");
		System.out.println("-SortBy Newest -Ad Seen Between Custom Range: ");
		Reporter.log("<B><font color = 'red'>  - ShortBy Newest Step will Start from here </font>  ");
		helper.waitFor(sortBy);
		helper.highLightElement(driver, sortBy);
		helper.jsScrollintoview(sortBy);
		sortBy.click();
		Reporter.log("<B><font color = 'orange'> Step1 -</font> Clicked On sortBy Icon");
		
		helper.waitFor(SortBy_Newest);
		helper.highLightElement(driver,SortBy_Newest);
		SortBy_Newest.click();
		Reporter.log("<B><font color = 'orange'> Step2 -</font> Clicked On SortBy Newest Icon");
		
		helper.waitFor(searchButton);
		helper.highLightElement(driver,searchButton);
		helper.jsScrollintoview(searchButton);
		searchButton.click();
		Reporter.log("<B><font color = 'orange'> Step3 -</font> Clicked On search Button Icon");
		helper.waitForPageToLoad();
		
		Reporter.log("<B><font color = 'red'>  -ShortBy Newest -Ad Seen Between Custom Range Step will Start from here </font> ");
		helper.waitFor(adSeenbetweenfilter);
		helper.highLightElement(driver, adSeenbetweenfilter);
		helper.jsScrollintoview(adSeenbetweenfilter);
		adSeenbetweenfilter.click();
		Reporter.log("<B><font color = 'orange'> Step4 -</font> Clicked On Ad Seen between filter Icon");
		
		helper.waitFor(adSeenBetween_customrange);
		helper.highLightElement(driver,adSeenBetween_customrange);
		helper.jsScrollintoview(adSeenBetween_customrange);
		adSeenBetween_customrange.click();
		Reporter.log("<B><font color = 'orange'> Step5 -</font> Clicked On Ad Seen Between Custom Range Icon");
		
		helper.waitFor(adSeenBetween_Start_range1);
		helper.highLightElement(driver,adSeenBetween_Start_range1);
		helper.jsScrollintoview(adSeenBetween_Start_range1);
		adSeenBetween_Start_range1.click();
		Reporter.log("<B><font color = 'orange'> Step6 -</font> Clicked On Ad Seen Between Start Custom Range Icon");
		
		helper.waitFor(adSeenBetween_end_range2);
		helper.jsScrollintoview(adSeenBetween_end_range2);
		helper.jsCLick(adSeenBetween_end_range2);
		helper.highLightElement(driver,adSeenBetween_end_range2);
	
		Reporter.log("<B><font color = 'orange'> Step7 -</font> Clicked On Ad Seen Between End Custom Range Icon:");
		
		helper.waitFor(searchButton);
		helper.highLightElement(driver, searchButton);
		helper.jsScrollintoview(searchButton);
		searchButton.click();
		Reporter.log("<B><font color = 'orange'> Step8 -</font> Clicked On Search Button Icon");
		helper.waitForPageToLoad();

		String totaladscount=totaladscount_ad.getText();
		System.out.println("Totaladscount: "+totaladscount);
		Reporter.log("<B><font color = 'orange'> Step9 -</font>  Total Ad Count is :"+ totaladscount);

		helper.waitFor(showAnalytics);
		try {
			helper.highLightElement(driver, showAnalytics);
			helper.jsScrollintoview(showAnalytics);
			showAnalytics.click();
			Reporter.log("<B><font color = 'orange'> Step10 -</font> Clicked On Show Analytics Icon");
			helper.waitForPageToLoad();
			String imageDate=Date1.getText();
			Reporter.log("<B><font color = 'orange'> Step11 -</font> Image Date is :"+imageDate);
			System.out.println("Current Image Date: "+imageDate);

			String parent=driver.getWindowHandle();
			Set<String>s=driver.getWindowHandles();

			Iterator<String> I1= s.iterator();
			while(I1.hasNext())
			{
				String child_window=I1.next();
				if(!parent.equals(child_window))
				{
					driver.switchTo().window(child_window);
					helper.waitForPageToLoad();
					System.out.println(driver.switchTo().window(child_window).getTitle());
					 lastimageDate1 = lastSeen.getText();
					System.out.println("Analytics Image Last Seen Date: "+lastimageDate1);
					Reporter.log("<B><font color = 'orange'> Step12 -</font> Image Date of Last Seen is :"+lastimageDate1);
					driver.close();
				}
			}
			driver.switchTo().window(parent);
			String date_format_lastseen = null;
		
			 String[] splitString = lastimageDate1.split(" ");
		      for(int i=0;i<splitString.length-2;i++) {
		    //    String actualDate=splitString[i]; 
		    	  date_format_lastseen= splitString[i+1]+" "+ splitString[i]+" " + splitString[i+2];
		       
		      //  System.out.println("splitString : " + splitString[i]);
		        System.out.println("Change Date format lastseen Date: " + date_format_lastseen);
		        System.out.println("Image last seen Date: " + imageDate);
		      }
		  
		    	Assert.assertEquals(imageDate, date_format_lastseen);
			    Reporter.log("<B><font color = 'orange'> Step12 -</font> Both Last Seen Date are Matching in Assert Pass :"+imageDate+ " == " +date_format_lastseen);
			    System.out.println("Both Last Seen Date are Matching in Assert Pass :"+imageDate+ " == " +date_format_lastseen);
		}
		catch (Exception e) 
		{
			// TODO: handle exception
			System.out.println("Image is not able:   Opp!Looks like we don't have data for this search criteria yet.\r\n"
					+ "But don't worry, Spidey is on the crawl now and it will scrape ads for this search criteria for you ASAP.");

			Reporter.log("<B><font color = 'orange'> Step10 -</font> Image is not able:   Opp!Looks like we don't have data for this search criteria yet."
					+ "But don't worry, Spidey is on the crawl now and it will scrape ads for this search criteria for you ASAP.");
		}
		
	}
	}

