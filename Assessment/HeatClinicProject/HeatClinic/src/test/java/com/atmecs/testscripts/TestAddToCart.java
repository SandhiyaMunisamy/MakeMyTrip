package com.atmecs.testscripts;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.atmecs.helper.RegistrationData;
import com.atmecs.logger.LogReportFile;
import com.atmecs.pages.ItemAddToCart;
import com.atmecs.pages.UserLogin;
import com.atmecs.testsuite.TestBase;
import com.atmecs.utils.ExcelDataProvider;

/**
 * {@link http://10.10.10.232:8080/hot-sauces}
 * 
 * @author Sandhiya.Munisamy
 *
 */

public class TestAddToCart extends TestBase {

	ItemAddToCart UserAddToCart = new ItemAddToCart();
	LogReportFile log = new LogReportFile();

	@BeforeMethod
	public void setUp() {

		this.driver = invokeBrowser();

	}

	/**
	 * 
	 * Check if the user is logged in to the page with the valid user data.
	 * 
	 */

	@Test(dataProvider = "registrationData", dataProviderClass = ExcelDataProvider.class)
	public void verifyAddToCart(RegistrationData reg) {
		log.info("Started Test Scenario 3: Add To Cart");
		UserLogin.loginData(reg, driver); // User account login
		log.info("Login for Add to cart successful");
		log.info("Processing Add to cart");
		UserAddToCart.buyItem(driver); // Add item to cart by updating the quantity
		UserAddToCart.checkout(driver); // checkout process with billing and shipping details
		log.info("Added to Cart Successfully ");
	}

	

	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
}