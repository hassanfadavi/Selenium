package tek.selenium.MultipleTabs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class Activity2_youtube {


    public static final String baseUrl = "https://testautomationpractice.blogspot.com/";

    public static final String searchInputXpath = "//input[@id='Wikipedia1_wikipedia-search-input']";
    public static final String searchInputText = "selenium";
    public static final String searchButtonXpath = "//div[@class='wikipedia-searchtable']//input[@type='submit']";


    public static void main(String[] args) {

//        Assignment
//
//https://testautomationpractice.blogspot.com/
//
//1) provide some string search for it
//
//2) count number of links
//
//3) click on each link using for loop
//
//4) get window ID's for every browser window
//
//5) close specific browser window
//
        WebDriver driver = new ChromeDriver();
        Actions ac = new Actions(driver);
        driver.get(baseUrl);
        driver.manage().window().maximize();
        System.out.println(driver.getCurrentUrl());

        //implicit
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        //explicit
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        //locate the search
        WebElement searchInput = driver.findElement(By.xpath(searchInputXpath));
        //validate
        wait.until(ExpectedConditions.elementToBeClickable(searchInput));
        //click on input search and pass the word
        ac.click(searchInput).perform();
        for (char ch : searchInputText.toCharArray()) {

            ac.sendKeys(String.valueOf(ch)).perform();
        }

        //click on search Button
        WebElement searchButton = driver.findElement(By.xpath(searchButtonXpath));
        //validate
        wait.until(ExpectedConditions.elementToBeClickable(searchButton));
        //click
        ac.click(searchButton).perform();


        List<WebElement> linkList = driver.findElements(By.xpath("//div[@class='wikipedia-search-results']/descendant::a"));

        System.out.println(linkList.size());

        for (WebElement links : linkList) {
            ac.click(links).perform();
        }

        Set<String> tabsSet = driver.getWindowHandles();
        List<String> tabsList = new ArrayList<>(tabsSet);

        //get all ID's
        for (String tabs : tabsList) {
            System.out.println(tabs);
        }

//        //close all tabs
//        for(     String   tabs: tabsList    ){
//           driver.switchTo().window(tabs);
//           driver.close();
//        }
        //close specific Tabs

        for (String tabs : tabsList) {

            if (tabs.equals("Selenium - Wikipedia")) {
                driver.close();
            }

        }
    }
}
