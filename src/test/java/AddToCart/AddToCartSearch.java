package AddToCart;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class AddToCartSearch {
	WebDriver driver;
	
	@BeforeClass
	public void setUp() {
		driver = new ChromeDriver();
		driver.get("https://practice.expandtesting.com/bookstore");
		driver.manage().window().maximize();
	}
	
	@Test
	public void Cart() {
        WebElement searchBox = driver.findElement(By.id("search"));
        searchBox.sendKeys("Agile Testing");
        WebElement Find = driver.findElement(By.id("search-btn"));
        Find.click();
        WebElement product = driver.findElement(By.className("card-img-top"));
        product.click();
        WebElement btn = driver.findElement(By.className("btn btn-danger"));
        btn.click();


}
	
	
}
