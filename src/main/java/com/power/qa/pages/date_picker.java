package com.power.qa.pages;

import com.power.qa.util.*;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import org.testng.Reporter;

import com.power.qa.base.TestBase;

public class date_picker extends BasePage{
	
	Helpers helper = new Helpers();

	public date_picker(WebDriver driver) throws InterruptedException {
		super(TestBase.getDriver());
	}
	
	@FindBy(xpath="//button[text()='Filters']")
	WebElement filterDropdown;
	
	@FindBy(xpath="//div[@class='likes_comments_col']/span/span")
	WebElement like;
	
	@FindBy(xpath="(//span[@data-bs-original-title='Likes']/span)[1]")
	WebElement Likes1stAd;
	
	@FindBy(xpath="(//span[@data-bs-original-title='Likes']/span)[2]")
	WebElement Likes2ndAd;
	
	@FindBy(xpath="(//span[@data-bs-original-title='Likes']/span)[3]")
	WebElement Likes3rdAd;
	
	@FindBy(xpath="(//span[@data-bs-original-title='Likes']/span[4]")
	WebElement Likes4thAd;
	
	@FindBy(xpath="(//span[@data-bs-original-title='Likes']/span)[5]")
	WebElement Likes5thAd;
	
	@FindBy(xpath="(//span[@data-bs-original-title='Likes']/span)[6]")
	WebElement Likes6thAd;
	
	@FindBy(xpath="//span[@id='sort_by_count']")
	WebElement sortByDropdown;
	
	@FindBy(xpath="//a[text()='Likes']")
	WebElement likesRange;
	
	@FindBy(xpath="//input[@id='lower_like']")
	WebElement minRange;
	
	@FindBy(xpath="//input[@id='higher_like']")
	WebElement maxRange;
	
	@FindBy(xpath="//div[@id='search-ads']")
	WebElement searchBar;
	
	@FindBy(xpath="//i[@class='fa fa-caret-down']/../i[@class='fas fa-globe language_icon']")
	WebElement languageDropdown;
	
	@FindBy(xpath="//a[text()='English']")
	WebElement englishLanguage;
	
	public void likesCount() throws InterruptedException {
		
		helper.waitFor(languageDropdown);
		helper.highLightElement(driver, languageDropdown);
		helper.jsCLick(languageDropdown);
		
		helper.waitFor(englishLanguage);
		helper.highLightElement(driver, englishLanguage);
		helper.jsCLick(englishLanguage);
		
		
		helper.waitFor(sortByDropdown);
		helper.highLightElement(driver, sortByDropdown);
		helper.jsCLick(sortByDropdown);
		
		helper.waitFor(likesRange);
		helper.highLightElement(driver, likesRange);
		helper.jsCLick(likesRange);
		
		helper.waitFor(minRange);
		helper.highLightElement(driver, minRange);
		//helper.jsCLick(minRange);
		minRange.sendKeys("100");
		
		helper.waitFor(maxRange);
		helper.highLightElement(driver, maxRange);
	//	helper.jsCLick(maxRange);
		maxRange.sendKeys("200");
		
		helper.waitForPageToLoad();
		helper.waitFor(searchBar);
		helper.highLightElement(driver, searchBar);
		searchBar.click();
		//helper.jsCLick(searchBar);
	//	maxRange.sendKeys("200");

//		List<WebElement> totalLikes = driver.findElements(By.xpath("//div[@class='likes_comments_col']/span/span"));
//		for (WebElement ele : totalLikes) {
//			String likee = ele.getTagName();
//			System.out.println("likee : " + likee);
//		}
//		int totalLikes1 = totalLikes.size();
//		System.out.println(totalLikes1);
//		Reporter.log("<B><font color = 'orange'> Step6 -</font> Total Ad Results for the  Keyword 'Totallikes' is :"
//				+ totalLikes1);
//		
		
		
		Thread.sleep(5000);
		
		//for(int i=0;i<3;i++) {
//		List<WebElement> totalLikes11 = driver.findElements(By.xpath("//div[@class='likes_comments_col']/span/span"));
////		System.out.println("totalnumberofAdds : " + totalLikes.size());
//		for (WebElement ele : totalLikes11) {
//			System.out.println(ele.getText());
////			System.out.println( ele.getSize());
////			String actualText = ele.getText();
////			System.out.println("totalLikesAds : " + actualText);
//			break;
//		}	
		//helper.Scrollintoview(Likes2ndAd);
			
//		
//		for (WebElement ele : totalLikes) {
////			String actualText = ele.getText();
////			System.out.println("totalLikesAds : " + actualText);
////		}
		
//		
//		helper.waitForPageToLoad();
//		helper.waitFor(like);
//		helper.highLightElement(driver, like);
//		String likesCount = like.getText();
//		System.out.println("likesCount : " + likesCount);
//		int a=100;
//		int b=200;
//		int i=Integer.parseInt(likesCount);  
//		for(int j=100;j<=200;j++) {
//			
//			//if(likesCount.equals("200") || likesCount.equals("100")) {
//				if (i>=a || i<=b) {
//					System.out.println("true");
//				}
				
//				helper.waitForPageToLoad();
//				helper.waitFor(Likes2ndAd);
//				helper.highLightElement(driver, Likes2ndAd);
//				String likesCount1 = Likes2ndAd.getText();
//				System.out.println("likesCount : " + likesCount1);
//				int a=100;
//				int b=200;
//				int i=Integer.parseInt(likesCount1);  
//				for(int i=100;i<=200;i++) {
//					if(likesCount.equals("200") || likesCount.equals("100")) {
//						if (i>=a || i<=b) {
//							System.out.println("true");
//						
						
						
		}}

		
	
	
	
	    
	  



