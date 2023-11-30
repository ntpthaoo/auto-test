package automation.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import automation.constant.CT_Account;

public class LoginPage {
	private WebDriver driver;
	public LoginPage(WebDriver _driver) {
		this.driver = _driver;
	}
	public void LoginFunction(String emailValue, String passValue) {
		WebElement email = driver.findElement(CT_Account.TXT_EMAIL);
		if(email.isEnabled()) {
			email.clear();
			email.sendKeys(emailValue);
		}
		WebElement password = driver.findElement(CT_Account.TXT_PASSWORD);
		if(password.isEnabled()) {
			password.clear();
			password.sendKeys(passValue);
		}
		WebElement signin = driver.findElement(CT_Account.BUTTON_SIGNIN);
		if(signin.isEnabled()) {
			signin.click();
		}
	}
}
