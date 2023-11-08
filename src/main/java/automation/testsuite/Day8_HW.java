package automation.testsuite;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.*;

import automation.common.CommonBase;

public class Day8_HW extends CommonBase{
	@BeforeMethod
	public void openChrome() {
		driver = initChromeDriver("https://automationfc.github.io/basic-form/index.html");
	}
	@Test
	public void getLocatorByText() throws InterruptedException {
		WebElement Name = driver.findElement(By.id("name"));
		System.out.println("Locator của username: "+Name);
		System.out.println("Locator của username: "+driver.findElement(By.name("name")));

		WebElement Address = driver.findElement(By.id("address"));
		System.out.println("Locator của address: "+Address);
		System.out.println("Locator của address: "+driver.findElement(By.name("address")));


		WebElement email = driver.findElement(By.id("email"));
		System.out.println("Locator của email: "+email);
		System.out.println("Locator của email: "+driver.findElement(By.name("email")));

		
		WebElement password = driver.findElement(By.id("password"));
		System.out.println("Locator của password: "+password);
		System.out.println("Locator của password: "+driver.findElement(By.name("password")));


	}
	
	@AfterMethod // testNG annotation
	public void closeChromeDriver() {
		driver.close();
	}
}
