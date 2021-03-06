package Web_Elemennts;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Select_Box {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\OneDrive\\Desktop\\Java\\Drvier\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		/*
		 * Example of Select Box option list
		 */
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("https://www.facebook.com/");
		
		driver.findElement(By.linkText("Create New Account")).click();
		
		String day1 = driver.findElement(By.cssSelector("select#day")).getAttribute("value");
		String month1 = driver.findElement(By.cssSelector("select#month")).getAttribute("value");
		String year1 = driver.findElement(By.cssSelector("select#year")).getAttribute("value");
		
		System.out.println(day1);
		System.out.println(month1);
		System.out.println(year1);
		
		List<WebElement> d = driver.findElements(By.cssSelector("select#day > option"));
		
		for (WebElement day : d) {
			
			if (day.getText().trim().equals("15")) {
				day.click();
			}
			
		}
		
		List<WebElement> m = driver.findElements(By.cssSelector("select#month > option"));
		
		for (WebElement month : m) {
			
			if (month.getText().trim().equals("Aug")) {		
				month.click();
			}
			
		}
		
		List<WebElement> y = driver.findElements(By.cssSelector("select#year > option"));
		
		for (WebElement year : y) {
			
			if (year.getText().trim().equals("1990")) {		
				year.click();
			}
			
		}
		
		driver.quit();

	}

}
