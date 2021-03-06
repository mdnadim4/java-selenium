package TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class test1 {
	@Test
	public void empty_search_test() {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Reza\\Desktop\\java-selenium\\Drvier\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.ebay.com");
		
		WebElement search = driver.findElement(By.xpath("//input[@placeholder='Search for anything']"));
		
		Assert.assertTrue(search.isEnabled() , "Verify Search Input Enable");
		
		driver.findElement(By.id("gh-btn")).click();
		
		String expectedTitle = "Shop by Category | eBay";
		String expectedURL = "https://www.ebay.com/n/all-categories";
		
		String title = driver.getTitle();
		String url = driver.getCurrentUrl();
		
		Assert.assertEquals(title, expectedTitle, "Verify  Title of the new page");
		Assert.assertEquals(url, expectedURL, "Verify URL of the new page");
		
		driver.close();
		
	}
	
}
