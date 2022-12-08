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
	
	@FindBy(xpath = "//th[@class='prev available']")
	WebElement Custom_Range_Next_Line;

	//	@FindBy(xpath = "(//td[@class='weekend available' and @data-title='r1c0'])[1]")
	@FindBy(xpath="//td[text()='1']")
	WebElement post_date_Between_Start_range1;

	//	@FindBy(xpath = "//td[@class='available in-range' and @data-title='r4c3' and text()='26']")
	@FindBy(xpath="//td[text()='15']")
	WebElement post_date_Between_end_range2;

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



	public void FacebookPage() throws Exception
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
		helper.jsScrollintoview(SortBy_Newest);
		SortBy_Newest.click();
		Reporter.log("<B><font color = 'orange'> Step2 -</font> Clicked On SortBy Newest Icon");

		helper.waitFor(searchButton);
		helper.highLightElement(driver, searchButton);
		searchButton.click();
		Reporter.log("<B><font color = 'orange'> Step3 -</font> Clicked On search Button Icon");
		helper.waitForPageToLoad();

	}

	public void PostDateBetween_All() throws InterruptedException
	{

		System.out.println();
		System.out.println("-ShortBy Newest -Ad Post Date Between:");
		Reporter.log("<B><font color = 'green'>  -ShortBy Newest -Post Date Between All Step will Start from here  </font> ");
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
		helper.Scrollintoview(searchButton);
		searchButton.click();
		Reporter.log("<B><font color = 'orange'> Step6 -</font> Clicked On Search Button Icon");
		helper.waitForPageToLoad();

		String totaladscount=totaladscount_ad.getText();
		System.out.println("Totaladscount: "+totaladscount);
		Reporter.log("<B><font color = 'orange'> Step7 -</font>  Total Ad Count is :" +totaladscount);


		try {
			String lastimageDate1=null;
			Reporter.log(" ");
			Reporter.log("<B><font color ='red'> 1 Ad -</font>  ");
			System.out.println("");
			System.out.println("1 Ads");

			Reporter.log("<B><font color = 'blue'> ==> -</font> Ads Caputure Image Date :");
			helper.Scrollintoview(date1);
			String imageDate1=date1.getText();
			Reporter.log("<B><font color = 'blue'> ==> -</font> Image Date is :"+imageDate1);
			System.out.println("Current Image Date: "+imageDate1);

			helper.waitFor(ShowAnalytics1);
			helper.highLightElement(driver, ShowAnalytics1);
			helper.Scrollintoview(ShowAnalytics1);
			String linkText1 = ShowAnalytics1.getAttribute("href");
			helper.getAdID(linkText1);
			ShowAnalytics1.click();
			Reporter.log("<B><font color = 'blue'> ==> -</font> Clicked On Show Analytics Icon");

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
					helper.Scrollintoview(postdate);
					String postdate1=postdate.getText();
					helper.Scrollintoview(lastSeen);
					lastimageDate1 = lastSeen.getText();
					System.out.println("Analytics Image Post Date: "+postdate1);
					Reporter.log("<B><font color = 'blue'> ==> -</font> Image Date of Post date is :"+postdate1);
					System.out.println("Analytics Image Last Seen Date: "+lastimageDate1);
					Reporter.log("<B><font color = 'blue'> ==> -</font> Image Date of Last Seen is :"+lastimageDate1);
					driver.close();
				}
			}

			driver.switchTo().window(parent);
			helper.getLastseenDate(lastimageDate1, imageDate1);
		}
		catch (Exception e)
		{
			// TODO: handle exception
			System.out.println("Image is not able: Oops! Looks like we don't have data for this search criteria yet.");

			Reporter.log("<B><font color = 'red'> ==> -</font> Image is not able: Oops! Looks like we don't have data for this search criteria yet.");
		}

		try {
			String lastimageDate2=null;
			Reporter.log(" ");
			Reporter.log("<B><font color ='red'> 2 Ad -</font>  ");
			System.out.println("");
			System.out.println("2 Ads");

			Reporter.log("<B><font color = 'blue'> ==> -</font> Ads Caputure Image Date :");
			helper.Scrollintoview(date2);
			String imageDate2=date2.getText();
			Reporter.log("<B><font color = 'blue'> ==> -</font> Image Date is :"+imageDate2);
			System.out.println("Current Image Date: "+imageDate2);

			helper.waitFor(ShowAnalytics2);
			helper.highLightElement(driver, ShowAnalytics2);
			helper.Scrollintoview(ShowAnalytics2);
			String linkText2 = ShowAnalytics2.getAttribute("href");
			helper.getAdID(linkText2);
			ShowAnalytics2.click();
			Reporter.log("<B><font color = 'blue'> ==> -</font> Clicked On Show Analytics Icon");

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
					helper.Scrollintoview(postdate);
					String postdate2=postdate.getText();
					helper.Scrollintoview(lastSeen);
					lastimageDate2 = lastSeen.getText();
					System.out.println("Analytics Image Post Date: "+postdate2);
					Reporter.log("<B><font color = 'blue'> ==> -</font> Image Date of Post date is :"+postdate2);
					System.out.println("Analytics Image Last Seen Date: "+lastimageDate2);
					Reporter.log("<B><font color = 'blue'> ==> -</font> Image Date of Last Seen is :"+lastimageDate2);
					driver.close();
				}
			}

			driver.switchTo().window(parent);
			helper.getLastseenDate(lastimageDate2, imageDate2);
		}
		catch (Exception e)
		{
			// TODO: handle exception
			System.out.println("Image is not able: Oops! Looks like we don't have data for this search criteria yet.");

			Reporter.log("<B><font color = 'red'> ==> -</font> Image is not able: Oops! Looks like we don't have data for this search criteria yet.");
		}	


		try {
			String lastimageDate3=null;
			Reporter.log(" ");
			Reporter.log("<B><font color ='red'> 3 Ad -</font>  ");
			System.out.println("");
			System.out.println("3 Ads");

			Reporter.log("<B><font color = 'blue'> ==> -</font> Ads Caputure Image Date :");
			helper.Scrollintoview(date3);
			String imageDate3=date3.getText();
			Reporter.log("<B><font color = 'blue'> ==> -</font> Image Date is :"+imageDate3);
			System.out.println("Current Image Date: "+imageDate3);

			helper.waitFor(ShowAnalytics3);
			helper.highLightElement(driver, ShowAnalytics3);
			helper.Scrollintoview(ShowAnalytics3);
			String linkText3 = ShowAnalytics3.getAttribute("href");
			helper.getAdID(linkText3);
			ShowAnalytics3.click();
			Reporter.log("<B><font color = 'blue'> ==> -</font> Clicked On Show Analytics Icon");

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
					helper.Scrollintoview(postdate);
					String postdate3=postdate.getText();
					helper.Scrollintoview(lastSeen);
					lastimageDate3= lastSeen.getText();
					System.out.println("Analytics Image Post Date: "+postdate3);
					Reporter.log("<B><font color = 'blue'> ==> -</font> Image Date of Post date is :"+postdate3);
					System.out.println("Analytics Image Last Seen Date: "+lastimageDate3);
					Reporter.log("<B><font color = 'blue'> ==> -</font> Image Date of Last Seen is :"+lastimageDate3);
					driver.close();
				}
			}

			driver.switchTo().window(parent);
			helper.getLastseenDate(lastimageDate3, imageDate3);
		}
		catch (Exception e)
		{
			// TODO: handle exception
			System.out.println("Image is not able: Oops! Looks like we don't have data for this search criteria yet.");

			Reporter.log("<B><font color = 'red'> ==> -</font> Image is not able: Oops! Looks like we don't have data for this search criteria yet.");
		}	


		try {
			String lastimageDate4=null;
			Reporter.log(" ");
			Reporter.log("<B><font color ='red'> 4 Ad -</font>  ");
			System.out.println("");
			System.out.println("4 Ads");

			Reporter.log("<B><font color = 'blue'> ==> -</font> Ads Caputure Image Date :");
			helper.Scrollintoview(date4);
			String imageDate4=date4.getText();
			Reporter.log("<B><font color = 'blue'> ==> -</font> Image Date is :"+imageDate4);
			System.out.println("Current Image Date: "+imageDate4);

			helper.waitFor(ShowAnalytics4);
			helper.highLightElement(driver, ShowAnalytics4);
			helper.Scrollintoview(ShowAnalytics4);
			String linkText4 = ShowAnalytics4.getAttribute("href");
			helper.getAdID(linkText4);
			ShowAnalytics4.click();
			Reporter.log("<B><font color = 'blue'> ==> -</font> Clicked On Show Analytics Icon");

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
					helper.Scrollintoview(postdate);
					String postdate4=postdate.getText();
					helper.Scrollintoview(lastSeen);
					lastimageDate4= lastSeen.getText();
					System.out.println("Analytics Image Post Date: "+postdate4);
					Reporter.log("<B><font color = 'blue'> ==> -</font> Image Date of Post date is :"+postdate4);
					System.out.println("Analytics Image Last Seen Date: "+lastimageDate4);
					Reporter.log("<B><font color = 'blue'> ==> -</font> Image Date of Last Seen is :"+lastimageDate4);
					driver.close();
				}
			}

			driver.switchTo().window(parent);
			helper.getLastseenDate(lastimageDate4, imageDate4);
		}
		catch (Exception e)
		{
			// TODO: handle exception
			System.out.println("Image is not able: Oops! Looks like we don't have data for this search criteria yet.");

			Reporter.log("<B><font color = 'red'> ==> -</font> Image is not able: Oops! Looks like we don't have data for this search criteria yet.");
		}	


		try {
			String lastimageDate5=null;
			Reporter.log(" ");
			Reporter.log("<B><font color ='red'> 5 Ad -</font>  ");
			System.out.println("");
			System.out.println("5 Ads");

			Reporter.log("<B><font color = 'blue'> ==> -</font> Ads Caputure Image Date :");
			helper.Scrollintoview(date5);
			String imageDate5=date5.getText();
			Reporter.log("<B><font color = 'blue'> ==> -</font> Image Date is :"+imageDate5);
			System.out.println("Current Image Date: "+imageDate5);

			helper.waitFor(ShowAnalytics5);
			helper.highLightElement(driver, ShowAnalytics5);
			helper.Scrollintoview(ShowAnalytics5);
			String linkText5 = ShowAnalytics5.getAttribute("href");
			helper.getAdID(linkText5);
			ShowAnalytics5.click();
			Reporter.log("<B><font color = 'blue'> ==> -</font> Clicked On Show Analytics Icon");

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
					helper.Scrollintoview(postdate);
					String postdate5=postdate.getText();
					helper.Scrollintoview(lastSeen);
					lastimageDate5= lastSeen.getText();
					System.out.println("Analytics Image Post Date: "+postdate5);
					Reporter.log("<B><font color = 'blue'> ==> -</font> Image Date of Post date is :"+postdate5);
					System.out.println("Analytics Image Last Seen Date: "+lastimageDate5);
					Reporter.log("<B><font color = 'blue'> ==> -</font> Image Date of Last Seen is :"+lastimageDate5);
					driver.close();
				}
			}

			driver.switchTo().window(parent);
			helper.getLastseenDate(lastimageDate5, imageDate5);
		}
		catch (Exception e)
		{
			// TODO: handle exception
			System.out.println("Image is not able: Oops! Looks like we don't have data for this search criteria yet.");

			Reporter.log("<B><font color = 'red'> ==> -</font> Image is not able: Oops! Looks like we don't have data for this search criteria yet.");
		}	

		try {
			String lastimageDate6=null;
			Reporter.log(" ");
			Reporter.log("<B><font color ='red'> 6 Ad -</font>  ");
			System.out.println("");
			System.out.println("6 Ads");

			Reporter.log("<B><font color = 'blue'> ==> -</font> Ads Caputure Image Date :");
			helper.Scrollintoview(date6);
			String imageDate6=date6.getText();
			Reporter.log("<B><font color = 'blue'> ==> -</font> Image Date is :"+imageDate6);
			System.out.println("Current Image Date: "+imageDate6);

			helper.waitFor(ShowAnalytics6);
			helper.highLightElement(driver, ShowAnalytics6);
			helper.Scrollintoview(ShowAnalytics6);
			String linkText6 = ShowAnalytics6.getAttribute("href");
			helper.getAdID(linkText6);
			ShowAnalytics6.click();
			Reporter.log("<B><font color = 'blue'> ==> -</font> Clicked On Show Analytics Icon");

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
					helper.Scrollintoview(postdate);
					String postdate6=postdate.getText();
					helper.Scrollintoview(lastSeen);
					lastimageDate6= lastSeen.getText();
					System.out.println("Analytics Image Post Date: "+postdate6);
					Reporter.log("<B><font color = 'blue'> ==> -</font> Image Date of Post date is :"+postdate6);
					System.out.println("Analytics Image Last Seen Date: "+lastimageDate6);
					Reporter.log("<B><font color = 'blue'> ==> -</font> Image Date of Last Seen is :"+lastimageDate6);
					driver.close();
				}
			}

			driver.switchTo().window(parent);
			helper.getLastseenDate(lastimageDate6, imageDate6);
		}
		catch (Exception e)
		{
			// TODO: handle exception
			System.out.println("Image is not able: Oops! Looks like we don't have data for this search criteria yet.");

			Reporter.log("<B><font color = 'red'> ==> -</font> Image is not able: Oops! Looks like we don't have data for this search criteria yet.");
		}

		try {
			String lastimageDate7=null;
			Reporter.log(" ");
			Reporter.log("<B><font color ='red'> 7 Ad -</font>  ");
			System.out.println("");
			System.out.println("7 Ads");

			Reporter.log("<B><font color = 'blue'> ==> -</font> Ads Caputure Image Date :");
			helper.Scrollintoview(date7);
			String imageDate7=date7.getText();
			Reporter.log("<B><font color = 'blue'> ==> -</font> Image Date is :"+imageDate7);
			System.out.println("Current Image Date: "+imageDate7);

			helper.waitFor(ShowAnalytics7);
			helper.highLightElement(driver, ShowAnalytics7);
			helper.Scrollintoview(ShowAnalytics7);
			String linkText7 = ShowAnalytics7.getAttribute("href");
			helper.getAdID(linkText7);
			ShowAnalytics7.click();
			Reporter.log("<B><font color = 'blue'> ==> -</font> Clicked On Show Analytics Icon");

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
					helper.Scrollintoview(postdate);
					String postdate7=postdate.getText();
					helper.Scrollintoview(lastSeen);
					lastimageDate7= lastSeen.getText();
					System.out.println("Analytics Image Post Date: "+postdate7);
					Reporter.log("<B><font color = 'blue'> ==> -</font> Image Date of Post date is :"+postdate7);
					System.out.println("Analytics Image Last Seen Date: "+lastimageDate7);
					Reporter.log("<B><font color = 'blue'> ==> -</font> Image Date of Last Seen is :"+lastimageDate7);
					driver.close();
				}
			}

			driver.switchTo().window(parent);
			helper.getLastseenDate(lastimageDate7, imageDate7);
		}
		catch (Exception e)
		{
			// TODO: handle exception
			System.out.println("Image is not able: Oops! Looks like we don't have data for this search criteria yet.");

			Reporter.log("<B><font color = 'red'> ==> -</font> Image is not able: Oops! Looks like we don't have data for this search criteria yet.");
		}	

		try {
			String lastimageDate8=null;
			Reporter.log(" ");
			Reporter.log("<B><font color ='red'> 8 Ad -</font>  ");
			System.out.println("");
			System.out.println("8 Ads");

			Reporter.log("<B><font color = 'blue'> ==> -</font> Ads Caputure Image Date :");
			helper.Scrollintoview(date8);
			String imageDate8=date8.getText();
			Reporter.log("<B><font color = 'blue'> ==> -</font> Image Date is :"+imageDate8);
			System.out.println("Current Image Date: "+imageDate8);

			helper.waitFor(ShowAnalytics8);
			helper.highLightElement(driver, ShowAnalytics8);
			helper.Scrollintoview(ShowAnalytics8);
			String linkText8 = ShowAnalytics8.getAttribute("href");
			helper.getAdID(linkText8);
			ShowAnalytics8.click();
			Reporter.log("<B><font color = 'blue'> ==> -</font> Clicked On Show Analytics Icon");

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
					helper.Scrollintoview(postdate);
					String postdate8=postdate.getText();
					helper.Scrollintoview(lastSeen);
					lastimageDate8= lastSeen.getText();
					System.out.println("Analytics Image Post Date: "+postdate8);
					Reporter.log("<B><font color = 'blue'> ==> -</font> Image Date of Post date is :"+postdate8);
					System.out.println("Analytics Image Last Seen Date: "+lastimageDate8);
					Reporter.log("<B><font color = 'blue'> ==> -</font> Image Date of Last Seen is :"+lastimageDate8);
					driver.close();
				}
			}

			driver.switchTo().window(parent);
			helper.getLastseenDate(lastimageDate8, imageDate8);
		}
		catch (Exception e)
		{
			// TODO: handle exception
			System.out.println("Image is not able: Oops! Looks like we don't have data for this search criteria yet.");

			Reporter.log("<B><font color = 'red'> ==> -</font> Image is not able: Oops! Looks like we don't have data for this search criteria yet.");
		}	

		try {
			String lastimageDate9=null;
			Reporter.log(" ");
			Reporter.log("<B><font color ='red'> 9 Ad -</font>  ");
			System.out.println("");
			System.out.println("9 Ads");

			Reporter.log("<B><font color = 'blue'> ==> -</font> Ads Caputure Image Date :");
			helper.Scrollintoview(date9);
			String imageDate9=date9.getText();
			Reporter.log("<B><font color = 'blue'> ==> -</font> Image Date is :"+imageDate9);
			System.out.println("Current Image Date: "+imageDate9);

			helper.waitFor(ShowAnalytics9);
			helper.highLightElement(driver, ShowAnalytics9);
			helper.Scrollintoview(ShowAnalytics9);
			String linkText9 = ShowAnalytics9.getAttribute("href");
			helper.getAdID(linkText9);
			ShowAnalytics9.click();
			Reporter.log("<B><font color = 'blue'> ==> -</font> Clicked On Show Analytics Icon");

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
					helper.Scrollintoview(postdate);
					String postdate9=postdate.getText();
					helper.Scrollintoview(lastSeen);
					lastimageDate9= lastSeen.getText();
					System.out.println("Analytics Image Post Date: "+postdate9);
					Reporter.log("<B><font color = 'blue'> ==> -</font> Image Date of Post date is :"+postdate9);
					System.out.println("Analytics Image Last Seen Date: "+lastimageDate9);
					Reporter.log("<B><font color = 'blue'> ==> -</font> Image Date of Last Seen is :"+lastimageDate9);
					driver.close();
				}
			}

			driver.switchTo().window(parent);
			helper.getLastseenDate(lastimageDate9, imageDate9);
		}
		catch (Exception e)
		{
			// TODO: handle exception
			System.out.println("Image is not able: Oops! Looks like we don't have data for this search criteria yet.");

			Reporter.log("<B><font color = 'red'> ==> -</font> Image is not able: Oops! Looks like we don't have data for this search criteria yet.");
		}	



		try {
			String lastimageDate10=null;
			Reporter.log(" ");
			Reporter.log("<B><font color ='red'> 10 Ad -</font>  ");
			System.out.println("");
			System.out.println("10 Ads");

			Reporter.log("<B><font color = 'blue'> ==> -</font> Ads Caputure Image Date :");
			helper.Scrollintoview(date10);
			String imageDate10=date10.getText();
			Reporter.log("<B><font color = 'blue'> ==> -</font> Image Date is :"+imageDate10);
			System.out.println("Current Image Date: "+imageDate10);

			helper.waitFor(ShowAnalytics10);
			helper.highLightElement(driver, ShowAnalytics10);
			helper.Scrollintoview(ShowAnalytics10);
			String linkText10 = ShowAnalytics10.getAttribute("href");
			helper.getAdID(linkText10);
			ShowAnalytics10.click();
			Reporter.log("<B><font color = 'blue'> ==> -</font> Clicked On Show Analytics Icon");

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
					helper.Scrollintoview(postdate);
					String postdate10=postdate.getText();
					helper.Scrollintoview(lastSeen);
					lastimageDate10= lastSeen.getText();
					System.out.println("Analytics Image Post Date: "+postdate10);
					Reporter.log("<B><font color = 'blue'> ==> -</font> Image Date of Post date is :"+postdate10);
					System.out.println("Analytics Image Last Seen Date: "+lastimageDate10);
					Reporter.log("<B><font color = 'blue'> ==> -</font> Image Date of Last Seen is :"+lastimageDate10);
					driver.close();
				}
			}

			driver.switchTo().window(parent);
			helper.getLastseenDate(lastimageDate10, imageDate10);
		}
		catch (Exception e)
		{
			// TODO: handle exception
			System.out.println("Image is not able: Oops! Looks like we don't have data for this search criteria yet.");

			Reporter.log("<B><font color = 'red'> ==> -</font> Image is not able: Oops! Looks like we don't have data for this search criteria yet.");
		}	

		try {
			String lastimageDate11=null;
			Reporter.log(" ");
			Reporter.log("<B><font color ='red'> 11 Ad -</font>  ");
			System.out.println("");
			System.out.println("11 Ads");

			Reporter.log("<B><font color = 'blue'> ==> -</font> Ads Caputure Image Date :");
			helper.Scrollintoview(date11);
			String imageDate11=date11.getText();
			Reporter.log("<B><font color = 'blue'> ==> -</font> Image Date is :"+imageDate11);
			System.out.println("Current Image Date: "+imageDate11);

			helper.waitFor(ShowAnalytics11);
			helper.highLightElement(driver, ShowAnalytics11);
			helper.Scrollintoview(ShowAnalytics11);
			String linkText11 = ShowAnalytics11.getAttribute("href");
			helper.getAdID(linkText11);
			ShowAnalytics11.click();
			Reporter.log("<B><font color = 'blue'> ==> -</font> Clicked On Show Analytics Icon");

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
					helper.Scrollintoview(postdate);
					String postdate11=postdate.getText();
					helper.Scrollintoview(lastSeen);
					lastimageDate11= lastSeen.getText();
					System.out.println("Analytics Image Post Date: "+postdate11);
					Reporter.log("<B><font color = 'blue'> ==> -</font> Image Date of Post date is :"+postdate11);
					System.out.println("Analytics Image Last Seen Date: "+lastimageDate11);
					Reporter.log("<B><font color = 'blue'> ==> -</font> Image Date of Last Seen is :"+lastimageDate11);
					driver.close();
				}
			}

			driver.switchTo().window(parent);
			helper.getLastseenDate(lastimageDate11, imageDate11);
		}
		catch (Exception e)
		{
			// TODO: handle exception
			System.out.println("Image is not able: Oops! Looks like we don't have data for this search criteria yet.");

			Reporter.log("<B><font color = 'red'> ==> -</font> Image is not able: Oops! Looks like we don't have data for this search criteria yet.");
		}	

		try {
			String lastimageDate12=null;
			Reporter.log(" ");
			Reporter.log("<B><font color ='red'> 12 Ad -</font>  ");
			System.out.println("");
			System.out.println("12 Ads");

			Reporter.log("<B><font color = 'blue'> ==> -</font> Ads Caputure Image Date :");
			helper.Scrollintoview(date12);
			String imageDate12=date12.getText();
			Reporter.log("<B><font color = 'blue'> ==> -</font> Image Date is :"+imageDate12);
			System.out.println("Current Image Date: "+imageDate12);

			helper.waitFor(ShowAnalytics12);
			helper.highLightElement(driver, ShowAnalytics12);
			helper.Scrollintoview(ShowAnalytics12);
			String linkText12 = ShowAnalytics12.getAttribute("href");
			helper.getAdID(linkText12);
			ShowAnalytics12.click();
			Reporter.log("<B><font color = 'blue'> ==> -</font> Clicked On Show Analytics Icon");

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
					helper.Scrollintoview(postdate);
					String postdate12=postdate.getText();
					helper.Scrollintoview(lastSeen);
					lastimageDate12= lastSeen.getText();
					System.out.println("Analytics Image Post Date: "+postdate12);
					Reporter.log("<B><font color = 'blue'> ==> -</font> Image Date of Post date is :"+postdate12);
					System.out.println("Analytics Image Last Seen Date: "+lastimageDate12);
					Reporter.log("<B><font color = 'blue'> ==> -</font> Image Date of Last Seen is :"+lastimageDate12);
					driver.close();
				}
			}

			driver.switchTo().window(parent);
			helper.getLastseenDate(lastimageDate12, imageDate12);
		}
		catch (Exception e)
		{
			// TODO: handle exception
			System.out.println("Image is not able: Oops! Looks like we don't have data for this search criteria yet.");

			Reporter.log("<B><font color = 'red'> ==> -</font> Image is not able: Oops! Looks like we don't have data for this search criteria yet.");
		}	

		try {
			String lastimageDate13=null;
			Reporter.log(" ");
			Reporter.log("<B><font color ='red'> 13 Ad -</font>  ");
			System.out.println("");
			System.out.println("13 Ads");

			Reporter.log("<B><font color = 'blue'> ==> -</font> Ads Caputure Image Date :");
			helper.Scrollintoview(date13);
			String imageDate13=date13.getText();
			Reporter.log("<B><font color = 'blue'> ==> -</font> Image Date is :"+imageDate13);
			System.out.println("Current Image Date: "+imageDate13);

			helper.waitFor(ShowAnalytics13);
			helper.highLightElement(driver, ShowAnalytics13);
			helper.Scrollintoview(ShowAnalytics13);
			String linkText13 = ShowAnalytics13.getAttribute("href");
			helper.getAdID(linkText13);
			ShowAnalytics13.click();
			Reporter.log("<B><font color = 'blue'> ==> -</font> Clicked On Show Analytics Icon");

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
					helper.Scrollintoview(postdate);
					String postdate13=postdate.getText();
					helper.Scrollintoview(lastSeen);
					lastimageDate13= lastSeen.getText();
					System.out.println("Analytics Image Post Date: "+postdate13);
					Reporter.log("<B><font color = 'blue'> ==> -</font> Image Date of Post date is :"+postdate13);
					System.out.println("Analytics Image Last Seen Date: "+lastimageDate13);
					Reporter.log("<B><font color = 'blue'> ==> -</font> Image Date of Last Seen is :"+lastimageDate13);
					driver.close();
				}
			}

			driver.switchTo().window(parent);
			helper.getLastseenDate(lastimageDate13, imageDate13);
		}
		catch (Exception e)
		{
			// TODO: handle exception
			System.out.println("Image is not able: Oops! Looks like we don't have data for this search criteria yet.");

			Reporter.log("<B><font color = 'red'> ==> -</font> Image is not able: Oops! Looks like we don't have data for this search criteria yet.");
		}	

		try {
			String lastimageDate14=null;
			Reporter.log(" ");
			Reporter.log("<B><font color ='red'> 14 Ad -</font>  ");
			System.out.println("");
			System.out.println("14 Ads");

			Reporter.log("<B><font color = 'blue'> ==> -</font> Ads Caputure Image Date :");
			helper.Scrollintoview(date14);
			String imageDate14=date14.getText();
			Reporter.log("<B><font color = 'blue'> ==> -</font> Image Date is :"+imageDate14);
			System.out.println("Current Image Date: "+imageDate14);

			helper.waitFor(ShowAnalytics14);
			helper.highLightElement(driver, ShowAnalytics14);
			helper.Scrollintoview(ShowAnalytics14);
			String linkText14 = ShowAnalytics14.getAttribute("href");
			helper.getAdID(linkText14);
			ShowAnalytics14.click();
			Reporter.log("<B><font color = 'blue'> ==> -</font> Clicked On Show Analytics Icon");

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
					helper.Scrollintoview(postdate);
					String postdate14=postdate.getText();
					helper.Scrollintoview(lastSeen);
					lastimageDate14= lastSeen.getText();
					System.out.println("Analytics Image Post Date: "+postdate14);
					Reporter.log("<B><font color = 'blue'> ==> -</font> Image Date of Post date is :"+postdate14);
					System.out.println("Analytics Image Last Seen Date: "+lastimageDate14);
					Reporter.log("<B><font color = 'blue'> ==> -</font> Image Date of Last Seen is :"+lastimageDate14);
					driver.close();
				}
			}

			driver.switchTo().window(parent);
			helper.getLastseenDate(lastimageDate14, imageDate14);
		}
		catch (Exception e)
		{
			// TODO: handle exception
			System.out.println("Image is not able: Oops! Looks like we don't have data for this search criteria yet.");

			Reporter.log("<B><font color = 'red'> ==> -</font> Image is not able: Oops! Looks like we don't have data for this search criteria yet.");
		}	

		try {
			String lastimageDate15=null;
			Reporter.log(" ");
			Reporter.log("<B><font color ='red'> 15 Ad -</font>  ");
			System.out.println("");
			System.out.println("15 Ads");

			Reporter.log("<B><font color = 'blue'> ==> -</font> Ads Caputure Image Date :");
			helper.Scrollintoview(date15);
			String imageDate15=date15.getText();
			Reporter.log("<B><font color = 'blue'> ==> -</font> Image Date is :"+imageDate15);
			System.out.println("Current Image Date: "+imageDate15);

			helper.waitFor(ShowAnalytics15);
			helper.highLightElement(driver, ShowAnalytics15);
			helper.Scrollintoview(ShowAnalytics15);
			String linkText15 = ShowAnalytics15.getAttribute("href");
			helper.getAdID(linkText15);
			ShowAnalytics15.click();
			Reporter.log("<B><font color = 'blue'> ==> -</font> Clicked On Show Analytics Icon");

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
					helper.Scrollintoview(postdate);
					String postdate15=postdate.getText();
					helper.Scrollintoview(lastSeen);
					lastimageDate15= lastSeen.getText();
					System.out.println("Analytics Image Post Date: "+postdate15);
					Reporter.log("<B><font color = 'blue'> ==> -</font> Image Date of Post date is :"+postdate15);
					System.out.println("Analytics Image Last Seen Date: "+lastimageDate15);
					Reporter.log("<B><font color = 'blue'> ==> -</font> Image Date of Last Seen is :"+lastimageDate15);
					driver.close();
				}
			}

			driver.switchTo().window(parent);
			helper.getLastseenDate(lastimageDate15, imageDate15);
		}
		catch (Exception e)
		{
			// TODO: handle exception
			System.out.println("Image is not able: Oops! Looks like we don't have data for this search criteria yet.");

			Reporter.log("<B><font color = 'red'> ==> -</font> Image is not able: Oops! Looks like we don't have data for this search criteria yet.");
		}	


	}



	public void PostDateBetween_Today() throws InterruptedException
	{


		Reporter.log("       " );
		helper.waitForPageToLoad();
		System.out.println();
		System.out.println("-ShortBy Newest -Ad Post Date Between:");
		Reporter.log("<B><font color = 'green'>  -ShortBy Newest -Post Date Between Today Step will Start from here  </font> ");
		helper.waitFor(post_date_between_dropdown);
		helper.highLightElement(driver, post_date_between_dropdown);
		helper.jsScrollintoview(post_date_between_dropdown);
		post_date_between_dropdown.click();
		Reporter.log("<B><font color = 'orange'> Step4> -</font> Clicked On Post Date Between filter Icon");

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


		try 
		{
			String lastimageDate1 = null;
			Reporter.log(" ");
			Reporter.log("<B><font color ='red'> 1 Ad -</font>  ");
			System.out.println("");
			System.out.println("1 Ads");
			Reporter.log("<B><font color = 'blue'> ==> -</font> Ads Caputure Image Date :");
			helper.Scrollintoview(date1);
			String imageDate1=date1.getText();
			Reporter.log("<B><font color = 'blue'> ==> -</font> Image Date is :"+imageDate1);
			System.out.println("Current Image Date: "+imageDate1);
			helper.waitFor(ShowAnalytics1);
			helper.highLightElement(driver, ShowAnalytics1);
			helper.jsScrollintoview(ShowAnalytics1);
			String linkText1 = ShowAnalytics1.getAttribute("href");
			helper.getAdID(linkText1);
			ShowAnalytics1.click();
			Reporter.log("<B><font color = 'blue'> ==> -</font> Clicked On Show Analytics Icon");


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
					helper.Scrollintoview(postdate);
					String postdate1=postdate.getText();
					helper.Scrollintoview(lastSeen);
					lastimageDate1 = lastSeen.getText();
					System.out.println("Analytics Image Post Date: "+postdate1);
					Reporter.log("<B><font color = 'blue'> ==> -</font> Image Date of Post date is :"+postdate1);
					System.out.println("Analytics Image Last Seen Date: "+lastimageDate1);
					Reporter.log("<B><font color = 'blue'> ==> -</font> Image Date of Last Seen is :"+lastimageDate1);
					driver.close();
				}
			}

			driver.switchTo().window(parent);

			helper.getLastseenDate(lastimageDate1, imageDate1);
		}
		catch (Exception e)
		{
			// TODO: handle exception
			System.out.println("Image is not able: Oops! Looks like we don't have data for this search criteria yet.");

			Reporter.log("<B><font color = 'red'> ==> -</font> Image is not able: Oops! Looks like we don't have data for this search criteria yet.");
		}



		try {
			String lastimageDate2=null;
			Reporter.log(" ");
			Reporter.log("<B><font color ='red'> 2 Ad -</font>  ");
			System.out.println("");
			System.out.println("2 Ads");

			Reporter.log("<B><font color = 'blue'> ==> -</font> Ads Caputure Image Date :");
			helper.Scrollintoview(date2);
			String imageDate2=date2.getText();
			Reporter.log("<B><font color = 'blue'> ==> -</font> Image Date is :"+imageDate2);
			System.out.println("Current Image Date: "+imageDate2);

			helper.waitFor(ShowAnalytics2);
			helper.highLightElement(driver, ShowAnalytics2);
			helper.Scrollintoview(ShowAnalytics2);
			String linkText2 = ShowAnalytics2.getAttribute("href");
			helper.getAdID(linkText2);
			ShowAnalytics2.click();
			Reporter.log("<B><font color = 'blue'> ==> -</font> Clicked On Show Analytics Icon");

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
					helper.Scrollintoview(postdate);
					String postdate2=postdate.getText();
					helper.Scrollintoview(lastSeen);
					lastimageDate2 = lastSeen.getText();
					System.out.println("Analytics Image Post Date: "+postdate2);
					Reporter.log("<B><font color = 'blue'> ==> -</font> Image Date of Post date is :"+postdate2);
					System.out.println("Analytics Image Last Seen Date: "+lastimageDate2);
					Reporter.log("<B><font color = 'blue'> ==> -</font> Image Date of Last Seen is :"+lastimageDate2);
					driver.close();
				}
			}

			driver.switchTo().window(parent);
			helper.getLastseenDate(lastimageDate2, imageDate2);
		}
		catch (Exception e)
		{
			// TODO: handle exception
			System.out.println("Image is not able: Oops! Looks like we don't have data for this search criteria yet.");

			Reporter.log("<B><font color = 'red'> ==> -</font> Image is not able: Oops! Looks like we don't have data for this search criteria yet.");
		}	


		try {
			String lastimageDate3=null;
			Reporter.log(" ");
			Reporter.log("<B><font color ='red'> 3 Ad -</font>  ");
			System.out.println("");
			System.out.println("3 Ads");

			Reporter.log("<B><font color = 'blue'> ==> -</font> Ads Caputure Image Date :");
			helper.Scrollintoview(date3);
			String imageDate3=date3.getText();
			Reporter.log("<B><font color = 'blue'> ==> -</font> Image Date is :"+imageDate3);
			System.out.println("Current Image Date: "+imageDate3);

			helper.waitFor(ShowAnalytics3);
			helper.highLightElement(driver, ShowAnalytics3);
			helper.Scrollintoview(ShowAnalytics3);
			String linkText3 = ShowAnalytics3.getAttribute("href");
			helper.getAdID(linkText3);
			ShowAnalytics3.click();
			Reporter.log("<B><font color = 'blue'> ==> -</font> Clicked On Show Analytics Icon");

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
					helper.Scrollintoview(postdate);
					String postdate3=postdate.getText();
					helper.Scrollintoview(lastSeen);
					lastimageDate3= lastSeen.getText();
					System.out.println("Analytics Image Post Date: "+postdate3);
					Reporter.log("<B><font color = 'blue'> ==> -</font> Image Date of Post date is :"+postdate3);
					System.out.println("Analytics Image Last Seen Date: "+lastimageDate3);
					Reporter.log("<B><font color = 'blue'> ==> -</font> Image Date of Last Seen is :"+lastimageDate3);
					driver.close();
				}
			}

			driver.switchTo().window(parent);
			helper.getLastseenDate(lastimageDate3, imageDate3);
		}
		catch (Exception e)
		{
			// TODO: handle exception
			System.out.println("Image is not able: Oops! Looks like we don't have data for this search criteria yet.");

			Reporter.log("<B><font color = 'red'> ==> -</font> Image is not able: Oops! Looks like we don't have data for this search criteria yet.");
		}	


		try {
			String lastimageDate4=null;
			Reporter.log(" ");
			Reporter.log("<B><font color ='red'> 4 Ad -</font>  ");
			System.out.println("");
			System.out.println("4 Ads");

			Reporter.log("<B><font color = 'blue'> ==> -</font> Ads Caputure Image Date :");
			helper.Scrollintoview(date4);
			String imageDate4=date4.getText();
			Reporter.log("<B><font color = 'blue'> ==> -</font> Image Date is :"+imageDate4);
			System.out.println("Current Image Date: "+imageDate4);

			helper.waitFor(ShowAnalytics4);
			helper.highLightElement(driver, ShowAnalytics4);
			helper.Scrollintoview(ShowAnalytics4);
			String linkText4 = ShowAnalytics4.getAttribute("href");
			helper.getAdID(linkText4);
			ShowAnalytics4.click();
			Reporter.log("<B><font color = 'blue'> ==> -</font> Clicked On Show Analytics Icon");

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
					helper.Scrollintoview(postdate);
					String postdate4=postdate.getText();
					helper.Scrollintoview(lastSeen);
					lastimageDate4= lastSeen.getText();
					System.out.println("Analytics Image Post Date: "+postdate4);
					Reporter.log("<B><font color = 'blue'> ==> -</font> Image Date of Post date is :"+postdate4);
					System.out.println("Analytics Image Last Seen Date: "+lastimageDate4);
					Reporter.log("<B><font color = 'blue'> ==> -</font> Image Date of Last Seen is :"+lastimageDate4);
					driver.close();
				}
			}

			driver.switchTo().window(parent);
			helper.getLastseenDate(lastimageDate4, imageDate4);
		}
		catch (Exception e)
		{
			// TODO: handle exception
			System.out.println("Image is not able: Oops! Looks like we don't have data for this search criteria yet.");

			Reporter.log("<B><font color = 'red'> ==> -</font> Image is not able: Oops! Looks like we don't have data for this search criteria yet.");
		}	


		try {
			String lastimageDate5=null;
			Reporter.log(" ");
			Reporter.log("<B><font color ='red'> 5 Ad -</font>  ");
			System.out.println("");
			System.out.println("5 Ads");

			Reporter.log("<B><font color = 'blue'> ==> -</font> Ads Caputure Image Date :");
			helper.Scrollintoview(date5);
			String imageDate5=date5.getText();
			Reporter.log("<B><font color = 'blue'> ==> -</font> Image Date is :"+imageDate5);
			System.out.println("Current Image Date: "+imageDate5);

			helper.waitFor(ShowAnalytics5);
			helper.highLightElement(driver, ShowAnalytics5);
			helper.Scrollintoview(ShowAnalytics5);
			String linkText5 = ShowAnalytics5.getAttribute("href");
			helper.getAdID(linkText5);
			ShowAnalytics5.click();
			Reporter.log("<B><font color = 'blue'> ==> -</font> Clicked On Show Analytics Icon");

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
					helper.Scrollintoview(postdate);
					String postdate5=postdate.getText();
					helper.Scrollintoview(lastSeen);
					lastimageDate5= lastSeen.getText();
					System.out.println("Analytics Image Post Date: "+postdate5);
					Reporter.log("<B><font color = 'blue'> ==> -</font> Image Date of Post date is :"+postdate5);
					System.out.println("Analytics Image Last Seen Date: "+lastimageDate5);
					Reporter.log("<B><font color = 'blue'> ==> -</font> Image Date of Last Seen is :"+lastimageDate5);
					driver.close();
				}
			}

			driver.switchTo().window(parent);
			helper.getLastseenDate(lastimageDate5, imageDate5);
		}
		catch (Exception e)
		{
			// TODO: handle exception
			System.out.println("Image is not able: Oops! Looks like we don't have data for this search criteria yet.");

			Reporter.log("<B><font color = 'red'> ==> -</font> Image is not able: Oops! Looks like we don't have data for this search criteria yet.");
		}	

		try {
			String lastimageDate6=null;
			Reporter.log(" ");
			Reporter.log("<B><font color ='red'> 6 Ad -</font>  ");
			System.out.println("");
			System.out.println("6 Ads");

			Reporter.log("<B><font color = 'blue'> ==> -</font> Ads Caputure Image Date :");
			helper.Scrollintoview(date6);
			String imageDate6=date6.getText();
			Reporter.log("<B><font color = 'blue'> ==> -</font> Image Date is :"+imageDate6);
			System.out.println("Current Image Date: "+imageDate6);

			helper.waitFor(ShowAnalytics6);
			helper.highLightElement(driver, ShowAnalytics6);
			helper.Scrollintoview(ShowAnalytics6);
			String linkText6 = ShowAnalytics6.getAttribute("href");
			helper.getAdID(linkText6);
			ShowAnalytics6.click();
			Reporter.log("<B><font color = 'blue'> ==> -</font> Clicked On Show Analytics Icon");

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
					helper.Scrollintoview(postdate);
					String postdate6=postdate.getText();
					helper.Scrollintoview(lastSeen);
					lastimageDate6= lastSeen.getText();
					System.out.println("Analytics Image Post Date: "+postdate6);
					Reporter.log("<B><font color = 'blue'> ==> -</font> Image Date of Post date is :"+postdate6);
					System.out.println("Analytics Image Last Seen Date: "+lastimageDate6);
					Reporter.log("<B><font color = 'blue'> ==> -</font> Image Date of Last Seen is :"+lastimageDate6);
					driver.close();
				}
			}

			driver.switchTo().window(parent);
			helper.getLastseenDate(lastimageDate6, imageDate6);
		}
		catch (Exception e)
		{
			// TODO: handle exception
			System.out.println("Image is not able: Oops! Looks like we don't have data for this search criteria yet.");

			Reporter.log("<B><font color = 'red'> ==> -</font> Image is not able: Oops! Looks like we don't have data for this search criteria yet.");
		}

		try {
			String lastimageDate7=null;
			Reporter.log(" ");
			Reporter.log("<B><font color ='red'> 7 Ad -</font>  ");
			System.out.println("");
			System.out.println("7 Ads");

			Reporter.log("<B><font color = 'blue'> ==> -</font> Ads Caputure Image Date :");
			helper.Scrollintoview(date7);
			String imageDate7=date7.getText();
			Reporter.log("<B><font color = 'blue'> ==> -</font> Image Date is :"+imageDate7);
			System.out.println("Current Image Date: "+imageDate7);

			helper.waitFor(ShowAnalytics7);
			helper.highLightElement(driver, ShowAnalytics7);
			helper.Scrollintoview(ShowAnalytics7);
			String linkText7 = ShowAnalytics7.getAttribute("href");
			helper.getAdID(linkText7);
			ShowAnalytics7.click();
			Reporter.log("<B><font color = 'blue'> ==> -</font> Clicked On Show Analytics Icon");

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
					helper.Scrollintoview(postdate);
					String postdate7=postdate.getText();
					helper.Scrollintoview(lastSeen);
					lastimageDate7= lastSeen.getText();
					System.out.println("Analytics Image Post Date: "+postdate7);
					Reporter.log("<B><font color = 'blue'> ==> -</font> Image Date of Post date is :"+postdate7);
					System.out.println("Analytics Image Last Seen Date: "+lastimageDate7);
					Reporter.log("<B><font color = 'blue'> ==> -</font> Image Date of Last Seen is :"+lastimageDate7);
					driver.close();
				}
			}

			driver.switchTo().window(parent);
			helper.getLastseenDate(lastimageDate7, imageDate7);
		}
		catch (Exception e)
		{
			// TODO: handle exception
			System.out.println("Image is not able: Oops! Looks like we don't have data for this search criteria yet.");

			Reporter.log("<B><font color = 'red'> ==> -</font> Image is not able: Oops! Looks like we don't have data for this search criteria yet.");
		}	

		try {
			String lastimageDate8=null;
			Reporter.log(" ");
			Reporter.log("<B><font color ='red'> 8 Ad -</font>  ");
			System.out.println("");
			System.out.println("8 Ads");

			Reporter.log("<B><font color = 'blue'> ==> -</font> Ads Caputure Image Date :");
			helper.Scrollintoview(date8);
			String imageDate8=date8.getText();
			Reporter.log("<B><font color = 'blue'> ==> -</font> Image Date is :"+imageDate8);
			System.out.println("Current Image Date: "+imageDate8);

			helper.waitFor(ShowAnalytics8);
			helper.highLightElement(driver, ShowAnalytics8);
			helper.Scrollintoview(ShowAnalytics8);
			String linkText8 = ShowAnalytics8.getAttribute("href");
			helper.getAdID(linkText8);
			ShowAnalytics8.click();
			Reporter.log("<B><font color = 'blue'> ==> -</font> Clicked On Show Analytics Icon");

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
					helper.Scrollintoview(postdate);
					String postdate8=postdate.getText();
					helper.Scrollintoview(lastSeen);
					lastimageDate8= lastSeen.getText();
					System.out.println("Analytics Image Post Date: "+postdate8);
					Reporter.log("<B><font color = 'blue'> ==> -</font> Image Date of Post date is :"+postdate8);
					System.out.println("Analytics Image Last Seen Date: "+lastimageDate8);
					Reporter.log("<B><font color = 'blue'> ==> -</font> Image Date of Last Seen is :"+lastimageDate8);
					driver.close();
				}
			}

			driver.switchTo().window(parent);
			helper.getLastseenDate(lastimageDate8, imageDate8);
		}
		catch (Exception e)
		{
			// TODO: handle exception
			System.out.println("Image is not able: Oops! Looks like we don't have data for this search criteria yet.");

			Reporter.log("<B><font color = 'red'> ==> -</font> Image is not able: Oops! Looks like we don't have data for this search criteria yet.");
		}	

		try {
			String lastimageDate9=null;
			Reporter.log(" ");
			Reporter.log("<B><font color ='red'> 9 Ad -</font>  ");
			System.out.println("");
			System.out.println("9 Ads");

			Reporter.log("<B><font color = 'blue'> ==> -</font> Ads Caputure Image Date :");
			helper.Scrollintoview(date9);
			String imageDate9=date9.getText();
			Reporter.log("<B><font color = 'blue'> ==> -</font> Image Date is :"+imageDate9);
			System.out.println("Current Image Date: "+imageDate9);

			helper.waitFor(ShowAnalytics9);
			helper.highLightElement(driver, ShowAnalytics9);
			helper.Scrollintoview(ShowAnalytics9);
			String linkText9 = ShowAnalytics9.getAttribute("href");
			helper.getAdID(linkText9);
			ShowAnalytics9.click();
			Reporter.log("<B><font color = 'blue'> ==> -</font> Clicked On Show Analytics Icon");

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
					helper.Scrollintoview(postdate);
					String postdate9=postdate.getText();
					helper.Scrollintoview(lastSeen);
					lastimageDate9= lastSeen.getText();
					System.out.println("Analytics Image Post Date: "+postdate9);
					Reporter.log("<B><font color = 'blue'> ==> -</font> Image Date of Post date is :"+postdate9);
					System.out.println("Analytics Image Last Seen Date: "+lastimageDate9);
					Reporter.log("<B><font color = 'blue'> ==> -</font> Image Date of Last Seen is :"+lastimageDate9);
					driver.close();
				}
			}

			driver.switchTo().window(parent);
			helper.getLastseenDate(lastimageDate9, imageDate9);
		}
		catch (Exception e)
		{
			// TODO: handle exception
			System.out.println("Image is not able: Oops! Looks like we don't have data for this search criteria yet.");

			Reporter.log("<B><font color = 'red'> ==> -</font> Image is not able: Oops! Looks like we don't have data for this search criteria yet.");
		}	



		try {
			String lastimageDate10=null;
			Reporter.log(" ");
			Reporter.log("<B><font color ='red'> 10 Ad -</font>  ");
			System.out.println("");
			System.out.println("10 Ads");

			Reporter.log("<B><font color = 'blue'> ==> -</font> Ads Caputure Image Date :");
			helper.Scrollintoview(date10);
			String imageDate10=date10.getText();
			Reporter.log("<B><font color = 'blue'> ==> -</font> Image Date is :"+imageDate10);
			System.out.println("Current Image Date: "+imageDate10);

			helper.waitFor(ShowAnalytics10);
			helper.highLightElement(driver, ShowAnalytics10);
			helper.Scrollintoview(ShowAnalytics10);
			String linkText10 = ShowAnalytics10.getAttribute("href");
			helper.getAdID(linkText10);
			ShowAnalytics10.click();
			Reporter.log("<B><font color = 'blue'> ==> -</font> Clicked On Show Analytics Icon");

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
					helper.Scrollintoview(postdate);
					String postdate10=postdate.getText();
					helper.Scrollintoview(lastSeen);
					lastimageDate10= lastSeen.getText();
					System.out.println("Analytics Image Post Date: "+postdate10);
					Reporter.log("<B><font color = 'blue'> ==> -</font> Image Date of Post date is :"+postdate10);
					System.out.println("Analytics Image Last Seen Date: "+lastimageDate10);
					Reporter.log("<B><font color = 'blue'> ==> -</font> Image Date of Last Seen is :"+lastimageDate10);
					driver.close();
				}
			}

			driver.switchTo().window(parent);
			helper.getLastseenDate(lastimageDate10, imageDate10);
		}
		catch (Exception e)
		{
			// TODO: handle exception
			System.out.println("Image is not able: Oops! Looks like we don't have data for this search criteria yet.");

			Reporter.log("<B><font color = 'red'> ==> -</font> Image is not able: Oops! Looks like we don't have data for this search criteria yet.");
		}	

		try {
			String lastimageDate11=null;
			Reporter.log(" ");
			Reporter.log("<B><font color ='red'> 11 Ad -</font>  ");
			System.out.println("");
			System.out.println("11 Ads");

			Reporter.log("<B><font color = 'blue'> ==> -</font> Ads Caputure Image Date :");
			helper.Scrollintoview(date11);
			String imageDate11=date11.getText();
			Reporter.log("<B><font color = 'blue'> ==> -</font> Image Date is :"+imageDate11);
			System.out.println("Current Image Date: "+imageDate11);

			helper.waitFor(ShowAnalytics11);
			helper.highLightElement(driver, ShowAnalytics11);
			helper.Scrollintoview(ShowAnalytics11);
			String linkText11 = ShowAnalytics11.getAttribute("href");
			helper.getAdID(linkText11);
			ShowAnalytics11.click();
			Reporter.log("<B><font color = 'blue'> ==> -</font> Clicked On Show Analytics Icon");

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
					helper.Scrollintoview(postdate);
					String postdate11=postdate.getText();
					helper.Scrollintoview(lastSeen);
					lastimageDate11= lastSeen.getText();
					System.out.println("Analytics Image Post Date: "+postdate11);
					Reporter.log("<B><font color = 'blue'> ==> -</font> Image Date of Post date is :"+postdate11);
					System.out.println("Analytics Image Last Seen Date: "+lastimageDate11);
					Reporter.log("<B><font color = 'blue'> ==> -</font> Image Date of Last Seen is :"+lastimageDate11);
					driver.close();
				}
			}

			driver.switchTo().window(parent);
			helper.getLastseenDate(lastimageDate11, imageDate11);
		}
		catch (Exception e)
		{
			// TODO: handle exception
			System.out.println("Image is not able: Oops! Looks like we don't have data for this search criteria yet.");

			Reporter.log("<B><font color = 'red'> ==> -</font> Image is not able: Oops! Looks like we don't have data for this search criteria yet.");
		}	

		try {
			String lastimageDate12=null;
			Reporter.log(" ");
			Reporter.log("<B><font color ='red'> 12 Ad -</font>  ");
			System.out.println("");
			System.out.println("12 Ads");

			Reporter.log("<B><font color = 'blue'> ==> -</font> Ads Caputure Image Date :");
			helper.Scrollintoview(date12);
			String imageDate12=date12.getText();
			Reporter.log("<B><font color = 'blue'> ==> -</font> Image Date is :"+imageDate12);
			System.out.println("Current Image Date: "+imageDate12);

			helper.waitFor(ShowAnalytics12);
			helper.highLightElement(driver, ShowAnalytics12);
			helper.Scrollintoview(ShowAnalytics12);
			String linkText12 = ShowAnalytics12.getAttribute("href");
			helper.getAdID(linkText12);
			ShowAnalytics12.click();
			Reporter.log("<B><font color = 'blue'> ==> -</font> Clicked On Show Analytics Icon");

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
					helper.Scrollintoview(postdate);
					String postdate12=postdate.getText();
					helper.Scrollintoview(lastSeen);
					lastimageDate12= lastSeen.getText();
					System.out.println("Analytics Image Post Date: "+postdate12);
					Reporter.log("<B><font color = 'blue'> ==> -</font> Image Date of Post date is :"+postdate12);
					System.out.println("Analytics Image Last Seen Date: "+lastimageDate12);
					Reporter.log("<B><font color = 'blue'> ==> -</font> Image Date of Last Seen is :"+lastimageDate12);
					driver.close();
				}
			}

			driver.switchTo().window(parent);
			helper.getLastseenDate(lastimageDate12, imageDate12);
		}
		catch (Exception e)
		{
			// TODO: handle exception
			System.out.println("Image is not able: Oops! Looks like we don't have data for this search criteria yet.");

			Reporter.log("<B><font color = 'red'> ==> -</font> Image is not able: Oops! Looks like we don't have data for this search criteria yet.");
		}	

		try {
			String lastimageDate13=null;
			Reporter.log(" ");
			Reporter.log("<B><font color ='red'> 13 Ad -</font>  ");
			System.out.println("");
			System.out.println("13 Ads");

			Reporter.log("<B><font color = 'blue'> ==> -</font> Ads Caputure Image Date :");
			helper.Scrollintoview(date13);
			String imageDate13=date13.getText();
			Reporter.log("<B><font color = 'blue'> ==> -</font> Image Date is :"+imageDate13);
			System.out.println("Current Image Date: "+imageDate13);

			helper.waitFor(ShowAnalytics13);
			helper.highLightElement(driver, ShowAnalytics13);
			helper.Scrollintoview(ShowAnalytics13);
			String linkText13 = ShowAnalytics13.getAttribute("href");
			helper.getAdID(linkText13);
			ShowAnalytics13.click();
			Reporter.log("<B><font color = 'blue'> ==> -</font> Clicked On Show Analytics Icon");

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
					helper.Scrollintoview(postdate);
					String postdate13=postdate.getText();
					helper.Scrollintoview(lastSeen);
					lastimageDate13= lastSeen.getText();
					System.out.println("Analytics Image Post Date: "+postdate13);
					Reporter.log("<B><font color = 'blue'> ==> -</font> Image Date of Post date is :"+postdate13);
					System.out.println("Analytics Image Last Seen Date: "+lastimageDate13);
					Reporter.log("<B><font color = 'blue'> ==> -</font> Image Date of Last Seen is :"+lastimageDate13);
					driver.close();
				}
			}

			driver.switchTo().window(parent);
			helper.getLastseenDate(lastimageDate13, imageDate13);
		}
		catch (Exception e)
		{
			// TODO: handle exception
			System.out.println("Image is not able: Oops! Looks like we don't have data for this search criteria yet.");

			Reporter.log("<B><font color = 'red'> ==> -</font> Image is not able: Oops! Looks like we don't have data for this search criteria yet.");
		}	

		try {
			String lastimageDate14=null;
			Reporter.log(" ");
			Reporter.log("<B><font color ='red'> 14 Ad -</font>  ");
			System.out.println("");
			System.out.println("14 Ads");

			Reporter.log("<B><font color = 'blue'> ==> -</font> Ads Caputure Image Date :");
			helper.Scrollintoview(date14);
			String imageDate14=date14.getText();
			Reporter.log("<B><font color = 'blue'> ==> -</font> Image Date is :"+imageDate14);
			System.out.println("Current Image Date: "+imageDate14);

			helper.waitFor(ShowAnalytics14);
			helper.highLightElement(driver, ShowAnalytics14);
			helper.Scrollintoview(ShowAnalytics14);
			String linkText14 = ShowAnalytics14.getAttribute("href");
			helper.getAdID(linkText14);
			ShowAnalytics14.click();
			Reporter.log("<B><font color = 'blue'> ==> -</font> Clicked On Show Analytics Icon");

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
					helper.Scrollintoview(postdate);
					String postdate14=postdate.getText();
					helper.Scrollintoview(lastSeen);
					lastimageDate14= lastSeen.getText();
					System.out.println("Analytics Image Post Date: "+postdate14);
					Reporter.log("<B><font color = 'blue'> ==> -</font> Image Date of Post date is :"+postdate14);
					System.out.println("Analytics Image Last Seen Date: "+lastimageDate14);
					Reporter.log("<B><font color = 'blue'> ==> -</font> Image Date of Last Seen is :"+lastimageDate14);
					driver.close();
				}
			}

			driver.switchTo().window(parent);
			helper.getLastseenDate(lastimageDate14, imageDate14);
		}
		catch (Exception e)
		{
			// TODO: handle exception
			System.out.println("Image is not able: Oops! Looks like we don't have data for this search criteria yet.");

			Reporter.log("<B><font color = 'red'> ==> -</font> Image is not able: Oops! Looks like we don't have data for this search criteria yet.");
		}	

		try {
			String lastimageDate15=null;
			Reporter.log(" ");
			Reporter.log("<B><font color ='red'> 15 Ad -</font>  ");
			System.out.println("");
			System.out.println("15 Ads");

			Reporter.log("<B><font color = 'blue'> ==> -</font> Ads Caputure Image Date :");
			helper.Scrollintoview(date15);
			String imageDate15=date15.getText();
			Reporter.log("<B><font color = 'blue'> ==> -</font> Image Date is :"+imageDate15);
			System.out.println("Current Image Date: "+imageDate15);

			helper.waitFor(ShowAnalytics15);
			helper.highLightElement(driver, ShowAnalytics15);
			helper.Scrollintoview(ShowAnalytics15);
			String linkText15 = ShowAnalytics15.getAttribute("href");
			helper.getAdID(linkText15);
			ShowAnalytics15.click();
			Reporter.log("<B><font color = 'blue'> ==> -</font> Clicked On Show Analytics Icon");

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
					helper.Scrollintoview(postdate);
					String postdate15=postdate.getText();
					helper.Scrollintoview(lastSeen);
					lastimageDate15= lastSeen.getText();
					System.out.println("Analytics Image Post Date: "+postdate15);
					Reporter.log("<B><font color = 'blue'> ==> -</font> Image Date of Post date is :"+postdate15);
					System.out.println("Analytics Image Last Seen Date: "+lastimageDate15);
					Reporter.log("<B><font color = 'blue'> ==> -</font> Image Date of Last Seen is :"+lastimageDate15);
					driver.close();
				}
			}

			driver.switchTo().window(parent);
			helper.getLastseenDate(lastimageDate15, imageDate15);
		}
		catch (Exception e)
		{
			// TODO: handle exception
			System.out.println("Image is not able: Oops! Looks like we don't have data for this search criteria yet.");

			Reporter.log("<B><font color = 'red'> ==> -</font> Image is not able: Oops! Looks like we don't have data for this search criteria yet.");
		}	



	}

	public void PostDateBetween_Yesterday() throws InterruptedException
	{	

		Reporter.log("       " );
		helper.waitForPageToLoad();

		System.out.println();
		System.out.println("-ShortBy Newest -Ad Post Date Between:");
		Reporter.log("<B><font color = 'green'>  -ShortBy Newest -Post Date Between Yesterday Step will Start from here  </font> ");
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


		try 
		{
			String postdate1 = null;
			Reporter.log(" ");
			Reporter.log("<B><font color ='red'> 1 Ad -</font>  ");
			System.out.println("");
			System.out.println("1 Ads");
			Reporter.log("<B><font color = 'blue'> ==> -</font> Ads Caputure Image Date :");
			helper.Scrollintoview(date1);
			String imageDate1=date1.getText();
			Reporter.log("<B><font color = 'blue'> ==> -</font> Image Date is :"+imageDate1);
			System.out.println("Current Image Date: "+imageDate1);
			helper.waitFor(ShowAnalytics1);
			helper.highLightElement(driver, ShowAnalytics1);
			helper.jsScrollintoview(ShowAnalytics1);
			String linkText1 = ShowAnalytics1.getAttribute("href");
			helper.getAdID(linkText1);
			ShowAnalytics1.click();
			Reporter.log("<B><font color = 'blue'> ==> -</font> Clicked On Show Analytics Icon");


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
					helper.Scrollintoview(postdate);
					postdate1=postdate.getText();
					helper.Scrollintoview(lastSeen);
					String lastimageDate1 = lastSeen.getText();
					System.out.println("Analytics Image Post Date: "+postdate1);
					Reporter.log("<B><font color = 'blue'> ==> -</font> Image Date of Post date is :"+postdate1);
					System.out.println("Analytics Image Last Seen Date: "+lastimageDate1);
					Reporter.log("<B><font color = 'blue'> ==> -</font> Image Date of Last Seen is :"+lastimageDate1);
					driver.close();
				}
			}

			driver.switchTo().window(parent);

			helper.getLastseenDate(postdate1, imageDate1);
		}
		catch (Exception e)
		{
			// TODO: handle exception
			System.out.println("Image is not able: Oops! Looks like we don't have data for this search criteria yet.");

			Reporter.log("<B><font color = 'red'> ==> -</font> Image is not able: Oops! Looks like we don't have data for this search criteria yet.");
		}



		try {
			String postdate2=null;
			Reporter.log(" ");
			Reporter.log("<B><font color ='red'> 2 Ad -</font>  ");
			System.out.println("");
			System.out.println("2 Ads");

			Reporter.log("<B><font color = 'blue'> ==> -</font> Ads Caputure Image Date :");
			helper.Scrollintoview(date2);
			String imageDate2=date2.getText();
			Reporter.log("<B><font color = 'blue'> ==> -</font> Image Date is :"+imageDate2);
			System.out.println("Current Image Date: "+imageDate2);

			helper.waitFor(ShowAnalytics2);
			helper.highLightElement(driver, ShowAnalytics2);
			helper.Scrollintoview(ShowAnalytics2);
			String linkText2 = ShowAnalytics2.getAttribute("href");
			helper.getAdID(linkText2);
			ShowAnalytics2.click();
			Reporter.log("<B><font color = 'blue'> ==> -</font> Clicked On Show Analytics Icon");

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
					helper.Scrollintoview(postdate);
					 postdate2=postdate.getText();
					helper.Scrollintoview(lastSeen);
					String lastimageDate2 = lastSeen.getText();
					System.out.println("Analytics Image Post Date: "+postdate2);
					Reporter.log("<B><font color = 'blue'> ==> -</font> Image Date of Post date is :"+postdate2);
					System.out.println("Analytics Image Last Seen Date: "+lastimageDate2);
					Reporter.log("<B><font color = 'blue'> ==> -</font> Image Date of Last Seen is :"+lastimageDate2);
					driver.close();
				}
			}

			driver.switchTo().window(parent);
			helper.getLastseenDate(postdate2, imageDate2);
		}
		catch (Exception e)
		{
			// TODO: handle exception
			System.out.println("Image is not able: Oops! Looks like we don't have data for this search criteria yet.");

			Reporter.log("<B><font color = 'red'> ==> -</font> Image is not able: Oops! Looks like we don't have data for this search criteria yet.");
		}	


		try {
			String postdate3=null;
			Reporter.log(" ");
			Reporter.log("<B><font color ='red'> 3 Ad -</font>  ");
			System.out.println("");
			System.out.println("3 Ads");

			Reporter.log("<B><font color = 'blue'> ==> -</font> Ads Caputure Image Date :");
			helper.Scrollintoview(date3);
			String imageDate3=date3.getText();
			Reporter.log("<B><font color = 'blue'> ==> -</font> Image Date is :"+imageDate3);
			System.out.println("Current Image Date: "+imageDate3);

			helper.waitFor(ShowAnalytics3);
			helper.highLightElement(driver, ShowAnalytics3);
			helper.Scrollintoview(ShowAnalytics3);
			String linkText3 = ShowAnalytics3.getAttribute("href");
			helper.getAdID(linkText3);
			ShowAnalytics3.click();
			Reporter.log("<B><font color = 'blue'> ==> -</font> Clicked On Show Analytics Icon");

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
					helper.Scrollintoview(postdate);
					 postdate3=postdate.getText();
					helper.Scrollintoview(lastSeen);
					String lastimageDate3= lastSeen.getText();
					System.out.println("Analytics Image Post Date: "+postdate3);
					Reporter.log("<B><font color = 'blue'> ==> -</font> Image Date of Post date is :"+postdate3);
					System.out.println("Analytics Image Last Seen Date: "+lastimageDate3);
					Reporter.log("<B><font color = 'blue'> ==> -</font> Image Date of Last Seen is :"+lastimageDate3);
					driver.close();
				}
			}

			driver.switchTo().window(parent);
			helper.getLastseenDate(postdate3, imageDate3);
		}
		catch (Exception e)
		{
			// TODO: handle exception
			System.out.println("Image is not able: Oops! Looks like we don't have data for this search criteria yet.");

			Reporter.log("<B><font color = 'red'> ==> -</font> Image is not able: Oops! Looks like we don't have data for this search criteria yet.");
		}	


		try {
			String postdate4=null;
			Reporter.log(" ");
			Reporter.log("<B><font color ='red'> 4 Ad -</font>  ");
			System.out.println("");
			System.out.println("4 Ads");

			Reporter.log("<B><font color = 'blue'> ==> -</font> Ads Caputure Image Date :");
			helper.Scrollintoview(date4);
			String imageDate4=date4.getText();
			Reporter.log("<B><font color = 'blue'> ==> -</font> Image Date is :"+imageDate4);
			System.out.println("Current Image Date: "+imageDate4);

			helper.waitFor(ShowAnalytics4);
			helper.highLightElement(driver, ShowAnalytics4);
			helper.Scrollintoview(ShowAnalytics4);
			String linkText4 = ShowAnalytics4.getAttribute("href");
			helper.getAdID(linkText4);
			ShowAnalytics4.click();
			Reporter.log("<B><font color = 'blue'> ==> -</font> Clicked On Show Analytics Icon");

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
					helper.Scrollintoview(postdate);
					 postdate4=postdate.getText();
					helper.Scrollintoview(lastSeen);
					String lastimageDate4= lastSeen.getText();
					System.out.println("Analytics Image Post Date: "+postdate4);
					Reporter.log("<B><font color = 'blue'> ==> -</font> Image Date of Post date is :"+postdate4);
					System.out.println("Analytics Image Last Seen Date: "+lastimageDate4);
					Reporter.log("<B><font color = 'blue'> ==> -</font> Image Date of Last Seen is :"+lastimageDate4);
					driver.close();
				}
			}

			driver.switchTo().window(parent);
			helper.getLastseenDate(postdate4, imageDate4);
		}
		catch (Exception e)
		{
			// TODO: handle exception
			System.out.println("Image is not able: Oops! Looks like we don't have data for this search criteria yet.");

			Reporter.log("<B><font color = 'red'> ==> -</font> Image is not able: Oops! Looks like we don't have data for this search criteria yet.");
		}	


		try {
			String postdate5=null;
			Reporter.log(" ");
			Reporter.log("<B><font color ='red'> 5 Ad -</font>  ");
			System.out.println("");
			System.out.println("5 Ads");

			Reporter.log("<B><font color = 'blue'> ==> -</font> Ads Caputure Image Date :");
			helper.Scrollintoview(date5);
			String imageDate5=date5.getText();
			Reporter.log("<B><font color = 'blue'> ==> -</font> Image Date is :"+imageDate5);
			System.out.println("Current Image Date: "+imageDate5);

			helper.waitFor(ShowAnalytics5);
			helper.highLightElement(driver, ShowAnalytics5);
			helper.Scrollintoview(ShowAnalytics5);
			String linkText5 = ShowAnalytics5.getAttribute("href");
			helper.getAdID(linkText5);
			ShowAnalytics5.click();
			Reporter.log("<B><font color = 'blue'> ==> -</font> Clicked On Show Analytics Icon");

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
					helper.Scrollintoview(postdate);
					 postdate5=postdate.getText();
					helper.Scrollintoview(lastSeen);
					String lastimageDate5= lastSeen.getText();
					System.out.println("Analytics Image Post Date: "+postdate5);
					Reporter.log("<B><font color = 'blue'> ==> -</font> Image Date of Post date is :"+postdate5);
					System.out.println("Analytics Image Last Seen Date: "+lastimageDate5);
					Reporter.log("<B><font color = 'blue'> ==> -</font> Image Date of Last Seen is :"+lastimageDate5);
					driver.close();
				}
			}

			driver.switchTo().window(parent);
			helper.getLastseenDate(postdate5, imageDate5);
		}
		catch (Exception e)
		{
			// TODO: handle exception
			System.out.println("Image is not able: Oops! Looks like we don't have data for this search criteria yet.");

			Reporter.log("<B><font color = 'red'> ==> -</font> Image is not able: Oops! Looks like we don't have data for this search criteria yet.");
		}	

		try {
			String postdate6=null;
			Reporter.log(" ");
			Reporter.log("<B><font color ='red'> 6 Ad -</font>  ");
			System.out.println("");
			System.out.println("6 Ads");

			Reporter.log("<B><font color = 'blue'> ==> -</font> Ads Caputure Image Date :");
			helper.Scrollintoview(date6);
			String imageDate6=date6.getText();
			Reporter.log("<B><font color = 'blue'> ==> -</font> Image Date is :"+imageDate6);
			System.out.println("Current Image Date: "+imageDate6);

			helper.waitFor(ShowAnalytics6);
			helper.highLightElement(driver, ShowAnalytics6);
			helper.Scrollintoview(ShowAnalytics6);
			String linkText6 = ShowAnalytics6.getAttribute("href");
			helper.getAdID(linkText6);
			ShowAnalytics6.click();
			Reporter.log("<B><font color = 'blue'> ==> -</font> Clicked On Show Analytics Icon");

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
					helper.Scrollintoview(postdate);
					postdate6=postdate.getText();
					helper.Scrollintoview(lastSeen);
					String lastimageDate6= lastSeen.getText();
					System.out.println("Analytics Image Post Date: "+postdate6);
					Reporter.log("<B><font color = 'blue'> ==> -</font> Image Date of Post date is :"+postdate6);
					System.out.println("Analytics Image Last Seen Date: "+lastimageDate6);
					Reporter.log("<B><font color = 'blue'> ==> -</font> Image Date of Last Seen is :"+lastimageDate6);
					driver.close();
				}
			}

			driver.switchTo().window(parent);
			helper.getLastseenDate(postdate6, imageDate6);
		}
		catch (Exception e)
		{
			// TODO: handle exception
			System.out.println("Image is not able: Oops! Looks like we don't have data for this search criteria yet.");

			Reporter.log("<B><font color = 'red'> ==> -</font> Image is not able: Oops! Looks like we don't have data for this search criteria yet.");
		}

		try {
			String postdate7=null;
			Reporter.log(" ");
			Reporter.log("<B><font color ='red'> 7 Ad -</font>  ");
			System.out.println("");
			System.out.println("7 Ads");

			Reporter.log("<B><font color = 'blue'> ==> -</font> Ads Caputure Image Date :");
			helper.Scrollintoview(date7);
			String imageDate7=date7.getText();
			Reporter.log("<B><font color = 'blue'> ==> -</font> Image Date is :"+imageDate7);
			System.out.println("Current Image Date: "+imageDate7);

			helper.waitFor(ShowAnalytics7);
			helper.highLightElement(driver, ShowAnalytics7);
			helper.Scrollintoview(ShowAnalytics7);
			String linkText7 = ShowAnalytics7.getAttribute("href");
			helper.getAdID(linkText7);
			ShowAnalytics7.click();
			Reporter.log("<B><font color = 'blue'> ==> -</font> Clicked On Show Analytics Icon");

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
					helper.Scrollintoview(postdate);
					postdate7=postdate.getText();
					helper.Scrollintoview(lastSeen);
					String lastimageDate7= lastSeen.getText();
					System.out.println("Analytics Image Post Date: "+postdate7);
					Reporter.log("<B><font color = 'blue'> ==> -</font> Image Date of Post date is :"+postdate7);
					System.out.println("Analytics Image Last Seen Date: "+lastimageDate7);
					Reporter.log("<B><font color = 'blue'> ==> -</font> Image Date of Last Seen is :"+lastimageDate7);
					driver.close();
				}
			}

			driver.switchTo().window(parent);
			helper.getLastseenDate(postdate7, imageDate7);
		}
		catch (Exception e)
		{
			// TODO: handle exception
			System.out.println("Image is not able: Oops! Looks like we don't have data for this search criteria yet.");

			Reporter.log("<B><font color = 'red'> ==> -</font> Image is not able: Oops! Looks like we don't have data for this search criteria yet.");
		}	

		try {
			String postdate8=null;
			Reporter.log(" ");
			Reporter.log("<B><font color ='red'> 8 Ad -</font>  ");
			System.out.println("");
			System.out.println("8 Ads");

			Reporter.log("<B><font color = 'blue'> ==> -</font> Ads Caputure Image Date :");
			helper.Scrollintoview(date8);
			String imageDate8=date8.getText();
			Reporter.log("<B><font color = 'blue'> ==> -</font> Image Date is :"+imageDate8);
			System.out.println("Current Image Date: "+imageDate8);

			helper.waitFor(ShowAnalytics8);
			helper.highLightElement(driver, ShowAnalytics8);
			helper.Scrollintoview(ShowAnalytics8);
			String linkText8 = ShowAnalytics8.getAttribute("href");
			helper.getAdID(linkText8);
			ShowAnalytics8.click();
			Reporter.log("<B><font color = 'blue'> ==> -</font> Clicked On Show Analytics Icon");

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
					helper.Scrollintoview(postdate);
				    postdate8=postdate.getText();
					helper.Scrollintoview(lastSeen);
				    String lastimageDate8= lastSeen.getText();
					System.out.println("Analytics Image Post Date: "+postdate8);
					Reporter.log("<B><font color = 'blue'> ==> -</font> Image Date of Post date is :"+postdate8);
					System.out.println("Analytics Image Last Seen Date: "+lastimageDate8);
					Reporter.log("<B><font color = 'blue'> ==> -</font> Image Date of Last Seen is :"+lastimageDate8);
					driver.close();
				}
			}

			driver.switchTo().window(parent);
			helper.getLastseenDate(postdate8, imageDate8);
		}
		catch (Exception e)
		{
			// TODO: handle exception
			System.out.println("Image is not able: Oops! Looks like we don't have data for this search criteria yet.");

			Reporter.log("<B><font color = 'red'> ==> -</font> Image is not able: Oops! Looks like we don't have data for this search criteria yet.");
		}	

		try {
			String postdate9=null;
			Reporter.log(" ");
			Reporter.log("<B><font color ='red'> 9 Ad -</font>  ");
			System.out.println("");
			System.out.println("9 Ads");

			Reporter.log("<B><font color = 'blue'> ==> -</font> Ads Caputure Image Date :");
			helper.Scrollintoview(date9);
			String imageDate9=date9.getText();
			Reporter.log("<B><font color = 'blue'> ==> -</font> Image Date is :"+imageDate9);
			System.out.println("Current Image Date: "+imageDate9);

			helper.waitFor(ShowAnalytics9);
			helper.highLightElement(driver, ShowAnalytics9);
			helper.Scrollintoview(ShowAnalytics9);
			String linkText9 = ShowAnalytics9.getAttribute("href");
			helper.getAdID(linkText9);
			ShowAnalytics9.click();
			Reporter.log("<B><font color = 'blue'> ==> -</font> Clicked On Show Analytics Icon");

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
					helper.Scrollintoview(postdate);
					postdate9=postdate.getText();
					helper.Scrollintoview(lastSeen);
					String lastimageDate9= lastSeen.getText();
					System.out.println("Analytics Image Post Date: "+postdate9);
					Reporter.log("<B><font color = 'blue'> ==> -</font> Image Date of Post date is :"+postdate9);
					System.out.println("Analytics Image Last Seen Date: "+lastimageDate9);
					Reporter.log("<B><font color = 'blue'> ==> -</font> Image Date of Last Seen is :"+lastimageDate9);
					driver.close();
				}
			}

			driver.switchTo().window(parent);
			helper.getLastseenDate(postdate9, imageDate9);
		}
		catch (Exception e)
		{
			// TODO: handle exception
			System.out.println("Image is not able: Oops! Looks like we don't have data for this search criteria yet.");

			Reporter.log("<B><font color = 'red'> ==> -</font> Image is not able: Oops! Looks like we don't have data for this search criteria yet.");
		}	



		try {
			String postdate10=null;
			Reporter.log(" ");
			Reporter.log("<B><font color ='red'> 10 Ad -</font>  ");
			System.out.println("");
			System.out.println("10 Ads");

			Reporter.log("<B><font color = 'blue'> ==> -</font> Ads Caputure Image Date :");
			helper.Scrollintoview(date10);
			String imageDate10=date10.getText();
			Reporter.log("<B><font color = 'blue'> ==> -</font> Image Date is :"+imageDate10);
			System.out.println("Current Image Date: "+imageDate10);

			helper.waitFor(ShowAnalytics10);
			helper.highLightElement(driver, ShowAnalytics10);
			helper.Scrollintoview(ShowAnalytics10);
			String linkText10 = ShowAnalytics10.getAttribute("href");
			helper.getAdID(linkText10);
			ShowAnalytics10.click();
			Reporter.log("<B><font color = 'blue'> ==> -</font> Clicked On Show Analytics Icon");

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
					helper.Scrollintoview(postdate);
					postdate10=postdate.getText();
					helper.Scrollintoview(lastSeen);
					String lastimageDate10= lastSeen.getText();
					System.out.println("Analytics Image Post Date: "+postdate10);
					Reporter.log("<B><font color = 'blue'> ==> -</font> Image Date of Post date is :"+postdate10);
					System.out.println("Analytics Image Last Seen Date: "+lastimageDate10);
					Reporter.log("<B><font color = 'blue'> ==> -</font> Image Date of Last Seen is :"+lastimageDate10);
					driver.close();
				}
			}

			driver.switchTo().window(parent);
			helper.getLastseenDate(postdate10, imageDate10);
		}
		catch (Exception e)
		{
			// TODO: handle exception
			System.out.println("Image is not able: Oops! Looks like we don't have data for this search criteria yet.");

			Reporter.log("<B><font color = 'red'> ==> -</font> Image is not able: Oops! Looks like we don't have data for this search criteria yet.");
		}	

		try {
			String postdate11=null;
			Reporter.log(" ");
			Reporter.log("<B><font color ='red'> 11 Ad -</font>  ");
			System.out.println("");
			System.out.println("11 Ads");

			Reporter.log("<B><font color = 'blue'> ==> -</font> Ads Caputure Image Date :");
			helper.Scrollintoview(date11);
			String imageDate11=date11.getText();
			Reporter.log("<B><font color = 'blue'> ==> -</font> Image Date is :"+imageDate11);
			System.out.println("Current Image Date: "+imageDate11);

			helper.waitFor(ShowAnalytics11);
			helper.highLightElement(driver, ShowAnalytics11);
			helper.Scrollintoview(ShowAnalytics11);
			String linkText11 = ShowAnalytics11.getAttribute("href");
			helper.getAdID(linkText11);
			ShowAnalytics11.click();
			Reporter.log("<B><font color = 'blue'> ==> -</font> Clicked On Show Analytics Icon");

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
					helper.Scrollintoview(postdate);
					 postdate11=postdate.getText();
					helper.Scrollintoview(lastSeen);
					String lastimageDate11= lastSeen.getText();
					System.out.println("Analytics Image Post Date: "+postdate11);
					Reporter.log("<B><font color = 'blue'> ==> -</font> Image Date of Post date is :"+postdate11);
					System.out.println("Analytics Image Last Seen Date: "+lastimageDate11);
					Reporter.log("<B><font color = 'blue'> ==> -</font> Image Date of Last Seen is :"+lastimageDate11);
					driver.close();
				}
			}

			driver.switchTo().window(parent);
			helper.getLastseenDate(postdate11, imageDate11);
		}
		catch (Exception e)
		{
			// TODO: handle exception
			System.out.println("Image is not able: Oops! Looks like we don't have data for this search criteria yet.");

			Reporter.log("<B><font color = 'red'> ==> -</font> Image is not able: Oops! Looks like we don't have data for this search criteria yet.");
		}	

		try {
			String postdate12=null;
			Reporter.log(" ");
			Reporter.log("<B><font color ='red'> 12 Ad -</font>  ");
			System.out.println("");
			System.out.println("12 Ads");

			Reporter.log("<B><font color = 'blue'> ==> -</font> Ads Caputure Image Date :");
			helper.Scrollintoview(date12);
			String imageDate12=date12.getText();
			Reporter.log("<B><font color = 'blue'> ==> -</font> Image Date is :"+imageDate12);
			System.out.println("Current Image Date: "+imageDate12);

			helper.waitFor(ShowAnalytics12);
			helper.highLightElement(driver, ShowAnalytics12);
			helper.Scrollintoview(ShowAnalytics12);
			String linkText12 = ShowAnalytics12.getAttribute("href");
			helper.getAdID(linkText12);
			ShowAnalytics12.click();
			Reporter.log("<B><font color = 'blue'> ==> -</font> Clicked On Show Analytics Icon");

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
					helper.Scrollintoview(postdate);
					postdate12=postdate.getText();
					helper.Scrollintoview(lastSeen);
					String  lastimageDate12= lastSeen.getText();
					System.out.println("Analytics Image Post Date: "+postdate12);
					Reporter.log("<B><font color = 'blue'> ==> -</font> Image Date of Post date is :"+postdate12);
					System.out.println("Analytics Image Last Seen Date: "+lastimageDate12);
					Reporter.log("<B><font color = 'blue'> ==> -</font> Image Date of Last Seen is :"+lastimageDate12);
					driver.close();
				}
			}

			driver.switchTo().window(parent);
			helper.getLastseenDate(postdate12, imageDate12);
		}
		catch (Exception e)
		{
			// TODO: handle exception
			System.out.println("Image is not able: Oops! Looks like we don't have data for this search criteria yet.");

			Reporter.log("<B><font color = 'red'> ==> -</font> Image is not able: Oops! Looks like we don't have data for this search criteria yet.");
		}	

		try {
			String postdate13=null;
			Reporter.log(" ");
			Reporter.log("<B><font color ='red'> 13 Ad -</font>  ");
			System.out.println("");
			System.out.println("13 Ads");

			Reporter.log("<B><font color = 'blue'> ==> -</font> Ads Caputure Image Date :");
			helper.Scrollintoview(date13);
			String imageDate13=date13.getText();
			Reporter.log("<B><font color = 'blue'> ==> -</font> Image Date is :"+imageDate13);
			System.out.println("Current Image Date: "+imageDate13);

			helper.waitFor(ShowAnalytics13);
			helper.highLightElement(driver, ShowAnalytics13);
			helper.Scrollintoview(ShowAnalytics13);
			String linkText13 = ShowAnalytics13.getAttribute("href");
			helper.getAdID(linkText13);
			ShowAnalytics13.click();
			Reporter.log("<B><font color = 'blue'> ==> -</font> Clicked On Show Analytics Icon");

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
					helper.Scrollintoview(postdate);
					postdate13=postdate.getText();
					helper.Scrollintoview(lastSeen);
					String lastimageDate13= lastSeen.getText();
					System.out.println("Analytics Image Post Date: "+postdate13);
					Reporter.log("<B><font color = 'blue'> ==> -</font> Image Date of Post date is :"+postdate13);
					System.out.println("Analytics Image Last Seen Date: "+lastimageDate13);
					Reporter.log("<B><font color = 'blue'> ==> -</font> Image Date of Last Seen is :"+lastimageDate13);
					driver.close();
				}
			}

			driver.switchTo().window(parent);
			helper.getLastseenDate(postdate13, imageDate13);
		}
		catch (Exception e)
		{
			// TODO: handle exception
			System.out.println("Image is not able: Oops! Looks like we don't have data for this search criteria yet.");

			Reporter.log("<B><font color = 'red'> ==> -</font> Image is not able: Oops! Looks like we don't have data for this search criteria yet.");
		}	

		try {
			String postdate14=null;
			Reporter.log(" ");
			Reporter.log("<B><font color ='red'> 14 Ad -</font>  ");
			System.out.println("");
			System.out.println("14 Ads");

			Reporter.log("<B><font color = 'blue'> ==> -</font> Ads Caputure Image Date :");
			helper.Scrollintoview(date14);
			String imageDate14=date14.getText();
			Reporter.log("<B><font color = 'blue'> ==> -</font> Image Date is :"+imageDate14);
			System.out.println("Current Image Date: "+imageDate14);

			helper.waitFor(ShowAnalytics14);
			helper.highLightElement(driver, ShowAnalytics14);
			helper.Scrollintoview(ShowAnalytics14);
			String linkText14 = ShowAnalytics14.getAttribute("href");
			helper.getAdID(linkText14);
			ShowAnalytics14.click();
			Reporter.log("<B><font color = 'blue'> ==> -</font> Clicked On Show Analytics Icon");

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
					helper.Scrollintoview(postdate);
					postdate14=postdate.getText();
					helper.Scrollintoview(lastSeen);
					String lastimageDate14= lastSeen.getText();
					System.out.println("Analytics Image Post Date: "+postdate14);
					Reporter.log("<B><font color = 'blue'> ==> -</font> Image Date of Post date is :"+postdate14);
					System.out.println("Analytics Image Last Seen Date: "+lastimageDate14);
					Reporter.log("<B><font color = 'blue'> ==> -</font> Image Date of Last Seen is :"+lastimageDate14);
					driver.close();
				}
			}

			driver.switchTo().window(parent);
			helper.getLastseenDate(postdate14, imageDate14);
		}
		catch (Exception e)
		{
			// TODO: handle exception
			System.out.println("Image is not able: Oops! Looks like we don't have data for this search criteria yet.");

			Reporter.log("<B><font color = 'red'> ==> -</font> Image is not able: Oops! Looks like we don't have data for this search criteria yet.");
		}	

		try {
			String postdate15=null;
			Reporter.log(" ");
			Reporter.log("<B><font color ='red'> 15 Ad -</font>  ");
			System.out.println("");
			System.out.println("15 Ads");

			Reporter.log("<B><font color = 'blue'> ==> -</font> Ads Caputure Image Date :");
			helper.Scrollintoview(date15);
			String imageDate15=date15.getText();
			Reporter.log("<B><font color = 'blue'> ==> -</font> Image Date is :"+imageDate15);
			System.out.println("Current Image Date: "+imageDate15);

			helper.waitFor(ShowAnalytics15);
			helper.highLightElement(driver, ShowAnalytics15);
			helper.Scrollintoview(ShowAnalytics15);
			String linkText15 = ShowAnalytics15.getAttribute("href");
			helper.getAdID(linkText15);
			ShowAnalytics15.click();
			Reporter.log("<B><font color = 'blue'> ==> -</font> Clicked On Show Analytics Icon");

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
					helper.Scrollintoview(postdate);
					postdate15=postdate.getText();
					helper.Scrollintoview(lastSeen);
					String  lastimageDate15= lastSeen.getText();
					System.out.println("Analytics Image Post Date: "+postdate15);
					Reporter.log("<B><font color = 'blue'> ==> -</font> Image Date of Post date is :"+postdate15);
					System.out.println("Analytics Image Last Seen Date: "+lastimageDate15);
					Reporter.log("<B><font color = 'blue'> ==> -</font> Image Date of Last Seen is :"+lastimageDate15);
					driver.close();
				}
			}

			driver.switchTo().window(parent);
			helper.getLastseenDate(postdate15, imageDate15);
		}
		catch (Exception e)
		{
			// TODO: handle exception
			System.out.println("Image is not able: Oops! Looks like we don't have data for this search criteria yet.");

			Reporter.log("<B><font color = 'red'> ==> -</font> Image is not able: Oops! Looks like we don't have data for this search criteria yet.");
		}	
	}

	public void PostDateBetween_Last_Seven_Days() throws InterruptedException
	{	


		Reporter.log("       " );
		helper.waitForPageToLoad();

		System.out.println();
		System.out.println("-ShortBy Newest -Ad Post Date Between:");
		Reporter.log("<B><font color = 'green'>  -ShortBy Newest -Post Date Between Last Seven Days Step will Start from here  </font> ");
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


		try 
		{
			String postdate1 = null;
			Reporter.log(" ");
			Reporter.log("<B><font color ='red'> 1 Ad -</font>  ");
			System.out.println("");
			System.out.println("1 Ads");
			Reporter.log("<B><font color = 'blue'> ==> -</font> Ads Caputure Image Date :");
			helper.Scrollintoview(date1);
			String imageDate1=date1.getText();
			Reporter.log("<B><font color = 'blue'> ==> -</font> Image Date is :"+imageDate1);
			System.out.println("Current Image Date: "+imageDate1);
			helper.waitFor(ShowAnalytics1);
			helper.highLightElement(driver, ShowAnalytics1);
			helper.jsScrollintoview(ShowAnalytics1);
			String linkText1 = ShowAnalytics1.getAttribute("href");
			helper.getAdID(linkText1);
			ShowAnalytics1.click();
			Reporter.log("<B><font color = 'blue'> ==> -</font> Clicked On Show Analytics Icon");


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
					helper.Scrollintoview(postdate);
					postdate1=postdate.getText();
					helper.Scrollintoview(lastSeen);
					String lastimageDate1 = lastSeen.getText();
					System.out.println("Analytics Image Post Date: "+postdate1);
					Reporter.log("<B><font color = 'blue'> ==> -</font> Image Date of Post date is :"+postdate1);
					System.out.println("Analytics Image Last Seen Date: "+lastimageDate1);
					Reporter.log("<B><font color = 'blue'> ==> -</font> Image Date of Last Seen is :"+lastimageDate1);
					driver.close();
				}
			}

			driver.switchTo().window(parent);

			helper.getLastseenDate(postdate1, imageDate1);
		}
		catch (Exception e)
		{
			// TODO: handle exception
			System.out.println("Image is not able: Oops! Looks like we don't have data for this search criteria yet.");

			Reporter.log("<B><font color = 'red'> ==> -</font> Image is not able: Oops! Looks like we don't have data for this search criteria yet.");
		}



		try {
			String postdate2=null;
			Reporter.log(" ");
			Reporter.log("<B><font color ='red'> 2 Ad -</font>  ");
			System.out.println("");
			System.out.println("2 Ads");

			Reporter.log("<B><font color = 'blue'> ==> -</font> Ads Caputure Image Date :");
			helper.Scrollintoview(date2);
			String imageDate2=date2.getText();
			Reporter.log("<B><font color = 'blue'> ==> -</font> Image Date is :"+imageDate2);
			System.out.println("Current Image Date: "+imageDate2);

			helper.waitFor(ShowAnalytics2);
			helper.highLightElement(driver, ShowAnalytics2);
			helper.Scrollintoview(ShowAnalytics2);
			String linkText2 = ShowAnalytics2.getAttribute("href");
			helper.getAdID(linkText2);
			ShowAnalytics2.click();
			Reporter.log("<B><font color = 'blue'> ==> -</font> Clicked On Show Analytics Icon");

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
					helper.Scrollintoview(postdate);
					 postdate2=postdate.getText();
					helper.Scrollintoview(lastSeen);
					String lastimageDate2 = lastSeen.getText();
					System.out.println("Analytics Image Post Date: "+postdate2);
					Reporter.log("<B><font color = 'blue'> ==> -</font> Image Date of Post date is :"+postdate2);
					System.out.println("Analytics Image Last Seen Date: "+lastimageDate2);
					Reporter.log("<B><font color = 'blue'> ==> -</font> Image Date of Last Seen is :"+lastimageDate2);
					driver.close();
				}
			}

			driver.switchTo().window(parent);
			helper.getLastseenDate(postdate2, imageDate2);
		}
		catch (Exception e)
		{
			// TODO: handle exception
			System.out.println("Image is not able: Oops! Looks like we don't have data for this search criteria yet.");

			Reporter.log("<B><font color = 'red'> ==> -</font> Image is not able: Oops! Looks like we don't have data for this search criteria yet.");
		}	


		try {
			String postdate3=null;
			Reporter.log(" ");
			Reporter.log("<B><font color ='red'> 3 Ad -</font>  ");
			System.out.println("");
			System.out.println("3 Ads");

			Reporter.log("<B><font color = 'blue'> ==> -</font> Ads Caputure Image Date :");
			helper.Scrollintoview(date3);
			String imageDate3=date3.getText();
			Reporter.log("<B><font color = 'blue'> ==> -</font> Image Date is :"+imageDate3);
			System.out.println("Current Image Date: "+imageDate3);

			helper.waitFor(ShowAnalytics3);
			helper.highLightElement(driver, ShowAnalytics3);
			helper.Scrollintoview(ShowAnalytics3);
			String linkText3 = ShowAnalytics3.getAttribute("href");
			helper.getAdID(linkText3);
			ShowAnalytics3.click();
			Reporter.log("<B><font color = 'blue'> ==> -</font> Clicked On Show Analytics Icon");

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
					helper.Scrollintoview(postdate);
					 postdate3=postdate.getText();
					helper.Scrollintoview(lastSeen);
					String lastimageDate3= lastSeen.getText();
					System.out.println("Analytics Image Post Date: "+postdate3);
					Reporter.log("<B><font color = 'blue'> ==> -</font> Image Date of Post date is :"+postdate3);
					System.out.println("Analytics Image Last Seen Date: "+lastimageDate3);
					Reporter.log("<B><font color = 'blue'> ==> -</font> Image Date of Last Seen is :"+lastimageDate3);
					driver.close();
				}
			}

			driver.switchTo().window(parent);
			helper.getLastseenDate(postdate3, imageDate3);
		}
		catch (Exception e)
		{
			// TODO: handle exception
			System.out.println("Image is not able: Oops! Looks like we don't have data for this search criteria yet.");

			Reporter.log("<B><font color = 'red'> ==> -</font> Image is not able: Oops! Looks like we don't have data for this search criteria yet.");
		}	


		try {
			String postdate4=null;
			Reporter.log(" ");
			Reporter.log("<B><font color ='red'> 4 Ad -</font>  ");
			System.out.println("");
			System.out.println("4 Ads");

			Reporter.log("<B><font color = 'blue'> ==> -</font> Ads Caputure Image Date :");
			helper.Scrollintoview(date4);
			String imageDate4=date4.getText();
			Reporter.log("<B><font color = 'blue'> ==> -</font> Image Date is :"+imageDate4);
			System.out.println("Current Image Date: "+imageDate4);

			helper.waitFor(ShowAnalytics4);
			helper.highLightElement(driver, ShowAnalytics4);
			helper.Scrollintoview(ShowAnalytics4);
			String linkText4 = ShowAnalytics4.getAttribute("href");
			helper.getAdID(linkText4);
			ShowAnalytics4.click();
			Reporter.log("<B><font color = 'blue'> ==> -</font> Clicked On Show Analytics Icon");

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
					helper.Scrollintoview(postdate);
					 postdate4=postdate.getText();
					helper.Scrollintoview(lastSeen);
					String lastimageDate4= lastSeen.getText();
					System.out.println("Analytics Image Post Date: "+postdate4);
					Reporter.log("<B><font color = 'blue'> ==> -</font> Image Date of Post date is :"+postdate4);
					System.out.println("Analytics Image Last Seen Date: "+lastimageDate4);
					Reporter.log("<B><font color = 'blue'> ==> -</font> Image Date of Last Seen is :"+lastimageDate4);
					driver.close();
				}
			}

			driver.switchTo().window(parent);
			helper.getLastseenDate(postdate4, imageDate4);
		}
		catch (Exception e)
		{
			// TODO: handle exception
			System.out.println("Image is not able: Oops! Looks like we don't have data for this search criteria yet.");

			Reporter.log("<B><font color = 'red'> ==> -</font> Image is not able: Oops! Looks like we don't have data for this search criteria yet.");
		}	


		try {
			String postdate5=null;
			Reporter.log(" ");
			Reporter.log("<B><font color ='red'> 5 Ad -</font>  ");
			System.out.println("");
			System.out.println("5 Ads");

			Reporter.log("<B><font color = 'blue'> ==> -</font> Ads Caputure Image Date :");
			helper.Scrollintoview(date5);
			String imageDate5=date5.getText();
			Reporter.log("<B><font color = 'blue'> ==> -</font> Image Date is :"+imageDate5);
			System.out.println("Current Image Date: "+imageDate5);

			helper.waitFor(ShowAnalytics5);
			helper.highLightElement(driver, ShowAnalytics5);
			helper.Scrollintoview(ShowAnalytics5);
			String linkText5 = ShowAnalytics5.getAttribute("href");
			helper.getAdID(linkText5);
			ShowAnalytics5.click();
			Reporter.log("<B><font color = 'blue'> ==> -</font> Clicked On Show Analytics Icon");

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
					helper.Scrollintoview(postdate);
					 postdate5=postdate.getText();
					helper.Scrollintoview(lastSeen);
					String lastimageDate5= lastSeen.getText();
					System.out.println("Analytics Image Post Date: "+postdate5);
					Reporter.log("<B><font color = 'blue'> ==> -</font> Image Date of Post date is :"+postdate5);
					System.out.println("Analytics Image Last Seen Date: "+lastimageDate5);
					Reporter.log("<B><font color = 'blue'> ==> -</font> Image Date of Last Seen is :"+lastimageDate5);
					driver.close();
				}
			}

			driver.switchTo().window(parent);
			helper.getLastseenDate(postdate5, imageDate5);
		}
		catch (Exception e)
		{
			// TODO: handle exception
			System.out.println("Image is not able: Oops! Looks like we don't have data for this search criteria yet.");

			Reporter.log("<B><font color = 'red'> ==> -</font> Image is not able: Oops! Looks like we don't have data for this search criteria yet.");
		}	

		try {
			String postdate6=null;
			Reporter.log(" ");
			Reporter.log("<B><font color ='red'> 6 Ad -</font>  ");
			System.out.println("");
			System.out.println("6 Ads");

			Reporter.log("<B><font color = 'blue'> ==> -</font> Ads Caputure Image Date :");
			helper.Scrollintoview(date6);
			String imageDate6=date6.getText();
			Reporter.log("<B><font color = 'blue'> ==> -</font> Image Date is :"+imageDate6);
			System.out.println("Current Image Date: "+imageDate6);

			helper.waitFor(ShowAnalytics6);
			helper.highLightElement(driver, ShowAnalytics6);
			helper.Scrollintoview(ShowAnalytics6);
			String linkText6 = ShowAnalytics6.getAttribute("href");
			helper.getAdID(linkText6);
			ShowAnalytics6.click();
			Reporter.log("<B><font color = 'blue'> ==> -</font> Clicked On Show Analytics Icon");

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
					helper.Scrollintoview(postdate);
					postdate6=postdate.getText();
					helper.Scrollintoview(lastSeen);
					String lastimageDate6= lastSeen.getText();
					System.out.println("Analytics Image Post Date: "+postdate6);
					Reporter.log("<B><font color = 'blue'> ==> -</font> Image Date of Post date is :"+postdate6);
					System.out.println("Analytics Image Last Seen Date: "+lastimageDate6);
					Reporter.log("<B><font color = 'blue'> ==> -</font> Image Date of Last Seen is :"+lastimageDate6);
					driver.close();
				}
			}

			driver.switchTo().window(parent);
			helper.getLastseenDate(postdate6, imageDate6);
		}
		catch (Exception e)
		{
			// TODO: handle exception
			System.out.println("Image is not able: Oops! Looks like we don't have data for this search criteria yet.");

			Reporter.log("<B><font color = 'red'> ==> -</font> Image is not able: Oops! Looks like we don't have data for this search criteria yet.");
		}

		try {
			String postdate7=null;
			Reporter.log(" ");
			Reporter.log("<B><font color ='red'> 7 Ad -</font>  ");
			System.out.println("");
			System.out.println("7 Ads");

			Reporter.log("<B><font color = 'blue'> ==> -</font> Ads Caputure Image Date :");
			helper.Scrollintoview(date7);
			String imageDate7=date7.getText();
			Reporter.log("<B><font color = 'blue'> ==> -</font> Image Date is :"+imageDate7);
			System.out.println("Current Image Date: "+imageDate7);

			helper.waitFor(ShowAnalytics7);
			helper.highLightElement(driver, ShowAnalytics7);
			helper.Scrollintoview(ShowAnalytics7);
			String linkText7 = ShowAnalytics7.getAttribute("href");
			helper.getAdID(linkText7);
			ShowAnalytics7.click();
			Reporter.log("<B><font color = 'blue'> ==> -</font> Clicked On Show Analytics Icon");

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
					helper.Scrollintoview(postdate);
					postdate7=postdate.getText();
					helper.Scrollintoview(lastSeen);
					String lastimageDate7= lastSeen.getText();
					System.out.println("Analytics Image Post Date: "+postdate7);
					Reporter.log("<B><font color = 'blue'> ==> -</font> Image Date of Post date is :"+postdate7);
					System.out.println("Analytics Image Last Seen Date: "+lastimageDate7);
					Reporter.log("<B><font color = 'blue'> ==> -</font> Image Date of Last Seen is :"+lastimageDate7);
					driver.close();
				}
			}

			driver.switchTo().window(parent);
			helper.getLastseenDate(postdate7, imageDate7);
		}
		catch (Exception e)
		{
			// TODO: handle exception
			System.out.println("Image is not able: Oops! Looks like we don't have data for this search criteria yet.");

			Reporter.log("<B><font color = 'red'> ==> -</font> Image is not able: Oops! Looks like we don't have data for this search criteria yet.");
		}	

		try {
			String postdate8=null;
			Reporter.log(" ");
			Reporter.log("<B><font color ='red'> 8 Ad -</font>  ");
			System.out.println("");
			System.out.println("8 Ads");

			Reporter.log("<B><font color = 'blue'> ==> -</font> Ads Caputure Image Date :");
			helper.Scrollintoview(date8);
			String imageDate8=date8.getText();
			Reporter.log("<B><font color = 'blue'> ==> -</font> Image Date is :"+imageDate8);
			System.out.println("Current Image Date: "+imageDate8);

			helper.waitFor(ShowAnalytics8);
			helper.highLightElement(driver, ShowAnalytics8);
			helper.Scrollintoview(ShowAnalytics8);
			String linkText8 = ShowAnalytics8.getAttribute("href");
			helper.getAdID(linkText8);
			ShowAnalytics8.click();
			Reporter.log("<B><font color = 'blue'> ==> -</font> Clicked On Show Analytics Icon");

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
					helper.Scrollintoview(postdate);
				    postdate8=postdate.getText();
					helper.Scrollintoview(lastSeen);
				    String lastimageDate8= lastSeen.getText();
					System.out.println("Analytics Image Post Date: "+postdate8);
					Reporter.log("<B><font color = 'blue'> ==> -</font> Image Date of Post date is :"+postdate8);
					System.out.println("Analytics Image Last Seen Date: "+lastimageDate8);
					Reporter.log("<B><font color = 'blue'> ==> -</font> Image Date of Last Seen is :"+lastimageDate8);
					driver.close();
				}
			}

			driver.switchTo().window(parent);
			helper.getLastseenDate(postdate8, imageDate8);
		}
		catch (Exception e)
		{
			// TODO: handle exception
			System.out.println("Image is not able: Oops! Looks like we don't have data for this search criteria yet.");

			Reporter.log("<B><font color = 'red'> ==> -</font> Image is not able: Oops! Looks like we don't have data for this search criteria yet.");
		}	

		try {
			String postdate9=null;
			Reporter.log(" ");
			Reporter.log("<B><font color ='red'> 9 Ad -</font>  ");
			System.out.println("");
			System.out.println("9 Ads");

			Reporter.log("<B><font color = 'blue'> ==> -</font> Ads Caputure Image Date :");
			helper.Scrollintoview(date9);
			String imageDate9=date9.getText();
			Reporter.log("<B><font color = 'blue'> ==> -</font> Image Date is :"+imageDate9);
			System.out.println("Current Image Date: "+imageDate9);

			helper.waitFor(ShowAnalytics9);
			helper.highLightElement(driver, ShowAnalytics9);
			helper.Scrollintoview(ShowAnalytics9);
			String linkText9 = ShowAnalytics9.getAttribute("href");
			helper.getAdID(linkText9);
			ShowAnalytics9.click();
			Reporter.log("<B><font color = 'blue'> ==> -</font> Clicked On Show Analytics Icon");

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
					helper.Scrollintoview(postdate);
					postdate9=postdate.getText();
					helper.Scrollintoview(lastSeen);
					String lastimageDate9= lastSeen.getText();
					System.out.println("Analytics Image Post Date: "+postdate9);
					Reporter.log("<B><font color = 'blue'> ==> -</font> Image Date of Post date is :"+postdate9);
					System.out.println("Analytics Image Last Seen Date: "+lastimageDate9);
					Reporter.log("<B><font color = 'blue'> ==> -</font> Image Date of Last Seen is :"+lastimageDate9);
					driver.close();
				}
			}

			driver.switchTo().window(parent);
			helper.getLastseenDate(postdate9, imageDate9);
		}
		catch (Exception e)
		{
			// TODO: handle exception
			System.out.println("Image is not able: Oops! Looks like we don't have data for this search criteria yet.");

			Reporter.log("<B><font color = 'red'> ==> -</font> Image is not able: Oops! Looks like we don't have data for this search criteria yet.");
		}	



		try {
			String postdate10=null;
			Reporter.log(" ");
			Reporter.log("<B><font color ='red'> 10 Ad -</font>  ");
			System.out.println("");
			System.out.println("10 Ads");

			Reporter.log("<B><font color = 'blue'> ==> -</font> Ads Caputure Image Date :");
			helper.Scrollintoview(date10);
			String imageDate10=date10.getText();
			Reporter.log("<B><font color = 'blue'> ==> -</font> Image Date is :"+imageDate10);
			System.out.println("Current Image Date: "+imageDate10);

			helper.waitFor(ShowAnalytics10);
			helper.highLightElement(driver, ShowAnalytics10);
			helper.Scrollintoview(ShowAnalytics10);
			String linkText10 = ShowAnalytics10.getAttribute("href");
			helper.getAdID(linkText10);
			ShowAnalytics10.click();
			Reporter.log("<B><font color = 'blue'> ==> -</font> Clicked On Show Analytics Icon");

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
					helper.Scrollintoview(postdate);
					postdate10=postdate.getText();
					helper.Scrollintoview(lastSeen);
					String lastimageDate10= lastSeen.getText();
					System.out.println("Analytics Image Post Date: "+postdate10);
					Reporter.log("<B><font color = 'blue'> ==> -</font> Image Date of Post date is :"+postdate10);
					System.out.println("Analytics Image Last Seen Date: "+lastimageDate10);
					Reporter.log("<B><font color = 'blue'> ==> -</font> Image Date of Last Seen is :"+lastimageDate10);
					driver.close();
				}
			}

			driver.switchTo().window(parent);
			helper.getLastseenDate(postdate10, imageDate10);
		}
		catch (Exception e)
		{
			// TODO: handle exception
			System.out.println("Image is not able: Oops! Looks like we don't have data for this search criteria yet.");

			Reporter.log("<B><font color = 'red'> ==> -</font> Image is not able: Oops! Looks like we don't have data for this search criteria yet.");
		}	

		try {
			String postdate11=null;
			Reporter.log(" ");
			Reporter.log("<B><font color ='red'> 11 Ad -</font>  ");
			System.out.println("");
			System.out.println("11 Ads");

			Reporter.log("<B><font color = 'blue'> ==> -</font> Ads Caputure Image Date :");
			helper.Scrollintoview(date11);
			String imageDate11=date11.getText();
			Reporter.log("<B><font color = 'blue'> ==> -</font> Image Date is :"+imageDate11);
			System.out.println("Current Image Date: "+imageDate11);

			helper.waitFor(ShowAnalytics11);
			helper.highLightElement(driver, ShowAnalytics11);
			helper.Scrollintoview(ShowAnalytics11);
			String linkText11 = ShowAnalytics11.getAttribute("href");
			helper.getAdID(linkText11);
			ShowAnalytics11.click();
			Reporter.log("<B><font color = 'blue'> ==> -</font> Clicked On Show Analytics Icon");

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
					helper.Scrollintoview(postdate);
					 postdate11=postdate.getText();
					helper.Scrollintoview(lastSeen);
					String lastimageDate11= lastSeen.getText();
					System.out.println("Analytics Image Post Date: "+postdate11);
					Reporter.log("<B><font color = 'blue'> ==> -</font> Image Date of Post date is :"+postdate11);
					System.out.println("Analytics Image Last Seen Date: "+lastimageDate11);
					Reporter.log("<B><font color = 'blue'> ==> -</font> Image Date of Last Seen is :"+lastimageDate11);
					driver.close();
				}
			}

			driver.switchTo().window(parent);
			helper.getLastseenDate(postdate11, imageDate11);
		}
		catch (Exception e)
		{
			// TODO: handle exception
			System.out.println("Image is not able: Oops! Looks like we don't have data for this search criteria yet.");

			Reporter.log("<B><font color = 'red'> ==> -</font> Image is not able: Oops! Looks like we don't have data for this search criteria yet.");
		}	

		try {
			String postdate12=null;
			Reporter.log(" ");
			Reporter.log("<B><font color ='red'> 12 Ad -</font>  ");
			System.out.println("");
			System.out.println("12 Ads");

			Reporter.log("<B><font color = 'blue'> ==> -</font> Ads Caputure Image Date :");
			helper.Scrollintoview(date12);
			String imageDate12=date12.getText();
			Reporter.log("<B><font color = 'blue'> ==> -</font> Image Date is :"+imageDate12);
			System.out.println("Current Image Date: "+imageDate12);

			helper.waitFor(ShowAnalytics12);
			helper.highLightElement(driver, ShowAnalytics12);
			helper.Scrollintoview(ShowAnalytics12);
			String linkText12 = ShowAnalytics12.getAttribute("href");
			helper.getAdID(linkText12);
			ShowAnalytics12.click();
			Reporter.log("<B><font color = 'blue'> ==> -</font> Clicked On Show Analytics Icon");

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
					helper.Scrollintoview(postdate);
					postdate12=postdate.getText();
					helper.Scrollintoview(lastSeen);
					String  lastimageDate12= lastSeen.getText();
					System.out.println("Analytics Image Post Date: "+postdate12);
					Reporter.log("<B><font color = 'blue'> ==> -</font> Image Date of Post date is :"+postdate12);
					System.out.println("Analytics Image Last Seen Date: "+lastimageDate12);
					Reporter.log("<B><font color = 'blue'> ==> -</font> Image Date of Last Seen is :"+lastimageDate12);
					driver.close();
				}
			}

			driver.switchTo().window(parent);
			helper.getLastseenDate(postdate12, imageDate12);
		}
		catch (Exception e)
		{
			// TODO: handle exception
			System.out.println("Image is not able: Oops! Looks like we don't have data for this search criteria yet.");

			Reporter.log("<B><font color = 'red'> ==> -</font> Image is not able: Oops! Looks like we don't have data for this search criteria yet.");
		}	

		try {
			String postdate13=null;
			Reporter.log(" ");
			Reporter.log("<B><font color ='red'> 13 Ad -</font>  ");
			System.out.println("");
			System.out.println("13 Ads");

			Reporter.log("<B><font color = 'blue'> ==> -</font> Ads Caputure Image Date :");
			helper.Scrollintoview(date13);
			String imageDate13=date13.getText();
			Reporter.log("<B><font color = 'blue'> ==> -</font> Image Date is :"+imageDate13);
			System.out.println("Current Image Date: "+imageDate13);

			helper.waitFor(ShowAnalytics13);
			helper.highLightElement(driver, ShowAnalytics13);
			helper.Scrollintoview(ShowAnalytics13);
			String linkText13 = ShowAnalytics13.getAttribute("href");
			helper.getAdID(linkText13);
			ShowAnalytics13.click();
			Reporter.log("<B><font color = 'blue'> ==> -</font> Clicked On Show Analytics Icon");

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
					helper.Scrollintoview(postdate);
					postdate13=postdate.getText();
					helper.Scrollintoview(lastSeen);
					String lastimageDate13= lastSeen.getText();
					System.out.println("Analytics Image Post Date: "+postdate13);
					Reporter.log("<B><font color = 'blue'> ==> -</font> Image Date of Post date is :"+postdate13);
					System.out.println("Analytics Image Last Seen Date: "+lastimageDate13);
					Reporter.log("<B><font color = 'blue'> ==> -</font> Image Date of Last Seen is :"+lastimageDate13);
					driver.close();
				}
			}

			driver.switchTo().window(parent);
			helper.getLastseenDate(postdate13, imageDate13);
		}
		catch (Exception e)
		{
			// TODO: handle exception
			System.out.println("Image is not able: Oops! Looks like we don't have data for this search criteria yet.");

			Reporter.log("<B><font color = 'red'> ==> -</font> Image is not able: Oops! Looks like we don't have data for this search criteria yet.");
		}	

		try {
			String postdate14=null;
			Reporter.log(" ");
			Reporter.log("<B><font color ='red'> 14 Ad -</font>  ");
			System.out.println("");
			System.out.println("14 Ads");

			Reporter.log("<B><font color = 'blue'> ==> -</font> Ads Caputure Image Date :");
			helper.Scrollintoview(date14);
			String imageDate14=date14.getText();
			Reporter.log("<B><font color = 'blue'> ==> -</font> Image Date is :"+imageDate14);
			System.out.println("Current Image Date: "+imageDate14);

			helper.waitFor(ShowAnalytics14);
			helper.highLightElement(driver, ShowAnalytics14);
			helper.Scrollintoview(ShowAnalytics14);
			String linkText14 = ShowAnalytics14.getAttribute("href");
			helper.getAdID(linkText14);
			ShowAnalytics14.click();
			Reporter.log("<B><font color = 'blue'> ==> -</font> Clicked On Show Analytics Icon");

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
					helper.Scrollintoview(postdate);
					postdate14=postdate.getText();
					helper.Scrollintoview(lastSeen);
					String lastimageDate14= lastSeen.getText();
					System.out.println("Analytics Image Post Date: "+postdate14);
					Reporter.log("<B><font color = 'blue'> ==> -</font> Image Date of Post date is :"+postdate14);
					System.out.println("Analytics Image Last Seen Date: "+lastimageDate14);
					Reporter.log("<B><font color = 'blue'> ==> -</font> Image Date of Last Seen is :"+lastimageDate14);
					driver.close();
				}
			}

			driver.switchTo().window(parent);
			helper.getLastseenDate(postdate14, imageDate14);
		}
		catch (Exception e)
		{
			// TODO: handle exception
			System.out.println("Image is not able: Oops! Looks like we don't have data for this search criteria yet.");

			Reporter.log("<B><font color = 'red'> ==> -</font> Image is not able: Oops! Looks like we don't have data for this search criteria yet.");
		}	

		try {
			String postdate15=null;
			Reporter.log(" ");
			Reporter.log("<B><font color ='red'> 15 Ad -</font>  ");
			System.out.println("");
			System.out.println("15 Ads");

			Reporter.log("<B><font color = 'blue'> ==> -</font> Ads Caputure Image Date :");
			helper.Scrollintoview(date15);
			String imageDate15=date15.getText();
			Reporter.log("<B><font color = 'blue'> ==> -</font> Image Date is :"+imageDate15);
			System.out.println("Current Image Date: "+imageDate15);

			helper.waitFor(ShowAnalytics15);
			helper.highLightElement(driver, ShowAnalytics15);
			helper.Scrollintoview(ShowAnalytics15);
			String linkText15 = ShowAnalytics15.getAttribute("href");
			helper.getAdID(linkText15);
			ShowAnalytics15.click();
			Reporter.log("<B><font color = 'blue'> ==> -</font> Clicked On Show Analytics Icon");

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
					helper.Scrollintoview(postdate);
					postdate15=postdate.getText();
					helper.Scrollintoview(lastSeen);
					String  lastimageDate15= lastSeen.getText();
					System.out.println("Analytics Image Post Date: "+postdate15);
					Reporter.log("<B><font color = 'blue'> ==> -</font> Image Date of Post date is :"+postdate15);
					System.out.println("Analytics Image Last Seen Date: "+lastimageDate15);
					Reporter.log("<B><font color = 'blue'> ==> -</font> Image Date of Last Seen is :"+lastimageDate15);
					driver.close();
				}
			}

			driver.switchTo().window(parent);
			helper.getLastseenDate(postdate15, imageDate15);
		}
		catch (Exception e)
		{
			// TODO: handle exception
			System.out.println("Image is not able: Oops! Looks like we don't have data for this search criteria yet.");

			Reporter.log("<B><font color = 'red'> ==> -</font> Image is not able: Oops! Looks like we don't have data for this search criteria yet.");
		}	}

	public void PostDateBetween_Last_Thirty_Days() throws InterruptedException
	{
		{	
			Reporter.log("       " );
			System.out.println();
			System.out.println("-ShortBy Newest -Ad Post Date Between:");
			Reporter.log("<B><font color = 'green'>  -ShortBy Newest -Post Date Between Last Thirty Days Step will Start from here  </font> ");
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

		
			try 
			{
				String postdate1 = null;
				Reporter.log(" ");
				Reporter.log("<B><font color ='red'> 1 Ad -</font>  ");
				System.out.println("");
				System.out.println("1 Ads");
				Reporter.log("<B><font color = 'blue'> ==> -</font> Ads Caputure Image Date :");
				helper.Scrollintoview(date1);
				String imageDate1=date1.getText();
				Reporter.log("<B><font color = 'blue'> ==> -</font> Image Date is :"+imageDate1);
				System.out.println("Current Image Date: "+imageDate1);
				helper.waitFor(ShowAnalytics1);
				helper.highLightElement(driver, ShowAnalytics1);
				helper.jsScrollintoview(ShowAnalytics1);
				String linkText1 = ShowAnalytics1.getAttribute("href");
				helper.getAdID(linkText1);
				ShowAnalytics1.click();
				Reporter.log("<B><font color = 'blue'> ==> -</font> Clicked On Show Analytics Icon");


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
						helper.Scrollintoview(postdate);
						postdate1=postdate.getText();
						helper.Scrollintoview(lastSeen);
						String lastimageDate1 = lastSeen.getText();
						System.out.println("Analytics Image Post Date: "+postdate1);
						Reporter.log("<B><font color = 'blue'> ==> -</font> Image Date of Post date is :"+postdate1);
						System.out.println("Analytics Image Last Seen Date: "+lastimageDate1);
						Reporter.log("<B><font color = 'blue'> ==> -</font> Image Date of Last Seen is :"+lastimageDate1);
						driver.close();
					}
				}

				driver.switchTo().window(parent);

				helper.getLastseenDate(postdate1, imageDate1);
			}
			catch (Exception e)
			{
				// TODO: handle exception
				System.out.println("Image is not able: Oops! Looks like we don't have data for this search criteria yet.");

				Reporter.log("<B><font color = 'red'> ==> -</font> Image is not able: Oops! Looks like we don't have data for this search criteria yet.");
			}



			try {
				String postdate2=null;
				Reporter.log(" ");
				Reporter.log("<B><font color ='red'> 2 Ad -</font>  ");
				System.out.println("");
				System.out.println("2 Ads");

				Reporter.log("<B><font color = 'blue'> ==> -</font> Ads Caputure Image Date :");
				helper.Scrollintoview(date2);
				String imageDate2=date2.getText();
				Reporter.log("<B><font color = 'blue'> ==> -</font> Image Date is :"+imageDate2);
				System.out.println("Current Image Date: "+imageDate2);

				helper.waitFor(ShowAnalytics2);
				helper.highLightElement(driver, ShowAnalytics2);
				helper.Scrollintoview(ShowAnalytics2);
				String linkText2 = ShowAnalytics2.getAttribute("href");
				helper.getAdID(linkText2);
				ShowAnalytics2.click();
				Reporter.log("<B><font color = 'blue'> ==> -</font> Clicked On Show Analytics Icon");

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
						helper.Scrollintoview(postdate);
						 postdate2=postdate.getText();
						helper.Scrollintoview(lastSeen);
						String lastimageDate2 = lastSeen.getText();
						System.out.println("Analytics Image Post Date: "+postdate2);
						Reporter.log("<B><font color = 'blue'> ==> -</font> Image Date of Post date is :"+postdate2);
						System.out.println("Analytics Image Last Seen Date: "+lastimageDate2);
						Reporter.log("<B><font color = 'blue'> ==> -</font> Image Date of Last Seen is :"+lastimageDate2);
						driver.close();
					}
				}

				driver.switchTo().window(parent);
				helper.getLastseenDate(postdate2, imageDate2);
			}
			catch (Exception e)
			{
				// TODO: handle exception
				System.out.println("Image is not able: Oops! Looks like we don't have data for this search criteria yet.");

				Reporter.log("<B><font color = 'red'> ==> -</font> Image is not able: Oops! Looks like we don't have data for this search criteria yet.");
			}	


			try {
				String postdate3=null;
				Reporter.log(" ");
				Reporter.log("<B><font color ='red'> 3 Ad -</font>  ");
				System.out.println("");
				System.out.println("3 Ads");

				Reporter.log("<B><font color = 'blue'> ==> -</font> Ads Caputure Image Date :");
				helper.Scrollintoview(date3);
				String imageDate3=date3.getText();
				Reporter.log("<B><font color = 'blue'> ==> -</font> Image Date is :"+imageDate3);
				System.out.println("Current Image Date: "+imageDate3);

				helper.waitFor(ShowAnalytics3);
				helper.highLightElement(driver, ShowAnalytics3);
				helper.Scrollintoview(ShowAnalytics3);
				String linkText3 = ShowAnalytics3.getAttribute("href");
				helper.getAdID(linkText3);
				ShowAnalytics3.click();
				Reporter.log("<B><font color = 'blue'> ==> -</font> Clicked On Show Analytics Icon");

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
						helper.Scrollintoview(postdate);
						 postdate3=postdate.getText();
						helper.Scrollintoview(lastSeen);
						String lastimageDate3= lastSeen.getText();
						System.out.println("Analytics Image Post Date: "+postdate3);
						Reporter.log("<B><font color = 'blue'> ==> -</font> Image Date of Post date is :"+postdate3);
						System.out.println("Analytics Image Last Seen Date: "+lastimageDate3);
						Reporter.log("<B><font color = 'blue'> ==> -</font> Image Date of Last Seen is :"+lastimageDate3);
						driver.close();
					}
				}

				driver.switchTo().window(parent);
				helper.getLastseenDate(postdate3, imageDate3);
			}
			catch (Exception e)
			{
				// TODO: handle exception
				System.out.println("Image is not able: Oops! Looks like we don't have data for this search criteria yet.");

				Reporter.log("<B><font color = 'red'> ==> -</font> Image is not able: Oops! Looks like we don't have data for this search criteria yet.");
			}	


			try {
				String postdate4=null;
				Reporter.log(" ");
				Reporter.log("<B><font color ='red'> 4 Ad -</font>  ");
				System.out.println("");
				System.out.println("4 Ads");

				Reporter.log("<B><font color = 'blue'> ==> -</font> Ads Caputure Image Date :");
				helper.Scrollintoview(date4);
				String imageDate4=date4.getText();
				Reporter.log("<B><font color = 'blue'> ==> -</font> Image Date is :"+imageDate4);
				System.out.println("Current Image Date: "+imageDate4);

				helper.waitFor(ShowAnalytics4);
				helper.highLightElement(driver, ShowAnalytics4);
				helper.Scrollintoview(ShowAnalytics4);
				String linkText4 = ShowAnalytics4.getAttribute("href");
				helper.getAdID(linkText4);
				ShowAnalytics4.click();
				Reporter.log("<B><font color = 'blue'> ==> -</font> Clicked On Show Analytics Icon");

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
						helper.Scrollintoview(postdate);
						 postdate4=postdate.getText();
						helper.Scrollintoview(lastSeen);
						String lastimageDate4= lastSeen.getText();
						System.out.println("Analytics Image Post Date: "+postdate4);
						Reporter.log("<B><font color = 'blue'> ==> -</font> Image Date of Post date is :"+postdate4);
						System.out.println("Analytics Image Last Seen Date: "+lastimageDate4);
						Reporter.log("<B><font color = 'blue'> ==> -</font> Image Date of Last Seen is :"+lastimageDate4);
						driver.close();
					}
				}

				driver.switchTo().window(parent);
				helper.getLastseenDate(postdate4, imageDate4);
			}
			catch (Exception e)
			{
				// TODO: handle exception
				System.out.println("Image is not able: Oops! Looks like we don't have data for this search criteria yet.");

				Reporter.log("<B><font color = 'red'> ==> -</font> Image is not able: Oops! Looks like we don't have data for this search criteria yet.");
			}	


			try {
				String postdate5=null;
				Reporter.log(" ");
				Reporter.log("<B><font color ='red'> 5 Ad -</font>  ");
				System.out.println("");
				System.out.println("5 Ads");

				Reporter.log("<B><font color = 'blue'> ==> -</font> Ads Caputure Image Date :");
				helper.Scrollintoview(date5);
				String imageDate5=date5.getText();
				Reporter.log("<B><font color = 'blue'> ==> -</font> Image Date is :"+imageDate5);
				System.out.println("Current Image Date: "+imageDate5);

				helper.waitFor(ShowAnalytics5);
				helper.highLightElement(driver, ShowAnalytics5);
				helper.Scrollintoview(ShowAnalytics5);
				String linkText5 = ShowAnalytics5.getAttribute("href");
				helper.getAdID(linkText5);
				ShowAnalytics5.click();
				Reporter.log("<B><font color = 'blue'> ==> -</font> Clicked On Show Analytics Icon");

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
						helper.Scrollintoview(postdate);
						 postdate5=postdate.getText();
						helper.Scrollintoview(lastSeen);
						String lastimageDate5= lastSeen.getText();
						System.out.println("Analytics Image Post Date: "+postdate5);
						Reporter.log("<B><font color = 'blue'> ==> -</font> Image Date of Post date is :"+postdate5);
						System.out.println("Analytics Image Last Seen Date: "+lastimageDate5);
						Reporter.log("<B><font color = 'blue'> ==> -</font> Image Date of Last Seen is :"+lastimageDate5);
						driver.close();
					}
				}

				driver.switchTo().window(parent);
				helper.getLastseenDate(postdate5, imageDate5);
			}
			catch (Exception e)
			{
				// TODO: handle exception
				System.out.println("Image is not able: Oops! Looks like we don't have data for this search criteria yet.");

				Reporter.log("<B><font color = 'red'> ==> -</font> Image is not able: Oops! Looks like we don't have data for this search criteria yet.");
			}	

			try {
				String postdate6=null;
				Reporter.log(" ");
				Reporter.log("<B><font color ='red'> 6 Ad -</font>  ");
				System.out.println("");
				System.out.println("6 Ads");

				Reporter.log("<B><font color = 'blue'> ==> -</font> Ads Caputure Image Date :");
				helper.Scrollintoview(date6);
				String imageDate6=date6.getText();
				Reporter.log("<B><font color = 'blue'> ==> -</font> Image Date is :"+imageDate6);
				System.out.println("Current Image Date: "+imageDate6);

				helper.waitFor(ShowAnalytics6);
				helper.highLightElement(driver, ShowAnalytics6);
				helper.Scrollintoview(ShowAnalytics6);
				String linkText6 = ShowAnalytics6.getAttribute("href");
				helper.getAdID(linkText6);
				ShowAnalytics6.click();
				Reporter.log("<B><font color = 'blue'> ==> -</font> Clicked On Show Analytics Icon");

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
						helper.Scrollintoview(postdate);
						postdate6=postdate.getText();
						helper.Scrollintoview(lastSeen);
						String lastimageDate6= lastSeen.getText();
						System.out.println("Analytics Image Post Date: "+postdate6);
						Reporter.log("<B><font color = 'blue'> ==> -</font> Image Date of Post date is :"+postdate6);
						System.out.println("Analytics Image Last Seen Date: "+lastimageDate6);
						Reporter.log("<B><font color = 'blue'> ==> -</font> Image Date of Last Seen is :"+lastimageDate6);
						driver.close();
					}
				}

				driver.switchTo().window(parent);
				helper.getLastseenDate(postdate6, imageDate6);
			}
			catch (Exception e)
			{
				// TODO: handle exception
				System.out.println("Image is not able: Oops! Looks like we don't have data for this search criteria yet.");

				Reporter.log("<B><font color = 'red'> ==> -</font> Image is not able: Oops! Looks like we don't have data for this search criteria yet.");
			}

			try {
				String postdate7=null;
				Reporter.log(" ");
				Reporter.log("<B><font color ='red'> 7 Ad -</font>  ");
				System.out.println("");
				System.out.println("7 Ads");

				Reporter.log("<B><font color = 'blue'> ==> -</font> Ads Caputure Image Date :");
				helper.Scrollintoview(date7);
				String imageDate7=date7.getText();
				Reporter.log("<B><font color = 'blue'> ==> -</font> Image Date is :"+imageDate7);
				System.out.println("Current Image Date: "+imageDate7);

				helper.waitFor(ShowAnalytics7);
				helper.highLightElement(driver, ShowAnalytics7);
				helper.Scrollintoview(ShowAnalytics7);
				String linkText7 = ShowAnalytics7.getAttribute("href");
				helper.getAdID(linkText7);
				ShowAnalytics7.click();
				Reporter.log("<B><font color = 'blue'> ==> -</font> Clicked On Show Analytics Icon");

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
						helper.Scrollintoview(postdate);
						postdate7=postdate.getText();
						helper.Scrollintoview(lastSeen);
						String lastimageDate7= lastSeen.getText();
						System.out.println("Analytics Image Post Date: "+postdate7);
						Reporter.log("<B><font color = 'blue'> ==> -</font> Image Date of Post date is :"+postdate7);
						System.out.println("Analytics Image Last Seen Date: "+lastimageDate7);
						Reporter.log("<B><font color = 'blue'> ==> -</font> Image Date of Last Seen is :"+lastimageDate7);
						driver.close();
					}
				}

				driver.switchTo().window(parent);
				helper.getLastseenDate(postdate7, imageDate7);
			}
			catch (Exception e)
			{
				// TODO: handle exception
				System.out.println("Image is not able: Oops! Looks like we don't have data for this search criteria yet.");

				Reporter.log("<B><font color = 'red'> ==> -</font> Image is not able: Oops! Looks like we don't have data for this search criteria yet.");
			}	

			try {
				String postdate8=null;
				Reporter.log(" ");
				Reporter.log("<B><font color ='red'> 8 Ad -</font>  ");
				System.out.println("");
				System.out.println("8 Ads");

				Reporter.log("<B><font color = 'blue'> ==> -</font> Ads Caputure Image Date :");
				helper.Scrollintoview(date8);
				String imageDate8=date8.getText();
				Reporter.log("<B><font color = 'blue'> ==> -</font> Image Date is :"+imageDate8);
				System.out.println("Current Image Date: "+imageDate8);

				helper.waitFor(ShowAnalytics8);
				helper.highLightElement(driver, ShowAnalytics8);
				helper.Scrollintoview(ShowAnalytics8);
				String linkText8 = ShowAnalytics8.getAttribute("href");
				helper.getAdID(linkText8);
				ShowAnalytics8.click();
				Reporter.log("<B><font color = 'blue'> ==> -</font> Clicked On Show Analytics Icon");

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
						helper.Scrollintoview(postdate);
					    postdate8=postdate.getText();
						helper.Scrollintoview(lastSeen);
					    String lastimageDate8= lastSeen.getText();
						System.out.println("Analytics Image Post Date: "+postdate8);
						Reporter.log("<B><font color = 'blue'> ==> -</font> Image Date of Post date is :"+postdate8);
						System.out.println("Analytics Image Last Seen Date: "+lastimageDate8);
						Reporter.log("<B><font color = 'blue'> ==> -</font> Image Date of Last Seen is :"+lastimageDate8);
						driver.close();
					}
				}

				driver.switchTo().window(parent);
				helper.getLastseenDate(postdate8, imageDate8);
			}
			catch (Exception e)
			{
				// TODO: handle exception
				System.out.println("Image is not able: Oops! Looks like we don't have data for this search criteria yet.");

				Reporter.log("<B><font color = 'red'> ==> -</font> Image is not able: Oops! Looks like we don't have data for this search criteria yet.");
			}	

			try {
				String postdate9=null;
				Reporter.log(" ");
				Reporter.log("<B><font color ='red'> 9 Ad -</font>  ");
				System.out.println("");
				System.out.println("9 Ads");

				Reporter.log("<B><font color = 'blue'> ==> -</font> Ads Caputure Image Date :");
				helper.Scrollintoview(date9);
				String imageDate9=date9.getText();
				Reporter.log("<B><font color = 'blue'> ==> -</font> Image Date is :"+imageDate9);
				System.out.println("Current Image Date: "+imageDate9);

				helper.waitFor(ShowAnalytics9);
				helper.highLightElement(driver, ShowAnalytics9);
				helper.Scrollintoview(ShowAnalytics9);
				String linkText9 = ShowAnalytics9.getAttribute("href");
				helper.getAdID(linkText9);
				ShowAnalytics9.click();
				Reporter.log("<B><font color = 'blue'> ==> -</font> Clicked On Show Analytics Icon");

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
						helper.Scrollintoview(postdate);
						postdate9=postdate.getText();
						helper.Scrollintoview(lastSeen);
						String lastimageDate9= lastSeen.getText();
						System.out.println("Analytics Image Post Date: "+postdate9);
						Reporter.log("<B><font color = 'blue'> ==> -</font> Image Date of Post date is :"+postdate9);
						System.out.println("Analytics Image Last Seen Date: "+lastimageDate9);
						Reporter.log("<B><font color = 'blue'> ==> -</font> Image Date of Last Seen is :"+lastimageDate9);
						driver.close();
					}
				}

				driver.switchTo().window(parent);
				helper.getLastseenDate(postdate9, imageDate9);
			}
			catch (Exception e)
			{
				// TODO: handle exception
				System.out.println("Image is not able: Oops! Looks like we don't have data for this search criteria yet.");

				Reporter.log("<B><font color = 'red'> ==> -</font> Image is not able: Oops! Looks like we don't have data for this search criteria yet.");
			}	



			try {
				String postdate10=null;
				Reporter.log(" ");
				Reporter.log("<B><font color ='red'> 10 Ad -</font>  ");
				System.out.println("");
				System.out.println("10 Ads");

				Reporter.log("<B><font color = 'blue'> ==> -</font> Ads Caputure Image Date :");
				helper.Scrollintoview(date10);
				String imageDate10=date10.getText();
				Reporter.log("<B><font color = 'blue'> ==> -</font> Image Date is :"+imageDate10);
				System.out.println("Current Image Date: "+imageDate10);

				helper.waitFor(ShowAnalytics10);
				helper.highLightElement(driver, ShowAnalytics10);
				helper.Scrollintoview(ShowAnalytics10);
				String linkText10 = ShowAnalytics10.getAttribute("href");
				helper.getAdID(linkText10);
				ShowAnalytics10.click();
				Reporter.log("<B><font color = 'blue'> ==> -</font> Clicked On Show Analytics Icon");

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
						helper.Scrollintoview(postdate);
						postdate10=postdate.getText();
						helper.Scrollintoview(lastSeen);
						String lastimageDate10= lastSeen.getText();
						System.out.println("Analytics Image Post Date: "+postdate10);
						Reporter.log("<B><font color = 'blue'> ==> -</font> Image Date of Post date is :"+postdate10);
						System.out.println("Analytics Image Last Seen Date: "+lastimageDate10);
						Reporter.log("<B><font color = 'blue'> ==> -</font> Image Date of Last Seen is :"+lastimageDate10);
						driver.close();
					}
				}

				driver.switchTo().window(parent);
				helper.getLastseenDate(postdate10, imageDate10);
			}
			catch (Exception e)
			{
				// TODO: handle exception
				System.out.println("Image is not able: Oops! Looks like we don't have data for this search criteria yet.");

				Reporter.log("<B><font color = 'red'> ==> -</font> Image is not able: Oops! Looks like we don't have data for this search criteria yet.");
			}	

			try {
				String postdate11=null;
				Reporter.log(" ");
				Reporter.log("<B><font color ='red'> 11 Ad -</font>  ");
				System.out.println("");
				System.out.println("11 Ads");

				Reporter.log("<B><font color = 'blue'> ==> -</font> Ads Caputure Image Date :");
				helper.Scrollintoview(date11);
				String imageDate11=date11.getText();
				Reporter.log("<B><font color = 'blue'> ==> -</font> Image Date is :"+imageDate11);
				System.out.println("Current Image Date: "+imageDate11);

				helper.waitFor(ShowAnalytics11);
				helper.highLightElement(driver, ShowAnalytics11);
				helper.Scrollintoview(ShowAnalytics11);
				String linkText11 = ShowAnalytics11.getAttribute("href");
				helper.getAdID(linkText11);
				ShowAnalytics11.click();
				Reporter.log("<B><font color = 'blue'> ==> -</font> Clicked On Show Analytics Icon");

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
						helper.Scrollintoview(postdate);
						 postdate11=postdate.getText();
						helper.Scrollintoview(lastSeen);
						String lastimageDate11= lastSeen.getText();
						System.out.println("Analytics Image Post Date: "+postdate11);
						Reporter.log("<B><font color = 'blue'> ==> -</font> Image Date of Post date is :"+postdate11);
						System.out.println("Analytics Image Last Seen Date: "+lastimageDate11);
						Reporter.log("<B><font color = 'blue'> ==> -</font> Image Date of Last Seen is :"+lastimageDate11);
						driver.close();
					}
				}

				driver.switchTo().window(parent);
				helper.getLastseenDate(postdate11, imageDate11);
			}
			catch (Exception e)
			{
				// TODO: handle exception
				System.out.println("Image is not able: Oops! Looks like we don't have data for this search criteria yet.");

				Reporter.log("<B><font color = 'red'> ==> -</font> Image is not able: Oops! Looks like we don't have data for this search criteria yet.");
			}	

			try {
				String postdate12=null;
				Reporter.log(" ");
				Reporter.log("<B><font color ='red'> 12 Ad -</font>  ");
				System.out.println("");
				System.out.println("12 Ads");

				Reporter.log("<B><font color = 'blue'> ==> -</font> Ads Caputure Image Date :");
				helper.Scrollintoview(date12);
				String imageDate12=date12.getText();
				Reporter.log("<B><font color = 'blue'> ==> -</font> Image Date is :"+imageDate12);
				System.out.println("Current Image Date: "+imageDate12);

				helper.waitFor(ShowAnalytics12);
				helper.highLightElement(driver, ShowAnalytics12);
				helper.Scrollintoview(ShowAnalytics12);
				String linkText12 = ShowAnalytics12.getAttribute("href");
				helper.getAdID(linkText12);
				ShowAnalytics12.click();
				Reporter.log("<B><font color = 'blue'> ==> -</font> Clicked On Show Analytics Icon");

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
						helper.Scrollintoview(postdate);
						postdate12=postdate.getText();
						helper.Scrollintoview(lastSeen);
						String  lastimageDate12= lastSeen.getText();
						System.out.println("Analytics Image Post Date: "+postdate12);
						Reporter.log("<B><font color = 'blue'> ==> -</font> Image Date of Post date is :"+postdate12);
						System.out.println("Analytics Image Last Seen Date: "+lastimageDate12);
						Reporter.log("<B><font color = 'blue'> ==> -</font> Image Date of Last Seen is :"+lastimageDate12);
						driver.close();
					}
				}

				driver.switchTo().window(parent);
				helper.getLastseenDate(postdate12, imageDate12);
			}
			catch (Exception e)
			{
				// TODO: handle exception
				System.out.println("Image is not able: Oops! Looks like we don't have data for this search criteria yet.");

				Reporter.log("<B><font color = 'red'> ==> -</font> Image is not able: Oops! Looks like we don't have data for this search criteria yet.");
			}	

			try {
				String postdate13=null;
				Reporter.log(" ");
				Reporter.log("<B><font color ='red'> 13 Ad -</font>  ");
				System.out.println("");
				System.out.println("13 Ads");

				Reporter.log("<B><font color = 'blue'> ==> -</font> Ads Caputure Image Date :");
				helper.Scrollintoview(date13);
				String imageDate13=date13.getText();
				Reporter.log("<B><font color = 'blue'> ==> -</font> Image Date is :"+imageDate13);
				System.out.println("Current Image Date: "+imageDate13);

				helper.waitFor(ShowAnalytics13);
				helper.highLightElement(driver, ShowAnalytics13);
				helper.Scrollintoview(ShowAnalytics13);
				String linkText13 = ShowAnalytics13.getAttribute("href");
				helper.getAdID(linkText13);
				ShowAnalytics13.click();
				Reporter.log("<B><font color = 'blue'> ==> -</font> Clicked On Show Analytics Icon");

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
						helper.Scrollintoview(postdate);
						postdate13=postdate.getText();
						helper.Scrollintoview(lastSeen);
						String lastimageDate13= lastSeen.getText();
						System.out.println("Analytics Image Post Date: "+postdate13);
						Reporter.log("<B><font color = 'blue'> ==> -</font> Image Date of Post date is :"+postdate13);
						System.out.println("Analytics Image Last Seen Date: "+lastimageDate13);
						Reporter.log("<B><font color = 'blue'> ==> -</font> Image Date of Last Seen is :"+lastimageDate13);
						driver.close();
					}
				}

				driver.switchTo().window(parent);
				helper.getLastseenDate(postdate13, imageDate13);
			}
			catch (Exception e)
			{
				// TODO: handle exception
				System.out.println("Image is not able: Oops! Looks like we don't have data for this search criteria yet.");

				Reporter.log("<B><font color = 'red'> ==> -</font> Image is not able: Oops! Looks like we don't have data for this search criteria yet.");
			}	

			try {
				String postdate14=null;
				Reporter.log(" ");
				Reporter.log("<B><font color ='red'> 14 Ad -</font>  ");
				System.out.println("");
				System.out.println("14 Ads");

				Reporter.log("<B><font color = 'blue'> ==> -</font> Ads Caputure Image Date :");
				helper.Scrollintoview(date14);
				String imageDate14=date14.getText();
				Reporter.log("<B><font color = 'blue'> ==> -</font> Image Date is :"+imageDate14);
				System.out.println("Current Image Date: "+imageDate14);

				helper.waitFor(ShowAnalytics14);
				helper.highLightElement(driver, ShowAnalytics14);
				helper.Scrollintoview(ShowAnalytics14);
				String linkText14 = ShowAnalytics14.getAttribute("href");
				helper.getAdID(linkText14);
				ShowAnalytics14.click();
				Reporter.log("<B><font color = 'blue'> ==> -</font> Clicked On Show Analytics Icon");

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
						helper.Scrollintoview(postdate);
						postdate14=postdate.getText();
						helper.Scrollintoview(lastSeen);
						String lastimageDate14= lastSeen.getText();
						System.out.println("Analytics Image Post Date: "+postdate14);
						Reporter.log("<B><font color = 'blue'> ==> -</font> Image Date of Post date is :"+postdate14);
						System.out.println("Analytics Image Last Seen Date: "+lastimageDate14);
						Reporter.log("<B><font color = 'blue'> ==> -</font> Image Date of Last Seen is :"+lastimageDate14);
						driver.close();
					}
				}

				driver.switchTo().window(parent);
				helper.getLastseenDate(postdate14, imageDate14);
			}
			catch (Exception e)
			{
				// TODO: handle exception
				System.out.println("Image is not able: Oops! Looks like we don't have data for this search criteria yet.");

				Reporter.log("<B><font color = 'red'> ==> -</font> Image is not able: Oops! Looks like we don't have data for this search criteria yet.");
			}	

			try {
				String postdate15=null;
				Reporter.log(" ");
				Reporter.log("<B><font color ='red'> 15 Ad -</font>  ");
				System.out.println("");
				System.out.println("15 Ads");

				Reporter.log("<B><font color = 'blue'> ==> -</font> Ads Caputure Image Date :");
				helper.Scrollintoview(date15);
				String imageDate15=date15.getText();
				Reporter.log("<B><font color = 'blue'> ==> -</font> Image Date is :"+imageDate15);
				System.out.println("Current Image Date: "+imageDate15);

				helper.waitFor(ShowAnalytics15);
				helper.highLightElement(driver, ShowAnalytics15);
				helper.Scrollintoview(ShowAnalytics15);
				String linkText15 = ShowAnalytics15.getAttribute("href");
				helper.getAdID(linkText15);
				ShowAnalytics15.click();
				Reporter.log("<B><font color = 'blue'> ==> -</font> Clicked On Show Analytics Icon");

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
						helper.Scrollintoview(postdate);
						postdate15=postdate.getText();
						helper.Scrollintoview(lastSeen);
						String  lastimageDate15= lastSeen.getText();
						System.out.println("Analytics Image Post Date: "+postdate15);
						Reporter.log("<B><font color = 'blue'> ==> -</font> Image Date of Post date is :"+postdate15);
						System.out.println("Analytics Image Last Seen Date: "+lastimageDate15);
						Reporter.log("<B><font color = 'blue'> ==> -</font> Image Date of Last Seen is :"+lastimageDate15);
						driver.close();
					}
				}

				driver.switchTo().window(parent);
				helper.getLastseenDate(postdate15, imageDate15);
			}
			catch (Exception e)
			{
				// TODO: handle exception
				System.out.println("Image is not able: Oops! Looks like we don't have data for this search criteria yet.");

				Reporter.log("<B><font color = 'red'> ==> -</font> Image is not able: Oops! Looks like we don't have data for this search criteria yet.");
			}
		}
	}
	public void PostDateBetween_This_Month()  throws InterruptedException
	{
	
		
		Reporter.log("       " );
		System.out.println();
		System.out.println("-ShortBy Newest -Ad Post Date Between:");
		Reporter.log("<B><font color = 'green'>  -ShortBy Newest -Post Date Between This Month Step will Start from here  </font> ");
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

		
		try 
		{
			String postdate1 = null;
			Reporter.log(" ");
			Reporter.log("<B><font color ='red'> 1 Ad -</font>  ");
			System.out.println("");
			System.out.println("1 Ads");
			Reporter.log("<B><font color = 'blue'> ==> -</font> Ads Caputure Image Date :");
			helper.Scrollintoview(date1);
			String imageDate1=date1.getText();
			Reporter.log("<B><font color = 'blue'> ==> -</font> Image Date is :"+imageDate1);
			System.out.println("Current Image Date: "+imageDate1);
			helper.waitFor(ShowAnalytics1);
			helper.highLightElement(driver, ShowAnalytics1);
			helper.jsScrollintoview(ShowAnalytics1);
			String linkText1 = ShowAnalytics1.getAttribute("href");
			helper.getAdID(linkText1);
			ShowAnalytics1.click();
			Reporter.log("<B><font color = 'blue'> ==> -</font> Clicked On Show Analytics Icon");


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
					helper.Scrollintoview(postdate);
					postdate1=postdate.getText();
					helper.Scrollintoview(lastSeen);
					String lastimageDate1 = lastSeen.getText();
					System.out.println("Analytics Image Post Date: "+postdate1);
					Reporter.log("<B><font color = 'blue'> ==> -</font> Image Date of Post date is :"+postdate1);
					System.out.println("Analytics Image Last Seen Date: "+lastimageDate1);
					Reporter.log("<B><font color = 'blue'> ==> -</font> Image Date of Last Seen is :"+lastimageDate1);
					driver.close();
				}
			}

			driver.switchTo().window(parent);

			helper.getLastseenDate(postdate1, imageDate1);
		}
		catch (Exception e)
		{
			// TODO: handle exception
			System.out.println("Image is not able: Oops! Looks like we don't have data for this search criteria yet.");

			Reporter.log("<B><font color = 'red'> ==> -</font> Image is not able: Oops! Looks like we don't have data for this search criteria yet.");
		}



		try {
			String postdate2=null;
			Reporter.log(" ");
			Reporter.log("<B><font color ='red'> 2 Ad -</font>  ");
			System.out.println("");
			System.out.println("2 Ads");

			Reporter.log("<B><font color = 'blue'> ==> -</font> Ads Caputure Image Date :");
			helper.Scrollintoview(date2);
			String imageDate2=date2.getText();
			Reporter.log("<B><font color = 'blue'> ==> -</font> Image Date is :"+imageDate2);
			System.out.println("Current Image Date: "+imageDate2);

			helper.waitFor(ShowAnalytics2);
			helper.highLightElement(driver, ShowAnalytics2);
			helper.Scrollintoview(ShowAnalytics2);
			String linkText2 = ShowAnalytics2.getAttribute("href");
			helper.getAdID(linkText2);
			ShowAnalytics2.click();
			Reporter.log("<B><font color = 'blue'> ==> -</font> Clicked On Show Analytics Icon");

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
					helper.Scrollintoview(postdate);
					 postdate2=postdate.getText();
					helper.Scrollintoview(lastSeen);
					String lastimageDate2 = lastSeen.getText();
					System.out.println("Analytics Image Post Date: "+postdate2);
					Reporter.log("<B><font color = 'blue'> ==> -</font> Image Date of Post date is :"+postdate2);
					System.out.println("Analytics Image Last Seen Date: "+lastimageDate2);
					Reporter.log("<B><font color = 'blue'> ==> -</font> Image Date of Last Seen is :"+lastimageDate2);
					driver.close();
				}
			}

			driver.switchTo().window(parent);
			helper.getLastseenDate(postdate2, imageDate2);
		}
		catch (Exception e)
		{
			// TODO: handle exception
			System.out.println("Image is not able: Oops! Looks like we don't have data for this search criteria yet.");

			Reporter.log("<B><font color = 'red'> ==> -</font> Image is not able: Oops! Looks like we don't have data for this search criteria yet.");
		}	


		try {
			String postdate3=null;
			Reporter.log(" ");
			Reporter.log("<B><font color ='red'> 3 Ad -</font>  ");
			System.out.println("");
			System.out.println("3 Ads");

			Reporter.log("<B><font color = 'blue'> ==> -</font> Ads Caputure Image Date :");
			helper.Scrollintoview(date3);
			String imageDate3=date3.getText();
			Reporter.log("<B><font color = 'blue'> ==> -</font> Image Date is :"+imageDate3);
			System.out.println("Current Image Date: "+imageDate3);

			helper.waitFor(ShowAnalytics3);
			helper.highLightElement(driver, ShowAnalytics3);
			helper.Scrollintoview(ShowAnalytics3);
			String linkText3 = ShowAnalytics3.getAttribute("href");
			helper.getAdID(linkText3);
			ShowAnalytics3.click();
			Reporter.log("<B><font color = 'blue'> ==> -</font> Clicked On Show Analytics Icon");

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
					helper.Scrollintoview(postdate);
					 postdate3=postdate.getText();
					helper.Scrollintoview(lastSeen);
					String lastimageDate3= lastSeen.getText();
					System.out.println("Analytics Image Post Date: "+postdate3);
					Reporter.log("<B><font color = 'blue'> ==> -</font> Image Date of Post date is :"+postdate3);
					System.out.println("Analytics Image Last Seen Date: "+lastimageDate3);
					Reporter.log("<B><font color = 'blue'> ==> -</font> Image Date of Last Seen is :"+lastimageDate3);
					driver.close();
				}
			}

			driver.switchTo().window(parent);
			helper.getLastseenDate(postdate3, imageDate3);
		}
		catch (Exception e)
		{
			// TODO: handle exception
			System.out.println("Image is not able: Oops! Looks like we don't have data for this search criteria yet.");

			Reporter.log("<B><font color = 'red'> ==> -</font> Image is not able: Oops! Looks like we don't have data for this search criteria yet.");
		}	


		try {
			String postdate4=null;
			Reporter.log(" ");
			Reporter.log("<B><font color ='red'> 4 Ad -</font>  ");
			System.out.println("");
			System.out.println("4 Ads");

			Reporter.log("<B><font color = 'blue'> ==> -</font> Ads Caputure Image Date :");
			helper.Scrollintoview(date4);
			String imageDate4=date4.getText();
			Reporter.log("<B><font color = 'blue'> ==> -</font> Image Date is :"+imageDate4);
			System.out.println("Current Image Date: "+imageDate4);

			helper.waitFor(ShowAnalytics4);
			helper.highLightElement(driver, ShowAnalytics4);
			helper.Scrollintoview(ShowAnalytics4);
			String linkText4 = ShowAnalytics4.getAttribute("href");
			helper.getAdID(linkText4);
			ShowAnalytics4.click();
			Reporter.log("<B><font color = 'blue'> ==> -</font> Clicked On Show Analytics Icon");

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
					helper.Scrollintoview(postdate);
					 postdate4=postdate.getText();
					helper.Scrollintoview(lastSeen);
					String lastimageDate4= lastSeen.getText();
					System.out.println("Analytics Image Post Date: "+postdate4);
					Reporter.log("<B><font color = 'blue'> ==> -</font> Image Date of Post date is :"+postdate4);
					System.out.println("Analytics Image Last Seen Date: "+lastimageDate4);
					Reporter.log("<B><font color = 'blue'> ==> -</font> Image Date of Last Seen is :"+lastimageDate4);
					driver.close();
				}
			}

			driver.switchTo().window(parent);
			helper.getLastseenDate(postdate4, imageDate4);
		}
		catch (Exception e)
		{
			// TODO: handle exception
			System.out.println("Image is not able: Oops! Looks like we don't have data for this search criteria yet.");

			Reporter.log("<B><font color = 'red'> ==> -</font> Image is not able: Oops! Looks like we don't have data for this search criteria yet.");
		}	


		try {
			String postdate5=null;
			Reporter.log(" ");
			Reporter.log("<B><font color ='red'> 5 Ad -</font>  ");
			System.out.println("");
			System.out.println("5 Ads");

			Reporter.log("<B><font color = 'blue'> ==> -</font> Ads Caputure Image Date :");
			helper.Scrollintoview(date5);
			String imageDate5=date5.getText();
			Reporter.log("<B><font color = 'blue'> ==> -</font> Image Date is :"+imageDate5);
			System.out.println("Current Image Date: "+imageDate5);

			helper.waitFor(ShowAnalytics5);
			helper.highLightElement(driver, ShowAnalytics5);
			helper.Scrollintoview(ShowAnalytics5);
			String linkText5 = ShowAnalytics5.getAttribute("href");
			helper.getAdID(linkText5);
			ShowAnalytics5.click();
			Reporter.log("<B><font color = 'blue'> ==> -</font> Clicked On Show Analytics Icon");

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
					helper.Scrollintoview(postdate);
					 postdate5=postdate.getText();
					helper.Scrollintoview(lastSeen);
					String lastimageDate5= lastSeen.getText();
					System.out.println("Analytics Image Post Date: "+postdate5);
					Reporter.log("<B><font color = 'blue'> ==> -</font> Image Date of Post date is :"+postdate5);
					System.out.println("Analytics Image Last Seen Date: "+lastimageDate5);
					Reporter.log("<B><font color = 'blue'> ==> -</font> Image Date of Last Seen is :"+lastimageDate5);
					driver.close();
				}
			}

			driver.switchTo().window(parent);
			helper.getLastseenDate(postdate5, imageDate5);
		}
		catch (Exception e)
		{
			// TODO: handle exception
			System.out.println("Image is not able: Oops! Looks like we don't have data for this search criteria yet.");

			Reporter.log("<B><font color = 'red'> ==> -</font> Image is not able: Oops! Looks like we don't have data for this search criteria yet.");
		}	

		try {
			String postdate6=null;
			Reporter.log(" ");
			Reporter.log("<B><font color ='red'> 6 Ad -</font>  ");
			System.out.println("");
			System.out.println("6 Ads");

			Reporter.log("<B><font color = 'blue'> ==> -</font> Ads Caputure Image Date :");
			helper.Scrollintoview(date6);
			String imageDate6=date6.getText();
			Reporter.log("<B><font color = 'blue'> ==> -</font> Image Date is :"+imageDate6);
			System.out.println("Current Image Date: "+imageDate6);

			helper.waitFor(ShowAnalytics6);
			helper.highLightElement(driver, ShowAnalytics6);
			helper.Scrollintoview(ShowAnalytics6);
			String linkText6 = ShowAnalytics6.getAttribute("href");
			helper.getAdID(linkText6);
			ShowAnalytics6.click();
			Reporter.log("<B><font color = 'blue'> ==> -</font> Clicked On Show Analytics Icon");

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
					helper.Scrollintoview(postdate);
					postdate6=postdate.getText();
					helper.Scrollintoview(lastSeen);
					String lastimageDate6= lastSeen.getText();
					System.out.println("Analytics Image Post Date: "+postdate6);
					Reporter.log("<B><font color = 'blue'> ==> -</font> Image Date of Post date is :"+postdate6);
					System.out.println("Analytics Image Last Seen Date: "+lastimageDate6);
					Reporter.log("<B><font color = 'blue'> ==> -</font> Image Date of Last Seen is :"+lastimageDate6);
					driver.close();
				}
			}

			driver.switchTo().window(parent);
			helper.getLastseenDate(postdate6, imageDate6);
		}
		catch (Exception e)
		{
			// TODO: handle exception
			System.out.println("Image is not able: Oops! Looks like we don't have data for this search criteria yet.");

			Reporter.log("<B><font color = 'red'> ==> -</font> Image is not able: Oops! Looks like we don't have data for this search criteria yet.");
		}

		try {
			String postdate7=null;
			Reporter.log(" ");
			Reporter.log("<B><font color ='red'> 7 Ad -</font>  ");
			System.out.println("");
			System.out.println("7 Ads");

			Reporter.log("<B><font color = 'blue'> ==> -</font> Ads Caputure Image Date :");
			helper.Scrollintoview(date7);
			String imageDate7=date7.getText();
			Reporter.log("<B><font color = 'blue'> ==> -</font> Image Date is :"+imageDate7);
			System.out.println("Current Image Date: "+imageDate7);

			helper.waitFor(ShowAnalytics7);
			helper.highLightElement(driver, ShowAnalytics7);
			helper.Scrollintoview(ShowAnalytics7);
			String linkText7 = ShowAnalytics7.getAttribute("href");
			helper.getAdID(linkText7);
			ShowAnalytics7.click();
			Reporter.log("<B><font color = 'blue'> ==> -</font> Clicked On Show Analytics Icon");

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
					helper.Scrollintoview(postdate);
					postdate7=postdate.getText();
					helper.Scrollintoview(lastSeen);
					String lastimageDate7= lastSeen.getText();
					System.out.println("Analytics Image Post Date: "+postdate7);
					Reporter.log("<B><font color = 'blue'> ==> -</font> Image Date of Post date is :"+postdate7);
					System.out.println("Analytics Image Last Seen Date: "+lastimageDate7);
					Reporter.log("<B><font color = 'blue'> ==> -</font> Image Date of Last Seen is :"+lastimageDate7);
					driver.close();
				}
			}

			driver.switchTo().window(parent);
			helper.getLastseenDate(postdate7, imageDate7);
		}
		catch (Exception e)
		{
			// TODO: handle exception
			System.out.println("Image is not able: Oops! Looks like we don't have data for this search criteria yet.");

			Reporter.log("<B><font color = 'red'> ==> -</font> Image is not able: Oops! Looks like we don't have data for this search criteria yet.");
		}	

		try {
			String postdate8=null;
			Reporter.log(" ");
			Reporter.log("<B><font color ='red'> 8 Ad -</font>  ");
			System.out.println("");
			System.out.println("8 Ads");

			Reporter.log("<B><font color = 'blue'> ==> -</font> Ads Caputure Image Date :");
			helper.Scrollintoview(date8);
			String imageDate8=date8.getText();
			Reporter.log("<B><font color = 'blue'> ==> -</font> Image Date is :"+imageDate8);
			System.out.println("Current Image Date: "+imageDate8);

			helper.waitFor(ShowAnalytics8);
			helper.highLightElement(driver, ShowAnalytics8);
			helper.Scrollintoview(ShowAnalytics8);
			String linkText8 = ShowAnalytics8.getAttribute("href");
			helper.getAdID(linkText8);
			ShowAnalytics8.click();
			Reporter.log("<B><font color = 'blue'> ==> -</font> Clicked On Show Analytics Icon");

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
					helper.Scrollintoview(postdate);
				    postdate8=postdate.getText();
					helper.Scrollintoview(lastSeen);
				    String lastimageDate8= lastSeen.getText();
					System.out.println("Analytics Image Post Date: "+postdate8);
					Reporter.log("<B><font color = 'blue'> ==> -</font> Image Date of Post date is :"+postdate8);
					System.out.println("Analytics Image Last Seen Date: "+lastimageDate8);
					Reporter.log("<B><font color = 'blue'> ==> -</font> Image Date of Last Seen is :"+lastimageDate8);
					driver.close();
				}
			}

			driver.switchTo().window(parent);
			helper.getLastseenDate(postdate8, imageDate8);
		}
		catch (Exception e)
		{
			System.out.println("Image is not able: Oops! Looks like we don't have data for this search criteria yet.");

			Reporter.log("<B><font color = 'red'> ==> -</font> Image is not able: Oops! Looks like we don't have data for this search criteria yet.");
		}	

		try {
			String postdate9=null;
			Reporter.log(" ");
			Reporter.log("<B><font color ='red'> 9 Ad -</font>  ");
			System.out.println("");
			System.out.println("9 Ads");

			Reporter.log("<B><font color = 'blue'> ==> -</font> Ads Caputure Image Date :");
			helper.Scrollintoview(date9);
			String imageDate9=date9.getText();
			Reporter.log("<B><font color = 'blue'> ==> -</font> Image Date is :"+imageDate9);
			System.out.println("Current Image Date: "+imageDate9);

			helper.waitFor(ShowAnalytics9);
			helper.highLightElement(driver, ShowAnalytics9);
			helper.Scrollintoview(ShowAnalytics9);
			String linkText9 = ShowAnalytics9.getAttribute("href");
			helper.getAdID(linkText9);
			ShowAnalytics9.click();
			Reporter.log("<B><font color = 'blue'> ==> -</font> Clicked On Show Analytics Icon");

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
					helper.Scrollintoview(postdate);
					postdate9=postdate.getText();
					helper.Scrollintoview(lastSeen);
					String lastimageDate9= lastSeen.getText();
					System.out.println("Analytics Image Post Date: "+postdate9);
					Reporter.log("<B><font color = 'blue'> ==> -</font> Image Date of Post date is :"+postdate9);
					System.out.println("Analytics Image Last Seen Date: "+lastimageDate9);
					Reporter.log("<B><font color = 'blue'> ==> -</font> Image Date of Last Seen is :"+lastimageDate9);
					driver.close();
				}
			}

			driver.switchTo().window(parent);
			helper.getLastseenDate(postdate9, imageDate9);
		}
		catch (Exception e)
		{
			// TODO: handle exception
			System.out.println("Image is not able: Oops! Looks like we don't have data for this search criteria yet.");

			Reporter.log("<B><font color = 'red'> ==> -</font> Image is not able: Oops! Looks like we don't have data for this search criteria yet.");
		}	



		try {
			String postdate10=null;
			Reporter.log(" ");
			Reporter.log("<B><font color ='red'> 10 Ad -</font>  ");
			System.out.println("");
			System.out.println("10 Ads");

			Reporter.log("<B><font color = 'blue'> ==> -</font> Ads Caputure Image Date :");
			helper.Scrollintoview(date10);
			String imageDate10=date10.getText();
			Reporter.log("<B><font color = 'blue'> ==> -</font> Image Date is :"+imageDate10);
			System.out.println("Current Image Date: "+imageDate10);

			helper.waitFor(ShowAnalytics10);
			helper.highLightElement(driver, ShowAnalytics10);
			helper.Scrollintoview(ShowAnalytics10);
			String linkText10 = ShowAnalytics10.getAttribute("href");
			helper.getAdID(linkText10);
			ShowAnalytics10.click();
			Reporter.log("<B><font color = 'blue'> ==> -</font> Clicked On Show Analytics Icon");

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
					helper.Scrollintoview(postdate);
					postdate10=postdate.getText();
					helper.Scrollintoview(lastSeen);
					String lastimageDate10= lastSeen.getText();
					System.out.println("Analytics Image Post Date: "+postdate10);
					Reporter.log("<B><font color = 'blue'> ==> -</font> Image Date of Post date is :"+postdate10);
					System.out.println("Analytics Image Last Seen Date: "+lastimageDate10);
					Reporter.log("<B><font color = 'blue'> ==> -</font> Image Date of Last Seen is :"+lastimageDate10);
					driver.close();
				}
			}

			driver.switchTo().window(parent);
			helper.getLastseenDate(postdate10, imageDate10);
		}
		catch (Exception e)
		{
			// TODO: handle exception
			System.out.println("Image is not able: Oops! Looks like we don't have data for this search criteria yet.");

			Reporter.log("<B><font color = 'red'> ==> -</font> Image is not able: Oops! Looks like we don't have data for this search criteria yet.");
		}	

		try {
			String postdate11=null;
			Reporter.log(" ");
			Reporter.log("<B><font color ='red'> 11 Ad -</font>  ");
			System.out.println("");
			System.out.println("11 Ads");

			Reporter.log("<B><font color = 'blue'> ==> -</font> Ads Caputure Image Date :");
			helper.Scrollintoview(date11);
			String imageDate11=date11.getText();
			Reporter.log("<B><font color = 'blue'> ==> -</font> Image Date is :"+imageDate11);
			System.out.println("Current Image Date: "+imageDate11);

			helper.waitFor(ShowAnalytics11);
			helper.highLightElement(driver, ShowAnalytics11);
			helper.Scrollintoview(ShowAnalytics11);
			String linkText11 = ShowAnalytics11.getAttribute("href");
			helper.getAdID(linkText11);
			ShowAnalytics11.click();
			Reporter.log("<B><font color = 'blue'> ==> -</font> Clicked On Show Analytics Icon");

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
					helper.Scrollintoview(postdate);
					 postdate11=postdate.getText();
					helper.Scrollintoview(lastSeen);
					String lastimageDate11= lastSeen.getText();
					System.out.println("Analytics Image Post Date: "+postdate11);
					Reporter.log("<B><font color = 'blue'> ==> -</font> Image Date of Post date is :"+postdate11);
					System.out.println("Analytics Image Last Seen Date: "+lastimageDate11);
					Reporter.log("<B><font color = 'blue'> ==> -</font> Image Date of Last Seen is :"+lastimageDate11);
					driver.close();
				}
			}

			driver.switchTo().window(parent);
			helper.getLastseenDate(postdate11, imageDate11);
		}
		catch (Exception e)
		{
			// TODO: handle exception
			System.out.println("Image is not able: Oops! Looks like we don't have data for this search criteria yet.");

			Reporter.log("<B><font color = 'red'> ==> -</font> Image is not able: Oops! Looks like we don't have data for this search criteria yet.");
		}	

		try {
			String postdate12=null;
			Reporter.log(" ");
			Reporter.log("<B><font color ='red'> 12 Ad -</font>  ");
			System.out.println("");
			System.out.println("12 Ads");

			Reporter.log("<B><font color = 'blue'> ==> -</font> Ads Caputure Image Date :");
			helper.Scrollintoview(date12);
			String imageDate12=date12.getText();
			Reporter.log("<B><font color = 'blue'> ==> -</font> Image Date is :"+imageDate12);
			System.out.println("Current Image Date: "+imageDate12);

			helper.waitFor(ShowAnalytics12);
			helper.highLightElement(driver, ShowAnalytics12);
			helper.Scrollintoview(ShowAnalytics12);
			String linkText12 = ShowAnalytics12.getAttribute("href");
			helper.getAdID(linkText12);
			ShowAnalytics12.click();
			Reporter.log("<B><font color = 'blue'> ==> -</font> Clicked On Show Analytics Icon");

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
					helper.Scrollintoview(postdate);
					postdate12=postdate.getText();
					helper.Scrollintoview(lastSeen);
					String  lastimageDate12= lastSeen.getText();
					System.out.println("Analytics Image Post Date: "+postdate12);
					Reporter.log("<B><font color = 'blue'> ==> -</font> Image Date of Post date is :"+postdate12);
					System.out.println("Analytics Image Last Seen Date: "+lastimageDate12);
					Reporter.log("<B><font color = 'blue'> ==> -</font> Image Date of Last Seen is :"+lastimageDate12);
					driver.close();
				}
			}

			driver.switchTo().window(parent);
			helper.getLastseenDate(postdate12, imageDate12);
		}
		catch (Exception e)
		{
			// TODO: handle exception
			System.out.println("Image is not able: Oops! Looks like we don't have data for this search criteria yet.");

			Reporter.log("<B><font color = 'red'> ==> -</font> Image is not able: Oops! Looks like we don't have data for this search criteria yet.");
		}	

		try {
			String postdate13=null;
			Reporter.log(" ");
			Reporter.log("<B><font color ='red'> 13 Ad -</font>  ");
			System.out.println("");
			System.out.println("13 Ads");

			Reporter.log("<B><font color = 'blue'> ==> -</font> Ads Caputure Image Date :");
			helper.Scrollintoview(date13);
			String imageDate13=date13.getText();
			Reporter.log("<B><font color = 'blue'> ==> -</font> Image Date is :"+imageDate13);
			System.out.println("Current Image Date: "+imageDate13);

			helper.waitFor(ShowAnalytics13);
			helper.highLightElement(driver, ShowAnalytics13);
			helper.Scrollintoview(ShowAnalytics13);
			String linkText13 = ShowAnalytics13.getAttribute("href");
			helper.getAdID(linkText13);
			ShowAnalytics13.click();
			Reporter.log("<B><font color = 'blue'> ==> -</font> Clicked On Show Analytics Icon");

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
					helper.Scrollintoview(postdate);
					postdate13=postdate.getText();
					helper.Scrollintoview(lastSeen);
					String lastimageDate13= lastSeen.getText();
					System.out.println("Analytics Image Post Date: "+postdate13);
					Reporter.log("<B><font color = 'blue'> ==> -</font> Image Date of Post date is :"+postdate13);
					System.out.println("Analytics Image Last Seen Date: "+lastimageDate13);
					Reporter.log("<B><font color = 'blue'> ==> -</font> Image Date of Last Seen is :"+lastimageDate13);
					driver.close();
				}
			}

			driver.switchTo().window(parent);
			helper.getLastseenDate(postdate13, imageDate13);
		}
		catch (Exception e)
		{
			// TODO: handle exception
			System.out.println("Image is not able: Oops! Looks like we don't have data for this search criteria yet.");

			Reporter.log("<B><font color = 'red'> ==> -</font> Image is not able: Oops! Looks like we don't have data for this search criteria yet.");
		}	

		try {
			String postdate14=null;
			Reporter.log(" ");
			Reporter.log("<B><font color ='red'> 14 Ad -</font>  ");
			System.out.println("");
			System.out.println("14 Ads");

			Reporter.log("<B><font color = 'blue'> ==> -</font> Ads Caputure Image Date :");
			helper.Scrollintoview(date14);
			String imageDate14=date14.getText();
			Reporter.log("<B><font color = 'blue'> ==> -</font> Image Date is :"+imageDate14);
			System.out.println("Current Image Date: "+imageDate14);

			helper.waitFor(ShowAnalytics14);
			helper.highLightElement(driver, ShowAnalytics14);
			helper.Scrollintoview(ShowAnalytics14);
			String linkText14 = ShowAnalytics14.getAttribute("href");
			helper.getAdID(linkText14);
			ShowAnalytics14.click();
			Reporter.log("<B><font color = 'blue'> ==> -</font> Clicked On Show Analytics Icon");

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
					helper.Scrollintoview(postdate);
					postdate14=postdate.getText();
					helper.Scrollintoview(lastSeen);
					String lastimageDate14= lastSeen.getText();
					System.out.println("Analytics Image Post Date: "+postdate14);
					Reporter.log("<B><font color = 'blue'> ==> -</font> Image Date of Post date is :"+postdate14);
					System.out.println("Analytics Image Last Seen Date: "+lastimageDate14);
					Reporter.log("<B><font color = 'blue'> ==> -</font> Image Date of Last Seen is :"+lastimageDate14);
					driver.close();
				}
			}

			driver.switchTo().window(parent);
			helper.getLastseenDate(postdate14, imageDate14);
		}
		catch (Exception e)
		{
			// TODO: handle exception
			System.out.println("Image is not able: Oops! Looks like we don't have data for this search criteria yet.");

			Reporter.log("<B><font color = 'red'> ==> -</font> Image is not able: Oops! Looks like we don't have data for this search criteria yet.");
		}	

		try {
			String postdate15=null;
			Reporter.log(" ");
			Reporter.log("<B><font color ='red'> 15 Ad -</font>  ");
			System.out.println("");
			System.out.println("15 Ads");

			Reporter.log("<B><font color = 'blue'> ==> -</font> Ads Caputure Image Date :");
			helper.Scrollintoview(date15);
			String imageDate15=date15.getText();
			Reporter.log("<B><font color = 'blue'> ==> -</font> Image Date is :"+imageDate15);
			System.out.println("Current Image Date: "+imageDate15);

			helper.waitFor(ShowAnalytics15);
			helper.highLightElement(driver, ShowAnalytics15);
			helper.Scrollintoview(ShowAnalytics15);
			String linkText15 = ShowAnalytics15.getAttribute("href");
			helper.getAdID(linkText15);
			ShowAnalytics15.click();
			Reporter.log("<B><font color = 'blue'> ==> -</font> Clicked On Show Analytics Icon");

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
					helper.Scrollintoview(postdate);
					postdate15=postdate.getText();
					helper.Scrollintoview(lastSeen);
					String  lastimageDate15= lastSeen.getText();
					System.out.println("Analytics Image Post Date: "+postdate15);
					Reporter.log("<B><font color = 'blue'> ==> -</font> Image Date of Post date is :"+postdate15);
					System.out.println("Analytics Image Last Seen Date: "+lastimageDate15);
					Reporter.log("<B><font color = 'blue'> ==> -</font> Image Date of Last Seen is :"+lastimageDate15);
					driver.close();
				}
			}

			driver.switchTo().window(parent);
			helper.getLastseenDate(postdate15, imageDate15);
		}
		catch (Exception e)
		{
			// TODO: handle exception
			System.out.println("Image is not able: Oops! Looks like we don't have data for this search criteria yet.");

			Reporter.log("<B><font color = 'red'> ==> -</font> Image is not able: Oops! Looks like we don't have data for this search criteria yet.");
		}
	}
	

	public void PostDateBetween_Last_Month() throws Exception
	{
		
		helper.waitForPageToLoad();
		Reporter.log("       " );
		Reporter.log("<B><font color = 'red'>  - ShortBy Newest Step will Start from here </font>  ");
		

		System.out.println();
		System.out.println("-ShortBy Newest -Ad Post Date Between:");
		Reporter.log("<B><font color = 'green'>  -ShortBy Newest -Post Date Between Last month Step will Start from here  </font> ");
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

		try 
		{
			String postdate1 = null;
			Reporter.log(" ");
			Reporter.log("<B><font color ='red'> 1 Ad -</font>  ");
			System.out.println("");
			System.out.println("1 Ads");
			Reporter.log("<B><font color = 'blue'> ==> -</font> Ads Caputure Image Date :");
			helper.Scrollintoview(date1);
			String imageDate1=date1.getText();
			Reporter.log("<B><font color = 'blue'> ==> -</font> Image Date is :"+imageDate1);
			System.out.println("Current Image Date: "+imageDate1);
			helper.waitFor(ShowAnalytics1);
			helper.highLightElement(driver, ShowAnalytics1);
			helper.jsScrollintoview(ShowAnalytics1);
			String linkText1 = ShowAnalytics1.getAttribute("href");
			helper.getAdID(linkText1);
			ShowAnalytics1.click();
			Reporter.log("<B><font color = 'blue'> ==> -</font> Clicked On Show Analytics Icon");


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
					helper.Scrollintoview(postdate);
					postdate1=postdate.getText();
					helper.Scrollintoview(lastSeen);
					String lastimageDate1 = lastSeen.getText();
					System.out.println("Analytics Image Post Date: "+postdate1);
					Reporter.log("<B><font color = 'blue'> ==> -</font> Image Date of Post date is :"+postdate1);
					System.out.println("Analytics Image Last Seen Date: "+lastimageDate1);
					Reporter.log("<B><font color = 'blue'> ==> -</font> Image Date of Last Seen is :"+lastimageDate1);
					driver.close();
				}
			}

			driver.switchTo().window(parent);

			helper.getLastseenDate(postdate1, imageDate1);
		}
		catch (Exception e)
		{
			// TODO: handle exception
			System.out.println("Image is not able: Oops! Looks like we don't have data for this search criteria yet.");

			Reporter.log("<B><font color = 'red'> ==> -</font> Image is not able: Oops! Looks like we don't have data for this search criteria yet.");
		}



		try {
			String postdate2=null;
			Reporter.log(" ");
			Reporter.log("<B><font color ='red'> 2 Ad -</font>  ");
			System.out.println("");
			System.out.println("2 Ads");

			Reporter.log("<B><font color = 'blue'> ==> -</font> Ads Caputure Image Date :");
			helper.Scrollintoview(date2);
			String imageDate2=date2.getText();
			Reporter.log("<B><font color = 'blue'> ==> -</font> Image Date is :"+imageDate2);
			System.out.println("Current Image Date: "+imageDate2);

			helper.waitFor(ShowAnalytics2);
			helper.highLightElement(driver, ShowAnalytics2);
			helper.Scrollintoview(ShowAnalytics2);
			String linkText2 = ShowAnalytics2.getAttribute("href");
			helper.getAdID(linkText2);
			ShowAnalytics2.click();
			Reporter.log("<B><font color = 'blue'> ==> -</font> Clicked On Show Analytics Icon");

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
					helper.Scrollintoview(postdate);
					 postdate2=postdate.getText();
					helper.Scrollintoview(lastSeen);
					String lastimageDate2 = lastSeen.getText();
					System.out.println("Analytics Image Post Date: "+postdate2);
					Reporter.log("<B><font color = 'blue'> ==> -</font> Image Date of Post date is :"+postdate2);
					System.out.println("Analytics Image Last Seen Date: "+lastimageDate2);
					Reporter.log("<B><font color = 'blue'> ==> -</font> Image Date of Last Seen is :"+lastimageDate2);
					driver.close();
				}
			}

			driver.switchTo().window(parent);
			helper.getLastseenDate(postdate2, imageDate2);
		}
		catch (Exception e)
		{
			// TODO: handle exception
			System.out.println("Image is not able: Oops! Looks like we don't have data for this search criteria yet.");

			Reporter.log("<B><font color = 'red'> ==> -</font> Image is not able: Oops! Looks like we don't have data for this search criteria yet.");
		}	


		try {
			String postdate3=null;
			Reporter.log(" ");
			Reporter.log("<B><font color ='red'> 3 Ad -</font>  ");
			System.out.println("");
			System.out.println("3 Ads");

			Reporter.log("<B><font color = 'blue'> ==> -</font> Ads Caputure Image Date :");
			helper.Scrollintoview(date3);
			String imageDate3=date3.getText();
			Reporter.log("<B><font color = 'blue'> ==> -</font> Image Date is :"+imageDate3);
			System.out.println("Current Image Date: "+imageDate3);

			helper.waitFor(ShowAnalytics3);
			helper.highLightElement(driver, ShowAnalytics3);
			helper.Scrollintoview(ShowAnalytics3);
			String linkText3 = ShowAnalytics3.getAttribute("href");
			helper.getAdID(linkText3);
			ShowAnalytics3.click();
			Reporter.log("<B><font color = 'blue'> ==> -</font> Clicked On Show Analytics Icon");

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
					helper.Scrollintoview(postdate);
					 postdate3=postdate.getText();
					helper.Scrollintoview(lastSeen);
					String lastimageDate3= lastSeen.getText();
					System.out.println("Analytics Image Post Date: "+postdate3);
					Reporter.log("<B><font color = 'blue'> ==> -</font> Image Date of Post date is :"+postdate3);
					System.out.println("Analytics Image Last Seen Date: "+lastimageDate3);
					Reporter.log("<B><font color = 'blue'> ==> -</font> Image Date of Last Seen is :"+lastimageDate3);
					driver.close();
				}
			}

			driver.switchTo().window(parent);
			helper.getLastseenDate(postdate3, imageDate3);
		}
		catch (Exception e)
		{
			// TODO: handle exception
			System.out.println("Image is not able: Oops! Looks like we don't have data for this search criteria yet.");

			Reporter.log("<B><font color = 'red'> ==> -</font> Image is not able: Oops! Looks like we don't have data for this search criteria yet.");
		}	


		try {
			String postdate4=null;
			Reporter.log(" ");
			Reporter.log("<B><font color ='red'> 4 Ad -</font>  ");
			System.out.println("");
			System.out.println("4 Ads");

			Reporter.log("<B><font color = 'blue'> ==> -</font> Ads Caputure Image Date :");
			helper.Scrollintoview(date4);
			String imageDate4=date4.getText();
			Reporter.log("<B><font color = 'blue'> ==> -</font> Image Date is :"+imageDate4);
			System.out.println("Current Image Date: "+imageDate4);

			helper.waitFor(ShowAnalytics4);
			helper.highLightElement(driver, ShowAnalytics4);
			helper.Scrollintoview(ShowAnalytics4);
			String linkText4 = ShowAnalytics4.getAttribute("href");
			helper.getAdID(linkText4);
			ShowAnalytics4.click();
			Reporter.log("<B><font color = 'blue'> ==> -</font> Clicked On Show Analytics Icon");

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
					helper.Scrollintoview(postdate);
					 postdate4=postdate.getText();
					helper.Scrollintoview(lastSeen);
					String lastimageDate4= lastSeen.getText();
					System.out.println("Analytics Image Post Date: "+postdate4);
					Reporter.log("<B><font color = 'blue'> ==> -</font> Image Date of Post date is :"+postdate4);
					System.out.println("Analytics Image Last Seen Date: "+lastimageDate4);
					Reporter.log("<B><font color = 'blue'> ==> -</font> Image Date of Last Seen is :"+lastimageDate4);
					driver.close();
				}
			}

			driver.switchTo().window(parent);
			helper.getLastseenDate(postdate4, imageDate4);
		}
		catch (Exception e)
		{
			// TODO: handle exception
			System.out.println("Image is not able: Oops! Looks like we don't have data for this search criteria yet.");

			Reporter.log("<B><font color = 'red'> ==> -</font> Image is not able: Oops! Looks like we don't have data for this search criteria yet.");
		}	


		try {
			String postdate5=null;
			Reporter.log(" ");
			Reporter.log("<B><font color ='red'> 5 Ad -</font>  ");
			System.out.println("");
			System.out.println("5 Ads");

			Reporter.log("<B><font color = 'blue'> ==> -</font> Ads Caputure Image Date :");
			helper.Scrollintoview(date5);
			String imageDate5=date5.getText();
			Reporter.log("<B><font color = 'blue'> ==> -</font> Image Date is :"+imageDate5);
			System.out.println("Current Image Date: "+imageDate5);

			helper.waitFor(ShowAnalytics5);
			helper.highLightElement(driver, ShowAnalytics5);
			helper.Scrollintoview(ShowAnalytics5);
			String linkText5 = ShowAnalytics5.getAttribute("href");
			helper.getAdID(linkText5);
			ShowAnalytics5.click();
			Reporter.log("<B><font color = 'blue'> ==> -</font> Clicked On Show Analytics Icon");

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
					helper.Scrollintoview(postdate);
					 postdate5=postdate.getText();
					helper.Scrollintoview(lastSeen);
					String lastimageDate5= lastSeen.getText();
					System.out.println("Analytics Image Post Date: "+postdate5);
					Reporter.log("<B><font color = 'blue'> ==> -</font> Image Date of Post date is :"+postdate5);
					System.out.println("Analytics Image Last Seen Date: "+lastimageDate5);
					Reporter.log("<B><font color = 'blue'> ==> -</font> Image Date of Last Seen is :"+lastimageDate5);
					driver.close();
				}
			}

			driver.switchTo().window(parent);
			helper.getLastseenDate(postdate5, imageDate5);
		}
		catch (Exception e)
		{
			// TODO: handle exception
			System.out.println("Image is not able: Oops! Looks like we don't have data for this search criteria yet.");

			Reporter.log("<B><font color = 'orange'> Step8 -</font> Image is not able: Oops! Looks like we don't have data for this search criteria yet.");
		}	

		try {
			String postdate6=null;
			Reporter.log(" ");
			Reporter.log("<B><font color ='red'> 6 Ad -</font>  ");
			System.out.println("");
			System.out.println("6 Ads");

			Reporter.log("<B><font color = 'blue'> ==> -</font> Ads Caputure Image Date :");
			helper.Scrollintoview(date6);
			String imageDate6=date6.getText();
			Reporter.log("<B><font color = 'blue'> ==> -</font> Image Date is :"+imageDate6);
			System.out.println("Current Image Date: "+imageDate6);

			helper.waitFor(ShowAnalytics6);
			helper.highLightElement(driver, ShowAnalytics6);
			helper.Scrollintoview(ShowAnalytics6);
			String linkText6 = ShowAnalytics6.getAttribute("href");
			helper.getAdID(linkText6);
			ShowAnalytics6.click();
			Reporter.log("<B><font color = 'blue'> ==> -</font> Clicked On Show Analytics Icon");

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
					helper.Scrollintoview(postdate);
					postdate6=postdate.getText();
					helper.Scrollintoview(lastSeen);
					String lastimageDate6= lastSeen.getText();
					System.out.println("Analytics Image Post Date: "+postdate6);
					Reporter.log("<B><font color = 'blue'> ==> -</font> Image Date of Post date is :"+postdate6);
					System.out.println("Analytics Image Last Seen Date: "+lastimageDate6);
					Reporter.log("<B><font color = 'blue'> ==> -</font> Image Date of Last Seen is :"+lastimageDate6);
					driver.close();
				}
			}

			driver.switchTo().window(parent);
			helper.getLastseenDate(postdate6, imageDate6);
		}
		catch (Exception e)
		{
			// TODO: handle exception
			System.out.println("Image is not able: Oops! Looks like we don't have data for this search criteria yet.");

			Reporter.log("<B><font color = 'red'> ==> -</font> Image is not able: Oops! Looks like we don't have data for this search criteria yet.");
		}

		try {
			String postdate7=null;
			Reporter.log(" ");
			Reporter.log("<B><font color ='red'> 7 Ad -</font>  ");
			System.out.println("");
			System.out.println("7 Ads");

			Reporter.log("<B><font color = 'blue'> ==> -</font> Ads Caputure Image Date :");
			helper.Scrollintoview(date7);
			String imageDate7=date7.getText();
			Reporter.log("<B><font color = 'blue'> ==> -</font> Image Date is :"+imageDate7);
			System.out.println("Current Image Date: "+imageDate7);

			helper.waitFor(ShowAnalytics7);
			helper.highLightElement(driver, ShowAnalytics7);
			helper.Scrollintoview(ShowAnalytics7);
			String linkText7 = ShowAnalytics7.getAttribute("href");
			helper.getAdID(linkText7);
			ShowAnalytics7.click();
			Reporter.log("<B><font color = 'blue'> ==> -</font> Clicked On Show Analytics Icon");

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
					helper.Scrollintoview(postdate);
					postdate7=postdate.getText();
					helper.Scrollintoview(lastSeen);
					String lastimageDate7= lastSeen.getText();
					System.out.println("Analytics Image Post Date: "+postdate7);
					Reporter.log("<B><font color = 'blue'> ==> -</font> Image Date of Post date is :"+postdate7);
					System.out.println("Analytics Image Last Seen Date: "+lastimageDate7);
					Reporter.log("<B><font color = 'blue'> ==> -</font> Image Date of Last Seen is :"+lastimageDate7);
					driver.close();
				}
			}

			driver.switchTo().window(parent);
			helper.getLastseenDate(postdate7, imageDate7);
		}
		catch (Exception e)
		{
			// TODO: handle exception
			System.out.println("Image is not able: Oops! Looks like we don't have data for this search criteria yet.");

			Reporter.log("<B><font color = 'red'> ==> -</font> Image is not able: Oops! Looks like we don't have data for this search criteria yet.");
		}	

		try {
			String postdate8=null;
			Reporter.log(" ");
			Reporter.log("<B><font color ='red'> 8 Ad -</font>  ");
			System.out.println("");
			System.out.println("8 Ads");

			Reporter.log("<B><font color = 'blue'> ==> -</font> Ads Caputure Image Date :");
			helper.Scrollintoview(date8);
			String imageDate8=date8.getText();
			Reporter.log("<B><font color = 'blue'> ==> -</font> Image Date is :"+imageDate8);
			System.out.println("Current Image Date: "+imageDate8);

			helper.waitFor(ShowAnalytics8);
			helper.highLightElement(driver, ShowAnalytics8);
			helper.Scrollintoview(ShowAnalytics8);
			String linkText8 = ShowAnalytics8.getAttribute("href");
			helper.getAdID(linkText8);
			ShowAnalytics8.click();
			Reporter.log("<B><font color = 'blue'> ==> -</font> Clicked On Show Analytics Icon");

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
					helper.Scrollintoview(postdate);
				    postdate8=postdate.getText();
					helper.Scrollintoview(lastSeen);
				    String lastimageDate8= lastSeen.getText();
					System.out.println("Analytics Image Post Date: "+postdate8);
					Reporter.log("<B><font color = 'blue'> ==> -</font> Image Date of Post date is :"+postdate8);
					System.out.println("Analytics Image Last Seen Date: "+lastimageDate8);
					Reporter.log("<B><font color = 'blue'> ==> -</font> Image Date of Last Seen is :"+lastimageDate8);
					driver.close();
				}
			}

			driver.switchTo().window(parent);
			helper.getLastseenDate(postdate8, imageDate8);
		}
		catch (Exception e)
		{
			// TODO: handle exception
			System.out.println("Image is not able: Oops! Looks like we don't have data for this search criteria yet.");

			Reporter.log("<B><font color = 'red'> ==> -</font> Image is not able: Oops! Looks like we don't have data for this search criteria yet.");
		}	

		try {
			String postdate9=null;
			Reporter.log(" ");
			Reporter.log("<B><font color ='red'> 9 Ad -</font>  ");
			System.out.println("");
			System.out.println("9 Ads");

			Reporter.log("<B><font color = 'blue'> ==> -</font> Ads Caputure Image Date :");
			helper.Scrollintoview(date9);
			String imageDate9=date9.getText();
			Reporter.log("<B><font color = 'blue'> ==> -</font> Image Date is :"+imageDate9);
			System.out.println("Current Image Date: "+imageDate9);

			helper.waitFor(ShowAnalytics9);
			helper.highLightElement(driver, ShowAnalytics9);
			helper.Scrollintoview(ShowAnalytics9);
			String linkText9 = ShowAnalytics9.getAttribute("href");
			helper.getAdID(linkText9);
			ShowAnalytics9.click();
			Reporter.log("<B><font color = 'blue'> ==> -</font> Clicked On Show Analytics Icon");

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
					helper.Scrollintoview(postdate);
					postdate9=postdate.getText();
					helper.Scrollintoview(lastSeen);
					String lastimageDate9= lastSeen.getText();
					System.out.println("Analytics Image Post Date: "+postdate9);
					Reporter.log("<B><font color = 'blue'> ==> -</font> Image Date of Post date is :"+postdate9);
					System.out.println("Analytics Image Last Seen Date: "+lastimageDate9);
					Reporter.log("<B><font color = 'blue'> ==> -</font> Image Date of Last Seen is :"+lastimageDate9);
					driver.close();
				}
			}

			driver.switchTo().window(parent);
			helper.getLastseenDate(postdate9, imageDate9);
		}
		catch (Exception e)
		{
			// TODO: handle exception
			System.out.println("Image is not able: Oops! Looks like we don't have data for this search criteria yet.");

			Reporter.log("<B><font color = 'red'> ==> -</font> Image is not able: Oops! Looks like we don't have data for this search criteria yet.");
		}	



		try {
			String postdate10=null;
			Reporter.log(" ");
			Reporter.log("<B><font color ='red'> 10 Ad -</font>  ");
			System.out.println("");
			System.out.println("10 Ads");

			Reporter.log("<B><font color = 'blue'> ==> -</font> Ads Caputure Image Date :");
			helper.Scrollintoview(date10);
			String imageDate10=date10.getText();
			Reporter.log("<B><font color = 'blue'> ==> -</font> Image Date is :"+imageDate10);
			System.out.println("Current Image Date: "+imageDate10);

			helper.waitFor(ShowAnalytics10);
			helper.highLightElement(driver, ShowAnalytics10);
			helper.Scrollintoview(ShowAnalytics10);
			String linkText10 = ShowAnalytics10.getAttribute("href");
			helper.getAdID(linkText10);
			ShowAnalytics10.click();
			Reporter.log("<B><font color = 'blue'> ==> -</font> Clicked On Show Analytics Icon");

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
					helper.Scrollintoview(postdate);
					postdate10=postdate.getText();
					helper.Scrollintoview(lastSeen);
					String lastimageDate10= lastSeen.getText();
					System.out.println("Analytics Image Post Date: "+postdate10);
					Reporter.log("<B><font color = 'blue'> ==> -</font> Image Date of Post date is :"+postdate10);
					System.out.println("Analytics Image Last Seen Date: "+lastimageDate10);
					Reporter.log("<B><font color = 'blue'> ==> -</font> Image Date of Last Seen is :"+lastimageDate10);
					driver.close();
				}
			}

			driver.switchTo().window(parent);
			helper.getLastseenDate(postdate10, imageDate10);
		}
		catch (Exception e)
		{
			// TODO: handle exception
			System.out.println("Image is not able: Oops! Looks like we don't have data for this search criteria yet.");

			Reporter.log("<B><font color = 'red'> ==> -</font> Image is not able: Oops! Looks like we don't have data for this search criteria yet.");
		}	

		try {
			String postdate11=null;
			Reporter.log(" ");
			Reporter.log("<B><font color ='red'> 11 Ad -</font>  ");
			System.out.println("");
			System.out.println("11 Ads");

			Reporter.log("<B><font color = 'blue'> ==> -</font> Ads Caputure Image Date :");
			helper.Scrollintoview(date11);
			String imageDate11=date11.getText();
			Reporter.log("<B><font color = 'blue'> ==> -</font> Image Date is :"+imageDate11);
			System.out.println("Current Image Date: "+imageDate11);

			helper.waitFor(ShowAnalytics11);
			helper.highLightElement(driver, ShowAnalytics11);
			helper.Scrollintoview(ShowAnalytics11);
			String linkText11 = ShowAnalytics11.getAttribute("href");
			helper.getAdID(linkText11);
			ShowAnalytics11.click();
			Reporter.log("<B><font color = 'blue'> ==> -</font> Clicked On Show Analytics Icon");

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
					helper.Scrollintoview(postdate);
					 postdate11=postdate.getText();
					helper.Scrollintoview(lastSeen);
					String lastimageDate11= lastSeen.getText();
					System.out.println("Analytics Image Post Date: "+postdate11);
					Reporter.log("<B><font color = 'blue'> ==> -</font> Image Date of Post date is :"+postdate11);
					System.out.println("Analytics Image Last Seen Date: "+lastimageDate11);
					Reporter.log("<B><font color = 'blue'> ==> -</font> Image Date of Last Seen is :"+lastimageDate11);
					driver.close();
				}
			}

			driver.switchTo().window(parent);
			helper.getLastseenDate(postdate11, imageDate11);
		}
		catch (Exception e)
		{
			// TODO: handle exception
			System.out.println("Image is not able: Oops! Looks like we don't have data for this search criteria yet.");

			Reporter.log("<B><font color = 'red'> ==> -</font> Image is not able: Oops! Looks like we don't have data for this search criteria yet.");
		}	

		try {
			String postdate12=null;
			Reporter.log(" ");
			Reporter.log("<B><font color ='red'> 12 Ad -</font>  ");
			System.out.println("");
			System.out.println("12 Ads");

			Reporter.log("<B><font color = 'blue'> ==> -</font> Ads Caputure Image Date :");
			helper.Scrollintoview(date12);
			String imageDate12=date12.getText();
			Reporter.log("<B><font color = 'blue'> ==> -</font> Image Date is :"+imageDate12);
			System.out.println("Current Image Date: "+imageDate12);

			helper.waitFor(ShowAnalytics12);
			helper.highLightElement(driver, ShowAnalytics12);
			helper.Scrollintoview(ShowAnalytics12);
			String linkText12 = ShowAnalytics12.getAttribute("href");
			helper.getAdID(linkText12);
			ShowAnalytics12.click();
			Reporter.log("<B><font color = 'blue'> ==> -</font> Clicked On Show Analytics Icon");

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
					helper.Scrollintoview(postdate);
					postdate12=postdate.getText();
					helper.Scrollintoview(lastSeen);
					String  lastimageDate12= lastSeen.getText();
					System.out.println("Analytics Image Post Date: "+postdate12);
					Reporter.log("<B><font color = 'blue'> ==> -</font> Image Date of Post date is :"+postdate12);
					System.out.println("Analytics Image Last Seen Date: "+lastimageDate12);
					Reporter.log("<B><font color = 'blue'> ==> -</font> Image Date of Last Seen is :"+lastimageDate12);
					driver.close();
				}
			}

			driver.switchTo().window(parent);
			helper.getLastseenDate(postdate12, imageDate12);
		}
		catch (Exception e)
		{
			// TODO: handle exception
			System.out.println("Image is not able: Oops! Looks like we don't have data for this search criteria yet.");

			Reporter.log("<B><font color = 'red'> ==> -</font> Image is not able: Oops! Looks like we don't have data for this search criteria yet.");
		}	

		try {
			String postdate13=null;
			Reporter.log(" ");
			Reporter.log("<B><font color ='red'> 13 Ad -</font>  ");
			System.out.println("");
			System.out.println("13 Ads");

			Reporter.log("<B><font color = 'blue'> ==> -</font> Ads Caputure Image Date :");
			helper.Scrollintoview(date13);
			String imageDate13=date13.getText();
			Reporter.log("<B><font color = 'blue'> ==> -</font> Image Date is :"+imageDate13);
			System.out.println("Current Image Date: "+imageDate13);

			helper.waitFor(ShowAnalytics13);
			helper.highLightElement(driver, ShowAnalytics13);
			helper.Scrollintoview(ShowAnalytics13);
			String linkText13 = ShowAnalytics13.getAttribute("href");
			helper.getAdID(linkText13);
			ShowAnalytics13.click();
			Reporter.log("<B><font color = 'blue'> ==> -</font> Clicked On Show Analytics Icon");

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
					helper.Scrollintoview(postdate);
					postdate13=postdate.getText();
					helper.Scrollintoview(lastSeen);
					String lastimageDate13= lastSeen.getText();
					System.out.println("Analytics Image Post Date: "+postdate13);
					Reporter.log("<B><font color = 'blue'> ==> -</font> Image Date of Post date is :"+postdate13);
					System.out.println("Analytics Image Last Seen Date: "+lastimageDate13);
					Reporter.log("<B><font color = 'blue'> ==> -</font> Image Date of Last Seen is :"+lastimageDate13);
					driver.close();
				}
			}

			driver.switchTo().window(parent);
			helper.getLastseenDate(postdate13, imageDate13);
		}
		catch (Exception e)
		{
			// TODO: handle exception
			System.out.println("Image is not able: Oops! Looks like we don't have data for this search criteria yet.");

			Reporter.log("<B><font color = 'red'> ==> -</font> Image is not able: Oops! Looks like we don't have data for this search criteria yet.");
		}	

		try {
			String postdate14=null;
			Reporter.log(" ");
			Reporter.log("<B><font color ='red'> 14 Ad -</font>  ");
			System.out.println("");
			System.out.println("14 Ads");

			Reporter.log("<B><font color = 'blue'> ==> -</font> Ads Caputure Image Date :");
			helper.Scrollintoview(date14);
			String imageDate14=date14.getText();
			Reporter.log("<B><font color = 'blue'> ==> -</font> Image Date is :"+imageDate14);
			System.out.println("Current Image Date: "+imageDate14);

			helper.waitFor(ShowAnalytics14);
			helper.highLightElement(driver, ShowAnalytics14);
			helper.Scrollintoview(ShowAnalytics14);
			String linkText14 = ShowAnalytics14.getAttribute("href");
			helper.getAdID(linkText14);
			ShowAnalytics14.click();
			Reporter.log("<B><font color = 'blue'> ==> -</font> Clicked On Show Analytics Icon");

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
					helper.Scrollintoview(postdate);
					postdate14=postdate.getText();
					helper.Scrollintoview(lastSeen);
					String lastimageDate14= lastSeen.getText();
					System.out.println("Analytics Image Post Date: "+postdate14);
					Reporter.log("<B><font color = 'blue'> ==> -</font> Image Date of Post date is :"+postdate14);
					System.out.println("Analytics Image Last Seen Date: "+lastimageDate14);
					Reporter.log("<B><font color = 'blue'> ==> -</font> Image Date of Last Seen is :"+lastimageDate14);
					driver.close();
				}
			}

			driver.switchTo().window(parent);
			helper.getLastseenDate(postdate14, imageDate14);
		}
		catch (Exception e)
		{
			// TODO: handle exception
			System.out.println("Image is not able: Oops! Looks like we don't have data for this search criteria yet.");

			Reporter.log("<B><font color = 'red'> ==> -</font> Image is not able: Oops! Looks like we don't have data for this search criteria yet.");
		}	

		try {
			String postdate15=null;
			Reporter.log(" ");
			Reporter.log("<B><font color ='red'> 15 Ad -</font>  ");
			System.out.println("");
			System.out.println("15 Ads");

			Reporter.log("<B><font color = 'blue'> ==> -</font> Ads Caputure Image Date :");
			helper.Scrollintoview(date15);
			String imageDate15=date15.getText();
			Reporter.log("<B><font color = 'blue'> ==> -</font> Image Date is :"+imageDate15);
			System.out.println("Current Image Date: "+imageDate15);

			helper.waitFor(ShowAnalytics15);
			helper.highLightElement(driver, ShowAnalytics15);
			helper.Scrollintoview(ShowAnalytics15);
			String linkText15 = ShowAnalytics15.getAttribute("href");
			helper.getAdID(linkText15);
			ShowAnalytics15.click();
			Reporter.log("<B><font color = 'blue'> ==> -</font> Clicked On Show Analytics Icon");

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
					helper.Scrollintoview(postdate);
					postdate15=postdate.getText();
					helper.Scrollintoview(lastSeen);
					String  lastimageDate15= lastSeen.getText();
					System.out.println("Analytics Image Post Date: "+postdate15);
					Reporter.log("<B><font color = 'blue'> ==> -</font> Image Date of Post date is :"+postdate15);
					System.out.println("Analytics Image Last Seen Date: "+lastimageDate15);
					Reporter.log("<B><font color = 'blue'> ==> -</font> Image Date of Last Seen is :"+lastimageDate15);
					driver.close();
				}
			}

			driver.switchTo().window(parent);
			helper.getLastseenDate(postdate15, imageDate15);
		}
		catch (Exception e)
		{
			// TODO: handle exception
			System.out.println("Image is not able: Oops! Looks like we don't have data for this search criteria yet.");

			Reporter.log("<B><font color = 'red'> ==> -</font> Image is not able: Oops! Looks like we don't have data for this search criteria yet.");
		}
	}

	public void PostDateBetween_CustomRange() throws Exception
	{

		System.out.println();
		Reporter.log("      ");
		System.out.println("-SortBy Newest -Post Date  Between Custom Range: ");
		helper.waitForPageToLoad();
		Reporter.log("<B><font color = 'green'>  -ShortBy Newest -Post Date Between Custom Range Step will Start from here </font> ");
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

		helper.waitFor(Custom_Range_Next_Line);
		helper.highLightElement(driver, Custom_Range_Next_Line);
		helper.Scrollintoview(Custom_Range_Next_Line);
		Custom_Range_Next_Line.click();
		Custom_Range_Next_Line.click();

		
		helper.waitFor(post_date_Between_Start_range1);
		helper.highLightElement(driver,post_date_Between_Start_range1);
		helper.jsScrollintoview(post_date_Between_Start_range1);
		post_date_Between_Start_range1.click();
		Reporter.log("<B><font color = 'orange'> Step3 -</font> Clicked On Ad Seen Between Start Custom Range Icon");

		helper.waitFor(post_date_Between_end_range2);
		helper.highLightElement(driver,post_date_Between_end_range2);
		helper.jsScrollintoview(post_date_Between_end_range2);
		helper.Scrollintoview(post_date_Between_end_range2);
		post_date_Between_end_range2.click();
		
		Reporter.log("<B><font color = 'orange'> Step4 -</font> Clicked On Ad Seen Between End Custom Range Icon:");
		

		helper.waitFor(searchButton);
		helper.highLightElement(driver, searchButton);
		helper.jsScrollintoview(searchButton);
		searchButton.click();
		Reporter.log("<B><font color = 'orange'> Step8 -</font> Clicked On Search Button Icon");
		helper.waitForPageToLoad();

		String totaladscount=totaladscount_ad.getText();
		System.out.println("Totaladscount: "+totaladscount);
		Reporter.log("<B><font color = 'orange'> Step9 -</font>  Total Ad Count is :"+ totaladscount);

		try 
		{
			String postdate1 = null;
			Reporter.log(" ");
			Reporter.log("<B><font color ='red'> 1 Ad -</font>  ");
			System.out.println("");
			System.out.println("1 Ads");
			Reporter.log("<B><font color = 'blue'> ==> -</font> Ads Caputure Image Date :");
			helper.Scrollintoview(date1);
			String imageDate1=date1.getText();
			Reporter.log("<B><font color = 'blue'> ==> -</font> Image Date is :"+imageDate1);
			System.out.println("Current Image Date: "+imageDate1);
			helper.waitFor(ShowAnalytics1);
			helper.highLightElement(driver, ShowAnalytics1);
			helper.jsScrollintoview(ShowAnalytics1);
			String linkText1 = ShowAnalytics1.getAttribute("href");
			helper.getAdID(linkText1);
			ShowAnalytics1.click();
			Reporter.log("<B><font color = 'blue'> ==> -</font> Clicked On Show Analytics Icon");


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
					helper.Scrollintoview(postdate);
					postdate1=postdate.getText();
					helper.Scrollintoview(lastSeen);
					String lastimageDate1 = lastSeen.getText();
					System.out.println("Analytics Image Post Date: "+postdate1);
					Reporter.log("<B><font color = 'blue'> ==> -</font> Image Date of Post date is :"+postdate1);
					System.out.println("Analytics Image Last Seen Date: "+lastimageDate1);
					Reporter.log("<B><font color = 'blue'> ==> -</font> Image Date of Last Seen is :"+lastimageDate1);
					driver.close();
				}
			}

			driver.switchTo().window(parent);

			helper.getLastseenDate(postdate1, imageDate1);
		}
		catch (Exception e)
		{
			// TODO: handle exception
			System.out.println("Image is not able: Oops! Looks like we don't have data for this search criteria yet.");

			Reporter.log("<B><font color = 'red'> ==> -</font> Image is not able: Oops! Looks like we don't have data for this search criteria yet.");
		}



		try {
			String postdate2=null;
			Reporter.log(" ");
			Reporter.log("<B><font color ='red'> 2 Ad -</font>  ");
			System.out.println("");
			System.out.println("2 Ads");

			Reporter.log("<B><font color = 'blue'> ==> -</font> Ads Caputure Image Date :");
			helper.Scrollintoview(date2);
			String imageDate2=date2.getText();
			Reporter.log("<B><font color = 'blue'> ==> -</font> Image Date is :"+imageDate2);
			System.out.println("Current Image Date: "+imageDate2);

			helper.waitFor(ShowAnalytics2);
			helper.highLightElement(driver, ShowAnalytics2);
			helper.Scrollintoview(ShowAnalytics2);
			String linkText2 = ShowAnalytics2.getAttribute("href");
			helper.getAdID(linkText2);
			ShowAnalytics2.click();
			Reporter.log("<B><font color = 'blue'> ==> -</font> Clicked On Show Analytics Icon");

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
					helper.Scrollintoview(postdate);
					 postdate2=postdate.getText();
					helper.Scrollintoview(lastSeen);
					String lastimageDate2 = lastSeen.getText();
					System.out.println("Analytics Image Post Date: "+postdate2);
					Reporter.log("<B><font color = 'blue'> ==> -</font> Image Date of Post date is :"+postdate2);
					System.out.println("Analytics Image Last Seen Date: "+lastimageDate2);
					Reporter.log("<B><font color = 'blue'> ==> -</font> Image Date of Last Seen is :"+lastimageDate2);
					driver.close();
				}
			}

			driver.switchTo().window(parent);
			helper.getLastseenDate(postdate2, imageDate2);
		}
		catch (Exception e)
		{
			// TODO: handle exception
			System.out.println("Image is not able: Oops! Looks like we don't have data for this search criteria yet.");

			Reporter.log("<B><font color = 'red'> ==> -</font> Image is not able: Oops! Looks like we don't have data for this search criteria yet.");
		}	


		try {
			String postdate3=null;
			Reporter.log(" ");
			Reporter.log("<B><font color ='red'> 3 Ad -</font>  ");
			System.out.println("");
			System.out.println("3 Ads");

			Reporter.log("<B><font color = 'blue'> ==> -</font> Ads Caputure Image Date :");
			helper.Scrollintoview(date3);
			String imageDate3=date3.getText();
			Reporter.log("<B><font color = 'blue'> ==> -</font> Image Date is :"+imageDate3);
			System.out.println("Current Image Date: "+imageDate3);

			helper.waitFor(ShowAnalytics3);
			helper.highLightElement(driver, ShowAnalytics3);
			helper.Scrollintoview(ShowAnalytics3);
			String linkText3 = ShowAnalytics3.getAttribute("href");
			helper.getAdID(linkText3);
			ShowAnalytics3.click();
			Reporter.log("<B><font color = 'blue'> ==> -</font> Clicked On Show Analytics Icon");

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
					helper.Scrollintoview(postdate);
					 postdate3=postdate.getText();
					helper.Scrollintoview(lastSeen);
					String lastimageDate3= lastSeen.getText();
					System.out.println("Analytics Image Post Date: "+postdate3);
					Reporter.log("<B><font color = 'blue'> ==> -</font> Image Date of Post date is :"+postdate3);
					System.out.println("Analytics Image Last Seen Date: "+lastimageDate3);
					Reporter.log("<B><font color = 'blue'> ==> -</font> Image Date of Last Seen is :"+lastimageDate3);
					driver.close();
				}
			}

			driver.switchTo().window(parent);
			helper.getLastseenDate(postdate3, imageDate3);
		}
		catch (Exception e)
		{
			// TODO: handle exception
			System.out.println("Image is not able: Oops! Looks like we don't have data for this search criteria yet.");

			Reporter.log("<B><font color = 'red'> ==> -</font> Image is not able: Oops! Looks like we don't have data for this search criteria yet.");
		}	


		try {
			String postdate4=null;
			Reporter.log(" ");
			Reporter.log("<B><font color ='red'> 4 Ad -</font>  ");
			System.out.println("");
			System.out.println("4 Ads");

			Reporter.log("<B><font color = 'blue'> ==> -</font> Ads Caputure Image Date :");
			helper.Scrollintoview(date4);
			String imageDate4=date4.getText();
			Reporter.log("<B><font color = 'blue'> ==> -</font> Image Date is :"+imageDate4);
			System.out.println("Current Image Date: "+imageDate4);

			helper.waitFor(ShowAnalytics4);
			helper.highLightElement(driver, ShowAnalytics4);
			helper.Scrollintoview(ShowAnalytics4);
			String linkText4 = ShowAnalytics4.getAttribute("href");
			helper.getAdID(linkText4);
			ShowAnalytics4.click();
			Reporter.log("<B><font color = 'blue'> ==> -</font> Clicked On Show Analytics Icon");

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
					helper.Scrollintoview(postdate);
					 postdate4=postdate.getText();
					helper.Scrollintoview(lastSeen);
					String lastimageDate4= lastSeen.getText();
					System.out.println("Analytics Image Post Date: "+postdate4);
					Reporter.log("<B><font color = 'blue'> ==> -</font> Image Date of Post date is :"+postdate4);
					System.out.println("Analytics Image Last Seen Date: "+lastimageDate4);
					Reporter.log("<B><font color = 'blue'> ==> -</font> Image Date of Last Seen is :"+lastimageDate4);
					driver.close();
				}
			}

			driver.switchTo().window(parent);
			helper.getLastseenDate(postdate4, imageDate4);
		}
		catch (Exception e)
		{
			// TODO: handle exception
			System.out.println("Image is not able: Oops! Looks like we don't have data for this search criteria yet.");

			Reporter.log("<B><font color = 'red'> ==> -</font> Image is not able: Oops! Looks like we don't have data for this search criteria yet.");
		}	


		try {
			String postdate5=null;
			Reporter.log(" ");
			Reporter.log("<B><font color ='red'> 5 Ad -</font>  ");
			System.out.println("");
			System.out.println("5 Ads");

			Reporter.log("<B><font color = 'blue'> ==> -</font> Ads Caputure Image Date :");
			helper.Scrollintoview(date5);
			String imageDate5=date5.getText();
			Reporter.log("<B><font color = 'blue'> ==> -</font> Image Date is :"+imageDate5);
			System.out.println("Current Image Date: "+imageDate5);

			helper.waitFor(ShowAnalytics5);
			helper.highLightElement(driver, ShowAnalytics5);
			helper.Scrollintoview(ShowAnalytics5);
			String linkText5 = ShowAnalytics5.getAttribute("href");
			helper.getAdID(linkText5);
			ShowAnalytics5.click();
			Reporter.log("<B><font color = 'blue'> ==> -</font> Clicked On Show Analytics Icon");

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
					helper.Scrollintoview(postdate);
					 postdate5=postdate.getText();
					helper.Scrollintoview(lastSeen);
					String lastimageDate5= lastSeen.getText();
					System.out.println("Analytics Image Post Date: "+postdate5);
					Reporter.log("<B><font color = 'blue'> ==> -</font> Image Date of Post date is :"+postdate5);
					System.out.println("Analytics Image Last Seen Date: "+lastimageDate5);
					Reporter.log("<B><font color = 'blue'> ==> -</font> Image Date of Last Seen is :"+lastimageDate5);
					driver.close();
				}
			}

			driver.switchTo().window(parent);
			helper.getLastseenDate(postdate5, imageDate5);
		}
		catch (Exception e)
		{
			// TODO: handle exception
			System.out.println("Image is not able: Oops! Looks like we don't have data for this search criteria yet.");

			Reporter.log("<B><font color = 'red'> ==> -</font> Image is not able: Oops! Looks like we don't have data for this search criteria yet.");
		}	

		try {
			String postdate6=null;
			Reporter.log(" ");
			Reporter.log("<B><font color ='red'> 6 Ad -</font>  ");
			System.out.println("");
			System.out.println("6 Ads");

			Reporter.log("<B><font color = 'blue'> ==> -</font> Ads Caputure Image Date :");
			helper.Scrollintoview(date6);
			String imageDate6=date6.getText();
			Reporter.log("<B><font color = 'blue'> ==> -</font> Image Date is :"+imageDate6);
			System.out.println("Current Image Date: "+imageDate6);

			helper.waitFor(ShowAnalytics6);
			helper.highLightElement(driver, ShowAnalytics6);
			helper.Scrollintoview(ShowAnalytics6);
			String linkText6 = ShowAnalytics6.getAttribute("href");
			helper.getAdID(linkText6);
			ShowAnalytics6.click();
			Reporter.log("<B><font color = 'blue'> ==> -</font> Clicked On Show Analytics Icon");

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
					helper.Scrollintoview(postdate);
					postdate6=postdate.getText();
					helper.Scrollintoview(lastSeen);
					String lastimageDate6= lastSeen.getText();
					System.out.println("Analytics Image Post Date: "+postdate6);
					Reporter.log("<B><font color = 'blue'> ==> -</font> Image Date of Post date is :"+postdate6);
					System.out.println("Analytics Image Last Seen Date: "+lastimageDate6);
					Reporter.log("<B><font color = 'blue'> ==> -</font> Image Date of Last Seen is :"+lastimageDate6);
					driver.close();
				}
			}

			driver.switchTo().window(parent);
			helper.getLastseenDate(postdate6, imageDate6);
		}
		catch (Exception e)
		{
			// TODO: handle exception
			System.out.println("Image is not able: Oops! Looks like we don't have data for this search criteria yet.");

			Reporter.log("<B><font color = 'red'> ==> -</font> Image is not able: Oops! Looks like we don't have data for this search criteria yet.");
		}

		try {
			String postdate7=null;
			Reporter.log(" ");
			Reporter.log("<B><font color ='red'> 7 Ad -</font>  ");
			System.out.println("");
			System.out.println("7 Ads");

			Reporter.log("<B><font color = 'blue'> ==> -</font> Ads Caputure Image Date :");
			helper.Scrollintoview(date7);
			String imageDate7=date7.getText();
			Reporter.log("<B><font color = 'blue'> ==> -</font> Image Date is :"+imageDate7);
			System.out.println("Current Image Date: "+imageDate7);

			helper.waitFor(ShowAnalytics7);
			helper.highLightElement(driver, ShowAnalytics7);
			helper.Scrollintoview(ShowAnalytics7);
			String linkText7 = ShowAnalytics7.getAttribute("href");
			helper.getAdID(linkText7);
			ShowAnalytics7.click();
			Reporter.log("<B><font color = 'blue'> ==> -</font> Clicked On Show Analytics Icon");

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
					helper.Scrollintoview(postdate);
					postdate7=postdate.getText();
					helper.Scrollintoview(lastSeen);
					String lastimageDate7= lastSeen.getText();
					System.out.println("Analytics Image Post Date: "+postdate7);
					Reporter.log("<B><font color = 'blue'> ==> -</font> Image Date of Post date is :"+postdate7);
					System.out.println("Analytics Image Last Seen Date: "+lastimageDate7);
					Reporter.log("<B><font color = 'blue'> ==> -</font> Image Date of Last Seen is :"+lastimageDate7);
					driver.close();
				}
			}

			driver.switchTo().window(parent);
			helper.getLastseenDate(postdate7, imageDate7);
		}
		catch (Exception e)
		{
			// TODO: handle exception
			System.out.println("Image is not able: Oops! Looks like we don't have data for this search criteria yet.");

			Reporter.log("<B><font color = 'red'> ==> -</font> Image is not able: Oops! Looks like we don't have data for this search criteria yet.");
		}	

		try {
			String postdate8=null;
			Reporter.log(" ");
			Reporter.log("<B><font color ='red'> 8 Ad -</font>  ");
			System.out.println("");
			System.out.println("8 Ads");

			Reporter.log("<B><font color = 'blue'> ==> -</font> Ads Caputure Image Date :");
			helper.Scrollintoview(date8);
			String imageDate8=date8.getText();
			Reporter.log("<B><font color = 'blue'> ==> -</font> Image Date is :"+imageDate8);
			System.out.println("Current Image Date: "+imageDate8);

			helper.waitFor(ShowAnalytics8);
			helper.highLightElement(driver, ShowAnalytics8);
			helper.Scrollintoview(ShowAnalytics8);
			String linkText8 = ShowAnalytics8.getAttribute("href");
			helper.getAdID(linkText8);
			ShowAnalytics8.click();
			Reporter.log("<B><font color = 'blue'> ==> -</font> Clicked On Show Analytics Icon");

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
					helper.Scrollintoview(postdate);
				    postdate8=postdate.getText();
					helper.Scrollintoview(lastSeen);
				    String lastimageDate8= lastSeen.getText();
					System.out.println("Analytics Image Post Date: "+postdate8);
					Reporter.log("<B><font color = 'blue'> ==> -</font> Image Date of Post date is :"+postdate8);
					System.out.println("Analytics Image Last Seen Date: "+lastimageDate8);
					Reporter.log("<B><font color = 'blue'> ==> -</font> Image Date of Last Seen is :"+lastimageDate8);
					driver.close();
				}
			}

			driver.switchTo().window(parent);
			helper.getLastseenDate(postdate8, imageDate8);
		}
		catch (Exception e)
		{
			// TODO: handle exception
			System.out.println("Image is not able: Oops! Looks like we don't have data for this search criteria yet.");

			Reporter.log("<B><font color = 'red'> ==> -</font> Image is not able: Oops! Looks like we don't have data for this search criteria yet.");
		}	

		try {
			String postdate9=null;
			Reporter.log(" ");
			Reporter.log("<B><font color ='red'> 9 Ad -</font>  ");
			System.out.println("");
			System.out.println("9 Ads");

			Reporter.log("<B><font color = 'blue'> ==> -</font> Ads Caputure Image Date :");
			helper.Scrollintoview(date9);
			String imageDate9=date9.getText();
			Reporter.log("<B><font color = 'blue'> ==> -</font> Image Date is :"+imageDate9);
			System.out.println("Current Image Date: "+imageDate9);

			helper.waitFor(ShowAnalytics9);
			helper.highLightElement(driver, ShowAnalytics9);
			helper.Scrollintoview(ShowAnalytics9);
			String linkText9 = ShowAnalytics9.getAttribute("href");
			helper.getAdID(linkText9);
			ShowAnalytics9.click();
			Reporter.log("<B><font color = 'blue'> ==> -</font> Clicked On Show Analytics Icon");

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
					helper.Scrollintoview(postdate);
					 postdate9=postdate.getText();
					helper.Scrollintoview(lastSeen);
					String lastimageDate9= lastSeen.getText();
					System.out.println("Analytics Image Post Date: "+postdate9);
					Reporter.log("<B><font color = 'blue'> ==> -</font> Image Date of Post date is :"+postdate9);
					System.out.println("Analytics Image Last Seen Date: "+lastimageDate9);
					Reporter.log("<B><font color = 'blue'> ==> -</font> Image Date of Last Seen is :"+lastimageDate9);
					driver.close();
				}
			}

			driver.switchTo().window(parent);
			helper.getLastseenDate(postdate9, imageDate9);
		}
		catch (Exception e)
		{
			// TODO: handle exception
			System.out.println("Image is not able: Oops! Looks like we don't have data for this search criteria yet.");

			Reporter.log("<B><font color = 'red'> ==> -</font> Image is not able: Oops! Looks like we don't have data for this search criteria yet.");
		}	



		try {
			String postdate10=null;
			Reporter.log(" ");
			Reporter.log("<B><font color ='red'> 10 Ad -</font>  ");
			System.out.println("");
			System.out.println("10 Ads");

			Reporter.log("<B><font color = 'blue'> ==> -</font> Ads Caputure Image Date :");
			helper.Scrollintoview(date10);
			String imageDate10=date10.getText();
			Reporter.log("<B><font color = 'blue'> ==> -</font> Image Date is :"+imageDate10);
			System.out.println("Current Image Date: "+imageDate10);

			helper.waitFor(ShowAnalytics10);
			helper.highLightElement(driver, ShowAnalytics10);
			helper.Scrollintoview(ShowAnalytics10);
			String linkText10 = ShowAnalytics10.getAttribute("href");
			helper.getAdID(linkText10);
			ShowAnalytics10.click();
			Reporter.log("<B><font color = 'blue'> ==> -</font> Clicked On Show Analytics Icon");

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
					helper.Scrollintoview(postdate);
					postdate10=postdate.getText();
					helper.Scrollintoview(lastSeen);
					String lastimageDate10= lastSeen.getText();
					System.out.println("Analytics Image Post Date: "+postdate10);
					Reporter.log("<B><font color = 'blue'> ==> -</font> Image Date of Post date is :"+postdate10);
					System.out.println("Analytics Image Last Seen Date: "+lastimageDate10);
					Reporter.log("<B><font color = 'blue'> ==> -</font> Image Date of Last Seen is :"+lastimageDate10);
					driver.close();
				}
			}

			driver.switchTo().window(parent);
			helper.getLastseenDate(postdate10, imageDate10);
		}
		catch (Exception e)
		{
			// TODO: handle exception
			System.out.println("Image is not able: Oops! Looks like we don't have data for this search criteria yet.");

			Reporter.log("<B><font color = 'red'> ==> -</font> Image is not able: Oops! Looks like we don't have data for this search criteria yet.");
		}	

		try {
			String postdate11=null;
			Reporter.log(" ");
			Reporter.log("<B><font color ='red'> 11 Ad -</font>  ");
			System.out.println("");
			System.out.println("11 Ads");

			Reporter.log("<B><font color = 'blue'> ==> -</font> Ads Caputure Image Date :");
			helper.Scrollintoview(date11);
			String imageDate11=date11.getText();
			Reporter.log("<B><font color = 'blue'> ==> -</font> Image Date is :"+imageDate11);
			System.out.println("Current Image Date: "+imageDate11);

			helper.waitFor(ShowAnalytics11);
			helper.highLightElement(driver, ShowAnalytics11);
			helper.Scrollintoview(ShowAnalytics11);
			String linkText11 = ShowAnalytics11.getAttribute("href");
			helper.getAdID(linkText11);
			ShowAnalytics11.click();
			Reporter.log("<B><font color = 'blue'> ==> -</font> Clicked On Show Analytics Icon");

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
					helper.Scrollintoview(postdate);
					 postdate11=postdate.getText();
					helper.Scrollintoview(lastSeen);
					String lastimageDate11= lastSeen.getText();
					System.out.println("Analytics Image Post Date: "+postdate11);
					Reporter.log("<B><font color = 'blue'> ==> -</font> Image Date of Post date is :"+postdate11);
					System.out.println("Analytics Image Last Seen Date: "+lastimageDate11);
					Reporter.log("<B><font color = 'blue'> ==> -</font> Image Date of Last Seen is :"+lastimageDate11);
					driver.close();
				}
			}

			driver.switchTo().window(parent);
			helper.getLastseenDate(postdate11, imageDate11);
		}
		catch (Exception e)
		{
			// TODO: handle exception
			System.out.println("Image is not able: Oops! Looks like we don't have data for this search criteria yet.");

			Reporter.log("<B><font color = 'red'> ==> -</font> Image is not able: Oops! Looks like we don't have data for this search criteria yet.");
		}	

		try {
			String postdate12=null;
			Reporter.log(" ");
			Reporter.log("<B><font color ='red'> 12 Ad -</font>  ");
			System.out.println("");
			System.out.println("12 Ads");

			Reporter.log("<B><font color = 'blue'> ==> -</font> Ads Caputure Image Date :");
			helper.Scrollintoview(date12);
			String imageDate12=date12.getText();
			Reporter.log("<B><font color = 'blue'> ==> -</font> Image Date is :"+imageDate12);
			System.out.println("Current Image Date: "+imageDate12);

			helper.waitFor(ShowAnalytics12);
			helper.highLightElement(driver, ShowAnalytics12);
			helper.Scrollintoview(ShowAnalytics12);
			String linkText12 = ShowAnalytics12.getAttribute("href");
			helper.getAdID(linkText12);
			ShowAnalytics12.click();
			Reporter.log("<B><font color = 'blue'> ==> -</font> Clicked On Show Analytics Icon");

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
					helper.Scrollintoview(postdate);
					 postdate12=postdate.getText();
					helper.Scrollintoview(lastSeen);
					String  lastimageDate12= lastSeen.getText();
					System.out.println("Analytics Image Post Date: "+postdate12);
					Reporter.log("<B><font color = 'blue'> ==> -</font> Image Date of Post date is :"+postdate12);
					System.out.println("Analytics Image Last Seen Date: "+lastimageDate12);
					Reporter.log("<B><font color = 'blue'> ==> -</font> Image Date of Last Seen is :"+lastimageDate12);
					driver.close();
				}
			}

			driver.switchTo().window(parent);
			helper.getLastseenDate(postdate12, imageDate12);
		}
		catch (Exception e)
		{
			// TODO: handle exception
			System.out.println("Image is not able: Oops! Looks like we don't have data for this search criteria yet.");

			Reporter.log("<B><font color = 'red'> ==> -</font> Image is not able: Oops! Looks like we don't have data for this search criteria yet.");
		}	

		try {
			String postdate13=null;
			Reporter.log(" ");
			Reporter.log("<B><font color ='red'> 13 Ad -</font>  ");
			System.out.println("");
			System.out.println("13 Ads");

			Reporter.log("<B><font color = 'blue'> ==> -</font> Ads Caputure Image Date :");
			helper.Scrollintoview(date13);
			String imageDate13=date13.getText();
			Reporter.log("<B><font color = 'blue'> ==> -</font> Image Date is :"+imageDate13);
			System.out.println("Current Image Date: "+imageDate13);

			helper.waitFor(ShowAnalytics13);
			helper.highLightElement(driver, ShowAnalytics13);
			helper.Scrollintoview(ShowAnalytics13);
			String linkText13 = ShowAnalytics13.getAttribute("href");
			helper.getAdID(linkText13);
			ShowAnalytics13.click();
			Reporter.log("<B><font color = 'blue'> ==> -</font> Clicked On Show Analytics Icon");

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
					helper.Scrollintoview(postdate);
					 postdate13=postdate.getText();
					helper.Scrollintoview(lastSeen);
					String lastimageDate13= lastSeen.getText();
					System.out.println("Analytics Image Post Date: "+postdate13);
					Reporter.log("<B><font color = 'blue'> ==> -</font> Image Date of Post date is :"+postdate13);
					System.out.println("Analytics Image Last Seen Date: "+lastimageDate13);
					Reporter.log("<B><font color = 'blue'> ==> -</font> Image Date of Last Seen is :"+lastimageDate13);
					driver.close();
				}
			}

			driver.switchTo().window(parent);
			helper.getLastseenDate(postdate13, imageDate13);
		}
		catch (Exception e)
		{
			// TODO: handle exception
			System.out.println("Image is not able: Oops! Looks like we don't have data for this search criteria yet.");

			Reporter.log("<B><font color = 'red'> ==> -</font> Image is not able: Oops! Looks like we don't have data for this search criteria yet.");
		}	

		try {
			String postdate14=null;
			Reporter.log(" ");
			Reporter.log("<B><font color ='red'> 14 Ad -</font>  ");
			System.out.println("");
			System.out.println("14 Ads");

			Reporter.log("<B><font color = 'blue'> ==> -</font> Ads Caputure Image Date :");
			helper.Scrollintoview(date14);
			String imageDate14=date14.getText();
			Reporter.log("<B><font color = 'blue'> ==> -</font> Image Date is :"+imageDate14);
			System.out.println("Current Image Date: "+imageDate14);

			helper.waitFor(ShowAnalytics14);
			helper.highLightElement(driver, ShowAnalytics14);
			helper.Scrollintoview(ShowAnalytics14);
			String linkText14 = ShowAnalytics14.getAttribute("href");
			helper.getAdID(linkText14);
			ShowAnalytics14.click();
			Reporter.log("<B><font color = 'blue'> ==> -</font> Clicked On Show Analytics Icon");

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
					helper.Scrollintoview(postdate);
					 postdate14=postdate.getText();
					helper.Scrollintoview(lastSeen);
					String lastimageDate14= lastSeen.getText();
					System.out.println("Analytics Image Post Date: "+postdate14);
					Reporter.log("<B><font color = 'blue'> ==> -</font> Image Date of Post date is :"+postdate14);
					System.out.println("Analytics Image Last Seen Date: "+lastimageDate14);
					Reporter.log("<B><font color = 'blue'> ==> -</font> Image Date of Last Seen is :"+lastimageDate14);
					driver.close();
				}
			}

			driver.switchTo().window(parent);
			helper.getLastseenDate(postdate14, imageDate14);
		}
		catch (Exception e)
		{
			// TODO: handle exception
			System.out.println("Image is not able: Oops! Looks like we don't have data for this search criteria yet.");

			Reporter.log("<B><font color = 'red'> ==> -</font> Image is not able: Oops! Looks like we don't have data for this search criteria yet.");
		}	

		try {
			String postdate15=null;
			Reporter.log(" ");
			Reporter.log("<B><font color ='red'> 15 Ad -</font>  ");
			System.out.println("");
			System.out.println("15 Ads");

			Reporter.log("<B><font color = 'blue'> ==> -</font> Ads Caputure Image Date :");
			helper.Scrollintoview(date15);
			String imageDate15=date15.getText();
			Reporter.log("<B><font color = 'blue'> ==> -</font> Image Date is :"+imageDate15);
			System.out.println("Current Image Date: "+imageDate15);

			helper.waitFor(ShowAnalytics15);
			helper.highLightElement(driver, ShowAnalytics15);
			helper.Scrollintoview(ShowAnalytics15);
			String linkText15 = ShowAnalytics15.getAttribute("href");
			helper.getAdID(linkText15);
			ShowAnalytics15.click();
			Reporter.log("<B><font color = 'blue'> ==> -</font> Clicked On Show Analytics Icon");

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
					helper.Scrollintoview(postdate);
					 postdate15=postdate.getText();
					helper.Scrollintoview(lastSeen);
					String  lastimageDate15= lastSeen.getText();
					System.out.println("Analytics Image Post Date: "+postdate15);
					Reporter.log("<B><font color = 'blue'> ==> -</font> Image Date of Post date is :"+postdate15);
					System.out.println("Analytics Image Last Seen Date: "+lastimageDate15);
					Reporter.log("<B><font color = 'blue'> ==> -</font> Image Date of Last Seen is :"+lastimageDate15);
					driver.close();
				}
			}

			driver.switchTo().window(parent);
			helper.getLastseenDate(postdate15, imageDate15);
		}
		catch (Exception e)
		{
			// TODO: handle exception
			System.out.println("Image is not able: Oops! Looks like we don't have data for this search criteria yet.");

			Reporter.log("<B><font color = 'red'> ==> -</font> Image is not able: Oops! Looks like we don't have data for this search criteria yet.");
		}
	}
}


