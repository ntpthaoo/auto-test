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
import automation.page.Register_Factory;

public class HWDAY14_Factory extends CommonBase{
	@BeforeMethod
	public void openChrome() {
		driver = initChromeDriver(CT_Account.RISE_URL);
	}
	@Test(priority =1)
	public void RegisterSuccessfully() throws InterruptedException  {
		Register_Factory register = new Register_Factory(driver);
		register.Register("day14","test11_day14@demo.com","test11_day14@demo.com","123456","123456","0985660357");
		Thread.sleep(5000);
		assertTrue(driver.findElement(CT_Account.KHOA_HOC).isDisplayed());

	}
	@Test(priority =2)
	public void ChangePassword() throws InterruptedException  {
		Register_Factory register = new Register_Factory(driver);
		register.LoginFunction("test1_day14@demo.com","123456");
		Thread.sleep(2000);
		register.ChangePassword("123456", "1234567", "1234567");
	}
	@Test(priority =3)
	public void LoginInWithNewPassword() throws InterruptedException {
		Register_Factory register = new Register_Factory(driver);
		register.LoginFunction("test1_day14@demo.com","1234567");
		Thread.sleep(5000);
		assertTrue(driver.findElement(CT_Account.KHOA_HOC).isDisplayed());


	}
	@AfterMethod // testNG annotation
	public void closeChromeDriver() {
		//driver.close();
	}
}
