package com.atmecs.automateTestScript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GithubSignupAutomation {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sandhiya.Munisamy\\Documents\\Java Programs\\Selenium Drivers\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();  
		
		
		driver.get("https://github.com/");
		driver.manage().window().maximize();
		
		
		WebElement username=driver.findElement(By.id("user[login]"));
		WebElement email=driver.findElement(By.id("user[email]"));
		WebElement password=driver.findElement(By.xpath("//input[@id=\"user[password]\"]"));
		
		
		username.sendKeys("SandhiyaMunisamy20");
		Thread.sleep(2000);
		email.sendKeys("san.sandhiya.521@gmail.com");
		Thread.sleep(2000);
		password.sendKeys("Sandhiya@1234556");
		Thread.sleep(2000);
		System.out.println("Field is set");
		
		WebElement signup = driver.findElement(By.xpath("//button[@class=\"btn-mktg btn-primary-mktg btn-large-mktg f4 btn-block my-3\"]"));
		signup.click();
		System.out.println("Sign up done");	
		
		
		
		String actualTitle= driver.getTitle();
		String expectedTitle="github";
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
