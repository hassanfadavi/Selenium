package tek.selenium;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Browser_setting {
    public static void main(String[] args) {


//        EdgeDriver driver=new EdgeDriver();

//        driver.get("https://www.google.com/");
//
//        //maximize browser(the screen)
//        driver.manage().window().maximize();
//
//        //print the title of website
//        String pageTitle=driver.getTitle();
//        System.out.println(pageTitle);
//        driver.quit();


        ChromeDriver driver=new ChromeDriver();
        driver.get("https://www.bbc.com/");


        driver.manage().window().maximize();


        String pageTitle=driver.getTitle();
        System.out.println(pageTitle);
        driver.quit();


    }
}
