package Rahul_Shetty;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown_Selection {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", 	"C:\\Users\\Reza\\Desktop\\java-selenium\\Drvier\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://rahulshettyacademy.com/dropdownsPractise");

		// Script for From option
		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
		driver.findElement(By.xpath("//a[@value=\"CCU\"]")).click();
		driver.manage().timeouts().implicitlyWait(2000, TimeUnit.MILLISECONDS);

		// Script for To option
		driver.findElement(By.xpath("//div[@id='glsctl00_mainContent_ddl_destinationStation1_CTNR'] //a[@value='DEL']")).click();
		// driver.findElement(By.xpath("(//a[@value='DEL'])[2]")).click();

		// Script for Calendar
		driver.findElement(By.linkText("11")).click();

		// Script for disable calendar
		System.out.println(driver.findElement(By.cssSelector("[id='ctl00_mainContent_view_date2']")).isEnabled());
		driver.findElement(By.cssSelector("[id='ctl00_mainContent_rbtnl_Trip_1']")).click();
		System.out.println(driver.findElement(By.cssSelector("[id='ctl00_mainContent_view_date2']")).isEnabled());
		driver.findElement(By.cssSelector("[id='ctl00_mainContent_view_date2']")).click();
		driver.findElement(By.linkText("20")).click();

		// Script for Passengers
		System.out.println(driver.findElement(By.cssSelector("[id='divpaxinfo']")).getText());
		driver.findElement(By.cssSelector("[id='divpaxinfo']")).click();
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		for (int i = 1; i < 5; i++) {
			driver.findElement(By.cssSelector("[id='hrefIncAdt']")).click();
		}

		driver.findElement(By.cssSelector("[id='btnclosepaxoption']")).click();
		System.out.println(driver.findElement(By.cssSelector("[id='divpaxinfo']")).getText());

		WebElement option = driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));

		Select dropdown = new Select(option);

		dropdown.selectByIndex(2);
		System.out.println(dropdown.getFirstSelectedOption().getText());

		dropdown.selectByValue("USD");
		System.out.println(dropdown.getFirstSelectedOption().getText());

		dropdown.selectByVisibleText("INR");
		System.out.println(dropdown.getFirstSelectedOption().getText());

		driver.findElement(By.cssSelector("[value='Search']")).click();

		driver.quit();

	}

}
