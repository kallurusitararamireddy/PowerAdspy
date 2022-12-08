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

public class Reddit_SortBy_VerificationPage extends BasePage 
{
	
	Helpers helper=new Helpers();

	public Reddit_SortBy_VerificationPage(WebDriver driver) throws InterruptedException  
	{
		super(TestBase.getDriver());

	}
	
	@FindBy(xpath = "//img[@class='active_pg_logo img-fluid']")
	WebElement Logo;

	@FindBy(css = "a[id='reddit_ads'] img")
	WebElement reddit;

	@FindBy(id = "search-ads")
	WebElement searchButton;

	@FindBy(xpath = "//span[@class='dropdown-label dropdown_filter']")
	WebElement sortBy;

	@FindBy(id = "totaladscount-div")
	WebElement totaladscount_div;

	@FindBy(xpath = "//a[normalize-space()='Newest']")
	WebElement SortBy_Newest;
	
	@FindBy(xpath = "//a[text()='Show Analytics']")
	WebElement showAnalytics;

	@FindBy(id  = "first_seen_block")
	WebElement firstSeen;

	@FindBy(id = "last_seen_block")
	WebElement lastSeen;

	@FindBy(id = "post_date_block")
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

	@FindBy(xpath = "(//div[@class='card_col_1']//div[@class='ad_date'])[2]")
	WebElement date3;
	@FindBy(xpath = "(//div[@class='card_col_1']//a[text()='Show Analytics'])[2]")
	WebElement ShowAnalytics3;

	@FindBy(xpath = "(//div[@class='card_col_2']//div[@class='ad_date'])[2]")
	WebElement date4;
	@FindBy(xpath = "(//div[@class='card_col_2']//a[text()='Show Analytics'])[2]")
	WebElement ShowAnalytics4;

	@FindBy(xpath = "(//div[@class='card_col_1']//div[@class='ad_date'])[3]")
	WebElement date5;
	@FindBy(xpath = "(//div[@class='card_col_1']//a[text()='Show Analytics'])[3]")
	WebElement ShowAnalytics5;

	@FindBy(xpath = "(//div[@class='card_col_2']//div[@class='ad_date'])[3]")
	WebElement date6;
	@FindBy(xpath = "(//div[@class='card_col_2']//a[text()='Show Analytics'])[3]")
	WebElement ShowAnalytics6;

	@FindBy(xpath = "(//div[@class='card_col_1']//div[@class='ad_date'])[4]")
	WebElement date7;
	@FindBy(xpath = "(//div[@class='card_col_1']//a[text()='Show Analytics'])[4]")
	WebElement ShowAnalytics7;

	@FindBy(xpath = "(//div[@class='card_col_2']//div[@class='ad_date'])[4]")
	WebElement date8;
	@FindBy(xpath = "(//div[@class='card_col_2']//a[text()='Show Analytics'])[4]")
	WebElement ShowAnalytics8;

	@FindBy(xpath = "(//div[@class='card_col_1']//div[@class='ad_date'])[5]")
	WebElement date9;
	@FindBy(xpath = "(//div[@class='card_col_1']//a[text()='Show Analytics'])[5]")
	WebElement ShowAnalytics9;

	@FindBy(xpath = "(//div[@class='card_col_2']//div[@class='ad_date'])[5]")
	WebElement date10;
	@FindBy(xpath = "(//div[@class='card_col_2']//a[text()='Show Analytics'])[5]")
	WebElement ShowAnalytics10;

	@FindBy(xpath = "(//div[@class='card_col_1']//div[@class='ad_date'])[6]")
	WebElement date11;
	@FindBy(xpath = "(//div[@class='card_col_1']//a[text()='Show Analytics'])[6]")
	WebElement ShowAnalytics11;

	@FindBy(xpath = "(//div[@class='card_col_2']//div[@class='ad_date'])[6]")
	WebElement date12;
	@FindBy(xpath = "(//div[@class='card_col_2']//a[text()='Show Analytics'])[6]")
	WebElement ShowAnalytics12;

	@FindBy(xpath = "(//div[@class='card_col_1']//div[@class='ad_date'])[7]")
	WebElement date13;
	@FindBy(xpath = "(//div[@class='card_col_1']//a[text()='Show Analytics'])[7]")
	WebElement ShowAnalytics13;

	@FindBy(xpath = "(//div[@class='card_col_2']//div[@class='ad_date'])[7]")
	WebElement date14;
	@FindBy(xpath = "(//div[@class='card_col_2']//a[text()='Show Analytics'])[7]")
	WebElement ShowAnalytics14;

	@FindBy(xpath = "(//div[@class='card_col_1']//div[@class='ad_date'])[8]")
	WebElement date15;
	@FindBy(xpath = "(//div[@class='card_col_1']//a[text()='Show Analytics'])[8]")
	WebElement ShowAnalytics15;


public void Redditpage()
{

	Reporter.log("<B><font color = 'purple'> Step1 -</font> Logged into PowerAdSpy Application");


	//		helper.waitForPageToLoad();
	helper.waitFor(Logo);
	helper.highLightElement(driver, Logo);
	Assert.assertTrue(Logo.isDisplayed(), "Power Ad Spy Logo is Dispalyed");
	Reporter.log("<B><font color = 'purple'> Step3 -</font> Power Ad Spy Logo is Displayed");

	helper.waitFor(reddit);
	helper.highLightElement(driver, reddit);
	reddit.click();
	
	String Page_titel = driver.getTitle();
	System.out.println(Page_titel);
	Reporter.log("<B><font color = 'purple'> Step2 -</font> I am on the page :" + Page_titel);
	
	Assert.assertTrue(reddit.isDisplayed(), "PowerAdSpy | Reddit Dashboard");
	Reporter.log("<B><font color = 'purple'> Step4 -</font> Clicked On Reddit Icon");
	//		helper.waitForPageToLoad();
}
	public void Reddit_SortBy_Newest() throws Exception  
	{
		System.out.println();
		System.out.println("ShortBy Newest:");
		Reporter.log("    ");
		Reporter.log("<B><font color = 'green'>  - ShortBy Newest Step will Start from here </font>  ");
		helper.waitFor(sortBy);
		helper.highLightElement(driver, sortBy);
		sortBy.click();
		Reporter.log("");
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
		Reporter.log("<B><font color ='red'> -1 Ad- -</font>  ");
		System.out.println("");
		System.out.println("1 Ads");
		helper.Scrollintoview(date1);
		helper.highLightElement(driver, date1);
		String imageDate=date1.getText();
		Reporter.log("<B><font color = 'blue'> ==> -</font> Image Date is :"+imageDate); 
		helper.waitFor(ShowAnalytics1);
		helper.highLightElement(driver, ShowAnalytics1);
		helper.jsScrollintoview(ShowAnalytics1);
		
		
		  String linkText1 = ShowAnalytics1.getAttribute("href");
		  String idString1 = null;
		  String[] splitStringid1 = linkText1.split("/");
		  for(int i=0;i<splitStringid1.length;i++) {
		    String actualDate1=splitStringid1[splitStringid1.length-1]; 
		    System.out.println("actualDate : " + actualDate1);
		    Reporter.log("<B><font color = 'blue'> ==> -</font> ID of the  Ad = " + actualDate1);
		    break;
		  }
		
		ShowAnalytics1.click();
		Reporter.log("<B><font color = 'blue'> ==> -</font> Clicked On Show Analytics Icon");
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
				helper.Scrollintoview(firstSeen);
				String imageDate1 = firstSeen.getText();
				System.out.println("Analytics Image First Seen Date: "+imageDate1);
				helper.Scrollintoview(lastSeen);
				String imageDate2 = lastSeen.getText();
				System.out.println("Analytics Image Last Seen Date: "+imageDate2);
				helper.Scrollintoview(postDate);
				String imageDate3 = postDate.getText();
				System.out.println("Analytics Image Post Seen Date: "+imageDate3);
				Reporter.log("<B><font color = 'blue'> ==> -</font> Image Date of First Seen is :"+imageDate1);
				Reporter.log("<B><font color = 'blue'> ==> -</font> Image Date of Last Seen is :"+imageDate2);
				Reporter.log("<B><font color = 'blue'> ==> -</font> Image Date of Post Seen is :"+imageDate3);
				
				String join1=null;
				String[] splitString1 = imageDate2.split(" ");
				for(int i=0;i<splitString1.length-2;i++) {
					String actualDate1=splitString1[i]; 
					join1= splitString1[i+1]+" "+ splitString1[i]+" " + splitString1[i+2];
					//  System.out.println("splitString : " + splitString[i]);
					System.out.println("lastseen Date: " + join1);
				}
				Assert.assertEquals(imageDate, join1);
				System.out.println("Both Matching Date Assert Pass :"+imageDate+"="+join1);
				Reporter.log("<B><font color = 'blue'> ==> -</font> Both Matching Date Assert Pass :"+imageDate+"="+join1);
				
				driver.close();
			}
		}
		System.out.println("Current Image Date: "+imageDate);
		driver.switchTo().window(parent);


		Reporter.log(" ");
		Reporter.log("<B><font color ='red'> -2 Ad- -</font>  ");
		System.out.println(" ");
		System.out.println("2 Ads image");
		helper.Scrollintoview(date2);
		helper.highLightElement(driver, date2);
		String imageDate1=date2.getText();
		Reporter.log("<B><font color = 'blue'> ==> -</font> Image Date is :"+imageDate1); 
		helper.waitFor(ShowAnalytics2);
		helper.highLightElement(driver, ShowAnalytics2);
		helper.jsScrollintoview(ShowAnalytics2);
		
		String linkText2 = ShowAnalytics2.getAttribute("href");
		  String idString2 = null;
		  String[] splitStringid2 = linkText2.split("/");
		  for(int i=0;i<splitStringid2.length;i++) {
		    String actualDate2=splitStringid2[splitStringid2.length-1]; 
		    System.out.println("actualDate : " + actualDate2);
		    Reporter.log("<B><font color = 'blue'> ==> -</font> ID of the  Ad = " + actualDate2);
		    break;
		  }
		
		ShowAnalytics2.click();
		Reporter.log("<B><font color = 'blue'> ==> -</font> Clicked On Show Analytics Icon");
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
				helper.Scrollintoview(firstSeen);
				String imageDate11 = firstSeen.getText();
				System.out.println("Analytics Image First Seen Date: "+imageDate11);
				helper.Scrollintoview(lastSeen);
				String imageDate2 = lastSeen.getText();
				System.out.println("Analytics Image Last Seen Date: "+imageDate2);
				helper.Scrollintoview(postDate);
				String imageDate3 = postDate.getText();
				System.out.println("Analytics Image Post Seen Date: "+imageDate3);
				Reporter.log("<B><font color = 'blue'> ==> -</font> Image Date of First Seen is :"+imageDate11);
				Reporter.log("<B><font color = 'blue'> ==> -</font> Image Date of Last Seen is :"+imageDate2);
				Reporter.log("<B><font color = 'blue'> ==> -</font> Image Date of Post Seen is :"+imageDate3);
				
				String join2=null;
				String[] splitString2 = imageDate2.split(" ");
				for(int i=0;i<splitString2.length-2;i++) {
					String actualDate2=splitString2[i]; 
					join2= splitString2[i+1]+" "+ splitString2[i]+" " + splitString2[i+2];
					//  System.out.println("splitString : " + splitString[i]);
					System.out.println("lastseen Date: " + join2);
				}
				Assert.assertEquals(imageDate1, join2);
				System.out.println("Both Matching Date Assert Pass :"+imageDate1+"="+join2);
				Reporter.log("<B><font color = 'blue'> ==> -</font> Both Matching Date Assert Pass :"+imageDate1+"="+join2);
				
				driver.close();
			}
		}
		System.out.println("Current Image Date: "+imageDate);
		driver.switchTo().window(parent1);


		Reporter.log(" ");
		Reporter.log("<B><font color ='red'> -3 Ad- -</font>  ");
		System.out.println(" ");
		System.out.println("3 Ads image");
		helper.Scrollintoview(date3);
		helper.highLightElement(driver, date3);
		String imageDate121=date3.getText();
		Reporter.log("<B><font color = 'blue'> ==> -</font> Image Date is :"+imageDate121); 
		helper.waitFor(ShowAnalytics3);
		helper.highLightElement(driver, ShowAnalytics3);
		helper.jsScrollintoview(ShowAnalytics3);
		
		String linkText3 = ShowAnalytics3.getAttribute("href");
		  String idString3 = null;
		  String[] splitStringid3 = linkText3.split("/");
		  for(int i=0;i<splitStringid3.length;i++) {
		    String actualDate3=splitStringid3[splitStringid3.length-1]; 
		    System.out.println("actualDate : " + actualDate3);
		    Reporter.log("<B><font color = 'blue'> ==> -</font> ID of the  Ad = " + actualDate3);
		    break;
		  }
		
		ShowAnalytics3.click();
		Reporter.log("<B><font color = 'blue'> ==> -</font> Clicked On Show Analytics Icon");
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
				helper.Scrollintoview(firstSeen);
				String imageDate111 = firstSeen.getText();
				System.out.println("Analytics Image First Seen Date: "+imageDate111);
				helper.Scrollintoview(lastSeen);
				String imageDate2 = lastSeen.getText();
				System.out.println("Analytics Image Last Seen Date: "+imageDate2);
				helper.Scrollintoview(postDate);
				String imageDate3 = postDate.getText();
				System.out.println("Analytics Image Post Seen Date: "+imageDate3);
				Reporter.log("<B><font color = 'blue'> ==> -</font> Image Date of First Seen is :"+imageDate111);
				Reporter.log("<B><font color = 'blue'> ==> -</font> Image Date of Last Seen is :"+imageDate2);
				Reporter.log("<B><font color = 'blue'> ==> -</font> Image Date of Post Seen is :"+imageDate3);
				
				String join3=null;
				String[] splitString3 = imageDate2.split(" ");
				for(int i=0;i<splitString3.length-2;i++) {
					String actualDate3=splitString3[i]; 
					join3= splitString3[i+1]+" "+ splitString3[i]+" " + splitString3[i+2];
					//  System.out.println("splitString : " + splitString[i]);
					System.out.println("lastseen Date: " + join3);
				}
				Assert.assertEquals(imageDate121, join3);
				System.out.println("Both Matching Date Assert Pass :"+imageDate121+"="+join3);
				Reporter.log("<B><font color = 'blue'> ==> -</font> Both Matching Date Assert Pass :"+imageDate121+"="+join3);
				
				driver.close();
			}
		}
		System.out.println("Current Image Date: "+imageDate121);
		driver.switchTo().window(parent121);

		Reporter.log(" ");
		Reporter.log("<B><font color ='red'> -4 Ad- -</font>  ");
		System.out.println(" ");
		System.out.println("4 Ads image");
		helper.Scrollintoview(date4);
		helper.highLightElement(driver, date4);
		String imageDate111=date4.getText();
		Reporter.log("<B><font color = 'blue'> ==> -</font> Image Date is :"+imageDate111); 
		helper.waitFor(ShowAnalytics4);
		helper.highLightElement(driver, ShowAnalytics4);
		helper.jsScrollintoview(ShowAnalytics4);
		
		String linkText4 = ShowAnalytics4.getAttribute("href");
		  String idString4 = null;
		  String[] splitStringid4 = linkText4.split("/");
		  for(int i=0;i<splitStringid4.length;i++) {
		    String actualDate4=splitStringid4[splitStringid4.length-1]; 
		    System.out.println("actualDate : " + actualDate4);
		    Reporter.log("<B><font color = 'blue'> ==> -</font> ID of the  Ad = " + actualDate4);
		    break;
		  }
		
		ShowAnalytics4.click();
		Reporter.log("<B><font color = 'blue'> ==> -</font> Clicked On Show Analytics Icon");
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
				helper.Scrollintoview(firstSeen);
				String imageDate1111 = firstSeen.getText();
				System.out.println("Analytics Image First Seen Date: "+imageDate1111);
				helper.Scrollintoview(lastSeen);
				String imageDate2 = lastSeen.getText();
				System.out.println("Analytics Image Last Seen Date: "+imageDate2);
				helper.Scrollintoview(postDate);
				String imageDate3 = postDate.getText();
				System.out.println("Analytics Image Post Seen Date: "+imageDate3);
				Reporter.log("<B><font color = 'blue'> ==> -</font> Image Date of First Seen is :"+imageDate1111);
				Reporter.log("<B><font color = 'blue'> ==> -</font> Image Date of Last Seen is :"+imageDate2);
				Reporter.log("<B><font color = 'blue'> ==> -</font> Image Date of Post Seen is :"+imageDate3);
				
				String join4=null;
				String[] splitString4 = imageDate2.split(" ");
				for(int i=0;i<splitString4.length-2;i++) {
					String actualDate4=splitString4[i]; 
					join4= splitString4[i+1]+" "+ splitString4[i]+" " + splitString4[i+2];
					//  System.out.println("splitString : " + splitString[i]);
					System.out.println("lastseen Date: " + join4);
				}
				Assert.assertEquals(imageDate111, join4);
				System.out.println("Both Matching Date Assert Pass :"+imageDate111+"="+join4);
				Reporter.log("<B><font color = 'blue'> ==> -</font> Both Matching Date Assert Pass :"+imageDate111+"="+join4);
				driver.close();
			}
		}
		System.out.println("Current Image Date: "+imageDate111);
		driver.switchTo().window(parent111);

		Reporter.log(" ");
		Reporter.log("<B><font color ='red'> -5 Ad- -</font>  ");
		System.out.println(" ");
		System.out.println("5 Ads image");
		helper.Scrollintoview(date5);
		helper.highLightElement(driver, date5);
		String imageDate5=date5.getText();
		Reporter.log("<B><font color = 'blue'> ==> -</font> Image Date is :"+imageDate5); 
		helper.waitFor(ShowAnalytics5);
		helper.highLightElement(driver, ShowAnalytics5);
		helper.jsScrollintoview(ShowAnalytics5);
		
		String linkText5 = ShowAnalytics5.getAttribute("href");
		  String idString5 = null;
		  String[] splitStringid5 = linkText5.split("/");
		  for(int i=0;i<splitStringid5.length;i++) {
		    String actualDate5=splitStringid5[splitStringid5.length-1]; 
		    System.out.println("actualDate : " + actualDate5);
		    Reporter.log("<B><font color = 'blue'> ==> -</font> ID of the  Ad = " + actualDate5);
		    break;
		  }
		
		ShowAnalytics5.click();
		Reporter.log("<B><font color = 'blue'> ==> -</font> Clicked On Show Analytics Icon");
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
				helper.Scrollintoview(firstSeen);
				String imageDate6 = firstSeen.getText();
				System.out.println("Analytics Image First Seen Date: "+imageDate6);
				helper.Scrollintoview(lastSeen);
				String imageDate2 = lastSeen.getText();
				System.out.println("Analytics Image Last Seen Date: "+imageDate2);
				helper.Scrollintoview(postDate);
				String imageDate3 = postDate.getText();
				System.out.println("Analytics Image Post Seen Date: "+imageDate3);
				Reporter.log("<B><font color = 'blue'> ==> -</font> Image Date of First Seen is :"+imageDate6);
				Reporter.log("<B><font color = 'blue'> ==> -</font> Image Date of Last Seen is :"+imageDate2);
				Reporter.log("<B><font color = 'blue'> ==> -</font> Image Date of Post Seen is :"+imageDate3);
				
				String join5=null;
				String[] splitString5 = imageDate2.split(" ");
				for(int i=0;i<splitString5.length-2;i++) {
					String actualDate5=splitString5[i]; 
					join5= splitString5[i+1]+" "+ splitString5[i]+" " + splitString5[i+2];
					//  System.out.println("splitString : " + splitString[i]);
					System.out.println("lastseen Date: " + join5);
				}
				Assert.assertEquals(imageDate5, join5);
				System.out.println("Both Matching Date Assert Pass :"+imageDate5+"="+join5);
				Reporter.log("<B><font color = 'blue'> ==> -</font> Both Matching Date Assert Pass :"+imageDate5+"="+join5);
				
				driver.close();
			}
		}
		System.out.println("Current Image Date: "+imageDate5);
		driver.switchTo().window(parent5);


		Reporter.log(" ");
		Reporter.log("<B><font color ='red'> 6 Ad- -</font> ");
		System.out.println(" ");
		System.out.println("6 Ads image");
		helper.Scrollintoview(date6);
		helper.highLightElement(driver, date6);
		String imageDate6=date6.getText();
		Reporter.log("<B><font color = 'blue'> ==> -</font> Image Date is :"+imageDate6); 
		helper.waitFor(ShowAnalytics6);
		helper.highLightElement(driver, ShowAnalytics6);
		helper.jsScrollintoview(ShowAnalytics6);
		
		String linkText6 = ShowAnalytics6.getAttribute("href");
		  String idString6 = null;
		  String[] splitStringid6 = linkText6.split("/");
		  for(int i=0;i<splitStringid6.length;i++) {
		    String actualDate6=splitStringid6[splitStringid6.length-1]; 
		    System.out.println("actualDate : " + actualDate6);
		    Reporter.log("<B><font color = 'blue'> ==> -</font> ID of the  Ad = " + actualDate6);
		    break;
		  }
		
		ShowAnalytics6.click();
		Reporter.log("<B><font color = 'blue'> ==> -</font> Clicked On Show Analytics Icon");
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
				helper.Scrollintoview(firstSeen);
				String imageDate11 = firstSeen.getText();
				System.out.println("Analytics Image First Seen Date: "+imageDate11);
				helper.Scrollintoview(lastSeen);
				String imageDate2 = lastSeen.getText();
				System.out.println("Analytics Image Last Seen Date: "+imageDate2);
				helper.Scrollintoview(postDate);
				String imageDate3 = postDate.getText();
				System.out.println("Analytics Image Post Seen Date: "+imageDate3);
				Reporter.log("<B><font color = 'blue'> ==> -</font> Image Date of First Seen is :"+imageDate11);
				Reporter.log("<B><font color = 'blue'> ==> -</font> Image Date of Last Seen is :"+imageDate2);
				Reporter.log("<B><font color = 'blue'> ==> -</font> Image Date of Post Seen is :"+imageDate3);
				
				String join6=null;
				String[] splitString6 = imageDate2.split(" ");
				for(int i=0;i<splitString6.length-2;i++) {
					String actualDate6=splitString6[i]; 
					join6= splitString6[i+1]+" "+ splitString6[i]+" " + splitString6[i+2];
					//  System.out.println("splitString : " + splitString[i]);
					System.out.println("lastseen Date: " + join6);
				}
				Assert.assertEquals(imageDate6, join6);
				System.out.println("Both Matching Date Assert Pass :"+imageDate6+"="+join6);
				Reporter.log("<B><font color = 'blue'> ==> -</font> Both Matching Date Assert Pass :"+imageDate6+"="+join6);
				
				driver.close();
			}
		}
		System.out.println("Current Image Date: "+imageDate6);
		driver.switchTo().window(parent6);

		Reporter.log(" ");
		Reporter.log("<B><font color ='red'> 7 Ad- -</font>  ");
		System.out.println(" ");
		System.out.println("7 Ads image");
		helper.Scrollintoview(date7);
		helper.highLightElement(driver, date7);
		String imageDate17=date7.getText();
		Reporter.log("<B><font color = 'blue'> ==> -</font> Image Date is :"+imageDate17); 
		helper.waitFor(ShowAnalytics7);
		helper.highLightElement(driver, ShowAnalytics7);
		helper.jsScrollintoview(ShowAnalytics7);
		
		String linkText7 = ShowAnalytics7.getAttribute("href");
		  String idString7 = null;
		  String[] splitStringid7 = linkText7.split("/");
		  for(int i=0;i<splitStringid7.length;i++) {
		    String actualDate7=splitStringid7[splitStringid7.length-1]; 
		    System.out.println("actualDate : " + actualDate7);
		    Reporter.log("<B><font color = 'blue'> ==> -</font> ID of the  Ad = " + actualDate7);
		    break;
		  }
		
		ShowAnalytics7.click();
		Reporter.log("<B><font color = 'blue'> ==> -</font> Clicked On Show Analytics Icon");
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
				helper.Scrollintoview(firstSeen);
				String imageDate11 = firstSeen.getText();
				System.out.println("Analytics Image First Seen Date: "+imageDate11);
				helper.Scrollintoview(lastSeen);
				String imageDate2 = lastSeen.getText();
				System.out.println("Analytics Image Last Seen Date: "+imageDate2);
				helper.Scrollintoview(postDate);
				String imageDate3 = postDate.getText();
				System.out.println("Analytics Image Post Seen Date: "+imageDate3);
				Reporter.log("<B><font color = 'blue'> ==> -</font> Image Date of First Seen is :"+imageDate11);
				Reporter.log("<B><font color = 'blue'> ==> -</font> Image Date of Last Seen is :"+imageDate2);
				Reporter.log("<B><font color = 'blue'> ==> -</font> Image Date of Post Seen is :"+imageDate3);
				
				String join7=null;
				String[] splitString7 = imageDate2.split(" ");
				for(int i=0;i<splitString7.length-2;i++) {
					String actualDate7=splitString7[i]; 
					join7= splitString7[i+1]+" "+ splitString7[i]+" " + splitString7[i+2];
					//  System.out.println("splitString : " + splitString[i]);
					System.out.println("lastseen Date: " + join7);
				}
				Assert.assertEquals(imageDate17, join7);
				System.out.println("Both Matching Date Assert Pass :"+imageDate17+"="+join7);
				Reporter.log("<B><font color = 'blue'> ==> -</font> Both Matching Date Assert Pass :"+imageDate17+"="+join7);
				
				driver.close();
			}
		}
		System.out.println("Current Image Date: "+imageDate17);
		driver.switchTo().window(parent17);


		Reporter.log(" ");
		Reporter.log("<B><font color ='red'> -8 Ad  -</font>  ");
		System.out.println(" ");
		System.out.println("8 Ads image");
	
		helper.Scrollintoview(date8);
		helper.highLightElement(driver, date8);
		String imageDate8=date8.getText();
		Reporter.log("<B><font color = 'blue'> ==> -</font> Image Date is :"+imageDate8); 
		helper.waitFor(ShowAnalytics8);
		helper.highLightElement(driver, ShowAnalytics8);
		helper.jsScrollintoview(ShowAnalytics8);
		
		String linkText8 = ShowAnalytics8.getAttribute("href");
		  String idString8 = null;
		  String[] splitStringid8 = linkText8.split("/");
		  for(int i=0;i<splitStringid8.length;i++) {
		    String actualDate8=splitStringid8[splitStringid8.length-1]; 
		    System.out.println("actualDate : " + actualDate8);
		    Reporter.log("<B><font color = 'blue'> ==> -</font> ID of the  Ad = " + actualDate8);
		    break;
		  }
		
		ShowAnalytics8.click();
		Reporter.log("<B><font color = 'blue'> ==> -</font> Clicked On Show Analytics Icon");
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
				helper.Scrollintoview(firstSeen);
				String imageDate11 = firstSeen.getText();
				System.out.println("Analytics Image First Seen Date: "+imageDate11);
				helper.Scrollintoview(lastSeen);
				String imageDate2 = lastSeen.getText();
				System.out.println("Analytics Image Last Seen Date: "+imageDate2);
				helper.Scrollintoview(postDate);
				String imageDate3 = postDate.getText();
				System.out.println("Analytics Image Post Seen Date: "+imageDate3);
				Reporter.log("<B><font color = 'blue'> ==> -</font> Image Date of First Seen is :"+imageDate11);
				Reporter.log("<B><font color = 'blue'> ==> -</font> Image Date of Last Seen is :"+imageDate2);
				Reporter.log("<B><font color = 'blue'> ==> -</font> Image Date of Post Seen is :"+imageDate3);
				
				String join8=null;
				String[] splitString8 = imageDate2.split(" ");
				for(int i=0;i<splitString8.length-2;i++) {
					String actualDate8=splitString8[i]; 
					join8= splitString8[i+1]+" "+ splitString8[i]+" " + splitString8[i+2];
					//  System.out.println("splitString : " + splitString[i]);
					System.out.println("lastseen Date: " + join8);
				}
				Assert.assertEquals(imageDate8, join8);
				System.out.println("Both Matching Date Assert Pass :"+imageDate8+"="+join8);
				Reporter.log("<B><font color = 'blue'> ==> -</font> Both Matching Date Assert Pass :"+imageDate8+"="+join8);
				
				driver.close();
			}
		}
		System.out.println("Current Image Date: "+imageDate8);
		driver.switchTo().window(parent8);


		Reporter.log(" ");
		Reporter.log("<B><font color ='red'> 9 Ad- </font>  ");
		System.out.println(" ");
		System.out.println("9 Ads image");
		helper.Scrollintoview(date9);
		helper.highLightElement(driver, date9);
		String imageDate9=date9.getText();
		Reporter.log("<B><font color = 'blue'> ==> -</font> Image Date is :"+imageDate9); 
		helper.waitFor(ShowAnalytics9);
		helper.highLightElement(driver, ShowAnalytics9);
		helper.jsScrollintoview(ShowAnalytics9);
		
		String linkText9 = ShowAnalytics9.getAttribute("href");
		  String idString9 = null;
		  String[] splitStringid9 = linkText9.split("/");
		  for(int i=0;i<splitStringid9.length;i++) {
		    String actualDate9=splitStringid9[splitStringid9.length-1]; 
		    System.out.println("actualDate : " + actualDate9);
		    Reporter.log("<B><font color = 'blue'> ==> -</font> ID of the  Ad = " + actualDate9);
		    break;
		  }
		ShowAnalytics9.click();
		Reporter.log("<B><font color = 'blue'> ==> -</font> Clicked On Show Analytics Icon");
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
				helper.Scrollintoview(firstSeen);
				String imageDate19 = firstSeen.getText();
				System.out.println("Analytics Image First Seen Date: "+imageDate19);
				helper.Scrollintoview(lastSeen);
				String imageDate2 = lastSeen.getText();
				System.out.println("Analytics Image Last Seen Date: "+imageDate2);
				helper.Scrollintoview(postDate);
				String imageDate3 = postDate.getText();
				System.out.println("Analytics Image Post Seen Date: "+imageDate3);
				Reporter.log("<B><font color = 'blue'> ==> -</font> Image Date of First Seen is :"+imageDate19);
				Reporter.log("<B><font color = 'blue'> ==> -</font> Image Date of Last Seen is :"+imageDate2);
				Reporter.log("<B><font color = 'blue'> ==> -</font> Image Date of Post Seen is :"+imageDate3);
				
				String join9=null;
				String[] splitString9 = imageDate2.split(" ");
				for(int i=0;i<splitString9.length-2;i++) {
					String actualDate9=splitString9[i]; 
					join9= splitString9[i+1]+" "+ splitString9[i]+" " + splitString9[i+2];
					//  System.out.println("splitString : " + splitString[i]);
					System.out.println("lastseen Date: " + join9);
				}
				Assert.assertEquals(imageDate9, join9);
				System.out.println("Both Matching Date Assert Pass :"+imageDate9+"="+join9);
				Reporter.log("<B><font color = 'blue'> ==> -</font> Both Matching Date Assert Pass :"+imageDate9+"="+join9);
				
				driver.close();
			}
		}
		System.out.println("Current Image Date: "+imageDate9);
		driver.switchTo().window(parent9);


		Reporter.log(" ");
		Reporter.log("<B><font color ='red'> -10 Ad</font>  ");
		System.out.println(" ");
		System.out.println("10 Ads image");
		helper.Scrollintoview(date10);
		helper.highLightElement(driver, date10);
		String imageDate10=date10.getText();
		Reporter.log("<B><font color = 'blue'> ==> -</font> Image Date is :"+imageDate10); 
		helper.waitFor(ShowAnalytics10);
		helper.highLightElement(driver, ShowAnalytics10);
		helper.jsScrollintoview(ShowAnalytics10);
		
		String linkText10 = ShowAnalytics10.getAttribute("href");
		  String idString10 = null;
		  String[] splitStringid10 = linkText10.split("/");
		  for(int i=0;i<splitStringid10.length;i++) {
		    String actualDate10=splitStringid10[splitStringid10.length-1]; 
		    System.out.println("actualDate : " + actualDate10);
		    Reporter.log("<B><font color = 'blue'> ==> -</font> ID of the  Ad = " + actualDate10);
		    break;
		  }
		
		ShowAnalytics10.click();
		Reporter.log("<B><font color = 'blue'> ==> -</font> Clicked On Show Analytics Icon");
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
				helper.Scrollintoview(firstSeen);
				String imageDate11 = firstSeen.getText();
				System.out.println("Analytics Image First Seen Date: "+imageDate11);
				helper.Scrollintoview(lastSeen);
				String imageDate2 = lastSeen.getText();
				System.out.println("Analytics Image Last Seen Date: "+imageDate2);
				helper.Scrollintoview(postDate);
				String imageDate3 = postDate.getText();
				System.out.println("Analytics Image Post Seen Date: "+imageDate3);
				Reporter.log("<B><font color = 'blue'> ==> -</font> Image Date of First Seen is :"+imageDate11);
				Reporter.log("<B><font color = 'blue'> ==> -</font> Image Date of Last Seen is :"+imageDate2);
				Reporter.log("<B><font color = 'blue'> ==> -</font> Image Date of Post Seen is :"+imageDate3);
				
				String join10=null;
				String[] splitString10 = imageDate2.split(" ");
				for(int i=0;i<splitString10.length-2;i++) {
					String actualDate10=splitString10[i]; 
					join10= splitString10[i+1]+" "+ splitString10[i]+" " + splitString10[i+2];
					//  System.out.println("splitString : " + splitString[i]);
					System.out.println("lastseen Date: " + join10);
				}
				Assert.assertEquals(imageDate10, join10);
				System.out.println("Both Matching Date Assert Pass :"+imageDate10+"="+join10);
				Reporter.log("<B><font color = 'blue'> ==> -</font> Both Matching Date Assert Pass :"+imageDate10+"="+join10);
				
				driver.close();
			}
		}
		System.out.println("Current Image Date: "+imageDate);
		driver.switchTo().window(parent10);


		Reporter.log(" ");
		Reporter.log("<B><font color ='red'> -11 Ad </font>  ");
		System.out.println(" ");
		System.out.println("11 Ads image");
		helper.Scrollintoview(date11);
		helper.highLightElement(driver, date11);
		String imageDate11=date11.getText();
		Reporter.log("<B><font color = 'blue'> ==> -</font> Image Date is :"+imageDate11); 
		helper.waitFor(ShowAnalytics11);
		helper.highLightElement(driver, ShowAnalytics11);
		helper.jsScrollintoview(ShowAnalytics11);
		
		String linkText11 = ShowAnalytics11.getAttribute("href");
		  String idString11 = null;
		  String[] splitStringid11 = linkText11.split("/");
		  for(int i=0;i<splitStringid11.length;i++) {
		    String actualDate11=splitStringid11[splitStringid11.length-1]; 
		    System.out.println("actualDate : " + actualDate11);
		    Reporter.log("<B><font color = 'blue'> ==> -</font> ID of the  Ad = " + actualDate11);
		    break;
		  }
		
		ShowAnalytics11.click();
		Reporter.log("<B><font color = 'blue'> ==> -</font> Clicked On Show Analytics Icon");
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
				helper.Scrollintoview(firstSeen);
				String imageDate101 = firstSeen.getText();
				System.out.println("Analytics Image First Seen Date: "+imageDate101);
				helper.Scrollintoview(lastSeen);
				String imageDate2 = lastSeen.getText();
				System.out.println("Analytics Image Last Seen Date: "+imageDate2);
				helper.Scrollintoview(postDate);
				String imageDate3 = postDate.getText();
				System.out.println("Analytics Image Post Seen Date: "+imageDate3);
				Reporter.log("<B><font color = 'blue'> ==> -</font> Image Date of First Seen is :"+imageDate101);
				Reporter.log("<B><font color = 'blue'> ==> -</font> Image Date of Last Seen is :"+imageDate2);
				Reporter.log("<B><font color = 'blue'> ==> -</font> Image Date of Post Seen is :"+imageDate3);
				
				String join11=null;
				String[] splitString11 = imageDate2.split(" ");
				for(int i=0;i<splitString11.length-2;i++) {
					String actualDate11=splitString11[i]; 
					join11= splitString11[i+1]+" "+ splitString11[i]+" " + splitString11[i+2];
					//  System.out.println("splitString : " + splitString[i]);
					System.out.println("lastseen Date: " + join11);
				}
				Assert.assertEquals(imageDate11, join11);
				System.out.println("Both Matching Date Assert Pass :"+imageDate11+"="+join11);
				Reporter.log("<B><font color = 'blue'> ==> -</font> Both Matching Date Assert Pass :"+imageDate11+"="+join11);
				
				driver.close();
			}
		}
		System.out.println("Current Image Date: "+imageDate11);
		driver.switchTo().window(parent11);

		Reporter.log(" ");
		Reporter.log("<B><font color ='red'> -12 Ad  -</font>  ");
		System.out.println(" ");
		System.out.println("12 Ads image");
		helper.Scrollintoview(date12);
		helper.highLightElement(driver, date12);
		String imageDate12=date12.getText();
		Reporter.log("<B><font color = 'blue'> ==> -</font> Image Date is :"+imageDate12); 
		helper.waitFor(ShowAnalytics12);
		helper.highLightElement(driver, ShowAnalytics12);
		helper.jsScrollintoview(ShowAnalytics12);
		
		String linkText12 = ShowAnalytics12.getAttribute("href");
		  String idString12 = null;
		  String[] splitStringid12 = linkText12.split("/");
		  for(int i=0;i<splitStringid12.length;i++) {
		    String actualDate12=splitStringid12[splitStringid12.length-1]; 
		    System.out.println("actualDate : " + actualDate12);
		    Reporter.log("<B><font color = 'blue'> ==> -</font> ID of the  Ad = " + actualDate12);
		    break;
		  }
		
		ShowAnalytics12.click();
		Reporter.log("<B><font color = 'blue'> ==> -</font> Clicked On Show Analytics Icon");
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
				helper.Scrollintoview(firstSeen);
				String imageDate112 = firstSeen.getText();
				System.out.println("Analytics Image First Seen Date: "+imageDate112);
				helper.Scrollintoview(lastSeen);
				String imageDate2 = lastSeen.getText();
				System.out.println("Analytics Image Last Seen Date: "+imageDate2);
				helper.Scrollintoview(postDate);
				String imageDate3 = postDate.getText();
				System.out.println("Analytics Image Post Seen Date: "+imageDate3);
				Reporter.log("<B><font color = 'blue'> ==> -</font> Image Date of First Seen is :"+imageDate11);
				Reporter.log("<B><font color = 'blue'> ==> -</font> Image Date of Last Seen is :"+imageDate2);
				Reporter.log("<B><font color = 'blue'> ==> -</font> Image Date of Post Seen is :"+imageDate3);
				
				String join12=null;
				String[] splitString12 = imageDate2.split(" ");
				for(int i=0;i<splitString12.length-2;i++) {
					String actualDate12=splitString12[i]; 
					join12= splitString12[i+1]+" "+ splitString12[i]+" " + splitString12[i+2];
					//  System.out.println("splitString : " + splitString[i]);
					System.out.println("lastseen Date: " + join12);
				}
				Assert.assertEquals(imageDate12, join12);
				System.out.println("Both Matching Date Assert Pass :"+imageDate12+"="+join12);
				Reporter.log("<B><font color = 'blue'> ==> -</font> Both Matching Date Assert Pass :"+imageDate12+"="+join12);
				
				driver.close();
			}
		}
		System.out.println("Current Image Date: "+imageDate12);
		driver.switchTo().window(parent12);

		Reporter.log(" ");
		Reporter.log("<B><font color ='red'> -13 Ad -</font>  ");
		System.out.println(" ");
		System.out.println("13 Ads image");
		helper.Scrollintoview(date13);
		helper.highLightElement(driver, date13);
		String imageDate13=date13.getText();
		Reporter.log("<B><font color = 'blue'> ==> -</font> Image Date is :"+imageDate13); 
		helper.waitFor(ShowAnalytics13);
		helper.highLightElement(driver, ShowAnalytics13);
		helper.jsScrollintoview(ShowAnalytics13);
		
		String linkText13 = ShowAnalytics13.getAttribute("href");
		  String idString13 = null;
		  String[] splitStringid13 = linkText13.split("/");
		  for(int i=0;i<splitStringid13.length;i++) {
		    String actualDate13=splitStringid13[splitStringid13.length-1]; 
		    System.out.println("actualDate : " + actualDate13);
		    Reporter.log("<B><font color = 'blue'> ==> -</font> ID of the  Ad = " + actualDate13);
		    break;
		  }
		
		ShowAnalytics13.click();
		Reporter.log("<B><font color = 'blue'> ==> -</font> Clicked On Show Analytics Icon");
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
				helper.Scrollintoview(firstSeen);
				String imageDate113 = firstSeen.getText();
				System.out.println("Analytics Image First Seen Date: "+imageDate113);
				helper.Scrollintoview(lastSeen);
				String imageDate2 = lastSeen.getText();
				System.out.println("Analytics Image Last Seen Date: "+imageDate2);
				helper.Scrollintoview(postDate);
				String imageDate3 = postDate.getText();
				System.out.println("Analytics Image Post Seen Date: "+imageDate3);
				Reporter.log("<B><font color = 'blue'> ==> -</font> Image Date of First Seen is :"+imageDate113);
				Reporter.log("<B><font color = 'blue'> ==> -</font> Image Date of Last Seen is :"+imageDate2);
				Reporter.log("<B><font color = 'blue'> ==> -</font> Image Date of Post Seen is :"+imageDate3);
				
				String join13=null;
				String[] splitString13 = imageDate2.split(" ");
				for(int i=0;i<splitString13.length-2;i++) {
					String actualDate13=splitString13[i]; 
					join13= splitString13[i+1]+" "+ splitString13[i]+" " + splitString13[i+2];
					//  System.out.println("splitString : " + splitString[i]);
					System.out.println("lastseen Date: " + join13);
				}
				Assert.assertEquals(imageDate13, join13);
				System.out.println("Both Matching Date Assert Pass :"+imageDate13+"="+join13);
				Reporter.log("<B><font color = 'blue'> ==> -</font> Both Matching Date Assert Pass :"+imageDate13+"="+join13);
				
				driver.close();
			}
		}
		System.out.println("Current Image Date: "+imageDate13);
		driver.switchTo().window(parent13);


		Reporter.log(" ");
		Reporter.log("<B><font color ='red'> -14 Ad -</font>  ");
		System.out.println(" ");
		System.out.println("14 Ads image");
		helper.Scrollintoview(date14);
		helper.highLightElement(driver, date14);
		String imageDate14=date14.getText();
		Reporter.log("<B><font color = 'blue'> ==> -</font> Image Date is :"+imageDate14); 
		helper.waitFor(ShowAnalytics14);
		helper.highLightElement(driver, ShowAnalytics14);
		helper.jsScrollintoview(ShowAnalytics14);
		
		String linkText14 = ShowAnalytics14.getAttribute("href");
		  String idString14 = null;
		  String[] splitStringid14 = linkText14.split("/");
		  for(int i=0;i<splitStringid14.length;i++) {
		    String actualDate14=splitStringid14[splitStringid14.length-1]; 
		    System.out.println("actualDate : " + actualDate14);
		    Reporter.log("<B><font color = 'blue'> ==> -</font> ID of the  Ad = " + actualDate14);
		    break;
		  }
		
		ShowAnalytics14.click();
		Reporter.log("<B><font color = 'blue'> ==> -</font> Clicked On Show Analytics Icon");
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
				helper.Scrollintoview(firstSeen);
				String imageDate114 = firstSeen.getText();
				System.out.println("Analytics Image First Seen Date: "+imageDate114);
				helper.Scrollintoview(lastSeen);
				String imageDate2 = lastSeen.getText();
				System.out.println("Analytics Image Last Seen Date: "+imageDate2);
				helper.Scrollintoview(postDate);
				String imageDate3 = postDate.getText();
				System.out.println("Analytics Image Post Seen Date: "+imageDate3);
				Reporter.log("<B><font color = 'blue'> ==> -</font> Image Date of First Seen is :"+imageDate114);
				Reporter.log("<B><font color = 'blue'> ==> -</font> Image Date of Last Seen is :"+imageDate2);
				Reporter.log("<B><font color = 'blue'> ==> -</font> Image Date of Post Seen is :"+imageDate3);
				
				String join14=null;
				String[] splitString14 = imageDate2.split(" ");
				for(int i=0;i<splitString14.length-2;i++) {
					String actualDate14=splitString14[i]; 
					join14= splitString14[i+1]+" "+ splitString14[i]+" " + splitString14[i+2];
					//  System.out.println("splitString : " + splitString[i]);
					System.out.println("lastseen Date: " + join14);
				}
				Assert.assertEquals(imageDate14, join14);
				System.out.println("Both Matching Date Assert Pass :"+imageDate14+"="+join14);
				Reporter.log("<B><font color = 'blue'> ==> -</font> Both Matching Date Assert Pass :"+imageDate14+"="+join14);
				
				driver.close();
			}
		}
		System.out.println("Current Image Date: "+imageDate14);
		driver.switchTo().window(parent1);

		Reporter.log(" ");
		Reporter.log("<B><font color ='red'> -15 Ad -</font>  ");
		System.out.println(" ");
		System.out.println("Second Ads image");
		helper.Scrollintoview(date15);
		helper.highLightElement(driver, date15);
		String imageDate15=date15.getText();
		Reporter.log("<B><font color = 'blue'> ==> -</font> Image Date is :"+imageDate15); 
		helper.waitFor(ShowAnalytics15);
		helper.highLightElement(driver, ShowAnalytics15);
		helper.jsScrollintoview(ShowAnalytics15);
		
		String linkText15 = ShowAnalytics15.getAttribute("href");
		  String idString15 = null;
		  String[] splitStringid15 = linkText15.split("/");
		  for(int i=0;i<splitStringid15.length;i++) {
		    String actualDate15=splitStringid15[splitStringid15.length-1]; 
		    System.out.println("actualDate : " + actualDate15);
		    Reporter.log("<B><font color = 'blue'> ==> -</font> ID of the  Ad = " + actualDate15);
		    break;
		  }
		
		ShowAnalytics15.click();
		Reporter.log("<B><font color = 'blue'> ==> -</font> Clicked On Show Analytics Icon");
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
				helper.Scrollintoview(firstSeen);
				String imageDate115 = firstSeen.getText();
				System.out.println("Analytics Image First Seen Date: "+imageDate115);
				helper.Scrollintoview(lastSeen);
				String imageDate2 = lastSeen.getText();
				System.out.println("Analytics Image Last Seen Date: "+imageDate2);
				helper.Scrollintoview(postDate);
				String imageDate3 = postDate.getText();
				System.out.println("Analytics Image Post Seen Date: "+imageDate3);
				Reporter.log("<B><font color = 'blue'> ==> -</font> Image Date of First Seen is :"+imageDate115);
				Reporter.log("<B><font color = 'blue'> ==> -</font> Image Date of Last Seen is :"+imageDate2);
				Reporter.log("<B><font color = 'blue'> ==> -</font> Image Date of Post Seen is :"+imageDate3);
				
				String join15=null;
				String[] splitString15 = imageDate2.split(" ");
				for(int i=0;i<splitString15.length-2;i++) {
					String actualDate15=splitString15[i]; 
					join15= splitString15[i+1]+" "+ splitString15[i]+" " + splitString15[i+2];
					//  System.out.println("splitString : " + splitString[i]);
					System.out.println("lastseen Date: " + join15);
				}
				Assert.assertEquals(imageDate15, join15);
				System.out.println("Both Matching Date Assert Pass :"+imageDate15+"="+join15);
				Reporter.log("<B><font color = 'blue'> ==> -</font> Both Matching Date Assert Pass :"+imageDate15+"="+join15);
				
				driver.close();
			}
		}
		System.out.println("Current Image Date: "+imageDate15);
		driver.switchTo().window(parent15);
	
	}
}
