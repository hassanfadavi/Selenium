package tek.selenium.ClassLocator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClassLocator {
    public static void main(String[] args) throws  InterruptedException {


        ChromeDriver chdriver=new ChromeDriver();
        chdriver.get("https://retail.tekschool-students.com/");

        String pagetitle=chdriver.getTitle();
        System.out.println(pagetitle);

        chdriver.manage().window().maximize();

        //click sign in link
        By sign= By.id("signinLink");
        WebElement  signelemnt =chdriver.findElement(sign);
        signelemnt.click();


        //className (title)
        By subtitleLocator= By.className("login__subtitle");
        WebElement subtitleElement =chdriver.findElement(subtitleLocator);
        String text=subtitleElement.getText();
        System.out.println(text);

        Thread.sleep(5000);
        chdriver.quit();
















    }
}
