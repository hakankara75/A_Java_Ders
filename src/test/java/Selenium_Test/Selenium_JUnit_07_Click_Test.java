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

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

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
    public void clickTest() throws InterruptedException {

//        kullanici Yeni Urunler linkini tiklar
        WebElement yeniUrunler=driver.findElement(By.cssSelector("a[style='background-color:#ffffff']"));
        yeniUrunler.click();

//        kullanici Ilk sayfaya geri doner
        driver.navigate().back();

//        kullanici Dekorasyon linkini tiklar
        WebElement dekorasyon= driver.findElement(By.xpath("(//a[@class='js-submenu-item-title'])[6]"));
       // WebElement dekorasyon= driver.findElement(By.xpath("//span[text()='KÜÇÜK EV ALETLERİ']"));
        dekorasyon.click();

//        kullanici İlk urunu tiklar
        WebElement ilkUrun= driver.findElement(By.xpath("(//h3[@class='product-name analytics-sub-product-click'])[1]"));
        String exptectedProductName = ilkUrun.getText();
        System.out.println("exptectedProductName = " + exptectedProductName);
        ilkUrun.click();

//        kullanici Sepete Ekle butonunu tiklar
        WebElement sepeteEkle= driver.findElement(By.xpath("(//a[@data-quantity='1'])[1]"));
        sepeteEkle.click();

//        kullanici Sepetim linkinini tiklar
        WebElement alisverisiTamamla=driver.findElement(By.xpath("(//a[@href='/baskets/basket/'])[2]"));
        alisverisiTamamla.click();


//        kullanici ekledigi urunun sepette oldugunu dogrular
        WebElement eklenenUrun=driver.findElement(By.xpath("//h5[text()='Floret Cam Dekoratif Tepsi 22x37 Cm Mavi']"));
        String actualProductName= eklenenUrun.getText();
        System.out.println("actualProductName = " + actualProductName);
        assertEquals(exptectedProductName,actualProductName);



    }
}
