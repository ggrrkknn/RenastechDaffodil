package students.GurkanOzturk;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class lab02 {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();

        //Task 1 - Facebook title verification


        driver.navigate();
        driver.navigate().to("https://www.facebook.com");
        String expectedTitleForFacebook="Facebook - Log In or Sign Up";
        if (driver.getTitle().equalsIgnoreCase(expectedTitleForFacebook)){
            System.out.println("Facebook title verification has passed.");
        }else {
            System.out.println("Facebook title verification has not passed.");
        }

        //Task - 2


        driver.navigate();
        driver.navigate().to("https://www.google.com/");
        driver.navigate().back();
        driver.navigate().forward();
        driver.navigate().to("https://www.amazon.com");
        String expectedTitleForAmazon="Smile";
        if (driver.getTitle().contains(expectedTitleForAmazon)){
            System.out.println("Amazon title verification has passed.");
        }else {
            System.out.println("Amazon title verification has passed.");
        }

        //Second Task:


        driver.navigate().to("https://www.etsy.com/");
        driver.manage().window().maximize();
        String expectedTitleForEtsy="Smile";
        if (driver.getTitle().contains(expectedTitleForEtsy)){
            System.out.println("Etsy title does not contain Smile and title verification has failed.");
        }else {
            System.out.println("Etsy title contains Smile and title verification has passed.");
        }
        System.out.println("Current Url is: " + driver.getCurrentUrl());
        driver.navigate().to("https://www.amazon.com/");
        System.out.println("Current title is: " + driver.getTitle());
        System.out.println("Current Url is: " + driver.getCurrentUrl());
        driver.navigate().back();
        driver.navigate().refresh();
        driver.close();



    }
}


