package stepDefinations.Bankguru;

import org.openqa.selenium.WebDriver;

import commons.DataHelper;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumberOptions.Hooks;
import pageObjects.PageGeneratorManager;
import pageObjects.RegisterPO;

public class RegisterPageSteps {
	WebDriver driver;
	private RegisterPO registerPage;
	private DataHelper dataHelper;
	private String email;
	public static String username, password;
	
	public RegisterPageSteps() {
		driver = Hooks.openAndQuitBrowser();
		registerPage = PageGeneratorManager.getRegisterPage(driver);
		dataHelper = DataHelper.getDataHelper();
		email = dataHelper.getEmailAddress();
	}
	
	@Given("^Send your email$")
	public void sendYourEmail(){
		registerPage.inputEmailToEmailTextbox(email);
	}

	@Given("^Click Submit button$")
	public void clickSubmitButton(){
		registerPage.clickToSubmitButton();
	    
	}

	@Given("^Get new username and new password$")
	public void getNewUsernameAndNewPassword(){
		username = registerPage.getNewUsername();
		password = registerPage.getNewPassword();
	}
	
	@When("^Open Login page$")
	public void openLoginPage(){
		registerPage.openPageByURL(LoginPageSteps.loginPageURL);
	}
}
