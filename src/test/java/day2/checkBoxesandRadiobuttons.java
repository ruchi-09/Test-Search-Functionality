package day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class checkBoxesandRadiobuttons {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/test/radio.html");
		driver.manage().window().maximize();
		
		WebElement radio = driver.findElement(By.xpath("//*[@id=\"vfb-7-2\"]"));
		radio.click();
		
		if(radio.isSelected()) {
			System.out.println("Radiobutton is already selected");
		}else {
			radio.click();
		}

	}
}
