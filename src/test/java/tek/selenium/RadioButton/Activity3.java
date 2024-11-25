package tek.selenium.RadioButton;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class Activity3 {
    /*
     *
     * Navigate to "https://retail.tekschool-students.com/selenium/radio"
     * Locate and print the values of T-Shirt radio buttons
     * Store the text into a list of string
     * print each value into the console in a new line
     * Click on the "Large" radio button.
     *
     * */

    // "//div[@class='flex gap-3']/input[@type='radio']/following-sibling::label"
    // "//div[@class='flex gap-3']/input[@name='tshirt']/following-sibling::label"
    // "//input[@name='tshirt']/following-sibling::label"


    public static String Url="https://retail.tekschool-students.com/selenium/radio";


    public static void main(String[] args) {


        WebDriver driver=new ChromeDriver();
        driver.get(Url);
        String title=driver.getTitle();
        System.out.println(title);

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        WebDriverWait myWait=new WebDriverWait(driver,Duration.ofSeconds(10));
        myWait.until(ExpectedConditions.urlToBe(Url));



        List<WebElement > TshirtList=driver.findElements(By.xpath("//input[@name='tshirt']/following-sibling::label"));

        for(   WebElement radios:TshirtList){

            System.out.println(radios.getText());
        }


        WebElement largeRadioBut=driver.findElement(By.cssSelector("label[for='large']"));
        largeRadioBut.click();

    }
}
