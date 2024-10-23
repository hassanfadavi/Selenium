package tek.selenium.PartialLinkText;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class partialLinkText {
    public static void main(String[] args) throws InterruptedException {


        //open google.com
        ChromeDriver chdriver=new ChromeDriver();
        chdriver.get("https://www.google.com/");
        String pageTitle=chdriver.getTitle();
        System.out.println(pageTitle);
        chdriver.manage().window().maximize();


        //type tekschool
           By searchInputchLocator=By.name("q");
          WebElement searchInputElement=chdriver.findElement(searchInputchLocator);
          searchInputElement.sendKeys("tekschool");
          Thread.sleep(1000);

          //hit the search
       By searchBtnLocator=By.name("btnK");
      WebElement searchBtnElement=chdriver.findElement(searchBtnLocator);
        searchBtnElement.click();
        Thread.sleep(1000);
      //enter the tekschool
       By teKlocator=By.partialLinkText("TEK SCHOOL Modern");
      WebElement tekElement=chdriver.findElement(teKlocator);
      tekElement.click();

        Thread.sleep(1000);
        chdriver.quit();





    }
}
