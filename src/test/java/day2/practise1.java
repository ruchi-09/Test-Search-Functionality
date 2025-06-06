package day2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class practise1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://artoftesting.com/samplesiteforselenium");
		driver.manage().window().maximize();
		
		//RADIO BUTTON (FEMALE IS SELECTED)
		List<WebElement> radios = driver.findElements(By.name("gender"));
		for(WebElement radio: radios) {
			if ("female".equals(radio.getDomProperty("value"))) {
			radio.click();
			System.out.println("female radio btn selected");
		}

	}
		
		//CHECK BOX (BOTH ARE SELECTED)
		List<WebElement> checkboxes = driver.findElements(By.cssSelector("#commonWebElements input[type='checkbox']")); 
		
		for(WebElement checkbox: checkboxes) {
			if(!checkbox.isSelected()) {
        		checkbox.click();
        		System.out.println("Both checkboxes are selected");
        	}
		}

}}
