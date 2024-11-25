package tek.selenium.implicit_Explicit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class implicit_Explicit {
    public static void main(String[] args) {

        //open Chrome
        ChromeDriver chdriver=new ChromeDriver();
        chdriver.get("https://retail.tekschool-students.com/");
        chdriver.manage().window().maximize();
        String pageTitle=chdriver.getTitle();
        System.out.println(pageTitle);

        //implicit
        chdriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        //explicit
        WebDriverWait wait=new WebDriverWait(chdriver , Duration.ofSeconds(20));


        //SIGN IN
        wait.until(ExpectedConditions.elementToBeClickable(
                By.cssSelector("a#signinLink")))
                .click();


        //input Email
        wait.until(ExpectedConditions.visibilityOfElementLocated(
                By.cssSelector("input[name='email']"))).sendKeys("s.hasanfadavi@gmail.com");

        //input pass
        wait.until(ExpectedConditions.presenceOfElementLocated(
                By.cssSelector("input[name='password']")))
                .sendKeys("12333");

        //login
        wait.until(ExpectedConditions.elementToBeClickable(
                By.cssSelector("button#loginBtn")))
                .click();

//        //print error
        wait.until(ExpectedConditions.visibilityOfElementLocated
                        (By.cssSelector("div.error")))
                         .getText();

        chdriver.quit();





    }
}
