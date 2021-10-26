package Test_Synchronization;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Implicit {

	public static void main(String[] args) throws Exception {
		
		System.setProperty("webdriver.chrome.driver",  "C:\\Users\\HP\\OneDrive\\Desktop\\Java\\Drvier\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.manage().window().maximize();
		
		driver.get("https://www.dezlearn.com/test-sync-example/");
		
		driver.findElement(By.xpath("//input[@name='fname']")).sendKeys("William");
		
		driver.findElement(By.xpath("//input[@name='lname']")).sendKeys("Smith");
		
		driver.findElement(By.xpath("//input[3]")).sendKeys("test@gmail.com");
		
		driver.findElement(By.id("u_5_6")).click();
		
		driver.findElement(By.linkText("Go to Next Page")).click();
		
		System.out.println(driver.getCurrentUrl());
		
		driver.close();

	}

}
