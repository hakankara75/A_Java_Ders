package Selenium_Test;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utilities.TestBase;

import java.time.Duration;
import java.util.Set;

import static org.junit.Assert.*;

public class Selenium_JUnit_12_WindowHandle_ExtentReport_Test extends TestBase {

    @Test
    public void windowHandle() {
        //kullanici demoqa sitesine gider
        extentTest.info("Test basladi");
        extentTest.info(" https://demoqa.com/browser-windows sitesine gidildi");
        driver.get("https://demoqa.com/browser-windows");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        extentTest.info("https://demoqa.com/browser-windows sitesine gidildi");

        //kullanici sayfa handle alir
        String firstPage= driver.getWindowHandle();

        //new tab butonuna basilir
        WebElement newTab= driver.findElement(By.id("tabButton"));
        newTab.click();

        extentTest.info("new tab butonuna basidi");

        //This is a sample page yazisinin gorundugunu dogrula
        Set<String> windowHandels= driver.getWindowHandles(); //2 pencerenini handle degeri alindi
        for (String handle : windowHandels){
            if(!handle.equals(firstPage)){
                driver.switchTo().window(handle); //2. pencereye gecildi
            }
        }
        String secondPage= driver.getWindowHandle(); //2. pencere degeri

        WebElement sampleText= driver.findElement(By.id("sampleHeading"));
        assertTrue(sampleText.isDisplayed());
        extentTest.info("This is a sample page yazisinin gorundugunu dogrulandi");

        //kullanici ilk pencereye doner
        driver.switchTo().window(firstPage);
        extentTest.info("kullanici ilk pencereye dondu");

        //new window butonuna basar
        WebElement newWindow= driver.findElement(By.id("windowButton"));
        newWindow.click();
        extentTest.info("new window butonuna basti");

        //yeni pencereye gecip handle degerini alir
        windowHandels= driver.getWindowHandles(); //3 pencerenini handle degeri alindi
        for (String handle : windowHandels){
            if(!handle.equals(firstPage) || !handle.equals(secondPage)){
                driver.switchTo().window(handle); //3. pencereye gecildi
            }
        }
        extentTest.info("3. pencereye gecildi");
        String third= driver.getWindowHandle(); //3. pencere degeri alindi

        //This is a sample page texti dogrulandi
        String exp= "This is a sample page";

        String act= driver.findElement(By.id("sampleHeading")).getText();
        assertEquals(exp,act);
        extentTest.info("This is a sample page texti dogrulandi");

        //ilk pencerey donulur
        driver.switchTo().window(firstPage);
        extentTest.info("ilk pencerey donuldu");

        //new window message butonuna basilir
        WebElement newMessage = driver.findElement(By.id("messageWindowButton"));
        newMessage.click();
        extentTest.info("new window message butonuna basilir");

        //yeni pencerenin handle degerini yazdirir
        windowHandels= driver.getWindowHandles(); //4 pencerenini handle degeri alindi
        for (String handle : windowHandels){
            if(!handle.equals(firstPage) || !handle.equals(secondPage) || handle.equals(third)){
                driver.switchTo().window(handle); //3. pencereye gecildi
            }
        }














    }
}
