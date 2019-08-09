package com.atmecs.helper;

import org.openqa.selenium.WebDriver;

import com.atmecs.constants.UtilityMethods;

/**
 *
 * @author Sandhiya.Munisamy
 *
 */

public class PerformMethodOperation {
	/**
	 * ClickElement with xpath
	 * 
	 * @param driver
	 * @param xpath
	 */
	public static void ClickElement(WebDriver driver, final String xpath) {
		UtilityMethods.ignoreClickInterceptAndClickOnElement(driver, xpath);
	}

	/**
	 * SendElement with id and name
	 * 
	 * @param driver
	 * @param id
	 * @param name
	 */
	public static void SendElement(WebDriver driver, final String id, final String name) {
		UtilityMethods.ignoreClickInterceptAndSendOnElement(driver, id, name);
	}

	/**
	 * SendElement with name and value
	 * 
	 * @param driver
	 * @param name
	 * @param value
	 */
	public static void SendElementName(WebDriver driver, final String name, final String value) {
		UtilityMethods.ignoreNameInterceptAndSendOnElement(driver, name, value);
	}

}
