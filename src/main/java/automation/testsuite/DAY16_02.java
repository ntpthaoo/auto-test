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

public class DAY16_02 extends CommonBase{
	@BeforeMethod
	public void openChrome() {
		driver = initChromeDriver(CT_Account.Demo_Automation);
	}
	@Test
	public void ClickAlert() {
		click(By.xpath("//a[text()='Alert with Textbox ']"));
		click(By.xpath("//button[@class='btn btn-info']"));
		driver.switchTo().alert().sendKeys("Hello");
		driver.switchTo().alert().accept();
		assertTrue(isElementPresent(By.xpath("//p[text()='Hello Hello How are you today']")));

	}
	@AfterMethod // testNG annotation
	public void closeChromeDriver() {
		driver.close();
	}
	
}
