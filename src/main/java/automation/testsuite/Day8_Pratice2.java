package automation.testsuite;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.*;

import automation.common.CommonBase;

public class Day8_Pratice2 extends CommonBase{
	@BeforeTest
	public void openChrome() {
		driver = initChromeDriver("https://rise.fairsketch.com/signin");
	}
	@Test
	public void getLocatorById() {
		WebElement email = driver.findElement(By.id("email"));
		System.out.println("Email element is: "+email);
		WebElement pass = driver.findElement(By.id("password"));
		System.out.println("Password element is: "+pass);
		WebElement buttonSignIn = driver.findElement(By.className("btn-primary"));
		System.out.println("Button signin element is: "+buttonSignIn);

	}
	@AfterMethod // testNG annotation
	public void closeChromeDriver() {
		driver.close();
	}
}
