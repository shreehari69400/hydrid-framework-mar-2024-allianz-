package com.allianz.test;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.allianz.base.AutomationWrapper;

public class AddEmployeeTest extends AutomationWrapper {
	@Test
	public void uploadInvalidPictureTest ()
	{
		/*
		 * File file=new
		 * File("src/test/resources/istockphoto-157373207-1024x1024.jpeg"); String
		 * path=file.getAbsolutePath();
		 */
		
		
		driver.findElement(By.name("username")).sendKeys("Admin");
		driver.findElement(By.name("password")).sendKeys("admin123");
		driver.findElement(By.xpath("//button[@class='oxd-button oxd-button--medium oxd-button--main orangehrm-login-button']")).click();
		
		driver.findElement(By.xpath("(//span[@class='oxd-text oxd-text--span oxd-main-menu-item--name'])[2]")).click();
		driver.findElement(By.linkText("Add Employee")).click();
		//driver.findElement(By.xpath("//button[@class='oxd-icon-button oxd-icon-button--solid-main employee-image-action']")).click();
		
	driver.findElement(By.xpath("//input[@type='file']")).sendKeys("C:\\Users\\Administrator\\Downloads\\Balanotes.txt");

	String actualError=driver.findElement(By.xpath("//span[contains(normalize-space(),'File type')]")).getText();
	Assert.assertTrue(actualError.contains("File type not"));
		
		//click on PIMmenu
	//click on add employee
	//upload the file 
	//validate the eeor 

}
}
