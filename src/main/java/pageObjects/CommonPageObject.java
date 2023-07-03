package pageObjects;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import commons.BasePage;
import pageui.CommonUI;

public class CommonPageObject extends BasePage{
	private WebDriver driver;

	CommonPageObject(WebDriver driver) {
		this.driver = driver;
	}

	public void clickToMenuByLabel(String label) {
		waitForElementClickable(driver, CommonUI.LEFT_MENU_BY_LABEL, label);
		clickToElement(driver, CommonUI.LEFT_MENU_BY_LABEL, label);
	}
	
	public void inputToTextboxByLabel(String fieldLabel, String value) {
		waitForElementVisible(driver, CommonUI.DYNAMIC_TEXTBOX_BY_LABEL, fieldLabel);
		if(fieldLabel.equals("Date of Birth")) {
			removeAttributeInDOM(driver, CommonUI.DYNAMIC_TEXTBOX_BY_LABEL, "type", fieldLabel);
		}
		sendkeyToElement(driver, CommonUI.DYNAMIC_TEXTBOX_BY_LABEL, value, fieldLabel);
	}
	
	public void inputToTextareaByLabel(String fieldLabel, String value) {
		waitForElementVisible(driver, CommonUI.DYNAMIC_TEXTAREA_BY_LABEL, fieldLabel);
		sendkeyToElement(driver, CommonUI.DYNAMIC_TEXTAREA_BY_LABEL, value, fieldLabel);
	}
	
	public void clickToRadioButtonByValue(String value) {
		waitForElementClickable(driver, CommonUI.DYNAMIC_RADIOBUTTON_BY_VALUE, value);
		clickToElement(driver, CommonUI.DYNAMIC_RADIOBUTTON_BY_VALUE, value);
	}
	
	public void clickToButtonByValue(String value) {
		waitForElementClickable(driver, CommonUI.DYNAMIC_BUTTON_BY_VALUE, value);
		clickToElement(driver, CommonUI.DYNAMIC_BUTTON_BY_VALUE, value);
	}

	public void pressTabInTextboxByLabel(String textboxLabel) {
		pressKeyToElement(driver, CommonUI.DYNAMIC_TEXTBOX_BY_LABEL, Keys.TAB, textboxLabel);
		SleepInSecond(2);
	}
	
	public void pressTabInTextareaByLabel(String textareaLabel) {
		pressKeyToElement(driver, CommonUI.DYNAMIC_TEXTAREA_BY_LABEL, Keys.TAB, textareaLabel);
		SleepInSecond(2);
	}

	public String getErrorMessageByTextboxLabel(String fieldLabel) {
		waitForElementVisible(driver, CommonUI.DYNAMIC_ERROR_MESSAGE_BY_LABEL, fieldLabel);
		return getElementText(driver, CommonUI.DYNAMIC_ERROR_MESSAGE_BY_LABEL, fieldLabel);
	}

	public boolean isTextboxExistByLabel(String fieldLabel) {
		waitForElementVisible(driver, CommonUI.CUSTOMER_FIELD_LABEL, fieldLabel);
		return isElementDisplayed(driver, CommonUI.CUSTOMER_FIELD_LABEL, fieldLabel);
	}

}
