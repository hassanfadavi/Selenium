package tek.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class Activity3 {

    public static String Url="https://retail.tekschool-students.com/selenium/radio";


    public static void main(String[] args) {


        WebDriver driver=new ChromeDriver();
        driver.get(Url);
        String title=driver.getTitle();
        System.out.println(title);

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1));

        WebDriverWait myWait=new WebDriverWait(driver,Duration.ofSeconds(10));
        myWait.until(ExpectedConditions.urlToBe(Url));





        List<WebElement > TshirtList=driver.findElements(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[2]/div[1]/form[1]/div[3]/p[1]"));

        for(   WebElement radios:TshirtList){

            System.out.println(radios.getAttribute("lable"));
        }



        WebElement largeRadioBut=driver.findElement(By.cssSelector("label[for='large']"));
        largeRadioBut.click();

        if(largeRadioBut.isSelected()){
            System.out.println("yes");

        }else System.out.println("no");

    }
}
