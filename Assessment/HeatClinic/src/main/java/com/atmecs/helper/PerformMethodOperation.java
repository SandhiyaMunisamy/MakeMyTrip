package com.atmecs.helper;

import org.openqa.selenium.WebDriver;

import com.atmecs.utils.UtilitiesMethods;

public class PerformMethodOperation {

	public static void ClickElement(WebDriver driver, final String xpath) {
		UtilitiesMethods.ignoreClickInterceptAndClickOnElement(driver, xpath);
	}

	public static void SendElement(WebDriver driver, final String id, final String name) {
		UtilitiesMethods.ignoreClickInterceptAndSendOnElement(driver, id, name);
	}

	public static void SendElementName(WebDriver driver, final String name, final String value) {
		UtilitiesMethods.ignoreNameInterceptAndSendOnElement(driver, name, value);
	}

}
