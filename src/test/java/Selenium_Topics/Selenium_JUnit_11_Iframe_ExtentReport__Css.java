package Selenium_Topics;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utilities.TestBase;

import java.time.Duration;
import java.util.Set;

import static org.junit.Assert.*;

public class Selenium_JUnit_11_Iframe_ExtentReport__Css extends TestBase {


    @Test
    public void frame() {
        //Kullanici herokuapp sitesine gider
        extentTest.info("https://the-internet.herokuapp.com/iframe sitesine gidildi"); //extentTest objesi rapora cumle girmeye yarar
        driver.get("https://the-internet.herokuapp.com/iframe");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        //css index vererek locate alma
        WebElement format=driver.findElement(By.cssSelector("button[aria-haspopup='true']:nth-child(4)"));
        assertTrue(format.isDisplayed());
        format.click();
        extentTest.info("format butonunu clickledim");

        WebElement bold= driver.findElement(By.cssSelector("div[class='tox-collection__item-label']:nth-child(2)"));
        bold.click();
        extentTest.info("bold secenegini clickledim");



         //iframe locate ederim
         WebElement iframe= driver.findElement(By.id("mce_0_ifr"));

         //iframe locate ini switchTo icine parametre olarak verip frame icine gecerim
         driver.switchTo().frame(iframe);
        extentTest.info("iframe icine gecis yapildi");

        WebElement text= driver.findElement(By.cssSelector("body[id='tinymce']"));
        /*
        //css: tag (#) ve id value su
         //text= driver.findElement(By.cssSelector("body#tinymce"));

        //css: tag (.) ve class value
        // text= driver.findElement(By.cssSelector("body.mce-content-body "));
         */

        //text kutusundaki yazilari sildim
        text.clear();
        extentTest.info("text kutusundaki yazilari sildim");

         text.sendKeys("Merhaba bu yazıyı Hakan yazdı.");
        extentTest.info("text kutusuna yazi gonderildi");

        //fram den cikmanin ilk yolu
       driver.switchTo().parentFrame();

        //frame den cikmanin 2. yolu
        // driver.switchTo().defaultContent();

        //powered by elemental selenium yazisinin gorunur oldugunu dogrular
        WebElement powerdBy= driver.findElement(By.xpath("(//a[@target='_blank'])[2]"));
        assertTrue(powerdBy.isDisplayed());
        extentTest.info("powered by elemental selenium yazisinin gorunur oldugu dogrulandi");



    }
}
