package Basic_Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Firefox_Test {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\HP\\OneDrive\\Desktop\\Java\\Drvier\\geckodriver.exe");
		
		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://www.facebook.com");
		
		System.out.println(driver.getTitle());

	}

}
