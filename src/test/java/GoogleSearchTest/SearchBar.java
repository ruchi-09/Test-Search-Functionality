package GoogleSearchTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class SearchBar {

	WebDriver driver;
	
	@BeforeClass
	public void setup() {
      driver = new ChromeDriver();
      driver.get("https://www.google.com/");
      driver.manage().window().maximize();
	}
      
     @Test
 	public void SearchBox() {
    	WebElement searchBox = driver.findElement(By.xpath("//*[@id=\"APjFqb\"]"));
    	searchBox.sendKeys("selenium webdriver");
    	searchBox.submit();
}
     @AfterClass
     public void tearDown() {
    	 if (driver != null) {
             driver.quit();
     }
     }
}
