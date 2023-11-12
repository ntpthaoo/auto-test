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
	public void getLocatorByText() throws InterruptedException {
		Thread.sleep(2000);
		WebElement linkMayRuaChen = driver.findElement(By.linkText("Máy Rửa Chén Bát"));
		System.out.println("Locator của link máy rửa chén: "+linkMayRuaChen);
	
		WebElement textMayHutMui = driver.findElement(By.partialLinkText("Máy Hút Mùi Cổ Điển"));
		System.out.println("Locator của link máy hút mùi: "+textMayHutMui);

	}
	@Test
	public void getLocatorByClassName_TagName() throws InterruptedException {
		Thread.sleep(2000);
		WebElement checkboxXuatXu = driver.findElement(By.className("cursor-pointer"));
		System.out.println("Check box xuất xứ: "+checkboxXuatXu);
		WebElement input = driver.findElement(By.tagName("input"));
		System.out.println("Thẻ có tên input là: "+input);


	}
	@AfterMethod // testNG annotation
	public void closeChromeDriver() {
		driver.close();
	}
}
