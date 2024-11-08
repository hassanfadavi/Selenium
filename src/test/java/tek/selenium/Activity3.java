package tek.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class Activity3 {
    public static void main(String[] args) throws InterruptedException {




        EdgeDriver chDriver =new EdgeDriver();
        chDriver.get("https://amazon.com");
        chDriver.manage().window().maximize();
        Thread.sleep(2000);


        WebElement primeBtn=chDriver.findElement(By.id("nav-link-amazonprime"));

        Actions ac =new Actions(chDriver);

        ac.contextClick(primeBtn).perform();
        ac.click(primeBtn).perform();

       chDriver.quit();






    }
}
