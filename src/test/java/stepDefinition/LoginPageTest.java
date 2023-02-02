package stepDefinition;

import org.junit.Assert;

import com.OrangeHRM.TestBase.BaseClass;
import com.OrangeHRM.pages.DashBoardPage;
import com.OrangeHRM.pages.ForgetPasswordPage;
import com.OrangeHRM.pages.LoginPage;
import com.OrangeHRM.pages.OrangeHRMIncPage;

import io.cucumber.java.en.*;

public class LoginPageTest extends BaseClass {
	LoginPage loginPage;
	DashBoardPage dashBoardPage;
	ForgetPasswordPage forgetPWdPage;
	OrangeHRMIncPage hrmIncPage;

	public LoginPageTest() throws Exception {
		super();
	}

	@Given("user Open {string} browser and enter url")
	public void user_opening_browser_and_enter(String browserName) throws Exception {
		loginPage = new LoginPage();

	}

	@Then("user should navigates to the LoginPage")
	public void user_should_navigates_to_the_login_page() throws Exception {
		//loginPage = new LoginPage();

	}

	@Then("page Title should be {string}")
	public void page_title_should_be(String title) {
		String Lpagetitle = loginPage.verifyPageTitle();
		System.out.println(Lpagetitle);
		Assert.assertEquals(title, Lpagetitle);
	}

	@When("user enter valid {string} and valid {string} and click on login")
	public void user_enter_valid_and_valid_and_click_on_login(String username, String password) throws Exception {
		loginPage.verifyLogin(prop.getProperty("UserName"), prop.getProperty("Password"));
	}

	@Then("user should navigates to the DashBoard page")
	public void user_should_navigates_to_the_dash_board_page() throws Exception {
		dashBoardPage = new DashBoardPage();
	}

	@Then("DashBoard page title should be {string}")
	public void dashBoard_page_title_should_be(String tlt) {
		String title = driver.getTitle();
		Assert.assertEquals("DashBoard title Mosmatched", title, tlt);
	}

	@Then("OrangeHRM logo should displayed")
	public void orange_hrm_logo_should_displayed() {
		Assert.assertTrue("Logo not displayed", loginPage.verifyLogo());
	}

	@When("user click on forgerPassword link")
	public void user_click_on_forger_password_link() throws Exception {
		loginPage.verifyForgetPasswordLink();
	}

	@Then("User should navigates to the Forget Password page")
	public void user_should_navigates_to_the_forget_password_page() throws Exception {
		forgetPWdPage = new ForgetPasswordPage();
		String text = forgetPWdPage.validateResetPasswordText();
		Assert.assertEquals("Reset Password Test Not Displayed", text, "Reset Password");
	}

	@When("user click on OrangeHRM,Inc link")
	public void user_click_on_orange_hrm_inc_link() throws Exception {
		loginPage.verifyOrangeHRM_IncLik();
	}

	@Then("it should open new window and user should navigate to {string} Page")
	public void it_should_open_new_window_and_user_should_navigate_to_page(String pageTitle) throws Exception {
		hrmIncPage = new OrangeHRMIncPage();
		String title = hrmIncPage.verifyPageTitle();
		if (title.contains(pageTitle)) {
			System.out.println("Page title matches as expected");
		} else {
			Assert.assertFalse("Page Title Missmatched", false);
		}
	}


}
