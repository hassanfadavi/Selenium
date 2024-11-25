package tek.selenium.MultipleTabs;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Activity1 {

    public static void main(String[] args) throws InterruptedException {

//* Create object of ChromeDriver Open browser
//* Open three tabs and navigate to 3 different web pages.
//* get the title of each page. print them into console.
//* switch to the second tab
//* close the second tab
        //* quit the driver





       WebDriver chDriver=new ChromeDriver();
       chDriver.get("https://tekschool.us/");
       chDriver.manage().window().maximize();
        Thread.sleep(2000);

        ( (JavascriptExecutor)chDriver).executeScript("window.open('https://monday.com', '_blank')");
        Thread.sleep(2000);


        ( (JavascriptExecutor)chDriver).executeScript("window.open('https://www.ebay.com', '_blank')");
        Thread.sleep(2000);

        ( (JavascriptExecutor)chDriver).executeScript("window.open('https://www.amazon.com', '_blank')");
        Thread.sleep(2000);


//       //print title

//       List<String> tabs=new ArrayList<>(chDriver.getWindowHandles());
//        chDriver.switchTo().window(tabs.get(1));
//        String titleMonday=chDriver.getTitle();
//        System.out.println(titleMonday);
//
//        chDriver.switchTo().window(tabs.get(2));
//        String titleEbay=chDriver.getTitle();
//        System.out.println(titleEbay);
//
//        chDriver.switchTo().window(tabs.get(3));
//        String titleAmazon=chDriver.getTitle();
//        System.out.println(titleAmazon);




        //or
       //print title

        List<String> tabs=new ArrayList<>(chDriver.getWindowHandles());

        ArrayList titles=new ArrayList ();


        for( String tab  :tabs  ){

            chDriver.switchTo().window(tab);
            titles.add(chDriver.getTitle());

        }

        for (   var  title :titles     ){
            System.out.println(title);
        }









       //switch to second window
       chDriver.switchTo().window(tabs.get(1));
       chDriver.close();

       chDriver.quit();
















    }
}
