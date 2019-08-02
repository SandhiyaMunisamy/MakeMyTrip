package com.atmecs.testscripts;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.atmecs.constants.CommonUtilities;
import com.atmecs.helper.PerformMethodOperation;

import com.atmecs.testsuite.TestBase;

/**
 * 
 * @author Sandhiya.Munisamy
 *
 */
public class TestLogin extends TestBase {
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

	/**
	 * 
	 * @param reg
	 */

	@Test(dataProvider = "registrationData", dataProviderClass = ExcelDataProvider.class)
	public void verifyLoginPage(RegistrationData reg) {
		PerformMethodOperation.ClickElement(driver, OR.getProperty("Login_xpath"));
		PerformMethodOperation.SendElementName(driver, OR.getProperty("Username_name"), reg.Email);
		PerformMethodOperation.SendElementName(driver, OR.getProperty("Password_name"), reg.Password);
		PerformMethodOperation.ClickElement(driver, OR.getProperty("SubmitLogin_xpath"));
		util.verifyassert(driver.getCurrentUrl(), "http://10.10.10.232:8080/");
		log.info("User LoggedIn Successfully");
		JavascriptExecutor js = (JavascriptExecutor)driver;  
	    js.executeScript("scrollBy(0, 4500)");  

	}

	@AfterMethod
	public void tearDown() {
		driver.quit();
	}

}
