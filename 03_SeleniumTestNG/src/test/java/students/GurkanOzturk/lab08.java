package students.GurkanOzturk;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class lab08 {
    WebDriver driver;

    @BeforeMethod
    public void lunch(){

        WebDriverManager.chromedriver().setup();

        driver=new ChromeDriver();

        driver.get("http://demo.guru99.com/test/delete_customer.php");

    }

    @Test

    public void Test() {

        WebElement searchBox = driver.findElement(By.xpath("//input[@name='cusid']"));
        searchBox.sendKeys("gurko");
        driver.findElement(By.xpath("//input[@name='submit']")).click();
        Alert alert = driver.switchTo().alert();
        alert.accept();
    }
        @AfterMethod
                public void closing(){
        driver.quit();

        }

    }


