package Mouse_Actions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Drag_Drop {

	public static void main(String[] args) {
		
		/*
		 *  Example of Drag & Drop options
		 */
		
		System.setProperty("webdriver.chrome.driver",  "C:\\Users\\HP\\OneDrive\\Desktop\\Java\\Drvier\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("https://jqueryui.com/droppable/");
		
		driver.switchTo().frame(0);
		
	  	WebElement source = driver.findElement(By.id("draggable"));
	  	WebElement target = driver.findElement(By.id("droppable"));
	  	
	  	Actions action = new Actions(driver);
	  	
	  	action.dragAndDrop(source, target).perform();
	  	
	  	// Another way you can do drag & drop 
	  	action.clickAndHold(source).moveToElement(target).release(source).build().perform();

		driver.close();

	}

}
