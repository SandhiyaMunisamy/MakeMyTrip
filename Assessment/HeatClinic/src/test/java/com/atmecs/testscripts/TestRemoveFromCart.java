package com.atmecs.testscripts;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.atmecs.constants.CommonUtilities;
import com.atmecs.testsuite.TestBase;

public class TestRemoveFromCart extends TestBase {
	WebDriver driver;
	CommonUtilities util = new CommonUtilities();

	@BeforeMethod
	public void setUp() {
		this.driver = invokeBrowser();
		String baseUrl = configProps.getProperty("applicationurl");
		driver.get(baseUrl);
		this.driver = windowOperation();

	}

	@Test
	public void verifyAddToCart() {

		util.verifyassert(driver.getCurrentUrl(), "http://10.10.10.232:8080/");
		util.dropDownMerchandise(driver);
		util.buywomenShirt(driver);
		util.verifyassert(driver.getTitle(), "Broadleaf Commerce Demo Store - Heat Clinic - Womens");
		util.removeItem(driver);

	}

	@AfterMethod
	public void tearDown() {
		driver.quit();
	}

}
