package automation.constant;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CT_Account {
	public static String RISE_URL ="https://rise.fairsketch.com/signin";
	public static String Trizen_URL ="https://techydevs.com/demos/themes/html/trizen-demo/trizen/index.html";

	public static By TXT_EMAIL = By.id("email");
	public static By TXT_PASSWORD = By.id("password");
	public static By BUTTON_SIGNIN = By.xpath("//button[text()='Sign in']");
	public static By DASHBOARD_TEXT = By.xpath("//span[text()='Dashboard' and @class='menu-text ']");
	public static By AUTHENTICATION_ALERT = By.xpath("//div[normalize-space()='Authentication failed!']");
	public static By KHOA_HOC = By.xpath("//a[text()='Khóa học của tôi']");

}
