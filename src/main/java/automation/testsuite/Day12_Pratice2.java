package automation.testsuite;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.*;

import automation.common.CommonBase;

public class Day12_Pratice2 extends CommonBase{
	@BeforeMethod
	public void openChrome() {
		driver = initChromeDriver("https://demo.seleniumeasy.com/basic-checkbox-demo.html");
	}
	@Test
	public void ClickOnCheckbox() {
		// Kiểm tra sau khi page mở thì Default checked đã được checkk
		WebElement defaultChecked = driver.findElement(By.xpath("//label[normalize-space()='Default Checked']/descendant::input"));
		boolean status = defaultChecked.isSelected();
		System.out.println("Status is: "+status);
	
		// Kiểm tra sau khi page mở thì Default checked đã được checkk
		WebElement clickOnthis = driver.findElement(By.xpath("//label[normalize-space()='Click on this check box']"));
		if(clickOnthis.isSelected()==false) {
			clickOnthis.click();
			System.out.println("check box click in this checckbox was checked");

			}
		//lất xpath của default disabled, tìm element này, element.isEnabled(); element.isDisplay()

	}
	@Test
	public void ClickOnMultiCB() {
		List<WebElement> listCB;
		listCB= driver.findElements(By.xpath("//div[text()='Multiple Checkbox Demo']/following-sibling::div[@class='panel-body']/child::div[@class='checkbox']//input"));
	 for(int i=0; i < listCB.size();i++) {
		 WebElement checkbox = listCB.get(i);
		 if(checkbox.isSelected()==false) {
			 checkbox.click();
			 System.out.println("Check box thứ " +(i+1)+ " đã được check");
		 }
	 }
		
}

	@AfterMethod // testNG annotation
	public void closeChromeDriver() {
		driver.close();
	}
}
