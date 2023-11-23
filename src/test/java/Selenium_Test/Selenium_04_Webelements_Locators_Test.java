package Selenium_Test;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import java.time.Duration;

public class Selenium_04_Webelements_Locators_Test {
    @Test
    public void locatesTest() {

        WebDriver driver=new EdgeDriver();

        //amazon sitesine gidilir
        driver.get("https://www.amazon.com"); //istenen sayfaya gider
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15)); //hem sayfa elementlerinin yuklenmesi icin hem de captcha handel etmek icin JAVA kodlarini durdurur

        //arama kutusunun locate alir

        WebElement searchBox= driver.findElement(By.id("twotabsearchtextbox")); //id'nin value'sunu aldik

        WebElement xpathSearchBox= driver.findElement(By.xpath("//input[@dir='auto']"));

        WebElement english= driver.findElement(By.cssSelector("span[class='icp-nav-link-inner']"));

        //---------------------------------------------------------------------------------------------
        WebElement nameSearchBox= driver.findElement(By.name("site-search")); //name'in value'sunu aldik

        WebElement classLayoutToolbar= driver.findElement(By.className("layoutToolbarPadding")); //class'in value'sunu aldik

        WebElement tagNameHeader= driver.findElement(By.tagName("header"));

        WebElement linkTextEnglish=driver.findElement(By.linkText("EN"));

        WebElement partialLinkText=driver.findElement(By.partialLinkText("sign in"));





    }
}
