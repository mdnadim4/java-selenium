package Element_Collection;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElement_Collection {

	public static void main(String[] args) throws Exception {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Reza\\Desktop\\java-selenium\\Drvier\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		/*
		 * Get collection of all links text and attribute
		 */

		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.get("https://www.actitime.com/");
		
		List<WebElement> links =  driver.findElements(By.xpath("//ul[@class='header__menu']/li"));
		
		for(WebElement link : links) {
			String link_text = link.getText();
			String link_attribute = link.getAttribute("class");
			
			System.out.println(link_text);
			System.out.println(link_attribute);
			System.out.println("===================");
		}
		
		driver.quit();

	}

}
