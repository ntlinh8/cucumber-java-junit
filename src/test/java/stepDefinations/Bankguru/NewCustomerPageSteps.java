package stepDefinations.Bankguru;

import org.openqa.selenium.WebDriver;

import cucumber.api.java.en.Then;
import cucumberOptions.Hooks;
import junit.framework.Assert;
import pageObjects.NewCustomerPO;
import pageObjects.PageGeneratorManager;

public class NewCustomerPageSteps {
	WebDriver driver;
	NewCustomerPO newCustomerPage;
	
	public NewCustomerPageSteps() {
		driver = Hooks.openAndQuitBrowser();
		newCustomerPage = PageGeneratorManager.getNewCustomerPage(driver);
	}

	@Then("^Success message displayed with \"([^\"]*)\"$")
	public void successMessageDisplayedWith(String value){
		Assert.assertTrue(newCustomerPage.isSuccessMessageDisplayedByValue(value));
	}

	@Then("^The valid text displayed at \"([^\"]*)\" with value \"([^\"]*)\"$")
	public void theValidTextDisplayedInTextboxWithValue(String fieldLabel, String expectedText){
		if(fieldLabel.equals("Email")) {
			expectedText = CommonPageSteps.email;
		}
		Assert.assertEquals(newCustomerPage.getSheetByLabel(fieldLabel), expectedText);
	}
}
