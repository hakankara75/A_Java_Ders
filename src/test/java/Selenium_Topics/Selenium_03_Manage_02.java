package Selenium_Topics;

import org.junit.Test;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Selenium_03_Manage_02 {
    @Test
    public void name() throws InterruptedException {
        WebDriver driver= new ChromeDriver();
        driver.manage().window().maximize();
        Thread.sleep(2000);

        //kullanici "https://www.trendyol.com/" sayfasina gider
        driver.get("https://www.trendyol.com/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.manage().deleteAllCookies();// kullanicinin daha once ayni sitede yaptigi davranislari kaydeder cookiesler. Bu komut onu siler ve temiz test saglar.

        Thread.sleep(2000);
        driver.manage().window().minimize();
        Thread.sleep(2000);
        driver.manage().window().maximize();

        //kullanici cookie ekler
        Thread.sleep(2000);
        Cookie cookie=new Cookie("cookieName", "Bazi cookiesler iyidir ama cok cookies kotudur.");
        driver.manage().addCookie(cookie);

        Thread.sleep(2000);
        String cookieName= String.valueOf(driver.manage().getCookieNamed("cookieName"));
        System.out.println("cookieName = " + cookieName);

        driver.quit();


    }
}
