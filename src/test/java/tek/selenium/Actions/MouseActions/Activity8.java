package tek.selenium.Actions.MouseActions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Activity8 {

    public static final String urlAmazon="https://www.amazon.com/";
    public static final String urlloginPage="https://www.amazon.com/ap/signin";

    public static final String helloSignInxpath="//span[text()='Hello, sign in']";
    public static final String  SignInButtonxpath="//span[text()='Sign in']";
    public static final String  emailFieldxpath="//input[@type='email']";



    public static void main(String[] args) throws InterruptedException {
//* Navigate to "https://www.amazon.com/"
//* Move the mouse to "Hello, sign in Account & Lists"
//* Click on Sign In button
//* Navigate to login page and verify that the user is on the login page
//* Try to use XPATH to capture and locate the elements on the web page!

        WebDriver driver=new ChromeDriver();
        WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        Actions ac=new Actions(driver);
        driver.manage().window().maximize();


        //navigate to amazon
        driver.get(urlAmazon);
//        //validate
//        wait.until(ExpectedConditions.urlToBe(urlAmazon));
//
        //locate hello
        WebElement hellosignIn=driver.findElement(By.xpath(helloSignInxpath));
        //validate
        wait.until(ExpectedConditions.elementToBeClickable(hellosignIn));
//        //hoverthe mouse
        ac.moveToElement(hellosignIn).perform();
        Thread.sleep(1000);


        //locate sign in
        WebElement signInButun=driver.findElement(By.xpath(SignInButtonxpath));
        //validate
        wait.until(ExpectedConditions.elementToBeClickable(signInButun));
        //click
        ac.click(signInButun).perform();


//        //locate
//       WebElement emailfield=driver.findElement(By.xpath(emailFieldxpath));
//     //  vaidate to log in loginPage
//        wait.until(ExpectedConditions.urlToBe(urlloginPage));
//       //validate
//        wait.until(ExpectedConditions.elementToBeClickable(emailfield));


        Thread.sleep(3000);
        driver.close();
        driver.quit();

//

    }
}
