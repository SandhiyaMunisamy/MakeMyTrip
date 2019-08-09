package com.atmecs.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import com.atmecs.helper.CommonUtilities;
import com.atmecs.helper.PerformMethodOperation;
import com.atmecs.logger.LogReportFile;
import com.atmecs.testsuite.TestBase;

/**
 * 
 * @author Sandhiya.Munisamy
 *
 */
public class ItemAddToCart extends TestBase {

	LogReportFile log = new LogReportFile();
	CommonUtilities addToCart = new CommonUtilities();

	/**
	 * Check if the user is logged to the account.
	 * Click on hot sauces menu and buy a item.
	 * Click cart and check if the item is added to cart.
	 * Update quantity and close the cart.
	 * 
	 * @param driver
	 */
	

	
	public void buyItem(WebDriver driver) {
		PerformMethodOperation.ClickElement(driver, OR.getProperty("loc_btn_hotsauces")); // Click hot sauces menu
		PerformMethodOperation.ClickElement(driver, OR.getProperty("loc_btn_buynow")); // Buy green ghost item
		log.info("Clicked on Buy now");
		boolean cart = driver.findElement(By.xpath(OR.getProperty("loc_btn_incart"))).isDisplayed();
		Assert.assertTrue(cart);
		PerformMethodOperation.ClickElement(driver, OR.getProperty("loc_btn_incart")); // Click in cart
		log.info("Clicked incart");

		WebElement quantity = driver.findElement(By.xpath(OR.getProperty("loc_btn_quantity"))); // quantity

		quantity.clear(); // Clear quantity
		quantity.sendKeys(OR.getProperty("loc_txt_updatequantity")); // update quantity
		/*
		 * for(int i=0;i<2;i++) { quantity.sendKeys(Keys.ARROW_UP); }
		 */
		PerformMethodOperation.ClickElement(driver, OR.getProperty("loc_btn_update_quantity"));
		log.info("quantity updated");
		PerformMethodOperation.ClickElement(driver, OR.getProperty("loc_btn_close")); // close the cart

		//addToCart.verifyassert(driver.getCurrentUrl(), "loc_expected_addtocarturl", "Title verified");

	}


	
	/**
	 * Check if the user is logged to the account.
	 * Click on hot sauces menu and buy the item.
	 * Click on cart and checkout option.
	 * Enter the billing and shipping details.
	 * Enter the payment details.
	 * @param driver
	 */

	public void checkout(WebDriver driver) {
		PerformMethodOperation.ClickElement(driver, OR.getProperty("loc_btn_hotsauces")); //click hot sauces menu
		PerformMethodOperation.ClickElement(driver, OR.getProperty("loc_btn_buydayofdead"));  //buy an item
		PerformMethodOperation.ClickElement(driver, OR.getProperty("loc_btn_addtocart"));  //click add to cart
		PerformMethodOperation.ClickElement(driver, OR.getProperty("loc_btn_checkout"));         //click on checkout option
		log.info("clicked checkout");
		//addToCart.verifyassert(driver.getCurrentUrl(), "loc_expected_addtocartcheckouturl", "Checkout url");

		
		/**
		 * Billing details
		 */

		
		PerformMethodOperation.SendElementName(driver, OR.getProperty("loc_txt_fname"),
				OR.getProperty("loc_txt_checkoutfname"));
		PerformMethodOperation.SendElementName(driver, OR.getProperty("loc_txt_lname"),
				OR.getProperty("loc_txt_checkoutlname"));
		PerformMethodOperation.SendElementName(driver, OR.getProperty("loc_txt_phoneprimary"),
				OR.getProperty("loc_txt_checkoutphone"));
		PerformMethodOperation.SendElementName(driver, OR.getProperty("loc_txt_address1"),
				OR.getProperty("loc_txt_checkoutaddress1"));
		PerformMethodOperation.SendElementName(driver, OR.getProperty("loc_txt_address2"),
				OR.getProperty("loc_txt_checkoutaddress2"));
		PerformMethodOperation.SendElementName(driver, OR.getProperty("loc_txt_city"),
				OR.getProperty("loc_txt_checkoutstate"));
		PerformMethodOperation.ClickElement(driver, OR.getProperty("loc_dropdown_state"));
		Select select = new Select(driver.findElement(By.id("state")));
		select.selectByVisibleText(OR.getProperty("loc_txt_stateid"));
		// Get all the option from dropdown list and assign into List
		List<WebElement> listOptionDropdown = select.getOptions();

		int dropdownCount = listOptionDropdown.size();

		log.info("Total Number of item count in dropdown list = " + dropdownCount);

		PerformMethodOperation.SendElementName(driver, OR.getProperty("loc_txt_postal"),
				OR.getProperty("loc_txt_checkoutpincode"));
		PerformMethodOperation.ClickElement(driver, OR.getProperty("loc_btn_savebilling"));
		log.info("Billing process successfully done " +driver.getTitle());
		
		
		
		/**
		 * shipping details
		 */
		
		
		PerformMethodOperation.ClickElement(driver, OR.getProperty("loc_checkbox_shipping"));
		WebElement shippingMethod = driver.findElement(By.id(OR.getProperty("loc_btn_shippingid")));
		boolean shippingIsDisplayed = shippingMethod.isDisplayed();
		System.out.println("Is shipping method is displayed: " + shippingIsDisplayed); // Is displayed
		boolean shippingIsEnabled = shippingMethod.isEnabled();
		System.out.println("Is shipping method is Enabled: " + shippingIsEnabled); // Is Enabled
		boolean shippingIsSelected = shippingMethod.isSelected();
		System.out.println("Is shipping method is Selected: " + shippingIsSelected); // Is Selected(Checking the default
																						// radio button selection
																						// status)
		shippingMethod.click();
		PerformMethodOperation.ClickElement(driver, OR.getProperty("loc_btn_selectshipping"));

		
		
		/**
		 * payment using cash on delivery
		 */
		PerformMethodOperation.ClickElement(driver, OR.getProperty("loc_btn_collectondelivery"));
		PerformMethodOperation.ClickElement(driver, OR.getProperty("loc_btn_completeorder"));
		log.info("Shipping is done " +driver.getTitle());

	}

}
