package automation.page;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import automation.constant.CT_Account;

public class LoginPage_Factory {
	@FindBy (id="email")
	WebElement textEmail;
	
	@FindBy (id="password")
	WebElement textPassword;
	
	@FindBy (xpath="//button[text()='Sign in']")
	WebElement buttonLogIn;
	
	@FindBy (xpath="//a[@id='user-dropdown']")
	WebElement linkAvatar;
	
	@FindBy (xpath="//a[text()=' Sign Out']")
	WebElement btnSignOut;
	
	private WebDriver driver;
	
	public LoginPage_Factory(WebDriver _driver) {
		this.driver = _driver;
		PageFactory.initElements(_driver, this);
		
	}
	public void LoginFunction(String emailValue, String passValue) {
		textEmail.clear();
		textEmail.sendKeys(emailValue);

			textPassword.clear();
			textPassword.sendKeys(passValue);
	
			buttonLogIn.click();
		
	}
	
	public void LogoutFunction(String emailValue, String passValue) {
		LoginFunction(emailValue,passValue);
		linkAvatar.click();
	
		btnSignOut.click();
		
	}
}
