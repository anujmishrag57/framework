package com.learnautomation.selenium;

import java.io.File;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.Test;

public class DemoForMaven {
	
	WebDriver driver;
	public void beforeTest()
	{
		driver = new ChromeDriver();
	}
	
	@Test
	public void testHello()
	{
		System.out.println("Welcome To Maven World");
		Assert.assertEquals("Ram", "RAMA","Strings didn't match");
	}
	
	public void AfterTest(ITestResult result)
	{
		if (ITestResult.FAILURE==result.getStatus()) {
			
			try {
				
				TakesScreenshot ts = (TakesScreenshot) driver;
				File src=ts.getScreenshotAs(OutputType.FILE);
				 
			
			
				
			} catch (Exception e) {
				// TODO: handle exception
			}
			
			
		}
		
	}
	

}
