package pageObjects;

import org.openqa.selenium.WebDriver;

import commons.BasePage;
import pageui.NewCustomerUI;

public class NewCustomerPO  extends BasePage{
	private WebDriver driver;
	
	NewCustomerPO(WebDriver driver){
		this.driver = driver;
	}

	public String getSheetByLabel(String fieldLabel) {
		waitForElementVisible(driver, NewCustomerUI.DYNAMIC_SHEET_BY_LABEL, fieldLabel);
		return getElementText(driver, NewCustomerUI.DYNAMIC_SHEET_BY_LABEL, fieldLabel);
	}
	
	public boolean isSuccessMessageDisplayedByValue(String value) {
		waitForElementVisible(driver, NewCustomerUI.SUCCESS_MESSAGE, value);
		return isElementDisplayed(driver, NewCustomerUI.SUCCESS_MESSAGE, value);
	}

	
}
