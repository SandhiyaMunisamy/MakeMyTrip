package com.atmecs.testscripts;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


import com.atmecs.helper.RegistrationData;
import com.atmecs.logger.LogReportFile;
import com.atmecs.pages.UserLogin;
import com.atmecs.testsuite.TestBase;
import com.atmecs.utils.ExcelDataProvider;

/**
 * {@link :https://10.10.10.232:8443/login}
 * 
 * @category User Account Login
 * @author Sandhiya.Munisamy
 *
 */
public class TestLogin extends TestBase {
	LogReportFile log = new LogReportFile();

	@BeforeMethod
	public void setUp() {
		this.driver = invokeBrowser();
	}

	/**
	 * Verify the user is navigated to the Login page. Validate each fields which
	 * successfully login to the Home page by entering valid registered user data
	 * Check if the user is logged in to the concerned page by displaying welcome
	 * with user name
	 * 
	 * @param reg
	 * 
	 */

	@Test(dataProvider = "registrationData", dataProviderClass = ExcelDataProvider.class)
	public void verifyLoginPage(RegistrationData reg) {
		log.info("Started Test Scenario 2:Login");
		UserLogin.loginData(reg, driver); // User account login
		log.info("Login Successful");
		

	}
//quits the browser
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}

}
