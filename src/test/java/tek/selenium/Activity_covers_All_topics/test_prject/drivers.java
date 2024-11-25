package tek.selenium.Activity_covers_All_topics.test_prject;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class drivers {


    public   WebDriver driverss= new ChromeDriver();
    //explicit wait
    public  WebDriverWait wait= new WebDriverWait(driverss, Duration.ofSeconds(5));
    public  Actions ac= new Actions(driverss);

    //implicit wait
    public void waitElement  ( ){
        driverss.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
    };



    public   final String baseUrl = "https://www.bbc.com/";
    public static final String email = "ahmadjavad4@gmail.com";
    public static final String password = "ahmadjavad1";
    public static final String month = "01";
    public static final String day = "01";
    public static final String year = "2000";
    public  final boolean alreadyRegister = true;

    public static final String registerButtonXpath = "//span[text()='Register']";
    public static final String emailInputXpath = "//input[@id='username']";
    public static final String passInputXpath = "//input[@name='password']";
    public static final String continueButtonXpath = "//button[@type='submit']";
    public static final String logoEmailXpath = "//span[text()='Register for a BBC account']";
    public static final String logopassXpath = "//span[text()='Create your account password']";
    public static final String logoBirthDateXpath = "//span[text()='Enter your details']";
    public static final String logocreatXpath = "//span[text()='Your account has been created']";


}
