package day2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class practise2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Open chrome browser
		WebDriver driver = new ChromeDriver();
		driver.get("https://artoftesting.com/samplesiteforselenium");
		driver.manage().window().maximize();
		
		//writing into text box
		WebElement textbox = driver.findElement(By.name("firstName"));
		textbox.sendKeys("Ruchika Redekar");
		
		//button is clicked
		WebElement button = driver.findElement(By.id("idOfButton"));
		button.click();
		System.out.println("Button is clicked");
		
		//double clicking the button
		WebElement doubleclickbutton = driver.findElement(By.id("dblClkBtn"));  //where to click find clickable element
		Actions actions = new Actions(driver);                       //to assign double click action
		actions.doubleClick(doubleclickbutton).perform();             //perform double click
		driver.switchTo().alert().accept();                           //accept alert as ok
		System.out.println("OK is clicked");
		
		
		//radiobtns
		List<WebElement> radios = driver.findElements(By.name("gender")); //clickable btns
		for(WebElement radio: radios) {     //looping
			if("female".equals(radio.getDomProperty("value"))){
				radio.click();
				System.out.println("Female btn is selected");
			}
		}
		
		//checkboxes
		List<WebElement> checkboxes = driver.findElements(By.cssSelector("#commonWebElements input[type='checkbox']")); //clickable btns
		for(WebElement checkbox: checkboxes) {     //looping
			if("Performance".equals(checkbox.getDomProperty("value"))){
				checkbox.click();
				System.out.println("Performance testing is selected");

	}

}
	}
}
