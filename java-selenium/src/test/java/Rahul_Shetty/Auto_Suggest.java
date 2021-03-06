package Rahul_Shetty;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Auto_Suggest {

	public void main() {
		
		System.setProperty("webdriver.chrome.driver",  "C:\\Users\\Reza\\Desktop\\java-selenium\\Drvier\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://rahulshettyacademy.com/dropdownsPractise");
		
		driver.findElement(By.id("autosuggest")).sendKeys("ind");
		
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		List<WebElement> options = driver.findElements(By.cssSelector("li[class='ui-menu-item'] a"));
		
		for(WebElement option : options) 
		{
			if(option.getText().equalsIgnoreCase("india"))
			{
				option.click();
			}
		}
		
//		driver.quit();
		
	}

}
