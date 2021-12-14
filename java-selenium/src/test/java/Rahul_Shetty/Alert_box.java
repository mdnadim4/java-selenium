package Rahul_Shetty;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert_box {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Reza\\Desktop\\java-selenium\\Drvier\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.dezlearn.com/javascript-alerts/");
		
		
		// Simple Alert Box
		driver.findElement(By.cssSelector("[id='s_alert1']")).click();
		Alert a = driver.switchTo().alert();
		System.out.println(a.getText());
		a.accept();
		
		//Confirm Alert
		driver.findElement(By.cssSelector("[id='c_alert2']")).click();
		Alert b = driver.switchTo().alert();
		System.out.println(b.getText());
		b.dismiss();
		
		//Prompt Alert
		driver.findElement(By.cssSelector("[id='p_alert3']")).click();
		Alert c = driver.switchTo().alert();
		c.sendKeys("Nadim Mahmud");
		System.out.println(c.getText());
		c.accept();
		
		String text = driver.findElement(By.cssSelector("[id='conf2']")).getText();
		System.out.println(text);
		
		driver.quit();

	}

}
