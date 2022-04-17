package com.subbu.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.subbu.utils.Utils;

/*
 * @author - Subramanyam https://github.com/TowardsAutomationWorld
 */

public class LandingPage {

	private WebDriver driver;
	private Utils waitHelper;


	@FindBy(xpath = "//a[contains(text(), 'Sign in')]")
	WebElement signInLink;

	public LandingPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		waitHelper = new Utils();
		waitHelper.waitForElement(signInLink, 20, driver);
	}

	public AuthenticationPage navigateToAuthPage() {
		signInLink.click();
		return new AuthenticationPage(driver);
	}
	
	
}
