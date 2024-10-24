package tek.selenium.XpathLocator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathLocator {
    public static void main(String[] args) throws InterruptedException {



        ChromeDriver chdriver=new ChromeDriver();
        chdriver.get("https://retail.tekschool-students.com/");
        chdriver.manage().window().maximize();


           By  pslocator= By.xpath("/html/body/div[1]/div[1]/div[1]/div[3]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/p");
           WebElement psElement= chdriver.findElement(pslocator);
            psElement.click();

            Thread.sleep(1000);

        By  ps2locator= By.xpath("/html/body/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/p[1]");
        WebElement ps2Element= chdriver.findElement(ps2locator);
        ps2Element.click();
        Thread.sleep(1000);
        //print
//
//        By  print= By.xpath("/html/body/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[2]/h1");
//        WebElement printElement= chdriver.findElement(print);
//        String txt=printElement.getText();
//        System.out.println(txt);

        Thread.sleep(1000);

        chdriver.quit();



    }
}
