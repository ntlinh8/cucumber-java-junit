package stepDefinations.Bankguru;

import org.openqa.selenium.WebDriver;

import commons.GlobalConstants;
import cucumber.api.java.en.When;
import cucumberOptions.Hooks;
import pageObjects.LoginPO;
import pageObjects.PageGeneratorManager;

public class LoginPageSteps {
	WebDriver driver;
	LoginPO loginPage;
	static String loginPageURL = GlobalConstants.BANK_GURU_LOGIN_URL;
	
	public LoginPageSteps() {
		driver = Hooks.openAndQuitBrowser();
		loginPage = PageGeneratorManager.getLoginPage(driver);
	}
	
	@When("^Input new username in the Username testbox$")
	public void inputNewUsernameInTheUsernameTestbox(){
		loginPage.inputToUserIDTextbox(RegisterPageSteps.username);
	}

	@When("^Input new password in the Password textbox$")
	public void inputNewPasswordInThePasswordTextbox(){
		loginPage.inputToPasswordTextbox(RegisterPageSteps.password);
	}

	@When("^Click Login button$")
	public void clickLoginButton(){
		loginPage.clickLoginButton();
	}


}
