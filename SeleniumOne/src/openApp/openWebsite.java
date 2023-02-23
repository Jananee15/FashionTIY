package openApp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class openWebsite {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
			"C:\\Users\\manoj\\eclipse-workspace\\SeleniumOne\\ChromeDriver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
	}

}
