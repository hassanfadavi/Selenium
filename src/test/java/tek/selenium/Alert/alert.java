package tek.selenium.Alert;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import tek.selenium.Alert.obj.alerts;

public class alert {
    public static void main(String[] args) throws InterruptedException {


       alerts obj=new alerts();

       obj.getUrl("https://retail.tekschool-students.com/selenium/javascript-alerts");

       obj.manages();
       obj.title();
       obj.waiitFor(3000);

        WebElement simpleALertbt= obj.finElementByid("alertBtn");
        obj.click(simpleALertbt);
        obj.waiitFor(3000);
        obj.switchAlert();
        obj.getAlerText();
        obj.accept();

//       WebDriver chDriver=new ChromeDriver();
//       chDriver.get("https://retail.tekschool-students.com/selenium/javascript-alerts");
//       chDriver.manage().window().maximize();
//       String title=chDriver.getTitle();
//        System.out.println(title);
//       Thread.sleep(1000);
//
//        WebElement simpleALertbt=chDriver.findElement(By.id("alertBtn"));
//        Thread.sleep(2000);
//        simpleALert.click();
//
//        Alert alert=chDriver.switchTo().alert();
//        alert.getText();
//
//        Thread.sleep(2000);
//
//        System.out.println(  alert.getText());
//
//        alert.accept();

//        chDriver.quit();

    }


}
