package tek.selenium;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Activity1 {
    public static void main(String[] args) throws InterruptedException {

        //open Chrome
        ChromeDriver chdriver=new ChromeDriver();
        chdriver.get("https://dev.retail.tekschool-students.com/");
        String pageTitle=chdriver.getTitle();
        System.out.println(pageTitle);
        Thread.sleep(1000);
        chdriver.quit();

        //open Edge
        EdgeDriver edgeDriver=new EdgeDriver();
        edgeDriver.get("https://dev.retail.tekschool-students.com/");
        String pagTitle=edgeDriver.getTitle();
        System.out.println(pagTitle);
        Thread.sleep(1000);
        edgeDriver.quit();







    }
}
