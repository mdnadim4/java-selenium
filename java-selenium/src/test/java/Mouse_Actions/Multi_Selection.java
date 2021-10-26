package Mouse_Actions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Multi_Selection {

	public static void main(String[] args) {
		
		/*
		 *  Example of Multi - Selection Option
		 */
		
		System.setProperty("webdriver.chrome.driver",  "C:\\Users\\HP\\OneDrive\\Desktop\\Java\\Drvier\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("https://jqueryui.com/selectable/");
		
		driver.switchTo().frame(0);
		
		WebElement first = driver.findElement(By.cssSelector("ol#selectable>li:nth-child(1)"));
		WebElement third = driver.findElement(By.cssSelector("ol#selectable>li:nth-child(3)"));
		WebElement fifth = driver.findElement(By.cssSelector("ol#selectable>li:nth-child(5)"));
		
		Actions action = new Actions(driver);
		
		action.keyDown(Keys.CONTROL).perform();
		action.click(first);
		action.click(third);
		action.click(fifth);
		action.keyUp(Keys.CONTROL).perform();
		

		driver.close();

	}

}
