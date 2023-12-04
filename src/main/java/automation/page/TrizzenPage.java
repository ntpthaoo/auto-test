package automation.page;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import automation.constant.CT_Account;

public class TrizzenPage {
	
	@FindBy(xpath="(//label[text()='Departing'])[1]/following-sibling::div/input")
	WebElement textDepartingDate;
	
	@FindBy(xpath="(//label[text()='Passengers'])[1]/following-sibling::div/div")
	WebElement dropboxPassenger;
	
	@FindBy(xpath = "(//label[text()='Adults'])[1]/following-sibling::div//i[@class='la la-plus']")
	WebElement addAdult;
	 
	private WebDriver driver;
	public TrizzenPage(WebDriver _driver) {
		this.driver = _driver;
		PageFactory.initElements(_driver, this);
	}
	public void HandleDateAndTimeDroplist() throws InterruptedException  {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].removeAttribute('readonly', 'readonly')", textDepartingDate);	
		textDepartingDate.clear();
		textDepartingDate.sendKeys("01042024");
		textDepartingDate.sendKeys(Keys.TAB);
		Thread.sleep(3000);
		dropboxPassenger.click();
		Thread.sleep(3000);

		addAdult.click();
	}
}
