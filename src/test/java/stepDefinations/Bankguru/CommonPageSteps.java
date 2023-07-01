package stepDefinations.Bankguru;

import org.openqa.selenium.WebDriver;

import commons.DataHelper;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumberOptions.Hooks;
import pageObjects.CommonPageObject;
import pageObjects.PageGeneratorManager;

public class CommonPageSteps {
	WebDriver driver;
	CommonPageObject commonPage;
	DataHelper dataHelper;
	static String email;
	
	public CommonPageSteps() {
		driver = Hooks.openAndQuitBrowser();
		commonPage = PageGeneratorManager.getCommonPageObject(driver);
		dataHelper = DataHelper.getDataHelper();
		email = dataHelper.getEmailAddress();
	}

	@Given("^Open \"([^\"]*)\" page$")
	public void openPage(String menuLabel){
		commonPage.clickToMenuByLabel(menuLabel);
	}

	@When("^Input to \"([^\"]*)\" textbox with value \"([^\"]*)\"$")
	public void inputToTextboxWithValue(String fieldLabel, String value){
		if(fieldLabel.equals("E-mail")) {
			value = email;
		}
		commonPage.inputToTextboxByLabel(fieldLabel, value);
	}
	
	@When("^Input to \"([^\"]*)\" textarea with value \"([^\"]*)\"$")
	public void inputToTextareaWithValue(String fieldLabel, String value){
		commonPage.inputToTextareaByLabel(fieldLabel, value);
	}

	@When("^Click to \"([^\"]*)\" radio button$")
	public void clickToRadioButton(String value){
		commonPage.clickToRadioButtonByValue(value);
	}

	@When("^Click to \"([^\"]*)\" button$")
	public void clickToButton(String value){
		commonPage.clickToButtonByValue(value);
	}

}
