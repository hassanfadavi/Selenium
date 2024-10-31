package tek.selenium.Activity;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class Activity2 {
    public static void main(String[] args) throws InterruptedException {

//open Chrome
        ChromeDriver chdriver=new ChromeDriver();
        chdriver.get("https://dev.retail.tekschool-students.com/");
        chdriver.manage().window().maximize();
        String pageTitle=chdriver.getTitle();
        System.out.println(pageTitle);
        Thread.sleep(2000);




        //input Apple
        By searchlInput= By.id("searchInput");
        WebElement searchlElement=chdriver.findElement(searchlInput);
        searchlElement.sendKeys("Apple");
        Thread.sleep(2000);

       //searchBtn
        By  searchBtnlocator= By.xpath(" /html/body/div[1]/div[1]/span/span/span/button/span/span");
        WebElement searchElement= chdriver.findElement(searchBtnlocator);
        searchElement.click();
        Thread.sleep(2000);


        By productCardLocator = By.className("ant-card-hoverable");
        List<WebElement> productCards = chdriver.findElements(productCardLocator);

        int cardSize = productCards.size();
        System.out.println("Card Count " + cardSize);

        chdriver.quit();




        //or

        //number of Apple products
//        By appleLocator=By.tagName("h4") ;
//        List< WebElement> allLinkElements=chdriver.findElements(appleLocator);
//
//
//        int count = 0;
//        for(WebElement element:allLinkElements){
//            String text=element.getText();
//            System.out.println(text);
//            count++;
//        }
//        Thread.sleep(2000);
//        System.out.println("number of Apple: "+count);
//
//        chdriver.quit();













    }
}
