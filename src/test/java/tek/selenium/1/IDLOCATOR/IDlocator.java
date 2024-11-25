package tek.selenium.IDLOCATOR;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IDlocator {
    public static void main(String[] args) throws InterruptedException {

        //Trying to Click on Sign In Button In Retail app.

        ChromeDriver chdriver=new ChromeDriver();
        chdriver.get("https://retail.tekschool-students.com/");

        chdriver.manage().window().maximize();



        //step1: locate the element
          By sign= By.id("signinLink");

          //step2: Ask selenium to find the element
          WebElement  signelemnt =chdriver.findElement(sign);

          //step3: perform the action
          signelemnt.click();

          Thread.sleep(10000);


    }
}
