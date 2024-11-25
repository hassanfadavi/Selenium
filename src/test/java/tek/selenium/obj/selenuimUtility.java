package tek.selenium.obj;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class selenuimUtility {


    private final WebDriverWait wait;

    public selenuimUtility(WebDriverWait wait){

        this.wait=wait;
    }

   public void click(By locator){

        wait.until(ExpectedConditions.elementToBeClickable(locator))
                .click();

    }

   public void  sendKeys(By locator,String value){
        wait.until(ExpectedConditions.visibilityOfElementLocated(locator))
                .sendKeys(value);
   }


  public String getText(By locator){

      return   wait.until(ExpectedConditions.visibilityOfElementLocated(locator)).
                getText();




  };




}
