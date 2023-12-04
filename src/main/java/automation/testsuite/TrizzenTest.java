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
import automation.page.ClientPage;
import automation.page.LoginPage;
import automation.page.LoginPage_Factory;
import automation.page.TrizzenPage;

public class TrizzenTest extends CommonBase{
	@BeforeMethod
	public void openChrome() {
		driver = initChromeDriver(CT_Account.Trizen_URL);
	}
	@Test(priority =1)
	public void TestDateAndTime() throws InterruptedException  {
		TrizzenPage trizzen = new TrizzenPage(driver);
		trizzen.HandleDateAndTimeDroplist();
	}
	
	@AfterMethod // testNG annotation
	public void closeChromeDriver() {
		//driver.close();
	}
}
