package com.atmecs.testsuite;

import java.io.File;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import com.atmecs.constants.ProjectPathConstants;
import com.atmecs.utils.PropertiesUtil;

public class TestBase {
	public WebDriver driver;
	public static Properties configProps = PropertiesUtil.loadProperty(ProjectPathConstants.config);
	public static Properties OR = PropertiesUtil.loadProperty(ProjectPathConstants.objectrepository);
	public static Properties logger = PropertiesUtil.loadProperty(ProjectPathConstants.log);


	public WebDriver getwebDriver() {
		return this.driver;
	}

	public WebDriver invokeBrowser() {
		String browser = configProps.getProperty("browserName");
		if (browser.equalsIgnoreCase("chrome")) {
			this.driver = setChromeDriver();
			System.out.println("Chrome driver set " + driver);
		}

		else if (browser.equalsIgnoreCase("firefox")) {
			System.out.println("firefox case");
			this.driver = setFirefoxDriver();
			System.out.println("Firefox driver set " + driver);
		}

		else if (browser.equalsIgnoreCase("IE")) {
			this.driver = setInterExplorerDriver();
			System.out.println("Internet driver set " + driver);
		}
		return driver;

	}

	private WebDriver setChromeDriver() {

		System.out.println("Running browser");
		String currentdir = System.getProperty("user.dir") + File.separator + "lib" + File.separator;
		System.setProperty("webdriver.chrome.driver", currentdir + "chromedriver.exe");
		return new ChromeDriver();
	}

	private WebDriver setFirefoxDriver() {
		String currentdir = System.getProperty("user.dir") + File.separator + "lib" + File.separator;
		System.setProperty("webdriver.gecko.driver", currentdir + "geckodriver.exe");
		return new FirefoxDriver();
	}

	public WebDriver setInterExplorerDriver() {
		String currentdir = System.getProperty("user.dir") + File.separator + "lib" + File.separator;
		System.setProperty("webdriver.ie.driver", currentdir + "IEDriverServer.exe");
		return new InternetExplorerDriver();
	}

	public WebDriver windowOperation() {
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		return driver;
	}
}
