package tek.selenium.Actions.MouseActions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class ClickActions {
    public static void main(String[] args) throws InterruptedException {

      EdgeDriver chDriver =new EdgeDriver();
      chDriver.get("https://amazon.com");
      chDriver.manage().window().maximize();
       Thread.sleep(2000);


      WebElement dropDown=chDriver.findElement(By.xpath("//span[text()='Medical Care']"));

         Actions ac =new Actions(chDriver);

         ac.contextClick(dropDown).perform();   //right click
//         ac.click(dropDown).perform();   //click














    }
}
