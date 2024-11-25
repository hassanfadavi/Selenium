package tek.selenium.Activity_covers_All_topics.second_edit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.Random;

public class second_edit {

 public static Random random=new Random();
 public   static WebDriver  driver = new ChromeDriver();
  public   static    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
 public   static Actions ac = new Actions(driver);
 public   static String title = driver.getTitle();

//Random
    public static int randomNumber=0;

    //Urls
    public static final String urlReatal = "https://retail.tekschool-students.com/";
    public static final String urlSignIn = "https://retail.tekschool-students.com/auth/login";
    public static final String urlSignUp = "https://retail.tekschool-students.com/auth/sign-up";
    public static final String urlAccount = "https://retail.tekschool-students.com/profile";
    //locator
    public static final String signInButtonXpath = "//a[text()='Sign in']";
    public static final String creatNewAccountXpath = "//a[@id='newAccountBtn']";
    public static final String nameInputXpath = "//input[@name='name']";
    public static final String emailInputXpath = "//input[@name='email']";
    public static final String passInputXpath = "//input[@name='password']";
    public static final String confirmPassInputXpath = "//input[@name='confirmPassword']";
    public static final String signUpButtonXpath = "//button[text()='Sign Up']";
    public static final String signInEmailInputXpath="//input[@id='email']";
    public static final String signInpassInputXpath="//input[@id='password']";
    public static final String signInLoginbuttonXpath="//button[@id='loginBtn']";
    public static final String accountButtonByXpath="//a[text()='Account']";
    public static final String profileNameInputByXpath="//input[@name='name']";
    public static final String profilephoneNumbereInputByXpath="//input[@name='phoneNumber']";
    public static final String profileUpdateButtonByXpath="//button[text()='Update']";



    //sign up page data
    public static final String userName = "hasan";
    public static final String emailAddress = "s.hasan202@gmail.com";
    public static final String passWord = "Aa1asdfg@";
    //profile page data
    public static final String profileName="husein";
    public static final String profileEmail="s.hasan206@gmail.com";

    public static final String displayUsernameXpath = "//h1[@class='account__information-username']";


    public static boolean alreadyHaveAccount=true;



    public static void main(String[] args) throws InterruptedException {

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();
        System.out.println(title);

        //navigate
        driver.get(urlReatal);
        wait.until(ExpectedConditions.urlToBe(urlReatal));

        //sign in
        WebElement signInButton = driver.findElement(By.xpath(signInButtonXpath));
        wait.until(ExpectedConditions.elementToBeClickable(signInButton));   //optional
        //click on new sign in
        ac.click(signInButton).perform();
        // validate that the user is on signIn page
        wait.until(ExpectedConditions.urlToBe(urlSignIn));


        if(alreadyHaveAccount){
            loginUserAndNavigateToProfilePage();
        }
        else createAccountAndNavigateToProfile();


        changeUserNameAndEmailOnProfilePage();

    }

    //*******************************************************


    public static void loginUserAndNavigateToProfilePage() {


        //Locate elements on Log in page
        WebElement email = driver.findElement(By.xpath(signInEmailInputXpath));
        WebElement password = driver.findElement(By.xpath(signInpassInputXpath));
        WebElement loginButton = driver.findElement(By.xpath(signInLoginbuttonXpath));

        //validate the input field in clickable
        wait.until(ExpectedConditions.elementToBeClickable(email));

        //input email
        ac.click(email).perform();
        for (char ch : emailAddress.toCharArray()) {
            ac.sendKeys(String.valueOf(ch)).perform();
        }

        //input pass
        ac.click(password).perform();
        for (char ch : passWord.toCharArray()) {
            ac.sendKeys(String.valueOf(ch)).perform();
        }

        ac.click(loginButton).perform();



        //locate account button
       WebElement accountButton=driver.findElement(By.xpath( accountButtonByXpath));
        //  valiate account button
        wait.until(ExpectedConditions.elementToBeClickable(accountButton));
        //click on button
       ac.click(accountButton).perform();
        //validate profile page
        wait.until(ExpectedConditions.urlToBe(urlAccount));



    }

//************************************************************************************************


    public static void createAccountAndNavigateToProfile(){

        //validate that the create new account button is clicklbe

        WebElement creatNewAcount = driver.findElement(By.xpath(creatNewAccountXpath));
        wait.until(ExpectedConditions.elementToBeClickable(creatNewAcount));

        //click on new account
        ac.click(creatNewAcount).perform();
        // validate that the user is on signUp page
        wait.until(ExpectedConditions.urlToBe(urlSignUp));

        //Locate elements on signUp page
        WebElement name = driver.findElement(By.xpath(nameInputXpath));
        WebElement email = driver.findElement(By.xpath(emailInputXpath));
        WebElement password = driver.findElement(By.xpath(passInputXpath));
        WebElement confirmpassword = driver.findElement(By.xpath(confirmPassInputXpath));
        WebElement signUp = driver.findElement(By.xpath(signUpButtonXpath));

        //validate that one of the elements on sign up page is clickable
        wait.until(ExpectedConditions.elementToBeClickable(name));


        //sign up page data
        //*****************************************************************************************************
        //input Name
        ac.click(name).perform();
        for (char ch : userName.toCharArray()) {
            ac.sendKeys(String.valueOf(ch)).perform();

        }

        //input email
        ac.click(email).perform();
        for (char ch : emailAddress.toCharArray()) {
            ac.sendKeys(String.valueOf(ch)).perform();

        }

        //input pass
        ac.click(password).perform();
        for (char ch : passWord.toCharArray()) {
            ac.sendKeys(String.valueOf(ch)).perform();

        }

        //input confirmPass
        ac.click(confirmpassword).perform();
        for (char ch : passWord.toCharArray()) {
            ac.sendKeys(String.valueOf(ch)).perform();
        }

        //validate that the create new account button is clicklbe
        wait.until(ExpectedConditions.elementToBeClickable(signUp));
        //click on sign up
        ac.click(signUp).perform();
        // validate that the user is on account page
        wait.until(ExpectedConditions.urlToBe(urlAccount));

    }

    //****************************************************************************************


    public static void changeUserNameAndEmailOnProfilePage() throws InterruptedException {

        //validate on profile page
        wait.until(ExpectedConditions.urlToBe(urlAccount));

       //locate name and phone and update button
        WebElement inputProfileName=driver.findElement(By.xpath(profileNameInputByXpath));
        inputProfileName.clear();
        Thread.sleep(2000);
        WebElement inputProfilePhoneNumber=driver.findElement(By.xpath(profilephoneNumbereInputByXpath ));
        inputProfilePhoneNumber.clear();
        Thread.sleep(2000);
        WebElement  updateButton=driver.findElement(By.xpath(profileUpdateButtonByXpath));
        WebElement userNameHeading = driver.findElement(By.xpath(displayUsernameXpath));

       //validate the name field and phone
        wait.until(ExpectedConditions.elementToBeClickable(inputProfileName));
        Thread.sleep(2000);
        wait.until(ExpectedConditions.elementToBeClickable(inputProfilePhoneNumber));


        //click  and input name ,phone number,clicl
        ac.click(inputProfileName).sendKeys(String.valueOf("Aa")).perform();
        // TODO: Generate random phone numbers (10 digits)
        ac.click(inputProfilePhoneNumber).sendKeys(String.valueOf("2404086149")).perform();
        ac.click(updateButton).perform();

        // TODO: Update useName variable on the code right after we update the username.
        String newName = userNameHeading.getText();
        if ( newName.equals(userName) ) System.out.println("passed");
        else System.out.println("Not passed");



//        randomNumber=random.nextInt(1000-1)+1;
        // TODO: Generate random email addresses and the random number should be placed before @ sign.
//        action.click(emailInputField).sendKeys(String.valueOf(randomNumber)).perform();

        // indexOf() --> index of the last occurrence of character 'r'
        // right after r, replace random numbers and write @gmail.com
        // or you can create an email with X values, where x can be replaced with values
        // trevor.alexanderXXXX@gmail.com
        // replace() --> replace XXXX --> random numbers

        // TODO: Update the emailAddress variable value right after you change the actual email on your test


    }


}







