package tek.selenium.CSS;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Activity8 {
    public static void main(String[] args) throws InterruptedException {

        //open Chrome
        ChromeDriver chdriver=new ChromeDriver();
        chdriver.get("https://retail.tekschool-students.com/");
        chdriver.manage().window().maximize();
        String pageTitle=chdriver.getTitle();
        System.out.println(pageTitle);
        Thread.sleep(2000);

        //SIGN IN
        By signInLocator = By.cssSelector("a#signinLink");
        WebElement signInElement= chdriver.findElement(signInLocator);
        signInElement.click();


        //input Email
        By emailInput = By.cssSelector("input#email");
        WebElement emailInputElement= chdriver.findElement(emailInput);
        emailInputElement.sendKeys("s.hasanfadavi@gmail.com");
        Thread.sleep(1000);

        //input pass
        By passInput = By.cssSelector("input#password");
        WebElement passElement= chdriver.findElement( passInput);
        passElement.sendKeys("12333");
        Thread.sleep(1000);

        //login
        By loginInput = By.xpath("input#loginBtn");
        WebElement loginElement= chdriver.findElement( loginInput);
        loginElement.click();
        Thread.sleep(1000);


//        //print error
        By error = By.cssSelector("div.error");
        WebElement errorElement= chdriver.findElement( error);
        String text=errorElement.getText();
        System.out.println(text);
        Thread.sleep(1000);

        chdriver.quit();



    }
}
