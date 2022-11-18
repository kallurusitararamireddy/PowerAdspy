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

public class Facebook_SortBy_VerificationPage extends BasePage {
	Helpers helper=new Helpers();

	public Facebook_SortBy_VerificationPage(WebDriver driver) throws InterruptedException  {
		super(TestBase.getDriver());

	}

	@FindBy(xpath = "//img[@class='active_pg_logo img-fluid']")
	WebElement Logo;

	@FindBy(css = "a#fb_ads > img")
	WebElement fb;

	@FindBy(id = "search-ads")
	WebElement searchButton;

	@FindBy(xpath = "//span[@class='dropdown-label dropdown_filter']")
	WebElement sortBy;

	@FindBy(id = "totaladscount-div")
	WebElement totaladscount_div;

	@FindBy(xpath = "//a[normalize-space()='Newest']")
	WebElement SortBy_Newest;

	@FindBy(xpath = "//div[@class='ad_date']")
	WebElement Date1;

	@FindBy(xpath = "//a[text()='Show Analytics']")
	WebElement showAnalytics;

	@FindBy(id  = "first_seen1")
	WebElement firstSeen;

	@FindBy(id = "last_seen1")
	WebElement lastSeen;

	@FindBy(id = "post_date1")
	WebElement postDate;

	@FindBy(css = ".clear_filters")
	WebElement Clear_Filters;

	@FindBy(xpath = "//a[normalize-space()='Last Seen']")
	WebElement sortBy_LastSeen;

	@FindBy(xpath = "//a[normalize-space()='Running Longest']")
	WebElement sortby_Running_longest;

	@FindBy(id = "days_running1")
	WebElement LongestRunningDate;

	@FindBy(xpath = "//a[normalize-space()='Domain Registration Date']")
	WebElement domain_Registration_Date;

	@FindBy(id = "domain_date")
	WebElement domain_Registration;

	//Newest
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

	/****  Facebook page ****/	
	public void Facebookpage()
	{

		Reporter.log("<B><font color = 'orange'> Step1 -</font> Logged into PowerAdSpy Application");
		String Page_titel = driver.getTitle();
		System.out.println(Page_titel);
		Reporter.log("<B><font color = 'orange'> Step2 -</font> I am on the page :" + Page_titel);

		//		helper.waitForPageToLoad();
		helper.waitFor(Logo);
		helper.highLightElement(driver, Logo);
		Assert.assertTrue(Logo.isDisplayed(), "Power Ad Spy Logo is Dispalyed");
		Reporter.log("<B><font color = 'orange'> Step3 -</font> Power Ad Spy Logo is Displayed");

		helper.waitFor(fb);
		helper.highLightElement(driver, fb);
		fb.click();
		Assert.assertTrue(fb.isDisplayed(), "PowerAdSpy | Facebook Dashboard");
		Reporter.log("<B><font color = 'orange'> Step4 -</font> Clicked On FaceBook Icon");
		//		helper.waitForPageToLoad();
	}
	/****  Facebook SortBy Newest ****/	
	public void Facebook_SortBy_Newest() throws Exception
	{
		System.out.println();
		System.out.println("ShortBy Newest:");
		Reporter.log("    ");
		Reporter.log("<B><font color = 'red'>  - ShortBy Newest Step will Start from here </font");
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

		String totaladscount=totaladscount_div.getText();
		System.out.println("Newest Totaladscount: "+totaladscount);
		Reporter.log("<B><font color = 'orange'> Step4 -</font> Newest Total Ad Count is :"+totaladscount);

		Reporter.log(" ");
		Reporter.log("<B><font color = 'Blue'> -1 Ads image-  -</font> ");
		System.out.println("");
		System.out.println("1 Ads image");
		String imageDate=date1.getText();
		Reporter.log("<B><font color = 'orange'> Step5 -</font> Image Date is :"+imageDate); 
		helper.waitFor(ShowAnalytics1);
		helper.highLightElement(driver, ShowAnalytics1);
		helper.jsScrollintoview(ShowAnalytics1);
		ShowAnalytics1.click();
		Reporter.log("<B><font color = 'orange'> Step6 -</font> Clicked On Show Analytics Icon");
		helper.waitForPageToLoad();

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
				String imageDate1 = firstSeen.getText();
				System.out.println("Analytics Image First Seen Date: "+imageDate1);
				String imageDate2 = lastSeen.getText();
				System.out.println("Analytics Image Last Seen Date: "+imageDate2);
				String imageDate3 = postDate.getText();
				System.out.println("Analytics Image Post Seen Date: "+imageDate3);
				Reporter.log("<B><font color = 'orange'> Step7 -</font> Image Date of First Seen is :"+imageDate1);
				Reporter.log("<B><font color = 'orange'> Step8 -</font> Image Date of Last Seen is :"+imageDate2);
				Reporter.log("<B><font color = 'orange'> Step9 -</font> Image Date of Post Seen is :"+imageDate3);
				driver.close();
			}
		}
		System.out.println("Current Image Date: "+imageDate);
		driver.switchTo().window(parent);


		Reporter.log(" ");
		Reporter.log("<B><font color ='Blue'> -2 Ads image- -</font>  ");
		System.out.println(" ");
		System.out.println("2 Ads image");
		String imageDate1=date2.getText();
		Reporter.log("<B><font color = 'orange'> Step5 -</font> Image Date is :"+imageDate1); 
		helper.waitFor(ShowAnalytics2);
		helper.highLightElement(driver, ShowAnalytics2);
		helper.jsScrollintoview(ShowAnalytics2);
		ShowAnalytics2.click();
		Reporter.log("<B><font color = 'orange'> Step6 -</font> Clicked On Show Analytics Icon");
		helper.waitForPageToLoad();

		String parent1=driver.getWindowHandle();
		Set<String>s1=driver.getWindowHandles();
		// Now iterate using Iterator
		Iterator<String> I11= s1.iterator();
		while(I11.hasNext())
		{
			String child_window=I11.next();
			if(!parent1.equals(child_window))
			{
				driver.switchTo().window(child_window);
				helper.waitForPageToLoad();
				System.out.println(driver.switchTo().window(child_window).getTitle());
				String imageDate11 = firstSeen.getText();
				System.out.println("Analytics Image First Seen Date: "+imageDate11);
				String imageDate2 = lastSeen.getText();
				System.out.println("Analytics Image Last Seen Date: "+imageDate2);
				String imageDate3 = postDate.getText();
				System.out.println("Analytics Image Post Seen Date: "+imageDate3);
				Reporter.log("<B><font color = 'orange'> Step7 -</font> Image Date of First Seen is :"+imageDate11);
				Reporter.log("<B><font color = 'orange'> Step8 -</font> Image Date of Last Seen is :"+imageDate2);
				Reporter.log("<B><font color = 'orange'> Step9 -</font> Image Date of Post Seen is :"+imageDate3);
				driver.close();
			}
		}
		System.out.println("Current Image Date: "+imageDate);
		driver.switchTo().window(parent1);


		Reporter.log(" ");
		Reporter.log("<B><font color ='Blue'> -3 Ads image- -</font>  ");
		System.out.println(" ");
		System.out.println("3 Ads image");
		String imageDate121=date3.getText();
		Reporter.log("<B><font color = 'orange'> Step5 -</font> Image Date is :"+imageDate121); 
		helper.waitFor(ShowAnalytics3);
		helper.highLightElement(driver, ShowAnalytics3);
		helper.jsScrollintoview(ShowAnalytics3);
		ShowAnalytics3.click();
		Reporter.log("<B><font color = 'orange'> Step6 -</font> Clicked On Show Analytics Icon");
		helper.waitForPageToLoad();

		String parent121=driver.getWindowHandle();
		Set<String>s121=driver.getWindowHandles();
		// Now iterate using Iterator
		Iterator<String> I111= s121.iterator();
		while(I111.hasNext())
		{
			String child_window=I111.next();
			if(!parent121.equals(child_window))
			{
				driver.switchTo().window(child_window);
				helper.waitForPageToLoad();
				System.out.println(driver.switchTo().window(child_window).getTitle());
				String imageDate111 = firstSeen.getText();
				System.out.println("Analytics Image First Seen Date: "+imageDate111);
				String imageDate2 = lastSeen.getText();
				System.out.println("Analytics Image Last Seen Date: "+imageDate2);
				String imageDate3 = postDate.getText();
				System.out.println("Analytics Image Post Seen Date: "+imageDate3);
				Reporter.log("<B><font color = 'orange'> Step7 -</font> Image Date of First Seen is :"+imageDate111);
				Reporter.log("<B><font color = 'orange'> Step8 -</font> Image Date of Last Seen is :"+imageDate2);
				Reporter.log("<B><font color = 'orange'> Step9 -</font> Image Date of Post Seen is :"+imageDate3);
				driver.close();
			}
		}
		System.out.println("Current Image Date: "+imageDate);
		driver.switchTo().window(parent121);

		Reporter.log(" ");
		Reporter.log("<B><font color ='Blue'> -4 Ads image- -</font>  ");
		System.out.println(" ");
		System.out.println("4 Ads image");
		String imageDate111=date4.getText();
		Reporter.log("<B><font color = 'orange'> Step5 -</font> Image Date is :"+imageDate111); 
		helper.waitFor(ShowAnalytics4);
		helper.highLightElement(driver, ShowAnalytics4);
		helper.jsScrollintoview(ShowAnalytics4);
		ShowAnalytics4.click();
		Reporter.log("<B><font color = 'orange'> Step6 -</font> Clicked On Show Analytics Icon");
		helper.waitForPageToLoad();

		String parent111=driver.getWindowHandle();
		Set<String>s111=driver.getWindowHandles();
		// Now iterate using Iterator
		Iterator<String> I1111= s111.iterator();
		while(I1111.hasNext())
		{
			String child_window=I1111.next();
			if(!parent111.equals(child_window))
			{
				driver.switchTo().window(child_window);
				helper.waitForPageToLoad();
				System.out.println(driver.switchTo().window(child_window).getTitle());
				String imageDate1111 = firstSeen.getText();
				System.out.println("Analytics Image First Seen Date: "+imageDate1111);
				String imageDate2 = lastSeen.getText();
				System.out.println("Analytics Image Last Seen Date: "+imageDate2);
				String imageDate3 = postDate.getText();
				System.out.println("Analytics Image Post Seen Date: "+imageDate3);
				Reporter.log("<B><font color = 'orange'> Step7 -</font> Image Date of First Seen is :"+imageDate1111);
				Reporter.log("<B><font color = 'orange'> Step8 -</font> Image Date of Last Seen is :"+imageDate2);
				Reporter.log("<B><font color = 'orange'> Step9 -</font> Image Date of Post Seen is :"+imageDate3);
				driver.close();
			}
		}
		System.out.println("Current Image Date: "+imageDate);
		driver.switchTo().window(parent111);

		Reporter.log(" ");
		Reporter.log("<B><font color ='Blue'> -5 Ads image- -</font>  ");
		System.out.println(" ");
		System.out.println("5 Ads image");
		String imageDate5=date5.getText();
		Reporter.log("<B><font color = 'orange'> Step5 -</font> Image Date is :"+imageDate5); 
		helper.waitFor(ShowAnalytics5);
		helper.highLightElement(driver, ShowAnalytics5);
		helper.jsScrollintoview(ShowAnalytics5);
		ShowAnalytics5.click();
		Reporter.log("<B><font color = 'orange'> Step6 -</font> Clicked On Show Analytics Icon");
		helper.waitForPageToLoad();

		String parent5=driver.getWindowHandle();
		Set<String>s5=driver.getWindowHandles();
		// Now iterate using Iterator
		Iterator<String> I5= s5.iterator();
		while(I5.hasNext())
		{
			String child_window=I5.next();
			if(!parent5.equals(child_window))
			{
				driver.switchTo().window(child_window);
				helper.waitForPageToLoad();
				System.out.println(driver.switchTo().window(child_window).getTitle());
				String imageDate6 = firstSeen.getText();
				System.out.println("Analytics Image First Seen Date: "+imageDate6);
				String imageDate2 = lastSeen.getText();
				System.out.println("Analytics Image Last Seen Date: "+imageDate2);
				String imageDate3 = postDate.getText();
				System.out.println("Analytics Image Post Seen Date: "+imageDate3);
				Reporter.log("<B><font color = 'orange'> Step7 -</font> Image Date of First Seen is :"+imageDate6);
				Reporter.log("<B><font color = 'orange'> Step8 -</font> Image Date of Last Seen is :"+imageDate2);
				Reporter.log("<B><font color = 'orange'> Step9 -</font> Image Date of Post Seen is :"+imageDate3);
				driver.close();
			}
		}
		System.out.println("Current Image Date: "+imageDate);
		driver.switchTo().window(parent5);


		Reporter.log(" ");
		Reporter.log("<B><font color ='Blue'> -6 Ads image- -</font>  ");
		System.out.println(" ");
		System.out.println("6 Ads image");
		String imageDate6=date6.getText();
		Reporter.log("<B><font color = 'orange'> Step5 -</font> Image Date is :"+imageDate6); 
		helper.waitFor(ShowAnalytics6);
		helper.highLightElement(driver, ShowAnalytics6);
		helper.jsScrollintoview(ShowAnalytics6);
		ShowAnalytics6.click();
		Reporter.log("<B><font color = 'orange'> Step6 -</font> Clicked On Show Analytics Icon");
		helper.waitForPageToLoad();

		String parent6=driver.getWindowHandle();
		Set<String>s6=driver.getWindowHandles();
		// Now iterate using Iterator
		Iterator<String> I6= s6.iterator();
		while(I6.hasNext())
		{
			String child_window=I6.next();
			if(!parent6.equals(child_window))
			{
				driver.switchTo().window(child_window);
				helper.waitForPageToLoad();
				System.out.println(driver.switchTo().window(child_window).getTitle());
				String imageDate11 = firstSeen.getText();
				System.out.println("Analytics Image First Seen Date: "+imageDate11);
				String imageDate2 = lastSeen.getText();
				System.out.println("Analytics Image Last Seen Date: "+imageDate2);
				String imageDate3 = postDate.getText();
				System.out.println("Analytics Image Post Seen Date: "+imageDate3);
				Reporter.log("<B><font color = 'orange'> Step7 -</font> Image Date of First Seen is :"+imageDate11);
				Reporter.log("<B><font color = 'orange'> Step8 -</font> Image Date of Last Seen is :"+imageDate2);
				Reporter.log("<B><font color = 'orange'> Step9 -</font> Image Date of Post Seen is :"+imageDate3);
				driver.close();
			}
		}
		System.out.println("Current Image Date: "+imageDate);
		driver.switchTo().window(parent6);

		Reporter.log(" ");
		Reporter.log("<B><font color ='Blue'> -7 Ads image- -</font>  ");
		System.out.println(" ");
		System.out.println("7 Ads image");
		String imageDate17=date7.getText();
		Reporter.log("<B><font color = 'orange'> Step5 -</font> Image Date is :"+imageDate17); 
		helper.waitFor(ShowAnalytics7);
		helper.highLightElement(driver, ShowAnalytics7);
		helper.jsScrollintoview(ShowAnalytics7);
		ShowAnalytics7.click();
		Reporter.log("<B><font color = 'orange'> Step6 -</font> Clicked On Show Analytics Icon");
		helper.waitForPageToLoad();

		String parent17=driver.getWindowHandle();
		Set<String>s17=driver.getWindowHandles();
		// Now iterate using Iterator
		Iterator<String> I17= s17.iterator();
		while(I17.hasNext())
		{
			String child_window=I17.next();
			if(!parent1.equals(child_window))
			{
				driver.switchTo().window(child_window);
				helper.waitForPageToLoad();
				System.out.println(driver.switchTo().window(child_window).getTitle());
				String imageDate11 = firstSeen.getText();
				System.out.println("Analytics Image First Seen Date: "+imageDate11);
				String imageDate2 = lastSeen.getText();
				System.out.println("Analytics Image Last Seen Date: "+imageDate2);
				String imageDate3 = postDate.getText();
				System.out.println("Analytics Image Post Seen Date: "+imageDate3);
				Reporter.log("<B><font color = 'orange'> Step7 -</font> Image Date of First Seen is :"+imageDate11);
				Reporter.log("<B><font color = 'orange'> Step8 -</font> Image Date of Last Seen is :"+imageDate2);
				Reporter.log("<B><font color = 'orange'> Step9 -</font> Image Date of Post Seen is :"+imageDate3);
				driver.close();
			}
		}
		System.out.println("Current Image Date: "+imageDate);
		driver.switchTo().window(parent17);


		Reporter.log(" ");
		Reporter.log("<B><font color ='Blue'> -8 Ads image- -</font>  ");
		System.out.println(" ");
		System.out.println("8 Ads image");
		String imageDate8=date8.getText();
		Reporter.log("<B><font color = 'orange'> Step5 -</font> Image Date is :"+imageDate8); 
		helper.waitFor(ShowAnalytics8);
		helper.highLightElement(driver, ShowAnalytics8);
		helper.jsScrollintoview(ShowAnalytics8);
		ShowAnalytics8.click();
		Reporter.log("<B><font color = 'orange'> Step6 -</font> Clicked On Show Analytics Icon");
		helper.waitForPageToLoad();

		String parent8=driver.getWindowHandle();
		Set<String>s8=driver.getWindowHandles();
		// Now iterate using Iterator
		Iterator<String> I8= s8.iterator();
		while(I8.hasNext())
		{
			String child_window=I8.next();
			if(!parent8.equals(child_window))
			{
				driver.switchTo().window(child_window);
				helper.waitForPageToLoad();
				System.out.println(driver.switchTo().window(child_window).getTitle());
				String imageDate11 = firstSeen.getText();
				System.out.println("Analytics Image First Seen Date: "+imageDate11);
				String imageDate2 = lastSeen.getText();
				System.out.println("Analytics Image Last Seen Date: "+imageDate2);
				String imageDate3 = postDate.getText();
				System.out.println("Analytics Image Post Seen Date: "+imageDate3);
				Reporter.log("<B><font color = 'orange'> Step7 -</font> Image Date of First Seen is :"+imageDate11);
				Reporter.log("<B><font color = 'orange'> Step8 -</font> Image Date of Last Seen is :"+imageDate2);
				Reporter.log("<B><font color = 'orange'> Step9 -</font> Image Date of Post Seen is :"+imageDate3);
				driver.close();
			}
		}
		System.out.println("Current Image Date: "+imageDate);
		driver.switchTo().window(parent8);


		Reporter.log(" ");
		Reporter.log("<B><font color ='Blue'> -9 Ads image- -</font>  ");
		System.out.println(" ");
		System.out.println("9 Ads image");
		String imageDate9=date2.getText();
		Reporter.log("<B><font color = 'orange'> Step5 -</font> Image Date is :"+imageDate9); 
		helper.waitFor(ShowAnalytics9);
		helper.highLightElement(driver, ShowAnalytics9);
		helper.jsScrollintoview(ShowAnalytics9);
		ShowAnalytics9.click();
		Reporter.log("<B><font color = 'orange'> Step6 -</font> Clicked On Show Analytics Icon");
		helper.waitForPageToLoad();

		String parent9=driver.getWindowHandle();
		Set<String>s9=driver.getWindowHandles();
		// Now iterate using Iterator
		Iterator<String> I9=s9.iterator();
		while(I9.hasNext())
		{
			String child_window=I9.next();
			if(!parent9.equals(child_window))
			{
				driver.switchTo().window(child_window);
				helper.waitForPageToLoad();
				System.out.println(driver.switchTo().window(child_window).getTitle());
				String imageDate19 = firstSeen.getText();
				System.out.println("Analytics Image First Seen Date: "+imageDate19);
				String imageDate2 = lastSeen.getText();
				System.out.println("Analytics Image Last Seen Date: "+imageDate2);
				String imageDate3 = postDate.getText();
				System.out.println("Analytics Image Post Seen Date: "+imageDate3);
				Reporter.log("<B><font color = 'orange'> Step7 -</font> Image Date of First Seen is :"+imageDate19);
				Reporter.log("<B><font color = 'orange'> Step8 -</font> Image Date of Last Seen is :"+imageDate2);
				Reporter.log("<B><font color = 'orange'> Step9 -</font> Image Date of Post Seen is :"+imageDate3);
				driver.close();
			}
		}
		System.out.println("Current Image Date: "+imageDate);
		driver.switchTo().window(parent9);


		Reporter.log(" ");
		Reporter.log("<B><font color ='Blue'> -10 Ads image- -</font>  ");
		System.out.println(" ");
		System.out.println("10 Ads image");
		String imageDate10=date10.getText();
		Reporter.log("<B><font color = 'orange'> Step5 -</font> Image Date is :"+imageDate10); 
		helper.waitFor(ShowAnalytics10);
		helper.highLightElement(driver, ShowAnalytics10);
		helper.jsScrollintoview(ShowAnalytics10);
		ShowAnalytics10.click();
		Reporter.log("<B><font color = 'orange'> Step6 -</font> Clicked On Show Analytics Icon");
		helper.waitForPageToLoad();

		String parent10=driver.getWindowHandle();
		Set<String>s10=driver.getWindowHandles();
		// Now iterate using Iterator
		Iterator<String> I10= s10.iterator();
		while(I10.hasNext())
		{
			String child_window=I10.next();
			if(!parent10.equals(child_window))
			{
				driver.switchTo().window(child_window);
				helper.waitForPageToLoad();
				System.out.println(driver.switchTo().window(child_window).getTitle());
				String imageDate11 = firstSeen.getText();
				System.out.println("Analytics Image First Seen Date: "+imageDate11);
				String imageDate2 = lastSeen.getText();
				System.out.println("Analytics Image Last Seen Date: "+imageDate2);
				String imageDate3 = postDate.getText();
				System.out.println("Analytics Image Post Seen Date: "+imageDate3);
				Reporter.log("<B><font color = 'orange'> Step7 -</font> Image Date of First Seen is :"+imageDate11);
				Reporter.log("<B><font color = 'orange'> Step8 -</font> Image Date of Last Seen is :"+imageDate2);
				Reporter.log("<B><font color = 'orange'> Step9 -</font> Image Date of Post Seen is :"+imageDate3);
				driver.close();
			}
		}
		System.out.println("Current Image Date: "+imageDate);
		driver.switchTo().window(parent10);


		Reporter.log(" ");
		Reporter.log("<B><font color ='Blue'> -11 Ads image- -</font>  ");
		System.out.println(" ");
		System.out.println("11 Ads image");
		String imageDate11=date11.getText();
		Reporter.log("<B><font color = 'orange'> Step5 -</font> Image Date is :"+imageDate11); 
		helper.waitFor(ShowAnalytics11);
		helper.highLightElement(driver, ShowAnalytics11);
		helper.jsScrollintoview(ShowAnalytics11);
		ShowAnalytics11.click();
		Reporter.log("<B><font color = 'orange'> Step6 -</font> Clicked On Show Analytics Icon");
		helper.waitForPageToLoad();

		String parent11=driver.getWindowHandle();
		Set<String>s11=driver.getWindowHandles();
		// Now iterate using Iterator
		Iterator<String> I110= s11.iterator();
		while(I110.hasNext())
		{
			String child_window=I110.next();
			if(!parent11.equals(child_window))
			{
				driver.switchTo().window(child_window);
				helper.waitForPageToLoad();
				System.out.println(driver.switchTo().window(child_window).getTitle());
				String imageDate101 = firstSeen.getText();
				System.out.println("Analytics Image First Seen Date: "+imageDate101);
				String imageDate2 = lastSeen.getText();
				System.out.println("Analytics Image Last Seen Date: "+imageDate2);
				String imageDate3 = postDate.getText();
				System.out.println("Analytics Image Post Seen Date: "+imageDate3);
				Reporter.log("<B><font color = 'orange'> Step7 -</font> Image Date of First Seen is :"+imageDate101);
				Reporter.log("<B><font color = 'orange'> Step8 -</font> Image Date of Last Seen is :"+imageDate2);
				Reporter.log("<B><font color = 'orange'> Step9 -</font> Image Date of Post Seen is :"+imageDate3);
				driver.close();
			}
		}
		System.out.println("Current Image Date: "+imageDate);
		driver.switchTo().window(parent11);

		Reporter.log(" ");
		Reporter.log("<B><font color ='Blue'> -12 Ads image- -</font>  ");
		System.out.println(" ");
		System.out.println("12 Ads image");
		String imageDate12=date12.getText();
		Reporter.log("<B><font color = 'orange'> Step5 -</font> Image Date is :"+imageDate12); 
		helper.waitFor(ShowAnalytics12);
		helper.highLightElement(driver, ShowAnalytics12);
		helper.jsScrollintoview(ShowAnalytics12);
		ShowAnalytics12.click();
		Reporter.log("<B><font color = 'orange'> Step6 -</font> Clicked On Show Analytics Icon");
		helper.waitForPageToLoad();

		String parent12=driver.getWindowHandle();
		Set<String>s12=driver.getWindowHandles();
		// Now iterate using Iterator
		Iterator<String> I112= s12.iterator();
		while(I112.hasNext())
		{
			String child_window=I112.next();
			if(!parent12.equals(child_window))
			{
				driver.switchTo().window(child_window);
				helper.waitForPageToLoad();
				System.out.println(driver.switchTo().window(child_window).getTitle());
				String imageDate112 = firstSeen.getText();
				System.out.println("Analytics Image First Seen Date: "+imageDate112);
				String imageDate2 = lastSeen.getText();
				System.out.println("Analytics Image Last Seen Date: "+imageDate2);
				String imageDate3 = postDate.getText();
				System.out.println("Analytics Image Post Seen Date: "+imageDate3);
				Reporter.log("<B><font color = 'orange'> Step7 -</font> Image Date of First Seen is :"+imageDate11);
				Reporter.log("<B><font color = 'orange'> Step8 -</font> Image Date of Last Seen is :"+imageDate2);
				Reporter.log("<B><font color = 'orange'> Step9 -</font> Image Date of Post Seen is :"+imageDate3);
				driver.close();
			}
		}
		System.out.println("Current Image Date: "+imageDate);
		driver.switchTo().window(parent12);

		Reporter.log(" ");
		Reporter.log("<B><font color ='Blue'> -13 Ads image- -</font>  ");
		System.out.println(" ");
		System.out.println("13 Ads image");
		String imageDate13=date13.getText();
		Reporter.log("<B><font color = 'orange'> Step5 -</font> Image Date is :"+imageDate13); 
		helper.waitFor(ShowAnalytics13);
		helper.highLightElement(driver, ShowAnalytics13);
		helper.jsScrollintoview(ShowAnalytics13);
		ShowAnalytics13.click();
		Reporter.log("<B><font color = 'orange'> Step6 -</font> Clicked On Show Analytics Icon");
		helper.waitForPageToLoad();

		String parent13=driver.getWindowHandle();
		Set<String>s13=driver.getWindowHandles();
		// Now iterate using Iterator
		Iterator<String> I13= s13.iterator();
		while(I13.hasNext())
		{
			String child_window=I13.next();
			if(!parent13.equals(child_window))
			{
				driver.switchTo().window(child_window);
				helper.waitForPageToLoad();
				System.out.println(driver.switchTo().window(child_window).getTitle());
				String imageDate113 = firstSeen.getText();
				System.out.println("Analytics Image First Seen Date: "+imageDate113);
				String imageDate2 = lastSeen.getText();
				System.out.println("Analytics Image Last Seen Date: "+imageDate2);
				String imageDate3 = postDate.getText();
				System.out.println("Analytics Image Post Seen Date: "+imageDate3);
				Reporter.log("<B><font color = 'orange'> Step7 -</font> Image Date of First Seen is :"+imageDate113);
				Reporter.log("<B><font color = 'orange'> Step8 -</font> Image Date of Last Seen is :"+imageDate2);
				Reporter.log("<B><font color = 'orange'> Step9 -</font> Image Date of Post Seen is :"+imageDate3);
				driver.close();
			}
		}
		System.out.println("Current Image Date: "+imageDate);
		driver.switchTo().window(parent13);


		Reporter.log(" ");
		Reporter.log("<B><font color ='Blue'> -14 Ads image- -</font>  ");
		System.out.println(" ");
		System.out.println("14 Ads image");
		String imageDate14=date2.getText();
		Reporter.log("<B><font color = 'orange'> Step5 -</font> Image Date is :"+imageDate14); 
		helper.waitFor(ShowAnalytics14);
		helper.highLightElement(driver, ShowAnalytics14);
		helper.jsScrollintoview(ShowAnalytics14);
		ShowAnalytics14.click();
		Reporter.log("<B><font color = 'orange'> Step6 -</font> Clicked On Show Analytics Icon");
		helper.waitForPageToLoad();

		String parent14=driver.getWindowHandle();
		Set<String>s14=driver.getWindowHandles();
		// Now iterate using Iterator
		Iterator<String> I14= s14.iterator();
		while(I14.hasNext())
		{
			String child_window=I14.next();
			if(!parent14.equals(child_window))
			{
				driver.switchTo().window(child_window);
				helper.waitForPageToLoad();
				System.out.println(driver.switchTo().window(child_window).getTitle());
				String imageDate114 = firstSeen.getText();
				System.out.println("Analytics Image First Seen Date: "+imageDate114);
				String imageDate2 = lastSeen.getText();
				System.out.println("Analytics Image Last Seen Date: "+imageDate2);
				String imageDate3 = postDate.getText();
				System.out.println("Analytics Image Post Seen Date: "+imageDate3);
				Reporter.log("<B><font color = 'orange'> Step7 -</font> Image Date of First Seen is :"+imageDate114);
				Reporter.log("<B><font color = 'orange'> Step8 -</font> Image Date of Last Seen is :"+imageDate2);
				Reporter.log("<B><font color = 'orange'> Step9 -</font> Image Date of Post Seen is :"+imageDate3);
				driver.close();
			}
		}
		System.out.println("Current Image Date: "+imageDate);
		driver.switchTo().window(parent1);

		Reporter.log(" ");
		Reporter.log("<B><font color ='Blue'> -15 Ads image- -</font>  ");
		System.out.println(" ");
		System.out.println("Second Ads image");
		String imageDate15=date15.getText();
		Reporter.log("<B><font color = 'orange'> Step5 -</font> Image Date is :"+imageDate15); 
		helper.waitFor(ShowAnalytics15);
		helper.highLightElement(driver, ShowAnalytics15);
		helper.jsScrollintoview(ShowAnalytics15);
		ShowAnalytics15.click();
		Reporter.log("<B><font color = 'orange'> Step6 -</font> Clicked On Show Analytics Icon");
		helper.waitForPageToLoad();

		String parent15=driver.getWindowHandle();
		Set<String>s15=driver.getWindowHandles();
		// Now iterate using Iterator
		Iterator<String> I15= s15.iterator();
		while(I15.hasNext())
		{
			String child_window=I15.next();
			if(!parent15.equals(child_window))
			{
				driver.switchTo().window(child_window);
				helper.waitForPageToLoad();
				System.out.println(driver.switchTo().window(child_window).getTitle());
				String imageDate115 = firstSeen.getText();
				System.out.println("Analytics Image First Seen Date: "+imageDate115);
				String imageDate2 = lastSeen.getText();
				System.out.println("Analytics Image Last Seen Date: "+imageDate2);
				String imageDate3 = postDate.getText();
				System.out.println("Analytics Image Post Seen Date: "+imageDate3);
				Reporter.log("<B><font color = 'orange'> Step7 -</font> Image Date of First Seen is :"+imageDate115);
				Reporter.log("<B><font color = 'orange'> Step8 -</font> Image Date of Last Seen is :"+imageDate2);
				Reporter.log("<B><font color = 'orange'> Step9 -</font> Image Date of Post Seen is :"+imageDate3);
				driver.close();
			}
		}
		System.out.println("Current Image Date: "+imageDate);
		driver.switchTo().window(parent15);
	}

	/****  Facebook SortBy Last Seen ****/	
	public void Facebook_SortBy_LastSeen() throws Exception
	{
		helper.waitFor(Clear_Filters);
		helper.highLightElement(driver, Clear_Filters);
		helper.jsScrollintoview(Clear_Filters);
		Clear_Filters.click();
		//Reporter.log("<B><font color = 'orange'> Step1 -</font> Clicked On Clear Filters Icon");
		//		helper.waitForPageToLoad();

		System.out.println();
		System.out.println("ShortBy Last Seen: ");
		Reporter.log("    ");
		Reporter.log("<B><font color = 'red'>  - ShortBy Last Seen Step will Start from here </font> ");
		helper.waitFor(sortBy);
		helper.highLightElement(driver, sortBy);
		sortBy.click();
		Reporter.log("<B><font color = 'orange'> Step5 -</font> Clicked On sortBy Icon");

		helper.waitFor(sortBy_LastSeen);
		helper.highLightElement(driver, sortBy_LastSeen);
		sortBy_LastSeen.click();
		Reporter.log("<B><font color = 'orange'> Step6 -</font> Clicked On sortBy Last Seen Icon");

		helper.waitFor(searchButton);
		helper.highLightElement(driver, searchButton);
		searchButton.click();
		Reporter.log("<B><font color = 'orange'> Step7 -</font> Clicked On search Button Icon");
		helper.waitForPageToLoad();
		
		String totaladscount=totaladscount_div.getText();
		System.out.println("Last Seen Totaladscount: "+totaladscount);
		Reporter.log("<B><font color = 'orange'> Step8 -</font> Last Seen Total Ad Count is :"+ totaladscount);
		
		try {
			
			Reporter.log(" ");
			Reporter.log("<B><font color = 'Blue'> -1 Ads image-  -</font> ");
			System.out.println("");
			System.out.println("1 Ads image");
			String  imageDate1= date1.getText();
			Reporter.log("<B><font color = 'orange'> Step9 -</font> Image Date is :"+imageDate1);
			System.out.println("Current Date: "+imageDate1);
			
			helper.waitFor(ShowAnalytics1);
			helper.highLightElement(driver, ShowAnalytics1);
			helper.jsScrollintoview(ShowAnalytics1);
			ShowAnalytics1.click();
			Reporter.log("<B><font color = 'orange'> Step10 -</font> Clicked On Show Analytics Icon");
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
			Reporter.log("<B><font color = 'orange'> Step 11 -</font> Last_Seen_childWindow AdDetails Page= " +  lastSeenDate_today1);
			System.out.println("lastSeenDate_today: "+lastSeenDate_today1);


			driver.close();

			driver.switchTo().window(parent1);
			System.out.println("lastSeenDate_today1: "+lastSeenDate_today1);


			String join = null;
			//  String[] actualDate = null;

			String[] splitString = lastSeenDate_today1.split(" ");
			for(int i=0;i<splitString.length-2;i++) {
				String actualDate=splitString[i]; 
				join= splitString[i+1]+" "+ splitString[i]+" " + splitString[i+2];
				//  System.out.println("splitString : " + splitString[i]);
				System.out.println("lastseen Date: " + join);
			}

			Assert.assertEquals(imageDate1, join);
			Reporter.log("<B><font color = 'orange'> Step12 -</font> Both Last Seen Date are Matching in Assert Pass :"+imageDate1+ " == " +join);
			System.out.println("Both Last Seen Date are Matching in Assert Pass :"+imageDate1+ " == " +join);
		}
		catch(Exception e) {
			System.out.println("Image is not able:   Opp!Looks like we don't have data for this search criteria yet.\r\n"
					+ "But don't worry, Spidey is on the crawl now and it will scrape ads for this search criteria for you ASAP.");

			Reporter.log("<B><font color = 'orange'> Step9 -</font> Image is not able:   Opp! Looks like we don't have data for this search criteria yet."
					+ "   But don't worry, Spidey is on the crawl now and it will scrape ads for this search criteria for you ASAP.");
		}    



		
		try {
			Reporter.log(" ");
			Reporter.log("<B><font color = 'Blue'> -2 Ads image-  -</font> ");
			System.out.println("");
			System.out.println("2 Ads image");
			String  imageDate2= date2.getText();
			Reporter.log("<B><font color = 'orange'> Step9 -</font> Image Date is :"+imageDate2);
			System.out.println("Current Date: "+imageDate2);
			
			helper.waitFor(ShowAnalytics2);
			helper.highLightElement(driver, ShowAnalytics2);
			helper.jsScrollintoview(ShowAnalytics2);
			ShowAnalytics2.click();
			Reporter.log("<B><font color = 'orange'> Step10 -</font> Clicked On Show Analytics Icon");
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
			//		    System.out.println("Testing last Seen Adresss: "+lastSeen);
			String   lastSeenDate_today2=null;
			lastSeenDate_today2 = lastSeen.getText();
			Reporter.log("<B><font color = 'orange'> Step 11 -</font> Last_Seen_childWindow AdDetails Page= " +  lastSeenDate_today2);
			System.out.println("lastSeenDate_today: "+lastSeenDate_today2);


			driver.close();

			driver.switchTo().window(parent2);
			System.out.println("lastSeenDate_today: "+lastSeenDate_today2);


			String join = null;
			//  String[] actualDate = null;

			String[] splitString = lastSeenDate_today2.split(" ");
			for(int i=0;i<splitString.length-2;i++) {
				String actualDate=splitString[i]; 
				join= splitString[i+1]+" "+ splitString[i]+" " + splitString[i+2];
				//  System.out.println("splitString : " + splitString[i]);
				System.out.println("lastseen Date: " + join);
			}

			Assert.assertEquals(imageDate2, join);
			Reporter.log("<B><font color = 'orange'> Step12 -</font> Both Last Seen Date are Matching in Assert Pass :"+imageDate2+ " == " +join);
			System.out.println("Both Last Seen Date are Matching in Assert Pass :"+imageDate2+ " == " +join);
		}
		catch(Exception e) {
			System.out.println("Image is not able:   Opp!Looks like we don't have data for this search criteria yet.\r\n"
					+ "But don't worry, Spidey is on the crawl now and it will scrape ads for this search criteria for you ASAP.");

			Reporter.log("<B><font color = 'orange'> Step 9 -</font> Image is not able:   Opp! Looks like we don't have data for this search criteria yet."
					+ "   But don't worry, Spidey is on the crawl now and it will scrape ads for this search criteria for you ASAP.");
		}      


	
		try {
			Reporter.log(" ");
			Reporter.log("<B><font color = 'Blue'> -3 Ads image-  -</font> ");
			System.out.println("");
			System.out.println("3 Ads image");
			String  imageDate3= date3.getText();
			Reporter.log("<B><font color = 'orange'> Step9 -</font> Image Date is :"+imageDate3);
			System.out.println("Current Date: "+imageDate3);
			
			helper.waitFor(ShowAnalytics3);
			helper.highLightElement(driver, ShowAnalytics3);
			helper.jsScrollintoview(ShowAnalytics3);
			ShowAnalytics3.click();
			Reporter.log("<B><font color = 'orange'> Step10 -</font> Clicked On Show Analytics Icon");
			helper.waitForPageToLoad();

			Set<String> S3=driver.getWindowHandles();
			Iterator<String>it3=S3.iterator();
			String parent1=it3.next();
			String child3=it3.next();

			driver.switchTo().window(child3);

			helper.waitForPageToLoad();
			helper.waitFor(lastSeen);
			helper.highLightElement(driver,lastSeen);
			helper.jsScrollintoview(lastSeen);
			//			    System.out.println("Testing last Seen Adresss: "+lastSeen);
			String   lastSeenDate_today3=null;
			lastSeenDate_today3 = lastSeen.getText();
			Reporter.log("<B><font color = 'orange'> Step 11 -</font> Last_Seen_childWindow AdDetails Page= " +  lastSeenDate_today3);
			System.out.println("lastSeenDate_today: "+lastSeenDate_today3);


			driver.close();

			driver.switchTo().window(parent1);
			System.out.println("lastSeenDate_today1: "+lastSeenDate_today3);


			String join = null;
			//  String[] actualDate = null;

			String[] splitString = lastSeenDate_today3.split(" ");
			for(int i=0;i<splitString.length-2;i++) {
				String actualDate=splitString[i]; 
				join= splitString[i+1]+" "+ splitString[i]+" " + splitString[i+2];
				//  System.out.println("splitString : " + splitString[i]);
				System.out.println("lastseen Date: " + join);
			}

			Assert.assertEquals(imageDate3, join);
			Reporter.log("<B><font color = 'orange'> Step12 -</font> Both Last Seen Date are Matching in Assert Pass :"+imageDate3+ " == " +join);
			System.out.println("Both Last Seen Date are Matching in Assert Pass :"+imageDate3+ " == " +join);
		}
		catch(Exception e) {
			System.out.println("Image is not able:   Opp!Looks like we don't have data for this search criteria yet.\r\n"
					+ "But don't worry, Spidey is on the crawl now and it will scrape ads for this search criteria for you ASAP.");

			Reporter.log("<B><font color = 'orange'> Step9 -</font> Image is not able:   Opp! Looks like we don't have data for this search criteria yet."
					+ "   But don't worry, Spidey is on the crawl now and it will scrape ads for this search criteria for you ASAP.");
		}    




		Reporter.log(" ");
		Reporter.log("<B><font color = 'Blue'> -4 Ads image-  -</font> ");
		System.out.println("");
		System.out.println("4 Ads image");
		String  imageDate4= date4.getText();
		Reporter.log("<B><font color = 'orange'> Step9 -</font> Image Date is :"+imageDate4);
		System.out.println("Current Date: "+imageDate4);
		try {
			helper.waitFor(ShowAnalytics4);
			helper.highLightElement(driver, ShowAnalytics4);
			helper.jsScrollintoview(ShowAnalytics4);
			ShowAnalytics4.click();
			Reporter.log("<B><font color = 'orange'> Step10 -</font> Clicked On Show Analytics Icon");
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
			//					    System.out.println("Testing last Seen Adresss: "+lastSeen);
			String   lastSeenDate_today4=null;
			lastSeenDate_today4 = lastSeen.getText();
			Reporter.log("<B><font color = 'orange'> Step 11 -</font> Last_Seen_childWindow AdDetails Page= " +  lastSeenDate_today4);
			System.out.println("lastSeenDate_today: "+lastSeenDate_today4);


			driver.close();

			driver.switchTo().window(parent4);
			System.out.println("lastSeenDate_today: "+lastSeenDate_today4);


			String join = null;
			//  String[] actualDate = null;

			String[] splitString = lastSeenDate_today4.split(" ");
			for(int i=0;i<splitString.length-2;i++) {
				String actualDate=splitString[i]; 
				join= splitString[i+1]+" "+ splitString[i]+" " + splitString[i+2];
				//  System.out.println("splitString : " + splitString[i]);
				System.out.println("lastseen Date: " + join);
			}

			Assert.assertEquals(imageDate4, join);
			Reporter.log("<B><font color = 'orange'> Step12 -</font> Both Last Seen Date are Matching in Assert Pass :"+imageDate4+ " == " +join);
			System.out.println("Both Last Seen Date are Matching in Assert Pass :"+imageDate4+ " == " +join);
		}
		catch(Exception e) {
			System.out.println("Image is not able:   Opp!Looks like we don't have data for this search criteria yet.\r\n"
					+ "But don't worry, Spidey is on the crawl now and it will scrape ads for this search criteria for you ASAP.");

			Reporter.log("<B><font color = 'orange'> Step9 -</font> Image is not able:   Opp! Looks like we don't have data for this search criteria yet."
					+ "   But don't worry, Spidey is on the crawl now and it will scrape ads for this search criteria for you ASAP.");
		}    



		
		try {
			Reporter.log(" ");
			Reporter.log("<B><font color = 'Blue'> -5 Ads image-  -</font> ");
			System.out.println("");
			System.out.println("5 Ads image");
			String  imageDate5= date5.getText();
			Reporter.log("<B><font color = 'orange'> Step9 -</font> Image Date is :"+imageDate5);
			System.out.println("Current Date: "+imageDate5);
			
			helper.waitFor(ShowAnalytics5);
			helper.highLightElement(driver, ShowAnalytics5);
			helper.jsScrollintoview(ShowAnalytics5);
			ShowAnalytics5.click();
			Reporter.log("<B><font color = 'orange'> Step 10 -</font> Clicked On Show Analytics Icon");
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
			//							    System.out.println("Testing last Seen Adresss: "+lastSeen);
			String   lastSeenDate_today5=null;
			lastSeenDate_today5 = lastSeen.getText();
			Reporter.log("<B><font color = 'orange'> Step 11 -</font> Last_Seen_childWindow AdDetails Page= " +  lastSeenDate_today5);
			System.out.println("lastSeenDate_today: "+lastSeenDate_today5);


			driver.close();

			driver.switchTo().window(parent5);
			System.out.println("lastSeenDate_today1: "+lastSeenDate_today5);


			String join = null;
			//  String[] actualDate = null;

			String[] splitString = lastSeenDate_today5.split(" ");
			for(int i=0;i<splitString.length-2;i++) {
				String actualDate=splitString[i]; 
				join= splitString[i+1]+" "+ splitString[i]+" " + splitString[i+2];
				//  System.out.println("splitString : " + splitString[i]);
				System.out.println("lastseen Date: " + join);
			}

			Assert.assertEquals(imageDate5, join);
			Reporter.log("<B><font color = 'orange'> Step 12 -</font> Both Last Seen Date are Matching in Assert Pass :"+imageDate5+ " == " +join);
			System.out.println("Both Last Seen Date are Matching in Assert Pass :"+imageDate5+ " == " +join);
		}
		catch(Exception e) {
			System.out.println("Image is not able:   Opp!Looks like we don't have data for this search criteria yet.\r\n"
					+ "But don't worry, Spidey is on the crawl now and it will scrape ads for this search criteria for you ASAP.");

			Reporter.log("<B><font color = 'orange'> Step 9 -</font> Image is not able:   Opp! Looks like we don't have data for this search criteria yet."
					+ "   But don't worry, Spidey is on the crawl now and it will scrape ads for this search criteria for you ASAP.");
		}    


		try {

			Reporter.log(" ");
			Reporter.log("<B><font color = 'Blue'> -6 Ads image-  -</font> ");
			System.out.println("");
			System.out.println("6 Ads image");
			String  imageDate6= date6.getText();
			Reporter.log("<B><font color = 'orange'> Step 9 -</font> Image Date is :"+imageDate6);
			System.out.println("Current Date: "+imageDate6);
			
			helper.waitFor(ShowAnalytics6);
			helper.highLightElement(driver, ShowAnalytics6);
			helper.jsScrollintoview(ShowAnalytics6);
			ShowAnalytics6.click();
			Reporter.log("<B><font color = 'orange'> Step10 -</font> Clicked On Show Analytics Icon");
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
			//									    System.out.println("Testing last Seen Adresss: "+lastSeen);
			String   lastSeenDate_today6=null;
			lastSeenDate_today6 = lastSeen.getText();
			Reporter.log("<B><font color = 'orange'> Step11 -</font> Last_Seen_childWindow AdDetails Page= " +  lastSeenDate_today6);
			System.out.println("lastSeenDate_today: "+lastSeenDate_today6);


			driver.close();

			driver.switchTo().window(parent6);
			System.out.println("lastSeenDate_today: "+lastSeenDate_today6);


			String join = null;
			//  String[] actualDate = null;

			String[] splitString = lastSeenDate_today6.split(" ");
			for(int i=0;i<splitString.length-2;i++) {
				String actualDate=splitString[i]; 
				join= splitString[i+1]+" "+ splitString[i]+" " + splitString[i+2];
				//  System.out.println("splitString : " + splitString[i]);
				System.out.println("lastseen Date: " + join);
			}

			Assert.assertEquals(imageDate6, join);
			Reporter.log("<B><font color = 'orange'> Step12 -</font> Both Last Seen Date are Matching in Assert Pass :"+imageDate6+ " == " +join);
			System.out.println("Both Last Seen Date are Matching in Assert Pass :"+imageDate6+ " == " +join);
		}
		catch(Exception e) {
			System.out.println("Image is not able:   Opp!Looks like we don't have data for this search criteria yet.\r\n"
					+ "But don't worry, Spidey is on the crawl now and it will scrape ads for this search criteria for you ASAP.");

			Reporter.log("<B><font color = 'orange'> Step9 -</font> Image is not able:   Opp! Looks like we don't have data for this search criteria yet."
					+ "   But don't worry, Spidey is on the crawl now and it will scrape ads for this search criteria for you ASAP.");
		}    



		
		try {
			Reporter.log(" ");
			Reporter.log("<B><font color = 'Blue'> -7 Ads image-  -</font> ");
			System.out.println("");
			System.out.println("7 Ads image");
			String  imageDate7= date7.getText();
			Reporter.log("<B><font color = 'orange'> Step9 -</font> Image Date is :"+imageDate7);
			System.out.println("Current Date: "+imageDate7);
			
			helper.waitFor(ShowAnalytics7);
			helper.highLightElement(driver, ShowAnalytics7);
			helper.jsScrollintoview(ShowAnalytics7);
			ShowAnalytics7.click();
			Reporter.log("<B><font color = 'orange'> Step10 -</font> Clicked On Show Analytics Icon");
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
			//										    System.out.println("Testing last Seen Adresss: "+lastSeen);
			String   lastSeenDate_today7=null;
			lastSeenDate_today7 = lastSeen.getText();
			Reporter.log("<B><font color = 'orange'> Step11 -</font> Last_Seen_childWindow AdDetails Page= " +  lastSeenDate_today7);
			System.out.println("lastSeenDate_today: "+lastSeenDate_today7);


			driver.close();

			driver.switchTo().window(parent7);
			System.out.println("lastSeenDate_today: "+lastSeenDate_today7);


			String join = null;
			//  String[] actualDate = null;

			String[] splitString = lastSeenDate_today7.split(" ");
			for(int i=0;i<splitString.length-2;i++) {
				String actualDate=splitString[i]; 
				join= splitString[i+1]+" "+ splitString[i]+" " + splitString[i+2];
				//  System.out.println("splitString : " + splitString[i]);
				System.out.println("lastseen Date: " + join);
			}

			Assert.assertEquals(imageDate7, join);
			Reporter.log("<B><font color = 'orange'> Step12 -</font> Both Last Seen Date are Matching in Assert Pass :"+imageDate7+ " == " +join);
			System.out.println("Both Last Seen Date are Matching in Assert Pass :"+imageDate7+ " == " +join);
		}
		catch(Exception e) {
			System.out.println("Image is not able:   Opp!Looks like we don't have data for this search criteria yet.\r\n"
					+ "But don't worry, Spidey is on the crawl now and it will scrape ads for this search criteria for you ASAP.");

			Reporter.log("<B><font color = 'orange'> Step9 -</font> Image is not able:   Opp! Looks like we don't have data for this search criteria yet."
					+ "   But don't worry, Spidey is on the crawl now and it will scrape ads for this search criteria for you ASAP.");
		}    

		
		try {
			Reporter.log(" ");
			Reporter.log("<B><font color = 'Blue'> -8 Ads image-  -</font> ");
			System.out.println("");
			System.out.println("8 Ads image");
			String  imageDate8= date8.getText();
			Reporter.log("<B><font color = 'orange'> Step9 -</font> Image Date is :"+imageDate8);
			System.out.println("Current Date: "+imageDate8);
			
			helper.waitFor(ShowAnalytics8);
			helper.highLightElement(driver, ShowAnalytics8);
			helper.jsScrollintoview(ShowAnalytics8);
			ShowAnalytics8.click();
			Reporter.log("<B><font color = 'orange'> Step10 -</font> Clicked On Show Analytics Icon");
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
			//										    System.out.println("Testing last Seen Adresss: "+lastSeen);
			String   lastSeenDate_today8=null;
			lastSeenDate_today8 = lastSeen.getText();
			Reporter.log("<B><font color = 'orange'> Step11 -</font> Last_Seen_childWindow AdDetails Page= " +  lastSeenDate_today8);
			System.out.println("lastSeenDate_today: "+lastSeenDate_today8);


			driver.close();

			driver.switchTo().window(parent8);
			System.out.println("lastSeenDate_today: "+lastSeenDate_today8);


			String join = null;
			//  String[] actualDate = null;

			String[] splitString = lastSeenDate_today8.split(" ");
			for(int i=0;i<splitString.length-2;i++) {
				String actualDate=splitString[i]; 
				join= splitString[i+1]+" "+ splitString[i]+" " + splitString[i+2];
				//  System.out.println("splitString : " + splitString[i]);
				System.out.println("lastseen Date: " + join);
			}

			Assert.assertEquals(imageDate8, join);
			Reporter.log("<B><font color = 'orange'> Step12 -</font> Both Last Seen Date are Matching in Assert Pass :"+imageDate8+ " == " +join);
			System.out.println("Both Last Seen Date are Matching in Assert Pass :"+imageDate8+ " == " +join);
		}
		catch(Exception e) {
			System.out.println("Image is not able:   Opp!Looks like we don't have data for this search criteria yet.\r\n"
					+ "But don't worry, Spidey is on the crawl now and it will scrape ads for this search criteria for you ASAP.");

			Reporter.log("<B><font color = 'orange'> Step9 -</font> Image is not able:   Opp! Looks like we don't have data for this search criteria yet."
					+ "   But don't worry, Spidey is on the crawl now and it will scrape ads for this search criteria for you ASAP.");
		}    

		
		try {
			Reporter.log(" ");
			Reporter.log("<B><font color = 'Blue'> -9 Ads image-  -</font> ");
			System.out.println("");
			System.out.println("9 Ads image");
			String  imageDate9= date9.getText();
			Reporter.log("<B><font color = 'orange'> Step9 -</font> Image Date is :"+imageDate9);
			System.out.println("Current Date: "+imageDate9);
			
			helper.waitFor(ShowAnalytics9);
			helper.highLightElement(driver, ShowAnalytics9);
			helper.jsScrollintoview(ShowAnalytics9);
			ShowAnalytics9.click();
			Reporter.log("<B><font color = 'orange'> Step10 -</font> Clicked On Show Analytics Icon");
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
			//										    System.out.println("Testing last Seen Adresss: "+lastSeen);
			String   lastSeenDate_today9=null;
			lastSeenDate_today9 = lastSeen.getText();
			Reporter.log("<B><font color = 'orange'> Step11 -</font> Last_Seen_childWindow AdDetails Page= " +  lastSeenDate_today9);
			System.out.println("lastSeenDate_today: "+lastSeenDate_today9);


			driver.close();

			driver.switchTo().window(parent9);
			System.out.println("lastSeenDate_today: "+lastSeenDate_today9);


			String join = null;
			//  String[] actualDate = null;

			String[] splitString = lastSeenDate_today9.split(" ");
			for(int i=0;i<splitString.length-2;i++) {
				String actualDate=splitString[i]; 
				join= splitString[i+1]+" "+ splitString[i]+" " + splitString[i+2];
				//  System.out.println("splitString : " + splitString[i]);
				System.out.println("lastseen Date: " + join);
			}

			Assert.assertEquals(imageDate9, join);
			Reporter.log("<B><font color = 'orange'> Step12 -</font> Both Last Seen Date are Matching in Assert Pass :"+imageDate9+ " == " +join);
			System.out.println("Both Last Seen Date are Matching in Assert Pass :"+imageDate9+ " == " +join);
		}
		catch(Exception e) {
			System.out.println("Image is not able:   Opp!Looks like we don't have data for this search criteria yet.\r\n"
					+ "But don't worry, Spidey is on the crawl now and it will scrape ads for this search criteria for you ASAP.");

			Reporter.log("<B><font color = 'orange'> Step9 -</font> Image is not able:   Opp! Looks like we don't have data for this search criteria yet."
					+ "   But don't worry, Spidey is on the crawl now and it will scrape ads for this search criteria for you ASAP.");
		}    


		try {
			Reporter.log(" ");
			Reporter.log("<B><font color = 'Blue'> -10 Ads image-  -</font> ");
			System.out.println("");
			System.out.println("10 Ads image");
			String  imageDate10= date10.getText();
			Reporter.log("<B><font color = 'orange'> Step9 -</font> Image Date is :"+imageDate10);
			System.out.println("Current Date: "+imageDate10);
			
			helper.waitFor(ShowAnalytics10);
			helper.highLightElement(driver, ShowAnalytics10);
			helper.jsScrollintoview(ShowAnalytics10);
			ShowAnalytics10.click();
			Reporter.log("<B><font color = 'orange'> Step10 -</font> Clicked On Show Analytics Icon");
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
			//										    System.out.println("Testing last Seen Adresss: "+lastSeen);
			String   lastSeenDate_today10=null;
			lastSeenDate_today10 = lastSeen.getText();
			Reporter.log("<B><font color = 'orange'> Step11 -</font> Last_Seen_childWindow AdDetails Page= " +  lastSeenDate_today10);
			System.out.println("lastSeenDate_today: "+lastSeenDate_today10);


			driver.close();

			driver.switchTo().window(parent10);
			System.out.println("lastSeenDate_today: "+lastSeenDate_today10);


			String join = null;
			//  String[] actualDate = null;

			String[] splitString = lastSeenDate_today10.split(" ");
			for(int i=0;i<splitString.length-2;i++) {
				String actualDate=splitString[i]; 
				join= splitString[i+1]+" "+ splitString[i]+" " + splitString[i+2];
				//  System.out.println("splitString : " + splitString[i]);
				System.out.println("lastseen Date: " + join);
			}

			Assert.assertEquals(imageDate10, join);
			Reporter.log("<B><font color = 'orange'> Step12 -</font> Both Last Seen Date are Matching in Assert Pass :"+imageDate10+ " == " +join);
			System.out.println("Both Last Seen Date are Matching in Assert Pass :"+imageDate10+ " == " +join);
		}
		catch(Exception e) {
			System.out.println("Image is not able:   Opp!Looks like we don't have data for this search criteria yet.\r\n"
					+ "But don't worry, Spidey is on the crawl now and it will scrape ads for this search criteria for you ASAP.");

			Reporter.log("<B><font color = 'orange'> Step9 -</font> Image is not able:   Opp! Looks like we don't have data for this search criteria yet."
					+ "   But don't worry, Spidey is on the crawl now and it will scrape ads for this search criteria for you ASAP.");
		}    

		try {
			Reporter.log(" ");
			Reporter.log("<B><font color = 'Blue'> -11 Ads image-  -</font> ");
			System.out.println("");
			System.out.println("11 Ads image");
			String  imageDate11= date11.getText();
			Reporter.log("<B><font color = 'orange'> Step9 -</font> Image Date is :"+imageDate11);
			System.out.println("Current Date: "+imageDate11);
			
			helper.waitFor(ShowAnalytics11);
			helper.highLightElement(driver, ShowAnalytics11);
			helper.jsScrollintoview(ShowAnalytics11);
			ShowAnalytics11.click();
			Reporter.log("<B><font color = 'orange'> Step10 -</font> Clicked On Show Analytics Icon");
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
			//										    System.out.println("Testing last Seen Adresss: "+lastSeen);
			String   lastSeenDate_today11=null;
			lastSeenDate_today11 = lastSeen.getText();
			Reporter.log("<B><font color = 'orange'> Step11 -</font> Last_Seen_childWindow AdDetails Page= " +  lastSeenDate_today11);
			System.out.println("lastSeenDate_today: "+lastSeenDate_today11);


			driver.close();

			driver.switchTo().window(parent11);
			System.out.println("lastSeenDate_today: "+lastSeenDate_today11);


			String join = null;
			//  String[] actualDate = null;

			String[] splitString = lastSeenDate_today11.split(" ");
			for(int i=0;i<splitString.length-2;i++) {
				String actualDate=splitString[i]; 
				join= splitString[i+1]+" "+ splitString[i]+" " + splitString[i+2];
				//  System.out.println("splitString : " + splitString[i]);
				System.out.println("lastseen Date: " + join);
			}

			Assert.assertEquals(imageDate11, join);
			Reporter.log("<B><font color = 'orange'> Step12 -</font> Both Last Seen Date are Matching in Assert Pass :"+imageDate11+ " == " +join);
			System.out.println("Both Last Seen Date are Matching in Assert Pass :"+imageDate11+ " == " +join);
		}
		catch(Exception e) {
			System.out.println("Image is not able:   Opp!Looks like we don't have data for this search criteria yet.\r\n"
					+ "But don't worry, Spidey is on the crawl now and it will scrape ads for this search criteria for you ASAP.");

			Reporter.log("<B><font color = 'orange'> Step9 -</font> Image is not able:   Opp! Looks like we don't have data for this search criteria yet."
					+ "   But don't worry, Spidey is on the crawl now and it will scrape ads for this search criteria for you ASAP.");
		}    

		
		try {
			Reporter.log(" ");
			Reporter.log("<B><font color = 'Blue'> -12 Ads image-  -</font> ");
			System.out.println("");
			System.out.println("12 Ads image");
			String  imageDate12= date12.getText();
			Reporter.log("<B><font color = 'orange'> Step9 -</font> Image Date is :"+imageDate12);
			System.out.println("Current Date: "+imageDate12);
			
			helper.waitFor(ShowAnalytics12);
			helper.highLightElement(driver, ShowAnalytics12);
			helper.jsScrollintoview(ShowAnalytics12);
			ShowAnalytics12.click();
			Reporter.log("<B><font color = 'orange'> Step10 -</font> Clicked On Show Analytics Icon");
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
			//										    System.out.println("Testing last Seen Adresss: "+lastSeen);
			String   lastSeenDate_today12=null;
			lastSeenDate_today12 = lastSeen.getText();
			Reporter.log("<B><font color = 'orange'> Step11 -</font> Last_Seen_childWindow AdDetails Page= " +  lastSeenDate_today12);
			System.out.println("lastSeenDate_today: "+lastSeenDate_today12);


			driver.close();

			driver.switchTo().window(parent12);
			System.out.println("lastSeenDate_today: "+lastSeenDate_today12);


			String join = null;
			//  String[] actualDate = null;

			String[] splitString = lastSeenDate_today12.split(" ");
			for(int i=0;i<splitString.length-2;i++) {
				String actualDate=splitString[i]; 
				join= splitString[i+1]+" "+ splitString[i]+" " + splitString[i+2];
				//  System.out.println("splitString : " + splitString[i]);
				System.out.println("lastseen Date: " + join);
			}

			Assert.assertEquals(imageDate12, join);
			Reporter.log("<B><font color = 'orange'> Step12 -</font> Both Last Seen Date are Matching in Assert Pass :"+imageDate12+ " == " +join);
			System.out.println("Both Last Seen Date are Matching in Assert Pass :"+imageDate12+ " == " +join);
		}
		catch(Exception e) {
			System.out.println("Image is not able:   Opp!Looks like we don't have data for this search criteria yet.\r\n"
					+ "But don't worry, Spidey is on the crawl now and it will scrape ads for this search criteria for you ASAP.");

			Reporter.log("<B><font color = 'orange'> Step9 -</font> Image is not able:   Opp! Looks like we don't have data for this search criteria yet."
					+ "   But don't worry, Spidey is on the crawl now and it will scrape ads for this search criteria for you ASAP.");
		}    

		
		try {
			Reporter.log(" ");
			Reporter.log("<B><font color = 'Blue'> -13 Ads image-  -</font> ");
			System.out.println("");
			System.out.println("13 Ads image");
			String  imageDate13= date13.getText();
			Reporter.log("<B><font color = 'orange'> Step9 -</font> Image Date is :"+imageDate13);
			System.out.println("Current Date: "+imageDate13);
			
			helper.waitFor(ShowAnalytics13);
			helper.highLightElement(driver, ShowAnalytics13);
			helper.jsScrollintoview(ShowAnalytics13);
			ShowAnalytics13.click();
			Reporter.log("<B><font color = 'orange'> Step10 -</font> Clicked On Show Analytics Icon");
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
			//										    System.out.println("Testing last Seen Adresss: "+lastSeen);
			String   lastSeenDate_today13=null;
			lastSeenDate_today13 = lastSeen.getText();
			Reporter.log("<B><font color = 'orange'> Step11 -</font> Last_Seen_childWindow AdDetails Page= " +  lastSeenDate_today13);
			System.out.println("lastSeenDate_today: "+lastSeenDate_today13);


			driver.close();

			driver.switchTo().window(parent13);
			System.out.println("lastSeenDate_today: "+lastSeenDate_today13);


			String join = null;
			//  String[] actualDate = null;

			String[] splitString = lastSeenDate_today13.split(" ");
			for(int i=0;i<splitString.length-2;i++) {
				String actualDate=splitString[i]; 
				join= splitString[i+1]+" "+ splitString[i]+" " + splitString[i+2];
				//  System.out.println("splitString : " + splitString[i]);
				System.out.println("lastseen Date: " + join);
			}

			Assert.assertEquals(imageDate13, join);
			Reporter.log("<B><font color = 'orange'> Step12 -</font> Both Last Seen Date are Matching in Assert Pass :"+imageDate13+ " == " +join);
			System.out.println("Both Last Seen Date are Matching in Assert Pass :"+imageDate13+ " == " +join);
		}
		catch(Exception e) {
			System.out.println("Image is not able:   Opp!Looks like we don't have data for this search criteria yet.\r\n"
					+ "But don't worry, Spidey is on the crawl now and it will scrape ads for this search criteria for you ASAP.");

			Reporter.log("<B><font color = 'orange'> Step9 -</font> Image is not able:   Opp! Looks like we don't have data for this search criteria yet."
					+ "   But don't worry, Spidey is on the crawl now and it will scrape ads for this search criteria for you ASAP.");
		}    

		
		try {
			Reporter.log(" ");
			Reporter.log("<B><font color = 'Blue'> -14 Ads image-  -</font> ");
			System.out.println("");
			System.out.println("14 Ads image");
			String  imageDate14= date14.getText();
			Reporter.log("<B><font color = 'orange'> Step9 -</font> Image Date is :"+imageDate14);
			System.out.println("Current Date: "+imageDate14);
			
			helper.waitFor(ShowAnalytics14);
			helper.highLightElement(driver, ShowAnalytics14);
			helper.jsScrollintoview(ShowAnalytics14);
			ShowAnalytics14.click();
			Reporter.log("<B><font color = 'orange'> Step10 -</font> Clicked On Show Analytics Icon");
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
			//										    System.out.println("Testing last Seen Adresss: "+lastSeen);
			String   lastSeenDate_today14=null;
			lastSeenDate_today14 = lastSeen.getText();
			Reporter.log("<B><font color = 'orange'> Step11 -</font> Last_Seen_childWindow AdDetails Page= " +  lastSeenDate_today14);
			System.out.println("lastSeenDate_today: "+lastSeenDate_today14);


			driver.close();

			driver.switchTo().window(parent14);
			System.out.println("lastSeenDate_today: "+lastSeenDate_today14);


			String join = null;
			//  String[] actualDate = null;

			String[] splitString = lastSeenDate_today14.split(" ");
			for(int i=0;i<splitString.length-2;i++) {
				String actualDate=splitString[i]; 
				join= splitString[i+1]+" "+ splitString[i]+" " + splitString[i+2];
				//  System.out.println("splitString : " + splitString[i]);
				System.out.println("lastseen Date: " + join);
			}

			Assert.assertEquals(imageDate14, join);
			Reporter.log("<B><font color = 'orange'> Step12 -</font> Both Last Seen Date are Matching in Assert Pass :"+imageDate14+ " == " +join);
			System.out.println("Both Last Seen Date are Matching in Assert Pass :"+imageDate14+ " == " +join);
		}
		catch(Exception e) {
			System.out.println("Image is not able:   Opp!Looks like we don't have data for this search criteria yet.\r\n"
					+ "But don't worry, Spidey is on the crawl now and it will scrape ads for this search criteria for you ASAP.");

			Reporter.log("<B><font color = 'orange'> Step9 -</font> Image is not able:   Opp! Looks like we don't have data for this search criteria yet."
					+ "   But don't worry, Spidey is on the crawl now and it will scrape ads for this search criteria for you ASAP.");
		}    

		
		try {
			Reporter.log(" ");
			Reporter.log("<B><font color = 'Blue'> -15 Ads image-  -</font> ");
			System.out.println("");
			System.out.println("15 Ads image");
			String  imageDate15= date15.getText();
			Reporter.log("<B><font color = 'orange'> Step9 -</font> Image Date is :"+imageDate15);
			System.out.println("Current Date: "+imageDate15);
			
			helper.waitFor(ShowAnalytics15);
			helper.highLightElement(driver, ShowAnalytics15);
			helper.jsScrollintoview(ShowAnalytics15);
			ShowAnalytics15.click();
			Reporter.log("<B><font color = 'orange'> Step10 -</font> Clicked On Show Analytics Icon");
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
			//										    System.out.println("Testing last Seen Adresss: "+lastSeen);
			String   lastSeenDate_today15=null;
			lastSeenDate_today15 = lastSeen.getText();
			Reporter.log("<B><font color = 'orange'> Step11 -</font> Last_Seen_childWindow AdDetails Page= " +  lastSeenDate_today15);
			System.out.println("lastSeenDate_today: "+lastSeenDate_today15);


			driver.close();

			driver.switchTo().window(parent15);
			System.out.println("lastSeenDate_today: "+lastSeenDate_today15);


			String join = null;
			//  String[] actualDate = null;

			String[] splitString = lastSeenDate_today15.split(" ");
			for(int i=0;i<splitString.length-2;i++) {
				String actualDate=splitString[i]; 
				join= splitString[i+1]+" "+ splitString[i]+" " + splitString[i+2];
				//  System.out.println("splitString : " + splitString[i]);
				System.out.println("lastseen Date: " + join);
			}

			Assert.assertEquals(imageDate15, join);
			Reporter.log("<B><font color = 'orange'> Step12 -</font> Both Last Seen Date are Matching in Assert Pass :"+imageDate15+ " == " +join);
			System.out.println("Both Last Seen Date are Matching in Assert Pass :"+imageDate15+ " == " +join);
		}
		catch(Exception e) {
			System.out.println("Image is not able:   Opp!Looks like we don't have data for this search criteria yet.\r\n"
					+ "But don't worry, Spidey is on the crawl now and it will scrape ads for this search criteria for you ASAP.");

			Reporter.log("<B><font color = 'orange'> Step9 -</font> Image is not able:   Opp! Looks like we don't have data for this search criteria yet."
					+ "   But don't worry, Spidey is on the crawl now and it will scrape ads for this search criteria for you ASAP.");
		}    
		
		
		
		helper.waitFor(Clear_Filters);
		helper.highLightElement(driver, Clear_Filters);
		helper.jsScrollintoview(Clear_Filters);
		Clear_Filters.click();
		Reporter.log("<B><font color = 'orange'> Step8 -</font> Clicked On Clear Filters Icon");
		helper.waitForPageToLoad();

	}


	/****  Facebook SortBy Running Longest ****/	
	public void Facebook_SortBy_RunningLongest() throws InterruptedException
	{
		System.out.println();
		System.out.println("ShortBy Running Longest: ");
		Reporter.log("    ");
		Reporter.log("<B><font color = 'red'>  - ShortBy Running Longest Step will Start from here </font>");
		helper.waitFor(sortBy);
		helper.highLightElement(driver, sortBy);
		sortBy.click();
		Reporter.log("<B><font color = 'orange'> Step1 -</font> Clicked On sortBy Icon");

		helper.waitFor(sortby_Running_longest);
		helper.highLightElement(driver, sortby_Running_longest);
		sortby_Running_longest.click();
		Reporter.log("<B><font color = 'orange'> Step2 -</font> Clicked On sortBy Running longest Icon");

		helper.waitFor(searchButton);
		helper.highLightElement(driver, searchButton);
		searchButton.click();
		Reporter.log("<B><font color = 'orange'> Step3 -</font> Clicked On search Button Icon");
		helper.waitForPageToLoad();

		String totaladscount=totaladscount_div.getText();
		System.out.println("Running Longest Totaladscount: "+totaladscount);
		Reporter.log("<B><font color = 'orange'> Step4 -</font> Running Longest Total Ad Count is :"+ totaladscount);
		System.out.println();

		helper.waitFor(showAnalytics);
		helper.highLightElement(driver, showAnalytics);
		helper.jsScrollintoview(showAnalytics);
		showAnalytics.click();
		Reporter.log("<B><font color = 'orange'> Step5 -</font> Clicked On Show Analytics Icon");
		helper.waitForPageToLoad();
		String imageDate=Date1.getText();
		Reporter.log("<B><font color = 'orange'> Step6 -</font> Image  Date is :"+imageDate);

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
				String imageDate1 = lastSeen.getText();
				System.out.println("Analytics LastSeen Date: "+imageDate1);

				String imageDate2 = LongestRunningDate.getText();
				System.out.println("Analytics LongestRunning Date: "+imageDate2);
				Reporter.log("<B><font color = 'orange'> Step7 -</font> Image Last Seen Date of is :"+imageDate1);
				Reporter.log("<B><font color = 'orange'> Step8 -</font> Image Date of Running Longest is :"+imageDate2);
				driver.close();
			}
		}
		System.out.println("Current Image Date: "+imageDate);
		driver.switchTo().window(parent);

		helper.waitFor(Clear_Filters);
		helper.highLightElement(driver, Clear_Filters);
		helper.jsScrollintoview(Clear_Filters);
		Clear_Filters.click();
		Reporter.log("<B><font color = 'orange'> Step10 -</font> Clicked On Clear Filters Icon");
		helper.waitForPageToLoad();

	}



	/****  SortBy Domain Registration Date ****/
	public void SortBy_Domain_Registration_Date() throws InterruptedException
	{
		System.out.println();
		System.out.println("ShortBy Domain Registration Date: ");
		Reporter.log("    ");
		Reporter.log("<B><font color = 'red'>  - ShortBy Domain Registration Date Step will Start from here </font>");
		helper.waitFor(sortBy);
		helper.highLightElement(driver, sortBy);
		sortBy.click();
		Reporter.log("<B><font color = 'orange'> Step1 -</font> Clicked On sortBy Icon");

		helper.waitFor(domain_Registration_Date);
		helper.highLightElement(driver, domain_Registration_Date);
		domain_Registration_Date.click();
		Reporter.log("<B><font color = 'orange'> Step2 -</font> Clicked On sortBy Domain Registration Date Icon");

		helper.waitFor(searchButton);
		helper.highLightElement(driver, searchButton);
		searchButton.click();
		Reporter.log("<B><font color = 'orange'> Step3 -</font> Clicked On search Button Icon");
		helper.waitForPageToLoad();

		String totaladscount=totaladscount_div.getText();
		System.out.println("Domain Registration Date Totaladscount: "+totaladscount);
		Reporter.log("<B><font color = 'orange'> Step4 -</font> domain Registration Date Total Ad Count is :"+ totaladscount);
		System.out.println();

		helper.waitFor(showAnalytics);
		helper.highLightElement(driver, showAnalytics);
		helper.jsScrollintoview(showAnalytics);
		showAnalytics.click();
		Reporter.log("<B><font color = 'orange'> Step5 -</font> Clicked On Show Analytics Icon");
		helper.waitForPageToLoad();
		String imageDate=Date1.getText();
		Reporter.log("<B><font color = 'orange'> Step6 -</font> Image Date is :"+imageDate);

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
				String imageDate2 = lastSeen.getText();
				System.out.println("Analytics Last Seen Date: "+imageDate2);
				String imageDate1 = domain_Registration.getText();
				System.out.println("Analytics Domain Registration Date: "+imageDate1);
				Reporter.log("<B><font color = 'orange'> Step7 -</font> Image Last Seen Date of :"+imageDate2);
				Reporter.log("<B><font color = 'orange'> Step8 -</font> Image Date of Domain Registration Date is :"+imageDate1);
				driver.close();
			}
		}

		System.out.println("Current Image Date: "+imageDate);
		driver.switchTo().window(parent);

		helper.waitFor(Clear_Filters);
		helper.highLightElement(driver, Clear_Filters);
		helper.jsScrollintoview(Clear_Filters);
		Clear_Filters.click();
		Reporter.log("<B><font color = 'orange'> Step9 -</font> Clicked On Clear Filters Icon");
		//		helper.waitForPageToLoad();

	}




}
