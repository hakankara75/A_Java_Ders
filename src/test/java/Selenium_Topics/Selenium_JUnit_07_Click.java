package Selenium_Topics;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

import static org.junit.Assert.*;

public class Selenium_JUnit_07_Click {

    WebDriver driver;
    @Before
    public void setup(){
        driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.decathlon.com.tr");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

    }

    @After
    public void tearDown() throws InterruptedException {
        Thread.sleep(2000);
        driver.close();
    }

    @Test
    public void decathlon() throws InterruptedException {
        //Coocies ciktigi icin 37. satirda ElementClickInterceptedException hatasi gerceklesti. coocies handel edilecek once
        WebElement coocies= driver.findElement(By.id("didomi-notice-agree-button"));
        coocies.click();

        //ElementClickInterceptedException hatasi gerceklesti. Once coocies kapatilmali ki click() yapilabilsin.
        WebElement bizeUlasin=driver.findElement(By.xpath("(//a[@class='vtmn-navbar_link'])[1]"));
        bizeUlasin.click();

        String expectedUrl="https://www.decathlon.com.tr/help/app/home"; //manuel
        String actualUrl= driver.getCurrentUrl(); //otomasyon
        assertEquals(expectedUrl, actualUrl);
        Thread.sleep(2000);

        driver.navigate().back();

        WebElement magazaBul=driver.findElement(By.xpath("(//a[@class='vtmn-navbar_link'])[2]"));
        magazaBul.click();

        String expectedTitle="Decathlon Türkiye Mağazaları";
        String actualTitle=driver.getTitle();
        assertTrue(expectedTitle.equals(actualTitle));
        Thread.sleep(2000);

        driver.navigate().back();

        WebElement hesabim=driver.findElement(By.xpath("(//a[@class='vtmn-navbar_link'])[3]"));
        hesabim.click();

        WebElement hesabimSayfasi= driver.findElement(By.cssSelector("h3[class='vtmn-typo_title-3']"));
        assertTrue(hesabimSayfasi.isDisplayed());
        Thread.sleep(2000);

        driver.navigate().back();

        WebElement sepetim=driver.findElement(By.xpath("(//a[@class='vtmn-navbar_link'])[4]"));
        sepetim.click();

        String expectedPageText="Sepetim";
        String actualPageText=driver.findElement(By.xpath("//h2[text()='Sepetim']")).getText(); //elementteki texti verir
        assertEquals(expectedPageText, actualPageText);
        Thread.sleep(2000);

        driver.navigate().back();


    }
}
