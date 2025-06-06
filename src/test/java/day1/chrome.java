package day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

public class chrome {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup(); // Automatically sets the driver

        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://practicetestautomation.com/practice-test-login/");
        driver.manage().window().maximize();
        WebElement username = driver.findElement(By.xpath("//*[@id='form']/div[1]/input")); //*[@id="form"]/div[1]/label
        WebElement password = driver.findElement(By.xpath("//*[@id=\"form\"]/div[2]/input"));
        WebElement submit = driver.findElement(By.xpath("//*[@id='submit']"));
        
        username.sendKeys("student");
        password.sendKeys("Password123");
        
        submit.click();
        
        //verifying the URL
        String expectedUrl = "https://practicetestautomation.com/logged-in-successfully/";
        String actualUrl = driver.getCurrentUrl();
        
        if(actualUrl.contains(expectedUrl)){
        	System.out.println("Login successful, URL VERIFIED");
        }else {
        	System.out.println("Login failed, URL MISMATCHED"  + actualUrl);
        }
        
        //verifying the text content
        WebElement content = driver.findElement(By.xpath("//*[@id=\"loop-container\"]/div/article/div[2]/p[1]/strong"));
        String pageText = content.getText();
        
        if(pageText.contains("Congratulations student. You successfully logged in!")){
        	System.out.println("Text Verification passed");
        	} else {
        	System.out.println("Text verification failed");
        }
        
        driver.quit();

    }
    
}

