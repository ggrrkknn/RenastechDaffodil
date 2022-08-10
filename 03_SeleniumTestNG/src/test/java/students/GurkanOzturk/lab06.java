package students.GurkanOzturk;

import code.utilities.WebDriverUtil;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class lab06 {
    WebDriver driver;

    @BeforeMethod
    void setup(){
        driver= WebDriverUtil.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.get("https://demo.guru99.com/test/newtours/register.php");

    }
    @Test
    void dropDown() throws InterruptedException {
        WebElement DropDownBox=driver.findElement(By.xpath("//select[@name='country']"));
        DropDownBox.click();
        Select dropdown=new Select(DropDownBox);
        dropdown.selectByVisibleText("BARBADOS");
        System.out.println(dropdown.getFirstSelectedOption().getText());
        Thread.sleep(3000);
        dropdown.selectByValue("BOLIVIA");
        System.out.println(dropdown.getFirstSelectedOption().getText());
        Thread.sleep(3000);
        dropdown.selectByIndex(12);
        System.out.println(dropdown.getFirstSelectedOption().getText());

    }
    @AfterMethod
    void endTest(){
        driver.quit();
    }
}

