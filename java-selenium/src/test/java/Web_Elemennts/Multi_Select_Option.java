package Web_Elemennts;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Multi_Select_Option {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\OneDrive\\Desktop\\Java\\Drvier\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		/*
		 * Example of Multi - Select option
		 */

		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.get("https://www.linkedin.com/jobs/information-technology-jobs-dhaka?trk=homepage-basic_suggested-search&position=1&pageNum=0");

		driver.findElement(By.xpath("//button[contains(text(),  'Job Type')]")).click();

		List<WebElement> options = driver.findElements(By.cssSelector("#JOB_TYPE-dropdown li"));

		for (WebElement option : options) {

			if (option.getText().trim().contains("Full-time") || option.getText().trim().contains("Contract")) {

				option.click();

			}
		}

		driver.close();
		driver.quit();

	}

}
