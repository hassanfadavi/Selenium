package tek.selenium.dropDown.obj;

import org.openqa.selenium.WebElement;

public class main extends test1 {
    public static void main(String[] args) throws InterruptedException {

          test1 obj=new test1();



        obj.getUrl("https://retail.tekschool-students.com/selenium/dropdown");

        obj.chDriver.manage().window().maximize();

        obj.printTitle();



        WebElement dropDown=obj.locateById("languageSelect");

        obj.createSelect(dropDown);


       obj. selectByValue("Persian");

        obj .selectByIndexx(2);


      obj .listLanguage();




//        test1.quickDriver();
























    }







    }




