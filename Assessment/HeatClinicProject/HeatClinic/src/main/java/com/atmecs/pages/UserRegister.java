package com.atmecs.pages;

import org.openqa.selenium.WebDriver;

import com.atmecs.helper.CommonUtilities;
import com.atmecs.helper.PerformMethodOperation;
import com.atmecs.helper.RegistrationData;
import com.atmecs.testsuite.TestBase;

/**
 *
 * @category Register User account
 * @author Sandhiya.Munisamy
 *
 */
public class UserRegister extends TestBase {
	CommonUtilities register = new CommonUtilities();

	public void registerData(RegistrationData reg, WebDriver driver) {
		PerformMethodOperation.ClickElement(driver, OR.getProperty("loc_btn_register"));
		PerformMethodOperation.SendElement(driver, OR.getProperty("loc_txt_email"), reg.Email);
		PerformMethodOperation.SendElement(driver, OR.getProperty("loc_txt_firstname"), reg.FirstName);
		PerformMethodOperation.SendElement(driver, OR.getProperty("loc_txt_lastname"), reg.LastName);
		PerformMethodOperation.SendElement(driver, OR.getProperty("loc_txt_password"), reg.Password);
		PerformMethodOperation.SendElement(driver, OR.getProperty("loc_txt_confirmPassword"), reg.ConfirmPassword);
		PerformMethodOperation.ClickElement(driver, OR.getProperty("loc_btn_submit_register"));
		register.verifyassert(driver.getCurrentUrl(), "loc_expected_registerurl", "Url verified");

	}
}


