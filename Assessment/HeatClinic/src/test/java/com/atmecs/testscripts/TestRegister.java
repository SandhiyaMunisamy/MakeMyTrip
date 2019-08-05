package com.atmecs.testscripts;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.atmecs.helper.LogReportFile;
import com.atmecs.helper.PerformMethodOperation;

import com.atmecs.testsuite.TestBase;

/**
 * 
 * @author Sandhiya.Munisamy
 *
 */
public class TestRegister extends TestBase {

	WebDriver driver;
	CommonUtilities util = new CommonUtilities();
	LogReportFile log = new LogReportFile();

	/**
	 * getting browser,url and window operations from properties file
	 */
	@BeforeMethod
	public void setUp() {
		this.driver = invokeBrowser();
		String baseUrl = configProps.getProperty("applicationurl");
		driver.get(baseUrl);
		this.driver = windowOperation();

	}

	/**
	 * 
	 * @param reg Register the data using data provider from the excel
	 */
	@Test(dataProvider = "registrationData", dataProviderClass = ExcelDataProvider.class)
	public void verifyRegistrationPage(RegistrationData reg) {

		PerformMethodOperation.ClickElement(driver, OR.getProperty("Register_xpath"));
		PerformMethodOperation.SendElement(driver, OR.getProperty("Email_id"), reg.Email);
		PerformMethodOperation.SendElement(driver, OR.getProperty("FirstName_id"), reg.FirstName);
		PerformMethodOperation.SendElement(driver, OR.getProperty("LastName_id"), reg.LastName);
		PerformMethodOperation.SendElement(driver, OR.getProperty("Password_id"), reg.Password);
		PerformMethodOperation.SendElement(driver, OR.getProperty("ConfirmPassword_id"), reg.ConfirmPassword);
		PerformMethodOperation.ClickElement(driver, OR.getProperty("SubmitRegister_xpath"));
		log.info("Registered Succesfully" + driver.getTitle());
		util.verifyassert(driver.getCurrentUrl(), "https://10.10.10.232:8443/register");

	}

	/**
	 * quit the browser
	 */
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}

}
