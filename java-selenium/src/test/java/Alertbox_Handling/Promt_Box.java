package Alertbox_Handling;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Promt_Box {

	public static void main(String[] args) {
		
		/*
		 *  Example of Prompt Alert Box
		 */
		
		System.setProperty("webdriver.chrome.driver",  "C:\\Users\\Reza\\Desktop\\java-selenium\\Drvier\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("https://www.dezlearn.com/javascript-alerts/");
		
		driver.findElement(By.id("p_alert3")).click();
		
		Alert a  = driver.switchTo().alert();
		
		a.sendKeys("Dhaka");
		
		System.out.println(a.getText());
	  	
		a.accept();

		driver.close();

	}

}
