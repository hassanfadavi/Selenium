package tek.selenium.Table.DynamicWebTable;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class Activity1 {
    public static String baseUrl = "https://atlassian.design/components/dynamic-table/examples";

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        Actions ac = new Actions(driver);
        driver.get(baseUrl);
        String title = driver.getTitle();
        System.out.println(title);
        driver.manage().window().maximize();

        //implicit
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
        //explicit
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(3));
        Thread.sleep(3000);


//      int totalPages=driver.findElements(By.xpath("//div[@id='package-page-0-tab']//div[2]//div[1]//div[2]//div[2]//nav[1]//div[1]//ul[1]//li")).size();
//
//        System.out.println(totalPages);
//
//        for(int p=1;p<=5;p++){
//          WebElement  pages=driver.findElement(By.xpath("//div[@id='package-page-0-tab']//div[2]//div[1]//div[2]//div[2]//nav[1]//div[1]//ul[1]//li["+p+"]//button"));
//          pages.click();
//        }

//        //read data 2nd page
//        int  rows=driver.findElements(By.xpath("//body[1]/div[1]/div[1]/div[2]/div[2]/main[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[2]/div[1]/table[1]/tbody[1]/tr")).size();
//
//        int  columns=driver.findElements(By.xpath("//body[1]/div[1]/div[1]/div[2]/div[2]/main[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[2]/div[1]/table[1]/tbody[1]/tr")).size();

//
//       WebElement secondPages=driver.findElement(By.xpath("//div[@id='package-page-0-tab']//div[2]//div[1]//div[2]//div[2]//nav[1]//div[1]//ul[1]//li[2]//button"));
//       secondPages.click();
//
//      List<WebElement> data=driver.findElements(By.xpath("//body[1]/div[1]/div[1]/div[2]/div[2]/main[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[2]/div[1]/table[1]/tbody[1]//td"));
//
//
//              for(    WebElement   datasList:data){
//                  System.out.println(datasList.getText());
//              }
//


        int  rows=driver.findElements(By.xpath("//body[1]/div[1]/div[1]/div[2]/div[2]/main[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[2]/div[1]/table[1]/tbody[1]/tr")).size();

              for(int r=1;r<=rows;r++){
                  WebElement names=driver.findElement(By.xpath("//body[1]/div[1]/div[1]/div[2]/div[2]/main[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[2]/div[1]/table[1]/tbody[1]/tr["+r+"]//td[1]"));
                  WebElement party=driver.findElement(By.xpath("//body[1]/div[1]/div[1]/div[2]/div[2]/main[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[2]/div[1]/table[1]/tbody[1]/tr["+r+"]//td[2]"));

                  System.out.println(names.getText()+"\t"+party.getText());

              }








//        //locate
//       WebElement userName=driver.findElement(By.xpath("//input[@name='username']"));
//       //validate
//        wait.until(ExpectedConditions.elementToBeClickable(userName));
//        //click and pass the value
//        ac.click(userName).perform();
//        for( char ch:"demo".toCharArray()  ){
//            ac.sendKeys(String.valueOf(ch)).perform();
//        }
//
//        //locate
//        WebElement passWord=driver.findElement(By.xpath("//input[@name='password']"));
//        //validate
//        wait.until(ExpectedConditions.elementToBeClickable(passWord));
//        //click and pass the value
//        ac.click(passWord).perform();
//        for( char ch:"demo".toCharArray()  ){
//            ac.sendKeys(String.valueOf(ch)).perform();
//        }
//
//        //submit
//       WebElement submitButton=driver.findElement(By.xpath("//button[@type='submit']"));
//        ac.click(submitButton).perform();
//
//






    }
}
