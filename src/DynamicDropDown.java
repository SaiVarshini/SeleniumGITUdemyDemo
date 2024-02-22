import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicDropDown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//a[@value = 'BLR']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@id = 'ctl00_mainContent_ddl_destinationStation1_CTNR']//a[@value = 'MAA']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@id = 'ui-datepicker-div']//a[@classname = 'ui-state-default ui-state-highlight ui-state-active']")).click();
		

	}

}
