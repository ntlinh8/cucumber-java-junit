package pageObjects;

import org.openqa.selenium.WebDriver;

public class PageGeneratorManager {
	WebDriver driver;
	
	static public NewCustomerPO getNewCustomerPage(WebDriver driver) {
		return new NewCustomerPO(driver);
	}
	
	static public LoginPO getLoginPage(WebDriver driver) {
		return new LoginPO(driver);
	}
	
	static public HomePO getHomePage(WebDriver driver) {
		return new HomePO(driver);
	}
	
	static public RegisterPO getRegisterPage(WebDriver driver) {
		return new RegisterPO(driver);
	}
	
	static public CommonPageObject getCommonPageObject(WebDriver driver) {
		return new CommonPageObject(driver);
	}
	
}