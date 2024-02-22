import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class FramesBasic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://jqueryui.com/droppable/");
		driver.manage().window().maximize();
		
		System.out.println(driver.findElements(By.tagName("iframe")).size());
		driver.switchTo().frame(0);
		
//		driver.switchTo().frame(driver.findElement(By.className("demo-frame")));
		
		WebElement ele1 = driver.findElement(By.id("draggable"));
		WebElement ele2 = driver.findElement(By.id("droppable"));
		
		Actions a = new Actions(driver);
		a.dragAndDrop(ele1, ele2).build().perform();
		
		driver.switchTo().defaultContent();
		
		driver.close();

	}

}
