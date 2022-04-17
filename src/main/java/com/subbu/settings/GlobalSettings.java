
package com.subbu.settings;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;

/*
 * @author - Subramanyam https://github.com/TowardsAutomationWorld
 */

public class GlobalSettings {

	private static GlobalSettings settings = null;

	@SerializedName("appURL")
	private String appURL;

	@SerializedName("implicitWait")
	private String implicitWait;

	@SerializedName("explicitWait")
	private String explicitWait;

	@SerializedName("pageLoadTime")
	private String pageLoadTime;

	@SerializedName("closeBrowserAfterExecution")
	private Boolean closeBrowserAfterExecution;

	@SerializedName("generateReport")
	private Boolean generateReport;

	@SerializedName("reportPath")
	private String reportPath;

	@SerializedName("loggerPath")
	private String loggerPath;

	@SerializedName("local_config")
	private LocalConfig localConfig;

	@SerializedName("jenkins_config")
	private JenkinsConfig jenkinsConfig;

	@SerializedName("saucelabs_config")
	private SaucelabsConfig saucelabsConfig;

	@SerializedName("browserstack_config")
	private BrowserstackConfig browserstackConfig;

	@SerializedName("lambdatest_config")
	private LambdatestConfig lambdatestConfig;

	@SerializedName("docker_config")
	private DockerConfig dockerConfig;
	
	@SerializedName("runMode")
	private String runMode;

	public String getRunMode() {
		return runMode;
	}

	public void setRunMode(String runMode) {
		this.runMode = runMode;
	}

	public String getAppURL() {
		return appURL;
	}

	public void setAppURL(String appURL) {
		this.appURL = appURL;
	}

	public String getImplicitWait() {
		return implicitWait;
	}

	public void setImplicitWait(String implicitWait) {
		this.implicitWait = implicitWait;
	}

	public String getExplicitWait() {
		return explicitWait;
	}

	public void setExplicitWait(String explicitWait) {
		this.explicitWait = explicitWait;
	}

	public String getPageLoadTime() {
		return pageLoadTime;
	}

	public void setPageLoadTime(String pageLoadTime) {
		this.pageLoadTime = pageLoadTime;
	}

	public Boolean getCloseBrowserAfterExecution() {
		return closeBrowserAfterExecution;
	}

	public void setCloseBrowserAfterExecution(Boolean closeBrowserAfterExecution) {
		this.closeBrowserAfterExecution = closeBrowserAfterExecution;
	}

	public Boolean getGenerateReport() {
		return generateReport;
	}

	public void setGenerateReport(Boolean generateReport) {
		this.generateReport = generateReport;
	}

	public String getReportPath() {
		return reportPath;
	}

	public void setReportPath(String reportPath) {
		this.reportPath = reportPath;
	}

	public String getLoggerPath() {
		return loggerPath;
	}

	public void setLoggerPath(String loggerPath) {
		this.loggerPath = loggerPath;
	}

	public LocalConfig getLocalConfig() {
		return localConfig;
	}

	public void setLocalConfig(LocalConfig localConfig) {
		this.localConfig = localConfig;
	}

	public JenkinsConfig getJenkinsConfig() {
		return jenkinsConfig;
	}

	public void setJenkinsConfig(JenkinsConfig jenkinsConfig) {
		this.jenkinsConfig = jenkinsConfig;
	}

	public SaucelabsConfig getSaucelabsConfig() {
		return saucelabsConfig;
	}

	public void setSaucelabsConfig(SaucelabsConfig saucelabsConfig) {
		this.saucelabsConfig = saucelabsConfig;
	}

	public BrowserstackConfig getBrowserstackConfig() {
		return browserstackConfig;
	}

	public void setBrowserstackConfig(BrowserstackConfig browserstackConfig) {
		this.browserstackConfig = browserstackConfig;
	}

	public LambdatestConfig getLambdatestConfig() {
		return lambdatestConfig;
	}

	public void setLambdatestConfig(LambdatestConfig lambdatestConfig) {
		this.lambdatestConfig = lambdatestConfig;
	}

	public DockerConfig getDockerConfig() {
		return dockerConfig;
	}

	public void setDockerConfig(DockerConfig dockerConfig) {
		this.dockerConfig = dockerConfig;
	}

	private GlobalSettings() {}

	public static GlobalSettings getInstance() {
		if (settings == null)
			settings = new GlobalSettings();
		Gson gson = new Gson();
		try {
			FileReader fis = new FileReader(new File(
					"./res/config/GloablConfig.json"));
			settings = gson.fromJson(fis, GlobalSettings.class);
		} catch (IOException e) {
			e.printStackTrace();
		}
		return settings;
	}
}
