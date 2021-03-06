package Web_Elemennts;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Web_table {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\OneDrive\\Desktop\\Java\\Drvier\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		/*
		 * Example of Web tables
		 */
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("https://www.dezlearn.com/webtable-example/");
		
		// Using xPath
//		List<WebElement> rows = driver.findElements(By.xpath("//table[contains(@class, 'tg')]/tbody/tr/td[1]"));
		
		// Using Css Selector
		List<WebElement> rows = driver.findElements(By.cssSelector("table.tg tr td"));
		
		for (WebElement row : rows) {
			String name = row.findElement(By.cssSelector("td:nth-child(1)")).getText();
//			String name = row.findElement(By.xpath("td[1]")).getText();
//			String email = row.findElement(By.xpath("td[2]")).getText();
			
			System.out.println("Name: " + row.getText());
//			System.out.println("Email: " + email);
		}
		

		
		driver.quit();

	}

}
