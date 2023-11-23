package Selenium_Topics;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import java.time.Duration;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class Selenium_04_WebElements_Locators {
    WebDriver driver;
    @Test
    public void name() {
        driver=new EdgeDriver();
        driver.manage().window().maximize();

        //kullanici "https://tr.aliexpress.com/" sitesine gider
        driver.get("https://tr.aliexpress.com/"); //istenen sayfaya gider
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15)); //SOFT sayfa yuklenene kadar asagidaki kodlari bekletir

        /*
        findElement() ile web page deki elementleri buluruz.
        By ile de locate aliriz.
        By.id   ==> unique degeri vardir. varsa id tercih ederiz once
        By.cssSelector ==> hizlidir
        By.xpath  ==> yavastir

        HTML kod yapisi
        tag: <input
        attribute: id=
        value:"search-words"
         */

        //1-By.id
        WebElement searchBox= driver.findElement(By.id("search-words")); //id
        assertTrue(searchBox.isDisplayed());
        // By.id alinirken sadece id'nin value'su alinir

        //2-By.xpath
        WebElement bildirimlereIzinVer= driver.findElement(By.xpath("//div[@class=' _1-SOk']"));
        bildirimlereIzinVer.click();
        //assertFalse(bildirimlereIzinVer.isDisplayed()); StaleElementReferenceException verir. Kapatinca bildirimi HTML kodlari gizlendigi icin bu hatayi verir
        /*By.xpath alinirken // olacak
        tag olacak (bu ornekte div)
        [ parantez olacak
        @ isareti olacak
        attribute olacak (bu ornekte class)
        ' tirnak olacak
        attribute'un value'su gelecek (bu ornekte  _1-SOk)
        ' tirnak olacak
        [ parantez olacak
         */

        //3-By.cssSelector
        WebElement uygulamaIndir= driver.findElement(By.cssSelector("b[class='down-load-app--longStr--1OJgHfl']"));
        assertTrue(uygulamaIndir.isDisplayed());
        /*
        By.cssSelector alirken
         tag olacak (bu ornekte b)
          [ parantez olacak
           attribute olacak (bu ornekte class)
           ' tirnak olacak
        attribute'un value'su gelecek (bu ornekte  down-load-app--longStr--1OJgHfl)
        ' tirnak olacak
        [ parantez olacak
         */
       // oncesinde  driver= new ChromeDriver(); seklinde olup, degeri vardir. yani doludur
        driver.quit(); //driver null olur
    }

    @Test
    public void locates() {
        driver= new ChromeDriver();
        driver.manage().window().maximize();

        //http://www.automationpractice.pl/index.php sitesine git
        driver.get("http://www.automationpractice.pl/index.php");

        //4-By.name
        WebElement searchBox= driver.findElement(By.name("search_query"));
        // By.name alinirken sadece name'in value'su alinir

        //5-By.className
        WebElement className= driver.findElement(By.className("search_query"));
        // By.className alinirken sadece className'in value'su alinir

        //6- By.tagName
        WebElement tagNameHeader= driver.findElement(By.tagName("header"));
        // By.tagName alinirken sadece tagName alinir

        //7- By.linkText
        WebElement contactUs=driver.findElement(By.linkText("Contact us"));
        //By.linkText alinirken link olan elementin texti alinir

        driver.navigate().to("https://amazon.com");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        //8- By.linkText
        WebElement partialLinkText=driver.findElement(By.partialLinkText("Customer Serv"));

        driver.quit();
    }
}
