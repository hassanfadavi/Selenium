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
        wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("a#signinLink")));

        By signInLocator = By.cssSelector("a#signinLink");   //id
        WebElement signInElement= chdriver.findElement(signInLocator);
        signInElement.click();

        //input Email
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("input[name='email']")));

        By emailInput = By.cssSelector("input[name='email']");     //Attribute
        WebElement emailInputElement= chdriver.findElement(emailInput);
        emailInputElement.sendKeys("s.hasanfadavi@gmail.com");


        //input pass
        wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("input[name='password']")));

        By passInput = By.cssSelector("input[name='password']");   //Attribute
        WebElement passElement= chdriver.findElement( passInput);
        passElement.sendKeys("12333");


        //login
        wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("button#loginBtn")));

        By loginInput = By.cssSelector("button#loginBtn");     //id
        WebElement loginElement= chdriver.findElement( loginInput);
        loginElement.click();


//        //print error
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("div.error")));

        By error = By.cssSelector("div.error");         //class
        WebElement errorElement= chdriver.findElement( error);
        String text=errorElement.getText();
        System.out.println(text);


        chdriver.quit();





    }
}
