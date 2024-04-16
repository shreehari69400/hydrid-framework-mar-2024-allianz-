package com.allianz.test;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.allianz.base.AutomationWrapper;

public class LoginUITest extends AutomationWrapper {
	
	@Test
	public void titleTest() {
		
		String actualTitle=driver.getTitle();
		Assert.assertEquals(actualTitle, "OrangeHRM");
		
	}
	
	@Test 
	public void applicationDescriptionTest() {
		
		
		
		String actualText=driver.findElement(By.xpath("//p[contains(normalize-space(),'OS')]")).getText();
		Assert.assertEquals(actualText, "OrangeHRM OS 5.6.1");
		
		
		
		
		
	}
	}

