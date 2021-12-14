package Basic_Selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class List_Collection {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Reza\\Desktop\\java-selenium\\Drvier\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		/*
		 *  Get collection all links from page
		 */
		
		driver.get("https://www.walmart.com/");
		driver.findElement(By.id("global-search-input")).sendKeys("Men Shoes");
		driver.findElement(By.id("global-search-submit")).click();
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		
		driver.quit();
	}

}
