package Selenium_Test;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import static org.junit.Assert.*;

public class Selenium_01_Test {
    public static void main(String[] args) {
        WebDriver driver=new EdgeDriver();

        driver.get("https://www.tesbihkonagi.com/"); //istenen sayfaya gider

        String expectedTitle = "TESBİH KONAĞI";
        String expectedUrl="https://www.tesbihkonagi.com/";
        String expectedPageSource = driver.getPageSource();
        String expectedHandel= "FCDAAB8C6E3074B4E4793627B810D8C0";
        System.out.println("expectedHandel = " + expectedHandel);

        String  actualTitle= driver.getTitle();
        System.out.println("actualTitler = " + actualTitle);

        String  actualUrl=driver.getCurrentUrl();
        System.out.println("actualUrl = " + actualUrl);

        String actualPageSource = driver.getPageSource();

        String actualHandel=driver.getWindowHandle();
        System.out.println("actualHandel = " + actualHandel);

        Assert.assertEquals(expectedHandel,actualHandel);
         Assert.assertEquals(expectedTitle, actualTitle); //ikisi birbirine esit mi, ayni mi?
        Assert.assertEquals(expectedUrl, actualUrl);
        Assert.assertTrue(actualPageSource.contains("<meta property=\"og:site_name\" content=\"TESBİH KONAĞI \">"));

        driver.quit();

    }

}
