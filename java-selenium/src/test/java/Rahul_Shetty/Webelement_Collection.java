package Rahul_Shetty;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
// import org.openqa.selenium.edge.EdgeDriver;
// import org.openqa.selenium.firefox.FirefoxDriver;

public class Webelement_Collection {

	public static void main(String[] args) {
		
		
		//Chrome Browser
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Reza\\Desktop\\java-selenium\\Drvier\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		//Firefox Browser
//		System.setProperty("webdriver.gecko.driver", "C:\\Users\\Reza\\Desktop\\java-selenium\\Drvier\\geckodriver.exe");
//		WebDriver driver = new FirefoxDriver();
		
		//Edge Browser
//		System.setProperty("webdriver.edge.driver", "C:\\Users\\Reza\\Desktop\\java-selenium\\Drvier\\msedgedriver.exe");
//		WebDriver driver = new EdgeDriver();
		

		driver.manage().window().maximize();
		driver.get("https://www.actitime.com/");


		driver.quit();

	}
}
