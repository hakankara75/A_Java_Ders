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

    @Test
    public void iframe2() {

        extentTest.info("Test basladi");
        //kullanici testkru sitesine gider

        driver.get(" https://testkru.com/Interactions/Frames");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        extentTest.info("testkru sitesine gidildi");

        //parent frame yazisinin oldugunu dogrular
        //1. yol index ile
        driver.switchTo().frame(1);
        extentTest.info("parent frame gecis yapildi");

        String expected="Parent frame";
        String actual = driver.findElement(By.xpath("//h2[text()='Parent frame']")).getText();
        assertEquals(expected, actual);
        extentTest.info("parent frame yazisinin oldugu dogrulandi");
        extentTest.info("Test bitti");
            }

    @Test
    public void iframe3() {
        //2.yol locate ile
        extentTest.info("Test basladi");

        //kullanici testkru sitesine gider

        driver.get(" https://testkru.com/Interactions/Frames");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        extentTest.info("testkru sitesine gidildi");

        WebElement parentFrame= driver.findElement(By.xpath("//iframe[@id='frame2']"));
        driver.switchTo().frame(parentFrame);
        extentTest.info("parent frame gecis yapildi");

        String expected="Parent frame";
        String actual = driver.findElement(By.xpath("//h2[text()='Parent frame']")).getText();
        assertEquals(expected, actual);
        extentTest.info("parent frame yazisinin oldugu dogrulandi");

        //child frame yazisinin gorunur oldugunu dogrular
        WebElement childFrame= driver.findElement(By.xpath("//iframe[@srcdoc='<h3>Child frame</h3>']"));
        driver.switchTo().frame(childFrame);
        WebElement child = driver.findElement(By.xpath("//h3[text()='Child frame']"));
        assertTrue(child.isDisplayed());
        extentTest.info("child frame yazisinin gorunur oldugunu dogrulandi");
        extentTest.info("Test bitti");
    }
}
