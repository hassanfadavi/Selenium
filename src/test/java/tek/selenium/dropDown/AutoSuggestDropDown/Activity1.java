package tek.selenium.dropDown.AutoSuggestDropDown;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;
import java.util.List;

public class Activity1 {

    public static String baseUrl = "https://testautomationpractice.blogspot.com/";

    public static void main(String[] args) {

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

        //total number of rows

        //navigate to elements
        List<WebElement> rows = driver.findElements(By.xpath("//table[@name='BookTable']//tr"));
        //validate
        wait.until(ExpectedConditions.visibilityOfAllElements(rows));
        System.out.println(rows.size());


        //total number of columns

        List<WebElement> columns = driver.findElements(By.xpath("//table[@name='BookTable']//th"));
        //validate
        wait.until(ExpectedConditions.visibilityOfAllElements(columns));
        System.out.println(columns.size());


        //read specific row and colum
      WebElement  specific=driver.findElement(By.xpath("//table[@name='BookTable']//tr[5]//td[1]"));
      //validate
        wait.until(ExpectedConditions.visibilityOfAllElements(columns));

     String text=specific.getText();
        System.out.println(text);





        driver.quit();

    }

}
