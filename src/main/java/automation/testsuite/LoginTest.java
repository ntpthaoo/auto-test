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

public class LoginTest extends CommonBase{
	@BeforeMethod
	public void openChrome() {
		driver = initChromeDriver(CT_Account.RISE_URL);
	}
	@Test(priority =1)
	public void LoginSuccessfully()  {
		LoginPage login = new LoginPage(driver);
		login.LoginFunction("client@demo.com", "riseDemo");
		assertTrue(driver.findElement(CT_Account.DASHBOARD_TEXT).isDisplayed());

	}
	@Test(priority =2)
	public void LoginFailIncorrectEmail()  {
		LoginPage login = new LoginPage(driver);
		login.LoginFunction("client1@demo.com", "riseDemo");
		assertTrue(driver.findElement(CT_Account.AUTHENTICATION_ALERT).isDisplayed());

	}
	@AfterMethod // testNG annotation
	public void closeChromeDriver() {
		driver.close();
	}
}
