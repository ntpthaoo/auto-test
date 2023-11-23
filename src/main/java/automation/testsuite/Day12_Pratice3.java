package automation.testsuite;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.*;

import automation.common.CommonBase;

public class Day12_Pratice3 extends CommonBase{
	@BeforeMethod
	public void openChrome() {
		driver = initChromeDriver("https://demo.seleniumeasy.com/basic-select-dropdown-demo.html");
	}
	@Test
	public void ClickOnRadio() throws InterruptedException {
		WebElement selectTag = driver.findElement(By.id("select-demo"));
		Select dropdownlist = new Select(selectTag);
		selectTag.click();
		System.out.println("dropdownlist.isMultiple: " +dropdownlist.isMultiple());
		System.out.println("dropdownlist.size: " +dropdownlist.getOptions().size());

		// chọn sunday bằng cách value
		dropdownlist.selectByValue("Sunday");
		System.out.println("dropdownlist first option is: " +dropdownlist.getFirstSelectedOption().getText());
		Thread.sleep(2000);
		
		//chọn Monday bằng cách Visible text
		selectTag.click();
		dropdownlist.selectByVisibleText("Monday");
		System.out.println("dropdownlist first option is: " +dropdownlist.getFirstSelectedOption().getText());

		Thread.sleep(2000);
		//chọn Tuesday bằng cách Index 
		selectTag.click();
		dropdownlist.selectByIndex(3);
		System.out.println("dropdownlist first option is: " +dropdownlist.getFirstSelectedOption().getText());





		

	}


	@AfterMethod // testNG annotation
	public void closeChromeDriver() {
		driver.close();
	}
}
