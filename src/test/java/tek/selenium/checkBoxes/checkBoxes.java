package tek.selenium.checkBoxes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class checkBoxes {


 public static String baseUrl="https://retail.tekschool-students.com/selenium/checkbox";


    public static void main(String[] args) {


       WebDriver driver=new ChromeDriver();
       driver.manage().window().maximize();
        driver.get(baseUrl);

        WebDriverWait  wait=new WebDriverWait(driver,Duration.ofSeconds(10));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));


        wait.until(ExpectedConditions.urlToBe(baseUrl));



////

        Actions ac=new Actions(driver);
         WebElement javacheckedBox=driver.findElement(By.id("javaInput"));
        ac.click(javacheckedBox).perform();


//select all of them
      List<WebElement> listOfcheckBoxes =driver.findElements(By.xpath("//div[@id='firstQuestion']//input"));
      for (  WebElement   list    :listOfcheckBoxes     ){

                  ac.click(list).perform();
      }











    }
}
