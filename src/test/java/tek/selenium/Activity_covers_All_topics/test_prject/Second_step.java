package tek.selenium.Activity_covers_All_topics.test_prject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Second_step {
    public static final String baseUrl = "https://www.bbc.com/";
    public static final String email = "ahmadjavad8@gmail.com";
    public static final String password = "ahmadjavad1";
    public static final String month = "01";
    public static final String day = "01";
    public static final String year = "2000";
    public static final boolean alreadyRegister = false;

    public static final String registerButtonXpath = "//span[text()='Register']";
    public static final String emailInputXpath = "//input[@id='username']";
    public static final String passInputXpath = "//input[@name='password']";
    public static final String continueButtonXpath = "//button[@type='submit']";
    public static final String logoEmailXpath = "//span[text()='Register for a BBC account']";
    public static final String logopassXpath = "//span[text()='Create your account password']";
    public static final String logoBirthDateXpath = "//span[text()='Enter your details']";
    public static final String logocreatXpath = "//span[text()='Your account has been created']";

    public static WebDriver driver= new ChromeDriver();
    //explicit wait
    public static WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(5));
    public static Actions ac= new Actions(driver);

    public static void main(String[] args) throws InterruptedException {

        //socond_Step
        //if already Have Account and creat Method

        driver.get(baseUrl);
        driver.manage().window().maximize();
        System.out.println(driver.getCurrentUrl());

        //implicit wait
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        //validate base url
        wait.until(ExpectedConditions.urlToBe(baseUrl));


        registerButton();
        emailPage();



        if (alreadyRegister) {
            alreadyRegisterAcc();
        } else
            createAccount();

    }

//************************************************************

    public static void alreadyRegisterAcc() {

        WebElement alreadyRegisterElement = driver.findElement(By.xpath("//div[@class='sb-form-message__content']//p[1]/span[1]//span"));
        String alreadyText = wait.until(ExpectedConditions.visibilityOf(alreadyRegisterElement)).getText();
        System.out.println(alreadyText);
        driver.navigate().back();

    }

//**************************************************************
     public static void registerButton(){
    //locate Register Button
    WebElement registerButton = driver.findElement(By.xpath(registerButtonXpath));
    //validate
        wait.until(ExpectedConditions.elementToBeClickable(registerButton));
    //click
        ac.click(registerButton).perform();
    // validate that the user is on signup page-check the logo
    WebElement logoEmail = driver.findElement(By.xpath(logoEmailXpath));
    String logoTextEmail = wait.until(ExpectedConditions.visibilityOf(logoEmail)).getText();
        System.out.println(logoTextEmail);
}
//*************************************************************
public static void emailPage() throws InterruptedException {
    //locate email input
    WebElement emailInput = driver.findElement(By.xpath(emailInputXpath));
    //validate
    wait.until(ExpectedConditions.elementToBeClickable(emailInput));
    //click
    ac.click(emailInput).perform();
    //pass the email
    for (char ch : email.toCharArray()) {
        ac.sendKeys(String.valueOf(ch)).perform();
    }
    //locate continue
    WebElement continueButton = driver.findElement(By.xpath(continueButtonXpath));
//        //validate
    wait.until(ExpectedConditions.elementToBeClickable(continueButton));
//        //click
    ac.click(continueButton).perform();
    Thread.sleep(1000);
}

    //***************************************

 public static void createAccount(){
//        locate password
    WebElement passInput = driver.findElement(By.xpath(passInputXpath));
    //validate
        wait.until(ExpectedConditions.visibilityOf(passInput));
    //click and pass the password
        ac.click(passInput).

    perform();
        for(
    char ch:password.toCharArray())

    {
        ac.sendKeys(String.valueOf(ch)).perform();
    }

    //         validate that the user is on password page-check the logo
    WebElement logoPass = driver.findElement(By.xpath(logopassXpath));
    String logoTextPass = wait.until(ExpectedConditions.visibilityOf(logoPass)).getText();
        System.out.println(logoTextPass);


    //locate continue
    WebElement continueButton2 = driver.findElement(By.xpath(continueButtonXpath));
//        //validate
        wait.until(ExpectedConditions.elementToBeClickable(continueButton2));
//        //click
        ac.click(continueButton2).

    perform();

    // validate that the user is on password page-check the logo
    WebElement logoBirthDate = driver.findElement(By.xpath(logoBirthDateXpath));
    String logoTextbirthDate = wait.until(ExpectedConditions.visibilityOf(logoBirthDate)).getText();
        System.out.println(logoTextbirthDate);

    //locate DataOfBirth
    WebElement monthInput = driver.findElement(By.xpath("//input[@id='dateOfBirthMonth']"));
    WebElement dayInput = driver.findElement(By.xpath("//input[@id='dateOfBirthDay']"));
    WebElement yearInput = driver.findElement(By.xpath("//input[@id='dateOfBirthYear']"));

    //click and pass data
        ac.click(monthInput).perform();
        for(char ch:month.toCharArray())
    {
        ac.sendKeys(String.valueOf(ch)).perform();
    }
        ac.click(dayInput).perform();
        for(char ch:day.toCharArray())
    {
        ac.sendKeys(String.valueOf(ch)).perform();
    }
        ac.click(yearInput).click();
        for(char ch:year.toCharArray())
    {
        ac.sendKeys(String.valueOf(ch)).perform();
    }
    //validate one of them
        wait.until(ExpectedConditions.elementToBeClickable(dayInput));

    //locate Register
    WebElement registerButton2 = driver.findElement(By.xpath(registerButtonXpath));
//        //validate
        wait.until(ExpectedConditions.elementToBeClickable(registerButton2));
//        //click
        ac.click(registerButton2).perform();
     //validate your account has been created
     WebElement  logoCreatAccount=driver.findElement(By.xpath(logocreatXpath));
     System.out.println(wait.until(ExpectedConditions.visibilityOf(logoCreatAccount)).getText());

}
}



