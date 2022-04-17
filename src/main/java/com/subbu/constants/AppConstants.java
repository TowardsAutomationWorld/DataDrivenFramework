package com.subbu.constants;

/*
 * @author - Subramanyam https://github.com/TowardsAutomationWorld
 */

public class AppConstants {

	public static final String WINDOWS_CHROME_DRIVER_PATH = "./res/drivers/windows/chromedriver.exe";
	public static final String WINDOWS_FIREFOX_DRIVER_PATH = "./res/drivers/windows/geckodriver.exe";
	public static final String WINDOWS_EDGE_DRIVER_PATH = "./res/drivers/windows/msedgedriver.exe";

	public static final String MAC_SAFARI_DRIVER_PATH = "./res/drivers/mac/safaririver";
	public static final String MAC_FIREFOX_DRIVER_PATH = "./res/drivers/mac/geckodriver";

	public static final String LINUX_FIREFOX_DRIVER_PATH = "./res/drivers/linux/geckodriver";
	public static final String LINUX_CHROME_DRIVER_PATH = "./res/drivers/linux/chromedriver";

	public static final String CHROME_DRIVER_KEY = "webdriver.chrome.driver";
	public static final String FIREFOX_DRIVER_KEY = "webdriver.gecko.driver";
	public static final String EDGE_DRIVER_KEY = "webdriver.edge.driver";
	public static final String SAFARI_DRIVER_KEY = "webdriver.safari.driver";

	public static final String OS_NAME = System.getProperty("os.name");
	public static final String WINDOWS_OS = "Windows";
	public static final String MAC_OS = "Mac";
	public static final String LINUX_OS = "Linux";

	public static final String BROWSER_VALUE_CHROME = "Chrome";
	public static final String BROWSER_VALUE_FIREFOX = "Firefox";
	public static final String BROWSER_VALUE_EDGE = "Edge";
	public static final String BROWSER_VALUE_SAFARI = "Safari";

}
