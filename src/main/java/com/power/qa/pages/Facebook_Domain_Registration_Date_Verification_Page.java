package com.power.qa.pages;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Factory;

import com.power.qa.base.TestBase;
import com.power.qa.util.Helpers;

public class Facebook_Domain_Registration_Date_Verification_Page extends BasePage
{
	Helpers helper=new Helpers();

	public Facebook_Domain_Registration_Date_Verification_Page(WebDriver driver) throws InterruptedException 
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
	
	@FindBy(xpath = "//span[@id='domain_timefilter']")
	WebElement  domainRegistrationfilter;
	
	@FindBy(xpath = "//li[@class='active'][normalize-space()='All']")
	WebElement All;
	
	@FindBy(id ="totaladscount")
	WebElement totaladscount_ad;
	
	@FindBy(xpath ="//div[@class='ad_date']")
	WebElement Date1;
	
	@FindBy(xpath = "//a[text()='Show Analytics']")
	WebElement showAnalytics;
	
	@FindBy(id ="domain_date")
	WebElement Domain_Rgsd_Date;
	
	@FindBy(xpath = "//div[@id='last_seen1']")
	WebElement lastSeen;
	
//	@FindBy(xpath = "//body/div[8]/div[1]/ul[1]/li[2]")    //long
	@FindBy(xpath = "//li[text()='Today']")
	WebElement Today;
	
	//@FindBy(xpath = "//li[text()='Yesterday']")
	@FindBy(xpath = "//body/div[8]/div[1]/ul[1]/li[3]")
	WebElement yesterday;
	
	@FindBy(xpath = "//body/div[8]/div[1]/ul[1]/li[3]")
	//@FindBy(xpath = "//li[text()='Last 7 Days']")
	WebElement Last_7_Days;
	
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
		Reporter.log("<B><font color = 'orange'> Step5 -</font> Clicked On sortBy Icon");

		helper.waitFor(SortBy_Newest);
		helper.highLightElement(driver, SortBy_Newest);
		SortBy_Newest.click();
		Reporter.log("<B><font color = 'orange'> Step6 -</font> Clicked On SortBy Newest Icon");

		helper.waitFor(searchButton);
		helper.highLightElement(driver, searchButton);
		searchButton.click();
		Reporter.log("<B><font color = 'orange'> Step7 -</font> Clicked On search Button Icon");
		helper.waitForPageToLoad();
	}
	
	public void DomainRegistrationDate_All() throws InterruptedException
	{

		System.out.println();
		System.out.println("-ShortBy Newest -Ad Domain Registration Date -All:");
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

		Reporter.log("<B><font color = 'red'> -ShortBy Newest -Ad Domain Registration Date All Step will Start from here </font> ");
		helper.waitFor(domainRegistrationfilter);
		helper.highLightElement(driver, domainRegistrationfilter);
		helper.jsScrollintoview(domainRegistrationfilter);
		domainRegistrationfilter.click();
		Reporter.log("<B><font color = 'orange'> Step4 -</font> Clicked On Ad Domain Registration Date filter Icon");

		helper.waitFor(All);
		helper.highLightElement(driver, All);
		helper.jsScrollintoview(All);
		All.click();
		Reporter.log("<B><font color = 'orange'> Step5 -</font> Clicked On Domain Registration Date All Icon");

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
		Reporter.log("<B><font color = 'orange'> Step8 -</font> Image Date is :"+imageDate);
		System.out.println("Current Date: "+imageDate);
		  try {
		helper.waitFor(showAnalytics);
		helper.highLightElement(driver, showAnalytics);
		helper.jsScrollintoview(showAnalytics);
		showAnalytics.click();
		Reporter.log("<B><font color = 'orange'> Step9 -</font> Clicked On Show Analytics Icon");
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
	    String DomainRgsdDate=Domain_Rgsd_Date.getText();
	    Reporter.log("<B><font color = 'orange'> Step 10 -</font> Last_Seen_ AdDetails Page= " +  lastSeenDate_today);
	    Reporter.log("<B><font color = 'orange'> Step 11 -</font> Domain_Rgsd_Date AdDetails Page= " +  DomainRgsdDate);
	    System.out.println("lastSeenDate_today: "+lastSeenDate_today);
	    System.out.println("Domain Rgsd Date: "+DomainRgsdDate);
	    
	    
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
	         System.out.println("lastseen Date  " + joinString);
	       }
	     Assert.assertEquals(imageDate, joinString);
	     Reporter.log("<B><font color = 'orange'> Step12 -</font> Both Last Seen Date are Matching in Assert Pass :"+imageDate+ " == " +joinString);
		    System.out.println("Both Last Seen Date are Matching in Assert Pass :"+imageDate+ " == " +joinString);
	    }
	    catch(Exception e) {
	    	System.out.println("Image is not able:   Opp!Looks like we don't have data for this search criteria yet.\r\n"
					+ "But don't worry, Spidey is on the crawl now and it will scrape ads for this search criteria for you ASAP.");

			Reporter.log("<B><font color = 'orange'> Step9 -</font> Image is not able:   Opp! Looks like we don't have data for this search criteria yet."
					+ "   But don't worry, Spidey is on the crawl now and it will scrape ads for this search criteria for you ASAP.");
	    }


	}
	public void DomainRegistrationDate_Today()	throws InterruptedException
		{

			System.out.println();
			System.out.println("-ShortBy Newest -Ad Domain Registration Date -Today:");
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

			Reporter.log("<B><font color = 'red'> -ShortBy Newest -Ad Domain Registration Date Today Step will Start from here </font> ");
			helper.waitFor(domainRegistrationfilter);
			helper.highLightElement(driver, domainRegistrationfilter);
			helper.jsScrollintoview(domainRegistrationfilter);
			domainRegistrationfilter.click();
			Reporter.log("<B><font color = 'orange'> Step4 -</font> Clicked On Ad Domain Registration Date filter Icon");

			helper.waitFor(Today);
			helper.highLightElement(driver, Today);
			helper.jsScrollintoview(All);
			Today.click();
			Reporter.log("<B><font color = 'orange'> Step5 -</font> Clicked On Domain Registration Date Today Icon");

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
			Reporter.log("<B><font color = 'orange'> Step8 -</font> Image Date is :"+imageDate);
			System.out.println("Current Date: "+imageDate);
			  try {
			helper.waitFor(showAnalytics);
			helper.highLightElement(driver, showAnalytics);
			helper.jsScrollintoview(showAnalytics);
			showAnalytics.click();
			Reporter.log("<B><font color = 'orange'> Step9 -</font> Clicked On Show Analytics Icon");
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
		    String DomainRgsdDate=Domain_Rgsd_Date.getText();
		    Reporter.log("<B><font color = 'orange'> Step 10 -</font> Last_Seen_ AdDetails Page= " +  lastSeenDate_today);
		    Reporter.log("<B><font color = 'orange'> Step 11 -</font> Domain_Rgsd_Date AdDetails Page= " +  DomainRgsdDate);
		    System.out.println("lastSeenDate_today: "+lastSeenDate_today);
		    System.out.println("Domain Rgsd Date: "+DomainRgsdDate);
		    
		    
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
		         System.out.println("lastseen Date  " + joinString);
		       }
		     Assert.assertEquals(imageDate, joinString);
		     Reporter.log("<B><font color = 'orange'> Step12 -</font> Both Last Seen Date are Matching in Assert Pass :"+imageDate+ " == " +joinString);
			    System.out.println("Both Last Seen Date are Matching in Assert Pass :"+imageDate+ " == " +joinString);
		    }
		    catch(Exception e) {
		    	System.out.println("Image is not able:   Opp!Looks like we don't have data for this search criteria yet.\r\n"
						+ "But don't worry, Spidey is on the crawl now and it will scrape ads for this search criteria for you ASAP.");

				Reporter.log("<B><font color = 'orange'> Step9 -</font> Image is not able:   Opp! Looks like we don't have data for this search criteria yet."
						+ "   But don't worry, Spidey is on the crawl now and it will scrape ads for this search criteria for you ASAP.");
		    }	
	}
	
	public void DomainRegistrationDate_yesterday() throws InterruptedException
	{
		System.out.println();
		System.out.println("-ShortBy Newest -Ad Domain Registration Date -Yesterday:");
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

		Reporter.log("<B><font color = 'red'> -ShortBy Newest -Ad Domain Registration Date Yesterday Step will Start from here </font> ");
		helper.waitFor(domainRegistrationfilter);
		helper.highLightElement(driver, domainRegistrationfilter);
		helper.jsScrollintoview(domainRegistrationfilter);
		domainRegistrationfilter.click();
		Reporter.log("<B><font color = 'orange'> Step4 -</font> Clicked On Ad Domain Registration Date filter Icon");

		helper.waitFor(yesterday);
		helper.highLightElement(driver, yesterday);
		helper.jsScrollintoview(yesterday);
		yesterday.click();
		Reporter.log("<B><font color = 'orange'> Step5 -</font> Clicked On Domain Registration Date Yesterday Icon");

		helper.waitFor(searchButton);
		helper.highLightElement(driver, searchButton);
		helper.jsScrollintoview(searchButton);
		searchButton.click();
		Reporter.log("<B><font color = 'orange'> Step6 -</font> Clicked On search Button Icon");
		helper.waitForPageToLoad();

		String totaladscount=totaladscount_ad.getText();
		System.out.println("Totaladscount: "+totaladscount);
		Reporter.log("<B><font color = 'orange'> Step7 -</font>  Total Ad Count is :"+ totaladscount);
		
		  try 
		  {
		String  imageDate= Date1.getText();
		Reporter.log("<B><font color = 'orange'> Step8 -</font> Image Date is :"+imageDate);
		System.out.println("Current Date: "+imageDate);
		
		helper.waitFor(showAnalytics);
		helper.highLightElement(driver, showAnalytics);
		helper.jsScrollintoview(showAnalytics);
		showAnalytics.click();
		Reporter.log("<B><font color = 'orange'> Step9 -</font> Clicked On Show Analytics Icon");
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
	    String DomainRgsdDate=Domain_Rgsd_Date.getText();
	    Reporter.log("<B><font color = 'orange'> Step 10 -</font> Last_Seen_ AdDetails Page= " +  lastSeenDate_today);
	    Reporter.log("<B><font color = 'orange'> Step 11 -</font> Domain_Rgsd_Date AdDetails Page= " +  DomainRgsdDate);
	    System.out.println("lastSeenDate_today: "+lastSeenDate_today);
	    System.out.println("Domain Rgsd Date: "+DomainRgsdDate);
	    
	    
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
	         System.out.println("lastseen Date  " + joinString);
	       }
	     Assert.assertEquals(imageDate, joinString);
	     Reporter.log("<B><font color = 'orange'> Step12 -</font> Both Last Seen Date are Matching in Assert Pass :"+imageDate+ " == " +joinString);
		    System.out.println("Both Last Seen Date are Matching in Assert Pass :"+imageDate+ " == " +joinString);
	    }
	    catch(Exception e)
		  {
	    	System.out.println("Image is not able:   Opp!Looks like we don't have data for this search criteria yet.\r\n"
					+ "But don't worry, Spidey is on the crawl now and it will scrape ads for this search criteria for you ASAP.");

			Reporter.log("<B><font color = 'orange'> Step9 -</font> Image is not able:   Opp! Looks like we don't have data for this search criteria yet."
					+ "   But don't worry, Spidey is on the crawl now and it will scrape ads for this search criteria for you ASAP.");
	    }		
	}
	
	public void DomainRegistrationDate_Last_7_Days() throws InterruptedException
	{
		System.out.println();
		System.out.println("-ShortBy Newest -Ad Domain Registration Date -Last 7 Days");
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

		Reporter.log("<B><font color = 'red'> -ShortBy Newest -Ad Domain Registration Date Last 7 Days Step will Start from here </font> ");
		helper.waitFor(domainRegistrationfilter);
		helper.highLightElement(driver, domainRegistrationfilter);
		helper.jsScrollintoview(domainRegistrationfilter);
		domainRegistrationfilter.click();
		Reporter.log("<B><font color = 'orange'> Step4 -</font> Clicked On Ad Domain Registration Date filter Icon");

		helper.waitFor(Last_7_Days);
		helper.highLightElement(driver, Last_7_Days);
		helper.jsScrollintoview(Last_7_Days);
		Last_7_Days.click();
		Reporter.log("<B><font color = 'orange'> Step5 -</font> Clicked On Domain Registration Date Last 7 Days Icon");

		helper.waitFor(searchButton);
		helper.highLightElement(driver, searchButton);
		helper.jsScrollintoview(searchButton);
		searchButton.click();
		Reporter.log("<B><font color = 'orange'> Step6 -</font> Clicked On search Button Icon");
		helper.waitForPageToLoad();

		String totaladscount=totaladscount_ad.getText();
		System.out.println("Totaladscount: "+totaladscount);
		Reporter.log("<B><font color = 'orange'> Step7 -</font>  Total Ad Count is :"+ totaladscount);
		
		  try 
		  {
		String  imageDate= Date1.getText();
		Reporter.log("<B><font color = 'orange'> Step8 -</font> Image Date is :"+imageDate);
		System.out.println("Current Date: "+imageDate);
		
		helper.waitFor(showAnalytics);
		helper.highLightElement(driver, showAnalytics);
		helper.jsScrollintoview(showAnalytics);
		showAnalytics.click();
		Reporter.log("<B><font color = 'orange'> Step9 -</font> Clicked On Show Analytics Icon");
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
	    String DomainRgsdDate=Domain_Rgsd_Date.getText();
	    Reporter.log("<B><font color = 'orange'> Step 10 -</font> Last_Seen_ AdDetails Page= " +  lastSeenDate_today);
	    Reporter.log("<B><font color = 'orange'> Step 11 -</font> Domain_Rgsd_Date AdDetails Page= " +  DomainRgsdDate);
	    System.out.println("lastSeenDate_today: "+lastSeenDate_today);
	    System.out.println("Domain Rgsd Date: "+DomainRgsdDate);
	    
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
	         System.out.println("lastseen Date  " + joinString);
	       }
	     Assert.assertEquals(imageDate, joinString);
	     Reporter.log("<B><font color = 'orange'> Step12 -</font> Both Last Seen Date are Matching in Assert Pass :"+imageDate+ " == " +joinString);
		    System.out.println("Both Last Seen Date are Matching in Assert Pass :"+imageDate+ " == " +joinString);
	    }
	    catch(Exception e)
		  {
	    	System.out.println("Image is not able:   Opp!Looks like we don't have data for this search criteria yet.\r\n"
					+ "But don't worry, Spidey is on the crawl now and it will scrape ads for this search criteria for you ASAP.");

			Reporter.log("<B><font color = 'orange'> Step9 -</font> Image is not able:   Opp! Looks like we don't have data for this search criteria yet."
					+ "   But don't worry, Spidey is on the crawl now and it will scrape ads for this search criteria for you ASAP.");
	    }		
	}
}
