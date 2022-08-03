package students.GurkanOzturk;

import code.utilities.WebDriverUtil;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class lab03 {
    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();

        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.google.com");
        Thread.sleep(2000);
        driver.findElement(By.name("q")).sendKeys("apple");
        driver.findElement(By.xpath("/html/body/div/div[3]/form/div/div/div[3]/center/input")).click();
        Thread.sleep(2000);
        String containTitle="apple";
        String actualTitle=driver.getTitle();
        boolean expected=actualTitle.startsWith(containTitle);
        if(expected){
            System.out.println("The title starts with apple word");
        }else{
            System.out.println("The title does not start with apple word");
        }

        driver.navigate().back();
        Thread.sleep(2000);
        driver.findElement(By.name("q")).sendKeys("cherry");
        driver.findElement(By.xpath("/html/body/div/div[3]/form/div/div/div[3]/center/input")).click();
        Thread.sleep(2000);
        String containTitle2="cherry";
        String actualTitle2=driver.getTitle();
        boolean expected2=actualTitle2.contains(containTitle2);
        if(expected2){
            System.out.println("Title contains cherry word.");
        }else{
            System.out.println("Title does not contain cherry word.");
        }

        driver.get("https://www.google.com");

        Thread.sleep(2000);
        driver.findElement(By.name("q")).sendKeys("apple");
        driver.findElement(By.xpath("/html/body/div/div[3]/form/div/div/div[3]/center/input[2]")).click();
        Thread.sleep(2000);
        String containTitle3="apple";
        String actualTitle3=driver.getTitle();
        boolean expected3=actualTitle3.startsWith(containTitle3);
        if(expected){
            System.out.println("The title contains apple word.");
        }else{
            System.out.println("Title does not contain apple word.");
        }

        driver.get("https://opensource-demo.orangehrmlive.com/");
        driver.findElement(By.id("txtUsername")).sendKeys("Admin");
        Thread.sleep(2000);
        driver.findElement(By.id("txtPassword")).sendKeys("admin123");
        Thread.sleep(2000);
        driver.findElement(By.id("btnLogin")).click();
        Thread.sleep(2000);
        driver.close();

    }
}