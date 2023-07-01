package pageui;

public class CommonUI {
	public static final String LEFT_MENU_BY_LABEL = "xpath=//ul[@class='menusubnav']//a[text()='%s']";
	public static final String DYNAMIC_TEXTBOX_BY_LABEL = "xpath=//td[text()='%s']/following-sibling::td/input";
	public static final String DYNAMIC_TEXTAREA_BY_LABEL = "xpath=//td[text()='%s']/following-sibling::td/textarea";
	public static final String DYNAMIC_RADIOBUTTON_BY_VALUE = "xpath=//input[@value='%s']";
	public static final String DYNAMIC_BUTTON_BY_VALUE = "xpath=//input[@value='%s']";
}

