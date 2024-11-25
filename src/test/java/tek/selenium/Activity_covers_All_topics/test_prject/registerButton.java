package tek.selenium.Activity_covers_All_topics.test_prject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class registerButton extends drivers{


    public  void registerB(){
        //locate Register Button
        WebElement registerButton = driverss.findElement(By.xpath(registerButtonXpath));
        //validate
        wait.until(ExpectedConditions.elementToBeClickable(registerButton));
        //click
        ac.click(registerButton).perform();
        // validate that the user is on signup page-check the logo
        WebElement logoEmail = driverss.findElement(By.xpath(logoEmailXpath));
        String logoTextEmail = wait.until(ExpectedConditions.visibilityOf(logoEmail)).getText();
        System.out.println(logoTextEmail);

    }

    public   void alreadyRegisterAcc() {

        WebElement alreadyRegisterElement = driverss.findElement(By.xpath("//div[@class='sb-form-message__content']//p[1]/span[1]//span"));
        String alreadyText = wait.until(ExpectedConditions.visibilityOf(alreadyRegisterElement)).getText();
        System.out.println(alreadyText);
        driverss.navigate().back();

    }


    public   void createAccount(){
//        locate password
        WebElement passInput = driverss.findElement(By.xpath(passInputXpath));
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
        WebElement logoPass = driverss.findElement(By.xpath(logopassXpath));
        String logoTextPass = wait.until(ExpectedConditions.visibilityOf(logoPass)).getText();
        System.out.println(logoTextPass);


        //locate continue
        WebElement continueButton2 = driverss.findElement(By.xpath(continueButtonXpath));
//        //validate
        wait.until(ExpectedConditions.elementToBeClickable(continueButton2));
//        //click
        ac.click(continueButton2).

                perform();

        // validate that the user is on password page-check the logo
        WebElement logoBirthDate = driverss.findElement(By.xpath(logoBirthDateXpath));
        String logoTextbirthDate = wait.until(ExpectedConditions.visibilityOf(logoBirthDate)).getText();
        System.out.println(logoTextbirthDate);

        //locate DataOfBirth
        WebElement monthInput = driverss.findElement(By.xpath("//input[@id='dateOfBirthMonth']"));
        WebElement dayInput = driverss.findElement(By.xpath("//input[@id='dateOfBirthDay']"));
        WebElement yearInput = driverss.findElement(By.xpath("//input[@id='dateOfBirthYear']"));

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
        WebElement registerButton2 = driverss.findElement(By.xpath(registerButtonXpath));
//        //validate
        wait.until(ExpectedConditions.elementToBeClickable(registerButton2));
//        //click
        ac.click(registerButton2).perform();
        //validate your account has been created
        WebElement  logoCreatAccount=driverss.findElement(By.xpath(logocreatXpath));
        System.out.println(wait.until(ExpectedConditions.visibilityOf(logoCreatAccount)).getText());

    }

    public   void emailPage() throws InterruptedException {
        //locate email input
        WebElement emailInput = driverss.findElement(By.xpath(emailInputXpath));
        //validate
        wait.until(ExpectedConditions.elementToBeClickable(emailInput));
        //click
        ac.click(emailInput).perform();
        //pass the email
        for (char ch : email.toCharArray()) {
            ac.sendKeys(String.valueOf(ch)).perform();
        }
        //locate continue
        WebElement continueButton = driverss.findElement(By.xpath(continueButtonXpath));
//        //validate
        wait.until(ExpectedConditions.elementToBeClickable(continueButton));
//        //click
        ac.click(continueButton).perform();
        Thread.sleep(1000);
    }

    //***************************************



}
