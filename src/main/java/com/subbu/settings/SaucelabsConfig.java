
package com.subbu.settings;

import com.google.gson.annotations.SerializedName;

/*
 * @author - Subramanyam https://github.com/TowardsAutomationWorld
 */

public class SaucelabsConfig {

    @SerializedName("browserName")
    private String browserName;
    
    @SerializedName("browserVersion")
    private String browserVersion;
    
    @SerializedName("platformName")
    private String platformName;
    
    @SerializedName("acceptInsecureCerts")
    private Boolean acceptInsecureCerts;
    
    @SerializedName("saucelabs_userName")
    private String saucelabsUserName;
    
    @SerializedName("saucelabs_key")
    private String saucelabsKey;
    
    @SerializedName("lambatest_remote_url")
    private String lambatestRemoteUrl;

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

    public String getPlatformName() {
        return platformName;
    }

    public void setPlatformName(String platformName) {
        this.platformName = platformName;
    }

    public Boolean getAcceptInsecureCerts() {
        return acceptInsecureCerts;
    }

    public void setAcceptInsecureCerts(Boolean acceptInsecureCerts) {
        this.acceptInsecureCerts = acceptInsecureCerts;
    }

    public String getSaucelabsUserName() {
        return saucelabsUserName;
    }

    public void setSaucelabsUserName(String saucelabsUserName) {
        this.saucelabsUserName = saucelabsUserName;
    }

    public String getSaucelabsKey() {
        return saucelabsKey;
    }

    public void setSaucelabsKey(String saucelabsKey) {
        this.saucelabsKey = saucelabsKey;
    }

    public String getLambatestRemoteUrl() {
        return lambatestRemoteUrl;
    }

    public void setLambatestRemoteUrl(String lambatestRemoteUrl) {
        this.lambatestRemoteUrl = lambatestRemoteUrl;
    }

}
