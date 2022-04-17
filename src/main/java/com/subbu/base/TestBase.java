package com.subbu.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;

import com.subbu.constants.AppConstants;
import com.subbu.settings.GlobalSettings;

/*
 * @author - Subramanyam https://github.com/TowardsAutomationWorld
 */

public class TestBase {

	public WebDriver driver;
	GlobalSettings settings = GlobalSettings.getInstance();

	@BeforeTest
	public void getBrowser() {
		String runMode = settings.getRunMode();
		String browser = settings.getLocalConfig().getBrowserName();

		switch (runMode) {
		case "Local":
			if (AppConstants.OS_NAME.contains(AppConstants.WINDOWS_OS)) {
				if (browser.equalsIgnoreCase(AppConstants.BROWSER_VALUE_FIREFOX)) {
					System.setProperty(AppConstants.FIREFOX_DRIVER_KEY, AppConstants.WINDOWS_FIREFOX_DRIVER_PATH);
					driver = new FirefoxDriver();
				} else if (browser.equalsIgnoreCase(AppConstants.BROWSER_VALUE_CHROME)) {
					System.setProperty(AppConstants.CHROME_DRIVER_KEY, AppConstants.WINDOWS_CHROME_DRIVER_PATH);
					driver = new ChromeDriver();
				} else if (browser.equalsIgnoreCase(AppConstants.BROWSER_VALUE_EDGE)) {
					System.setProperty(AppConstants.EDGE_DRIVER_KEY, AppConstants.WINDOWS_EDGE_DRIVER_PATH);
					driver = new EdgeDriver();
				}
			} else if (AppConstants.OS_NAME.contains(AppConstants.MAC_OS)) {
				if (browser.equalsIgnoreCase(AppConstants.BROWSER_VALUE_SAFARI)) {
					System.setProperty(AppConstants.SAFARI_DRIVER_KEY, AppConstants.MAC_SAFARI_DRIVER_PATH);
					driver = new SafariDriver();
				} else if (browser.equalsIgnoreCase(AppConstants.BROWSER_VALUE_CHROME)) {
					System.setProperty(AppConstants.CHROME_DRIVER_KEY, AppConstants.MAC_FIREFOX_DRIVER_PATH);
					driver = new ChromeDriver();
				}
			} else if (AppConstants.OS_NAME.contains(AppConstants.LINUX_OS)) {
				if (browser.equalsIgnoreCase(AppConstants.BROWSER_VALUE_CHROME)) {
					System.setProperty(AppConstants.CHROME_DRIVER_KEY, AppConstants.LINUX_CHROME_DRIVER_PATH);
					driver = new ChromeDriver();
				} else if (browser.equalsIgnoreCase(AppConstants.BROWSER_VALUE_FIREFOX)) {
					System.setProperty(AppConstants.FIREFOX_DRIVER_KEY, AppConstants.LINUX_FIREFOX_DRIVER_PATH);
					driver = new ChromeDriver();
				}
			}

			break;

		case "BroswerStack":
			break;

		case "SauceLabs":
			break;

		case "LambdaTest":
			break;

		case "Jenkins":
			break;

		case "Docker":
			break;

		default:
			System.out.println("===> Please Check Your Configuration file config/GloblaConfig.json ===> ");
			break;
		}

		driver.manage().window().maximize();
	}

	@BeforeClass
	public void beforeClass() {
		driver.get(settings.getAppURL());
	}

	@AfterTest
	public void tearDown() {
		driver.close();
	}

}
