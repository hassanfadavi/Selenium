package tek.selenium.Actions.KeyboardActions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class test1 {
    public static void main(String[] args) throws InterruptedException {



        ChromeDriver chDriver =new ChromeDriver();
        chDriver.get("https://monday.com/");
        chDriver.manage().window().maximize();
        Thread.sleep(2000);


        WebElement logIn=chDriver.findElement(By.linkText("Log in"));


        Actions ac =new Actions(chDriver);
        ac.click(logIn).perform();


        WebElement email=chDriver.findElement(By.id("user_email"));


        ac.click(email).perform();

        for(   char   ch :"hhhhh@gmail.com".toCharArray() ){

            ac.sendKeys(String.valueOf(ch)).perform();
            Thread.sleep(1000);
        }

        Thread.sleep(2000);




    }
}
