package automation.testsuite;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.*;

import automation.common.CommonBase;

public class Day9_Pratice extends CommonBase{
	@BeforeMethod
	public void openChrome() {
		driver = initChromeDriver("https://bepantoan.vn/danh-muc/may-hut-mui");
	}
	@Test
	public void getLocator() {

		WebElement linkMayRuaChen = driver.findElement(By.linkText("Máy Rửa Chén Bát"));
		System.out.println("Locator của link máy rửa chén: "+linkMayRuaChen);
	
		WebElement textMayHutMui = driver.findElement(By.partialLinkText("Máy Hút Mùi Cổ Điển"));
		System.out.println("Locator của link máy hút mùi: "+textMayHutMui);

	}


	@AfterMethod // testNG annotation
	public void closeChromeDriver() {
		driver.close();
	}
}
