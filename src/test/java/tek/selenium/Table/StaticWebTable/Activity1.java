package tek.selenium.Table.StaticWebTable;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;

public class Activity1 {

    public static String baseUrl = "https://testautomationpractice.blogspot.com/";

    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        Actions ac = new Actions(driver);
        driver.get(baseUrl);
        String title = driver.getTitle();
        System.out.println(title);
        driver.manage().window().maximize();

        //implicit
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
        //explicit
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(3));

        //total number of rows
       int rows = driver.findElements(By.xpath("//table[@name='BookTable']//tr")).size();
        System.out.println(rows);

        //total number of columns
        int columns = driver.findElements(By.xpath("//table[@name='BookTable']//th")).size();
        System.out.println(columns);

        //read specific row and colum
      WebElement  specific=driver.findElement(By.xpath("//table[@name='BookTable']//tr[7]//td[3]"));
      //validate
        wait.until(ExpectedConditions.visibilityOfAllElements(specific));
     String text=specific.getText();
        System.out.println(text);


//        read all data
        System.out.println("BookName"+"\t"+"Author"+"\t"+"Subject"+"\t"+"Price");

        for(int r=2;r<=rows;r++){
            for(int c=1;c<=columns;c++){
               String  allData=driver.findElement(By.xpath("//table[@name='BookTable']//tr["+r+"]//td["+c+"]")).getText();
                System.out.print(allData+"\t");
            }
            System.out.println();
        }

        System.out.println("*****************************************************");

        //print BookName whose Author is Mukesh
        for(int r=2;r<=rows;r++){

                String  author=driver.findElement(By.xpath("//table[@name='BookTable']//tr["+r+"]//td[2]")).getText();

                if(author.equals("Mukesh")){
                    String  book=driver.findElement(By.xpath("//table[@name='BookTable']//tr["+r+"]//td[1]")).getText();
                    System.out.println(book+"\t"+author);
                }
            }


        //sum of price columns
        int sum=0;
        for(int r=2;r<=rows;r++){
           String price=driver.findElement(By.xpath("//table[@name='BookTable']//tr["+r+"]//td[4]")).getText();
         int  priceS=Integer.parseInt(price);
         sum=sum+priceS;

        }
        System.out.println(sum);







        driver.quit();

        }





    }


