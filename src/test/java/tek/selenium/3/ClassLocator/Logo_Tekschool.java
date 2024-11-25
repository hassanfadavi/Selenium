package tek.selenium.ClassLocator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Logo_Tekschool {
    public static void main(String[] args) throws InterruptedException{

        //print logo Tekschool

        ChromeDriver chdriver=new ChromeDriver();
        chdriver.get("https://retail.tekschool-students.com/");
        String pagetitle=chdriver.getTitle();
        System.out.println(pagetitle);
        chdriver.manage().window().maximize();


        //className (Logo)
        By logoLocator= By.className("top-nav__logo");
        WebElement logoElement =chdriver.findElement(logoLocator);
        String logo=logoElement.getText();
        System.out.println(logo);

        Thread.sleep(5000);
        chdriver.quit();
        
        
        
        
    }
}
