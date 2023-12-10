package automation.common;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CommonBase {
	public WebDriver driver;
	public WebDriver initChromeDriver(String URL)
	{
		ChromeOptions options = new ChromeOptions();
		System.setProperty("webdriver.chrome.driver",
		System.getProperty("user.dir") + "\\driver\\chromedriver.exe");		
		driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.get(URL);
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		return driver;
	}
	private int initWaitTime = 10;
	public boolean isElementPresent(By locator) {
		try {
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(initWaitTime));
			wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
			return driver.findElement(locator).isDisplayed();
		} catch (org.openqa.selenium.NoSuchElementException e) {
			return false;
		} catch (org.openqa.selenium.TimeoutException e2) {
			return false;
		}
	}
	/*Handle Click
	 * Happy case/ Positive case: FindElement và Click thành công
	 * Unhappy case/ Negative case: 3 trường hợp
	 * 1. FindElement văng ra exception (xử lý đợi explicit wait cho hàm FindElement)
	 */
	public WebElement getElementPresentDOM(By locator) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(initWaitTime));
		wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
		return driver.findElement(locator);
	}
	/* Handle SenKeys
	 * Happy case: FindElement và sendKey thành công
	 * Unhappy case/ Negative case: 2 trường hợp
	 * 1. FindElement văng ra exception (xử lý đợi explicit wait cho hàm FindElement) => done bằng getElementPresentDOM
	 * */
	public void type(By locator, String value) {
		WebElement element = getElementPresentDOM(locator);
		element.clear();
		element.sendKeys(value);
	}
	public void click(By locator) {
		WebElement element = getElementPresentDOM(locator);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(initWaitTime));
		wait.until(ExpectedConditions.elementToBeClickable(locator));
		element.click();
	}
	// Handle Thread.sleep(miliSeconds);
	public void pause(long miliSeconds)
	{
		try {
			Thread.sleep(miliSeconds);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}
