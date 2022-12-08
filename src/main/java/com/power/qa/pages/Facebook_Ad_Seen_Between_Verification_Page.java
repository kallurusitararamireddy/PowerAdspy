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

	@FindBy(xpath = "//span[@id='timefilter']")
	WebElement adSeenbetween_filter;
	
	@FindBy(xpath = "(//li[text()='All'])[1]")
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

	//	@FindBy(xpath = "//ul//li[@class='active'][text()='Today']")
	//  @FindBy(css = "li[class='active']")
	@FindBy(xpath ="(//li[text()='Today'])[1]")
	WebElement adSeenbetween_today;

	@FindBy(xpath = "(//li[text()='Yesterday'])[1]")
	WebElement adSeenbetween_yesterday;

		@FindBy(xpath = "(//li[text()='Last Seven Days'])[1]")  // dev site
	//	@FindBy(xpath = "(//li[text()='Last 7 Days'])[1]")  // main site
		WebElement adSeenbetween_last_Seven_Days;

	// @FindBy(xpath = "//body/div[6]/div[1]/ul[1]/li[5]")  
	 @FindBy(xpath = "(//li[text()='Last Thirty Days'])[1]")   //dev site
	//	@FindBy(xpath = "(//li[text()='Last 30 Days'])[1]")		//main site
	WebElement adSeenBetween_last_Thirty_days;

	@FindBy(xpath = "(//li[text()='This Month'])[1]")
	WebElement adSeenBetween_this_month;

	@FindBy(xpath = "(//li[text()='Last Month'])[1]")
	WebElement adSeenBetween_last_month;

	@FindBy(xpath = "(//li[text()='Custom Range'])[1]")
	WebElement adSeenBetween_customrange;
	
	@FindBy(xpath = "//th[@class='prev available']")
	WebElement Custom_Range_Next_Line;

	//	@FindBy(xpath = "(//td[@class='weekend available' and @data-title='r1c0'])[1]")
	@FindBy(xpath="//td[text()='1']")
	WebElement adSeenBetween_Start_range1;

	//	@FindBy(xpath = "//td[@class='available in-range' and @data-title='r4c3' and text()='26']")
	@FindBy(xpath="//td[text()='15']")
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
		Reporter.log("<B><font color = 'green'>  -ShortBy Newest -Ad Seen Between All Step will Start from here  </font> ");
		helper.waitFor(adSeenbetweenfilter);
		helper.highLightElement(driver, adSeenbetweenfilter);
		adSeenbetweenfilter.click();
		Reporter.log("<B><font color = 'orange'> Step4 -</font> Clicked On Ad Seen between filter Icon");

		helper.waitFor(adSeenbetween_all);
		helper.highLightElement(driver, adSeenbetween_all);
		helper.Scrollintoview(adSeenbetween_all);
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

		try {
			Reporter.log(" ");
			Reporter.log("<B><font color ='red'> -1 Ad -</font>  ");
			System.out.println("");
			System.out.println("1 Ads");
			Reporter.log("<B><font color = 'blue'> ==> -</font> Capturing Image Date");
			String imageDate1=date1.getText();
			Reporter.log("<B><font color = 'blue'> ==> -</font> Image Date is :"+imageDate1);
			System.out.println("Current Image Date: "+imageDate1);

			helper.waitFor(ShowAnalytics1);
			helper.highLightElement(driver, ShowAnalytics1);
			helper.jsScrollintoview(ShowAnalytics1);
			ShowAnalytics1.click();
			Reporter.log("<B><font color = 'blue'> ==> -</font> Clicked On Show Analytics Icon");
			helper.waitForPageToLoad();

			String parent1=driver.getWindowHandle();
			Set<String>s1=driver.getWindowHandles();
			Iterator<String> I1= s1.iterator();
			while(I1.hasNext())
			{
				String child_window1=I1.next();
				if(!parent1.equals(child_window1))
				{
					driver.switchTo().window(child_window1);
					helper.waitForPageToLoad();
					System.out.println(driver.switchTo().window(child_window1).getTitle());
					helper.Scrollintoview(lastSeen);
					lastimageDate1 = lastSeen.getText();

					System.out.println("Analytics Image Last Seen Date: "+lastimageDate1);
					Reporter.log("<B><font color = 'blue'> ==> -</font> Image Date of Last Seen is :"+lastimageDate1);
					driver.close();
				}
			}

			driver.switchTo().window(parent1);
			String	date_format_lastseen = null;
			String[] splitString = lastimageDate1.split(" ");
			for(int i=0;i<splitString.length-2;i++) {
				//    String actualDate=splitString[i]; 
				date_format_lastseen= splitString[i+1]+" "+ splitString[i]+" " + splitString[i+2];

				//  System.out.println("splitString : " + splitString[i]);
				System.out.println("Change Date format lastseen Date: " + date_format_lastseen);
				System.out.println("Image last seen Date: " + imageDate1);
			}

			Assert.assertEquals(imageDate1, date_format_lastseen);
			Reporter.log("<B><font color = 'blue'> ==> -</font> Both Last Seen Date are Matching in Assert Pass :"+imageDate1+ " == " +date_format_lastseen);
			System.out.println("Both Last Seen Date are Matching in Assert Pass :"+imageDate1+ " == " +date_format_lastseen);
		} 
		catch (Exception e)
		{

			// TODO: handle exception
			System.out.println("Image is not able: Oops! Looks like we don't have data for this search criteria yet.");

			Reporter.log("<B><font color = 'Red'> ==> -</font> Image is not able: Oops! Looks like we don't have data for this search criteria yet.");
		}

		try {
			String lastimageDate2= null;
			Reporter.log(" ");
			Reporter.log("<B><font color ='red'> -2 Ad -</font>  ");
			System.out.println("");
			System.out.println("2 Ads");
			Reporter.log("<B><font color = 'blue'> ==> -</font> Capturing Image Date");
			String imageDate2=date2.getText();
			Reporter.log("<B><font color = 'blue'> ==> -</font> Image Date is :"+imageDate2);
			System.out.println("Current Image Date: "+imageDate2);

			helper.waitFor(ShowAnalytics2);
			helper.highLightElement(driver, ShowAnalytics2);
			helper.jsScrollintoview(ShowAnalytics2);
			ShowAnalytics2.click();
			Reporter.log("<B><font color = 'blue'> ==> -</font> Clicked On Show Analytics Icon");
			helper.waitForPageToLoad();

			String parent2=driver.getWindowHandle();
			Set<String>s2=driver.getWindowHandles();
			Iterator<String> I2= s2.iterator();
			while(I2.hasNext())
			{
				String child_window2=I2.next();
				if(!parent2.equals(child_window2))
				{
					driver.switchTo().window(child_window2);
					helper.waitForPageToLoad();
					System.out.println(driver.switchTo().window(child_window2).getTitle());
					helper.Scrollintoview(lastSeen);
					lastimageDate2 = lastSeen.getText();
					System.out.println("Analytics Image Last Seen Date: "+lastimageDate2);
					Reporter.log("<B><font color = 'blue'> ==> -</font> Image Date of Last Seen is :"+lastimageDate2);
					driver.close();
				}
			}

			driver.switchTo().window(parent2);
			String	date_format_lastseen2 = null;
			String[] splitString = lastimageDate2.split(" ");
			for(int i=0;i<splitString.length-2;i++) {
				//    String actualDate=splitString[i]; 
				date_format_lastseen2= splitString[i+1]+" "+ splitString[i]+" " + splitString[i+2];

				//  System.out.println("splitString : " + splitString[i]);
				System.out.println("Change Date format lastseen Date: " + date_format_lastseen2);
				System.out.println("Image last seen Date: " + imageDate2);
			}

			Assert.assertEquals(imageDate2, date_format_lastseen2);
			Reporter.log("<B><font color = 'blue'> ==> -</font> Both Last Seen Date are Matching in Assert Pass :"+imageDate2+ " == " +date_format_lastseen2);
			System.out.println("Both Last Seen Date are Matching in Assert Pass :"+imageDate2+ " == " +date_format_lastseen2);
		} 
		catch (Exception e)
		{

			System.out.println("Image is not able: Oops! Looks like we don't have data for this search criteria yet.");

			Reporter.log("<B><font color = 'Red'> ==> -</font> Image is not able: Oops! Looks like we don't have data for this search criteria yet.");
		}

		try {
			String lastimageDate3= null;
			Reporter.log(" ");
			Reporter.log("<B><font color ='red'> -3 Ad -</font>  ");
			System.out.println("");
			System.out.println("3 Ads");
			Reporter.log("<B><font color = 'blue'> ==> -</font> Capturing Image Date");
			String imageDate3=date3.getText();
			Reporter.log("<B><font color = 'blue'> ==> -</font> Image Date is :"+imageDate3);
			System.out.println("Current Image Date: "+imageDate3);

			helper.waitFor(ShowAnalytics3);
			helper.highLightElement(driver, ShowAnalytics3);
			helper.jsScrollintoview(ShowAnalytics3);
			ShowAnalytics3.click();
			Reporter.log("<B><font color = 'blue'> ==> -</font> Clicked On Show Analytics Icon");
			helper.waitForPageToLoad();

			String parent3=driver.getWindowHandle();
			Set<String>s3=driver.getWindowHandles();
			Iterator<String> I3= s3.iterator();
			while(I3.hasNext())
			{
				String child_window3=I3.next();
				if(!parent3.equals(child_window3))
				{
					driver.switchTo().window(child_window3);
					helper.waitForPageToLoad();
					System.out.println(driver.switchTo().window(child_window3).getTitle());
					helper.Scrollintoview(lastSeen);
					helper.jsCLick(lastSeen);
					lastimageDate3 = lastSeen.getText();
					System.out.println("Analytics Image Last Seen Date: "+lastimageDate3);
					Reporter.log("<B><font color = 'blue'> ==> -</font> Image Date of Last Seen is :"+lastimageDate3);
					driver.close();
				}
			}

			driver.switchTo().window(parent3);
			String	date_format_lastseen3 = null;
			String[] splitString = lastimageDate3.split(" ");
			for(int i=0;i<splitString.length-2;i++) {
				//    String actualDate=splitString[i]; 
				date_format_lastseen3= splitString[i+1]+" "+ splitString[i]+" " + splitString[i+2];

				//  System.out.println("splitString : " + splitString[i]);
				System.out.println("Change Date format lastseen Date: " + date_format_lastseen3);
				System.out.println("Image last seen Date: " + imageDate3);
			}

			Assert.assertEquals(imageDate3, date_format_lastseen3);
			Reporter.log("<B><font color = 'blue'> ==> -</font> Both Last Seen Date are Matching in Assert Pass :"+imageDate3+ " == " +date_format_lastseen3);
			System.out.println("Both Last Seen Date are Matching in Assert Pass :"+imageDate3+ " == " +date_format_lastseen3);
		} 
		catch (Exception e)
		{

			System.out.println("Image is not able: Oops! Looks like we don't have data for this search criteria yet.");

			Reporter.log("<B><font color = 'Red'> ==> -</font> Image is not able: Oops! Looks like we don't have data for this search criteria yet.");
		}

		try {
			String lastimageDate4= null;
			Reporter.log(" ");
			Reporter.log("<B><font color ='red'> -4 Ad -</font>  ");
			System.out.println("");
			System.out.println("4 Ads");
			Reporter.log("<B><font color = 'blue'> ==> -</font> Capturing Image Date");
			String imageDate4=date4.getText();
			Reporter.log("<B><font color = 'blue'> ==> -</font> Image Date is :"+imageDate4);
			System.out.println("Current Image Date: "+imageDate4);

			helper.waitFor(ShowAnalytics4);
			helper.highLightElement(driver, ShowAnalytics4);
			helper.jsScrollintoview(ShowAnalytics4);
			ShowAnalytics4.click();
			Reporter.log("<B><font color = 'blue'> ==> -</font> Clicked On Show Analytics Icon");
			helper.waitForPageToLoad();

			String parent4=driver.getWindowHandle();
			Set<String>s4=driver.getWindowHandles();
			Iterator<String> I4= s4.iterator();
			while(I4.hasNext())
			{
				String child_window4=I4.next();
				if(!parent4.equals(child_window4))
				{
					driver.switchTo().window(child_window4);
					helper.waitForPageToLoad();
					System.out.println(driver.switchTo().window(child_window4).getTitle());
					helper.Scrollintoview(lastSeen);
					lastimageDate4 = lastSeen.getText();
					System.out.println("Analytics Image Last Seen Date: "+lastimageDate4);
					Reporter.log("<B><font color = 'blue'> ==> -</font> Image Date of Last Seen is :"+lastimageDate4);
					driver.close();
				}
			}

			driver.switchTo().window(parent4);
			String	date_format_lastseen4 = null;
			String[] splitString = lastimageDate4.split(" ");
			for(int i=0;i<splitString.length-2;i++) {
				//    String actualDate=splitString[i]; 
				date_format_lastseen4= splitString[i+1]+" "+ splitString[i]+" " + splitString[i+2];

				//  System.out.println("splitString : " + splitString[i]);
				System.out.println("Change Date format lastseen Date: " + date_format_lastseen4);
				System.out.println("Image last seen Date: " + imageDate4);
			}

			Assert.assertEquals(imageDate4, date_format_lastseen4);
			Reporter.log("<B><font color = 'blue'> ==> -</font> Both Last Seen Date are Matching in Assert Pass :"+imageDate4+ " == " +date_format_lastseen4);
			System.out.println("Both Last Seen Date are Matching in Assert Pass :"+imageDate4+ " == " +date_format_lastseen4);
		} 
		catch (Exception e)
		{

			// TODO: handle exception
			System.out.println("Image is not able: Oops! Looks like we don't have data for this search criteria yet.");

			Reporter.log("<B><font color = 'Red'> ==> -</font> Image is not able: Oops! Looks like we don't have data for this search criteria yet.");
		}

		try {
			String lastimageDate5= null;
			Reporter.log(" ");
			Reporter.log("<B><font color ='red'> -5 Ad -</font>  ");
			System.out.println("");
			System.out.println("5 Ads");
			Reporter.log("<B><font color = 'blue'> ==> -</font> Capturing Image Date");
			String imageDate5=date5.getText();
			Reporter.log("<B><font color = 'blue'> ==> -</font> Image Date is :"+imageDate5);
			System.out.println("Current Image Date: "+imageDate5);

			helper.waitFor(ShowAnalytics5);
			helper.highLightElement(driver, ShowAnalytics5);
			helper.jsScrollintoview(ShowAnalytics5);
			ShowAnalytics5.click();
			Reporter.log("<B><font color = 'blue'> ==> -</font> Clicked On Show Analytics Icon");
			helper.waitForPageToLoad();

			String parent5=driver.getWindowHandle();
			Set<String>s5=driver.getWindowHandles();
			Iterator<String> I5= s5.iterator();
			while(I5.hasNext())
			{
				String child_window5=I5.next();
				if(!parent5.equals(child_window5))
				{
					driver.switchTo().window(child_window5);
					helper.waitForPageToLoad();
					System.out.println(driver.switchTo().window(child_window5).getTitle());
					helper.Scrollintoview(lastSeen);
					lastimageDate5 = lastSeen.getText();
					System.out.println("Analytics Image Last Seen Date: "+lastimageDate5);
					Reporter.log("<B><font color = 'blue'> ==> -</font> Image Date of Last Seen is :"+lastimageDate5);
					driver.close();
				}
			}

			driver.switchTo().window(parent5);
			String	date_format_lastseen5 = null;
			String[] splitString = lastimageDate5.split(" ");
			for(int i=0;i<splitString.length-2;i++) {
				//    String actualDate=splitString[i]; 
				date_format_lastseen5= splitString[i+1]+" "+ splitString[i]+" " + splitString[i+2];

				//  System.out.println("splitString : " + splitString[i]);
				System.out.println("Change Date format lastseen Date: " + date_format_lastseen5);
				System.out.println("Image last seen Date: " + imageDate5);
			}

			Assert.assertEquals(imageDate5, date_format_lastseen5);
			Reporter.log("<B><font color = 'blue'> ==> -</font> Both Last Seen Date are Matching in Assert Pass :"+imageDate5+ " == " +date_format_lastseen5);
			System.out.println("Both Last Seen Date are Matching in Assert Pass :"+imageDate5+ " == " +date_format_lastseen5);
		} 
		catch (Exception e)
		{

			// TODO: handle exception
			System.out.println("Image is not able: Oops! Looks like we don't have data for this search criteria yet.");

			Reporter.log("<B><font color = 'Red'> ==> -</font> Image is not able: Oops! Looks like we don't have data for this search criteria yet.");
		}		

		try {
			String lastimageDate6= null;
			Reporter.log(" ");
			Reporter.log("<B><font color ='red'> -6 Ad -</font>  ");
			System.out.println("");
			System.out.println("6 Ads");
			Reporter.log("<B><font color = 'blue'> ==> -</font> Capturing Image Date");
			String imageDate6=date6.getText();
			Reporter.log("<B><font color = 'blue'> ==> -</font> Image Date is :"+imageDate6);
			System.out.println("Current Image Date: "+imageDate6);

			helper.waitFor(ShowAnalytics6);
			helper.highLightElement(driver, ShowAnalytics6);
			helper.jsScrollintoview(ShowAnalytics6);
			ShowAnalytics6.click();
			Reporter.log("<B><font color = 'blue'> ==> -</font> Clicked On Show Analytics Icon");
			helper.waitForPageToLoad();

			String parent6=driver.getWindowHandle();
			Set<String>s6=driver.getWindowHandles();
			Iterator<String> I6= s6.iterator();
			while(I6.hasNext())
			{
				String child_window6=I6.next();
				if(!parent6.equals(child_window6))
				{
					driver.switchTo().window(child_window6);
					helper.waitForPageToLoad();
					System.out.println(driver.switchTo().window(child_window6).getTitle());
					helper.Scrollintoview(lastSeen);
					lastimageDate6 = lastSeen.getText();
					System.out.println("Analytics Image Last Seen Date: "+lastimageDate6);
					Reporter.log("<B><font color = 'blue'> ==> -</font> Image Date of Last Seen is :"+lastimageDate6);
					driver.close();
				}
			}

			driver.switchTo().window(parent6);
			String	date_format_lastseen6 = null;
			String[] splitString = lastimageDate6.split(" ");
			for(int i=0;i<splitString.length-2;i++) {
				//    String actualDate=splitString[i]; 
				date_format_lastseen6= splitString[i+1]+" "+ splitString[i]+" " + splitString[i+2];

				//  System.out.println("splitString : " + splitString[i]);
				System.out.println("Change Date format lastseen Date: " + date_format_lastseen6);
				System.out.println("Image last seen Date: " + imageDate6);
			}

			Assert.assertEquals(imageDate6, date_format_lastseen6);
			Reporter.log("<B><font color = 'blue'> ==> -</font> Both Last Seen Date are Matching in Assert Pass :"+imageDate6+ " == " +date_format_lastseen6);
			System.out.println("Both Last Seen Date are Matching in Assert Pass :"+imageDate6+ " == " +date_format_lastseen6);
		} 
		catch (Exception e)
		{

			// TODO: handle exception
			System.out.println("Image is not able: Oops! Looks like we don't have data for this search criteria yet.");

			Reporter.log("<B><font color = 'Red'> ==> -</font> Image is not able: Oops! Looks like we don't have data for this search criteria yet.");
		}

		try {
			String lastimageDate7= null;
			Reporter.log(" ");
			Reporter.log("<B><font color ='red'> -7 Ad -</font>  ");
			System.out.println("");
			System.out.println("7 Ads");
			Reporter.log("<B><font color = 'blue'> ==> -</font> Capturing Image Date");
			String imageDate7=date7.getText();
			Reporter.log("<B><font color = 'blue'> ==> -</font> Image Date is :"+imageDate7);
			System.out.println("Current Image Date: "+imageDate7);

			helper.waitFor(ShowAnalytics7);
			helper.highLightElement(driver, ShowAnalytics7);
			helper.jsScrollintoview(ShowAnalytics7);
			ShowAnalytics7.click();
			Reporter.log("<B><font color = 'blue'> ==> -</font> Clicked On Show Analytics Icon");
			helper.waitForPageToLoad();

			String parent7=driver.getWindowHandle();
			Set<String>s7=driver.getWindowHandles();
			Iterator<String> I7= s7.iterator();
			while(I7.hasNext())
			{
				String child_window7=I7.next();
				if(!parent7.equals(child_window7))
				{
					driver.switchTo().window(child_window7);
					helper.waitForPageToLoad();
					System.out.println(driver.switchTo().window(child_window7).getTitle());
					helper.jsScrollintoview(lastSeen);
					lastimageDate7 = lastSeen.getText();
					System.out.println("Analytics Image Last Seen Date: "+lastimageDate7);
					Reporter.log("<B><font color = 'blue'> ==> -</font> Image Date of Last Seen is :"+lastimageDate7);
					driver.close();
				}
			}

			driver.switchTo().window(parent7);
			String	date_format_lastseen7 = null;
			String[] splitString = lastimageDate7.split(" ");
			for(int i=0;i<splitString.length-2;i++) {
				//    String actualDate=splitString[i]; 
				date_format_lastseen7= splitString[i+1]+" "+ splitString[i]+" " + splitString[i+2];

				//  System.out.println("splitString : " + splitString[i]);
				System.out.println("Change Date format lastseen Date: " + date_format_lastseen7);
				System.out.println("Image last seen Date: " + imageDate7);
			}

			Assert.assertEquals(imageDate7, date_format_lastseen7);
			Reporter.log("<B><font color = 'blue'> ==> -</font> Both Last Seen Date are Matching in Assert Pass :"+imageDate7+ " == " +date_format_lastseen7);
			System.out.println("Both Last Seen Date are Matching in Assert Pass :"+imageDate7+ " == " +date_format_lastseen7);
		} 
		catch (Exception e)
		{

			// TODO: handle exception
			System.out.println("Image is not able: Oops! Looks like we don't have data for this search criteria yet.");

			Reporter.log("<B><font color = 'Red'> ==> -</font> Image is not able: Oops! Looks like we don't have data for this search criteria yet.");
		}

		try {
			String lastimageDate8= null;
			Reporter.log(" ");
			Reporter.log("<B><font color ='red'> -8 Ad -</font>  ");
			System.out.println("");
			System.out.println("8 Ads");
			Reporter.log("<B><font color = 'blue'> ==> -</font> Capturing Image Date");

			String imageDate8=date8.getText();
			Reporter.log("<B><font color = 'blue'> ==> -</font> Image Date is :"+imageDate8);
			System.out.println("Current Image Date: "+imageDate8);

			helper.waitFor(ShowAnalytics8);
			helper.highLightElement(driver, ShowAnalytics8);
			helper.jsScrollintoview(ShowAnalytics8);

			ShowAnalytics8.click();
			Reporter.log("<B><font color = 'blue'> ==> -</font> Clicked On Show Analytics Icon");
			helper.waitForPageToLoad();

			String parent8=driver.getWindowHandle();
			Set<String>s8=driver.getWindowHandles();
			Iterator<String> I8= s8.iterator();
			while(I8.hasNext())
			{
				String child_window8=I8.next();
				if(!parent8.equals(child_window8))
				{
					driver.switchTo().window(child_window8);
					helper.waitForPageToLoad();
					System.out.println(driver.switchTo().window(child_window8).getTitle());
					helper.jsScrollintoview(lastSeen);
					lastimageDate8 = lastSeen.getText();
					System.out.println("Analytics Image Last Seen Date: "+lastimageDate8);
					Reporter.log("<B><font color = 'blue'> ==> -</font> Image Date of Last Seen is :"+lastimageDate8);
					driver.close();
				}
			}

			driver.switchTo().window(parent8);
			String	date_format_lastseen8 = null;
			String[] splitString = lastimageDate8.split(" ");
			for(int i=0;i<splitString.length-2;i++) {
				//    String actualDate=splitString[i]; 
				date_format_lastseen8= splitString[i+1]+" "+ splitString[i]+" " + splitString[i+2];

				//  System.out.println("splitString : " + splitString[i]);
				System.out.println("Change Date format lastseen Date: " + date_format_lastseen8);
				System.out.println("Image last seen Date: " + imageDate8);
			}

			Assert.assertEquals(imageDate8, date_format_lastseen8);
			Reporter.log("<B><font color = 'blue'> ==> -</font> Both Last Seen Date are Matching in Assert Pass :"+imageDate8+ " == " +date_format_lastseen8);
			System.out.println("Both Last Seen Date are Matching in Assert Pass :"+imageDate8+ " == " +date_format_lastseen8);
		} 
		catch (Exception e)
		{

			// TODO: handle exception
			System.out.println("Image is not able: Oops! Looks like we don't have data for this search criteria yet.");

			Reporter.log("<B><font color = 'Red'> ==> -</font> Image is not able: Oops! Looks like we don't have data for this search criteria yet.");
		}		

		try {
			String lastimageDate9= null;
			Reporter.log(" ");
			Reporter.log("<B><font color ='red'> -9 Ad -</font>  ");
			System.out.println("");
			System.out.println("9 Ads");
			Reporter.log("<B><font color = 'blue'> ==> -</font> Capturing Image Date");
			String imageDate9=date9.getText();
			Reporter.log("<B><font color = 'blue'> ==> -</font> Image Date is :"+imageDate9);
			System.out.println("Current Image Date: "+imageDate9);

			helper.waitFor(ShowAnalytics9);
			helper.highLightElement(driver, ShowAnalytics9);
			helper.jsScrollintoview(ShowAnalytics9);
			ShowAnalytics9.click();
			Reporter.log("<B><font color = 'blue'> ==> -</font> Clicked On Show Analytics Icon");
			helper.waitForPageToLoad();

			String parent9=driver.getWindowHandle();
			Set<String>s9=driver.getWindowHandles();
			Iterator<String> I9= s9.iterator();
			while(I9.hasNext())
			{
				String child_window9=I9.next();
				if(!parent9.equals(child_window9))
				{
					driver.switchTo().window(child_window9);
					helper.waitForPageToLoad();
					System.out.println(driver.switchTo().window(child_window9).getTitle());
					helper.jsScrollintoview(lastSeen);
					lastimageDate9 = lastSeen.getText();
					System.out.println("Analytics Image Last Seen Date: "+lastimageDate9);
					Reporter.log("<B><font color = 'blue'> ==> -</font> Image Date of Last Seen is :"+lastimageDate9);
					driver.close();
				}
			}

			driver.switchTo().window(parent9);
			String	date_format_lastseen9 = null;
			String[] splitString = lastimageDate9.split(" ");
			for(int i=0;i<splitString.length-2;i++) {
				//    String actualDate=splitString[i]; 
				date_format_lastseen9= splitString[i+1]+" "+ splitString[i]+" " + splitString[i+2];

				//  System.out.println("splitString : " + splitString[i]);
				System.out.println("Change Date format lastseen Date: " + date_format_lastseen9);
				System.out.println("Image last seen Date: " + imageDate9);
			}

			Assert.assertEquals(imageDate9, date_format_lastseen9);
			Reporter.log("<B><font color = 'blue'> ==> -</font> Both Last Seen Date are Matching in Assert Pass :"+imageDate9+ " == " +date_format_lastseen9);
			System.out.println("Both Last Seen Date are Matching in Assert Pass :"+imageDate9+ " == " +date_format_lastseen9);
		} 
		catch (Exception e)
		{

			System.out.println("Image is not able: Oops! Looks like we don't have data for this search criteria yet.");

			Reporter.log("<B><font color = 'Red'> ==> -</font> Image is not able: Oops! Looks like we don't have data for this search criteria yet.");
		}		


		try {
			String lastimageDate10= null;
			Reporter.log(" ");
			Reporter.log("<B><font color ='red'> -10 Ad -</font>  ");
			System.out.println("");
			System.out.println("10 Ads");
			Reporter.log("<B><font color = 'blue'> ==> -</font> Capturing Image Date");
			String imageDate10=date10.getText();
			Reporter.log("<B><font color = 'blue'> ==> -</font> Image Date is :"+imageDate10);
			System.out.println("Current Image Date: "+imageDate10);

			helper.waitFor(ShowAnalytics10);
			helper.highLightElement(driver, ShowAnalytics10);
			helper.jsScrollintoview(ShowAnalytics10);
			ShowAnalytics10.click();
			Reporter.log("<B><font color = 'blue'> ==> -</font> Clicked On Show Analytics Icon");
			helper.waitForPageToLoad();

			String parent10=driver.getWindowHandle();
			Set<String>s10=driver.getWindowHandles();
			Iterator<String> I10= s10.iterator();
			while(I10.hasNext())
			{
				String child_window10=I10.next();
				if(!parent10.equals(child_window10))
				{
					driver.switchTo().window(child_window10);
					helper.waitForPageToLoad();
					System.out.println(driver.switchTo().window(child_window10).getTitle());
					helper.jsScrollintoview(lastSeen);
					lastimageDate10 = lastSeen.getText();
					System.out.println("Analytics Image Last Seen Date: "+lastimageDate10);
					Reporter.log("<B><font color = 'blue'> ==> -</font> Image Date of Last Seen is :"+lastimageDate10);
					driver.close();
				}
			}

			driver.switchTo().window(parent10);
			String	date_format_lastseen10 = null;
			String[] splitString = lastimageDate10.split(" ");
			for(int i=0;i<splitString.length-2;i++) {
				//    String actualDate=splitString[i]; 
				date_format_lastseen10= splitString[i+1]+" "+ splitString[i]+" " + splitString[i+2];

				//  System.out.println("splitString : " + splitString[i]);
				System.out.println("Change Date format lastseen Date: " + date_format_lastseen10);
				System.out.println("Image last seen Date: " + imageDate10);
			}

			Assert.assertEquals(imageDate10, date_format_lastseen10);
			Reporter.log("<B><font color = 'blue'> ==> -</font> Both Last Seen Date are Matching in Assert Pass :"+imageDate10+ " == " +date_format_lastseen10);
			System.out.println("Both Last Seen Date are Matching in Assert Pass :"+imageDate10+ " == " +date_format_lastseen10);
		} 
		catch (Exception e)
		{

			System.out.println("Image is not able: Oops! Looks like we don't have data for this search criteria yet.");

			Reporter.log("<B><font color = 'Red'> ==> -</font> Image is not able: Oops! Looks like we don't have data for this search criteria yet.");
		}		

		try {
			String lastimageDate11= null;
			Reporter.log(" ");
			Reporter.log("<B><font color ='red'> -11 Ad -</font>  ");
			System.out.println("");
			System.out.println("11 Ads");
			Reporter.log("<B><font color = 'blue'> ==> -</font> Capturing Image Date");
			String imageDate11=date11.getText();
			Reporter.log("<B><font color = 'blue'> ==> -</font> Image Date is :"+imageDate11);
			System.out.println("Current Image Date: "+imageDate11);

			helper.waitFor(ShowAnalytics11);
			helper.highLightElement(driver, ShowAnalytics11);
			helper.jsScrollintoview(ShowAnalytics11);
			ShowAnalytics11.click();
			Reporter.log("<B><font color = 'blue'> ==> -</font> Clicked On Show Analytics Icon");
			helper.waitForPageToLoad();

			String parent11=driver.getWindowHandle();
			Set<String>s11=driver.getWindowHandles();
			Iterator<String> I11= s11.iterator();
			while(I11.hasNext())
			{
				String child_window11=I11.next();
				if(!parent11.equals(child_window11))
				{
					driver.switchTo().window(child_window11);
					helper.waitForPageToLoad();
					System.out.println(driver.switchTo().window(child_window11).getTitle());
					helper.jsScrollintoview(lastSeen);
					lastimageDate11 = lastSeen.getText();
					System.out.println("Analytics Image Last Seen Date: "+lastimageDate11);
					Reporter.log("<B><font color = 'blue'> ==> -</font> Image Date of Last Seen is :"+lastimageDate11);
					driver.close();
				}
			}

			driver.switchTo().window(parent11);
			String	date_format_lastseen11 = null;
			String[] splitString = lastimageDate11.split(" ");
			for(int i=0;i<splitString.length-2;i++) {
				//    String actualDate=splitString[i]; 
				date_format_lastseen11= splitString[i+1]+" "+ splitString[i]+" " + splitString[i+2];

				//  System.out.println("splitString : " + splitString[i]);
				System.out.println("Change Date format lastseen Date: " + date_format_lastseen11);
				System.out.println("Image last seen Date: " + imageDate11);
			}

			Assert.assertEquals(imageDate11, date_format_lastseen11);
			Reporter.log("<B><font color = 'blue'> ==> -</font> Both Last Seen Date are Matching in Assert Pass :"+imageDate11+ " == " +date_format_lastseen11);
			System.out.println("Both Last Seen Date are Matching in Assert Pass :"+imageDate11+ " == " +date_format_lastseen11);
		} 
		catch (Exception e)
		{

			System.out.println("Image is not able: Oops! Looks like we don't have data for this search criteria yet.");

			Reporter.log("<B><font color = 'Red'> ==> -</font> Image is not able: Oops! Looks like we don't have data for this search criteria yet.");
		}		

		try {
			String lastimageDate12= null;
			Reporter.log(" ");
			Reporter.log("<B><font color ='red'> -12 Ad -</font>  ");
			System.out.println("");
			System.out.println("12 Ads");
			Reporter.log("<B><font color = 'blue'> ==> -</font> Capturing Image Date");
			String imageDate12=date12.getText();
			Reporter.log("<B><font color = 'blue'> ==> -</font> Image Date is :"+imageDate12);
			System.out.println("Current Image Date: "+imageDate12);

			helper.waitFor(ShowAnalytics12);
			helper.highLightElement(driver, ShowAnalytics12);
			helper.jsScrollintoview(ShowAnalytics12);
			ShowAnalytics12.click();
			Reporter.log("<B><font color = 'blue'> ==> -</font> Clicked On Show Analytics Icon");
			helper.waitForPageToLoad();

			String parent12=driver.getWindowHandle();
			Set<String>s12=driver.getWindowHandles();
			Iterator<String> I12= s12.iterator();
			while(I12.hasNext())
			{
				String child_window12=I12.next();
				if(!parent12.equals(child_window12))
				{
					driver.switchTo().window(child_window12);
					helper.waitForPageToLoad();
					System.out.println(driver.switchTo().window(child_window12).getTitle());
					helper.jsScrollintoview(lastSeen);
					lastimageDate12 = lastSeen.getText();
					System.out.println("Analytics Image Last Seen Date: "+lastimageDate12);
					Reporter.log("<B><font color = 'blue'> ==> -</font> Image Date of Last Seen is :"+lastimageDate12);
					driver.close();
				}
			}

			driver.switchTo().window(parent12);
			String	date_format_lastseen12 = null;
			String[] splitString = lastimageDate12.split(" ");
			for(int i=0;i<splitString.length-2;i++) {
				//    String actualDate=splitString[i]; 
				date_format_lastseen12= splitString[i+1]+" "+ splitString[i]+" " + splitString[i+2];

				//  System.out.println("splitString : " + splitString[i]);
				System.out.println("Change Date format lastseen Date: " + date_format_lastseen12);
				System.out.println("Image last seen Date: " + imageDate12);
			}

			Assert.assertEquals(imageDate12, date_format_lastseen12);
			Reporter.log("<B><font color = 'blue'> ==> -</font> Both Last Seen Date are Matching in Assert Pass :"+imageDate12+ " == " +date_format_lastseen12);
			System.out.println("Both Last Seen Date are Matching in Assert Pass :"+imageDate12+ " == " +date_format_lastseen12);
		} 
		catch (Exception e)
		{

			// TODO: handle exception
			System.out.println("Image is not able: Oops! Looks like we don't have data for this search criteria yet.");

			Reporter.log("<B><font color = 'Red'> ==> -</font> Image is not able: Oops! Looks like we don't have data for this search criteria yet.");
		}

		try {
			String lastimageDate13= null;
			Reporter.log(" ");
			Reporter.log("<B><font color ='red'> -13 Ad -</font>  ");
			System.out.println("");
			System.out.println("13 Ads");
			Reporter.log("<B><font color = 'blue'> ==> -</font> Capturing Image Date");
			String imageDate13=date13.getText();
			Reporter.log("<B><font color = 'blue'> ==> -</font> Image Date is :"+imageDate13);
			System.out.println("Current Image Date: "+imageDate13);

			helper.waitFor(ShowAnalytics13);
			helper.highLightElement(driver, ShowAnalytics13);
			helper.jsScrollintoview(ShowAnalytics13);
			ShowAnalytics13.click();
			Reporter.log("<B><font color = 'blue'> ==> -</font> Clicked On Show Analytics Icon");
			helper.waitForPageToLoad();

			String parent13=driver.getWindowHandle();
			Set<String>s13=driver.getWindowHandles();
			Iterator<String> I13= s13.iterator();
			while(I13.hasNext())
			{
				String child_window13=I13.next();
				if(!parent13.equals(child_window13))
				{
					driver.switchTo().window(child_window13);
					helper.waitForPageToLoad();
					System.out.println(driver.switchTo().window(child_window13).getTitle());
					helper.jsScrollintoview(lastSeen);
					lastimageDate13 = lastSeen.getText();
					System.out.println("Analytics Image Last Seen Date: "+lastimageDate13);
					Reporter.log("<B><font color = 'blue'> ==> -</font> Image Date of Last Seen is :"+lastimageDate13);
					driver.close();
				}
			}

			driver.switchTo().window(parent13);
			String	date_format_lastseen13 = null;
			String[] splitString = lastimageDate13.split(" ");
			for(int i=0;i<splitString.length-2;i++) {
				//    String actualDate=splitString[i]; 
				date_format_lastseen13= splitString[i+1]+" "+ splitString[i]+" " + splitString[i+2];

				//  System.out.println("splitString : " + splitString[i]);
				System.out.println("Change Date format lastseen Date: " + date_format_lastseen13);
				System.out.println("Image last seen Date: " + imageDate13);
			}

			Assert.assertEquals(imageDate13, date_format_lastseen13);
			Reporter.log("<B><font color = 'blue'> ==> -</font> Both Last Seen Date are Matching in Assert Pass :"+imageDate13+ " == " +date_format_lastseen13);
			System.out.println("Both Last Seen Date are Matching in Assert Pass :"+imageDate13+ " == " +date_format_lastseen13);
		} 
		catch (Exception e)
		{

			// TODO: handle exception
			System.out.println("Image is not able: Oops! Looks like we don't have data for this search criteria yet.");

			Reporter.log("<B><font color = 'Red'> ==> -</font> Image is not able: Oops! Looks like we don't have data for this search criteria yet.");
		}

		try {
			String lastimageDate14= null;
			Reporter.log(" ");
			Reporter.log("<B><font color ='red'> -14 Ad -</font>  ");
			System.out.println("");
			System.out.println("14 Ads");
			Reporter.log("<B><font color = 'blue'> ==> -</font> Capturing Image Date");
			String imageDate14=date14.getText();
			Reporter.log("<B><font color = 'blue'> ==> -</font> Image Date is :"+imageDate14);
			System.out.println("Current Image Date: "+imageDate14);

			helper.waitFor(ShowAnalytics14);
			helper.highLightElement(driver, ShowAnalytics14);
			helper.jsScrollintoview(ShowAnalytics14);
			ShowAnalytics14.click();
			Reporter.log("<B><font color = 'blue'> ==> -</font> Clicked On Show Analytics Icon");
			helper.waitForPageToLoad();

			String parent14=driver.getWindowHandle();
			Set<String>s14=driver.getWindowHandles();
			Iterator<String> I14= s14.iterator();
			while(I14.hasNext())
			{
				String child_window14=I14.next();
				if(!parent14.equals(child_window14))
				{
					driver.switchTo().window(child_window14);
					helper.waitForPageToLoad();
					System.out.println(driver.switchTo().window(child_window14).getTitle());
					helper.Scrollintoview(lastSeen);
					lastimageDate14 = lastSeen.getText();
					System.out.println("Analytics Image Last Seen Date: "+lastimageDate14);
					Reporter.log("<B><font color = 'blue'> ==> -</font> Image Date of Last Seen is :"+lastimageDate14);
					driver.close();
				}
			}

			driver.switchTo().window(parent14);
			String	date_format_lastseen14 = null;
			String[] splitString = lastimageDate14.split(" ");
			for(int i=0;i<splitString.length-2;i++) {
				//    String actualDate=splitString[i]; 
				date_format_lastseen14= splitString[i+1]+" "+ splitString[i]+" " + splitString[i+2];

				//  System.out.println("splitString : " + splitString[i]);
				System.out.println("Change Date format lastseen Date: " + date_format_lastseen14);
				System.out.println("Image last seen Date: " + imageDate14);
			}

			Assert.assertEquals(imageDate14, date_format_lastseen14);
			Reporter.log("<B><font color = 'blue'> ==> -</font> Both Last Seen Date are Matching in Assert Pass :"+imageDate14+ " == " +date_format_lastseen14);
			System.out.println("Both Last Seen Date are Matching in Assert Pass :"+imageDate14+ " == " +date_format_lastseen14);
		} 
		catch (Exception e)
		{

			// TODO: handle exception
			System.out.println("Image is not able: Oops! Looks like we don't have data for this search criteria yet.");

			Reporter.log("<B><font color = 'Red'> ==> -</font> Image is not able: Oops! Looks like we don't have data for this search criteria yet.");
		}

		try {
			String lastimageDate15= null;
			Reporter.log(" ");
			Reporter.log("<B><font color ='red'> -15 Ad -</font>  ");
			System.out.println("");
			System.out.println("15 Ads");
			Reporter.log("<B><font color = 'blue'> ==> -</font> Capturing Image Date");
			String imageDate15=date15.getText();
			Reporter.log("<B><font color = 'blue'> ==> -</font> Image Date is :"+imageDate15);
			System.out.println("Current Image Date: "+imageDate15);

			helper.waitFor(ShowAnalytics15);
			helper.highLightElement(driver, ShowAnalytics15);
			helper.jsScrollintoview(ShowAnalytics15);
			ShowAnalytics15.click();
			Reporter.log("<B><font color = 'blue'> ==> -</font> Clicked On Show Analytics Icon");
			helper.waitForPageToLoad();

			String parent15=driver.getWindowHandle();
			Set<String>s15=driver.getWindowHandles();
			Iterator<String> I15= s15.iterator();
			while(I15.hasNext())
			{
				String child_window15=I15.next();
				if(!parent15.equals(child_window15))
				{
					driver.switchTo().window(child_window15);
					helper.waitForPageToLoad();
					System.out.println(driver.switchTo().window(child_window15).getTitle());
					helper.Scrollintoview(lastSeen);
					lastimageDate15 = lastSeen.getText();
					System.out.println("Analytics Image Last Seen Date: "+lastimageDate15);
					Reporter.log("<B><font color = 'blue'> ==> -</font> Image Date of Last Seen is :"+lastimageDate15);
					driver.close();
				}
			}

			driver.switchTo().window(parent15);
			String	date_format_lastseen15 = null;
			String[] splitString = lastimageDate15.split(" ");
			for(int i=0;i<splitString.length-2;i++) {
				//    String actualDate=splitString[i]; 
				date_format_lastseen15= splitString[i+1]+" "+ splitString[i]+" " + splitString[i+2];

				//  System.out.println("splitString : " + splitString[i]);
				System.out.println("Change Date format lastseen Date: " + date_format_lastseen15);
				System.out.println("Image last seen Date: " + imageDate15);
			}

			Assert.assertEquals(imageDate15, date_format_lastseen15);
			Reporter.log("<B><font color = 'blue'> ==> -</font> Both Last Seen Date are Matching in Assert Pass :"+imageDate15+ " == " +date_format_lastseen15);
			System.out.println("Both Last Seen Date are Matching in Assert Pass :"+imageDate15+ " == " +date_format_lastseen15);
		} 
		catch (Exception e)
		{

			// TODO: handle exception
			System.out.println("Image is not able: Oops! Looks like we don't have data for this search criteria yet.");

			Reporter.log("<B><font color = 'Red'> ==> -</font> Image is not able: Oops! Looks like we don't have data for this search criteria yet.");
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

	
		helper.waitForPageToLoad();

		Reporter.log(" ");
		Reporter.log("<B><font color = 'green'> -ShortBy Newest -Ad Seen Between Today Step will Start from here </font> ");
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

		try {

			Reporter.log(" ");
			Reporter.log("<B><font color ='red'> -1 Ad -</font>  ");
			System.out.println("");
			System.out.println("1 Ads");
			Reporter.log("<B><font color = 'blue'> ==> -</font> Capturing Image Date");
			String  imageDate1= date1.getText();
			Reporter.log("<B><font color = 'blue'> ==> -</font> Image Date is :"+imageDate1);
			System.out.println("Current Date: "+imageDate1);

			helper.waitFor(ShowAnalytics1);
			helper.highLightElement(driver, ShowAnalytics1);
			helper.jsScrollintoview(ShowAnalytics1);
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
			String lastSeenDate_today1 = lastSeen.getText();
			Reporter.log("<B><font color = 'blue'> ==> -</font> Last_Seen_childWindow AdDetails Page= " +  lastSeenDate_today1);
			System.out.println("lastSeenDate_today: "+lastSeenDate_today1);


			driver.close();

			driver.switchTo().window(parent1);
			//    System.out.println("lastSeenDate_today: "+lastSeenDate_today);


			String joinString1 = null;
			//  String[] actualDate = null;

			String[] splitString = lastSeenDate_today1.split(" ");
			for(int i=0;i<splitString.length-2;i++) {
				String actualDate=splitString[i]; 
				joinString1= splitString[i+1]+" "+ splitString[i]+" " + splitString[i+2];
				//  System.out.println("splitString : " + splitString[i]);
				System.out.println("lastseen Date in child Window: " + joinString1);
			}
			Assert.assertEquals(imageDate1, joinString1);
			Reporter.log("<B><font color = 'blue'> ==> -</font> Both Last Seen Date are Matching in Assert Pass :"+imageDate1+ " == " +joinString1);
			System.out.println("Both Last Seen Date are Matching in Assert Pass :"+imageDate1+ " == " +joinString1);
		}
		catch(Exception e) {
			System.out.println("Image is not able: Oops! Looks like we don't have data for this search criteria yet.");

			Reporter.log("<B><font color = 'Red'> ==> -</font> Image is not able: Oops! Looks like we don't have data for this search criteria yet.");
		}


		try {

			Reporter.log(" ");
			Reporter.log("<B><font color ='red'> -2 Ad -</font>  ");
			System.out.println("");
			System.out.println("2 Ads");
			Reporter.log("<B><font color = 'blue'> ==> -</font> Capturing Image Date");
			String  imageDate2= date2.getText();
			Reporter.log("<B><font color = 'blue'> ==> -</font> Image Date is :"+imageDate2);
			System.out.println("Current Date: "+imageDate2);

			helper.waitFor(ShowAnalytics2);
			helper.highLightElement(driver, ShowAnalytics2);
			helper.jsScrollintoview(ShowAnalytics2);
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
			String lastSeenDate_today2 = lastSeen.getText();
			Reporter.log("<B><font color = 'blue'> ==> -</font> Last_Seen_childWindow AdDetails Page= " + lastSeenDate_today2);
			System.out.println("lastSeenDate_today: "+lastSeenDate_today2);


			driver.close();

			driver.switchTo().window(parent2);
			//    System.out.println("lastSeenDate_today: "+lastSeenDate_today);


			String joinString2 = null;
			//  String[] actualDate = null;

			String[] splitString = lastSeenDate_today2.split(" ");
			for(int i=0;i<splitString.length-2;i++) {
				String actualDate=splitString[i]; 
				joinString2= splitString[i+1]+" "+ splitString[i]+" " + splitString[i+2];
				//  System.out.println("splitString : " + splitString[i]);
				System.out.println("lastseen Date in child Window: " + joinString2);
			}
			Assert.assertEquals(imageDate2, joinString2);
			Reporter.log("<B><font color = 'blue'> ==> -</font> Both Last Seen Date are Matching in Assert Pass :"+imageDate2+ " == " +joinString2);
			System.out.println("Both Last Seen Date are Matching in Assert Pass :"+imageDate2+ " == " +joinString2);
		}
		catch(Exception e) {
			System.out.println("Image is not able: Oops! Looks like we don't have data for this search criteria yet.");

			Reporter.log("<B><font color = 'Red'> ==> -</font> Image is not able: Oops! Looks like we don't have data for this search criteria yet.");
		}

		try {
			Reporter.log(" ");
			Reporter.log("<B><font color ='red'> -3 Ad -</font>  ");
			System.out.println("");
			System.out.println("3 Ads");
			Reporter.log("<B><font color = 'blue'> ==> -</font> Capturing Image Date");

			String  imageDate3= date3.getText();
			Reporter.log("<B><font color = 'blue'> ==> -</font> Image Date is :"+imageDate3);
			System.out.println("Current Date: "+imageDate3);

			helper.waitFor(ShowAnalytics3);
			helper.highLightElement(driver, ShowAnalytics3);
			helper.jsScrollintoview(ShowAnalytics3);
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
			String lastSeenDate_today3 = lastSeen.getText();
			Reporter.log("<B><font color = 'blue'> ==> -</font> Last_Seen_childWindow AdDetails Page= " +  lastSeenDate_today3);
			System.out.println("lastSeenDate_today: "+lastSeenDate_today3);


			driver.close();

			driver.switchTo().window(parent3);
			//    System.out.println("lastSeenDate_today: "+lastSeenDate_today);


			String joinString3 = null;
			//  String[] actualDate = null;

			String[] splitString = lastSeenDate_today3.split(" ");
			for(int i=0;i<splitString.length-2;i++) {
				String actualDate=splitString[i]; 
				joinString3= splitString[i+1]+" "+ splitString[i]+" " + splitString[i+2];
				//  System.out.println("splitString : " + splitString[i]);
				System.out.println("lastseen Date in child Window: " + joinString3);
			}
			Assert.assertEquals(imageDate3, joinString3);
			Reporter.log("<B><font color = 'blue'> ==> -</font> Both Last Seen Date are Matching in Assert Pass :"+imageDate3+ " == " +joinString3);
			System.out.println("Both Last Seen Date are Matching in Assert Pass :"+imageDate3+ " == " +joinString3);
		}
		catch(Exception e) {
			System.out.println("Image is not able: Oops! Looks like we don't have data for this search criteria yet.");

			Reporter.log("<B><font color = 'Red'> ==> -</font> Image is not able: Oops! Looks like we don't have data for this search criteria yet.");
		}

		try {
			Reporter.log(" ");
			Reporter.log("<B><font color ='red'> -4 Ad -</font>  ");
			System.out.println("");
			System.out.println("4 Ads");
			Reporter.log("<B><font color = 'blue'> ==> -</font> Capturing Image Date");
			String  imageDate4= date4.getText();
			Reporter.log("<B><font color = 'blue'> ==> -</font> Image Date is :"+imageDate4);
			System.out.println("Current Date: "+imageDate4);

			helper.waitFor(ShowAnalytics4);
			helper.highLightElement(driver, ShowAnalytics4);
			helper.jsScrollintoview(ShowAnalytics4);
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
			String lastSeenDate_today4 = lastSeen.getText();
			Reporter.log("<B><font color = 'blue'> ==> -</font> Last_Seen_childWindow AdDetails Page= " +  lastSeenDate_today4);
			System.out.println("lastSeenDate_today: "+lastSeenDate_today4);


			driver.close();

			driver.switchTo().window(parent4);
			//    System.out.println("lastSeenDate_today: "+lastSeenDate_today);


			String joinString4 = null;
			//  String[] actualDate = null;

			String[] splitString = lastSeenDate_today4.split(" ");
			for(int i=0;i<splitString.length-2;i++) {
				String actualDate=splitString[i]; 
				joinString4= splitString[i+1]+" "+ splitString[i]+" " + splitString[i+2];
				//  System.out.println("splitString : " + splitString[i]);
				System.out.println("lastseen Date in child Window: " + joinString4);
			}
			Assert.assertEquals(imageDate4, joinString4);
			Reporter.log("<B><font color = 'blue'> ==> -</font> Both Last Seen Date are Matching in Assert Pass :"+imageDate4+ " == " +joinString4);
			System.out.println("Both Last Seen Date are Matching in Assert Pass :"+imageDate4+ " == " +joinString4);
		}
		catch(Exception e) {
			System.out.println("Image is not able: Oops! Looks like we don't have data for this search criteria yet.");

			Reporter.log("<B><font color = 'Red'> ==> -</font> Image is not able: Oops! Looks like we don't have data for this search criteria yet.");
		}

		try {
			Reporter.log(" ");
			Reporter.log("<B><font color ='red'> -5 Ad -</font>  ");
			System.out.println("");
			System.out.println("5 Ads");
			Reporter.log("<B><font color = 'blue'> ==> -</font> Capturing Image Date");
			String  imageDate5= date5.getText();
			Reporter.log("<B><font color = 'blue'> ==> -</font> Image Date is :"+imageDate5);
			System.out.println("Current Date: "+imageDate5);

			helper.waitFor(ShowAnalytics5);
			helper.highLightElement(driver, ShowAnalytics5);
			helper.jsScrollintoview(ShowAnalytics5);
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
			String lastSeenDate_today5 = lastSeen.getText();
			Reporter.log("<B><font color = 'blue'> ==> -</font> Last_Seen_childWindow AdDetails Page= " +  lastSeenDate_today5);
			System.out.println("lastSeenDate_today: "+lastSeenDate_today5);


			driver.close();

			driver.switchTo().window(parent5);
			//    System.out.println("lastSeenDate_today: "+lastSeenDate_today);


			String joinString5 = null;
			//  String[] actualDate = null;

			String[] splitString = lastSeenDate_today5.split(" ");
			for(int i=0;i<splitString.length-2;i++) {
				String actualDate=splitString[i]; 
				joinString5= splitString[i+1]+" "+ splitString[i]+" " + splitString[i+2];
				//  System.out.println("splitString : " + splitString[i]);
				System.out.println("lastseen Date in child Window: " + joinString5);
			}
			Assert.assertEquals(imageDate5, joinString5);
			Reporter.log("<B><font color = 'blue'> ==> -</font> Both Last Seen Date are Matching in Assert Pass :"+imageDate5+ " == " +joinString5);
			System.out.println("Both Last Seen Date are Matching in Assert Pass :"+imageDate5+ " == " +joinString5);
		}
		catch(Exception e) {
			System.out.println("Image is not able: Oops! Looks like we don't have data for this search criteria yet.");

			Reporter.log("<B><font color = 'Red'> ==> -</font> Image is not able: Oops! Looks like we don't have data for this search criteria yet.");
		}	

		try {
			Reporter.log(" ");
			Reporter.log("<B><font color ='red'> -6 Ad -</font>  ");
			System.out.println("");
			System.out.println("6 Ads");
			Reporter.log("<B><font color = 'blue'> ==> -</font> Capturing Image Date");
			String  imageDate6= date6.getText();
			Reporter.log("<B><font color = 'blue'> ==> -</font> Image Date is :"+imageDate6);
			System.out.println("Current Date: "+imageDate6);

			helper.waitFor(ShowAnalytics6);
			helper.highLightElement(driver, ShowAnalytics6);
			helper.jsScrollintoview(ShowAnalytics6);
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
			String lastSeenDate_today6 = lastSeen.getText();
			Reporter.log("<B><font color = 'blue'> ==> -</font> Last_Seen_childWindow AdDetails Page= " +  lastSeenDate_today6);
			System.out.println("lastSeenDate_today: "+lastSeenDate_today6);


			driver.close();

			driver.switchTo().window(parent6);
			//    System.out.println("lastSeenDate_today: "+lastSeenDate_today);


			String joinString6 = null;
			//  String[] actualDate = null;

			String[] splitString = lastSeenDate_today6.split(" ");
			for(int i=0;i<splitString.length-2;i++) {
				String actualDate=splitString[i]; 
				joinString6= splitString[i+1]+" "+ splitString[i]+" " + splitString[i+2];
				//  System.out.println("splitString : " + splitString[i]);
				System.out.println("lastseen Date in child Window: " + joinString6);
			}
			Assert.assertEquals(imageDate6, joinString6);
			Reporter.log("<B><font color = 'blue'> ==> -</font> Both Last Seen Date are Matching in Assert Pass :"+imageDate6+ " == " +joinString6);
			System.out.println("Both Last Seen Date are Matching in Assert Pass :"+imageDate6+ " == " +joinString6);
		}
		catch(Exception e) {
			System.out.println("Image is not able: Oops! Looks like we don't have data for this search criteria yet.");

			Reporter.log("<B><font color = 'Red'> ==> -</font> Image is not able: Oops! Looks like we don't have data for this search criteria yet.");
		}	


		try {
			Reporter.log(" ");
			Reporter.log("<B><font color ='red'> -7 Ad -</font>  ");
			System.out.println("");
			System.out.println("7 Ads");
			Reporter.log("<B><font color = 'blue'> ==> -</font> Capturing Image Date");
			String  imageDate7= date7.getText();
			Reporter.log("<B><font color = 'blue'> ==> -</font> Image Date is :"+imageDate7);
			System.out.println("Current Date: "+imageDate7);

			helper.waitFor(ShowAnalytics7);
			helper.highLightElement(driver, ShowAnalytics7);
			helper.jsScrollintoview(ShowAnalytics7);
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
			String lastSeenDate_today7 = lastSeen.getText();
			Reporter.log("<B><font color = 'blue'> ==> -</font> Last_Seen_childWindow AdDetails Page= " +  lastSeenDate_today7);
			System.out.println("lastSeenDate_today: "+lastSeenDate_today7);


			driver.close();

			driver.switchTo().window(parent7);
			//    System.out.println("lastSeenDate_today: "+lastSeenDate_today);


			String joinString7 = null;
			//  String[] actualDate = null;

			String[] splitString = lastSeenDate_today7.split(" ");
			for(int i=0;i<splitString.length-2;i++) {
				String actualDate=splitString[i]; 
				joinString7= splitString[i+1]+" "+ splitString[i]+" " + splitString[i+2];
				//  System.out.println("splitString : " + splitString[i]);
				System.out.println("lastseen Date in child Window: " + joinString7);
			}
			Assert.assertEquals(imageDate7, joinString7);
			Reporter.log("<B><font color = 'blue'> ==> -</font> Both Last Seen Date are Matching in Assert Pass :"+imageDate7+ " == " +joinString7);
			System.out.println("Both Last Seen Date are Matching in Assert Pass :"+imageDate7+ " == " +joinString7);
		}
		catch(Exception e) {
			System.out.println("Image is not able: Oops! Looks like we don't have data for this search criteria yet.");

			Reporter.log("<B><font color = 'Red'> ==> -</font> Image is not able: Oops! Looks like we don't have data for this search criteria yet.");
		}		

		try {
			Reporter.log(" ");
			Reporter.log("<B><font color ='red'> -8 Ad -</font>  ");
			System.out.println("");
			System.out.println("8 Ads");
			Reporter.log("<B><font color = 'blue'> ==> -</font> Capturing Image Date");
			String  imageDate8= date8.getText();
			Reporter.log("<B><font color = 'blue'> ==> -</font> Image Date is :"+imageDate8);
			System.out.println("Current Date: "+imageDate8);

			helper.waitFor(ShowAnalytics8);
			helper.highLightElement(driver, ShowAnalytics8);
			helper.jsScrollintoview(ShowAnalytics8);
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
			String lastSeenDate_today8 = lastSeen.getText();
			Reporter.log("<B><font color = 'blue'> ==> -</font> Last_Seen_childWindow AdDetails Page= " +  lastSeenDate_today8);
			System.out.println("lastSeenDate_today: "+lastSeenDate_today8);


			driver.close();

			driver.switchTo().window(parent8);
			//    System.out.println("lastSeenDate_today: "+lastSeenDate_today);


			String joinString8 = null;
			//  String[] actualDate = null;

			String[] splitString = lastSeenDate_today8.split(" ");
			for(int i=0;i<splitString.length-2;i++) {
				String actualDate=splitString[i]; 
				joinString8= splitString[i+1]+" "+ splitString[i]+" " + splitString[i+2];
				//  System.out.println("splitString : " + splitString[i]);
				System.out.println("lastseen Date  " + joinString8);
			}
			Assert.assertEquals(imageDate8, joinString8);
			Reporter.log("<B><font color = 'blue'> ==> -</font> Both Last Seen Date are Matching in Assert Pass :"+imageDate8+ " == " +joinString8);
			System.out.println("Both Last Seen Date are Matching in Assert Pass :"+imageDate8+ " == " +joinString8);
		}
		catch(Exception e) {
			System.out.println("Image is not able: Oops! Looks like we don't have data for this search criteria yet.");

			Reporter.log("<B><font color = 'Red'> ==> -</font> Image is not able: Oops! Looks like we don't have data for this search criteria yet.");
		}		

		try {
			Reporter.log(" ");
			Reporter.log("<B><font color ='red'> -9 Ad -</font>  ");
			System.out.println("");
			System.out.println("9 Ads");
			Reporter.log("<B><font color = 'blue'> ==> -</font> Capturing Image Date");
			String  imageDate9= date9.getText();
			Reporter.log("<B><font color = 'blue'> ==> -</font> Image Date is :"+imageDate9);
			System.out.println("Current Date: "+imageDate9);

			helper.waitFor(ShowAnalytics9);
			helper.highLightElement(driver, ShowAnalytics9);
			helper.jsScrollintoview(ShowAnalytics9);
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
			String lastSeenDate_today9 = lastSeen.getText();
			Reporter.log("<B><font color = 'blue'> ==> -</font> Last_Seen_childWindow AdDetails Page= " +  lastSeenDate_today9);
			System.out.println("lastSeenDate_today: "+lastSeenDate_today9);


			driver.close();

			driver.switchTo().window(parent9);
			//    System.out.println("lastSeenDate_today: "+lastSeenDate_today);


			String joinString9 = null;
			//  String[] actualDate = null;

			String[] splitString = lastSeenDate_today9.split(" ");
			for(int i=0;i<splitString.length-2;i++) {
				String actualDate=splitString[i]; 
				joinString9= splitString[i+1]+" "+ splitString[i]+" " + splitString[i+2];
				//  System.out.println("splitString : " + splitString[i]);
				System.out.println("lastseen Date  " + joinString9);
			}
			Assert.assertEquals(imageDate9, joinString9);
			Reporter.log("<B><font color = 'blue'> ==> -</font> Both Last Seen Date are Matching in Assert Pass :"+imageDate9+ " == " +joinString9);
			System.out.println("Both Last Seen Date are Matching in Assert Pass :"+imageDate9+ " == " +joinString9);
		}
		catch(Exception e) {
			System.out.println("Image is not able: Oops! Looks like we don't have data for this search criteria yet.");

			Reporter.log("<B><font color = 'Red'> ==> -</font> Image is not able: Oops! Looks like we don't have data for this search criteria yet.");
		}	

		try {
			Reporter.log(" ");
			Reporter.log("<B><font color ='red'> -10 Ad -</font>  ");
			System.out.println("");
			System.out.println("10 Ads");
			Reporter.log("<B><font color = 'blue'> ==> -</font> Capturing Image Date");
			String  imageDate10= date10.getText();
			Reporter.log("<B><font color = 'blue'> ==> -</font> Image Date is :"+imageDate10);
			System.out.println("Current Date: "+imageDate10);

			helper.waitFor(ShowAnalytics10);
			helper.highLightElement(driver, ShowAnalytics10);
			helper.jsScrollintoview(ShowAnalytics10);
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
			String lastSeenDate_today10 = lastSeen.getText();
			Reporter.log("<B><font color = 'blue'> ==> -</font> Last_Seen_childWindow AdDetails Page= " +  lastSeenDate_today10);
			System.out.println("lastSeenDate_today: "+lastSeenDate_today10);


			driver.close();

			driver.switchTo().window(parent10);
			//    System.out.println("lastSeenDate_today: "+lastSeenDate_today);


			String joinString10 = null;
			//  String[] actualDate = null;

			String[] splitString = lastSeenDate_today10.split(" ");
			for(int i=0;i<splitString.length-2;i++) {
				String actualDate=splitString[i]; 
				joinString10= splitString[i+1]+" "+ splitString[i]+" " + splitString[i+2];
				//  System.out.println("splitString : " + splitString[i]);
				System.out.println("lastseen Date  " + joinString10);
			}
			Assert.assertEquals(imageDate10, joinString10);
			Reporter.log("<B><font color = 'blue'> ==> -</font> Both Last Seen Date are Matching in Assert Pass :"+imageDate10+ " == " +joinString10);
			System.out.println("Both Last Seen Date are Matching in Assert Pass :"+imageDate10+ " == " +joinString10);
		}
		catch(Exception e) {
			System.out.println("Image is not able: Oops! Looks like we don't have data for this search criteria yet.");

			Reporter.log("<B><font color = 'Red'> ==> -</font> Image is not able: Oops! Looks like we don't have data for this search criteria yet.");
		}	

		try {
			Reporter.log(" ");
			Reporter.log("<B><font color ='red'> -11 Ad -</font>  ");
			System.out.println("");
			System.out.println("11 Ads");
			Reporter.log("<B><font color = 'blue'> ==> -</font> Capturing Image Date");
			String  imageDate11= date11.getText();
			Reporter.log("<B><font color = 'blue'> ==> -</font> Image Date is :"+imageDate11);
			System.out.println("Current Date: "+imageDate11);

			helper.waitFor(ShowAnalytics11);
			helper.highLightElement(driver, ShowAnalytics11);
			helper.jsScrollintoview(ShowAnalytics11);
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
			String lastSeenDate_today11 = lastSeen.getText();
			Reporter.log("<B><font color = 'blue'> ==> -</font> Last_Seen_childWindow AdDetails Page= " +  lastSeenDate_today11);
			System.out.println("lastSeenDate_today: "+lastSeenDate_today11);


			driver.close();

			driver.switchTo().window(parent11);
			//    System.out.println("lastSeenDate_today: "+lastSeenDate_today);


			String joinString11 = null;
			//  String[] actualDate = null;

			String[] splitString = lastSeenDate_today11.split(" ");
			for(int i=0;i<splitString.length-2;i++) {
				String actualDate=splitString[i]; 
				joinString11= splitString[i+1]+" "+ splitString[i]+" " + splitString[i+2];
				//  System.out.println("splitString : " + splitString[i]);
				System.out.println("lastseen Date  " + joinString11);
			}
			Assert.assertEquals(imageDate11, joinString11);
			Reporter.log("<B><font color = 'blue'> ==> -</font> Both Last Seen Date are Matching in Assert Pass :"+imageDate11+ " == " +joinString11);
			System.out.println("Both Last Seen Date are Matching in Assert Pass :"+imageDate11+ " == " +joinString11);
		}
		catch(Exception e) {
			System.out.println("Image is not able: Oops! Looks like we don't have data for this search criteria yet.");

			Reporter.log("<B><font color = 'Red'> ==> -</font> Image is not able: Oops! Looks like we don't have data for this search criteria yet.");
		}	

		try {
			Reporter.log(" ");
			Reporter.log("<B><font color ='red'> -12 Ad -</font>  ");
			System.out.println("");
			System.out.println("12 Ads");
			Reporter.log("<B><font color = 'blue'> ==> -</font> Capturing Image Date");
			String  imageDate12= date12.getText();
			Reporter.log("<B><font color = 'blue'> ==> -</font> Image Date is :"+imageDate12);
			System.out.println("Current Date: "+imageDate12);

			helper.waitFor(ShowAnalytics12);
			helper.highLightElement(driver, ShowAnalytics12);
			helper.jsScrollintoview(ShowAnalytics12);
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
			String lastSeenDate_today12 = lastSeen.getText();
			Reporter.log("<B><font color = 'blue'> ==> -</font> Last_Seen AdDetails Page= " +  lastSeenDate_today12);
			System.out.println("lastSeenDate_today: "+lastSeenDate_today12);


			driver.close();

			driver.switchTo().window(parent12);
			//    System.out.println("lastSeenDate_today: "+lastSeenDate_today);


			String joinString12 = null;
			//  String[] actualDate = null;

			String[] splitString = lastSeenDate_today12.split(" ");
			for(int i=0;i<splitString.length-2;i++) {
				String actualDate=splitString[i]; 
				joinString12= splitString[i+1]+" "+ splitString[i]+" " + splitString[i+2];
				//  System.out.println("splitString : " + splitString[i]);
				System.out.println("lastseen Date  " + joinString12);
			}
			Assert.assertEquals(imageDate12, joinString12);
			Reporter.log("<B><font color = 'blue'> ==> -</font> Both Last Seen Date are Matching in Assert Pass :"+imageDate12+ " == " +joinString12);
			System.out.println("Both Last Seen Date are Matching in Assert Pass :"+imageDate12+ " == " +joinString12);
		}
		catch(Exception e) {
			System.out.println("Image is not able: Oops! Looks like we don't have data for this search criteria yet.");

			Reporter.log("<B><font color = 'Red'> ==> -</font> Image is not able: Oops! Looks like we don't have data for this search criteria yet.");
		}		

		try {
			Reporter.log(" ");
			Reporter.log("<B><font color ='red'> -13 Ad -</font>  ");
			System.out.println("");
			System.out.println("13 Ads");
			Reporter.log("<B><font color = 'blue'> ==> -</font> Capturing Image Date");
			String  imageDate13= date13.getText();
			Reporter.log("<B><font color = 'blue'> ==> -</font> Image Date is :"+imageDate13);
			System.out.println("Current Date: "+imageDate13);

			helper.waitFor(ShowAnalytics13);
			helper.highLightElement(driver, ShowAnalytics13);
			helper.jsScrollintoview(ShowAnalytics13);
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
			String lastSeenDate_today13 = lastSeen.getText();
			Reporter.log("<B><font color = 'blue'> ==> -</font> Last_Seen AdDetails Page= " +  lastSeenDate_today13);
			System.out.println("lastSeenDate_today: "+lastSeenDate_today13);


			driver.close();

			driver.switchTo().window(parent13);
			//    System.out.println("lastSeenDate_today: "+lastSeenDate_today);


			String joinString13 = null;
			//  String[] actualDate = null;

			String[] splitString13 = lastSeenDate_today13.split(" ");
			for(int i=0;i<splitString13.length-2;i++) {
				String actualDate=splitString13[i]; 
				joinString13= splitString13[i+1]+" "+ splitString13[i]+" " + splitString13[i+2];
				//  System.out.println("splitString : " + splitString[i]);
				System.out.println("lastseen Date  " + joinString13);
			}
			Assert.assertEquals(imageDate13, joinString13);
			Reporter.log("<B><font color = 'blue'> ==> -</font> Both Last Seen Date are Matching in Assert Pass :"+imageDate13+ " == " +joinString13);
			System.out.println("Both Last Seen Date are Matching in Assert Pass :"+imageDate13+ " == " +joinString13);
		}
		catch(Exception e) {
			System.out.println("Image is not able: Oops! Looks like we don't have data for this search criteria yet.");

			Reporter.log("<B><font color = 'Red'> ==> -</font> Image is not able: Oops! Looks like we don't have data for this search criteria yet.");
		}			

		try {
			Reporter.log(" ");
			Reporter.log("<B><font color ='red'> -14 Ad -</font>  ");
			System.out.println("");
			System.out.println("14 Ads");
			Reporter.log("<B><font color = 'blue'> ==> -</font> Capturing Image Date");
			String  imageDate14= date14.getText();
			Reporter.log("<B><font color = 'blue'> ==> -</font> Image Date is :"+imageDate14);
			System.out.println("Current Date: "+imageDate14);

			helper.waitFor(ShowAnalytics14);
			helper.highLightElement(driver, ShowAnalytics14);
			helper.jsScrollintoview(ShowAnalytics14);
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
			String lastSeenDate_today14 = lastSeen.getText();
			Reporter.log("<B><font color = 'blue'> ==> -</font> Last_Seen AdDetails Page= " +  lastSeenDate_today14);
			System.out.println("lastSeenDate_today: "+lastSeenDate_today14);


			driver.close();

			driver.switchTo().window(parent14);
			//    System.out.println("lastSeenDate_today: "+lastSeenDate_today);


			String joinString14 = null;
			//  String[] actualDate = null;

			String[] splitString14 = lastSeenDate_today14.split(" ");
			for(int i=0;i<splitString14.length-2;i++) {
				String actualDate=splitString14[i]; 
				joinString14= splitString14[i+1]+" "+ splitString14[i]+" " + splitString14[i+2];
				//  System.out.println("splitString : " + splitString[i]);
				System.out.println("lastseen Date  " + joinString14);
			}
			Assert.assertEquals(imageDate14, joinString14);
			Reporter.log("<B><font color = 'blue'> ==> -</font> Both Last Seen Date are Matching in Assert Pass :"+imageDate14+ " == " +joinString14);
			System.out.println("Both Last Seen Date are Matching in Assert Pass :"+imageDate14+ " == " +joinString14);
		}
		catch(Exception e) {
			System.out.println("Image is not able: Oops! Looks like we don't have data for this search criteria yet.");

			Reporter.log("<B><font color = 'Red'> ==> -</font> Image is not able: Oops! Looks like we don't have data for this search criteria yet.");
		}			

		try {
			Reporter.log(" ");
			Reporter.log("<B><font color ='red'> -15 Ad -</font>  ");
			System.out.println("");
			System.out.println("15 Ads");
			Reporter.log("<B><font color = 'blue'> ==> -</font> Capturing Image Date");
			String  imageDate15= date15.getText();
			Reporter.log("<B><font color = 'blue'> ==> -</font> Image Date is :"+imageDate15);
			System.out.println("Current Date: "+imageDate15);

			helper.waitFor(ShowAnalytics15);
			helper.highLightElement(driver, ShowAnalytics15);
			helper.jsScrollintoview(ShowAnalytics15);
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
			String lastSeenDate_today15 = lastSeen.getText();
			Reporter.log("<B><font color = 'blue'> ==> -</font> Last_Seen AdDetails Page= " +  lastSeenDate_today15);
			System.out.println("lastSeenDate_today: "+lastSeenDate_today15);


			driver.close();

			driver.switchTo().window(parent15);
			//    System.out.println("lastSeenDate_today: "+lastSeenDate_today);


			String joinString15 = null;
			//  String[] actualDate = null;

			String[] splitString15 = lastSeenDate_today15.split(" ");
			for(int i=0;i<splitString15.length-2;i++) {
				String actualDate=splitString15[i]; 
				joinString15= splitString15[i+1]+" "+ splitString15[i]+" " + splitString15[i+2];
				//  System.out.println("splitString : " + splitString[i]);
				System.out.println("lastseen Date  " + joinString15);
			}
			Assert.assertEquals(imageDate15, joinString15);
			Reporter.log("<B><font color = 'blue'> ==> -</font> Both Last Seen Date are Matching in Assert Pass :"+imageDate15+ " == " +joinString15);
			System.out.println("Both Last Seen Date are Matching in Assert Pass :"+imageDate15+ " == " +joinString15);
		}
		catch(Exception e) {
			System.out.println("Image is not able: Oops! Looks like we don't have data for this search criteria yet.");

			Reporter.log("<B><font color = 'Red'> ==> -</font> Image is not able: Oops! Looks like we don't have data for this search criteria yet.");
		}			

	}







	public void AdSeenBetween_Yesterday() throws InterruptedException
	{
		String date_format_lastseen1=null;
		String lastimageDate1=null;

		System.out.println();
		Reporter.log("      ");
		helper.waitForPageToLoad();
		Reporter.log("<B><font color = 'green'>  - ShortBy Newest -Ad Seen Between Yesterday Step will Start from here </font> ");
		helper.waitFor(adSeenbetweenfilter);
		helper.highLightElement(driver, adSeenbetweenfilter);
		helper.jsScrollintoview(adSeenbetweenfilter);
		adSeenbetweenfilter.click();
		Reporter.log("<B><font color = 'orange'> Step1 -</font> Clicked On Ad Seen between filter Icon");

		helper.waitFor(adSeenbetween_yesterday);
		helper.highLightElement(driver, adSeenbetween_yesterday);
		helper.jsScrollintoview(adSeenbetween_yesterday);
		adSeenbetween_yesterday.click();
		Reporter.log("<B><font color = 'orange'> Step2 -</font> Clicked On Ad Seen Between Yesterday Icon");

		helper.waitFor(searchButton);
		helper.highLightElement(driver, searchButton);
		helper.jsScrollintoview(searchButton);
		searchButton.click();
		Reporter.log("<B><font color = 'orange'> Step3 -</font> Clicked On Search Button Icon");
		helper.waitForPageToLoad();

		String totaladscount=totaladscount_ad.getText();
		System.out.println("Totaladscount: "+totaladscount);
		Reporter.log("<B><font color = 'orange'> Step4 -</font>  Total Ad Count is :"+ totaladscount);



		try 
		{

			Reporter.log(" ");
			Reporter.log("<B><font color ='red'> -1 Ad -</font>  ");
			System.out.println("");
			System.out.println("1 Ads");
			Reporter.log("<B><font color = 'blue'> ==> -</font> Capturing Image Date");
			String imageDate1=date1.getText();
			System.out.println("Current Image Date: "+imageDate1);
			Reporter.log("<B><font color = 'blue'> ==> -</font> Image Date is :"+imageDate1);

			helper.waitFor(ShowAnalytics1);
			helper.highLightElement(driver, ShowAnalytics1);
			helper.jsScrollintoview(ShowAnalytics1);
			ShowAnalytics1.click();
			Reporter.log("<B><font color = 'blue'> ==> -</font> Clicked On Show Analytics Icon");


			String parent1=driver.getWindowHandle();
			Set<String>s1=driver.getWindowHandles();
			// Now iterate using Iterator
			Iterator<String> I1= s1.iterator();
			while(I1.hasNext())
			{
				String child_window1=I1.next();
				if(!parent1.equals(child_window1))
				{
					driver.switchTo().window(child_window1);
					helper.waitForPageToLoad();
					System.out.println(driver.switchTo().window(child_window1).getTitle());
					helper.Scrollintoview(lastSeen);
					lastimageDate1 = lastSeen.getText();
					System.out.println("Analytics Image Last Seen Date: "+lastimageDate1);
					Reporter.log("<B><font color = 'blue'> ==> -</font> Image Date of Last Seen is :"+lastimageDate1);

					driver.close();
				}
			}

			driver.switchTo().window(parent1);
			String[] splitString = lastimageDate1.split(" ");
			for(int i=0;i<splitString.length-2;i++) {
				//    String actualDate=splitString[i]; 
				date_format_lastseen1= splitString[i+1]+" "+ splitString[i]+" " + splitString[i+2];

				//  System.out.println("splitString : " + splitString[i]);
				System.out.println("Change Date format lastseen Date: " + date_format_lastseen1);
				System.out.println("Image last seen Date: " + imageDate1);
			}

			Assert.assertEquals(imageDate1, date_format_lastseen1);
			Reporter.log("<B><font color = 'blue'> ==> -</font> Both Last Seen Date are Matching in Assert Pass :"+imageDate1+ " == " +date_format_lastseen1);
			System.out.println("Both Last Seen Date are Matching in Assert Pass :"+imageDate1+ " == " +date_format_lastseen1);
		} 
		catch (Exception e)
		{


			System.out.println("Image is not able: Oops! Looks like we don't have data for this search criteria yet.");

			Reporter.log("<B><font color = 'Red'> ==> -</font> Image is not able: Oops! Looks like we don't have data for this search criteria yet.");
		}

		try 
		{
			String date_format_lastseen2=null;
			String lastimageDate2=null;
			Reporter.log(" ");
			Reporter.log("<B><font color ='red'> -2 Ad -</font>  ");
			System.out.println("");
			System.out.println("2 Ads");
			Reporter.log("<B><font color = 'blue'> ==> -</font> Capturing Image Date");
			String imageDate2=date2.getText();
			System.out.println("Current Image Date: "+imageDate2);
			Reporter.log("<B><font color = 'blue'> ==> -</font> Image Date is :"+imageDate2);

			helper.waitFor(ShowAnalytics2);
			helper.highLightElement(driver, ShowAnalytics2);
			helper.jsScrollintoview(ShowAnalytics2);
			ShowAnalytics2.click();
			Reporter.log("<B><font color = 'blue'> ==> -</font> Clicked On Show Analytics Icon");


			String parent2=driver.getWindowHandle();
			Set<String>s2=driver.getWindowHandles();
			// Now iterate using Iterator
			Iterator<String> I2= s2.iterator();
			while(I2.hasNext())
			{
				String child_window2=I2.next();
				if(!parent2.equals(child_window2))
				{
					driver.switchTo().window(child_window2);
					helper.waitForPageToLoad();
					System.out.println(driver.switchTo().window(child_window2).getTitle());
					helper.Scrollintoview(lastSeen);
					lastimageDate2 = lastSeen.getText();
					System.out.println("Analytics Image Last Seen Date: "+lastimageDate2);
					Reporter.log("<B><font color = 'blue'> ==> -</font> Image Date of Last Seen is :"+lastimageDate2);

					driver.close();
				}
			}

			driver.switchTo().window(parent2);
			String[] splitString = lastimageDate2.split(" ");
			for(int i=0;i<splitString.length-2;i++) {
				//    String actualDate=splitString[i]; 
				date_format_lastseen2= splitString[i+1]+" "+ splitString[i]+" " + splitString[i+2];

				//  System.out.println("splitString : " + splitString[i]);
				System.out.println("Change Date format lastseen Date: " + date_format_lastseen2);
				System.out.println("Image last seen Date: " + imageDate2);
			}

			Assert.assertEquals(imageDate2, date_format_lastseen2);
			Reporter.log("<B><font color = 'blue'> ==> -</font> Both Last Seen Date are Matching in Assert Pass :"+imageDate2+ " == " +date_format_lastseen2);
			System.out.println("Both Last Seen Date are Matching in Assert Pass :"+imageDate2+ " == " +date_format_lastseen2);
		} 
		catch (Exception e)
		{

			System.out.println("Image is not able: Oops! Looks like we don't have data for this search criteria yet.");

			Reporter.log("<B><font color = 'Red'> ==> -</font> Image is not able: Oops! Looks like we don't have data for this search criteria yet.");
		}

		try 
		{
			String date_format_lastseen3=null;
			String lastimageDate3=null;
			Reporter.log(" ");
			Reporter.log("<B><font color ='red'> -3 Ad -</font>  ");
			System.out.println("");
			System.out.println("3 Ads");
			Reporter.log("<B><font color = 'blue'> ==> -</font> Capturing Image Date");
			String imageDate3=date3.getText();
			System.out.println("Current Image Date: "+imageDate3);
			Reporter.log("<B><font color = 'blue'> ==> -</font> Image Date is :"+imageDate3);

			helper.waitFor(ShowAnalytics3);
			helper.highLightElement(driver, ShowAnalytics3);
			helper.jsScrollintoview(ShowAnalytics3);
			ShowAnalytics3.click();
			Reporter.log("<B><font color = 'blue'> ==> -</font> Clicked On Show Analytics Icon");


			String parent3=driver.getWindowHandle();
			Set<String>s3=driver.getWindowHandles();
			// Now iterate using Iterator
			Iterator<String> I3= s3.iterator();
			while(I3.hasNext())
			{
				String child_window3=I3.next();
				if(!parent3.equals(child_window3))
				{
					driver.switchTo().window(child_window3);
					helper.waitForPageToLoad();
					System.out.println(driver.switchTo().window(child_window3).getTitle());
					lastimageDate3 = lastSeen.getText();
					System.out.println("Analytics Image Last Seen Date: "+lastimageDate3);
					Reporter.log("<B><font color = 'blue'> ==> -</font> Image Date of Last Seen is :"+lastimageDate3);

					driver.close();
				}
			}

			driver.switchTo().window(parent3);
			String[] splitString = lastimageDate3.split(" ");
			for(int i=0;i<splitString.length-2;i++) {
				//    String actualDate=splitString[i]; 
				date_format_lastseen3= splitString[i+1]+" "+ splitString[i]+" " + splitString[i+2];

				//  System.out.println("splitString : " + splitString[i]);
				System.out.println("Change Date format lastseen Date: " + date_format_lastseen3);
				System.out.println("Image last seen Date: " + imageDate3);
			}

			Assert.assertEquals(imageDate3, date_format_lastseen3);
			Reporter.log("<B><font color = 'blue'> ==> -</font> Both Last Seen Date are Matching in Assert Pass :"+imageDate3+ " == " +date_format_lastseen3);
			System.out.println("Both Last Seen Date are Matching in Assert Pass :"+imageDate3+ " == " +date_format_lastseen3);
		} 
		catch (Exception e)
		{

			System.out.println("Image is not able: Oops! Looks like we don't have data for this search criteria yet.");
			Reporter.log("<B><font color = 'Red'> ==> -</font> Image is not able: Oops! Looks like we don't have data for this search criteria yet.");
		}		

		try 
		{
			String date_format_lastseen4=null;
			String lastimageDate4=null;
			Reporter.log(" ");
			Reporter.log("<B><font color ='red'> -4 Ad -</font>  ");
			System.out.println("");
			System.out.println("4 Ads");
			Reporter.log("<B><font color = 'blue'> ==> -</font> Capturing Image Date");
			String imageDate4=date4.getText();
			System.out.println("Current Image Date: "+imageDate4);
			Reporter.log("<B><font color = 'blue'> ==> -</font> Image Date is :"+imageDate4);

			helper.waitFor(ShowAnalytics4);
			helper.highLightElement(driver, ShowAnalytics4);
			helper.jsScrollintoview(ShowAnalytics4);
			ShowAnalytics4.click();
			Reporter.log("<B><font color = 'blue'> ==> -</font> Clicked On Show Analytics Icon");


			String parent4=driver.getWindowHandle();
			Set<String>s4=driver.getWindowHandles();
			// Now iterate using Iterator
			Iterator<String> I4= s4.iterator();
			while(I4.hasNext())
			{
				String child_window4=I4.next();
				if(!parent4.equals(child_window4))
				{
					driver.switchTo().window(child_window4);
					helper.waitForPageToLoad();
					System.out.println(driver.switchTo().window(child_window4).getTitle());
					helper.Scrollintoview(lastSeen);
					lastimageDate4 = lastSeen.getText();
					System.out.println("Analytics Image Last Seen Date: "+lastimageDate4);
					Reporter.log("<B><font color = 'blue'> ==> -</font> Image Date of Last Seen is :"+lastimageDate4);

					driver.close();
				}
			}

			driver.switchTo().window(parent4);
			String[] splitString = lastimageDate4.split(" ");
			for(int i=0;i<splitString.length-2;i++) {
				//    String actualDate=splitString[i]; 
				date_format_lastseen4= splitString[i+1]+" "+ splitString[i]+" " + splitString[i+2];

				//  System.out.println("splitString : " + splitString[i]);
				System.out.println("Change Date format lastseen Date: " + date_format_lastseen4);
				System.out.println("Image last seen Date: " + imageDate4);
			}

			Assert.assertEquals(imageDate4, date_format_lastseen4);
			Reporter.log("<B><font color = 'blue'> ==> -</font> Both Last Seen Date are Matching in Assert Pass :"+imageDate4+ " == " +date_format_lastseen4);
			System.out.println("Both Last Seen Date are Matching in Assert Pass :"+imageDate4+ " == " +date_format_lastseen4);
		} 
		catch (Exception e)
		{

			System.out.println("Image is not able: Oops! Looks like we don't have data for this search criteria yet.");
			Reporter.log("<B><font color = 'Red'> ==> -</font> Image is not able: Oops! Looks like we don't have data for this search criteria yet.");
		}

		try 
		{
			String date_format_lastseen5=null;
			String lastimageDate5=null;
			Reporter.log(" ");
			Reporter.log("<B><font color ='red'> -5 Ad -</font>  ");
			System.out.println("");
			System.out.println("5 Ads");
			Reporter.log("<B><font color = 'blue'> ==> -</font> Capturing Image Date");
			String imageDate5=date5.getText();
			System.out.println("Current Image Date: "+imageDate5);
			Reporter.log("<B><font color = 'blue'> ==> -</font> Image Date is :"+imageDate5);

			helper.waitFor(ShowAnalytics5);
			helper.highLightElement(driver, ShowAnalytics5);
			helper.jsScrollintoview(ShowAnalytics5);
			ShowAnalytics5.click();
			Reporter.log("<B><font color = 'blue'> ==> -</font> Clicked On Show Analytics Icon");


			String parent5=driver.getWindowHandle();
			Set<String>s5=driver.getWindowHandles();
			// Now iterate using Iterator
			Iterator<String> I5= s5.iterator();
			while(I5.hasNext())
			{
				String child_window5=I5.next();
				if(!parent5.equals(child_window5))
				{
					driver.switchTo().window(child_window5);
					helper.waitForPageToLoad();
					System.out.println(driver.switchTo().window(child_window5).getTitle());
					helper.Scrollintoview(lastSeen);
					lastimageDate5 = lastSeen.getText();
					System.out.println("Analytics Image Last Seen Date: "+lastimageDate5);
					Reporter.log("<B><font color = 'blue'> ==> -</font> Image Date of Last Seen is :"+lastimageDate5);

					driver.close();
				}
			}

			driver.switchTo().window(parent5);
			String[] splitString = lastimageDate5.split(" ");
			for(int i=0;i<splitString.length-2;i++) {
				//    String actualDate=splitString[i]; 
				date_format_lastseen5= splitString[i+1]+" "+ splitString[i]+" " + splitString[i+2];

				//  System.out.println("splitString : " + splitString[i]);
				System.out.println("Change Date format lastseen Date: " + date_format_lastseen5);
				System.out.println("Image last seen Date: " + imageDate5);
			}

			Assert.assertEquals(imageDate5, date_format_lastseen5);
			Reporter.log("<B><font color = 'blue'> ==> -</font> Both Last Seen Date are Matching in Assert Pass :"+imageDate5+ " == " +date_format_lastseen5);
			System.out.println("Both Last Seen Date are Matching in Assert Pass :"+imageDate5+ " == " +date_format_lastseen5);
		} 
		catch (Exception e)
		{
			System.out.println("Image is not able: Oops! Looks like we don't have data for this search criteria yet.");
			Reporter.log("<B><font color = 'Red'> ==> -</font> Image is not able: Oops! Looks like we don't have data for this search criteria yet.");
		}

		try 
		{
			String date_format_lastseen6=null;
			String lastimageDate6=null;
			Reporter.log(" ");
			Reporter.log("<B><font color ='red'> -6 Ad -</font>  ");
			System.out.println("");
			System.out.println("6 Ads");
			Reporter.log("<B><font color = 'blue'> ==> -</font> Capturing Image Date");
			String imageDate6=date6.getText();
			System.out.println("Current Image Date: "+imageDate6);
			Reporter.log("<B><font color = 'blue'> ==> -</font> Image Date is :"+imageDate6);

			helper.waitFor(ShowAnalytics6);
			helper.highLightElement(driver, ShowAnalytics6);
			helper.jsScrollintoview(ShowAnalytics6);
			ShowAnalytics6.click();
			Reporter.log("<B><font color = 'blue'> ==> -</font> Clicked On Show Analytics Icon");


			String parent6=driver.getWindowHandle();
			Set<String>s6=driver.getWindowHandles();
			// Now iterate using Iterator
			Iterator<String> I6= s6.iterator();
			while(I6.hasNext())
			{
				String child_window6=I6.next();
				if(!parent6.equals(child_window6))
				{
					driver.switchTo().window(child_window6);
					helper.waitForPageToLoad();
					System.out.println(driver.switchTo().window(child_window6).getTitle());
					lastimageDate6 = lastSeen.getText();
					System.out.println("Analytics Image Last Seen Date: "+lastimageDate6);
					Reporter.log("<B><font color = 'blue'> ==> -</font> Image Date of Last Seen is :"+lastimageDate6);

					driver.close();
				}			

			}

			driver.switchTo().window(parent6);
			String[] splitString = lastimageDate6.split(" ");
			for(int i=0;i<splitString.length-2;i++) {
				//    String actualDate=splitString[i]; 
				date_format_lastseen6= splitString[i+1]+" "+ splitString[i]+" " + splitString[i+2];

				//  System.out.println("splitString : " + splitString[i]);
				System.out.println("Change Date format lastseen Date: " + date_format_lastseen6);
				System.out.println("Image last seen Date: " + imageDate6);
			}

			Assert.assertEquals(imageDate6, date_format_lastseen6);
			Reporter.log("<B><font color = 'blue'> ==> -</font> Both Last Seen Date are Matching in Assert Pass :"+imageDate6+ " == " +date_format_lastseen6);
			System.out.println("Both Last Seen Date are Matching in Assert Pass :"+imageDate6+ " == " +date_format_lastseen6);
		}
		catch (Exception e)
		{
			System.out.println("Image is not able: Oops! Looks like we don't have data for this search criteria yet.");

			Reporter.log("<B><font color = 'Red'> ==> -</font> Image is not able: Oops! Looks like we don't have data for this search criteria yet.");
		}					

		try 
		{
			String date_format_lastseen7=null;
			String lastimageDate7=null;
			Reporter.log(" ");
			Reporter.log("<B><font color ='red'> -7 Ad -</font>  ");
			System.out.println("");
			System.out.println("7 Ads");
			Reporter.log("<B><font color = 'blue'> ==> -</font> Capturing Image Date");
			String imageDate7=date7.getText();
			System.out.println("Current Image Date: "+imageDate7);
			Reporter.log("<B><font color = 'blue'> ==> -</font> Image Date is :"+imageDate7);

			helper.waitFor(ShowAnalytics7);
			helper.highLightElement(driver, ShowAnalytics7);
			helper.jsScrollintoview(ShowAnalytics7);
			ShowAnalytics7.click();
			Reporter.log("<B><font color = 'blue'> ==> -</font> Clicked On Show Analytics Icon");


			String parent7=driver.getWindowHandle();
			Set<String>s7=driver.getWindowHandles();
			// Now iterate using Iterator
			Iterator<String> I7= s7.iterator();
			while(I7.hasNext())
			{
				String child_window7=I7.next();
				if(!parent7.equals(child_window7))
				{
					driver.switchTo().window(child_window7);
					helper.waitForPageToLoad();
					System.out.println(driver.switchTo().window(child_window7).getTitle());
					lastimageDate7 = lastSeen.getText();
					System.out.println("Analytics Image Last Seen Date: "+lastimageDate7);
					Reporter.log("<B><font color = 'blue'> ==> -</font> Image Date of Last Seen is :"+lastimageDate7);

					driver.close();
				}			

			}

			driver.switchTo().window(parent7);
			String[] splitString = lastimageDate7.split(" ");
			for(int i=0;i<splitString.length-2;i++) {
				//    String actualDate=splitString[i]; 
				date_format_lastseen7= splitString[i+1]+" "+ splitString[i]+" " + splitString[i+2];

				//  System.out.println("splitString : " + splitString[i]);
				System.out.println("Change Date format lastseen Date: " + date_format_lastseen7);
				System.out.println("Image last seen Date: " + imageDate7);
			}

			Assert.assertEquals(imageDate7, date_format_lastseen7);
			Reporter.log("<B><font color = 'blue'> ==> -</font> Both Last Seen Date are Matching in Assert Pass :"+imageDate7+ " == " +date_format_lastseen7);
			System.out.println("Both Last Seen Date are Matching in Assert Pass :"+imageDate7+ " == " +date_format_lastseen7);
		}
		catch (Exception e)
		{
			System.out.println("Image is not able: Oops! Looks like we don't have data for this search criteria yet.");
			Reporter.log("<B><font color = 'Red'> ==> -</font> Image is not able: Oops! Looks like we don't have data for this search criteria yet.");
		}		

		try 
		{
			String date_format_lastseen9=null;
			String lastimageDate9=null;
			Reporter.log(" ");
			Reporter.log("<B><font color ='red'> -9 Ad -</font>  ");
			System.out.println("");
			System.out.println("9 Ads");
			Reporter.log("<B><font color = 'blue'> ==> -</font> Capturing Image Date");
			String imageDate9=date9.getText();
			System.out.println("Current Image Date: "+imageDate9);
			Reporter.log("<B><font color = 'blue'> ==> -</font> Image Date is :"+imageDate9);

			helper.waitFor(ShowAnalytics9);
			helper.highLightElement(driver, ShowAnalytics9);
			helper.jsScrollintoview(ShowAnalytics9);
			ShowAnalytics9.click();
			Reporter.log("<B><font color = 'blue'> ==> -</font> Clicked On Show Analytics Icon");


			String parent9=driver.getWindowHandle();
			Set<String>s9=driver.getWindowHandles();
			// Now iterate using Iterator
			Iterator<String> I9= s9.iterator();
			while(I9.hasNext())
			{
				String child_window9=I9.next();
				if(!parent9.equals(child_window9))
				{
					driver.switchTo().window(child_window9);
					helper.waitForPageToLoad();
					System.out.println(driver.switchTo().window(child_window9).getTitle());
					helper.Scrollintoview(lastSeen);
					lastimageDate9 = lastSeen.getText();
					System.out.println("Analytics Image Last Seen Date: "+lastimageDate9);
					Reporter.log("<B><font color = 'blue'> ==> -</font> Image Date of Last Seen is :"+lastimageDate9);

					driver.close();
				}
			}

			driver.switchTo().window(parent9);
			String[] splitString = lastimageDate9.split(" ");
			for(int i=0;i<splitString.length-2;i++) {
				//    String actualDate=splitString[i]; 
				date_format_lastseen9= splitString[i+1]+" "+ splitString[i]+" " + splitString[i+2];

				//  System.out.println("splitString : " + splitString[i]);
				System.out.println("Change Date format lastseen Date: " + date_format_lastseen9);
				System.out.println("Image last seen Date: " + imageDate9);
			}

			Assert.assertEquals(imageDate9, date_format_lastseen9);
			Reporter.log("<B><font color = 'blue'> ==> -</font> Both Last Seen Date are Matching in Assert Pass :"+imageDate9+ " == " +date_format_lastseen9);
			System.out.println("Both Last Seen Date are Matching in Assert Pass :"+imageDate9+ " == " +date_format_lastseen9);
		} 
		catch (Exception e)
		{
			System.out.println("Image is not able: Oops! Looks like we don't have data for this search criteria yet.");

			Reporter.log("<B><font color = 'Red'> ==> -</font> Image is not able: Oops! Looks like we don't have data for this search criteria yet.");
		}



		try 
		{
			String date_format_lastseen10=null;
			String lastimageDate10=null;
			Reporter.log(" ");
			Reporter.log("<B><font color ='red'> -10 Ad -</font>  ");
			System.out.println("");
			System.out.println("10 Ads");
			//	helper.Scrollintoview(date10);
			String imageDate10=date10.getText();
			Reporter.log("<B><font color = 'blue'> ==> -</font> Capturing Image Date");
			System.out.println("Current Image Date: "+imageDate10);
			Reporter.log("<B><font color = 'blue'> ==> -</font> Image Date is :"+imageDate10);

			helper.waitFor(ShowAnalytics10);
			helper.highLightElement(driver, ShowAnalytics10);
			helper.jsScrollintoview(ShowAnalytics10);
			ShowAnalytics10.click();
			Reporter.log("<B><font color = 'blue'> ==> -</font> Clicked On Show Analytics Icon");


			String parent10=driver.getWindowHandle();
			Set<String>s10=driver.getWindowHandles();
			// Now iterate using Iterator
			Iterator<String> I10= s10.iterator();
			while(I10.hasNext())
			{
				String child_window10=I10.next();
				if(!parent10.equals(child_window10))
				{
					driver.switchTo().window(child_window10);
					helper.waitForPageToLoad();
					System.out.println(driver.switchTo().window(child_window10).getTitle());
					lastimageDate10 = lastSeen.getText();
					System.out.println("Analytics Image Last Seen Date: "+lastimageDate10);
					Reporter.log("<B><font color = 'blue'> ==> -</font> Image Date of Last Seen is :"+lastimageDate10);

					driver.close();
				}			

			}

			driver.switchTo().window(parent10);
			String[] splitString = lastimageDate10.split(" ");
			for(int i=0;i<splitString.length-2;i++) {
				//    String actualDate=splitString[i]; 
				date_format_lastseen10= splitString[i+1]+" "+ splitString[i]+" " + splitString[i+2];

				//  System.out.println("splitString : " + splitString[i]);
				System.out.println("Change Date format lastseen Date: " + date_format_lastseen10);
				System.out.println("Image last seen Date: " + imageDate10);
			}

			Assert.assertEquals(imageDate10, date_format_lastseen10);
			Reporter.log("<B><font color = 'blue'> ==> -</font> Both Last Seen Date are Matching in Assert Pass :"+imageDate10+ " == " +date_format_lastseen10);
			System.out.println("Both Last Seen Date are Matching in Assert Pass :"+imageDate10+ " == " +date_format_lastseen10);
		}
		catch (Exception e)
		{
			System.out.println("Image is not able: Oops! Looks like we don't have data for this search criteria yet.");

			Reporter.log("<B><font color = 'Red'> ==> -</font> Image is not able: Oops! Looks like we don't have data for this search criteria yet.");
		}		

		try 
		{
			String date_format_lastseen11=null;
			String lastimageDate11=null;
			Reporter.log(" ");
			Reporter.log("<B><font color ='red'> -11 Ad -</font>  ");
			System.out.println("");
			System.out.println("11 Ads");
			String imageDate11=date11.getText();
			Reporter.log("<B><font color = 'blue'> ==> -</font> Capturing Image Date");
			System.out.println("Current Image Date: "+imageDate11);
			Reporter.log("<B><font color = 'blue'> ==> -</font> Image Date is :"+imageDate11);

			helper.waitFor(ShowAnalytics11);
			helper.highLightElement(driver, ShowAnalytics11);
			helper.jsScrollintoview(ShowAnalytics11);
			ShowAnalytics11.click();
			Reporter.log("<B><font color = 'blue'> ==> -</font> Clicked On Show Analytics Icon");


			String parent11=driver.getWindowHandle();
			Set<String>s11=driver.getWindowHandles();
			// Now iterate using Iterator
			Iterator<String> I11= s11.iterator();
			while(I11.hasNext())
			{
				String child_window11=I11.next();
				if(!parent11.equals(child_window11))
				{
					driver.switchTo().window(child_window11);
					helper.waitForPageToLoad();
					System.out.println(driver.switchTo().window(child_window11).getTitle());
					lastimageDate11 = lastSeen.getText();
					System.out.println("Analytics Image Last Seen Date: "+lastimageDate11);
					Reporter.log("<B><font color = 'blue'> ==> -</font> Image Date of Last Seen is :"+lastimageDate11);

					driver.close();
				}			

			}

			driver.switchTo().window(parent11);
			String[] splitString = lastimageDate11.split(" ");
			for(int i=0;i<splitString.length-2;i++) {
				//    String actualDate=splitString[i]; 
				date_format_lastseen11= splitString[i+1]+" "+ splitString[i]+" " + splitString[i+2];

				//  System.out.println("splitString : " + splitString[i]);
				System.out.println("Change Date format lastseen Date: " + date_format_lastseen11);
				System.out.println("Image last seen Date: " + imageDate11);
			}

			Assert.assertEquals(imageDate11, date_format_lastseen11);
			Reporter.log("<B><font color = 'blue'> ==> -</font> Both Last Seen Date are Matching in Assert Pass :"+imageDate11+ " == " +date_format_lastseen11);
			System.out.println("Both Last Seen Date are Matching in Assert Pass :"+imageDate11+ " == " +date_format_lastseen11);
		}
		catch (Exception e)
		{
			System.out.println("Image is not able: Oops! Looks like we don't have data for this search criteria yet.");

			Reporter.log("<B><font color = 'Red'> ==> -</font> Image is not able: Oops! Looks like we don't have data for this search criteria yet.");
		}		

		try 
		{
			String date_format_lastseen12=null;
			String lastimageDate12=null;
			Reporter.log(" ");
			Reporter.log("<B><font color ='red'> -12 Ad -</font>  ");
			System.out.println("");
			System.out.println("12 Ads");
			String imageDate12=date12.getText();
			Reporter.log("<B><font color = 'blue'> ==> -</font> Capturing Image Date");
			System.out.println("Current Image Date: "+imageDate12);
			Reporter.log("<B><font color = 'blue'> ==> -</font> Image Date is :"+imageDate12);

			helper.waitFor(ShowAnalytics12);
			helper.highLightElement(driver, ShowAnalytics12);
			helper.jsScrollintoview(ShowAnalytics12);
			ShowAnalytics12.click();
			Reporter.log("<B><font color = 'blue'> ==> -</font> Clicked On Show Analytics Icon");


			String parent12=driver.getWindowHandle();
			Set<String>s12=driver.getWindowHandles();
			// Now iterate using Iterator
			Iterator<String> I12= s12.iterator();
			while(I12.hasNext())
			{
				String child_window12=I12.next();
				if(!parent12.equals(child_window12))
				{
					driver.switchTo().window(child_window12);
					helper.waitForPageToLoad();
					System.out.println(driver.switchTo().window(child_window12).getTitle());
					lastimageDate12 = lastSeen.getText();
					System.out.println("Analytics Image Last Seen Date: "+lastimageDate12);
					Reporter.log("<B><font color = 'blue'> ==> -</font> Image Date of Last Seen is :"+lastimageDate12);

					driver.close();
				}			

			}

			driver.switchTo().window(parent12);
			String[] splitString = lastimageDate12.split(" ");
			for(int i=0;i<splitString.length-2;i++) {
				//    String actualDate=splitString[i]; 
				date_format_lastseen12= splitString[i+1]+" "+ splitString[i]+" " + splitString[i+2];

				//  System.out.println("splitString : " + splitString[i]);
				System.out.println("Change Date format lastseen Date: " + date_format_lastseen12);
				System.out.println("Image last seen Date: " + imageDate12);
			}

			Assert.assertEquals(imageDate12, date_format_lastseen12);
			Reporter.log("<B><font color = 'blue'> ==> -</font> Both Last Seen Date are Matching in Assert Pass :"+imageDate12+ " == " +date_format_lastseen12);
			System.out.println("Both Last Seen Date are Matching in Assert Pass :"+imageDate12+ " == " +date_format_lastseen12);
		}
		catch (Exception e)
		{
			System.out.println("Image is not able: Oops! Looks like we don't have data for this search criteria yet.");

			Reporter.log("<B><font color = 'Red'> ==> -</font> Image is not able: Oops! Looks like we don't have data for this search criteria yet.");
		}	

		try 
		{
			String date_format_lastseen13=null;
			String lastimageDate13=null;
			Reporter.log(" ");
			Reporter.log("<B><font color ='red'> -13 Ad -</font>  ");
			System.out.println("");
			System.out.println("13 Ads");
			String imageDate13=date13.getText();
			Reporter.log("<B><font color = 'blue'> ==> -</font> Capturing Image Date");
			System.out.println("Current Image Date: "+imageDate13);
			Reporter.log("<B><font color = 'blue'> ==> -</font> Image Date is :"+imageDate13);

			helper.waitFor(ShowAnalytics13);
			helper.highLightElement(driver, ShowAnalytics13);
			helper.jsScrollintoview(ShowAnalytics13);
			ShowAnalytics13.click();
			Reporter.log("<B><font color = 'blue'> ==> -</font> Clicked On Show Analytics Icon");

			String parent13=driver.getWindowHandle();
			Set<String>s13=driver.getWindowHandles();
			// Now iterate using Iterator
			Iterator<String> I13= s13.iterator();
			while(I13.hasNext())
			{
				String child_window13=I13.next();
				if(!parent13.equals(child_window13))
				{
					driver.switchTo().window(child_window13);
					helper.waitForPageToLoad();
					System.out.println(driver.switchTo().window(child_window13).getTitle());
					lastimageDate13 = lastSeen.getText();
					System.out.println("Analytics Image Last Seen Date: "+lastimageDate13);
					Reporter.log("<B><font color = 'blue'> ==> -</font> Image Date of Last Seen is :"+lastimageDate13);

					driver.close();
				}			

			}

			driver.switchTo().window(parent13);
			String[] splitString = lastimageDate13.split(" ");
			for(int i=0;i<splitString.length-2;i++) {
				//    String actualDate=splitString[i]; 
				date_format_lastseen13= splitString[i+1]+" "+ splitString[i]+" " + splitString[i+2];

				//  System.out.println("splitString : " + splitString[i]);
				System.out.println("Change Date format lastseen Date: " + date_format_lastseen13);
				System.out.println("Image last seen Date: " + imageDate13);
			}

			Assert.assertEquals(imageDate13, date_format_lastseen13);
			Reporter.log("<B><font color = 'blue'> ==> -</font> Both Last Seen Date are Matching in Assert Pass :"+imageDate13+ " == " +date_format_lastseen13);
			System.out.println("Both Last Seen Date are Matching in Assert Pass :"+imageDate13+ " == " +date_format_lastseen13);
		}
		catch (Exception e)
		{
			System.out.println("Image is not able: Oops! Looks like we don't have data for this search criteria yet.");

			Reporter.log("<B><font color = 'Red'> ==> -</font> Image is not able: Oops! Looks like we don't have data for this search criteria yet.");
		}	


		try 
		{
			String date_format_lastseen14=null;
			String lastimageDate14=null;
			Reporter.log(" ");
			Reporter.log("<B><font color ='red'> -14 Ad -</font>  ");
			System.out.println("");
			System.out.println("14 Ads");

			String imageDate14=date14.getText();
			Reporter.log("<B><font color = 'blue'> ==> -</font> Capturing Image Date");
			System.out.println("Current Image Date: "+imageDate14);
			Reporter.log("<B><font color = 'blue'> ==> -</font> Image Date is :"+imageDate14);

			helper.waitFor(ShowAnalytics14);
			helper.highLightElement(driver, ShowAnalytics14);
			helper.jsScrollintoview(ShowAnalytics14);
			ShowAnalytics14.click();
			Reporter.log("<B><font color = 'blue'> ==> -</font> Clicked On Show Analytics Icon");

			String parent14=driver.getWindowHandle();
			Set<String>s14=driver.getWindowHandles();
			// Now iterate using Iterator
			Iterator<String> I14= s14.iterator();
			while(I14.hasNext())
			{
				String child_window14=I14.next();
				if(!parent14.equals(child_window14))
				{
					driver.switchTo().window(child_window14);
					helper.waitForPageToLoad();
					System.out.println(driver.switchTo().window(child_window14).getTitle());
					lastimageDate14 = lastSeen.getText();
					System.out.println("Analytics Image Last Seen Date: "+lastimageDate14);
					Reporter.log("<B><font color = 'blue'> ==> -</font> Image Date of Last Seen is :"+lastimageDate14);

					driver.close();
				}			

			}

			driver.switchTo().window(parent14);
			String[] splitString = lastimageDate14.split(" ");
			for(int i=0;i<splitString.length-2;i++) {
				//    String actualDate=splitString[i]; 
				date_format_lastseen14= splitString[i+1]+" "+ splitString[i]+" " + splitString[i+2];

				//  System.out.println("splitString : " + splitString[i]);
				System.out.println("Change Date format lastseen Date: " + date_format_lastseen14);
				System.out.println("Image last seen Date: " + imageDate14);
			}

			Assert.assertEquals(imageDate14, date_format_lastseen14);
			Reporter.log("<B><font color = 'blue'> ==> -</font> Both Last Seen Date are Matching in Assert Pass :"+imageDate14+ " == " +date_format_lastseen14);
			System.out.println("Both Last Seen Date are Matching in Assert Pass :"+imageDate14+ " == " +date_format_lastseen14);
		}
		catch (Exception e)
		{

			System.out.println("Image is not able: Oops! Looks like we don't have data for this search criteria yet.");
			Reporter.log("<B><font color = 'Red'> ==> -</font> Image is not able: Oops! Looks like we don't have data for this search criteria yet.");
		}					

		try 
		{
			String date_format_lastseen15=null;
			String lastimageDate15=null;
			Reporter.log(" ");
			Reporter.log("<B><font color ='red'> -15 Ad -</font>  ");
			System.out.println("");
			System.out.println("15 Ads");
			String imageDate15=date15.getText();
			Reporter.log("<B><font color = 'blue'> ==> -</font> Capturing Image Date");
			System.out.println("Current Image Date: "+imageDate15);
			Reporter.log("<B><font color = 'blue'> ==> -</font> Image Date is :"+imageDate15);

			helper.waitFor(ShowAnalytics15);
			helper.highLightElement(driver, ShowAnalytics15);
			helper.jsScrollintoview(ShowAnalytics15);
			ShowAnalytics15.click();
			Reporter.log("<B><font color = 'blue'> ==> -</font> Clicked On Show Analytics Icon");


			String parent15=driver.getWindowHandle();
			Set<String>s15=driver.getWindowHandles();
			// Now iterate using Iterator
			Iterator<String> I15= s15.iterator();
			while(I15.hasNext())
			{
				String child_window15=I15.next();
				if(!parent15.equals(child_window15))
				{
					driver.switchTo().window(child_window15);
					helper.waitForPageToLoad();
					System.out.println(driver.switchTo().window(child_window15).getTitle());
					lastimageDate15 = lastSeen.getText();
					System.out.println("Analytics Image Last Seen Date: "+lastimageDate15);
					Reporter.log("<B><font color = 'blue'> ==> -</font> Image Date of Last Seen is :"+lastimageDate15);

					driver.close();
				}			

			}

			driver.switchTo().window(parent15);
			String[] splitString = lastimageDate15.split(" ");
			for(int i=0;i<splitString.length-2;i++) {
				//    String actualDate=splitString[i]; 
				date_format_lastseen15= splitString[i+1]+" "+ splitString[i]+" " + splitString[i+2];

				//  System.out.println("splitString : " + splitString[i]);
				System.out.println("Change Date format lastseen Date: " + date_format_lastseen15);
				System.out.println("Image last seen Date: " + imageDate15);
			}

			Assert.assertEquals(imageDate15, date_format_lastseen15);
			Reporter.log("<B><font color = 'blue'> ==> -</font> Both Last Seen Date are Matching in Assert Pass :"+imageDate15+ " == " +date_format_lastseen15);
			System.out.println("Both Last Seen Date are Matching in Assert Pass :"+imageDate15+ " == " +date_format_lastseen15);
		}
		catch (Exception e)
		{


			System.out.println("Image is not able: Oops! Looks like we don't have data for this search criteria yet.");

			Reporter.log("<B><font color = 'Red'> ==> -</font> Image is not able: Oops! Looks like we don't have data for this search criteria yet.");
		}	


	}

	public void AdSeenBetween_Last_Seven_Days() throws InterruptedException
	{

		helper.waitForPageToLoad();
		Reporter.log("  ");
		System.out.println("  ");
		Reporter.log("<B><font color = 'green'>  - ShortBy Newest -Ad Seen Between Last Seven Days Step will Start from here </font> ");
		helper.waitFor(adSeenbetweenfilter);
		helper.highLightElement(driver, adSeenbetweenfilter);
		helper.jsScrollintoview(adSeenbetweenfilter);
		adSeenbetweenfilter.click();
		Reporter.log("<B><font color = 'orange'> Step1 -</font> Clicked On Ad Seen between filter Icon");

		helper.waitFor(adSeenbetween_last_Seven_Days);
		helper.highLightElement(driver, adSeenbetween_last_Seven_Days);
		helper.jsScrollintoview(adSeenbetween_last_Seven_Days);
		adSeenbetween_last_Seven_Days.click();
		Reporter.log("<B><font color = 'orange'> Step2 -</font> Clicked On Ad Seen Between Last Seven Days Icon");

		helper.waitFor(searchButton);
		helper.highLightElement(driver, searchButton);
		helper.jsScrollintoview(searchButton);
		searchButton.click();
		Reporter.log("<B><font color = 'orange'> Step3 -</font> Clicked On Search Button Icon");
		helper.waitForPageToLoad();

		String totaladscount=totaladscount_ad.getText();
		System.out.println("Totaladscount: "+totaladscount);
		Reporter.log("<B><font color = 'orange'> Step4 -</font>  Total Ad Count is :"+ totaladscount);



		try {
			Reporter.log(" ");
			Reporter.log("<B><font color ='red'> -1 Ad -</font>  ");
			System.out.println("");
			System.out.println("1 Ads");

			Reporter.log("<B><font color = 'blue'> ==> -</font> Capturing Image Date");
			String  imageDate1= date1.getText();
			Reporter.log("<B><font color = 'blue'> ==> -</font> Image Date is :"+imageDate1);
			System.out.println("Current Date: "+imageDate1);


			helper.waitFor(ShowAnalytics1);
			helper.highLightElement(driver, ShowAnalytics1);
			helper.jsScrollintoview(ShowAnalytics1);
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
			helper.highLightElement(driver,lastSeen);
			helper.jsScrollintoview(lastSeen);
			//	    System.out.println("Testing last Seen Adresss: "+lastSeen);
			String   lastSeenDate_today1=null;
			lastSeenDate_today1 = lastSeen.getText();
			Reporter.log("<B><font color = 'blue'> ==> -</font> Last_Seen_childWindow AdDetails Page= " + lastSeenDate_today1);
			System.out.println("lastSeenDate_today: "+lastSeenDate_today1);


			driver.close();

			driver.switchTo().window(parent1);
			System.out.println("lastSeenDate_today1: "+lastSeenDate_today1);


			String join1 = null;
			//  String[] actualDate = null;

			String[] splitString1 = lastSeenDate_today1.split(" ");
			for(int i=0;i<splitString1.length-2;i++) {
				String actualDate=splitString1[i]; 
				join1= splitString1[i+1]+" "+ splitString1[i]+" " + splitString1[i+2];
				//  System.out.println("splitString : " + splitString[i]);
				System.out.println("lastseen Date: " + join1);
			}
			Assert.assertEquals(imageDate1, join1);
			Reporter.log("<B><font color = 'blue'> ==> -</font> Both Last Seen Date are Matching in Assert Pass :"+imageDate1+ " == " +join1);
			System.out.println("Both Last Seen Date are Matching in Assert Pass :"+imageDate1+ " == " +join1);
		}
		catch(Exception e) {
			System.out.println("Image is not able: Oops! Looks like we don't have data for this search criteria yet.");

			Reporter.log("<B><font color = 'Red'> ==> -</font> Image is not able: Oops! Looks like we don't have data for this search criteria yet.");
		}

		try {
			Reporter.log(" ");
			Reporter.log("<B><font color ='red'> -2 Ad -</font>  ");
			System.out.println("");
			System.out.println("2 Ads");

			Reporter.log("<B><font color = 'blue'> ==> -</font> Capturing Image Date");
			String  imageDate2= date2.getText();
			Reporter.log("<B><font color = 'blue'> ==> -</font> Image Date is :"+imageDate2);
			System.out.println("Current Date: "+imageDate2);


			helper.waitFor(ShowAnalytics2);
			helper.highLightElement(driver, ShowAnalytics2);
			helper.jsScrollintoview(ShowAnalytics2);
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
			helper.highLightElement(driver,lastSeen);
			helper.jsScrollintoview(lastSeen);
			//	    System.out.println("Testing last Seen Adresss: "+lastSeen);
			String   lastSeenDate_today2=null;
			lastSeenDate_today2 = lastSeen.getText();
			Reporter.log("<B><font color = 'blue'> ==> -</font> Last_Seen_childWindow AdDetails Page= " + lastSeenDate_today2);
			System.out.println("lastSeenDate_today: "+lastSeenDate_today2);


			driver.close();

			driver.switchTo().window(parent2);
			System.out.println("lastSeenDate_today1: "+lastSeenDate_today2);


			String join2 = null;
			//  String[] actualDate = null;

			String[] splitString2 = lastSeenDate_today2.split(" ");
			for(int i=0;i<splitString2.length-2;i++) {
				String actualDate=splitString2[i]; 
				join2= splitString2[i+1]+" "+ splitString2[i]+" " + splitString2[i+2];
				//  System.out.println("splitString : " + splitString[i]);
				System.out.println("lastseen Date: " + join2);
			}
			Assert.assertEquals(imageDate2, join2);
			Reporter.log("<B><font color = 'blue'> ==> -</font> Both Last Seen Date are Matching in Assert Pass :"+imageDate2+ " == " +join2);
			System.out.println("Both Last Seen Date are Matching in Assert Pass :"+imageDate2+ " == " +join2);
		}
		catch(Exception e) {
			System.out.println("Image is not able: Oops! Looks like we don't have data for this search criteria yet.");

			Reporter.log("<B><font color = 'Red'> ==> -</font> Image is not able: Oops! Looks like we don't have data for this search criteria yet.");
		}

		try {
			Reporter.log(" ");
			Reporter.log("<B><font color ='red'> -3 Ad -</font>  ");
			System.out.println("");
			System.out.println("3 Ads");

			Reporter.log("<B><font color = 'blue'> ==> -</font> Capturing Image Date");
			String  imageDate3= date3.getText();
			Reporter.log("<B><font color = 'blue'> ==> -</font> Image Date is :"+imageDate3);
			System.out.println("Current Date: "+imageDate3);


			helper.waitFor(ShowAnalytics3);
			helper.highLightElement(driver, ShowAnalytics3);
			helper.jsScrollintoview(ShowAnalytics3);
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
			helper.highLightElement(driver,lastSeen);
			helper.jsScrollintoview(lastSeen);
			//	    System.out.println("Testing last Seen Adresss: "+lastSeen);
			String   lastSeenDate_today3=null;
			lastSeenDate_today3 = lastSeen.getText();
			Reporter.log("<B><font color = 'blue'> ==> -</font> Last_Seen_childWindow AdDetails Page= " + lastSeenDate_today3);
			System.out.println("lastSeenDate_today: "+lastSeenDate_today3);


			driver.close();

			driver.switchTo().window(parent3);
			System.out.println("lastSeenDate_today1: "+lastSeenDate_today3);


			String join3 = null;
			//  String[] actualDate = null;

			String[] splitString3 = lastSeenDate_today3.split(" ");
			for(int i=0;i<splitString3.length-2;i++) {
				String actualDate=splitString3[i]; 
				join3= splitString3[i+1]+" "+ splitString3[i]+" " + splitString3[i+2];
				//  System.out.println("splitString : " + splitString[i]);
				System.out.println("lastseen Date: " + join3);
			}
			Assert.assertEquals(imageDate3, join3);
			Reporter.log("<B><font color = 'blue'> ==> -</font> Both Last Seen Date are Matching in Assert Pass :"+imageDate3+ " == " +join3);
			System.out.println("Both Last Seen Date are Matching in Assert Pass :"+imageDate3+ " == " +join3);
		}
		catch(Exception e) {
			System.out.println("Image is not able: Oops! Looks like we don't have data for this search criteria yet.");

			Reporter.log("<B><font color = 'Red'> ==> -</font> Image is not able: Oops! Looks like we don't have data for this search criteria yet.");
		}		

		try {
			Reporter.log(" ");
			Reporter.log("<B><font color ='red'> -4 Ad -</font>  ");
			System.out.println("");
			System.out.println("4 Ads");

			Reporter.log("<B><font color = 'blue'> ==> -</font> Capturing Image Date");
			String  imageDate4= date4.getText();
			Reporter.log("<B><font color = 'blue'> ==> -</font> Image Date is :"+imageDate4);
			System.out.println("Current Date: "+imageDate4);


			helper.waitFor(ShowAnalytics4);
			helper.highLightElement(driver, ShowAnalytics4);
			helper.jsScrollintoview(ShowAnalytics4);
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
			helper.highLightElement(driver,lastSeen);
			helper.jsScrollintoview(lastSeen);
			//	    System.out.println("Testing last Seen Adresss: "+lastSeen);
			String   lastSeenDate_today4=null;
			lastSeenDate_today4 = lastSeen.getText();
			Reporter.log("<B><font color = 'blue'> ==> -</font> Last_Seen_childWindow AdDetails Page= " + lastSeenDate_today4);
			System.out.println("lastSeenDate_today: "+lastSeenDate_today4);


			driver.close();

			driver.switchTo().window(parent4);
			System.out.println("lastSeenDate_today1: "+lastSeenDate_today4);


			String join4 = null;
			//  String[] actualDate = null;

			String[] splitString4 = lastSeenDate_today4.split(" ");
			for(int i=0;i<splitString4.length-2;i++) {
				String actualDate=splitString4[i]; 
				join4= splitString4[i+1]+" "+ splitString4[i]+" " + splitString4[i+2];
				//  System.out.println("splitString : " + splitString[i]);
				System.out.println("lastseen Date: " + join4);
			}
			Assert.assertEquals(imageDate4, join4);
			Reporter.log("<B><font color = 'blue'> ==> -</font> Both Last Seen Date are Matching in Assert Pass :"+imageDate4+ " == " +join4);
			System.out.println("Both Last Seen Date are Matching in Assert Pass :"+imageDate4+ " == " +join4);
		}
		catch(Exception e) {
			System.out.println("Image is not able: Oops! Looks like we don't have data for this search criteria yet.");

			Reporter.log("<B><font color = 'Red'> ==> -</font> Image is not able: Oops! Looks like we don't have data for this search criteria yet.");
		}		


		try {
			Reporter.log(" ");
			Reporter.log("<B><font color ='red'> -5 Ad -</font>  ");
			System.out.println("");
			System.out.println("5 Ads");

			Reporter.log("<B><font color = 'blue'> ==> -</font> Capturing Image Date");
			String  imageDate5= date5.getText();
			Reporter.log("<B><font color = 'blue'> ==> -</font> Image Date is :"+imageDate5);
			System.out.println("Current Date: "+imageDate5);


			helper.waitFor(ShowAnalytics5);
			helper.highLightElement(driver, ShowAnalytics5);
			helper.jsScrollintoview(ShowAnalytics5);
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
			helper.highLightElement(driver,lastSeen);
			helper.jsScrollintoview(lastSeen);
			//	    System.out.println("Testing last Seen Adresss: "+lastSeen);
			String   lastSeenDate_today5=null;
			lastSeenDate_today5 = lastSeen.getText();
			Reporter.log("<B><font color = 'blue'> ==> -</font> Last_Seen_childWindow AdDetails Page= " + lastSeenDate_today5);
			System.out.println("lastSeenDate_today: "+lastSeenDate_today5);


			driver.close();

			driver.switchTo().window(parent5);
			System.out.println("lastSeenDate_today1: "+lastSeenDate_today5);


			String join5= null;
			//  String[] actualDate = null;

			String[] splitString5 = lastSeenDate_today5.split(" ");
			for(int i=0;i<splitString5.length-2;i++) {
				String actualDate=splitString5[i]; 
				join5= splitString5[i+1]+" "+ splitString5[i]+" " + splitString5[i+2];
				//  System.out.println("splitString : " + splitString[i]);
				System.out.println("lastseen Date: " + join5);
			}
			Assert.assertEquals(imageDate5, join5);
			Reporter.log("<B><font color = 'blue'> ==> -</font> Both Last Seen Date are Matching in Assert Pass :"+imageDate5+ " == " +join5);
			System.out.println("Both Last Seen Date are Matching in Assert Pass :"+imageDate5+ " == " +join5);
		}
		catch(Exception e) {
			System.out.println("Image is not able: Oops! Looks like we don't have data for this search criteria yet.");

			Reporter.log("<B><font color = 'Red'> ==> -</font> Image is not able: Oops! Looks like we don't have data for this search criteria yet.");
		}	

		try {
			Reporter.log(" ");
			Reporter.log("<B><font color ='red'> -6 Ad -</font>  ");
			System.out.println("");
			System.out.println("6 Ads");

			Reporter.log("<B><font color = 'blue'> ==> -</font> Capturing Image Date");
			String  imageDate6= date6.getText();
			Reporter.log("<B><font color = 'blue'> ==> -</font> Image Date is :"+imageDate6);
			System.out.println("Current Date: "+imageDate6);


			helper.waitFor(ShowAnalytics6);
			helper.highLightElement(driver, ShowAnalytics6);
			helper.jsScrollintoview(ShowAnalytics6);
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
			helper.highLightElement(driver,lastSeen);
			helper.jsScrollintoview(lastSeen);
			//	    System.out.println("Testing last Seen Adresss: "+lastSeen);
			String   lastSeenDate_today6=null;
			lastSeenDate_today6 = lastSeen.getText();
			Reporter.log("<B><font color = 'blue'> ==> -</font> Last_Seen_childWindow AdDetails Page= " + lastSeenDate_today6);
			System.out.println("lastSeenDate_today: "+lastSeenDate_today6);


			driver.close();

			driver.switchTo().window(parent6);
			System.out.println("lastSeenDate_today1: "+lastSeenDate_today6);


			String join6= null;
			//  String[] actualDate = null;

			String[] splitString6 = lastSeenDate_today6.split(" ");
			for(int i=0;i<splitString6.length-2;i++) {
				String actualDate=splitString6[i]; 
				join6= splitString6[i+1]+" "+ splitString6[i]+" " + splitString6[i+2];
				//  System.out.println("splitString : " + splitString[i]);
				System.out.println("lastseen Date: " + join6);
			}
			Assert.assertEquals(imageDate6, join6);
			Reporter.log("<B><font color = 'blue'> ==> -</font> Both Last Seen Date are Matching in Assert Pass :"+imageDate6+ " == " +join6);
			System.out.println("Both Last Seen Date are Matching in Assert Pass :"+imageDate6+ " == " +join6);
		}
		catch(Exception e) {
			System.out.println("Image is not able: Oops! Looks like we don't have data for this search criteria yet.");

			Reporter.log("<B><font color = 'Red'> ==> -</font> Image is not able: Oops! Looks like we don't have data for this search criteria yet.");
		}		

		try {
			Reporter.log(" ");
			Reporter.log("<B><font color ='red'> -7 Ad -</font>  ");
			System.out.println("");
			System.out.println("7 Ads");

			Reporter.log("<B><font color = 'blue'> ==> -</font> Capturing Image Date");
			String  imageDate7= date7.getText();
			Reporter.log("<B><font color = 'blue'> ==> -</font> Image Date is :"+imageDate7);
			System.out.println("Current Date: "+imageDate7);


			helper.waitFor(ShowAnalytics7);
			helper.highLightElement(driver, ShowAnalytics7);
			helper.jsScrollintoview(ShowAnalytics7);
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
			helper.highLightElement(driver,lastSeen);
			helper.jsScrollintoview(lastSeen);
			//	    System.out.println("Testing last Seen Adresss: "+lastSeen);
			String   lastSeenDate_today7=null;
			lastSeenDate_today7 = lastSeen.getText();
			Reporter.log("<B><font color = 'blue'> ==> -</font> Last_Seen_childWindow AdDetails Page= " + lastSeenDate_today7);
			System.out.println("lastSeenDate_today: "+lastSeenDate_today7);


			driver.close();

			driver.switchTo().window(parent7);
			System.out.println("lastSeenDate_today1: "+lastSeenDate_today7);


			String join7= null;
			//  String[] actualDate = null;

			String[] splitString7 = lastSeenDate_today7.split(" ");
			for(int i=0;i<splitString7.length-2;i++) {
				String actualDate=splitString7[i]; 
				join7= splitString7[i+1]+" "+ splitString7[i]+" " + splitString7[i+2];
				//  System.out.println("splitString : " + splitString[i]);
				System.out.println("lastseen Date: " + join7);
			}
			Assert.assertEquals(imageDate7, join7);
			Reporter.log("<B><font color = 'blue'> ==> -</font> Both Last Seen Date are Matching in Assert Pass :"+imageDate7+ " == " +join7);
			System.out.println("Both Last Seen Date are Matching in Assert Pass :"+imageDate7+ " == " +join7);
		}
		catch(Exception e) {
			System.out.println("Image is not able: Oops! Looks like we don't have data for this search criteria yet.");

			Reporter.log("<B><font color = 'Red'> ==> -</font> Image is not able: Oops! Looks like we don't have data for this search criteria yet.");
		}		

		try {
			Reporter.log(" ");
			Reporter.log("<B><font color ='red'> -8 Ad -</font>  ");
			System.out.println("");
			System.out.println("8 Ads");

			Reporter.log("<B><font color = 'blue'> ==> -</font> Capturing Image Date");
			String  imageDate8= date8.getText();
			Reporter.log("<B><font color = 'blue'> ==> -</font> Image Date is :"+imageDate8);
			System.out.println("Current Date: "+imageDate8);


			helper.waitFor(ShowAnalytics8);
			helper.highLightElement(driver, ShowAnalytics8);
			helper.jsScrollintoview(ShowAnalytics8);
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
			helper.highLightElement(driver,lastSeen);
			helper.jsScrollintoview(lastSeen);
			//	    System.out.println("Testing last Seen Adresss: "+lastSeen);
			String   lastSeenDate_today8=null;
			lastSeenDate_today8 = lastSeen.getText();
			Reporter.log("<B><font color = 'blue'> ==> -</font> Last_Seen_childWindow AdDetails Page= " + lastSeenDate_today8);
			System.out.println("lastSeenDate_today: "+lastSeenDate_today8);


			driver.close();

			driver.switchTo().window(parent8);
			System.out.println("lastSeenDate_today1: "+lastSeenDate_today8);


			String join8= null;
			//  String[] actualDate = null;

			String[] splitString8 = lastSeenDate_today8.split(" ");
			for(int i=0;i<splitString8.length-2;i++) {
				String actualDate=splitString8[i]; 
				join8= splitString8[i+1]+" "+ splitString8[i]+" " + splitString8[i+2];
				//  System.out.println("splitString : " + splitString[i]);
				System.out.println("lastseen Date: " + join8);
			}
			Assert.assertEquals(imageDate8, join8);
			Reporter.log("<B><font color = 'blue'> ==> -</font> Both Last Seen Date are Matching in Assert Pass :"+imageDate8+ " == " +join8);
			System.out.println("Both Last Seen Date are Matching in Assert Pass :"+imageDate8+ " == " +join8);
		}
		catch(Exception e) {
			System.out.println("Image is not able: Oops! Looks like we don't have data for this search criteria yet.");

			Reporter.log("<B><font color = 'Red'> ==> -</font> Image is not able: Oops! Looks like we don't have data for this search criteria yet.");
		}		


		try {
			Reporter.log(" ");
			Reporter.log("<B><font color ='red'> -8 Ad -</font>  ");
			System.out.println("");
			System.out.println("8 Ads");

			Reporter.log("<B><font color = 'blue'> ==> -</font> Capturing Image Date");
			String  imageDate8= date8.getText();
			Reporter.log("<B><font color = 'blue'> ==> -</font> Image Date is :"+imageDate8);
			System.out.println("Current Date: "+imageDate8);


			helper.waitFor(ShowAnalytics8);
			helper.highLightElement(driver, ShowAnalytics8);
			helper.jsScrollintoview(ShowAnalytics8);
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
			helper.highLightElement(driver,lastSeen);
			helper.jsScrollintoview(lastSeen);
			//	    System.out.println("Testing last Seen Adresss: "+lastSeen);
			String   lastSeenDate_today8=null;
			lastSeenDate_today8 = lastSeen.getText();
			Reporter.log("<B><font color = 'blue'> ==> -</font> Last_Seen_childWindow AdDetails Page= " + lastSeenDate_today8);
			System.out.println("lastSeenDate_today: "+lastSeenDate_today8);


			driver.close();

			driver.switchTo().window(parent8);
			System.out.println("lastSeenDate_today1: "+lastSeenDate_today8);


			String join8= null;
			//  String[] actualDate = null;

			String[] splitString8 = lastSeenDate_today8.split(" ");
			for(int i=0;i<splitString8.length-2;i++) {
				String actualDate=splitString8[i]; 
				join8= splitString8[i+1]+" "+ splitString8[i]+" " + splitString8[i+2];
				//  System.out.println("splitString : " + splitString[i]);
				System.out.println("lastseen Date: " + join8);
			}
			Assert.assertEquals(imageDate8, join8);
			Reporter.log("<B><font color = 'blue'> ==> -</font> Both Last Seen Date are Matching in Assert Pass :"+imageDate8+ " == " +join8);
			System.out.println("Both Last Seen Date are Matching in Assert Pass :"+imageDate8+ " == " +join8);
		}
		catch(Exception e) {
			System.out.println("Image is not able: Oops! Looks like we don't have data for this search criteria yet.");

			Reporter.log("<B><font color = 'Red'> ==> -</font> Image is not able: Oops! Looks like we don't have data for this search criteria yet.");
		}

		try {
			Reporter.log(" ");
			Reporter.log("<B><font color ='red'> -9 Ad -</font>  ");
			System.out.println("");
			System.out.println("9 Ads");

			Reporter.log("<B><font color = 'blue'> ==> -</font> Capturing Image Date");
			String  imageDate9= date9.getText();
			Reporter.log("<B><font color = 'blue'> ==> -</font> Image Date is :"+imageDate9);
			System.out.println("Current Date: "+imageDate9);


			helper.waitFor(ShowAnalytics9);
			helper.highLightElement(driver, ShowAnalytics9);
			helper.jsScrollintoview(ShowAnalytics9);
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
			helper.highLightElement(driver,lastSeen);
			helper.jsScrollintoview(lastSeen);
			//	    System.out.println("Testing last Seen Adresss: "+lastSeen);
			String   lastSeenDate_today9=null;
			lastSeenDate_today9 = lastSeen.getText();
			Reporter.log("<B><font color = 'blue'> ==> -</font> Last_Seen_childWindow AdDetails Page= " + lastSeenDate_today9);
			System.out.println("lastSeenDate_today: "+lastSeenDate_today9);


			driver.close();

			driver.switchTo().window(parent9);
			System.out.println("lastSeenDate_today1: "+lastSeenDate_today9);


			String join9= null;
			//  String[] actualDate = null;

			String[] splitString9 = lastSeenDate_today9.split(" ");
			for(int i=0;i<splitString9.length-2;i++) {
				String actualDate=splitString9[i]; 
				join9= splitString9[i+1]+" "+ splitString9[i]+" " + splitString9[i+2];
				//  System.out.println("splitString : " + splitString[i]);
				System.out.println("lastseen Date: " + join9);
			}
			Assert.assertEquals(imageDate9, join9);
			Reporter.log("<B><font color = 'blue'> ==> -</font> Both Last Seen Date are Matching in Assert Pass :"+imageDate9+ " == " +join9);
			System.out.println("Both Last Seen Date are Matching in Assert Pass :"+imageDate9+ " == " +join9);
		}
		catch(Exception e) {
			System.out.println("Image is not able: Oops! Looks like we don't have data for this search criteria yet.");

			Reporter.log("<B><font color = 'Red'> ==> -</font> Image is not able: Oops! Looks like we don't have data for this search criteria yet.");
		}

		try {
			Reporter.log(" ");
			Reporter.log("<B><font color ='red'> -10 Ad -</font>  ");
			System.out.println("");
			System.out.println("10 Ads");

			Reporter.log("<B><font color = 'blue'> ==> -</font> Capturing Image Date");
			String  imageDate10= date10.getText();
			Reporter.log("<B><font color = 'blue'> ==> -</font> Image Date is :"+imageDate10);
			System.out.println("Current Date: "+imageDate10);


			helper.waitFor(ShowAnalytics10);
			helper.highLightElement(driver, ShowAnalytics10);
			helper.jsScrollintoview(ShowAnalytics10);
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
			helper.highLightElement(driver,lastSeen);
			helper.jsScrollintoview(lastSeen);
			//	    System.out.println("Testing last Seen Adresss: "+lastSeen);
			String   lastSeenDate_today10=null;
			lastSeenDate_today10 = lastSeen.getText();
			Reporter.log("<B><font color = 'blue'> ==> -</font> Last_Seen_childWindow AdDetails Page= " + lastSeenDate_today10);
			System.out.println("lastSeenDate_today: "+lastSeenDate_today10);


			driver.close();

			driver.switchTo().window(parent10);
			System.out.println("lastSeenDate_today1: "+lastSeenDate_today10);


			String join10= null;
			//  String[] actualDate = null;

			String[] splitString10 = lastSeenDate_today10.split(" ");
			for(int i=0;i<splitString10.length-2;i++) {
				String actualDate=splitString10[i]; 
				join10= splitString10[i+1]+" "+ splitString10[i]+" " + splitString10[i+2];
				//  System.out.println("splitString : " + splitString[i]);
				System.out.println("lastseen Date: " + join10);
			}
			Assert.assertEquals(imageDate10, join10);
			Reporter.log("<B><font color = 'blue'> ==> -</font> Both Last Seen Date are Matching in Assert Pass :"+imageDate10+ " == " +join10);
			System.out.println("Both Last Seen Date are Matching in Assert Pass :"+imageDate10+ " == " +join10);
		}
		catch(Exception e) {
			System.out.println("Image is not able: Oops! Looks like we don't have data for this search criteria yet.");

			Reporter.log("<B><font color = 'Red'> ==> -</font> Image is not able: Oops! Looks like we don't have data for this search criteria yet.");
		}		

		try {
			Reporter.log(" ");
			Reporter.log("<B><font color ='red'> -11 Ad -</font>  ");
			System.out.println("");
			System.out.println("11 Ads");

			Reporter.log("<B><font color = 'blue'> ==> -</font> Capturing Image Date");
			String  imageDate11= date11.getText();
			Reporter.log("<B><font color = 'blue'> ==> -</font> Image Date is :"+imageDate11);
			System.out.println("Current Date: "+imageDate11);


			helper.waitFor(ShowAnalytics11);
			helper.highLightElement(driver, ShowAnalytics11);
			helper.jsScrollintoview(ShowAnalytics11);
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
			helper.highLightElement(driver,lastSeen);
			helper.jsScrollintoview(lastSeen);
			//	    System.out.println("Testing last Seen Adresss: "+lastSeen);
			String   lastSeenDate_today11=null;
			lastSeenDate_today11 = lastSeen.getText();
			Reporter.log("<B><font color = 'blue'> ==> -</font> Last_Seen_childWindow AdDetails Page= " + lastSeenDate_today11);
			System.out.println("lastSeenDate_today: "+lastSeenDate_today11);


			driver.close();

			driver.switchTo().window(parent11);
			System.out.println("lastSeenDate_today1: "+lastSeenDate_today11);


			String join11= null;
			//  String[] actualDate = null;

			String[] splitString11 = lastSeenDate_today11.split(" ");
			for(int i=0;i<splitString11.length-2;i++) {
				String actualDate=splitString11[i]; 
				join11= splitString11[i+1]+" "+ splitString11[i]+" " + splitString11[i+2];
				//  System.out.println("splitString : " + splitString[i]);
				System.out.println("lastseen Date: " + join11);
			}
			Assert.assertEquals(imageDate11, join11);
			Reporter.log("<B><font color = 'blue'> ==> -</font> Both Last Seen Date are Matching in Assert Pass :"+imageDate11+ " == " +join11);
			System.out.println("Both Last Seen Date are Matching in Assert Pass :"+imageDate11+ " == " +join11);
		}
		catch(Exception e) {
			System.out.println("Image is not able: Oops! Looks like we don't have data for this search criteria yet.");

			Reporter.log("<B><font color = 'Red'> ==> -</font> Image is not able: Oops! Looks like we don't have data for this search criteria yet.");
		}		



		try {
			Reporter.log(" ");
			Reporter.log("<B><font color ='red'> -12 Ad -</font>  ");
			System.out.println("");
			System.out.println("12 Ads");

			Reporter.log("<B><font color = 'blue'> ==> -</font> Capturing Image Date");
			String  imageDate12= date12.getText();
			Reporter.log("<B><font color = 'blue'> ==> -</font> Image Date is :"+imageDate12);
			System.out.println("Current Date: "+imageDate12);


			helper.waitFor(ShowAnalytics12);
			helper.highLightElement(driver, ShowAnalytics12);
			helper.jsScrollintoview(ShowAnalytics12);
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
			helper.highLightElement(driver,lastSeen);
			helper.jsScrollintoview(lastSeen);
			//	    System.out.println("Testing last Seen Adresss: "+lastSeen);
			String   lastSeenDate_today12=null;
			lastSeenDate_today12 = lastSeen.getText();
			Reporter.log("<B><font color = 'blue'> ==> -</font> Last_Seen_childWindow AdDetails Page= " + lastSeenDate_today12);
			System.out.println("lastSeenDate_today: "+lastSeenDate_today12);


			driver.close();

			driver.switchTo().window(parent12);
			System.out.println("lastSeenDate_today1: "+lastSeenDate_today12);


			String join12= null;
			//  String[] actualDate = null;

			String[] splitString12 = lastSeenDate_today12.split(" ");
			for(int i=0;i<splitString12.length-2;i++) {
				String actualDate=splitString12[i]; 
				join12= splitString12[i+1]+" "+ splitString12[i]+" " + splitString12[i+2];
				//  System.out.println("splitString : " + splitString[i]);
				System.out.println("lastseen Date: " + join12);
			}
			Assert.assertEquals(imageDate12, join12);
			Reporter.log("<B><font color = 'blue'> ==> -</font> Both Last Seen Date are Matching in Assert Pass :"+imageDate12+ " == " +join12);
			System.out.println("Both Last Seen Date are Matching in Assert Pass :"+imageDate12+ " == " +join12);
		}
		catch(Exception e) {
			System.out.println("Image is not able: Oops! Looks like we don't have data for this search criteria yet.");

			Reporter.log("<B><font color = 'Red'> ==> -</font> Image is not able: Oops! Looks like we don't have data for this search criteria yet.");
		}	

		try {
			Reporter.log(" ");
			Reporter.log("<B><font color ='red'> -13 Ad -</font>  ");
			System.out.println("");
			System.out.println("13 Ads");

			Reporter.log("<B><font color = 'blue'> ==> -</font> Capturing Image Date");
			String  imageDate13= date13.getText();
			Reporter.log("<B><font color = 'blue'> ==> -</font> Image Date is :"+imageDate13);
			System.out.println("Current Date: "+imageDate13);


			helper.waitFor(ShowAnalytics13);
			helper.highLightElement(driver, ShowAnalytics13);
			helper.jsScrollintoview(ShowAnalytics13);
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
			helper.highLightElement(driver,lastSeen);
			helper.jsScrollintoview(lastSeen);
			//	    System.out.println("Testing last Seen Adresss: "+lastSeen);
			String   lastSeenDate_today13=null;
			lastSeenDate_today13 = lastSeen.getText();
			Reporter.log("<B><font color = 'blue'> ==> -</font> Last_Seen_childWindow AdDetails Page= " + lastSeenDate_today13);
			System.out.println("lastSeenDate_today: "+lastSeenDate_today13);


			driver.close();

			driver.switchTo().window(parent13);
			System.out.println("lastSeenDate_today1: "+lastSeenDate_today13);


			String join13= null;
			//  String[] actualDate = null;

			String[] splitString13 = lastSeenDate_today13.split(" ");
			for(int i=0;i<splitString13.length-2;i++) {
				String actualDate=splitString13[i]; 
				join13= splitString13[i+1]+" "+ splitString13[i]+" " + splitString13[i+2];
				//  System.out.println("splitString : " + splitString[i]);
				System.out.println("lastseen Date: " + join13);
			}
			Assert.assertEquals(imageDate13, join13);
			Reporter.log("<B><font color = 'blue'> ==> -</font> Both Last Seen Date are Matching in Assert Pass :"+imageDate13+ " == " +join13);
			System.out.println("Both Last Seen Date are Matching in Assert Pass :"+imageDate13+ " == " +join13);
		}
		catch(Exception e) {
			System.out.println("Image is not able: Oops! Looks like we don't have data for this search criteria yet.");

			Reporter.log("<B><font color = 'Red'> ==> -</font> Image is not able: Oops! Looks like we don't have data for this search criteria yet.");
		}			

		try {
			Reporter.log(" ");
			Reporter.log("<B><font color ='red'> -14 Ad -</font>  ");
			System.out.println("");
			System.out.println("14 Ads");

			Reporter.log("<B><font color = 'blue'> ==> -</font> Capturing Image Date");
			String  imageDate14= date14.getText();
			Reporter.log("<B><font color = 'blue'> ==> -</font> Image Date is :"+imageDate14);
			System.out.println("Current Date: "+imageDate14);


			helper.waitFor(ShowAnalytics14);
			helper.highLightElement(driver, ShowAnalytics14);
			helper.jsScrollintoview(ShowAnalytics14);
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
			helper.highLightElement(driver,lastSeen);
			helper.jsScrollintoview(lastSeen);
			//	    System.out.println("Testing last Seen Adresss: "+lastSeen);
			String   lastSeenDate_today14=null;
			lastSeenDate_today14 = lastSeen.getText();
			Reporter.log("<B><font color = 'blue'> ==> -</font> Last_Seen_childWindow AdDetails Page= " + lastSeenDate_today14);
			System.out.println("lastSeenDate_today: "+lastSeenDate_today14);


			driver.close();

			driver.switchTo().window(parent14);
			System.out.println("lastSeenDate_today1: "+lastSeenDate_today14);


			String join14= null;
			//  String[] actualDate = null;

			String[] splitString14 = lastSeenDate_today14.split(" ");
			for(int i=0;i<splitString14.length-2;i++) {
				String actualDate=splitString14[i]; 
				join14= splitString14[i+1]+" "+ splitString14[i]+" " + splitString14[i+2];
				//  System.out.println("splitString : " + splitString[i]);
				System.out.println("lastseen Date: " + join14);
			}
			Assert.assertEquals(imageDate14, join14);
			Reporter.log("<B><font color = 'blue'> ==> -</font> Both Last Seen Date are Matching in Assert Pass :"+imageDate14+ " == " +join14);
			System.out.println("Both Last Seen Date are Matching in Assert Pass :"+imageDate14+ " == " +join14);
		}
		catch(Exception e) {
			System.out.println("Image is not able: Oops! Looks like we don't have data for this search criteria yet.");

			Reporter.log("<B><font color = 'Red'> ==> -</font> Image is not able: Oops! Looks like we don't have data for this search criteria yet.");
		}	


		try {
			Reporter.log(" ");
			Reporter.log("<B><font color ='red'> -15 Ad -</font>  ");
			System.out.println("");
			System.out.println("15 Ads");

			Reporter.log("<B><font color = 'blue'> ==> -</font> Capturing Image Date");
			String  imageDate15= date15.getText();
			Reporter.log("<B><font color = 'blue'> ==> -</font> Image Date is :"+imageDate15);
			System.out.println("Current Date: "+imageDate15);

			helper.waitFor(ShowAnalytics15);
			helper.highLightElement(driver, ShowAnalytics15);
			helper.jsScrollintoview(ShowAnalytics15);
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
			helper.highLightElement(driver,lastSeen);
			helper.jsScrollintoview(lastSeen);
			//	    System.out.println("Testing last Seen Adresss: "+lastSeen);
			String   lastSeenDate_today15=null;
			lastSeenDate_today15 = lastSeen.getText();
			Reporter.log("<B><font color = 'blue'> ==> -</font> Last_Seen_childWindow AdDetails Page= " + lastSeenDate_today15);
			System.out.println("lastSeenDate_today: "+lastSeenDate_today15);


			driver.close();

			driver.switchTo().window(parent15);
			System.out.println("lastSeenDate_today1: "+lastSeenDate_today15);


			String join15= null;
			//  String[] actualDate = null;

			String[] splitString15 = lastSeenDate_today15.split(" ");
			for(int i=0;i<splitString15.length-2;i++) {
				String actualDate=splitString15[i]; 
				join15= splitString15[i+1]+" "+ splitString15[i]+" " + splitString15[i+2];
				//  System.out.println("splitString : " + splitString[i]);
				System.out.println("lastseen Date: " + join15);
			}
			Assert.assertEquals(imageDate15, join15);
			Reporter.log("<B><font color = 'blue'> ==> -</font> Both Last Seen Date are Matching in Assert Pass :"+imageDate15+ " == " +join15);
			System.out.println("Both Last Seen Date are Matching in Assert Pass :"+imageDate15+ " == " +join15);
		}
		catch(Exception e) {
			System.out.println("Image is not able: Oops! Looks like we don't have data for this search criteria yet.");

			Reporter.log("<B><font color = 'Red'> ==> -</font> Image is not able: Oops! Looks like we don't have data for this search criteria yet.");
		}	

	}	






	public void AdSeenBetween_Last_Thirty_Days() throws InterruptedException 
	{

		System.out.println();
		Reporter.log("      ");
		System.out.println("-ShortBy Newest -Ad Seen Between Last Thirty Days:");
		
		helper.waitForPageToLoad();
		Reporter.log("<B><font color = 'green'> - ShortBy Newest -Ad Seen Between Last Thirty Days Step will Start from here </font> "); 

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

		try 
		{ 
			String date_format_lastseen1=null;
			String lastimageDate1=null;

			Reporter.log(" ");
			Reporter.log("<B><font color ='red'> -1 Ad -</font>  ");
			System.out.println("");
			System.out.println("1 Ads");

			Reporter.log("<B><font color = 'blue'> ==> -</font> Capturing Image Date");
			String imageDate1=date1.getText();
			Reporter.log("<B><font color = 'blue'> ==> -</font> Image Date is :"+imageDate1); 
			System.out.println("Current Image Date: "+imageDate1);

			helper.waitFor(ShowAnalytics1); 
			helper.highLightElement(driver,ShowAnalytics1); 
			helper.jsScrollintoview(ShowAnalytics1);

			String linkText1 = ShowAnalytics1.getAttribute("href");				
			String idString1 = null;
			String[] splitStringid1 = linkText1.split("/");
			for(int i=0;i<splitStringid1.length;i++) {
				String actualDate1=splitStringid1[splitStringid1.length-1]; 
				System.out.println(" ID of the  Ad =" + actualDate1);
				Reporter.log("<B><font color = 'blue'> ==> -</font> ID of the  Ad = " + actualDate1);
				break;
			}

			ShowAnalytics1.click(); 
			Reporter.log("<B><font color = 'blue'> ==> -</font> Clicked On Show Analytics Icon"); 
			helper.waitForPageToLoad(); 

			String parent1=driver.getWindowHandle();
			Set<String>s1=driver.getWindowHandles(); 
			Iterator<String> I1= s1.iterator(); 
			while(I1.hasNext()) 
			{ 
				String child_window1=I1.next(); 
				if(!parent1.equals(child_window1))
				{
					driver.switchTo().window(child_window1); 
					helper.waitForPageToLoad();
					System.out.println(driver.switchTo().window(child_window1).getTitle()); 
					helper.Scrollintoview(lastSeen);
					helper.highLightElement(driver, lastSeen);
					lastimageDate1 = lastSeen.getText();
					System.out.println("Analytics Image Last Seen Date: "+lastimageDate1);
					Reporter.log("<B><font color = 'blue'> ==> -</font> Image Date of Last Seen is :"+lastimageDate1);
					driver.close();
				} 
			}
			driver.switchTo().window(parent1);
			String[] splitString1 = lastimageDate1.split(" ");
			for(int i=0;i<splitString1.length-2;i++) {
				//    String actualDate=splitString[i]; 
				date_format_lastseen1= splitString1[i+1]+" "+ splitString1[i]+" " + splitString1[i+2];

				//  System.out.println("splitString : " + splitString[i]);
				System.out.println("Change Date format lastseen Date: " + date_format_lastseen1);
				System.out.println("Image last seen Date: " + imageDate1);
			}

			Assert.assertEquals(imageDate1, date_format_lastseen1);
			Reporter.log("<B><font color = 'blue'> ==> -</font> Both Last Seen Date are Matching in Assert Pass :"+imageDate1+ " == " +date_format_lastseen1);
			System.out.println("Both Last Seen Date are Matching in Assert Pass :"+imageDate1+ " == " +date_format_lastseen1);
		} 
		catch (Exception e) 
		{
			System.out.println("Image is not able: Oops! Looks like we don't have data for this search criteria yet.");

			Reporter.log("<B><font color = 'Red'> ==> -</font> Image is not able: Oops! Looks like we don't have data for this search criteria yet."); 
		}

		try 
		{ 
			String date_format_lastseen2=null;
			String lastimageDate2=null;

			Reporter.log(" ");
			Reporter.log("<B><font color ='red'> -2 Ad -</font>  ");
			System.out.println("");
			System.out.println("2 Ads");

			Reporter.log("<B><font color = 'blue'> ==> -</font> Capturing Image Date");
			String imageDate2=date2.getText();
			Reporter.log("<B><font color = 'blue'> ==> -</font> Image Date is :"+imageDate2); 
			System.out.println("Current Image Date: "+imageDate2);

			helper.waitFor(ShowAnalytics2); 
			helper.highLightElement(driver,ShowAnalytics2); 
			helper.jsScrollintoview(ShowAnalytics2);
			helper.waitFor(ShowAnalytics2); 
			helper.highLightElement(driver,ShowAnalytics2); 
			helper.jsScrollintoview(ShowAnalytics2);

			String linkText2 = ShowAnalytics2.getAttribute("href");
			String idString2 = null;
			String[] splitStringid2 = linkText2.split("/");
			for(int i=0;i<splitStringid2.length;i++) {
				String actualDate2=splitStringid2[splitStringid2.length-1]; 
				System.out.println(" ID of the  Ad =" + actualDate2);
				Reporter.log("<B><font color = 'blue'> ==> -</font> ID of the  Ad = " + actualDate2);
				break;
			}

			ShowAnalytics2.click(); 
			Reporter.log("<B><font color = 'blue'> ==> -</font> Clicked On Show Analytics Icon"); 
			helper.waitForPageToLoad(); 

			String parent2=driver.getWindowHandle();
			Set<String>s2=driver.getWindowHandles(); 
			Iterator<String> I2= s2.iterator(); 
			while(I2.hasNext()) 
			{ 
				String child_window2=I2.next(); 
				if(!parent2.equals(child_window2))
				{
					driver.switchTo().window(child_window2); 
					helper.waitForPageToLoad();
					System.out.println(driver.switchTo().window(child_window2).getTitle()); 
					helper.Scrollintoview(lastSeen);
					lastimageDate2 = lastSeen.getText();
					System.out.println("Analytics Image Last Seen Date: "+lastimageDate2);
					Reporter.log("<B><font color = 'blue'> ==> -</font> Image Date of Last Seen is :"+lastimageDate2);
					driver.close();
				} 
			}
			driver.switchTo().window(parent2);
			String[] splitString2 = lastimageDate2.split(" ");
			for(int i=0;i<splitString2.length-2;i++) {
				//    String actualDate=splitString[i]; 
				date_format_lastseen2= splitString2[i+1]+" "+ splitString2[i]+" " + splitString2[i+2];

				//  System.out.println("splitString : " + splitString[i]);
				System.out.println("Change Date format lastseen Date: " + date_format_lastseen2);
				System.out.println("Image last seen Date: " + imageDate2);
			}

			Assert.assertEquals(imageDate2, date_format_lastseen2);
			Reporter.log("<B><font color = 'blue'> ==> -</font> Both Last Seen Date are Matching in Assert Pass :"+imageDate2+ " == " +date_format_lastseen2);
			System.out.println("Both Last Seen Date are Matching in Assert Pass :"+imageDate2+ " == " +date_format_lastseen2);
		} 
		catch (Exception e) 
		{
			System.out.println("Image is not able: Oops! Looks like we don't have data for this search criteria yet.");

			Reporter.log("<B><font color = 'Red'> ==> -</font> Image is not able: Oops! Looks like we don't have data for this search criteria yet."); 
		}	

		try 
		{ 
			String date_format_lastseen3=null;
			String lastimageDate3=null;

			Reporter.log(" ");
			Reporter.log("<B><font color ='red'> -3 Ad -</font>  ");
			System.out.println("");
			System.out.println("3 Ads");

			Reporter.log("<B><font color = 'blue'> ==> -</font> Capturing Image Date");
			String imageDate3=date3.getText();
			Reporter.log("<B><font color = 'blue'> ==> -</font> Image Date is :"+imageDate3); 
			System.out.println("Current Image Date: "+imageDate3);

			helper.waitFor(ShowAnalytics3); 
			helper.highLightElement(driver,ShowAnalytics3); 
			helper.jsScrollintoview(ShowAnalytics3);
			helper.waitFor(ShowAnalytics3); 
			helper.highLightElement(driver,ShowAnalytics3); 
			helper.jsScrollintoview(ShowAnalytics3);

			String linkText3 = ShowAnalytics3.getAttribute("href");
			String idString3 = null;
			String[] splitStringid3 = linkText3.split("/");
			for(int i=0;i<splitStringid3.length;i++) {
				String actualDate3=splitStringid3[splitStringid3.length-1]; 
				System.out.println(" ID of the  Ad =" + actualDate3);
				Reporter.log("<B><font color = 'blue'> ==> -</font> ID of the  Ad = " + actualDate3);
				break;
			}

			ShowAnalytics3.click(); 
			Reporter.log("<B><font color = 'blue'> ==> -</font> Clicked On Show Analytics Icon"); 
			helper.waitForPageToLoad(); 

			String parent3=driver.getWindowHandle();
			Set<String>s3=driver.getWindowHandles(); 
			Iterator<String> I3= s3.iterator(); 
			while(I3.hasNext()) 
			{ 
				String child_window3=I3.next(); 
				if(!parent3.equals(child_window3))
				{
					driver.switchTo().window(child_window3); 
					helper.waitForPageToLoad();
					System.out.println(driver.switchTo().window(child_window3).getTitle()); 
					helper.Scrollintoview(lastSeen);
					lastimageDate3 = lastSeen.getText();
					System.out.println("Analytics Image Last Seen Date: "+lastimageDate3);
					Reporter.log("<B><font color = 'blue'> ==> -</font> Image Date of Last Seen is :"+lastimageDate3);
					driver.close();
				} 
			}
			driver.switchTo().window(parent3);
			String[] splitString3 = lastimageDate3.split(" ");
			for(int i=0;i<splitString3.length-2;i++) {
				//    String actualDate=splitString[i]; 
				date_format_lastseen3= splitString3[i+1]+" "+ splitString3[i]+" " + splitString3[i+2];

				//  System.out.println("splitString : " + splitString[i]);
				System.out.println("Change Date format lastseen Date: " + date_format_lastseen3);
				System.out.println("Image last seen Date: " + imageDate3);
			}

			Assert.assertEquals(imageDate3, date_format_lastseen3);
			Reporter.log("<B><font color = 'blue'> ==> -</font> Both Last Seen Date are Matching in Assert Pass :"+imageDate3+ " == " +date_format_lastseen3);
			System.out.println("Both Last Seen Date are Matching in Assert Pass :"+imageDate3+ " == " +date_format_lastseen3);
		} 
		catch (Exception e) 
		{
			System.out.println("Image is not able: Oops! Looks like we don't have data for this search criteria yet.");

			Reporter.log("<B><font color = 'Red'> ==> -</font> Image is not able: Oops! Looks like we don't have data for this search criteria yet.");
		}

		try 
		{ 
			String date_format_lastseen4=null;
			String lastimageDate4=null;

			Reporter.log(" ");
			Reporter.log("<B><font color ='red'> -4 Ad -</font>  ");
			System.out.println("");
			System.out.println("4 Ads");

			Reporter.log("<B><font color = 'blue'> ==> -</font> Capturing Image Date");
			String imageDate4=date4.getText();
			Reporter.log("<B><font color = 'blue'> ==> -</font> Image Date is :"+imageDate4); 
			System.out.println("Current Image Date: "+imageDate4);

			helper.waitFor(ShowAnalytics4); 
			helper.highLightElement(driver,ShowAnalytics4); 
			helper.jsScrollintoview(ShowAnalytics4);

			String linkText4 = ShowAnalytics4.getAttribute("href");
			String idString4 = null;
			String[] splitStringid4 = linkText4.split("/");
			for(int i=0;i<splitStringid4.length;i++) {
				String actualDate4=splitStringid4[splitStringid4.length-1]; 
				System.out.println(" ID of the  Ad =" + actualDate4);
				Reporter.log("<B><font color = 'blue'> ==> -</font> ID of the  Ad = " + actualDate4);
				break;
			}

			ShowAnalytics4.click(); 
			Reporter.log("<B><font color = 'blue'> ==> -</font> Clicked On Show Analytics Icon"); 
			helper.waitForPageToLoad(); 

			String parent4=driver.getWindowHandle();
			Set<String>s4=driver.getWindowHandles(); 
			Iterator<String> I4= s4.iterator(); 
			while(I4.hasNext()) 
			{ 
				String child_window4=I4.next(); 
				if(!parent4.equals(child_window4))
				{
					driver.switchTo().window(child_window4); 
					helper.waitForPageToLoad();
					System.out.println(driver.switchTo().window(child_window4).getTitle()); 
					helper.Scrollintoview(lastSeen);
					lastimageDate4 = lastSeen.getText();
					System.out.println("Analytics Image Last Seen Date: "+lastimageDate4);
					Reporter.log("<B><font color = 'blue'> ==> -</font> Image Date of Last Seen is :"+lastimageDate4);
					driver.close();
				} 
			}
			driver.switchTo().window(parent4);
			String[] splitString4 = lastimageDate4.split(" ");
			for(int i=0;i<splitString4.length-2;i++) {
				//    String actualDate=splitString[i]; 
				date_format_lastseen4= splitString4[i+1]+" "+ splitString4[i]+" " + splitString4[i+2];

				//  System.out.println("splitString : " + splitString[i]);
				System.out.println("Change Date format lastseen Date: " + date_format_lastseen4);
				System.out.println("Image last seen Date: " + imageDate4);
			}

			Assert.assertEquals(imageDate4, date_format_lastseen4);
			Reporter.log("<B><font color = 'blue'> ==> -</font> Both Last Seen Date are Matching in Assert Pass :"+imageDate4+ " == " +date_format_lastseen4);
			System.out.println("Both Last Seen Date are Matching in Assert Pass :"+imageDate4+ " == " +date_format_lastseen4);
		} 
		catch (Exception e) 
		{
			System.out.println("Image is not able: Oops! Looks like we don't have data for this search criteria yet.");

			Reporter.log("<B><font color = 'Red'> ==> -</font> Image is not able: Oops! Looks like we don't have data for this search criteria yet.");
		}		

		try 
		{ 
			String date_format_lastseen5=null;
			String lastimageDate5=null;

			Reporter.log(" ");
			Reporter.log("<B><font color ='red'> -5 Ad -</font>  ");
			System.out.println("");
			System.out.println("5 Ads");

			Reporter.log("<B><font color = 'blue'> ==> -</font> Capturing Image Date");
			String imageDate5=date5.getText();
			Reporter.log("<B><font color = 'blue'> ==> -</font> Image Date is :"+imageDate5); 
			System.out.println("Current Image Date: "+imageDate5);

			helper.waitFor(ShowAnalytics5); 
			helper.highLightElement(driver,ShowAnalytics5); 
			helper.jsScrollintoview(ShowAnalytics5);

			String linkText5 = ShowAnalytics5.getAttribute("href");
			String idString5 = null;
			String[] splitStringid5 = linkText5.split("/");
			for(int i=0;i<splitStringid5.length;i++) {
				String actualDate5=splitStringid5[splitStringid5.length-1]; 
				System.out.println(" ID of the  Ad =" + actualDate5);
				Reporter.log("<B><font color = 'blue'> ==> -</font> ID of the  Ad = " + actualDate5);
				break;
			}

			ShowAnalytics5.click(); 
			Reporter.log("<B><font color = 'blue'> ==> -</font> Clicked On Show Analytics Icon"); 
			helper.waitForPageToLoad(); 

			String parent5=driver.getWindowHandle();
			Set<String>s5=driver.getWindowHandles(); 
			Iterator<String> I5= s5.iterator(); 
			while(I5.hasNext()) 
			{ 
				String child_window5=I5.next(); 
				if(!parent5.equals(child_window5))
				{
					driver.switchTo().window(child_window5); 
					helper.waitForPageToLoad();
					System.out.println(driver.switchTo().window(child_window5).getTitle()); 
					helper.Scrollintoview(lastSeen);
					helper.highLightElement(driver, lastSeen);
					lastimageDate5 = lastSeen.getText();
					System.out.println("Analytics Image Last Seen Date: "+lastimageDate5);
					Reporter.log("<B><font color = 'blue'> ==> -</font> Image Date of Last Seen is :"+lastimageDate5);
					driver.close();
				} 
			}
			driver.switchTo().window(parent5);
			String[] splitString5 = lastimageDate5.split(" ");
			for(int i=0;i<splitString5.length-2;i++) {
				//    String actualDate=splitString[i]; 
				date_format_lastseen5= splitString5[i+1]+" "+ splitString5[i]+" " + splitString5[i+2];

				//  System.out.println("splitString : " + splitString[i]);
				System.out.println("Change Date format lastseen Date: " + date_format_lastseen5);
				System.out.println("Image last seen Date: " + imageDate5);
			}

			Assert.assertEquals(imageDate5, date_format_lastseen5);
			Reporter.log("<B><font color = 'blue'> ==> -</font> Both Last Seen Date are Matching in Assert Pass :"+imageDate5+ " == " +date_format_lastseen5);
			System.out.println("Both Last Seen Date are Matching in Assert Pass :"+imageDate5+ " == " +date_format_lastseen5);
		} 
		catch (Exception e) 
		{
			System.out.println("Image is not able: Oops! Looks like we don't have data for this search criteria yet.");

			Reporter.log("<B><font color = 'Red'> ==> -</font> Image is not able: Oops! Looks like we don't have data for this search criteria yet.");
		}

		try 
		{ 
			String date_format_lastseen6=null;
			String lastimageDate6=null;

			Reporter.log(" ");
			Reporter.log("<B><font color ='red'> -6 Ad -</font>  ");
			System.out.println("");
			System.out.println("6 Ads");

			Reporter.log("<B><font color = 'blue'> ==> -</font> Capturing Image Date");
			String imageDate6=date6.getText();
			Reporter.log("<B><font color = 'blue'> ==> -</font> Image Date is :"+imageDate6); 
			System.out.println("Current Image Date: "+imageDate6);

			helper.waitFor(ShowAnalytics6); 
			helper.highLightElement(driver,ShowAnalytics6); 
			helper.jsScrollintoview(ShowAnalytics6);

			String linkText6 = ShowAnalytics6.getAttribute("href");           
			String idString6 = null;
			String[] splitStringid6 = linkText6.split("/");
			for(int i=0;i<splitStringid6.length;i++) {
				String actualDate6=splitStringid6[splitStringid6.length-1]; 
				System.out.println(" ID of the  Ad =" + actualDate6);
				Reporter.log("<B><font color = 'blue'> ==> -</font> ID of the  Ad = " + actualDate6);
				break;
			}

			ShowAnalytics6.click(); 
			Reporter.log("<B><font color = 'blue'> ==> -</font> Clicked On Show Analytics Icon"); 
			helper.waitForPageToLoad(); 

			String parent6=driver.getWindowHandle();
			Set<String>s6=driver.getWindowHandles(); 
			Iterator<String> I6= s6.iterator(); 
			while(I6.hasNext()) 
			{ 
				String child_window6=I6.next(); 
				if(!parent6.equals(child_window6))
				{
					driver.switchTo().window(child_window6); 
					helper.waitForPageToLoad();
					System.out.println(driver.switchTo().window(child_window6).getTitle()); 
					helper.Scrollintoview(lastSeen);
					helper.highLightElement(driver, lastSeen);
					lastimageDate6 = lastSeen.getText();
					System.out.println("Analytics Image Last Seen Date: "+lastimageDate6);
					Reporter.log("<B><font color = 'blue'> ==> -</font> Image Date of Last Seen is :"+lastimageDate6);
					driver.close();
				} 
			}
			driver.switchTo().window(parent6);
			String[] splitString6 = lastimageDate6.split(" ");
			for(int i=0;i<splitString6.length-2;i++) {
				//    String actualDate=splitString[i]; 
				date_format_lastseen6= splitString6[i+1]+" "+ splitString6[i]+" " + splitString6[i+2];

				//  System.out.println("splitString : " + splitString[i]);
				System.out.println("Change Date format lastseen Date: " + date_format_lastseen6);
				System.out.println("Image last seen Date: " + imageDate6);
			}

			Assert.assertEquals(imageDate6, date_format_lastseen6);
			Reporter.log("<B><font color = 'blue'> ==> -</font> Both Last Seen Date are Matching in Assert Pass :"+imageDate6+ " == " +date_format_lastseen6);
			System.out.println("Both Last Seen Date are Matching in Assert Pass :"+imageDate6+ " == " +date_format_lastseen6);
		} 
		catch (Exception e) 
		{
			System.out.println("Image is not able: Oops! Looks like we don't have data for this search criteria yet.");

			Reporter.log("<B><font color = 'Red'> ==> -</font> Image is not able: Oops! Looks like we don't have data for this search criteria yet.");
		}		

		try 
		{ 
			String date_format_lastseen7=null;
			String lastimageDate7=null;

			Reporter.log(" ");
			Reporter.log("<B><font color ='red'> -7 Ad -</font>  ");
			System.out.println("");
			System.out.println("7 Ads");

			Reporter.log("<B><font color = 'blue'> ==> -</font> Capturing Image Date");
			String imageDate7=date7.getText();
			Reporter.log("<B><font color = 'blue'> ==> -</font> Image Date is :"+imageDate7); 
			System.out.println("Current Image Date: "+imageDate7);

			helper.waitFor(ShowAnalytics7); 
			helper.highLightElement(driver,ShowAnalytics7); 
			helper.jsScrollintoview(ShowAnalytics7);

			String linkText7 = ShowAnalytics7.getAttribute("href");
			String idString7 = null;
			String[] splitStringid7 = linkText7.split("/");
			for(int i=0;i<splitStringid7.length;i++) {
				String actualDate7=splitStringid7[splitStringid7.length-1]; 
				System.out.println(" ID of the  Ad =" + actualDate7);
				Reporter.log("<B><font color = 'blue'> ==> -</font> ID of the  Ad = " + actualDate7);
				break;
			}

			ShowAnalytics7.click(); 
			Reporter.log("<B><font color = 'blue'> ==> -</font> Clicked On Show Analytics Icon"); 
			helper.waitForPageToLoad(); 

			String parent7=driver.getWindowHandle();
			Set<String>s7=driver.getWindowHandles(); 
			Iterator<String> I7= s7.iterator(); 
			while(I7.hasNext()) 
			{ 
				String child_window7=I7.next(); 
				if(!parent7.equals(child_window7))
				{
					driver.switchTo().window(child_window7); 
					helper.waitForPageToLoad();
					System.out.println(driver.switchTo().window(child_window7).getTitle()); 
					helper.Scrollintoview(lastSeen);
					lastimageDate7 = lastSeen.getText();
					System.out.println("Analytics Image Last Seen Date: "+lastimageDate7);
					Reporter.log("<B><font color = 'blue'> ==> -</font> Image Date of Last Seen is :"+lastimageDate7);
					driver.close();
				} 
			}
			driver.switchTo().window(parent7);
			String[] splitString7 = lastimageDate7.split(" ");
			for(int i=0;i<splitString7.length-2;i++) {
				//    String actualDate=splitString[i]; 
				date_format_lastseen7= splitString7[i+1]+" "+ splitString7[i]+" " + splitString7[i+2];

				//  System.out.println("splitString : " + splitString[i]);
				System.out.println("Change Date format lastseen Date: " + date_format_lastseen7);
				System.out.println("Image last seen Date: " + imageDate7);
			}

			Assert.assertEquals(imageDate7, date_format_lastseen7);
			Reporter.log("<B><font color = 'blue'> ==> -</font> Both Last Seen Date are Matching in Assert Pass :"+imageDate7+ " == " +date_format_lastseen7);
			System.out.println("Both Last Seen Date are Matching in Assert Pass :"+imageDate7+ " == " +date_format_lastseen7);
		} 
		catch (Exception e) 
		{
			System.out.println("Image is not able: Oops! Looks like we don't have data for this search criteria yet.");

			Reporter.log("<B><font color = 'Red'> ==> -</font> Image is not able: Oops! Looks like we don't have data for this search criteria yet.");
		}		

		try 
		{ 
			String date_format_lastseen8=null;
			String lastimageDate8=null;

			Reporter.log(" ");
			Reporter.log("<B><font color ='red'> -8 Ad -</font>  ");
			System.out.println("");
			System.out.println("8 Ads");

			Reporter.log("<B><font color = 'blue'> ==> -</font> Capturing Image Date");
			String imageDate8=date8.getText();
			Reporter.log("<B><font color = 'blue'> ==> -</font> Image Date is :"+imageDate8); 
			System.out.println("Current Image Date: "+imageDate8);

			helper.waitFor(ShowAnalytics8); 
			helper.highLightElement(driver,ShowAnalytics8); 
			helper.jsScrollintoview(ShowAnalytics8);

			String linkText8 = ShowAnalytics8.getAttribute("href");
			String idString8 = null;
			String[] splitStringid8 = linkText8.split("/");
			for(int i=0;i<splitStringid8.length;i++) {
				String actualDate8=splitStringid8[splitStringid8.length-1]; 
				System.out.println(" ID of the  Ad =" + actualDate8);
				Reporter.log("<B><font color = 'blue'> ==> -</font> ID of the  Ad = " + actualDate8);
				break;
			}

			ShowAnalytics8.click(); 
			Reporter.log("<B><font color = 'blue'> ==> -</font> Clicked On Show Analytics Icon"); 
			helper.waitForPageToLoad(); 

			String parent8=driver.getWindowHandle();
			Set<String>s8=driver.getWindowHandles(); 
			Iterator<String> I8= s8.iterator(); 
			while(I8.hasNext()) 
			{ 
				String child_window8=I8.next(); 
				if(!parent8.equals(child_window8))
				{
					driver.switchTo().window(child_window8); 
					helper.waitForPageToLoad();
					System.out.println(driver.switchTo().window(child_window8).getTitle());
					helper.Scrollintoview(lastSeen);
					helper.highLightElement(driver,lastSeen);
					lastimageDate8 = lastSeen.getText();
					System.out.println("Analytics Image Last Seen Date: "+lastimageDate8);
					Reporter.log("<B><font color = 'blue'> ==> -</font> Image Date of Last Seen is :"+lastimageDate8);
					driver.close();
				} 
			}
			driver.switchTo().window(parent8);
			String[] splitString8 = lastimageDate8.split(" ");
			for(int i=0;i<splitString8.length-2;i++) {
				//    String actualDate=splitString[i]; 
				date_format_lastseen8= splitString8[i+1]+" "+ splitString8[i]+" " + splitString8[i+2];

				//  System.out.println("splitString : " + splitString[i]);
				System.out.println("Change Date format lastseen Date: " + date_format_lastseen8);
				System.out.println("Image last seen Date: " + imageDate8);
			}

			Assert.assertEquals(imageDate8, date_format_lastseen8);
			Reporter.log("<B><font color = 'blue'> ==> -</font> Both Last Seen Date are Matching in Assert Pass :"+imageDate8+ " == " +date_format_lastseen8);
			System.out.println("Both Last Seen Date are Matching in Assert Pass :"+imageDate8+ " == " +date_format_lastseen8);
		} 
		catch (Exception e) 
		{
			System.out.println("Image is not able: Oops! Looks like we don't have data for this search criteria yet.");

			Reporter.log("<B><font color = 'Red'> ==> -</font> Image is not able: Oops! Looks like we don't have data for this search criteria yet.");
		}		

		try 
		{ 
			String date_format_lastseen9=null;
			String lastimageDate9=null;

			Reporter.log(" ");
			Reporter.log("<B><font color ='red'> -9 Ad -</font>  ");
			System.out.println("");
			System.out.println("9 Ads");

			Reporter.log("<B><font color = 'blue'> ==> -</font> Capturing Image Date");
			String imageDate9=date9.getText();
			Reporter.log("<B><font color = 'blue'> ==> -</font> Image Date is :"+imageDate9); 
			System.out.println("Current Image Date: "+imageDate9);

			helper.waitFor(ShowAnalytics9); 
			helper.highLightElement(driver,ShowAnalytics9); 
			helper.jsScrollintoview(ShowAnalytics9);
			String linkText9 = ShowAnalytics3.getAttribute("href");
			String idString9 = null;
			String[] splitStringid9 = linkText9.split("/");
			for(int i=0;i<splitStringid9.length;i++) {
				String actualDate9=splitStringid9[splitStringid9.length-1]; 
				System.out.println(" ID of the  Ad =" + actualDate9);
				Reporter.log("<B><font color = 'blue'> ==> -</font> ID of the  Ad = " + actualDate9);
				break;
			}

			ShowAnalytics9.click(); 
			Reporter.log("<B><font color = 'blue'> ==> -</font> Clicked On Show Analytics Icon"); 
			helper.waitForPageToLoad(); 

			String parent9=driver.getWindowHandle();
			Set<String>s9=driver.getWindowHandles(); 
			Iterator<String> I9= s9.iterator(); 
			while(I9.hasNext()) 
			{ 
				String child_window9=I9.next(); 
				if(!parent9.equals(child_window9))
				{
					driver.switchTo().window(child_window9); 
					helper.waitForPageToLoad();
					System.out.println(driver.switchTo().window(child_window9).getTitle()); 
					helper.Scrollintoview(lastSeen);
					lastimageDate9 = lastSeen.getText();
					System.out.println("Analytics Image Last Seen Date: "+lastimageDate9);
					Reporter.log("<B><font color = 'blue'> ==> -</font> Image Date of Last Seen is :"+lastimageDate9);
					driver.close();
				} 
			}
			driver.switchTo().window(parent9);
			String[] splitString9 = lastimageDate9.split(" ");
			for(int i=0;i<splitString9.length-2;i++) {
				//    String actualDate=splitString[i]; 
				date_format_lastseen9= splitString9[i+1]+" "+ splitString9[i]+" " + splitString9[i+2];

				//  System.out.println("splitString : " + splitString[i]);
				System.out.println("Change Date format lastseen Date: " + date_format_lastseen9);
				System.out.println("Image last seen Date: " + imageDate9);
			}

			Assert.assertEquals(imageDate9, date_format_lastseen9);
			Reporter.log("<B><font color = 'blue'> ==> -</font> Both Last Seen Date are Matching in Assert Pass :"+imageDate9+ " == " +date_format_lastseen9);
			System.out.println("Both Last Seen Date are Matching in Assert Pass :"+imageDate9+ " == " +date_format_lastseen9);
		} 
		catch (Exception e) 
		{
			System.out.println("Image is not able: Oops! Looks like we don't have data for this search criteria yet.");

			Reporter.log("<B><font color = 'Red'> ==> -</font> Image is not able: Oops! Looks like we don't have data for this search criteria yet.");
		}	

		try 
		{ 
			String date_format_lastseen10=null;
			String lastimageDate10=null;
			Reporter.log(" ");
			Reporter.log("<B><font color ='red'> -10 Ad -</font>  ");
			System.out.println("");
			System.out.println("10 Ads");

			Reporter.log("<B><font color = 'blue'> ==> -</font> Capturing Image Date");
			String imageDate10=date10.getText();
			Reporter.log("<B><font color = 'blue'> ==> -</font> Image Date is :"+imageDate10); 
			System.out.println("Current Image Date: "+imageDate10);

			helper.waitFor(ShowAnalytics10); 
			helper.highLightElement(driver,ShowAnalytics10); 
			helper.jsScrollintoview(ShowAnalytics10);

			String linkText10 = ShowAnalytics10.getAttribute("href");
			String idString10 = null;
			String[] splitStringid10 = linkText10.split("/");
			for(int i=0;i<splitStringid10.length;i++) {
				String actualDate10=splitStringid10[splitStringid10.length-1]; 
				System.out.println(" ID of the  Ad =" + actualDate10);
				Reporter.log("<B><font color = 'blue'> ==> -</font> ID of the  Ad = " + actualDate10);
				break;
			}

			ShowAnalytics10.click(); 
			Reporter.log("<B><font color = 'blue'> ==> -</font> Clicked On Show Analytics Icon"); 
			helper.waitForPageToLoad(); 

			String parent10=driver.getWindowHandle();
			Set<String>s10=driver.getWindowHandles(); 
			Iterator<String> I10= s10.iterator(); 
			while(I10.hasNext()) 
			{ 
				String child_window10=I10.next(); 
				if(!parent10.equals(child_window10))
				{
					driver.switchTo().window(child_window10); 
					helper.waitForPageToLoad();
					System.out.println(driver.switchTo().window(child_window10).getTitle()); 
					helper.Scrollintoview(lastSeen);
					lastimageDate10 = lastSeen.getText();
					System.out.println("Analytics Image Last Seen Date: "+lastimageDate10);
					Reporter.log("<B><font color = 'blue'> ==> -</font> Image Date of Last Seen is :"+lastimageDate10);
					driver.close();
				} 
			}
			driver.switchTo().window(parent10);
			String[] splitString10 = lastimageDate10.split(" ");
			for(int i=0;i<splitString10.length-2;i++) {
				//    String actualDate=splitString[i]; 
				date_format_lastseen10= splitString10[i+1]+" "+ splitString10[i]+" " + splitString10[i+2];

				//  System.out.println("splitString : " + splitString[i]);
				System.out.println("Change Date format lastseen Date: " + date_format_lastseen10);
				System.out.println("Image last seen Date: " + imageDate10);
			}

			Assert.assertEquals(imageDate10, date_format_lastseen10);
			Reporter.log("<B><font color = 'blue'> ==> -</font> Both Last Seen Date are Matching in Assert Pass :"+imageDate10+ " == " +date_format_lastseen10);
			System.out.println("Both Last Seen Date are Matching in Assert Pass :"+imageDate10+ " == " +date_format_lastseen10);
		} 
		catch (Exception e) 
		{
			System.out.println("Image is not able: Oops! Looks like we don't have data for this search criteria yet.");

			Reporter.log("<B><font color = 'Red'> ==> -</font> Image is not able: Oops! Looks like we don't have data for this search criteria yet.");
		}		


		try 
		{ 
			String date_format_lastseen11=null;
			String lastimageDate11=null;
			Reporter.log(" ");
			Reporter.log("<B><font color ='red'> -11 Ad -</font>  ");
			System.out.println("");
			System.out.println("11 Ads");

			Reporter.log("<B><font color = 'blue'> ==> -</font> Capturing Image Date");
			String imageDate11=date11.getText();
			Reporter.log("<B><font color = 'blue'> ==> -</font> Image Date is :"+imageDate11); 
			System.out.println("Current Image Date: "+imageDate11);

			helper.waitFor(ShowAnalytics11); 
			helper.highLightElement(driver,ShowAnalytics11); 
			helper.jsScrollintoview(ShowAnalytics11);

			String linkText11 = ShowAnalytics11.getAttribute("href");
			String idString11 = null;
			String[] splitStringid11 = linkText11.split("/");
			for(int i=0;i<splitStringid11.length;i++) {
				String actualDate11=splitStringid11[splitStringid11.length-1]; 
				System.out.println(" ID of the  Ad =" + actualDate11);
				Reporter.log("<B><font color = 'blue'> ==> -</font> ID of the  Ad = " + actualDate11);
				break;
			}

			ShowAnalytics11.click(); 
			Reporter.log("<B><font color = 'blue'> ==> -</font> Clicked On Show Analytics Icon"); 
			helper.waitForPageToLoad(); 

			String parent11=driver.getWindowHandle();
			Set<String>s11=driver.getWindowHandles(); 
			Iterator<String> I11= s11.iterator(); 
			while(I11.hasNext()) 
			{ 
				String child_window11=I11.next(); 
				if(!parent11.equals(child_window11))
				{
					driver.switchTo().window(child_window11); 
					helper.waitForPageToLoad();
					System.out.println(driver.switchTo().window(child_window11).getTitle()); 
					helper.Scrollintoview(lastSeen);
					lastimageDate11 = lastSeen.getText();
					System.out.println("Analytics Image Last Seen Date: "+lastimageDate11);
					Reporter.log("<B><font color = 'blue'> ==> -</font> Image Date of Last Seen is :"+lastimageDate11);
					driver.close();
				} 
			}
			driver.switchTo().window(parent11);
			String[] splitString11 = lastimageDate11.split(" ");
			for(int i=0;i<splitString11.length-2;i++) {
				//    String actualDate=splitString[i]; 
				date_format_lastseen11= splitString11[i+1]+" "+ splitString11[i]+" " + splitString11[i+2];

				//  System.out.println("splitString : " + splitString[i]);
				System.out.println("Change Date format lastseen Date: " + date_format_lastseen11);
				System.out.println("Image last seen Date: " + imageDate11);
			}

			Assert.assertEquals(imageDate11, date_format_lastseen11);
			Reporter.log("<B><font color = 'blue'> ==> -</font> Both Last Seen Date are Matching in Assert Pass :"+imageDate11+ " == " +date_format_lastseen11);
			System.out.println("Both Last Seen Date are Matching in Assert Pass :"+imageDate11+ " == " +date_format_lastseen11);
		} 
		catch (Exception e) 
		{
			System.out.println("Image is not able: Oops! Looks like we don't have data for this search criteria yet.");

			Reporter.log("<B><font color = 'Red'> ==> -</font> Image is not able: Oops! Looks like we don't have data for this search criteria yet.");
		}	

		try 
		{ 
			String date_format_lastseen12=null;
			String lastimageDate12=null;
			Reporter.log(" ");
			Reporter.log("<B><font color ='red'> -12 Ad -</font>  ");
			System.out.println("");
			System.out.println("12 Ads");

			Reporter.log("<B><font color = 'blue'> ==> -</font> Capturing Image Date");
			String imageDate12=date12.getText();
			Reporter.log("<B><font color = 'blue'> ==> -</font> Image Date is :"+imageDate12); 
			System.out.println("Current Image Date: "+imageDate12);

			helper.waitFor(ShowAnalytics12); 
			helper.highLightElement(driver,ShowAnalytics12); 
			helper.jsScrollintoview(ShowAnalytics12);

			String linkText12 = ShowAnalytics12.getAttribute("href");
			String idString12 = null;
			String[] splitStringid12 = linkText12.split("/");
			for(int i=0;i<splitStringid12.length;i++) 
			{
				String actualDate12=splitStringid12[splitStringid12.length-1]; 
				System.out.println(" ID of the  Ad =" + actualDate12);
				Reporter.log("<B><font color = 'blue'> ==> -</font> ID of the  Ad = " + actualDate12);
				break;
			}

			ShowAnalytics12.click(); 
			Reporter.log("<B><font color = 'blue'> ==> -</font> Clicked On Show Analytics Icon"); 
			helper.waitForPageToLoad(); 

			String parent12=driver.getWindowHandle();
			Set<String>s12=driver.getWindowHandles(); 
			Iterator<String> I12= s12.iterator(); 
			while(I12.hasNext()) 
			{ 
				String child_window12=I12.next(); 
				if(!parent12.equals(child_window12))
				{
					driver.switchTo().window(child_window12); 
					helper.waitForPageToLoad();
					System.out.println(driver.switchTo().window(child_window12).getTitle()); 
					helper.Scrollintoview(lastSeen);
					lastimageDate12 = lastSeen.getText();
					System.out.println("Analytics Image Last Seen Date: "+lastimageDate12);
					Reporter.log("<B><font color = 'blue'> ==> -</font> Image Date of Last Seen is :"+lastimageDate12);
					driver.close();
				} 
			}
			driver.switchTo().window(parent12);
			String[] splitString12 = lastimageDate12.split(" ");
			for(int i=0;i<splitString12.length-2;i++) {
				//    String actualDate=splitString[i]; 
				date_format_lastseen12= splitString12[i+1]+" "+ splitString12[i]+" " + splitString12[i+2];

				//  System.out.println("splitString : " + splitString[i]);
				System.out.println("Change Date format lastseen Date: " + date_format_lastseen12);
				System.out.println("Image last seen Date: " + imageDate12);
			}

			Assert.assertEquals(imageDate12, date_format_lastseen12);
			Reporter.log("<B><font color = 'blue'> ==> -</font> Both Last Seen Date are Matching in Assert Pass :"+imageDate12+ " == " +date_format_lastseen12);
			System.out.println("Both Last Seen Date are Matching in Assert Pass :"+imageDate12+ " == " +date_format_lastseen12);
		} 
		catch (Exception e) 
		{System.out.println("Image is not able: Oops! Looks like we don't have data for this search criteria yet.");

		Reporter.log("<B><font color = 'Red'> ==> -</font> Image is not able: Oops! Looks like we don't have data for this search criteria yet."); 
		}	

		try 
		{ 
			String date_format_lastseen13=null;
			String lastimageDate13=null;
			Reporter.log(" ");
			Reporter.log("<B><font color ='red'> -13 Ad -</font>  ");
			System.out.println("");
			System.out.println("13 Ads");

			Reporter.log("<B><font color = 'blue'> ==> -</font> Capturing Image Date");
			String imageDate13=date13.getText();
			Reporter.log("<B><font color = 'blue'> ==> -</font> Image Date is :"+imageDate13); 
			System.out.println("Current Image Date: "+imageDate13);

			helper.waitFor(ShowAnalytics13); 
			helper.highLightElement(driver,ShowAnalytics13); 
			helper.jsScrollintoview(ShowAnalytics13);

			String linkText13 = ShowAnalytics13.getAttribute("href");
			String idString13 = null;
			String[] splitStringid13 = linkText13.split("/");
			for(int i=0;i<splitStringid13.length;i++) {
				String actualDate13=splitStringid13[splitStringid13.length-1]; 
				System.out.println(" ID of the  Ad =" + actualDate13);
				Reporter.log("<B><font color = 'blue'> ==> -</font> ID of the  Ad = " + actualDate13);
				break;
			}

			ShowAnalytics13.click(); 
			Reporter.log("<B><font color = 'blue'> ==> -</font> Clicked On Show Analytics Icon"); 
			helper.waitForPageToLoad(); 

			String parent13=driver.getWindowHandle();
			Set<String>s13=driver.getWindowHandles(); 
			Iterator<String> I13= s13.iterator(); 
			while(I13.hasNext()) 
			{ 
				String child_window13=I13.next(); 
				if(!parent13.equals(child_window13))
				{
					driver.switchTo().window(child_window13); 
					helper.waitForPageToLoad();
					System.out.println(driver.switchTo().window(child_window13).getTitle()); 
					helper.Scrollintoview(lastSeen);
					lastimageDate13 = lastSeen.getText();
					System.out.println("Analytics Image Last Seen Date: "+lastimageDate13);
					Reporter.log("<B><font color = 'blue'> ==> -</font> Image Date of Last Seen is :"+lastimageDate13);
					driver.close();
				} 
			}
			driver.switchTo().window(parent13);
			String[] splitString13 = lastimageDate13.split(" ");
			for(int i=0;i<splitString13.length-2;i++) {
				//    String actualDate=splitString[i]; 
				date_format_lastseen13= splitString13[i+1]+" "+ splitString13[i]+" " + splitString13[i+2];

				//  System.out.println("splitString : " + splitString[i]);
				System.out.println("Change Date format lastseen Date: " + date_format_lastseen13);
				System.out.println("Image last seen Date: " + imageDate13);
			}

			Assert.assertEquals(imageDate13, date_format_lastseen13);
			Reporter.log("<B><font color = 'blue'> ==> -</font> Both Last Seen Date are Matching in Assert Pass :"+imageDate13+ " == " +date_format_lastseen13);
			System.out.println("Both Last Seen Date are Matching in Assert Pass :"+imageDate13+ " == " +date_format_lastseen13);
		} 
		catch (Exception e) 
		{
			System.out.println("Image is not able: Oops! Looks like we don't have data for this search criteria yet.");

			Reporter.log("<B><font color = 'Red'> ==> -</font> Image is not able: Oops! Looks like we don't have data for this search criteria yet.");
		}	

		try 
		{ 
			String date_format_lastseen14=null;
			String lastimageDate14=null;
			Reporter.log(" ");
			Reporter.log("<B><font color ='red'> -14 Ad -</font>  ");
			System.out.println("");
			System.out.println("14 Ads");

			Reporter.log("<B><font color = 'blue'> ==> -</font> Capturing Image Date");
			String imageDate14=date14.getText();
			Reporter.log("<B><font color = 'blue'> ==> -</font> Image Date is :"+imageDate14); 
			System.out.println("Current Image Date: "+imageDate14);

			helper.waitFor(ShowAnalytics14); 
			helper.highLightElement(driver,ShowAnalytics14); 
			helper.jsScrollintoview(ShowAnalytics14);
			String linkText14 = ShowAnalytics14.getAttribute("href");
			String idString14 = null;
			String[] splitStringid14 = linkText14.split("/");
			for(int i=0;i<splitStringid14.length;i++) {
				String actualDate14=splitStringid14[splitStringid14.length-1]; 
				System.out.println(" ID of the  Ad =" + actualDate14);
				Reporter.log("<B><font color = 'blue'> ==> -</font> ID of the  Ad = " + actualDate14);
				break;
			}
			ShowAnalytics14.click(); 
			Reporter.log("<B><font color = 'blue'> ==> -</font> Clicked On Show Analytics Icon"); 
			helper.waitForPageToLoad(); 

			String parent14=driver.getWindowHandle();
			Set<String>s14=driver.getWindowHandles(); 
			Iterator<String> I14= s14.iterator(); 
			while(I14.hasNext()) 
			{ 
				String child_window14=I14.next(); 
				if(!parent14.equals(child_window14))
				{
					driver.switchTo().window(child_window14); 
					helper.waitForPageToLoad();
					System.out.println(driver.switchTo().window(child_window14).getTitle()); 
					helper.Scrollintoview(lastSeen);
					helper.highLightElement(driver,lastSeen);
					lastimageDate14 = lastSeen.getText();
					System.out.println("Analytics Image Last Seen Date: "+lastimageDate14);
					Reporter.log("<B><font color = 'blue'> ==> -</font> Image Date of Last Seen is :"+lastimageDate14);
					driver.close();
				} 
			}
			driver.switchTo().window(parent14);
			String[] splitString14 = lastimageDate14.split(" ");
			for(int i=0;i<splitString14.length-2;i++) {
				//    String actualDate=splitString[i]; 
				date_format_lastseen14= splitString14[i+1]+" "+ splitString14[i]+" " + splitString14[i+2];

				//  System.out.println("splitString : " + splitString[i]);
				System.out.println("Change Date format lastseen Date: " + date_format_lastseen14);
				System.out.println("Image last seen Date: " + imageDate14);
			}

			Assert.assertEquals(imageDate14, date_format_lastseen14);
			Reporter.log("<B><font color = 'blue'> ==> -</font> Both Last Seen Date are Matching in Assert Pass :"+imageDate14+ " == " +date_format_lastseen14);
			System.out.println("Both Last Seen Date are Matching in Assert Pass :"+imageDate14+ " == " +date_format_lastseen14);
		} 
		catch (Exception e) 
		{
			System.out.println("Image is not able: Oops! Looks like we don't have data for this search criteria yet.");

			Reporter.log("<B><font color = 'Red'> ==> -</font> Image is not able: Oops! Looks like we don't have data for this search criteria yet.");
		}	

		try 
		{ 
			String date_format_lastseen15=null;
			String lastimageDate15=null;
			Reporter.log(" ");
			Reporter.log("<B><font color ='red'> -15 Ad -</font>  ");
			System.out.println("");
			System.out.println("15 Ads");

			Reporter.log("<B><font color = 'blue'> ==> -</font> Capturing Image Date");
			String imageDate15=date15.getText();
			Reporter.log("<B><font color = 'blue'> ==> -</font> Image Date is :"+imageDate15); 
			System.out.println("Current Image Date: "+imageDate15);

			helper.waitFor(ShowAnalytics15); 
			helper.highLightElement(driver,ShowAnalytics15); 
			helper.jsScrollintoview(ShowAnalytics15);
			String linkText15 = ShowAnalytics15.getAttribute("href");
			String idString15 = null;
			String[] splitStringid15 = linkText15.split("/");
			for(int i=0;i<splitStringid15.length;i++) {
				String actualDate15=splitStringid15[splitStringid15.length-1]; 
				System.out.println(" ID of the  Ad =" + actualDate15);
				Reporter.log("<B><font color = 'blue'> ==> -</font> ID of the  Ad = " + actualDate15);
				break;
			}
			ShowAnalytics15.click(); 
			Reporter.log("<B><font color = 'blue'> ==> -</font> Clicked On Show Analytics Icon"); 
			helper.waitForPageToLoad(); 

			String parent15=driver.getWindowHandle();
			Set<String>s15=driver.getWindowHandles(); 
			Iterator<String> I15= s15.iterator(); 
			while(I15.hasNext()) 
			{ 
				String child_window15=I15.next(); 
				if(!parent15.equals(child_window15))
				{
					driver.switchTo().window(child_window15); 
					helper.waitForPageToLoad();
					System.out.println(driver.switchTo().window(child_window15).getTitle()); 
					helper.Scrollintoview(lastSeen);
					helper.highLightElement(driver,lastSeen);
					lastimageDate15 = lastSeen.getText();
					System.out.println("Analytics Image Last Seen Date: "+lastimageDate15);
					Reporter.log("<B><font color = 'blue'> ==> -</font> Image Date of Last Seen is :"+lastimageDate15);
					driver.close();
				} 
			}
			driver.switchTo().window(parent15);
			String[] splitString15 = lastimageDate15.split(" ");
			for(int i=0;i<splitString15.length-2;i++) {
				//    String actualDate=splitString[i]; 
				date_format_lastseen15= splitString15[i+1]+" "+ splitString15[i]+" " + splitString15[i+2];

				//  System.out.println("splitString : " + splitString[i]);
				System.out.println("Change Date format lastseen Date: " + date_format_lastseen15);
				System.out.println("Image last seen Date: " + imageDate15);
			}

			Assert.assertEquals(imageDate15, date_format_lastseen15);
			Reporter.log("<B><font color = 'blue'> ==> -</font> Both Last Seen Date are Matching in Assert Pass :"+imageDate15+ " == " +date_format_lastseen15);
			System.out.println("Both Last Seen Date are Matching in Assert Pass :"+imageDate15+ " == " +date_format_lastseen15);
		} 
		catch (Exception e) 
		{
			System.out.println("Image is not able: Oops! Looks like we don't have data for this search criteria yet.");

			Reporter.log("<B><font color = 'Red'> ==> -</font> Image is not able: Oops! Looks like we don't have data for this search criteria yet.");
		}	

	}
	public void AdSeenBetween_This_Month() throws InterruptedException
	{

		System.out.println();
		Reporter.log("      ");
		System.out.println("-ShortBy Newest -Seen Between This Month:");
		
		helper.waitForPageToLoad();

		Reporter.log("<B><font color = 'green'>  -ShortBy Newest -Ad Seen Between This Month Step will Start from here </font> ");
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


		try {
			Reporter.log(" ");
			Reporter.log("<B><font color ='red'> -1 Ad -</font>  ");
			System.out.println("");
			System.out.println("1 Ads");

			String  imageDate1= date1.getText();
			Reporter.log("<B><font color = 'blue'> ==> -</font> Image Date is :"+imageDate1);
			System.out.println("Current Date: "+imageDate1);

			helper.waitFor(ShowAnalytics1);
			helper.highLightElement(driver, ShowAnalytics1);
			helper.jsScrollintoview(ShowAnalytics1);

			String linkText1 = ShowAnalytics1.getAttribute("href");
			String idString1 = null;
			String[] splitStringid1 = linkText1.split("/");
			for(int i=0;i<splitStringid1.length;i++) {
				String actualDate1=splitStringid1[splitStringid1.length-1]; 
				System.out.println(" ID of the  Ad =" + actualDate1);
				Reporter.log("<B><font color = 'blue'> ==> -</font> ID of the  Ad = " + actualDate1);
				break;
			}
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
			helper.highLightElement(driver,lastSeen);
			helper.jsScrollintoview(lastSeen);
			//	    System.out.println("Testing last Seen Adresss: "+lastSeen);
			String   lastSeenDate_today1=null;
			lastSeenDate_today1 = lastSeen.getText();
			Reporter.log("<B><font color = 'blue'> ==> -</font> Last_Seen_childWindow AdDetails Page= " +  lastSeenDate_today1);
			System.out.println("lastSeenDate_today: "+lastSeenDate_today1);


			driver.close();

			driver.switchTo().window(parent1);
			System.out.println("lastSeenDate_today1: "+lastSeenDate_today1);


			String join1 = null;
			//  String[] actualDate = null;

			String[] splitString1 = lastSeenDate_today1.split(" ");
			for(int i=0;i<splitString1.length-2;i++) {
				String actualDate1=splitString1[i]; 
				join1= splitString1[i+1]+" "+ splitString1[i]+" " + splitString1[i+2];
				//  System.out.println("splitString : " + splitString[i]);
				System.out.println("lastseen Date: " + join1);
			}
			Assert.assertEquals(imageDate1, join1);
			Reporter.log("<B><font color = 'blue '> ==> -</font> Both Last Seen Date are Matching in Assert Pass :"+imageDate1+ " == " +join1);
			System.out.println("Both Last Seen Date are Matching in Assert Pass :"+imageDate1+ " == " +join1);
		}
		catch(Exception e) {
			System.out.println("Image is not able: Oops! Looks like we don't have data for this search criteria yet.");

			Reporter.log("<B><font color = 'Red'> ==> -</font> Image is not able: Oops! Looks like we don't have data for this search criteria yet.");
		}

		try {

			Reporter.log(" ");
			Reporter.log("<B><font color ='red'> -2 Ad -</font>  ");
			System.out.println("");
			System.out.println("2 Ads");

			String  imageDate2= date2.getText();
			Reporter.log("<B><font color = 'blue'> ==> -</font> Image Date is :"+imageDate2);
			System.out.println("Current Date: "+imageDate2);

			helper.waitFor(ShowAnalytics2);
			helper.highLightElement(driver, ShowAnalytics2);
			helper.jsScrollintoview(ShowAnalytics2);

			String linkText2 = ShowAnalytics2.getAttribute("href");
			String idString2 = null;
			String[] splitStringid2 = linkText2.split("/");
			for(int i=0;i<splitStringid2.length;i++) {
				String actualDate2=splitStringid2[splitStringid2.length-1]; 
				System.out.println(" ID of the  Ad =" + actualDate2);
				Reporter.log("<B><font color = 'blue'> ==> -</font> ID of the  Ad = " + actualDate2);
				break;
			}
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
			helper.highLightElement(driver,lastSeen);
			helper.jsScrollintoview(lastSeen);
			//	    System.out.println("Testing last Seen Adresss: "+lastSeen);
			String   lastSeenDate_today2=null;
			lastSeenDate_today2 = lastSeen.getText();
			Reporter.log("<B><font color = 'blue'> ==> -</font> Last_Seen_childWindow AdDetails Page= " +  lastSeenDate_today2);
			System.out.println("lastSeenDate_today: "+lastSeenDate_today2);


			driver.close();

			driver.switchTo().window(parent2);
			System.out.println("lastSeenDate_today1: "+lastSeenDate_today2);


			String join2 = null;
			//  String[] actualDate = null;

			String[] splitString2 = lastSeenDate_today2.split(" ");
			for(int i=0;i<splitString2.length-2;i++) {
				String actualDate1=splitString2[i]; 
				join2= splitString2[i+1]+" "+ splitString2[i]+" " + splitString2[i+2];
				//  System.out.println("splitString : " + splitString[i]);
				System.out.println("lastseen Date: " + join2);
			}
			Assert.assertEquals(imageDate2, join2);
			Reporter.log("<B><font color = 'blue '> ==> -</font> Both Last Seen Date are Matching in Assert Pass :"+imageDate2+ " == " +join2);
			System.out.println("Both Last Seen Date are Matching in Assert Pass :"+imageDate2+ " == " +join2);
		}
		catch(Exception e) {
			System.out.println("Image is not able: Oops! Looks like we don't have data for this search criteria yet.");

			Reporter.log("<B><font color = 'Red'> ==> -</font> Image is not able: Oops! Looks like we don't have data for this search criteria yet.");
		}

		try {

			Reporter.log(" ");
			Reporter.log("<B><font color ='red'> -3 Ad -</font>  ");
			System.out.println("");
			System.out.println("3 Ads");

			String  imageDate3= date3.getText();
			Reporter.log("<B><font color = 'blue'> ==> -</font> Image Date is :"+imageDate3);
			System.out.println("Current Date: "+imageDate3);

			helper.waitFor(ShowAnalytics3);
			helper.highLightElement(driver, ShowAnalytics3);
			helper.jsScrollintoview(ShowAnalytics3);

			String linkText3 = ShowAnalytics3.getAttribute("href");
			String idString3 = null;
			String[] splitStringid3 = linkText3.split("/");
			for(int i=0;i<splitStringid3.length;i++) {
				String actualDate3=splitStringid3[splitStringid3.length-1]; 
				System.out.println(" ID of the  Ad =" + actualDate3);
				Reporter.log("<B><font color = 'blue'> ==> -</font> ID of the  Ad = " + actualDate3);
				break;
			}
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
			helper.highLightElement(driver,lastSeen);
			helper.jsScrollintoview(lastSeen);
			//	    System.out.println("Testing last Seen Adresss: "+lastSeen);
			String   lastSeenDate_today3=null;
			lastSeenDate_today3 = lastSeen.getText();
			Reporter.log("<B><font color = 'blue'> ==> -</font> Last_Seen_childWindow AdDetails Page= " +  lastSeenDate_today3);
			System.out.println("lastSeenDate_today: "+lastSeenDate_today3);


			driver.close();

			driver.switchTo().window(parent3);
			System.out.println("lastSeenDate_today1: "+lastSeenDate_today3);


			String join3 = null;
			//  String[] actualDate = null;

			String[] splitString3 = lastSeenDate_today3.split(" ");
			for(int i=0;i<splitString3.length-2;i++) {
				String actualDate3=splitString3[i]; 
				join3= splitString3[i+1]+" "+ splitString3[i]+" " + splitString3[i+2];
				//  System.out.println("splitString : " + splitString[i]);
				System.out.println("lastseen Date: " + join3);
			}
			Assert.assertEquals(imageDate3, join3);
			Reporter.log("<B><font color = 'blue '> ==> -</font> Both Last Seen Date are Matching in Assert Pass :"+imageDate3+ " == " +join3);
			System.out.println("Both Last Seen Date are Matching in Assert Pass :"+imageDate3+ " == " +join3);
		}
		catch(Exception e) {
			System.out.println("Image is not able: Oops! Looks like we don't have data for this search criteria yet.");

			Reporter.log("<B><font color = 'Red'> ==> -</font> Image is not able: Oops! Looks like we don't have data for this search criteria yet.");
		}	

		try {

			Reporter.log(" ");
			Reporter.log("<B><font color ='red'> -4 Ad -</font>  ");
			System.out.println("");
			System.out.println("4 Ads");

			String  imageDate4= date4.getText();
			Reporter.log("<B><font color = 'blue'> ==> -</font> Image Date is :"+imageDate4);
			System.out.println("Current Date: "+imageDate4);

			helper.waitFor(ShowAnalytics4);
			helper.highLightElement(driver, ShowAnalytics4);
			helper.jsScrollintoview(ShowAnalytics4);
			String linkText4 = ShowAnalytics4.getAttribute("href");
			String idString4 = null;
			String[] splitStringid4 = linkText4.split("/");
			for(int i=0;i<splitStringid4.length;i++) {
				String actualDate4=splitStringid4[splitStringid4.length-1]; 
				System.out.println(" ID of the  Ad =" + actualDate4);
				Reporter.log("<B><font color = 'blue'> ==> -</font> ID of the  Ad = " + actualDate4);
				break;
			}
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
			helper.highLightElement(driver,lastSeen);
			helper.jsScrollintoview(lastSeen);
			//	    System.out.println("Testing last Seen Adresss: "+lastSeen);
			String   lastSeenDate_today4=null;
			lastSeenDate_today4 = lastSeen.getText();
			Reporter.log("<B><font color = 'blue'> ==> -</font> Last_Seen_childWindow AdDetails Page= " +  lastSeenDate_today4);
			System.out.println("lastSeenDate_today: "+lastSeenDate_today4);


			driver.close();

			driver.switchTo().window(parent4);
			System.out.println("lastSeenDate_today1: "+lastSeenDate_today4);


			String join4 = null;
			//  String[] actualDate = null;

			String[] splitString4 = lastSeenDate_today4.split(" ");
			for(int i=0;i<splitString4.length-2;i++) {
				String actualDate4=splitString4[i]; 
				join4= splitString4[i+1]+" "+ splitString4[i]+" " + splitString4[i+2];
				//  System.out.println("splitString : " + splitString[i]);
				System.out.println("lastseen Date: " + join4);
			}
			Assert.assertEquals(imageDate4, join4);
			Reporter.log("<B><font color = 'blue '> ==> -</font> Both Last Seen Date are Matching in Assert Pass :"+imageDate4+ " == " +join4);
			System.out.println("Both Last Seen Date are Matching in Assert Pass :"+imageDate4+ " == " +join4);
		}
		catch(Exception e) {
			System.out.println("Image is not able: Oops! Looks like we don't have data for this search criteria yet.");

			Reporter.log("<B><font color = 'Red'> ==> -</font> Image is not able: Oops! Looks like we don't have data for this search criteria yet.");
		}				

		try {

			Reporter.log(" ");
			Reporter.log("<B><font color ='red'> -5 Ad -</font>  ");
			System.out.println("");
			System.out.println("5 Ads");

			String  imageDate5= date5.getText();
			Reporter.log("<B><font color = 'blue'> ==> -</font> Image Date is :"+imageDate5);
			System.out.println("Current Date: "+imageDate5);

			helper.waitFor(ShowAnalytics5);
			helper.highLightElement(driver, ShowAnalytics5);
			helper.jsScrollintoview(ShowAnalytics5);

			String linkText5 = ShowAnalytics5.getAttribute("href");
			String idString5 = null;
			String[] splitStringid5 = linkText5.split("/");
			for(int i=0;i<splitStringid5.length;i++) {
				String actualDate5=splitStringid5[splitStringid5.length-1]; 
				System.out.println(" ID of the  Ad =" + actualDate5);
				Reporter.log("<B><font color = 'blue'> ==> -</font> ID of the  Ad = " + actualDate5);
				break;
			}
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
			helper.highLightElement(driver,lastSeen);
			helper.jsScrollintoview(lastSeen);
			//	    System.out.println("Testing last Seen Adresss: "+lastSeen);
			String   lastSeenDate_today5=null;
			lastSeenDate_today5 = lastSeen.getText();
			Reporter.log("<B><font color = 'blue'> ==> -</font> Last_Seen_childWindow AdDetails Page= " +  lastSeenDate_today5);
			System.out.println("lastSeenDate_today: "+lastSeenDate_today5);


			driver.close();

			driver.switchTo().window(parent5);
			System.out.println("lastSeenDate_today1: "+lastSeenDate_today5);


			String join5 = null;
			//  String[] actualDate = null;

			String[] splitString5 = lastSeenDate_today5.split(" ");
			for(int i=0;i<splitString5.length-2;i++) {
				String actualDate5=splitString5[i]; 
				join5= splitString5[i+1]+" "+ splitString5[i]+" " + splitString5[i+2];
				//  System.out.println("splitString : " + splitString[i]);
				System.out.println("lastseen Date: " + join5);
			}
			Assert.assertEquals(imageDate5, join5);
			Reporter.log("<B><font color = 'blue '> ==> -</font> Both Last Seen Date are Matching in Assert Pass :"+imageDate5+ " == " +join5);
			System.out.println("Both Last Seen Date are Matching in Assert Pass :"+imageDate5+ " == " +join5);
		}
		catch(Exception e) {
			System.out.println("Image is not able: Oops! Looks like we don't have data for this search criteria yet.");

			Reporter.log("<B><font color = 'Red'> ==> -</font> Image is not able: Oops! Looks like we don't have data for this search criteria yet.");
		}	

		try {

			Reporter.log(" ");
			Reporter.log("<B><font color ='red'> -7 Ad -</font>  ");
			System.out.println("");
			System.out.println("7 Ads");

			String  imageDate7= date7.getText();
			Reporter.log("<B><font color = 'blue'> ==> -</font> Image Date is :"+imageDate7);
			System.out.println("Current Date: "+imageDate7);

			helper.waitFor(ShowAnalytics7);
			helper.highLightElement(driver, ShowAnalytics7);
			helper.jsScrollintoview(ShowAnalytics7);
			String linkText7 = ShowAnalytics7.getAttribute("href");
			String idString7 = null;
			String[] splitStringid7 = linkText7.split("/");
			for(int i=0;i<splitStringid7.length;i++) {
				String actualDate7=splitStringid7[splitStringid7.length-1]; 
				System.out.println(" ID of the  Ad =" + actualDate7);
				Reporter.log("<B><font color = 'blue'> ==> -</font> ID of the  Ad = " + actualDate7);
				break;
			}
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
			helper.highLightElement(driver,lastSeen);
			helper.jsScrollintoview(lastSeen);
			//	    System.out.println("Testing last Seen Adresss: "+lastSeen);
			String   lastSeenDate_today7=null;
			lastSeenDate_today7 = lastSeen.getText();
			Reporter.log("<B><font color = 'blue'> ==> -</font> Last_Seen_childWindow AdDetails Page= " +  lastSeenDate_today7);
			System.out.println("lastSeenDate_today: "+lastSeenDate_today7);


			driver.close();

			driver.switchTo().window(parent7);
			System.out.println("lastSeenDate_today1: "+lastSeenDate_today7);


			String join7 = null;
			//  String[] actualDate = null;

			String[] splitString7 = lastSeenDate_today7.split(" ");
			for(int i=0;i<splitString7.length-2;i++) {
				String actualDate7=splitString7[i]; 
				join7= splitString7[i+1]+" "+ splitString7[i]+" " + splitString7[i+2];
				//  System.out.println("splitString : " + splitString[i]);
				System.out.println("lastseen Date: " + join7);
			}
			Assert.assertEquals(imageDate7, join7);
			Reporter.log("<B><font color = 'blue '> ==> -</font> Both Last Seen Date are Matching in Assert Pass :"+imageDate7+ " == " +join7);
			System.out.println("Both Last Seen Date are Matching in Assert Pass :"+imageDate7+ " == " +join7);
		}
		catch(Exception e) {
			System.out.println("Image is not able: Oops! Looks like we don't have data for this search criteria yet.");

			Reporter.log("<B><font color = 'Red'> ==> -</font> Image is not able: Oops! Looks like we don't have data for this search criteria yet.");
		}				


		try {

			Reporter.log(" ");
			Reporter.log("<B><font color ='red'> -8 Ad -</font>  ");
			System.out.println("");
			System.out.println("8 Ads");

			String  imageDate8= date8.getText();
			Reporter.log("<B><font color = 'blue'> ==> -</font> Image Date is :"+imageDate8);
			System.out.println("Current Date: "+imageDate8);

			helper.waitFor(ShowAnalytics8);
			helper.highLightElement(driver, ShowAnalytics8);
			helper.jsScrollintoview(ShowAnalytics8);

			String linkText8 = ShowAnalytics8.getAttribute("href");
			String idString8 = null;
			String[] splitStringid8 = linkText8.split("/");
			for(int i=0;i<splitStringid8.length;i++) {
				String actualDate8=splitStringid8[splitStringid8.length-1]; 
				System.out.println(" ID of the  Ad =" + actualDate8);
				Reporter.log("<B><font color = 'blue'> ==> -</font> ID of the  Ad = " + actualDate8);
				break;
			}

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
			helper.highLightElement(driver,lastSeen);
			helper.jsScrollintoview(lastSeen);
			//	    System.out.println("Testing last Seen Adresss: "+lastSeen);
			String   lastSeenDate_today8=null;
			lastSeenDate_today8 = lastSeen.getText();
			Reporter.log("<B><font color = 'blue'> ==> -</font> Last_Seen_childWindow AdDetails Page= " +  lastSeenDate_today8);
			System.out.println("lastSeenDate_today: "+lastSeenDate_today8);


			driver.close();

			driver.switchTo().window(parent8);
			System.out.println("lastSeenDate_today: "+lastSeenDate_today8);


			String join8 = null;
			//  String[] actualDate = null;

			String[] splitString8 = lastSeenDate_today8.split(" ");
			for(int i=0;i<splitString8.length-2;i++) {
				String actualDate8=splitString8[i]; 
				join8= splitString8[i+1]+" "+ splitString8[i]+" " + splitString8[i+2];
				//  System.out.println("splitString : " + splitString[i]);
				System.out.println("lastseen Date: " + join8);
			}
			Assert.assertEquals(imageDate8, join8);
			Reporter.log("<B><font color = 'blue '> ==> -</font> Both Last Seen Date are Matching in Assert Pass :"+imageDate8+ " == " +join8);
			System.out.println("Both Last Seen Date are Matching in Assert Pass :"+imageDate8+ " == " +join8);
		}
		catch(Exception e) {
			System.out.println("Image is not able: Oops! Looks like we don't have data for this search criteria yet.");

			Reporter.log("<B><font color = 'Red'> ==> -</font> Image is not able: Oops! Looks like we don't have data for this search criteria yet.");
		}	


		try {

			Reporter.log(" ");
			Reporter.log("<B><font color ='red'> -9 Ad -</font>  ");
			System.out.println("");
			System.out.println("9 Ads");

			String  imageDate9= date9.getText();
			Reporter.log("<B><font color = 'blue'> ==> -</font> Image Date is :"+imageDate9);
			System.out.println("Current Date: "+imageDate9);

			helper.waitFor(ShowAnalytics9);
			helper.highLightElement(driver, ShowAnalytics9);
			helper.jsScrollintoview(ShowAnalytics9);

			String linkText9 = ShowAnalytics9.getAttribute("href");
			String idString9 = null;
			String[] splitStringid9 = linkText9.split("/");
			for(int i=0;i<splitStringid9.length;i++) {
				String actualDate9=splitStringid9[splitStringid9.length-1]; 
				System.out.println(" ID of the  Ad =" + actualDate9);
				Reporter.log("<B><font color = 'blue'> ==> -</font> ID of the  Ad = " + actualDate9);
				break;
			}

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
			helper.highLightElement(driver,lastSeen);
			helper.jsScrollintoview(lastSeen);
			//	    System.out.println("Testing last Seen Adresss: "+lastSeen);
			String   lastSeenDate_today9=null;
			lastSeenDate_today9 = lastSeen.getText();
			Reporter.log("<B><font color = 'blue'> ==> -</font> Last_Seen_childWindow AdDetails Page= " +  lastSeenDate_today9);
			System.out.println("lastSeenDate_today: "+lastSeenDate_today9);


			driver.close();

			driver.switchTo().window(parent9);
			System.out.println("lastSeenDate_today: "+lastSeenDate_today9);


			String join9 = null;
			//  String[] actualDate = null;

			String[] splitString9 = lastSeenDate_today9.split(" ");
			for(int i=0;i<splitString9.length-2;i++) {
				String actualDate9=splitString9[i]; 
				join9= splitString9[i+1]+" "+ splitString9[i]+" " + splitString9[i+2];
				//  System.out.println("splitString : " + splitString[i]);
				System.out.println("lastseen Date: " + join9);
			}
			Assert.assertEquals(imageDate9, join9);
			Reporter.log("<B><font color = 'blue '> ==> -</font> Both Last Seen Date are Matching in Assert Pass :"+imageDate9+ " == " +join9);
			System.out.println("Both Last Seen Date are Matching in Assert Pass :"+imageDate9+ " == " +join9);
		}
		catch(Exception e) {
			System.out.println("Image is not able: Oops! Looks like we don't have data for this search criteria yet.");

			Reporter.log("<B><font color = 'Red'> ==> -</font> Image is not able: Oops! Looks like we don't have data for this search criteria yet.");
		}	

		try {

			Reporter.log(" ");
			Reporter.log("<B><font color ='red'> -10 Ad -</font>  ");
			System.out.println("");
			System.out.println("10 Ads");

			String  imageDate10= date10.getText();
			Reporter.log("<B><font color = 'blue'> ==> -</font> Image Date is :"+imageDate10);
			System.out.println("Current Date: "+imageDate10);

			helper.waitFor(ShowAnalytics10);
			helper.highLightElement(driver, ShowAnalytics10);
			helper.jsScrollintoview(ShowAnalytics10);

			String linkText10 = ShowAnalytics10.getAttribute("href");
			String idString10 = null;
			String[] splitStringid10 = linkText10.split("/");
			for(int i=0;i<splitStringid10.length;i++) {
				String actualDate10=splitStringid10[splitStringid10.length-1]; 
				System.out.println(" ID of the  Ad =" + actualDate10);
				Reporter.log("<B><font color = 'blue'> ==> -</font> ID of the  Ad = " + actualDate10);
				break;
			}
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
			helper.highLightElement(driver,lastSeen);
			helper.jsScrollintoview(lastSeen);
			//	    System.out.println("Testing last Seen Adresss: "+lastSeen);
			String   lastSeenDate_today10=null;
			lastSeenDate_today10 = lastSeen.getText();
			Reporter.log("<B><font color = 'blue'> ==> -</font> Last_Seen_childWindow AdDetails Page= " +  lastSeenDate_today10);
			System.out.println("lastSeenDate_today: "+lastSeenDate_today10);


			driver.close();

			driver.switchTo().window(parent10);
			System.out.println("lastSeenDate_today: "+lastSeenDate_today10);


			String join10 = null;
			//  String[] actualDate = null;

			String[] splitString10 = lastSeenDate_today10.split(" ");
			for(int i=0;i<splitString10.length-2;i++) {
				String actualDate10=splitString10[i]; 
				join10= splitString10[i+1]+" "+ splitString10[i]+" " + splitString10[i+2];
				//  System.out.println("splitString : " + splitString[i]);
				System.out.println("lastseen Date: " + join10);
			}
			Assert.assertEquals(imageDate10, join10);
			Reporter.log("<B><font color = 'blue '> ==> -</font> Both Last Seen Date are Matching in Assert Pass :"+imageDate10+ " == " +join10);
			System.out.println("Both Last Seen Date are Matching in Assert Pass :"+imageDate10+ " == " +join10);
		}
		catch(Exception e) {
			System.out.println("Image is not able: Oops! Looks like we don't have data for this search criteria yet.");

			Reporter.log("<B><font color = 'Red'> ==> -</font> Image is not able: Oops! Looks like we don't have data for this search criteria yet.");
		}	


		try {

			Reporter.log(" ");
			Reporter.log("<B><font color ='red'> -11 Ad -</font>  ");
			System.out.println("");
			System.out.println("11 Ads");

			String  imageDate11= date11.getText();
			Reporter.log("<B><font color = 'blue'> ==> -</font> Image Date is :"+imageDate11);
			System.out.println("Current Date: "+imageDate11);

			helper.waitFor(ShowAnalytics11);
			helper.highLightElement(driver, ShowAnalytics11);
			helper.jsScrollintoview(ShowAnalytics11);

			String linkText11 = ShowAnalytics11.getAttribute("href");
			String idString11 = null;
			String[] splitStringid11 = linkText11.split("/");
			for(int i=0;i<splitStringid11.length;i++) {
				String actualDate11=splitStringid11[splitStringid11.length-1]; 
				System.out.println(" ID of the  Ad =" + actualDate11);
				Reporter.log("<B><font color = 'blue'> ==> -</font> ID of the  Ad = " + actualDate11);
				break;
			}
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
			helper.highLightElement(driver,lastSeen);
			helper.jsScrollintoview(lastSeen);
			//	    System.out.println("Testing last Seen Adresss: "+lastSeen);
			String   lastSeenDate_today11=null;
			lastSeenDate_today11 = lastSeen.getText();
			Reporter.log("<B><font color = 'blue'> ==> -</font> Last_Seen_childWindow AdDetails Page= " +  lastSeenDate_today11);
			System.out.println("lastSeenDate_today: "+lastSeenDate_today11);


			driver.close();

			driver.switchTo().window(parent11);
			System.out.println("lastSeenDate_today: "+lastSeenDate_today11);


			String join11 = null;
			//  String[] actualDate = null;

			String[] splitString11 = lastSeenDate_today11.split(" ");
			for(int i=0;i<splitString11.length-2;i++) {
				String actualDate11=splitString11[i]; 
				join11= splitString11[i+1]+" "+ splitString11[i]+" " + splitString11[i+2];
				//  System.out.println("splitString : " + splitString[i]);
				System.out.println("lastseen Date: " + join11);
			}
			Assert.assertEquals(imageDate11, join11);
			Reporter.log("<B><font color = 'blue '> ==> -</font> Both Last Seen Date are Matching in Assert Pass :"+imageDate11+ " == " +join11);
			System.out.println("Both Last Seen Date are Matching in Assert Pass :"+imageDate11+ " == " +join11);
		}
		catch(Exception e) {
			System.out.println("Image is not able: Oops! Looks like we don't have data for this search criteria yet.");

			Reporter.log("<B><font color = 'Red'> ==> -</font> Image is not able: Oops! Looks like we don't have data for this search criteria yet.");
		}

		try {

			Reporter.log(" ");
			Reporter.log("<B><font color ='red'> -12 Ad -</font>  ");
			System.out.println("");
			System.out.println("12 Ads");

			String  imageDate12= date12.getText();
			Reporter.log("<B><font color = 'blue'> ==> -</font> Image Date is :"+imageDate12);
			System.out.println("Current Date: "+imageDate12);

			helper.waitFor(ShowAnalytics12);
			helper.highLightElement(driver, ShowAnalytics12);
			helper.jsScrollintoview(ShowAnalytics12);

			String linkText12 = ShowAnalytics12.getAttribute("href");
			String idString12 = null;
			String[] splitStringid12 = linkText12.split("/");
			for(int i=0;i<splitStringid12.length;i++) {
				String actualDate12=splitStringid12[splitStringid12.length-1]; 
				System.out.println(" ID of the  Ad =" + actualDate12);
				Reporter.log("<B><font color = 'blue'> ==> -</font> ID of the  Ad = " + actualDate12);
				break;
			}
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
			helper.highLightElement(driver,lastSeen);
			helper.jsScrollintoview(lastSeen);
			//	    System.out.println("Testing last Seen Adresss: "+lastSeen);
			String   lastSeenDate_today12=null;
			lastSeenDate_today12 = lastSeen.getText();
			Reporter.log("<B><font color = 'blue'> ==> -</font> Last_Seen_childWindow AdDetails Page= " +  lastSeenDate_today12);
			System.out.println("lastSeenDate_today: "+lastSeenDate_today12);


			driver.close();

			driver.switchTo().window(parent12);
			System.out.println("lastSeenDate_today: "+lastSeenDate_today12);


			String join12 = null;
			//  String[] actualDate = null;

			String[] splitString12 = lastSeenDate_today12.split(" ");
			for(int i=0;i<splitString12.length-2;i++) {
				String actualDate12=splitString12[i]; 
				join12= splitString12[i+1]+" "+ splitString12[i]+" " + splitString12[i+2];
				//  System.out.println("splitString : " + splitString[i]);
				System.out.println("lastseen Date: " + join12);
			}
			Assert.assertEquals(imageDate12, join12);
			Reporter.log("<B><font color = 'blue '> ==> -</font> Both Last Seen Date are Matching in Assert Pass :"+imageDate12+ " == " +join12);
			System.out.println("Both Last Seen Date are Matching in Assert Pass :"+imageDate12+ " == " +join12);
		}
		catch(Exception e) {
			System.out.println("Image is not able: Oops! Looks like we don't have data for this search criteria yet.");

			Reporter.log("<B><font color = 'Red'> ==> -</font> Image is not able: Oops! Looks like we don't have data for this search criteria yet.");
		}

		try {

			Reporter.log(" ");
			Reporter.log("<B><font color ='red'> -13 Ad -</font>  ");
			System.out.println("");
			System.out.println("13 Ads");

			String  imageDate13= date13.getText();
			Reporter.log("<B><font color = 'blue'> ==> -</font> Image Date is :"+imageDate13);
			System.out.println("Current Date: "+imageDate13);

			helper.waitFor(ShowAnalytics13);
			helper.highLightElement(driver, ShowAnalytics13);
			helper.jsScrollintoview(ShowAnalytics13);

			String linkText13 = ShowAnalytics13.getAttribute("href");
			String idString13 = null;
			String[] splitStringid13 = linkText13.split("/");
			for(int i=0;i<splitStringid13.length;i++) {
				String actualDate13=splitStringid13[splitStringid13.length-1]; 
				System.out.println(" ID of the  Ad =" + actualDate13);
				Reporter.log("<B><font color = 'blue'> ==> -</font> ID of the  Ad = " + actualDate13);
				break;
			}
			ShowAnalytics11.click();
			Reporter.log("<B><font color = 'blue'> ==> -</font> Clicked On Show Analytics Icon");
			helper.waitForPageToLoad();

			Set<String> S13=driver.getWindowHandles();
			Iterator<String>it13=S13.iterator();
			String parent13=it13.next();
			String child13=it13.next();

			driver.switchTo().window(child13);

			helper.waitForPageToLoad();
			helper.waitFor(lastSeen);
			helper.highLightElement(driver,lastSeen);
			helper.jsScrollintoview(lastSeen);
			//	    System.out.println("Testing last Seen Adresss: "+lastSeen);
			String   lastSeenDate_today13=null;
			helper.Scrollintoview(lastSeen);
			lastSeenDate_today13 = lastSeen.getText();
			Reporter.log("<B><font color = 'blue'> ==> -</font> Last_Seen_childWindow AdDetails Page= " +  lastSeenDate_today13);
			System.out.println("lastSeenDate_today: "+lastSeenDate_today13);


			driver.close();

			driver.switchTo().window(parent13);
			System.out.println("lastSeenDate_today: "+lastSeenDate_today13);


			String join13 = null;
			//  String[] actualDate = null;

			String[] splitString13 = lastSeenDate_today13.split(" ");
			for(int i=0;i<splitString13.length-2;i++) {
				String actualDate13=splitString13[i]; 
				join13= splitString13[i+1]+" "+ splitString13[i]+" " + splitString13[i+2];
				//  System.out.println("splitString : " + splitString[i]);
				System.out.println("lastseen Date: " + join13);
			}
			Assert.assertEquals(imageDate13, join13);
			Reporter.log("<B><font color = 'blue '> ==> -</font> Both Last Seen Date are Matching in Assert Pass :"+imageDate13+ " == " +join13);
			System.out.println("Both Last Seen Date are Matching in Assert Pass :"+imageDate13+ " == " +join13);
		}
		catch(Exception e) {
			System.out.println("Image is not able: Oops! Looks like we don't have data for this search criteria yet.");

			Reporter.log("<B><font color = 'Red'> ==> -</font> Image is not able: Oops! Looks like we don't have data for this search criteria yet.");
		}

		try {

			Reporter.log(" ");
			Reporter.log("<B><font color ='red'> -15 Ad -</font>  ");
			System.out.println("");
			System.out.println("15 Ads");

			String  imageDate15= date15.getText();
			Reporter.log("<B><font color = 'blue'> ==> -</font> Image Date is :"+imageDate15);
			System.out.println("Current Date: "+imageDate15);

			helper.waitFor(ShowAnalytics15);
			helper.highLightElement(driver, ShowAnalytics15);
			helper.jsScrollintoview(ShowAnalytics15);

			String linkText15 = ShowAnalytics15.getAttribute("href");
			String idString15 = null;
			String[] splitStringid15 = linkText15.split("/");
			for(int i=0;i<splitStringid15.length;i++) {
				String actualDate15=splitStringid15[splitStringid15.length-1]; 
				System.out.println(" ID of the  Ad =" + actualDate15);
				Reporter.log("<B><font color = 'blue'> ==> -</font> ID of the  Ad = " + actualDate15);
				break;
			}
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
			helper.highLightElement(driver,lastSeen);
			helper.jsScrollintoview(lastSeen);
			//	    System.out.println("Testing last Seen Adresss: "+lastSeen);
			String   lastSeenDate_today15=null;
			lastSeenDate_today15 = lastSeen.getText();
			Reporter.log("<B><font color = 'blue'> ==> -</font> Last_Seen_childWindow AdDetails Page= " +  lastSeenDate_today15);
			System.out.println("lastSeenDate_today: "+lastSeenDate_today15);


			driver.close();

			driver.switchTo().window(parent15);
			System.out.println("lastSeenDate_today: "+lastSeenDate_today15);


			String join15 = null;
			//  String[] actualDate = null;

			String[] splitString15 = lastSeenDate_today15.split(" ");
			for(int i=0;i<splitString15.length-2;i++) {
				String actualDate15=splitString15[i]; 
				join15= splitString15[i+1]+" "+ splitString15[i]+" " + splitString15[i+2];
				//  System.out.println("splitString : " + splitString[i]);
				System.out.println("lastseen Date: " + join15);
			}
			Assert.assertEquals(imageDate15, join15);
			Reporter.log("<B><font color = 'blue '> ==> -</font> Both Last Seen Date are Matching in Assert Pass :"+imageDate15+ " == " +join15);
			System.out.println("Both Last Seen Date are Matching in Assert Pass :"+imageDate15+ " == " +join15);
		}
		catch(Exception e) {
			System.out.println("Image is not able: Oops! Looks like we don't have data for this search criteria yet.");

			Reporter.log("<B><font color = 'Red'> ==> -</font> Image is not able: Oops! Looks like we don't have data for this search criteria yet.");
		}

	}
	public void AdSeenBetween_Last_Month() throws InterruptedException
	{

		System.out.println();
		Reporter.log("      ");
		System.out.println("-SortBy Newest -Ad Seen Between Last Month: ");
		
		helper.waitForPageToLoad();

		Reporter.log("<B><font color = 'green'>  -ShortBy Newest -Ad Seen Between Last Month Step will Start from here </font> ");
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


		try {
			String lastimageDate1= null;
			Reporter.log(" ");
			Reporter.log("<B><font color ='red'> -1 Ad -</font>  ");
			System.out.println("");
			System.out.println("1 Ads");

			String imageDate1=date1.getText();
			Reporter.log("<B><font color = 'blue'> ==> -</font> Image Date is :"+imageDate1);
			System.out.println("Current Image Date: "+imageDate1);

			helper.waitFor(ShowAnalytics1);
			helper.highLightElement(driver, ShowAnalytics1);
			helper.jsScrollintoview(ShowAnalytics1);
			helper.Scrollintoview(ShowAnalytics1);
			String linkText1 = ShowAnalytics1.getAttribute("href");
			String idString1 = null;
			String[] splitStringid1 = linkText1.split("/");
			for(int i=0;i<splitStringid1.length;i++) {
				String actualDate1=splitStringid1[splitStringid1.length-1]; 
				System.out.println(" ID of the  Ad =" + actualDate1);
				Reporter.log("<B><font color = 'blue'> ==> -</font> ID of the  Ad = " + actualDate1);
				break;
			}
			ShowAnalytics1.click();
			Reporter.log("<B><font color = 'blue'> ==> -</font> Clicked On Show Analytics Icon");
			helper.waitForPageToLoad();

			String parent1=driver.getWindowHandle();
			Set<String>s1=driver.getWindowHandles();

			Iterator<String> I1= s1.iterator();
			while(I1.hasNext())
			{
				String child_window1=I1.next();
				if(!parent1.equals(child_window1))
				{
					driver.switchTo().window(child_window1);
					helper.waitForPageToLoad();
					System.out.println(driver.switchTo().window(child_window1).getTitle());
					helper.Scrollintoview(lastSeen);
					lastimageDate1 = lastSeen.getText();
					System.out.println("Analytics Image Last Seen Date: "+lastimageDate1);
					Reporter.log("<B><font color = 'blue'> ==> -</font> Image Date of Last Seen is :"+lastimageDate1);
					driver.close();
				}
			}
			driver.switchTo().window(parent1);
			String date_format_lastseen1= null;
			String[] splitString1 = lastimageDate1.split(" ");
			for(int i=0;i<splitString1.length-2;i++) {
				//    String actualDate=splitString[i]; 
				date_format_lastseen1= splitString1[i+1]+" "+ splitString1[i]+" " + splitString1[i+2];

				//  System.out.println("splitString : " + splitString[i]);
				System.out.println("Change Date format lastseen Date: " + date_format_lastseen1);
				System.out.println("Image last seen Date: " + imageDate1);
			}

			Assert.assertEquals(imageDate1, date_format_lastseen1);
			Reporter.log("<B><font color = 'blue'> ==> -</font> Both Last Seen Date are Matching in Assert Pass :"+imageDate1+ " == " +date_format_lastseen1);
			System.out.println("Both Last Seen Date are Matching in Assert Pass :"+imageDate1+ " == " +date_format_lastseen1);
		}
		catch (Exception e)
		{

			// TODO: handle exception
			System.out.println("Image is not able: Oops! Looks like we don't have data for this search criteria yet.");

			Reporter.log("<B><font color = 'Red'> ==> -</font> Image is not able: Oops! Looks like we don't have data for this search criteria yet.");
		}

		try {
			String lastimageDate2= null;
			Reporter.log(" ");
			Reporter.log("<B><font color ='red'> -2 Ad -</font>  ");
			System.out.println("");
			System.out.println("2 Ads");

			String imageDate2=date2.getText();
			Reporter.log("<B><font color = 'blue'> ==> -</font> Image Date is :"+imageDate2);
			System.out.println("Current Image Date: "+imageDate2);

			helper.waitFor(ShowAnalytics2);
			helper.highLightElement(driver, ShowAnalytics2);
			helper.jsScrollintoview(ShowAnalytics2);
			helper.Scrollintoview(ShowAnalytics2);
			String linkText2 = ShowAnalytics2.getAttribute("href");
			String idString2 = null;
			String[] splitStringid2 = linkText2.split("/");
			for(int i=0;i<splitStringid2.length;i++) {
				String actualDate2=splitStringid2[splitStringid2.length-1]; 
				System.out.println(" ID of the  Ad =" + actualDate2);
				Reporter.log("<B><font color = 'blue'> ==> -</font> ID of the  Ad = " + actualDate2);
				break;
			}
			ShowAnalytics2.click();
			Reporter.log("<B><font color = 'blue'> ==> -</font> Clicked On Show Analytics Icon");
			helper.waitForPageToLoad();

			String parent2=driver.getWindowHandle();
			Set<String>s2=driver.getWindowHandles();

			Iterator<String> I2= s2.iterator();
			while(I2.hasNext())
			{
				String child_window2=I2.next();
				if(!parent2.equals(child_window2))
				{
					driver.switchTo().window(child_window2);
					helper.waitForPageToLoad();
					System.out.println(driver.switchTo().window(child_window2).getTitle());
					helper.Scrollintoview(lastSeen);
					lastimageDate2 = lastSeen.getText();
					System.out.println("Analytics Image Last Seen Date: "+lastimageDate2);
					Reporter.log("<B><font color = 'blue'> ==> -</font> Image Date of Last Seen is :"+lastimageDate2);
					driver.close();
				}
			}
			driver.switchTo().window(parent2);
			String date_format_lastseen2= null;
			String[] splitString2 = lastimageDate2.split(" ");
			for(int i=0;i<splitString2.length-2;i++) {
				//    String actualDate=splitString[i]; 
				date_format_lastseen2= splitString2[i+1]+" "+ splitString2[i]+" " + splitString2[i+2];

				//  System.out.println("splitString : " + splitString[i]);
				System.out.println("Change Date format lastseen Date: " + date_format_lastseen2);
				System.out.println("Image last seen Date: " + imageDate2);
			}

			Assert.assertEquals(imageDate2, date_format_lastseen2);
			Reporter.log("<B><font color = 'blue'> ==> -</font> Both Last Seen Date are Matching in Assert Pass :"+imageDate2+ " == " +date_format_lastseen2);
			System.out.println("Both Last Seen Date are Matching in Assert Pass :"+imageDate2+ " == " +date_format_lastseen2);
		}
		catch (Exception e)
		{

			// TODO: handle exception
			System.out.println("Image is not able: Oops! Looks like we don't have data for this search criteria yet.");

			Reporter.log("<B><font color = 'Red'> ==> -</font> Image is not able: Oops! Looks like we don't have data for this search criteria yet.");
		}

		try {
			String lastimageDate3= null;
			Reporter.log(" ");
			Reporter.log("<B><font color ='red'> -3 Ad -</font>  ");
			System.out.println("");
			System.out.println("3 Ads");

			String imageDate3=date3.getText();
			Reporter.log("<B><font color = 'blue'> ==> -</font> Image Date is :"+imageDate3);
			System.out.println("Current Image Date: "+imageDate3);

			helper.waitFor(ShowAnalytics3);
			helper.highLightElement(driver, ShowAnalytics3);
			helper.jsScrollintoview(ShowAnalytics3);
			helper.Scrollintoview(ShowAnalytics3);
			String linkText3 = ShowAnalytics3.getAttribute("href");
			String idString3 = null;
			String[] splitStringid3 = linkText3.split("/");
			for(int i=0;i<splitStringid3.length;i++) {
				String actualDate3=splitStringid3[splitStringid3.length-1]; 
				System.out.println(" ID of the  Ad =" + actualDate3);
				Reporter.log("<B><font color = 'blue'> ==> -</font> ID of the  Ad = " + actualDate3);
				break;
			}
			ShowAnalytics3.click();
			Reporter.log("<B><font color = 'blue'> ==> -</font> Clicked On Show Analytics Icon");
			helper.waitForPageToLoad();

			String parent3=driver.getWindowHandle();
			Set<String>s3=driver.getWindowHandles();

			Iterator<String> I3= s3.iterator();
			while(I3.hasNext())
			{
				String child_window3=I3.next();
				if(!parent3.equals(child_window3))
				{
					driver.switchTo().window(child_window3);
					helper.waitForPageToLoad();
					System.out.println(driver.switchTo().window(child_window3).getTitle());
					helper.Scrollintoview(lastSeen);
					lastimageDate3 = lastSeen.getText();
					System.out.println("Analytics Image Last Seen Date: "+lastimageDate3);
					Reporter.log("<B><font color = 'blue'> ==> -</font> Image Date of Last Seen is :"+lastimageDate3);
					driver.close();
				}
			}
			driver.switchTo().window(parent3);
			String date_format_lastseen3= null;
			String[] splitString3 = lastimageDate3.split(" ");
			for(int i=0;i<splitString3.length-2;i++) {
				//    String actualDate=splitString[i]; 
				date_format_lastseen3= splitString3[i+1]+" "+ splitString3[i]+" " + splitString3[i+2];

				//  System.out.println("splitString : " + splitString[i]);
				System.out.println("Change Date format lastseen Date: " + date_format_lastseen3);
				System.out.println("Image last seen Date: " + imageDate3);
			}

			Assert.assertEquals(imageDate3, date_format_lastseen3);
			Reporter.log("<B><font color = 'blue'> ==> -</font> Both Last Seen Date are Matching in Assert Pass :"+imageDate3+ " == " +date_format_lastseen3);
			System.out.println("Both Last Seen Date are Matching in Assert Pass :"+imageDate3+ " == " +date_format_lastseen3);
		}
		catch (Exception e)
		{

			// TODO: handle exception
			System.out.println("Image is not able: Oops! Looks like we don't have data for this search criteria yet.");

			Reporter.log("<B><font color = 'Red'> ==> -</font> Image is not able: Oops! Looks like we don't have data for this search criteria yet.");
		}

		try {
			String lastimageDate4= null;
			Reporter.log(" ");
			Reporter.log("<B><font color ='red'> -4 Ad -</font>  ");
			System.out.println("");
			System.out.println("4 Ads");

			String imageDate4=date4.getText();
			Reporter.log("<B><font color = 'blue'> ==> -</font> Image Date is :"+imageDate4);
			System.out.println("Current Image Date: "+imageDate4);

			helper.waitFor(ShowAnalytics4);
			helper.highLightElement(driver, ShowAnalytics4);
			helper.jsScrollintoview(ShowAnalytics4);
			helper.Scrollintoview(ShowAnalytics4);;
			String linkText4 = ShowAnalytics4.getAttribute("href");
			String idString4 = null;
			String[] splitStringid4 = linkText4.split("/");
			for(int i=0;i<splitStringid4.length;i++) {
				String actualDate4=splitStringid4[splitStringid4.length-1]; 
				System.out.println(" ID of the  Ad =" + actualDate4);
				Reporter.log("<B><font color = 'blue'> ==> -</font> ID of the  Ad = " + actualDate4);
				break;
			}
			ShowAnalytics4.click();
			Reporter.log("<B><font color = 'blue'> ==> -</font> Clicked On Show Analytics Icon");
			helper.waitForPageToLoad();

			String parent4=driver.getWindowHandle();
			Set<String>s4=driver.getWindowHandles();

			Iterator<String> I4= s4.iterator();
			while(I4.hasNext())
			{
				String child_window4=I4.next();
				if(!parent4.equals(child_window4))
				{
					driver.switchTo().window(child_window4);
					helper.waitForPageToLoad();
					System.out.println(driver.switchTo().window(child_window4).getTitle());
					helper.Scrollintoview(lastSeen);
					lastimageDate4 = lastSeen.getText();
					System.out.println("Analytics Image Last Seen Date: "+lastimageDate4);
					Reporter.log("<B><font color = 'blue'> ==> -</font> Image Date of Last Seen is :"+lastimageDate4);
					driver.close();
				}
			}
			driver.switchTo().window(parent4);
			String date_format_lastseen4= null;
			String[] splitString4 = lastimageDate4.split(" ");
			for(int i=0;i<splitString4.length-2;i++) {
				//    String actualDate=splitString[i]; 
				date_format_lastseen4= splitString4[i+1]+" "+ splitString4[i]+" " + splitString4[i+2];

				//  System.out.println("splitString : " + splitString[i]);
				System.out.println("Change Date format lastseen Date: " + date_format_lastseen4);
				System.out.println("Image last seen Date: " + imageDate4);
			}

			Assert.assertEquals(imageDate4, date_format_lastseen4);
			Reporter.log("<B><font color = 'blue'> ==> -</font> Both Last Seen Date are Matching in Assert Pass :"+imageDate4+ " == " +date_format_lastseen4);
			System.out.println("Both Last Seen Date are Matching in Assert Pass :"+imageDate4+ " == " +date_format_lastseen4);
		}
		catch (Exception e)
		{

			// TODO: handle exception
			System.out.println("Image is not able: Oops! Looks like we don't have data for this search criteria yet.");

			Reporter.log("<B><font color = 'Red'> ==> -</font> Image is not able: Oops! Looks like we don't have data for this search criteria yet.");
		}

		try {
			String lastimageDate5= null;
			Reporter.log(" ");
			Reporter.log("<B><font color ='red'> -5 Ad -</font>  ");
			System.out.println("");
			System.out.println("5 Ads");

			String imageDate5=date5.getText();
			Reporter.log("<B><font color = 'blue'> ==> -</font> Image Date is :"+imageDate5);
			System.out.println("Current Image Date: "+imageDate5);

			helper.waitFor(ShowAnalytics5);
			helper.highLightElement(driver, ShowAnalytics5);
			helper.jsScrollintoview(ShowAnalytics5);
			helper.Scrollintoview(ShowAnalytics5);
			String linkText5 = ShowAnalytics5.getAttribute("href");
			String idString5 = null;
			String[] splitStringid5 = linkText5.split("/");
			for(int i=0;i<splitStringid5.length;i++) {
				String actualDate5=splitStringid5[splitStringid5.length-1]; 
				System.out.println(" ID of the  Ad =" + actualDate5);
				Reporter.log("<B><font color = 'blue'> ==> -</font> ID of the  Ad = " + actualDate5);
				break;
			}
			ShowAnalytics5.click();
			Reporter.log("<B><font color = 'blue'> ==> -</font> Clicked On Show Analytics Icon");
			helper.waitForPageToLoad();

			String parent5=driver.getWindowHandle();
			Set<String>s5=driver.getWindowHandles();

			Iterator<String> I5= s5.iterator();
			while(I5.hasNext())
			{
				String child_window5=I5.next();
				if(!parent5.equals(child_window5))
				{
					driver.switchTo().window(child_window5);
					helper.waitForPageToLoad();
					System.out.println(driver.switchTo().window(child_window5).getTitle());
					helper.Scrollintoview(lastSeen);
					lastimageDate5 = lastSeen.getText();
					System.out.println("Analytics Image Last Seen Date: "+lastimageDate5);
					Reporter.log("<B><font color = 'blue'> ==> -</font> Image Date of Last Seen is :"+lastimageDate5);
					driver.close();
				}
			}
			driver.switchTo().window(parent5);
			String date_format_lastseen5= null;
			String[] splitString5 = lastimageDate5.split(" ");
			for(int i=0;i<splitString5.length-2;i++) {
				//    String actualDate=splitString[i]; 
				date_format_lastseen5= splitString5[i+1]+" "+ splitString5[i]+" " + splitString5[i+2];

				//  System.out.println("splitString : " + splitString[i]);
				System.out.println("Change Date format lastseen Date: " + date_format_lastseen5);
				System.out.println("Image last seen Date: " + imageDate5);
			}

			Assert.assertEquals(imageDate5, date_format_lastseen5);
			Reporter.log("<B><font color = 'blue'> ==> -</font> Both Last Seen Date are Matching in Assert Pass :"+imageDate5+ " == " +date_format_lastseen5);
			System.out.println("Both Last Seen Date are Matching in Assert Pass :"+imageDate5+ " == " +date_format_lastseen5);
		}
		catch (Exception e)
		{

			// TODO: handle exception
			System.out.println("Image is not able: Oops! Looks like we don't have data for this search criteria yet.");

			Reporter.log("<B><font color = 'Red'> ==> -</font> Image is not able: Oops! Looks like we don't have data for this search criteria yet.");
		}


		try {
			String lastimageDate6= null;
			Reporter.log(" ");
			Reporter.log("<B><font color ='red'> -6 Ad -</font>  ");
			System.out.println("");
			System.out.println("6 Ads");

			String imageDate6=date6.getText();
			Reporter.log("<B><font color = 'blue'> ==> -</font> Image Date is :"+imageDate6);
			System.out.println("Current Image Date: "+imageDate6);

			helper.waitFor(ShowAnalytics6);
			helper.highLightElement(driver, ShowAnalytics6);
			helper.jsScrollintoview(ShowAnalytics6);
			helper.Scrollintoview(ShowAnalytics6);
			String linkText6 = ShowAnalytics6.getAttribute("href");
			String idString6 = null;
			String[] splitStringid6 = linkText6.split("/");
			for(int i=0;i<splitStringid6.length;i++) {
				String actualDate6=splitStringid6[splitStringid6.length-1]; 
				System.out.println(" ID of the  Ad =" + actualDate6);
				Reporter.log("<B><font color = 'blue'> ==> -</font> ID of the  Ad = " + actualDate6);
				break;
			}
			ShowAnalytics6.click();
			Reporter.log("<B><font color = 'blue'> ==> -</font> Clicked On Show Analytics Icon");
			helper.waitForPageToLoad();

			String parent6=driver.getWindowHandle();
			Set<String>s6=driver.getWindowHandles();

			Iterator<String> I6= s6.iterator();
			while(I6.hasNext())
			{
				String child_window6=I6.next();
				if(!parent6.equals(child_window6))
				{
					driver.switchTo().window(child_window6);
					helper.waitForPageToLoad();
					System.out.println(driver.switchTo().window(child_window6).getTitle());
					helper.Scrollintoview(lastSeen);
					lastimageDate6 = lastSeen.getText();
					System.out.println("Analytics Image Last Seen Date: "+lastimageDate6);
					Reporter.log("<B><font color = 'blue'> ==> -</font> Image Date of Last Seen is :"+lastimageDate6);
					driver.close();
				}
			}
			driver.switchTo().window(parent6);
			String date_format_lastseen6= null;
			String[] splitString6 = lastimageDate6.split(" ");
			for(int i=0;i<splitString6.length-2;i++) {
				//    String actualDate=splitString[i]; 
				date_format_lastseen6= splitString6[i+1]+" "+ splitString6[i]+" " + splitString6[i+2];

				//  System.out.println("splitString : " + splitString[i]);
				System.out.println("Change Date format lastseen Date: " + date_format_lastseen6);
				System.out.println("Image last seen Date: " + imageDate6);
			}

			Assert.assertEquals(imageDate6, date_format_lastseen6);
			Reporter.log("<B><font color = 'blue'> ==> -</font> Both Last Seen Date are Matching in Assert Pass :"+imageDate6+ " == " +date_format_lastseen6);
			System.out.println("Both Last Seen Date are Matching in Assert Pass :"+imageDate6+ " == " +date_format_lastseen6);
		}
		catch (Exception e)
		{

			// TODO: handle exception
			System.out.println("Image is not able: Oops! Looks like we don't have data for this search criteria yet.");

			Reporter.log("<B><font color = 'Red'> ==> -</font> Image is not able: Oops! Looks like we don't have data for this search criteria yet.");
		}		



		try {
			String lastimageDate7= null;
			Reporter.log(" ");
			Reporter.log("<B><font color ='red'> -7 Ad -</font>  ");
			System.out.println("");
			System.out.println("7 Ads");

			String imageDate7=date7.getText();
			Reporter.log("<B><font color = 'blue'> ==> -</font> Image Date is :"+imageDate7);
			System.out.println("Current Image Date: "+imageDate7);

			helper.waitFor(ShowAnalytics7);
			helper.highLightElement(driver, ShowAnalytics7);
			helper.jsScrollintoview(ShowAnalytics7);
			helper.Scrollintoview(ShowAnalytics7);
			String linkText7 = ShowAnalytics7.getAttribute("href");
			String idString7 = null;
			String[] splitStringid7 = linkText7.split("/");
			for(int i=0;i<splitStringid7.length;i++) {
				String actualDate7=splitStringid7[splitStringid7.length-1]; 
				System.out.println(" ID of the  Ad =" + actualDate7);
				Reporter.log("<B><font color = 'blue'> ==> -</font> ID of the  Ad = " + actualDate7);
				break;
			}
			ShowAnalytics7.click();
			Reporter.log("<B><font color = 'blue'> ==> -</font> Clicked On Show Analytics Icon");
			helper.waitForPageToLoad();

			String parent7=driver.getWindowHandle();
			Set<String>s7=driver.getWindowHandles();

			Iterator<String> I7= s7.iterator();
			while(I7.hasNext())
			{
				String child_window7=I7.next();
				if(!parent7.equals(child_window7))
				{
					driver.switchTo().window(child_window7);
					helper.waitForPageToLoad();
					System.out.println(driver.switchTo().window(child_window7).getTitle());
					helper.Scrollintoview(lastSeen);
					lastimageDate7 = lastSeen.getText();
					System.out.println("Analytics Image Last Seen Date: "+lastimageDate7);
					Reporter.log("<B><font color = 'blue'> ==> -</font> Image Date of Last Seen is :"+lastimageDate7);
					driver.close();
				}
			}
			driver.switchTo().window(parent7);
			String date_format_lastseen7= null;
			String[] splitString7 = lastimageDate7.split(" ");
			for(int i=0;i<splitString7.length-2;i++) {
				//    String actualDate=splitString[i]; 
				date_format_lastseen7= splitString7[i+1]+" "+ splitString7[i]+" " + splitString7[i+2];

				//  System.out.println("splitString : " + splitString[i]);
				System.out.println("Change Date format lastseen Date: " + date_format_lastseen7);
				System.out.println("Image last seen Date: " + imageDate7);
			}

			Assert.assertEquals(imageDate7, date_format_lastseen7);
			Reporter.log("<B><font color = 'blue'> ==> -</font> Both Last Seen Date are Matching in Assert Pass :"+imageDate7+ " == " +date_format_lastseen7);
			System.out.println("Both Last Seen Date are Matching in Assert Pass :"+imageDate7+ " == " +date_format_lastseen7);
		}
		catch (Exception e)
		{

			// TODO: handle exception
			System.out.println("Image is not able: Oops! Looks like we don't have data for this search criteria yet.");

			Reporter.log("<B><font color = 'Red'> ==> -</font> Image is not able: Oops! Looks like we don't have data for this search criteria yet.");
		}

		try {
			String lastimageDate8= null;
			Reporter.log(" ");
			Reporter.log("<B><font color ='red'> -8 Ad -</font>  ");
			System.out.println("");
			System.out.println("8 Ads");

			String imageDate8=date8.getText();
			Reporter.log("<B><font color = 'blue'> ==> -</font> Image Date is :"+imageDate8);
			System.out.println("Current Image Date: "+imageDate8);

			helper.waitFor(ShowAnalytics8);
			helper.highLightElement(driver, ShowAnalytics8);
			helper.jsScrollintoview(ShowAnalytics8);
			helper.Scrollintoview(ShowAnalytics8);
			String linkText8 = ShowAnalytics8.getAttribute("href");
			String idString8 = null;
			String[] splitStringid8 = linkText8.split("/");
			for(int i=0;i<splitStringid8.length;i++) {
				String actualDate8=splitStringid8[splitStringid8.length-1]; 
				System.out.println(" ID of the  Ad =" + actualDate8);
				Reporter.log("<B><font color = 'blue'> ==> -</font> ID of the  Ad = " + actualDate8);
				break;
			}
			ShowAnalytics5.click();
			Reporter.log("<B><font color = 'blue'> ==> -</font> Clicked On Show Analytics Icon");
			helper.waitForPageToLoad();

			String parent8=driver.getWindowHandle();
			Set<String>s8=driver.getWindowHandles();

			Iterator<String> I8= s8.iterator();
			while(I8.hasNext())
			{
				String child_window8=I8.next();
				if(!parent8.equals(child_window8))
				{
					driver.switchTo().window(child_window8);
					helper.waitForPageToLoad();
					System.out.println(driver.switchTo().window(child_window8).getTitle());
					helper.Scrollintoview(lastSeen);
					lastimageDate8 = lastSeen.getText();
					System.out.println("Analytics Image Last Seen Date: "+lastimageDate8);
					Reporter.log("<B><font color = 'blue'> ==> -</font> Image Date of Last Seen is :"+lastimageDate8);
					driver.close();
				}
			}
			driver.switchTo().window(parent8);
			String date_format_lastseen8= null;
			String[] splitString8 = lastimageDate8.split(" ");
			for(int i=0;i<splitString8.length-2;i++) {
				//    String actualDate=splitString[i]; 
				date_format_lastseen8= splitString8[i+1]+" "+ splitString8[i]+" " + splitString8[i+2];

				//  System.out.println("splitString : " + splitString[i]);
				System.out.println("Change Date format lastseen Date: " + date_format_lastseen8);
				System.out.println("Image last seen Date: " + imageDate8);
			}

			Assert.assertEquals(imageDate8, date_format_lastseen8);
			Reporter.log("<B><font color = 'blue'> ==> -</font> Both Last Seen Date are Matching in Assert Pass :"+imageDate8+ " == " +date_format_lastseen8);
			System.out.println("Both Last Seen Date are Matching in Assert Pass :"+imageDate8+ " == " +date_format_lastseen8);
		}
		catch (Exception e)
		{

			// TODO: handle exception
			System.out.println("Image is not able: Oops! Looks like we don't have data for this search criteria yet.");

			Reporter.log("<B><font color = 'Red'> ==> -</font> Image is not able: Oops! Looks like we don't have data for this search criteria yet.");
		}

		try {
			String lastimageDate9= null;
			Reporter.log(" ");
			Reporter.log("<B><font color ='red'> -9 Ad -</font>  ");
			System.out.println("");
			System.out.println("9 Ads");

			String imageDate9=date9.getText();
			Reporter.log("<B><font color = 'blue'> ==> -</font> Image Date is :"+imageDate9);
			System.out.println("Current Image Date: "+imageDate9);

			helper.waitFor(ShowAnalytics9);
			helper.highLightElement(driver, ShowAnalytics9);
			helper.jsScrollintoview(ShowAnalytics9);
			helper.Scrollintoview(ShowAnalytics9);
			String linkText9 = ShowAnalytics9.getAttribute("href");
			String idString9 = null;
			String[] splitStringid9 = linkText9.split("/");
			for(int i=0;i<splitStringid9.length;i++) {
				String actualDate9=splitStringid9[splitStringid9.length-1]; 
				System.out.println(" ID of the  Ad =" + actualDate9);
				Reporter.log("<B><font color = 'blue'> ==> -</font> ID of the  Ad = " + actualDate9);
				break;
			}
			ShowAnalytics9.click();
			Reporter.log("<B><font color = 'blue'> ==> -</font> Clicked On Show Analytics Icon");
			helper.waitForPageToLoad();

			String parent9=driver.getWindowHandle();
			Set<String>s9=driver.getWindowHandles();

			Iterator<String> I9= s9.iterator();
			while(I9.hasNext())
			{
				String child_window9=I9.next();
				if(!parent9.equals(child_window9))
				{
					driver.switchTo().window(child_window9);
					helper.waitForPageToLoad();
					System.out.println(driver.switchTo().window(child_window9).getTitle());
					helper.Scrollintoview(lastSeen);
					lastimageDate9 = lastSeen.getText();
					System.out.println("Analytics Image Last Seen Date: "+lastimageDate9);
					Reporter.log("<B><font color = 'blue'> ==> -</font> Image Date of Last Seen is :"+lastimageDate9);
					driver.close();
				}
			}
			driver.switchTo().window(parent9);
			String date_format_lastseen9= null;
			String[] splitString9 = lastimageDate9.split(" ");
			for(int i=0;i<splitString9.length-2;i++) {
				//    String actualDate=splitString[i]; 
				date_format_lastseen9= splitString9[i+1]+" "+ splitString9[i]+" " + splitString9[i+2];

				//  System.out.println("splitString : " + splitString[i]);
				System.out.println("Change Date format lastseen Date: " + date_format_lastseen9);
				System.out.println("Image last seen Date: " + imageDate9);
			}

			Assert.assertEquals(imageDate9, date_format_lastseen9);
			Reporter.log("<B><font color = 'blue'> ==> -</font> Both Last Seen Date are Matching in Assert Pass :"+imageDate9+ " == " +date_format_lastseen9);
			System.out.println("Both Last Seen Date are Matching in Assert Pass :"+imageDate9+ " == " +date_format_lastseen9);
		}
		catch (Exception e)
		{

			// TODO: handle exception
			System.out.println("Image is not able: Oops! Looks like we don't have data for this search criteria yet.");

			Reporter.log("<B><font color = 'Red'> ==> -</font> Image is not able: Oops! Looks like we don't have data for this search criteria yet.");
		}

		try {
			String lastimageDate10= null;
			Reporter.log(" ");
			Reporter.log("<B><font color ='red'> -10 Ad -</font>  ");
			System.out.println("");
			System.out.println("10 Ads");

			String imageDate10=date10.getText();
			Reporter.log("<B><font color = 'blue'> ==> -</font> Image Date is :"+imageDate10);
			System.out.println("Current Image Date: "+imageDate10);

			helper.waitFor(ShowAnalytics10);
			helper.highLightElement(driver, ShowAnalytics10);
			helper.jsScrollintoview(ShowAnalytics10);
			helper.Scrollintoview(ShowAnalytics10);
			String linkText10 = ShowAnalytics10.getAttribute("href");
			String idString10 = null;
			String[] splitStringid10 = linkText10.split("/");
			for(int i=0;i<splitStringid10.length;i++) {
				String actualDate10=splitStringid10[splitStringid10.length-1]; 
				System.out.println(" ID of the  Ad =" + actualDate10);
				Reporter.log("<B><font color = 'blue'> ==> -</font> ID of the  Ad = " + actualDate10);
				break;
			}
			ShowAnalytics10.click();
			Reporter.log("<B><font color = 'blue'> ==> -</font> Clicked On Show Analytics Icon");
			helper.waitForPageToLoad();

			String parent10=driver.getWindowHandle();
			Set<String>s10=driver.getWindowHandles();

			Iterator<String> I10= s10.iterator();
			while(I10.hasNext())
			{
				String child_window10=I10.next();
				if(!parent10.equals(child_window10))
				{
					driver.switchTo().window(child_window10);
					helper.waitForPageToLoad();
					System.out.println(driver.switchTo().window(child_window10).getTitle());
					helper.Scrollintoview(lastSeen);
					lastimageDate10 = lastSeen.getText();
					System.out.println("Analytics Image Last Seen Date: "+lastimageDate10);
					Reporter.log("<B><font color = 'blue'> ==> -</font> Image Date of Last Seen is :"+lastimageDate10);
					driver.close();
				}
			}
			driver.switchTo().window(parent10);
			String date_format_lastseen10= null;
			String[] splitString10 = lastimageDate10.split(" ");
			for(int i=0;i<splitString10.length-2;i++) {
				//    String actualDate=splitString[i]; 
				date_format_lastseen10= splitString10[i+1]+" "+ splitString10[i]+" " + splitString10[i+2];

				//  System.out.println("splitString : " + splitString[i]);
				System.out.println("Change Date format lastseen Date: " + date_format_lastseen10);
				System.out.println("Image last seen Date: " + imageDate10);
			}

			Assert.assertEquals(imageDate10, date_format_lastseen10);
			Reporter.log("<B><font color = 'blue'> ==> -</font> Both Last Seen Date are Matching in Assert Pass :"+imageDate10+ " == " +date_format_lastseen10);
			System.out.println("Both Last Seen Date are Matching in Assert Pass :"+imageDate10+ " == " +date_format_lastseen10);
		}
		catch (Exception e)
		{

			// TODO: handle exception
			System.out.println("Image is not able: Oops! Looks like we don't have data for this search criteria yet.");

			Reporter.log("<B><font color = 'Red'> ==> -</font> Image is not able: Oops! Looks like we don't have data for this search criteria yet.");
		}

		try {
			String lastimageDate11= null;
			Reporter.log(" ");
			Reporter.log("<B><font color ='red'> -11 Ad -</font>  ");
			System.out.println("");
			System.out.println("11 Ads");

			String imageDate11=date11.getText();
			Reporter.log("<B><font color = 'blue'> ==> -</font> Image Date is :"+imageDate11);
			System.out.println("Current Image Date: "+imageDate11);

			helper.waitFor(ShowAnalytics11);
			helper.highLightElement(driver, ShowAnalytics11);
			helper.jsScrollintoview(ShowAnalytics11);
			helper.Scrollintoview(ShowAnalytics11);
			String linkText11 = ShowAnalytics11.getAttribute("href");
			String idString11 = null;
			String[] splitStringid11 = linkText11.split("/");
			for(int i=0;i<splitStringid11.length;i++) {
				String actualDate11=splitStringid11[splitStringid11.length-1]; 
				System.out.println(" ID of the  Ad =" + actualDate11);
				Reporter.log("<B><font color = 'blue'> ==> -</font> ID of the  Ad = " + actualDate11);
				break;
			}
			ShowAnalytics11.click();
			Reporter.log("<B><font color = 'blue'> ==> -</font> Clicked On Show Analytics Icon");
			helper.waitForPageToLoad();

			String parent11=driver.getWindowHandle();
			Set<String>s11=driver.getWindowHandles();

			Iterator<String> I11= s11.iterator();
			while(I11.hasNext())
			{
				String child_window11=I11.next();
				if(!parent11.equals(child_window11))
				{
					driver.switchTo().window(child_window11);
					helper.waitForPageToLoad();
					System.out.println(driver.switchTo().window(child_window11).getTitle());
					helper.Scrollintoview(lastSeen);
					lastimageDate11 = lastSeen.getText();
					System.out.println("Analytics Image Last Seen Date: "+lastimageDate11);
					Reporter.log("<B><font color = 'blue'> ==> -</font> Image Date of Last Seen is :"+lastimageDate11);
					driver.close();
				}
			}
			driver.switchTo().window(parent11);
			String date_format_lastseen11= null;
			String[] splitString11 = lastimageDate11.split(" ");
			for(int i=0;i<splitString11.length-2;i++) {
				//    String actualDate=splitString[i]; 
				date_format_lastseen11= splitString11[i+1]+" "+ splitString11[i]+" " + splitString11[i+2];

				//  System.out.println("splitString : " + splitString[i]);
				System.out.println("Change Date format lastseen Date: " + date_format_lastseen11);
				System.out.println("Image last seen Date: " + imageDate11);
			}

			Assert.assertEquals(imageDate11, date_format_lastseen11);
			Reporter.log("<B><font color = 'blue'> ==> -</font> Both Last Seen Date are Matching in Assert Pass :"+imageDate11+ " == " +date_format_lastseen11);
			System.out.println("Both Last Seen Date are Matching in Assert Pass :"+imageDate11+ " == " +date_format_lastseen11);
		}
		catch (Exception e)
		{

			// TODO: handle exception
			System.out.println("Image is not able: Oops! Looks like we don't have data for this search criteria yet.");

			Reporter.log("<B><font color = 'Red'> ==> -</font> Image is not able: Oops! Looks like we don't have data for this search criteria yet.");
		}

		try {
			String lastimageDate12= null;
			Reporter.log(" ");
			Reporter.log("<B><font color ='red'> -12 Ad -</font>  ");
			System.out.println("");
			System.out.println("12 Ads");

			String imageDate12=date12.getText();
			Reporter.log("<B><font color = 'blue'> ==> -</font> Image Date is :"+imageDate12);
			System.out.println("Current Image Date: "+imageDate12);

			helper.waitFor(ShowAnalytics12);
			helper.highLightElement(driver, ShowAnalytics12);
			helper.jsScrollintoview(ShowAnalytics12);
			helper.Scrollintoview(ShowAnalytics12);
			String linkText12 = ShowAnalytics12.getAttribute("href");
			String idString12 = null;
			String[] splitStringid12 = linkText12.split("/");
			for(int i=0;i<splitStringid12.length;i++) {
				String actualDate12=splitStringid12[splitStringid12.length-1]; 
				System.out.println(" ID of the  Ad =" + actualDate12);
				Reporter.log("<B><font color = 'blue'> ==> -</font> ID of the  Ad = " + actualDate12);
				break;
			}
			ShowAnalytics12.click();
			Reporter.log("<B><font color = 'blue'> ==> -</font> Clicked On Show Analytics Icon");
			helper.waitForPageToLoad();

			String parent12=driver.getWindowHandle();
			Set<String>s12=driver.getWindowHandles();

			Iterator<String> I12= s12.iterator();
			while(I12.hasNext())
			{
				String child_window12=I12.next();
				if(!parent12.equals(child_window12))
				{
					driver.switchTo().window(child_window12);
					helper.waitForPageToLoad();
					System.out.println(driver.switchTo().window(child_window12).getTitle());
					helper.Scrollintoview(lastSeen);
					lastimageDate12 = lastSeen.getText();
					System.out.println("Analytics Image Last Seen Date: "+lastimageDate12);
					Reporter.log("<B><font color = 'blue'> ==> -</font> Image Date of Last Seen is :"+lastimageDate12);
					driver.close();
				}
			}
			driver.switchTo().window(parent12);
			String date_format_lastseen12= null;
			String[] splitString12 = lastimageDate12.split(" ");
			for(int i=0;i<splitString12.length-2;i++) {
				//    String actualDate=splitString[i]; 
				date_format_lastseen12= splitString12[i+1]+" "+ splitString12[i]+" " + splitString12[i+2];

				//  System.out.println("splitString : " + splitString[i]);
				System.out.println("Change Date format lastseen Date: " + date_format_lastseen12);
				System.out.println("Image last seen Date: " + imageDate12);
			}

			Assert.assertEquals(imageDate12, date_format_lastseen12);
			Reporter.log("<B><font color = 'blue'> ==> -</font> Both Last Seen Date are Matching in Assert Pass :"+imageDate12+ " == " +date_format_lastseen12);
			System.out.println("Both Last Seen Date are Matching in Assert Pass :"+imageDate12+ " == " +date_format_lastseen12);
		}
		catch (Exception e)
		{

			// TODO: handle exception
			System.out.println("Image is not able: Oops! Looks like we don't have data for this search criteria yet.");

			Reporter.log("<B><font color = 'Red'> ==> -</font> Image is not able: Oops! Looks like we don't have data for this search criteria yet.");
		}

		try {
			String lastimageDate13= null;
			Reporter.log(" ");
			Reporter.log("<B><font color ='red'> -13 Ad -</font>  ");
			System.out.println("");
			System.out.println("13 Ads");

			String imageDate13=date13.getText();
			Reporter.log("<B><font color = 'blue'> ==> -</font> Image Date is :"+imageDate13);
			System.out.println("Current Image Date: "+imageDate13);

			helper.waitFor(ShowAnalytics13);
			helper.highLightElement(driver, ShowAnalytics13);
			helper.jsScrollintoview(ShowAnalytics13);
			helper.Scrollintoview(ShowAnalytics13);
			String linkText13 = ShowAnalytics13.getAttribute("href");
			String idString13 = null;
			String[] splitStringid13 = linkText13.split("/");
			for(int i=0;i<splitStringid13.length;i++) {
				String actualDate13=splitStringid13[splitStringid13.length-1]; 
				System.out.println(" ID of the  Ad =" + actualDate13);
				Reporter.log("<B><font color = 'blue'> ==> -</font> ID of the  Ad = " + actualDate13);
				break;
			}
			ShowAnalytics13.click();
			Reporter.log("<B><font color = 'blue'> ==> -</font> Clicked On Show Analytics Icon");
			helper.waitForPageToLoad();

			String parent13=driver.getWindowHandle();
			Set<String>s13=driver.getWindowHandles();

			Iterator<String> I13= s13.iterator();
			while(I13.hasNext())
			{
				String child_window13=I13.next();
				if(!parent13.equals(child_window13))
				{
					driver.switchTo().window(child_window13);
					helper.waitForPageToLoad();
					System.out.println(driver.switchTo().window(child_window13).getTitle());
					helper.Scrollintoview(lastSeen);
					lastimageDate13 = lastSeen.getText();
					System.out.println("Analytics Image Last Seen Date: "+lastimageDate13);
					Reporter.log("<B><font color = 'blue'> ==> -</font> Image Date of Last Seen is :"+lastimageDate13);
					driver.close();
				}
			}
			driver.switchTo().window(parent13);
			String date_format_lastseen13= null;
			String[] splitString13 = lastimageDate13.split(" ");
			for(int i=0;i<splitString13.length-2;i++) {
				//    String actualDate=splitString[i]; 
				date_format_lastseen13= splitString13[i+1]+" "+ splitString13[i]+" " + splitString13[i+2];

				//  System.out.println("splitString : " + splitString[i]);
				System.out.println("Change Date format lastseen Date: " + date_format_lastseen13);
				System.out.println("Image last seen Date: " + imageDate13);
			}

			Assert.assertEquals(imageDate13, date_format_lastseen13);
			Reporter.log("<B><font color = 'blue'> ==> -</font> Both Last Seen Date are Matching in Assert Pass :"+imageDate13+ " == " +date_format_lastseen13);
			System.out.println("Both Last Seen Date are Matching in Assert Pass :"+imageDate13+ " == " +date_format_lastseen13);
		}
		catch (Exception e)
		{

			// TODO: handle exception
			System.out.println("Image is not able: Oops! Looks like we don't have data for this search criteria yet.");

			Reporter.log("<B><font color = 'Red'> ==> -</font> Image is not able: Oops! Looks like we don't have data for this search criteria yet.");
		}

		try {
			String lastimageDate14= null;
			Reporter.log(" ");
			Reporter.log("<B><font color ='red'> -14 Ad -</font>  ");
			System.out.println("");
			System.out.println("14 Ads");

			String imageDate14=date14.getText();
			Reporter.log("<B><font color = 'blue'> ==> -</font> Image Date is :"+imageDate14);
			System.out.println("Current Image Date: "+imageDate14);

			helper.waitFor(ShowAnalytics14);
			helper.highLightElement(driver, ShowAnalytics14);
			helper.jsScrollintoview(ShowAnalytics14);
			helper.Scrollintoview(ShowAnalytics14);
			String linkText14 = ShowAnalytics14.getAttribute("href");
			String idString14 = null;
			String[] splitStringid14 = linkText14.split("/");
			for(int i=0;i<splitStringid14.length;i++) {
				String actualDate14=splitStringid14[splitStringid14.length-1]; 
				System.out.println(" ID of the  Ad =" + actualDate14);
				Reporter.log("<B><font color = 'blue'> ==> -</font> ID of the  Ad = " + actualDate14);
				break;
			}
			ShowAnalytics14.click();
			Reporter.log("<B><font color = 'blue'> ==> -</font> Clicked On Show Analytics Icon");
			helper.waitForPageToLoad();

			String parent14=driver.getWindowHandle();
			Set<String>s14=driver.getWindowHandles();

			Iterator<String> I14= s14.iterator();
			while(I14.hasNext())
			{
				String child_window14=I14.next();
				if(!parent14.equals(child_window14))
				{
					driver.switchTo().window(child_window14);
					helper.waitForPageToLoad();
					System.out.println(driver.switchTo().window(child_window14).getTitle());
					helper.Scrollintoview(lastSeen);
					lastimageDate14 = lastSeen.getText();
					System.out.println("Analytics Image Last Seen Date: "+lastimageDate14);
					Reporter.log("<B><font color = 'blue'> ==> -</font> Image Date of Last Seen is :"+lastimageDate14);
					driver.close();
				}
			}
			driver.switchTo().window(parent14);
			String date_format_lastseen14= null;
			String[] splitString14 = lastimageDate14.split(" ");
			for(int i=0;i<splitString14.length-2;i++) {
				//    String actualDate=splitString[i]; 
				date_format_lastseen14= splitString14[i+1]+" "+ splitString14[i]+" " + splitString14[i+2];

				//  System.out.println("splitString : " + splitString[i]);
				System.out.println("Change Date format lastseen Date: " + date_format_lastseen14);
				System.out.println("Image last seen Date: " + imageDate14);
			}

			Assert.assertEquals(imageDate14, date_format_lastseen14);
			Reporter.log("<B><font color = 'blue'> ==> -</font> Both Last Seen Date are Matching in Assert Pass :"+imageDate14+ " == " +date_format_lastseen14);
			System.out.println("Both Last Seen Date are Matching in Assert Pass :"+imageDate14+ " == " +date_format_lastseen14);
		}
		catch (Exception e)
		{

			// TODO: handle exception
			System.out.println("Image is not able: Oops! Looks like we don't have data for this search criteria yet.");

			Reporter.log("<B><font color = 'Red'> ==> -</font> Image is not able: Oops! Looks like we don't have data for this search criteria yet.");
		}

		try {
			String lastimageDate15= null;
			Reporter.log(" ");
			Reporter.log("<B><font color ='red'> -15 Ad -</font>  ");
			System.out.println("");
			System.out.println("15 Ads");

			String imageDate15=date15.getText();
			Reporter.log("<B><font color = 'blue'> ==> -</font> Image Date is :"+imageDate15);
			System.out.println("Current Image Date: "+imageDate15);

			helper.waitFor(ShowAnalytics15);
			helper.highLightElement(driver, ShowAnalytics15);
			helper.jsScrollintoview(ShowAnalytics15);
			helper.Scrollintoview(ShowAnalytics15);
			String linkText15 = ShowAnalytics15.getAttribute("href");
			String idString15 = null;
			String[] splitStringid15 = linkText15.split("/");
			for(int i=0;i<splitStringid15.length;i++) {
				String actualDate15=splitStringid15[splitStringid15.length-1]; 
				System.out.println(" ID of the  Ad =" + actualDate15);
				Reporter.log("<B><font color = 'blue'> ==> -</font> ID of the  Ad = " + actualDate15);
				break;
			}
			ShowAnalytics15.click();
			Reporter.log("<B><font color = 'blue'> ==> -</font> Clicked On Show Analytics Icon");
			helper.waitForPageToLoad();

			String parent15=driver.getWindowHandle();
			Set<String>s15=driver.getWindowHandles();

			Iterator<String> I15= s15.iterator();
			while(I15.hasNext())
			{
				String child_window15=I15.next();
				if(!parent15.equals(child_window15))
				{
					driver.switchTo().window(child_window15);
					helper.waitForPageToLoad();
					System.out.println(driver.switchTo().window(child_window15).getTitle());
					helper.Scrollintoview(lastSeen);
					lastimageDate15 = lastSeen.getText();
					System.out.println("Analytics Image Last Seen Date: "+lastimageDate15);
					Reporter.log("<B><font color = 'blue'> ==> -</font> Image Date of Last Seen is :"+lastimageDate15);
					driver.close();
				}
			}
			driver.switchTo().window(parent15);
			String date_format_lastseen15= null;
			String[] splitString5 = lastimageDate15.split(" ");
			for(int i=0;i<splitString5.length-2;i++) {
				//    String actualDate=splitString[i]; 
				date_format_lastseen15= splitString5[i+1]+" "+ splitString5[i]+" " + splitString5[i+2];

				//  System.out.println("splitString : " + splitString[i]);
				System.out.println("Change Date format lastseen Date: " + date_format_lastseen15);
				System.out.println("Image last seen Date: " + imageDate15);
			}

			Assert.assertEquals(imageDate15, date_format_lastseen15);
			Reporter.log("<B><font color = 'blue'> ==> -</font> Both Last Seen Date are Matching in Assert Pass :"+imageDate15+ " == " +date_format_lastseen15);
			System.out.println("Both Last Seen Date are Matching in Assert Pass :"+imageDate15+ " == " +date_format_lastseen15);
		}
		catch (Exception e)
		{

			// TODO: handle exception
			System.out.println("Image is not able: Oops! Looks like we don't have data for this search criteria yet.");

			Reporter.log("<B><font color = 'Red'> ==> -</font> Image is not able: Oops! Looks like we don't have data for this search criteria yet.");
		}

	}

	public void AdSeenBetween_CustomRange() throws InterruptedException
	{
		System.out.println();
		Reporter.log("      ");
		System.out.println("-SortBy Newest -Ad Seen Between Custom Range: ");
	
		helper.waitForPageToLoad();

		Reporter.log("<B><font color = 'green'>  -ShortBy Newest -Ad Seen Between Custom Range Step will Start from here </font> ");
		helper.waitFor(adSeenbetweenfilter);
		helper.highLightElement(driver, adSeenbetweenfilter);
		helper.jsScrollintoview(adSeenbetweenfilter);
		adSeenbetweenfilter.click();
		Reporter.log("<B><font color = 'orange'> Step1 -</font> Clicked On Ad Seen between filter Icon");

		helper.waitFor(adSeenBetween_customrange);
		helper.highLightElement(driver,adSeenBetween_customrange);
		helper.jsScrollintoview(adSeenBetween_customrange);
		adSeenBetween_customrange.click();
		Reporter.log("<B><font color = 'orange'> Step2 -</font> Clicked On Ad Seen Between Custom Range Icon");

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
		helper.jsScrollintoview(searchButton);
		searchButton.click();
		Reporter.log("<B><font color = 'orange'> Step5 -</font> Clicked On Search Button Icon");
		helper.waitForPageToLoad();

		String totaladscount=totaladscount_ad.getText();
		System.out.println("Totaladscount: "+totaladscount);
		Reporter.log("<B><font color = 'orange'> Step6 -</font>  Total Ad Count is :"+ totaladscount);



		try {
			Reporter.log(" ");
			Reporter.log("<B><font color ='red'> 1 Ad -</font>  ");
			System.out.println("");
			System.out.println("1 Ads");
			String imageDate1=date1.getText();
			Reporter.log("<B><font color = 'blue'> ==> -</font> Image Date is :"+imageDate1);
			System.out.println("Current Image Date: "+imageDate1);

			String lastimageDate1= null;
			helper.waitFor(ShowAnalytics1);
			helper.highLightElement(driver, ShowAnalytics1);
			helper.jsScrollintoview(ShowAnalytics1);
			String linkText1 = ShowAnalytics1.getAttribute("href");
			String idString1 = null;
			String[] splitStringid1 = linkText1.split("/");
			for(int i=0;i<splitStringid1.length;i++) {
				String actualDate1=splitStringid1[splitStringid1.length-1]; 
				System.out.println(" ID of the  Ad =" + actualDate1);
				Reporter.log("<B><font color = 'blue'> ==> -</font> ID of the  Ad = " + actualDate1);
				break;
			}
			ShowAnalytics1.click();
			Reporter.log("<B><font color = 'blue'> ==> -</font> Clicked On Show Analytics Icon");
			helper.waitForPageToLoad();

			String parent1=driver.getWindowHandle();
			Set<String>s1=driver.getWindowHandles();

			Iterator<String> I1= s1.iterator();
			while(I1.hasNext())
			{
				String child_window1=I1.next();
				if(!parent1.equals(child_window1))
				{
					driver.switchTo().window(child_window1);
					helper.waitForPageToLoad();
					System.out.println(driver.switchTo().window(child_window1).getTitle());
					helper.Scrollintoview(lastSeen);
					lastimageDate1 = lastSeen.getText();
					System.out.println("Analytics Image Last Seen Date: "+lastimageDate1);
					Reporter.log("<B><font color = 'blue'> ==> -</font> Image Date of Last Seen is :"+lastimageDate1);
					driver.close();
				}
			}
			driver.switchTo().window(parent1);
			String date_format_lastseen1 = null;

			String[] splitString1 = lastimageDate1.split(" ");
			for(int i=0;i<splitString1.length-2;i++) {
				//    String actualDate=splitString[i]; 
				date_format_lastseen1= splitString1[i+1]+" "+ splitString1[i]+" " + splitString1[i+2];

				//  System.out.println("splitString : " + splitString[i]);
				System.out.println("Change Date format lastseen Date: " + date_format_lastseen1);
				System.out.println("Image last seen Date: " + imageDate1);
			}

			Assert.assertEquals(imageDate1, date_format_lastseen1);
			Reporter.log("<B><font color = 'blue'> ==> -</font> Both Last Seen Date are Matching in Assert Pass :"+imageDate1+ " == " +date_format_lastseen1);
			System.out.println("Both Last Seen Date are Matching in Assert Pass :"+imageDate1+ " == " +date_format_lastseen1);
		}
		catch (Exception e) 
		{
			// TODO: handle exception
			System.out.println("Image is not able: Oops! Looks like we don't have data for this search criteria yet.");

			Reporter.log("<B><font color = 'Red'> ==> -</font> Image is not able: Oops! Looks like we don't have data for this search criteria yet.");
		}




		try {
			String lastimageDate2= null;
			Reporter.log(" ");
			Reporter.log("<B><font color ='red'> 2 Ad -</font>  ");
			System.out.println("");
			System.out.println("2 Ads");
			String imageDate2=date2.getText();
			Reporter.log("<B><font color = 'blue'> ==> -</font> Image Date is :"+imageDate2);
			System.out.println("Current Image Date: "+imageDate2);

			helper.waitFor(ShowAnalytics2);
			helper.highLightElement(driver, ShowAnalytics2);
			helper.jsScrollintoview(ShowAnalytics2);
			String linkText1 = ShowAnalytics2.getAttribute("href");
			String idString1 = null;
			String[] splitStringid1 = linkText1.split("/");
			for(int i=0;i<splitStringid1.length;i++) {
				String actualDate1=splitStringid1[splitStringid1.length-1]; 
				System.out.println(" ID of the  Ad =" + actualDate1);
				Reporter.log("<B><font color = 'blue'> ==> -</font> ID of the  Ad = " + actualDate1);
				break;
			}
			ShowAnalytics2.click();
			Reporter.log("<B><font color = 'blue'> ==> -</font> Clicked On Show Analytics Icon");
			helper.waitForPageToLoad();

			String parent2=driver.getWindowHandle();
			Set<String>s2=driver.getWindowHandles();

			Iterator<String> I2= s2.iterator();
			while(I2.hasNext())
			{
				String child_window2=I2.next();
				if(!parent2.equals(child_window2))
				{
					driver.switchTo().window(child_window2);
					helper.waitForPageToLoad();
					System.out.println(driver.switchTo().window(child_window2).getTitle());
					helper.Scrollintoview(lastSeen);
					lastimageDate2 = lastSeen.getText();
					System.out.println("Analytics Image Last Seen Date: "+lastimageDate2);
					Reporter.log("<B><font color = 'blue'> ==> -</font> Image Date of Last Seen is :"+lastimageDate2);
					driver.close();
				}
			}
			driver.switchTo().window(parent2);
			String date_format_lastseen2 = null;

			String[] splitString2 = lastimageDate2.split(" ");
			for(int i=0;i<splitString2.length-2;i++) {
				//    String actualDate=splitString[i]; 
				date_format_lastseen2= splitString2[i+1]+" "+ splitString2[i]+" " + splitString2[i+2];

				//  System.out.println("splitString : " + splitString[i]);
				System.out.println("Change Date format lastseen Date: " + date_format_lastseen2);
				System.out.println("Image last seen Date: " + imageDate2);
			}

			Assert.assertEquals(imageDate2, date_format_lastseen2);
			Reporter.log("<B><font color = 'blue'> ==> -</font> Both Last Seen Date are Matching in Assert Pass :"+imageDate2+ " == " +date_format_lastseen2);
			System.out.println("Both Last Seen Date are Matching in Assert Pass :"+imageDate2+ " == " +date_format_lastseen2);
		}
		catch (Exception e) 
		{
			// TODO: handle exception
			System.out.println("Image is not able: Oops! Looks like we don't have data for this search criteria yet.");

			Reporter.log("<B><font color = 'Red'> ==> -</font> Image is not able: Oops! Looks like we don't have data for this search criteria yet.");

		}


		try {
			Reporter.log(" ");
			Reporter.log("<B><font color ='red'> 3 Ad -</font>  ");
			System.out.println("");
			System.out.println("3 Ads");
			String imageDate3=date3.getText();
			Reporter.log("<B><font color = 'blue'> ==> -</font> Image Date is :"+imageDate3);
			System.out.println("Current Image Date: "+imageDate3);

			String lastimageDate3= null;
			helper.waitFor(ShowAnalytics3);
			helper.highLightElement(driver, ShowAnalytics3);
			helper.jsScrollintoview(ShowAnalytics3);
			String linkText3 = ShowAnalytics3.getAttribute("href");
			String idString3 = null;
			String[] splitStringid3 = linkText3.split("/");
			for(int i=0;i<splitStringid3.length;i++) {
				String actualDate3=splitStringid3[splitStringid3.length-1]; 
				System.out.println(" ID of the  Ad =" + actualDate3);
				Reporter.log("<B><font color = 'blue'> ==> -</font> ID of the  Ad = " + actualDate3);
				break;
			}
			ShowAnalytics3.click();
			Reporter.log("<B><font color = 'blue'> ==> -</font> Clicked On Show Analytics Icon");
			helper.waitForPageToLoad();

			String parent3=driver.getWindowHandle();
			Set<String>s3=driver.getWindowHandles();

			Iterator<String> I3= s3.iterator();
			while(I3.hasNext())
			{
				String child_window3=I3.next();
				if(!parent3.equals(child_window3))
				{
					driver.switchTo().window(child_window3);
					helper.waitForPageToLoad();
					System.out.println(driver.switchTo().window(child_window3).getTitle());
					helper.Scrollintoview(lastSeen);
					lastimageDate3 = lastSeen.getText();
					System.out.println("Analytics Image Last Seen Date: "+lastimageDate3);
					Reporter.log("<B><font color = 'blue'> ==> -</font> Image Date of Last Seen is :"+lastimageDate3);
					driver.close();
				}
			}
			driver.switchTo().window(parent3);
			String date_format_lastseen3 = null;

			String[] splitString3 = lastimageDate3.split(" ");
			for(int i=0;i<splitString3.length-2;i++) {
				//    String actualDate=splitString[i]; 
				date_format_lastseen3= splitString3[i+1]+" "+ splitString3[i]+" " + splitString3[i+2];

				//  System.out.println("splitString : " + splitString[i]);
				System.out.println("Change Date format lastseen Date: " + date_format_lastseen3);
				System.out.println("Image last seen Date: " + imageDate3);
			}

			Assert.assertEquals(imageDate3, date_format_lastseen3);
			Reporter.log("<B><font color = 'blue'> ==> -</font> Both Last Seen Date are Matching in Assert Pass :"+imageDate3+ " == " +date_format_lastseen3);
			System.out.println("Both Last Seen Date are Matching in Assert Pass :"+imageDate3+ " == " +date_format_lastseen3);
		}
		catch (Exception e) 
		{
			// TODO: handle exception
			System.out.println("Image is not able: Oops! Looks like we don't have data for this search criteria yet.");

			Reporter.log("<B><font color = 'Red'> ==> -</font> Image is not able: Oops! Looks like we don't have data for this search criteria yet.");

		}


		try {
			Reporter.log(" ");
			Reporter.log("<B><font color ='red'> 4 Ad -</font>  ");
			System.out.println("");
			System.out.println("4 Ads");
			String imageDate4=date4.getText();
			Reporter.log("<B><font color = 'blue'> ==> -</font> Image Date is :"+imageDate4);
			System.out.println("Current Image Date: "+imageDate4);

			String lastimageDate4= null;
			helper.waitFor(ShowAnalytics4);
			helper.highLightElement(driver, ShowAnalytics4);
			helper.jsScrollintoview(ShowAnalytics4);
			String linkText4 = ShowAnalytics4.getAttribute("href");
			String idString4= null;
			String[] splitStringid4 = linkText4.split("/");
			for(int i=0;i<splitStringid4.length;i++) {
				String actualDate4=splitStringid4[splitStringid4.length-1]; 
				System.out.println(" ID of the  Ad =" + actualDate4);
				Reporter.log("<B><font color = 'blue'> ==> -</font> ID of the  Ad = " + actualDate4);
				break;
			}
			ShowAnalytics4.click();
			Reporter.log("<B><font color = 'blue'> ==> -</font> Clicked On Show Analytics Icon");
			helper.waitForPageToLoad();

			String parent4=driver.getWindowHandle();
			Set<String>s4=driver.getWindowHandles();

			Iterator<String> I4= s4.iterator();
			while(I4.hasNext())
			{
				String child_window4=I4.next();
				if(!parent4.equals(child_window4))
				{
					driver.switchTo().window(child_window4);
					helper.waitForPageToLoad();
					System.out.println(driver.switchTo().window(child_window4).getTitle());
					helper.Scrollintoview(lastSeen);
					lastimageDate4 = lastSeen.getText();
					System.out.println("Analytics Image Last Seen Date: "+lastimageDate4);
					Reporter.log("<B><font color = 'blue'> ==> -</font> Image Date of Last Seen is :"+lastimageDate4);
					driver.close();
				}
			}
			driver.switchTo().window(parent4);
			String date_format_lastseen4 = null;

			String[] splitString4 = lastimageDate4.split(" ");
			for(int i=0;i<splitString4.length-2;i++) {
				//    String actualDate=splitString[i]; 
				date_format_lastseen4= splitString4[i+1]+" "+ splitString4[i]+" " + splitString4[i+2];

				//  System.out.println("splitString : " + splitString[i]);
				System.out.println("Change Date format lastseen Date: " + date_format_lastseen4);
				System.out.println("Image last seen Date: " + imageDate4);
			}

			Assert.assertEquals(imageDate4, date_format_lastseen4);
			Reporter.log("<B><font color = 'blue'> ==> -</font> Both Last Seen Date are Matching in Assert Pass :"+imageDate4+ " == " +date_format_lastseen4);
			System.out.println("Both Last Seen Date are Matching in Assert Pass :"+imageDate4+ " == " +date_format_lastseen4);
		}
		catch (Exception e) 
		{
			// TODO: handle exception
			System.out.println("Image is not able: Oops! Looks like we don't have data for this search criteria yet.");

			Reporter.log("<B><font color = 'Red'> ==> -</font> Image is not able: Oops! Looks like we don't have data for this search criteria yet.");
		}		



		try {
			Reporter.log(" ");
			Reporter.log("<B><font color ='red'> 5 Ad -</font>  ");
			System.out.println("");
			System.out.println("5 Ads");
			String imageDate5=date5.getText();
			Reporter.log("<B><font color = 'blue'> ==> -</font> Image Date is :"+imageDate5);
			System.out.println("Current Image Date: "+imageDate5);

			String lastimageDate5= null;
			helper.waitFor(ShowAnalytics5);
			helper.highLightElement(driver, ShowAnalytics5);
			helper.jsScrollintoview(ShowAnalytics5);
			String linkText5 = ShowAnalytics5.getAttribute("href");
			String idString5= null;
			String[] splitStringid5 = linkText5.split("/");
			for(int i=0;i<splitStringid5.length;i++) {
				String actualDate5=splitStringid5[splitStringid5.length-1]; 
				System.out.println(" ID of the  Ad =" + actualDate5);
				Reporter.log("<B><font color = 'blue'> ==> -</font> ID of the  Ad = " + actualDate5);
				break;
			}
			ShowAnalytics5.click();
			Reporter.log("<B><font color = 'blue'> ==> -</font> Clicked On Show Analytics Icon");
			helper.waitForPageToLoad();

			String parent5=driver.getWindowHandle();
			Set<String>s5=driver.getWindowHandles();

			Iterator<String> I5= s5.iterator();
			while(I5.hasNext())
			{
				String child_window5=I5.next();
				if(!parent5.equals(child_window5))
				{
					driver.switchTo().window(child_window5);
					helper.waitForPageToLoad();
					System.out.println(driver.switchTo().window(child_window5).getTitle());
					helper.Scrollintoview(lastSeen);
					lastimageDate5 = lastSeen.getText();
					System.out.println("Analytics Image Last Seen Date: "+lastimageDate5);
					Reporter.log("<B><font color = 'blue'> ==> -</font> Image Date of Last Seen is :"+lastimageDate5);
					driver.close();
				}
			}
			driver.switchTo().window(parent5);
			String date_format_lastseen5 = null;

			String[] splitString5 = lastimageDate5.split(" ");
			for(int i=0;i<splitString5.length-2;i++) {
				//    String actualDate=splitString[i]; 
				date_format_lastseen5= splitString5[i+1]+" "+ splitString5[i]+" " + splitString5[i+2];

				//  System.out.println("splitString : " + splitString[i]);
				System.out.println("Change Date format lastseen Date: " + date_format_lastseen5);
				System.out.println("Image last seen Date: " + imageDate5);
			}

			Assert.assertEquals(imageDate5, date_format_lastseen5);
			Reporter.log("<B><font color = 'blue'> ==> -</font> Both Last Seen Date are Matching in Assert Pass :"+imageDate5+ " == " +date_format_lastseen5);
			System.out.println("Both Last Seen Date are Matching in Assert Pass :"+imageDate5+ " == " +date_format_lastseen5);
		}
		catch (Exception e) 
		{
			// TODO: handle exception
			System.out.println("Image is not able: Oops! Looks like we don't have data for this search criteria yet.");

			Reporter.log("<B><font color = 'Red'> ==> -</font> Image is not able: Oops! Looks like we don't have data for this search criteria yet.");
		}		


		try {
			Reporter.log(" ");
			Reporter.log("<B><font color ='red'> 6 Ad -</font>  ");
			System.out.println("");
			System.out.println("6 Ads");
			String imageDate6=date6.getText();
			Reporter.log("<B><font color = 'blue'> ==> -</font> Image Date is :"+imageDate6);
			System.out.println("Current Image Date: "+imageDate6);

			String lastimageDate6= null;
			helper.waitFor(ShowAnalytics6);
			helper.highLightElement(driver, ShowAnalytics6);
			helper.jsScrollintoview(ShowAnalytics6);
			String linkText6 = ShowAnalytics6.getAttribute("href");
			String idString6= null;
			String[] splitStringid6 = linkText6.split("/");
			for(int i=0;i<splitStringid6.length;i++) {
				String actualDate6=splitStringid6[splitStringid6.length-1]; 
				System.out.println(" ID of the  Ad =" + actualDate6);
				Reporter.log("<B><font color = 'blue'> ==> -</font> ID of the  Ad = " + actualDate6);
				break;
			}
			ShowAnalytics6.click();
			Reporter.log("<B><font color = 'blue'> ==> -</font> Clicked On Show Analytics Icon");
			helper.waitForPageToLoad();

			String parent6=driver.getWindowHandle();
			Set<String>s6=driver.getWindowHandles();

			Iterator<String> I6= s6.iterator();
			while(I6.hasNext())
			{
				String child_window6=I6.next();
				if(!parent6.equals(child_window6))
				{
					driver.switchTo().window(child_window6);
					helper.waitForPageToLoad();
					System.out.println(driver.switchTo().window(child_window6).getTitle());
					helper.Scrollintoview(lastSeen);
					lastimageDate6 = lastSeen.getText();
					System.out.println("Analytics Image Last Seen Date: "+lastimageDate6);
					Reporter.log("<B><font color = 'blue'> ==> -</font> Image Date of Last Seen is :"+lastimageDate6);
					driver.close();
				}
			}
			driver.switchTo().window(parent6);
			String date_format_lastseen6 = null;

			String[] splitString6 = lastimageDate6.split(" ");
			for(int i=0;i<splitString6.length-2;i++) {
				//    String actualDate=splitString[i]; 
				date_format_lastseen6= splitString6[i+1]+" "+ splitString6[i]+" " + splitString6[i+2];

				//  System.out.println("splitString : " + splitString[i]);
				System.out.println("Change Date format lastseen Date: " + date_format_lastseen6);
				System.out.println("Image last seen Date: " + imageDate6);
			}

			Assert.assertEquals(imageDate6, date_format_lastseen6);
			Reporter.log("<B><font color = 'blue'> ==> -</font> Both Last Seen Date are Matching in Assert Pass :"+imageDate6+ " == " +date_format_lastseen6);
			System.out.println("Both Last Seen Date are Matching in Assert Pass :"+imageDate6+ " == " +date_format_lastseen6);
		}
		catch (Exception e) 
		{
			// TODO: handle exception
			System.out.println("Image is not able:   Opp!Looks like we don't have data for this search criteria yet.\r\n"
					+ "But don't worry, Spidey is on the crawl now and it will scrape ads for this search criteria for you ASAP.");

			Reporter.log("<B><font color = 'orange'> Step7 -</font> Image is not able:   Opp!Looks like we don't have data for this search criteria yet."
					+ "But don't worry, Spidey is on the crawl now and it will scrape ads for this search criteria for you ASAP.");
		}

		try {
			Reporter.log(" ");
			Reporter.log("<B><font color ='red'> 7 Ad -</font>  ");
			System.out.println("");
			System.out.println("7 Ads");
			String imageDate7=date7.getText();
			Reporter.log("<B><font color = 'blue'> ==> -</font> Image Date is :"+imageDate7);
			System.out.println("Current Image Date: "+imageDate7);

			String lastimageDate7= null;
			helper.waitFor(ShowAnalytics7);
			helper.highLightElement(driver, ShowAnalytics7);
			helper.jsScrollintoview(ShowAnalytics7);
			String linkText7 = ShowAnalytics7.getAttribute("href");
			String idString7= null;
			String[] splitStringid7 = linkText7.split("/");
			for(int i=0;i<splitStringid7.length;i++) {
				String actualDate7=splitStringid7[splitStringid7.length-1]; 
				System.out.println(" ID of the  Ad =" + actualDate7);
				Reporter.log("<B><font color = 'blue'> ==> -</font> ID of the  Ad = " + actualDate7);
				break;
			}
			ShowAnalytics7.click();
			Reporter.log("<B><font color = 'blue'> ==> -</font> Clicked On Show Analytics Icon");
			helper.waitForPageToLoad();

			String parent7=driver.getWindowHandle();
			Set<String>s7=driver.getWindowHandles();

			Iterator<String> I7= s7.iterator();
			while(I7.hasNext())
			{
				String child_window7=I7.next();
				if(!parent7.equals(child_window7))
				{
					driver.switchTo().window(child_window7);
					helper.waitForPageToLoad();
					System.out.println(driver.switchTo().window(child_window7).getTitle());
					helper.Scrollintoview(lastSeen);
					lastimageDate7 = lastSeen.getText();
					System.out.println("Analytics Image Last Seen Date: "+lastimageDate7);
					Reporter.log("<B><font color = 'blue'> ==> -</font> Image Date of Last Seen is :"+lastimageDate7);
					driver.close();
				}
			}
			driver.switchTo().window(parent7);
			String date_format_lastseen7 = null;

			String[] splitString7 = lastimageDate7.split(" ");
			for(int i=0;i<splitString7.length-2;i++) {
				//    String actualDate=splitString[i]; 
				date_format_lastseen7= splitString7[i+1]+" "+ splitString7[i]+" " + splitString7[i+2];

				//  System.out.println("splitString : " + splitString[i]);
				System.out.println("Change Date format lastseen Date: " + date_format_lastseen7);
				System.out.println("Image last seen Date: " + imageDate7);
			}

			Assert.assertEquals(imageDate7, date_format_lastseen7);
			Reporter.log("<B><font color = 'blue'> ==> -</font> Both Last Seen Date are Matching in Assert Pass :"+imageDate7+ " == " +date_format_lastseen7);
			System.out.println("Both Last Seen Date are Matching in Assert Pass :"+imageDate7+ " == " +date_format_lastseen7);
		}
		catch (Exception e) 
		{
			// TODO: handle exception
			System.out.println("Image is not able: Oops! Looks like we don't have data for this search criteria yet.");

			Reporter.log("<B><font color = 'Red'> ==> -</font> Image is not able: Oops! Looks like we don't have data for this search criteria yet.");
		}

		try {
			Reporter.log(" ");
			Reporter.log("<B><font color ='red'> 8 Ad -</font>  ");
			System.out.println("");
			System.out.println("8 Ads");
			String imageDate8=date8.getText();
			Reporter.log("<B><font color = 'blue'> ==> -</font> Image Date is :"+imageDate8);
			System.out.println("Current Image Date: "+imageDate8);

			String lastimageDate8= null;
			helper.waitFor(ShowAnalytics8);
			helper.highLightElement(driver, ShowAnalytics8);
			helper.jsScrollintoview(ShowAnalytics8);
			String linkText8 = ShowAnalytics8.getAttribute("href");
			String idString8= null;
			String[] splitStringid8 = linkText8.split("/");
			for(int i=0;i<splitStringid8.length;i++) {
				String actualDate8=splitStringid8[splitStringid8.length-1]; 
				System.out.println(" ID of the  Ad =" + actualDate8);
				Reporter.log("<B><font color = 'blue'> ==> -</font> ID of the  Ad = " + actualDate8);
				break;
			}
			ShowAnalytics8.click();
			Reporter.log("<B><font color = 'blue'> ==> -</font> Clicked On Show Analytics Icon");
			helper.waitForPageToLoad();

			String parent8=driver.getWindowHandle();
			Set<String>s8=driver.getWindowHandles();

			Iterator<String> I8= s8.iterator();
			while(I8.hasNext())
			{
				String child_window8=I8.next();
				if(!parent8.equals(child_window8))
				{
					driver.switchTo().window(child_window8);
					helper.waitForPageToLoad();
					System.out.println(driver.switchTo().window(child_window8).getTitle());
					helper.Scrollintoview(lastSeen);
					lastimageDate8 = lastSeen.getText();
					System.out.println("Analytics Image Last Seen Date: "+lastimageDate8);
					Reporter.log("<B><font color = 'blue'> ==> -</font> Image Date of Last Seen is :"+lastimageDate8);
					driver.close();
				}
			}
			driver.switchTo().window(parent8);
			String date_format_lastseen8 = null;

			String[] splitString8 = lastimageDate8.split(" ");
			for(int i=0;i<splitString8.length-2;i++) {
				//    String actualDate=splitString[i]; 
				date_format_lastseen8= splitString8[i+1]+" "+ splitString8[i]+" " + splitString8[i+2];

				//  System.out.println("splitString : " + splitString[i]);
				System.out.println("Change Date format lastseen Date: " + date_format_lastseen8);
				System.out.println("Image last seen Date: " + imageDate8);
			}

			Assert.assertEquals(imageDate8, date_format_lastseen8);
			Reporter.log("<B><font color = 'blue'> ==> -</font> Both Last Seen Date are Matching in Assert Pass :"+imageDate8+ " == " +date_format_lastseen8);
			System.out.println("Both Last Seen Date are Matching in Assert Pass :"+imageDate8+ " == " +date_format_lastseen8);
		}
		catch (Exception e) 
		{
			// TODO: handle exception
			System.out.println("Image is not able: Oops! Looks like we don't have data for this search criteria yet.");

			Reporter.log("<B><font color = 'Red'> ==> -</font> Image is not able: Oops! Looks like we don't have data for this search criteria yet.");
		}

		try {
			Reporter.log(" ");
			Reporter.log("<B><font color ='red'> 9 Ad -</font>  ");
			System.out.println("");
			System.out.println("9 Ads");
			String imageDate9=date9.getText();
			Reporter.log("<B><font color = 'blue'> ==> -</font> Image Date is :"+imageDate9);
			System.out.println("Current Image Date: "+imageDate9);

			String lastimageDate9= null;
			helper.waitFor(ShowAnalytics9);
			helper.highLightElement(driver, ShowAnalytics9);
			helper.jsScrollintoview(ShowAnalytics9);
			String linkText9 = ShowAnalytics9.getAttribute("href");
			String idString9= null;
			String[] splitStringid9 = linkText9.split("/");
			for(int i=0;i<splitStringid9.length;i++) {
				String actualDate9=splitStringid9[splitStringid9.length-1]; 
				System.out.println(" ID of the  Ad =" + actualDate9);
				Reporter.log("<B><font color = 'blue'> ==> -</font> ID of the  Ad = " + actualDate9);
				break;
			}
			ShowAnalytics9.click();
			Reporter.log("<B><font color = 'blue'> ==> -</font> Clicked On Show Analytics Icon");
			helper.waitForPageToLoad();

			String parent9=driver.getWindowHandle();
			Set<String>s9=driver.getWindowHandles();

			Iterator<String> I9= s9.iterator();
			while(I9.hasNext())
			{
				String child_window9=I9.next();
				if(!parent9.equals(child_window9))
				{
					driver.switchTo().window(child_window9);
					helper.waitForPageToLoad();
					System.out.println(driver.switchTo().window(child_window9).getTitle());
					helper.Scrollintoview(lastSeen);
					lastimageDate9 = lastSeen.getText();
					System.out.println("Analytics Image Last Seen Date: "+lastimageDate9);
					Reporter.log("<B><font color = 'blue'> ==> -</font> Image Date of Last Seen is :"+lastimageDate9);
					driver.close();
				}
			}
			driver.switchTo().window(parent9);
			String date_format_lastseen9 = null;

			String[] splitString9 = lastimageDate9.split(" ");
			for(int i=0;i<splitString9.length-2;i++) {
				//    String actualDate=splitString[i]; 
				date_format_lastseen9= splitString9[i+1]+" "+ splitString9[i]+" " + splitString9[i+2];

				//  System.out.println("splitString : " + splitString[i]);
				System.out.println("Change Date format lastseen Date: " + date_format_lastseen9);
				System.out.println("Image last seen Date: " + imageDate9);
			}

			Assert.assertEquals(imageDate9, date_format_lastseen9);
			Reporter.log("<B><font color = 'blue'> ==> -</font> Both Last Seen Date are Matching in Assert Pass :"+imageDate9+ " == " +date_format_lastseen9);
			System.out.println("Both Last Seen Date are Matching in Assert Pass :"+imageDate9+ " == " +date_format_lastseen9);
		}
		catch (Exception e) 
		{
			// TODO: handle exception
			System.out.println("Image is not able: Oops! Looks like we don't have data for this search criteria yet.");

			Reporter.log("<B><font color = 'Red'> ==> -</font> Image is not able: Oops! Looks like we don't have data for this search criteria yet.");
		}

		try {
			Reporter.log(" ");
			Reporter.log("<B><font color ='red'> 10 Ad -</font>  ");
			System.out.println("");
			System.out.println("10 Ads");
			String imageDate10=date10.getText();
			Reporter.log("<B><font color = 'blue'> ==> -</font> Image Date is :"+imageDate10);
			System.out.println("Current Image Date: "+imageDate10);

			String lastimageDate10= null;
			helper.waitFor(ShowAnalytics10);
			helper.highLightElement(driver, ShowAnalytics10);
			helper.jsScrollintoview(ShowAnalytics10);
			String linkText10 = ShowAnalytics10.getAttribute("href");
			String idString10= null;
			String[] splitStringid10 = linkText10.split("/");
			for(int i=0;i<splitStringid10.length;i++) {
				String actualDate10=splitStringid10[splitStringid10.length-1]; 
				System.out.println(" ID of the  Ad =" + actualDate10);
				Reporter.log("<B><font color = 'blue'> ==> -</font> ID of the  Ad = " + actualDate10);
				break;
			}
			ShowAnalytics10.click();
			Reporter.log("<B><font color = 'blue'> ==> -</font> Clicked On Show Analytics Icon");
			helper.waitForPageToLoad();

			String parent10=driver.getWindowHandle();
			Set<String>s10=driver.getWindowHandles();

			Iterator<String> I10= s10.iterator();
			while(I10.hasNext())
			{
				String child_window10=I10.next();
				if(!parent10.equals(child_window10))
				{
					driver.switchTo().window(child_window10);
					helper.waitForPageToLoad();
					System.out.println(driver.switchTo().window(child_window10).getTitle());
					helper.Scrollintoview(lastSeen);
					lastimageDate10 = lastSeen.getText();
					System.out.println("Analytics Image Last Seen Date: "+lastimageDate10);
					Reporter.log("<B><font color = 'blue'> ==> -</font> Image Date of Last Seen is :"+lastimageDate10);
					driver.close();
				}
			}
			driver.switchTo().window(parent10);
			String date_format_lastseen10 = null;

			String[] splitString10 = lastimageDate10.split(" ");
			for(int i=0;i<splitString10.length-2;i++) {
				//    String actualDate=splitString[i]; 
				date_format_lastseen10= splitString10[i+1]+" "+ splitString10[i]+" " + splitString10[i+2];

				//  System.out.println("splitString : " + splitString[i]);
				System.out.println("Change Date format lastseen Date: " + date_format_lastseen10);
				System.out.println("Image last seen Date: " + imageDate10);
			}

			Assert.assertEquals(imageDate10, date_format_lastseen10);
			Reporter.log("<B><font color = 'blue'> ==> -</font> Both Last Seen Date are Matching in Assert Pass :"+imageDate10+ " == " +date_format_lastseen10);
			System.out.println("Both Last Seen Date are Matching in Assert Pass :"+imageDate10+ " == " +date_format_lastseen10);
		}
		catch (Exception e) 
		{
			// TODO: handle exception
			System.out.println("Image is not able: Oops! Looks like we don't have data for this search criteria yet.");

			Reporter.log("<B><font color = 'Red'> ==> -</font> Image is not able: Oops! Looks like we don't have data for this search criteria yet.");
		}	

		try {
			Reporter.log(" ");
			Reporter.log("<B><font color ='red'> 11 Ad -</font>  ");
			System.out.println("");
			System.out.println("11 Ads");
			String imageDate11=date11.getText();
			Reporter.log("<B><font color = 'blue'> ==> -</font> Image Date is :"+imageDate11);
			System.out.println("Current Image Date: "+imageDate11);

			String lastimageDate11= null;
			helper.waitFor(ShowAnalytics11);
			helper.highLightElement(driver, ShowAnalytics11);
			helper.jsScrollintoview(ShowAnalytics11);
			String linkText11 = ShowAnalytics11.getAttribute("href");
			String idString11= null;
			String[] splitStringid11= linkText11.split("/");
			for(int i=0;i<splitStringid11.length;i++) {
				String actualDate11=splitStringid11[splitStringid11.length-1]; 
				System.out.println(" ID of the  Ad =" + actualDate11);
				Reporter.log("<B><font color = 'blue'> ==> -</font> ID of the  Ad = " + actualDate11);
				break;
			}
			ShowAnalytics11.click();
			Reporter.log("<B><font color = 'blue'> ==> -</font> Clicked On Show Analytics Icon");
			helper.waitForPageToLoad();

			String parent11=driver.getWindowHandle();
			Set<String>s11=driver.getWindowHandles();

			Iterator<String> I11= s11.iterator();
			while(I11.hasNext())
			{
				String child_window11=I11.next();
				if(!parent11.equals(child_window11))
				{
					driver.switchTo().window(child_window11);
					helper.waitForPageToLoad();
					System.out.println(driver.switchTo().window(child_window11).getTitle());
					helper.Scrollintoview(lastSeen);
					lastimageDate11 = lastSeen.getText();
					System.out.println("Analytics Image Last Seen Date: "+lastimageDate11);
					Reporter.log("<B><font color = 'blue'> ==> -</font> Image Date of Last Seen is :"+lastimageDate11);
					driver.close();
				}
			}
			driver.switchTo().window(parent11);
			String date_format_lastseen11 = null;

			String[] splitString11 = lastimageDate11.split(" ");
			for(int i=0;i<splitString11.length-2;i++) {
				//    String actualDate=splitString[i]; 
				date_format_lastseen11= splitString11[i+1]+" "+ splitString11[i]+" " + splitString11[i+2];

				//  System.out.println("splitString : " + splitString[i]);
				System.out.println("Change Date format lastseen Date: " + date_format_lastseen11);
				System.out.println("Image last seen Date: " + imageDate11);
			}

			Assert.assertEquals(imageDate11, date_format_lastseen11);
			Reporter.log("<B><font color = 'blue'> ==> -</font> Both Last Seen Date are Matching in Assert Pass :"+imageDate11+ " == " +date_format_lastseen11);
			System.out.println("Both Last Seen Date are Matching in Assert Pass :"+imageDate11+ " == " +date_format_lastseen11);
		}
		catch (Exception e) 
		{
			// TODO: handle exception
			System.out.println("Image is not able: Oops! Looks like we don't have data for this search criteria yet.");

			Reporter.log("<B><font color = 'Red'> ==> -</font> Image is not able: Oops! Looks like we don't have data for this search criteria yet.");
		}	


		try {
			Reporter.log(" ");
			Reporter.log("<B><font color ='red'> 12 Ad -</font>  ");
			System.out.println("");
			System.out.println("12 Ads");
			String imageDate12=date12.getText();
			Reporter.log("<B><font color = 'blue'> ==> -</font> Image Date is :"+imageDate12);
			System.out.println("Current Image Date: "+imageDate12);

			String lastimageDate12= null;
			helper.waitFor(ShowAnalytics12);
			helper.highLightElement(driver, ShowAnalytics12);
			helper.jsScrollintoview(ShowAnalytics12);
			String linkText12 = ShowAnalytics12.getAttribute("href");
			String idString12= null;
			String[] splitStringid12 = linkText12.split("/");
			for(int i=0;i<splitStringid12.length;i++) {
				String actualDate12=splitStringid12[splitStringid12.length-1]; 
				System.out.println(" ID of the  Ad =" + actualDate12);
				Reporter.log("<B><font color = 'blue'> ==> -</font> ID of the  Ad = " + actualDate12);
				break;
			}
			ShowAnalytics12.click();
			Reporter.log("<B><font color = 'blue'> ==> -</font> Clicked On Show Analytics Icon");
			helper.waitForPageToLoad();

			String parent12=driver.getWindowHandle();
			Set<String>s12=driver.getWindowHandles();

			Iterator<String> I12= s12.iterator();
			while(I12.hasNext())
			{
				String child_window12=I12.next();
				if(!parent12.equals(child_window12))
				{
					driver.switchTo().window(child_window12);
					helper.waitForPageToLoad();
					System.out.println(driver.switchTo().window(child_window12).getTitle());
					helper.Scrollintoview(lastSeen);
					lastimageDate12 = lastSeen.getText();
					System.out.println("Analytics Image Last Seen Date: "+lastimageDate12);
					Reporter.log("<B><font color = 'blue'> ==> -</font> Image Date of Last Seen is :"+lastimageDate12);
					driver.close();
				}
			}
			driver.switchTo().window(parent12);
			String date_format_lastseen12 = null;

			String[] splitString12 = lastimageDate12.split(" ");
			for(int i=0;i<splitString12.length-2;i++) {
				//    String actualDate=splitString[i]; 
				date_format_lastseen12= splitString12[i+1]+" "+ splitString12[i]+" " + splitString12[i+2];

				//  System.out.println("splitString : " + splitString[i]);
				System.out.println("Change Date format lastseen Date: " + date_format_lastseen12);
				System.out.println("Image last seen Date: " + imageDate12);
			}

			Assert.assertEquals(imageDate12, date_format_lastseen12);
			Reporter.log("<B><font color = 'blue'> ==> -</font> Both Last Seen Date are Matching in Assert Pass :"+imageDate12+ " == " +date_format_lastseen12);
			System.out.println("Both Last Seen Date are Matching in Assert Pass :"+imageDate12+ " == " +date_format_lastseen12);
		}
		catch (Exception e) 
		{
			// TODO: handle exception
			System.out.println("Image is not able: Oops! Looks like we don't have data for this search criteria yet.");

			Reporter.log("<B><font color = 'Red'> ==> -</font> Image is not able: Oops! Looks like we don't have data for this search criteria yet.");
		}

		try {
			Reporter.log(" ");
			Reporter.log("<B><font color ='red'> 13 Ad -</font>  ");
			System.out.println("");
			System.out.println("13 Ads");
			String imageDate13=date13.getText();
			Reporter.log("<B><font color = 'blue'> ==> -</font> Image Date is :"+imageDate13);
			System.out.println("Current Image Date: "+imageDate13);

			String lastimageDate13= null;
			helper.waitFor(ShowAnalytics13);
			helper.highLightElement(driver, ShowAnalytics13);
			helper.jsScrollintoview(ShowAnalytics13);
			String linkText13 = ShowAnalytics13.getAttribute("href");
			helper.getAdID(linkText13);

			ShowAnalytics13.click();
			Reporter.log("<B><font color = 'blue'> ==> -</font> Clicked On Show Analytics Icon");
			helper.waitForPageToLoad();

			String parent13=driver.getWindowHandle();
			Set<String>s13=driver.getWindowHandles();

			Iterator<String> I13= s13.iterator();
			while(I13.hasNext())
			{
				String child_window13=I13.next();
				if(!parent13.equals(child_window13))
				{
					driver.switchTo().window(child_window13);
					helper.waitForPageToLoad();
					System.out.println(driver.switchTo().window(child_window13).getTitle());
					helper.Scrollintoview(lastSeen);
					lastimageDate13 = lastSeen.getText();
					System.out.println("Analytics Image Last Seen Date: "+lastimageDate13);
					Reporter.log("<B><font color = 'blue'> ==> -</font> Image Date of Last Seen is :"+lastimageDate13);
					driver.close();
				}
			}
			driver.switchTo().window(parent13);

			helper.getLastseenDate(lastimageDate13, imageDate13);

			/*	String date_format_lastseen13 = null;

			String[] splitString13 = lastimageDate13.split(" ");
			for(int i=0;i<splitString13.length-2;i++) {
				//    String actualDate=splitString[i]; 
				date_format_lastseen13= splitString13[i+1]+" "+ splitString13[i]+" " + splitString13[i+2];

				//  System.out.println("splitString : " + splitString[i]);
				System.out.println("Change Date format lastseen Date: " + date_format_lastseen13);
				System.out.println("Image last seen Date: " + imageDate13);
			}

			Assert.assertEquals(imageDate13, date_format_lastseen13);
			Reporter.log("<B><font color = 'blue'> ==> -</font> Both Last Seen Date are Matching in Assert Pass :"+imageDate13+ " == " +date_format_lastseen13);
			System.out.println("Both Last Seen Date are Matching in Assert Pass :"+imageDate13+ " == " +date_format_lastseen13);*/
		}
		catch (Exception e) 
		{
			// TODO: handle exception
			System.out.println("Image is not able: Oops! Looks like we don't have data for this search criteria yet.");

			Reporter.log("<B><font color = 'Red'> ==> -</font> Image is not able: Oops! Looks like we don't have data for this search criteria yet.");
		}

		try {
			Reporter.log(" ");
			Reporter.log("<B><font color ='red'> 14 Ad -</font>  ");
			System.out.println("");
			System.out.println("14 Ads");
			String imageDate14=date14.getText();
			Reporter.log("<B><font color = 'blue'> ==> -</font> Image Date is :"+imageDate14);
			System.out.println("Current Image Date: "+imageDate14);

			String lastimageDate14= null;
			helper.waitFor(ShowAnalytics14);
			helper.highLightElement(driver, ShowAnalytics14);
			helper.jsScrollintoview(ShowAnalytics14);
			String linkText14 = ShowAnalytics14.getAttribute("href");
			String idString14= null;
			String[] splitStringid14 = linkText14.split("/");
			for(int i=0;i<splitStringid14.length;i++) {
				String actualDate14=splitStringid14[splitStringid14.length-1]; 
				System.out.println(" ID of the  Ad =" + actualDate14);
				Reporter.log("<B><font color = 'blue'> ==> -</font> ID of the  Ad = " + actualDate14);
				break;
			}
			ShowAnalytics14.click();
			Reporter.log("<B><font color = 'blue'> ==> -</font> Clicked On Show Analytics Icon");
			helper.waitForPageToLoad();

			String parent14=driver.getWindowHandle();
			Set<String>s14=driver.getWindowHandles();

			Iterator<String> I14= s14.iterator();
			while(I14.hasNext())
			{
				String child_window14=I14.next();
				if(!parent14.equals(child_window14))
				{
					driver.switchTo().window(child_window14);
					helper.waitForPageToLoad();
					System.out.println(driver.switchTo().window(child_window14).getTitle());
					helper.Scrollintoview(lastSeen);
					lastimageDate14 = lastSeen.getText();
					System.out.println("Analytics Image Last Seen Date: "+lastimageDate14);
					Reporter.log("<B><font color = 'blue'> ==> -</font> Image Date of Last Seen is :"+lastimageDate14);
					driver.close();
				}
			}
			driver.switchTo().window(parent14);
			String date_format_lastseen14 = null;

			String[] splitString14 = lastimageDate14.split(" ");
			for(int i=0;i<splitString14.length-2;i++) {
				//    String actualDate=splitString[i]; 
				date_format_lastseen14= splitString14[i+1]+" "+ splitString14[i]+" " + splitString14[i+2];

				//  System.out.println("splitString : " + splitString[i]);
				System.out.println("Change Date format lastseen Date: " + date_format_lastseen14);
				System.out.println("Image last seen Date: " + imageDate14);
			}

			Assert.assertEquals(imageDate14, date_format_lastseen14);
			Reporter.log("<B><font color = 'blue'> ==> -</font> Both Last Seen Date are Matching in Assert Pass :"+imageDate14+ " == " +date_format_lastseen14);
			System.out.println("Both Last Seen Date are Matching in Assert Pass :"+imageDate14+ " == " +date_format_lastseen14);
		}
		catch (Exception e) 
		{
			// TODO: handle exception
			System.out.println("Image is not able: Oops! Looks like we don't have data for this search criteria yet.");

			Reporter.log("<B><font color = 'Red'> ==> -</font> Image is not able: Oops! Looks like we don't have data for this search criteria yet.");
		}

		try {
			Reporter.log(" ");
			Reporter.log("<B><font color ='red'> 15 Ad -</font>  ");
			System.out.println("");
			System.out.println("15 Ads");
			String imageDate15=date15.getText();
			Reporter.log("<B><font color = 'blue'> ==> -</font> Image Date is :"+imageDate15);
			System.out.println("Current Image Date: "+imageDate15);

			String lastimageDate15= null;
			helper.waitFor(ShowAnalytics15);
			helper.highLightElement(driver, ShowAnalytics15);
			helper.jsScrollintoview(ShowAnalytics15);
			String linkText15 = ShowAnalytics15.getAttribute("href");
			String idString15= null;
			String[] splitStringid15 = linkText15.split("/");
			for(int i=0;i<splitStringid15.length;i++) {
				String actualDate15=splitStringid15[splitStringid15.length-1]; 
				System.out.println(" ID of the  Ad =" + actualDate15);
				Reporter.log("<B><font color = 'blue'> ==> -</font> ID of the  Ad = " + actualDate15);
				break;
			}
			ShowAnalytics15.click();
			Reporter.log("<B><font color = 'blue'> ==> -</font> Clicked On Show Analytics Icon");
			helper.waitForPageToLoad();

			String parent15=driver.getWindowHandle();
			Set<String>s15=driver.getWindowHandles();

			Iterator<String> I15= s15.iterator();
			while(I15.hasNext())
			{
				String child_window15=I15.next();
				if(!parent15.equals(child_window15))
				{
					driver.switchTo().window(child_window15);
					helper.waitForPageToLoad();
					System.out.println(driver.switchTo().window(child_window15).getTitle());
					helper.Scrollintoview(lastSeen);
					lastimageDate15 = lastSeen.getText();
					System.out.println("Analytics Image Last Seen Date: "+lastimageDate15);
					Reporter.log("<B><font color = 'blue'> ==> -</font> Image Date of Last Seen is :"+lastimageDate15);
					driver.close();
				}
			}
			driver.switchTo().window(parent15);
			String date_format_lastseen15 = null;

			String[] splitString15 = lastimageDate15.split(" ");
			for(int i=0;i<splitString15.length-2;i++) {
				//    String actualDate=splitString[i]; 
				date_format_lastseen15= splitString15[i+1]+" "+ splitString15[i]+" " + splitString15[i+2];

				//  System.out.println("splitString : " + splitString[i]);
				System.out.println("Change Date format lastseen Date: " + date_format_lastseen15);
				System.out.println("Image last seen Date: " + imageDate15);
			}

			Assert.assertEquals(imageDate15, date_format_lastseen15);
			Reporter.log("<B><font color = 'blue'> ==> -</font> Both Last Seen Date are Matching in Assert Pass :"+imageDate15+ " == " +date_format_lastseen15);
			System.out.println("Both Last Seen Date are Matching in Assert Pass :"+imageDate15+ " == " +date_format_lastseen15);
		}
		catch (Exception e) 
		{
			// TODO: handle exception
			System.out.println("Image is not able: Oops! Looks like we don't have data for this search criteria yet.");

			Reporter.log("<B><font color = 'Red'> ==> -</font> Image is not able: Oops! Looks like we don't have data for this search criteria yet.");
		}

	}
}

