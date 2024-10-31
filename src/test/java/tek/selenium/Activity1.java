package tek.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Activity1 {
    public static void main(String[] args) throws InterruptedException {
        /*On New Retail App https://dev.retail.tekschool-students.com/Sign in with  following user and
        make sure You logged in and use name displayunder user
        profile drop down{name: "Quinn Turner",email:
        "quinn.turner@example.com",password: "password123",    }, */

        //open Chrome
        ChromeDriver chdriver=new ChromeDriver();
        chdriver.get("https://dev.retail.tekschool-students.com/");
        chdriver.manage().window().maximize();
        String pageTitle=chdriver.getTitle();
        System.out.println(pageTitle);
        Thread.sleep(2000);

        //implicit
        chdriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        //explicit
        WebDriverWait wait=new WebDriverWait(chdriver , Duration.ofSeconds(20));


        //SIGN IN
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[text()='Sign in']")));

        By  signInLocator = By.xpath("//a[text()='Sign in']");  //id
        WebElement signInElement= chdriver.findElement(signInLocator);
        signInElement.click();


        //input email
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("input#email")));

        By inputEmail = By.cssSelector("input#email");
        WebElement emailElement= chdriver.findElement(inputEmail);
        emailElement.sendKeys("s.hasanfadavi@gmail.com");


        //input pass
        wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("input#password")));

        By inputPass = By.cssSelector("input#password");
        WebElement passElement= chdriver.findElement(inputPass);
        passElement.sendKeys("Se@123456");



        //SIGN IN
        wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("button[type='submit']")));

        By  sign  = By.cssSelector("button[type='submit']");  //id
        WebElement signElement= chdriver.findElement(sign );
        signElement.click();


        //profile
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@class ='ant-space-item']/button")));

        By  profile = By.xpath("//div[@class = 'ant-space-item']/button");  //id
        WebElement profileElement= chdriver.findElement(profile);
        profileElement.click();



        //By.xpath("//ul//div[@class = 'ant-space-item']")
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='ant-space-item']/button")));

        By  title  = By.xpath("//ul//div[@class = 'ant-space-item']");
        WebElement titleEment= chdriver.findElement(title );
        String text=titleEment.getText();
        System.out.println(text);


        if(text.equals("Quinn Turner")){System.out.println("Passed");
        }else System.out.println("not passed");

chdriver.quit();



    }

}
