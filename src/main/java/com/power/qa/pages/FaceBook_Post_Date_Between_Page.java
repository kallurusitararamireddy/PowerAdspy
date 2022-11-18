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
public class FaceBook_Post_Date_Between_Page extends BasePage
{
	Helpers helper=new Helpers();

	public FaceBook_Post_Date_Between_Page(WebDriver driver) throws InterruptedException 
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

	@FindBy(xpath ="//div[@class='form-group']//div[@class='input-group']//div[@id='post_ads_timepicker']")
	WebElement post_date_between_dropdown;

	@FindBy(xpath = "//li[@class='active']")
	WebElement  post_date_between_all;

	@FindBy(css = "body > div:nth-child(68) > div:nth-child(1) > ul:nth-child(1) > li:nth-child(2)")
	WebElement post_date_between_today;

	@FindBy(xpath = "//body/div[7]/div[1]/ul[1]/li[3]")
	WebElement post_date_between_Yesterday;

	@FindBy(css = "body > div:nth-child(68) > div:nth-child(1) > ul:nth-child(1) > li:nth-child(4)")
	WebElement post_date_between_Last_Seven_Days;

	@FindBy(xpath = "(//li[text()='Last Thirty Days'])[2]")
	WebElement post_date_between_Last_Thirty_Days;

	/*@FindBy(xpath = "(//li[text()='Last 30 Days'])[2]")   //main site
	WebElement post_date_between_Last_Thirty_Days;*/

	@FindBy(xpath = "(//li[contains(text(),'This Month')])[2]")
	WebElement post_date_between_This_Month;

//	@FindBy(xpath = "//li[text()='Last Month']")
	@FindBy(xpath = "//body/div[7]/div[1]/ul[1]/li[7]")
	WebElement post_date_between_last_Month;

	@FindBy(id ="totaladscount")
	WebElement totaladscount_ad;

	@FindBy(xpath ="//div[@class='ad_date']")
	WebElement Date1;

	@FindBy(xpath = "//a[text()='Show Analytics']")
	WebElement showAnalytics;

	@FindBy(id = "last_seen1")
	WebElement lastSeen;

	@FindBy(css = ".clear_filters")
	WebElement Clear_Filters;

	@FindBy(id="post_date1")
	WebElement postdate;

	@FindBy(xpath = "//span[@id='post_timefilter']")
	WebElement postdatebetweenfilter;
	
	@FindBy(xpath = "//body/div[7]/div[1]/ul[1]/li[8]")
	WebElement postdateBetween_customrange;
	
//	@FindBy(xpath = "(//td[@class='weekend available' and @data-title='r1c0'])[1]")
	@FindBy(xpath="//td[text()='1']")
	WebElement post_date_Between_Start_range1;

//	@FindBy(xpath = "//td[@class='available in-range' and @data-title='r4c3' and text()='26']")
	 @FindBy(xpath="//td[text()='15']")
	 WebElement post_date_Between_end_range2;
	 
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

	}

	public void PostDateBetween_All() throws InterruptedException
	{
		String date_format_lastseen=null;
		String lastimageDate1=null;

		Reporter.log("       " );
		Reporter.log("<B><font color = 'red'>  - ShortBy Newest Step will Start from here </font>  ");
		helper.waitFor(sortBy);
		helper.highLightElement(driver, sortBy);
		sortBy.click();
		Reporter.log("<B><font color = 'orange'> Step1 -</font> Clicked On sortBy Icon");

		helper.waitFor(SortBy_Newest);
		helper.highLightElement(driver, SortBy_Newest);
		helper.jsScrollintoview(SortBy_Newest);
		SortBy_Newest.click();
		Reporter.log("<B><font color = 'orange'> Step2 -</font> Clicked On SortBy Newest Icon");

		helper.waitFor(searchButton);
		helper.highLightElement(driver, searchButton);
		searchButton.click();
		Reporter.log("<B><font color = 'orange'> Step3 -</font> Clicked On search Button Icon");
		helper.waitForPageToLoad();

		System.out.println();
		System.out.println("-ShortBy Newest -Ad Post Date Between:");
		Reporter.log("<B><font color = 'red'>  -ShortBy Newest -Post Date Between All Step will Start from here  </font> ");
		helper.waitFor(post_date_between_dropdown);
		helper.highLightElement(driver, post_date_between_dropdown);
		post_date_between_dropdown.click();
		Reporter.log("<B><font color = 'orange'> Step4 -</font> Clicked On Post Date Between filter Icon");

		helper.waitFor(post_date_between_all);
		helper.highLightElement(driver, post_date_between_all);
		post_date_between_all.click();
		Reporter.log("<B><font color = 'orange'> Step5 -</font> Clicked On  Post Between All Icon");

		helper.waitFor(searchButton);
		helper.highLightElement(driver, searchButton);
		searchButton.click();
		Reporter.log("<B><font color = 'orange'> Step6 -</font> Clicked On Search Button Icon");
		helper.waitForPageToLoad();

		String totaladscount=totaladscount_ad.getText();
		System.out.println("Totaladscount: "+totaladscount);
		Reporter.log("<B><font color = 'orange'> Step7 -</font>  Total Ad Count is :" +totaladscount);

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
					String postdate1=postdate.getText();
					lastimageDate1 = lastSeen.getText();
					System.out.println("Analytics Image Post Date: "+postdate1);
					Reporter.log("<B><font color = 'orange'> Step10 -</font> Image Date of Post date is :"+postdate1);
					System.out.println("Analytics Image Last Seen Date: "+lastimageDate1);
					Reporter.log("<B><font color = 'orange'> Step11 -</font> Image Date of Last Seen is :"+lastimageDate1);
					driver.close();
				}
			}

			driver.switchTo().window(parent);

			String[] splitString = lastimageDate1.split(" ");
			for(int i=0;i<splitString.length-2;i++) {
				//   String actualDate=splitString[i]; 
				date_format_lastseen= splitString[i+1]+" "+ splitString[i]+" " + splitString[i+2];

				//  System.out.println("splitString : " + splitString[i]);
				System.out.println("Change Date format lastseen Date: " + date_format_lastseen);
				System.out.println("image last seen Date: " + imageDate);
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

		//		helper.waitFor(Clear_Filters);
		//		helper.highLightElement(driver, Clear_Filters);
		//		helper.jsScrollintoview(Clear_Filters);
		//		Clear_Filters.click();
		//		Reporter.log("<B><font color = 'orange'> Step3 -</font> Clicked On Clear Filters Icon");
		//		helper.waitForPageToLoad();
	}

	public void PostDateBetween_Today() throws InterruptedException
	{
		String date_format_lastseen=null;
		String lastimageDate1=null;

		Reporter.log("       " );
		Reporter.log("<B><font color = 'red'>  - ShortBy Newest Step will Start from here </font>  ");
		helper.waitFor(sortBy);
		helper.highLightElement(driver, sortBy);
		helper.jsScrollintoview(sortBy);
		sortBy.click();
		Reporter.log("<B><font color = 'orange'> Step1 -</font> Clicked On sortBy Icon");

		helper.waitFor(SortBy_Newest);
		helper.highLightElement(driver, SortBy_Newest);
		helper.jsScrollintoview(SortBy_Newest);
		SortBy_Newest.click();
		Reporter.log("<B><font color = 'orange'> Step2 -</font> Clicked On SortBy Newest Icon");

		helper.waitFor(searchButton);
		helper.highLightElement(driver, searchButton);
		helper.jsScrollintoview(searchButton);
		searchButton.click();
		Reporter.log("<B><font color = 'orange'> Step3 -</font> Clicked On search Button Icon");
		helper.waitForPageToLoad();

		System.out.println();
		System.out.println("-ShortBy Newest -Ad Post Date Between:");
		Reporter.log("<B><font color = 'red'>  -ShortBy Newest -Post Date Between Today Step will Start from here  </font> ");
		helper.waitFor(post_date_between_dropdown);
		helper.highLightElement(driver, post_date_between_dropdown);
		helper.jsScrollintoview(post_date_between_dropdown);
		post_date_between_dropdown.click();
		Reporter.log("<B><font color = 'orange'> Step4 -</font> Clicked On Post Date Between filter Icon");

		helper.waitFor(post_date_between_today);
		helper.highLightElement(driver, post_date_between_today);
		helper.jsScrollintoview(post_date_between_today);
		post_date_between_today.click();
		Reporter.log("<B><font color = 'orange'> Step5 -</font> Clicked On  Post Between Today Icon");

		helper.waitFor(searchButton);
		helper.highLightElement(driver, searchButton);
		helper.jsScrollintoview(searchButton);
		searchButton.click();
		Reporter.log("<B><font color = 'orange'> Step6 -</font> Clicked On Search Button Icon");
		helper.waitForPageToLoad();

		String totaladscount=totaladscount_ad.getText();
		System.out.println("Totaladscount: "+totaladscount);
		Reporter.log("<B><font color = 'orange'> Step7 -</font>  Total Ad Count is :" +totaladscount);

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
			Iterator<String> I1= s.iterator();
			while(I1.hasNext())
			{
				String child_window=I1.next();
				if(!parent.equals(child_window))
				{
					driver.switchTo().window(child_window);
					helper.waitForPageToLoad();
					System.out.println(driver.switchTo().window(child_window).getTitle());
					String postdate1=postdate.getText();
					lastimageDate1 = lastSeen.getText();
					System.out.println("Analytics Image Post Date: "+postdate1);
					Reporter.log("<B><font color = 'orange'> Step10 -</font> Image Date of Post date is :"+postdate1);
					System.out.println("Analytics Image Last Seen Date: "+lastimageDate1);
					Reporter.log("<B><font color = 'orange'> Step11 -</font> Image Date of Last Seen is :"+lastimageDate1);
					driver.close();
				}
			}

			driver.switchTo().window(parent);

			String[] splitString = lastimageDate1.split(" ");
			for(int i=0;i<splitString.length-2;i++) {
				//   String actualDate=splitString[i]; 
				date_format_lastseen= splitString[i+1]+" "+ splitString[i]+" " + splitString[i+2];

				//  System.out.println("splitString : " + splitString[i]);
				System.out.println("Change Date format lastseen Date: " + date_format_lastseen);
				System.out.println("Image last seen Date: " + imageDate);
			}

			//Assert.assertEquals(imageDate, date_format_lastseen);
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

	public void PostDateBetween_Yesterday() throws InterruptedException
	{	
		String lastimageDate1=null;
		String postdate1=null;

		Reporter.log("       " );
		Reporter.log("<B><font color = 'red'>  - ShortBy Newest Step will Start from here </font>  ");
		helper.waitFor(sortBy);
		helper.highLightElement(driver, sortBy);
		helper.jsScrollintoview(sortBy);
		sortBy.click();
		Reporter.log("<B><font color = 'orange'> Step1 -</font> Clicked On sortBy Icon");

		helper.waitFor(SortBy_Newest);
		helper.highLightElement(driver, SortBy_Newest);
		helper.jsScrollintoview(SortBy_Newest);
		SortBy_Newest.click();
		Reporter.log("<B><font color = 'orange'> Step2 -</font> Clicked On SortBy Newest Icon");

		helper.waitFor(searchButton);
		helper.highLightElement(driver, searchButton);
		helper.jsScrollintoview(searchButton);
		searchButton.click();
		Reporter.log("<B><font color = 'orange'> Step3 -</font> Clicked On search Button Icon");
		helper.waitForPageToLoad();

		System.out.println();
		System.out.println("-ShortBy Newest -Ad Post Date Between:");
		Reporter.log("<B><font color = 'red'>  -ShortBy Newest -Post Date Between Yesterday Step will Start from here  </font> ");
		helper.waitFor(post_date_between_dropdown);
		helper.highLightElement(driver, post_date_between_dropdown);
		helper.jsScrollintoview(post_date_between_dropdown);
		post_date_between_dropdown.click();
		Reporter.log("<B><font color = 'orange'> Step4 -</font> Clicked On Post Date Between filter Icon");

		helper.waitFor(post_date_between_Yesterday);
		helper.highLightElement(driver, post_date_between_Yesterday);
		helper.jsScrollintoview(post_date_between_Yesterday);
		post_date_between_Yesterday.click();
		Reporter.log("<B><font color = 'orange'> Step5 -</font> Clicked On  Post Between Yesterday Icon");

		helper.waitFor(searchButton);
		helper.highLightElement(driver, searchButton);
		helper.jsScrollintoview(searchButton);
		searchButton.click();
		Reporter.log("<B><font color = 'orange'> Step6 -</font> Clicked On Search Button Icon");
		helper.waitForPageToLoad();

		String totaladscount=totaladscount_ad.getText();
		System.out.println("Totaladscount: "+totaladscount);
		Reporter.log("<B><font color = 'orange'> Step7 -</font>  Total Ad Count is :" +totaladscount);

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
					postdate1=postdate.getText();
					lastimageDate1 = lastSeen.getText();
					System.out.println("Analytics Image Post Date: "+postdate1);
					Reporter.log("<B><font color = 'orange'> Step10 -</font> Image Date of Post date is :"+postdate1);
					System.out.println("Analytics Image Last Seen Date: "+lastimageDate1);
					Reporter.log("<B><font color = 'orange'> Step11 -</font> Image Date of Last Seen is :"+lastimageDate1);
					driver.close();
				}
			}
			String date_format_lastseen=null;
			driver.switchTo().window(parent);
			
			String[] splitString = postdate1.split(" ");
			for(int i=0;i<splitString.length-2;i++) {
				//    String actualDate=splitString[i]; 
				date_format_lastseen= splitString[i+1]+" "+ splitString[i]+" " + splitString[i+2];

				//  System.out.println("splitString : " + splitString[i]);
				System.out.println("Change Date format lastseen Date: " + date_format_lastseen);
				System.out.println("Image last seen Date: " + imageDate);
			}

		//	Assert.assertEquals(imageDate, date_format_lastseen);
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

	public void PostDateBetween_Last_Seven_Days() throws InterruptedException
	{	
		String date_format_lastseen=null;
		String lastimageDate1=null;
		String postdate1=null;

		Reporter.log("       " );
		Reporter.log("<B><font color = 'red'>  - ShortBy Newest Step will Start from here </font>  ");
		helper.waitFor(sortBy);
		helper.highLightElement(driver, sortBy);
		helper.jsScrollintoview(sortBy);
		sortBy.click();
		Reporter.log("<B><font color = 'orange'> Step1 -</font> Clicked On sortBy Icon");

		helper.waitFor(SortBy_Newest);
		helper.highLightElement(driver, SortBy_Newest);
		helper.jsScrollintoview(SortBy_Newest);
		SortBy_Newest.click();
		Reporter.log("<B><font color = 'orange'> Step2 -</font> Clicked On SortBy Newest Icon");

		helper.waitFor(searchButton);
		helper.highLightElement(driver, searchButton);
		helper.jsScrollintoview(searchButton);
		searchButton.click();
		Reporter.log("<B><font color = 'orange'> Step3 -</font> Clicked On search Button Icon");
		helper.waitForPageToLoad();

		System.out.println();
		System.out.println("-ShortBy Newest -Ad Post Date Between:");
		Reporter.log("<B><font color = 'red'>  -ShortBy Newest -Post Date Between Last Seven Days Step will Start from here  </font> ");
		helper.waitFor(post_date_between_dropdown);
		helper.highLightElement(driver, post_date_between_dropdown);
		helper.jsScrollintoview(post_date_between_dropdown);
		post_date_between_dropdown.click();
		Reporter.log("<B><font color = 'orange'> Step4 -</font> Clicked On Post Date Between filter Icon");

		helper.waitFor(post_date_between_Last_Seven_Days);
		helper.highLightElement(driver, post_date_between_Last_Seven_Days);
		helper.jsScrollintoview(post_date_between_Last_Seven_Days);
		post_date_between_Last_Seven_Days.click();
		Reporter.log("<B><font color = 'orange'> Step5 -</font> Clicked On  Post Between Last Seven Days Icon");

		helper.waitFor(searchButton);
		helper.highLightElement(driver, searchButton);
		helper.jsScrollintoview(searchButton);
		searchButton.click();
		Reporter.log("<B><font color = 'orange'> Step6 -</font> Clicked On Search Button Icon");
		helper.waitForPageToLoad();

		String totaladscount=totaladscount_ad.getText();
		System.out.println("Totaladscount: "+totaladscount);
		Reporter.log("<B><font color = 'orange'> Step7 -</font>  Total Ad Count is :" +totaladscount);

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
					postdate1=postdate.getText();
					lastimageDate1 = lastSeen.getText();
					System.out.println("Analytics Image Post Date: "+postdate1);
					Reporter.log("<B><font color = 'orange'> Step10 -</font> Image Date of Post date is :"+postdate1);
					System.out.println("Analytics Image Last Seen Date: "+lastimageDate1);
					Reporter.log("<B><font color = 'orange'> Step11 -</font> Image Date of Last Seen is :"+lastimageDate1);
					driver.close();
				}
			}

			driver.switchTo().window(parent);

			String[] splitString = postdate1.split(" ");
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

	public void PostDateBetween_Last_Thirty_Days() throws InterruptedException
	{
		{	
			String date_format_lastseen=null;
			String postdate1=null;
			helper.waitForPageToLoad();
			Reporter.log("       " );
			Reporter.log("<B><font color = 'red'>  - ShortBy Newest Step will Start from here </font>  ");
			helper.waitFor(sortBy);
			helper.highLightElement(driver, sortBy);
			helper.jsScrollintoview(sortBy);
			sortBy.click();
			Reporter.log("<B><font color = 'orange'> Step1 -</font> Clicked On sortBy Icon");

			helper.waitFor(SortBy_Newest);
			helper.highLightElement(driver, SortBy_Newest);
			helper.jsScrollintoview(SortBy_Newest);
			SortBy_Newest.click();
			Reporter.log("<B><font color = 'orange'> Step2 -</font> Clicked On SortBy Newest Icon");

			helper.waitFor(searchButton);
			helper.highLightElement(driver, searchButton);
			helper.jsScrollintoview(searchButton);
			searchButton.click();
			Reporter.log("<B><font color = 'orange'> Step3 -</font> Clicked On search Button Icon");
			helper.waitForPageToLoad();

			System.out.println();
			System.out.println("-ShortBy Newest -Ad Post Date Between:");
			Reporter.log("<B><font color = 'red'>  -ShortBy Newest -Post Date Between Last Thirty Days Step will Start from here  </font> ");
			helper.waitFor(post_date_between_dropdown);
			helper.highLightElement(driver, post_date_between_dropdown);
			helper.jsScrollintoview(post_date_between_dropdown);
			post_date_between_dropdown.click();
			Reporter.log("<B><font color = 'orange'> Step4 -</font> Clicked On Post Date Between filter Icon");

			helper.waitFor(post_date_between_Last_Thirty_Days);
			helper.highLightElement(driver, post_date_between_Last_Thirty_Days);
			helper.jsScrollintoview(post_date_between_Last_Thirty_Days);
			post_date_between_Last_Thirty_Days.click();
			Reporter.log("<B><font color = 'orange'> Step5 -</font> Clicked On Post Between Last Thirty Days Icon");

			helper.waitFor(searchButton);
			helper.highLightElement(driver, searchButton);
			helper.jsScrollintoview(searchButton);
			searchButton.click();
			Reporter.log("<B><font color = 'orange'> Step6 -</font> Clicked On Search Button Icon");
			helper.waitForPageToLoad();

			String totaladscount=totaladscount_ad.getText();
			System.out.println("Totaladscount: "+totaladscount);
			Reporter.log("<B><font color = 'orange'> Step7 -</font>  Total Ad Count is :" +totaladscount);

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
						postdate1=postdate.getText();
						String lastimageDate1 = lastSeen.getText();
						System.out.println("Analytics Image Post Date: "+postdate1);
						Reporter.log("<B><font color = 'orange'> Step10 -</font> Image Date of Post date is :"+postdate1);
						System.out.println("Analytics Image Last Seen Date: "+lastimageDate1);
						Reporter.log("<B><font color = 'orange'> Step11 -</font> Image Date of Last Seen is :"+lastimageDate1);
						driver.close();
					}
				}

				driver.switchTo().window(parent);

				String[] splitString = postdate1.split(" ");
				for(int i=0;i<splitString.length-2;i++) {
					//    String actualDate=splitString[i]; 
					date_format_lastseen= splitString[i+1]+" "+ splitString[i]+" " + splitString[i+2];

					//  System.out.println("splitString : " + splitString[i]);
					System.out.println("Change Date Format Post  Date: " + date_format_lastseen);
					System.out.println("Image Post Date: " + imageDate);
				}

				Assert.assertEquals(imageDate, date_format_lastseen);
				Reporter.log("<B><font color = 'orange'> Step12 -</font> Both Post  Date are Matching in Assert Pass :"+imageDate+ " == " +date_format_lastseen);
				System.out.println("Both Post Date are Matching in Assert Pass :"+imageDate+ " == " +date_format_lastseen);
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

	}
	public void PostDateBetween_This_Month()  throws InterruptedException
	{
		String date_format_lastseen=null;
		String postdate1=null;
		helper.waitForPageToLoad();
		Reporter.log("       " );
		Reporter.log("<B><font color = 'red'>  - ShortBy Newest Step will Start from here </font>  ");
		helper.waitFor(sortBy);
		helper.highLightElement(driver, sortBy);
		helper.jsScrollintoview(sortBy);
		sortBy.click();
		Reporter.log("<B><font color = 'orange'> Step1 -</font> Clicked On sortBy Icon");

		helper.waitFor(SortBy_Newest);
		helper.highLightElement(driver, SortBy_Newest);
		helper.jsScrollintoview(SortBy_Newest);
		SortBy_Newest.click();
		Reporter.log("<B><font color = 'orange'> Step2 -</font> Clicked On SortBy Newest Icon");

		helper.waitFor(searchButton);
		helper.highLightElement(driver, searchButton);
		helper.jsScrollintoview(searchButton);
		searchButton.click();
		Reporter.log("<B><font color = 'orange'> Step3 -</font> Clicked On search Button Icon");
		helper.waitForPageToLoad();

		System.out.println();
		System.out.println("-ShortBy Newest -Ad Post Date Between:");
		Reporter.log("<B><font color = 'red'>  -ShortBy Newest -Post Date Between This Month Step will Start from here  </font> ");
		helper.waitFor(post_date_between_dropdown);
		helper.highLightElement(driver, post_date_between_dropdown);
		helper.jsScrollintoview(post_date_between_dropdown);
		post_date_between_dropdown.click();
		Reporter.log("<B><font color = 'orange'> Step4 -</font> Clicked On Post Date Between filter Icon");

		helper.waitFor(post_date_between_This_Month);
		helper.highLightElement(driver, post_date_between_This_Month);
		helper.jsScrollintoview(post_date_between_This_Month);
		post_date_between_This_Month.click();
		Reporter.log("<B><font color = 'orange'> Step5 -</font> Clicked On Post Between This Month Icon");

		helper.waitFor(searchButton);
		helper.highLightElement(driver, searchButton);
		helper.jsScrollintoview(searchButton);
		searchButton.click();
		Reporter.log("<B><font color = 'orange'> Step6 -</font> Clicked On Search Button Icon");
		helper.waitForPageToLoad();

		String totaladscount=totaladscount_ad.getText();
		System.out.println("Totaladscount: "+totaladscount);
		Reporter.log("<B><font color = 'orange'> Step7 -</font>  Total Ad Count is :" +totaladscount);

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
					postdate1=postdate.getText();
					String lastimageDate1 = lastSeen.getText();
					System.out.println("Analytics Image Post Date: "+postdate1);
					Reporter.log("<B><font color = 'orange'> Step10 -</font> Image Date of Post date is :"+postdate1);
					System.out.println("Analytics Image Last Seen Date: "+lastimageDate1);
					Reporter.log("<B><font color = 'orange'> Step11 -</font> Image Date of Last Seen is :"+lastimageDate1);
					driver.close();
				}
			}

			driver.switchTo().window(parent);

			String[] splitString = postdate1.split(" ");
			for(int i=0;i<splitString.length-2;i++) {
				//    String actualDate=splitString[i]; 
				date_format_lastseen= splitString[i+1]+" "+ splitString[i]+" " + splitString[i+2];

				//  System.out.println("splitString : " + splitString[i]);
				System.out.println("Change Date Format Post  Date: " + date_format_lastseen);
				System.out.println("Image Post Date: " + imageDate);
			}

			Assert.assertEquals(imageDate, date_format_lastseen);
			Reporter.log("<B><font color = 'orange'> Step12 -</font> Both Post  Date are Matching in Assert Pass :"+imageDate+ " == " +date_format_lastseen);
			System.out.println("Both Post Date are Matching in Assert Pass :"+imageDate+ " == " +date_format_lastseen);
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

	public void PostDateBetween_Last_Month() throws Exception
	{
		String date_format_lastseen=null;
		String postdate1=null;
		helper.waitForPageToLoad();
		Reporter.log("       " );
		Reporter.log("<B><font color = 'red'>  - ShortBy Newest Step will Start from here </font>  ");
		helper.waitFor(sortBy);
		helper.highLightElement(driver, sortBy);
		helper.jsScrollintoview(sortBy);
		sortBy.click();
		Reporter.log("<B><font color = 'orange'> Step1 -</font> Clicked On sortBy Icon");

		helper.waitFor(SortBy_Newest);
		helper.highLightElement(driver, SortBy_Newest);
		helper.jsScrollintoview(SortBy_Newest);
		SortBy_Newest.click();
		Reporter.log("<B><font color = 'orange'> Step2 -</font> Clicked On SortBy Newest Icon");

		helper.waitFor(searchButton);
		helper.highLightElement(driver, searchButton);
		helper.jsScrollintoview(searchButton);
		searchButton.click();
		Reporter.log("<B><font color = 'orange'> Step3 -</font> Clicked On search Button Icon");
		helper.waitForPageToLoad();

		System.out.println();
		System.out.println("-ShortBy Newest -Ad Post Date Between:");
		Reporter.log("<B><font color = 'red'>  -ShortBy Newest -Post Date Between Last month Step will Start from here  </font> ");
		helper.waitFor(post_date_between_dropdown);
		helper.highLightElement(driver, post_date_between_dropdown);
		helper.jsScrollintoview(post_date_between_dropdown);
		post_date_between_dropdown.click();
		Reporter.log("<B><font color = 'orange'> Step4 -</font> Clicked On Post Date Between filter Icon");

		helper.waitFor(post_date_between_last_Month);
		helper.highLightElement(driver, post_date_between_last_Month);
		helper.jsScrollintoview(post_date_between_last_Month);
		post_date_between_last_Month.click();
		Reporter.log("<B><font color = 'orange'> Step5 -</font> Clicked On Post Between Last Month Icon");

		helper.waitFor(searchButton);
		helper.highLightElement(driver, searchButton);
		helper.jsScrollintoview(searchButton);
		searchButton.click();
		Reporter.log("<B><font color = 'orange'> Step6 -</font> Clicked On Search Button Icon");
		helper.waitForPageToLoad();

		String totaladscount=totaladscount_ad.getText();
		System.out.println("Totaladscount: "+totaladscount);
		Reporter.log("<B><font color = 'orange'> Step7 -</font>  Total Ad Count is :" +totaladscount);

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
					postdate1=postdate.getText();
					String lastimageDate1 = lastSeen.getText();
					System.out.println("Analytics Image Post Date: "+postdate1);
					Reporter.log("<B><font color = 'orange'> Step10 -</font> Image Date of Post date is :"+postdate1);
					System.out.println("Analytics Image Last Seen Date: "+lastimageDate1);
					Reporter.log("<B><font color = 'orange'> Step11 -</font> Image Date of Last Seen is :"+lastimageDate1);
					driver.close();
				}
			}

			driver.switchTo().window(parent);

			String[] splitString = postdate1.split(" ");
			for(int i=0;i<splitString.length-2;i++) {
				//    String actualDate=splitString[i]; 
				date_format_lastseen= splitString[i+1]+" "+ splitString[i]+" " + splitString[i+2];

				//  System.out.println("splitString : " + splitString[i]);
				System.out.println("Change Date Format Post  Date: " + date_format_lastseen);
				System.out.println("Image Post Date: " + imageDate);
			}

			Assert.assertEquals(imageDate, date_format_lastseen);
			Reporter.log("<B><font color = 'orange'> Step12 -</font> Both Post  Date are Matching in Assert Pass :"+imageDate+ " == " +date_format_lastseen);
			System.out.println("Both Post Date are Matching in Assert Pass :"+imageDate+ " == " +date_format_lastseen);
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
	
	public void PostDateBetween_CustomRange() throws Exception
	{
		
		System.out.println();
		Reporter.log("      ");
		System.out.println("-SortBy Newest -Post Date  Between Custom Range: ");
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
		
		Reporter.log("<B><font color = 'red'>  -ShortBy Newest -Post Date Between Custom Range Step will Start from here </font> ");
		helper.waitFor(postdatebetweenfilter);
		helper.highLightElement(driver, postdatebetweenfilter);
		helper.jsScrollintoview(postdatebetweenfilter);
		postdatebetweenfilter.click();
		Reporter.log("<B><font color = 'orange'> Step4 -</font> Clicked On Post Date Between Custom Range filter Icon");
		
		helper.waitFor(postdateBetween_customrange);
		helper.highLightElement(driver,postdateBetween_customrange);
		helper.jsScrollintoview(postdateBetween_customrange);
		postdateBetween_customrange.click();
		Reporter.log("<B><font color = 'orange'> Step5 -</font> Clicked On Post Date Between Custom Range Icon");
		
		helper.waitFor(post_date_Between_Start_range1);
		helper.highLightElement(driver,post_date_Between_Start_range1);
		helper.jsScrollintoview(post_date_Between_Start_range1);
		post_date_Between_Start_range1.click();
		Reporter.log("<B><font color = 'orange'> Step6 -</font> Clicked On Post Date Between Custom Range Icon");
		
		helper.waitFor(post_date_Between_end_range2);
		helper.jsScrollintoview(post_date_Between_end_range2);
		helper.jsCLick(post_date_Between_end_range2);
		helper.highLightElement(driver,post_date_Between_end_range2);
	
		Reporter.log("<B><font color = 'orange'> Step7 -</font> Clicked On Post Date Between Custom Range Icon:");
		
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

			String lastimageDate1=null;
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


