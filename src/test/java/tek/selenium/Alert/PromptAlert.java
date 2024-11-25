package tek.selenium.Alert;

import org.openqa.selenium.WebElement;
import tek.selenium.Alert.obj.alerts;

public class PromptAlert {
    public static void main(String[] args) throws InterruptedException {


       alerts obj=new alerts();

       obj.getUrl("https://retail.tekschool-students.com/selenium/javascript-alerts");
       obj.manages();
       obj.title();
       obj.waiitFor(2000);
       WebElement propmtBtn=obj.finElementByid("promptBtn");
       obj.click(propmtBtn);
        obj.waiitFor(2000);

        obj.switchAlert();
        obj.senkeys("hello Humans");
        obj.waiitFor(2000);

        obj.accept();

        WebElement confirmationText=obj.finElementByid("message");
       String webText=confirmationText.getText();

        System.out.println(webText);

        if(webText.equals("hello Humans")){
            System.out.println("test is passed");
        }else System.out.println("test is failed");
















    }
}
