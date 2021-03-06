package Browser_Handling;

import java.util.Set;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class Multiple_Browser_Handling {

	public static void main(String[] args) {
		
		/*
		 *  Example of Multiple Browser Handling
		 */
		
		System.setProperty("webdriver.chrome.driver",  "C:\\Users\\HP\\OneDrive\\Desktop\\Java\\Drvier\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("https://www.dezlearn.com");
		
		Actions action = new Actions(driver);
		
		WebElement testpage =  driver.findElement(By.id("menu-item-9634"));
		
		action.moveToElement(testpage).perform();
		
		driver.findElement(By.id("menu-item-9389")).click();
		
		driver.findElement(By.id("u_7_8")).click();
	
		Set<String> windows = driver.getWindowHandles();
		
		for (String window : windows) {
			System.out.println(window);
			driver.switchTo().window(window);
			System.out.println(driver.getCurrentUrl());
			System.out.println(driver.getTitle());
			System.out.println("----------------------");
			if (driver.getCurrentUrl().equals("https://www.facebook.com/")) {
				break;
			}
		}
		
		driver.findElement(By.id("email")).sendKeys("test@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("test@gmail.com");
		
		
		driver.close();
		driver.quit();

	}

}
