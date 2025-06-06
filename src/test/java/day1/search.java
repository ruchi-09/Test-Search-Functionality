package day1;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import io.github.bonigarcia.wdm.WebDriverManager;

public class search {

    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();

        driver.get("https://gudworld.in/");

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        // Wait for and click search icon
        WebElement searchIcon = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='SiteHeader']/div[1]/div[1]/div/div[3]/div/div[1]/a[1]")));
        searchIcon.click();

        // Wait for and type in search bar
        WebElement searchBar = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='SiteHeader']/div[1]/div[2]/div/div/form/input[3]")));
        searchBar.sendKeys("jaggery powder");
        searchBar.submit();

        System.out.println("Search performed successfully.");

        // Optional pause before quitting
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        driver.quit();
    }
}
