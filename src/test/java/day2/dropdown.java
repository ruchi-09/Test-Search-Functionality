package day2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class dropdown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://artoftesting.com/samplesiteforselenium");
		driver.manage().window().maximize();
		
		WebElement dropDwn = driver.findElement(By.id("testingDropdown"));
		dropDwn.click();
		System.out.println("Dropdown is clicked");
		
		// Create Select object
				Select select = new Select(dropDwn);
				
				// Select by visible text
				select.selectByVisibleText("Manual Testing");
				
				System.out.println("Manual Testing is selected");
				

	}

}
