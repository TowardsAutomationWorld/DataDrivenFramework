package com.subbu.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.subbu.utils.Utils;

/*
 * @author - Subramanyam https://github.com/TowardsAutomationWorld
 */

public class HomePage {
	
	WebDriver driver;
	Utils waitHelper;

	@FindBy(xpath = "//a[contains(text(), 'Sign out')][@class = 'logout']")
	WebElement signOutButton;

	public HomePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		waitHelper = new Utils();
		waitHelper.waitForElement(signOutButton, 20, driver);
	}

	public void signOutBtnClick() {
		signOutButton.click();
	}

}
