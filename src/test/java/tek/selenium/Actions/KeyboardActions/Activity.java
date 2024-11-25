package tek.selenium.Actions.KeyboardActions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Activity {


    public static String baseUrl="https://monday.com/";


    public static void main(String[] args) throws InterruptedException {


//        Navigate to "https://monday.com/

        /*

         * Press on login button

         * Simulate the real use interaction with input field and type something

         *

         **/


        WebDriver driver=new ChromeDriver();
        driver.get(baseUrl);
        driver.manage().window().maximize();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));


        WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));

        wait.until(ExpectedConditions.urlToBe(baseUrl));

        WebElement logInButton=driver.findElement(By.xpath("//a[text()='Log in' and @role='link']"));

       Actions ac=new Actions(driver);
       ac.click(logInButton).perform();

      WebElement email=driver.findElement(By.id("email"));

      ac.click(email).perform();


        for ( char character : "john_doe@gmail.com".toCharArray() ) {
            ac.sendKeys(String.valueOf(character)).perform();

        }







    }
}
