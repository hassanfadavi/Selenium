package tek.selenium.dropDown.obj;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class test1 {


//    WebDriver chDriver=new ChromeDriver();

    public   WebDriver chDriver;;


    public test1(){

       this.chDriver =new ChromeDriver();
    }


    public   void creatDriver(){

        chDriver=new ChromeDriver();

    }


    public   void getUrl(String url){

        chDriver.get(url);
    }


    public   void printTitle(){

       String title=chDriver.getTitle();
        System.out.println(title);
    }

    public static WebElement dropDown;

    public   WebElement locateById(String name){

      return   chDriver.findElement(By.id(name));

    }



//    Select selectLang=new Select(dropDown);

    public static Select selectLang;

    public static void createSelect (WebElement dropDown){

        selectLang =new Select(dropDown);

    }

    public static void selectByValue(String value){

        selectLang.selectByValue(value);
    }


    public static void selectByIndexx (int index){

        selectLang.selectByIndex(index);
    }



   public static List<WebElement> option;

     public static void listLanguage(){

         option=selectLang.getOptions();

         for(WebElement options:option){
             System.out.println(options.getText());
         }
     }

    public   void quickDriver(){
        chDriver.quit();
    }



}
