package stepDefinations.Bankguru;

import org.openqa.selenium.WebDriver;

import commons.DataHelper;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumberOptions.Hooks;
import junit.framework.Assert;
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
	
	@When("^Press tab in textbox by label \"([^\"]*)\"$")
	public void pressTabInTextboxByLabel(String textboxLabel) {
		commonPage.pressTabInTextboxByLabel(textboxLabel);
	}
	
	@When("^Press tab in textarea by label \"([^\"]*)\"$")
	public void pressTabInTextareaByLabel(String textareaLabel) {
		commonPage.pressTabInTextareaByLabel(textareaLabel);
	}
	
	@Then("^The error message displayed at \"([^\"]*)\" with value \"([^\"]*)\"$")
	public void theErrorMessageDisplayedInTextboxWithValue(String fieldLabel, String expectedText){
		Assert.assertEquals(commonPage.getErrorMessageByTextboxLabel(fieldLabel), expectedText);
	}
	
	@Then("^The textbox exist with label \"([^\"]*)\"$")
	public void theTextboxExistWithLabel(String fieldLabel){
		Assert.assertTrue(commonPage.isTextboxExistByLabel(fieldLabel));
	}

}
