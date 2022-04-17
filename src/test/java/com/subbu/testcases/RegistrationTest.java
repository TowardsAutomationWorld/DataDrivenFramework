package com.subbu.testcases;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.subbu.base.TestBase;
import com.subbu.excelutils.ReadDataFromExcelSheet;
import com.subbu.pages.AuthenticationPage;
import com.subbu.pages.HomePage;
import com.subbu.pages.LandingPage;
import com.subbu.pages.RegistrationPage;

/*
 * @author - Subramanyam https://github.com/TowardsAutomationWorld
 */

public class RegistrationTest extends TestBase {

	LandingPage landing;
	RegistrationPage regPage;
	AuthenticationPage authPage;
	HomePage homePage;

	@DataProvider(name = "testData")
	public Object[][] testData() {
		ReadDataFromExcelSheet excel = new ReadDataFromExcelSheet();
		Object[][] data = excel.getExcelData("./res/testdata/TestData.xlsx", "Registration");
		return data;
	}

	@Test(dataProvider = "testData")
	public void fillRegForm(String nameTitle, String firstName, String lastName, String password,
			String day, String month, String year, String company, String addrLine1, String addrLine2, String city,
			String state, String postalCode, String otherInfo, String mobilePhone, String homePhone,
			String aliasName) throws InterruptedException {

		landing = new LandingPage(driver);
		landing.navigateToAuthPage();

		authPage = new AuthenticationPage(driver);
		authPage.navigateToRegistration();

		regPage = new RegistrationPage(driver);

		regPage.fillRegistrationForm(nameTitle, firstName, lastName, password, day, month, year, company,
				addrLine1, addrLine2, city, state, postalCode,otherInfo, mobilePhone, homePhone, aliasName);

		regPage.navigateToHome();
		
		homePage = new HomePage(driver);
		homePage.signOutBtnClick();
	}

}
