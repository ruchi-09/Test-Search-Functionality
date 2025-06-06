package day2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class multipleOptions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/test/radio.html");
		driver.manage().window().maximize();
		
        List<WebElement> checkboxes = driver.findElements(By.name("webform")); //Finding all checkboxes by common attribute
        
        //looping through & select all boxes
        for(WebElement checkbox: checkboxes) {
        	if(!checkbox.isSelected()) {
        		checkbox.click();
        	}
        }
	}

}
