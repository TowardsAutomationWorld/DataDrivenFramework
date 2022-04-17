
package com.subbu.settings;

import com.google.gson.annotations.SerializedName;

/*
 * @author - Subramanyam https://github.com/TowardsAutomationWorld
 */

public class BrowserstackConfig {

	@SerializedName("platformName")
	private String platformName;
	
	@SerializedName("platformName_version")
	private String platformNameVersion;
	
	@SerializedName("browserName")
	private String browserName;
	
	@SerializedName("browser_version")
	private String browserVersion;
	
	@SerializedName("browserstack_local")
	private String browserstackLocal;
	
	@SerializedName("browserstack_selenium_version")
	private String browserstackSeleniumVersion;
	
	@SerializedName("browserstack_userName")
	private String browserstackUserName;
	
	@SerializedName("browserstack_key")
	private String browserstackKey;
	
	@SerializedName("lambatest_remote_url")
	private String lambatestRemoteUrl;

	public String getPlatformName() {
		return platformName;
	}

	public void setPlatformName(String platformName) {
		this.platformName = platformName;
	}

	public String getPlatformNameVersion() {
		return platformNameVersion;
	}

	public void setPlatformNameVersion(String platformNameVersion) {
		this.platformNameVersion = platformNameVersion;
	}

	public String getBrowserName() {
		return browserName;
	}

	public void setBrowserName(String browserName) {
		this.browserName = browserName;
	}

	public String getBrowserVersion() {
		return browserVersion;
	}

	public void setBrowserVersion(String browserVersion) {
		this.browserVersion = browserVersion;
	}

	public String getBrowserstackLocal() {
		return browserstackLocal;
	}

	public void setBrowserstackLocal(String browserstackLocal) {
		this.browserstackLocal = browserstackLocal;
	}

	public String getBrowserstackSeleniumVersion() {
		return browserstackSeleniumVersion;
	}

	public void setBrowserstackSeleniumVersion(String browserstackSeleniumVersion) {
		this.browserstackSeleniumVersion = browserstackSeleniumVersion;
	}

	public String getBrowserstackUserName() {
		return browserstackUserName;
	}

	public void setBrowserstackUserName(String browserstackUserName) {
		this.browserstackUserName = browserstackUserName;
	}

	public String getBrowserstackKey() {
		return browserstackKey;
	}

	public void setBrowserstackKey(String browserstackKey) {
		this.browserstackKey = browserstackKey;
	}

	public String getLambatestRemoteUrl() {
		return lambatestRemoteUrl;
	}

	public void setLambatestRemoteUrl(String lambatestRemoteUrl) {
		this.lambatestRemoteUrl = lambatestRemoteUrl;
	}

}
