package pageObjects;

import org.openqa.selenium.WebDriver;

import commons.BasePage;
import pageui.RegisterUI;

public class RegisterPO  extends BasePage{
	private WebDriver driver;
	
	RegisterPO(WebDriver driver){
		this.driver = driver;
	}
	
	public void inputEmailToEmailTextbox(String email) {
		waitForElementVisible(driver, RegisterUI.EMAIL_TEXTBOX);
		sendkeyToElement(driver, RegisterUI.EMAIL_TEXTBOX, email);
	}
	
	public void clickToSubmitButton() {
		waitForElementClickable(driver, RegisterUI.SUBMIT_BUTTON);
		clickToElement(driver, RegisterUI.SUBMIT_BUTTON);
	}
	
	public String getNewUsername() {
		waitForElementVisible(driver, RegisterUI.USERID_TEXT);
		return getElementText(driver, RegisterUI.USERID_TEXT).trim();
	}
	
	public String getNewPassword() {
		waitForElementVisible(driver, RegisterUI.PASSWORD_TEXT);
		return getElementText(driver, RegisterUI.PASSWORD_TEXT).trim();
	}
	
	public void openPageByURL(String url) {
		openPageUrl(driver, url);
	}
}
