package tek.selenium.Links;

import com.sun.source.tree.PackageTree;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;
import java.util.Stack;

public class InteractwithLinks {
    /*
     * Navigate to "https://retail.tekschool-students.com/selenium/links"
     * Capture the locator for the first link
     * Try to click
     * Capture the locator for the second link
     * Try to click
     * Capture the locator for the third link
     * Try to click
     * NOTE: for each one of them, try to create a method. call your methods within the main method to execute.
     * Capture all the available links
     * Print their text and the links side by side
     * Expected output:
     * TEXT --> www.TEXT.com
     * */

    public static WebElement sameTabLink;
    public static WebElement newTab;


    public static String baseUr="https://retail.tekschool-students.com/selenium/links";


    public static void main(String[] args) {

      WebDriver  driver=new ChromeDriver();
      driver.manage().window().maximize();


          driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

          WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));

        // Navigate to URL
       driver.get(baseUr);


 
        waitforUrl(wait,baseUr);

 


        // Locate the first link
//        sameTabLink=findElementByXpath(driver,"//a[text()='same tab']");
//        Actions ac=new Actions(driver);
//        ac.click(sameTabLink).perform();
//        waitforUrl(wait,"https://www.google.com/");

        // Locate the second link
//        newTab=findElementByXpath(driver,"//a[text()='new tab with html']");
//        ac.click(newTab).perform();
//        waitforUrl(wait,"https://www.google.com/");

        // Locate the third link
//        newTab=findElementByXpath(driver,"//a[text()='new window with js']");
//        ac.click(newTab).perform();
//        waitforUrl(wait,"https://www.facebook.com/");




        // Capture all links with a tag

   List<WebElement> lists=driver.findElements(By.className("hover:underline text-blue-800"));

   for(   WebElement   links:lists    ){

       System.out.println( links.getText() + " --> " + links.getAttribute("href") );
   }




       driver.quit();

    }







    public static  WebElement findElementByXpath(WebDriver driver,String text) {

      return   driver.findElement(By.xpath(text));

    }



    public static void waitforUrl(WebDriverWait wait,String baseUr){

        wait.until(ExpectedConditions.urlToBe(baseUr));

    }












}
