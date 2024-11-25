package tek.selenium.obj;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Activity2 {
    public static void main(String[] args) {

 /*
       On New Retail App https://dev.retail.tekschool-students.com/
        Navigate to Sing In page then go to sign up page.
        Fill up the form and Submit then Sign in with newly registered user
        and Validate Full Name display on User Profile Drop Down
     */

        //open Chrome
        ChromeDriver chdriver=new ChromeDriver();
        chdriver.get("https://dev.retail.tekschool-students.com/");
        chdriver.manage().window().maximize();
        String pageTitle=chdriver.getTitle();
        System.out.println(pageTitle);



        //implicit
        chdriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        //explicit
        WebDriverWait wait=new WebDriverWait(chdriver , Duration.ofSeconds(20));

        selenuimUtility utility=new selenuimUtility(wait);

        //generating random  email
        int randomNumber = (int)(Math.random() * 1000);
        String email = "mohammad_instructor"+randomNumber+"@tekschool.us";

        //SIGN IN
        utility.click(By.linkText("Sign in"));
//        wait.until(ExpectedConditions.elementToBeClickable(
//                        By.linkText("Sign in")))
//                .click();

         //Register
        utility.click( By.xpath("//a[@href='/auth/signup']"));
//        wait.until(ExpectedConditions.elementToBeClickable(
//                        By.xpath("//a[@href='/auth/signup']")))
//                .click();


        //first Name
        utility.sendKeys( By.cssSelector("input#firstName"),email);
//        wait.until(ExpectedConditions.visibilityOfElementLocated(
//                        By.cssSelector("input#firstName")))
//                .sendKeys("hassan");

        //last Name
        utility.sendKeys(By.cssSelector("input#lastName"),"fadavi");
//        wait.until(ExpectedConditions.visibilityOfElementLocated(
//                        By.cssSelector("input#lastName")))
//                .sendKeys("fadavi");

        //Email
        utility.sendKeys(By.cssSelector("input#email"),email);
//        wait.until(ExpectedConditions.visibilityOfElementLocated(
//                        By.cssSelector("input#email")))
//                .sendKeys("asjvfh@gmail.com");

        //pass
        utility.sendKeys( By.cssSelector("input#password"),"123456@Hg");
//        wait.until(ExpectedConditions.presenceOfElementLocated(
//                        By.cssSelector("input#password")))
//                .sendKeys("Se@123456");


        //confirm pass
        utility.sendKeys( By.cssSelector("input#confirmPassword"),"123456@Hg");
//        wait.until(ExpectedConditions.presenceOfElementLocated(
//                        By.cssSelector("input#confirmPassword")))
//                .sendKeys("Se@123456");

        //submit
        utility.click(By.className("ant-btn-primary"));
//        wait.until(ExpectedConditions.elementToBeClickable(
//                        By.className("ant-btn-primary")))
//                .click();

        String pagTitle = utility.getText(By.xpath("//div[text()='Sign in']"));
        if (!pageTitle.equals("Sign in"))
            throw new RuntimeException("User not in Sign in page");


//       //Email
        utility.sendKeys(By.name("email"), email);
//        wait.until(ExpectedConditions.visibilityOfElementLocated(
//                        By.cssSelector("input#email")))
//                .sendKeys("asdsgh@gmail.com");

        //pass
        utility.sendKeys(By.name("password"), "Password@123");
//        wait.until(ExpectedConditions.presenceOfElementLocated(
//                        By.cssSelector("input#password")))
//                .sendKeys("Se@123456");


        //SIGN IN
        utility.click(By.xpath("//span[contains(text(),'Sign In')]/.."));
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
