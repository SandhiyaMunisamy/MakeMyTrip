package com.atmecs.testscripts;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.atmecs.helper.RegistrationData;
import com.atmecs.logger.LogReportFile;
import com.atmecs.pages.ItemRemoveFromCart;
import com.atmecs.pages.UserLogin;
import com.atmecs.testsuite.TestBase;
import com.atmecs.utils.ExcelDataProvider;

/**
 * 
 * @author Sandhiya.Munisamy
 *
 */

public class TestRemoveFromCart extends TestBase {
	LogReportFile log = new LogReportFile();
	ItemRemoveFromCart removeItem = new ItemRemoveFromCart();

	@BeforeMethod
	public void setUp() {
		
		this.driver = invokeBrowser();

	}

	@Test(dataProvider = "registrationData", dataProviderClass = ExcelDataProvider.class)
	public void verifyAddToCart(RegistrationData reg) {
		log.info("Started Test Scenario 4:Remove From cart");
		UserLogin.loginData(reg, driver);
		log.info("Login for Remove from cart successful");
		log.info("Processing Remove from cart");
		removeItem.removeItem(driver);
		log.info("Item Removed Successfully");
	}

	

	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
}