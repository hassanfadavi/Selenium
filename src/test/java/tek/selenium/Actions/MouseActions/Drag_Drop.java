package tek.selenium.Actions.MouseActions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Drag_Drop {
    public static void main(String[] args) throws InterruptedException {



        ChromeDriver chDriver =new ChromeDriver();
        chDriver.get("https://retail.tekschool-students.com/selenium/drag-drop");
        chDriver.manage().window().maximize();
        Thread.sleep(2000);



        WebElement source=chDriver.findElement(By.xpath("//div[text()='Payment should not accept invalid expiration date']"));

        WebElement target=chDriver.findElement(By.xpath("//div[@data-rbd-droppable-id='2']"));


        Actions ac =new Actions(chDriver);
        ac.clickAndHold(source)
                .moveByOffset(0,10).
                moveToElement(target).
                release().
                perform();













    }
}
