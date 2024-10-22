package tek.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class test2 {
    public static void main(String[] args) {



        ChromeDriver chdriver=new ChromeDriver();
        chdriver.get("https://retail.tekschool-students.com/");

        chdriver.manage().window().maximize();



        //step1: locate the element
        By sign= By.id("signinLink");


        //step2: Ask selenium to find the element
        WebElement signelemnt =chdriver.findElement(sign);


        //step3: perform the action
        signelemnt.click();

        By creatAccount= By.id("newAccountBtn");
        WebElement createlement =chdriver.findElement(creatAccount);
        signelemnt.click();
    }
}
