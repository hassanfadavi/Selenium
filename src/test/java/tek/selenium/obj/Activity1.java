package tek.selenium.obj;


import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Activity1 {
    public static void main(String[] args) {
        /*On New Retail App https://dev.retail.tekschool-students.com/Sign in with  following user and
        make sure You logged in and use name display under user
        profile drop down{name: "Quinn Turner",email:
        "quinn.turner@example.com",password: "password123",    }, */

        //open Chrome
        ChromeDriver chdriver = new ChromeDriver();
        chdriver.get("https://dev.retail.tekschool-students.com/");
        chdriver.manage().window().maximize();
        String pageTitle = chdriver.getTitle();
        System.out.println(pageTitle);



        //implicit
        chdriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        //explicit
        WebDriverWait wait=new WebDriverWait(chdriver,Duration.ofSeconds(10));


        selenuimUtility utility=new selenuimUtility(wait);


        //SIGN IN
        utility.click(By.linkText("Sign in"));
//        wait.until(ExpectedConditions.elementToBeClickable(
//                        By.linkText("Sign in")))
//                .click();

        //input email
        utility.sendKeys(By.name("email"),"quinn.turner@example.com");
//        wait.until(ExpectedConditions.visibilityOfElementLocated(
//                        By.name("email")))
//                .sendKeys("s.hasanfadavi@gmail.com");

        //input pass
        utility.sendKeys(By.name("password"),"password123");
//        wait.until(ExpectedConditions.presenceOfElementLocated(
//                        By.name("password")))
//                .sendKeys("Se@123456");

        //SIGN IN
        utility.click( By.xpath("//span[contains(text(),'Sign In')]/.."));
//        wait.until(
//             ExpectedConditions.elementToBeClickable(
//                 By.xpath("//span[contains(text(),'Sign In')]/..")))
//                .click();


        //profile
        utility.click(By.cssSelector("button.ant-dropdown-trigger"));
//        wait.until(
//            ExpectedConditions.elementToBeClickable(
//              By.cssSelector("button.ant-dropdown-trigger")))
//                .click();

        //check
       String userName=utility.getText(
               By.xpath("//ul//div[@class='ant-space-item']"));
//        String userName = wait.until(
//             ExpectedConditions.presenceOfElementLocated(
//             By.xpath("//ul//div[@class='ant-space-item']")))
//                .getText();


        if (userName.equals("Quinn Turner")) {
            System.out.println("Passed");
        } else System.out.println("not passed");

        chdriver.quit();


    }

}
