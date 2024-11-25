package tek.selenium.MultipleTabs;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.ArrayList;
import java.util.List;

public class MultipleTabs {



   final static String tek="https://tekschool.us/";
  final static String google="https://www.google.com/";
  final  static String monday="https://monday.com/";

    public static void main(String[] args) throws InterruptedException {

       ChromeDriver chDriver=new ChromeDriver();

       chDriver.get(tek);

        ((JavascriptExecutor) chDriver).executeScript("window.open('https://www.google.com/', '_blank');");
        Thread.sleep(3000);
        ((JavascriptExecutor) chDriver).executeScript("window.open('https://monday.com/', '_blank');");
        Thread.sleep(3000);
        // TekSchool --> 0
        // Google --> 1
        // Monday --> 2


        List<String> tabs = new ArrayList<>(chDriver.getWindowHandles());

        Thread.sleep(3000);

        chDriver.switchTo().window(tabs.get(0));

        for ( String tab : tabs ) {
            chDriver.switchTo().window(tab);
           chDriver.close();
        }


       Thread.sleep(3000);


//       chDriver.quit();


    }
}
