package com.atmecs.testscripts;


import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.atmecs.helper.RegistrationData;
import com.atmecs.logger.LogReportFile;
import com.atmecs.pages.UserRegister;
import com.atmecs.testsuite.TestBase;
import com.atmecs.utils.ExcelDataProvider;

/**
 * {@link https://10.10.10.232:8443/register}
 * @category User Account Registration
 * @author Sandhiya.Munisamy
 *
 */
public class TestRegister extends TestBase {

	UserRegister registerAccount = new UserRegister();
	LogReportFile log = new LogReportFile();

	/**
	 * getting browser,url and window operations from properties file
	 */
	@BeforeMethod
	public void setUp() {
		this.driver = invokeBrowser();
		
	}

	/**
	 * Verify the user is navigated to the Account registration.
	 * Validate all fields present in the Registration page.
	 * Check if the user is entering Valid user data.
	 * Click on submit button and check whether the page is successfully registered or not.
	 * Check if the user is Logged in and navigated to the Heat Clinic Home page if registered successfully.
	 * 
	 * @param reg 
	 * 
	 */
	
	//Register the data using data provider from the excel
	@Test(dataProvider = "registrationData", dataProviderClass = ExcelDataProvider.class)
	public void verifyRegistrationPage(RegistrationData reg) {
        log.info("Started Test Scenario 1:Registration");
        registerAccount.registerData(reg, driver);  //User account registration
		log.info("User Registered Succesfully ");

	}

	/**
	 * quits the browser
	 */
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}

}
