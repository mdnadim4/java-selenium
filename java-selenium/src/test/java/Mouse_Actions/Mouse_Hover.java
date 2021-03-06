package Mouse_Actions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Mouse_Hover {

	public static void main(String[] args) {
		
		/*
		 *  Mouse Action populated in Navigation including drop down menu
		 */
		
		System.setProperty("webdriver.chrome.driver",  "C:\\Users\\HP\\OneDrive\\Desktop\\Java\\Drvier\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(8, TimeUnit.SECONDS);
		
		driver.get("http://automationteststore.com/");
		
		// Action using for only Hover event
		Actions action = new Actions(driver);
		
		WebElement makeup = driver.findElement(By.linkText("MAKEUP"));
		action.moveToElement(makeup).perform();
		
		driver.findElement(By.linkText("Lips")).click();
		System.out.println(driver.getCurrentUrl());
		driver.navigate().back();
		
		makeup = driver.findElement(By.linkText("MAKEUP"));
		action.moveToElement(makeup).perform();
		
		driver.findElement(By.linkText("Face")).click();
		System.out.println(driver.getCurrentUrl());
		driver.navigate().back();

		driver.close();

	}

}
