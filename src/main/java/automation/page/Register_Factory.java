package automation.page;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import automation.constant.CT_Account;

public class Register_Factory {
	@FindBy (id="txtFirstname")
	WebElement txtFirstname;
	
	@FindBy (id="txtLoginUsername")
	WebElement txtLoginUsername;
	
	@FindBy (id="txtLoginPassword")
	WebElement txtLoginPassword;
	
	@FindBy (id="txtEmail")
	WebElement txtEmail;
	
	@FindBy (id="txtCEmail")
	WebElement txtCEmail;
	
	@FindBy (id="txtPassword")
	WebElement txtPassword;
	
	@FindBy (id="txtpassword")
	WebElement NowPassword;
	
	@FindBy (id="txtCPassword")
	WebElement txtCPassword;
	
	@FindBy (id="txtnewpass")
	WebElement txtnewpass;
	
	@FindBy (id="txtrenewpass")
	WebElement txtrenewpass;
	
	@FindBy (id="txtPhone")
	WebElement txtPhone;
	
	@FindBy (xpath ="//button[@class='btn_pink_sm fs16']")
	WebElement buttonRegister;
	
	@FindBy (xpath  ="//a[text()='Đăng Ký']")
	WebElement buttonDangKy;
	
	@FindBy (xpath  ="//a[text()='Đăng Nhập']")
	WebElement buttonDangNhap;
	
	@FindBy (xpath  ="//a[text()='Khóa học của tôi']")
	WebElement txtKhoaHoc;
	
	@FindBy (xpath  ="//i[@class='fa fa-caret-down']")
	WebElement userProfile;
	
	@FindBy (xpath  ="//button[contains(@class,'btn_submit')]")
	WebElement buttonLogIn;
	
	@FindBy (xpath  ="//a[text()='Chỉnh sửa thông tin']")
	WebElement btnChinhSua;
	
	@FindBy (xpath  ="//button[text()='Lưu mật khẩu mới']")
	WebElement btnSaveNewPass;
	
	@FindBy (xpath  ="//div[text()='Thông tin cá nhân']")
	WebElement thongtinCn;
	
	private WebDriver driver;
	
	public Register_Factory(WebDriver _driver) {
		this.driver = _driver;
		PageFactory.initElements(_driver, this);
		
	}
	public void Register(String txtname,String emailValue, String emailValue2 , String passValue, String passValue2, String phone) {
		buttonDangKy.click();
		txtFirstname.sendKeys(txtname);
		txtEmail.sendKeys(emailValue);
		txtCEmail.sendKeys(emailValue2);
		txtPassword.sendKeys(passValue);
		txtCPassword.sendKeys(passValue2);
		txtPhone.sendKeys(phone);
		buttonRegister.click();
		
	}
	public void LoginFunction(String emailValue, String passValue) {
		buttonDangNhap.click();
		txtLoginUsername.clear();
		txtLoginUsername.sendKeys(emailValue);

		txtLoginPassword.clear();
		txtLoginPassword.sendKeys(passValue);
			buttonLogIn.click();
		
	}
	
	public void ChangePassword(String passValue, String newpass, String ReNewPass) {
		userProfile.click();
		btnChinhSua.click();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();",btnSaveNewPass);
		NowPassword.sendKeys(passValue);
		txtnewpass.sendKeys(newpass);
		txtrenewpass.sendKeys(ReNewPass);
		btnSaveNewPass.click();
		//driver.switchTo().alert().accept();
		
	}
}
