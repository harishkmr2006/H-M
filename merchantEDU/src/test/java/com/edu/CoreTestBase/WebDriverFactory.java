/*
 * 
 */
package com.edu.CoreTestBase;

import static com.edu.Utilities.YamlReader.getYamlValue;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.safari.SafariDriver;

/**
 * A factory for creating WebDriver objects.
 */
@SuppressWarnings("unchecked")
public class WebDriverFactory {
	/** The browser. */
	private static String browser;
	/** The capabilities. */
	private static DesiredCapabilities capabilities = new DesiredCapabilities();
	public static URL url;
	static FirefoxProfile firefoxProfile;

	/**
	 * Gets the driver.
	 * 
	 * @param seleniumconfig
	 *            the seleniumconfig
	 * @return the driver
	 */
	public static WebDriver getDriver(Map<String, Object> seleniumconfig) {
		seleniumconfig = (Map<String, Object>) seleniumconfig.get("selenium");
		browser = System.getProperty("browser", seleniumconfig.get("browser").toString());
		
		
		if (seleniumconfig.get("server").toString().equalsIgnoreCase("local")) {
			if (browser.equalsIgnoreCase("firefox")) {
				return createFirefoxDriver(seleniumconfig.get("driverpath").toString());
			} else if (browser.equalsIgnoreCase("chrome")) {
				return setChromeDriver(seleniumconfig.get("driverpath").toString());
			} else if (browser.equalsIgnoreCase("Safari")) {
				return setSafariDriver();
			} else if ((browser.equalsIgnoreCase("ie")) || (browser.equalsIgnoreCase("internetexplorer"))
					|| (browser.equalsIgnoreCase("internet explorer"))) {
				return setInternetExplorerDriver(seleniumconfig.get("driverpath").toString());
			}
		}
		
		
		if (seleniumconfig.get("server").toString().equalsIgnoreCase("remote")) {
			return setRemoteDriver(seleniumconfig);
		}
		return new FirefoxDriver();
	}

	/**
	 * Sets the remote driver.
	 * 
	 * @param selConfig
	 *            the sel config
	 * @return the web driver
	 */
	private static WebDriver setRemoteDriver(Map<String, Object> selConfig) {
		String browser = System.getProperty("browser", selConfig.get("browser").toString());
		capabilities = new DesiredCapabilities();
		capabilities.setJavascriptEnabled(true);
		if (browser.equalsIgnoreCase("firefox")) {
			capabilities = DesiredCapabilities.firefox();
			capabilities.setCapability(FirefoxDriver.PROFILE, getFirefoxProfile());
		} else if (browser.equalsIgnoreCase("chrome")) {
			capabilities = DesiredCapabilities.chrome();
		} else if (browser.equalsIgnoreCase("Safari")) {
			capabilities = DesiredCapabilities.safari();
		} else if ((browser.equalsIgnoreCase("ie")) || (browser.equalsIgnoreCase("internetexplorer"))
				|| (browser.equalsIgnoreCase("internet explorer"))) {
			capabilities = DesiredCapabilities.internetExplorer();
		} else {
			System.out.println("Please correct Browser specify in YAML file : " + browser);
			capabilities = DesiredCapabilities.firefox();
		}
		try {
			url = new URL(System.getProperty("ipaddress", getYamlValue("selenium.remote.host")));
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
		return new RemoteWebDriver(url, capabilities);
	}

	/**
	 * Sets the chrome driver.
	 * 
	 * @param driverpath
	 *            the driverpath
	 * @return the web driver
	 */
	private static WebDriver setChromeDriver(String driverpath) {
		System.setProperty("webdriver.chrome.driver", driverpath + "chromedriver.exe");
		capabilities.setJavascriptEnabled(true);
		return new ChromeDriver();
	}

	/**
	 * Sets the internet explorer driver.
	 * 
	 * @param driverpath
	 *            the driverpath
	 * @return the web driver
	 */
	private static WebDriver setInternetExplorerDriver(String driverpath) {
		System.setProperty("webdriver.ie.driver", driverpath+"IEDriverServer.exe");
		return new InternetExplorerDriver();
	}

	/**
	 * Sets the safari driver.
	 * 
	 * @return the web driver
	 */
	private static WebDriver setSafariDriver() {
		return new SafariDriver();
	}

	/**
	 * Creates a new WebDriver object.
	 * 
	 * @param firefoxProfile
	 *            the firefox profile
	 * @return the web driver
	 */
//	private static WebDriver createFirefoxDriver(FirefoxProfile firefoxProfile) {
//		capabilities.setJavascriptEnabled(true);
//		return new FirefoxDriver(firefoxProfile);
//	}

	public static WebDriver createFirefoxDriver(String driverpath) {
		 System.setProperty("webdriver.gecko.driver", driverpath + "geckodriver.exe");
		 System.setProperty(FirefoxDriver.SystemProperty.DRIVER_USE_MARIONETTE,"true");
		 System.setProperty(FirefoxDriver.SystemProperty.BROWSER_LOGFILE,"/dev/null");
		capabilities.setJavascriptEnabled(true);
		return new FirefoxDriver();
	}

	/**
	 * Gets the firefox profile.
	 * 
	 * @return the firefox profile
	 */
	public static FirefoxProfile getFirefoxProfile() {
		firefoxProfile = new FirefoxProfile();
		try {	
			firefoxProfile.setPreference("layout.css.devPixelsPerPx", "0.8");
			firefoxProfile.setPreference("dom.max_script_run_time", 30);
			firefoxProfile.setPreference("network.http.pipelining", true);
			firefoxProfile.setPreference("network.http.proxy.pipelining", true);
			firefoxProfile.setPreference("browser.cache.disk.enable", false);
			firefoxProfile.setPreference("browser.cache.memory.enable", false);
			firefoxProfile.setPreference("browser.cache.offline.enable", false);
			firefoxProfile.setPreference("network.http.use-cache", false);
		} catch (Exception e) {
			e.printStackTrace();
			Logger.getLogger(WebDriverFactory.class.getName()).log(Level.SEVERE, null, e);
		}
		return firefoxProfile;
	}
}
