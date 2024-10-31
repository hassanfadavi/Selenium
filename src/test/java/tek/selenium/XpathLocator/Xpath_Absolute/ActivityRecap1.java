package tek.selenium.XpathLocator.Xpath_Absolute;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActivityRecap1 {
    public static void main(String[] args) throws InterruptedException {

        /*
    In Retail App https://retail.tekschool-students.com/
    Search for TV and Click on First product displayed
    Then print the product title on the next page.

     */



        //open Chrome
        ChromeDriver chdriver=new ChromeDriver();
        chdriver.get("https://retail.tekschool-students.com/");
        chdriver.manage().window().maximize();
        String pageTitle=chdriver.getTitle();
        System.out.println(pageTitle);
        Thread.sleep(2000);

       //input TV
        By inputSearch = By.xpath("/html/body/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/input");
        WebElement inputElement= chdriver.findElement(inputSearch);
        inputElement.sendKeys("TV");
        Thread.sleep(1000);

        //search Button
        By  SearchLocator = By.xpath("/html/body/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/button");
        WebElement searchElement= chdriver.findElement(SearchLocator);
        searchElement.click();
        Thread.sleep(1000);


         //SELECT TV
        By  tvLocator = By.xpath("/html/body/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/p");
        WebElement tvElement= chdriver.findElement(tvLocator);
        tvElement.click();
        Thread.sleep(1000);


        //print title
        By  titlePrint = By.xpath("/html/body/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[2]/h1");
        WebElement titleEment= chdriver.findElement(titlePrint);
        String text=titleEment.getText();
        System.out.println(text);
        Thread.sleep(1000);


        chdriver.quit();



    }
}
