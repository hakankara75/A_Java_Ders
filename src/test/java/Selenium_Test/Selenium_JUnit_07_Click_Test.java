package Selenium_Test;

import org.checkerframework.checker.units.qual.A;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Selenium_JUnit_07_Click_Test {


    /*
    kullanici https://www.englishhome.com/ sayfasina gider
    kullanici Yeni Urunler linkini tiklar
    kullanici Ilk sayfaya geri doner
    kullanici Dekorasyon linkini tiklar
    kullanici İlk urunu tiklar
    kullanici Sepete Ekle butonunu tiklar
    kullanici Sepetim linkinini tiklar
    kullanici ekledigi urunun sepette oldugunu dogrular
    kullanici sayfayi kapatir
     */
    WebDriver driver;

    @Before
    public void setup() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();

// kullanici https://www.englishhome.com/ sayfasina gider
        driver.get("https://www.englishhome.com/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

    }

    @After
    public void tearDown() throws InterruptedException {
        Thread.sleep(2000);
        driver.close();
    }

    @Test
    public void clickTest() {

//        kullanici Yeni Urunler linkini tiklar
        WebElement yeniUrunler=driver.findElement(By.cssSelector("a[style='background-color:#ffffff']"));
        yeniUrunler.click();

//        kullanici Ilk sayfaya geri doner

//        kullanici Dekorasyon linkini tiklar
//        kullanici İlk urunu tiklar
//        kullanici Sepete Ekle butonunu tiklar
//        kullanici Sepetim linkinini tiklar
//        kullanici ekledigi urunun sepette oldugunu dogrular
//        kullanici sayfayi kapatir

    }
}
