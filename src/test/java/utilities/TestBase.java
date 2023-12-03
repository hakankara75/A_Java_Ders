package utilities;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

import static org.junit.Assert.assertTrue;

public class TestBase {
   protected static WebDriver driver;
    @Before
    public void setUp()  {
        driver=new ChromeDriver();
        driver.manage().window().maximize();

    }
    @After
    public void tearDown() throws InterruptedException {
        Thread.sleep(2000);
        driver.close();
    }

    /**
     * Hard wait istenemeyen wait. Butun kodlari durdurur.
     * Gozle testi izleyebilmek icin koyduk. Otomasyon testi kosarken kaldirilmali.
     * @param saniye int cinsinden saniye olarak verilmeli
     */
    public static void wait(int saniye){
        try {
            Thread.sleep(saniye*1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    /**
     * bu metot verilen iki stringin birbirine esit oldugunu dogrular
     * @param str1 verilecek olan 1. string parametresidir
     * @param str2 verilecek olan 2. string parametresidir
     */
    public static void assertString(String str1, String str2){

        assertTrue(str1.equals(str2));
    }

    /**
     * alerti reddeder / cancel yapar
     */
    public static void dismissAlert(){
        driver.switchTo().alert().dismiss();
    }

    /**
     * alerti accept yapar
     */
    public static void acceptAlert(){
        driver.switchTo().alert().accept();
    }

    /**
     * alerte text gondermek icin kullaniriz
     * @param str alertin icine gonderilecek olan string dir.
     */
   public static void sendKeysToAlert(String str) {

        driver.switchTo().alert().sendKeys(str);
   }


}
