package tek.selenium.XpathLocator.Xpath_relative;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActivityRecap2 {
    public static void main(String[] args) throws InterruptedException {

             /*
    In Retail App https://retail.tekschool-students.com/
    Search for Keyboard  and Click on First product displayed
    Then print the product title on the next page.

     */


        //open Chrome
        ChromeDriver chdriver=new ChromeDriver();
        chdriver.get("https://retail.tekschool-students.com/");
        chdriver.manage().window().maximize();
        String pageTitle=chdriver.getTitle();
        System.out.println(pageTitle);
        Thread.sleep(2000);

        //input keyboard
        By inputSearch = By.xpath("//input[@id='searchInput']");
        WebElement inputElement= chdriver.findElement(inputSearch);
        inputElement.sendKeys("keyboard");
        Thread.sleep(1000);

        //search Button
        By  SearchLocator = By.xpath("//button[@id='searchBtn']");
        WebElement searchElement= chdriver.findElement(SearchLocator);
        searchElement.click();
        Thread.sleep(1000);


        //SELECT keyboard
        By  keyboardLocator = By.xpath("//div[@class='products']/div[1]/p[@class='products__name']");
        WebElement keyboardElement= chdriver.findElement(keyboardLocator);
        keyboardElement.click();
        Thread.sleep(1000);


        //print title
        By  titlePrint = By.xpath("//h1[@class='product__name']");
        WebElement titleEment= chdriver.findElement(titlePrint);
        String text=titleEment.getText();
        System.out.println(text);
        Thread.sleep(1000);


        chdriver.quit();
    }
}
