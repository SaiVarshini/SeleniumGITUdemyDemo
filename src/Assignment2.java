import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assignment2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://rahulshettyacademy.com/angularpractice/");
		
		driver.findElement(By.xpath("//input[@name = 'name']")).sendKeys("Varshini");
		driver.findElement(By.xpath("//input[@name = 'email']")).sendKeys("Varshini@abc.com");
		driver.findElement(By.xpath("//input[@type = 'password']")).sendKeys("234567abc");
		driver.findElement(By.xpath("//input[@id = 'exampleCheck1']")).click();
		Select val = new Select(driver.findElement(By.id("exampleFormControlSelect1")));
		val.selectByVisibleText("Female");
		driver.findElement(By.id("inlineRadio2")).click();
		driver.findElement(By.xpath("//input[@name = 'bday']")).sendKeys("16-03-1997");
		driver.findElement(By.xpath("//input[@class = 'btn btn-success']")).click();
		System.out.println(driver.findElement(By.xpath("//div[@class = 'alert alert-success alert-dismissible']")).getText());
		
		

	}

}
