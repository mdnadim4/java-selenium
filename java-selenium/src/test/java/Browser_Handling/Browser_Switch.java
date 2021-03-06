package Browser_Handling;

import java.util.Set;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Browser_Switch {

	public static void main(String[] args) {
		
		/*
		 *  Example of Browser Switching
		 */
		
		System.setProperty("webdriver.chrome.driver",  "C:\\Users\\HP\\OneDrive\\Desktop\\Java\\Drvier\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("https://www.facebook.com/");
		
		driver.findElement(By.linkText("Create New Account")).click();
		
		driver.findElement(By.linkText("Data Policy")).click();
		
		String parentWindow = driver.getWindowHandle();
		
		Set<String> windows = driver.getWindowHandles();
		
		for (String window : windows) {
			if (!window.equals(parentWindow)) {
				driver.switchTo().window(window);
			}
		}
		
		driver.findElement(By.cssSelector("span.signup_box_content>a.signup_btn")).click();
		
		driver.switchTo().window(parentWindow);
		
		driver.close();
		driver.quit();

	}

}
