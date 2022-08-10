package students.GurkanOzturk;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class lab04 {
    public static void main(String[] args) throws InterruptedException{

        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();

        driver.navigate();

        driver.navigate().to("https://demo.guru99.com/test/radio.html");

        List<WebElement> checkboxes=driver.findElements(By.xpath("//input[@type='checkbox']"));

        int passedAmount=0, failedamount=0;

        for(int i = 0; i < checkboxes.size(); i++){
            if(!checkboxes.get(i).isSelected()) {
                passedAmount++;
            }else{
                failedamount++;
            }
        }
        if (passedAmount == checkboxes.size()) {
            System.out.println("Checkbox verification has passed.");
        }else if (failedamount== checkboxes.size()) {
            System.out.println("Checkbox verification has failed. All boxes are selected");
        }else {
            System.out.println("This verification has failed because some of the boxes are selected.");

            checkboxes.get(2).click();

            if (!checkboxes.get(2).isSelected()) {
                System.out.println("Checkbox is not selected");
            }else {
                System.out.println("Checkbox 3 is selected.");
            }
        }


    }
}
