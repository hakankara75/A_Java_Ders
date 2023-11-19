package Selenium_Topics;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import java.time.Duration;

public class Selenium_04_WebElements_Locators {

    @Test
    public void name() {
        WebDriver driver=new EdgeDriver();
        driver.manage().window().maximize();

        //kullanici "https://tr.aliexpress.com/" sitesine gider
        driver.get("https://tr.aliexpress.com/"); //istenen sayfaya gider
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15)); //SOFT sayfa yuklenene kadar asagidaki kodlari bekletir

        /*
        findElement() ile web page deki elementleri buluruz.
        By ile de locate aliriz.
        By.id
        By.cssSelector
        By.xpath
         */
        WebElement searchBox= driver.findElement(By.id("search-words")); //id





    }
}
