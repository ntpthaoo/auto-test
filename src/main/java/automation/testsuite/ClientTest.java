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

public class ClientTest extends CommonBase{
	@BeforeMethod
	public void openChrome() {
		driver = initChromeDriver(CT_Account.RISE_URL);
	}
	@Test(priority =1)
	public void AddClientSuccessfully() throws InterruptedException  {
		LoginPage_Factory login = new LoginPage_Factory(driver);
		login.LoginFunction("admin@demo.com", "riseDemo");
		Thread.sleep(3000);
		ClientPage client = new ClientPage(driver);
		client.AddClientFunction("thaontp", "Sara Ann");
		Thread.sleep(2000);

		assertTrue(driver.findElement(By.xpath("//a[text()='thaontp']")).isDisplayed());
	}
	
	@AfterMethod // testNG annotation
	public void closeChromeDriver() {
		//driver.close();
	}
}
