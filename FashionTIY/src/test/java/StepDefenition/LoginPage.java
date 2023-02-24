package StepDefenition;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import PageObjects.LoginP;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginPage {
	
public static WebDriver driver;
	
//PageFactory.initElements(driver, PageObjects.LoginPage.class);

	public static void driver() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\manoj\\eclipse-workspace\\FashionTIY\\Driver\\chromedriver.exe");
		driver = new ChromeDriver();	
		driver.manage().window().maximize();
		driver.get("https://www.fashiontiy.com/");
		Thread.sleep(5000);
		
		PageFactory.initElements(driver, PageObjects.LoginP.class);
		
	}
	
	@Given("^User clicks on the login option$")
	public void user_clicks_on_the_login_option() throws Throwable {
	    LoginP.signIn.click();
	}
	
	@When("^User enters username$")
	public void user_enters_username() throws Throwable {
	    LoginP.userName.sendKeys("Jananee15");
	    
	}

	@When("^User enters password$")
	public void user_enters_password() throws Throwable {
	    LoginP.password.sendKeys("Jananee@22");
	    
	}

	@Then("^User clicks Login button$")
	public void user_clicks_Login_button() throws Throwable {
	    LoginP.signInButton.click();
	    
	}
}
