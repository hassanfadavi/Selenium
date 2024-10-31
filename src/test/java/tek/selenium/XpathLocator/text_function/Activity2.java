package tek.selenium.XpathLocator.text_function;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


import java.util.List;

public class Activity2 {
    public static void main(String[] args) throws InterruptedException {

        //open Chrome
        ChromeDriver chdriver=new ChromeDriver();
        chdriver.get("https://retail.tekschool-students.com/");
        chdriver.manage().window().maximize();
        String pageTitle=chdriver.getTitle();
        System.out.println(pageTitle);
        Thread.sleep(1000);

        //select sign in
        By signinLocator = By.xpath("//a[text()='Sign in']");
        WebElement signinElement= chdriver.findElement(signinLocator);
        signinElement.click();
        Thread.sleep(1000);


        //create new account
        By newAccountLocator = By.xpath("//a[contains(text(),'New Account')]");
        WebElement newAccounElement= chdriver.findElement(newAccountLocator);
        newAccounElement.click();
        Thread.sleep(1000);

        //sign up
        By signUPLocator = By.xpath("//button[text()='Sign Up']");
        WebElement signUPElement= chdriver.findElement(signUPLocator);
        signUPElement.click();
        Thread.sleep(1000);

//         print error
        By errorLocator = By.className("error");
        List<WebElement> errorElements = chdriver.findElements( errorLocator);

        for(WebElement element:errorElements){
            System.out.println(element.getText());
        }

        chdriver.quit();









    }
}
