package tek.selenium.Actions.MouseActions;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Activity {

    public static String baseUrl="https://www.amazon.com/";

    public static void main(String[] args) throws InterruptedException {


//        Navigate to "https://www.amazon.com/" Using Action class
//
//        1. Move the mouse in the middle of (Hover) the "Prime" button.
//
//        2. Perform a left click on any of the buttons.
//
//        3. Perform A right click on one of the buttons.
//

         WebDriver driver=new EdgeDriver();
         driver.get(baseUrl);
         driver.manage().window().maximize();

          driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));


           WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(5));

            wait.until(ExpectedConditions.urlToBe(baseUrl));

            WebElement primeButton=driver.findElement(By.xpath("//a[@id='nav-link-amazonprime']"));

            Actions ac=new Actions(driver);

        // Move the mouse in the middle of (Hover) the "Prime" button.
            ac.contextClick(primeButton).perform();


        // Perform a left click on any of the buttons.
            ac.click(primeButton).perform();

            //navigate to previous page

        driver.navigate().back();









    }
}
