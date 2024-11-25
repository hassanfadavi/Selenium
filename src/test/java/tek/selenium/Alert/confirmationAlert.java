package tek.selenium.Alert;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import tek.selenium.Alert.obj.alerts;

import java.time.Duration;

public class confirmationAlert {
    public static void main(String[] args) throws InterruptedException {


//        alerts obj=new alerts();
//        obj.getUrl("https://retail.tekschool-students.com/selenium/javascript-alerts");
//        obj.manages();
//        obj.waiitFor(3000);
//        obj.title();
//        WebElement confirmBtn=obj.finElementByid("confirmBtn");
//        obj.click(confirmBtn);
//        obj.waiitFor(3000);
//        obj.switchAlert();
//        obj.waiitFor(3000);
//        obj.dismiss();


//        WebDriver chDriver=new ChromeDriver();
//        chDriver.get("https://retail.tekschool-students.com/selenium/javascript-alerts");
//        chDriver.manage().window().maximize();
//        String title=chDriver.getTitle();
//        System.out.println(title);
//        Thread.sleep(1000);
//
//        WebElement confirmButton=chDriver.findElement(By.id("confirmBtn"));
//        confirmButton.click();
//        Thread.sleep(2000);
//
//
//        Alert confirmAlert=chDriver.switchTo().alert();
//        confirmAlert.dismiss();
//        Thread.sleep(2000);

//        System.out.println(confirmAlert.getText());


//        chDriver.close();

        WebDriver driver = new ChromeDriver();
        Actions ac = new Actions(driver);
        driver.get("https://testautomationpractice.blogspot.com/");
        driver.manage().window().maximize();
        System.out.println(driver.getCurrentUrl());

        //implicit
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        //explicit
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));


        WebElement simpleAler=driver.findElement(By.xpath("//button[@id='confirmBtn']"));
        ac.click(simpleAler).perform();
//     validate
       wait.until(ExpectedConditions.alertIsPresent()).accept();





    }
}
