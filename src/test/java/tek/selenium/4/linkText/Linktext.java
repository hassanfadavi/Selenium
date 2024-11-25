package tek.selenium.linkText;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Linktext {
    public static void main(String[] args) throws InterruptedException {
    /*
    Navigate to https://www.bbc.com/
    Then Click on business link
    Then Get The text of Page Title and print it.
    Quit browser

     */


        ChromeDriver chdriver=new ChromeDriver();
        chdriver.get("https://www.bbc.com/business");
        String pagetitle=chdriver.getTitle();
        System.out.println(pagetitle);
        chdriver.manage().window().maximize();

       // click on business link
        By linkLocator= By.linkText("Business");
        WebElement linklement =chdriver.findElement(linkLocator);
        linklement.click();

        //title
        By titleLocator= By.className("juQBdA");
        WebElement businessElement =chdriver.findElement(titleLocator);
         String txt=businessElement.getText();
        System.out.println(txt);

        Thread.sleep(5000);
        chdriver.quit();


    }
}
