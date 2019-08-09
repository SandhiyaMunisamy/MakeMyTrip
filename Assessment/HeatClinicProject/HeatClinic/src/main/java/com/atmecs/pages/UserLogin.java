package com.atmecs.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.atmecs.helper.CommonUtilities;
import com.atmecs.helper.PerformMethodOperation;
import com.atmecs.helper.RegistrationData;
import com.atmecs.testsuite.TestBase;
/**
 * @category Login User Account
 * @author Sandhiya.Munisamy
 *
 */
public class UserLogin extends TestBase{
	static CommonUtilities login = new CommonUtilities();
	public static void loginData(RegistrationData reg, WebDriver driver) {
		
		PerformMethodOperation.ClickElement(driver, OR.getProperty("loc_btn_login"));
		PerformMethodOperation.SendElementName(driver, OR.getProperty("loc_txt_lusername"), reg.Email);
		PerformMethodOperation.SendElementName(driver, OR.getProperty("loc_txt_lpassword"), reg.Password);
		PerformMethodOperation.ClickElement(driver, OR.getProperty("loc_btn_submit_login"));
		login.verifyassert(driver.getCurrentUrl(), "loc_expected_loginurl", "Url verified");
		/**
		//Identify all the elements on web page
	       List<WebElement> allElements = driver.findElements(By.xpath("//*"));
	       
	       //Count the total all element on web page
	       int linkListCount = allElements.size();
	     
	       //Print the total count of all element on webpage 
	       System.out.println("Total Number of All Element on webpage = "  + linkListCount);    
	       
	       //Print all the Tag Name and Text Name on webpage
	       int i = 0;
	        for (WebElement Element : allElements) {
	            i = i +1;
	            System.out.println(Element.getTagName());
	            System.out.println(Element.getText());
	        }*/
		
		
		/**
		 * displays the Buy now  count
		 */
		List<WebElement> xpath = driver.findElements(By.xpath(OR.getProperty("loc_btn_buynow_all")));
		int xpathCount = xpath.size();
		System.out.println("Number of Buynow in the login page: " + xpathCount);
	}

}



