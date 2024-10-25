package tek.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.List;
import java.util.Scanner;

public class Activity2 {
    public static void main(String[] args) throws InterruptedException {

//open Chrome
        ChromeDriver chdriver=new ChromeDriver();
        chdriver.get("https://dev.retail.tekschool-students.com/");
        chdriver.manage().window().maximize();
        String pageTitle=chdriver.getTitle();
        System.out.println(pageTitle);
        Thread.sleep(2000);




        //input Apple
        By searchlInput= By.id("searchInput");
        WebElement searchlElement=chdriver.findElement(searchlInput);
        searchlElement.sendKeys("Apple");
        Thread.sleep(2000);

       //searchBtn
        By  searchBtnlocator= By.xpath(" /html/body/div[1]/div[1]/span/span/span/button/span/span");
        WebElement searchElement= chdriver.findElement(searchBtnlocator);
        searchElement.click();
        Thread.sleep(2000);


        By appleLocator=By.tagName("h4") ;
        List< WebElement> allLinkElements=chdriver.findElements(appleLocator);

        int count = 0;
        for(WebElement element:allLinkElements){
            String text=element.getText();
            System.out.println(text);
            count++;

        }
        System.out.println("number of Apple: "+count);

        chdriver.quit();













    }
}
