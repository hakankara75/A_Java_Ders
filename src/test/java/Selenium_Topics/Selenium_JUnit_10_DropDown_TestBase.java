package Selenium_Topics;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import utilities.TestBase;

import javax.lang.model.util.Elements;
import javax.swing.text.Document;
import javax.swing.text.Element;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

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
    public void dropDown() {

        //kullanici koctas sitesine gider
        driver.get("https://www.koctas.com.tr/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        //kullanici konum tiklar
        WebElement konum = driver.findElement(By.xpath("(//div[@class='d-flex align-items-center'])[1]"));
        konum.click();

        //kullanici il dropdowndan secim yapar
        WebElement il = driver.findElement(By.id("locCity"));

        //select objesi olustur, select objesi icine parametre olarak locate verilir
        Select select = new Select(il);

        //indexe gore secim
        select.selectByIndex(2);

        String expectedizmir= driver.findElement(By.cssSelector("option[value='35']")).getText();
        System.out.println("izmir = " + expectedizmir);
//        List <WebElement> list= new ArrayList<>();
//        list = driver.findElements(By.cssSelector("select[id='locCity']"));
//        String actualizmir= list.get(2).getText();
//        System.out.println("actualizmir = " + actualizmir);

        wait(2);

        //value ya gore secim
        select.selectByValue("03");
        wait(2);

        //visible texte gore secim
        select.selectByVisibleText("ARDAHAN");
        wait(2);

    }

    @Test
    public void verifySelectedAndVisible() {

        //kullanici koctas sitesine gider
        driver.get("https://www.koctas.com.tr/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        //kullanici konum tiklar
        WebElement konum = driver.findElement(By.xpath("(//div[@class='d-flex align-items-center'])[1]"));
        konum.click();

        //kullanici il dropdowndan secim yapar
        WebElement il = driver.findElement(By.id("locCity"));

        //select objesi olustur, select objesi icine parametre olarak locate verilir
        Select select = new Select(il);

        //indexe gore secim yapar
        select.selectByIndex(10); //buraya verilen indexin bir fazlasini asagidaki locate verir. cunku value olmayan bir element de var.
        String expectedText= "ANTALYA";

        //sectigi ile gorunenin ayni oldugunu dogrular
        String actualText= driver.findElement(By.xpath("(//select[@id='locCity']//option)[11]")).getText();// yukaridaki indexin 1 fazlasi gelir
        System.out.println("actualText = " + actualText);
        assertEquals(expectedText, actualText);

        //isSelected() ile dogrulama
        WebElement secilen=driver.findElement(By.xpath("(//select[@id='locCity']//option)[2]")); //yukaridakinin 1 fazlasi olmazsa fail olur
        assertTrue(secilen.isSelected());
        }
    }
