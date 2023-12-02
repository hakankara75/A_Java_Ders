package Selenium_Topics;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import utilities.TestBase;

import java.time.Duration;

public class Selenium_JUnit_10_DropDown_TestBase extends TestBase {
    /*
    DropDown icin elementin select tag'i olmali
    Childlarinda da options bulunmali
    Biz bu select tagli elementi Select Class ile handle ederiz.
     */

    /*
    TestBase: Sürekli kullanacağımız metotları ayrı bir classta bulunduracağız.
    Benzer işlevli kodlarin benzer package veya class altinda toplanmasina Page Object Method (POM) denir.

 extends TestBase ile child/parent iliskisi kuruldu.
 TestBase'deki driver'i kullanabilirim.
     */


    @Test
    public void name() {

        //kullanici koctas sitesine gider
        driver.get("https://www.koctas.com.tr/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        //kullanici konum tiklar
        WebElement konum= driver.findElement(By.xpath("(//div[@class='d-flex align-items-center'])[1]"));
        konum.click();

        //kullanici il dropdowndan secim yapar
        WebElement il= driver.findElement(By.id("locCity"));

        //select objesi olustur
        Select select= new Select(il);
        select.selectByIndex(1);





    }
}
