package tek.selenium.Alert;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;

public class alert_Activity {

    public static final String baseUrl="https://testautomationpractice.blogspot.com/";


    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        Actions ac = new Actions(driver);
        driver.get(baseUrl);
        driver.manage().window().maximize();
        System.out.println(driver.getCurrentUrl());

        //implicit
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        //explicit
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));


        WebElement simpleAler=driver.findElement(By.xpath("//button[@id='alertBtn']"));
//     validate
        wait.until(ExpectedConditions.elementToBeClickable(simpleAler));
        ac.click(simpleAler).perform();

        Alert simpleAlert=driver.switchTo().alert();
        System.out.println(simpleAlert.getText());

        if(simpleAlert.getText().equals("I am an alert box!")){
            simpleAlert.accept();
        }

    }
}

