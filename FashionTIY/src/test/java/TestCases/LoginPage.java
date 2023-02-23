package TestCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class LoginPage {
	
	@Test
	public static void Login() {
		
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\manoj\\eclipse-workspace\\FashionTIY\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.fashiontiy.com/login.html");
		
	}
	
	
}
