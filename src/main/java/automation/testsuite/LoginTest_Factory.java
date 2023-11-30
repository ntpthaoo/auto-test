package automation.testsuite;

import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import automation.common.CommonBase;
import automation.constant.CT_Account;
import automation.page.LoginPage;
import automation.page.LoginPage_Factory;

public class LoginTest_Factory extends CommonBase{
	@BeforeMethod
	public void openChrome() {
		driver = initChromeDriver(CT_Account.RISE_URL);
	}
	@Test(priority =1)
	public void LoginSuccessfully()  {
		LoginPage_Factory login = new LoginPage_Factory(driver);
		login.LoginFunction("client@demo.com", "riseDemo");
		assertTrue(driver.findElement(CT_Account.DASHBOARD_TEXT).isDisplayed());

	}
	@Test(priority =2)
	public void LoginFailIncorrectEmail()  {
		LoginPage_Factory login = new LoginPage_Factory(driver);
		login.LoginFunction("client1@demo.com", "riseDemo");
		assertTrue(isElementPresent(CT_Account.AUTHENTICATION_ALERT));

	}
	@Test(priority =3)
	public void LoginOut() {
		LoginPage_Factory login = new LoginPage_Factory(driver);

		login.LogoutFunction("client@demo.com", "riseDemo");

	}
	@AfterMethod // testNG annotation
	public void closeChromeDriver() {
		driver.close();
	}
}
