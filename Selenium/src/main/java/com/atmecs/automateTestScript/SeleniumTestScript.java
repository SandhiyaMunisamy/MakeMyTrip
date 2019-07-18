package com.atmecs.automateTestScript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumTestScript {
	public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sandhiya.Munisamy\\Documents\\Java Programs\\Selenium Drivers\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();  
	driver.get("http://www.gmail.com/");
	driver.manage().window().maximize();
	driver.findElement(By.id("identifierId")).sendKeys("sandhiya.munisamy@atmecs.com");
	//Thread.sleep(2000);
	driver.findElement(By.className("CwaK9")).click();
	//Thread.sleep(2000);
	String actualTitle= driver.getTitle();
	String expectedTitle="gmail";
	driver.close();
	if(actualTitle.equalsIgnoreCase(expectedTitle))
	{
		System.out.println("Test successful");
	}
	else
	{
		System.out.println("Test failure");
	}
	}

}
