package Basic_Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navigation {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Reza\\Desktop\\java-selenium\\Drvier\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		/*
		 * Navigate Method - to() / back() / forward() / refresh()
		 */
		
		driver.get("https://www.google.com");
		System.out.println(driver.getTitle());

		Thread.sleep(2000);
		
		driver.navigate().to("https://www.facebook.com");
		System.out.println(driver.getTitle());

		Thread.sleep(2000);
		
		driver.navigate().back();
		System.out.println(driver.getTitle());

		Thread.sleep(2000);
		
		driver.navigate().forward();
		System.out.println(driver.getTitle());

		Thread.sleep(2000);
		
		driver.navigate().refresh();
		
		driver.close();

	}

}
