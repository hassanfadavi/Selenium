package tek.selenium.Activity;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Activity1 {
    public static void main(String[] args) throws InterruptedException {


      /*
    Open the new retail app https://dev.retail.tekschool-students.com/
    on Chrome Get Title and quite
    then open on Edge get Title and Quite
     */
        //open Chrome
        ChromeDriver chdriver=new ChromeDriver();
        chdriver.get("https://dev.retail.tekschool-students.com/");
        chdriver.manage().window().maximize();
        String pageTitle=chdriver.getTitle();
        System.out.println(pageTitle);
        Thread.sleep(2000);
        chdriver.quit();

        //open Edge
        EdgeDriver edgeDriver=new EdgeDriver();
        edgeDriver.get("https://dev.retail.tekschool-students.com/");
        chdriver.manage().window().maximize();
        String pagTitle=edgeDriver.getTitle();
        System.out.println(pagTitle);
        Thread.sleep(2000);
        edgeDriver.quit();



           /*
        Refactor this code to let user (Scanner)
        to choose which browser to open then open the app with that browser.
        chrome or edge if wrong option throw Exception
        hint: WebDriver interface can be as reference type WebDriver driver = new ChromeDriver();
         */



//
//
//        WebDriver driver;
//        var input = new Scanner(System.in);
//        System.out.println("choose your browser: ");
//        String browser = input.next();
//
//        if (browser.equalsIgnoreCase("chrome")) {
//            driver = new ChromeDriver();
//        } else if (browser.equalsIgnoreCase("edge")){
//            driver = new EdgeDriver();
//        }else if(browser.equalsIgnoreCase("firefox")){
//            driver = new FirefoxDriver();
//        } else {
//            throw new RuntimeException("wrong browser");
//        }
//
//
//        driver.get("https://dev.retail.tekschool-students.com/");
//        String pageTitle=driver.getTitle();
//        System.out.println(pageTitle);
//        Thread.sleep(2000);
//        driver.quit();




    }
}
