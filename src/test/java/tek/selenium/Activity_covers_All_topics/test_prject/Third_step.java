package tek.selenium.Activity_covers_All_topics.test_prject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Third_step {


    public static void main(String[] args) throws InterruptedException {

        //socond_Step
        // create Method

        drivers obj=new drivers();
        registerButton objRegister=new registerButton();

        obj.driverss.get(obj.baseUrl);
        obj.driverss.manage().window().maximize();
        System.out.println(obj.driverss.getCurrentUrl());

        //imlicit
       obj.waitElement();
        //validate base url
        obj.wait.until(ExpectedConditions.urlToBe(obj.baseUrl));

        objRegister.registerB();
        objRegister.emailPage();

        if (obj.alreadyRegister) {
            objRegister.alreadyRegisterAcc();
        } else
            objRegister.createAccount();

    }

}



