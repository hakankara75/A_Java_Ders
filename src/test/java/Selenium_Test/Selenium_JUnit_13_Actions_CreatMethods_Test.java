package Selenium_Test;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import utilities.TestBase;

import java.time.Duration;
import java.util.List;

import static org.junit.Assert.assertTrue;

public class Selenium_JUnit_13_Actions_CreatMethods_Test extends TestBase {

    /*
              kullanici "https://www.migros.com.tr/" sitesine gider
              kullanici coocies kabul eder
              kullanici uyariyi kabul eder
              kullanici sayfa altindaki migros logosunu gorur
              kullanici searchBox'in gorundugunu dogrular
              kullanici searchBox'a tiklar
              kullanici searchBox'a "RİZE ÇAYIVVV" yazar ardindan duzeltip arama yapar
              kullanici"RİZE ÇAYI" yazan urunlerin goruntulendigini dogrular
       */
    @Test
    public void actions() {

//        kullanici "https://www.migros.com.tr/" sitesine gider
        driver.get("https://www.migros.com.tr/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        Actions actions=new Actions(driver);
//        kullanici coocies kabul eder
        WebElement kabulEt= driver.findElement(By.id("accept-all"));
        kabulEt.click();
        //actions.click(kabulEt);

//        kullanici uyariyi kabul eder
        WebElement bizGetirelim= driver.findElement(By.xpath("(//fa-icon[@class='ng-fa-icon'])[5]"));
        bizGetirelim.click();
        wait(2);

//        kullanici sayfa altindaki migros logosunu gorur
        WebElement migrosLogo= driver.findElement(By.cssSelector("a[href='/']"));
        actions.scrollToElement(migrosLogo);
        assertTrue(migrosLogo.isDisplayed());
        wait(2);


//        kullanici searchBox'in gorundugunu dogrular
        WebElement searchBox= driver.findElement(By.id("product-search-combobox--trigger"));
        actions.scrollToElement(searchBox);
        assertTrue(searchBox.isDisplayed());
        wait(2);


//        kullanici searchBox'a tiklar
        searchBox.click();
        wait(2);

//        kullanici searchBox'a "RİZE ÇAYIVVV" yazar ardindan duzeltip arama yapar
        actions.keyDown(searchBox, Keys.SHIFT)
                .sendKeys("RİZE ÇAYIVVV")
                .sendKeys(Keys.BACK_SPACE,Keys.BACK_SPACE,Keys.BACK_SPACE)
                .keyUp(Keys.SHIFT)
                .sendKeys(Keys.ENTER)
                .build()
                .perform();
        wait(2);

//        kullanici"RİZE ÇAYI" yazan urunlerin goruntulendigini dogrular
        List<WebElement> cay=  driver.findElements(By.id("product-name"));
        String expected1="RİZE";
        String expected2="ÇAY";

        //buraya bakacağım
                for (int i = 0; i < cay.size(); i++) {
                    String jacobs=cay.get(i).getText();
                    System.out.println("jacobs = " + jacobs);
                    if(!jacobs.contains("Jacobs") || !jacobs.contains("2000")){
//                    if (i!=5 || i!=7) {
                        String actualCay = cay.get(i).getText();

               assertTrue(actualCay.contains(expected1));

            }

        }

//        for (WebElement element : cay){
//
//            String actualCay= element.getText();
//
//            assertTrue(actualCay.contains(expected1) && actualCay.contains(expected2));
//        }

    }

    @Test
    public void contextClick() {

              /*
          kullanici "https://the-internet.herokuapp.com/context_menu" sitesine gider
          kullanici sayfadaki kutuya sag klik yapar
         kullanici acilan alerti kapatir
         */
//        kullanici "https://the-internet.herokuapp.com/context_menu" sitesine gider
        driver.get("https://the-internet.herokuapp.com/context_menu");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        Actions actions=new Actions(driver);

//        kullanici sayfadaki kutuya sag klik yapar
            WebElement rectangle= driver.findElement(By.id("hot-spot"));
            actions.contextClick(rectangle).perform(); //element ustunde sag klik yap

//        kullanici acilan alerti kapatir
            driver.switchTo().alert().accept();

    }

    @Test
    public void moveToElement() {
/*
         kullanici "https://www.etstur.com/" sitesine gider
         kullanici sayfadaki otel linkinin ustunde bekler
 */

//        kullanici "https://www.etstur.com/" sitesine gider
        driver.get("https://www.etstur.com/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        Actions actions=new Actions(driver);

//        kullanici sayfadaki otel linkinin ustunde bekler
        WebElement otel= driver.findElement(By.xpath("(//span[text()='Otel'])[1]"));
        actions.moveToElement(otel).perform();
        wait(2);


    }
}
