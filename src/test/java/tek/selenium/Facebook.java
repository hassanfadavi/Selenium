package tek.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook {
    public static void main(String[] args) throws InterruptedException{


        ChromeDriver chdriver=new ChromeDriver();
        chdriver.get("https://www.facebook.com/");

        String pagetitle=chdriver.getTitle();
        System.out.println(pagetitle);

       Thread.sleep(5000);

        //email
        By emailInput= By.name("email");
        WebElement emailElement=chdriver.findElement(emailInput);
        emailElement.sendKeys("s.hassanfadavi@gmail.com");


        //pass
        By passInput= By.name("pass");
        WebElement passelement=chdriver.findElement(passInput);
        passelement.sendKeys("123456");




    }
}
