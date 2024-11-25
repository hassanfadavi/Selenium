package tek.selenium.Frame_innerFrame;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;


public class Activity {
    public static final String baseUrl = "https://ui.vision/demo/webtest/frames/";

    public static void main(String[] args) {


        WebDriver driver=new ChromeDriver();
        Actions ac=new Actions(driver);
        System.out.println(driver.getCurrentUrl());
        driver.get(baseUrl);
        driver.manage().window().maximize();

        //implicit wait
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        //explicit wait
        WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));

        //*****************Frame1
        //locate the frame1
        WebElement frame1=driver.findElement(By.xpath("//frame[@src='frame_1.html']"));
        driver.switchTo().frame(frame1);

        WebElement inputText=driver.findElement(By.xpath("//input[@name='mytext1']"));
//      //validate
        wait.until(ExpectedConditions.elementToBeClickable(inputText));
//        //click and pass
        ac.click(inputText).perform();
        //pass
        for(   char  ch:"hello".toCharArray()   ){
            ac.sendKeys(String.valueOf(ch)).perform();

        }
        //***********************back to page
        driver.switchTo().defaultContent();//back to current page
        //*****************Frame2
        WebElement frame2=driver.findElement(By.xpath("//frame[@src='frame_2.html']"));
        driver.switchTo().frame(frame2);

        WebElement inputText2=driver.findElement(By.xpath("//input[@name='mytext2']"));
//      //validate
        wait.until(ExpectedConditions.elementToBeClickable(inputText2));
//        //click and pass
        ac.click(inputText2).perform();
        //pass
        for(   char  ch:"hello".toCharArray()   ){
            ac.sendKeys(String.valueOf(ch)).perform();

        }
        //*****************Frame3
        driver.switchTo().defaultContent();//back to current page
        //frame3
        WebElement frame3=driver.findElement(By.xpath("//frame[@src='frame_3.html']"));
        driver.switchTo().frame(frame3);
//        innert frame-part pf frame3
        driver.switchTo().frame(0);
        //locate
        WebElement button=driver.findElement(By.xpath("//div[@id='i9']//div[@class='AB7Lab Id5V1']"));
        //validate
        wait.until(ExpectedConditions.elementToBeClickable(button));
        //click
        ac.click(button).perform();
    }
}

