package com.subbu.pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

/*
 * @author - Subramanyam https://github.com/TowardsAutomationWorld
 */

public class RegistrationPage {

	WebDriver driver;

	@FindBy(xpath = "//input[@id = 'id_gender1']")
	WebElement titleMr;

	@FindBy(xpath = "//input[@id = 'id_gender2']")
	WebElement titleMrs;

	@FindBy(xpath = "//input[@id = 'customer_firstname']")
	WebElement firstNameInput;

	@FindBy(xpath = "//input[@id='customer_lastname']")
	WebElement lastNameInput;

	@FindBy(xpath = "//input[@id='email']")
	WebElement emailInput;

	@FindBy(xpath = "//input[@id = 'passwd']")
	WebElement passwordInput;

	@FindBy(xpath = "//select[@id = 'days']")
	WebElement dobDays;

	@FindBy(xpath = "//select[@id = 'months']")
	WebElement dobMonths;

	@FindBy(xpath = "//select[@id = 'years']")
	WebElement dobYears;

	@FindBy(xpath = "//input[@id = 'firstname']")
	WebElement addressFirstName;

	@FindBy(xpath = "//input[@id = 'lastname']")
	WebElement addressLastName;

	@FindBy(xpath = "//input[@name='company']")
	WebElement companyInput;

	@FindBy(xpath = "//input[@name='address1']")
	WebElement addressLine1;

	@FindBy(xpath = "//input[@name='address2']")
	WebElement addressLine2;

	@FindBy(xpath = "//input[@name='city']")
	WebElement cityInput;

	@FindBy(xpath = "//select[@name='id_state']")
	WebElement stateInput;

	@FindBy(xpath = "//input[@name='postcode']")
	WebElement postalCodeInput;

	@FindBy(xpath = "//textarea[@name='other']")
	WebElement otherInfoInput;

	@FindBy(id = "phone")
	WebElement homePhoneInput;

	@FindBy(id = "phone_mobile")
	WebElement mobilePhoneInput;

	@FindBy(name = "alias")
	WebElement aliasAddressInput;

	@FindBy(name = "submitAccount")
	WebElement submitAccountButton;

	Select select;

	public RegistrationPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public void fillRegistrationForm(String nameTitle, String firstName, String lastName,
			String password, String day, String month, String year, String company, String addrLine1, String addrLine2,
			String city, String state, String postalCode, String otherInfo, String mobilePhone,
			String homePhone, String aliasName) throws InterruptedException {

		Thread.sleep(5000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();", titleMr);

		if (nameTitle.equalsIgnoreCase("Mr")) {
			titleMr.click();
		} else {
			titleMrs.click();
		}

		firstNameInput.sendKeys(firstName);
		lastNameInput.sendKeys(lastName);
		passwordInput.sendKeys(password);

		select = new Select(dobDays);
		select.selectByValue(day);

		select = new Select(dobMonths);
		select.selectByValue(month);

		select = new Select(dobYears);
		select.selectByValue(year);

		companyInput.sendKeys(company);

		addressLine1.sendKeys(addrLine1);
		addressLine2.sendKeys(addrLine2);
		cityInput.sendKeys(city);

		select = new Select(stateInput);
		select.selectByValue(state);

		postalCodeInput.sendKeys(postalCode);

		otherInfoInput.sendKeys(otherInfo);

		homePhoneInput.sendKeys(homePhone);
		mobilePhoneInput.sendKeys(mobilePhone);

		aliasAddressInput.clear();
		aliasAddressInput.sendKeys(aliasName);
		
	}
	
	public HomePage navigateToHome() {
		submitAccountButton.click();
		return new HomePage(driver);
	}


}
