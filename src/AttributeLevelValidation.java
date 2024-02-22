import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class AttributeLevelValidation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		
//		------------ Validate if return date is enabled or disabled-------------------------
		
		if(driver.findElement(By.xpath("//div[@id = 'Div1']")).getAttribute("style").contains("opacity: 1")) {
			
			System.out.println("is enabled");
			Assert.assertTrue(true);
			
			
		}
		else {
			Assert.assertTrue(false);
		}
		
	}

}
