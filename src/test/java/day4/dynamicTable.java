package day4;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class dynamicTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));  //implicit wait

		WebElement table = driver.findElement(By.xpath("//*[@id=\"taskTable\"]"));  //locate the table
		System.out.println("table is found");
		
		List<WebElement> rows = driver.findElements(By.xpath("//*[@id=\"rows\"]"));  //selecting all rows
		System.out.println("all rows are selected");
		
		//looping through rows to find firefox
		for(WebElement row: rows) {
			//find column index 1
			List<WebElement> headers = table.findElements(By.xpath("//*[@id=\"headers\"]/th"));
			
	
		
			
		}
		
		
	}

}
