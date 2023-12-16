package automation.testsuite;

import static org.testng.Assert.assertEquals;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.*;

import automation.common.CommonBase;

public class Day17_BTVN extends CommonBase{
	@BeforeMethod
	public void openChrome() {
		driver = initChromeDriver("https://mediamart.vn/");
	}
	@Test
	public void Click() {
		isElementPresent(By.xpath("//div[contains(text(),'MEDIAMART.VN - Hotline')]"));
		int totalIframe = driver.findElements(By.xpath("//iframe[contains(@src,'widget.zalo.me')]")).size();
		for(int i =0; i < totalIframe; i++) {
			//Phương pháp tìm index của Iframe
			driver.switchTo().frame(i);
			System.out.println(3);

			int logo = driver.findElements(By.xpath("//div[@class='logo']")).size();
			System.out.println("Logo zalo: "+logo);
			//Nếu total khác 0 thì đang đứng tại iframe chứa element mong muốn cần thực thi
			if(logo >0) {
				click(By.xpath("//div[@class='logo']"));
				click(By.xpath("//div[text()='Chat nhanh']"));
				isElementPresent(By.xpath("//div[text()='Xin chào! Siêu thị điện máy MediaMart rất vui được hỗ trợ bạn.']"));
				//đóng iframe trước khi chuyển sang inframe kế tiếp
				driver.switchTo().defaultContent();

			}else
			driver.switchTo().defaultContent();

		}
	}
	

//	@AfterMethod // testNG annotation
//	public void closeChromeDriver() {
//		driver.close();
//	}
}
