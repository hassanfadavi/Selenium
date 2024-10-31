package tek.selenium.XpathLocator.Xpath_relative;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class ActivityRecap3 {
    public static void main(String[] args) throws InterruptedException {

          /*
    In Retail app using your credentials login
    make sure you are logged in
    Only use relative XPATH
    WebElement -> isDisplayed();
     */




        //open Chrome
        ChromeDriver chdriver=new ChromeDriver();
        chdriver.get("https://retail.tekschool-students.com/");
        chdriver.manage().window().maximize();
        String pageTitle=chdriver.getTitle();
        System.out.println(pageTitle);
        Thread.sleep(2000);


        //SIGN IN
        By signInLocator = By.xpath("//a[@id='signinLink']");
        WebElement signInElement= chdriver.findElement(signInLocator);
        signInElement.click();


        //input Email
        By emailInput = By.xpath("//input[@name='email']");
        WebElement emailInputElement= chdriver.findElement(emailInput);
        emailInputElement.sendKeys("s.hasanfadavi@gmail.com");
        Thread.sleep(1000);


        //input pass
        By passInput = By.xpath("//input[@name='password']");
        WebElement passElement= chdriver.findElement( passInput);
        passElement.sendKeys("Se@123456");
        Thread.sleep(1000);


        //login
        By loginInput = By.xpath("//button[text() = 'Login']");
        WebElement loginElement= chdriver.findElement( loginInput);
        loginElement.click();
        Thread.sleep(1000);


        //checked log in

        boolean isLogoutDisplayed = chdriver.findElement(
                        By.xpath("//button[text() = 'Log out']"))
                .isDisplayed();

        if (isLogoutDisplayed) {
            System.out.println("Test Passed");
        }else {
            System.out.println("Test Failed");
        }

        chdriver.quit();










    }
}
