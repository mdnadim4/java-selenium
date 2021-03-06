package Web_Elemennts;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Datepicker {

	public static void main(String[] args) throws Exception {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\OneDrive\\Desktop\\Java\\Drvier\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		/*
		 * Example of Datepicker option
		 */

		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.get("https://www.trivago.com/");
		
		String expMonth = "October 2021";
		String expDate = "15";

		
		driver.findElement(By.xpath("//button[@data-qa='calendar-checkin']")).click();
		
		String currMonth = driver.findElement(By.cssSelector("table:nth-child(3) th.cal-heading-month")).getText();
		
		
		while(!currMonth.contains(expMonth)) {
			driver.findElement(By.cssSelector("button.cal-btn-next")).click();
			Thread.sleep(1000);
			currMonth = driver.findElement(By.cssSelector("table:nth-child(3) th.cal-heading-month")).getText();
			if(currMonth.contains(expMonth)) {
				break;
			}
		}
		
		List<WebElement> dates = driver.findElements(By.cssSelector("table.cal-month:nth-child(3) td"));
		
		for (WebElement date : dates) {
			if(date.getText().trim().equals(expDate)) {
				date.click();
			}
		}
		
		driver.quit();

	}

}
