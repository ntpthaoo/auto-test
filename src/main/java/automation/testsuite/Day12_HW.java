package automation.testsuite;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.*;

import automation.common.CommonBase;

public class Day12_HW extends CommonBase{
	@BeforeMethod
	public void openChrome() {
		driver = initChromeDriver("http://demo.seleniumeasy.com/input-form-demo.html");
	}
	@Test
	public void ClickOnState() {
		WebElement selectState = driver.findElement(By.xpath("//select[@name='state']"));
		Select dropdownlist = new Select(selectState);
		selectState.click();
		System.out.println("dropdownlist.isMultiple: " +dropdownlist.isMultiple());
		System.out.println("dropdownlist.size: " +dropdownlist.getOptions().size());
		
				dropdownlist.selectByVisibleText("New York");
				System.out.println("dropdownlist option is: " +dropdownlist.getFirstSelectedOption().getText());
		
	}
	@Test
	public void ClickOnRadio()  {

		WebElement rdY = driver.findElement(By.xpath("//input[@value='yes']"));
		WebElement rdN = driver.findElement(By.xpath("//input[@value='no']"));
		System.out.println("Trạng thái của radio Male là: "+rdY.isSelected());
		System.out.println("Trạng thái của radio Female là: "+rdN.isSelected());

		if(rdY.isEnabled()==true && rdY.isSelected()==false) {
			rdY.click();
		}

		}

	@AfterMethod // testNG annotation
	public void closeChromeDriver() {
		driver.close();
	}
}
