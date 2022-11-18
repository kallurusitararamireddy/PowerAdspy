package com.power.qa.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import org.testng.Reporter;

import com.power.qa.base.TestBase;
import com.power.qa.util.Helpers;

public class DashboardPage extends BasePage {

	Helpers helper = new Helpers();

	public DashboardPage(WebDriver driver) throws InterruptedException {
		super(TestBase.getDriver());
	}

	@FindBy(xpath = "//img[@class='active_pg_logo img-fluid']")
	WebElement Logo;

	@FindBy(css = "a#fb_ads > img")
	WebElement fb;

	@FindBy(css = "a#insta_ads > img")
	WebElement Instagram;

	@FindBy(css = "a#youtube_ads > img")
	WebElement YouTube;

	@FindBy(css = "a#google_ads > img")
	WebElement Google;

	@FindBy(css = "a#gdn_ads > img")
	WebElement GDN;

	@FindBy(css = "a#native_ads > img")
	WebElement Native;

	@FindBy(css = "a#reddit_ads > img")
	WebElement Reddit;

	@FindBy(css = "a#quora_ads > img")
	WebElement Quora;

	@FindBy(css = "a#pinterest_ads > img")
	WebElement Printrest;

	@FindBy(css = "a#linkedin_ads > img")
	WebElement Linkedin;

	@FindBy(css = "a#twitter_ads > img")
	WebElement Twitter;

	@FindBy(css = "a#push_ads > img")
	WebElement Push;

	@FindBy(xpath = "//button[@class='btn btn-primary btn-lg dropdown-toggle search_dropdown_icon']")
	WebElement DropDown_Toggel_Button;

	@FindBy(css = "a#top_domain")
	WebElement Dropdown_item_Domain;

	@FindBy(css = "a#top_advertiser")
	WebElement Dropdown_item_Advertiser;

	@FindBy(css = "a#top_keyword")
	WebElement Dropdown_item_Keyword;

	@FindBy(css = "input#top_domain1")
	WebElement Input_SearchBy_DomainName;

	@FindBy(css = "#domain_keyword")
	WebElement Input_SearchBy_Domain_Keyword;

	@FindBy(css = "input#top_advertiser1")
	WebElement Input_SearchBy_Advertiser_Name;

	@FindBy(css = "#advertiser_keyword")
	WebElement Input_Advirtiser_Keyword;

	@FindBy(css = "input#searchKeyword1")
	WebElement Input_Search_By_Keyword;

	@FindBy(css = ".clear_filters")
	WebElement Clear_Filters;

	@FindBy(css = ".card-body")
	WebElement Result;

	public void verify_Dashbaord_page() throws InterruptedException {

		Reporter.log("<B><font color = 'orange'> Step1 -</font> Logged into PowerAdSpy Application");
		String Page_titel = driver.getTitle();
		System.out.println(Page_titel);
		Reporter.log("<B><font color = 'orange'> Step2 -</font> I am on the page :" + Page_titel);

		helper.waitForPageToLoad();
		helper.waitFor(Logo);
		helper.highLightElement(driver, Logo);
		Assert.assertTrue(Logo.isDisplayed(), "Power Ad Spy Logo is Dispalyed");
		Reporter.log("<B><font color = 'orange'> Step3 -</font> Power Ad Spy Logo is Displayed");

		// instagram

		helper.waitFor(Instagram);
		helper.highLightElement(driver, Instagram);
		Instagram.click();
		Assert.assertTrue(Instagram.isDisplayed(), "Clicked on Instagram ");
		Reporter.log("<B><font color = 'orange'> Step4 -</font> Clicked On Instagram Icon");
		helper.waitForPageToLoad();

		String Page2 = driver.getTitle();
		System.out.println(Page2);
		Reporter.log("<B><font color = 'orange'> Step5 -</font> I am on the page :" + Page2);

		// YouTube

		helper.waitFor(YouTube);
		helper.highLightElement(driver, YouTube);
		YouTube.click();
		Assert.assertTrue(YouTube.isDisplayed(), "Clicked on YouTube ");
		Reporter.log("<B><font color = 'orange'> Step6 -</font> Clicked On YouTube Icon");
		helper.waitForPageToLoad();

		String Page3 = driver.getTitle();
		System.out.println(Page3);
		Reporter.log("<B><font color = 'orange'> Step7 -</font> I am on the page :" + Page3);

		// Google

		helper.waitFor(Google);
		helper.highLightElement(driver, Google);
		Google.click();
		Assert.assertTrue(Google.isDisplayed(), "Clicked on Google ");
		Reporter.log("<B><font color = 'orange'> Step8 -</font> Clicked On Google Icon");
		helper.waitForPageToLoad();

		String Page4 = driver.getTitle();
		System.out.println(Page4);
		Reporter.log("<B><font color = 'orange'> Step9 -</font> I am on the page :" + Page4);

		// GDN

		helper.waitFor(GDN);
		helper.highLightElement(driver, GDN);
		GDN.click();
		Assert.assertTrue(GDN.isDisplayed(), "Clicked on GDN ");
		Reporter.log("<B><font color = 'orange'> Step10 -</font> Clicked On GDN Icon");
		helper.waitForPageToLoad();

		String Page5 = driver.getTitle();
		System.out.println(Page5);
		Reporter.log("<B><font color = 'orange'> Step11 -</font> I am on the page :" + Page5);

		// Native ads

		helper.waitFor(Native);
		helper.highLightElement(driver, Native);
		Native.click();
		Assert.assertTrue(Native.isDisplayed(), "Clicked on Native Ads ");
		Reporter.log("<B><font color = 'orange'> Step12 -</font> Clicked On Native Icon");
		helper.waitForPageToLoad();

		String Page6 = driver.getTitle();
		System.out.println(Page6);
		Reporter.log("<B><font color = 'orange'> Step13 -</font> I am on the page :" + Page6);

		// reddit

		helper.waitFor(Reddit);
		helper.highLightElement(driver, Reddit);
		Reddit.click();
		Assert.assertTrue(Reddit.isDisplayed(), "Clicked on Reddit Ads ");
		Reporter.log("<B><font color = 'orange'> Step14 -</font> Clicked On Reddit Icon");
		helper.waitForPageToLoad();

		String Page7 = driver.getTitle();
		System.out.println(Page7);
		Reporter.log("<B><font color = 'orange'> Step15 -</font> I am on the page :" + Page7);

		// quora

		helper.waitFor(Quora);
		helper.highLightElement(driver, Quora);
		Quora.click();
		Assert.assertTrue(Quora.isDisplayed(), "Clicked on Quora Ads ");
		Reporter.log("<B><font color = 'orange'> Step16 -</font> Clicked On Quora Icon");
		helper.waitForPageToLoad();

		String Page8 = driver.getTitle();
		System.out.println(Page8);
		Reporter.log("<B><font color = 'orange'> Step17 -</font> I am on the page :" + Page8);

		// Printrest

		helper.waitFor(Printrest);
		helper.highLightElement(driver, Printrest);
		Printrest.click();
		Assert.assertTrue(Printrest.isDisplayed(), "Clicked on Printrest Ads ");
		Reporter.log("<B><font color = 'orange'> Step18 -</font> Clicked On Printrest Icon");
		helper.waitForPageToLoad();

		String Page9 = driver.getTitle();
		System.out.println(Page9);
		Reporter.log("<B><font color = 'orange'> Step19 -</font> I am on the page :" + Page9);

		// Linkedin

		helper.waitFor(Linkedin);
		helper.highLightElement(driver, Linkedin);
		Linkedin.click();
		Assert.assertTrue(Linkedin.isDisplayed(), "Clicked on Linkedin Ads ");
		Reporter.log("<B><font color = 'orange'> Step20 -</font> Clicked On Linkedin Icon");
		helper.waitForPageToLoad();

		String Page10 = driver.getTitle();
		System.out.println(Page10);
		Reporter.log("<B><font color = 'orange'> Step21 -</font> I am on the page :" + Page10);

		// Twitter

		helper.waitFor(Twitter);
		helper.highLightElement(driver, Twitter);
		Twitter.click();
		Assert.assertTrue(Twitter.isDisplayed(), "Clicked on Twitter Ads ");
		Reporter.log("<B><font color = 'orange'> Step22 -</font> Clicked On Twitter Icon");
		helper.waitForPageToLoad();

		String Page11 = driver.getTitle();
		System.out.println(Page11);
		Reporter.log("<B><font color = 'orange'> Step23 -</font> I am on the page :" + Page11);

		// Push

		helper.waitFor(Push);
		helper.highLightElement(driver, Push);
		Push.click();
		Assert.assertTrue(Push.isDisplayed(), "Clicked on Push Ads ");
		Reporter.log("<B><font color = 'orange'> Step24 -</font> Clicked On Push Icon");
		helper.waitForPageToLoad();

		String Page12 = driver.getTitle();
		System.out.println(Page12);
		Reporter.log("<B><font color = 'orange'> Step25 -</font> I am on the page :" + Page12);

	}

	public void fb_Search() throws InterruptedException {

		Reporter.log("<B><font color = 'orange'> Step1 -</font> Logged into PowerAdSpy Application");
		String Page_titel = driver.getTitle();
		System.out.println(Page_titel);
		Reporter.log("<B><font color = 'orange'> Step2 -</font> I am on the page :" + Page_titel);

		helper.waitForPageToLoad();
		helper.waitFor(Logo);
		helper.highLightElement(driver, Logo);
		Assert.assertTrue(Logo.isDisplayed(), "Power Ad Spy Logo is Dispalyed");
		Reporter.log("<B><font color = 'orange'> Step3 -</font> Power Ad Spy Logo is Displayed");

		// Filter By Domain Name - Fashion

		helper.waitFor(DropDown_Toggel_Button);
		helper.highLightElement(driver, DropDown_Toggel_Button);
		helper.jsCLick(DropDown_Toggel_Button);

		helper.waitFor(Dropdown_item_Domain);
		helper.highLightElement(driver, Dropdown_item_Domain);
		helper.jsCLick(Dropdown_item_Domain);

		helper.waitFor(Input_SearchBy_DomainName);
		helper.highLightElement(driver, Input_SearchBy_DomainName);
		Input_SearchBy_DomainName.sendKeys("Flipkart", Keys.ENTER);
		helper.waitFor(Result);

		/*
		 * helper.waitFor(Input_SearchBy_Domain_Keyword);
		 * helper.highLightElement(driver,Input_SearchBy_Domain_Keyword);
		 * Input_Advirtiser_Keyword.sendKeys("Oppo",Keys.ENTER);
		 */

		List<WebElement> products = driver.findElements(By.cssSelector(".card-body"));
		int numberOfProducts = products.size();
		System.out.println(numberOfProducts);
		Reporter.log(
				"<B><font color = 'orange'> Step4 -</font> Total Ad Results for  Domain 'Flipkart & Oppo' is :"
						+ numberOfProducts);

		helper.waitFor(Clear_Filters);
		helper.highLightElement(driver, Clear_Filters);
		helper.jsCLick(Clear_Filters);

		// Filter By Advertiser

		helper.waitFor(DropDown_Toggel_Button);
		helper.highLightElement(driver, DropDown_Toggel_Button);
		helper.jsCLick(DropDown_Toggel_Button);

		helper.waitFor(Dropdown_item_Advertiser);
		helper.highLightElement(driver, Dropdown_item_Advertiser);
		helper.jsCLick(Dropdown_item_Advertiser);

		helper.waitFor(Input_SearchBy_Advertiser_Name);
		helper.highLightElement(driver, Input_SearchBy_Advertiser_Name);
		Input_SearchBy_Advertiser_Name.sendKeys("Amazon");

		helper.waitFor(Input_Advirtiser_Keyword);
		helper.highLightElement(driver, Input_Advirtiser_Keyword);
		Input_Advirtiser_Keyword.sendKeys("Alexa", Keys.ENTER);
		// helper.waitFor(Result);
		helper.waitFor(Result, 30);
		// Thread.sleep(80000);

		List<WebElement> Amazonproducts = driver.findElements(By.cssSelector(".card-body"));
		int AMZProducts = Amazonproducts.size(); 
		System.out.println(AMZProducts);
		Reporter.log(
				"<B><font color = 'orange'> Step5 -</font> Total Ad Results for the Advertiser 'Amazon & Alexa' is :"
						+ AMZProducts);

		helper.waitFor(Clear_Filters);
		helper.highLightElement(driver, Clear_Filters);
		helper.jsCLick(Clear_Filters);

		// Filter with Keyword

		helper.waitFor(DropDown_Toggel_Button);
		helper.highLightElement(driver, DropDown_Toggel_Button);
		helper.jsCLick(DropDown_Toggel_Button);

		helper.waitFor(Dropdown_item_Keyword);
		helper.highLightElement(driver, Dropdown_item_Keyword);
		helper.jsCLick(Dropdown_item_Keyword);

		helper.waitFor(Input_Search_By_Keyword);
		helper.highLightElement(driver, Input_Search_By_Keyword);
		Input_Search_By_Keyword.sendKeys("virat", Keys.ENTER);
		helper.waitFor(Result, 30);

		List<WebElement> Viratproducts = driver.findElements(By.cssSelector(".card-body"));
		int viratKohliProducts = Viratproducts.size();
		System.out.println(viratKohliProducts);
		Reporter.log("<B><font color = 'orange'> Step6 -</font> Total Ad Results for the  Keyword 'Virat kohli' is :"
				+ viratKohliProducts);

		helper.waitFor(Clear_Filters);
		helper.highLightElement(driver, Clear_Filters);
		helper.jsCLick(Clear_Filters);
		Thread.sleep(5000);

		// Filter with Keyword

		helper.waitFor(DropDown_Toggel_Button);
		helper.highLightElement(driver, DropDown_Toggel_Button);
		helper.jsCLick(DropDown_Toggel_Button);

		helper.waitFor(Dropdown_item_Keyword);
		helper.highLightElement(driver, Dropdown_item_Keyword);
		helper.jsCLick(Dropdown_item_Keyword);

		helper.waitFor(Input_Search_By_Keyword);
		helper.highLightElement(driver, Input_Search_By_Keyword);
		Input_Search_By_Keyword.clear();
		Input_Search_By_Keyword.sendKeys("covid", Keys.ENTER);
		helper.waitFor(Result, 30);

		List<WebElement> covid = driver.findElements(By.cssSelector(".card-body"));
		int cov = covid.size();
		System.out.println(covid);
		Reporter.log(
				"<B><font color = 'orange'> Step7 -</font> Total Ad Results for the  Keyword'covid' is :" + cov);

		helper.waitFor(Clear_Filters);
		helper.highLightElement(driver, Clear_Filters);
		helper.jsCLick(Clear_Filters);

		// Filter with Keyword

		helper.waitFor(DropDown_Toggel_Button);
		helper.highLightElement(driver, DropDown_Toggel_Button);
		helper.jsCLick(DropDown_Toggel_Button);

		helper.waitFor(Dropdown_item_Keyword);
		helper.highLightElement(driver, Dropdown_item_Keyword);
		helper.jsCLick(Dropdown_item_Keyword);

		helper.waitFor(Input_Search_By_Keyword);
		helper.highLightElement(driver, Input_Search_By_Keyword);
		Input_Search_By_Keyword.clear();
		Input_Search_By_Keyword.sendKeys("Blog", Keys.ENTER);
		helper.waitFor(Result, 30);

		List<WebElement> Blog = driver.findElements(By.cssSelector(".card-body"));
		int Blo = Blog.size();
		System.out.println(Blog);
		Reporter.log(
				"<B><font color = 'orange'> Step8 -</font> Total Ad Results for the  Keyword 'Blog' is :" + Blo);

		helper.waitFor(Clear_Filters);
		helper.highLightElement(driver, Clear_Filters);
		helper.jsCLick(Clear_Filters);

		// Filter with Keyword

		helper.waitFor(DropDown_Toggel_Button);
		helper.highLightElement(driver, DropDown_Toggel_Button);
		helper.jsCLick(DropDown_Toggel_Button);

		helper.waitFor(Dropdown_item_Keyword);
		helper.highLightElement(driver, Dropdown_item_Keyword);
		helper.jsCLick(Dropdown_item_Keyword);

		helper.waitFor(Input_Search_By_Keyword);
		helper.highLightElement(driver, Input_Search_By_Keyword);
		Input_Search_By_Keyword.clear();
		Input_Search_By_Keyword.sendKeys("Shoes", Keys.ENTER);
		helper.waitFor(Result, 30);

		List<WebElement> Shoes = driver.findElements(By.cssSelector(".card-body"));
		int Sh = Shoes.size();
		System.out.println(Sh);
		Reporter.log(
				"<B><font color = 'orange'> Step9 -</font> Total Ad Results for the  Keyword 'Shoes' is :" + Sh);

		helper.waitFor(Clear_Filters);
		helper.highLightElement(driver, Clear_Filters);
		helper.jsCLick(Clear_Filters);

		// Filter with Keyword

		helper.waitFor(DropDown_Toggel_Button);
		helper.highLightElement(driver, DropDown_Toggel_Button);
		helper.jsCLick(DropDown_Toggel_Button);

		helper.waitFor(Dropdown_item_Keyword);
		helper.highLightElement(driver, Dropdown_item_Keyword);
		helper.jsCLick(Dropdown_item_Keyword);

		helper.waitFor(Input_Search_By_Keyword);
		helper.highLightElement(driver, Input_Search_By_Keyword);
		Input_Search_By_Keyword.clear();
		Input_Search_By_Keyword.sendKeys("Developer", Keys.ENTER);
		helper.waitFor(Result, 30);

		List<WebElement> Developer = driver.findElements(By.cssSelector(".card-body"));
		int De = Developer.size();
		System.out.println(De);
		Reporter.log("<B><font color = 'orange'> Step10 -</font> Total Ad Results for the Keyword 'Developer' is :"
				+ De);

		helper.waitFor(Clear_Filters);
		helper.highLightElement(driver, Clear_Filters);
		helper.jsCLick(Clear_Filters);

	}

	public void Insta_Search() throws InterruptedException {

		Reporter.log("<B><font color = 'orange'> Step1 -</font> Logged into PowerAdSpy Application");
		String Page_titel = driver.getTitle();
		System.out.println(Page_titel);
		Reporter.log("<B><font color = 'orange'> Step2 -</font> I am on the page :" + Page_titel);

		helper.waitForPageToLoad();
		helper.waitFor(Logo);
		helper.highLightElement(driver, Logo);
		Assert.assertTrue(Logo.isDisplayed(), "Power Ad Spy Logo is Dispalyed");
		Reporter.log("<B><font color = 'orange'> Step3 -</font> Power Ad Spy Logo is Displayed");

		helper.waitFor(Instagram);
		helper.highLightElement(driver, Instagram);
		Instagram.click();
		Assert.assertTrue(Instagram.isDisplayed(), "Clicked on Instagram ");
		Reporter.log("<B><font color = 'orange'> Step4 -</font> Clicked On Instagram Icon");
		helper.waitForPageToLoad();

		String Page2 = driver.getTitle();
		System.out.println(Page2);
		Reporter.log("<B><font color = 'orange'> Step5 -</font> I am on the page :" + Page2);

		// Filter By Domain

		helper.waitFor(DropDown_Toggel_Button);
		helper.highLightElement(driver, DropDown_Toggel_Button);
		helper.jsCLick(DropDown_Toggel_Button);

		helper.waitFor(Dropdown_item_Domain);
		helper.highLightElement(driver, Dropdown_item_Domain);
		helper.jsCLick(Dropdown_item_Domain);

		helper.waitFor(Input_SearchBy_DomainName);
		helper.highLightElement(driver, Input_SearchBy_DomainName);
		Input_SearchBy_DomainName.sendKeys("Flipkart", Keys.ENTER);
		helper.waitFor(Result);

		

		List<WebElement> products = driver.findElements(By.cssSelector(".card-body"));
		int numberOfProducts = products.size();
		System.out.println(numberOfProducts);
		Reporter.log("<B><font color = 'orange'> Step6 -</font> Total Ad Results for the Domain 'Flipkart' is :"
				+ numberOfProducts);

		helper.waitFor(Clear_Filters);
		helper.highLightElement(driver, Clear_Filters);
		helper.jsCLick(Clear_Filters);

		// Filter By Advertiser

		helper.waitFor(DropDown_Toggel_Button);
		helper.highLightElement(driver, DropDown_Toggel_Button);
		helper.jsCLick(DropDown_Toggel_Button);

		helper.waitFor(Dropdown_item_Advertiser);
		helper.highLightElement(driver, Dropdown_item_Advertiser);
		helper.jsCLick(Dropdown_item_Advertiser);

		helper.waitFor(Input_SearchBy_Advertiser_Name);
		helper.highLightElement(driver, Input_SearchBy_Advertiser_Name);
		Input_SearchBy_Advertiser_Name.sendKeys("Health");


		List<WebElement> Healthroducts = driver.findElements(By.cssSelector(".card-body"));
		int HpProducts = Healthroducts.size();
		System.out.println(HpProducts);
		Reporter.log("<B><font color = 'orange'> Step7 -</font> Total Ad Results for the Advertiser 'Health' is :"
				+ HpProducts);

		helper.waitFor(Clear_Filters);
		helper.highLightElement(driver, Clear_Filters);
		helper.jsCLick(Clear_Filters);

		// Filter with Keyword

		helper.waitFor(DropDown_Toggel_Button);
		helper.highLightElement(driver, DropDown_Toggel_Button);
		helper.jsCLick(DropDown_Toggel_Button);

		helper.waitFor(Dropdown_item_Keyword);
		helper.highLightElement(driver, Dropdown_item_Keyword);
		helper.jsCLick(Dropdown_item_Keyword);

		helper.waitFor(Input_Search_By_Keyword);
		helper.highLightElement(driver, Input_Search_By_Keyword);
		Input_Search_By_Keyword.sendKeys("virat", Keys.ENTER);
		helper.waitFor(Result, 30);

		List<WebElement> Viratproducts = driver.findElements(By.cssSelector(".card-body"));
		int viratKohliProducts = Viratproducts.size();
		System.out.println(viratKohliProducts);
		Reporter.log("<B><font color = 'orange'> Step8 -</font> Total Ad Results for the Keyword 'Virat kohli' is :"
				+ viratKohliProducts);

		helper.waitFor(Clear_Filters);
		helper.highLightElement(driver, Clear_Filters);
		helper.jsCLick(Clear_Filters);
		Thread.sleep(5000);

		// Filter with Keyword

		helper.waitFor(DropDown_Toggel_Button);
		helper.highLightElement(driver, DropDown_Toggel_Button);
		helper.jsCLick(DropDown_Toggel_Button);

		helper.waitFor(Dropdown_item_Keyword);
		helper.highLightElement(driver, Dropdown_item_Keyword);
		helper.jsCLick(Dropdown_item_Keyword);

		helper.waitFor(Input_Search_By_Keyword);
		helper.highLightElement(driver, Input_Search_By_Keyword);
		Input_Search_By_Keyword.clear();
		Input_Search_By_Keyword.sendKeys("covid", Keys.ENTER);
		helper.waitFor(Result, 30);

		List<WebElement> covid = driver.findElements(By.cssSelector(".card-body"));
		int cov = covid.size();
		System.out.println(covid);
		Reporter.log(
				"<B><font color = 'orange'> Step9 -</font> Total Ad Results for the Keyword 'covid' is :" + cov);

		helper.waitFor(Clear_Filters);
		helper.highLightElement(driver, Clear_Filters);
		helper.jsCLick(Clear_Filters);

		// Filter with Keyword

		helper.waitFor(DropDown_Toggel_Button);
		helper.highLightElement(driver, DropDown_Toggel_Button);
		helper.jsCLick(DropDown_Toggel_Button);

		helper.waitFor(Dropdown_item_Keyword);
		helper.highLightElement(driver, Dropdown_item_Keyword);
		helper.jsCLick(Dropdown_item_Keyword);

		helper.waitFor(Input_Search_By_Keyword);
		helper.highLightElement(driver, Input_Search_By_Keyword);
		Input_Search_By_Keyword.clear();
		Input_Search_By_Keyword.sendKeys("Blog", Keys.ENTER);
		helper.waitFor(Result, 30);

		List<WebElement> Blog = driver.findElements(By.cssSelector(".card-body"));
		int Blo = Blog.size();
		System.out.println(Blog);
		Reporter.log(
				"<B><font color = 'orange'> Step10 -</font> Total Ad Results for the Keyword 'Blog' is :" + Blo);

		helper.waitFor(Clear_Filters);
		helper.highLightElement(driver, Clear_Filters);
		helper.jsCLick(Clear_Filters);

		// Filter with Keyword

		helper.waitFor(DropDown_Toggel_Button);
		helper.highLightElement(driver, DropDown_Toggel_Button);
		helper.jsCLick(DropDown_Toggel_Button);

		helper.waitFor(Dropdown_item_Keyword);
		helper.highLightElement(driver, Dropdown_item_Keyword);
		helper.jsCLick(Dropdown_item_Keyword);

		helper.waitFor(Input_Search_By_Keyword);
		helper.highLightElement(driver, Input_Search_By_Keyword);
		Input_Search_By_Keyword.clear();
		Input_Search_By_Keyword.sendKeys("Shoes", Keys.ENTER);
		helper.waitFor(Result, 30);

		List<WebElement> Shoes = driver.findElements(By.cssSelector(".card-body"));
		int Sh = Shoes.size();
		System.out.println(Sh);
		Reporter.log(
				"<B><font color = 'orange'> Step11 -</font> Total Ad Results for the Keyword 'Shoes' is :" + Sh);

		helper.waitFor(Clear_Filters);
		helper.highLightElement(driver, Clear_Filters);
		helper.jsCLick(Clear_Filters);

		// Filter with Keyword

		helper.waitFor(DropDown_Toggel_Button);
		helper.highLightElement(driver, DropDown_Toggel_Button);
		helper.jsCLick(DropDown_Toggel_Button);

		helper.waitFor(Dropdown_item_Keyword);
		helper.highLightElement(driver, Dropdown_item_Keyword);
		helper.jsCLick(Dropdown_item_Keyword);

		helper.waitFor(Input_Search_By_Keyword);
		helper.highLightElement(driver, Input_Search_By_Keyword);
		Input_Search_By_Keyword.clear();
		Input_Search_By_Keyword.sendKeys("Developer", Keys.ENTER);
		helper.waitFor(Result, 30);

		List<WebElement> Developer = driver.findElements(By.cssSelector(".card-body"));
		int De = Developer.size();
		System.out.println(De);
		Reporter.log("<B><font color = 'orange'> Step12 -</font> Total Ad Results for the Keyword 'Developer' is :"
				+ De);

		helper.waitFor(Clear_Filters);
		helper.highLightElement(driver, Clear_Filters);
		helper.jsCLick(Clear_Filters);

	}

	public void Youtube_Search() throws InterruptedException {

		Reporter.log("<B><font color = 'orange'> Step1 -</font> Logged into PowerAdSpy Application");
		String Page_titel = driver.getTitle();
		System.out.println(Page_titel);
		Reporter.log("<B><font color = 'orange'> Step2 -</font> I am on the page :" + Page_titel);

		helper.waitForPageToLoad();
		helper.waitFor(Logo);
		helper.highLightElement(driver, Logo);
		Assert.assertTrue(Logo.isDisplayed(), "Power Ad Spy Logo is Dispalyed");
		Reporter.log("<B><font color = 'orange'> Step3 -</font> Power Ad Spy Logo is Displayed");

		helper.waitFor(YouTube);
		helper.highLightElement(driver, YouTube);
		YouTube.click();
		Assert.assertTrue(YouTube.isDisplayed(), "Clicked on YouTube ");
		Reporter.log("<B><font color = 'orange'> Step4 -</font> Clicked On YouTube Icon");
		helper.waitForPageToLoad();

		String Page3 = driver.getTitle();
		System.out.println(Page3);
		Reporter.log("<B><font color = 'orange'> Step5 -</font> I am on the page :" + Page3);

		// Filter By Domain 

		helper.waitFor(DropDown_Toggel_Button);
		helper.highLightElement(driver, DropDown_Toggel_Button);
		helper.jsCLick(DropDown_Toggel_Button);

		helper.waitFor(Dropdown_item_Domain);
		helper.highLightElement(driver, Dropdown_item_Domain);
		helper.jsCLick(Dropdown_item_Domain);

		helper.waitFor(Input_SearchBy_DomainName);
		helper.highLightElement(driver, Input_SearchBy_DomainName);
		Input_SearchBy_DomainName.sendKeys("News", Keys.ENTER);
		helper.waitFor(Result);

		

		List<WebElement> News = driver.findElements(By.cssSelector(".card-body"));
		int numberOfNews = News.size();
		System.out.println(numberOfNews);
		Reporter.log("<B><font color = 'orange'> Step6 -</font> Total Ad Results for the Domain 'News' is :"
				+ numberOfNews);

		helper.waitFor(Clear_Filters);
		helper.highLightElement(driver, Clear_Filters);
		helper.jsCLick(Clear_Filters);

		// Filter By Advertiser

		helper.waitFor(DropDown_Toggel_Button);
		helper.highLightElement(driver, DropDown_Toggel_Button);
		helper.jsCLick(DropDown_Toggel_Button);

		helper.waitFor(Dropdown_item_Advertiser);
		helper.highLightElement(driver, Dropdown_item_Advertiser);
		helper.jsCLick(Dropdown_item_Advertiser);



		helper.waitFor(Input_Advirtiser_Keyword);
		helper.highLightElement(driver, Input_Advirtiser_Keyword);
		Input_Advirtiser_Keyword.sendKeys("Vice", Keys.ENTER);
		// helper.waitFor(Result);
		helper.waitFor(Result, 30);
		// Thread.sleep(80000);

		List<WebElement> vice = driver.findElements(By.cssSelector(".card-body"));
		int Vi = vice.size();
		System.out.println(Vi);
		Reporter.log("<B><font color = 'orange'> Step7 -</font> Total Ad Results for the Advertiser 'Vice' is :" + Vi);

		helper.waitFor(Clear_Filters);
		helper.highLightElement(driver, Clear_Filters);
		helper.jsCLick(Clear_Filters);

		// Filter with Keyword

		helper.waitFor(DropDown_Toggel_Button);
		helper.highLightElement(driver, DropDown_Toggel_Button);
		helper.jsCLick(DropDown_Toggel_Button);

		helper.waitFor(Dropdown_item_Keyword);
		helper.highLightElement(driver, Dropdown_item_Keyword);
		helper.jsCLick(Dropdown_item_Keyword);

		helper.waitFor(Input_Search_By_Keyword);
		helper.highLightElement(driver, Input_Search_By_Keyword);
		Input_Search_By_Keyword.sendKeys("virat", Keys.ENTER);
		helper.waitFor(Result, 30);

		List<WebElement> Viratproducts = driver.findElements(By.cssSelector(".card-body"));
		int viratKohliProducts = Viratproducts.size();
		System.out.println(viratKohliProducts);
		Reporter.log("<B><font color = 'orange'> Step8 -</font> Total Ad Results for the Keyword 'Virat kohli' is :"
				+ viratKohliProducts);

		helper.waitFor(Clear_Filters);
		helper.highLightElement(driver, Clear_Filters);
		helper.jsCLick(Clear_Filters);
		Thread.sleep(5000);

		// Filter with Keyword

		helper.waitFor(DropDown_Toggel_Button);
		helper.highLightElement(driver, DropDown_Toggel_Button);
		helper.jsCLick(DropDown_Toggel_Button);

		helper.waitFor(Dropdown_item_Keyword);
		helper.highLightElement(driver, Dropdown_item_Keyword);
		helper.jsCLick(Dropdown_item_Keyword);

		helper.waitFor(Input_Search_By_Keyword);
		helper.highLightElement(driver, Input_Search_By_Keyword);
		Input_Search_By_Keyword.clear();
		Input_Search_By_Keyword.sendKeys("covid", Keys.ENTER);
		helper.waitFor(Result, 30);

		List<WebElement> covid = driver.findElements(By.cssSelector(".card-body"));
		int cov = covid.size();
		System.out.println(covid);
		Reporter.log(
				"<B><font color = 'orange'> Step9 -</font> Total Ad Results for the Keyword 'covid' is :" + cov);

		helper.waitFor(Clear_Filters);
		helper.highLightElement(driver, Clear_Filters);
		helper.jsCLick(Clear_Filters);

		// Filter with Keyword

		helper.waitFor(DropDown_Toggel_Button);
		helper.highLightElement(driver, DropDown_Toggel_Button);
		helper.jsCLick(DropDown_Toggel_Button);

		helper.waitFor(Dropdown_item_Keyword);
		helper.highLightElement(driver, Dropdown_item_Keyword);
		helper.jsCLick(Dropdown_item_Keyword);

		helper.waitFor(Input_Search_By_Keyword);
		helper.highLightElement(driver, Input_Search_By_Keyword);
		Input_Search_By_Keyword.clear();
		Input_Search_By_Keyword.sendKeys("Blog", Keys.ENTER);
		helper.waitFor(Result, 30);

		List<WebElement> Blog = driver.findElements(By.cssSelector(".card-body"));
		int Blo = Blog.size();
		System.out.println(Blog);
		Reporter.log(
				"<B><font color = 'orange'> Step10 -</font> Total Ad Results for the Keyword'Blog' is :" + Blo);

		helper.waitFor(Clear_Filters);
		helper.highLightElement(driver, Clear_Filters);
		helper.jsCLick(Clear_Filters);

		// Filter with Keyword

		helper.waitFor(DropDown_Toggel_Button);
		helper.highLightElement(driver, DropDown_Toggel_Button);
		helper.jsCLick(DropDown_Toggel_Button);

		helper.waitFor(Dropdown_item_Keyword);
		helper.highLightElement(driver, Dropdown_item_Keyword);
		helper.jsCLick(Dropdown_item_Keyword);

		helper.waitFor(Input_Search_By_Keyword);
		helper.highLightElement(driver, Input_Search_By_Keyword);
		Input_Search_By_Keyword.clear();
		Input_Search_By_Keyword.sendKeys("Shoes", Keys.ENTER);
		helper.waitFor(Result, 30);

		List<WebElement> Shoes = driver.findElements(By.cssSelector(".card-body"));
		int Sh = Shoes.size();
		System.out.println(Sh);
		Reporter.log(
				"<B><font color = 'orange'> Step11 -</font> Total Ad Results for the Keyword 'Shoes' is :" + Sh);

		helper.waitFor(Clear_Filters);
		helper.highLightElement(driver, Clear_Filters);
		helper.jsCLick(Clear_Filters);

		// Filter with Keyword

		helper.waitFor(DropDown_Toggel_Button);
		helper.highLightElement(driver, DropDown_Toggel_Button);
		helper.jsCLick(DropDown_Toggel_Button);

		helper.waitFor(Dropdown_item_Keyword);
		helper.highLightElement(driver, Dropdown_item_Keyword);
		helper.jsCLick(Dropdown_item_Keyword);

		helper.waitFor(Input_Search_By_Keyword);
		helper.highLightElement(driver, Input_Search_By_Keyword);
		Input_Search_By_Keyword.clear();
		Input_Search_By_Keyword.sendKeys("Developer", Keys.ENTER);
		helper.waitFor(Result, 30);

		List<WebElement> Developer = driver.findElements(By.cssSelector(".card-body"));
		int De = Developer.size();
		System.out.println(De);
		Reporter.log("<B><font color = 'orange'> Step12 -</font> Total Ad Results for the Keyword 'Developer' is :"
				+ De);

		helper.waitFor(Clear_Filters);
		helper.highLightElement(driver, Clear_Filters);
		helper.jsCLick(Clear_Filters);

	}

	public void Googleads_Search() throws InterruptedException {

		Reporter.log("<B><font color = 'orange'> Step1 -</font> Logged into PowerAdSpy Application");
		String Page_titel = driver.getTitle();
		System.out.println(Page_titel);
		Reporter.log("<B><font color = 'orange'> Step2 -</font> I am on the page :" + Page_titel);

		helper.waitForPageToLoad();
		helper.waitFor(Logo);
		helper.highLightElement(driver, Logo);
		Assert.assertTrue(Logo.isDisplayed(), "Power Ad Spy Logo is Dispalyed");
		Reporter.log("<B><font color = 'orange'> Step3 -</font> Power Ad Spy Logo is Displayed");

		helper.waitFor(Google);
		helper.highLightElement(driver, Google);
		Google.click();
		Assert.assertTrue(Google.isDisplayed(), "Clicked on Google ");
		Reporter.log("<B><font color = 'orange'> Step4 -</font> Clicked On Google Icon");
		helper.waitForPageToLoad();

		String Page4 = driver.getTitle();
		System.out.println(Page4);
		Reporter.log("<B><font color = 'orange'> Step5 -</font> I am on the page :" + Page4);

		// Filter By Domain Name - Fashion

		helper.waitFor(DropDown_Toggel_Button);
		helper.highLightElement(driver, DropDown_Toggel_Button);
		helper.jsCLick(DropDown_Toggel_Button);

		helper.waitFor(Dropdown_item_Domain);
		helper.highLightElement(driver, Dropdown_item_Domain);
		helper.jsCLick(Dropdown_item_Domain);

		helper.waitFor(Input_SearchBy_DomainName);
		helper.highLightElement(driver, Input_SearchBy_DomainName);
		Input_SearchBy_DomainName.sendKeys("News", Keys.ENTER);
		helper.waitFor(Result);

		/*
		 * helper.waitFor(Input_SearchBy_Domain_Keyword);
		 * helper.highLightElement(driver,Input_SearchBy_Domain_Keyword);
		 * Input_Advirtiser_Keyword.sendKeys("Oppo",Keys.ENTER);
		 */

		List<WebElement> News = driver.findElements(By.cssSelector(".card-body"));
		int numberOfNews = News.size();
		System.out.println(numberOfNews);
		Reporter.log("<B><font color = 'orange'> Step6 -</font> Total Ad Results for the Search term 'News' is :"
				+ numberOfNews);

		helper.waitFor(Clear_Filters);
		helper.highLightElement(driver, Clear_Filters);
		helper.jsCLick(Clear_Filters);

		// Filter By Advirtiser

		helper.waitFor(DropDown_Toggel_Button);
		helper.highLightElement(driver, DropDown_Toggel_Button);
		helper.jsCLick(DropDown_Toggel_Button);

		helper.waitFor(Dropdown_item_Advertiser);
		helper.highLightElement(driver, Dropdown_item_Advertiser);
		helper.jsCLick(Dropdown_item_Advertiser);

//			helper.waitFor(Input_SearchBy_Advertiser_Name);
//			helper.highLightElement(driver, Input_SearchBy_Advertiser_Name);
//			Input_SearchBy_Advertiser_Name.sendKeys("Vice");

		helper.waitFor(Input_Advirtiser_Keyword);
		helper.highLightElement(driver, Input_Advirtiser_Keyword);
		Input_Advirtiser_Keyword.sendKeys("Vice", Keys.ENTER);
		// helper.waitFor(Result);
		helper.waitFor(Result, 30);
		// Thread.sleep(80000);

		List<WebElement> vice = driver.findElements(By.cssSelector(".card-body"));
		int Vi = vice.size();
		System.out.println(Vi);
		Reporter.log("<B><font color = 'orange'> Step7 -</font> Total Ad Results for the Search term 'Vice' is :" + Vi);

		helper.waitFor(Clear_Filters);
		helper.highLightElement(driver, Clear_Filters);
		helper.jsCLick(Clear_Filters);

		// Filter with Keyword

		helper.waitFor(DropDown_Toggel_Button);
		helper.highLightElement(driver, DropDown_Toggel_Button);
		helper.jsCLick(DropDown_Toggel_Button);

		helper.waitFor(Dropdown_item_Keyword);
		helper.highLightElement(driver, Dropdown_item_Keyword);
		helper.jsCLick(Dropdown_item_Keyword);

		helper.waitFor(Input_Search_By_Keyword);
		helper.highLightElement(driver, Input_Search_By_Keyword);
		Input_Search_By_Keyword.sendKeys("virat", Keys.ENTER);
		helper.waitFor(Result, 30);

		List<WebElement> Viratproducts = driver.findElements(By.cssSelector(".card-body"));
		int viratKohliProducts = Viratproducts.size();
		System.out.println(viratKohliProducts);
		Reporter.log("<B><font color = 'orange'> Step8 -</font> Total Ad Results for the Search term 'Virat kohli' is :"
				+ viratKohliProducts);

		helper.waitFor(Clear_Filters);
		helper.highLightElement(driver, Clear_Filters);
		helper.jsCLick(Clear_Filters);
		Thread.sleep(5000);

		// Filter with Keyword

		helper.waitFor(DropDown_Toggel_Button);
		helper.highLightElement(driver, DropDown_Toggel_Button);
		helper.jsCLick(DropDown_Toggel_Button);

		helper.waitFor(Dropdown_item_Keyword);
		helper.highLightElement(driver, Dropdown_item_Keyword);
		helper.jsCLick(Dropdown_item_Keyword);

		helper.waitFor(Input_Search_By_Keyword);
		helper.highLightElement(driver, Input_Search_By_Keyword);
		Input_Search_By_Keyword.clear();
		Input_Search_By_Keyword.sendKeys("covid", Keys.ENTER);
		helper.waitFor(Result, 30);

		List<WebElement> covid = driver.findElements(By.cssSelector(".card-body"));
		int cov = covid.size();
		System.out.println(covid);
		Reporter.log(
				"<B><font color = 'orange'> Step9 -</font> Total Ad Results for the Search term 'covid' is :" + cov);

		helper.waitFor(Clear_Filters);
		helper.highLightElement(driver, Clear_Filters);
		helper.jsCLick(Clear_Filters);

		// Filter with Keyword

		helper.waitFor(DropDown_Toggel_Button);
		helper.highLightElement(driver, DropDown_Toggel_Button);
		helper.jsCLick(DropDown_Toggel_Button);

		helper.waitFor(Dropdown_item_Keyword);
		helper.highLightElement(driver, Dropdown_item_Keyword);
		helper.jsCLick(Dropdown_item_Keyword);

		helper.waitFor(Input_Search_By_Keyword);
		helper.highLightElement(driver, Input_Search_By_Keyword);
		Input_Search_By_Keyword.clear();
		Input_Search_By_Keyword.sendKeys("Blog", Keys.ENTER);
		helper.waitFor(Result, 30);

		List<WebElement> Blog = driver.findElements(By.cssSelector(".card-body"));
		int Blo = Blog.size();
		System.out.println(Blog);
		Reporter.log(
				"<B><font color = 'orange'> Step10 -</font> Total Ad Results for the Search term 'Blog' is :" + Blo);

		helper.waitFor(Clear_Filters);
		helper.highLightElement(driver, Clear_Filters);
		helper.jsCLick(Clear_Filters);

		// Filter with Keyword

		helper.waitFor(DropDown_Toggel_Button);
		helper.highLightElement(driver, DropDown_Toggel_Button);
		helper.jsCLick(DropDown_Toggel_Button);

		helper.waitFor(Dropdown_item_Keyword);
		helper.highLightElement(driver, Dropdown_item_Keyword);
		helper.jsCLick(Dropdown_item_Keyword);

		helper.waitFor(Input_Search_By_Keyword);
		helper.highLightElement(driver, Input_Search_By_Keyword);
		Input_Search_By_Keyword.clear();
		Input_Search_By_Keyword.sendKeys("Shoes", Keys.ENTER);
		helper.waitFor(Result, 30);

		List<WebElement> Shoes = driver.findElements(By.cssSelector(".card-body"));
		int Sh = Shoes.size();
		System.out.println(Sh);
		Reporter.log(
				"<B><font color = 'orange'> Step11 -</font> Total Ad Results for the Search term 'Shoes' is :" + Sh);

		helper.waitFor(Clear_Filters);
		helper.highLightElement(driver, Clear_Filters);
		helper.jsCLick(Clear_Filters);

		// Filter with Keyword

		helper.waitFor(DropDown_Toggel_Button);
		helper.highLightElement(driver, DropDown_Toggel_Button);
		helper.jsCLick(DropDown_Toggel_Button);

		helper.waitFor(Dropdown_item_Keyword);
		helper.highLightElement(driver, Dropdown_item_Keyword);
		helper.jsCLick(Dropdown_item_Keyword);

		helper.waitFor(Input_Search_By_Keyword);
		helper.highLightElement(driver, Input_Search_By_Keyword);
		Input_Search_By_Keyword.clear();
		Input_Search_By_Keyword.sendKeys("Developer", Keys.ENTER);
		helper.waitFor(Result, 30);

		List<WebElement> Developer = driver.findElements(By.cssSelector(".card-body"));
		int De = Developer.size();
		System.out.println(De);
		Reporter.log("<B><font color = 'orange'> Step12 -</font> Total Ad Results for the Search term 'Developer' is :"
				+ De);

		helper.waitFor(Clear_Filters);
		helper.highLightElement(driver, Clear_Filters);
		helper.jsCLick(Clear_Filters);

	}

	public void Gdn_Search() throws InterruptedException {

		Reporter.log("<B><font color = 'orange'> Step1 -</font> Logged into PowerAdSpy Application");
		String Page_titel = driver.getTitle();
		System.out.println(Page_titel);
		Reporter.log("<B><font color = 'orange'> Step2 -</font> I am on the page :" + Page_titel);

		helper.waitForPageToLoad();
		helper.waitFor(Logo);
		helper.highLightElement(driver, Logo);
		Assert.assertTrue(Logo.isDisplayed(), "Power Ad Spy Logo is Dispalyed");
		Reporter.log("<B><font color = 'orange'> Step3 -</font> Power Ad Spy Logo is Displayed");

		helper.waitFor(GDN);
		helper.highLightElement(driver, GDN);
		GDN.click();
		Assert.assertTrue(GDN.isDisplayed(), "Clicked on GDN ");
		Reporter.log("<B><font color = 'orange'> Step4 -</font> Clicked On GDN Icon");
		helper.waitForPageToLoad();

		String Page5 = driver.getTitle();
		System.out.println(Page5);
		Reporter.log("<B><font color = 'orange'> Step5 -</font> I am on the page :" + Page5);

		// Filter By Domain Name

		helper.waitFor(DropDown_Toggel_Button);
		helper.highLightElement(driver, DropDown_Toggel_Button);
		helper.jsCLick(DropDown_Toggel_Button);

		helper.waitFor(Dropdown_item_Domain);
		helper.highLightElement(driver, Dropdown_item_Domain);
		helper.jsCLick(Dropdown_item_Domain);

		helper.waitFor(Input_SearchBy_DomainName);
		helper.highLightElement(driver, Input_SearchBy_DomainName);
		Input_SearchBy_DomainName.sendKeys("Yahoo", Keys.ENTER);
		helper.waitFor(Result);
		Thread.sleep(8000);

		/*
		 * helper.waitFor(Input_SearchBy_Domain_Keyword);
		 * helper.highLightElement(driver,Input_SearchBy_Domain_Keyword);
		 * Input_Advirtiser_Keyword.sendKeys("Oppo",Keys.ENTER);
		 */

		List<WebElement> Yahoo = driver.findElements(By.cssSelector(".card-body"));
		int Yo = Yahoo.size();
		System.out.println(Yo);
		Reporter.log(
				"<B><font color = 'orange'> Step6 -</font> Total Ad Results for the Search term 'Yahoo' is :" + Yo);

		helper.waitFor(Clear_Filters);
		helper.highLightElement(driver, Clear_Filters);
		helper.jsCLick(Clear_Filters);

		// Filter By Advirtiser

		helper.waitFor(DropDown_Toggel_Button);
		helper.highLightElement(driver, DropDown_Toggel_Button);
		helper.jsCLick(DropDown_Toggel_Button);

		helper.waitFor(Dropdown_item_Advertiser);
		helper.highLightElement(driver, Dropdown_item_Advertiser);
		helper.jsCLick(Dropdown_item_Advertiser);

		helper.waitFor(Input_SearchBy_Advertiser_Name);
		helper.highLightElement(driver, Input_SearchBy_Advertiser_Name);
		Input_SearchBy_Advertiser_Name.sendKeys("Nike");

		helper.waitFor(Input_Advirtiser_Keyword);
		helper.highLightElement(driver, Input_Advirtiser_Keyword);
		Input_Advirtiser_Keyword.sendKeys("Nike", Keys.ENTER);
		helper.waitFor(Result);
		helper.waitFor(Result, 30);
		// Thread.sleep(8000);

		List<WebElement> Nike = driver.findElements(By.cssSelector(".card-body"));
		int Ni = Nike.size();
		System.out.println(Ni);
		Reporter.log("<B><font color = 'orange'> Step7 -</font> Total Ad Results for the Search term 'Nike' is :" + Ni);

		helper.waitFor(Clear_Filters);
		helper.highLightElement(driver, Clear_Filters);
		helper.jsCLick(Clear_Filters);

		// Filter with Keyword

		helper.waitFor(DropDown_Toggel_Button);
		helper.highLightElement(driver, DropDown_Toggel_Button);
		helper.jsCLick(DropDown_Toggel_Button);

		helper.waitFor(Dropdown_item_Keyword);
		helper.highLightElement(driver, Dropdown_item_Keyword);
		helper.jsCLick(Dropdown_item_Keyword);

		helper.waitFor(Input_Search_By_Keyword);
		helper.highLightElement(driver, Input_Search_By_Keyword);
		Input_Search_By_Keyword.sendKeys("virat", Keys.ENTER);
		helper.waitFor(Result, 30);

		List<WebElement> Viratproducts = driver.findElements(By.cssSelector(".card-body"));
		int viratKohliProducts = Viratproducts.size();
		System.out.println(viratKohliProducts);
		Reporter.log("<B><font color = 'orange'> Step8 -</font> Total Ad Results for the Search term 'Virat kohli' is :"
				+ viratKohliProducts);

		helper.waitFor(Clear_Filters);
		helper.highLightElement(driver, Clear_Filters);
		helper.jsCLick(Clear_Filters);
		Thread.sleep(5000);

		// Filter with Keyword

		helper.waitFor(DropDown_Toggel_Button);
		helper.highLightElement(driver, DropDown_Toggel_Button);
		helper.jsCLick(DropDown_Toggel_Button);

		helper.waitFor(Dropdown_item_Keyword);
		helper.highLightElement(driver, Dropdown_item_Keyword);
		helper.jsCLick(Dropdown_item_Keyword);

		helper.waitFor(Input_Search_By_Keyword);
		helper.highLightElement(driver, Input_Search_By_Keyword);
		Input_Search_By_Keyword.clear();
		Input_Search_By_Keyword.sendKeys("covid", Keys.ENTER);
		helper.waitFor(Result, 30);

		List<WebElement> covid = driver.findElements(By.cssSelector(".card-body"));
		int cov = covid.size();
		System.out.println(covid);
		Reporter.log(
				"<B><font color = 'orange'> Step9 -</font> Total Ad Results for the Search term 'covid' is :" + cov);

		helper.waitFor(Clear_Filters);
		helper.highLightElement(driver, Clear_Filters);
		helper.jsCLick(Clear_Filters);

		// Filter with Keyword

		helper.waitFor(DropDown_Toggel_Button);
		helper.highLightElement(driver, DropDown_Toggel_Button);
		helper.jsCLick(DropDown_Toggel_Button);

		helper.waitFor(Dropdown_item_Keyword);
		helper.highLightElement(driver, Dropdown_item_Keyword);
		helper.jsCLick(Dropdown_item_Keyword);

		helper.waitFor(Input_Search_By_Keyword);
		helper.highLightElement(driver, Input_Search_By_Keyword);
		Input_Search_By_Keyword.clear();
		Input_Search_By_Keyword.sendKeys("Blog", Keys.ENTER);
		helper.waitFor(Result, 30);

		List<WebElement> Blog = driver.findElements(By.cssSelector(".card-body"));
		int Blo = Blog.size();
		System.out.println(Blog);
		Reporter.log(
				"<B><font color = 'orange'> Step10 -</font> Total Ad Results for the Search term 'Blog' is :" + Blo);

		helper.waitFor(Clear_Filters);
		helper.highLightElement(driver, Clear_Filters);
		helper.jsCLick(Clear_Filters);

		// Filter with Keyword

		helper.waitFor(DropDown_Toggel_Button);
		helper.highLightElement(driver, DropDown_Toggel_Button);
		helper.jsCLick(DropDown_Toggel_Button);

		helper.waitFor(Dropdown_item_Keyword);
		helper.highLightElement(driver, Dropdown_item_Keyword);
		helper.jsCLick(Dropdown_item_Keyword);

		helper.waitFor(Input_Search_By_Keyword);
		helper.highLightElement(driver, Input_Search_By_Keyword);
		Input_Search_By_Keyword.clear();
		Input_Search_By_Keyword.sendKeys("Shoes", Keys.ENTER);
		helper.waitFor(Result, 30);

		List<WebElement> Shoes = driver.findElements(By.cssSelector(".card-body"));
		int Sh = Shoes.size();
		System.out.println(Sh);
		Reporter.log(
				"<B><font color = 'orange'> Step11 -</font> Total Ad Results for the Search term 'Shoes' is :" + Sh);

		helper.waitFor(Clear_Filters);
		helper.highLightElement(driver, Clear_Filters);
		helper.jsCLick(Clear_Filters);

		// Filter with Keyword

		helper.waitFor(DropDown_Toggel_Button);
		helper.highLightElement(driver, DropDown_Toggel_Button);
		helper.jsCLick(DropDown_Toggel_Button);

		helper.waitFor(Dropdown_item_Keyword);
		helper.highLightElement(driver, Dropdown_item_Keyword);
		helper.jsCLick(Dropdown_item_Keyword);

		helper.waitFor(Input_Search_By_Keyword);
		helper.highLightElement(driver, Input_Search_By_Keyword);
		Input_Search_By_Keyword.clear();
		Input_Search_By_Keyword.sendKeys("Developer", Keys.ENTER);
		helper.waitFor(Result, 30);

		List<WebElement> Developer = driver.findElements(By.cssSelector(".card-body"));
		int De = Developer.size();
		System.out.println(De);
		Reporter.log("<B><font color = 'orange'> Step12 -</font> Total Ad Results for the Search term 'Developer' is :"
				+ De);

		helper.waitFor(Clear_Filters);
		helper.highLightElement(driver, Clear_Filters);
		helper.jsCLick(Clear_Filters);

	}

	public void Native_Search() throws InterruptedException {

		Reporter.log("<B><font color = 'orange'> Step1 -</font> Logged into PowerAdSpy Application");
		String Page_titel = driver.getTitle();
		System.out.println(Page_titel);
		Reporter.log("<B><font color = 'orange'> Step2 -</font> I am on the page :" + Page_titel);

		helper.waitForPageToLoad();
		helper.waitFor(Logo);
		helper.highLightElement(driver, Logo);
		Assert.assertTrue(Logo.isDisplayed(), "Power Ad Spy Logo is Dispalyed");
		Reporter.log("<B><font color = 'orange'> Step3 -</font> Power Ad Spy Logo is Displayed");

		helper.waitFor(Native);
		helper.highLightElement(driver, Native);
		Native.click();
		Assert.assertTrue(Native.isDisplayed(), "Clicked on Native Ads ");
		Reporter.log("<B><font color = 'orange'> Step4 -</font> Clicked On Native Icon");
		helper.waitForPageToLoad();

		String Page6 = driver.getTitle();
		System.out.println(Page6);
		Reporter.log("<B><font color = 'orange'> Step5 -</font> I am on the page :" + Page6);
		// Filter By Domain Name

		helper.waitFor(DropDown_Toggel_Button);
		helper.highLightElement(driver, DropDown_Toggel_Button);
		helper.jsCLick(DropDown_Toggel_Button);

		helper.waitFor(Dropdown_item_Domain);
		helper.highLightElement(driver, Dropdown_item_Domain);
		helper.jsCLick(Dropdown_item_Domain);

		helper.waitFor(Input_SearchBy_DomainName);
		helper.highLightElement(driver, Input_SearchBy_DomainName);
		Input_SearchBy_DomainName.sendKeys("Yahoo", Keys.ENTER);
		helper.waitFor(Result);
		Thread.sleep(8000);

		List<WebElement> Yahoo = driver.findElements(By.cssSelector(".card-body"));
		int Yo = Yahoo.size();
		System.out.println(Yo);
		Reporter.log(
				"<B><font color = 'orange'> Step6 -</font> Total Ad Results for the Search term 'Yahoo' is :" + Yo);

		helper.waitFor(Clear_Filters);
		helper.highLightElement(driver, Clear_Filters);
		helper.jsCLick(Clear_Filters);

		// Filter By Advirtiser

		helper.waitFor(DropDown_Toggel_Button);
		helper.highLightElement(driver, DropDown_Toggel_Button);
		helper.jsCLick(DropDown_Toggel_Button);

		helper.waitFor(Dropdown_item_Advertiser);
		helper.highLightElement(driver, Dropdown_item_Advertiser);
		helper.jsCLick(Dropdown_item_Advertiser);

		helper.waitFor(Input_SearchBy_Advertiser_Name);
		helper.highLightElement(driver, Input_SearchBy_Advertiser_Name);
		Input_SearchBy_Advertiser_Name.sendKeys("Google");

		helper.waitFor(Input_Advirtiser_Keyword);
		helper.highLightElement(driver, Input_Advirtiser_Keyword);
		Input_Advirtiser_Keyword.sendKeys("Google", Keys.ENTER);
		helper.waitFor(Result);
		helper.waitFor(Result, 30);
		// Thread.sleep(8000);

		List<WebElement> Google = driver.findElements(By.cssSelector(".card-body"));
		int Go = Google.size();
		System.out.println(Go);
		Reporter.log(
				"<B><font color = 'orange'> Step7 -</font> Total Ad Results for the Search term 'Google' is :" + Go);

		helper.waitFor(Clear_Filters);
		helper.highLightElement(driver, Clear_Filters);
		helper.jsCLick(Clear_Filters);

		// Filter with Keyword

		helper.waitFor(DropDown_Toggel_Button);
		helper.highLightElement(driver, DropDown_Toggel_Button);
		helper.jsCLick(DropDown_Toggel_Button);

		helper.waitFor(Dropdown_item_Keyword);
		helper.highLightElement(driver, Dropdown_item_Keyword);
		helper.jsCLick(Dropdown_item_Keyword);

		helper.waitFor(Input_Search_By_Keyword);
		helper.highLightElement(driver, Input_Search_By_Keyword);
		Input_Search_By_Keyword.sendKeys("virat", Keys.ENTER);
		helper.waitFor(Result, 30);

		List<WebElement> Viratproducts = driver.findElements(By.cssSelector(".card-body"));
		int viratKohliProducts = Viratproducts.size();
		System.out.println(viratKohliProducts);
		Reporter.log("<B><font color = 'orange'> Step8 -</font> Total Ad Results for the Search term 'Virat kohli' is :"
				+ viratKohliProducts);

		helper.waitFor(Clear_Filters);
		helper.highLightElement(driver, Clear_Filters);
		helper.jsCLick(Clear_Filters);
		Thread.sleep(5000);

		// Filter with Keyword

		helper.waitFor(DropDown_Toggel_Button);
		helper.highLightElement(driver, DropDown_Toggel_Button);
		helper.jsCLick(DropDown_Toggel_Button);

		helper.waitFor(Dropdown_item_Keyword);
		helper.highLightElement(driver, Dropdown_item_Keyword);
		helper.jsCLick(Dropdown_item_Keyword);

		helper.waitFor(Input_Search_By_Keyword);
		helper.highLightElement(driver, Input_Search_By_Keyword);
		Input_Search_By_Keyword.clear();
		Input_Search_By_Keyword.sendKeys("covid", Keys.ENTER);
		helper.waitFor(Result, 30);

		List<WebElement> covid = driver.findElements(By.cssSelector(".card-body"));
		int cov = covid.size();
		System.out.println(covid);
		Reporter.log(
				"<B><font color = 'orange'> Step9 -</font> Total Ad Results for the Search term 'covid' is :" + cov);

		helper.waitFor(Clear_Filters);
		helper.highLightElement(driver, Clear_Filters);
		helper.jsCLick(Clear_Filters);

		// Filter with Keyword

		helper.waitFor(DropDown_Toggel_Button);
		helper.highLightElement(driver, DropDown_Toggel_Button);
		helper.jsCLick(DropDown_Toggel_Button);

		helper.waitFor(Dropdown_item_Keyword);
		helper.highLightElement(driver, Dropdown_item_Keyword);
		helper.jsCLick(Dropdown_item_Keyword);

		helper.waitFor(Input_Search_By_Keyword);
		helper.highLightElement(driver, Input_Search_By_Keyword);
		Input_Search_By_Keyword.clear();
		Input_Search_By_Keyword.sendKeys("Blog", Keys.ENTER);
		helper.waitFor(Result, 30);

		List<WebElement> Blog = driver.findElements(By.cssSelector(".card-body"));
		int Blo = Blog.size();
		System.out.println(Blog);
		Reporter.log(
				"<B><font color = 'orange'> Step10 -</font> Total Ad Results for the Search term 'Blog' is :" + Blo);

		helper.waitFor(Clear_Filters);
		helper.highLightElement(driver, Clear_Filters);
		helper.jsCLick(Clear_Filters);

		// Filter with Keyword

		helper.waitFor(DropDown_Toggel_Button);
		helper.highLightElement(driver, DropDown_Toggel_Button);
		helper.jsCLick(DropDown_Toggel_Button);

		helper.waitFor(Dropdown_item_Keyword);
		helper.highLightElement(driver, Dropdown_item_Keyword);
		helper.jsCLick(Dropdown_item_Keyword);

		helper.waitFor(Input_Search_By_Keyword);
		helper.highLightElement(driver, Input_Search_By_Keyword);
		Input_Search_By_Keyword.clear();
		Input_Search_By_Keyword.sendKeys("Shoes", Keys.ENTER);
		helper.waitFor(Result, 30);

		List<WebElement> Shoes = driver.findElements(By.cssSelector(".card-body"));
		int Sh = Shoes.size();
		System.out.println(Sh);
		Reporter.log(
				"<B><font color = 'orange'> Step11 -</font> Total Ad Results for the Search term 'Shoes' is :" + Sh);

		helper.waitFor(Clear_Filters);
		helper.highLightElement(driver, Clear_Filters);
		helper.jsCLick(Clear_Filters);

		// Filter with Keyword

		helper.waitFor(DropDown_Toggel_Button);
		helper.highLightElement(driver, DropDown_Toggel_Button);
		helper.jsCLick(DropDown_Toggel_Button);

		helper.waitFor(Dropdown_item_Keyword);
		helper.highLightElement(driver, Dropdown_item_Keyword);
		helper.jsCLick(Dropdown_item_Keyword);

		helper.waitFor(Input_Search_By_Keyword);
		helper.highLightElement(driver, Input_Search_By_Keyword);
		Input_Search_By_Keyword.clear();
		Input_Search_By_Keyword.sendKeys("Developer", Keys.ENTER);
		helper.waitFor(Result, 30);

		List<WebElement> Developer = driver.findElements(By.cssSelector(".card-body"));
		int De = Developer.size();
		System.out.println(De);
		Reporter.log("<B><font color = 'orange'> Step12 -</font> Total Ad Results for the Search term 'Developer' is :"
				+ De);

		helper.waitFor(Clear_Filters);
		helper.highLightElement(driver, Clear_Filters);
		helper.jsCLick(Clear_Filters);

	}

	public void Reddit_Search() throws InterruptedException {

		Reporter.log("<B><font color = 'orange'> Step1 -</font> Logged into PowerAdSpy Application");
		String Page_titel = driver.getTitle();
		System.out.println(Page_titel);
		Reporter.log("<B><font color = 'orange'> Step2 -</font> I am on the page :" + Page_titel);

		helper.waitForPageToLoad();
		helper.waitFor(Logo);
		helper.highLightElement(driver, Logo);
		Assert.assertTrue(Logo.isDisplayed(), "Power Ad Spy Logo is Dispalyed");
		Reporter.log("<B><font color = 'orange'> Step3 -</font> Power Ad Spy Logo is Displayed");

		helper.waitFor(Reddit);
		helper.highLightElement(driver, Reddit);
		Reddit.click();
		Assert.assertTrue(Reddit.isDisplayed(), "Clicked on Reddit Ads ");
		Reporter.log("<B><font color = 'orange'> Step4 -</font> Clicked On Reddit Icon");
		helper.waitForPageToLoad();

		String Page7 = driver.getTitle();
		System.out.println(Page7);
		Reporter.log("<B><font color = 'orange'> Step5 -</font> I am on the page :" + Page7);
		// Filter By Domain Name

		helper.waitFor(DropDown_Toggel_Button);
		helper.highLightElement(driver, DropDown_Toggel_Button);
		helper.jsCLick(DropDown_Toggel_Button);

		helper.waitFor(Dropdown_item_Domain);
		helper.highLightElement(driver, Dropdown_item_Domain);
		helper.jsCLick(Dropdown_item_Domain);

		helper.waitFor(Input_SearchBy_DomainName);
		helper.highLightElement(driver, Input_SearchBy_DomainName);
		Input_SearchBy_DomainName.sendKeys("Python", Keys.ENTER);
		helper.waitFor(Result);
		Thread.sleep(8000);

		List<WebElement> Python = driver.findElements(By.cssSelector(".card-body"));
		int Py = Python.size();
		System.out.println(Py);
		Reporter.log(
				"<B><font color = 'orange'> Step6 -</font> Total Ad Results for the Search term 'Python' is :" + Py);

		helper.waitFor(Clear_Filters);
		helper.highLightElement(driver, Clear_Filters);
		helper.jsCLick(Clear_Filters);

		// Filter By Advirtiser

		helper.waitFor(DropDown_Toggel_Button);
		helper.highLightElement(driver, DropDown_Toggel_Button);
		helper.jsCLick(DropDown_Toggel_Button);

		helper.waitFor(Dropdown_item_Advertiser);
		helper.highLightElement(driver, Dropdown_item_Advertiser);
		helper.jsCLick(Dropdown_item_Advertiser);

		helper.waitFor(Input_SearchBy_Advertiser_Name);
		helper.highLightElement(driver, Input_SearchBy_Advertiser_Name);
		Input_SearchBy_Advertiser_Name.sendKeys("Google");

		helper.waitFor(Input_Advirtiser_Keyword);
		helper.highLightElement(driver, Input_Advirtiser_Keyword);
		Input_Advirtiser_Keyword.sendKeys("Google", Keys.ENTER);
		helper.waitFor(Result);
		helper.waitFor(Result, 30);
		// Thread.sleep(8000);

		List<WebElement> Google = driver.findElements(By.cssSelector(".card-body"));
		int Go = Google.size();
		System.out.println(Go);
		Reporter.log(
				"<B><font color = 'orange'> Step7 -</font> Total Ad Results for the Search term 'Google' is :" + Go);

		helper.waitFor(Clear_Filters);
		helper.highLightElement(driver, Clear_Filters);
		helper.jsCLick(Clear_Filters);

		// Filter with Keyword

		helper.waitFor(DropDown_Toggel_Button);
		helper.highLightElement(driver, DropDown_Toggel_Button);
		helper.jsCLick(DropDown_Toggel_Button);

		helper.waitFor(Dropdown_item_Keyword);
		helper.highLightElement(driver, Dropdown_item_Keyword);
		helper.jsCLick(Dropdown_item_Keyword);

		helper.waitFor(Input_Search_By_Keyword);
		helper.highLightElement(driver, Input_Search_By_Keyword);
		Input_Search_By_Keyword.sendKeys("virat", Keys.ENTER);
		helper.waitFor(Result, 30);

		List<WebElement> Viratproducts = driver.findElements(By.cssSelector(".card-body"));
		int viratKohliProducts = Viratproducts.size();
		System.out.println(viratKohliProducts);
		Reporter.log("<B><font color = 'orange'> Step8 -</font> Total Ad Results for the Search term 'Virat kohli' is :"
				+ viratKohliProducts);

		helper.waitFor(Clear_Filters);
		helper.highLightElement(driver, Clear_Filters);
		helper.jsCLick(Clear_Filters);
		Thread.sleep(5000);

		// Filter with Keyword

		helper.waitFor(DropDown_Toggel_Button);
		helper.highLightElement(driver, DropDown_Toggel_Button);
		helper.jsCLick(DropDown_Toggel_Button);

		helper.waitFor(Dropdown_item_Keyword);
		helper.highLightElement(driver, Dropdown_item_Keyword);
		helper.jsCLick(Dropdown_item_Keyword);

		helper.waitFor(Input_Search_By_Keyword);
		helper.highLightElement(driver, Input_Search_By_Keyword);
		Input_Search_By_Keyword.clear();
		Input_Search_By_Keyword.sendKeys("covid", Keys.ENTER);
		helper.waitFor(Result, 30);

		List<WebElement> covid = driver.findElements(By.cssSelector(".card-body"));
		int cov = covid.size();
		System.out.println(covid);
		Reporter.log(
				"<B><font color = 'orange'> Step9 -</font> Total Ad Results for the Search term 'covid' is :" + cov);

		helper.waitFor(Clear_Filters);
		helper.highLightElement(driver, Clear_Filters);
		helper.jsCLick(Clear_Filters);

		// Filter with Keyword

		helper.waitFor(DropDown_Toggel_Button);
		helper.highLightElement(driver, DropDown_Toggel_Button);
		helper.jsCLick(DropDown_Toggel_Button);

		helper.waitFor(Dropdown_item_Keyword);
		helper.highLightElement(driver, Dropdown_item_Keyword);
		helper.jsCLick(Dropdown_item_Keyword);

		helper.waitFor(Input_Search_By_Keyword);
		helper.highLightElement(driver, Input_Search_By_Keyword);
		Input_Search_By_Keyword.clear();
		Input_Search_By_Keyword.sendKeys("Blog", Keys.ENTER);
		helper.waitFor(Result, 30);

		List<WebElement> Blog = driver.findElements(By.cssSelector(".card-body"));
		int Blo = Blog.size();
		System.out.println(Blog);
		Reporter.log(
				"<B><font color = 'orange'> Step10 -</font> Total Ad Results for the Search term 'Blog' is :" + Blo);

		helper.waitFor(Clear_Filters);
		helper.highLightElement(driver, Clear_Filters);
		helper.jsCLick(Clear_Filters);

		// Filter with Keyword

		helper.waitFor(DropDown_Toggel_Button);
		helper.highLightElement(driver, DropDown_Toggel_Button);
		helper.jsCLick(DropDown_Toggel_Button);

		helper.waitFor(Dropdown_item_Keyword);
		helper.highLightElement(driver, Dropdown_item_Keyword);
		helper.jsCLick(Dropdown_item_Keyword);

		helper.waitFor(Input_Search_By_Keyword);
		helper.highLightElement(driver, Input_Search_By_Keyword);
		Input_Search_By_Keyword.clear();
		Input_Search_By_Keyword.sendKeys("Shoes", Keys.ENTER);
		helper.waitFor(Result, 30);

		List<WebElement> Shoes = driver.findElements(By.cssSelector(".card-body"));
		int Sh = Shoes.size();
		System.out.println(Sh);
		Reporter.log(
				"<B><font color = 'orange'> Step11 -</font> Total Ad Results for the Search term 'Shoes' is :" + Sh);

		helper.waitFor(Clear_Filters);
		helper.highLightElement(driver, Clear_Filters);
		helper.jsCLick(Clear_Filters);

		// Filter with Keyword

		helper.waitFor(DropDown_Toggel_Button);
		helper.highLightElement(driver, DropDown_Toggel_Button);
		helper.jsCLick(DropDown_Toggel_Button);

		helper.waitFor(Dropdown_item_Keyword);
		helper.highLightElement(driver, Dropdown_item_Keyword);
		helper.jsCLick(Dropdown_item_Keyword);

		helper.waitFor(Input_Search_By_Keyword);
		helper.highLightElement(driver, Input_Search_By_Keyword);
		Input_Search_By_Keyword.clear();
		Input_Search_By_Keyword.sendKeys("Developer", Keys.ENTER);
		helper.waitFor(Result, 30);

		List<WebElement> Developer = driver.findElements(By.cssSelector(".card-body"));
		int De = Developer.size();
		System.out.println(De);
		Reporter.log("<B><font color = 'orange'> Step12 -</font> Total Ad Results for the Search term 'Developer' is :"
				+ De);

		helper.waitFor(Clear_Filters);
		helper.highLightElement(driver, Clear_Filters);
		helper.jsCLick(Clear_Filters);

	}

	public void Quora_Search() throws InterruptedException {

		Reporter.log("<B><font color = 'orange'> Step1 -</font> Logged into PowerAdSpy Application");
		String Page_titel = driver.getTitle();
		System.out.println(Page_titel);
		Reporter.log("<B><font color = 'orange'> Step2 -</font> I am on the page :" + Page_titel);

		helper.waitForPageToLoad();
		helper.waitFor(Logo);
		helper.highLightElement(driver, Logo);
		Assert.assertTrue(Logo.isDisplayed(), "Power Ad Spy Logo is Dispalyed");
		Reporter.log("<B><font color = 'orange'> Step3 -</font> Power Ad Spy Logo is Displayed");

		helper.waitFor(Quora);
		helper.highLightElement(driver, Quora);
		Quora.click();
		Assert.assertTrue(Quora.isDisplayed(), "Clicked on Quora Ads ");
		Reporter.log("<B><font color = 'orange'> Step4 -</font> Clicked On Quora Icon");
		helper.waitForPageToLoad();

		String Page8 = driver.getTitle();
		System.out.println(Page8);
		Reporter.log("<B><font color = 'orange'> Step5 -</font> I am on the page :" + Page8);

		// Filter By Domain Name

		helper.waitFor(DropDown_Toggel_Button);
		helper.highLightElement(driver, DropDown_Toggel_Button);
		helper.jsCLick(DropDown_Toggel_Button);

		helper.waitFor(Dropdown_item_Domain);
		helper.highLightElement(driver, Dropdown_item_Domain);
		helper.jsCLick(Dropdown_item_Domain);

		helper.waitFor(Input_SearchBy_DomainName);
		helper.highLightElement(driver, Input_SearchBy_DomainName);
		Input_SearchBy_DomainName.sendKeys("Amazon", Keys.ENTER);
		helper.waitFor(Result);
		Thread.sleep(8000);

		List<WebElement> Amazon = driver.findElements(By.cssSelector(".card-body"));
		int Am = Amazon.size();
		System.out.println(Am);
		Reporter.log(
				"<B><font color = 'orange'> Step6 -</font> Total Ad Results for the Search term 'Amazon' is :" + Am);

		helper.waitFor(Clear_Filters);
		helper.highLightElement(driver, Clear_Filters);
		helper.jsCLick(Clear_Filters);

		// Filter By Advirtiser

		helper.waitFor(DropDown_Toggel_Button);
		helper.highLightElement(driver, DropDown_Toggel_Button);
		helper.jsCLick(DropDown_Toggel_Button);

		helper.waitFor(Dropdown_item_Advertiser);
		helper.highLightElement(driver, Dropdown_item_Advertiser);
		helper.jsCLick(Dropdown_item_Advertiser);

		helper.waitFor(Input_SearchBy_Advertiser_Name);
		helper.highLightElement(driver, Input_SearchBy_Advertiser_Name);
		Input_SearchBy_Advertiser_Name.sendKeys("StackMoxie");

		helper.waitFor(Input_Advirtiser_Keyword);
		helper.highLightElement(driver, Input_Advirtiser_Keyword);
		Input_Advirtiser_Keyword.sendKeys("StackMoxie", Keys.ENTER);
		helper.waitFor(Result);
		helper.waitFor(Result, 30);
		// Thread.sleep(8000);

		List<WebElement> StackMoxie = driver.findElements(By.cssSelector(".card-body"));
		int St = StackMoxie.size();
		System.out.println(St);
		Reporter.log("<B><font color = 'orange'> Step7 -</font> Total Ad Results for the Search term 'StackMoxie' is :"
				+ St);

		helper.waitFor(Clear_Filters);
		helper.highLightElement(driver, Clear_Filters);
		helper.jsCLick(Clear_Filters);

		// Filter with Keyword

		helper.waitFor(DropDown_Toggel_Button);
		helper.highLightElement(driver, DropDown_Toggel_Button);
		helper.jsCLick(DropDown_Toggel_Button);

		helper.waitFor(Dropdown_item_Keyword);
		helper.highLightElement(driver, Dropdown_item_Keyword);
		helper.jsCLick(Dropdown_item_Keyword);

		helper.waitFor(Input_Search_By_Keyword);
		helper.highLightElement(driver, Input_Search_By_Keyword);
		Input_Search_By_Keyword.sendKeys("virat", Keys.ENTER);
		helper.waitFor(Result, 30);

		List<WebElement> Viratproducts = driver.findElements(By.cssSelector(".card-body"));
		int viratKohliProducts = Viratproducts.size();
		System.out.println(viratKohliProducts);
		Reporter.log("<B><font color = 'orange'> Step8 -</font> Total Ad Results for the Search term 'Virat kohli' is :"
				+ viratKohliProducts);

		helper.waitFor(Clear_Filters);
		helper.highLightElement(driver, Clear_Filters);
		helper.jsCLick(Clear_Filters);
		Thread.sleep(5000);

		// Filter with Keyword

		helper.waitFor(DropDown_Toggel_Button);
		helper.highLightElement(driver, DropDown_Toggel_Button);
		helper.jsCLick(DropDown_Toggel_Button);

		helper.waitFor(Dropdown_item_Keyword);
		helper.highLightElement(driver, Dropdown_item_Keyword);
		helper.jsCLick(Dropdown_item_Keyword);

		helper.waitFor(Input_Search_By_Keyword);
		helper.highLightElement(driver, Input_Search_By_Keyword);
		Input_Search_By_Keyword.clear();
		Input_Search_By_Keyword.sendKeys("covid", Keys.ENTER);
		helper.waitFor(Result, 30);

		List<WebElement> covid = driver.findElements(By.cssSelector(".card-body"));
		int cov = covid.size();
		System.out.println(covid);
		Reporter.log(
				"<B><font color = 'orange'> Step9 -</font> Total Ad Results for the Search term 'covid' is :" + cov);

		helper.waitFor(Clear_Filters);
		helper.highLightElement(driver, Clear_Filters);
		helper.jsCLick(Clear_Filters);

		// Filter with Keyword

		helper.waitFor(DropDown_Toggel_Button);
		helper.highLightElement(driver, DropDown_Toggel_Button);
		helper.jsCLick(DropDown_Toggel_Button);

		helper.waitFor(Dropdown_item_Keyword);
		helper.highLightElement(driver, Dropdown_item_Keyword);
		helper.jsCLick(Dropdown_item_Keyword);

		helper.waitFor(Input_Search_By_Keyword);
		helper.highLightElement(driver, Input_Search_By_Keyword);
		Input_Search_By_Keyword.clear();
		Input_Search_By_Keyword.sendKeys("Blog", Keys.ENTER);
		helper.waitFor(Result, 30);

		List<WebElement> Blog = driver.findElements(By.cssSelector(".card-body"));
		int Blo = Blog.size();
		System.out.println(Blog);
		Reporter.log(
				"<B><font color = 'orange'> Step10 -</font> Total Ad Results for the Search term 'Blog' is :" + Blo);

		helper.waitFor(Clear_Filters);
		helper.highLightElement(driver, Clear_Filters);
		helper.jsCLick(Clear_Filters);

		// Filter with Keyword

		helper.waitFor(DropDown_Toggel_Button);
		helper.highLightElement(driver, DropDown_Toggel_Button);
		helper.jsCLick(DropDown_Toggel_Button);

		helper.waitFor(Dropdown_item_Keyword);
		helper.highLightElement(driver, Dropdown_item_Keyword);
		helper.jsCLick(Dropdown_item_Keyword);

		helper.waitFor(Input_Search_By_Keyword);
		helper.highLightElement(driver, Input_Search_By_Keyword);
		Input_Search_By_Keyword.clear();
		Input_Search_By_Keyword.sendKeys("Shoes", Keys.ENTER);
		helper.waitFor(Result, 30);

		List<WebElement> Shoes = driver.findElements(By.cssSelector(".card-body"));
		int Sh = Shoes.size();
		System.out.println(Sh);
		Reporter.log(
				"<B><font color = 'orange'> Step11 -</font> Total Ad Results for the Search term 'Shoes' is :" + Sh);

		helper.waitFor(Clear_Filters);
		helper.highLightElement(driver, Clear_Filters);
		helper.jsCLick(Clear_Filters);

		// Filter with Keyword

		helper.waitFor(DropDown_Toggel_Button);
		helper.highLightElement(driver, DropDown_Toggel_Button);
		helper.jsCLick(DropDown_Toggel_Button);

		helper.waitFor(Dropdown_item_Keyword);
		helper.highLightElement(driver, Dropdown_item_Keyword);
		helper.jsCLick(Dropdown_item_Keyword);

		helper.waitFor(Input_Search_By_Keyword);
		helper.highLightElement(driver, Input_Search_By_Keyword);
		Input_Search_By_Keyword.clear();
		Input_Search_By_Keyword.sendKeys("Developer", Keys.ENTER);
		helper.waitFor(Result, 30);

		List<WebElement> Developer = driver.findElements(By.cssSelector(".card-body"));
		int De = Developer.size();
		System.out.println(De);
		Reporter.log("<B><font color = 'orange'> Step12 -</font> Total Ad Results for the Search term 'Developer' is :"
				+ De);

		helper.waitFor(Clear_Filters);
		helper.highLightElement(driver, Clear_Filters);
		helper.jsCLick(Clear_Filters);

	}

	public void Pintrest_Search() throws InterruptedException {

		Reporter.log("<B><font color = 'orange'> Step1 -</font> Logged into PowerAdSpy Application");
		String Page_titel = driver.getTitle();
		System.out.println(Page_titel);
		Reporter.log("<B><font color = 'orange'> Step2 -</font> I am on the page :" + Page_titel);

		helper.waitForPageToLoad();
		helper.waitFor(Logo);
		helper.highLightElement(driver, Logo);
		Assert.assertTrue(Logo.isDisplayed(), "Power Ad Spy Logo is Dispalyed");
		Reporter.log("<B><font color = 'orange'> Step3 -</font> Power Ad Spy Logo is Displayed");

		helper.waitFor(Printrest);
		helper.highLightElement(driver, Printrest);
		Printrest.click();
		Assert.assertTrue(Printrest.isDisplayed(), "Clicked on Printrest Ads ");
		Reporter.log("<B><font color = 'orange'> Step4 -</font> Clicked On Printrest Icon");
		helper.waitForPageToLoad();

		String Page9 = driver.getTitle();
		System.out.println(Page9);
		Reporter.log("<B><font color = 'orange'> Step5 -</font> I am on the page :" + Page9);

		// Filter By Domain Name

		helper.waitFor(DropDown_Toggel_Button);
		helper.highLightElement(driver, DropDown_Toggel_Button);
		helper.jsCLick(DropDown_Toggel_Button);

		helper.waitFor(Dropdown_item_Domain);
		helper.highLightElement(driver, Dropdown_item_Domain);
		helper.jsCLick(Dropdown_item_Domain);

		helper.waitFor(Input_SearchBy_DomainName);
		helper.highLightElement(driver, Input_SearchBy_DomainName);
		Input_SearchBy_DomainName.sendKeys("Cars", Keys.ENTER);
		helper.waitFor(Result);
		Thread.sleep(8000);

		List<WebElement> Cars = driver.findElements(By.cssSelector(".card-body"));
		int Ca = Cars.size();
		System.out.println(Ca);
		Reporter.log("<B><font color = 'orange'> Step6 -</font> Total Ad Results for the Search term 'Cars' is :" + Ca);

		helper.waitFor(Clear_Filters);
		helper.highLightElement(driver, Clear_Filters);
		helper.jsCLick(Clear_Filters);

		// Filter By Advirtiser

		helper.waitFor(DropDown_Toggel_Button);
		helper.highLightElement(driver, DropDown_Toggel_Button);
		helper.jsCLick(DropDown_Toggel_Button);

		helper.waitFor(Dropdown_item_Advertiser);
		helper.highLightElement(driver, Dropdown_item_Advertiser);
		helper.jsCLick(Dropdown_item_Advertiser);

		helper.waitFor(Input_SearchBy_Advertiser_Name);
		helper.highLightElement(driver, Input_SearchBy_Advertiser_Name);
		Input_SearchBy_Advertiser_Name.sendKeys("Bmw");

		helper.waitFor(Input_Advirtiser_Keyword);
		helper.highLightElement(driver, Input_Advirtiser_Keyword);
		Input_Advirtiser_Keyword.sendKeys("Bmw", Keys.ENTER);
		helper.waitFor(Result);
		helper.waitFor(Result, 30);
		// Thread.sleep(8000);

		List<WebElement> Bmw = driver.findElements(By.cssSelector(".card-body"));
		int Bm = Bmw.size();
		System.out.println(Bm);
		Reporter.log("<B><font color = 'orange'> Step7 -</font> Total Ad Results for the Search term 'Bmw' is :" + Bm);

		helper.waitFor(Clear_Filters);
		helper.highLightElement(driver, Clear_Filters);
		helper.jsCLick(Clear_Filters);

		// Filter with Keyword

		helper.waitFor(DropDown_Toggel_Button);
		helper.highLightElement(driver, DropDown_Toggel_Button);
		helper.jsCLick(DropDown_Toggel_Button);

		helper.waitFor(Dropdown_item_Keyword);
		helper.highLightElement(driver, Dropdown_item_Keyword);
		helper.jsCLick(Dropdown_item_Keyword);

		helper.waitFor(Input_Search_By_Keyword);
		helper.highLightElement(driver, Input_Search_By_Keyword);
		Input_Search_By_Keyword.sendKeys("virat", Keys.ENTER);
		helper.waitFor(Result, 30);

		List<WebElement> Viratproducts = driver.findElements(By.cssSelector(".card-body"));
		int viratKohliProducts = Viratproducts.size();
		System.out.println(viratKohliProducts);
		Reporter.log("<B><font color = 'orange'> Step8 -</font> Total Ad Results for the Search term 'Virat kohli' is :"
				+ viratKohliProducts);

		helper.waitFor(Clear_Filters);
		helper.highLightElement(driver, Clear_Filters);
		helper.jsCLick(Clear_Filters);
		Thread.sleep(5000);

		// Filter with Keyword

		helper.waitFor(DropDown_Toggel_Button);
		helper.highLightElement(driver, DropDown_Toggel_Button);
		helper.jsCLick(DropDown_Toggel_Button);

		helper.waitFor(Dropdown_item_Keyword);
		helper.highLightElement(driver, Dropdown_item_Keyword);
		helper.jsCLick(Dropdown_item_Keyword);

		helper.waitFor(Input_Search_By_Keyword);
		helper.highLightElement(driver, Input_Search_By_Keyword);
		Input_Search_By_Keyword.clear();
		Input_Search_By_Keyword.sendKeys("covid", Keys.ENTER);
		helper.waitFor(Result, 30);

		List<WebElement> covid = driver.findElements(By.cssSelector(".card-body"));
		int cov = covid.size();
		System.out.println(covid);
		Reporter.log(
				"<B><font color = 'orange'> Step9 -</font> Total Ad Results for the Search term 'covid' is :" + cov);

		helper.waitFor(Clear_Filters);
		helper.highLightElement(driver, Clear_Filters);
		helper.jsCLick(Clear_Filters);

		// Filter with Keyword

		helper.waitFor(DropDown_Toggel_Button);
		helper.highLightElement(driver, DropDown_Toggel_Button);
		helper.jsCLick(DropDown_Toggel_Button);

		helper.waitFor(Dropdown_item_Keyword);
		helper.highLightElement(driver, Dropdown_item_Keyword);
		helper.jsCLick(Dropdown_item_Keyword);

		helper.waitFor(Input_Search_By_Keyword);
		helper.highLightElement(driver, Input_Search_By_Keyword);
		Input_Search_By_Keyword.clear();
		Input_Search_By_Keyword.sendKeys("Blog", Keys.ENTER);
		helper.waitFor(Result, 30);

		List<WebElement> Blog = driver.findElements(By.cssSelector(".card-body"));
		int Blo = Blog.size();
		System.out.println(Blog);
		Reporter.log(
				"<B><font color = 'orange'> Step10 -</font> Total Ad Results for the Search term 'Blog' is :" + Blo);

		helper.waitFor(Clear_Filters);
		helper.highLightElement(driver, Clear_Filters);
		helper.jsCLick(Clear_Filters);

		// Filter with Keyword

		helper.waitFor(DropDown_Toggel_Button);
		helper.highLightElement(driver, DropDown_Toggel_Button);
		helper.jsCLick(DropDown_Toggel_Button);

		helper.waitFor(Dropdown_item_Keyword);
		helper.highLightElement(driver, Dropdown_item_Keyword);
		helper.jsCLick(Dropdown_item_Keyword);

		helper.waitFor(Input_Search_By_Keyword);
		helper.highLightElement(driver, Input_Search_By_Keyword);
		Input_Search_By_Keyword.clear();
		Input_Search_By_Keyword.sendKeys("Shoes", Keys.ENTER);
		helper.waitFor(Result, 30);

		List<WebElement> Shoes = driver.findElements(By.cssSelector(".card-body"));
		int Sh = Shoes.size();
		System.out.println(Sh);
		Reporter.log(
				"<B><font color = 'orange'> Step11 -</font> Total Ad Results for the Search term 'Shoes' is :" + Sh);

		helper.waitFor(Clear_Filters);
		helper.highLightElement(driver, Clear_Filters);
		helper.jsCLick(Clear_Filters);

		// Filter with Keyword

		helper.waitFor(DropDown_Toggel_Button);
		helper.highLightElement(driver, DropDown_Toggel_Button);
		helper.jsCLick(DropDown_Toggel_Button);

		helper.waitFor(Dropdown_item_Keyword);
		helper.highLightElement(driver, Dropdown_item_Keyword);
		helper.jsCLick(Dropdown_item_Keyword);

		helper.waitFor(Input_Search_By_Keyword);
		helper.highLightElement(driver, Input_Search_By_Keyword);
		Input_Search_By_Keyword.clear();
		Input_Search_By_Keyword.sendKeys("Developer", Keys.ENTER);
		helper.waitFor(Result, 30);

		List<WebElement> Developer = driver.findElements(By.cssSelector(".card-body"));
		int De = Developer.size();
		System.out.println(De);
		Reporter.log("<B><font color = 'orange'> Step12 -</font> Total Ad Results for the Search term 'Developer' is :"
				+ De);

		helper.waitFor(Clear_Filters);
		helper.highLightElement(driver, Clear_Filters);
		helper.jsCLick(Clear_Filters);

	}

	public void Linkedin_Search() throws InterruptedException {

		Reporter.log("<B><font color = 'orange'> Step1 -</font> Logged into PowerAdSpy Application");
		String Page_titel = driver.getTitle();
		System.out.println(Page_titel);
		Reporter.log("<B><font color = 'orange'> Step2 -</font> I am on the page :" + Page_titel);

		helper.waitForPageToLoad();
		helper.waitFor(Logo);
		helper.highLightElement(driver, Logo);
		Assert.assertTrue(Logo.isDisplayed(), "Power Ad Spy Logo is Dispalyed");
		Reporter.log("<B><font color = 'orange'> Step3 -</font> Power Ad Spy Logo is Displayed");

		helper.waitFor(Linkedin);
		helper.highLightElement(driver, Linkedin);
		helper.Scrollintoview(Linkedin);
		Linkedin.click();
		Assert.assertTrue(Linkedin.isDisplayed(), "Clicked on Linkedin Ads ");
		Reporter.log("<B><font color = 'orange'> Step4 -</font> Clicked On Linkedin Icon");
		helper.waitForPageToLoad();

		String Page10 = driver.getTitle();
		System.out.println(Page10);
		Reporter.log("<B><font color = 'orange'> Step5 -</font> I am on the page :" + Page10);

		// Filter By Domain Name

		helper.waitFor(DropDown_Toggel_Button);
		helper.highLightElement(driver, DropDown_Toggel_Button);
		helper.jsCLick(DropDown_Toggel_Button);

		helper.waitFor(Dropdown_item_Domain);
		helper.highLightElement(driver, Dropdown_item_Domain);
		helper.jsCLick(Dropdown_item_Domain);

		helper.waitFor(Input_SearchBy_DomainName);
		helper.highLightElement(driver, Input_SearchBy_DomainName);
		Input_SearchBy_DomainName.sendKeys("Jobs", Keys.ENTER);
		helper.waitFor(Result);
		Thread.sleep(8000);

		List<WebElement> Jobs = driver.findElements(By.cssSelector(".card-body"));
		int Jo = Jobs.size();
		System.out.println(Jo);
		Reporter.log("<B><font color = 'orange'> Step6 -</font> Total Ad Results for the Search term 'Jobs' is :" + Jo);

		helper.waitFor(Clear_Filters);
		helper.highLightElement(driver, Clear_Filters);
		helper.jsCLick(Clear_Filters);

		// Filter By Advirtiser

		helper.waitFor(DropDown_Toggel_Button);
		helper.highLightElement(driver, DropDown_Toggel_Button);
		helper.jsCLick(DropDown_Toggel_Button);

		helper.waitFor(Dropdown_item_Advertiser);
		helper.highLightElement(driver, Dropdown_item_Advertiser);
		helper.jsCLick(Dropdown_item_Advertiser);

		helper.waitFor(Input_SearchBy_Advertiser_Name);
		helper.highLightElement(driver, Input_SearchBy_Advertiser_Name);
		Input_SearchBy_Advertiser_Name.sendKeys("Cisco");

		helper.waitFor(Input_Advirtiser_Keyword);
		helper.highLightElement(driver, Input_Advirtiser_Keyword);
		Input_Advirtiser_Keyword.sendKeys("Cisco", Keys.ENTER);
		helper.waitFor(Result);
		helper.waitFor(Result, 30);
		// Thread.sleep(8000);

		List<WebElement> Cisco = driver.findElements(By.cssSelector(".card-body"));
		int Ci = Cisco.size();
		System.out.println(Ci);
		Reporter.log(
				"<B><font color = 'orange'> Step7 -</font> Total Ad Results for the Search term 'Cisco' is :" + Ci);

		helper.waitFor(Clear_Filters);
		helper.highLightElement(driver, Clear_Filters);
		helper.jsCLick(Clear_Filters);

		// Filter with Keyword

		helper.waitFor(DropDown_Toggel_Button);
		helper.highLightElement(driver, DropDown_Toggel_Button);
		helper.jsCLick(DropDown_Toggel_Button);

		helper.waitFor(Dropdown_item_Keyword);
		helper.highLightElement(driver, Dropdown_item_Keyword);
		helper.jsCLick(Dropdown_item_Keyword);

		helper.waitFor(Input_Search_By_Keyword);
		helper.highLightElement(driver, Input_Search_By_Keyword);
		Input_Search_By_Keyword.sendKeys("virat", Keys.ENTER);
		helper.waitFor(Result, 30);

		List<WebElement> Viratproducts = driver.findElements(By.cssSelector(".card-body"));
		int viratKohliProducts = Viratproducts.size();
		System.out.println(viratKohliProducts);
		Reporter.log("<B><font color = 'orange'> Step8 -</font> Total Ad Results for the Search term 'Virat kohli' is :"
				+ viratKohliProducts);

		helper.waitFor(Clear_Filters);
		helper.highLightElement(driver, Clear_Filters);
		helper.jsCLick(Clear_Filters);
		Thread.sleep(5000);

		// Filter with Keyword

		helper.waitFor(DropDown_Toggel_Button);
		helper.highLightElement(driver, DropDown_Toggel_Button);
		helper.jsCLick(DropDown_Toggel_Button);

		helper.waitFor(Dropdown_item_Keyword);
		helper.highLightElement(driver, Dropdown_item_Keyword);
		helper.jsCLick(Dropdown_item_Keyword);

		helper.waitFor(Input_Search_By_Keyword);
		helper.highLightElement(driver, Input_Search_By_Keyword);
		Input_Search_By_Keyword.clear();
		Input_Search_By_Keyword.sendKeys("covid", Keys.ENTER);
		helper.waitFor(Result, 30);

		List<WebElement> covid = driver.findElements(By.cssSelector(".card-body"));
		int cov = covid.size();
		System.out.println(covid);
		Reporter.log(
				"<B><font color = 'orange'> Step9 -</font> Total Ad Results for the Search term 'covid' is :" + cov);

		helper.waitFor(Clear_Filters);
		helper.highLightElement(driver, Clear_Filters);
		helper.jsCLick(Clear_Filters);

		// Filter with Keyword

		helper.waitFor(DropDown_Toggel_Button);
		helper.highLightElement(driver, DropDown_Toggel_Button);
		helper.jsCLick(DropDown_Toggel_Button);

		helper.waitFor(Dropdown_item_Keyword);
		helper.highLightElement(driver, Dropdown_item_Keyword);
		helper.jsCLick(Dropdown_item_Keyword);

		helper.waitFor(Input_Search_By_Keyword);
		helper.highLightElement(driver, Input_Search_By_Keyword);
		Input_Search_By_Keyword.clear();
		Input_Search_By_Keyword.sendKeys("Blog", Keys.ENTER);
		helper.waitFor(Result, 30);

		List<WebElement> Blog = driver.findElements(By.cssSelector(".card-body"));
		int Blo = Blog.size();
		System.out.println(Blog);
		Reporter.log(
				"<B><font color = 'orange'> Step10 -</font> Total Ad Results for the Search term 'Blog' is :" + Blo);

		helper.waitFor(Clear_Filters);
		helper.highLightElement(driver, Clear_Filters);
		helper.jsCLick(Clear_Filters);

		// Filter with Keyword

		helper.waitFor(DropDown_Toggel_Button);
		helper.highLightElement(driver, DropDown_Toggel_Button);
		helper.jsCLick(DropDown_Toggel_Button);

		helper.waitFor(Dropdown_item_Keyword);
		helper.highLightElement(driver, Dropdown_item_Keyword);
		helper.jsCLick(Dropdown_item_Keyword);

		helper.waitFor(Input_Search_By_Keyword);
		helper.highLightElement(driver, Input_Search_By_Keyword);
		Input_Search_By_Keyword.clear();
		Input_Search_By_Keyword.sendKeys("Shoes", Keys.ENTER);
		helper.waitFor(Result, 30);

		List<WebElement> Shoes = driver.findElements(By.cssSelector(".card-body"));
		int Sh = Shoes.size();
		System.out.println(Sh);
		Reporter.log(
				"<B><font color = 'orange'> Step11 -</font> Total Ad Results for the Search term 'Shoes' is :" + Sh);

		helper.waitFor(Clear_Filters);
		helper.highLightElement(driver, Clear_Filters);
		helper.jsCLick(Clear_Filters);

		// Filter with Keyword

		helper.waitFor(DropDown_Toggel_Button);
		helper.highLightElement(driver, DropDown_Toggel_Button);
		helper.jsCLick(DropDown_Toggel_Button);

		helper.waitFor(Dropdown_item_Keyword);
		helper.highLightElement(driver, Dropdown_item_Keyword);
		helper.jsCLick(Dropdown_item_Keyword);

		helper.waitFor(Input_Search_By_Keyword);
		helper.highLightElement(driver, Input_Search_By_Keyword);
		Input_Search_By_Keyword.clear();
		Input_Search_By_Keyword.sendKeys("Developer", Keys.ENTER);
		helper.waitFor(Result, 30);

		List<WebElement> Developer = driver.findElements(By.cssSelector(".card-body"));
		int De = Developer.size();
		System.out.println(De);
		Reporter.log("<B><font color = 'orange'> Step12 -</font> Total Ad Results for the Search term 'Developer' is :"
				+ De);

		helper.waitFor(Clear_Filters);
		helper.highLightElement(driver, Clear_Filters);
		helper.jsCLick(Clear_Filters);

	}

	public void Twitter_Search() throws InterruptedException {

		Reporter.log("<B><font color = 'orange'> Step1 -</font> Logged into PowerAdSpy Application");
		String Page_titel = driver.getTitle();
		System.out.println(Page_titel);
		Reporter.log("<B><font color = 'orange'> Step2 -</font> I am on the page :" + Page_titel);

		helper.waitForPageToLoad();
		helper.waitFor(Logo);
		helper.highLightElement(driver, Logo);
		Assert.assertTrue(Logo.isDisplayed(), "Power Ad Spy Logo is Dispalyed");
		Reporter.log("<B><font color = 'orange'> Step3 -</font> Power Ad Spy Logo is Displayed");

		helper.waitFor(Twitter);
		helper.highLightElement(driver, Twitter);
		Twitter.click();
		Assert.assertTrue(Twitter.isDisplayed(), "Clicked on Twitter Ads ");
		Reporter.log("<B><font color = 'orange'> Step4 -</font> Clicked On Twitter Icon");
		helper.waitForPageToLoad();

		String Page11 = driver.getTitle();
		System.out.println(Page11);
		Reporter.log("<B><font color = 'orange'> Step5 -</font> I am on the page :" + Page11);

		// Filter By Domain Name

		helper.waitFor(DropDown_Toggel_Button);
		helper.highLightElement(driver, DropDown_Toggel_Button);
		helper.jsCLick(DropDown_Toggel_Button);

		helper.waitFor(Dropdown_item_Domain);
		helper.highLightElement(driver, Dropdown_item_Domain);
		helper.jsCLick(Dropdown_item_Domain);

		helper.waitFor(Input_SearchBy_DomainName);
		helper.highLightElement(driver, Input_SearchBy_DomainName);
		Input_SearchBy_DomainName.sendKeys("Movies", Keys.ENTER);
		helper.waitFor(Result);
		Thread.sleep(8000);

		List<WebElement> Movies = driver.findElements(By.cssSelector(".card-body"));
		int Mo = Movies.size();
		System.out.println(Mo);
		Reporter.log(
				"<B><font color = 'orange'> Step6 -</font> Total Ad Results for the Search term 'Movies' is :" + Mo);

		helper.waitFor(Clear_Filters);
		helper.highLightElement(driver, Clear_Filters);
		helper.jsCLick(Clear_Filters);

		// Filter By Advirtiser

		helper.waitFor(DropDown_Toggel_Button);
		helper.highLightElement(driver, DropDown_Toggel_Button);
		helper.jsCLick(DropDown_Toggel_Button);

		helper.waitFor(Dropdown_item_Advertiser);
		helper.highLightElement(driver, Dropdown_item_Advertiser);
		helper.jsCLick(Dropdown_item_Advertiser);

		helper.waitFor(Input_SearchBy_Advertiser_Name);
		helper.highLightElement(driver, Input_SearchBy_Advertiser_Name);
		Input_SearchBy_Advertiser_Name.sendKeys("Prime");

		helper.waitFor(Input_Advirtiser_Keyword);
		helper.highLightElement(driver, Input_Advirtiser_Keyword);
		Input_Advirtiser_Keyword.sendKeys("Prime", Keys.ENTER);
		helper.waitFor(Result);
		helper.waitFor(Result, 30);
		// Thread.sleep(8000);

		List<WebElement> Prime = driver.findElements(By.cssSelector(".card-body"));
		int Pr = Prime.size();
		System.out.println(Pr);
		Reporter.log(
				"<B><font color = 'orange'> Step7 -</font> Total Ad Results for the Search term 'Prime' is :" + Pr);

		helper.waitFor(Clear_Filters);
		helper.highLightElement(driver, Clear_Filters);
		helper.jsCLick(Clear_Filters);

		// Filter with Keyword

		helper.waitFor(DropDown_Toggel_Button);
		helper.highLightElement(driver, DropDown_Toggel_Button);
		helper.jsCLick(DropDown_Toggel_Button);

		helper.waitFor(Dropdown_item_Keyword);
		helper.highLightElement(driver, Dropdown_item_Keyword);
		helper.jsCLick(Dropdown_item_Keyword);

		helper.waitFor(Input_Search_By_Keyword);
		helper.highLightElement(driver, Input_Search_By_Keyword);
		Input_Search_By_Keyword.sendKeys("virat", Keys.ENTER);
		helper.waitFor(Result, 30);

		List<WebElement> Viratproducts = driver.findElements(By.cssSelector(".card-body"));
		int viratKohliProducts = Viratproducts.size();
		System.out.println(viratKohliProducts);
		Reporter.log("<B><font color = 'orange'> Step8 -</font> Total Ad Results for the Search term 'Virat kohli' is :"
				+ viratKohliProducts);

		helper.waitFor(Clear_Filters);
		helper.highLightElement(driver, Clear_Filters);
		helper.jsCLick(Clear_Filters);
		Thread.sleep(5000);

		// Filter with Keyword

		helper.waitFor(DropDown_Toggel_Button);
		helper.highLightElement(driver, DropDown_Toggel_Button);
		helper.jsCLick(DropDown_Toggel_Button);

		helper.waitFor(Dropdown_item_Keyword);
		helper.highLightElement(driver, Dropdown_item_Keyword);
		helper.jsCLick(Dropdown_item_Keyword);

		helper.waitFor(Input_Search_By_Keyword);
		helper.highLightElement(driver, Input_Search_By_Keyword);
		Input_Search_By_Keyword.clear();
		Input_Search_By_Keyword.sendKeys("covid", Keys.ENTER);
		helper.waitFor(Result, 30);

		List<WebElement> covid = driver.findElements(By.cssSelector(".card-body"));
		int cov = covid.size();
		System.out.println(covid);
		Reporter.log(
				"<B><font color = 'orange'> Step9 -</font> Total Ad Results for the Search term 'covid' is :" + cov);

		helper.waitFor(Clear_Filters);
		helper.highLightElement(driver, Clear_Filters);
		helper.jsCLick(Clear_Filters);

		// Filter with Keyword

		helper.waitFor(DropDown_Toggel_Button);
		helper.highLightElement(driver, DropDown_Toggel_Button);
		helper.jsCLick(DropDown_Toggel_Button);

		helper.waitFor(Dropdown_item_Keyword);
		helper.highLightElement(driver, Dropdown_item_Keyword);
		helper.jsCLick(Dropdown_item_Keyword);

		helper.waitFor(Input_Search_By_Keyword);
		helper.highLightElement(driver, Input_Search_By_Keyword);
		Input_Search_By_Keyword.clear();
		Input_Search_By_Keyword.sendKeys("Blog", Keys.ENTER);
		helper.waitFor(Result, 30);

		List<WebElement> Blog = driver.findElements(By.cssSelector(".card-body"));
		int Blo = Blog.size();
		System.out.println(Blog);
		Reporter.log(
				"<B><font color = 'orange'> Step10 -</font> Total Ad Results for the Search term 'Blog' is :" + Blo);

		helper.waitFor(Clear_Filters);
		helper.highLightElement(driver, Clear_Filters);
		helper.jsCLick(Clear_Filters);

		// Filter with Keyword

		helper.waitFor(DropDown_Toggel_Button);
		helper.highLightElement(driver, DropDown_Toggel_Button);
		helper.jsCLick(DropDown_Toggel_Button);

		helper.waitFor(Dropdown_item_Keyword);
		helper.highLightElement(driver, Dropdown_item_Keyword);
		helper.jsCLick(Dropdown_item_Keyword);

		helper.waitFor(Input_Search_By_Keyword);
		helper.highLightElement(driver, Input_Search_By_Keyword);
		Input_Search_By_Keyword.clear();
		Input_Search_By_Keyword.sendKeys("Shoes", Keys.ENTER);
		helper.waitFor(Result, 30);

		List<WebElement> Shoes = driver.findElements(By.cssSelector(".card-body"));
		int Sh = Shoes.size();
		System.out.println(Sh);
		Reporter.log(
				"<B><font color = 'orange'> Step11 -</font> Total Ad Results for the Search term 'Shoes' is :" + Sh);

		helper.waitFor(Clear_Filters);
		helper.highLightElement(driver, Clear_Filters);
		helper.jsCLick(Clear_Filters);

		// Filter with Keyword

		helper.waitFor(DropDown_Toggel_Button);
		helper.highLightElement(driver, DropDown_Toggel_Button);
		helper.jsCLick(DropDown_Toggel_Button);

		helper.waitFor(Dropdown_item_Keyword);
		helper.highLightElement(driver, Dropdown_item_Keyword);
		helper.jsCLick(Dropdown_item_Keyword);

		helper.waitFor(Input_Search_By_Keyword);
		helper.highLightElement(driver, Input_Search_By_Keyword);
		Input_Search_By_Keyword.clear();
		Input_Search_By_Keyword.sendKeys("Developer", Keys.ENTER);
		helper.waitFor(Result, 30);

		List<WebElement> Developer = driver.findElements(By.cssSelector(".card-body"));
		int De = Developer.size();
		System.out.println(De);
		Reporter.log("<B><font color = 'orange'> Step12 -</font> Total Ad Results for the Search term 'Developer' is :"
				+ De);

		helper.waitFor(Clear_Filters);
		helper.highLightElement(driver, Clear_Filters);
		helper.jsCLick(Clear_Filters);

	}

	public void Pushad_Search() throws InterruptedException {

		Reporter.log("<B><font color = 'orange'> Step1 -</font> Logged into PowerAdSpy Application");
		String Page_titel = driver.getTitle();
		System.out.println(Page_titel);
		Reporter.log("<B><font color = 'orange'> Step2 -</font> I am on the page :" + Page_titel);

		helper.waitForPageToLoad();
		helper.waitFor(Logo);
		helper.highLightElement(driver, Logo);
		Assert.assertTrue(Logo.isDisplayed(), "Power Ad Spy Logo is Dispalyed");
		Reporter.log("<B><font color = 'orange'> Step3 -</font> Power Ad Spy Logo is Displayed");

		helper.waitFor(Push);
		helper.highLightElement(driver, Push);
		Push.click();
		Assert.assertTrue(Push.isDisplayed(), "Clicked on Push Ads ");
		Reporter.log("<B><font color = 'orange'> Step4 -</font> Clicked On Push Icon");
		helper.waitForPageToLoad();

		String Page12 = driver.getTitle();
		System.out.println(Page12);
		Reporter.log("<B><font color = 'orange'> Step5 -</font> I am on the page :" + Page12);

		// Filter By Domain Name

		helper.waitFor(DropDown_Toggel_Button);
		helper.highLightElement(driver, DropDown_Toggel_Button);
		helper.jsCLick(DropDown_Toggel_Button);

		helper.waitFor(Dropdown_item_Domain);
		helper.highLightElement(driver, Dropdown_item_Domain);
		helper.jsCLick(Dropdown_item_Domain);

		helper.waitFor(Input_SearchBy_DomainName);
		helper.highLightElement(driver, Input_SearchBy_DomainName);
		Input_SearchBy_DomainName.sendKeys("Food", Keys.ENTER);
		helper.waitFor(Result);
		Thread.sleep(8000);

		List<WebElement> Food = driver.findElements(By.cssSelector(".card-body"));
		int Fo = Food.size();
		System.out.println(Fo);
		Reporter.log("<B><font color = 'orange'> Step6 -</font> Total Ad Results for the Search term 'Food' is :" + Fo);

		helper.waitFor(Clear_Filters);
		helper.highLightElement(driver, Clear_Filters);
		helper.jsCLick(Clear_Filters);

		// Filter By Advirtiser

		helper.waitFor(DropDown_Toggel_Button);
		helper.highLightElement(driver, DropDown_Toggel_Button);
		helper.jsCLick(DropDown_Toggel_Button);

		helper.waitFor(Dropdown_item_Advertiser);
		helper.highLightElement(driver, Dropdown_item_Advertiser);
		helper.jsCLick(Dropdown_item_Advertiser);

		helper.waitFor(Input_SearchBy_Advertiser_Name);
		helper.highLightElement(driver, Input_SearchBy_Advertiser_Name);
		Input_SearchBy_Advertiser_Name.sendKeys("Media");

		helper.waitFor(Input_Advirtiser_Keyword);
		helper.highLightElement(driver, Input_Advirtiser_Keyword);
		Input_Advirtiser_Keyword.sendKeys("Media", Keys.ENTER);
		helper.waitFor(Result);
		helper.waitFor(Result, 30);
		// Thread.sleep(8000);

		List<WebElement> Media = driver.findElements(By.cssSelector(".card-body"));
		int Me = Media.size();
		System.out.println(Me);
		Reporter.log(
				"<B><font color = 'orange'> Step7 -</font> Total Ad Results for the Search term 'Media' is :" + Me);

		helper.waitFor(Clear_Filters);
		helper.highLightElement(driver, Clear_Filters);
		helper.jsCLick(Clear_Filters);

		// Filter with Keyword

		helper.waitFor(DropDown_Toggel_Button);
		helper.highLightElement(driver, DropDown_Toggel_Button);
		helper.jsCLick(DropDown_Toggel_Button);

		helper.waitFor(Dropdown_item_Keyword);
		helper.highLightElement(driver, Dropdown_item_Keyword);
		helper.jsCLick(Dropdown_item_Keyword);

		helper.waitFor(Input_Search_By_Keyword);
		helper.highLightElement(driver, Input_Search_By_Keyword);
		Input_Search_By_Keyword.sendKeys("virat", Keys.ENTER);
		helper.waitFor(Result, 30);

		List<WebElement> Viratproducts = driver.findElements(By.cssSelector(".card-body"));
		int viratKohliProducts = Viratproducts.size();
		System.out.println(viratKohliProducts);
		Reporter.log("<B><font color = 'orange'> Step8 -</font> Total Ad Results for the Search term 'Virat kohli' is :"
				+ viratKohliProducts);

		helper.waitFor(Clear_Filters);
		helper.highLightElement(driver, Clear_Filters);
		helper.jsCLick(Clear_Filters);
		Thread.sleep(5000);

		// Filter with Keyword

		helper.waitFor(DropDown_Toggel_Button);
		helper.highLightElement(driver, DropDown_Toggel_Button);
		helper.jsCLick(DropDown_Toggel_Button);

		helper.waitFor(Dropdown_item_Keyword);
		helper.highLightElement(driver, Dropdown_item_Keyword);
		helper.jsCLick(Dropdown_item_Keyword);

		helper.waitFor(Input_Search_By_Keyword);
		helper.highLightElement(driver, Input_Search_By_Keyword);
		Input_Search_By_Keyword.clear();
		Input_Search_By_Keyword.sendKeys("covid", Keys.ENTER);
		helper.waitFor(Result, 30);

		List<WebElement> covid = driver.findElements(By.cssSelector(".card-body"));
		int cov = covid.size();
		System.out.println(covid);
		Reporter.log(
				"<B><font color = 'orange'> Step9 -</font> Total Ad Results for the Search term 'covid' is :" + cov);

		helper.waitFor(Clear_Filters);
		helper.highLightElement(driver, Clear_Filters);
		helper.jsCLick(Clear_Filters);

		// Filter with Keyword

		helper.waitFor(DropDown_Toggel_Button);
		helper.highLightElement(driver, DropDown_Toggel_Button);
		helper.jsCLick(DropDown_Toggel_Button);

		helper.waitFor(Dropdown_item_Keyword);
		helper.highLightElement(driver, Dropdown_item_Keyword);
		helper.jsCLick(Dropdown_item_Keyword);

		helper.waitFor(Input_Search_By_Keyword);
		helper.highLightElement(driver, Input_Search_By_Keyword);
		Input_Search_By_Keyword.clear();
		Input_Search_By_Keyword.sendKeys("Blog", Keys.ENTER);
		helper.waitFor(Result, 30);

		List<WebElement> Blog = driver.findElements(By.cssSelector(".card-body"));
		int Blo = Blog.size();
		System.out.println(Blog);
		Reporter.log(
				"<B><font color = 'orange'> Step10 -</font> Total Ad Results for the Search term 'Blog' is :" + Blo);

		helper.waitFor(Clear_Filters);
		helper.highLightElement(driver, Clear_Filters);
		helper.jsCLick(Clear_Filters);

		// Filter with Keyword

		helper.waitFor(DropDown_Toggel_Button);
		helper.highLightElement(driver, DropDown_Toggel_Button);
		helper.jsCLick(DropDown_Toggel_Button);

		helper.waitFor(Dropdown_item_Keyword);
		helper.highLightElement(driver, Dropdown_item_Keyword);
		helper.jsCLick(Dropdown_item_Keyword);

		helper.waitFor(Input_Search_By_Keyword);
		helper.highLightElement(driver, Input_Search_By_Keyword);
		Input_Search_By_Keyword.clear();
		Input_Search_By_Keyword.sendKeys("Shoes", Keys.ENTER);
		helper.waitFor(Result, 30);

		List<WebElement> Shoes = driver.findElements(By.cssSelector(".card-body"));
		int Sh = Shoes.size();
		System.out.println(Sh);
		Reporter.log(
				"<B><font color = 'orange'> Step11 -</font> Total Ad Results for the Search term 'Shoes' is :" + Sh);

		helper.waitFor(Clear_Filters);
		helper.highLightElement(driver, Clear_Filters);
		helper.jsCLick(Clear_Filters);

		// Filter with Keyword

		helper.waitFor(DropDown_Toggel_Button);
		helper.highLightElement(driver, DropDown_Toggel_Button);
		helper.jsCLick(DropDown_Toggel_Button);

		helper.waitFor(Dropdown_item_Keyword);
		helper.highLightElement(driver, Dropdown_item_Keyword);
		helper.jsCLick(Dropdown_item_Keyword);

		helper.waitFor(Input_Search_By_Keyword);
		helper.highLightElement(driver, Input_Search_By_Keyword);
		Input_Search_By_Keyword.clear();
		Input_Search_By_Keyword.sendKeys("Developer", Keys.ENTER);
		helper.waitFor(Result, 30);

		List<WebElement> Developer = driver.findElements(By.cssSelector(".card-body"));
		int De = Developer.size();
		System.out.println(De);
		Reporter.log("<B><font color = 'orange'> Step12 -</font> Total Ad Results for the Search term 'Developer' is :"
				+ De);

		helper.waitFor(Clear_Filters);
		helper.highLightElement(driver, Clear_Filters);
		helper.jsCLick(Clear_Filters);

	}

}
