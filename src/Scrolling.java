import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Scrolling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,500)");
		js.executeScript("document.querySelector('.tableFixHead').scrollTop=400");
		
		List<WebElement> amts = driver.findElements(By.xpath("//div[@class = \"tableFixHead\"]/table/tbody/tr/td[4]"));
		
		int sum =0;
		for(WebElement amt : amts) {
			
			sum = sum+ Integer.parseInt(amt.getText());
			
		}
		
		int tot = Integer.parseInt(driver.findElement(By.className("totalAmount")).getText().split(":")[1].trim());
		
		Assert.assertEquals(tot, sum);
		
		
		
		
		

	}

}
