package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class tekschool {
    public static void main(String[] args) throws InterruptedException{

        //open the website
        ChromeDriver chdriver=new ChromeDriver();
        chdriver.get("https://retail.tekschool-students.com/");
        chdriver.manage().window().maximize();
        Thread.sleep(2000);
        String pageTitle=chdriver.getTitle();
        System.out.println(pageTitle);


        //sign in
       By signLocator= By.id("signinLink");
       WebElement signElement=chdriver.findElement(signLocator);
       signElement.click();

       //create account
        By emailLocator= By.name("email");
       WebElement  emailElement=chdriver.findElement(emailLocator);
       emailElement.sendKeys("S.hasanfadavi@gmail.com");



        //create pass
        By passwordLocator= By.name("password");
        WebElement  passwordElement=chdriver.findElement(passwordLocator);
        passwordElement.sendKeys("1234567");

        //hit the login button
        By loginLocator= By.id("loginBtn");
        WebElement loginElement=chdriver.findElement(loginLocator);
        loginElement.click();


        //print error
        By errorLocator= By.className("error");
        WebElement errorElement=chdriver.findElement(errorLocator);
        String txt=errorElement.getText();
        System.out.println(txt);

//        chdriver.quit();













//        chdriver.quit();



    }
}
