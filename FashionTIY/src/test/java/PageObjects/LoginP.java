package PageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginP {
	
	@FindBy(xpath="//*[@id=\"header\"]/div[2]/div[1]/div/div[1]/div[1]/div[3]/div/a/div/span")
	public static WebElement signIn;
	
	//@FindBy(xpath="//*[@id=\"app\"]/div[1]/div/div[2]/label[1]/input")
	@FindBy(id= "text")
	public static WebElement userName;
	
	@FindBy(id="password")
	public static WebElement password;
	
	@FindBy(xpath="//*[@id=\"app\"]/div[1]/div/button")
	public static WebElement signInButton;
}
