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
	
	@FindBy(xpath="//a[@id='one-way-tab']")
	WebElement rdoOneWay;
	
	@FindBy(xpath="//label[text()='Flying from']/ancestor::div[@class='input-box']/descendant::input[@placeholder='City or airport']")
	WebElement txtFlyingFrom;
	
	@FindBy(xpath="//label[text()='Flying to']/following-sibling::div[@class='form-group']/child::input[@placeholder='City or airport']")
	WebElement txtFlyingTo;
	
	@FindBy(xpath="//label[text()='Coach']/following-sibling::div/descendant::button")
	WebElement txtCoach;
	
	@FindBy(xpath="(//label[text()='Passengers'])[1]/following-sibling::div/div")
	WebElement dropboxPassenger;
	
	@FindBy(xpath = "(//label[text()='Adults'])[1]/following-sibling::div//i[@class='la la-plus']")
	WebElement addAdult;
	
	@FindBy(xpath = "//a[text()='Search Now']")
	WebElement btnSearch;
	
	@FindBy(xpath = "//span[text()='Economy']")
	WebElement txtEconomy;
	 
	@FindBy(xpath = "//h3[contains(normalize-space(),'Flights found')]")
	WebElement SearchResult;
	
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
	public void Search() throws InterruptedException  {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click", rdoOneWay);
		//rdoOneWay.click();
		txtFlyingFrom.sendKeys("Hà Nội");
		txtFlyingTo.sendKeys("London");
		//JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].removeAttribute('readonly', 'readonly')", textDepartingDate);	
		textDepartingDate.clear();
		textDepartingDate.sendKeys("01042024");
		textDepartingDate.sendKeys(Keys.TAB);
		Thread.sleep(3000);
		dropboxPassenger.click();
		Thread.sleep(3000);
		addAdult.click();
		txtCoach.click();
		txtEconomy.click();
		btnSearch.click();
	}
}
