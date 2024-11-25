package tek.selenium.RadioButton;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.ArrayList;
import java.util.List;

public class Radio {
    public static void main(String[] args) throws InterruptedException {




        ChromeDriver chDriver =new ChromeDriver();
        chDriver.get("https://retail.tekschool-students.com/selenium/radio");
        chDriver.manage().window().maximize();
        Thread.sleep(2000);



       WebElement htmlRadioBut=chDriver.findElement(By.id("html"));
       htmlRadioBut.click();

       if(htmlRadioBut.isSelected()){
           System.out.println("yes");

       }else System.out.println("no");


                     List<WebElement > btnList=chDriver.findElements(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[2]/div[1]/form[1]/div[3]/p[1]"));

                     for(   WebElement    radios:btnList         ){

                         System.out.println(radios.getAttribute("value"));
                     }












    }
}
