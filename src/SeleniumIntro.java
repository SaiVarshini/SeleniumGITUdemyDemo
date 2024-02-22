import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SeleniumIntro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		System.setProperty("webdriver.chrome.driver", "path");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/");
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		driver.close();
		
		//Firefox
//		System.setProperty("webdriver.gecko.driver", "/Users/rahulshetty/Documents/geckodriver");
//		WebDriver driver1 = new FirefoxDriver();
		//Microsoft Edge
//		System.setProperty("webdriver.edge.driver", "/Users/rahulshetty/Documents/msedgedriver");
//		WebDriver driver2 = new EdgeDriver();
	}

}
