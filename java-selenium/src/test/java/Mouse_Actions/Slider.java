package Mouse_Actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Slider {

	public static void main(String[] args) {
		
		/*
		 *  Example of Slider Options
		 */
		
		System.setProperty("webdriver.chrome.driver",  "C:\\Users\\HP\\OneDrive\\Desktop\\Java\\Drvier\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
//		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("https://jqueryui.com/slider/#colorpicker");
		
		driver.switchTo().frame(0);
		
		WebElement red = driver.findElement(By.cssSelector("div#red>span"));
		WebElement  green = driver.findElement(By.cssSelector("div#green>span"));
		WebElement  blue = driver.findElement(By.cssSelector("div#blue>span"));
		
		Actions action = new Actions(driver);
		
		action.clickAndHold(red).moveByOffset(-30, 0).release(red).build().perform();
		action.clickAndHold(green).moveByOffset(30, 0).release(green).build().perform();
		action.clickAndHold(blue).moveByOffset(-30, 0).release(blue).build().perform();

		driver.close();

	}

}
