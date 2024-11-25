package tek.selenium.Actions.KeyboardActions;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SendKeyActions {
    public static void main(String[] args) throws InterruptedException {
        ChromeDriver chDriver =new ChromeDriver();
        chDriver.get("https://www.facebook.com/");
        chDriver.manage().window().maximize();
        Thread.sleep(2000);


        WebElement userName=chDriver.findElement(By.id("email"));
        WebElement pass=chDriver.findElement(By.id("pass"));

        Actions ac =new Actions(chDriver);
        ac.click(userName).perform();


        ac.keyDown(Keys.SHIFT).perform();   //capital letter


        for(   char   ch :"Hello Human".toCharArray() ){

            ac.sendKeys(String.valueOf(ch)).perform();
            Thread.sleep(1000);
        }

        ac.click(pass).perform();

        for(   char   ch :"hiiiii".toCharArray() ){

            ac.sendKeys(String.valueOf(ch)).perform();
            Thread.sleep(1000);
        }



        Thread.sleep(2000);







    }
}
