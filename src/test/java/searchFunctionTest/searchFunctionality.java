package searchFunctionTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class searchFunctionality {

	WebDriver driver;
	
	@BeforeClass
	public void setUp() {
		driver = new ChromeDriver();
	}
	
	@Test
	public void testSearchFunction() {
		driver.get("https://automationexercise.com/");	
		driver.manage().window().maximize();
		
		WebElement products = driver.findElement(By.xpath("//*[@id=\"header\"]/div/div/div/div[2]/div/ul/li[2]/a"));
		products.click();
		
		WebElement searchProduct = driver.findElement(By.id("search_product"));
		searchProduct.sendKeys("Jeans");
		
		WebElement submitSearch = driver.findElement(By.id("submit_search"));
		submitSearch.click();
		
		WebElement featuresItems = driver.findElement(By.className("features_items"));
		Assert.assertTrue(featuresItems.isDisplayed(), "Search result heading not displayed!");
		}
	
	@AfterClass
	    public void tearDown() {
		if(driver !=null) {
			driver.quit();
		}
		}
	}
