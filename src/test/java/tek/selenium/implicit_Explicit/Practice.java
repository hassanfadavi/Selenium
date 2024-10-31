package tek.selenium.implicit_Explicit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Practice {
    public static void main(String[] args) throws InterruptedException {

  /*
    Sign In to retail app with your credentials
    Then go to account page and update phone number
    Make sure Success Message Toast is displayed
    NOTE: Apply Implicit and Explicit wait .

    Hint-> WebElement have clear() which should use before SendKey to input element
     */


        //open Chrome
        ChromeDriver chdriver=new ChromeDriver();
        chdriver.get("https://retail.tekschool-students.com/");
        chdriver.manage().window().maximize();
        String pageTitle=chdriver.getTitle();
        System.out.println(pageTitle);

        //implicit
        chdriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        //explicit
        WebDriverWait wait=new WebDriverWait(chdriver , Duration.ofSeconds(15));


        //SIGN IN
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@id='signinLink']")));

        By signInLocator = By.xpath("//a[@id='signinLink']");
        WebElement signInElement= chdriver.findElement(signInLocator);
        signInElement.click();


        //input Email
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@name='email']")));

        By emailInput = By.xpath("//input[@name='email']");
        WebElement emailInputElement= chdriver.findElement(emailInput);
        emailInputElement.clear();
        emailInputElement.sendKeys("s.hasanfadavi@gmail.com");



        //input pass
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//input[@name='password']")));

        By passInput = By.xpath("//input[@name='password']");
        WebElement passElement= chdriver.findElement( passInput);
        passElement.clear();
        passElement.sendKeys("Se@123456");


        //login
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[text() = 'Login']")));

        By loginInput = By.xpath("//button[text() = 'Login']");
        WebElement loginElement= chdriver.findElement( loginInput);
        loginElement.click();


        //Account
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@id='accountLink']")));

        By accountLocator = By.xpath("//a[@id='accountLink']");
        WebElement accountElement= chdriver.findElement(accountLocator);
        accountElement.click();


        //enter phone number
        wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("input[name='phoneNumber']")));

        By phoneInput = By.cssSelector("input[name='phoneNumber']");   //Attribute
        WebElement phoneElement= chdriver.findElement( phoneInput);
        phoneElement.clear();
        phoneElement.sendKeys("2404085559");


        //update
        wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("button#personalUpdateBtn")));

        By update = By.cssSelector("button#personalUpdateBtn");   //Attribute
        WebElement updateElement= chdriver.findElement( update);
        updateElement.click();


        //text
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[text()='Personal Information Updated Successfully']")));

        By textLocator = By.xpath("//div[text()='Personal Information Updated Successfully']");
        WebElement textElement= chdriver.findElement(textLocator);
        String text=textElement.getText();
        System.out.println(text);




    }
}
