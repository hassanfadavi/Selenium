package tek.selenium.NAMELOCATOR;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook {
    public static void main(String[] args) throws InterruptedException{


        ChromeDriver chdriver=new ChromeDriver();
        chdriver.get("https://www.facebook.com/");

        String pagetitle=chdriver.getTitle();
        System.out.println(pagetitle);
        chdriver.manage().window().maximize();

       Thread.sleep(5000);


        //input email
        By emailInput= By.name("email");
        WebElement emailElement=chdriver.findElement(emailInput);
        emailElement.sendKeys("s.hassanfadavi@gmail.com");


        //pass
        By passInput= By.name("pass");
        WebElement passelement=chdriver.findElement(passInput);
        passelement.sendKeys("123456");

        Thread.sleep(5000);
         chdriver.quit();


    }
}
