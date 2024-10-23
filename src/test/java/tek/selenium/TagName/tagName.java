package tek.selenium.TagName;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class tagName {
    public static void main(String[] args) {

        ChromeDriver chdriver=new ChromeDriver();
         chdriver.get("https://www.bbc.com");

         //Get All the links in Home Page
                By linkLocator=By.tagName("a") ;      //<a>Link</a>.
        List < WebElement> allLinkElements=chdriver.findElements(linkLocator);

        for(WebElement element:allLinkElements){

            String text=element.getText();
            System.out.println(text);
        }




    }
}
