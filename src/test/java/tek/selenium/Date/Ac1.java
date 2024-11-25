package tek.selenium.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import javax.sound.midi.Track;
import java.time.Duration;
import java.util.List;


public class Ac1 {





    public static String baseUrl = "https://jqueryui.com/datepicker/";


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

        //switch
        driver.switchTo().frame(0);

        //Method 1
inputDate("11/05/2024",driver,wait,ac);

        //**************************************************************
////        Method2(Date Picker)
        //locate
//        WebElement dateInput2 = driver.findElement(By.xpath("//input[@id='datepicker']"));
//         //click and pass the data
//        ac.click(dateInput2).perform();

//        //select Month and Year
//         selectMonthAndYear(driver,"November","2024");
//         //select Days
//        selectDays(driver,"10");


    }

    //Method 1


public static void inputDate(String date,WebDriver driver,WebDriverWait wait,Actions ac){

    //   locate
    WebElement dateInput=driver.findElement( By.xpath("//input[@id='datepicker']"));
    //validate
        wait.until(ExpectedConditions.elementToBeClickable(dateInput));
  //click and pass the data
        ac.click(dateInput).perform();
        for( char ch:date.toCharArray()){
        ac.sendKeys(String.valueOf(ch)).perform();
    }
}

    //******************************************************************************************************
////Method 2
//    //select Month and Year
//    public static void selectMonthAndYear(WebDriver driver,String month,String year){
//       while (true) {
//        String currentMonth = driver.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText();
//        String currentYear = driver.findElement(By.xpath("//span[@class='ui-datepicker-year']")).getText();
//
//        if (currentMonth.equals(month) && currentYear.equals(year)) {
//            break;
//        } else
//            driver.findElement(By.xpath("//span[text()='Prev']")).click();
//    }
//    }
//    //select days
//    public static void selectDays(WebDriver driver,String date){
//
//        List<WebElement> days = driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']//tbody//tr//td"));
//
//        for (WebElement dayList : days) {
//            String d = dayList.getText();
//            if (d.equals(date)) {
//                dayList.click();
//                break;
//            }
//        }
//    }




}







