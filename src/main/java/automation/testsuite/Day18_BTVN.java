package automation.testsuite;

import static org.testng.Assert.assertEquals;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.*;

import automation.common.CommonBase;

public class Day18_BTVN extends CommonBase{
	@Parameters("browser")
	@BeforeMethod
	public void openChrome(@Optional("chrome")String browser) {
		//driver = initChromeDriver("https://mediamart.vn/");
		setupDriver(browser);
		driver.get("https://dienmaynhapkhaugiare.com.vn/");
	}
	@Test
	public void ClickonZalo() {
		isElementPresent(By.xpath("//img[@alt='Zalo']"));
		click(By.xpath("//img[@alt='Zalo']"));
		Set<String> listWindows = driver.getWindowHandles();
		String mainWindow = driver.getWindowHandle();
		for (String childWindow : listWindows) {
			if(!childWindow.equalsIgnoreCase(mainWindow)) {
				driver.switchTo().window(childWindow);
				assertEquals(driver.getCurrentUrl(), "https://zalo.me/0988169282");
				driver.close();
				
			}
		}
		driver.switchTo().window(mainWindow);

	}
	
}

	
	

//	@AfterMethod // testNG annotation
//	public void closeChromeDriver() {
//		driver.close();
//	}

