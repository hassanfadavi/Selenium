package tek.selenium.XpathLocator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathLocator {
    public static void main(String[] args) throws InterruptedException {


         //open web browser
         ChromeDriver chdriver=new ChromeDriver();
         chdriver.get("https://retail.tekschool-students.com/");
         chdriver.manage().window().maximize();
         Thread.sleep(1000);


         //click on video Games
         By  videoGameslocator= By.xpath("/html/body/div[1]/div[1]/div[1]/div[3]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/p");
         WebElement videoGamesElement= chdriver.findElement(videoGameslocator);
         videoGamesElement.click();
         Thread.sleep(1000);


        //click on PlayStation 5 Console
        By  pslocator= By.xpath("/html/body/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/p[1]");
        WebElement psElement= chdriver.findElement(pslocator);
        psElement.click();
        Thread.sleep(1000);


        //print the title
        By  print= By.xpath("/html/body/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[2]/h1");
        WebElement printElement= chdriver.findElement(print);
        String txt=printElement.getText();
        System.out.println(txt);
        Thread.sleep(1000);

        chdriver.quit();



    }
}
