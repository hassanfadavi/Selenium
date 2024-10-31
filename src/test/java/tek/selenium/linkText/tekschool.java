package tek.selenium.linkText;

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
       By signLocator= By.linkText("Sign in");
       WebElement signElement=chdriver.findElement(signLocator);
       signElement.click();

        Thread.sleep(2000);

       //enter email
        By emailInput= By.name("email");
       WebElement  emailElement=chdriver.findElement(emailInput);
       emailElement.sendKeys("S.hasanfadavi@gmail.com");

        Thread.sleep(2000);

        //enter pass  
        By passwordInput= By.name("password");
        WebElement  passwordElement=chdriver.findElement(passwordInput);
        passwordElement.sendKeys("1234567");

        Thread.sleep(2000);

        //hit the login button
        By loginLocator= By.id("loginBtn");
        WebElement loginElement=chdriver.findElement(loginLocator);
        loginElement.click();

        Thread.sleep(2000);

        //print error
        By errorLocator= By.className("error");
        WebElement errorElement=chdriver.findElement(errorLocator);
        String txt=errorElement.getText();
        System.out.println(txt);


//        chdriver.quit();













//        chdriver.quit();



    }
}
