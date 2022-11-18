package com.power.qa.pages;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.ITestNGListener;
import org.testng.Reporter;
import org.testng.annotations.Listeners;

import com.power.qa.base.TestBase;
import com.power.qa.util.Helpers;
@Listeners(ITestNGListener.class)

public class LoginPage  extends BasePage{
	
	Helpers helper=new Helpers();
	
	public LoginPage(WebDriver driver) throws InterruptedException {
		super(TestBase.getDriver());
	}
	
	
	//ELEMENTS ON LOGIN PAGE:
	@FindBy(xpath = "//input[@id='amember-login']")
	WebElement input_username;

	@FindBy(xpath = "//input[@id='amember-pass']")
	WebElement input_password;

	@FindBy(xpath = "//input[@value='Login']")
	WebElement Button_login;
	
	@FindBy(xpath="(//div[@class='recaptcha-checkbox-border'])[1]")
	WebElement cpatchaInputBox;
	
	@FindBy(xpath="//label[text()='I'm not a robot']")
	WebElement iAmNotRobotText;
	

	//driver.findElement(By.xpath("(//div[@class='recaptcha-checkbox-border'])[1]")).click();

	
	public void login(String un, String pwd) throws InterruptedException{
		
		try {
		      driver.switchTo().frame(0);
		      helper.highLightElement(driver, cpatchaInputBox);
		      cpatchaInputBox.click();
		      Reporter.log("<B><font color = 'blue'>Password .</font></B> Entered captchRobot");
		      Thread.sleep(1000);
		      driver.switchTo().defaultContent();
		      System.out.println("PowerAdSpy Site");
		      Reporter.log("<B><font color = 'blue'>Password .</font></B> PowerAdSpy Site");
		    } catch (Exception e) {
		      // TODO: handle exception
		      
		      System.out.println("Robot Capture is not present");
		      Reporter.log("<B><font color = 'blue'>Password .</font></B> Robot Capture is not present");
		      System.out.println("PowerAdSpy this is Dev Site");
		      Reporter.log("<B><font color = 'blue'>Password .</font></B> PowerAdSpy this is Dev Site");
		    }
		
		helper.highLightElement(driver, input_username);
		input_username.sendKeys(un);
		Reporter.log("<B><font color = 'blue'>Username .</font></B> Entered User ID");		
		
		helper.highLightElement(driver, input_password);
		input_password.sendKeys(pwd);
		Reporter.log("<B><font color = 'blue'>Password .</font></B> Entered Password");
		
		helper.highLightElement(driver, Button_login);
		Button_login.click();		
		Reporter.log("<B><font color = 'blue'>Sign In Button .</font></B> Clicked on Submit Button");
		
		
		
		Thread.sleep(3000);
	
		}
	}	