package com.subbu.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.subbu.utils.Utils;

/*
 * @author - Subramanyam https://github.com/TowardsAutomationWorld
 */

public class AuthenticationPage {

	WebDriver driver;
	Utils waitHelper;

	@FindBy(xpath = "//input[@id = 'email_create']")
	WebElement createEmailAddress;

	@FindBy(xpath = "//button[@id = 'SubmitCreate']")
	WebElement createAnAccountButton;

	public AuthenticationPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		waitHelper = new Utils();
		waitHelper.waitForElement(createEmailAddress, 20, driver);
	}

	public RegistrationPage navigateToRegistration() {
		String emailValue = "testemail" + Utils.randonNumberGen() + "@gmail.com";
		createEmailAddress.sendKeys(emailValue);
		createAnAccountButton.click();
		return new RegistrationPage(driver);
	}

}
