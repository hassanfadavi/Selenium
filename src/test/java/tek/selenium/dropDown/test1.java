package tek.selenium.dropDown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class test1 {
    public static void main(String[] args) throws Exception{


        //OPEN chrome
        WebDriver chDriver=new ChromeDriver();
        //navigate to UrL
        chDriver.get("https://retail.tekschool-students.com/selenium/dropdown");
        chDriver.manage().window().maximize();
        String title=chDriver.getTitle();
        System.out.println("title: "+title);
        Thread.sleep(3000);


        //selectDropDown
        WebElement DropDown=chDriver.findElement(By.id( "countrySelect"));
        Select countrySelect=new Select(DropDown);

        //selectByVisibleText
        countrySelect.selectByVisibleText("United Arab Emirates");
        //selectByValue
        countrySelect.selectByValue("Cuba");
        //selectByIndex
        countrySelect.selectByIndex(1);

         //getOptions
        List<WebElement> option=countrySelect.getAllSelectedOptions();
       for(WebElement options:option){

           System.out.println(options.getText());
       }


        Thread.sleep(3000);



       
















    }
}
