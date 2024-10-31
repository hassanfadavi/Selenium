package tek.selenium.IDLOCATOR;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class openBrowser {
    public static void main(String[] args) {



        //open the browser
        WebDriver chdriver=new ChromeDriver();
        chdriver.get("https://translate.google.com/?hl=en&tab=TT&sl=en&tl=fa&op=translate");

        //  //maximize browser(the screen)
        chdriver.manage().window().maximize();

        //print the title
        String pagetitle=chdriver.getTitle();
        System.out.println(pagetitle);

        //closing
        chdriver.quit();  //closing browser
        chdriver.close(); //close 1 tab




    }
}
