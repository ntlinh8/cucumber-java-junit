package pageObjects;

import org.openqa.selenium.WebDriver;

import commons.BasePage;
import pageui.HomeUI;

public class HomePO  extends BasePage{
	private WebDriver driver;
	
	HomePO(WebDriver driver){
		this.driver = driver;
	}
	
	public String getWebcomeMessage() {
		waitForElementVisible(driver, HomeUI.MESSAGE);
		return getElementText(driver, HomeUI.MESSAGE);
	}

}
