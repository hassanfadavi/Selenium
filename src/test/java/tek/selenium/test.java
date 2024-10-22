package tek.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class test {
    public static void main(String[] args) {


        ChromeDriver chdriver=new ChromeDriver();

        chdriver.get("https://www.msn.com/");

        chdriver.manage().window().maximize();

        String pagetitle=chdriver.getTitle();

        System.out.println(pagetitle);

        By sign=By.id("mectrl_headerPicture");

        WebElement signelemnt=chdriver.findElement(sign);

        signelemnt.click();

        chdriver.quit();






    }

}
