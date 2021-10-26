package Browser_Handling;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class Close_vs_Quit {

	public static void main(String[] args) throws Exception {
		
		/*
		 *  Example of Close All Browser one by one
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
		
		Thread.sleep(3000);
		
		driver.quit();
		
	}

}
