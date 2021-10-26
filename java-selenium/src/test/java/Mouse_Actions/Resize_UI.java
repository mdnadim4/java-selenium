package Mouse_Actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Resize_UI {

	public static void main(String[] args) {
		
		/*
		 *  Example of Resize UI options
		 */
		
		System.setProperty("webdriver.chrome.driver",  "C:\\Users\\HP\\OneDrive\\Desktop\\Java\\Drvier\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://jqueryui.com/resizable");
		
		driver.switchTo().frame(0);
		
		WebElement source = driver.findElement(By.cssSelector("div.ui-icon.ui-icon-gripsmall-diagonal-se"));
		
		Actions action = new Actions(driver);
		
		action.clickAndHold(source).moveByOffset(-50, -50).build().perform();

	}

}
