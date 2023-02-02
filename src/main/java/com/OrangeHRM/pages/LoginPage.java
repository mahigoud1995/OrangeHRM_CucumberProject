package com.OrangeHRM.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.OrangeHRM.TestBase.BaseClass;

public class LoginPage extends BaseClass {
	
	//Define the all WebElements in the Login Page 
	
	@FindBy(xpath="//div[@class='orangehrm-login-branding']/img")
	private WebElement HRMImage;

	@FindBy(name="username")
	private WebElement username;
	
	@FindBy(name="password")
	private WebElement password;
	
	@FindBy(xpath="//button[@type='submit']")
	private WebElement loginBtn;
		
	@FindBy(xpath="//div[@class='orangehrm-login-forgot']")
	private WebElement forgetPasswordLink;
	
	@FindBy(xpath="//div[@class='orangehrm-login-logo-mobile']")
	private WebElement LoginText;
	
	
	//*************************** Footer Elements *************************************//
	
	@FindBy(xpath="//p[contains(text(), 'OrangeHRM OS')]")
	private WebElement OrangeHRMVersion;
	
	@FindBy(xpath="//a[contains(text(), 'OrangeHRM')]")
	private WebElement OrangeHRMIncLink;
	
	
	public LoginPage() throws Exception {
		PageFactory.initElements(driver, this);
	}
	

	//************************** Creating methods **************************//
	public String verifyPageTitle() {
		return driver.getTitle();
	}
	
	public DashBoardPage verifyLogin(String Username, String Password) throws Exception {
		username.sendKeys(Username);
		password.sendKeys(Password);
		loginBtn.click();
		return new DashBoardPage();
	}
	
	public boolean verifyLogo() {
		WebDriverWait wait= new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOf(HRMImage));
		
		return HRMImage.isDisplayed();
	}
	
	public ForgetPasswordPage verifyForgetPasswordLink() throws Exception {
		forgetPasswordLink.click();
		return new ForgetPasswordPage();
	}
	
	public OrangeHRMIncPage verifyOrangeHRM_IncLik() throws Exception {
		OrangeHRMIncLink.click();
		return new OrangeHRMIncPage();
	}
}
