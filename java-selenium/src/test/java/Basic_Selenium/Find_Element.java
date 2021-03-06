package Basic_Selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.support.ui.ExpectedConditions;
//import org.openqa.selenium.support.ui.WebDriverWait;

public class Find_Element {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Reza\\Desktop\\java-selenium\\Drvier\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		/*
		 *  Find Element By ID and Link text
		 */
		
		/*
		 * driver.get("https://www.actitime.com");
		 * 
		 * driver.findElement(By.linkText("Try Free")).click();
		 * 
		 * WebDriverWait wait = new WebDriverWait(driver, 10);
		 * 
		 * wait.until(ExpectedConditions.urlToBe(
		 * "https://www.actitime.com/free-online-trial"));
		 * 
		 * driver.findElement(By.id("first-name")).sendKeys("William");
		 * 
		 * driver.findElement(By.id("last-name")).sendKeys("Smith");
		 * 
		 * driver.findElement(By.id("email")).sendKeys("william@gmail.com");
		 * 
		 * driver.findElement(By.id("company")).sendKeys("Microsoft");
		 * 
		 * driver.findElement(By.linkText("Start Free Trial")).click();
		 */
		
		/*
		 *  Find Element by Name & Classname
		 *  Using Partial Link Text
		 *  Getting Text from web Element
		 */

		driver.manage().window().maximize();
		
		driver.get("https://www.amazon.com");
		
		driver.findElement(By.name("field-keywords")).sendKeys("Barbie Dolls");
		
		driver.findElement(By.id("nav-search-submit-button")).click();
		driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
		
		// Thread.sleep(1000);
		
		driver.findElement(By.partialLinkText("Women Doll")).click();
		
		driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
		
		String productTitle = driver.findElement(By.id("productTitle")).getText();
		
		String productPrice = driver.findElement(By.id("priceblock_ourprice")).getText();
		
		System.out.println("Product title is: " + productTitle);
		System.out.println("Product Price is: " + productPrice);
		
		driver.quit();
	}

}
