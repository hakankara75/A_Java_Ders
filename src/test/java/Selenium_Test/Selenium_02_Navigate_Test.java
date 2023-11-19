package Selenium_Test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.sql.Driver;

import static org.junit.Assert.*;


public class Selenium_02_Navigate_Test {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver= new ChromeDriver();
        //kullanici "https://parabank.parasoft.com/parabank/index.htm" siteye gider
        driver.get("https://parabank.parasoft.com/parabank/index.htm"); //1. sayfa

        //kullanici url dogrular
        String expectedUrlParabank= "https://parabank.parasoft.com/parabank/index.htm";
        String actualUrlParabank= driver.getCurrentUrl();
        assertEquals(expectedUrlParabank, actualUrlParabank);

        //kullanici "https://demo.applitools.com/" siteye gider
        Thread.sleep(2000);
        driver.navigate().to("https://demo.applitools.com/"); //2. sayfa. yukaridaki sayfadan sonra bu sayfaya gitme komutu
        String expectedUrlDemo="https://demo.applitools.com/";
        String actualUrlDemo= driver.getCurrentUrl();
        assertTrue(actualUrlDemo.contains(expectedUrlDemo));

        //kullanici 1. siteye geri doner
        Thread.sleep(2000);
        driver.navigate().back();
        actualUrlParabank=driver.getCurrentUrl();
        assertEquals(expectedUrlParabank, actualUrlParabank);

        //kullanici 2. siteye tekrar gider
        Thread.sleep(2000);
        driver.navigate().forward();
        actualUrlDemo=driver.getCurrentUrl();
        assertEquals(expectedUrlDemo, actualUrlDemo);

        //kullanici sayfayi yeniler
        Thread.sleep(2000);
        driver.navigate().refresh();
        actualUrlDemo=driver.getCurrentUrl();
        assertTrue(expectedUrlDemo.equals(actualUrlDemo));

        driver.quit();


    }
}
