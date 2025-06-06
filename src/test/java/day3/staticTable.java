package day3;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class staticTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.techlistic.com/2017/02/automate-demo-web-table-with-selenium.html");
		
		List<WebElement> rows = driver.findElements(By.xpath("//*[@id='customers']/tbody/tr"));
		System.out.println("Number of rows:" + rows.size());
		
		List<WebElement> columns = driver.findElements(By.xpath("//*[@id='customers']/tbody/tr[1]/th"));
		System.out.println("Number of columns:" + columns.size());
		
		WebElement cell = driver.findElement(By.xpath("//*[@id=\"customers\"]/tbody/tr[5]/td[2]/span"));
		System.out.println(cell.getText());
		
		List<WebElement> specific = driver.findElements(By.xpath("//*[@id='customers']/tbody/tr"));
		for(WebElement row: specific) {
			if(row.getText().contains("Italy")) {
               System.out.println("Italy is found");
				break;
			}
		}
	}
	

}
