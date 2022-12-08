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
	@FindBy(xpath = "(//li[text()='Today'])[3]")
	WebElement Today;
	
	@FindBy(xpath = "(//li[text()='Yesterday'])[3]")
	//@FindBy(xpath = "//body/div[8]/div[1]/ul[1]/li[3]")
	WebElement yesterday;
	
	//@FindBy(xpath = "//body/div[8]/div[1]/ul[1]/li[3]")
//	@FindBy(xpath = "(//li[text()='Last 30 Days'])[3]") //live
	@FindBy(xpath = "(//li[text()='Last Seven Days'])[3]") //dev
	WebElement Last_7_Days;
	
//	@FindBy(xpath = "(//li[text()='Last 30 Days'])[3]") //live
	@FindBy(xpath = "(//li[text()='Last Thirty Days'])[3]") //dev
	WebElement Last_30_Days;
	
	@FindBy(xpath = "(//li[text()='This Month'])[3]")
	WebElement This_Month;
	
	@FindBy(xpath = "(//li[text()='Last Month'])[3]")
	WebElement Last_Month;
	
	@FindBy(xpath = "(//li[text()='Custom Range'])[3]")
	WebElement Custom_Range;
	
	@FindBy(xpath = "//th[@class='prev available']")
	WebElement Custom_Range_Next_Line;
	
	@FindBy(xpath ="(//td[text()='3'])[1]" )
	WebElement adSeenBetween_Start_range1;
	
	@FindBy(xpath = "//td[text()='10']")
	WebElement adSeenBetween_end_range2;
	
	//All
		@FindBy(xpath = "(//div[@class='card_col_1']//div[@class='ad_date'])[1]")
		WebElement date1;
		@FindBy(xpath = "(//div[@class='card_col_1']//a[text()='Show Analytics'])[1]")
		WebElement ShowAnalytics1;

		@FindBy(xpath = "(//div[@class='card_col_2']//div[@class='ad_date'])[1]")
		WebElement date2;
		@FindBy(xpath = "(//div[@class='card_col_2']//a[text()='Show Analytics'])[1]")
		WebElement ShowAnalytics2;

		@FindBy(xpath = "(//div[@class='card_col_3']//div[@class='ad_date'])[1]")
		WebElement date3;
		@FindBy(xpath = "(//div[@class='card_col_3']//a[text()='Show Analytics'])[1]")
		WebElement ShowAnalytics3;

		@FindBy(xpath = "(//div[@class='card_col_1']//div[@class='ad_date'])[2]")
		WebElement date4;
		@FindBy(xpath = "(//div[@class='card_col_1']//a[text()='Show Analytics'])[2]")
		WebElement ShowAnalytics4;

		@FindBy(xpath = "(//div[@class='card_col_2']//div[@class='ad_date'])[2]")
		WebElement date5;
		@FindBy(xpath = "(//div[@class='card_col_2']//a[text()='Show Analytics'])[2]")
		WebElement ShowAnalytics5;

		@FindBy(xpath = "(//div[@class='card_col_3']//div[@class='ad_date'])[2]")
		WebElement date6;
		@FindBy(xpath = "(//div[@class='card_col_3']//a[text()='Show Analytics'])[2]")
		WebElement ShowAnalytics6;

		@FindBy(xpath = "(//div[@class='card_col_1']//div[@class='ad_date'])[3]")
		WebElement date7;
		@FindBy(xpath = "(//div[@class='card_col_1']//a[text()='Show Analytics'])[3]")
		WebElement ShowAnalytics7;

		@FindBy(xpath = "(//div[@class='card_col_2']//div[@class='ad_date'])[3]")
		WebElement date8;
		@FindBy(xpath = "(//div[@class='card_col_2']//a[text()='Show Analytics'])[3]")
		WebElement ShowAnalytics8;

		@FindBy(xpath = "(//div[@class='card_col_3']//div[@class='ad_date'])[3]")
		WebElement date9;
		@FindBy(xpath = "(//div[@class='card_col_3']//a[text()='Show Analytics'])[3]")
		WebElement ShowAnalytics9;

		@FindBy(xpath = "(//div[@class='card_col_1']//div[@class='ad_date'])[4]")
		WebElement date10;
		@FindBy(xpath = "(//div[@class='card_col_1']//a[text()='Show Analytics'])[4]")
		WebElement ShowAnalytics10;

		@FindBy(xpath = "(//div[@class='card_col_2']//div[@class='ad_date'])[4]")
		WebElement date11;
		@FindBy(xpath = "(//div[@class='card_col_2']//a[text()='Show Analytics'])[4]")
		WebElement ShowAnalytics11;

		@FindBy(xpath = "(//div[@class='card_col_3']//div[@class='ad_date'])[4]")
		WebElement date12;
		@FindBy(xpath = "(//div[@class='card_col_3']//a[text()='Show Analytics'])[4]")
		WebElement ShowAnalytics12;

		@FindBy(xpath = "(//div[@class='card_col_1']//div[@class='ad_date'])[5]")
		WebElement date13;
		@FindBy(xpath = "(//div[@class='card_col_1']//a[text()='Show Analytics'])[5]")
		WebElement ShowAnalytics13;

		@FindBy(xpath = "(//div[@class='card_col_2']//div[@class='ad_date'])[5]")
		WebElement date14;
		@FindBy(xpath = "(//div[@class='card_col_2']//a[text()='Show Analytics'])[5]")
		WebElement ShowAnalytics14;

		@FindBy(xpath = "(//div[@class='card_col_3']//div[@class='ad_date'])[5]")
		WebElement date15;
		@FindBy(xpath = "(//div[@class='card_col_3']//a[text()='Show Analytics'])[5]")
		WebElement ShowAnalytics15;
		
		
		
	
	public void FacebookPage()
	{
		Reporter.log("<B><font color = 'purple'> Step1 -</font> Logged into PowerAdSpy Application");
		String Page_titel = driver.getTitle();
		System.out.println(Page_titel);
		Reporter.log("<B><font color = 'purple'> Step2 -</font> I am on the page :" + Page_titel);

		helper.waitForPageToLoad();
		helper.waitFor(Logo);
		helper.highLightElement(driver, Logo);
		Assert.assertTrue(Logo.isDisplayed(), "Power Ad Spy Logo is Dispalyed");
		Reporter.log("<B><font color = 'purple'> Step3 -</font> Power Ad Spy Logo is Displayed");

		helper.waitFor(fb);
		helper.highLightElement(driver, fb);
		fb.click();
		Assert.assertTrue(fb.isDisplayed(), "PowerAdSpy | Facebook Dashboard");
		Reporter.log("<B><font color = 'purple'> Step4 -</font> Clicked On FaceBook Icon");
		helper.waitForPageToLoad();

		Reporter.log("       " );
		Reporter.log("<B><font color = 'green'>  - ShortBy Newest Step will Start from here </font>  ");
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
		helper.waitForPageToLoad();
		Reporter.log("   ");
		Reporter.log("<B><font color = 'green'> -ShortBy Newest -Ad Domain Registration Date All Step will Start from here </font> ");
		helper.waitFor(domainRegistrationfilter);
		helper.highLightElement(driver, domainRegistrationfilter);
		helper.jsScrollintoview(domainRegistrationfilter);
		domainRegistrationfilter.click();
		Reporter.log("<B><font color = 'orange'> Step1 -</font> Clicked On Ad Domain Registration Date filter Icon");

		helper.waitFor(All);
		helper.highLightElement(driver, All);
		helper.jsScrollintoview(All);
		All.click();
		Reporter.log("<B><font color = 'orange'> Step2 -</font> Clicked On Domain Registration Date All Icon");

		helper.waitFor(searchButton);
		helper.highLightElement(driver, searchButton);
		helper.jsScrollintoview(searchButton);
		searchButton.click();
		Reporter.log("<B><font color = 'orange'> Step3 -</font> Clicked On search Button Icon");
		helper.waitForPageToLoad();

		String totaladscount=totaladscount_ad.getText();
		System.out.println("Totaladscount: "+totaladscount);
		Reporter.log("<B><font color = 'orange'> Step4 -</font>  Total Ad Count is :"+ totaladscount);
		
		try
		{
		String lastSeenDate_today1=null;
		Reporter.log(" ");
		Reporter.log("<B><font color ='red'> 1 Ad -</font>  ");
		System.out.println("");
		System.out.println("1 Ads");
		Reporter.log("<B><font color = 'blue'> ==> -</font> Ads Caputure Image Date :");
		System.out.println("Ads Caputure Image Date");
		String  imageDate1= date1.getText();
		Reporter.log("<B><font color = 'blue'> ==> -</font> Image Date is :"+imageDate1);
		System.out.println("Current Date: "+imageDate1);
	
		helper.waitFor(ShowAnalytics1);
		helper.highLightElement(driver, ShowAnalytics1);
		helper.Scrollintoview(ShowAnalytics1);
		String linkText1 = ShowAnalytics1.getAttribute("href");
		helper.getAdID(linkText1);
		ShowAnalytics1.click();
		Reporter.log("<B><font color = 'blue'> ==> -</font> Clicked On Show Analytics Icon");
		helper.waitForPageToLoad();
		
		Set<String> S1=driver.getWindowHandles();
	    Iterator<String>it1=S1.iterator();
	    String parent1=it1.next();
	    String child1=it1.next();
	    
	    driver.switchTo().window(child1);

	    helper.waitForPageToLoad();
	    helper.waitFor(lastSeen);
	    helper.highLightElement(driver, lastSeen);
	    helper.Scrollintoview(lastSeen);
	    lastSeenDate_today1 = lastSeen.getText();
	    helper.Scrollintoview(Domain_Rgsd_Date);
	    String DomainRgsdDate1=Domain_Rgsd_Date.getText();
	    Reporter.log("<B><font color = 'blue'> ==> -</font> Last_Seen_ AdDetails Page= " +  lastSeenDate_today1);
	    Reporter.log("<B><font color = 'blue'> ==> -</font> Domain_Rgsd_Date AdDetails Page= " +  DomainRgsdDate1);
	    System.out.println("lastSeenDate_today: "+lastSeenDate_today1);
	    System.out.println("Domain Rgsd Date: "+DomainRgsdDate1);   
	    driver.close();
	    driver.switchTo().window(parent1);
	    helper.getLastseenDate(lastSeenDate_today1, imageDate1);
	    }
	    catch(Exception e)
		{
	    	System.out.println("Image is not able: Oops! Looks like we don't have data for this search criteria yet.");

			Reporter.log("<B><font color = 'orange'> Step5 -</font> Image is not able: Oops! Looks like we don't have data for this search criteria yet.");
	    }

		try
		{
		String lastSeenDate_today2=null;
		Reporter.log(" ");
		Reporter.log("<B><font color ='red'> 2 Ad -</font>  ");
		System.out.println("");
		System.out.println("2 Ads");
		Reporter.log("<B><font color = 'blue'> ==> -</font> Ads Caputure Image Date :");
		System.out.println("Ads Caputure Image Date");
		String  imageDate2= date2.getText();
		Reporter.log("<B><font color = 'blue'> ==> -</font> Image Date is :"+imageDate2);
		System.out.println("Current Date: "+imageDate2);
	
		helper.waitFor(ShowAnalytics2);
		helper.highLightElement(driver, ShowAnalytics2);
		helper.Scrollintoview(ShowAnalytics2);
		String linkText2 = ShowAnalytics2.getAttribute("href");
		helper.getAdID(linkText2);
		ShowAnalytics2.click();
		Reporter.log("<B><font color = 'blue'> ==> -</font> Clicked On Show Analytics Icon");
		helper.waitForPageToLoad();
		
		Set<String> S2=driver.getWindowHandles();
	    Iterator<String>it2=S2.iterator();
	    String parent2=it2.next();
	    String child2=it2.next();
	    
	    driver.switchTo().window(child2);

	    helper.waitForPageToLoad();
	    helper.waitFor(lastSeen);
	    helper.highLightElement(driver, lastSeen);
	    helper.Scrollintoview(lastSeen);
	    lastSeenDate_today2 = lastSeen.getText();
	    helper.Scrollintoview(Domain_Rgsd_Date);
	    String DomainRgsdDate2=Domain_Rgsd_Date.getText();
	    Reporter.log("<B><font color = 'blue'> ==> -</font> Last_Seen_ AdDetails Page= " +  lastSeenDate_today2);
	    Reporter.log("<B><font color = 'blue'> ==> -</font> Domain_Rgsd_Date AdDetails Page= " +  DomainRgsdDate2);
	    System.out.println("lastSeenDate_today: "+lastSeenDate_today2);
	    System.out.println("Domain Rgsd Date: "+DomainRgsdDate2);   
	    driver.close();
	    driver.switchTo().window(parent2);
	    helper.getLastseenDate(lastSeenDate_today2, imageDate2);
	    }
	    catch(Exception e)
		{
	    	System.out.println("Image is not able: Oops! Looks like we don't have data for this search criteria yet.");

			Reporter.log("<B><font color = 'orange'> Step5 -</font> Image is not able: Oops! Looks like we don't have data for this search criteria yet.");
	    }

		try
		{
		String lastSeenDate_today3=null;
		Reporter.log(" ");
		Reporter.log("<B><font color ='red'> 3 Ad -</font>  ");
		System.out.println("");
		System.out.println("3 Ads");
		Reporter.log("<B><font color = 'blue'> ==> -</font> Ads Caputure Image Date :");
		System.out.println("Ads Caputure Image Date");
		String  imageDate3= date3.getText();
		Reporter.log("<B><font color = 'blue'> ==> -</font> Image Date is :"+imageDate3);
		System.out.println("Current Date: "+imageDate3);
	
		helper.waitFor(ShowAnalytics3);
		helper.highLightElement(driver, ShowAnalytics3);
		helper.Scrollintoview(ShowAnalytics3);
		String linkText3 = ShowAnalytics3.getAttribute("href");
		helper.getAdID(linkText3);
		ShowAnalytics3.click();
		Reporter.log("<B><font color = 'blue'> ==> -</font> Clicked On Show Analytics Icon");
		helper.waitForPageToLoad();
		
		Set<String> S3=driver.getWindowHandles();
	    Iterator<String>it3=S3.iterator();
	    String parent3=it3.next();
	    String child3=it3.next();
	    
	    driver.switchTo().window(child3);

	    helper.waitForPageToLoad();
	    helper.waitFor(lastSeen);
	    helper.highLightElement(driver, lastSeen);
	    helper.Scrollintoview(lastSeen);
	    lastSeenDate_today3 = lastSeen.getText();
	    helper.Scrollintoview(Domain_Rgsd_Date);
	    String DomainRgsdDate3=Domain_Rgsd_Date.getText();
	    Reporter.log("<B><font color = 'blue'> ==> -</font> Last_Seen_ AdDetails Page= " +  lastSeenDate_today3);
	    Reporter.log("<B><font color = 'blue'> ==> -</font> Domain_Rgsd_Date AdDetails Page= " +  DomainRgsdDate3);
	    System.out.println("lastSeenDate_today: "+lastSeenDate_today3);
	    System.out.println("Domain Rgsd Date: "+DomainRgsdDate3);   
	    driver.close();
	    driver.switchTo().window(parent3);
	    helper.getLastseenDate(lastSeenDate_today3, imageDate3);
	    }
	    catch(Exception e)
		{
	    	System.out.println("Image is not able: Oops! Looks like we don't have data for this search criteria yet.");

			Reporter.log("<B><font color = 'orange'> Step5 -</font> Image is not able: Oops! Looks like we don't have data for this search criteria yet.");
	    }
		
		try
		{
		String lastSeenDate_today4=null;
		Reporter.log(" ");
		Reporter.log("<B><font color ='red'> 4 Ad -</font>  ");
		System.out.println("");
		System.out.println("4 Ads");
		Reporter.log("<B><font color = 'blue'> ==> -</font> Ads Caputure Image Date :");
		System.out.println("Ads Caputure Image Date");
		String  imageDate4= date4.getText();
		Reporter.log("<B><font color = 'blue'> ==> -</font> Image Date is :"+imageDate4);
		System.out.println("Current Date: "+imageDate4);
	
		helper.waitFor(ShowAnalytics4);
		helper.highLightElement(driver, ShowAnalytics4);
		helper.Scrollintoview(ShowAnalytics4);
		String linkText4 = ShowAnalytics4.getAttribute("href");
		helper.getAdID(linkText4);
		ShowAnalytics4.click();
		Reporter.log("<B><font color = 'blue'> ==> -</font> Clicked On Show Analytics Icon");
		helper.waitForPageToLoad();
		
		Set<String> S4=driver.getWindowHandles();
	    Iterator<String>it4=S4.iterator();
	    String parent4=it4.next();
	    String child4=it4.next();
	    
	    driver.switchTo().window(child4);

	    helper.waitForPageToLoad();
	    helper.waitFor(lastSeen);
	    helper.highLightElement(driver, lastSeen);
	    helper.Scrollintoview(lastSeen);
	    lastSeenDate_today4 = lastSeen.getText();
	    helper.Scrollintoview(Domain_Rgsd_Date);
	    String DomainRgsdDate4=Domain_Rgsd_Date.getText();
	    Reporter.log("<B><font color = 'blue'> ==> -</font> Last_Seen_ AdDetails Page= " +  lastSeenDate_today4);
	    Reporter.log("<B><font color = 'blue'> ==> -</font> Domain_Rgsd_Date AdDetails Page= " +  DomainRgsdDate4);
	    System.out.println("lastSeenDate_today: "+lastSeenDate_today4);
	    System.out.println("Domain Rgsd Date: "+DomainRgsdDate4);   
	    driver.close();
	    driver.switchTo().window(parent4);
	    helper.getLastseenDate(lastSeenDate_today4, imageDate4);
	    }
	    catch(Exception e)
		{
	    	System.out.println("Image is not able: Oops! Looks like we don't have data for this search criteria yet.");

			Reporter.log("<B><font color = 'orange'> Step5 -</font> Image is not able: Oops! Looks like we don't have data for this search criteria yet.");
	    }
		
		try
		{
		String lastSeenDate_today5=null;
		Reporter.log(" ");
		Reporter.log("<B><font color ='red'> 5 Ad -</font>  ");
		System.out.println("");
		System.out.println("5 Ads");
		Reporter.log("<B><font color = 'blue'> ==> -</font> Ads Caputure Image Date :");
		System.out.println("Ads Caputure Image Date");
		String  imageDate5= date5.getText();
		Reporter.log("<B><font color = 'blue'> ==> -</font> Image Date is :"+imageDate5);
		System.out.println("Current Date: "+imageDate5);
	
		helper.waitFor(ShowAnalytics5);
		helper.highLightElement(driver, ShowAnalytics5);
		helper.Scrollintoview(ShowAnalytics5);
		String linkText5 = ShowAnalytics5.getAttribute("href");
		helper.getAdID(linkText5);
		ShowAnalytics5.click();
		Reporter.log("<B><font color = 'blue'> ==> -</font> Clicked On Show Analytics Icon");
		helper.waitForPageToLoad();
		
		Set<String> S5=driver.getWindowHandles();
	    Iterator<String>it5=S5.iterator();
	    String parent5=it5.next();
	    String child5=it5.next();
	    
	    driver.switchTo().window(child5);

	    helper.waitForPageToLoad();
	    helper.waitFor(lastSeen);
	    helper.highLightElement(driver, lastSeen);
	    helper.Scrollintoview(lastSeen);
	    lastSeenDate_today5 = lastSeen.getText();
	    helper.Scrollintoview(Domain_Rgsd_Date);
	    String DomainRgsdDate5=Domain_Rgsd_Date.getText();
	    Reporter.log("<B><font color = 'blue'> ==> -</font> Last_Seen_ AdDetails Page= " +  lastSeenDate_today5);
	    Reporter.log("<B><font color = 'blue'> ==> -</font> Domain_Rgsd_Date AdDetails Page= " +  DomainRgsdDate5);
	    System.out.println("lastSeenDate_today: "+lastSeenDate_today5);
	    System.out.println("Domain Rgsd Date: "+DomainRgsdDate5);   
	    driver.close();
	    driver.switchTo().window(parent5);
	    helper.getLastseenDate(lastSeenDate_today5, imageDate5);
	    }
	    catch(Exception e)
		{
	    	System.out.println("Image is not able: Oops! Looks like we don't have data for this search criteria yet.");

			Reporter.log("<B><font color = 'orange'> Step5 -</font> Image is not able: Oops! Looks like we don't have data for this search criteria yet.");
	    }
		
		try
		{
		String lastSeenDate_today6=null;
		Reporter.log(" ");
		Reporter.log("<B><font color ='red'> 6 Ad -</font>  ");
		System.out.println("");
		System.out.println("6 Ads");
		Reporter.log("<B><font color = 'blue'> ==> -</font> Ads Caputure Image Date :");
		System.out.println("Ads Caputure Image Date");
		String  imageDate6= date6.getText();
		Reporter.log("<B><font color = 'blue'> ==> -</font> Image Date is :"+imageDate6);
		System.out.println("Current Date: "+imageDate6);
	
		helper.waitFor(ShowAnalytics6);
		helper.highLightElement(driver, ShowAnalytics6);
		helper.Scrollintoview(ShowAnalytics6);
		String linkText6 = ShowAnalytics6.getAttribute("href");
		helper.getAdID(linkText6);
		ShowAnalytics6.click();
		Reporter.log("<B><font color = 'blue'> ==> -</font> Clicked On Show Analytics Icon");
		helper.waitForPageToLoad();
		
		Set<String> S6=driver.getWindowHandles();
	    Iterator<String>it6=S6.iterator();
	    String parent6=it6.next();
	    String child6=it6.next();
	    
	    driver.switchTo().window(child6);

	    helper.waitForPageToLoad();
	    helper.waitFor(lastSeen);
	    helper.highLightElement(driver, lastSeen);
	    helper.Scrollintoview(lastSeen);
	    lastSeenDate_today6 = lastSeen.getText();
	    helper.Scrollintoview(Domain_Rgsd_Date);
	    String DomainRgsdDate6=Domain_Rgsd_Date.getText();
	    Reporter.log("<B><font color = 'blue'> ==> -</font> Last_Seen_ AdDetails Page= " +  lastSeenDate_today6);
	    Reporter.log("<B><font color = 'blue'> ==> -</font> Domain_Rgsd_Date AdDetails Page= " +  DomainRgsdDate6);
	    System.out.println("lastSeenDate_today: "+lastSeenDate_today6);
	    System.out.println("Domain Rgsd Date: "+DomainRgsdDate6);   
	    driver.close();
	    driver.switchTo().window(parent6);
	    helper.getLastseenDate(lastSeenDate_today6, imageDate6);
	    }
	    catch(Exception e)
		{
	    	System.out.println("Image is not able: Oops! Looks like we don't have data for this search criteria yet.");

			Reporter.log("<B><font color = 'orange'> Step5 -</font> Image is not able: Oops! Looks like we don't have data for this search criteria yet.");
	    }
		
		try
		{
		String lastSeenDate_today7=null;
		Reporter.log(" ");
		Reporter.log("<B><font color ='red'> 7 Ad -</font>  ");
		System.out.println("");
		System.out.println("7 Ads");
		Reporter.log("<B><font color = 'blue'> ==> -</font> Ads Caputure Image Date :");
		System.out.println("Ads Caputure Image Date");
		String  imageDate7= date7.getText();
		Reporter.log("<B><font color = 'blue'> ==> -</font> Image Date is :"+imageDate7);
		System.out.println("Current Date: "+imageDate7);
	
		helper.waitFor(ShowAnalytics7);
		helper.highLightElement(driver, ShowAnalytics7);
		helper.Scrollintoview(ShowAnalytics7);
		String linkText7 = ShowAnalytics7.getAttribute("href");
		helper.getAdID(linkText7);
		ShowAnalytics7.click();
		Reporter.log("<B><font color = 'blue'> ==> -</font> Clicked On Show Analytics Icon");
		helper.waitForPageToLoad();
		
		Set<String> S7=driver.getWindowHandles();
	    Iterator<String>it7=S7.iterator();
	    String parent7=it7.next();
	    String child7=it7.next();
	    
	    driver.switchTo().window(child7);

	    helper.waitForPageToLoad();
	    helper.waitFor(lastSeen);
	    helper.highLightElement(driver, lastSeen);
	    helper.Scrollintoview(lastSeen);
	    lastSeenDate_today7 = lastSeen.getText();
	    helper.Scrollintoview(Domain_Rgsd_Date);
	    String DomainRgsdDate7=Domain_Rgsd_Date.getText();
	    Reporter.log("<B><font color = 'blue'> ==> -</font> Last_Seen_ AdDetails Page= " +  lastSeenDate_today7);
	    Reporter.log("<B><font color = 'blue'> ==> -</font> Domain_Rgsd_Date AdDetails Page= " +  DomainRgsdDate7);
	    System.out.println("lastSeenDate_today: "+lastSeenDate_today7);
	    System.out.println("Domain Rgsd Date: "+DomainRgsdDate7);   
	    driver.close();
	    driver.switchTo().window(parent7);
	    helper.getLastseenDate(lastSeenDate_today7, imageDate7);
	    }
	    catch(Exception e)
		{
	    	System.out.println("Image is not able: Oops! Looks like we don't have data for this search criteria yet.");

			Reporter.log("<B><font color = 'orange'> Step5 -</font> Image is not able: Oops! Looks like we don't have data for this search criteria yet.");
	    }
		
		try
		{
		String lastSeenDate_today8=null;
		Reporter.log(" ");
		Reporter.log("<B><font color ='red'> 8 Ad -</font>  ");
		System.out.println("");
		System.out.println("8 Ads");
		Reporter.log("<B><font color = 'blue'> ==> -</font> Ads Caputure Image Date :");
		System.out.println("Ads Caputure Image Date");
		String  imageDate8= date8.getText();
		Reporter.log("<B><font color = 'blue'> ==> -</font> Image Date is :"+imageDate8);
		System.out.println("Current Date: "+imageDate8);
	
		helper.waitFor(ShowAnalytics8);
		helper.highLightElement(driver, ShowAnalytics8);
		helper.Scrollintoview(ShowAnalytics8);
		String linkText8 = ShowAnalytics8.getAttribute("href");
		helper.getAdID(linkText8);
		ShowAnalytics8.click();
		Reporter.log("<B><font color = 'blue'> ==> -</font> Clicked On Show Analytics Icon");
		helper.waitForPageToLoad();
		
		Set<String> S8=driver.getWindowHandles();
	    Iterator<String>it8=S8.iterator();
	    String parent8=it8.next();
	    String child8=it8.next();
	    
	    driver.switchTo().window(child8);

	    helper.waitForPageToLoad();
	    helper.waitFor(lastSeen);
	    helper.highLightElement(driver, lastSeen);
	    helper.Scrollintoview(lastSeen);
	    lastSeenDate_today8 = lastSeen.getText();
	    helper.Scrollintoview(Domain_Rgsd_Date);
	    String DomainRgsdDate8=Domain_Rgsd_Date.getText();
	    Reporter.log("<B><font color = 'blue'> ==> -</font> Last_Seen_ AdDetails Page= " +  lastSeenDate_today8);
	    Reporter.log("<B><font color = 'blue'> ==> -</font> Domain_Rgsd_Date AdDetails Page= " +  DomainRgsdDate8);
	    System.out.println("lastSeenDate_today: "+lastSeenDate_today8);
	    System.out.println("Domain Rgsd Date: "+DomainRgsdDate8);   
	    driver.close();
	    driver.switchTo().window(parent8);
	    helper.getLastseenDate(lastSeenDate_today8, imageDate8);
	    }
	    catch(Exception e)
		{
	    	System.out.println("Image is not able: Oops! Looks like we don't have data for this search criteria yet.");

			Reporter.log("<B><font color = 'orange'> Step5 -</font> Image is not able: Oops! Looks like we don't have data for this search criteria yet.");
	    }
		
		try
		{
		String lastSeenDate_today9=null;
		Reporter.log(" ");
		Reporter.log("<B><font color ='red'> 9 Ad -</font>  ");
		System.out.println("");
		System.out.println("9 Ads");
		Reporter.log("<B><font color = 'blue'> ==> -</font> Ads Caputure Image Date :");
		System.out.println("Ads Caputure Image Date");
		String  imageDate9= date9.getText();
		Reporter.log("<B><font color = 'blue'> ==> -</font> Image Date is :"+imageDate9);
		System.out.println("Current Date: "+imageDate9);
	
		helper.waitFor(ShowAnalytics9);
		helper.highLightElement(driver, ShowAnalytics9);
		helper.Scrollintoview(ShowAnalytics9);
		String linkText9 = ShowAnalytics9.getAttribute("href");
		helper.getAdID(linkText9);
		ShowAnalytics9.click();
		Reporter.log("<B><font color = 'blue'> ==> -</font> Clicked On Show Analytics Icon");
		helper.waitForPageToLoad();
		
		Set<String> S9=driver.getWindowHandles();
	    Iterator<String>it9=S9.iterator();
	    String parent9=it9.next();
	    String child9=it9.next();
	    
	    driver.switchTo().window(child9);

	    helper.waitForPageToLoad();
	    helper.waitFor(lastSeen);
	    helper.highLightElement(driver, lastSeen);
	    helper.Scrollintoview(lastSeen);
	    lastSeenDate_today9 = lastSeen.getText();
	    helper.Scrollintoview(Domain_Rgsd_Date);
	    String DomainRgsdDate9=Domain_Rgsd_Date.getText();
	    Reporter.log("<B><font color = 'blue'> ==> -</font> Last_Seen_ AdDetails Page= " +  lastSeenDate_today9);
	    Reporter.log("<B><font color = 'blue'> ==> -</font> Domain_Rgsd_Date AdDetails Page= " +  DomainRgsdDate9);
	    System.out.println("lastSeenDate_today: "+lastSeenDate_today9);
	    System.out.println("Domain Rgsd Date: "+DomainRgsdDate9);   
	    driver.close();
	    driver.switchTo().window(parent9);
	    helper.getLastseenDate(lastSeenDate_today9, imageDate9);
	    }
	    catch(Exception e)
		{
	    	System.out.println("Image is not able: Oops! Looks like we don't have data for this search criteria yet.");

			Reporter.log("<B><font color = 'orange'> Step5 -</font> Image is not able: Oops! Looks like we don't have data for this search criteria yet.");
	    }
		
		try
		{
		String lastSeenDate_today10=null;
		Reporter.log(" ");
		Reporter.log("<B><font color ='red'> 10 Ad -</font>  ");
		System.out.println("");
		System.out.println("10 Ads");
		Reporter.log("<B><font color = 'blue'> ==> -</font> Ads Caputure Image Date :");
		System.out.println("Ads Caputure Image Date");
		String  imageDate10= date10.getText();
		Reporter.log("<B><font color = 'blue'> ==> -</font> Image Date is :"+imageDate10);
		System.out.println("Current Date: "+imageDate10);
	
		helper.waitFor(ShowAnalytics10);
		helper.highLightElement(driver, ShowAnalytics10);
		helper.Scrollintoview(ShowAnalytics10);
		String linkText10 = ShowAnalytics10.getAttribute("href");
		helper.getAdID(linkText10);
		ShowAnalytics10.click();
		Reporter.log("<B><font color = 'blue'> ==> -</font> Clicked On Show Analytics Icon");
		helper.waitForPageToLoad();
		
		Set<String> S10=driver.getWindowHandles();
	    Iterator<String>it10=S10.iterator();
	    String parent10=it10.next();
	    String child10=it10.next();
	    
	    driver.switchTo().window(child10);

	    helper.waitForPageToLoad();
	    helper.waitFor(lastSeen);
	    helper.highLightElement(driver, lastSeen);
	    helper.Scrollintoview(lastSeen);
	    lastSeenDate_today10 = lastSeen.getText();
	    helper.Scrollintoview(Domain_Rgsd_Date);
	    String DomainRgsdDate10=Domain_Rgsd_Date.getText();
	    Reporter.log("<B><font color = 'blue'> ==> -</font> Last_Seen_ AdDetails Page= " +  lastSeenDate_today10);
	    Reporter.log("<B><font color = 'blue'> ==> -</font> Domain_Rgsd_Date AdDetails Page= " +  DomainRgsdDate10);
	    System.out.println("lastSeenDate_today: "+lastSeenDate_today10);
	    System.out.println("Domain Rgsd Date: "+DomainRgsdDate10);   
	    driver.close();
	    driver.switchTo().window(parent10);
	    helper.getLastseenDate(lastSeenDate_today10, imageDate10);
	    }
	    catch(Exception e)
		{
	    	System.out.println("Image is not able: Oops! Looks like we don't have data for this search criteria yet.");

			Reporter.log("<B><font color = 'orange'> Step5 -</font> Image is not able: Oops! Looks like we don't have data for this search criteria yet.");
	    }
		
		try
		{
		String lastSeenDate_today11=null;
		Reporter.log(" ");
		Reporter.log("<B><font color ='red'> 11 Ad -</font>  ");
		System.out.println("");
		System.out.println("11 Ads");
		Reporter.log("<B><font color = 'blue'> ==> -</font> Ads Caputure Image Date :");
		System.out.println("Ads Caputure Image Date");
		String  imageDate11= date11.getText();
		Reporter.log("<B><font color = 'blue'> ==> -</font> Image Date is :"+imageDate11);
		System.out.println("Current Date: "+imageDate11);
	
		helper.waitFor(ShowAnalytics11);
		helper.highLightElement(driver, ShowAnalytics11);
		helper.Scrollintoview(ShowAnalytics11);
		String linkText11 = ShowAnalytics11.getAttribute("href");
		helper.getAdID(linkText11);
		ShowAnalytics11.click();
		Reporter.log("<B><font color = 'blue'> ==> -</font> Clicked On Show Analytics Icon");
		helper.waitForPageToLoad();
		
		Set<String> S11=driver.getWindowHandles();
	    Iterator<String>it11=S11.iterator();
	    String parent11=it11.next();
	    String child11=it11.next();
	    
	    driver.switchTo().window(child11);

	    helper.waitForPageToLoad();
	    helper.waitFor(lastSeen);
	    helper.highLightElement(driver, lastSeen);
	    helper.Scrollintoview(lastSeen);
	    lastSeenDate_today11 = lastSeen.getText();
	    helper.Scrollintoview(Domain_Rgsd_Date);
	    String DomainRgsdDate11=Domain_Rgsd_Date.getText();
	    Reporter.log("<B><font color = 'blue'> ==> -</font> Last_Seen_ AdDetails Page= " +  lastSeenDate_today11);
	    Reporter.log("<B><font color = 'blue'> ==> -</font> Domain_Rgsd_Date AdDetails Page= " +  DomainRgsdDate11);
	    System.out.println("lastSeenDate_today: "+lastSeenDate_today11);
	    System.out.println("Domain Rgsd Date: "+DomainRgsdDate11);   
	    driver.close();
	    driver.switchTo().window(parent11);
	    helper.getLastseenDate(lastSeenDate_today11, imageDate11);
	    }
	    catch(Exception e)
		{
	    	System.out.println("Image is not able: Oops! Looks like we don't have data for this search criteria yet.");

			Reporter.log("<B><font color = 'orange'> Step5 -</font> Image is not able: Oops! Looks like we don't have data for this search criteria yet.");
	    }
		
		
		try
		{
		String lastSeenDate_today12=null;
		Reporter.log(" ");
		Reporter.log("<B><font color ='red'> 12 Ad -</font> ");
		System.out.println("");
		System.out.println("12 Ads");
		Reporter.log("<B><font color = 'blue'> ==> -</font> Ads Caputure Image Date :");
		System.out.println("Ads Caputure Image Date");
		String  imageDate12= date12.getText();
		Reporter.log("<B><font color = 'blue'> ==> -</font> Image Date is :"+imageDate12);
		System.out.println("Current Date: "+imageDate12);
	
		helper.waitFor(ShowAnalytics12);
		helper.highLightElement(driver, ShowAnalytics12);
		helper.Scrollintoview(ShowAnalytics12);
		String linkText12 = ShowAnalytics12.getAttribute("href");
		helper.getAdID(linkText12);
		ShowAnalytics12.click();
		Reporter.log("<B><font color = 'blue'> ==> -</font> Clicked On Show Analytics Icon");
		helper.waitForPageToLoad();
		
		Set<String> S12=driver.getWindowHandles();
	    Iterator<String>it12=S12.iterator();
	    String parent12=it12.next();
	    String child12=it12.next();
	    
	    driver.switchTo().window(child12);

	    helper.waitForPageToLoad();
	    helper.waitFor(lastSeen);
	    helper.highLightElement(driver, lastSeen);
	    helper.Scrollintoview(lastSeen);
	    lastSeenDate_today12 = lastSeen.getText();
	    helper.Scrollintoview(Domain_Rgsd_Date);
	    String DomainRgsdDate12=Domain_Rgsd_Date.getText();
	    Reporter.log("<B><font color = 'blue'> ==> -</font> Last_Seen_ AdDetails Page= " +  lastSeenDate_today12);
	    Reporter.log("<B><font color = 'blue'> ==> -</font> Domain_Rgsd_Date AdDetails Page= " +  DomainRgsdDate12);
	    System.out.println("lastSeenDate_today: "+lastSeenDate_today12);
	    System.out.println("Domain Rgsd Date: "+DomainRgsdDate12);   
	    driver.close();
	    driver.switchTo().window(parent12);
	    helper.getLastseenDate(lastSeenDate_today12, imageDate12);
	    }
	    catch(Exception e)
		{
	    	System.out.println("Image is not able: Oops! Looks like we don't have data for this search criteria yet.");

			Reporter.log("<B><font color = 'orange'> Step5 -</font> Image is not able: Oops! Looks like we don't have data for this search criteria yet.");
	    }
		
		
		try
		{
		String lastSeenDate_today13=null;
		Reporter.log(" ");
		Reporter.log("<B><font color ='red'> 13 Ad -</font> ");
		System.out.println("");
		System.out.println("13 Ads");
		Reporter.log("<B><font color = 'blue'> ==> -</font> Ads Caputure Image Date :");
		System.out.println("Ads Caputure Image Date");
		String  imageDate13= date13.getText();
		Reporter.log("<B><font color = 'blue'> ==> -</font> Image Date is :"+imageDate13);
		System.out.println("Current Date: "+imageDate13);
	
		helper.waitFor(ShowAnalytics13);
		helper.highLightElement(driver, ShowAnalytics13);
		helper.Scrollintoview(ShowAnalytics13);
		String linkText13 = ShowAnalytics13.getAttribute("href");
		helper.getAdID(linkText13);
		ShowAnalytics13.click();
		Reporter.log("<B><font color = 'blue'> ==> -</font> Clicked On Show Analytics Icon");
		helper.waitForPageToLoad();
		
		Set<String> S13=driver.getWindowHandles();
	    Iterator<String>it13=S13.iterator();
	    String parent13=it13.next();
	    String child13=it13.next();
	    
	    driver.switchTo().window(child13);

	    helper.waitForPageToLoad();
	    helper.waitFor(lastSeen);
	    helper.highLightElement(driver, lastSeen);
	    helper.Scrollintoview(lastSeen);
	    lastSeenDate_today13 = lastSeen.getText();
	    helper.Scrollintoview(Domain_Rgsd_Date);
	    String DomainRgsdDate13=Domain_Rgsd_Date.getText();
	    Reporter.log("<B><font color = 'blue'> ==> -</font> Last_Seen_ AdDetails Page= " +  lastSeenDate_today13);
	    Reporter.log("<B><font color = 'blue'> ==> -</font> Domain_Rgsd_Date AdDetails Page= " +  DomainRgsdDate13);
	    System.out.println("lastSeenDate_today: "+lastSeenDate_today13);
	    System.out.println("Domain Rgsd Date: "+DomainRgsdDate13);   
	    driver.close();
	    driver.switchTo().window(parent13);
	    helper.getLastseenDate(lastSeenDate_today13, imageDate13);
	    }
	    catch(Exception e)
		{
	    	System.out.println("Image is not able: Oops! Looks like we don't have data for this search criteria yet.");

			Reporter.log("<B><font color = 'orange'> Step5 -</font> Image is not able: Oops! Looks like we don't have data for this search criteria yet.");
	    }
		
		try
		{
		String lastSeenDate_today14=null;
		Reporter.log(" ");
		Reporter.log("<B><font color ='red'> 14 Ad -</font> ");
		System.out.println("");
		System.out.println("14 Ads");
		Reporter.log("<B><font color = 'blue'> ==> -</font> Ads Caputure Image Date :");
		System.out.println("Ads Caputure Image Date");
		String  imageDate14= date14.getText();
		Reporter.log("<B><font color = 'blue'> ==> -</font> Image Date is :"+imageDate14);
		System.out.println("Current Date: "+imageDate14);
	
		helper.waitFor(ShowAnalytics14);
		helper.highLightElement(driver, ShowAnalytics14);
		helper.Scrollintoview(ShowAnalytics14);
		String linkText14 = ShowAnalytics14.getAttribute("href");
		helper.getAdID(linkText14);
		ShowAnalytics14.click();
		Reporter.log("<B><font color = 'blue'> ==> -</font> Clicked On Show Analytics Icon");
		helper.waitForPageToLoad();
		
		Set<String> S14=driver.getWindowHandles();
	    Iterator<String>it14=S14.iterator();
	    String parent14=it14.next();
	    String child14=it14.next();
	    
	    driver.switchTo().window(child14);

	    helper.waitForPageToLoad();
	    helper.waitFor(lastSeen);
	    helper.highLightElement(driver, lastSeen);
	    helper.Scrollintoview(lastSeen);
	    lastSeenDate_today14 = lastSeen.getText();
	    helper.Scrollintoview(Domain_Rgsd_Date);
	    String DomainRgsdDate14=Domain_Rgsd_Date.getText();
	    Reporter.log("<B><font color = 'blue'> ==> -</font> Last_Seen_ AdDetails Page= " +  lastSeenDate_today14);
	    Reporter.log("<B><font color = 'blue'> ==> -</font> Domain_Rgsd_Date AdDetails Page= " +  DomainRgsdDate14);
	    System.out.println("lastSeenDate_today: "+lastSeenDate_today14);
	    System.out.println("Domain Rgsd Date: "+DomainRgsdDate14);   
	    driver.close();
	    driver.switchTo().window(parent14);
	    helper.getLastseenDate(lastSeenDate_today14, imageDate14);
	    }
	    catch(Exception e)
		{
	    	System.out.println("Image is not able: Oops! Looks like we don't have data for this search criteria yet.");

			Reporter.log("<B><font color = 'orange'> Step5 -</font> Image is not able: Oops! Looks like we don't have data for this search criteria yet.");
	    }
		
		try
		{
		String lastSeenDate_today15=null;
		Reporter.log(" ");
		Reporter.log("<B><font color ='red'> 15 Ad -</font> ");
		System.out.println("");
		System.out.println("15 Ads");
		Reporter.log("<B><font color = 'blue'> ==> -</font> Ads Caputure Image Date :");
		System.out.println("Ads Caputure Image Date");
		String  imageDate15= date15.getText();
		Reporter.log("<B><font color = 'blue'> ==> -</font> Image Date is :"+imageDate15);
		System.out.println("Current Date: "+imageDate15);
	
		helper.waitFor(ShowAnalytics15);
		helper.highLightElement(driver, ShowAnalytics15);
		helper.Scrollintoview(ShowAnalytics15);
		String linkText15 = ShowAnalytics15.getAttribute("href");
		helper.getAdID(linkText15);
		ShowAnalytics15.click();
		Reporter.log("<B><font color = 'blue'> ==> -</font> Clicked On Show Analytics Icon");
		helper.waitForPageToLoad();
		
		Set<String> S15=driver.getWindowHandles();
	    Iterator<String>it15=S15.iterator();
	    String parent15=it15.next();
	    String child15=it15.next();
	    
	    driver.switchTo().window(child15);

	    helper.waitForPageToLoad();
	    helper.waitFor(lastSeen);
	    helper.highLightElement(driver, lastSeen);
	    helper.Scrollintoview(lastSeen);
	    lastSeenDate_today15 = lastSeen.getText();
	    helper.Scrollintoview(Domain_Rgsd_Date);
	    String DomainRgsdDate15=Domain_Rgsd_Date.getText();
	    Reporter.log("<B><font color = 'blue'> ==> -</font> Last_Seen_ AdDetails Page= " +  lastSeenDate_today15);
	    Reporter.log("<B><font color = 'blue'> ==> -</font> Domain_Rgsd_Date AdDetails Page= " +  DomainRgsdDate15);
	    System.out.println("lastSeenDate_today: "+lastSeenDate_today15);
	    System.out.println("Domain Rgsd Date: "+DomainRgsdDate15);   
	    driver.close();
	    driver.switchTo().window(parent15);
	    helper.getLastseenDate(lastSeenDate_today15, imageDate15);
	    }
	    catch(Exception e)
		{
	    	System.out.println("Image is not able: Oops! Looks like we don't have data for this search criteria yet.");
			Reporter.log("<B><font color = 'orange'> Step5 -</font> Image is not able: Oops! Looks like we don't have data for this search criteria yet.");
	    }		
		
		
	}
	public void DomainRegistrationDate_Today()	throws InterruptedException
		{
			Reporter.log("    ");
			System.out.println();
			helper.waitForPageToLoad();
			Reporter.log("<B><font color = 'green'> -ShortBy Newest -Ad Domain Registration Date Today Step will Start from here </font> ");
			helper.waitFor(domainRegistrationfilter);
			helper.highLightElement(driver, domainRegistrationfilter);
			helper.jsScrollintoview(domainRegistrationfilter);
			domainRegistrationfilter.click();
			Reporter.log("<B><font color = 'orange'> Step1-</font> Clicked On Ad Domain Registration Date filter Icon");

			helper.waitFor(Today);
			helper.highLightElement(driver, Today);
			helper.jsScrollintoview(Today);
			Today.click();
			Reporter.log("<B><font color = 'orange'> Step2 -</font> Clicked On Domain Registration Date Today Icon");

			helper.waitFor(searchButton);
			helper.highLightElement(driver, searchButton);
			helper.jsScrollintoview(searchButton);
			searchButton.click();
			Reporter.log("<B><font color = 'orange'> Step3 -</font> Clicked On search Button Icon");
			helper.waitForPageToLoad();

			String totaladscount=totaladscount_ad.getText();
			System.out.println("Totaladscount: "+totaladscount);
			Reporter.log("<B><font color = 'orange'> Step4 -</font>  Total Ad Count is :"+ totaladscount);
			
			try
			{
			String lastSeenDate_today1=null;
			Reporter.log(" ");
			Reporter.log("<B><font color ='red'> 1 Ad -</font>  ");
			System.out.println("");
			System.out.println("1 Ads");
			String  imageDate1= date1.getText();
			Reporter.log("<B><font color = 'blue'> ==> -</font> Ads Caputure Image Date :");
			System.out.println("Ads Caputure Image Date");
			Reporter.log("<B><font color = 'blue'> ==> -</font> Image Date is :"+imageDate1);
			System.out.println("Current Date: "+imageDate1);
		
			helper.waitFor(ShowAnalytics1);
			helper.highLightElement(driver, ShowAnalytics1);
			helper.Scrollintoview(ShowAnalytics1);
			String linkText1 = ShowAnalytics1.getAttribute("href");
			helper.getAdID(linkText1);
			ShowAnalytics1.click();
			Reporter.log("<B><font color = 'blue'> ==> -</font> Clicked On Show Analytics Icon");
			helper.waitForPageToLoad();
			
			Set<String> S1=driver.getWindowHandles();
		    Iterator<String>it1=S1.iterator();
		    String parent1=it1.next();
		    String child1=it1.next();
		    
		    driver.switchTo().window(child1);

		    helper.waitForPageToLoad();
		    helper.waitFor(lastSeen);
		    helper.highLightElement(driver, lastSeen);
		    helper.Scrollintoview(lastSeen);
		    lastSeenDate_today1 = lastSeen.getText();
		    helper.Scrollintoview(Domain_Rgsd_Date);
		    String DomainRgsdDate1=Domain_Rgsd_Date.getText();
		    Reporter.log("<B><font color = 'blue'> ==> -</font> Last_Seen_ AdDetails Page= " +  lastSeenDate_today1);
		    Reporter.log("<B><font color = 'blue'> ==> -</font> Domain_Rgsd_Date AdDetails Page= " +  DomainRgsdDate1);
		    System.out.println("lastSeenDate_today: "+lastSeenDate_today1);
		    System.out.println("Domain Rgsd Date: "+DomainRgsdDate1);   
		    driver.close();
		    driver.switchTo().window(parent1);
		    helper.getLastseenDate(lastSeenDate_today1, imageDate1);
		    }
		    catch(Exception e)
			{
		    	System.out.println("Image is not able: Oops! Looks like we don't have data for this search criteria yet.");

				Reporter.log("<B><font color = 'orange'> Step5 -</font> Image is not able: Oops! Looks like we don't have data for this search criteria yet.");
		    }

			try
			{
			String lastSeenDate_today2=null;
			Reporter.log(" ");
			Reporter.log("<B><font color ='red'> 2 Ad -</font>  ");
			System.out.println("");
			System.out.println("2 Ads");
			String  imageDate2= date2.getText();
			Reporter.log("<B><font color = 'blue'> ==> -</font> Ads Caputure Image Date :");
			System.out.println("Ads Caputure Image Date");
			Reporter.log("<B><font color = 'blue'> ==> -</font> Image Date is :"+imageDate2);
			System.out.println("Current Date: "+imageDate2);
		
			helper.waitFor(ShowAnalytics2);
			helper.highLightElement(driver, ShowAnalytics2);
			helper.Scrollintoview(ShowAnalytics2);
			String linkText2 = ShowAnalytics2.getAttribute("href");
			helper.getAdID(linkText2);
			ShowAnalytics2.click();
			Reporter.log("<B><font color = 'blue'> ==> -</font> Clicked On Show Analytics Icon");
			helper.waitForPageToLoad();
			
			Set<String> S2=driver.getWindowHandles();
		    Iterator<String>it2=S2.iterator();
		    String parent2=it2.next();
		    String child2=it2.next();
		    
		    driver.switchTo().window(child2);

		    helper.waitForPageToLoad();
		    helper.waitFor(lastSeen);
		    helper.highLightElement(driver, lastSeen);
		    helper.Scrollintoview(lastSeen);
		    lastSeenDate_today2 = lastSeen.getText();
		    helper.Scrollintoview(Domain_Rgsd_Date);
		    String DomainRgsdDate2=Domain_Rgsd_Date.getText();
		    Reporter.log("<B><font color = 'blue'> ==> -</font> Last_Seen_ AdDetails Page= " +  lastSeenDate_today2);
		    Reporter.log("<B><font color = 'blue'> ==> -</font> Domain_Rgsd_Date AdDetails Page= " +  DomainRgsdDate2);
		    System.out.println("lastSeenDate_today: "+lastSeenDate_today2);
		    System.out.println("Domain Rgsd Date: "+DomainRgsdDate2);   
		    driver.close();
		    driver.switchTo().window(parent2);
		    helper.getLastseenDate(lastSeenDate_today2, imageDate2);
		    }
		    catch(Exception e)
			{
		    	System.out.println("Image is not able: Oops! Looks like we don't have data for this search criteria yet.");

				Reporter.log("<B><font color = 'orange'> Step8 -</font> Image is not able: Oops! Looks like we don't have data for this search criteria yet.");
		    }

			try
			{
			String lastSeenDate_today3=null;
			Reporter.log(" ");
			Reporter.log("<B><font color ='red'> 3 Ad -</font>  ");
			System.out.println("");
			System.out.println("3 Ads");
		
			String  imageDate3= date3.getText();
			Reporter.log("<B><font color = 'blue'> ==> -</font> Ads Caputure Image Date :");
			Reporter.log("<B><font color = 'blue'> ==> -</font> Image Date is :"+imageDate3);
			System.out.println("Current Date: "+imageDate3);
		
			helper.waitFor(ShowAnalytics3);
			helper.highLightElement(driver, ShowAnalytics3);
			helper.Scrollintoview(ShowAnalytics3);
			String linkText3 = ShowAnalytics3.getAttribute("href");
			helper.getAdID(linkText3);
			ShowAnalytics3.click();
			Reporter.log("<B><font color = 'blue'> ==> -</font> Clicked On Show Analytics Icon");
			helper.waitForPageToLoad();
			
			Set<String> S3=driver.getWindowHandles();
		    Iterator<String>it3=S3.iterator();
		    String parent3=it3.next();
		    String child3=it3.next();
		    
		    driver.switchTo().window(child3);

		    helper.waitForPageToLoad();
		    helper.waitFor(lastSeen);
		    helper.highLightElement(driver, lastSeen);
		    helper.Scrollintoview(lastSeen);
		    lastSeenDate_today3 = lastSeen.getText();
		    helper.Scrollintoview(Domain_Rgsd_Date);
		    String DomainRgsdDate3=Domain_Rgsd_Date.getText();
		    Reporter.log("<B><font color = 'blue'> ==> -</font> Last_Seen_ AdDetails Page= " +  lastSeenDate_today3);
		    Reporter.log("<B><font color = 'blue'> ==> -</font> Domain_Rgsd_Date AdDetails Page= " +  DomainRgsdDate3);
		    System.out.println("lastSeenDate_today: "+lastSeenDate_today3);
		    System.out.println("Domain Rgsd Date: "+DomainRgsdDate3);   
		    driver.close();
		    driver.switchTo().window(parent3);
		    helper.getLastseenDate(lastSeenDate_today3, imageDate3);
		    }
		    catch(Exception e)
			{
		    	System.out.println("Image is not able: Oops! Looks like we don't have data for this search criteria yet.");

				Reporter.log("<B><font color = 'orange'> Step5 -</font> Image is not able: Oops! Looks like we don't have data for this search criteria yet.");
		    }
			
			try
			{
			String lastSeenDate_today4=null;
			Reporter.log(" ");
			Reporter.log("<B><font color ='red'> 4 Ad -</font>  ");
			System.out.println("");
			System.out.println("4 Ads");
			
			String  imageDate4= date4.getText();
			Reporter.log("<B><font color = 'blue'> ==> -</font> Ads Caputure Image Date :");
			System.out.println("Ads Caputure Image Date");
			Reporter.log("<B><font color = 'blue'> ==> -</font> Image Date is :"+imageDate4);
			System.out.println("Current Date: "+imageDate4);
		
			helper.waitFor(ShowAnalytics4);
			helper.highLightElement(driver, ShowAnalytics4);
			helper.Scrollintoview(ShowAnalytics4);
			String linkText4 = ShowAnalytics4.getAttribute("href");
			helper.getAdID(linkText4);
			ShowAnalytics4.click();
			Reporter.log("<B><font color = 'blue'> ==> -</font> Clicked On Show Analytics Icon");
			helper.waitForPageToLoad();
			
			Set<String> S4=driver.getWindowHandles();
		    Iterator<String>it4=S4.iterator();
		    String parent4=it4.next();
		    String child4=it4.next();
		    
		    driver.switchTo().window(child4);

		    helper.waitForPageToLoad();
		    helper.waitFor(lastSeen);
		    helper.highLightElement(driver, lastSeen);
		    helper.Scrollintoview(lastSeen);
		    lastSeenDate_today4 = lastSeen.getText();
		    helper.Scrollintoview(Domain_Rgsd_Date);
		    String DomainRgsdDate4=Domain_Rgsd_Date.getText();
		    Reporter.log("<B><font color = 'blue'> ==> -</font> Last_Seen_ AdDetails Page= " +  lastSeenDate_today4);
		    Reporter.log("<B><font color = 'blue'> ==> -</font> Domain_Rgsd_Date AdDetails Page= " +  DomainRgsdDate4);
		    System.out.println("lastSeenDate_today: "+lastSeenDate_today4);
		    System.out.println("Domain Rgsd Date: "+DomainRgsdDate4);   
		    driver.close();
		    driver.switchTo().window(parent4);
		    helper.getLastseenDate(lastSeenDate_today4, imageDate4);
		    }
		    catch(Exception e)
			{
		    	System.out.println("Image is not able: Oops! Looks like we don't have data for this search criteria yet.");

				Reporter.log("<B><font color = 'orange'> Step5 -</font> Image is not able: Oops! Looks like we don't have data for this search criteria yet.");
			}
				try
			{
			String lastSeenDate_today5=null;
			Reporter.log(" ");
			Reporter.log("<B><font color ='red'> 5 Ad -</font>  ");
			System.out.println("");
			System.out.println("5 Ads");
			
			String  imageDate5= date5.getText();
			Reporter.log("<B><font color = 'blue'> ==> -</font> Ads Caputure Image Date :");
			System.out.println("Ads Caputure Image Date");
			Reporter.log("<B><font color = 'blue'> ==> -</font> Image Date is :"+imageDate5);
			System.out.println("Current Date: "+imageDate5);
		
			helper.waitFor(ShowAnalytics5);
			helper.highLightElement(driver, ShowAnalytics5);
			helper.Scrollintoview(ShowAnalytics5);
			String linkText5 = ShowAnalytics5.getAttribute("href");
			helper.getAdID(linkText5);
			ShowAnalytics5.click();
			Reporter.log("<B><font color = 'blue'> ==> -</font> Clicked On Show Analytics Icon");
			helper.waitForPageToLoad();
			
			Set<String> S5=driver.getWindowHandles();
		    Iterator<String>it5=S5.iterator();
		    String parent5=it5.next();
		    String child5=it5.next();
		    
		    driver.switchTo().window(child5);

		    helper.waitForPageToLoad();
		    helper.waitFor(lastSeen);
		    helper.highLightElement(driver, lastSeen);
		    helper.Scrollintoview(lastSeen);
		    lastSeenDate_today5 = lastSeen.getText();
		    helper.Scrollintoview(Domain_Rgsd_Date);
		    String DomainRgsdDate5=Domain_Rgsd_Date.getText();
		    Reporter.log("<B><font color = 'blue'> ==> -</font> Last_Seen_ AdDetails Page= " +  lastSeenDate_today5);
		    Reporter.log("<B><font color = 'blue'> ==> -</font> Domain_Rgsd_Date AdDetails Page= " +  DomainRgsdDate5);
		    System.out.println("lastSeenDate_today: "+lastSeenDate_today5);
		    System.out.println("Domain Rgsd Date: "+DomainRgsdDate5);   
		    driver.close();
		    driver.switchTo().window(parent5);
		    helper.getLastseenDate(lastSeenDate_today5, imageDate5);
		    }
		    catch(Exception e1)
			{
		    	System.out.println("Image is not able: Oops! Looks like we don't have data for this search criteria yet.");

				Reporter.log("<B><font color = 'orange'> Step5 -</font> Image is not able: Oops! Looks like we don't have data for this search criteria yet.");
		    }
			
			try
			{
			String lastSeenDate_today6=null;
			Reporter.log(" ");
			Reporter.log("<B><font color ='red'> 6 Ad -</font>  ");
			System.out.println("");
			System.out.println("6 Ads");
			
			String  imageDate6= date6.getText();
			Reporter.log("<B><font color = 'blue'> ==> -</font> Ads Caputure Image Date :");
			System.out.println("Ads Caputure Image Date");
			Reporter.log("<B><font color = 'blue'> ==> -</font> Image Date is :"+imageDate6);
			System.out.println("Current Date: "+imageDate6);
		
			helper.waitFor(ShowAnalytics6);
			helper.highLightElement(driver, ShowAnalytics6);
			helper.Scrollintoview(ShowAnalytics6);
			String linkText6 = ShowAnalytics6.getAttribute("href");
			helper.getAdID(linkText6);
			ShowAnalytics6.click();
			Reporter.log("<B><font color = 'blue'> ==> -</font> Clicked On Show Analytics Icon");
			helper.waitForPageToLoad();
			
			Set<String> S6=driver.getWindowHandles();
		    Iterator<String>it6=S6.iterator();
		    String parent6=it6.next();
		    String child6=it6.next();
		    
		    driver.switchTo().window(child6);

		    helper.waitForPageToLoad();
		    helper.waitFor(lastSeen);
		    helper.highLightElement(driver, lastSeen);
		    helper.Scrollintoview(lastSeen);
		    lastSeenDate_today6 = lastSeen.getText();
		    helper.Scrollintoview(Domain_Rgsd_Date);
		    String DomainRgsdDate6=Domain_Rgsd_Date.getText();
		    Reporter.log("<B><font color = 'blue'> ==> -</font> Last_Seen_ AdDetails Page= " +  lastSeenDate_today6);
		    Reporter.log("<B><font color = 'blue'> ==> -</font> Domain_Rgsd_Date AdDetails Page= " +  DomainRgsdDate6);
		    System.out.println("lastSeenDate_today: "+lastSeenDate_today6);
		    System.out.println("Domain Rgsd Date: "+DomainRgsdDate6);   
		    driver.close();
		    driver.switchTo().window(parent6);
		    helper.getLastseenDate(lastSeenDate_today6, imageDate6);
		    }
		    catch(Exception e1)
			{
		    	System.out.println("Image is not able: Oops! Looks like we don't have data for this search criteria yet.");

				Reporter.log("<B><font color = 'orange'> Step5 -</font> Image is not able: Oops! Looks like we don't have data for this search criteria yet.");
		    }
			
			try
			{
			String lastSeenDate_today7=null;
			Reporter.log(" ");
			Reporter.log("<B><font color ='red'> 7 Ad -</font>  ");
			System.out.println("");
			System.out.println("7 Ads");

			String  imageDate7= date7.getText();
			Reporter.log("<B><font color = 'blue'> ==> -</font> Ads Caputure Image Date :");
			System.out.println("Ads Caputure Image Date");
			Reporter.log("<B><font color = 'blue'> ==> -</font> Image Date is :"+imageDate7);
			System.out.println("Current Date: "+imageDate7);
		
			helper.waitFor(ShowAnalytics7);
			helper.highLightElement(driver, ShowAnalytics7);
			helper.Scrollintoview(ShowAnalytics7);
			String linkText7 = ShowAnalytics7.getAttribute("href");
			helper.getAdID(linkText7);
			ShowAnalytics7.click();
			Reporter.log("<B><font color = 'blue'> ==> -</font> Clicked On Show Analytics Icon");
			helper.waitForPageToLoad();
			
			Set<String> S7=driver.getWindowHandles();
		    Iterator<String>it7=S7.iterator();
		    String parent7=it7.next();
		    String child7=it7.next();
		    
		    driver.switchTo().window(child7);

		    helper.waitForPageToLoad();
		    helper.waitFor(lastSeen);
		    helper.highLightElement(driver, lastSeen);
		    helper.Scrollintoview(lastSeen);
		    lastSeenDate_today7 = lastSeen.getText();
		    helper.Scrollintoview(Domain_Rgsd_Date);
		    String DomainRgsdDate7=Domain_Rgsd_Date.getText();
		    Reporter.log("<B><font color = 'blue'> ==> -</font> Last_Seen_ AdDetails Page= " +  lastSeenDate_today7);
		    Reporter.log("<B><font color = 'blue'> ==> -</font> Domain_Rgsd_Date AdDetails Page= " +  DomainRgsdDate7);
		    System.out.println("lastSeenDate_today: "+lastSeenDate_today7);
		    System.out.println("Domain Rgsd Date: "+DomainRgsdDate7);   
		    driver.close();
		    driver.switchTo().window(parent7);
		    helper.getLastseenDate(lastSeenDate_today7, imageDate7);
		    }
		    catch(Exception e1)
			{
		    	System.out.println("Image is not able: Oops! Looks like we don't have data for this search criteria yet.");

				Reporter.log("<B><font color = 'orange'> Step5 -</font> Image is not able: Oops! Looks like we don't have data for this search criteria yet.");
		    }
			
			try
			{
			String lastSeenDate_today8=null;
			Reporter.log(" ");
			Reporter.log("<B><font color ='red'> 8 Ad -</font>  ");
			System.out.println("");
			System.out.println("8 Ads");

			String  imageDate8= date8.getText();
			Reporter.log("<B><font color = 'blue'> ==> -</font> Ads Caputure Image Date :");
			System.out.println("Ads Caputure Image Date");
			Reporter.log("<B><font color = 'blue'> ==> -</font> Image Date is :"+imageDate8);
			System.out.println("Current Date: "+imageDate8);
		
			helper.waitFor(ShowAnalytics8);
			helper.highLightElement(driver, ShowAnalytics8);
			helper.Scrollintoview(ShowAnalytics8);
			String linkText8 = ShowAnalytics8.getAttribute("href");
			helper.getAdID(linkText8);
			ShowAnalytics8.click();
			Reporter.log("<B><font color = 'blue'> ==> -</font> Clicked On Show Analytics Icon");
			helper.waitForPageToLoad();
			
			Set<String> S8=driver.getWindowHandles();
		    Iterator<String>it8=S8.iterator();
		    String parent8=it8.next();
		    String child8=it8.next();
		    
		    driver.switchTo().window(child8);

		    helper.waitForPageToLoad();
		    helper.waitFor(lastSeen);
		    helper.highLightElement(driver, lastSeen);
		    helper.Scrollintoview(lastSeen);
		    lastSeenDate_today8 = lastSeen.getText();
		    helper.Scrollintoview(Domain_Rgsd_Date);
		    String DomainRgsdDate8=Domain_Rgsd_Date.getText();
		    Reporter.log("<B><font color = 'blue'> ==> -</font> Last_Seen_ AdDetails Page= " +  lastSeenDate_today8);
		    Reporter.log("<B><font color = 'blue'> ==> -</font> Domain_Rgsd_Date AdDetails Page= " +  DomainRgsdDate8);
		    System.out.println("lastSeenDate_today: "+lastSeenDate_today8);
		    System.out.println("Domain Rgsd Date: "+DomainRgsdDate8);   
		    driver.close();
		    driver.switchTo().window(parent8);
		    helper.getLastseenDate(lastSeenDate_today8, imageDate8);
		    }
		    catch(Exception e1)
			{
		    	System.out.println("Image is not able: Oops! Looks like we don't have data for this search criteria yet.");

				Reporter.log("<B><font color = 'orange'> Step5 -</font> Image is not able: Oops! Looks like we don't have data for this search criteria yet.");
		    }
			
			try
			{
			String lastSeenDate_today9=null;
			Reporter.log(" ");
			Reporter.log("<B><font color ='red'> 9 Ad -</font>  ");
			System.out.println("");
			System.out.println("9 Ads");

			String  imageDate9= date9.getText();
			Reporter.log("<B><font color = 'blue'> ==> -</font> Ads Caputure Image Date :");
			System.out.println("Ads Caputure Image Date");
			Reporter.log("<B><font color = 'blue'> ==> -</font> Image Date is :"+imageDate9);
			System.out.println("Current Date: "+imageDate9);
		
			helper.waitFor(ShowAnalytics9);
			helper.highLightElement(driver, ShowAnalytics9);
			helper.Scrollintoview(ShowAnalytics9);
			String linkText9 = ShowAnalytics9.getAttribute("href");
			helper.getAdID(linkText9);
			ShowAnalytics9.click();
			Reporter.log("<B><font color = 'blue'> ==> -</font> Clicked On Show Analytics Icon");
			helper.waitForPageToLoad();
			
			Set<String> S9=driver.getWindowHandles();
		    Iterator<String>it9=S9.iterator();
		    String parent9=it9.next();
		    String child9=it9.next();
		    
		    driver.switchTo().window(child9);

		    helper.waitForPageToLoad();
		    helper.waitFor(lastSeen);
		    helper.highLightElement(driver, lastSeen);
		    helper.Scrollintoview(lastSeen);
		    lastSeenDate_today9 = lastSeen.getText();
		    helper.Scrollintoview(Domain_Rgsd_Date);
		    String DomainRgsdDate9=Domain_Rgsd_Date.getText();
		    Reporter.log("<B><font color = 'blue'> ==> -</font> Last_Seen_ AdDetails Page= " +  lastSeenDate_today9);
		    Reporter.log("<B><font color = 'blue'> ==> -</font> Domain_Rgsd_Date AdDetails Page= " +  DomainRgsdDate9);
		    System.out.println("lastSeenDate_today: "+lastSeenDate_today9);
		    System.out.println("Domain Rgsd Date: "+DomainRgsdDate9);   
		    driver.close();
		    driver.switchTo().window(parent9);
		    helper.getLastseenDate(lastSeenDate_today9, imageDate9);
		    }
		    catch(Exception e1)
			{
		    	System.out.println("Image is not able: Oops! Looks like we don't have data for this search criteria yet.");

		    	Reporter.log("<B><font color = 'orange'> Step5 -</font> Image is not able: Oops! Looks like we don't have data for this search criteria yet.");
		    }
			
			try
			{
			String lastSeenDate_today10=null;
			Reporter.log(" ");
			Reporter.log("<B><font color ='red'> 10 Ad -</font>  ");
			System.out.println("");
			System.out.println("10 Ads");
		
			String  imageDate10= date10.getText();
			Reporter.log("<B><font color = 'blue'> ==> -</font> Ads Caputure Image Date :");
			System.out.println("Ads Caputure Image Date");
			Reporter.log("<B><font color = 'blue'> ==> -</font> Image Date is :"+imageDate10);
			System.out.println("Current Date: "+imageDate10);
		
			helper.waitFor(ShowAnalytics10);
			helper.highLightElement(driver, ShowAnalytics10);
			helper.Scrollintoview(ShowAnalytics10);
			String linkText10 = ShowAnalytics10.getAttribute("href");
			helper.getAdID(linkText10);
			ShowAnalytics10.click();
			Reporter.log("<B><font color = 'blue'> ==> -</font> Clicked On Show Analytics Icon");
			helper.waitForPageToLoad();
			
			Set<String> S10=driver.getWindowHandles();
		    Iterator<String>it10=S10.iterator();
		    String parent10=it10.next();
		    String child10=it10.next();
		    
		    driver.switchTo().window(child10);

		    helper.waitForPageToLoad();
		    helper.waitFor(lastSeen);
		    helper.highLightElement(driver, lastSeen);
		    helper.Scrollintoview(lastSeen);
		    lastSeenDate_today10 = lastSeen.getText();
		    helper.Scrollintoview(Domain_Rgsd_Date);
		    String DomainRgsdDate10=Domain_Rgsd_Date.getText();
		    Reporter.log("<B><font color = 'blue'> ==> -</font> Last_Seen_ AdDetails Page= " +  lastSeenDate_today10);
		    Reporter.log("<B><font color = 'blue'> ==> -</font> Domain_Rgsd_Date AdDetails Page= " +  DomainRgsdDate10);
		    System.out.println("lastSeenDate_today: "+lastSeenDate_today10);
		    System.out.println("Domain Rgsd Date: "+DomainRgsdDate10);   
		    driver.close();
		    driver.switchTo().window(parent10);
		    helper.getLastseenDate(lastSeenDate_today10, imageDate10);
		    }
		    catch(Exception e1)
			{
		    	System.out.println("Image is not able: Oops! Looks like we don't have data for this search criteria yet.");

				Reporter.log("<B><font color = 'orange'> Step5 -</font> Image is not able: Oops! Looks like we don't have data for this search criteria yet.");
		    }
			
			try
			{
			String lastSeenDate_today11=null;
			Reporter.log(" ");
			Reporter.log("<B><font color ='red'> 11 Ad -</font>  ");
			System.out.println("");
			System.out.println("11 Ads");

			String  imageDate11= date11.getText();
			Reporter.log("<B><font color = 'blue'> ==> -</font> Ads Caputure Image Date :");
			System.out.println("Ads Caputure Image Date");
			Reporter.log("<B><font color = 'blue'> ==> -</font> Image Date is :"+imageDate11);
			System.out.println("Current Date: "+imageDate11);
		
			helper.waitFor(ShowAnalytics11);
			helper.highLightElement(driver, ShowAnalytics11);
			helper.Scrollintoview(ShowAnalytics11);
			String linkText11 = ShowAnalytics11.getAttribute("href");
			helper.getAdID(linkText11);
			ShowAnalytics11.click();
			Reporter.log("<B><font color = 'blue'> ==> -</font> Clicked On Show Analytics Icon");
			helper.waitForPageToLoad();
			
			Set<String> S11=driver.getWindowHandles();
		    Iterator<String>it11=S11.iterator();
		    String parent11=it11.next();
		    String child11=it11.next();
		    
		    driver.switchTo().window(child11);

		    helper.waitForPageToLoad();
		    helper.waitFor(lastSeen);
		    helper.highLightElement(driver, lastSeen);
		    helper.Scrollintoview(lastSeen);
		    lastSeenDate_today11 = lastSeen.getText();
		    helper.Scrollintoview(Domain_Rgsd_Date);
		    String DomainRgsdDate11=Domain_Rgsd_Date.getText();
		    Reporter.log("<B><font color = 'blue'> ==> -</font> Last_Seen_ AdDetails Page= " +  lastSeenDate_today11);
		    Reporter.log("<B><font color = 'blue'> ==> -</font> Domain_Rgsd_Date AdDetails Page= " +  DomainRgsdDate11);
		    System.out.println("lastSeenDate_today: "+lastSeenDate_today11);
		    System.out.println("Domain Rgsd Date: "+DomainRgsdDate11);   
		    driver.close();
		    driver.switchTo().window(parent11);
		    helper.getLastseenDate(lastSeenDate_today11, imageDate11);
		    }
		    catch(Exception e1)
			{
		    	System.out.println("Image is not able: Oops! Looks like we don't have data for this search criteria yet.");

				Reporter.log("<B><font color = 'orange'> Step5 -</font> Image is not able: Oops! Looks like we don't have data for this search criteria yet.");
		    }
			
			
			try
			{
			String lastSeenDate_today12=null;
			Reporter.log(" ");
			Reporter.log("<B><font color ='red'> 12 Ad -</font> ");
			System.out.println("");
			System.out.println("12 Ads");
			String  imageDate12= date12.getText();
			Reporter.log("<B><font color = 'blue'> ==> -</font> Ads Caputure Image Date :");
			System.out.println("Ads Caputure Image Date");
			Reporter.log("<B><font color = 'blue'> ==> -</font> Image Date is :"+imageDate12);
			System.out.println("Current Date: "+imageDate12);
		
			helper.waitFor(ShowAnalytics12);
			helper.highLightElement(driver, ShowAnalytics12);
			helper.Scrollintoview(ShowAnalytics12);
			String linkText12 = ShowAnalytics12.getAttribute("href");
			helper.getAdID(linkText12);
			ShowAnalytics12.click();
			Reporter.log("<B><font color = 'blue'> ==> -</font> Clicked On Show Analytics Icon");
			helper.waitForPageToLoad();
			
			Set<String> S12=driver.getWindowHandles();
		    Iterator<String>it12=S12.iterator();
		    String parent12=it12.next();
		    String child12=it12.next();
		    
		    driver.switchTo().window(child12);

		    helper.waitForPageToLoad();
		    helper.waitFor(lastSeen);
		    helper.highLightElement(driver, lastSeen);
		    helper.Scrollintoview(lastSeen);
		    lastSeenDate_today12 = lastSeen.getText();
		    helper.Scrollintoview(Domain_Rgsd_Date);
		    String DomainRgsdDate12=Domain_Rgsd_Date.getText();
		    Reporter.log("<B><font color = 'blue'> ==> -</font> Last_Seen_ AdDetails Page= " +  lastSeenDate_today12);
		    Reporter.log("<B><font color = 'blue'> ==> -</font> Domain_Rgsd_Date AdDetails Page= " +  DomainRgsdDate12);
		    System.out.println("lastSeenDate_today: "+lastSeenDate_today12);
		    System.out.println("Domain Rgsd Date: "+DomainRgsdDate12);   
		    driver.close();
		    driver.switchTo().window(parent12);
		    helper.getLastseenDate(lastSeenDate_today12, imageDate12);
		    }
		    catch(Exception e1)
			{
		    	System.out.println("Image is not able: Oops! Looks like we don't have data for this search criteria yet.");

				Reporter.log("<B><font color = 'orange'> Step5 -</font> Image is not able: Oops! Looks like we don't have data for this search criteria yet.");
		    }
			
			
			try
			{
			String lastSeenDate_today13=null;
			Reporter.log(" ");
			Reporter.log("<B><font color ='red'> 13 Ad -</font> ");
			System.out.println("");
			System.out.println("13 Ads");

			String  imageDate13= date13.getText();
			Reporter.log("<B><font color = 'blue'> ==> -</font> Ads Caputure Image Date :");
			System.out.println("Ads Caputure Image Date");
			Reporter.log("<B><font color = 'blue'> ==> -</font> Image Date is :"+imageDate13);
			System.out.println("Current Date: "+imageDate13);
		
			helper.waitFor(ShowAnalytics13);
			helper.highLightElement(driver, ShowAnalytics13);
			helper.Scrollintoview(ShowAnalytics13);
			String linkText13 = ShowAnalytics13.getAttribute("href");
			helper.getAdID(linkText13);
			ShowAnalytics13.click();
			Reporter.log("<B><font color = 'blue'> ==> -</font> Clicked On Show Analytics Icon");
			helper.waitForPageToLoad();
			
			Set<String> S13=driver.getWindowHandles();
		    Iterator<String>it13=S13.iterator();
		    String parent13=it13.next();
		    String child13=it13.next();
		    
		    driver.switchTo().window(child13);

		    helper.waitForPageToLoad();
		    helper.waitFor(lastSeen);
		    helper.highLightElement(driver, lastSeen);
		    helper.Scrollintoview(lastSeen);
		    lastSeenDate_today13 = lastSeen.getText();
		    helper.Scrollintoview(Domain_Rgsd_Date);
		    String DomainRgsdDate13=Domain_Rgsd_Date.getText();
		    Reporter.log("<B><font color = 'blue'> ==> -</font> Last_Seen_ AdDetails Page= " +  lastSeenDate_today13);
		    Reporter.log("<B><font color = 'blue'> ==> -</font> Domain_Rgsd_Date AdDetails Page= " +  DomainRgsdDate13);
		    System.out.println("lastSeenDate_today: "+lastSeenDate_today13);
		    System.out.println("Domain Rgsd Date: "+DomainRgsdDate13);   
		    driver.close();
		    driver.switchTo().window(parent13);
		    helper.getLastseenDate(lastSeenDate_today13, imageDate13);
		    }
		    catch(Exception e1)
			{
		    	System.out.println("Image is not able: Oops! Looks like we don't have data for this search criteria yet.");

				Reporter.log("<B><font color = 'orange'> Step5 -</font> Image is not able: Oops! Looks like we don't have data for this search criteria yet.");
		    }
			
			try
			{
			String lastSeenDate_today14=null;
			Reporter.log(" ");
			Reporter.log("<B><font color ='red'> 14 Ad -</font> ");
			System.out.println("");
			System.out.println("14 Ads");
		
			String  imageDate14= date14.getText();
			Reporter.log("<B><font color = 'blue'> ==> -</font> Ads Caputure Image Date :");
			System.out.println("Ads Caputure Image Date");
			Reporter.log("<B><font color = 'blue'> ==> -</font> Image Date is :"+imageDate14);
			System.out.println("Current Date: "+imageDate14);
		
			helper.waitFor(ShowAnalytics14);
			helper.highLightElement(driver, ShowAnalytics14);
			helper.Scrollintoview(ShowAnalytics14);
			String linkText14 = ShowAnalytics14.getAttribute("href");
			helper.getAdID(linkText14);
			ShowAnalytics14.click();
			Reporter.log("<B><font color = 'blue'> ==> -</font> Clicked On Show Analytics Icon");
			helper.waitForPageToLoad();
			
			Set<String> S14=driver.getWindowHandles();
		    Iterator<String>it14=S14.iterator();
		    String parent14=it14.next();
		    String child14=it14.next();
		    
		    driver.switchTo().window(child14);

		    helper.waitForPageToLoad();
		    helper.waitFor(lastSeen);
		    helper.highLightElement(driver, lastSeen);
		    helper.Scrollintoview(lastSeen);
		    lastSeenDate_today14 = lastSeen.getText();
		    helper.Scrollintoview(Domain_Rgsd_Date);
		    String DomainRgsdDate14=Domain_Rgsd_Date.getText();
		    Reporter.log("<B><font color = 'blue'> ==> -</font> Last_Seen_ AdDetails Page= " +  lastSeenDate_today14);
		    Reporter.log("<B><font color = 'blue'> ==> -</font> Domain_Rgsd_Date AdDetails Page= " +  DomainRgsdDate14);
		    System.out.println("lastSeenDate_today: "+lastSeenDate_today14);
		    System.out.println("Domain Rgsd Date: "+DomainRgsdDate14);   
		    driver.close();
		    driver.switchTo().window(parent14);
		    helper.getLastseenDate(lastSeenDate_today14, imageDate14);
		    }
		    catch(Exception e1)
			{
		    	System.out.println("Image is not able: Oops! Looks like we don't have data for this search criteria yet.");

				Reporter.log("<B><font color = 'orange'> Step5 -</font> Image is not able: Oops! Looks like we don't have data for this search criteria yet.");
		    }
			
			try
			{
			String lastSeenDate_today15=null;
			Reporter.log(" ");
			Reporter.log("<B><font color ='red'> 15 Ad -</font> ");
			System.out.println("");
			System.out.println("15 Ads");
		
			String  imageDate15= date15.getText();
			Reporter.log("<B><font color = 'blue'> ==> -</font> Ads Caputure Image Date :");
			System.out.println("Ads Caputure Image Date");
			Reporter.log("<B><font color = 'blue'> ==> -</font> Image Date is :"+imageDate15);
			System.out.println("Current Date: "+imageDate15);
		
			helper.waitFor(ShowAnalytics15);
			helper.highLightElement(driver, ShowAnalytics15);
			helper.Scrollintoview(ShowAnalytics15);
			String linkText15 = ShowAnalytics15.getAttribute("href");
			helper.getAdID(linkText15);
			ShowAnalytics15.click();
			Reporter.log("<B><font color = 'blue'> ==> -</font> Clicked On Show Analytics Icon");
			helper.waitForPageToLoad();
			
			Set<String> S15=driver.getWindowHandles();
		    Iterator<String>it15=S15.iterator();
		    String parent15=it15.next();
		    String child15=it15.next();
		    
		    driver.switchTo().window(child15);

		    helper.waitForPageToLoad();
		    helper.waitFor(lastSeen);
		    helper.highLightElement(driver, lastSeen);
		    helper.Scrollintoview(lastSeen);
		    lastSeenDate_today15 = lastSeen.getText();
		    helper.Scrollintoview(Domain_Rgsd_Date);
		    String DomainRgsdDate15=Domain_Rgsd_Date.getText();
		    Reporter.log("<B><font color = 'blue'> ==> -</font> Last_Seen_ AdDetails Page= " +  lastSeenDate_today15);
		    Reporter.log("<B><font color = 'blue'> ==> -</font> Domain_Rgsd_Date AdDetails Page= " +  DomainRgsdDate15);
		    System.out.println("lastSeenDate_today: "+lastSeenDate_today15);
		    System.out.println("Domain Rgsd Date: "+DomainRgsdDate15);   
		    driver.close();
		    driver.switchTo().window(parent15);
		    helper.getLastseenDate(lastSeenDate_today15, imageDate15);
		    }
		    catch(Exception e1)
			{
		    	System.out.println("Image is not able: Oops! Looks like we don't have data for this search criteria yet.");

				Reporter.log("<B><font color = 'orange'> Step5 -</font> Image is not able: Oops! Looks like we don't have data for this search criteria yet.");
		    }
			
	}
	
	public void DomainRegistrationDate_yesterday() throws InterruptedException
	{
		Reporter.log("   ");
		System.out.println();
		System.out.println("-ShortBy Newest -Ad Domain Registration Date -Yesterday:");
		helper.waitForPageToLoad();
		Reporter.log("<B><font color = 'green'> -ShortBy Newest -Ad Domain Registration Date Yesterday Step will Start from here </font> ");
		helper.waitFor(domainRegistrationfilter);
		helper.highLightElement(driver, domainRegistrationfilter);
		helper.jsScrollintoview(domainRegistrationfilter);
		domainRegistrationfilter.click();
		Reporter.log("<B><font color = 'orange'> Step1 -</font> Clicked On Ad Domain Registration Date filter Icon");

		helper.waitFor(yesterday);
		helper.highLightElement(driver, yesterday);
		helper.jsScrollintoview(yesterday);
		yesterday.click();
		Reporter.log("<B><font color = 'orange'> Step2 -</font> Clicked On Domain Registration Date Yesterday Icon");

		helper.waitFor(searchButton);
		helper.highLightElement(driver, searchButton);
		helper.jsScrollintoview(searchButton);
		searchButton.click();
		Reporter.log("<B><font color = 'orange'> Step3 -</font> Clicked On search Button Icon");
		helper.waitForPageToLoad();

		String totaladscount=totaladscount_ad.getText();
		System.out.println("Totaladscount: "+totaladscount);
		Reporter.log("<B><font color = 'orange'> Step4 -</font>  Total Ad Count is :"+ totaladscount);
		
		try
		{
		String lastSeenDate_today1=null;
		Reporter.log(" ");
		Reporter.log("<B><font color ='red'> 1 Ad -</font>  ");
		System.out.println("");
		System.out.println("1 Ads");
		String  imageDate1= date1.getText();
		Reporter.log("<B><font color = 'blue'> ==> -</font> Ads Caputure Image Date :");
		System.out.println("Ads Caputure Image Date");
		Reporter.log("<B><font color = 'blue'> ==> -</font> Image Date is :"+imageDate1);
		System.out.println("Current Date: "+imageDate1);
	
		helper.waitFor(ShowAnalytics1);
		helper.highLightElement(driver, ShowAnalytics1);
		helper.Scrollintoview(ShowAnalytics1);
		String linkText1 = ShowAnalytics1.getAttribute("href");
		helper.getAdID(linkText1);
		ShowAnalytics1.click();
		Reporter.log("<B><font color = 'blue'> ==> -</font> Clicked On Show Analytics Icon");
		helper.waitForPageToLoad();
		
		Set<String> S1=driver.getWindowHandles();
	    Iterator<String>it1=S1.iterator();
	    String parent1=it1.next();
	    String child1=it1.next();
	    
	    driver.switchTo().window(child1);

	    helper.waitForPageToLoad();
	    helper.waitFor(lastSeen);
	    helper.highLightElement(driver, lastSeen);
	    helper.Scrollintoview(lastSeen);
	    lastSeenDate_today1 = lastSeen.getText();
	    helper.Scrollintoview(Domain_Rgsd_Date);
	    String DomainRgsdDate1=Domain_Rgsd_Date.getText();
	    Reporter.log("<B><font color = 'blue'> ==> -</font> Last_Seen_ AdDetails Page= " +  lastSeenDate_today1);
	    Reporter.log("<B><font color = 'blue'> ==> -</font> Domain_Rgsd_Date AdDetails Page= " +  DomainRgsdDate1);
	    System.out.println("lastSeenDate_today: "+lastSeenDate_today1);
	    System.out.println("Domain Rgsd Date: "+DomainRgsdDate1);   
	    driver.close();
	    driver.switchTo().window(parent1);
	    helper.getLastseenDate(lastSeenDate_today1, imageDate1);
	    }
	    catch(Exception e)
		{
	    	System.out.println("Image is not able: Oops! Looks like we don't have data for this search criteria yet.");

			Reporter.log("<B><font color = 'orange'> Step5 -</font> Image is not able: Oops! Looks like we don't have data for this search criteria yet.");
	    }

		try
		{
		String lastSeenDate_today2=null;
		Reporter.log(" ");
		Reporter.log("<B><font color ='red'> 2 Ad -</font>  ");
		System.out.println("");
		System.out.println("2 Ads");
		String  imageDate2= date2.getText();
		Reporter.log("<B><font color = 'blue'> ==> -</font> Ads Caputure Image Date :");
		System.out.println("Ads Caputure Image Date");
		Reporter.log("<B><font color = 'blue'> ==> -</font> Image Date is :"+imageDate2);
		System.out.println("Current Date: "+imageDate2);
	
		helper.waitFor(ShowAnalytics2);
		helper.highLightElement(driver, ShowAnalytics2);
		helper.Scrollintoview(ShowAnalytics2);
		String linkText2 = ShowAnalytics2.getAttribute("href");
		helper.getAdID(linkText2);
		ShowAnalytics2.click();
		Reporter.log("<B><font color = 'blue'> ==> -</font> Clicked On Show Analytics Icon");
		helper.waitForPageToLoad();
		
		Set<String> S2=driver.getWindowHandles();
	    Iterator<String>it2=S2.iterator();
	    String parent2=it2.next();
	    String child2=it2.next();
	    
	    driver.switchTo().window(child2);

	    helper.waitForPageToLoad();
	    helper.waitFor(lastSeen);
	    helper.highLightElement(driver, lastSeen);
	    helper.Scrollintoview(lastSeen);
	    lastSeenDate_today2 = lastSeen.getText();
	    helper.Scrollintoview(Domain_Rgsd_Date);
	    String DomainRgsdDate2=Domain_Rgsd_Date.getText();
	    Reporter.log("<B><font color = 'blue'> ==> -</font> Last_Seen_ AdDetails Page= " +  lastSeenDate_today2);
	    Reporter.log("<B><font color = 'blue'> ==> -</font> Domain_Rgsd_Date AdDetails Page= " +  DomainRgsdDate2);
	    System.out.println("lastSeenDate_today: "+lastSeenDate_today2);
	    System.out.println("Domain Rgsd Date: "+DomainRgsdDate2);   
	    driver.close();
	    driver.switchTo().window(parent2);
	    helper.getLastseenDate(lastSeenDate_today2, imageDate2);
	    }
	    catch(Exception e)
		{
	    	System.out.println("Image is not able: Oops! Looks like we don't have data for this search criteria yet.");

			Reporter.log("<B><font color = 'orange'> Step5 -</font> Image is not able: Oops! Looks like we don't have data for this search criteria yet.");
	    }

		try
		{
		String lastSeenDate_today3=null;
		Reporter.log(" ");
		Reporter.log("<B><font color ='red'> 3 Ad -</font>  ");
		System.out.println("");
		System.out.println("3 Ads");
	
		String  imageDate3= date3.getText();
		Reporter.log("<B><font color = 'blue'> ==> -</font> Ads Caputure Image Date :");
		Reporter.log("<B><font color = 'blue'> ==> -</font> Image Date is :"+imageDate3);
		System.out.println("Current Date: "+imageDate3);
	
		helper.waitFor(ShowAnalytics3);
		helper.highLightElement(driver, ShowAnalytics3);
		helper.Scrollintoview(ShowAnalytics3);
		String linkText3 = ShowAnalytics3.getAttribute("href");
		helper.getAdID(linkText3);
		ShowAnalytics3.click();
		Reporter.log("<B><font color = 'blue'> ==> -</font> Clicked On Show Analytics Icon");
		helper.waitForPageToLoad();
		
		Set<String> S3=driver.getWindowHandles();
	    Iterator<String>it3=S3.iterator();
	    String parent3=it3.next();
	    String child3=it3.next();
	    
	    driver.switchTo().window(child3);

	    helper.waitForPageToLoad();
	    helper.waitFor(lastSeen);
	    helper.highLightElement(driver, lastSeen);
	    helper.Scrollintoview(lastSeen);
	    lastSeenDate_today3 = lastSeen.getText();
	    helper.Scrollintoview(Domain_Rgsd_Date);
	    String DomainRgsdDate3=Domain_Rgsd_Date.getText();
	    Reporter.log("<B><font color = 'blue'> ==> -</font> Last_Seen_ AdDetails Page= " +  lastSeenDate_today3);
	    Reporter.log("<B><font color = 'blue'> ==> -</font> Domain_Rgsd_Date AdDetails Page= " +  DomainRgsdDate3);
	    System.out.println("lastSeenDate_today: "+lastSeenDate_today3);
	    System.out.println("Domain Rgsd Date: "+DomainRgsdDate3);   
	    driver.close();
	    driver.switchTo().window(parent3);
	    helper.getLastseenDate(lastSeenDate_today3, imageDate3);
	    }
	    catch(Exception e)
		{
	    	System.out.println("Image is not able: Oops! Looks like we don't have data for this search criteria yet.");

			Reporter.log("<B><font color = 'orange'> Step5 -</font> Image is not able: Oops! Looks like we don't have data for this search criteria yet.");
	    }
		
		try
		{
		String lastSeenDate_today4=null;
		Reporter.log(" ");
		Reporter.log("<B><font color ='red'> 4 Ad -</font>  ");
		System.out.println("");
		System.out.println("4 Ads");
		
		String  imageDate4= date4.getText();
		Reporter.log("<B><font color = 'blue'> ==> -</font> Ads Caputure Image Date :");
		System.out.println("Ads Caputure Image Date");
		Reporter.log("<B><font color = 'blue'> ==> -</font> Image Date is :"+imageDate4);
		System.out.println("Current Date: "+imageDate4);
	
		helper.waitFor(ShowAnalytics4);
		helper.highLightElement(driver, ShowAnalytics4);
		helper.Scrollintoview(ShowAnalytics4);
		String linkText4 = ShowAnalytics4.getAttribute("href");
		helper.getAdID(linkText4);
		ShowAnalytics4.click();
		Reporter.log("<B><font color = 'blue'> ==> -</font> Clicked On Show Analytics Icon");
		helper.waitForPageToLoad();
		
		Set<String> S4=driver.getWindowHandles();
	    Iterator<String>it4=S4.iterator();
	    String parent4=it4.next();
	    String child4=it4.next();
	    
	    driver.switchTo().window(child4);

	    helper.waitForPageToLoad();
	    helper.waitFor(lastSeen);
	    helper.highLightElement(driver, lastSeen);
	    helper.Scrollintoview(lastSeen);
	    lastSeenDate_today4 = lastSeen.getText();
	    helper.Scrollintoview(Domain_Rgsd_Date);
	    String DomainRgsdDate4=Domain_Rgsd_Date.getText();
	    Reporter.log("<B><font color = 'blue'> ==> -</font> Last_Seen_ AdDetails Page= " +  lastSeenDate_today4);
	    Reporter.log("<B><font color = 'blue'> ==> -</font> Domain_Rgsd_Date AdDetails Page= " +  DomainRgsdDate4);
	    System.out.println("lastSeenDate_today: "+lastSeenDate_today4);
	    System.out.println("Domain Rgsd Date: "+DomainRgsdDate4);   
	    driver.close();
	    driver.switchTo().window(parent4);
	    helper.getLastseenDate(lastSeenDate_today4, imageDate4);
	    }
	    catch(Exception e)
		{
	    	System.out.println("Image is not able: Oops! Looks like we don't have data for this search criteria yet.");

			Reporter.log("<B><font color = 'orange'> Step5 -</font> Image is not able: Oops! Looks like we don't have data for this search criteria yet.");
		}
			try
		{
		String lastSeenDate_today5=null;
		Reporter.log(" ");
		Reporter.log("<B><font color ='red'> 5 Ad -</font>  ");
		System.out.println("");
		System.out.println("5 Ads");
		
		String  imageDate5= date5.getText();
		Reporter.log("<B><font color = 'blue'> ==> -</font> Ads Caputure Image Date :");
		System.out.println("Ads Caputure Image Date");
		Reporter.log("<B><font color = 'blue'> ==> -</font> Image Date is :"+imageDate5);
		System.out.println("Current Date: "+imageDate5);
	
		helper.waitFor(ShowAnalytics5);
		helper.highLightElement(driver, ShowAnalytics5);
		helper.Scrollintoview(ShowAnalytics5);
		String linkText5 = ShowAnalytics5.getAttribute("href");
		helper.getAdID(linkText5);
		ShowAnalytics5.click();
		Reporter.log("<B><font color = 'blue'> ==> -</font> Clicked On Show Analytics Icon");
		helper.waitForPageToLoad();
		
		Set<String> S5=driver.getWindowHandles();
	    Iterator<String>it5=S5.iterator();
	    String parent5=it5.next();
	    String child5=it5.next();
	    
	    driver.switchTo().window(child5);

	    helper.waitForPageToLoad();
	    helper.waitFor(lastSeen);
	    helper.highLightElement(driver, lastSeen);
	    helper.Scrollintoview(lastSeen);
	    lastSeenDate_today5 = lastSeen.getText();
	    helper.Scrollintoview(Domain_Rgsd_Date);
	    String DomainRgsdDate5=Domain_Rgsd_Date.getText();
	    Reporter.log("<B><font color = 'blue'> ==> -</font> Last_Seen_ AdDetails Page= " +  lastSeenDate_today5);
	    Reporter.log("<B><font color = 'blue'> ==> -</font> Domain_Rgsd_Date AdDetails Page= " +  DomainRgsdDate5);
	    System.out.println("lastSeenDate_today: "+lastSeenDate_today5);
	    System.out.println("Domain Rgsd Date: "+DomainRgsdDate5);   
	    driver.close();
	    driver.switchTo().window(parent5);
	    helper.getLastseenDate(lastSeenDate_today5, imageDate5);
	    }
	    catch(Exception e1)
		{
	    	System.out.println("Image is not able: Oops! Looks like we don't have data for this search criteria yet.");

			Reporter.log("<B><font color = 'orange'> Step5 -</font> Image is not able: Oops! Looks like we don't have data for this search criteria yet.");
	    }
		
		try
		{
		String lastSeenDate_today6=null;
		Reporter.log(" ");
		Reporter.log("<B><font color ='red'> 6 Ad -</font>  ");
		System.out.println("");
		System.out.println("6 Ads");
		
		String  imageDate6= date6.getText();
		Reporter.log("<B><font color = 'blue'> ==> -</font> Ads Caputure Image Date :");
		System.out.println("Ads Caputure Image Date");
		Reporter.log("<B><font color = 'blue'> ==> -</font> Image Date is :"+imageDate6);
		System.out.println("Current Date: "+imageDate6);
	
		helper.waitFor(ShowAnalytics6);
		helper.highLightElement(driver, ShowAnalytics6);
		helper.Scrollintoview(ShowAnalytics6);
		String linkText6 = ShowAnalytics6.getAttribute("href");
		helper.getAdID(linkText6);
		ShowAnalytics6.click();
		Reporter.log("<B><font color = 'blue'> ==> -</font> Clicked On Show Analytics Icon");
		helper.waitForPageToLoad();
		
		Set<String> S6=driver.getWindowHandles();
	    Iterator<String>it6=S6.iterator();
	    String parent6=it6.next();
	    String child6=it6.next();
	    
	    driver.switchTo().window(child6);

	    helper.waitForPageToLoad();
	    helper.waitFor(lastSeen);
	    helper.highLightElement(driver, lastSeen);
	    helper.Scrollintoview(lastSeen);
	    lastSeenDate_today6 = lastSeen.getText();
	    helper.Scrollintoview(Domain_Rgsd_Date);
	    String DomainRgsdDate6=Domain_Rgsd_Date.getText();
	    Reporter.log("<B><font color = 'blue'> ==> -</font> Last_Seen_ AdDetails Page= " +  lastSeenDate_today6);
	    Reporter.log("<B><font color = 'blue'> ==> -</font> Domain_Rgsd_Date AdDetails Page= " +  DomainRgsdDate6);
	    System.out.println("lastSeenDate_today: "+lastSeenDate_today6);
	    System.out.println("Domain Rgsd Date: "+DomainRgsdDate6);   
	    driver.close();
	    driver.switchTo().window(parent6);
	    helper.getLastseenDate(lastSeenDate_today6, imageDate6);
	    }
	    catch(Exception e1)
		{
	    	System.out.println("Image is not able: Oops! Looks like we don't have data for this search criteria yet.");

			Reporter.log("<B><font color = 'orange'> Step5 -</font> Image is not able: Oops! Looks like we don't have data for this search criteria yet.");
	    }
		
		try
		{
		String lastSeenDate_today7=null;
		Reporter.log(" ");
		Reporter.log("<B><font color ='red'> 7 Ad -</font>  ");
		System.out.println("");
		System.out.println("7 Ads");

		String  imageDate7= date7.getText();
		Reporter.log("<B><font color = 'blue'> ==> -</font> Ads Caputure Image Date :");
		System.out.println("Ads Caputure Image Date");
		Reporter.log("<B><font color = 'blue'> ==> -</font> Image Date is :"+imageDate7);
		System.out.println("Current Date: "+imageDate7);
	
		helper.waitFor(ShowAnalytics7);
		helper.highLightElement(driver, ShowAnalytics7);
		helper.Scrollintoview(ShowAnalytics7);
		String linkText7 = ShowAnalytics7.getAttribute("href");
		helper.getAdID(linkText7);
		ShowAnalytics7.click();
		Reporter.log("<B><font color = 'blue'> ==> -</font> Clicked On Show Analytics Icon");
		helper.waitForPageToLoad();
		
		Set<String> S7=driver.getWindowHandles();
	    Iterator<String>it7=S7.iterator();
	    String parent7=it7.next();
	    String child7=it7.next();
	    
	    driver.switchTo().window(child7);

	    helper.waitForPageToLoad();
	    helper.waitFor(lastSeen);
	    helper.highLightElement(driver, lastSeen);
	    helper.Scrollintoview(lastSeen);
	    lastSeenDate_today7 = lastSeen.getText();
	    helper.Scrollintoview(Domain_Rgsd_Date);
	    String DomainRgsdDate7=Domain_Rgsd_Date.getText();
	    Reporter.log("<B><font color = 'blue'> ==> -</font> Last_Seen_ AdDetails Page= " +  lastSeenDate_today7);
	    Reporter.log("<B><font color = 'blue'> ==> -</font> Domain_Rgsd_Date AdDetails Page= " +  DomainRgsdDate7);
	    System.out.println("lastSeenDate_today: "+lastSeenDate_today7);
	    System.out.println("Domain Rgsd Date: "+DomainRgsdDate7);   
	    driver.close();
	    driver.switchTo().window(parent7);
	    helper.getLastseenDate(lastSeenDate_today7, imageDate7);
	    }
	    catch(Exception e1)
		{
	    	System.out.println("Image is not able: Oops! Looks like we don't have data for this search criteria yet.");

			Reporter.log("<B><font color = 'orange'> Step5 -</font> Image is not able: Oops! Looks like we don't have data for this search criteria yet.");
	    }
		
		try
		{
		String lastSeenDate_today8=null;
		Reporter.log(" ");
		Reporter.log("<B><font color ='red'> 8 Ad -</font>  ");
		System.out.println("");
		System.out.println("8 Ads");

		String  imageDate8= date8.getText();
		Reporter.log("<B><font color = 'blue'> ==> -</font> Ads Caputure Image Date :");
		System.out.println("Ads Caputure Image Date");
		Reporter.log("<B><font color = 'blue'> ==> -</font> Image Date is :"+imageDate8);
		System.out.println("Current Date: "+imageDate8);
	
		helper.waitFor(ShowAnalytics8);
		helper.highLightElement(driver, ShowAnalytics8);
		helper.Scrollintoview(ShowAnalytics8);
		String linkText8 = ShowAnalytics8.getAttribute("href");
		helper.getAdID(linkText8);
		ShowAnalytics8.click();
		Reporter.log("<B><font color = 'blue'> ==> -</font> Clicked On Show Analytics Icon");
		helper.waitForPageToLoad();
		
		Set<String> S8=driver.getWindowHandles();
	    Iterator<String>it8=S8.iterator();
	    String parent8=it8.next();
	    String child8=it8.next();
	    
	    driver.switchTo().window(child8);

	    helper.waitForPageToLoad();
	    helper.waitFor(lastSeen);
	    helper.highLightElement(driver, lastSeen);
	    helper.Scrollintoview(lastSeen);
	    lastSeenDate_today8 = lastSeen.getText();
	    helper.Scrollintoview(Domain_Rgsd_Date);
	    String DomainRgsdDate8=Domain_Rgsd_Date.getText();
	    Reporter.log("<B><font color = 'blue'> ==> -</font> Last_Seen_ AdDetails Page= " +  lastSeenDate_today8);
	    Reporter.log("<B><font color = 'blue'> ==> -</font> Domain_Rgsd_Date AdDetails Page= " +  DomainRgsdDate8);
	    System.out.println("lastSeenDate_today: "+lastSeenDate_today8);
	    System.out.println("Domain Rgsd Date: "+DomainRgsdDate8);   
	    driver.close();
	    driver.switchTo().window(parent8);
	    helper.getLastseenDate(lastSeenDate_today8, imageDate8);
	    }
	    catch(Exception e1)
		{
	    	System.out.println("Image is not able: Oops! Looks like we don't have data for this search criteria yet.");

			Reporter.log("<B><font color = 'orange'> Step5 -</font> Image is not able: Oops! Looks like we don't have data for this search criteria yet.");
	    }
		
		try
		{
		String lastSeenDate_today9=null;
		Reporter.log(" ");
		Reporter.log("<B><font color ='red'> 9 Ad -</font>  ");
		System.out.println("");
		System.out.println("9 Ads");

		String  imageDate9= date9.getText();
		Reporter.log("<B><font color = 'blue'> ==> -</font> Ads Caputure Image Date :");
		System.out.println("Ads Caputure Image Date");
		Reporter.log("<B><font color = 'blue'> ==> -</font> Image Date is :"+imageDate9);
		System.out.println("Current Date: "+imageDate9);
	
		helper.waitFor(ShowAnalytics9);
		helper.highLightElement(driver, ShowAnalytics9);
		helper.Scrollintoview(ShowAnalytics9);
		String linkText9 = ShowAnalytics9.getAttribute("href");
		helper.getAdID(linkText9);
		ShowAnalytics9.click();
		Reporter.log("<B><font color = 'blue'> ==> -</font> Clicked On Show Analytics Icon");
		helper.waitForPageToLoad();
		
		Set<String> S9=driver.getWindowHandles();
	    Iterator<String>it9=S9.iterator();
	    String parent9=it9.next();
	    String child9=it9.next();
	    
	    driver.switchTo().window(child9);

	    helper.waitForPageToLoad();
	    helper.waitFor(lastSeen);
	    helper.highLightElement(driver, lastSeen);
	    helper.Scrollintoview(lastSeen);
	    lastSeenDate_today9 = lastSeen.getText();
	    helper.Scrollintoview(Domain_Rgsd_Date);
	    String DomainRgsdDate9=Domain_Rgsd_Date.getText();
	    Reporter.log("<B><font color = 'blue'> ==> -</font> Last_Seen_ AdDetails Page= " +  lastSeenDate_today9);
	    Reporter.log("<B><font color = 'blue'> ==> -</font> Domain_Rgsd_Date AdDetails Page= " +  DomainRgsdDate9);
	    System.out.println("lastSeenDate_today: "+lastSeenDate_today9);
	    System.out.println("Domain Rgsd Date: "+DomainRgsdDate9);   
	    driver.close();
	    driver.switchTo().window(parent9);
	    helper.getLastseenDate(lastSeenDate_today9, imageDate9);
	    }
	    catch(Exception e1)
		{
	    	System.out.println("Image is not able: Oops! Looks like we don't have data for this search criteria yet.");

	    	Reporter.log("<B><font color = 'orange'> Step5 -</font> Image is not able: Oops! Looks like we don't have data for this search criteria yet.");
	    }
		
		try
		{
		String lastSeenDate_today10=null;
		Reporter.log(" ");
		Reporter.log("<B><font color ='red'> 10 Ad -</font>  ");
		System.out.println("");
		System.out.println("10 Ads");
	
		String  imageDate10= date10.getText();
		Reporter.log("<B><font color = 'blue'> ==> -</font> Ads Caputure Image Date :");
		System.out.println("Ads Caputure Image Date");
		Reporter.log("<B><font color = 'blue'> ==> -</font> Image Date is :"+imageDate10);
		System.out.println("Current Date: "+imageDate10);
	
		helper.waitFor(ShowAnalytics10);
		helper.highLightElement(driver, ShowAnalytics10);
		helper.Scrollintoview(ShowAnalytics10);
		String linkText10 = ShowAnalytics10.getAttribute("href");
		helper.getAdID(linkText10);
		ShowAnalytics10.click();
		Reporter.log("<B><font color = 'blue'> ==> -</font> Clicked On Show Analytics Icon");
		helper.waitForPageToLoad();
		
		Set<String> S10=driver.getWindowHandles();
	    Iterator<String>it10=S10.iterator();
	    String parent10=it10.next();
	    String child10=it10.next();
	    
	    driver.switchTo().window(child10);

	    helper.waitForPageToLoad();
	    helper.waitFor(lastSeen);
	    helper.highLightElement(driver, lastSeen);
	    helper.Scrollintoview(lastSeen);
	    lastSeenDate_today10 = lastSeen.getText();
	    helper.Scrollintoview(Domain_Rgsd_Date);
	    String DomainRgsdDate10=Domain_Rgsd_Date.getText();
	    Reporter.log("<B><font color = 'blue'> ==> -</font> Last_Seen_ AdDetails Page= " +  lastSeenDate_today10);
	    Reporter.log("<B><font color = 'blue'> ==> -</font> Domain_Rgsd_Date AdDetails Page= " +  DomainRgsdDate10);
	    System.out.println("lastSeenDate_today: "+lastSeenDate_today10);
	    System.out.println("Domain Rgsd Date: "+DomainRgsdDate10);   
	    driver.close();
	    driver.switchTo().window(parent10);
	    helper.getLastseenDate(lastSeenDate_today10, imageDate10);
	    }
	    catch(Exception e1)
		{
	    	System.out.println("Image is not able: Oops! Looks like we don't have data for this search criteria yet.");

			Reporter.log("<B><font color = 'orange'> Step5 -</font> Image is not able: Oops! Looks like we don't have data for this search criteria yet.");
	    }
		
		try
		{
		String lastSeenDate_today11=null;
		Reporter.log(" ");
		Reporter.log("<B><font color ='red'> 11 Ad -</font>  ");
		System.out.println("");
		System.out.println("11 Ads");

		String  imageDate11= date11.getText();
		Reporter.log("<B><font color = 'blue'> ==> -</font> Ads Caputure Image Date :");
		System.out.println("Ads Caputure Image Date");
		Reporter.log("<B><font color = 'blue'> ==> -</font> Image Date is :"+imageDate11);
		System.out.println("Current Date: "+imageDate11);
	
		helper.waitFor(ShowAnalytics11);
		helper.highLightElement(driver, ShowAnalytics11);
		helper.Scrollintoview(ShowAnalytics11);
		String linkText11 = ShowAnalytics11.getAttribute("href");
		helper.getAdID(linkText11);
		ShowAnalytics11.click();
		Reporter.log("<B><font color = 'blue'> ==> -</font> Clicked On Show Analytics Icon");
		helper.waitForPageToLoad();
		
		Set<String> S11=driver.getWindowHandles();
	    Iterator<String>it11=S11.iterator();
	    String parent11=it11.next();
	    String child11=it11.next();
	    
	    driver.switchTo().window(child11);

	    helper.waitForPageToLoad();
	    helper.waitFor(lastSeen);
	    helper.highLightElement(driver, lastSeen);
	    helper.Scrollintoview(lastSeen);
	    lastSeenDate_today11 = lastSeen.getText();
	    helper.Scrollintoview(Domain_Rgsd_Date);
	    String DomainRgsdDate11=Domain_Rgsd_Date.getText();
	    Reporter.log("<B><font color = 'blue'> ==> -</font> Last_Seen_ AdDetails Page= " +  lastSeenDate_today11);
	    Reporter.log("<B><font color = 'blue'> ==> -</font> Domain_Rgsd_Date AdDetails Page= " +  DomainRgsdDate11);
	    System.out.println("lastSeenDate_today: "+lastSeenDate_today11);
	    System.out.println("Domain Rgsd Date: "+DomainRgsdDate11);   
	    driver.close();
	    driver.switchTo().window(parent11);
	    helper.getLastseenDate(lastSeenDate_today11, imageDate11);
	    }
	    catch(Exception e1)
		{
	    	System.out.println("Image is not able: Oops! Looks like we don't have data for this search criteria yet.");

			Reporter.log("<B><font color = 'orange'> Step5 -</font> Image is not able: Oops! Looks like we don't have data for this search criteria yet.");
	    }
		
		
		try
		{
		String lastSeenDate_today12=null;
		Reporter.log(" ");
		Reporter.log("<B><font color ='red'> 12 Ad -</font> ");
		System.out.println("");
		System.out.println("12 Ads");
		String  imageDate12= date12.getText();
		Reporter.log("<B><font color = 'blue'> ==> -</font> Ads Caputure Image Date :");
		System.out.println("Ads Caputure Image Date");
		Reporter.log("<B><font color = 'blue'> ==> -</font> Image Date is :"+imageDate12);
		System.out.println("Current Date: "+imageDate12);
	
		helper.waitFor(ShowAnalytics12);
		helper.highLightElement(driver, ShowAnalytics12);
		helper.Scrollintoview(ShowAnalytics12);
		String linkText12 = ShowAnalytics12.getAttribute("href");
		helper.getAdID(linkText12);
		ShowAnalytics12.click();
		Reporter.log("<B><font color = 'blue'> ==> -</font> Clicked On Show Analytics Icon");
		helper.waitForPageToLoad();
		
		Set<String> S12=driver.getWindowHandles();
	    Iterator<String>it12=S12.iterator();
	    String parent12=it12.next();
	    String child12=it12.next();
	    
	    driver.switchTo().window(child12);

	    helper.waitForPageToLoad();
	    helper.waitFor(lastSeen);
	    helper.highLightElement(driver, lastSeen);
	    helper.Scrollintoview(lastSeen);
	    lastSeenDate_today12 = lastSeen.getText();
	    helper.Scrollintoview(Domain_Rgsd_Date);
	    String DomainRgsdDate12=Domain_Rgsd_Date.getText();
	    Reporter.log("<B><font color = 'blue'> ==> -</font> Last_Seen_ AdDetails Page= " +  lastSeenDate_today12);
	    Reporter.log("<B><font color = 'blue'> ==> -</font> Domain_Rgsd_Date AdDetails Page= " +  DomainRgsdDate12);
	    System.out.println("lastSeenDate_today: "+lastSeenDate_today12);
	    System.out.println("Domain Rgsd Date: "+DomainRgsdDate12);   
	    driver.close();
	    driver.switchTo().window(parent12);
	    helper.getLastseenDate(lastSeenDate_today12, imageDate12);
	    }
	    catch(Exception e1)
		{
	    	System.out.println("Image is not able: Oops! Looks like we don't have data for this search criteria yet.");

			Reporter.log("<B><font color = 'orange'> Step5 -</font> Image is not able: Oops! Looks like we don't have data for this search criteria yet.");
	    }
		
		
		try
		{
		String lastSeenDate_today13=null;
		Reporter.log(" ");
		Reporter.log("<B><font color ='red'> 13 Ad -</font> ");
		System.out.println("");
		System.out.println("13 Ads");

		String  imageDate13= date13.getText();
		Reporter.log("<B><font color = 'blue'> ==> -</font> Ads Caputure Image Date :");
		System.out.println("Ads Caputure Image Date");
		Reporter.log("<B><font color = 'blue'> ==> -</font> Image Date is :"+imageDate13);
		System.out.println("Current Date: "+imageDate13);
	
		helper.waitFor(ShowAnalytics13);
		helper.highLightElement(driver, ShowAnalytics13);
		helper.Scrollintoview(ShowAnalytics13);
		String linkText13 = ShowAnalytics13.getAttribute("href");
		helper.getAdID(linkText13);
		ShowAnalytics13.click();
		Reporter.log("<B><font color = 'blue'> ==> -</font> Clicked On Show Analytics Icon");
		helper.waitForPageToLoad();
		
		Set<String> S13=driver.getWindowHandles();
	    Iterator<String>it13=S13.iterator();
	    String parent13=it13.next();
	    String child13=it13.next();
	    
	    driver.switchTo().window(child13);

	    helper.waitForPageToLoad();
	    helper.waitFor(lastSeen);
	    helper.highLightElement(driver, lastSeen);
	    helper.Scrollintoview(lastSeen);
	    lastSeenDate_today13 = lastSeen.getText();
	    helper.Scrollintoview(Domain_Rgsd_Date);
	    String DomainRgsdDate13=Domain_Rgsd_Date.getText();
	    Reporter.log("<B><font color = 'blue'> ==> -</font> Last_Seen_ AdDetails Page= " +  lastSeenDate_today13);
	    Reporter.log("<B><font color = 'blue'> ==> -</font> Domain_Rgsd_Date AdDetails Page= " +  DomainRgsdDate13);
	    System.out.println("lastSeenDate_today: "+lastSeenDate_today13);
	    System.out.println("Domain Rgsd Date: "+DomainRgsdDate13);   
	    driver.close();
	    driver.switchTo().window(parent13);
	    helper.getLastseenDate(lastSeenDate_today13, imageDate13);
	    }
	    catch(Exception e1)
		{
	    	System.out.println("Image is not able: Oops! Looks like we don't have data for this search criteria yet.");

			Reporter.log("<B><font color = 'orange'> Step5 -</font> Image is not able: Oops! Looks like we don't have data for this search criteria yet.");
	    }
		
		try
		{
		String lastSeenDate_today14=null;
		Reporter.log(" ");
		Reporter.log("<B><font color ='red'> 14 Ad -</font> ");
		System.out.println("");
		System.out.println("14 Ads");
	
		String  imageDate14= date14.getText();
		Reporter.log("<B><font color = 'blue'> ==> -</font> Ads Caputure Image Date :");
		System.out.println("Ads Caputure Image Date");
		Reporter.log("<B><font color = 'blue'> ==> -</font> Image Date is :"+imageDate14);
		System.out.println("Current Date: "+imageDate14);
	
		helper.waitFor(ShowAnalytics14);
		helper.highLightElement(driver, ShowAnalytics14);
		helper.Scrollintoview(ShowAnalytics14);
		String linkText14 = ShowAnalytics14.getAttribute("href");
		helper.getAdID(linkText14);
		ShowAnalytics14.click();
		Reporter.log("<B><font color = 'blue'> ==> -</font> Clicked On Show Analytics Icon");
		helper.waitForPageToLoad();
		
		Set<String> S14=driver.getWindowHandles();
	    Iterator<String>it14=S14.iterator();
	    String parent14=it14.next();
	    String child14=it14.next();
	    
	    driver.switchTo().window(child14);

	    helper.waitForPageToLoad();
	    helper.waitFor(lastSeen);
	    helper.highLightElement(driver, lastSeen);
	    helper.Scrollintoview(lastSeen);
	    lastSeenDate_today14 = lastSeen.getText();
	    helper.Scrollintoview(Domain_Rgsd_Date);
	    String DomainRgsdDate14=Domain_Rgsd_Date.getText();
	    Reporter.log("<B><font color = 'blue'> ==> -</font> Last_Seen_ AdDetails Page= " +  lastSeenDate_today14);
	    Reporter.log("<B><font color = 'blue'> ==> -</font> Domain_Rgsd_Date AdDetails Page= " +  DomainRgsdDate14);
	    System.out.println("lastSeenDate_today: "+lastSeenDate_today14);
	    System.out.println("Domain Rgsd Date: "+DomainRgsdDate14);   
	    driver.close();
	    driver.switchTo().window(parent14);
	    helper.getLastseenDate(lastSeenDate_today14, imageDate14);
	    }
	    catch(Exception e1)
		{
	    	System.out.println("Image is not able: Oops! Looks like we don't have data for this search criteria yet.");

			Reporter.log("<B><font color = 'orange'> Step5 -</font> Image is not able: Oops! Looks like we don't have data for this search criteria yet.");
	    }
		
		try
		{
		String lastSeenDate_today15=null;
		Reporter.log(" ");
		Reporter.log("<B><font color ='red'> 15 Ad -</font> ");
		System.out.println("");
		System.out.println("15 Ads");
	
		String  imageDate15= date15.getText();
		Reporter.log("<B><font color = 'blue'> ==> -</font> Ads Caputure Image Date :");
		System.out.println("Ads Caputure Image Date");
		Reporter.log("<B><font color = 'blue'> ==> -</font> Image Date is :"+imageDate15);
		System.out.println("Current Date: "+imageDate15);
	
		helper.waitFor(ShowAnalytics15);
		helper.highLightElement(driver, ShowAnalytics15);
		helper.Scrollintoview(ShowAnalytics15);
		String linkText15 = ShowAnalytics15.getAttribute("href");
		helper.getAdID(linkText15);
		ShowAnalytics15.click();
		Reporter.log("<B><font color = 'blue'> ==> -</font> Clicked On Show Analytics Icon");
		helper.waitForPageToLoad();
		
		Set<String> S15=driver.getWindowHandles();
	    Iterator<String>it15=S15.iterator();
	    String parent15=it15.next();
	    String child15=it15.next();
	    
	    driver.switchTo().window(child15);

	    helper.waitForPageToLoad();
	    helper.waitFor(lastSeen);
	    helper.highLightElement(driver, lastSeen);
	    helper.Scrollintoview(lastSeen);
	    lastSeenDate_today15 = lastSeen.getText();
	    helper.Scrollintoview(Domain_Rgsd_Date);
	    String DomainRgsdDate15=Domain_Rgsd_Date.getText();
	    Reporter.log("<B><font color = 'blue'> ==> -</font> Last_Seen_ AdDetails Page= " +  lastSeenDate_today15);
	    Reporter.log("<B><font color = 'blue'> ==> -</font> Domain_Rgsd_Date AdDetails Page= " +  DomainRgsdDate15);
	    System.out.println("lastSeenDate_today: "+lastSeenDate_today15);
	    System.out.println("Domain Rgsd Date: "+DomainRgsdDate15);   
	    driver.close();
	    driver.switchTo().window(parent15);
	    helper.getLastseenDate(lastSeenDate_today15, imageDate15);
	    }
	    catch(Exception e1)
		{
	    	System.out.println("Image is not able: Oops! Looks like we don't have data for this search criteria yet.");

			Reporter.log("<B><font color = 'orange'> Step5 -</font> Image is not able: Oops! Looks like we don't have data for this search criteria yet.");
	    }
		
	
	}
	
	public void DomainRegistrationDate_Last_7_Days() throws InterruptedException
	{
		System.out.println();
		System.out.println("-ShortBy Newest -Ad Domain Registration Date -Last 7 Days");
		Reporter.log("      ");
		helper.waitForPageToLoad();

		Reporter.log("<B><font color = 'green'> -ShortBy Newest -Ad Domain Registration Date Last 7 Days Step will Start from here </font> ");
		helper.waitFor(domainRegistrationfilter);
		helper.highLightElement(driver, domainRegistrationfilter);
		helper.jsScrollintoview(domainRegistrationfilter);
		domainRegistrationfilter.click();
		Reporter.log("<B><font color = 'orange'> Step1 -</font> Clicked On Ad Domain Registration Date filter Icon");

		helper.waitFor(Last_7_Days);
		helper.highLightElement(driver, Last_7_Days);
		helper.jsScrollintoview(Last_7_Days);
		Last_7_Days.click();
		Reporter.log("<B><font color = 'orange'> Step2 -</font> Clicked On Domain Registration Date Last 7 Days Icon");

		helper.waitFor(searchButton);
		helper.highLightElement(driver, searchButton);
		helper.Scrollintoview(searchButton);
		searchButton.click();
		Reporter.log("<B><font color = 'orange'> Step3 -</font> Clicked On search Button Icon");
		helper.waitForPageToLoad();

		String totaladscount=totaladscount_ad.getText();
		System.out.println("Totaladscount: "+totaladscount);
		Reporter.log("<B><font color = 'orange'> Step4 -</font>  Total Ad Count is :"+ totaladscount);
		
		try
		{
		String lastSeenDate_today1=null;
		Reporter.log(" ");
		Reporter.log("<B><font color ='red'> 1 Ad -</font>  ");
		System.out.println("");
		System.out.println("1 Ads");
		String  imageDate1= date1.getText();
		Reporter.log("<B><font color = 'blue'> ==> -</font> Ads Caputure Image Date :");
		System.out.println("Ads Caputure Image Date");
		Reporter.log("<B><font color = 'blue'> ==> -</font> Image Date is :"+imageDate1);
		System.out.println("Current Date: "+imageDate1);
	
		helper.waitFor(ShowAnalytics1);
		helper.highLightElement(driver, ShowAnalytics1);
		helper.Scrollintoview(ShowAnalytics1);
		String linkText1 = ShowAnalytics1.getAttribute("href");
		helper.getAdID(linkText1);
		ShowAnalytics1.click();
		Reporter.log("<B><font color = 'blue'> ==> -</font> Clicked On Show Analytics Icon");
		helper.waitForPageToLoad();
		
		Set<String> S1=driver.getWindowHandles();
	    Iterator<String>it1=S1.iterator();
	    String parent1=it1.next();
	    String child1=it1.next();
	    
	    driver.switchTo().window(child1);

	    helper.waitForPageToLoad();
	    helper.waitFor(lastSeen);
	    helper.highLightElement(driver, lastSeen);
	    helper.Scrollintoview(lastSeen);
	    lastSeenDate_today1 = lastSeen.getText();
	    helper.Scrollintoview(Domain_Rgsd_Date);
	    String DomainRgsdDate1=Domain_Rgsd_Date.getText();
	    Reporter.log("<B><font color = 'blue'> ==> -</font> Last_Seen_ AdDetails Page= " +  lastSeenDate_today1);
	    Reporter.log("<B><font color = 'blue'> ==> -</font> Domain_Rgsd_Date AdDetails Page= " +  DomainRgsdDate1);
	    System.out.println("lastSeenDate_today: "+lastSeenDate_today1);
	    System.out.println("Domain Rgsd Date: "+DomainRgsdDate1);   
	    driver.close();
	    driver.switchTo().window(parent1);
	    helper.getLastseenDate(lastSeenDate_today1, imageDate1);
	    }
	    catch(Exception e)
		{
	    	System.out.println("Image is not able: Oops! Looks like we don't have data for this search criteria yet.");

			Reporter.log("<B><font color = 'orange'> Step5 -</font> Image is not able: Oops! Looks like we don't have data for this search criteria yet.");
	    }

		try
		{
		String lastSeenDate_today2=null;
		Reporter.log(" ");
		Reporter.log("<B><font color ='red'> 2 Ad -</font>  ");
		System.out.println("");
		System.out.println("2 Ads");
		String  imageDate2= date2.getText();
		Reporter.log("<B><font color = 'blue'> ==> -</font> Ads Caputure Image Date :");
		System.out.println("Ads Caputure Image Date");
		Reporter.log("<B><font color = 'blue'> ==> -</font> Image Date is :"+imageDate2);
		System.out.println("Current Date: "+imageDate2);
	
		helper.waitFor(ShowAnalytics2);
		helper.highLightElement(driver, ShowAnalytics2);
		helper.Scrollintoview(ShowAnalytics2);
		String linkText2 = ShowAnalytics2.getAttribute("href");
		helper.getAdID(linkText2);
		ShowAnalytics2.click();
		Reporter.log("<B><font color = 'blue'> ==> -</font> Clicked On Show Analytics Icon");
		helper.waitForPageToLoad();
		
		Set<String> S2=driver.getWindowHandles();
	    Iterator<String>it2=S2.iterator();
	    String parent2=it2.next();
	    String child2=it2.next();
	    
	    driver.switchTo().window(child2);

	    helper.waitForPageToLoad();
	    helper.waitFor(lastSeen);
	    helper.highLightElement(driver, lastSeen);
	    helper.Scrollintoview(lastSeen);
	    lastSeenDate_today2 = lastSeen.getText();
	    helper.Scrollintoview(Domain_Rgsd_Date);
	    String DomainRgsdDate2=Domain_Rgsd_Date.getText();
	    Reporter.log("<B><font color = 'blue'> ==> -</font> Last_Seen_ AdDetails Page= " +  lastSeenDate_today2);
	    Reporter.log("<B><font color = 'blue'> ==> -</font> Domain_Rgsd_Date AdDetails Page= " +  DomainRgsdDate2);
	    System.out.println("lastSeenDate_today: "+lastSeenDate_today2);
	    System.out.println("Domain Rgsd Date: "+DomainRgsdDate2);   
	    driver.close();
	    driver.switchTo().window(parent2);
	    helper.getLastseenDate(lastSeenDate_today2, imageDate2);
	    }
	    catch(Exception e)
		{
	    	System.out.println("Image is not able: Oops! Looks like we don't have data for this search criteria yet.");

			Reporter.log("<B><font color = 'orange'> Step5 -</font> Image is not able: Oops! Looks like we don't have data for this search criteria yet.");
	    }

		try
		{
		String lastSeenDate_today3=null;
		Reporter.log(" ");
		Reporter.log("<B><font color ='red'> 3 Ad -</font>  ");
		System.out.println("");
		System.out.println("3 Ads");
	
		String  imageDate3= date3.getText();
		Reporter.log("<B><font color = 'blue'> ==> -</font> Ads Caputure Image Date :");
		Reporter.log("<B><font color = 'blue'> ==> -</font> Image Date is :"+imageDate3);
		System.out.println("Current Date: "+imageDate3);
	
		helper.waitFor(ShowAnalytics3);
		helper.highLightElement(driver, ShowAnalytics3);
		helper.Scrollintoview(ShowAnalytics3);
		String linkText3 = ShowAnalytics3.getAttribute("href");
		helper.getAdID(linkText3);
		ShowAnalytics3.click();
		Reporter.log("<B><font color = 'blue'> ==> -</font> Clicked On Show Analytics Icon");
		helper.waitForPageToLoad();
		
		Set<String> S3=driver.getWindowHandles();
	    Iterator<String>it3=S3.iterator();
	    String parent3=it3.next();
	    String child3=it3.next();
	    
	    driver.switchTo().window(child3);

	    helper.waitForPageToLoad();
	    helper.waitFor(lastSeen);
	    helper.highLightElement(driver, lastSeen);
	    helper.Scrollintoview(lastSeen);
	    lastSeenDate_today3 = lastSeen.getText();
	    helper.Scrollintoview(Domain_Rgsd_Date);
	    String DomainRgsdDate3=Domain_Rgsd_Date.getText();
	    Reporter.log("<B><font color = 'blue'> ==> -</font> Last_Seen_ AdDetails Page= " +  lastSeenDate_today3);
	    Reporter.log("<B><font color = 'blue'> ==> -</font> Domain_Rgsd_Date AdDetails Page= " +  DomainRgsdDate3);
	    System.out.println("lastSeenDate_today: "+lastSeenDate_today3);
	    System.out.println("Domain Rgsd Date: "+DomainRgsdDate3);   
	    driver.close();
	    driver.switchTo().window(parent3);
	    helper.getLastseenDate(lastSeenDate_today3, imageDate3);
	    }
	    catch(Exception e)
		{
	    	System.out.println("Image is not able: Oops! Looks like we don't have data for this search criteria yet.");

			Reporter.log("<B><font color = 'orange'> Step5 -</font> Image is not able: Oops! Looks like we don't have data for this search criteria yet.");
	    }
		
		try
		{
		String lastSeenDate_today4=null;
		Reporter.log(" ");
		Reporter.log("<B><font color ='red'> 4 Ad -</font>  ");
		System.out.println("");
		System.out.println("4 Ads");
		
		String  imageDate4= date4.getText();
		Reporter.log("<B><font color = 'blue'> ==> -</font> Ads Caputure Image Date :");
		System.out.println("Ads Caputure Image Date");
		Reporter.log("<B><font color = 'blue'> ==> -</font> Image Date is :"+imageDate4);
		System.out.println("Current Date: "+imageDate4);
	
		helper.waitFor(ShowAnalytics4);
		helper.highLightElement(driver, ShowAnalytics4);
		helper.Scrollintoview(ShowAnalytics4);
		String linkText4 = ShowAnalytics4.getAttribute("href");
		helper.getAdID(linkText4);
		ShowAnalytics4.click();
		Reporter.log("<B><font color = 'blue'> ==> -</font> Clicked On Show Analytics Icon");
		helper.waitForPageToLoad();
		
		Set<String> S4=driver.getWindowHandles();
	    Iterator<String>it4=S4.iterator();
	    String parent4=it4.next();
	    String child4=it4.next();
	    
	    driver.switchTo().window(child4);

	    helper.waitForPageToLoad();
	    helper.waitFor(lastSeen);
	    helper.highLightElement(driver, lastSeen);
	    helper.Scrollintoview(lastSeen);
	    lastSeenDate_today4 = lastSeen.getText();
	    helper.Scrollintoview(Domain_Rgsd_Date);
	    String DomainRgsdDate4=Domain_Rgsd_Date.getText();
	    Reporter.log("<B><font color = 'blue'> ==> -</font> Last_Seen_ AdDetails Page= " +  lastSeenDate_today4);
	    Reporter.log("<B><font color = 'blue'> ==> -</font> Domain_Rgsd_Date AdDetails Page= " +  DomainRgsdDate4);
	    System.out.println("lastSeenDate_today: "+lastSeenDate_today4);
	    System.out.println("Domain Rgsd Date: "+DomainRgsdDate4);   
	    driver.close();
	    driver.switchTo().window(parent4);
	    helper.getLastseenDate(lastSeenDate_today4, imageDate4);
	    }
	    catch(Exception e)
		{
	    	System.out.println("Image is not able: Oops! Looks like we don't have data for this search criteria yet.");

			Reporter.log("<B><font color = 'orange'> Step5 -</font> Image is not able: Oops! Looks like we don't have data for this search criteria yet.");
		}
			try
		{
		String lastSeenDate_today5=null;
		Reporter.log(" ");
		Reporter.log("<B><font color ='red'> 5 Ad -</font>  ");
		System.out.println("");
		System.out.println("5 Ads");
		
		String  imageDate5= date5.getText();
		Reporter.log("<B><font color = 'blue'> ==> -</font> Ads Caputure Image Date :");
		System.out.println("Ads Caputure Image Date");
		Reporter.log("<B><font color = 'blue'> ==> -</font> Image Date is :"+imageDate5);
		System.out.println("Current Date: "+imageDate5);
	
		helper.waitFor(ShowAnalytics5);
		helper.highLightElement(driver, ShowAnalytics5);
		helper.Scrollintoview(ShowAnalytics5);
		String linkText5 = ShowAnalytics5.getAttribute("href");
		helper.getAdID(linkText5);
		ShowAnalytics5.click();
		Reporter.log("<B><font color = 'blue'> ==> -</font> Clicked On Show Analytics Icon");
		helper.waitForPageToLoad();
		
		Set<String> S5=driver.getWindowHandles();
	    Iterator<String>it5=S5.iterator();
	    String parent5=it5.next();
	    String child5=it5.next();
	    
	    driver.switchTo().window(child5);

	    helper.waitForPageToLoad();
	    helper.waitFor(lastSeen);
	    helper.highLightElement(driver, lastSeen);
	    helper.Scrollintoview(lastSeen);
	    lastSeenDate_today5 = lastSeen.getText();
	    helper.Scrollintoview(Domain_Rgsd_Date);
	    String DomainRgsdDate5=Domain_Rgsd_Date.getText();
	    Reporter.log("<B><font color = 'blue'> ==> -</font> Last_Seen_ AdDetails Page= " +  lastSeenDate_today5);
	    Reporter.log("<B><font color = 'blue'> ==> -</font> Domain_Rgsd_Date AdDetails Page= " +  DomainRgsdDate5);
	    System.out.println("lastSeenDate_today: "+lastSeenDate_today5);
	    System.out.println("Domain Rgsd Date: "+DomainRgsdDate5);   
	    driver.close();
	    driver.switchTo().window(parent5);
	    helper.getLastseenDate(lastSeenDate_today5, imageDate5);
	    }
	    catch(Exception e1)
		{
	    	System.out.println("Image is not able: Oops! Looks like we don't have data for this search criteria yet.");

			Reporter.log("<B><font color = 'orange'> Step5 -</font> Image is not able: Oops! Looks like we don't have data for this search criteria yet.");
	    }
		
		try
		{
		String lastSeenDate_today6=null;
		Reporter.log(" ");
		Reporter.log("<B><font color ='red'> 6 Ad -</font>  ");
		System.out.println("");
		System.out.println("6 Ads");
		
		String  imageDate6= date6.getText();
		Reporter.log("<B><font color = 'blue'> ==> -</font> Ads Caputure Image Date :");
		System.out.println("Ads Caputure Image Date");
		Reporter.log("<B><font color = 'blue'> ==> -</font> Image Date is :"+imageDate6);
		System.out.println("Current Date: "+imageDate6);
	
		helper.waitFor(ShowAnalytics6);
		helper.highLightElement(driver, ShowAnalytics6);
		helper.Scrollintoview(ShowAnalytics6);
		String linkText6 = ShowAnalytics6.getAttribute("href");
		helper.getAdID(linkText6);
		ShowAnalytics6.click();
		Reporter.log("<B><font color = 'blue'> ==> -</font> Clicked On Show Analytics Icon");
		helper.waitForPageToLoad();
		
		Set<String> S6=driver.getWindowHandles();
	    Iterator<String>it6=S6.iterator();
	    String parent6=it6.next();
	    String child6=it6.next();
	    
	    driver.switchTo().window(child6);

	    helper.waitForPageToLoad();
	    helper.waitFor(lastSeen);
	    helper.highLightElement(driver, lastSeen);
	    helper.Scrollintoview(lastSeen);
	    lastSeenDate_today6 = lastSeen.getText();
	    helper.Scrollintoview(Domain_Rgsd_Date);
	    String DomainRgsdDate6=Domain_Rgsd_Date.getText();
	    Reporter.log("<B><font color = 'blue'> ==> -</font> Last_Seen_ AdDetails Page= " +  lastSeenDate_today6);
	    Reporter.log("<B><font color = 'blue'> ==> -</font> Domain_Rgsd_Date AdDetails Page= " +  DomainRgsdDate6);
	    System.out.println("lastSeenDate_today: "+lastSeenDate_today6);
	    System.out.println("Domain Rgsd Date: "+DomainRgsdDate6);   
	    driver.close();
	    driver.switchTo().window(parent6);
	    helper.getLastseenDate(lastSeenDate_today6, imageDate6);
	    }
	    catch(Exception e1)
		{
	    	System.out.println("Image is not able: Oops! Looks like we don't have data for this search criteria yet.");

			Reporter.log("<B><font color = 'orange'> Step5 -</font> Image is not able: Oops! Looks like we don't have data for this search criteria yet.");
	    }
		
		try
		{
		String lastSeenDate_today7=null;
		Reporter.log(" ");
		Reporter.log("<B><font color ='red'> 7 Ad -</font>  ");
		System.out.println("");
		System.out.println("7 Ads");

		String  imageDate7= date7.getText();
		Reporter.log("<B><font color = 'blue'> ==> -</font> Ads Caputure Image Date :");
		System.out.println("Ads Caputure Image Date");
		Reporter.log("<B><font color = 'blue'> ==> -</font> Image Date is :"+imageDate7);
		System.out.println("Current Date: "+imageDate7);
	
		helper.waitFor(ShowAnalytics7);
		helper.highLightElement(driver, ShowAnalytics7);
		helper.Scrollintoview(ShowAnalytics7);
		String linkText7 = ShowAnalytics7.getAttribute("href");
		helper.getAdID(linkText7);
		ShowAnalytics7.click();
		Reporter.log("<B><font color = 'blue'> ==> -</font> Clicked On Show Analytics Icon");
		helper.waitForPageToLoad();
		
		Set<String> S7=driver.getWindowHandles();
	    Iterator<String>it7=S7.iterator();
	    String parent7=it7.next();
	    String child7=it7.next();
	    
	    driver.switchTo().window(child7);

	    helper.waitForPageToLoad();
	    helper.waitFor(lastSeen);
	    helper.highLightElement(driver, lastSeen);
	    helper.Scrollintoview(lastSeen);
	    lastSeenDate_today7 = lastSeen.getText();
	    helper.Scrollintoview(Domain_Rgsd_Date);
	    String DomainRgsdDate7=Domain_Rgsd_Date.getText();
	    Reporter.log("<B><font color = 'blue'> ==> -</font> Last_Seen_ AdDetails Page= " +  lastSeenDate_today7);
	    Reporter.log("<B><font color = 'blue'> ==> -</font> Domain_Rgsd_Date AdDetails Page= " +  DomainRgsdDate7);
	    System.out.println("lastSeenDate_today: "+lastSeenDate_today7);
	    System.out.println("Domain Rgsd Date: "+DomainRgsdDate7);   
	    driver.close();
	    driver.switchTo().window(parent7);
	    helper.getLastseenDate(lastSeenDate_today7, imageDate7);
	    }
	    catch(Exception e1)
		{
	    	System.out.println("Image is not able: Oops! Looks like we don't have data for this search criteria yet.");

			Reporter.log("<B><font color = 'orange'> Step5 -</font> Image is not able: Oops! Looks like we don't have data for this search criteria yet.");
	    }
		
		try
		{
		String lastSeenDate_today8=null;
		Reporter.log(" ");
		Reporter.log("<B><font color ='red'> 8 Ad -</font>  ");
		System.out.println("");
		System.out.println("8 Ads");

		String  imageDate8= date8.getText();
		Reporter.log("<B><font color = 'blue'> ==> -</font> Ads Caputure Image Date :");
		System.out.println("Ads Caputure Image Date");
		Reporter.log("<B><font color = 'blue'> ==> -</font> Image Date is :"+imageDate8);
		System.out.println("Current Date: "+imageDate8);
	
		helper.waitFor(ShowAnalytics8);
		helper.highLightElement(driver, ShowAnalytics8);
		helper.Scrollintoview(ShowAnalytics8);
		String linkText8 = ShowAnalytics8.getAttribute("href");
		helper.getAdID(linkText8);
		ShowAnalytics8.click();
		Reporter.log("<B><font color = 'blue'> ==> -</font> Clicked On Show Analytics Icon");
		helper.waitForPageToLoad();
		
		Set<String> S8=driver.getWindowHandles();
	    Iterator<String>it8=S8.iterator();
	    String parent8=it8.next();
	    String child8=it8.next();
	    
	    driver.switchTo().window(child8);

	    helper.waitForPageToLoad();
	    helper.waitFor(lastSeen);
	    helper.highLightElement(driver, lastSeen);
	    helper.Scrollintoview(lastSeen);
	    lastSeenDate_today8 = lastSeen.getText();
	    helper.Scrollintoview(Domain_Rgsd_Date);
	    String DomainRgsdDate8=Domain_Rgsd_Date.getText();
	    Reporter.log("<B><font color = 'blue'> ==> -</font> Last_Seen_ AdDetails Page= " +  lastSeenDate_today8);
	    Reporter.log("<B><font color = 'blue'> ==> -</font> Domain_Rgsd_Date AdDetails Page= " +  DomainRgsdDate8);
	    System.out.println("lastSeenDate_today: "+lastSeenDate_today8);
	    System.out.println("Domain Rgsd Date: "+DomainRgsdDate8);   
	    driver.close();
	    driver.switchTo().window(parent8);
	    helper.getLastseenDate(lastSeenDate_today8, imageDate8);
	    }
	    catch(Exception e1)
		{
	    	System.out.println("Image is not able: Oops! Looks like we don't have data for this search criteria yet.");

			Reporter.log("<B><font color = 'orange'> Step5 -</font> Image is not able: Oops! Looks like we don't have data for this search criteria yet.");
	    }
		
		try
		{
		String lastSeenDate_today9=null;
		Reporter.log(" ");
		Reporter.log("<B><font color ='red'> 9 Ad -</font>  ");
		System.out.println("");
		System.out.println("9 Ads");

		String  imageDate9= date9.getText();
		Reporter.log("<B><font color = 'blue'> ==> -</font> Ads Caputure Image Date :");
		System.out.println("Ads Caputure Image Date");
		Reporter.log("<B><font color = 'blue'> ==> -</font> Image Date is :"+imageDate9);
		System.out.println("Current Date: "+imageDate9);
	
		helper.waitFor(ShowAnalytics9);
		helper.highLightElement(driver, ShowAnalytics9);
		helper.Scrollintoview(ShowAnalytics9);
		String linkText9 = ShowAnalytics9.getAttribute("href");
		helper.getAdID(linkText9);
		ShowAnalytics9.click();
		Reporter.log("<B><font color = 'blue'> ==> -</font> Clicked On Show Analytics Icon");
		helper.waitForPageToLoad();
		
		Set<String> S9=driver.getWindowHandles();
	    Iterator<String>it9=S9.iterator();
	    String parent9=it9.next();
	    String child9=it9.next();
	    
	    driver.switchTo().window(child9);

	    helper.waitForPageToLoad();
	    helper.waitFor(lastSeen);
	    helper.highLightElement(driver, lastSeen);
	    helper.Scrollintoview(lastSeen);
	    lastSeenDate_today9 = lastSeen.getText();
	    helper.Scrollintoview(Domain_Rgsd_Date);
	    String DomainRgsdDate9=Domain_Rgsd_Date.getText();
	    Reporter.log("<B><font color = 'blue'> ==> -</font> Last_Seen_ AdDetails Page= " +  lastSeenDate_today9);
	    Reporter.log("<B><font color = 'blue'> ==> -</font> Domain_Rgsd_Date AdDetails Page= " +  DomainRgsdDate9);
	    System.out.println("lastSeenDate_today: "+lastSeenDate_today9);
	    System.out.println("Domain Rgsd Date: "+DomainRgsdDate9);   
	    driver.close();
	    driver.switchTo().window(parent9);
	    helper.getLastseenDate(lastSeenDate_today9, imageDate9);
	    }
	    catch(Exception e1)
		{
	    	System.out.println("Image is not able: Oops! Looks like we don't have data for this search criteria yet.");

	    	Reporter.log("<B><font color = 'orange'> Step5 -</font> Image is not able: Oops! Looks like we don't have data for this search criteria yet.");
	    }
		
		try
		{
		String lastSeenDate_today10=null;
		Reporter.log(" ");
		Reporter.log("<B><font color ='red'> 10 Ad -</font>  ");
		System.out.println("");
		System.out.println("10 Ads");
	
		String  imageDate10= date10.getText();
		Reporter.log("<B><font color = 'blue'> ==> -</font> Ads Caputure Image Date :");
		System.out.println("Ads Caputure Image Date");
		Reporter.log("<B><font color = 'blue'> ==> -</font> Image Date is :"+imageDate10);
		System.out.println("Current Date: "+imageDate10);
	
		helper.waitFor(ShowAnalytics10);
		helper.highLightElement(driver, ShowAnalytics10);
		helper.Scrollintoview(ShowAnalytics10);
		String linkText10 = ShowAnalytics10.getAttribute("href");
		helper.getAdID(linkText10);
		ShowAnalytics10.click();
		Reporter.log("<B><font color = 'blue'> ==> -</font> Clicked On Show Analytics Icon");
		helper.waitForPageToLoad();
		
		Set<String> S10=driver.getWindowHandles();
	    Iterator<String>it10=S10.iterator();
	    String parent10=it10.next();
	    String child10=it10.next();
	    
	    driver.switchTo().window(child10);

	    helper.waitForPageToLoad();
	    helper.waitFor(lastSeen);
	    helper.highLightElement(driver, lastSeen);
	    helper.Scrollintoview(lastSeen);
	    lastSeenDate_today10 = lastSeen.getText();
	    helper.Scrollintoview(Domain_Rgsd_Date);
	    String DomainRgsdDate10=Domain_Rgsd_Date.getText();
	    Reporter.log("<B><font color = 'blue'> ==> -</font> Last_Seen_ AdDetails Page= " +  lastSeenDate_today10);
	    Reporter.log("<B><font color = 'blue'> ==> -</font> Domain_Rgsd_Date AdDetails Page= " +  DomainRgsdDate10);
	    System.out.println("lastSeenDate_today: "+lastSeenDate_today10);
	    System.out.println("Domain Rgsd Date: "+DomainRgsdDate10);   
	    driver.close();
	    driver.switchTo().window(parent10);
	    helper.getLastseenDate(lastSeenDate_today10, imageDate10);
	    }
	    catch(Exception e1)
		{
	    	System.out.println("Image is not able: Oops! Looks like we don't have data for this search criteria yet.");

			Reporter.log("<B><font color = 'orange'> Step5 -</font> Image is not able: Oops! Looks like we don't have data for this search criteria yet.");
	    }
		
		try
		{
		String lastSeenDate_today11=null;
		Reporter.log(" ");
		Reporter.log("<B><font color ='red'> 11 Ad -</font>  ");
		System.out.println("");
		System.out.println("11 Ads");

		String  imageDate11= date11.getText();
		Reporter.log("<B><font color = 'blue'> ==> -</font> Ads Caputure Image Date :");
		System.out.println("Ads Caputure Image Date");
		Reporter.log("<B><font color = 'blue'> ==> -</font> Image Date is :"+imageDate11);
		System.out.println("Current Date: "+imageDate11);
	
		helper.waitFor(ShowAnalytics11);
		helper.highLightElement(driver, ShowAnalytics11);
		helper.Scrollintoview(ShowAnalytics11);
		String linkText11 = ShowAnalytics11.getAttribute("href");
		helper.getAdID(linkText11);
		ShowAnalytics11.click();
		Reporter.log("<B><font color = 'blue'> ==> -</font> Clicked On Show Analytics Icon");
		helper.waitForPageToLoad();
		
		Set<String> S11=driver.getWindowHandles();
	    Iterator<String>it11=S11.iterator();
	    String parent11=it11.next();
	    String child11=it11.next();
	    
	    driver.switchTo().window(child11);

	    helper.waitForPageToLoad();
	    helper.waitFor(lastSeen);
	    helper.highLightElement(driver, lastSeen);
	    helper.Scrollintoview(lastSeen);
	    lastSeenDate_today11 = lastSeen.getText();
	    helper.Scrollintoview(Domain_Rgsd_Date);
	    String DomainRgsdDate11=Domain_Rgsd_Date.getText();
	    Reporter.log("<B><font color = 'blue'> ==> -</font> Last_Seen_ AdDetails Page= " +  lastSeenDate_today11);
	    Reporter.log("<B><font color = 'blue'> ==> -</font> Domain_Rgsd_Date AdDetails Page= " +  DomainRgsdDate11);
	    System.out.println("lastSeenDate_today: "+lastSeenDate_today11);
	    System.out.println("Domain Rgsd Date: "+DomainRgsdDate11);   
	    driver.close();
	    driver.switchTo().window(parent11);
	    helper.getLastseenDate(lastSeenDate_today11, imageDate11);
	    }
	    catch(Exception e1)
		{
	    	System.out.println("Image is not able: Oops! Looks like we don't have data for this search criteria yet.");

			Reporter.log("<B><font color = 'orange'> Step5 -</font> Image is not able: Oops! Looks like we don't have data for this search criteria yet.");
	    }
		
		
		try
		{
		String lastSeenDate_today12=null;
		Reporter.log(" ");
		Reporter.log("<B><font color ='red'> 12 Ad -</font> ");
		System.out.println("");
		System.out.println("12 Ads");
		String  imageDate12= date12.getText();
		Reporter.log("<B><font color = 'blue'> ==> -</font> Ads Caputure Image Date :");
		System.out.println("Ads Caputure Image Date");
		Reporter.log("<B><font color = 'blue'> ==> -</font> Image Date is :"+imageDate12);
		System.out.println("Current Date: "+imageDate12);
	
		helper.waitFor(ShowAnalytics12);
		helper.highLightElement(driver, ShowAnalytics12);
		helper.Scrollintoview(ShowAnalytics12);
		String linkText12 = ShowAnalytics12.getAttribute("href");
		helper.getAdID(linkText12);
		ShowAnalytics12.click();
		Reporter.log("<B><font color = 'blue'> ==> -</font> Clicked On Show Analytics Icon");
		helper.waitForPageToLoad();
		
		Set<String> S12=driver.getWindowHandles();
	    Iterator<String>it12=S12.iterator();
	    String parent12=it12.next();
	    String child12=it12.next();
	    
	    driver.switchTo().window(child12);

	    helper.waitForPageToLoad();
	    helper.waitFor(lastSeen);
	    helper.highLightElement(driver, lastSeen);
	    helper.Scrollintoview(lastSeen);
	    lastSeenDate_today12 = lastSeen.getText();
	    helper.Scrollintoview(Domain_Rgsd_Date);
	    String DomainRgsdDate12=Domain_Rgsd_Date.getText();
	    Reporter.log("<B><font color = 'blue'> ==> -</font> Last_Seen_ AdDetails Page= " +  lastSeenDate_today12);
	    Reporter.log("<B><font color = 'blue'> ==> -</font> Domain_Rgsd_Date AdDetails Page= " +  DomainRgsdDate12);
	    System.out.println("lastSeenDate_today: "+lastSeenDate_today12);
	    System.out.println("Domain Rgsd Date: "+DomainRgsdDate12);   
	    driver.close();
	    driver.switchTo().window(parent12);
	    helper.getLastseenDate(lastSeenDate_today12, imageDate12);
	    }
	    catch(Exception e1)
		{
	    	System.out.println("Image is not able: Oops! Looks like we don't have data for this search criteria yet.");

			Reporter.log("<B><font color = 'orange'> Step5 -</font> Image is not able: Oops! Looks like we don't have data for this search criteria yet.");
	    }
		
		
		try
		{
		String lastSeenDate_today13=null;
		Reporter.log(" ");
		Reporter.log("<B><font color ='red'> 13 Ad -</font> ");
		System.out.println("");
		System.out.println("13 Ads");

		String  imageDate13= date13.getText();
		Reporter.log("<B><font color = 'blue'> ==> -</font> Ads Caputure Image Date :");
		System.out.println("Ads Caputure Image Date");
		Reporter.log("<B><font color = 'blue'> ==> -</font> Image Date is :"+imageDate13);
		System.out.println("Current Date: "+imageDate13);
	
		helper.waitFor(ShowAnalytics13);
		helper.highLightElement(driver, ShowAnalytics13);
		helper.Scrollintoview(ShowAnalytics13);
		String linkText13 = ShowAnalytics13.getAttribute("href");
		helper.getAdID(linkText13);
		ShowAnalytics13.click();
		Reporter.log("<B><font color = 'blue'> ==> -</font> Clicked On Show Analytics Icon");
		helper.waitForPageToLoad();
		
		Set<String> S13=driver.getWindowHandles();
	    Iterator<String>it13=S13.iterator();
	    String parent13=it13.next();
	    String child13=it13.next();
	    
	    driver.switchTo().window(child13);

	    helper.waitForPageToLoad();
	    helper.waitFor(lastSeen);
	    helper.highLightElement(driver, lastSeen);
	    helper.Scrollintoview(lastSeen);
	    lastSeenDate_today13 = lastSeen.getText();
	    helper.Scrollintoview(Domain_Rgsd_Date);
	    String DomainRgsdDate13=Domain_Rgsd_Date.getText();
	    Reporter.log("<B><font color = 'blue'> ==> -</font> Last_Seen_ AdDetails Page= " +  lastSeenDate_today13);
	    Reporter.log("<B><font color = 'blue'> ==> -</font> Domain_Rgsd_Date AdDetails Page= " +  DomainRgsdDate13);
	    System.out.println("lastSeenDate_today: "+lastSeenDate_today13);
	    System.out.println("Domain Rgsd Date: "+DomainRgsdDate13);   
	    driver.close();
	    driver.switchTo().window(parent13);
	    helper.getLastseenDate(lastSeenDate_today13, imageDate13);
	    }
	    catch(Exception e1)
		{
	    	System.out.println("Image is not able: Oops! Looks like we don't have data for this search criteria yet.");

			Reporter.log("<B><font color = 'orange'> Step5 -</font> Image is not able: Oops! Looks like we don't have data for this search criteria yet.");
	    }
		
		try
		{
		String lastSeenDate_today14=null;
		Reporter.log(" ");
		Reporter.log("<B><font color ='red'> 14 Ad -</font> ");
		System.out.println("");
		System.out.println("14 Ads");
	
		String  imageDate14= date14.getText();
		Reporter.log("<B><font color = 'blue'> ==> -</font> Ads Caputure Image Date :");
		System.out.println("Ads Caputure Image Date");
		Reporter.log("<B><font color = 'blue'> ==> -</font> Image Date is :"+imageDate14);
		System.out.println("Current Date: "+imageDate14);
	
		helper.waitFor(ShowAnalytics14);
		helper.highLightElement(driver, ShowAnalytics14);
		helper.Scrollintoview(ShowAnalytics14);
		String linkText14 = ShowAnalytics14.getAttribute("href");
		helper.getAdID(linkText14);
		ShowAnalytics14.click();
		Reporter.log("<B><font color = 'blue'> ==> -</font> Clicked On Show Analytics Icon");
		helper.waitForPageToLoad();
		
		Set<String> S14=driver.getWindowHandles();
	    Iterator<String>it14=S14.iterator();
	    String parent14=it14.next();
	    String child14=it14.next();
	    
	    driver.switchTo().window(child14);

	    helper.waitForPageToLoad();
	    helper.waitFor(lastSeen);
	    helper.highLightElement(driver, lastSeen);
	    helper.Scrollintoview(lastSeen);
	    lastSeenDate_today14 = lastSeen.getText();
	    helper.Scrollintoview(Domain_Rgsd_Date);
	    String DomainRgsdDate14=Domain_Rgsd_Date.getText();
	    Reporter.log("<B><font color = 'blue'> ==> -</font> Last_Seen_ AdDetails Page= " +  lastSeenDate_today14);
	    Reporter.log("<B><font color = 'blue'> ==> -</font> Domain_Rgsd_Date AdDetails Page= " +  DomainRgsdDate14);
	    System.out.println("lastSeenDate_today: "+lastSeenDate_today14);
	    System.out.println("Domain Rgsd Date: "+DomainRgsdDate14);   
	    driver.close();
	    driver.switchTo().window(parent14);
	    helper.getLastseenDate(lastSeenDate_today14, imageDate14);
	    }
	    catch(Exception e1)
		{
	    	System.out.println("Image is not able: Oops! Looks like we don't have data for this search criteria yet.");

			Reporter.log("<B><font color = 'orange'> Step5 -</font> Image is not able: Oops! Looks like we don't have data for this search criteria yet.");
	    }
		
		try
		{
		String lastSeenDate_today15=null;
		Reporter.log(" ");
		Reporter.log("<B><font color ='red'> 15 Ad -</font> ");
		System.out.println("");
		System.out.println("15 Ads");
	
		String  imageDate15= date15.getText();
		Reporter.log("<B><font color = 'blue'> ==> -</font> Ads Caputure Image Date :");
		System.out.println("Ads Caputure Image Date");
		Reporter.log("<B><font color = 'blue'> ==> -</font> Image Date is :"+imageDate15);
		System.out.println("Current Date: "+imageDate15);
	
		helper.waitFor(ShowAnalytics15);
		helper.highLightElement(driver, ShowAnalytics15);
		helper.Scrollintoview(ShowAnalytics15);
		String linkText15 = ShowAnalytics15.getAttribute("href");
		helper.getAdID(linkText15);
		ShowAnalytics15.click();
		Reporter.log("<B><font color = 'blue'> ==> -</font> Clicked On Show Analytics Icon");
		helper.waitForPageToLoad();
		
		Set<String> S15=driver.getWindowHandles();
	    Iterator<String>it15=S15.iterator();
	    String parent15=it15.next();
	    String child15=it15.next();
	    
	    driver.switchTo().window(child15);

	    helper.waitForPageToLoad();
	    helper.waitFor(lastSeen);
	    helper.highLightElement(driver, lastSeen);
	    helper.Scrollintoview(lastSeen);
	    lastSeenDate_today15 = lastSeen.getText();
	    helper.Scrollintoview(Domain_Rgsd_Date);
	    String DomainRgsdDate15=Domain_Rgsd_Date.getText();
	    Reporter.log("<B><font color = 'blue'> ==> -</font> Last_Seen_ AdDetails Page= " +  lastSeenDate_today15);
	    Reporter.log("<B><font color = 'blue'> ==> -</font> Domain_Rgsd_Date AdDetails Page= " +  DomainRgsdDate15);
	    System.out.println("lastSeenDate_today: "+lastSeenDate_today15);
	    System.out.println("Domain Rgsd Date: "+DomainRgsdDate15);   
	    driver.close();
	    driver.switchTo().window(parent15);
	    helper.getLastseenDate(lastSeenDate_today15, imageDate15);
	    }
	    catch(Exception e1)
		{
	    	System.out.println("Image is not able: Oops! Looks like we don't have data for this search criteria yet.");

			Reporter.log("<B><font color = 'orange'> Step5 -</font> Image is not able: Oops! Looks like we don't have data for this search criteria yet.");
	    }
	}	
	
	
	public void DomainRegistrationDate_Last_Thirty_Days() throws InterruptedException
	{
		helper.waitForPageToLoad();
		Reporter.log("      ");
		Reporter.log("<B><font color = 'green'> -ShortBy Newest -Ad Domain Registration Date Last 30 Days Step will Start from here </font> ");
		System.out.println();
		System.out.println("-ShortBy Newest -Ad Domain Registration Date -Last 30 Days");
		helper.waitFor(domainRegistrationfilter);
		helper.highLightElement(driver, domainRegistrationfilter);
		helper.jsScrollintoview(domainRegistrationfilter);
		domainRegistrationfilter.click();
		Reporter.log("<B><font color = 'orange'> Step1 -</font> Clicked On Ad Domain Registration Date filter Icon");

		helper.waitFor(Last_30_Days);
		helper.highLightElement(driver, Last_30_Days);
		helper.jsScrollintoview(Last_30_Days);
		Last_30_Days.click();
		Reporter.log("<B><font color = 'orange'> Step2 -</font> Clicked On Domain Registration Date Last 30 Days Icon");

		helper.waitFor(searchButton);
		helper.highLightElement(driver, searchButton);
		helper.Scrollintoview(searchButton);
		searchButton.click();
		Reporter.log("<B><font color = 'orange'> Step3 -</font> Clicked On search Button Icon");
		helper.waitForPageToLoad();

		String totaladscount=totaladscount_ad.getText();
		System.out.println("Totaladscount: "+totaladscount);
		Reporter.log("<B><font color = 'orange'> Step4 -</font>  Total Ad Count is :"+ totaladscount);
		
		try
		{
		String lastSeenDate_today1=null;
		Reporter.log(" ");
		Reporter.log("<B><font color ='red'> 1 Ad -</font>  ");
		System.out.println("");
		System.out.println("1 Ads");
		String  imageDate1= date1.getText();
		Reporter.log("<B><font color = 'blue'> ==> -</font> Ads Caputure Image Date :");
		System.out.println("Ads Caputure Image Date");
		Reporter.log("<B><font color = 'blue'> ==> -</font> Image Date is :"+imageDate1);
		System.out.println("Current Date: "+imageDate1);
	
		helper.waitFor(ShowAnalytics1);
		helper.highLightElement(driver, ShowAnalytics1);
		helper.Scrollintoview(ShowAnalytics1);
		String linkText1 = ShowAnalytics1.getAttribute("href");
		helper.getAdID(linkText1);
		ShowAnalytics1.click();
		Reporter.log("<B><font color = 'blue'> ==> -</font> Clicked On Show Analytics Icon");
		helper.waitForPageToLoad();
		
		Set<String> S1=driver.getWindowHandles();
	    Iterator<String>it1=S1.iterator();
	    String parent1=it1.next();
	    String child1=it1.next();
	    
	    driver.switchTo().window(child1);

	    helper.waitForPageToLoad();
	    helper.waitFor(lastSeen);
	    helper.highLightElement(driver, lastSeen);
	    helper.Scrollintoview(lastSeen);
	    lastSeenDate_today1 = lastSeen.getText();
	    helper.Scrollintoview(Domain_Rgsd_Date);
	    String DomainRgsdDate1=Domain_Rgsd_Date.getText();
	    Reporter.log("<B><font color = 'blue'> ==> -</font> Last_Seen_ AdDetails Page= " +  lastSeenDate_today1);
	    Reporter.log("<B><font color = 'blue'> ==> -</font> Domain_Rgsd_Date AdDetails Page= " +  DomainRgsdDate1);
	    System.out.println("lastSeenDate_today: "+lastSeenDate_today1);
	    System.out.println("Domain Rgsd Date: "+DomainRgsdDate1);   
	    driver.close();
	    driver.switchTo().window(parent1);
	    helper.getLastseenDate(lastSeenDate_today1, imageDate1);
	    }
	    catch(Exception e)
		{
	    	System.out.println("Image is not able: Oops! Looks like we don't have data for this search criteria yet.");

			Reporter.log("<B><font color = 'orange'> Step5 -</font> Image is not able: Oops! Looks like we don't have data for this search criteria yet.");
	    }

		try
		{
		String lastSeenDate_today2=null;
		Reporter.log(" ");
		Reporter.log("<B><font color ='red'> 2 Ad -</font>  ");
		System.out.println("");
		System.out.println("2 Ads");
		String  imageDate2= date2.getText();
		Reporter.log("<B><font color = 'blue'> ==> -</font> Ads Caputure Image Date :");
		System.out.println("Ads Caputure Image Date");
		Reporter.log("<B><font color = 'blue'> ==> -</font> Image Date is :"+imageDate2);
		System.out.println("Current Date: "+imageDate2);
	
		helper.waitFor(ShowAnalytics2);
		helper.highLightElement(driver, ShowAnalytics2);
		helper.Scrollintoview(ShowAnalytics2);
		String linkText2 = ShowAnalytics2.getAttribute("href");
		helper.getAdID(linkText2);
		ShowAnalytics2.click();
		Reporter.log("<B><font color = 'blue'> ==> -</font> Clicked On Show Analytics Icon");
		helper.waitForPageToLoad();
		
		Set<String> S2=driver.getWindowHandles();
	    Iterator<String>it2=S2.iterator();
	    String parent2=it2.next();
	    String child2=it2.next();
	    
	    driver.switchTo().window(child2);

	    helper.waitForPageToLoad();
	    helper.waitFor(lastSeen);
	    helper.highLightElement(driver, lastSeen);
	    helper.Scrollintoview(lastSeen);
	    lastSeenDate_today2 = lastSeen.getText();
	    helper.Scrollintoview(Domain_Rgsd_Date);
	    String DomainRgsdDate2=Domain_Rgsd_Date.getText();
	    Reporter.log("<B><font color = 'blue'> ==> -</font> Last_Seen_ AdDetails Page= " +  lastSeenDate_today2);
	    Reporter.log("<B><font color = 'blue'> ==> -</font> Domain_Rgsd_Date AdDetails Page= " +  DomainRgsdDate2);
	    System.out.println("lastSeenDate_today: "+lastSeenDate_today2);
	    System.out.println("Domain Rgsd Date: "+DomainRgsdDate2);   
	    driver.close();
	    driver.switchTo().window(parent2);
	    helper.getLastseenDate(lastSeenDate_today2, imageDate2);
	    }
	    catch(Exception e)
		{
	    	System.out.println("Image is not able: Oops! Looks like we don't have data for this search criteria yet.");

			Reporter.log("<B><font color = 'orange'> Step5 -</font> Image is not able: Oops! Looks like we don't have data for this search criteria yet.");
	    }

		try
		{
		String lastSeenDate_today3=null;
		Reporter.log(" ");
		Reporter.log("<B><font color ='red'> 3 Ad -</font>  ");
		System.out.println("");
		System.out.println("3 Ads");
	
		String  imageDate3= date3.getText();
		Reporter.log("<B><font color = 'blue'> ==> -</font> Ads Caputure Image Date :");
		Reporter.log("<B><font color = 'blue'> ==> -</font> Image Date is :"+imageDate3);
		System.out.println("Current Date: "+imageDate3);
	
		helper.waitFor(ShowAnalytics3);
		helper.highLightElement(driver, ShowAnalytics3);
		helper.Scrollintoview(ShowAnalytics3);
		String linkText3 = ShowAnalytics3.getAttribute("href");
		helper.getAdID(linkText3);
		ShowAnalytics3.click();
		Reporter.log("<B><font color = 'blue'> ==> -</font> Clicked On Show Analytics Icon");
		helper.waitForPageToLoad();
		
		Set<String> S3=driver.getWindowHandles();
	    Iterator<String>it3=S3.iterator();
	    String parent3=it3.next();
	    String child3=it3.next();
	    
	    driver.switchTo().window(child3);

	    helper.waitForPageToLoad();
	    helper.waitFor(lastSeen);
	    helper.highLightElement(driver, lastSeen);
	    helper.Scrollintoview(lastSeen);
	    lastSeenDate_today3 = lastSeen.getText();
	    helper.Scrollintoview(Domain_Rgsd_Date);
	    String DomainRgsdDate3=Domain_Rgsd_Date.getText();
	    Reporter.log("<B><font color = 'blue'> ==> -</font> Last_Seen_ AdDetails Page= " +  lastSeenDate_today3);
	    Reporter.log("<B><font color = 'blue'> ==> -</font> Domain_Rgsd_Date AdDetails Page= " +  DomainRgsdDate3);
	    System.out.println("lastSeenDate_today: "+lastSeenDate_today3);
	    System.out.println("Domain Rgsd Date: "+DomainRgsdDate3);   
	    driver.close();
	    driver.switchTo().window(parent3);
	    helper.getLastseenDate(lastSeenDate_today3, imageDate3);
	    }
	    catch(Exception e)
		{
	    	System.out.println("Image is not able: Oops! Looks like we don't have data for this search criteria yet.");

			Reporter.log("<B><font color = 'orange'> Step5 -</font> Image is not able: Oops! Looks like we don't have data for this search criteria yet.");
	    }
		
		try
		{
		String lastSeenDate_today4=null;
		Reporter.log(" ");
		Reporter.log("<B><font color ='red'> 4 Ad -</font>  ");
		System.out.println("");
		System.out.println("4 Ads");
		
		String  imageDate4= date4.getText();
		Reporter.log("<B><font color = 'blue'> ==> -</font> Ads Caputure Image Date :");
		System.out.println("Ads Caputure Image Date");
		Reporter.log("<B><font color = 'blue'> ==> -</font> Image Date is :"+imageDate4);
		System.out.println("Current Date: "+imageDate4);
	
		helper.waitFor(ShowAnalytics4);
		helper.highLightElement(driver, ShowAnalytics4);
		helper.Scrollintoview(ShowAnalytics4);
		String linkText4 = ShowAnalytics4.getAttribute("href");
		helper.getAdID(linkText4);
		ShowAnalytics4.click();
		Reporter.log("<B><font color = 'blue'> ==> -</font> Clicked On Show Analytics Icon");
		helper.waitForPageToLoad();
		
		Set<String> S4=driver.getWindowHandles();
	    Iterator<String>it4=S4.iterator();
	    String parent4=it4.next();
	    String child4=it4.next();
	    
	    driver.switchTo().window(child4);

	    helper.waitForPageToLoad();
	    helper.waitFor(lastSeen);
	    helper.highLightElement(driver, lastSeen);
	    helper.Scrollintoview(lastSeen);
	    lastSeenDate_today4 = lastSeen.getText();
	    helper.Scrollintoview(Domain_Rgsd_Date);
	    String DomainRgsdDate4=Domain_Rgsd_Date.getText();
	    Reporter.log("<B><font color = 'blue'> ==> -</font> Last_Seen_ AdDetails Page= " +  lastSeenDate_today4);
	    Reporter.log("<B><font color = 'blue'> ==> -</font> Domain_Rgsd_Date AdDetails Page= " +  DomainRgsdDate4);
	    System.out.println("lastSeenDate_today: "+lastSeenDate_today4);
	    System.out.println("Domain Rgsd Date: "+DomainRgsdDate4);   
	    driver.close();
	    driver.switchTo().window(parent4);
	    helper.getLastseenDate(lastSeenDate_today4, imageDate4);
	    }
	    catch(Exception e)
		{
	    	System.out.println("Image is not able: Oops! Looks like we don't have data for this search criteria yet.");

			Reporter.log("<B><font color = 'orange'> Step5 -</font> Image is not able: Oops! Looks like we don't have data for this search criteria yet.");
		}
			try
		{
		String lastSeenDate_today5=null;
		Reporter.log(" ");
		Reporter.log("<B><font color ='red'> 5 Ad -</font>  ");
		System.out.println("");
		System.out.println("5 Ads");
		
		String  imageDate5= date5.getText();
		Reporter.log("<B><font color = 'blue'> ==> -</font> Ads Caputure Image Date :");
		System.out.println("Ads Caputure Image Date");
		Reporter.log("<B><font color = 'blue'> ==> -</font> Image Date is :"+imageDate5);
		System.out.println("Current Date: "+imageDate5);
	
		helper.waitFor(ShowAnalytics5);
		helper.highLightElement(driver, ShowAnalytics5);
		helper.Scrollintoview(ShowAnalytics5);
		String linkText5 = ShowAnalytics5.getAttribute("href");
		helper.getAdID(linkText5);
		ShowAnalytics5.click();
		Reporter.log("<B><font color = 'blue'> ==> -</font> Clicked On Show Analytics Icon");
		helper.waitForPageToLoad();
		
		Set<String> S5=driver.getWindowHandles();
	    Iterator<String>it5=S5.iterator();
	    String parent5=it5.next();
	    String child5=it5.next();
	    
	    driver.switchTo().window(child5);

	    helper.waitForPageToLoad();
	    helper.waitFor(lastSeen);
	    helper.highLightElement(driver, lastSeen);
	    helper.Scrollintoview(lastSeen);
	    lastSeenDate_today5 = lastSeen.getText();
	    helper.Scrollintoview(Domain_Rgsd_Date);
	    String DomainRgsdDate5=Domain_Rgsd_Date.getText();
	    Reporter.log("<B><font color = 'blue'> ==> -</font> Last_Seen_ AdDetails Page= " +  lastSeenDate_today5);
	    Reporter.log("<B><font color = 'blue'> ==> -</font> Domain_Rgsd_Date AdDetails Page= " +  DomainRgsdDate5);
	    System.out.println("lastSeenDate_today: "+lastSeenDate_today5);
	    System.out.println("Domain Rgsd Date: "+DomainRgsdDate5);   
	    driver.close();
	    driver.switchTo().window(parent5);
	    helper.getLastseenDate(lastSeenDate_today5, imageDate5);
	    }
	    catch(Exception e1)
		{
	    	System.out.println("Image is not able: Oops! Looks like we don't have data for this search criteria yet.");

			Reporter.log("<B><font color = 'orange'> Step5 -</font> Image is not able: Oops! Looks like we don't have data for this search criteria yet.");
	    }
		
		try
		{
		String lastSeenDate_today6=null;
		Reporter.log(" ");
		Reporter.log("<B><font color ='red'> 6 Ad -</font>  ");
		System.out.println("");
		System.out.println("6 Ads");
		
		String  imageDate6= date6.getText();
		Reporter.log("<B><font color = 'blue'> ==> -</font> Ads Caputure Image Date :");
		System.out.println("Ads Caputure Image Date");
		Reporter.log("<B><font color = 'blue'> ==> -</font> Image Date is :"+imageDate6);
		System.out.println("Current Date: "+imageDate6);
	
		helper.waitFor(ShowAnalytics6);
		helper.highLightElement(driver, ShowAnalytics6);
		helper.Scrollintoview(ShowAnalytics6);
		String linkText6 = ShowAnalytics6.getAttribute("href");
		helper.getAdID(linkText6);
		ShowAnalytics6.click();
		Reporter.log("<B><font color = 'blue'> ==> -</font> Clicked On Show Analytics Icon");
		helper.waitForPageToLoad();
		
		Set<String> S6=driver.getWindowHandles();
	    Iterator<String>it6=S6.iterator();
	    String parent6=it6.next();
	    String child6=it6.next();
	    
	    driver.switchTo().window(child6);

	    helper.waitForPageToLoad();
	    helper.waitFor(lastSeen);
	    helper.highLightElement(driver, lastSeen);
	    helper.Scrollintoview(lastSeen);
	    lastSeenDate_today6 = lastSeen.getText();
	    helper.Scrollintoview(Domain_Rgsd_Date);
	    String DomainRgsdDate6=Domain_Rgsd_Date.getText();
	    Reporter.log("<B><font color = 'blue'> ==> -</font> Last_Seen_ AdDetails Page= " +  lastSeenDate_today6);
	    Reporter.log("<B><font color = 'blue'> ==> -</font> Domain_Rgsd_Date AdDetails Page= " +  DomainRgsdDate6);
	    System.out.println("lastSeenDate_today: "+lastSeenDate_today6);
	    System.out.println("Domain Rgsd Date: "+DomainRgsdDate6);   
	    driver.close();
	    driver.switchTo().window(parent6);
	    helper.getLastseenDate(lastSeenDate_today6, imageDate6);
	    }
	    catch(Exception e1)
		{
	    	System.out.println("Image is not able: Oops! Looks like we don't have data for this search criteria yet.");

			Reporter.log("<B><font color = 'orange'> Step5 -</font> Image is not able: Oops! Looks like we don't have data for this search criteria yet.");
	    }
		
		try
		{
		String lastSeenDate_today7=null;
		Reporter.log(" ");
		Reporter.log("<B><font color ='red'> 7 Ad -</font>  ");
		System.out.println("");
		System.out.println("7 Ads");

		String  imageDate7= date7.getText();
		Reporter.log("<B><font color = 'blue'> ==> -</font> Ads Caputure Image Date :");
		System.out.println("Ads Caputure Image Date");
		Reporter.log("<B><font color = 'blue'> ==> -</font> Image Date is :"+imageDate7);
		System.out.println("Current Date: "+imageDate7);
	
		helper.waitFor(ShowAnalytics7);
		helper.highLightElement(driver, ShowAnalytics7);
		helper.Scrollintoview(ShowAnalytics7);
		String linkText7 = ShowAnalytics7.getAttribute("href");
		helper.getAdID(linkText7);
		ShowAnalytics7.click();
		Reporter.log("<B><font color = 'blue'> ==> -</font> Clicked On Show Analytics Icon");
		helper.waitForPageToLoad();
		
		Set<String> S7=driver.getWindowHandles();
	    Iterator<String>it7=S7.iterator();
	    String parent7=it7.next();
	    String child7=it7.next();
	    
	    driver.switchTo().window(child7);

	    helper.waitForPageToLoad();
	    helper.waitFor(lastSeen);
	    helper.highLightElement(driver, lastSeen);
	    helper.Scrollintoview(lastSeen);
	    lastSeenDate_today7 = lastSeen.getText();
	    helper.Scrollintoview(Domain_Rgsd_Date);
	    String DomainRgsdDate7=Domain_Rgsd_Date.getText();
	    Reporter.log("<B><font color = 'blue'> ==> -</font> Last_Seen_ AdDetails Page= " +  lastSeenDate_today7);
	    Reporter.log("<B><font color = 'blue'> ==> -</font> Domain_Rgsd_Date AdDetails Page= " +  DomainRgsdDate7);
	    System.out.println("lastSeenDate_today: "+lastSeenDate_today7);
	    System.out.println("Domain Rgsd Date: "+DomainRgsdDate7);   
	    driver.close();
	    driver.switchTo().window(parent7);
	    helper.getLastseenDate(lastSeenDate_today7, imageDate7);
	    }
	    catch(Exception e1)
		{
	    	System.out.println("Image is not able: Oops! Looks like we don't have data for this search criteria yet.");

			Reporter.log("<B><font color = 'orange'> Step5 -</font> Image is not able: Oops! Looks like we don't have data for this search criteria yet.");
	    }
		
		try
		{
		String lastSeenDate_today8=null;
		Reporter.log(" ");
		Reporter.log("<B><font color ='red'> 8 Ad -</font>  ");
		System.out.println("");
		System.out.println("8 Ads");

		String  imageDate8= date8.getText();
		Reporter.log("<B><font color = 'blue'> ==> -</font> Ads Caputure Image Date :");
		System.out.println("Ads Caputure Image Date");
		Reporter.log("<B><font color = 'blue'> ==> -</font> Image Date is :"+imageDate8);
		System.out.println("Current Date: "+imageDate8);
	
		helper.waitFor(ShowAnalytics8);
		helper.highLightElement(driver, ShowAnalytics8);
		helper.Scrollintoview(ShowAnalytics8);
		String linkText8 = ShowAnalytics8.getAttribute("href");
		helper.getAdID(linkText8);
		ShowAnalytics8.click();
		Reporter.log("<B><font color = 'blue'> ==> -</font> Clicked On Show Analytics Icon");
		helper.waitForPageToLoad();
		
		Set<String> S8=driver.getWindowHandles();
	    Iterator<String>it8=S8.iterator();
	    String parent8=it8.next();
	    String child8=it8.next();
	    
	    driver.switchTo().window(child8);

	    helper.waitForPageToLoad();
	    helper.waitFor(lastSeen);
	    helper.highLightElement(driver, lastSeen);
	    helper.Scrollintoview(lastSeen);
	    lastSeenDate_today8 = lastSeen.getText();
	    helper.Scrollintoview(Domain_Rgsd_Date);
	    String DomainRgsdDate8=Domain_Rgsd_Date.getText();
	    Reporter.log("<B><font color = 'blue'> ==> -</font> Last_Seen_ AdDetails Page= " +  lastSeenDate_today8);
	    Reporter.log("<B><font color = 'blue'> ==> -</font> Domain_Rgsd_Date AdDetails Page= " +  DomainRgsdDate8);
	    System.out.println("lastSeenDate_today: "+lastSeenDate_today8);
	    System.out.println("Domain Rgsd Date: "+DomainRgsdDate8);   
	    driver.close();
	    driver.switchTo().window(parent8);
	    helper.getLastseenDate(lastSeenDate_today8, imageDate8);
	    }
	    catch(Exception e1)
		{
	    	System.out.println("Image is not able: Oops! Looks like we don't have data for this search criteria yet.");

			Reporter.log("<B><font color = 'orange'> Step5 -</font> Image is not able: Oops! Looks like we don't have data for this search criteria yet.");
	    }
		
		try
		{
		String lastSeenDate_today9=null;
		Reporter.log(" ");
		Reporter.log("<B><font color ='red'> 9 Ad -</font>  ");
		System.out.println("");
		System.out.println("9 Ads");

		String  imageDate9= date9.getText();
		Reporter.log("<B><font color = 'blue'> ==> -</font> Ads Caputure Image Date :");
		System.out.println("Ads Caputure Image Date");
		Reporter.log("<B><font color = 'blue'> ==> -</font> Image Date is :"+imageDate9);
		System.out.println("Current Date: "+imageDate9);
	
		helper.waitFor(ShowAnalytics9);
		helper.highLightElement(driver, ShowAnalytics9);
		helper.Scrollintoview(ShowAnalytics9);
		String linkText9 = ShowAnalytics9.getAttribute("href");
		helper.getAdID(linkText9);
		ShowAnalytics9.click();
		Reporter.log("<B><font color = 'blue'> ==> -</font> Clicked On Show Analytics Icon");
		helper.waitForPageToLoad();
		
		Set<String> S9=driver.getWindowHandles();
	    Iterator<String>it9=S9.iterator();
	    String parent9=it9.next();
	    String child9=it9.next();
	    
	    driver.switchTo().window(child9);

	    helper.waitForPageToLoad();
	    helper.waitFor(lastSeen);
	    helper.highLightElement(driver, lastSeen);
	    helper.Scrollintoview(lastSeen);
	    lastSeenDate_today9 = lastSeen.getText();
	    helper.Scrollintoview(Domain_Rgsd_Date);
	    String DomainRgsdDate9=Domain_Rgsd_Date.getText();
	    Reporter.log("<B><font color = 'blue'> ==> -</font> Last_Seen_ AdDetails Page= " +  lastSeenDate_today9);
	    Reporter.log("<B><font color = 'blue'> ==> -</font> Domain_Rgsd_Date AdDetails Page= " +  DomainRgsdDate9);
	    System.out.println("lastSeenDate_today: "+lastSeenDate_today9);
	    System.out.println("Domain Rgsd Date: "+DomainRgsdDate9);   
	    driver.close();
	    driver.switchTo().window(parent9);
	    helper.getLastseenDate(lastSeenDate_today9, imageDate9);
	    }
	    catch(Exception e1)
		{
	    	System.out.println("Image is not able: Oops! Looks like we don't have data for this search criteria yet.");

	    	Reporter.log("<B><font color = 'orange'> Step5 -</font> Image is not able: Oops! Looks like we don't have data for this search criteria yet.");
	    }
		
		try
		{
		String lastSeenDate_today10=null;
		Reporter.log(" ");
		Reporter.log("<B><font color ='red'> 10 Ad -</font>  ");
		System.out.println("");
		System.out.println("10 Ads");
	
		String  imageDate10= date10.getText();
		Reporter.log("<B><font color = 'blue'> ==> -</font> Ads Caputure Image Date :");
		System.out.println("Ads Caputure Image Date");
		Reporter.log("<B><font color = 'blue'> ==> -</font> Image Date is :"+imageDate10);
		System.out.println("Current Date: "+imageDate10);
	
		helper.waitFor(ShowAnalytics10);
		helper.highLightElement(driver, ShowAnalytics10);
		helper.Scrollintoview(ShowAnalytics10);
		String linkText10 = ShowAnalytics10.getAttribute("href");
		helper.getAdID(linkText10);
		ShowAnalytics10.click();
		Reporter.log("<B><font color = 'blue'> ==> -</font> Clicked On Show Analytics Icon");
		helper.waitForPageToLoad();
		
		Set<String> S10=driver.getWindowHandles();
	    Iterator<String>it10=S10.iterator();
	    String parent10=it10.next();
	    String child10=it10.next();
	    
	    driver.switchTo().window(child10);

	    helper.waitForPageToLoad();
	    helper.waitFor(lastSeen);
	    helper.highLightElement(driver, lastSeen);
	    helper.Scrollintoview(lastSeen);
	    lastSeenDate_today10 = lastSeen.getText();
	    helper.Scrollintoview(Domain_Rgsd_Date);
	    String DomainRgsdDate10=Domain_Rgsd_Date.getText();
	    Reporter.log("<B><font color = 'blue'> ==> -</font> Last_Seen_ AdDetails Page= " +  lastSeenDate_today10);
	    Reporter.log("<B><font color = 'blue'> ==> -</font> Domain_Rgsd_Date AdDetails Page= " +  DomainRgsdDate10);
	    System.out.println("lastSeenDate_today: "+lastSeenDate_today10);
	    System.out.println("Domain Rgsd Date: "+DomainRgsdDate10);   
	    driver.close();
	    driver.switchTo().window(parent10);
	    helper.getLastseenDate(lastSeenDate_today10, imageDate10);
	    }
	    catch(Exception e1)
		{
	    	System.out.println("Image is not able: Oops! Looks like we don't have data for this search criteria yet.");

			Reporter.log("<B><font color = 'orange'> Step5 -</font> Image is not able: Oops! Looks like we don't have data for this search criteria yet.");
	    }
		
		try
		{
		String lastSeenDate_today11=null;
		Reporter.log(" ");
		Reporter.log("<B><font color ='red'> 11 Ad -</font>  ");
		System.out.println("");
		System.out.println("11 Ads");

		String  imageDate11= date11.getText();
		Reporter.log("<B><font color = 'blue'> ==> -</font> Ads Caputure Image Date :");
		System.out.println("Ads Caputure Image Date");
		Reporter.log("<B><font color = 'blue'> ==> -</font> Image Date is :"+imageDate11);
		System.out.println("Current Date: "+imageDate11);
	
		helper.waitFor(ShowAnalytics11);
		helper.highLightElement(driver, ShowAnalytics11);
		helper.Scrollintoview(ShowAnalytics11);
		String linkText11 = ShowAnalytics11.getAttribute("href");
		helper.getAdID(linkText11);
		ShowAnalytics11.click();
		Reporter.log("<B><font color = 'blue'> ==> -</font> Clicked On Show Analytics Icon");
		helper.waitForPageToLoad();
		
		Set<String> S11=driver.getWindowHandles();
	    Iterator<String>it11=S11.iterator();
	    String parent11=it11.next();
	    String child11=it11.next();
	    
	    driver.switchTo().window(child11);

	    helper.waitForPageToLoad();
	    helper.waitFor(lastSeen);
	    helper.highLightElement(driver, lastSeen);
	    helper.Scrollintoview(lastSeen);
	    lastSeenDate_today11 = lastSeen.getText();
	    helper.Scrollintoview(Domain_Rgsd_Date);
	    String DomainRgsdDate11=Domain_Rgsd_Date.getText();
	    Reporter.log("<B><font color = 'blue'> ==> -</font> Last_Seen_ AdDetails Page= " +  lastSeenDate_today11);
	    Reporter.log("<B><font color = 'blue'> ==> -</font> Domain_Rgsd_Date AdDetails Page= " +  DomainRgsdDate11);
	    System.out.println("lastSeenDate_today: "+lastSeenDate_today11);
	    System.out.println("Domain Rgsd Date: "+DomainRgsdDate11);   
	    driver.close();
	    driver.switchTo().window(parent11);
	    helper.getLastseenDate(lastSeenDate_today11, imageDate11);
	    }
	    catch(Exception e1)
		{
	    	System.out.println("Image is not able: Oops! Looks like we don't have data for this search criteria yet.");

			Reporter.log("<B><font color = 'orange'> Step5 -</font> Image is not able: Oops! Looks like we don't have data for this search criteria yet.");
	    }
		
		
		try
		{
		String lastSeenDate_today12=null;
		Reporter.log(" ");
		Reporter.log("<B><font color ='red'> 12 Ad -</font> ");
		System.out.println("");
		System.out.println("12 Ads");
		String  imageDate12= date12.getText();
		Reporter.log("<B><font color = 'blue'> ==> -</font> Ads Caputure Image Date :");
		System.out.println("Ads Caputure Image Date");
		Reporter.log("<B><font color = 'blue'> ==> -</font> Image Date is :"+imageDate12);
		System.out.println("Current Date: "+imageDate12);
	
		helper.waitFor(ShowAnalytics12);
		helper.highLightElement(driver, ShowAnalytics12);
		helper.Scrollintoview(ShowAnalytics12);
		String linkText12 = ShowAnalytics12.getAttribute("href");
		helper.getAdID(linkText12);
		ShowAnalytics12.click();
		Reporter.log("<B><font color = 'blue'> ==> -</font> Clicked On Show Analytics Icon");
		helper.waitForPageToLoad();
		
		Set<String> S12=driver.getWindowHandles();
	    Iterator<String>it12=S12.iterator();
	    String parent12=it12.next();
	    String child12=it12.next();
	    
	    driver.switchTo().window(child12);

	    helper.waitForPageToLoad();
	    helper.waitFor(lastSeen);
	    helper.highLightElement(driver, lastSeen);
	    helper.Scrollintoview(lastSeen);
	    lastSeenDate_today12 = lastSeen.getText();
	    helper.Scrollintoview(Domain_Rgsd_Date);
	    String DomainRgsdDate12=Domain_Rgsd_Date.getText();
	    Reporter.log("<B><font color = 'blue'> ==> -</font> Last_Seen_ AdDetails Page= " +  lastSeenDate_today12);
	    Reporter.log("<B><font color = 'blue'> ==> -</font> Domain_Rgsd_Date AdDetails Page= " +  DomainRgsdDate12);
	    System.out.println("lastSeenDate_today: "+lastSeenDate_today12);
	    System.out.println("Domain Rgsd Date: "+DomainRgsdDate12);   
	    driver.close();
	    driver.switchTo().window(parent12);
	    helper.getLastseenDate(lastSeenDate_today12, imageDate12);
	    }
	    catch(Exception e1)
		{
	    	System.out.println("Image is not able: Oops! Looks like we don't have data for this search criteria yet.");

			Reporter.log("<B><font color = 'orange'> Step5 -</font> Image is not able: Oops! Looks like we don't have data for this search criteria yet.");
	    }
		
		
		try
		{
		String lastSeenDate_today13=null;
		Reporter.log(" ");
		Reporter.log("<B><font color ='red'> 13 Ad -</font> ");
		System.out.println("");
		System.out.println("13 Ads");

		String  imageDate13= date13.getText();
		Reporter.log("<B><font color = 'blue'> ==> -</font> Ads Caputure Image Date :");
		System.out.println("Ads Caputure Image Date");
		Reporter.log("<B><font color = 'blue'> ==> -</font> Image Date is :"+imageDate13);
		System.out.println("Current Date: "+imageDate13);
	
		helper.waitFor(ShowAnalytics13);
		helper.highLightElement(driver, ShowAnalytics13);
		helper.Scrollintoview(ShowAnalytics13);
		String linkText13 = ShowAnalytics13.getAttribute("href");
		helper.getAdID(linkText13);
		ShowAnalytics13.click();
		Reporter.log("<B><font color = 'blue'> ==> -</font> Clicked On Show Analytics Icon");
		helper.waitForPageToLoad();
		
		Set<String> S13=driver.getWindowHandles();
	    Iterator<String>it13=S13.iterator();
	    String parent13=it13.next();
	    String child13=it13.next();
	    
	    driver.switchTo().window(child13);

	    helper.waitForPageToLoad();
	    helper.waitFor(lastSeen);
	    helper.highLightElement(driver, lastSeen);
	    helper.Scrollintoview(lastSeen);
	    lastSeenDate_today13 = lastSeen.getText();
	    helper.Scrollintoview(Domain_Rgsd_Date);
	    String DomainRgsdDate13=Domain_Rgsd_Date.getText();
	    Reporter.log("<B><font color = 'blue'> ==> -</font> Last_Seen_ AdDetails Page= " +  lastSeenDate_today13);
	    Reporter.log("<B><font color = 'blue'> ==> -</font> Domain_Rgsd_Date AdDetails Page= " +  DomainRgsdDate13);
	    System.out.println("lastSeenDate_today: "+lastSeenDate_today13);
	    System.out.println("Domain Rgsd Date: "+DomainRgsdDate13);   
	    driver.close();
	    driver.switchTo().window(parent13);
	    helper.getLastseenDate(lastSeenDate_today13, imageDate13);
	    }
	    catch(Exception e1)
		{
	    	System.out.println("Image is not able: Oops! Looks like we don't have data for this search criteria yet.");

			Reporter.log("<B><font color = 'orange'> Step5 -</font> Image is not able: Oops! Looks like we don't have data for this search criteria yet.");
	    }
		
		try
		{
		String lastSeenDate_today14=null;
		Reporter.log(" ");
		Reporter.log("<B><font color ='red'> 14 Ad -</font> ");
		System.out.println("");
		System.out.println("14 Ads");
	
		String  imageDate14= date14.getText();
		Reporter.log("<B><font color = 'blue'> ==> -</font> Ads Caputure Image Date :");
		System.out.println("Ads Caputure Image Date");
		Reporter.log("<B><font color = 'blue'> ==> -</font> Image Date is :"+imageDate14);
		System.out.println("Current Date: "+imageDate14);
	
		helper.waitFor(ShowAnalytics14);
		helper.highLightElement(driver, ShowAnalytics14);
		helper.Scrollintoview(ShowAnalytics14);
		String linkText14 = ShowAnalytics14.getAttribute("href");
		helper.getAdID(linkText14);
		ShowAnalytics14.click();
		Reporter.log("<B><font color = 'blue'> ==> -</font> Clicked On Show Analytics Icon");
		helper.waitForPageToLoad();
		
		Set<String> S14=driver.getWindowHandles();
	    Iterator<String>it14=S14.iterator();
	    String parent14=it14.next();
	    String child14=it14.next();
	    
	    driver.switchTo().window(child14);

	    helper.waitForPageToLoad();
	    helper.waitFor(lastSeen);
	    helper.highLightElement(driver, lastSeen);
	    helper.Scrollintoview(lastSeen);
	    lastSeenDate_today14 = lastSeen.getText();
	    helper.Scrollintoview(Domain_Rgsd_Date);
	    String DomainRgsdDate14=Domain_Rgsd_Date.getText();
	    Reporter.log("<B><font color = 'blue'> ==> -</font> Last_Seen_ AdDetails Page= " +  lastSeenDate_today14);
	    Reporter.log("<B><font color = 'blue'> ==> -</font> Domain_Rgsd_Date AdDetails Page= " +  DomainRgsdDate14);
	    System.out.println("lastSeenDate_today: "+lastSeenDate_today14);
	    System.out.println("Domain Rgsd Date: "+DomainRgsdDate14);   
	    driver.close();
	    driver.switchTo().window(parent14);
	    helper.getLastseenDate(lastSeenDate_today14, imageDate14);
	    }
	    catch(Exception e1)
		{
	    	System.out.println("Image is not able: Oops! Looks like we don't have data for this search criteria yet.");

			Reporter.log("<B><font color = 'orange'> Step5 -</font> Image is not able: Oops! Looks like we don't have data for this search criteria yet.");
	    }
		
		try
		{
		String lastSeenDate_today15=null;
		Reporter.log(" ");
		Reporter.log("<B><font color ='red'> 15 Ad -</font> ");
		System.out.println("");
		System.out.println("15 Ads");
	
		String  imageDate15= date15.getText();
		Reporter.log("<B><font color = 'blue'> ==> -</font> Ads Caputure Image Date :");
		System.out.println("Ads Caputure Image Date");
		Reporter.log("<B><font color = 'blue'> ==> -</font> Image Date is :"+imageDate15);
		System.out.println("Current Date: "+imageDate15);
	
		helper.waitFor(ShowAnalytics15);
		helper.highLightElement(driver, ShowAnalytics15);
		helper.Scrollintoview(ShowAnalytics15);
		String linkText15 = ShowAnalytics15.getAttribute("href");
		helper.getAdID(linkText15);
		ShowAnalytics15.click();
		Reporter.log("<B><font color = 'blue'> ==> -</font> Clicked On Show Analytics Icon");
		helper.waitForPageToLoad();
		
		Set<String> S15=driver.getWindowHandles();
	    Iterator<String>it15=S15.iterator();
	    String parent15=it15.next();
	    String child15=it15.next();
	    
	    driver.switchTo().window(child15);

	    helper.waitForPageToLoad();
	    helper.waitFor(lastSeen);
	    helper.highLightElement(driver, lastSeen);
	    helper.Scrollintoview(lastSeen);
	    lastSeenDate_today15 = lastSeen.getText();
	    helper.Scrollintoview(Domain_Rgsd_Date);
	    String DomainRgsdDate15=Domain_Rgsd_Date.getText();
	    Reporter.log("<B><font color = 'blue'> ==> -</font> Last_Seen_ AdDetails Page= " +  lastSeenDate_today15);
	    Reporter.log("<B><font color = 'blue'> ==> -</font> Domain_Rgsd_Date AdDetails Page= " +  DomainRgsdDate15);
	    System.out.println("lastSeenDate_today: "+lastSeenDate_today15);
	    System.out.println("Domain Rgsd Date: "+DomainRgsdDate15);   
	    driver.close();
	    driver.switchTo().window(parent15);
	    helper.getLastseenDate(lastSeenDate_today15, imageDate15);
	    }
	    catch(Exception e1)
		{
	    	System.out.println("Image is not able: Oops! Looks like we don't have data for this search criteria yet.");

			Reporter.log("<B><font color = 'orange'> Step5 -</font> Image is not able: Oops! Looks like we don't have data for this search criteria yet.");
	    }
		
	}
	
	
	public void DomainRegistrationDate_This_Month_Days() throws InterruptedException
	{
		helper.waitForPageToLoad();
		Reporter.log("      ");
		Reporter.log("<B><font color = 'green'> -ShortBy Newest -Ad Domain Registration Date This Month  Step will Start from here </font> ");
		System.out.println();
		System.out.println("-ShortBy Newest -Ad Domain Registration Date -This Month");
		helper.waitFor(domainRegistrationfilter);
		helper.highLightElement(driver, domainRegistrationfilter);
		helper.jsScrollintoview(domainRegistrationfilter);
		domainRegistrationfilter.click();
		Reporter.log("<B><font color = 'orange'> Step1 -</font> Clicked On Ad Domain Registration Date filter Icon");

		helper.waitFor(This_Month);
		helper.highLightElement(driver, This_Month);
		helper.jsScrollintoview(This_Month);
		This_Month.click();
		Reporter.log("<B><font color = 'orange'> Step2 -</font> Clicked On Domain Registration Date This Month Icon");

		helper.waitFor(searchButton);
		helper.highLightElement(driver, searchButton);
		helper.Scrollintoview(searchButton);
		searchButton.click();
		Reporter.log("<B><font color = 'orange'> Step3 -</font> Clicked On search Button Icon");
		helper.waitForPageToLoad();

		String totaladscount=totaladscount_ad.getText();
		System.out.println("Totaladscount: "+totaladscount);
		Reporter.log("<B><font color = 'orange'> Step4 -</font>  Total Ad Count is :"+ totaladscount);
		
		try
		{
		String lastSeenDate_today1=null;
		Reporter.log(" ");
		Reporter.log("<B><font color ='red'> 1 Ad -</font>  ");
		System.out.println("");
		System.out.println("1 Ads");
		String  imageDate1= date1.getText();
		Reporter.log("<B><font color = 'blue'> ==> -</font> Ads Caputure Image Date :");
		System.out.println("Ads Caputure Image Date");
		Reporter.log("<B><font color = 'blue'> ==> -</font> Image Date is :"+imageDate1);
		System.out.println("Current Date: "+imageDate1);
	
		helper.waitFor(ShowAnalytics1);
		helper.highLightElement(driver, ShowAnalytics1);
		helper.Scrollintoview(ShowAnalytics1);
		String linkText1 = ShowAnalytics1.getAttribute("href");
		helper.getAdID(linkText1);
		ShowAnalytics1.click();
		Reporter.log("<B><font color = 'blue'> ==> -</font> Clicked On Show Analytics Icon");
		helper.waitForPageToLoad();
		
		Set<String> S1=driver.getWindowHandles();
	    Iterator<String>it1=S1.iterator();
	    String parent1=it1.next();
	    String child1=it1.next();
	    
	    driver.switchTo().window(child1);

	    helper.waitForPageToLoad();
	    helper.waitFor(lastSeen);
	    helper.highLightElement(driver, lastSeen);
	    helper.Scrollintoview(lastSeen);
	    lastSeenDate_today1 = lastSeen.getText();
	    helper.Scrollintoview(Domain_Rgsd_Date);
	    String DomainRgsdDate1=Domain_Rgsd_Date.getText();
	    Reporter.log("<B><font color = 'blue'> ==> -</font> Last_Seen_ AdDetails Page= " +  lastSeenDate_today1);
	    Reporter.log("<B><font color = 'blue'> ==> -</font> Domain_Rgsd_Date AdDetails Page= " +  DomainRgsdDate1);
	    System.out.println("lastSeenDate_today: "+lastSeenDate_today1);
	    System.out.println("Domain Rgsd Date: "+DomainRgsdDate1);   
	    driver.close();
	    driver.switchTo().window(parent1);
	    helper.getLastseenDate(lastSeenDate_today1, imageDate1);
	    }
	    catch(Exception e)
		{
	    	System.out.println("Image is not able: Oops! Looks like we don't have data for this search criteria yet.");

			Reporter.log("<B><font color = 'orange'> Step5 -</font> Image is not able: Oops! Looks like we don't have data for this search criteria yet.");
	    }

		try
		{
		String lastSeenDate_today2=null;
		Reporter.log(" ");
		Reporter.log("<B><font color ='red'> 2 Ad -</font>  ");
		System.out.println("");
		System.out.println("2 Ads");
		String  imageDate2= date2.getText();
		Reporter.log("<B><font color = 'blue'> ==> -</font> Ads Caputure Image Date :");
		System.out.println("Ads Caputure Image Date");
		Reporter.log("<B><font color = 'blue'> ==> -</font> Image Date is :"+imageDate2);
		System.out.println("Current Date: "+imageDate2);
	
		helper.waitFor(ShowAnalytics2);
		helper.highLightElement(driver, ShowAnalytics2);
		helper.Scrollintoview(ShowAnalytics2);
		String linkText2 = ShowAnalytics2.getAttribute("href");
		helper.getAdID(linkText2);
		ShowAnalytics2.click();
		Reporter.log("<B><font color = 'blue'> ==> -</font> Clicked On Show Analytics Icon");
		helper.waitForPageToLoad();
		
		Set<String> S2=driver.getWindowHandles();
	    Iterator<String>it2=S2.iterator();
	    String parent2=it2.next();
	    String child2=it2.next();
	    
	    driver.switchTo().window(child2);

	    helper.waitForPageToLoad();
	    helper.waitFor(lastSeen);
	    helper.highLightElement(driver, lastSeen);
	    helper.Scrollintoview(lastSeen);
	    lastSeenDate_today2 = lastSeen.getText();
	    helper.Scrollintoview(Domain_Rgsd_Date);
	    String DomainRgsdDate2=Domain_Rgsd_Date.getText();
	    Reporter.log("<B><font color = 'blue'> ==> -</font> Last_Seen_ AdDetails Page= " +  lastSeenDate_today2);
	    Reporter.log("<B><font color = 'blue'> ==> -</font> Domain_Rgsd_Date AdDetails Page= " +  DomainRgsdDate2);
	    System.out.println("lastSeenDate_today: "+lastSeenDate_today2);
	    System.out.println("Domain Rgsd Date: "+DomainRgsdDate2);   
	    driver.close();
	    driver.switchTo().window(parent2);
	    helper.getLastseenDate(lastSeenDate_today2, imageDate2);
	    }
	    catch(Exception e)
		{
	    	System.out.println("Image is not able: Oops! Looks like we don't have data for this search criteria yet.");

			Reporter.log("<B><font color = 'orange'> Step5 -</font> Image is not able: Oops! Looks like we don't have data for this search criteria yet.");
	    }

		try
		{
		String lastSeenDate_today3=null;
		Reporter.log(" ");
		Reporter.log("<B><font color ='red'> 3 Ad -</font>  ");
		System.out.println("");
		System.out.println("3 Ads");
	
		String  imageDate3= date3.getText();
		Reporter.log("<B><font color = 'blue'> ==> -</font> Ads Caputure Image Date :");
		Reporter.log("<B><font color = 'blue'> ==> -</font> Image Date is :"+imageDate3);
		System.out.println("Current Date: "+imageDate3);
	
		helper.waitFor(ShowAnalytics3);
		helper.highLightElement(driver, ShowAnalytics3);
		helper.Scrollintoview(ShowAnalytics3);
		String linkText3 = ShowAnalytics3.getAttribute("href");
		helper.getAdID(linkText3);
		ShowAnalytics3.click();
		Reporter.log("<B><font color = 'blue'> ==> -</font> Clicked On Show Analytics Icon");
		helper.waitForPageToLoad();
		
		Set<String> S3=driver.getWindowHandles();
	    Iterator<String>it3=S3.iterator();
	    String parent3=it3.next();
	    String child3=it3.next();
	    
	    driver.switchTo().window(child3);

	    helper.waitForPageToLoad();
	    helper.waitFor(lastSeen);
	    helper.highLightElement(driver, lastSeen);
	    helper.Scrollintoview(lastSeen);
	    lastSeenDate_today3 = lastSeen.getText();
	    helper.Scrollintoview(Domain_Rgsd_Date);
	    String DomainRgsdDate3=Domain_Rgsd_Date.getText();
	    Reporter.log("<B><font color = 'blue'> ==> -</font> Last_Seen_ AdDetails Page= " +  lastSeenDate_today3);
	    Reporter.log("<B><font color = 'blue'> ==> -</font> Domain_Rgsd_Date AdDetails Page= " +  DomainRgsdDate3);
	    System.out.println("lastSeenDate_today: "+lastSeenDate_today3);
	    System.out.println("Domain Rgsd Date: "+DomainRgsdDate3);   
	    driver.close();
	    driver.switchTo().window(parent3);
	    helper.getLastseenDate(lastSeenDate_today3, imageDate3);
	    }
	    catch(Exception e)
		{
	    	System.out.println("Image is not able: Oops! Looks like we don't have data for this search criteria yet.");

			Reporter.log("<B><font color = 'orange'> Step5 -</font> Image is not able: Oops! Looks like we don't have data for this search criteria yet.");
	    }
		
		try
		{
		String lastSeenDate_today4=null;
		Reporter.log(" ");
		Reporter.log("<B><font color ='red'> 4 Ad -</font>  ");
		System.out.println("");
		System.out.println("4 Ads");
		
		String  imageDate4= date4.getText();
		Reporter.log("<B><font color = 'blue'> ==> -</font> Ads Caputure Image Date :");
		System.out.println("Ads Caputure Image Date");
		Reporter.log("<B><font color = 'blue'> ==> -</font> Image Date is :"+imageDate4);
		System.out.println("Current Date: "+imageDate4);
	
		helper.waitFor(ShowAnalytics4);
		helper.highLightElement(driver, ShowAnalytics4);
		helper.Scrollintoview(ShowAnalytics4);
		String linkText4 = ShowAnalytics4.getAttribute("href");
		helper.getAdID(linkText4);
		ShowAnalytics4.click();
		Reporter.log("<B><font color = 'blue'> ==> -</font> Clicked On Show Analytics Icon");
		helper.waitForPageToLoad();
		
		Set<String> S4=driver.getWindowHandles();
	    Iterator<String>it4=S4.iterator();
	    String parent4=it4.next();
	    String child4=it4.next();
	    
	    driver.switchTo().window(child4);

	    helper.waitForPageToLoad();
	    helper.waitFor(lastSeen);
	    helper.highLightElement(driver, lastSeen);
	    helper.Scrollintoview(lastSeen);
	    lastSeenDate_today4 = lastSeen.getText();
	    helper.Scrollintoview(Domain_Rgsd_Date);
	    String DomainRgsdDate4=Domain_Rgsd_Date.getText();
	    Reporter.log("<B><font color = 'blue'> ==> -</font> Last_Seen_ AdDetails Page= " +  lastSeenDate_today4);
	    Reporter.log("<B><font color = 'blue'> ==> -</font> Domain_Rgsd_Date AdDetails Page= " +  DomainRgsdDate4);
	    System.out.println("lastSeenDate_today: "+lastSeenDate_today4);
	    System.out.println("Domain Rgsd Date: "+DomainRgsdDate4);   
	    driver.close();
	    driver.switchTo().window(parent4);
	    helper.getLastseenDate(lastSeenDate_today4, imageDate4);
	    }
	    catch(Exception e)
		{
	    	System.out.println("Image is not able: Oops! Looks like we don't have data for this search criteria yet.");

			Reporter.log("<B><font color = 'orange'> Step5 -</font> Image is not able: Oops! Looks like we don't have data for this search criteria yet.");
		}
			try
		{
		String lastSeenDate_today5=null;
		Reporter.log(" ");
		Reporter.log("<B><font color ='red'> 5 Ad -</font>  ");
		System.out.println("");
		System.out.println("5 Ads");
		
		String  imageDate5= date5.getText();
		Reporter.log("<B><font color = 'blue'> ==> -</font> Ads Caputure Image Date :");
		System.out.println("Ads Caputure Image Date");
		Reporter.log("<B><font color = 'blue'> ==> -</font> Image Date is :"+imageDate5);
		System.out.println("Current Date: "+imageDate5);
	
		helper.waitFor(ShowAnalytics5);
		helper.highLightElement(driver, ShowAnalytics5);
		helper.Scrollintoview(ShowAnalytics5);
		String linkText5 = ShowAnalytics5.getAttribute("href");
		helper.getAdID(linkText5);
		ShowAnalytics5.click();
		Reporter.log("<B><font color = 'blue'> ==> -</font> Clicked On Show Analytics Icon");
		helper.waitForPageToLoad();
		
		Set<String> S5=driver.getWindowHandles();
	    Iterator<String>it5=S5.iterator();
	    String parent5=it5.next();
	    String child5=it5.next();
	    
	    driver.switchTo().window(child5);

	    helper.waitForPageToLoad();
	    helper.waitFor(lastSeen);
	    helper.highLightElement(driver, lastSeen);
	    helper.Scrollintoview(lastSeen);
	    lastSeenDate_today5 = lastSeen.getText();
	    helper.Scrollintoview(Domain_Rgsd_Date);
	    String DomainRgsdDate5=Domain_Rgsd_Date.getText();
	    Reporter.log("<B><font color = 'blue'> ==> -</font> Last_Seen_ AdDetails Page= " +  lastSeenDate_today5);
	    Reporter.log("<B><font color = 'blue'> ==> -</font> Domain_Rgsd_Date AdDetails Page= " +  DomainRgsdDate5);
	    System.out.println("lastSeenDate_today: "+lastSeenDate_today5);
	    System.out.println("Domain Rgsd Date: "+DomainRgsdDate5);   
	    driver.close();
	    driver.switchTo().window(parent5);
	    helper.getLastseenDate(lastSeenDate_today5, imageDate5);
	    }
	    catch(Exception e1)
		{
	    	System.out.println("Image is not able: Oops! Looks like we don't have data for this search criteria yet.");

			Reporter.log("<B><font color = 'orange'> Step5 -</font> Image is not able: Oops! Looks like we don't have data for this search criteria yet.");
	    }
		
		try
		{
		String lastSeenDate_today6=null;
		Reporter.log(" ");
		Reporter.log("<B><font color ='red'> 6 Ad -</font>  ");
		System.out.println("");
		System.out.println("6 Ads");
		
		String  imageDate6= date6.getText();
		Reporter.log("<B><font color = 'blue'> ==> -</font> Ads Caputure Image Date :");
		System.out.println("Ads Caputure Image Date");
		Reporter.log("<B><font color = 'blue'> ==> -</font> Image Date is :"+imageDate6);
		System.out.println("Current Date: "+imageDate6);
	
		helper.waitFor(ShowAnalytics6);
		helper.highLightElement(driver, ShowAnalytics6);
		helper.Scrollintoview(ShowAnalytics6);
		String linkText6 = ShowAnalytics6.getAttribute("href");
		helper.getAdID(linkText6);
		ShowAnalytics6.click();
		Reporter.log("<B><font color = 'blue'> ==> -</font> Clicked On Show Analytics Icon");
		helper.waitForPageToLoad();
		
		Set<String> S6=driver.getWindowHandles();
	    Iterator<String>it6=S6.iterator();
	    String parent6=it6.next();
	    String child6=it6.next();
	    
	    driver.switchTo().window(child6);

	    helper.waitForPageToLoad();
	    helper.waitFor(lastSeen);
	    helper.highLightElement(driver, lastSeen);
	    helper.Scrollintoview(lastSeen);
	    lastSeenDate_today6 = lastSeen.getText();
	    helper.Scrollintoview(Domain_Rgsd_Date);
	    String DomainRgsdDate6=Domain_Rgsd_Date.getText();
	    Reporter.log("<B><font color = 'blue'> ==> -</font> Last_Seen_ AdDetails Page= " +  lastSeenDate_today6);
	    Reporter.log("<B><font color = 'blue'> ==> -</font> Domain_Rgsd_Date AdDetails Page= " +  DomainRgsdDate6);
	    System.out.println("lastSeenDate_today: "+lastSeenDate_today6);
	    System.out.println("Domain Rgsd Date: "+DomainRgsdDate6);   
	    driver.close();
	    driver.switchTo().window(parent6);
	    helper.getLastseenDate(lastSeenDate_today6, imageDate6);
	    }
	    catch(Exception e1)
		{
	    	System.out.println("Image is not able: Oops! Looks like we don't have data for this search criteria yet.");

			Reporter.log("<B><font color = 'orange'> Step5 -</font> Image is not able: Oops! Looks like we don't have data for this search criteria yet.");
	    }
		
		try
		{
		String lastSeenDate_today7=null;
		Reporter.log(" ");
		Reporter.log("<B><font color ='red'> 7 Ad -</font>  ");
		System.out.println("");
		System.out.println("7 Ads");

		String  imageDate7= date7.getText();
		Reporter.log("<B><font color = 'blue'> ==> -</font> Ads Caputure Image Date :");
		System.out.println("Ads Caputure Image Date");
		Reporter.log("<B><font color = 'blue'> ==> -</font> Image Date is :"+imageDate7);
		System.out.println("Current Date: "+imageDate7);
	
		helper.waitFor(ShowAnalytics7);
		helper.highLightElement(driver, ShowAnalytics7);
		helper.Scrollintoview(ShowAnalytics7);
		String linkText7 = ShowAnalytics7.getAttribute("href");
		helper.getAdID(linkText7);
		ShowAnalytics7.click();
		Reporter.log("<B><font color = 'blue'> ==> -</font> Clicked On Show Analytics Icon");
		helper.waitForPageToLoad();
		
		Set<String> S7=driver.getWindowHandles();
	    Iterator<String>it7=S7.iterator();
	    String parent7=it7.next();
	    String child7=it7.next();
	    
	    driver.switchTo().window(child7);

	    helper.waitForPageToLoad();
	    helper.waitFor(lastSeen);
	    helper.highLightElement(driver, lastSeen);
	    helper.Scrollintoview(lastSeen);
	    lastSeenDate_today7 = lastSeen.getText();
	    helper.Scrollintoview(Domain_Rgsd_Date);
	    String DomainRgsdDate7=Domain_Rgsd_Date.getText();
	    Reporter.log("<B><font color = 'blue'> ==> -</font> Last_Seen_ AdDetails Page= " +  lastSeenDate_today7);
	    Reporter.log("<B><font color = 'blue'> ==> -</font> Domain_Rgsd_Date AdDetails Page= " +  DomainRgsdDate7);
	    System.out.println("lastSeenDate_today: "+lastSeenDate_today7);
	    System.out.println("Domain Rgsd Date: "+DomainRgsdDate7);   
	    driver.close();
	    driver.switchTo().window(parent7);
	    helper.getLastseenDate(lastSeenDate_today7, imageDate7);
	    }
	    catch(Exception e1)
		{
	    	System.out.println("Image is not able: Oops! Looks like we don't have data for this search criteria yet.");

			Reporter.log("<B><font color = 'orange'> Step5 -</font> Image is not able: Oops! Looks like we don't have data for this search criteria yet.");
	    }
		
		try
		{
		String lastSeenDate_today8=null;
		Reporter.log(" ");
		Reporter.log("<B><font color ='red'> 8 Ad -</font>  ");
		System.out.println("");
		System.out.println("8 Ads");

		String  imageDate8= date8.getText();
		Reporter.log("<B><font color = 'blue'> ==> -</font> Ads Caputure Image Date :");
		System.out.println("Ads Caputure Image Date");
		Reporter.log("<B><font color = 'blue'> ==> -</font> Image Date is :"+imageDate8);
		System.out.println("Current Date: "+imageDate8);
	
		helper.waitFor(ShowAnalytics8);
		helper.highLightElement(driver, ShowAnalytics8);
		helper.Scrollintoview(ShowAnalytics8);
		String linkText8 = ShowAnalytics8.getAttribute("href");
		helper.getAdID(linkText8);
		ShowAnalytics8.click();
		Reporter.log("<B><font color = 'blue'> ==> -</font> Clicked On Show Analytics Icon");
		helper.waitForPageToLoad();
		
		Set<String> S8=driver.getWindowHandles();
	    Iterator<String>it8=S8.iterator();
	    String parent8=it8.next();
	    String child8=it8.next();
	    
	    driver.switchTo().window(child8);

	    helper.waitForPageToLoad();
	    helper.waitFor(lastSeen);
	    helper.highLightElement(driver, lastSeen);
	    helper.Scrollintoview(lastSeen);
	    lastSeenDate_today8 = lastSeen.getText();
	    helper.Scrollintoview(Domain_Rgsd_Date);
	    String DomainRgsdDate8=Domain_Rgsd_Date.getText();
	    Reporter.log("<B><font color = 'blue'> ==> -</font> Last_Seen_ AdDetails Page= " +  lastSeenDate_today8);
	    Reporter.log("<B><font color = 'blue'> ==> -</font> Domain_Rgsd_Date AdDetails Page= " +  DomainRgsdDate8);
	    System.out.println("lastSeenDate_today: "+lastSeenDate_today8);
	    System.out.println("Domain Rgsd Date: "+DomainRgsdDate8);   
	    driver.close();
	    driver.switchTo().window(parent8);
	    helper.getLastseenDate(lastSeenDate_today8, imageDate8);
	    }
	    catch(Exception e1)
		{
	    	System.out.println("Image is not able: Oops! Looks like we don't have data for this search criteria yet.");

			Reporter.log("<B><font color = 'orange'> Step5 -</font> Image is not able: Oops! Looks like we don't have data for this search criteria yet.");
	    }
		
		try
		{
		String lastSeenDate_today9=null;
		Reporter.log(" ");
		Reporter.log("<B><font color ='red'> 9 Ad -</font>  ");
		System.out.println("");
		System.out.println("9 Ads");

		String  imageDate9= date9.getText();
		Reporter.log("<B><font color = 'blue'> ==> -</font> Ads Caputure Image Date :");
		System.out.println("Ads Caputure Image Date");
		Reporter.log("<B><font color = 'blue'> ==> -</font> Image Date is :"+imageDate9);
		System.out.println("Current Date: "+imageDate9);
	
		helper.waitFor(ShowAnalytics9);
		helper.highLightElement(driver, ShowAnalytics9);
		helper.Scrollintoview(ShowAnalytics9);
		String linkText9 = ShowAnalytics9.getAttribute("href");
		helper.getAdID(linkText9);
		ShowAnalytics9.click();
		Reporter.log("<B><font color = 'blue'> ==> -</font> Clicked On Show Analytics Icon");
		helper.waitForPageToLoad();
		
		Set<String> S9=driver.getWindowHandles();
	    Iterator<String>it9=S9.iterator();
	    String parent9=it9.next();
	    String child9=it9.next();
	    
	    driver.switchTo().window(child9);

	    helper.waitForPageToLoad();
	    helper.waitFor(lastSeen);
	    helper.highLightElement(driver, lastSeen);
	    helper.Scrollintoview(lastSeen);
	    lastSeenDate_today9 = lastSeen.getText();
	    helper.Scrollintoview(Domain_Rgsd_Date);
	    String DomainRgsdDate9=Domain_Rgsd_Date.getText();
	    Reporter.log("<B><font color = 'blue'> ==> -</font> Last_Seen_ AdDetails Page= " +  lastSeenDate_today9);
	    Reporter.log("<B><font color = 'blue'> ==> -</font> Domain_Rgsd_Date AdDetails Page= " +  DomainRgsdDate9);
	    System.out.println("lastSeenDate_today: "+lastSeenDate_today9);
	    System.out.println("Domain Rgsd Date: "+DomainRgsdDate9);   
	    driver.close();
	    driver.switchTo().window(parent9);
	    helper.getLastseenDate(lastSeenDate_today9, imageDate9);
	    }
	    catch(Exception e1)
		{
	    	System.out.println("Image is not able: Oops! Looks like we don't have data for this search criteria yet.");

	    	Reporter.log("<B><font color = 'orange'> Step5 -</font> Image is not able: Oops! Looks like we don't have data for this search criteria yet.");
	    }
		
		try
		{
		String lastSeenDate_today10=null;
		Reporter.log(" ");
		Reporter.log("<B><font color ='red'> 10 Ad -</font>  ");
		System.out.println("");
		System.out.println("10 Ads");
	
		String  imageDate10= date10.getText();
		Reporter.log("<B><font color = 'blue'> ==> -</font> Ads Caputure Image Date :");
		System.out.println("Ads Caputure Image Date");
		Reporter.log("<B><font color = 'blue'> ==> -</font> Image Date is :"+imageDate10);
		System.out.println("Current Date: "+imageDate10);
	
		helper.waitFor(ShowAnalytics10);
		helper.highLightElement(driver, ShowAnalytics10);
		helper.Scrollintoview(ShowAnalytics10);
		String linkText10 = ShowAnalytics10.getAttribute("href");
		helper.getAdID(linkText10);
		ShowAnalytics10.click();
		Reporter.log("<B><font color = 'blue'> ==> -</font> Clicked On Show Analytics Icon");
		helper.waitForPageToLoad();
		
		Set<String> S10=driver.getWindowHandles();
	    Iterator<String>it10=S10.iterator();
	    String parent10=it10.next();
	    String child10=it10.next();
	    
	    driver.switchTo().window(child10);

	    helper.waitForPageToLoad();
	    helper.waitFor(lastSeen);
	    helper.highLightElement(driver, lastSeen);
	    helper.Scrollintoview(lastSeen);
	    lastSeenDate_today10 = lastSeen.getText();
	    helper.Scrollintoview(Domain_Rgsd_Date);
	    String DomainRgsdDate10=Domain_Rgsd_Date.getText();
	    Reporter.log("<B><font color = 'blue'> ==> -</font> Last_Seen_ AdDetails Page= " +  lastSeenDate_today10);
	    Reporter.log("<B><font color = 'blue'> ==> -</font> Domain_Rgsd_Date AdDetails Page= " +  DomainRgsdDate10);
	    System.out.println("lastSeenDate_today: "+lastSeenDate_today10);
	    System.out.println("Domain Rgsd Date: "+DomainRgsdDate10);   
	    driver.close();
	    driver.switchTo().window(parent10);
	    helper.getLastseenDate(lastSeenDate_today10, imageDate10);
	    }
	    catch(Exception e1)
		{
	    	System.out.println("Image is not able: Oops! Looks like we don't have data for this search criteria yet.");

			Reporter.log("<B><font color = 'orange'> Step5 -</font> Image is not able: Oops! Looks like we don't have data for this search criteria yet.");
	    }
		
		try
		{
		String lastSeenDate_today11=null;
		Reporter.log(" ");
		Reporter.log("<B><font color ='red'> 11 Ad -</font>  ");
		System.out.println("");
		System.out.println("11 Ads");

		String  imageDate11= date11.getText();
		Reporter.log("<B><font color = 'blue'> ==> -</font> Ads Caputure Image Date :");
		System.out.println("Ads Caputure Image Date");
		Reporter.log("<B><font color = 'blue'> ==> -</font> Image Date is :"+imageDate11);
		System.out.println("Current Date: "+imageDate11);
	
		helper.waitFor(ShowAnalytics11);
		helper.highLightElement(driver, ShowAnalytics11);
		helper.Scrollintoview(ShowAnalytics11);
		String linkText11 = ShowAnalytics11.getAttribute("href");
		helper.getAdID(linkText11);
		ShowAnalytics11.click();
		Reporter.log("<B><font color = 'blue'> ==> -</font> Clicked On Show Analytics Icon");
		helper.waitForPageToLoad();
		
		Set<String> S11=driver.getWindowHandles();
	    Iterator<String>it11=S11.iterator();
	    String parent11=it11.next();
	    String child11=it11.next();
	    
	    driver.switchTo().window(child11);

	    helper.waitForPageToLoad();
	    helper.waitFor(lastSeen);
	    helper.highLightElement(driver, lastSeen);
	    helper.Scrollintoview(lastSeen);
	    lastSeenDate_today11 = lastSeen.getText();
	    helper.Scrollintoview(Domain_Rgsd_Date);
	    String DomainRgsdDate11=Domain_Rgsd_Date.getText();
	    Reporter.log("<B><font color = 'blue'> ==> -</font> Last_Seen_ AdDetails Page= " +  lastSeenDate_today11);
	    Reporter.log("<B><font color = 'blue'> ==> -</font> Domain_Rgsd_Date AdDetails Page= " +  DomainRgsdDate11);
	    System.out.println("lastSeenDate_today: "+lastSeenDate_today11);
	    System.out.println("Domain Rgsd Date: "+DomainRgsdDate11);   
	    driver.close();
	    driver.switchTo().window(parent11);
	    helper.getLastseenDate(lastSeenDate_today11, imageDate11);
	    }
	    catch(Exception e1)
		{
	    	System.out.println("Image is not able: Oops! Looks like we don't have data for this search criteria yet.");

			Reporter.log("<B><font color = 'orange'> Step5 -</font> Image is not able: Oops! Looks like we don't have data for this search criteria yet.");
	    }
		
		
		try
		{
		String lastSeenDate_today12=null;
		Reporter.log(" ");
		Reporter.log("<B><font color ='red'> 12 Ad -</font> ");
		System.out.println("");
		System.out.println("12 Ads");
		String  imageDate12= date12.getText();
		Reporter.log("<B><font color = 'blue'> ==> -</font> Ads Caputure Image Date :");
		System.out.println("Ads Caputure Image Date");
		Reporter.log("<B><font color = 'blue'> ==> -</font> Image Date is :"+imageDate12);
		System.out.println("Current Date: "+imageDate12);
	
		helper.waitFor(ShowAnalytics12);
		helper.highLightElement(driver, ShowAnalytics12);
		helper.Scrollintoview(ShowAnalytics12);
		String linkText12 = ShowAnalytics12.getAttribute("href");
		helper.getAdID(linkText12);
		ShowAnalytics12.click();
		Reporter.log("<B><font color = 'blue'> ==> -</font> Clicked On Show Analytics Icon");
		helper.waitForPageToLoad();
		
		Set<String> S12=driver.getWindowHandles();
	    Iterator<String>it12=S12.iterator();
	    String parent12=it12.next();
	    String child12=it12.next();
	    
	    driver.switchTo().window(child12);

	    helper.waitForPageToLoad();
	    helper.waitFor(lastSeen);
	    helper.highLightElement(driver, lastSeen);
	    helper.Scrollintoview(lastSeen);
	    lastSeenDate_today12 = lastSeen.getText();
	    helper.Scrollintoview(Domain_Rgsd_Date);
	    String DomainRgsdDate12=Domain_Rgsd_Date.getText();
	    Reporter.log("<B><font color = 'blue'> ==> -</font> Last_Seen_ AdDetails Page= " +  lastSeenDate_today12);
	    Reporter.log("<B><font color = 'blue'> ==> -</font> Domain_Rgsd_Date AdDetails Page= " +  DomainRgsdDate12);
	    System.out.println("lastSeenDate_today: "+lastSeenDate_today12);
	    System.out.println("Domain Rgsd Date: "+DomainRgsdDate12);   
	    driver.close();
	    driver.switchTo().window(parent12);
	    helper.getLastseenDate(lastSeenDate_today12, imageDate12);
	    }
	    catch(Exception e1)
		{
	    	System.out.println("Image is not able: Oops! Looks like we don't have data for this search criteria yet.");

			Reporter.log("<B><font color = 'orange'> Step5 -</font> Image is not able: Oops! Looks like we don't have data for this search criteria yet.");
	    }
		
		
		try
		{
		String lastSeenDate_today13=null;
		Reporter.log(" ");
		Reporter.log("<B><font color ='red'> 13 Ad -</font> ");
		System.out.println("");
		System.out.println("13 Ads");

		String  imageDate13= date13.getText();
		Reporter.log("<B><font color = 'blue'> ==> -</font> Ads Caputure Image Date :");
		System.out.println("Ads Caputure Image Date");
		Reporter.log("<B><font color = 'blue'> ==> -</font> Image Date is :"+imageDate13);
		System.out.println("Current Date: "+imageDate13);
	
		helper.waitFor(ShowAnalytics13);
		helper.highLightElement(driver, ShowAnalytics13);
		helper.Scrollintoview(ShowAnalytics13);
		String linkText13 = ShowAnalytics13.getAttribute("href");
		helper.getAdID(linkText13);
		ShowAnalytics13.click();
		Reporter.log("<B><font color = 'blue'> ==> -</font> Clicked On Show Analytics Icon");
		helper.waitForPageToLoad();
		
		Set<String> S13=driver.getWindowHandles();
	    Iterator<String>it13=S13.iterator();
	    String parent13=it13.next();
	    String child13=it13.next();
	    
	    driver.switchTo().window(child13);

	    helper.waitForPageToLoad();
	    helper.waitFor(lastSeen);
	    helper.highLightElement(driver, lastSeen);
	    helper.Scrollintoview(lastSeen);
	    lastSeenDate_today13 = lastSeen.getText();
	    helper.Scrollintoview(Domain_Rgsd_Date);
	    String DomainRgsdDate13=Domain_Rgsd_Date.getText();
	    Reporter.log("<B><font color = 'blue'> ==> -</font> Last_Seen_ AdDetails Page= " +  lastSeenDate_today13);
	    Reporter.log("<B><font color = 'blue'> ==> -</font> Domain_Rgsd_Date AdDetails Page= " +  DomainRgsdDate13);
	    System.out.println("lastSeenDate_today: "+lastSeenDate_today13);
	    System.out.println("Domain Rgsd Date: "+DomainRgsdDate13);   
	    driver.close();
	    driver.switchTo().window(parent13);
	    helper.getLastseenDate(lastSeenDate_today13, imageDate13);
	    }
	    catch(Exception e1)
		{
	    	System.out.println("Image is not able: Oops! Looks like we don't have data for this search criteria yet.");

			Reporter.log("<B><font color = 'orange'> Step5 -</font> Image is not able: Oops! Looks like we don't have data for this search criteria yet.");
	    }
		
		try
		{
		String lastSeenDate_today14=null;
		Reporter.log(" ");
		Reporter.log("<B><font color ='red'> 14 Ad -</font> ");
		System.out.println("");
		System.out.println("14 Ads");
	
		String  imageDate14= date14.getText();
		Reporter.log("<B><font color = 'blue'> ==> -</font> Ads Caputure Image Date :");
		System.out.println("Ads Caputure Image Date");
		Reporter.log("<B><font color = 'blue'> ==> -</font> Image Date is :"+imageDate14);
		System.out.println("Current Date: "+imageDate14);
	
		helper.waitFor(ShowAnalytics14);
		helper.highLightElement(driver, ShowAnalytics14);
		helper.Scrollintoview(ShowAnalytics14);
		String linkText14 = ShowAnalytics14.getAttribute("href");
		helper.getAdID(linkText14);
		ShowAnalytics14.click();
		Reporter.log("<B><font color = 'blue'> ==> -</font> Clicked On Show Analytics Icon");
		helper.waitForPageToLoad();
		
		Set<String> S14=driver.getWindowHandles();
	    Iterator<String>it14=S14.iterator();
	    String parent14=it14.next();
	    String child14=it14.next();
	    
	    driver.switchTo().window(child14);

	    helper.waitForPageToLoad();
	    helper.waitFor(lastSeen);
	    helper.highLightElement(driver, lastSeen);
	    helper.Scrollintoview(lastSeen);
	    lastSeenDate_today14 = lastSeen.getText();
	    helper.Scrollintoview(Domain_Rgsd_Date);
	    String DomainRgsdDate14=Domain_Rgsd_Date.getText();
	    Reporter.log("<B><font color = 'blue'> ==> -</font> Last_Seen_ AdDetails Page= " +  lastSeenDate_today14);
	    Reporter.log("<B><font color = 'blue'> ==> -</font> Domain_Rgsd_Date AdDetails Page= " +  DomainRgsdDate14);
	    System.out.println("lastSeenDate_today: "+lastSeenDate_today14);
	    System.out.println("Domain Rgsd Date: "+DomainRgsdDate14);   
	    driver.close();
	    driver.switchTo().window(parent14);
	    helper.getLastseenDate(lastSeenDate_today14, imageDate14);
	    }
	    catch(Exception e1)
		{
	    	System.out.println("Image is not able: Oops! Looks like we don't have data for this search criteria yet.");

			Reporter.log("<B><font color = 'orange'> Step5 -</font> Image is not able: Oops! Looks like we don't have data for this search criteria yet.");
	    }
		
		try
		{
		String lastSeenDate_today15=null;
		Reporter.log(" ");
		Reporter.log("<B><font color ='red'> 15 Ad -</font> ");
		System.out.println("");
		System.out.println("15 Ads");
	
		String  imageDate15= date15.getText();
		Reporter.log("<B><font color = 'blue'> ==> -</font> Ads Caputure Image Date :");
		System.out.println("Ads Caputure Image Date");
		Reporter.log("<B><font color = 'blue'> ==> -</font> Image Date is :"+imageDate15);
		System.out.println("Current Date: "+imageDate15);
	
		helper.waitFor(ShowAnalytics15);
		helper.highLightElement(driver, ShowAnalytics15);
		helper.Scrollintoview(ShowAnalytics15);
		String linkText15 = ShowAnalytics15.getAttribute("href");
		helper.getAdID(linkText15);
		ShowAnalytics15.click();
		Reporter.log("<B><font color = 'blue'> ==> -</font> Clicked On Show Analytics Icon");
		helper.waitForPageToLoad();
		
		Set<String> S15=driver.getWindowHandles();
	    Iterator<String>it15=S15.iterator();
	    String parent15=it15.next();
	    String child15=it15.next();
	    
	    driver.switchTo().window(child15);

	    helper.waitForPageToLoad();
	    helper.waitFor(lastSeen);
	    helper.highLightElement(driver, lastSeen);
	    helper.Scrollintoview(lastSeen);
	    lastSeenDate_today15 = lastSeen.getText();
	    helper.Scrollintoview(Domain_Rgsd_Date);
	    String DomainRgsdDate15=Domain_Rgsd_Date.getText();
	    Reporter.log("<B><font color = 'blue'> ==> -</font> Last_Seen_ AdDetails Page= " +  lastSeenDate_today15);
	    Reporter.log("<B><font color = 'blue'> ==> -</font> Domain_Rgsd_Date AdDetails Page= " +  DomainRgsdDate15);
	    System.out.println("lastSeenDate_today: "+lastSeenDate_today15);
	    System.out.println("Domain Rgsd Date: "+DomainRgsdDate15);   
	    driver.close();
	    driver.switchTo().window(parent15);
	    helper.getLastseenDate(lastSeenDate_today15, imageDate15);
	    }
	    catch(Exception e1)
		{
	    	System.out.println("Image is not able: Oops! Looks like we don't have data for this search criteria yet.");

			Reporter.log("<B><font color = 'orange'> Step5 -</font> Image is not able: Oops! Looks like we don't have data for this search criteria yet.");
	    }
	
}
	
	public void DomainRegistrationDate_Last_Month_Days() throws InterruptedException
	{
		helper.waitForPageToLoad();
		Reporter.log("      ");
		Reporter.log("<B><font color = 'green'> -ShortBy Newest -Ad Domain Registration Date Last Month  Step will Start from here </font> ");
		System.out.println();
		System.out.println("-ShortBy Newest -Ad Domain Registration Date -Last Month");
		helper.waitFor(domainRegistrationfilter);
		helper.highLightElement(driver, domainRegistrationfilter);
		helper.jsScrollintoview(domainRegistrationfilter);
		domainRegistrationfilter.click();
		Reporter.log("<B><font color = 'orange'> Step1 -</font> Clicked On Ad Domain Registration Date filter Icon");

		helper.waitFor(Last_Month);
		helper.highLightElement(driver, Last_Month);
		helper.jsScrollintoview(Last_Month);
		Last_Month.click();
		Reporter.log("<B><font color = 'orange'> Step2 -</font> Clicked On Domain Registration Date  Last month Icon");

		helper.waitFor(searchButton);
		helper.highLightElement(driver, searchButton);
		helper.Scrollintoview(searchButton);
		searchButton.click();
		Reporter.log("<B><font color = 'orange'> Step3 -</font> Clicked On search Button Icon");
		helper.waitForPageToLoad();

		String totaladscount=totaladscount_ad.getText();
		System.out.println("Totaladscount: "+totaladscount);
		Reporter.log("<B><font color = 'orange'> Step4 -</font>  Total Ad Count is :"+ totaladscount);
		
		try
		{
		String lastSeenDate_today1=null;
		Reporter.log(" ");
		Reporter.log("<B><font color ='red'> 1 Ad -</font>  ");
		System.out.println("");
		System.out.println("1 Ads");
		String  imageDate1= date1.getText();
		Reporter.log("<B><font color = 'blue'> ==> -</font> Ads Caputure Image Date :");
		System.out.println("Ads Caputure Image Date");
		Reporter.log("<B><font color = 'blue'> ==> -</font> Image Date is :"+imageDate1);
		System.out.println("Current Date: "+imageDate1);
	
		helper.waitFor(ShowAnalytics1);
		helper.highLightElement(driver, ShowAnalytics1);
		helper.Scrollintoview(ShowAnalytics1);
		String linkText1 = ShowAnalytics1.getAttribute("href");
		helper.getAdID(linkText1);
		ShowAnalytics1.click();
		Reporter.log("<B><font color = 'blue'> ==> -</font> Clicked On Show Analytics Icon");
		helper.waitForPageToLoad();
		
		Set<String> S1=driver.getWindowHandles();
	    Iterator<String>it1=S1.iterator();
	    String parent1=it1.next();
	    String child1=it1.next();
	    
	    driver.switchTo().window(child1);

	    helper.waitForPageToLoad();
	    helper.waitFor(lastSeen);
	    helper.highLightElement(driver, lastSeen);
	    helper.Scrollintoview(lastSeen);
	    lastSeenDate_today1 = lastSeen.getText();
	    helper.Scrollintoview(Domain_Rgsd_Date);
	    String DomainRgsdDate1=Domain_Rgsd_Date.getText();
	    Reporter.log("<B><font color = 'blue'> ==> -</font> Last_Seen_ AdDetails Page= " +  lastSeenDate_today1);
	    Reporter.log("<B><font color = 'blue'> ==> -</font> Domain_Rgsd_Date AdDetails Page= " +  DomainRgsdDate1);
	    System.out.println("lastSeenDate_today: "+lastSeenDate_today1);
	    System.out.println("Domain Rgsd Date: "+DomainRgsdDate1);   
	    driver.close();
	    driver.switchTo().window(parent1);
	    helper.getLastseenDate(lastSeenDate_today1, imageDate1);
	    }
	    catch(Exception e)
		{
	    	System.out.println("Image is not able: Oops! Looks like we don't have data for this search criteria yet.");

			Reporter.log("<B><font color = 'orange'> Step5 -</font> Image is not able: Oops! Looks like we don't have data for this search criteria yet.");
	    }

		try
		{
		String lastSeenDate_today2=null;
		Reporter.log(" ");
		Reporter.log("<B><font color ='red'> 2 Ad -</font>  ");
		System.out.println("");
		System.out.println("2 Ads");
		String  imageDate2= date2.getText();
		Reporter.log("<B><font color = 'blue'> ==> -</font> Ads Caputure Image Date :");
		System.out.println("Ads Caputure Image Date");
		Reporter.log("<B><font color = 'blue'> ==> -</font> Image Date is :"+imageDate2);
		System.out.println("Current Date: "+imageDate2);
	
		helper.waitFor(ShowAnalytics2);
		helper.highLightElement(driver, ShowAnalytics2);
		helper.Scrollintoview(ShowAnalytics2);
		String linkText2 = ShowAnalytics2.getAttribute("href");
		helper.getAdID(linkText2);
		ShowAnalytics2.click();
		Reporter.log("<B><font color = 'blue'> ==> -</font> Clicked On Show Analytics Icon");
		helper.waitForPageToLoad();
		
		Set<String> S2=driver.getWindowHandles();
	    Iterator<String>it2=S2.iterator();
	    String parent2=it2.next();
	    String child2=it2.next();
	    
	    driver.switchTo().window(child2);

	    helper.waitForPageToLoad();
	    helper.waitFor(lastSeen);
	    helper.highLightElement(driver, lastSeen);
	    helper.Scrollintoview(lastSeen);
	    lastSeenDate_today2 = lastSeen.getText();
	    helper.Scrollintoview(Domain_Rgsd_Date);
	    String DomainRgsdDate2=Domain_Rgsd_Date.getText();
	    Reporter.log("<B><font color = 'blue'> ==> -</font> Last_Seen_ AdDetails Page= " +  lastSeenDate_today2);
	    Reporter.log("<B><font color = 'blue'> ==> -</font> Domain_Rgsd_Date AdDetails Page= " +  DomainRgsdDate2);
	    System.out.println("lastSeenDate_today: "+lastSeenDate_today2);
	    System.out.println("Domain Rgsd Date: "+DomainRgsdDate2);   
	    driver.close();
	    driver.switchTo().window(parent2);
	    helper.getLastseenDate(lastSeenDate_today2, imageDate2);
	    }
	    catch(Exception e)
		{
	    	System.out.println("Image is not able: Oops! Looks like we don't have data for this search criteria yet.");

			Reporter.log("<B><font color = 'orange'> Step5 -</font> Image is not able: Oops! Looks like we don't have data for this search criteria yet.");
	    }

		try
		{
		String lastSeenDate_today3=null;
		Reporter.log(" ");
		Reporter.log("<B><font color ='red'> 3 Ad -</font>  ");
		System.out.println("");
		System.out.println("3 Ads");
	
		String  imageDate3= date3.getText();
		Reporter.log("<B><font color = 'blue'> ==> -</font> Ads Caputure Image Date :");
		Reporter.log("<B><font color = 'blue'> ==> -</font> Image Date is :"+imageDate3);
		System.out.println("Current Date: "+imageDate3);
	
		helper.waitFor(ShowAnalytics3);
		helper.highLightElement(driver, ShowAnalytics3);
		helper.Scrollintoview(ShowAnalytics3);
		String linkText3 = ShowAnalytics3.getAttribute("href");
		helper.getAdID(linkText3);
		ShowAnalytics3.click();
		Reporter.log("<B><font color = 'blue'> ==> -</font> Clicked On Show Analytics Icon");
		helper.waitForPageToLoad();
		
		Set<String> S3=driver.getWindowHandles();
	    Iterator<String>it3=S3.iterator();
	    String parent3=it3.next();
	    String child3=it3.next();
	    
	    driver.switchTo().window(child3);

	    helper.waitForPageToLoad();
	    helper.waitFor(lastSeen);
	    helper.highLightElement(driver, lastSeen);
	    helper.Scrollintoview(lastSeen);
	    lastSeenDate_today3 = lastSeen.getText();
	    helper.Scrollintoview(Domain_Rgsd_Date);
	    String DomainRgsdDate3=Domain_Rgsd_Date.getText();
	    Reporter.log("<B><font color = 'blue'> ==> -</font> Last_Seen_ AdDetails Page= " +  lastSeenDate_today3);
	    Reporter.log("<B><font color = 'blue'> ==> -</font> Domain_Rgsd_Date AdDetails Page= " +  DomainRgsdDate3);
	    System.out.println("lastSeenDate_today: "+lastSeenDate_today3);
	    System.out.println("Domain Rgsd Date: "+DomainRgsdDate3);   
	    driver.close();
	    driver.switchTo().window(parent3);
	    helper.getLastseenDate(lastSeenDate_today3, imageDate3);
	    }
	    catch(Exception e)
		{
	    	System.out.println("Image is not able: Oops! Looks like we don't have data for this search criteria yet.");

			Reporter.log("<B><font color = 'orange'> Step5 -</font> Image is not able: Oops! Looks like we don't have data for this search criteria yet.");
	    }
		
		try
		{
		String lastSeenDate_today4=null;
		Reporter.log(" ");
		Reporter.log("<B><font color ='red'> 4 Ad -</font>  ");
		System.out.println("");
		System.out.println("4 Ads");
		
		String  imageDate4= date4.getText();
		Reporter.log("<B><font color = 'blue'> ==> -</font> Ads Caputure Image Date :");
		System.out.println("Ads Caputure Image Date");
		Reporter.log("<B><font color = 'blue'> ==> -</font> Image Date is :"+imageDate4);
		System.out.println("Current Date: "+imageDate4);
	
		helper.waitFor(ShowAnalytics4);
		helper.highLightElement(driver, ShowAnalytics4);
		helper.Scrollintoview(ShowAnalytics4);
		String linkText4 = ShowAnalytics4.getAttribute("href");
		helper.getAdID(linkText4);
		ShowAnalytics4.click();
		Reporter.log("<B><font color = 'blue'> ==> -</font> Clicked On Show Analytics Icon");
		helper.waitForPageToLoad();
		
		Set<String> S4=driver.getWindowHandles();
	    Iterator<String>it4=S4.iterator();
	    String parent4=it4.next();
	    String child4=it4.next();
	    
	    driver.switchTo().window(child4);

	    helper.waitForPageToLoad();
	    helper.waitFor(lastSeen);
	    helper.highLightElement(driver, lastSeen);
	    helper.Scrollintoview(lastSeen);
	    lastSeenDate_today4 = lastSeen.getText();
	    helper.Scrollintoview(Domain_Rgsd_Date);
	    String DomainRgsdDate4=Domain_Rgsd_Date.getText();
	    Reporter.log("<B><font color = 'blue'> ==> -</font> Last_Seen_ AdDetails Page= " +  lastSeenDate_today4);
	    Reporter.log("<B><font color = 'blue'> ==> -</font> Domain_Rgsd_Date AdDetails Page= " +  DomainRgsdDate4);
	    System.out.println("lastSeenDate_today: "+lastSeenDate_today4);
	    System.out.println("Domain Rgsd Date: "+DomainRgsdDate4);   
	    driver.close();
	    driver.switchTo().window(parent4);
	    helper.getLastseenDate(lastSeenDate_today4, imageDate4);
	    }
	    catch(Exception e)
		{
	    	System.out.println("Image is not able: Oops! Looks like we don't have data for this search criteria yet.");

			Reporter.log("<B><font color = 'orange'> Step5 -</font> Image is not able: Oops! Looks like we don't have data for this search criteria yet.");
		}
			try
		{
		String lastSeenDate_today5=null;
		Reporter.log(" ");
		Reporter.log("<B><font color ='red'> 5 Ad -</font>  ");
		System.out.println("");
		System.out.println("5 Ads");
		
		String  imageDate5= date5.getText();
		Reporter.log("<B><font color = 'blue'> ==> -</font> Ads Caputure Image Date :");
		System.out.println("Ads Caputure Image Date");
		Reporter.log("<B><font color = 'blue'> ==> -</font> Image Date is :"+imageDate5);
		System.out.println("Current Date: "+imageDate5);
	
		helper.waitFor(ShowAnalytics5);
		helper.highLightElement(driver, ShowAnalytics5);
		helper.Scrollintoview(ShowAnalytics5);
		String linkText5 = ShowAnalytics5.getAttribute("href");
		helper.getAdID(linkText5);
		ShowAnalytics5.click();
		Reporter.log("<B><font color = 'blue'> ==> -</font> Clicked On Show Analytics Icon");
		helper.waitForPageToLoad();
		
		Set<String> S5=driver.getWindowHandles();
	    Iterator<String>it5=S5.iterator();
	    String parent5=it5.next();
	    String child5=it5.next();
	    
	    driver.switchTo().window(child5);

	    helper.waitForPageToLoad();
	    helper.waitFor(lastSeen);
	    helper.highLightElement(driver, lastSeen);
	    helper.Scrollintoview(lastSeen);
	    lastSeenDate_today5 = lastSeen.getText();
	    helper.Scrollintoview(Domain_Rgsd_Date);
	    String DomainRgsdDate5=Domain_Rgsd_Date.getText();
	    Reporter.log("<B><font color = 'blue'> ==> -</font> Last_Seen_ AdDetails Page= " +  lastSeenDate_today5);
	    Reporter.log("<B><font color = 'blue'> ==> -</font> Domain_Rgsd_Date AdDetails Page= " +  DomainRgsdDate5);
	    System.out.println("lastSeenDate_today: "+lastSeenDate_today5);
	    System.out.println("Domain Rgsd Date: "+DomainRgsdDate5);   
	    driver.close();
	    driver.switchTo().window(parent5);
	    helper.getLastseenDate(lastSeenDate_today5, imageDate5);
	    }
	    catch(Exception e1)
		{
	    	System.out.println("Image is not able: Oops! Looks like we don't have data for this search criteria yet.");

			Reporter.log("<B><font color = 'orange'> Step5 -</font> Image is not able: Oops! Looks like we don't have data for this search criteria yet.");
	    }
		
		try
		{
		String lastSeenDate_today6=null;
		Reporter.log(" ");
		Reporter.log("<B><font color ='red'> 6 Ad -</font>  ");
		System.out.println("");
		System.out.println("6 Ads");
		
		String  imageDate6= date6.getText();
		Reporter.log("<B><font color = 'blue'> ==> -</font> Ads Caputure Image Date :");
		System.out.println("Ads Caputure Image Date");
		Reporter.log("<B><font color = 'blue'> ==> -</font> Image Date is :"+imageDate6);
		System.out.println("Current Date: "+imageDate6);
	
		helper.waitFor(ShowAnalytics6);
		helper.highLightElement(driver, ShowAnalytics6);
		helper.Scrollintoview(ShowAnalytics6);
		String linkText6 = ShowAnalytics6.getAttribute("href");
		helper.getAdID(linkText6);
		ShowAnalytics6.click();
		Reporter.log("<B><font color = 'blue'> ==> -</font> Clicked On Show Analytics Icon");
		helper.waitForPageToLoad();
		
		Set<String> S6=driver.getWindowHandles();
	    Iterator<String>it6=S6.iterator();
	    String parent6=it6.next();
	    String child6=it6.next();
	    
	    driver.switchTo().window(child6);

	    helper.waitForPageToLoad();
	    helper.waitFor(lastSeen);
	    helper.highLightElement(driver, lastSeen);
	    helper.Scrollintoview(lastSeen);
	    lastSeenDate_today6 = lastSeen.getText();
	    helper.Scrollintoview(Domain_Rgsd_Date);
	    String DomainRgsdDate6=Domain_Rgsd_Date.getText();
	    Reporter.log("<B><font color = 'blue'> ==> -</font> Last_Seen_ AdDetails Page= " +  lastSeenDate_today6);
	    Reporter.log("<B><font color = 'blue'> ==> -</font> Domain_Rgsd_Date AdDetails Page= " +  DomainRgsdDate6);
	    System.out.println("lastSeenDate_today: "+lastSeenDate_today6);
	    System.out.println("Domain Rgsd Date: "+DomainRgsdDate6);   
	    driver.close();
	    driver.switchTo().window(parent6);
	    helper.getLastseenDate(lastSeenDate_today6, imageDate6);
	    }
	    catch(Exception e1)
		{
	    	System.out.println("Image is not able: Oops! Looks like we don't have data for this search criteria yet.");

			Reporter.log("<B><font color = 'orange'> Step5 -</font> Image is not able: Oops! Looks like we don't have data for this search criteria yet.");
	    }
		
		try
		{
		String lastSeenDate_today7=null;
		Reporter.log(" ");
		Reporter.log("<B><font color ='red'> 7 Ad -</font>  ");
		System.out.println("");
		System.out.println("7 Ads");

		String  imageDate7= date7.getText();
		Reporter.log("<B><font color = 'blue'> ==> -</font> Ads Caputure Image Date :");
		System.out.println("Ads Caputure Image Date");
		Reporter.log("<B><font color = 'blue'> ==> -</font> Image Date is :"+imageDate7);
		System.out.println("Current Date: "+imageDate7);
	
		helper.waitFor(ShowAnalytics7);
		helper.highLightElement(driver, ShowAnalytics7);
		helper.Scrollintoview(ShowAnalytics7);
		String linkText7 = ShowAnalytics7.getAttribute("href");
		helper.getAdID(linkText7);
		ShowAnalytics7.click();
		Reporter.log("<B><font color = 'blue'> ==> -</font> Clicked On Show Analytics Icon");
		helper.waitForPageToLoad();
		
		Set<String> S7=driver.getWindowHandles();
	    Iterator<String>it7=S7.iterator();
	    String parent7=it7.next();
	    String child7=it7.next();
	    
	    driver.switchTo().window(child7);

	    helper.waitForPageToLoad();
	    helper.waitFor(lastSeen);
	    helper.highLightElement(driver, lastSeen);
	    helper.Scrollintoview(lastSeen);
	    lastSeenDate_today7 = lastSeen.getText();
	    helper.Scrollintoview(Domain_Rgsd_Date);
	    String DomainRgsdDate7=Domain_Rgsd_Date.getText();
	    Reporter.log("<B><font color = 'blue'> ==> -</font> Last_Seen_ AdDetails Page= " +  lastSeenDate_today7);
	    Reporter.log("<B><font color = 'blue'> ==> -</font> Domain_Rgsd_Date AdDetails Page= " +  DomainRgsdDate7);
	    System.out.println("lastSeenDate_today: "+lastSeenDate_today7);
	    System.out.println("Domain Rgsd Date: "+DomainRgsdDate7);   
	    driver.close();
	    driver.switchTo().window(parent7);
	    helper.getLastseenDate(lastSeenDate_today7, imageDate7);
	    }
	    catch(Exception e1)
		{
	    	System.out.println("Image is not able: Oops! Looks like we don't have data for this search criteria yet.");

			Reporter.log("<B><font color = 'orange'> Step5 -</font> Image is not able: Oops! Looks like we don't have data for this search criteria yet.");
	    }
		
		try
		{
		String lastSeenDate_today8=null;
		Reporter.log(" ");
		Reporter.log("<B><font color ='red'> 8 Ad -</font>  ");
		System.out.println("");
		System.out.println("8 Ads");

		String  imageDate8= date8.getText();
		Reporter.log("<B><font color = 'blue'> ==> -</font> Ads Caputure Image Date :");
		System.out.println("Ads Caputure Image Date");
		Reporter.log("<B><font color = 'blue'> ==> -</font> Image Date is :"+imageDate8);
		System.out.println("Current Date: "+imageDate8);
	
		helper.waitFor(ShowAnalytics8);
		helper.highLightElement(driver, ShowAnalytics8);
		helper.Scrollintoview(ShowAnalytics8);
		String linkText8 = ShowAnalytics8.getAttribute("href");
		helper.getAdID(linkText8);
		ShowAnalytics8.click();
		Reporter.log("<B><font color = 'blue'> ==> -</font> Clicked On Show Analytics Icon");
		helper.waitForPageToLoad();
		
		Set<String> S8=driver.getWindowHandles();
	    Iterator<String>it8=S8.iterator();
	    String parent8=it8.next();
	    String child8=it8.next();
	    
	    driver.switchTo().window(child8);

	    helper.waitForPageToLoad();
	    helper.waitFor(lastSeen);
	    helper.highLightElement(driver, lastSeen);
	    helper.Scrollintoview(lastSeen);
	    lastSeenDate_today8 = lastSeen.getText();
	    helper.Scrollintoview(Domain_Rgsd_Date);
	    String DomainRgsdDate8=Domain_Rgsd_Date.getText();
	    Reporter.log("<B><font color = 'blue'> ==> -</font> Last_Seen_ AdDetails Page= " +  lastSeenDate_today8);
	    Reporter.log("<B><font color = 'blue'> ==> -</font> Domain_Rgsd_Date AdDetails Page= " +  DomainRgsdDate8);
	    System.out.println("lastSeenDate_today: "+lastSeenDate_today8);
	    System.out.println("Domain Rgsd Date: "+DomainRgsdDate8);   
	    driver.close();
	    driver.switchTo().window(parent8);
	    helper.getLastseenDate(lastSeenDate_today8, imageDate8);
	    }
	    catch(Exception e1)
		{
	    	System.out.println("Image is not able: Oops! Looks like we don't have data for this search criteria yet.");

			Reporter.log("<B><font color = 'orange'> Step5 -</font> Image is not able: Oops! Looks like we don't have data for this search criteria yet.");
	    }
		
		try
		{
		String lastSeenDate_today9=null;
		Reporter.log(" ");
		Reporter.log("<B><font color ='red'> 9 Ad -</font>  ");
		System.out.println("");
		System.out.println("9 Ads");

		String  imageDate9= date9.getText();
		Reporter.log("<B><font color = 'blue'> ==> -</font> Ads Caputure Image Date :");
		System.out.println("Ads Caputure Image Date");
		Reporter.log("<B><font color = 'blue'> ==> -</font> Image Date is :"+imageDate9);
		System.out.println("Current Date: "+imageDate9);
	
		helper.waitFor(ShowAnalytics9);
		helper.highLightElement(driver, ShowAnalytics9);
		helper.Scrollintoview(ShowAnalytics9);
		String linkText9 = ShowAnalytics9.getAttribute("href");
		helper.getAdID(linkText9);
		ShowAnalytics9.click();
		Reporter.log("<B><font color = 'blue'> ==> -</font> Clicked On Show Analytics Icon");
		helper.waitForPageToLoad();
		
		Set<String> S9=driver.getWindowHandles();
	    Iterator<String>it9=S9.iterator();
	    String parent9=it9.next();
	    String child9=it9.next();
	    
	    driver.switchTo().window(child9);

	    helper.waitForPageToLoad();
	    helper.waitFor(lastSeen);
	    helper.highLightElement(driver, lastSeen);
	    helper.Scrollintoview(lastSeen);
	    lastSeenDate_today9 = lastSeen.getText();
	    helper.Scrollintoview(Domain_Rgsd_Date);
	    String DomainRgsdDate9=Domain_Rgsd_Date.getText();
	    Reporter.log("<B><font color = 'blue'> ==> -</font> Last_Seen_ AdDetails Page= " +  lastSeenDate_today9);
	    Reporter.log("<B><font color = 'blue'> ==> -</font> Domain_Rgsd_Date AdDetails Page= " +  DomainRgsdDate9);
	    System.out.println("lastSeenDate_today: "+lastSeenDate_today9);
	    System.out.println("Domain Rgsd Date: "+DomainRgsdDate9);   
	    driver.close();
	    driver.switchTo().window(parent9);
	    helper.getLastseenDate(lastSeenDate_today9, imageDate9);
	    }
	    catch(Exception e1)
		{
	    	System.out.println("Image is not able: Oops! Looks like we don't have data for this search criteria yet.");

	    	Reporter.log("<B><font color = 'orange'> Step5 -</font> Image is not able: Oops! Looks like we don't have data for this search criteria yet.");
	    }
		
		try
		{
		String lastSeenDate_today10=null;
		Reporter.log(" ");
		Reporter.log("<B><font color ='red'> 10 Ad -</font>  ");
		System.out.println("");
		System.out.println("10 Ads");
	
		String  imageDate10= date10.getText();
		Reporter.log("<B><font color = 'blue'> ==> -</font> Ads Caputure Image Date :");
		System.out.println("Ads Caputure Image Date");
		Reporter.log("<B><font color = 'blue'> ==> -</font> Image Date is :"+imageDate10);
		System.out.println("Current Date: "+imageDate10);
	
		helper.waitFor(ShowAnalytics10);
		helper.highLightElement(driver, ShowAnalytics10);
		helper.Scrollintoview(ShowAnalytics10);
		String linkText10 = ShowAnalytics10.getAttribute("href");
		helper.getAdID(linkText10);
		ShowAnalytics10.click();
		Reporter.log("<B><font color = 'blue'> ==> -</font> Clicked On Show Analytics Icon");
		helper.waitForPageToLoad();
		
		Set<String> S10=driver.getWindowHandles();
	    Iterator<String>it10=S10.iterator();
	    String parent10=it10.next();
	    String child10=it10.next();
	    
	    driver.switchTo().window(child10);

	    helper.waitForPageToLoad();
	    helper.waitFor(lastSeen);
	    helper.highLightElement(driver, lastSeen);
	    helper.Scrollintoview(lastSeen);
	    lastSeenDate_today10 = lastSeen.getText();
	    helper.Scrollintoview(Domain_Rgsd_Date);
	    String DomainRgsdDate10=Domain_Rgsd_Date.getText();
	    Reporter.log("<B><font color = 'blue'> ==> -</font> Last_Seen_ AdDetails Page= " +  lastSeenDate_today10);
	    Reporter.log("<B><font color = 'blue'> ==> -</font> Domain_Rgsd_Date AdDetails Page= " +  DomainRgsdDate10);
	    System.out.println("lastSeenDate_today: "+lastSeenDate_today10);
	    System.out.println("Domain Rgsd Date: "+DomainRgsdDate10);   
	    driver.close();
	    driver.switchTo().window(parent10);
	    helper.getLastseenDate(lastSeenDate_today10, imageDate10);
	    }
	    catch(Exception e1)
		{
	    	System.out.println("Image is not able: Oops! Looks like we don't have data for this search criteria yet.");

			Reporter.log("<B><font color = 'orange'> Step5 -</font> Image is not able: Oops! Looks like we don't have data for this search criteria yet.");
	    }
		
		try
		{
		String lastSeenDate_today11=null;
		Reporter.log(" ");
		Reporter.log("<B><font color ='red'> 11 Ad -</font>  ");
		System.out.println("");
		System.out.println("11 Ads");

		String  imageDate11= date11.getText();
		Reporter.log("<B><font color = 'blue'> ==> -</font> Ads Caputure Image Date :");
		System.out.println("Ads Caputure Image Date");
		Reporter.log("<B><font color = 'blue'> ==> -</font> Image Date is :"+imageDate11);
		System.out.println("Current Date: "+imageDate11);
	
		helper.waitFor(ShowAnalytics11);
		helper.highLightElement(driver, ShowAnalytics11);
		helper.Scrollintoview(ShowAnalytics11);
		String linkText11 = ShowAnalytics11.getAttribute("href");
		helper.getAdID(linkText11);
		ShowAnalytics11.click();
		Reporter.log("<B><font color = 'blue'> ==> -</font> Clicked On Show Analytics Icon");
		helper.waitForPageToLoad();
		
		Set<String> S11=driver.getWindowHandles();
	    Iterator<String>it11=S11.iterator();
	    String parent11=it11.next();
	    String child11=it11.next();
	    
	    driver.switchTo().window(child11);

	    helper.waitForPageToLoad();
	    helper.waitFor(lastSeen);
	    helper.highLightElement(driver, lastSeen);
	    helper.Scrollintoview(lastSeen);
	    lastSeenDate_today11 = lastSeen.getText();
	    helper.Scrollintoview(Domain_Rgsd_Date);
	    String DomainRgsdDate11=Domain_Rgsd_Date.getText();
	    Reporter.log("<B><font color = 'blue'> ==> -</font> Last_Seen_ AdDetails Page= " +  lastSeenDate_today11);
	    Reporter.log("<B><font color = 'blue'> ==> -</font> Domain_Rgsd_Date AdDetails Page= " +  DomainRgsdDate11);
	    System.out.println("lastSeenDate_today: "+lastSeenDate_today11);
	    System.out.println("Domain Rgsd Date: "+DomainRgsdDate11);   
	    driver.close();
	    driver.switchTo().window(parent11);
	    helper.getLastseenDate(lastSeenDate_today11, imageDate11);
	    }
	    catch(Exception e1)
		{
	    	System.out.println("Image is not able: Oops! Looks like we don't have data for this search criteria yet.");

			Reporter.log("<B><font color = 'orange'> Step5 -</font> Image is not able: Oops! Looks like we don't have data for this search criteria yet.");
	    }
		
		
		try
		{
		String lastSeenDate_today12=null;
		Reporter.log(" ");
		Reporter.log("<B><font color ='red'> 12 Ad -</font> ");
		System.out.println("");
		System.out.println("12 Ads");
		String  imageDate12= date12.getText();
		Reporter.log("<B><font color = 'blue'> ==> -</font> Ads Caputure Image Date :");
		System.out.println("Ads Caputure Image Date");
		Reporter.log("<B><font color = 'blue'> ==> -</font> Image Date is :"+imageDate12);
		System.out.println("Current Date: "+imageDate12);
	
		helper.waitFor(ShowAnalytics12);
		helper.highLightElement(driver, ShowAnalytics12);
		helper.Scrollintoview(ShowAnalytics12);
		String linkText12 = ShowAnalytics12.getAttribute("href");
		helper.getAdID(linkText12);
		ShowAnalytics12.click();
		Reporter.log("<B><font color = 'blue'> ==> -</font> Clicked On Show Analytics Icon");
		helper.waitForPageToLoad();
		
		Set<String> S12=driver.getWindowHandles();
	    Iterator<String>it12=S12.iterator();
	    String parent12=it12.next();
	    String child12=it12.next();
	    
	    driver.switchTo().window(child12);

	    helper.waitForPageToLoad();
	    helper.waitFor(lastSeen);
	    helper.highLightElement(driver, lastSeen);
	    helper.Scrollintoview(lastSeen);
	    lastSeenDate_today12 = lastSeen.getText();
	    helper.Scrollintoview(Domain_Rgsd_Date);
	    String DomainRgsdDate12=Domain_Rgsd_Date.getText();
	    Reporter.log("<B><font color = 'blue'> ==> -</font> Last_Seen_ AdDetails Page= " +  lastSeenDate_today12);
	    Reporter.log("<B><font color = 'blue'> ==> -</font> Domain_Rgsd_Date AdDetails Page= " +  DomainRgsdDate12);
	    System.out.println("lastSeenDate_today: "+lastSeenDate_today12);
	    System.out.println("Domain Rgsd Date: "+DomainRgsdDate12);   
	    driver.close();
	    driver.switchTo().window(parent12);
	    helper.getLastseenDate(lastSeenDate_today12, imageDate12);
	    }
	    catch(Exception e1)
		{
	    	System.out.println("Image is not able: Oops! Looks like we don't have data for this search criteria yet.");

			Reporter.log("<B><font color = 'orange'> Step5 -</font> Image is not able: Oops! Looks like we don't have data for this search criteria yet.");
	    }
		
		
		try
		{
		String lastSeenDate_today13=null;
		Reporter.log(" ");
		Reporter.log("<B><font color ='red'> 13 Ad -</font> ");
		System.out.println("");
		System.out.println("13 Ads");

		String  imageDate13= date13.getText();
		Reporter.log("<B><font color = 'blue'> ==> -</font> Ads Caputure Image Date :");
		System.out.println("Ads Caputure Image Date");
		Reporter.log("<B><font color = 'blue'> ==> -</font> Image Date is :"+imageDate13);
		System.out.println("Current Date: "+imageDate13);
	
		helper.waitFor(ShowAnalytics13);
		helper.highLightElement(driver, ShowAnalytics13);
		helper.Scrollintoview(ShowAnalytics13);
		String linkText13 = ShowAnalytics13.getAttribute("href");
		helper.getAdID(linkText13);
		ShowAnalytics13.click();
		Reporter.log("<B><font color = 'blue'> ==> -</font> Clicked On Show Analytics Icon");
		helper.waitForPageToLoad();
		
		Set<String> S13=driver.getWindowHandles();
	    Iterator<String>it13=S13.iterator();
	    String parent13=it13.next();
	    String child13=it13.next();
	    
	    driver.switchTo().window(child13);

	    helper.waitForPageToLoad();
	    helper.waitFor(lastSeen);
	    helper.highLightElement(driver, lastSeen);
	    helper.Scrollintoview(lastSeen);
	    lastSeenDate_today13 = lastSeen.getText();
	    helper.Scrollintoview(Domain_Rgsd_Date);
	    String DomainRgsdDate13=Domain_Rgsd_Date.getText();
	    Reporter.log("<B><font color = 'blue'> ==> -</font> Last_Seen_ AdDetails Page= " +  lastSeenDate_today13);
	    Reporter.log("<B><font color = 'blue'> ==> -</font> Domain_Rgsd_Date AdDetails Page= " +  DomainRgsdDate13);
	    System.out.println("lastSeenDate_today: "+lastSeenDate_today13);
	    System.out.println("Domain Rgsd Date: "+DomainRgsdDate13);   
	    driver.close();
	    driver.switchTo().window(parent13);
	    helper.getLastseenDate(lastSeenDate_today13, imageDate13);
	    }
	    catch(Exception e1)
		{
	    	System.out.println("Image is not able: Oops! Looks like we don't have data for this search criteria yet.");

			Reporter.log("<B><font color = 'orange'> Step5 -</font> Image is not able: Oops! Looks like we don't have data for this search criteria yet.");
	    }
		
		try
		{
		String lastSeenDate_today14=null;
		Reporter.log(" ");
		Reporter.log("<B><font color ='red'> 14 Ad -</font> ");
		System.out.println("");
		System.out.println("14 Ads");
	
		String  imageDate14= date14.getText();
		Reporter.log("<B><font color = 'blue'> ==> -</font> Ads Caputure Image Date :");
		System.out.println("Ads Caputure Image Date");
		Reporter.log("<B><font color = 'blue'> ==> -</font> Image Date is :"+imageDate14);
		System.out.println("Current Date: "+imageDate14);
	
		helper.waitFor(ShowAnalytics14);
		helper.highLightElement(driver, ShowAnalytics14);
		helper.Scrollintoview(ShowAnalytics14);
		String linkText14 = ShowAnalytics14.getAttribute("href");
		helper.getAdID(linkText14);
		ShowAnalytics14.click();
		Reporter.log("<B><font color = 'blue'> ==> -</font> Clicked On Show Analytics Icon");
		helper.waitForPageToLoad();
		
		Set<String> S14=driver.getWindowHandles();
	    Iterator<String>it14=S14.iterator();
	    String parent14=it14.next();
	    String child14=it14.next();
	    
	    driver.switchTo().window(child14);

	    helper.waitForPageToLoad();
	    helper.waitFor(lastSeen);
	    helper.highLightElement(driver, lastSeen);
	    helper.Scrollintoview(lastSeen);
	    lastSeenDate_today14 = lastSeen.getText();
	    helper.Scrollintoview(Domain_Rgsd_Date);
	    String DomainRgsdDate14=Domain_Rgsd_Date.getText();
	    Reporter.log("<B><font color = 'blue'> ==> -</font> Last_Seen_ AdDetails Page= " +  lastSeenDate_today14);
	    Reporter.log("<B><font color = 'blue'> ==> -</font> Domain_Rgsd_Date AdDetails Page= " +  DomainRgsdDate14);
	    System.out.println("lastSeenDate_today: "+lastSeenDate_today14);
	    System.out.println("Domain Rgsd Date: "+DomainRgsdDate14);   
	    driver.close();
	    driver.switchTo().window(parent14);
	    helper.getLastseenDate(lastSeenDate_today14, imageDate14);
	    }
	    catch(Exception e1)
		{
	    	System.out.println("Image is not able: Oops! Looks like we don't have data for this search criteria yet.");

			Reporter.log("<B><font color = 'orange'> Step5 -</font> Image is not able: Oops! Looks like we don't have data for this search criteria yet.");
	    }
		
		try
		{
		String lastSeenDate_today15=null;
		Reporter.log(" ");
		Reporter.log("<B><font color ='red'> 15 Ad -</font> ");
		System.out.println("");
		System.out.println("15 Ads");
	
		String  imageDate15= date15.getText();
		Reporter.log("<B><font color = 'blue'> ==> -</font> Ads Caputure Image Date :");
		System.out.println("Ads Caputure Image Date");
		Reporter.log("<B><font color = 'blue'> ==> -</font> Image Date is :"+imageDate15);
		System.out.println("Current Date: "+imageDate15);
	
		helper.waitFor(ShowAnalytics15);
		helper.highLightElement(driver, ShowAnalytics15);
		helper.Scrollintoview(ShowAnalytics15);
		String linkText15 = ShowAnalytics15.getAttribute("href");
		helper.getAdID(linkText15);
		ShowAnalytics15.click();
		Reporter.log("<B><font color = 'blue'> ==> -</font> Clicked On Show Analytics Icon");
		helper.waitForPageToLoad();
		
		Set<String> S15=driver.getWindowHandles();
	    Iterator<String>it15=S15.iterator();
	    String parent15=it15.next();
	    String child15=it15.next();
	    
	    driver.switchTo().window(child15);

	    helper.waitForPageToLoad();
	    helper.waitFor(lastSeen);
	    helper.highLightElement(driver, lastSeen);
	    helper.Scrollintoview(lastSeen);
	    lastSeenDate_today15 = lastSeen.getText();
	    helper.Scrollintoview(Domain_Rgsd_Date);
	    String DomainRgsdDate15=Domain_Rgsd_Date.getText();
	    Reporter.log("<B><font color = 'blue'> ==> -</font> Last_Seen_ AdDetails Page= " +  lastSeenDate_today15);
	    Reporter.log("<B><font color = 'blue'> ==> -</font> Domain_Rgsd_Date AdDetails Page= " +  DomainRgsdDate15);
	    System.out.println("lastSeenDate_today: "+lastSeenDate_today15);
	    System.out.println("Domain Rgsd Date: "+DomainRgsdDate15);   
	    driver.close();
	    driver.switchTo().window(parent15);
	    helper.getLastseenDate(lastSeenDate_today15, imageDate15);
	    }
	    catch(Exception e1)
		{
	    	System.out.println("Image is not able: Oops! Looks like we don't have data for this search criteria yet.");

			Reporter.log("<B><font color = 'orange'> Step5 -</font> Image is not able: Oops! Looks like we don't have data for this search criteria yet.");
	    }
	}
	
	
	public void DomainRegistrationDate_Custom_Range_Days() throws InterruptedException
	{
		helper.waitForPageToLoad();
		Reporter.log("      ");
		Reporter.log("<B><font color = 'green'> -ShortBy Newest -Ad Domain Registration Date Custom Range Step will Start from here </font> ");
		System.out.println();
		System.out.println("-ShortBy Newest -Ad Domain Registration Date -Custom Range");
		helper.waitFor(domainRegistrationfilter);
		helper.highLightElement(driver, domainRegistrationfilter);
		helper.jsScrollintoview(domainRegistrationfilter);
		domainRegistrationfilter.click();
		Reporter.log("<B><font color = 'orange'> Step1 -</font> Clicked On Ad Domain Registration Date filter Icon");

		helper.waitFor(Custom_Range);
		helper.highLightElement(driver, Custom_Range);
		helper.Scrollintoview(Custom_Range);
		Custom_Range.click();
		Reporter.log("<B><font color = 'orange'> Step2 -</font> Clicked On Domain Registration Date Custom Range Icon");
		
		
		helper.waitFor(Custom_Range_Next_Line);
		helper.highLightElement(driver, Custom_Range_Next_Line);
		helper.Scrollintoview(Custom_Range_Next_Line);
		Custom_Range_Next_Line.click();
		Custom_Range_Next_Line.click();

		
		helper.waitFor(adSeenBetween_Start_range1);
		helper.highLightElement(driver,adSeenBetween_Start_range1);
		helper.jsScrollintoview(adSeenBetween_Start_range1);
		adSeenBetween_Start_range1.click();
		Reporter.log("<B><font color = 'orange'> Step3 -</font> Clicked On Ad Seen Between Start Custom Range Icon");

		helper.waitFor(adSeenBetween_end_range2);
		helper.highLightElement(driver,adSeenBetween_end_range2);
		helper.jsScrollintoview(adSeenBetween_end_range2);
		helper.Scrollintoview(adSeenBetween_end_range2);
		adSeenBetween_end_range2.click();
		
		Reporter.log("<B><font color = 'orange'> Step4 -</font> Clicked On Ad Seen Between End Custom Range Icon:");
		
		
		
		helper.waitFor(searchButton);
		helper.highLightElement(driver, searchButton);
		helper.Scrollintoview(searchButton);
		searchButton.click();
		Reporter.log("<B><font color = 'orange'> Step3 -</font> Clicked On search Button Icon");
		helper.waitForPageToLoad();

		String totaladscount=totaladscount_ad.getText();
		System.out.println("Totaladscount: "+totaladscount);
		Reporter.log("<B><font color = 'orange'> Step4 -</font>  Total Ad Count is :"+ totaladscount);
		
		try
		{
		String lastSeenDate_today1=null;
		Reporter.log(" ");
		Reporter.log("<B><font color ='red'> 1 Ad -</font>  ");
		System.out.println("");
		System.out.println("1 Ads");
		String  imageDate1= date1.getText();
		Reporter.log("<B><font color = 'blue'> ==> -</font> Ads Caputure Image Date :");
		System.out.println("Ads Caputure Image Date");
		Reporter.log("<B><font color = 'blue'> ==> -</font> Image Date is :"+imageDate1);
		System.out.println("Current Date: "+imageDate1);
	
		helper.waitFor(ShowAnalytics1);
		helper.highLightElement(driver, ShowAnalytics1);
		helper.Scrollintoview(ShowAnalytics1);
		String linkText1 = ShowAnalytics1.getAttribute("href");
		helper.getAdID(linkText1);
		ShowAnalytics1.click();
		Reporter.log("<B><font color = 'blue'> ==> -</font> Clicked On Show Analytics Icon");
		helper.waitForPageToLoad();
		
		Set<String> S1=driver.getWindowHandles();
	    Iterator<String>it1=S1.iterator();
	    String parent1=it1.next();
	    String child1=it1.next();
	    
	    driver.switchTo().window(child1);

	    helper.waitForPageToLoad();
	    helper.waitFor(lastSeen);
	    helper.highLightElement(driver, lastSeen);
	    helper.Scrollintoview(lastSeen);
	    lastSeenDate_today1 = lastSeen.getText();
	    helper.Scrollintoview(Domain_Rgsd_Date);
	    String DomainRgsdDate1=Domain_Rgsd_Date.getText();
	    Reporter.log("<B><font color = 'blue'> ==> -</font> Last_Seen_ AdDetails Page= " +  lastSeenDate_today1);
	    Reporter.log("<B><font color = 'blue'> ==> -</font> Domain_Rgsd_Date AdDetails Page= " +  DomainRgsdDate1);
	    System.out.println("lastSeenDate_today: "+lastSeenDate_today1);
	    System.out.println("Domain Rgsd Date: "+DomainRgsdDate1);   
	    driver.close();
	    driver.switchTo().window(parent1);
	    helper.getLastseenDate(lastSeenDate_today1, imageDate1);
	    }
	    catch(Exception e)
		{
	    	System.out.println("Image is not able: Oops! Looks like we don't have data for this search criteria yet.");

			Reporter.log("<B><font color = 'orange'> Step5 -</font> Image is not able: Oops! Looks like we don't have data for this search criteria yet.");
	    }

		try
		{
		String lastSeenDate_today2=null;
		Reporter.log(" ");
		Reporter.log("<B><font color ='red'> 2 Ad -</font>  ");
		System.out.println("");
		System.out.println("2 Ads");
		String  imageDate2= date2.getText();
		Reporter.log("<B><font color = 'blue'> ==> -</font> Ads Caputure Image Date :");
		System.out.println("Ads Caputure Image Date");
		Reporter.log("<B><font color = 'blue'> ==> -</font> Image Date is :"+imageDate2);
		System.out.println("Current Date: "+imageDate2);
	
		helper.waitFor(ShowAnalytics2);
		helper.highLightElement(driver, ShowAnalytics2);
		helper.Scrollintoview(ShowAnalytics2);
		String linkText2 = ShowAnalytics2.getAttribute("href");
		helper.getAdID(linkText2);
		ShowAnalytics2.click();
		Reporter.log("<B><font color = 'blue'> ==> -</font> Clicked On Show Analytics Icon");
		helper.waitForPageToLoad();
		
		Set<String> S2=driver.getWindowHandles();
	    Iterator<String>it2=S2.iterator();
	    String parent2=it2.next();
	    String child2=it2.next();
	    
	    driver.switchTo().window(child2);

	    helper.waitForPageToLoad();
	    helper.waitFor(lastSeen);
	    helper.highLightElement(driver, lastSeen);
	    helper.Scrollintoview(lastSeen);
	    lastSeenDate_today2 = lastSeen.getText();
	    helper.Scrollintoview(Domain_Rgsd_Date);
	    String DomainRgsdDate2=Domain_Rgsd_Date.getText();
	    Reporter.log("<B><font color = 'blue'> ==> -</font> Last_Seen_ AdDetails Page= " +  lastSeenDate_today2);
	    Reporter.log("<B><font color = 'blue'> ==> -</font> Domain_Rgsd_Date AdDetails Page= " +  DomainRgsdDate2);
	    System.out.println("lastSeenDate_today: "+lastSeenDate_today2);
	    System.out.println("Domain Rgsd Date: "+DomainRgsdDate2);   
	    driver.close();
	    driver.switchTo().window(parent2);
	    helper.getLastseenDate(lastSeenDate_today2, imageDate2);
	    }
	    catch(Exception e)
		{
	    	System.out.println("Image is not able: Oops! Looks like we don't have data for this search criteria yet.");

			Reporter.log("<B><font color = 'orange'> Step5 -</font> Image is not able: Oops! Looks like we don't have data for this search criteria yet.");
	    }

		try
		{
		String lastSeenDate_today3=null;
		Reporter.log(" ");
		Reporter.log("<B><font color ='red'> 3 Ad -</font>  ");
		System.out.println("");
		System.out.println("3 Ads");
	
		String  imageDate3= date3.getText();
		Reporter.log("<B><font color = 'blue'> ==> -</font> Ads Caputure Image Date :");
		Reporter.log("<B><font color = 'blue'> ==> -</font> Image Date is :"+imageDate3);
		System.out.println("Current Date: "+imageDate3);
	
		helper.waitFor(ShowAnalytics3);
		helper.highLightElement(driver, ShowAnalytics3);
		helper.Scrollintoview(ShowAnalytics3);
		String linkText3 = ShowAnalytics3.getAttribute("href");
		helper.getAdID(linkText3);
		ShowAnalytics3.click();
		Reporter.log("<B><font color = 'blue'> ==> -</font> Clicked On Show Analytics Icon");
		helper.waitForPageToLoad();
		
		Set<String> S3=driver.getWindowHandles();
	    Iterator<String>it3=S3.iterator();
	    String parent3=it3.next();
	    String child3=it3.next();
	    
	    driver.switchTo().window(child3);

	    helper.waitForPageToLoad();
	    helper.waitFor(lastSeen);
	    helper.highLightElement(driver, lastSeen);
	    helper.Scrollintoview(lastSeen);
	    lastSeenDate_today3 = lastSeen.getText();
	    helper.Scrollintoview(Domain_Rgsd_Date);
	    String DomainRgsdDate3=Domain_Rgsd_Date.getText();
	    Reporter.log("<B><font color = 'blue'> ==> -</font> Last_Seen_ AdDetails Page= " +  lastSeenDate_today3);
	    Reporter.log("<B><font color = 'blue'> ==> -</font> Domain_Rgsd_Date AdDetails Page= " +  DomainRgsdDate3);
	    System.out.println("lastSeenDate_today: "+lastSeenDate_today3);
	    System.out.println("Domain Rgsd Date: "+DomainRgsdDate3);   
	    driver.close();
	    driver.switchTo().window(parent3);
	    helper.getLastseenDate(lastSeenDate_today3, imageDate3);
	    }
	    catch(Exception e)
		{
	    	System.out.println("Image is not able: Oops! Looks like we don't have data for this search criteria yet.");

			Reporter.log("<B><font color = 'orange'> Step5 -</font> Image is not able: Oops! Looks like we don't have data for this search criteria yet.");
	    }
		
		try
		{
		String lastSeenDate_today4=null;
		Reporter.log(" ");
		Reporter.log("<B><font color ='red'> 4 Ad -</font>  ");
		System.out.println("");
		System.out.println("4 Ads");
		
		String  imageDate4= date4.getText();
		Reporter.log("<B><font color = 'blue'> ==> -</font> Ads Caputure Image Date :");
		System.out.println("Ads Caputure Image Date");
		Reporter.log("<B><font color = 'blue'> ==> -</font> Image Date is :"+imageDate4);
		System.out.println("Current Date: "+imageDate4);
	
		helper.waitFor(ShowAnalytics4);
		helper.highLightElement(driver, ShowAnalytics4);
		helper.Scrollintoview(ShowAnalytics4);
		String linkText4 = ShowAnalytics4.getAttribute("href");
		helper.getAdID(linkText4);
		ShowAnalytics4.click();
		Reporter.log("<B><font color = 'blue'> ==> -</font> Clicked On Show Analytics Icon");
		helper.waitForPageToLoad();
		
		Set<String> S4=driver.getWindowHandles();
	    Iterator<String>it4=S4.iterator();
	    String parent4=it4.next();
	    String child4=it4.next();
	    
	    driver.switchTo().window(child4);

	    helper.waitForPageToLoad();
	    helper.waitFor(lastSeen);
	    helper.highLightElement(driver, lastSeen);
	    helper.Scrollintoview(lastSeen);
	    lastSeenDate_today4 = lastSeen.getText();
	    helper.Scrollintoview(Domain_Rgsd_Date);
	    String DomainRgsdDate4=Domain_Rgsd_Date.getText();
	    Reporter.log("<B><font color = 'blue'> ==> -</font> Last_Seen_ AdDetails Page= " +  lastSeenDate_today4);
	    Reporter.log("<B><font color = 'blue'> ==> -</font> Domain_Rgsd_Date AdDetails Page= " +  DomainRgsdDate4);
	    System.out.println("lastSeenDate_today: "+lastSeenDate_today4);
	    System.out.println("Domain Rgsd Date: "+DomainRgsdDate4);   
	    driver.close();
	    driver.switchTo().window(parent4);
	    helper.getLastseenDate(lastSeenDate_today4, imageDate4);
	    }
	    catch(Exception e)
		{
	    	System.out.println("Image is not able: Oops! Looks like we don't have data for this search criteria yet.");

			Reporter.log("<B><font color = 'orange'> Step5 -</font> Image is not able: Oops! Looks like we don't have data for this search criteria yet.");
		}
			try
		{
		String lastSeenDate_today5=null;
		Reporter.log(" ");
		Reporter.log("<B><font color ='red'> 5 Ad -</font>  ");
		System.out.println("");
		System.out.println("5 Ads");
		
		String  imageDate5= date5.getText();
		Reporter.log("<B><font color = 'blue'> ==> -</font> Ads Caputure Image Date :");
		System.out.println("Ads Caputure Image Date");
		Reporter.log("<B><font color = 'blue'> ==> -</font> Image Date is :"+imageDate5);
		System.out.println("Current Date: "+imageDate5);
	
		helper.waitFor(ShowAnalytics5);
		helper.highLightElement(driver, ShowAnalytics5);
		helper.Scrollintoview(ShowAnalytics5);
		String linkText5 = ShowAnalytics5.getAttribute("href");
		helper.getAdID(linkText5);
		ShowAnalytics5.click();
		Reporter.log("<B><font color = 'blue'> ==> -</font> Clicked On Show Analytics Icon");
		helper.waitForPageToLoad();
		
		Set<String> S5=driver.getWindowHandles();
	    Iterator<String>it5=S5.iterator();
	    String parent5=it5.next();
	    String child5=it5.next();
	    
	    driver.switchTo().window(child5);

	    helper.waitForPageToLoad();
	    helper.waitFor(lastSeen);
	    helper.highLightElement(driver, lastSeen);
	    helper.Scrollintoview(lastSeen);
	    lastSeenDate_today5 = lastSeen.getText();
	    helper.Scrollintoview(Domain_Rgsd_Date);
	    String DomainRgsdDate5=Domain_Rgsd_Date.getText();
	    Reporter.log("<B><font color = 'blue'> ==> -</font> Last_Seen_ AdDetails Page= " +  lastSeenDate_today5);
	    Reporter.log("<B><font color = 'blue'> ==> -</font> Domain_Rgsd_Date AdDetails Page= " +  DomainRgsdDate5);
	    System.out.println("lastSeenDate_today: "+lastSeenDate_today5);
	    System.out.println("Domain Rgsd Date: "+DomainRgsdDate5);   
	    driver.close();
	    driver.switchTo().window(parent5);
	    helper.getLastseenDate(lastSeenDate_today5, imageDate5);
	    }
	    catch(Exception e1)
		{
	    	System.out.println("Image is not able: Oops! Looks like we don't have data for this search criteria yet.");

			Reporter.log("<B><font color = 'orange'> Step5 -</font> Image is not able: Oops! Looks like we don't have data for this search criteria yet.");
	    }
		
		try
		{
		String lastSeenDate_today6=null;
		Reporter.log(" ");
		Reporter.log("<B><font color ='red'> 6 Ad -</font>  ");
		System.out.println("");
		System.out.println("6 Ads");
		
		String  imageDate6= date6.getText();
		Reporter.log("<B><font color = 'blue'> ==> -</font> Ads Caputure Image Date :");
		System.out.println("Ads Caputure Image Date");
		Reporter.log("<B><font color = 'blue'> ==> -</font> Image Date is :"+imageDate6);
		System.out.println("Current Date: "+imageDate6);
	
		helper.waitFor(ShowAnalytics6);
		helper.highLightElement(driver, ShowAnalytics6);
		helper.Scrollintoview(ShowAnalytics6);
		String linkText6 = ShowAnalytics6.getAttribute("href");
		helper.getAdID(linkText6);
		ShowAnalytics6.click();
		Reporter.log("<B><font color = 'blue'> ==> -</font> Clicked On Show Analytics Icon");
		helper.waitForPageToLoad();
		
		Set<String> S6=driver.getWindowHandles();
	    Iterator<String>it6=S6.iterator();
	    String parent6=it6.next();
	    String child6=it6.next();
	    
	    driver.switchTo().window(child6);

	    helper.waitForPageToLoad();
	    helper.waitFor(lastSeen);
	    helper.highLightElement(driver, lastSeen);
	    helper.Scrollintoview(lastSeen);
	    lastSeenDate_today6 = lastSeen.getText();
	    helper.Scrollintoview(Domain_Rgsd_Date);
	    String DomainRgsdDate6=Domain_Rgsd_Date.getText();
	    Reporter.log("<B><font color = 'blue'> ==> -</font> Last_Seen_ AdDetails Page= " +  lastSeenDate_today6);
	    Reporter.log("<B><font color = 'blue'> ==> -</font> Domain_Rgsd_Date AdDetails Page= " +  DomainRgsdDate6);
	    System.out.println("lastSeenDate_today: "+lastSeenDate_today6);
	    System.out.println("Domain Rgsd Date: "+DomainRgsdDate6);   
	    driver.close();
	    driver.switchTo().window(parent6);
	    helper.getLastseenDate(lastSeenDate_today6, imageDate6);
	    }
	    catch(Exception e1)
		{
	    	System.out.println("Image is not able: Oops! Looks like we don't have data for this search criteria yet.");

			Reporter.log("<B><font color = 'orange'> Step5 -</font> Image is not able: Oops! Looks like we don't have data for this search criteria yet.");
	    }
		
		try
		{
		String lastSeenDate_today7=null;
		Reporter.log(" ");
		Reporter.log("<B><font color ='red'> 7 Ad -</font>  ");
		System.out.println("");
		System.out.println("7 Ads");

		String  imageDate7= date7.getText();
		Reporter.log("<B><font color = 'blue'> ==> -</font> Ads Caputure Image Date :");
		System.out.println("Ads Caputure Image Date");
		Reporter.log("<B><font color = 'blue'> ==> -</font> Image Date is :"+imageDate7);
		System.out.println("Current Date: "+imageDate7);
	
		helper.waitFor(ShowAnalytics7);
		helper.highLightElement(driver, ShowAnalytics7);
		helper.Scrollintoview(ShowAnalytics7);
		String linkText7 = ShowAnalytics7.getAttribute("href");
		helper.getAdID(linkText7);
		ShowAnalytics7.click();
		Reporter.log("<B><font color = 'blue'> ==> -</font> Clicked On Show Analytics Icon");
		helper.waitForPageToLoad();
		
		Set<String> S7=driver.getWindowHandles();
	    Iterator<String>it7=S7.iterator();
	    String parent7=it7.next();
	    String child7=it7.next();
	    
	    driver.switchTo().window(child7);

	    helper.waitForPageToLoad();
	    helper.waitFor(lastSeen);
	    helper.highLightElement(driver, lastSeen);
	    helper.Scrollintoview(lastSeen);
	    lastSeenDate_today7 = lastSeen.getText();
	    helper.Scrollintoview(Domain_Rgsd_Date);
	    String DomainRgsdDate7=Domain_Rgsd_Date.getText();
	    Reporter.log("<B><font color = 'blue'> ==> -</font> Last_Seen_ AdDetails Page= " +  lastSeenDate_today7);
	    Reporter.log("<B><font color = 'blue'> ==> -</font> Domain_Rgsd_Date AdDetails Page= " +  DomainRgsdDate7);
	    System.out.println("lastSeenDate_today: "+lastSeenDate_today7);
	    System.out.println("Domain Rgsd Date: "+DomainRgsdDate7);   
	    driver.close();
	    driver.switchTo().window(parent7);
	    helper.getLastseenDate(lastSeenDate_today7, imageDate7);
	    }
	    catch(Exception e1)
		{
	    	System.out.println("Image is not able: Oops! Looks like we don't have data for this search criteria yet.");

			Reporter.log("<B><font color = 'orange'> Step5 -</font> Image is not able: Oops! Looks like we don't have data for this search criteria yet.");
	    }
		
		try
		{
		String lastSeenDate_today8=null;
		Reporter.log(" ");
		Reporter.log("<B><font color ='red'> 8 Ad -</font>  ");
		System.out.println("");
		System.out.println("8 Ads");

		String  imageDate8= date8.getText();
		Reporter.log("<B><font color = 'blue'> ==> -</font> Ads Caputure Image Date :");
		System.out.println("Ads Caputure Image Date");
		Reporter.log("<B><font color = 'blue'> ==> -</font> Image Date is :"+imageDate8);
		System.out.println("Current Date: "+imageDate8);
	
		helper.waitFor(ShowAnalytics8);
		helper.highLightElement(driver, ShowAnalytics8);
		helper.Scrollintoview(ShowAnalytics8);
		String linkText8 = ShowAnalytics8.getAttribute("href");
		helper.getAdID(linkText8);
		ShowAnalytics8.click();
		Reporter.log("<B><font color = 'blue'> ==> -</font> Clicked On Show Analytics Icon");
		helper.waitForPageToLoad();
		
		Set<String> S8=driver.getWindowHandles();
	    Iterator<String>it8=S8.iterator();
	    String parent8=it8.next();
	    String child8=it8.next();
	    
	    driver.switchTo().window(child8);

	    helper.waitForPageToLoad();
	    helper.waitFor(lastSeen);
	    helper.highLightElement(driver, lastSeen);
	    helper.Scrollintoview(lastSeen);
	    lastSeenDate_today8 = lastSeen.getText();
	    helper.Scrollintoview(Domain_Rgsd_Date);
	    String DomainRgsdDate8=Domain_Rgsd_Date.getText();
	    Reporter.log("<B><font color = 'blue'> ==> -</font> Last_Seen_ AdDetails Page= " +  lastSeenDate_today8);
	    Reporter.log("<B><font color = 'blue'> ==> -</font> Domain_Rgsd_Date AdDetails Page= " +  DomainRgsdDate8);
	    System.out.println("lastSeenDate_today: "+lastSeenDate_today8);
	    System.out.println("Domain Rgsd Date: "+DomainRgsdDate8);   
	    driver.close();
	    driver.switchTo().window(parent8);
	    helper.getLastseenDate(lastSeenDate_today8, imageDate8);
	    }
	    catch(Exception e1)
		{
	    	System.out.println("Image is not able: Oops! Looks like we don't have data for this search criteria yet.");

			Reporter.log("<B><font color = 'orange'> Step5 -</font> Image is not able: Oops! Looks like we don't have data for this search criteria yet.");
	    }
		
		try
		{
		String lastSeenDate_today9=null;
		Reporter.log(" ");
		Reporter.log("<B><font color ='red'> 9 Ad -</font>  ");
		System.out.println("");
		System.out.println("9 Ads");

		String  imageDate9= date9.getText();
		Reporter.log("<B><font color = 'blue'> ==> -</font> Ads Caputure Image Date :");
		System.out.println("Ads Caputure Image Date");
		Reporter.log("<B><font color = 'blue'> ==> -</font> Image Date is :"+imageDate9);
		System.out.println("Current Date: "+imageDate9);
	
		helper.waitFor(ShowAnalytics9);
		helper.highLightElement(driver, ShowAnalytics9);
		helper.Scrollintoview(ShowAnalytics9);
		String linkText9 = ShowAnalytics9.getAttribute("href");
		helper.getAdID(linkText9);
		ShowAnalytics9.click();
		Reporter.log("<B><font color = 'blue'> ==> -</font> Clicked On Show Analytics Icon");
		helper.waitForPageToLoad();
		
		Set<String> S9=driver.getWindowHandles();
	    Iterator<String>it9=S9.iterator();
	    String parent9=it9.next();
	    String child9=it9.next();
	    
	    driver.switchTo().window(child9);

	    helper.waitForPageToLoad();
	    helper.waitFor(lastSeen);
	    helper.highLightElement(driver, lastSeen);
	    helper.Scrollintoview(lastSeen);
	    lastSeenDate_today9 = lastSeen.getText();
	    helper.Scrollintoview(Domain_Rgsd_Date);
	    String DomainRgsdDate9=Domain_Rgsd_Date.getText();
	    Reporter.log("<B><font color = 'blue'> ==> -</font> Last_Seen_ AdDetails Page= " +  lastSeenDate_today9);
	    Reporter.log("<B><font color = 'blue'> ==> -</font> Domain_Rgsd_Date AdDetails Page= " +  DomainRgsdDate9);
	    System.out.println("lastSeenDate_today: "+lastSeenDate_today9);
	    System.out.println("Domain Rgsd Date: "+DomainRgsdDate9);   
	    driver.close();
	    driver.switchTo().window(parent9);
	    helper.getLastseenDate(lastSeenDate_today9, imageDate9);
	    }
	    catch(Exception e1)
		{
	    	System.out.println("Image is not able: Oops! Looks like we don't have data for this search criteria yet.");

	    	Reporter.log("<B><font color = 'orange'> Step5 -</font> Image is not able: Oops! Looks like we don't have data for this search criteria yet.");
	    }
		
		try
		{
		String lastSeenDate_today10=null;
		Reporter.log(" ");
		Reporter.log("<B><font color ='red'> 10 Ad -</font>  ");
		System.out.println("");
		System.out.println("10 Ads");
	
		String  imageDate10= date10.getText();
		Reporter.log("<B><font color = 'blue'> ==> -</font> Ads Caputure Image Date :");
		System.out.println("Ads Caputure Image Date");
		Reporter.log("<B><font color = 'blue'> ==> -</font> Image Date is :"+imageDate10);
		System.out.println("Current Date: "+imageDate10);
	
		helper.waitFor(ShowAnalytics10);
		helper.highLightElement(driver, ShowAnalytics10);
		helper.Scrollintoview(ShowAnalytics10);
		String linkText10 = ShowAnalytics10.getAttribute("href");
		helper.getAdID(linkText10);
		ShowAnalytics10.click();
		Reporter.log("<B><font color = 'blue'> ==> -</font> Clicked On Show Analytics Icon");
		helper.waitForPageToLoad();
		
		Set<String> S10=driver.getWindowHandles();
	    Iterator<String>it10=S10.iterator();
	    String parent10=it10.next();
	    String child10=it10.next();
	    
	    driver.switchTo().window(child10);

	    helper.waitForPageToLoad();
	    helper.waitFor(lastSeen);
	    helper.highLightElement(driver, lastSeen);
	    helper.Scrollintoview(lastSeen);
	    lastSeenDate_today10 = lastSeen.getText();
	    helper.Scrollintoview(Domain_Rgsd_Date);
	    String DomainRgsdDate10=Domain_Rgsd_Date.getText();
	    Reporter.log("<B><font color = 'blue'> ==> -</font> Last_Seen_ AdDetails Page= " +  lastSeenDate_today10);
	    Reporter.log("<B><font color = 'blue'> ==> -</font> Domain_Rgsd_Date AdDetails Page= " +  DomainRgsdDate10);
	    System.out.println("lastSeenDate_today: "+lastSeenDate_today10);
	    System.out.println("Domain Rgsd Date: "+DomainRgsdDate10);   
	    driver.close();
	    driver.switchTo().window(parent10);
	    helper.getLastseenDate(lastSeenDate_today10, imageDate10);
	    }
	    catch(Exception e1)
		{
	    	System.out.println("Image is not able: Oops! Looks like we don't have data for this search criteria yet.");

			Reporter.log("<B><font color = 'orange'> Step5 -</font> Image is not able: Oops! Looks like we don't have data for this search criteria yet.");
	    }
		
		try
		{
		String lastSeenDate_today11=null;
		Reporter.log(" ");
		Reporter.log("<B><font color ='red'> 11 Ad -</font>  ");
		System.out.println("");
		System.out.println("11 Ads");

		String  imageDate11= date11.getText();
		Reporter.log("<B><font color = 'blue'> ==> -</font> Ads Caputure Image Date :");
		System.out.println("Ads Caputure Image Date");
		Reporter.log("<B><font color = 'blue'> ==> -</font> Image Date is :"+imageDate11);
		System.out.println("Current Date: "+imageDate11);
	
		helper.waitFor(ShowAnalytics11);
		helper.highLightElement(driver, ShowAnalytics11);
		helper.Scrollintoview(ShowAnalytics11);
		String linkText11 = ShowAnalytics11.getAttribute("href");
		helper.getAdID(linkText11);
		ShowAnalytics11.click();
		Reporter.log("<B><font color = 'blue'> ==> -</font> Clicked On Show Analytics Icon");
		helper.waitForPageToLoad();
		
		Set<String> S11=driver.getWindowHandles();
	    Iterator<String>it11=S11.iterator();
	    String parent11=it11.next();
	    String child11=it11.next();
	    
	    driver.switchTo().window(child11);

	    helper.waitForPageToLoad();
	    helper.waitFor(lastSeen);
	    helper.highLightElement(driver, lastSeen);
	    helper.Scrollintoview(lastSeen);
	    lastSeenDate_today11 = lastSeen.getText();
	    helper.Scrollintoview(Domain_Rgsd_Date);
	    String DomainRgsdDate11=Domain_Rgsd_Date.getText();
	    Reporter.log("<B><font color = 'blue'> ==> -</font> Last_Seen_ AdDetails Page= " +  lastSeenDate_today11);
	    Reporter.log("<B><font color = 'blue'> ==> -</font> Domain_Rgsd_Date AdDetails Page= " +  DomainRgsdDate11);
	    System.out.println("lastSeenDate_today: "+lastSeenDate_today11);
	    System.out.println("Domain Rgsd Date: "+DomainRgsdDate11);   
	    driver.close();
	    driver.switchTo().window(parent11);
	    helper.getLastseenDate(lastSeenDate_today11, imageDate11);
	    }
	    catch(Exception e1)
		{
	    	System.out.println("Image is not able: Oops! Looks like we don't have data for this search criteria yet.");

			Reporter.log("<B><font color = 'orange'> Step5 -</font> Image is not able: Oops! Looks like we don't have data for this search criteria yet.");
	    }
		
		
		try
		{
		String lastSeenDate_today12=null;
		Reporter.log(" ");
		Reporter.log("<B><font color ='red'> 12 Ad -</font> ");
		System.out.println("");
		System.out.println("12 Ads");
		String  imageDate12= date12.getText();
		Reporter.log("<B><font color = 'blue'> ==> -</font> Ads Caputure Image Date :");
		System.out.println("Ads Caputure Image Date");
		Reporter.log("<B><font color = 'blue'> ==> -</font> Image Date is :"+imageDate12);
		System.out.println("Current Date: "+imageDate12);
	
		helper.waitFor(ShowAnalytics12);
		helper.highLightElement(driver, ShowAnalytics12);
		helper.Scrollintoview(ShowAnalytics12);
		String linkText12 = ShowAnalytics12.getAttribute("href");
		helper.getAdID(linkText12);
		ShowAnalytics12.click();
		Reporter.log("<B><font color = 'blue'> ==> -</font> Clicked On Show Analytics Icon");
		helper.waitForPageToLoad();
		
		Set<String> S12=driver.getWindowHandles();
	    Iterator<String>it12=S12.iterator();
	    String parent12=it12.next();
	    String child12=it12.next();
	    
	    driver.switchTo().window(child12);

	    helper.waitForPageToLoad();
	    helper.waitFor(lastSeen);
	    helper.highLightElement(driver, lastSeen);
	    helper.Scrollintoview(lastSeen);
	    lastSeenDate_today12 = lastSeen.getText();
	    helper.Scrollintoview(Domain_Rgsd_Date);
	    String DomainRgsdDate12=Domain_Rgsd_Date.getText();
	    Reporter.log("<B><font color = 'blue'> ==> -</font> Last_Seen_ AdDetails Page= " +  lastSeenDate_today12);
	    Reporter.log("<B><font color = 'blue'> ==> -</font> Domain_Rgsd_Date AdDetails Page= " +  DomainRgsdDate12);
	    System.out.println("lastSeenDate_today: "+lastSeenDate_today12);
	    System.out.println("Domain Rgsd Date: "+DomainRgsdDate12);   
	    driver.close();
	    driver.switchTo().window(parent12);
	    helper.getLastseenDate(lastSeenDate_today12, imageDate12);
	    }
	    catch(Exception e1)
		{
	    	System.out.println("Image is not able: Oops! Looks like we don't have data for this search criteria yet.");

			Reporter.log("<B><font color = 'orange'> Step5 -</font> Image is not able: Oops! Looks like we don't have data for this search criteria yet.");
	    }
		
		
		try
		{
		String lastSeenDate_today13=null;
		Reporter.log(" ");
		Reporter.log("<B><font color ='red'> 13 Ad -</font> ");
		System.out.println("");
		System.out.println("13 Ads");

		String  imageDate13= date13.getText();
		Reporter.log("<B><font color = 'blue'> ==> -</font> Ads Caputure Image Date :");
		System.out.println("Ads Caputure Image Date");
		Reporter.log("<B><font color = 'blue'> ==> -</font> Image Date is :"+imageDate13);
		System.out.println("Current Date: "+imageDate13);
	
		helper.waitFor(ShowAnalytics13);
		helper.highLightElement(driver, ShowAnalytics13);
		helper.Scrollintoview(ShowAnalytics13);
		String linkText13 = ShowAnalytics13.getAttribute("href");
		helper.getAdID(linkText13);
		ShowAnalytics13.click();
		Reporter.log("<B><font color = 'blue'> ==> -</font> Clicked On Show Analytics Icon");
		helper.waitForPageToLoad();
		
		Set<String> S13=driver.getWindowHandles();
	    Iterator<String>it13=S13.iterator();
	    String parent13=it13.next();
	    String child13=it13.next();
	    
	    driver.switchTo().window(child13);

	    helper.waitForPageToLoad();
	    helper.waitFor(lastSeen);
	    helper.highLightElement(driver, lastSeen);
	    helper.Scrollintoview(lastSeen);
	    lastSeenDate_today13 = lastSeen.getText();
	    helper.Scrollintoview(Domain_Rgsd_Date);
	    String DomainRgsdDate13=Domain_Rgsd_Date.getText();
	    Reporter.log("<B><font color = 'blue'> ==> -</font> Last_Seen_ AdDetails Page= " +  lastSeenDate_today13);
	    Reporter.log("<B><font color = 'blue'> ==> -</font> Domain_Rgsd_Date AdDetails Page= " +  DomainRgsdDate13);
	    System.out.println("lastSeenDate_today: "+lastSeenDate_today13);
	    System.out.println("Domain Rgsd Date: "+DomainRgsdDate13);   
	    driver.close();
	    driver.switchTo().window(parent13);
	    helper.getLastseenDate(lastSeenDate_today13, imageDate13);
	    }
	    catch(Exception e1)
		{
	    	System.out.println("Image is not able: Oops! Looks like we don't have data for this search criteria yet.");

			Reporter.log("<B><font color = 'orange'> Step5 -</font> Image is not able: Oops! Looks like we don't have data for this search criteria yet.");
	    }
		
		try
		{
		String lastSeenDate_today14=null;
		Reporter.log(" ");
		Reporter.log("<B><font color ='red'> 14 Ad -</font> ");
		System.out.println("");
		System.out.println("14 Ads");
	
		String  imageDate14= date14.getText();
		Reporter.log("<B><font color = 'blue'> ==> -</font> Ads Caputure Image Date :");
		System.out.println("Ads Caputure Image Date");
		Reporter.log("<B><font color = 'blue'> ==> -</font> Image Date is :"+imageDate14);
		System.out.println("Current Date: "+imageDate14);
	
		helper.waitFor(ShowAnalytics14);
		helper.highLightElement(driver, ShowAnalytics14);
		helper.Scrollintoview(ShowAnalytics14);
		String linkText14 = ShowAnalytics14.getAttribute("href");
		helper.getAdID(linkText14);
		ShowAnalytics14.click();
		Reporter.log("<B><font color = 'blue'> ==> -</font> Clicked On Show Analytics Icon");
		helper.waitForPageToLoad();
		
		Set<String> S14=driver.getWindowHandles();
	    Iterator<String>it14=S14.iterator();
	    String parent14=it14.next();
	    String child14=it14.next();
	    
	    driver.switchTo().window(child14);

	    helper.waitForPageToLoad();
	    helper.waitFor(lastSeen);
	    helper.highLightElement(driver, lastSeen);
	    helper.Scrollintoview(lastSeen);
	    lastSeenDate_today14 = lastSeen.getText();
	    helper.Scrollintoview(Domain_Rgsd_Date);
	    String DomainRgsdDate14=Domain_Rgsd_Date.getText();
	    Reporter.log("<B><font color = 'blue'> ==> -</font> Last_Seen_ AdDetails Page= " +  lastSeenDate_today14);
	    Reporter.log("<B><font color = 'blue'> ==> -</font> Domain_Rgsd_Date AdDetails Page= " +  DomainRgsdDate14);
	    System.out.println("lastSeenDate_today: "+lastSeenDate_today14);
	    System.out.println("Domain Rgsd Date: "+DomainRgsdDate14);   
	    driver.close();
	    driver.switchTo().window(parent14);
	    helper.getLastseenDate(lastSeenDate_today14, imageDate14);
	    }
	    catch(Exception e1)
		{
	    	System.out.println("Image is not able: Oops! Looks like we don't have data for this search criteria yet.");

			Reporter.log("<B><font color = 'orange'> Step5 -</font> Image is not able: Oops! Looks like we don't have data for this search criteria yet.");
	    }
		
		try
		{
		String lastSeenDate_today15=null;
		Reporter.log(" ");
		Reporter.log("<B><font color ='red'> 15 Ad -</font> ");
		System.out.println("");
		System.out.println("15 Ads");
	
		String  imageDate15= date15.getText();
		Reporter.log("<B><font color = 'blue'> ==> -</font> Ads Caputure Image Date :");
		System.out.println("Ads Caputure Image Date");
		Reporter.log("<B><font color = 'blue'> ==> -</font> Image Date is :"+imageDate15);
		System.out.println("Current Date: "+imageDate15);
	
		helper.waitFor(ShowAnalytics15);
		helper.highLightElement(driver, ShowAnalytics15);
		helper.Scrollintoview(ShowAnalytics15);
		String linkText15 = ShowAnalytics15.getAttribute("href");
		helper.getAdID(linkText15);
		ShowAnalytics15.click();
		Reporter.log("<B><font color = 'blue'> ==> -</font> Clicked On Show Analytics Icon");
		helper.waitForPageToLoad();
		
		Set<String> S15=driver.getWindowHandles();
	    Iterator<String>it15=S15.iterator();
	    String parent15=it15.next();
	    String child15=it15.next();
	    
	    driver.switchTo().window(child15);

	    helper.waitForPageToLoad();
	    helper.waitFor(lastSeen);
	    helper.highLightElement(driver, lastSeen);
	    helper.Scrollintoview(lastSeen);
	    lastSeenDate_today15 = lastSeen.getText();
	    helper.Scrollintoview(Domain_Rgsd_Date);
	    String DomainRgsdDate15=Domain_Rgsd_Date.getText();
	    Reporter.log("<B><font color = 'blue'> ==> -</font> Last_Seen_ AdDetails Page= " +  lastSeenDate_today15);
	    Reporter.log("<B><font color = 'blue'> ==> -</font> Domain_Rgsd_Date AdDetails Page= " +  DomainRgsdDate15);
	    System.out.println("lastSeenDate_today: "+lastSeenDate_today15);
	    System.out.println("Domain Rgsd Date: "+DomainRgsdDate15);   
	    driver.close();
	    driver.switchTo().window(parent15);
	    helper.getLastseenDate(lastSeenDate_today15, imageDate15);
	    }
	    catch(Exception e1)
		{
	    	System.out.println("Image is not able: Oops! Looks like we don't have data for this search criteria yet.");

			Reporter.log("<B><font color = 'orange'> Step5 -</font> Image is not able: Oops! Looks like we don't have data for this search criteria yet.");
	    }
	}
}
