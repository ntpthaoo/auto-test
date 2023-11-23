package automation.testsuite;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.*;

import automation.common.CommonBase;

public class Day12_Pratice extends CommonBase{
	@BeforeMethod
	public void openChrome() {
		driver = initChromeDriver("https://demo.seleniumeasy.com/basic-radiobutton-demo.html");
	}
	@Test
	public void ClickOnRadio() {
		// Kiểm tra giá trị mặc định của radio Male và Female là chưa check
		WebElement rdMale = driver.findElement(By.xpath("//input[@value='Male']"));
		WebElement rdFemale = driver.findElement(By.xpath("//input[@value='Female']"));
		System.out.println("Trạng thái của radio Male là: "+rdMale.isSelected());
		System.out.println("Trạng thái của radio Female là: "+rdFemale.isSelected());
		//Kiểm tra radio chưa được check thì click vào
		if(rdMale.isEnabled()==true && rdMale.isSelected()==false) {
			rdMale.click();


		}else if(rdFemale.isEnabled()==true && rdFemale.isSelected()==false) {
			rdFemale.click();


		}

	}


	@AfterMethod // testNG annotation
	public void closeChromeDriver() {
		driver.close();
	}
}
