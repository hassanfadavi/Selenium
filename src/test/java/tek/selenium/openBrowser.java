package tek.selenium;


import org.openqa.selenium.chrome.ChromeDriver;

public class openBrowser {
    public static void main(String[] args) {

        ChromeDriver chromeDriver=new ChromeDriver();
        chromeDriver.get("https://www.yahoo.com/");
        chromeDriver.get("https://www.selenium.dev/");



    }
}
