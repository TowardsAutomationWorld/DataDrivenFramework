
package com.subbu.settings;

import com.google.gson.annotations.SerializedName;

/*
 * @author - Subramanyam https://github.com/TowardsAutomationWorld
 */

public class LambdatestConfig {

	@SerializedName("platformName")
	private String platformName;

	@SerializedName("platformName_version")
	private String platformNameVersion;

	@SerializedName("browserName")
	private String browserName;

	@SerializedName("browser_version")
	private String browserVersion;

	@SerializedName("build")
	private String build;

	@SerializedName("name")
	private String name;

	@SerializedName("network")
	private Boolean network;

	@SerializedName("visual")
	private Boolean visual;

	@SerializedName("video")
	private Boolean video;

	@SerializedName("console")
	private Boolean console;

	@SerializedName("lambatest_userName")
	private String lambatestUserName;

	@SerializedName("lambatest_key")
	private String lambatestKey;

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

	public String getBuild() {
		return build;
	}

	public void setBuild(String build) {
		this.build = build;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Boolean getNetwork() {
		return network;
	}

	public void setNetwork(Boolean network) {
		this.network = network;
	}

	public Boolean getVisual() {
		return visual;
	}

	public void setVisual(Boolean visual) {
		this.visual = visual;
	}

	public Boolean getVideo() {
		return video;
	}

	public void setVideo(Boolean video) {
		this.video = video;
	}

	public Boolean getConsole() {
		return console;
	}

	public void setConsole(Boolean console) {
		this.console = console;
	}

	public String getLambatestUserName() {
		return lambatestUserName;
	}

	public void setLambatestUserName(String lambatestUserName) {
		this.lambatestUserName = lambatestUserName;
	}

	public String getLambatestKey() {
		return lambatestKey;
	}

	public void setLambatestKey(String lambatestKey) {
		this.lambatestKey = lambatestKey;
	}

	public String getLambatestRemoteUrl() {
		return lambatestRemoteUrl;
	}

	public void setLambatestRemoteUrl(String lambatestRemoteUrl) {
		this.lambatestRemoteUrl = lambatestRemoteUrl;
	}

}
