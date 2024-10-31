package tek.selenium.Activity;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Activity3 {
    public static void main(String[] args)  throws  InterruptedException{

  /*
    In New Retail app https://dev.retail.tekschool-students.com/
    Go to sign in page and enter wrong@email.com as email
    and passwordWrong as password
    You should error message "Email or Password is incorrect"
    print that error
     */
        //open Chrome
       ChromeDriver chDriver=new ChromeDriver();
       chDriver.get("https://dev.retail.tekschool-students.com/");
       String pageTitle=chDriver.getTitle();
        System.out.println(pageTitle);
        chDriver.manage().window().maximize();
        Thread.sleep(1000);

        //sign in
          By signLocator=By.linkText("Sign in");
        WebElement signElement=chDriver.findElement(signLocator);
        signElement.click();
        Thread.sleep(1000);

        //input email
           By emailLocator=By.id("email");
           WebElement emailElement=chDriver.findElement(emailLocator);
           emailElement.sendKeys("s.hasanfadavi@gmail.com");
        Thread.sleep(1000);

        //input pass
        By passLocator=By.name("password");
        WebElement passElement=chDriver.findElement(passLocator);
        passElement.sendKeys("xcxcxzxcczx");
        Thread.sleep(1000);

        //sign in
        By signinLocator=By.className("ant-btn-primary" );
        WebElement signinElement=chDriver.findElement(signinLocator);
        signinElement.click();
        Thread.sleep(1000);

        //print error
        By errorLocator=By.className("ant-alert-message" );
        WebElement errorElement=chDriver.findElement(errorLocator);
        String text=errorElement.getText();
        System.out.println(text);
        Thread.sleep(1000);


        Thread.sleep(1000);

    }
}
