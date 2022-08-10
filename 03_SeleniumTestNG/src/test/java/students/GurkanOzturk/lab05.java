package students.GurkanOzturk;

import code.utilities.WebDriverUtil;
import org.bouncycastle.asn1.dvcs.DVCSObjectIdentifiers;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class lab05 {

    WebDriver driver;

    @BeforeMethod
    public void setUp() throws InterruptedException {
        //Go to Amazon
        driver = WebDriverUtil.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.get("https://www.amazon.com/");
    }
    @Test
    public void TC1_GoToAmazonAndSearchForDesk() throws InterruptedException {
        System.out.println("TC1 is running.");

        driver.findElement(By.cssSelector("input#twotabsearchtextbox")).sendKeys("desks");
        driver.findElement(By.xpath("//input[@id='nav-search-submit-button']")).click();
        Thread.sleep(3000);
    }
    @AfterMethod
    public void closing() {

        driver.quit();
    }}