import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Locators2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		String name = "Varshini";
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5)); //---- global wait time for each step
		String password = getPassword(driver);
		
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		
		driver.findElement(By.cssSelector("#inputUsername")).sendKeys(name);
		driver.findElement(By.cssSelector("input[type = 'password']")).sendKeys(password);
		driver.findElement(By.id("chkboxTwo")).click();
		driver.findElement(By.xpath("//button[contains(@class, 'submit')]")).click();
		Thread.sleep(2000);
		System.out.println(driver.findElement(By.tagName("p")).getText());
		Assert.assertEquals(driver.findElement(By.tagName("p")).getText(), "You are successfully logged in.");
		System.out.println(driver.findElement(By.xpath("//div/h2")).getText());
		Assert.assertEquals(driver.findElement(By.xpath("//div/h2")).getText(), "Hello "+name+",");
		driver.findElement(By.xpath("//*[@class = 'logout-btn']")).click();
		driver.close();
	}
	
	public static String getPassword(WebDriver driver) throws InterruptedException {
		
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		
		driver.findElement(By.linkText("Forgot your password?")).click();
		Thread.sleep(1000);
		driver.findElement(By.cssSelector(".reset-pwd-btn")).click();
		String passwordText = driver.findElement(By.cssSelector("form p")).getText();
		System.out.println(passwordText);
		String passwordArray[] = passwordText.split("'");
//		passwordArray = passwordText.split(" ");
//		System.out.println(passwordArray.length);
//		for(String pwd :passwordArray) {
//			System.out.println(pwd);
//		}
		String password = passwordArray[1];
		return password;
		
	}

}
