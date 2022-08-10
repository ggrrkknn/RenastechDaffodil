package students.GurkanOzturk;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import java.util.Iterator;
import java.util.Set;

public class lab09 {


    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("http://www.w3schools.com/tags/tryit.asp?filename=tryhtml_link_target");


        System.out.println(driver.getWindowHandle());

        driver.switchTo().frame("iframeResult");

        WebElement link = driver.findElement(By.linkText("Visit W3Schools.com!"));
        link.click();

        Set<String> allWindowsHandles = driver.getWindowHandles();
        Iterator<String> itr = allWindowsHandles.iterator();
        String parentID = itr.next();
        String childId = itr.next();
        driver.switchTo().window(childId);
        System.out.println(driver.getWindowHandle());


        WebElement logo = driver.findElement(By.xpath("//i[@class='fa fa-logo']"));
        Assert.assertTrue(logo.isDisplayed(), "logo is not displayed.");

        driver.switchTo().window(parentID);

        System.out.println(driver.getWindowHandle());


        WebElement runBtn = driver.findElement(By.id("runbtn"));
        System.out.println(runBtn.getText());

        String expectedText = "Run ❯";
        String actualText = runBtn.getText();

        Assert.assertEquals(actualText, expectedText, "it does not match.");
    }}

