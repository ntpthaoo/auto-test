package automation.testsuite;

import static org.testng.Assert.assertEquals;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.*;

import automation.common.CommonBase;

public class Day17_2 extends CommonBase{
	@BeforeMethod
	public void openChrome() {
		driver = initChromeDriver("https://codestar.vn/");
	}
	@Test
	public void test_Dangky_iframe() {
		pause(5000);
		int totalIframe = driver.findElements(By.tagName("iframe")).size();
		for(int i =0; i < totalIframe; i++) {
			//Phương pháp tìm index của Iframe
			driver.switchTo().frame(i);
			int totalButtonGuiNgay = driver.findElements(By.xpath("//button[text()='Gửi ngay']")).size();
			System.out.println("totalButtonGuiNgay: "+totalButtonGuiNgay);
			//Nếu total khác 0 thì đang đứng tại iframe chứa element mong muốn cần thực thi
			if(totalButtonGuiNgay >0) {
	//			scrollToElement(By.xpath("//h2[text()='Khóa học']"));
				type(By.id("account_phone"),"0912365486");
				click(By.xpath("//button[text()='Gửi ngay']"));
				isElementPresent(By.xpath("//button[text()='Gửi ngay']"));
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
