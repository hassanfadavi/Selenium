package tek.selenium.Alert;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class alert {
    public static void main(String[] args) throws InterruptedException {


       WebDriver chDriver=new ChromeDriver();
       chDriver.get("https://retail.tekschool-students.com/selenium/javascript-alerts");
       chDriver.manage().window().maximize();
       Thread.sleep(1000);

        WebElement simpleALert=chDriver.findElement(By.id("alertBtn"));
        Thread.sleep(2000);
        simpleALert.click();

        Alert aler=chDriver.switchTo().alert();
        aler.getText();

        Thread.sleep(2000);

        System.out.println(  aler.getText());

        aler.accept();

        chDriver.quit();

    }
}
