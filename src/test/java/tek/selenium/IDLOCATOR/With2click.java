package tek.selenium.IDLOCATOR;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class With2click {
    public static void main(String[] args) throws  InterruptedException{



        ChromeDriver chdriver=new ChromeDriver();
        chdriver.get("https://retail.tekschool-students.com/");

        String pagetitle=chdriver.getTitle();
        System.out.println(pagetitle);

        chdriver.manage().window().maximize();

        //click sign in

        //step1: locate the element
        By sign= By.id("signinLink");
        //step2: Ask selenium to find the element
        WebElement signelemnt =chdriver.findElement(sign);
        //step3: perform the action
        signelemnt.click();
        Thread.sleep(5000);


        // create new account

        //step1: locate the element
        By creatAccount= By.id("newAccountBtn");
        //step2: Ask selenium to find the element
        WebElement createlement =chdriver.findElement(creatAccount);
        //step3: perform the action
        createlement.click();

        Thread.sleep(5000);

        chdriver.quit();

    }
}
