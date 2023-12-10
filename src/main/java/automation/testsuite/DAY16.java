package automation.testsuite;

import static org.testng.Assert.assertEquals;
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

public class DAY16 extends CommonBase{
	@BeforeMethod
	public void openChrome() {
		driver = initChromeDriver(CT_Account.Demo_Guru99);
	}
	@Test
	public void deleteCustomerSuccessfully() {
		type(By.xpath("//input[@name='cusid']"),"1234");
		click(By.xpath("//input[@name='submit']"));
		String msgConfirm = driver.switchTo().alert().getText();
		assertEquals(msgConfirm, "Do you really want to delete this Customer?");
		driver.switchTo().alert().accept();
		String msgNoti = driver.switchTo().alert().getText();
		assertEquals(msgNoti, "Customer Successfully Delete!");


	}
	@AfterMethod // testNG annotation
	public void closeChromeDriver() {
		driver.close();
	}
	
}
