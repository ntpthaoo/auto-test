package automation.testsuite;

import static org.testng.Assert.assertEquals;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.*;

import automation.common.CommonBase;

public class Day18_BTVN2 extends CommonBase{
	@Parameters("browser")
	@BeforeMethod
	public void openChrome(@Optional("chrome")String browser) {
		//driver = initChromeDriver("https://mediamart.vn/");
		setupDriver(browser);
		driver.get("https://bepantoan.vn/");
	}
	@Test
	public void ClickonChat() {
		isElementPresent(By.xpath("//span[contains(text(),'Chat với')]"));
		click(By.xpath("//span[contains(text(),'Chat với')]"));
		Set<String> listWindows = driver.getWindowHandles();
		String mainWindow = driver.getWindowHandle();
		for (String childWindow : listWindows) {
			if(!childWindow.equalsIgnoreCase(mainWindow)) {
				driver.switchTo().window(childWindow);
				assertEquals(driver.getCurrentUrl(), "https://zalo.me/0912331335");
				
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

