package automation.page;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import automation.constant.CT_Account;

public class ClientPage {
	
	@FindBy(xpath="//span[text()='Clients']")
	WebElement clientLinks; 
	
	@FindBy(xpath="//a[@data-title='Add client']")
	WebElement clientBtn;
	
	@FindBy(id="type_person")
	WebElement radioPerson;

	@FindBy(id="company_name")
	WebElement textboxClientname;
	
	@FindBy(id="company_name")
	WebElement companyname;
	
	 @FindBy(xpath="//label[normalize-space()='Owner'])[2]/following-sibling::input")
	WebElement txtOwner;
	 
	 @FindBy(xpath="//ul[@id='select2-results-3']//div[text()='Sara Ann']")
		WebElement ownerItem;
	 
	 @FindBy(id="s2id_created_by")
		WebElement Owner_dropdownlist;
	 
	 @FindBy(xpath="//button[@type='submit' and normalize-space()='Save']")
		WebElement buttonSave;
	 
	 @FindBy(xpath="//input[@type='search' and @placeholder='Search']")
		WebElement buttonSearch;
	 
		@FindBy(xpath="//a[text()='Clients']")
		WebElement clientTabs; 
	 
	private WebDriver driver;
	public ClientPage(WebDriver _driver) {
		this.driver = _driver;
		PageFactory.initElements(_driver, this);
	}
	public void AddClientFunction(String companyname, String Owner) throws InterruptedException {

		clientLinks.click();
		clientBtn.click();
		Thread.sleep(3000);
		radioPerson.click();
//		Owner_dropdownlist.click();
		textboxClientname.sendKeys(companyname);
		Owner_dropdownlist.click();
		ownerItem.click();
		//txtOwner.sendKeys(Keys.TAB);
		buttonSave.click();
		//Assert Client
		JavascriptExecutor js = (JavascriptExecutor) driver;
	    js.executeScript("arguments[0].click();", clientTabs);
		Thread.sleep(2000);
		buttonSearch.sendKeys(companyname);
	}
}
