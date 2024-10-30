package tek.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActivityRecap4 {
    public static void main(String[] args) throws InterruptedException {
        //open Chrome
        ChromeDriver chdriver=new ChromeDriver();
        chdriver.get("https://retail.tekschool-students.com/");
        chdriver.manage().window().maximize();
        String pageTitle=chdriver.getTitle();
        System.out.println(pageTitle);
        Thread.sleep(2000);


        //SIGN IN
        By signInLocator = By.xpath("//a[@id='signinLink']");
        WebElement signInElement= chdriver.findElement(signInLocator);
        signInElement.click();


        //input Email
        By emailInput = By.xpath("//input[@name='email']");
        WebElement emailInputElement= chdriver.findElement(emailInput);
        emailInputElement.sendKeys("s.hasanfadavi@gmail.com");
        Thread.sleep(1000);


        //input pass
        By passInput = By.xpath("//input[@name='password']");
        WebElement passElement= chdriver.findElement( passInput);
        passElement.sendKeys("Se@123456");
        Thread.sleep(1000);


        //login
        By loginInput = By.xpath("//button[text() = 'Login']");
        WebElement loginElement= chdriver.findElement( loginInput);
        loginElement.click();
        Thread.sleep(1000);




        //input keyboard
        By inputLocator = By.xpath("//input[@type='text']");
        WebElement inputElement= chdriver.findElement(inputLocator);
        inputElement.sendKeys("keyboard");
        Thread.sleep(1000);

        //enter search
        By searchInput = By.xpath("//button[@class='search__btn']");
        WebElement searchElement= chdriver.findElement( searchInput);
        searchElement.click();
        Thread.sleep(1000);


        //SELECT keyboard
        By  keyboardLocator = By.xpath("//div[@class='products']/div[1]/p[@class='products__name']");
        WebElement keyboardElement= chdriver.findElement(keyboardLocator);
        keyboardElement.click();
        Thread.sleep(1000);


        //add to cart
        By  cartLocator = By.xpath("//button[@class='product__btn']");
        WebElement cartElement= chdriver.findElement(cartLocator);
        cartElement.click();
        Thread.sleep(1000);


        //cartQuantity

        By  cart = By.xpath("//span[@id='cartQuantity']");
        WebElement carElement= chdriver.findElement( cart);
        String cartN=carElement.getText();
        System.out.println(cartN);

        if (cartN.equals("1")) {
            System.out.println("CART COUNT:1");
        } else {
            System.out.println("EMPTY");
        }
    }
}
