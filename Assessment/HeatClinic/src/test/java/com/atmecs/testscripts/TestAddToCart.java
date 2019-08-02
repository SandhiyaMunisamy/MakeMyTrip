package com.atmecs.testscripts;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.atmecs.constants.CommonUtilities;
import com.atmecs.testsuite.TestBase;

public class TestAddToCart extends TestBase {
	WebDriver driver;
	CommonUtilities util = new CommonUtilities();
	public static Logger log = Logger.getLogger(TestLogin.class);
	

	@BeforeMethod
	public void setUp() {
		this.driver = invokeBrowser();
		String baseUrl = configProps.getProperty("applicationurl");
		driver.get(baseUrl);
		this.driver = windowOperation();
		BasicConfigurator.configure();

	}

	@Test
	public void verifyAddToCart() {
		JavascriptExecutor js = (JavascriptExecutor)driver;  
	    js.executeScript("scrollBy(0, 9500)");  
		util.buyOption(driver);
		util.verifyassert(driver.getTitle(), "Broadleaf Commerce Demo Store - Heat Clinic - Hot Sauces");
		util.inCart(driver);
		util.addQuantity(driver);
		

	}

	 @AfterMethod
	public void tearDown() {
		driver.quit();
	}

}
