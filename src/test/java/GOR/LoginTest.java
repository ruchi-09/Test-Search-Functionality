package GOR;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LoginTest {
     WebDriver driver;
	
	@BeforeMethod
	public void setup() {
		driver = new ChromeDriver();
		driver.get("https://gor-pathology.web.app/dashboard");
		driver.manage().window().maximize();
	}

	@Test
	public void validLoginTest() {
		driver.findElement(By.name("email")).sendKeys("test@kennect.io");
		driver.findElement(By.name("password")).sendKeys("Qwerty@1234");
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/form/button[1]/span[1]")).click();
		
	}
	
	@AfterMethod
	public void teardown() {
		driver.quit();
		
	}
	
}
