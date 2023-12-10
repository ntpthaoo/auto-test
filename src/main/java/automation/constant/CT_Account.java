package automation.constant;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CT_Account {
	public static String RISE_URL ="https://alada.vn/tai-khoan/dang-ky.html";
	public static String Trizen_URL ="https://techydevs.com/demos/themes/html/trizen-demo/trizen/index.html";
	public static String Demo_Guru99 ="https://demo.guru99.com/test/delete_customer.php";
	public static String Demo_Automation ="https://demo.automationtesting.in/Alerts.html";
	public static String HW_DAY16 ="http://seleniumpractise.blogspot.com/2019/01/alert-demo.html";
	
	public static By TXT_EMAIL = By.id("email");
	public static By TXT_PASSWORD = By.id("password");
	public static By BUTTON_SIGNIN = By.xpath("//button[text()='Sign in']");
	public static By DASHBOARD_TEXT = By.xpath("//span[text()='Dashboard' and @class='menu-text ']");
	public static By AUTHENTICATION_ALERT = By.xpath("//div[normalize-space()='Authentication failed!']");
	public static By KHOA_HOC = By.xpath("//a[text()='Khóa học của tôi']");
	public static By SEARCH_RESULT = By.xpath("//h3[contains(normalize-space(),'Flights found')]");

}
