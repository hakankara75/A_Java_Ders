package Selenium_Topics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Selenium_02_Navigate {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new FirefoxDriver();

        driver.get("https://parabank.parasoft.com/parabank/index.htm"); //1. gittigim site
        System.out.println("driver.getWindowHandle() = " + driver.getWindowHandle());
        Thread.sleep(2000);

        driver.navigate().to("https://demo.applitools.com/"); //2. gidecegim site
        System.out.println("driver.getWindowHandle() = " + driver.getWindowHandle());
        Thread.sleep(2000);

        driver.navigate().back(); // 1. sayfaya donme, geri donme komutu: parabank.parasoft.com
        System.out.println("driver.getWindowHandle() = " + driver.getWindowHandle());
        Thread.sleep(2000);

        driver.navigate().forward(); // 2. sayfaya geri donme: demo.applitools
        Thread.sleep(2000);

        driver.navigate().refresh(); //sayfayi yenileme
        Thread.sleep(2000);

        Thread.sleep(2000);
        driver.quit();


    }
}
