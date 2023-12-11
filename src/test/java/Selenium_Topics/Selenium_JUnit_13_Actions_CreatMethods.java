package Selenium_Topics;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import utilities.TestBase;

import java.time.Duration;

import static org.junit.Assert.assertTrue;

public class Selenium_JUnit_13_Actions_CreatMethods extends TestBase {
    /*
kullanici "https://www.pazarama.com/" sitesine gider
karsisina cikan reklami handle eder
ilk urunun ustune gidince "Sepete Ekle" butonunun aktif oldugunu dogrular
aram cubuguna "KEDİ kumu" yazarak arama yapar
kullanici sayfa altindaki pazarama logosunu gorur
kullanici sayfa basindaki "Bize Ulaşın" linkini tiklar


 */

    @Test
    public void acions() {
//        kullanici "https://www.pazarama.com/" sitesine gider
        driver.get("https://www.pazarama.com/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        Actions actions=new Actions(driver);

//        karsisina cikan reklami handle eder
        WebElement coocike= driver.findElement(By.cssSelector("button[class='btn btn-xs btn-primary !h-auto leading-snug py-1']"));
        coocike.click();

        WebElement reklam= driver.findElement(By.xpath("(//button[@class='dn-slide-accept-btn'])[1]"));
        reklam.click();
        wait(2);
//        ilk urunun ustune gidince "Sepete Ekle" butonunun aktif oldugunu dogrular

        WebElement ilkUrun= driver.findElement(By.xpath("(//button[@type='button'])[3]"));

        //scroll yaptik
        actions.scrollToElement(ilkUrun).perform();
        wait(2);
        System.out.println("ilkUrun.isDisplayed() = " + ilkUrun.isDisplayed()); //gorunuyor mu?
        assertTrue(ilkUrun.isEnabled()); //buton kullanima hazir, aktif ama gorunur degil

        //hoover over , locate ustune gidip bekledik
        actions.moveToElement(ilkUrun).perform();
        webElementScreenShoot(ilkUrun); //sepeteEkle butonunun fotografini cektik
        System.out.println("ilkUrun.isDisplayed() moveto Element sonrasi = " + ilkUrun.isDisplayed()); //gorunuyor mu?
        assertTrue(ilkUrun.isEnabled()); //buton kullanima hazir, aktif ama gorunur degil
        wait(2);

//        aram cubuguna "KEDİ kumu" yazarak arama yapar
        WebElement aramaCubugu= driver.findElement(By.xpath("//input[@placeholder='Marka, ürün veya hizmet ara...']"));
        actions.scrollToElement(aramaCubugu).perform();
        wait(2);

        actions.keyDown(aramaCubugu, Keys.SHIFT) //parmağımı shift butonuna bastim
                .sendKeys("kedim")  //buyuk harfler ile KEDİM yazisini aramaCubugu na gönderdim
                .sendKeys(Keys.BACK_SPACE) //M harfini sildim
                .keyUp(Keys.SHIFT) //parmağımı shift butonundan kaldirdim
                .sendKeys(" kumu", Keys.ENTER)  // Keys.ENTER ile arama butonuna basma gorevini yapariz
                .build()
                .perform();
        wait(2);

//        kullanici sayfa altindaki pazarama logosunu gorur
            WebElement logo= driver.findElement(By.xpath("(//span[@name='pazarama-isbank-logo'])[2]"));
            actions.scrollToElement(logo);
            assertTrue(logo.isDisplayed());
        wait(3);

//        kullanici sayfa basindaki "Bize Ulaşın" linkini tiklar
        WebElement bizeUlasin= driver.findElement(By.xpath("(//a[@href='/hesabim/musteri-hizmetleri'])[1]"));
        actions.scrollToElement(bizeUlasin);
        webElementScreenShoot(bizeUlasin); //bize ulasin linkinin fotografini cektik
        //actions.click(); asagidaki click kodunun ayni gorevi yapar
        bizeUlasin.click();
        wait(3);


    }
}
