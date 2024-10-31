package tek.selenium.CSS;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test {
    public static void main(String[] args) throws InterruptedException {
         /*
    Using CSS to Locate Elements
    if you are referring to class name of an element.
    div.class_name  // . indicate the class name

    if you are referring to ID attribute of an element
    button#idValue -> # indicate the id attribute.

    if you are referring to child number of a parent element

    div.products > div:nth-child(1) > img ->
    nth-child(10) indicate the number of child you're referring to

    div.products > div:first-child > img  -> referring to First child of an element
    div.products > div:last-child > img -> referring to last child of an element


    If you are referring to any attribute an element to locate
    button[type='submit'] -> [AttributeName=AttributeValue]

     */


            WebDriver driver = new ChromeDriver();
            driver.get("https://retail.tekschool-students.com/");
            driver.manage().window().maximize();

            driver.findElement(
                            By.cssSelector("input.search__input"))
                    .sendKeys("Keyboard");

            driver.findElement(
                            By.cssSelector("button#searchBtn"))
                    .click();

            Thread.sleep(1000);

            driver.findElement(
                            By.cssSelector("div.products > div:first-child > img"))
                    .click();

            Thread.sleep(1000);

            String text = driver.findElement(
                            By.cssSelector("h1.product__name"))
                    .getText();

            System.out.println(text);
            driver.quit();
    }
}
