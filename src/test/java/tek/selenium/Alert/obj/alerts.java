package tek.selenium.Alert.obj;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.awt.*;

public class alerts {


    WebDriver chDriver ;

    public alerts(){

       this.chDriver=new ChromeDriver();

    }

    public void getUrl(String Url){
        chDriver.get(Url);
    }

    public void manages(){
    chDriver.manage().window().maximize();

    }



    String title;
    public String title( ){

       title =chDriver.getTitle();
        System.out.println(title);
        return title;
    }

    public void waiitFor(int seconds) throws InterruptedException {
        Thread.sleep(seconds);
    }
//    WebElement simpleALertbt;

    public WebElement finElementByid(String id){
       return chDriver.findElement(By.id(id));
    }

    public void click(WebElement element) {

        element.click();
    }


    Alert alert;
    public Alert switchAlert(){

       this.alert= chDriver.switchTo().alert();
       return alert;
    }





    public String getAlerText(){

        String text=alert.getText();
        System.out.println(text);
       return text;
    }

    public void accept(){
        this. alert.accept();
    }


    public void dismiss(){
       this. alert.dismiss();
    }


    public void senkeys(String keys){

        alert.sendKeys(keys);
    }




}

