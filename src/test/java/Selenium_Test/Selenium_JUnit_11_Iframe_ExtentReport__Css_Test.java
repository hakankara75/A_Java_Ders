package Selenium_Test;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utilities.TestBase;

import java.time.Duration;
import java.util.Set;

import static org.junit.Assert.*;

public class Selenium_JUnit_11_Iframe_ExtentReport__Css_Test extends TestBase {


    @Test
    public void iframe() {
         /*
        Kullanici herokuapp sitesine gider
        LEFT kelimesinin gorunur oldugunu dogrular
         */

        extentTest.info("Test basladi");
        //Kullanici herokuapp sitesine gider
        driver.get("https://the-internet.herokuapp.com/nested_frames");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        extentTest.info("herokuapp sitesine gidildi");

        //LEFT kelimesinin gorunur oldugunu dogrular
        WebElement mainFrame= driver.findElement(By.cssSelector("frame[name='frame-top']"));
        //1. yol
        driver.switchTo().frame(mainFrame);

        //2.yol
        //driver.switchTo().frame(0);

        extentTest.info("1. frame'e girildi");

        WebElement secondFrame= driver.findElement(By.xpath("//frame[@name='frame-left']"));
         driver.switchTo().frame(secondFrame);
        //driver.switchTo().frame(0);


        WebElement left= driver.findElement(By.xpath("//body[normalize-space()='LEFT']"));
        assertTrue(left.isDisplayed());

        extentTest.info("left kelimesinin gorundugu dogrulandi");


        extentTest.info("Test pass oldu.");

    }
}
