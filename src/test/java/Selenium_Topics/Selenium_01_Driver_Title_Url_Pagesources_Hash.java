package Selenium_Topics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

public class Selenium_01_Driver_Title_Url_Pagesources_Hash {

    public static void main(String[] args) throws InterruptedException {
//WebDriver uygulama uzerinde insanin yaptigi seyleri yapmaya imkan verir
         WebDriver driver=new ChromeDriver();  //driver chrome olarak acilsin
       // WebDriver driver=new EdgeDriver();  //driver edge olarak acilsin
        //   WebDriver driver=new FirefoxDriver();  //driver firefox olarak acilsin


        driver.get("https://www.google.com");
        //SOFT WAIT  --selenium kodu
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15)); //sayfanin butun elementlerin acilmasini bekler 15 saniye boyunca

        String title= driver.getTitle(); //internet sayfasinin title verir
        System.out.println("title = " + title);

        String currentUrl=driver.getCurrentUrl(); //sayfa url'sini verir
        System.out.println("currentUrl = " + currentUrl);

        //HARD WAIT -- java kodudur
        Thread.sleep(3000);
        String pageSource= driver.getPageSource(); //sayfa html kodlarini verir
        //System.out.println("pageSource = " + pageSource);

        String handle= driver.getWindowHandle(); //sayfanin hash degerini verir.
        System.out.println("handle = " + handle);

       driver.quit(); //driver kapatmak ve sayfayi kapatmak icin kullanilir
       //driver.close(); //browser kapatir

    }

}
