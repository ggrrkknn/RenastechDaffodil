package students.GurkanOzturk;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class lab10 {



    WebDriver driver;

    @Test
    void login(){

        WebDriverManager.chromedriver().setup();

        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("http://demo.guru99.com/V4/");


        driver.findElement(By.cssSelector("input[name='uid']")).sendKeys("mngr414566");
        driver.findElement(By.cssSelector("input[name='password']")).sendKeys("bypazyt");

        WebElement login= driver.findElement(By.name("btnLogin"));
        JavascriptExecutor js=(JavascriptExecutor) driver;

        String script1="arguments[0].click();";
        js.executeScript(script1,login);

        String script2="return document.title;";
        String actualTitle= (String) js.executeScript(script2);

        String expectedTitle="Guru99 Bank Manager HomePage";

        Assert.assertEquals(actualTitle,expectedTitle,"Title verification has passed.");

        System.out.println(actualTitle);
        System.out.println(expectedTitle);
}
    }

