package tek.selenium.dropDown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.ISelect;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class Activity {

    public static String baseUrl="https://retail.tekschool-students.com/selenium/dropdown";

    public static WebElement programDropDown;

    public static void main(String[] args) throws InterruptedException {

        /*
         * Navigate to "https://retail.tekschool-students.com/selenium/dropdown"
         * Select one of the dropdowns
         * Interact with one of these dropdowns
         * Select one of the available options
         * Print the selected option in console
         * */

//        try {


       WebDriver driver=new ChromeDriver();
       driver.get(baseUrl);
      String title=driver.getTitle();
        System.out.println(title);

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1));

          WebDriverWait myWait=new WebDriverWait(driver,Duration.ofSeconds(10));
          myWait.until(ExpectedConditions.urlToBe(baseUrl));


          programDropDown=driver.findElement(By.xpath("//select[@name='language']"));
          myWait.until(ExpectedConditions.visibilityOf(programDropDown));

         Select languageSelect=new Select(programDropDown);


        // Check if the select is multiple or not


//        if ( languageSelect.isMultiple() ) {


            languageSelect.selectByVisibleText("Java");
            Thread.sleep(2000);

            languageSelect.selectByIndex(3);
            Thread.sleep(2000);


            languageSelect.selectByValue("python");

            List<WebElement> options = languageSelect.getAllSelectedOptions();


            for (WebElement option : options) {

                System.out.println(option.getText());

            }

//
//        }else {
//            System.out.println("Select is not a type of multiple.");
//        }
        driver.close();
        driver.quit();
//
//
//        } catch (Exception e) {
//            e.printStackTrace();
//        }

    }











    }

