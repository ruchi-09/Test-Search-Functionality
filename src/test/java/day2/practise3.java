package day2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class practise3 {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.seedbasket.in/");
		driver.manage().window().maximize();
		
		WebElement dropdown = driver.findElement(By.cssSelector(".dropdown-toggle"));
		dropdown.click();
		System.out.println("hover");
		
		List<WebElement> options = driver.findElements(By.cssSelector(".dropdown-menu li"));


		for(WebElement option:options) {
			if("Exotic Vegetable Seeds".equals(option.getDomProperty("value"))){
				option.click();
				System.out.println("EVS is selected");
			}
		}
		
		
	}
}
