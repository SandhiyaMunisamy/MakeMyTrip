package com.atmecs.pages;

import static org.junit.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.atmecs.helper.CommonUtilities;
import com.atmecs.helper.PerformMethodOperation;
import com.atmecs.logger.LogReportFile;
import com.atmecs.testsuite.TestBase;

public class ItemRemoveFromCart extends TestBase {
	LogReportFile log = new LogReportFile();
	CommonUtilities removeFromCart = new CommonUtilities();

	/**
	 * Check if the user is logged to the account.
	 * Click on merchandise  menu and buy a item.
	 * select the options with color and size
	 * Remove item from the cart.
	 * @param driver 
	 */

	public void dropDownMerchandise(WebDriver driver) {
		removeFromCart.verifyassert(driver.getCurrentUrl(), "loc_expected_removefromcarturl", "Url verified");
		WebElement ClickMerchandise = driver.findElement(By.xpath(OR.getProperty("Click_merchandise"))); // Click
																											// merchandise
		String quantities = ClickMerchandise.getText();
		System.out.println("Text of Page:" + quantities);
		Actions moveMouseOperation = new Actions(driver);
		moveMouseOperation.moveToElement(ClickMerchandise).perform();
		moveMouseOperation.clickAndHold();
		PerformMethodOperation.ClickElement(driver, OR.getProperty("DropDownMen")); // mouse over to men's shirt.
		driver.navigate().back();
		ClickMerchandise = driver.findElement(By.xpath(OR.getProperty("Click_merchandise")));
		moveMouseOperation.moveToElement(ClickMerchandise).perform();
		log.info("Clicked Merchandise");

	}
	
			
		
	/**
	 *
	 * @param driver
	 */
	public void buywomenShirt(WebDriver driver) {
		dropDownMerchandise(driver);
		PerformMethodOperation.ClickElement(driver, OR.getProperty("DropDownWomen")); // click on women's shirt
		PerformMethodOperation.ClickElement(driver, OR.getProperty("buyWomenShirt"));
		PerformMethodOperation.ClickElement(driver, OR.getProperty("ClickRed")); // select red color
		PerformMethodOperation.ClickElement(driver, OR.getProperty("ClickSmall")); // select small size
		PerformMethodOperation.ClickElement(driver, OR.getProperty("BuySelected"));
		log.info("Option selected");
		try {
			// Verify Correct Webpage is opened using click on TAB LINK
			assertTrue(driver.getPageSource().contains("The Heat Clinic Home"));

			log.info("Webpages are correctly opened");
		} catch (Throwable e) {
			log.info("Webpages are NOT correctly opened");
		}
	}

	public void removeItem(WebDriver driver) {
		buywomenShirt(driver);
		PerformMethodOperation.ClickElement(driver, OR.getProperty("selectCart")); // click on cart
		removeFromCart.verifyassert(driver.getCurrentUrl(), "loc_expected_removefromcarttitle", "Merchandise title");
		PerformMethodOperation.ClickElement(driver, OR.getProperty("RemoveSelected")); // remove selected item
		log.info("Removed item from cart");
	}

}
