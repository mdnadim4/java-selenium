package Iframe_Handling;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Iframe {

	public static void main(String[] args) {
		
		/*
		 *  Example of Handling Iframe
		 */
		
		System.setProperty("webdriver.chrome.driver",  "C:\\Users\\HP\\OneDrive\\Desktop\\Java\\Drvier\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("https://demoqa.com");
		
//		Actions action = new Actions(driver);
		
//		driver.switchTo().frame("frame1");
		
//		WebElement button = driver.findElement(By.cssSelector("div.category-cards>.top-card:nth-child(3)"));
//		
//		action.moveToElement(button).click();
//		
//		System.out.println(driver.getCurrentUrl());
		
//		System.out.println(.getText());
		
//		driver.switchTo().defaultContent();
		
		driver.findElement(By.cssSelector("div.category-cards>.top-card:nth-child(3)")).click();
		
		driver.findElement(By.linkText("Alerts, Frame & Windows")).click();
		
		driver.findElement(By.linkText("Frames")).click();
		
//		driver.close();
//		driver.quit();

	}

}
