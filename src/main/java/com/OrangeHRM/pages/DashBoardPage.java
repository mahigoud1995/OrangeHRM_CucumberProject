package com.OrangeHRM.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.OrangeHRM.TestBase.BaseClass;

public class DashBoardPage extends BaseClass{
	
	public DashBoardPage() throws Exception {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//span[@class='oxd-topbar-header-breadcrumb']")
	private WebElement DashBoardText;
	
	@FindBy(xpath="//div[@class='oxd-brand-banner']/img[@alt='client brand banner']")
	private WebElement OrangeHRmLogo;
	
	@FindBy(xpath="//img[@class='oxd-userdropdown-img']")
	private WebElement UserProfilePicture;
	
	@FindBy(xpath="//img[@class='oxd-userdropdown-img']/following-sibling::p[@class='oxd-userdropdown-name']")
	private WebElement UserNameLabel;
	
	@FindBy(xpath="//input[@class='oxd-input oxd-input--active']")
	private WebElement SearchBox;
		
	@FindBy(xpath="//ul[@class='oxd-dropdown-menu']/li/a[text()='About']")
	private WebElement AboutLink;
	
	@FindBy(xpath="//ul[@class='oxd-dropdown-menu']/li/a[text()='Change Password']")
	private WebElement ChangePasswordLink;
	
	@FindBy(xpath="//ul[@class='oxd-dropdown-menu']/li/a[text()='Support']")
	private WebElement SupportLink;
	
	@FindBy(xpath="//ul[@class='oxd-dropdown-menu']/li/a[text()='Logout']")
	private WebElement LogoutLink;
	

	
	public String verifyDashBoardText() {
		return DashBoardText.getText();
	}
}
