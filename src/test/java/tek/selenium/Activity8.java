package tek.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Activity8 {

    public static final String urlAmazon="https://www.amazon.com/";
    public static final String loginPage="https://www.amazon.com/ap/signin?openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.com%2F%3Fref_%3Dnav_ya_signin&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=usflex&openid.mode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0";


    public static void main(String[] args) {

        WebDriver driver=new EdgeDriver();
        WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(5));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        Actions ac=new Actions(driver);
        driver.manage().window().maximize();
        String title=driver.getTitle();
        System.out.println(title);

        driver.get(urlAmazon);
        //validate
        wait.until(ExpectedConditions.urlToBe(urlAmazon));

        //locate  sign In
        WebElement signIn=driver.findElement(By.xpath("//a[@id='nav-link-accountList']"));
        //move the mouse
        ac.moveToElement(signIn).perform();

        WebElement signInButun=driver.findElement(By.xpath("//div[@id='nav-flyout-ya-signin']//span"));
        ac.click(signInButun).perform();

        //validate
        wait.until(ExpectedConditions.urlToBe(loginPage));
    }
}
