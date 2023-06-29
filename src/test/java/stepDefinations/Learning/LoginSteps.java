package stepDefinations.Learning;

import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.DataTable;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class LoginSteps {
	WebDriver driver;
	String projectPath = System.getProperty("user.dir");
	
	@Before
	public void openBankGurupage() {
		System.setProperty("webdriver.gecko.driver", projectPath + "\\src\\main\\resources\\browserDrivers\\geckodriver.exe");
		driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://demo.guru99.com/v4/index.php");
	}
	
	@After
	public void closebrowser() {
	    driver.quit();
	}

	@When("^Get current url$")
	public void getcurrenturl() {
		Assert.assertEquals(driver.getCurrentUrl(), "https://demo.guru99.com/v4/index.php");
	}
	
	@When("^Enter username to Username textbox$")
	public void enterUsernameToUsernameTextbox(){
		driver.findElement(By.xpath("//input[@name='uid']")).sendKeys("mngr508569");
	}

	@When("^Enter password to Password textbox$")
	public void enterPasswordToPasswordTextbox(){
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("ejeseda");
	}

	@When("^Enter \"([^\"]*)\" to Username textbox$")
	public void entertoUsernametextbox(String username) {
		driver.findElement(By.xpath("//input[@name='uid']")).sendKeys(username);
	}
	
	@When("^Enter \"([^\"]*)\" to Password textbox$")
	public void entertoPasswordtextbox(String password) {
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys(password);
		
	}
	
	@When("^Enter ([^\"]*) to username textbox$")
	public void entertousernametextbox(String username) {
		driver.findElement(By.xpath("//input[@name='uid']")).sendKeys(username);
	}

	@When("^Enter ([^\"]*) to password textbox$")
	public void entertopasswordtextbox(String password) {
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys(password);
	}

	@When("^Enter \"([^\"]*)\" username and \"([^\"]*)\" password$")
	public void enterUsernameAndPassword(String username, String password){
		driver.findElement(By.xpath("//input[@name='uid']")).sendKeys(username);
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys(password);
	}
	
	@When("^Enter username and password with data$")
	public void enterUsernameAndPasswordWithData(DataTable loginTable){
		List<Map<String, String>> login = loginTable.asMaps(String.class, String.class);
		for(Map<String, String> record: login) {
			driver.findElement(By.xpath("//input[@name='uid']")).sendKeys(record.get("user"));
			driver.findElement(By.xpath("//input[@name='password']")).sendKeys(record.get("pass"));
		}
	}
	
	@When("^Click login button$")
	public void clickloginbutton() {
	    driver.findElement(By.xpath("//input[@name='btnLogin']")).click();
	    
	}

	@Then("^Verify Home page displayed with message \"([^\"]*)\"$")
	public void verifyHomepagedisplayedwithmessage(String arg1) {
	    Assert.assertEquals(driver.findElement(By.xpath("//marquee")).getText(), "Welcome To Manager's Page of Guru99 Bank");
	}
	
	
}
