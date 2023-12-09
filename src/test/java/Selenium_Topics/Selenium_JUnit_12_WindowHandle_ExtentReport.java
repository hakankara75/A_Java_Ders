package Selenium_Topics;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utilities.TestBase;

import java.time.Duration;
import java.util.Set;

import static org.junit.Assert.assertTrue;

public class Selenium_JUnit_12_WindowHandle_ExtentReport extends TestBase{

    @Test
    public void windowHandle() {

        extentTest.info("Test basladi");
        extentTest.info(" https://demoqa.com/browser-windows sitesine gidildi"); //extentTest objesi rapora cumle girmeye yarar
        driver.get("https://demoqa.com/browser-windows");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        extentTest.info("https://demoqa.com/browser-windows sitesine gidildi");

        String firstPage= driver.getWindowHandle();

        //new tab butonuna basilir
        WebElement newTab= driver.findElement(By.id("tabButton"));
        newTab.click();

        extentTest.info("new tab butonuna basidi");

        //This is a sample page yazisinin gorundugunu dogrula
        Set<String> windowHandels= driver.getWindowHandles();

       for (String handle : windowHandels){
           if(!handle.equals(firstPage)){
               driver.switchTo().window(handle);
           }
       }
        //String  second=driver.getWindowHandle();


        WebElement sampleText= driver.findElement(By.id("sampleHeading"));
        assertTrue(sampleText.isDisplayed());
        extentTest.info("This is a sample page yazisinin gorundugunu dogrulandi");

        //kullanici ilk pencerey doner
        driver.switchTo().window(firstPage);
        String expected = "DEMOQA";
        String actual = driver.getTitle();
        assertTrue(expected.equals(actual));
        extentTest.info("kullanici ilk pencerey dondu");
       // driver.switchTo().window(second);

        extentTest.info("Test bitti");









    }
}
