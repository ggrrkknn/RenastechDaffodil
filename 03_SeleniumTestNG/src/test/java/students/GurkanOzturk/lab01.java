package students.GurkanOzturk;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class lab01 {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver chrome=new ChromeDriver();
        chrome.get("https://www.etsy.com/");
        chrome.manage().window().maximize();
        chrome.get("https://www.amazon.com/");
        System.out.println("driver.get.Title() = " + chrome.getTitle());

    }
}
