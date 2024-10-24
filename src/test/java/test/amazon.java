package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class amazon {
    public static void main(String[] args) throws InterruptedException{

        ChromeDriver chdriver=new ChromeDriver();
        chdriver.get("https://retail.tekschool-students.com/");
        chdriver.manage().window().maximize();
//
        String titlePage=chdriver.getTitle();
        System.out.print(titlePage);
        Thread.sleep(5000);
//        chdriver.quit();

        //check amazon Logo
//       By logoLocator=By.id("gh-logo");
//       WebElement logoElement=chdriver.findElement(logoLocator);
//       String logoPrint=logoElement.getText();
//        System.out.print(logoPrint);


        //toy category
        By categoryLocator= By.xpath("//p[text()='TV & Video']");
        WebElement categoryElement=chdriver.findElement(categoryLocator);
        categoryElement.click();

        

//
//        //select Board Games
//       By BoardGameLocator=By.className("b-visualnav__title");
//       WebElement boarGameElement=chdriver.findElement(BoardGameLocator);
//       boarGameElement.click();
//
//       //search Monopoly
//
//       By MonopolySearchLocator= By.name("_nkw");
//      WebElement MonopolySearchElement=chdriver.findElement(MonopolySearchLocator);
//      MonopolySearchElement.sendKeys("Monopoly");
//
//      //hit the search button
//      By searchBtn= By.id("gh-btn");
//     WebElement searchBtnElement=chdriver.findElement(searchBtn);
//     searchBtnElement.click();
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//








    }
}
