package tek.selenium.Activity_covers_All_topics.first_edit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Activity {

    //navigate
    public static final String urlReatal="https://retail.tekschool-students.com/";
    public static final String urlSignIn="https://retail.tekschool-students.com/auth/login";
    public static final String urlSignUp="https://retail.tekschool-students.com/auth/sign-up";
    public static final String urlAccount="https://retail.tekschool-students.com/profile";
//locator
    public static final String signInButtonXpath="//a[text()='Sign in']";
    public static final String creatNewAccountXpath="//a[@id='newAccountBtn']";
    public static final String nameInputXpath="//input[@name='name']";
    public static final String emailInputXpath="//input[@name='email']";
    public static final String passInputXpath="//input[@name='password']";
    public static final String confirmPassInputXpath="//input[@name='confirmPassword']";
    public static final String signUpButtonXpath="//button[text()='Sign Up']";

    //sign up page data
    public static final String userName="hasan";
    public static final String emailAddress="s.hasan201@gmail.com";
    public static final String passWord ="Aa1asdfg@";




    public static void main(String[] args) throws InterruptedException {


        WebDriver driver=new ChromeDriver();
        WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        Actions ac=new Actions(driver);
        driver.manage().window().maximize();
        String title=driver.getTitle();
        System.out.println(title);


        //navigate
        driver.get(urlReatal);
        wait.until(ExpectedConditions.urlToBe(urlReatal));

        //sign in
        WebElement signInButton=driver.findElement(By.xpath(signInButtonXpath));
        //validate the button
        wait.until(ExpectedConditions.elementToBeClickable(signInButton));
        //click on new sign in
        ac.click(signInButton).perform();
        // validate that the user is on signIn page
        wait.until(ExpectedConditions.urlToBe(urlSignIn));



       //locate
        WebElement creatNewAcount=driver.findElement(By.xpath(creatNewAccountXpath));
        //validate that the create new account button is clicklbe
        wait.until(ExpectedConditions.elementToBeClickable(creatNewAcount));
        //click on new account
        ac.click(creatNewAcount).perform();
        // validate that the user is on signUp page
        wait.until(ExpectedConditions.urlToBe(urlSignUp));

        //Locate elements on signUp page
        WebElement name=driver.findElement(By.xpath(nameInputXpath));
        WebElement email=driver.findElement(By.xpath(emailInputXpath ));
        WebElement password=driver.findElement(By.xpath(passInputXpath));
        WebElement confirmpassword=driver.findElement(By.xpath(confirmPassInputXpath));
        WebElement  signUp=driver.findElement(By.xpath( signUpButtonXpath));

        //validate that one of the elements on sign up page is clickable
        wait.until(ExpectedConditions.elementToBeClickable(name));


        //sign up page data
        //************************************************************
        //input Name
        ac.click(name).perform();
        for (  char   ch : userName.toCharArray()  ){
             ac.sendKeys(String.valueOf(ch)).perform();

        }

      //input email
        ac.click(email).perform();
        for (  char   ch : emailAddress.toCharArray()  ){
            ac.sendKeys(String.valueOf(ch)).perform();

        }

      //input pass
        ac.click(password).perform();
        for (  char   ch : passWord.toCharArray()  ){
            ac .sendKeys(String.valueOf(ch)).perform();

        }

       //input confirmPass
        ac.click(confirmpassword).perform();
        for (  char   ch :passWord.toCharArray()  ){
            ac.sendKeys(String.valueOf(ch)).perform();
        }

        //validate that the create new account button is clicklbe
         wait.until(ExpectedConditions.elementToBeClickable(signUp));
         //click on sign up
         ac.click(signUp).perform();
        // validate that the user is on account page
        wait.until(ExpectedConditions.urlToBe(urlAccount));





//         driver.quit();

//
//
//        driver.findElement(By.xpath("//input[@id='nameInput']")).clear();
//      WebElement  updateName=driver.findElement(By.xpath("//input[@id='nameInput']"));
//      ac.click(updateName).perform();
//      for(  char    ch:"ahmad".toCharArray()){
//          ac.sendKeys(String.valueOf(ch)).perform();
//        }
//
//        driver.findElement(By.xpath(" //input[@name='email']")).clear();
//     WebElement emailUpdate=driver.findElement(By.xpath(" //input[@name='email']"));
//      ac.click(emailUpdate).perform();
//      for(     char  ch:"hasanfadavi22@gmail.com" .toCharArray()  ){
//          ac.sendKeys(String.valueOf(ch)).perform();
//      }
//
//
//     WebElement updateButton=driver.findElement(By.xpath(" //button[@id='personalUpdateBtn']"));
//      ac.click(updateButton).perform();
//
//
//     WebElement expireYear=driver.findElement(By.xpath(" //select[@name='expirationYear']"));
//      Select dropDownYear=new Select(expireYear);
//     dropDownYear.selectByVisibleText("2027");
//
//
//        WebElement expireMonth=driver.findElement(By.xpath(" //select[@name='expirationMonth']"));
//        Select dropDownMonth=new Select(expireMonth);
//        dropDownYear.selectByVisibleText("12");
//

    }





}
