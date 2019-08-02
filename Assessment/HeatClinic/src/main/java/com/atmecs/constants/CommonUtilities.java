package com.atmecs.constants;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

import com.atmecs.helper.PerformMethodOperation;
import com.atmecs.testsuite.TestBase;

public class CommonUtilities extends TestBase {

	WebDriver driver;

	/**
	 * 
	 * @param actual
	 * @param expected
	 */

	public void verifyassert(String actual, String expected) {

		Assert.assertEquals(actual, expected, "passed");
	}

	/**
	 * 
	 * @param driver AddToCart Utilities
	 */

	public void buyOption(WebDriver driver) {

		PerformMethodOperation.ClickElement(driver, OR.getProperty("Click_HotSauces"));
		PerformMethodOperation.ClickElement(driver, OR.getProperty("BuyNow"));

	}

	public void inCart(WebDriver driver) {
		boolean cart = driver.findElement(By.xpath(OR.getProperty("Click_Incart"))).isDisplayed();
		Assert.assertTrue(cart);
		PerformMethodOperation.ClickElement(driver, OR.getProperty("Click_Incart"));
	}

	public void addQuantity(WebDriver driver) {
		WebElement quantity = driver.findElement(By.xpath(OR.getProperty("quantity")));
		quantity.clear();
		quantity.sendKeys("4");
		PerformMethodOperation.ClickElement(driver, OR.getProperty("update"));
	}

	/**
	 * 
	 * @param driver RemoveFromCartUtilities
	 */

	public void dropDownMerchandise(WebDriver driver) {
		WebElement ClickMerchandise = driver.findElement(By.xpath(OR.getProperty("Click_merchandise")));
		String quantities = ClickMerchandise.getText();
		System.out.println("Text of Page:" + quantities);
		Actions moveMouseOperation = new Actions(driver);
		moveMouseOperation.moveToElement(ClickMerchandise).perform();
		moveMouseOperation.clickAndHold();
		PerformMethodOperation.ClickElement(driver, OR.getProperty("DropDownMen"));
		driver.navigate().back();
		ClickMerchandise = driver.findElement(By.xpath(OR.getProperty("Click_merchandise")));
		moveMouseOperation.moveToElement(ClickMerchandise).perform();
	}

	public void buywomenShirt(WebDriver driver) {

		PerformMethodOperation.ClickElement(driver, OR.getProperty("DropDownWomen"));
		PerformMethodOperation.ClickElement(driver, OR.getProperty("buyWomenShirt"));
		PerformMethodOperation.ClickElement(driver, OR.getProperty("ClickRed"));
		PerformMethodOperation.ClickElement(driver, OR.getProperty("ClickSmall"));
		PerformMethodOperation.ClickElement(driver, OR.getProperty("BuySelected"));

	}

	public void removeItem(WebDriver driver) {
		PerformMethodOperation.ClickElement(driver, OR.getProperty("selectCart"));
		PerformMethodOperation.ClickElement(driver, OR.getProperty("RemoveSelected"));

	}
}
