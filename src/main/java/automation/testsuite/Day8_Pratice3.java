package automation.testsuite;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.*;

import automation.common.CommonBase;

public class Day8_Pratice3 extends CommonBase{
	@BeforeMethod
	public void openChrome() {
		driver = initChromeDriver("https://selectorshub.com/xpath-practice-page/");
	}
	@Test
	public void getLocatorByText() throws InterruptedException {
		WebElement username = driver.findElement(By.id("userId"));
		System.out.println("Locator của username: "+username);
	
		WebElement password = driver.findElement(By.id("pass"));
		System.out.println("Locator của password: "+password);

		WebElement company = driver.findElement(By.name("company"));
		System.out.println("Locator của company: "+company);
		
		WebElement mobile_number = driver.findElement(By.name("mobile number"));
		System.out.println("Locator của mobile number: "+mobile_number);
		

	}
	
	@AfterMethod // testNG annotation
	public void closeChromeDriver() {
		driver.close();
	}
}
