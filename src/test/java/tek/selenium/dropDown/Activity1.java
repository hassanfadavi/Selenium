package tek.selenium.dropDown;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;


public class Activity1 {

     public final static String baseUrl="https://testautomationpractice.blogspot.com/";

    public static void main(String[] args) {

       WebDriver driver=new ChromeDriver();
     Actions  ac=new Actions(driver);
       driver.get(baseUrl);
       driver.manage().window().maximize();
        System.out.println(driver.getCurrentUrl());


        //implicit wait
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        //explicit wait
       WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
       //validate the base Url
        wait.until(ExpectedConditions.urlToBe(baseUrl));

       //locate country Dropdown
       WebElement countryDropDown=driver.findElement(By.xpath("//select[@id='country']"));
       //validate
//        wait.until(ExpectedConditions.elementToBeClickable(countryDropDown));

      Select dropDown=new Select(countryDropDown);

      dropDown.selectByValue("germany");

          List<WebElement> options=dropDown.getOptions();

        System.out.println(options.size());

          for(   WebElement   country:options){

              System.out.println(country.getAttribute("value")+","+country.getText());

          }
//or
        for( int i=0;i<=options.size()-1;i++){

            System.out.println(options.get(i).getText());

        }

        //************************************************************************************
        //bootstrap dropDown

        ((JavascriptExecutor)driver).executeScript("window.open('https://admirhodzic.github.io/multiselect-dropdown/demo.html','_blank')");

         List<String>tabs=new ArrayList<>(driver.getWindowHandles());

        driver.switchTo().window(tabs.get(1));

        //select dropDown
        WebElement dropDown2=driver.findElement(By.xpath("//div[@class='multiselect-dropdown']"));
        //validate
        wait.until(ExpectedConditions.elementToBeClickable(dropDown2));
        //click
        ac.click(dropDown2).perform();

        //select one value
        WebElement oneOption=driver.findElement(By.xpath("//label[text()='Volvo']"));
        ac.click(oneOption).perform();

        //size
        List <WebElement> carsList=driver.findElements(By.xpath("//div[@class='row']/div[1]/div[@class='multiselect-dropdown'][1]//label " ));
        System.out.println(carsList.size());

        for( WebElement  cars:carsList   ){
            System.out.println(cars.getText());
        }

        //or
        for(int i=0;i<=carsList.size()-1;i++){
            System.out.println(carsList.get(i).getText());
        }

        //select multiple Option
        for( WebElement  cars:carsList   ){
            System.out.println(cars.getText());
            if(cars.getText().equals("Audi") ||cars.getText().equals("Lexus")){

                cars.click();

            }
        }





        driver.quit();





    }


}
