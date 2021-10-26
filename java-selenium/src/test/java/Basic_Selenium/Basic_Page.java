package Basic_Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Basic_Page {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\OneDrive\\Desktop\\Java\\Drvier\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		/*
		 *  Get page URL, Title, Page Source, Windows Handle
		 */
		driver.get("https://www.facebook.com");
		
		System.out.println(driver.getCurrentUrl());
		
		System.out.println(driver.getTitle());
		
//		System.out.println(driver.getPageSource());
		
		System.out.println(driver.getWindowHandle());

		driver.close();
	}

}
