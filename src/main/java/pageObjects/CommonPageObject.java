package pageObjects;

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

}
