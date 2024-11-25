package tek.selenium.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class Ac2 {

    public static String baseUrl = "https://www.dummyticket.com/dummy-ticket-for-visa-application/";
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

        //locate
        WebElement dobInput=driver.findElement(By.xpath("//input[@name='dob']"));
        //validate
        wait.until(ExpectedConditions.elementToBeClickable(dobInput));
        //click
        dobInput.click();

        //year
       WebElement dropDown=driver.findElement(By.xpath("//select[@class='ui-datepicker-year']"));
       //select year
       Select selectYear=new Select(dropDown);
       selectYear.selectByValue("1989");
        //year
        WebElement dropDown2=driver.findElement(By.xpath("//select[@class='ui-datepicker-month']"));
        //select month
        Select selectMonth=new Select(dropDown2);
        selectMonth.selectByVisibleText("Nov");

        //select days
       List<WebElement> days=driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']//tbody//tr//td//a"));

       for(    WebElement dayList:days   ){
             if(dayList.getText().equals("5")){
                 dayList.click();
                 break;
             }
       }














    }
}
