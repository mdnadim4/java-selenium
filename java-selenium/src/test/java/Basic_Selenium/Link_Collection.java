package Basic_Selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Link_Collection {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\OneDrive\\Desktop\\Java\\Drvier\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		/*
		 *  Get collection all links from page
		 */
		
		driver.get("https://www.actitime.com");
		List<WebElement> links = driver.findElements(By.cssSelector("a"));
		
		for(WebElement link : links) {
			
			String text = link.getText();
			
			if(!text.trim().isEmpty()) {
				System.out.println(link.getText());
				System.out.println(link.getAttribute("class"));
				System.out.println("---------------------------------");
			}

		}
		driver.close();
	}

}
