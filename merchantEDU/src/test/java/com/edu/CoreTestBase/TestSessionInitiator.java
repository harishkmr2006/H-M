
package com.edu.CoreTestBase;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.Augmenter;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.ITestResult;


import com.edu.Lib.*;

import static com.edu.Utilities.YamlReader.*;


/**
 * The Class TestSessionInitiator.
 * 
 * @author tempshtiw
 *
 */
public class TestSessionInitiator {
	
	/** The castor home. */
	public CastorHomePageAction castorHome;
	public ProductDevelopmentDetailAction productDevlopmet;
	public ProductDevlopmentMerchantActions merchantProductDevelopment;
	public CNGZProductDevlopmentMerchantActions cngzProductDevlopment;
	
	/** The driver. */
	WebDriver driver;
	/** The browser. */
	String browser;
	/** The seleniumserver. */
	String seleniumserver;
	/** The seleniumserverhost. */
	String seleniumserverhost;
	/** The appbaseurl. */
	String appbaseurl;
	/** The applicationpath. */
	String applicationpath;
	/** The chromedriverpath. */
	String chromedriverpath;
	/** The timeout. */
	long timeout;
	/** The chrome options. */
	Map<String, Object> chromeOptions = null;
	/** The capabilities. */
	DesiredCapabilities capabilities;

	/**
	 * Instantiates a new test session initiator.
	 * 
	 * @param datafilelocator
	 *            the datafilelocator
	 */
	public TestSessionInitiator(String datafilelocator) {
		setYamlFilePath(datafilelocator);
		_getSessionConfig();
		_configureBrowser();
		_initPage();
	}

	/**
	 * _configure browser.
	 */
	private void _configureBrowser() {
		Map<String, Object> driverConfig = getYamlValues("selenium");
		driver = WebDriverFactory.getDriver(driverConfig);
		driver.manage().timeouts().implicitlyWait(timeout, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
	}

	/**
	 * _get session config.
	 */
	private void _getSessionConfig() {
		browser = getYamlValue("selenium.browser");
		seleniumserver = getYamlValue("selenium.server");
		seleniumserverhost = getYamlValue("selenium.remote.host");
		appbaseurl = getYamlValue("baseurl");
		applicationpath = appbaseurl;
		timeout = Integer.parseInt(getYamlValue("selenium.timeout"));
	}

	/**
	 * _init page.
	 */
	private void _initPage() {
		castorHome = new CastorHomePageAction(driver);
		productDevlopmet = new ProductDevelopmentDetailAction(driver);
		merchantProductDevelopment = new ProductDevlopmentMerchantActions(driver);
		cngzProductDevlopment = new CNGZProductDevlopmentMerchantActions(driver);
	}

	/**
	 * Launch application.
	 */
	public void launchApplication() {
		System.out.println("The application url is :- " + applicationpath);
		driver.get(applicationpath);
	}

	/**
	 * Launch url.
	 * 
	 * @param URL
	 *            the url
	 */
	public void launchUrl(String URL) {
		driver.get(URL);
	}

	/**
	 * Launch application url.
	 * 
	 * @param URL
	 *            the url
	 */
	public void launchApplicationUrl(String URL) {
		launchUrl(URL);
	}

	/**
	 * Close browser session.
	 */
	public void closeBrowserSession() {
		driver.quit();
	}

	/**
	 * Switch to default content.
	 */
	public void switchToDefaultContent() {
		driver.switchTo().defaultContent();
	}

	/**
	 * Take screenshot of failure.
	 * 
	 * @param result
	 *            the result
	 */
	public void takeScreenshotOfFailure(ITestResult result) {
		Calendar calendar = Calendar.getInstance();
		SimpleDateFormat formater = new SimpleDateFormat("dd_MM_yyyy_hh_mm_ss");
		String methodName = result.getName();
		WebDriver augmentedDriver = new Augmenter().augment(driver);
		if (!result.isSuccess()) {
			try {
				File scrFile = ((TakesScreenshot) augmentedDriver).getScreenshotAs(OutputType.FILE);
				FileUtils.copyFile(scrFile, new File("target/failsafe-reports/screenshots/" + methodName + "_"
						+ formater.format(calendar.getTime()) + ".jpg"));
			} catch (Exception ex) {
				ex.printStackTrace();
			}
		}
	}

	/**
	 * Take screenshot of failure from local machine.
	 *
	 * @param result the result
	 */
	public void takeScreenshotOfFailureFromLocalMachine(ITestResult result) {
		Calendar calendar = Calendar.getInstance();
		SimpleDateFormat formater = new SimpleDateFormat("dd_MM_yyyy_hh_mm_ss");
		String methodName = result.getName();
		if (!result.isSuccess()) {
			try {
				File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
				FileUtils.copyFile(scrFile, new File("target/failsafe-reports/screenshots/" + methodName + "_"
						+ formater.format(calendar.getTime()) + ".jpg"));
			} catch (Exception ex) {
				ex.printStackTrace();
			}
		}
	}
}