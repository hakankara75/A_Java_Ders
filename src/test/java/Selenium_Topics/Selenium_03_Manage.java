package Selenium_Topics;

import org.junit.Test;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;
import java.util.List;

import static org.junit.Assert.*;

public class Selenium_03_Manage {

    @Test
    public void manage() throws InterruptedException {
        WebDriver driver=new FirefoxDriver();

        //kullanici "https://www.saucedemo.com/" sayfasina gider
        driver.get("https://www.saucedemo.com/"); //istenen sayfaya gider
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15)); //SOFT sayfa yuklenene kadar asagidaki kodlari bekletir

        //kullanici sayfanin konumunu dogrular
        //Point expectedPosition= driver.manage().window().getPosition();
        Point expectedPosition= (new Point(3,3));
        System.out.println("expectedPosition = " + expectedPosition); //sayfanin konumunu verir
        Point actualPosition= driver.manage().window().getPosition();
        assertEquals(expectedPosition, actualPosition);

       // Dimension expectedSize= driver.manage().window().getSize();
        Dimension expectedSize= (new Dimension(1291, 747));
        System.out.println("expectedSize = " + expectedSize);
        Dimension actualSize= driver.manage().window().getSize(); //sayfanin olculerini verir
        assertTrue(expectedSize.equals(actualSize));

        //kullanici sayfanin pointini degistirir
        Thread.sleep(2000);
        expectedPosition= new Point(1000, 100); //bekledigim
        driver.manage().window().setPosition(new Point(1000,100)); //bekledigimi komut olarak verdim drivere sen bu olculeri olustur
        actualPosition= driver.manage().window().getPosition();
        assertEquals(expectedPosition, actualPosition);

        //kullanici sayfanin size'ini degistirir.
       Thread.sleep(2000);
       expectedSize= new Dimension(600, 200);
        driver.manage().window().setSize(expectedSize);
        actualSize=driver.manage().window().getSize();
        assertEquals(expectedSize, actualSize);

        //yukaridaki Dimension degerlerini tek tek ele alir
        int actualWith= driver.manage().window().getSize().getWidth();
        System.out.println("actualWith = " + actualWith);
        int actualHeight= driver.manage().window().getSize().getHeight();
        System.out.println("actualHeight = " + actualHeight);

        assertEquals(expectedSize.getHeight(),actualHeight);
        assertEquals(expectedSize.getWidth(),actualWith);


        driver.quit();


    }
}
