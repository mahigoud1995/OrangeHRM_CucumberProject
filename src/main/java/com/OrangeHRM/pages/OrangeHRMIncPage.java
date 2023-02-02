package com.OrangeHRM.pages;

import org.openqa.selenium.support.PageFactory;

import com.OrangeHRM.TestBase.BaseClass;

public class OrangeHRMIncPage extends BaseClass{
	
	public OrangeHRMIncPage() throws Exception{
		PageFactory.initElements(driver, this);
	}

	public String verifyPageTitle() {
		return driver.getTitle();
	}

}
