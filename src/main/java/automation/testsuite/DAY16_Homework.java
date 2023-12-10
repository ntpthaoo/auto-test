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

public class DAY16_Homework extends CommonBase{
	@BeforeMethod
	public void openChrome() {
		driver = initChromeDriver(CT_Account.HW_DAY16);
	}
	@Test
	public void ClickAlert() {
	
		click(By.xpath("//button[text()='Try it']"));
		pause(10000);
		String msgConfirm = driver.switchTo().alert().getText();
		assertEquals(msgConfirm, "Welcome to Selenium WebDriver Tutorials");
		driver.switchTo().alert().accept();



	}
	@AfterMethod // testNG annotation
	public void closeChromeDriver() {
		driver.close();
	}
	
}
