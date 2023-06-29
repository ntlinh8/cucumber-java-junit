package stepDefinations.Bankguru;

import org.openqa.selenium.WebDriver;

import cucumber.api.java.en.Then;
import cucumberOptions.Hooks;
import junit.framework.Assert;
import pageObjects.HomePO;
import pageObjects.PageGeneratorManager;

public class HomePageSteps {
	WebDriver driver;
	HomePO homePage;
	
	public HomePageSteps() {
		driver = Hooks.openAndQuitBrowser();
		homePage = PageGeneratorManager.getHomePage(driver);
	}
	
	@Then("^Verify the message \"([^\"]*)\" is displayed$")
	public void verifyTheMessageIsDisplayed(String message){
		Assert.assertEquals(homePage.getWebcomeMessage(), message);
	}
}
