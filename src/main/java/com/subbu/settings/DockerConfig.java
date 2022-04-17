
package com.subbu.settings;

import com.google.gson.annotations.SerializedName;

/*
 * @author - Subramanyam https://github.com/TowardsAutomationWorld
 */

public class DockerConfig {

    @SerializedName("browserName")
    private String browserName;
    
    @SerializedName("browserVersion")
    private String browserVersion;
    
    @SerializedName("headLessMode")
    private Boolean headLessMode;

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

    public Boolean getHeadLessMode() {
        return headLessMode;
    }

    public void setHeadLessMode(Boolean headLessMode) {
        this.headLessMode = headLessMode;
    }

}
