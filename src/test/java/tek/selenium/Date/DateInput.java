package tek.selenium.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DateInput {


    public static String baseUrl="https://retail.tekschool-students.com/selenium/inputs";

    public static void main(String[] args) throws InterruptedException {



        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(baseUrl);

        WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));


        wait.until(ExpectedConditions.urlToBe(baseUrl));

       WebElement date=driver.findElement(By.id("dateInput"));

        Actions ac=new Actions(driver);
        ac.click(date).perform();

//local Date
        LocalDate today=   LocalDate.now();    //MM-dd-YYYY
         String correctedFormat=today.format(DateTimeFormatter.ofPattern("MM-d-yyyy"));
        ac.sendKeys(correctedFormat).perform();
        Thread.sleep(5000);

        //custom Date

        String customDate="09/03/2023";
        date.clear();
        Thread.sleep(2000);
        date.sendKeys(customDate);











    }
}
