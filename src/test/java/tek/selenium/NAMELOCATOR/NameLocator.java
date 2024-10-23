package tek.selenium.NAMELOCATOR;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NameLocator {
    public static void main(String[] args) throws InterruptedException{


        ChromeDriver chdriver=new ChromeDriver();
        chdriver.get("https://retail.tekschool-students.com/");

        String pagetitle=chdriver.getTitle();
        System.out.println(pagetitle);
        chdriver.manage().window().maximize();

          By signLocator= By.id("signinLink");

         chdriver.findElement(signLocator).click();

        Thread.sleep(5000);

           //email
           By emailInputLocator= By.name("email");
           WebElement emailElement=chdriver.findElement(emailInputLocator);
           emailElement.sendKeys("s.hassanfadavi@gmail.com");


         //pass
        By passlInputLocator= By.name("password");
        WebElement passelemt=chdriver.findElement(passlInputLocator);
        passelemt.sendKeys("123456");

        //login
        By loginButton= By.name("loginBtn");
        WebElement loginElement=chdriver.findElement(loginButton);
         loginElement.click();

         chdriver.quit();




    }
}
