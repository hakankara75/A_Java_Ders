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

public class Selenium_JUnit_08_Assertions {

    WebDriver driver;

    @Before
    public void setUp()  {
        driver=new ChromeDriver();
        driver.manage().window().maximize();

        //kullanici youtube sayfasina gider
        driver.get("https://youtube.com");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

    }
    @After
    public void tearDown() throws InterruptedException {
        Thread.sleep(2000);
        driver.close();
    }

    @Test
    public void youtube() {

        String expectedTitle= "YouTube";

        //assertTrue() : dogru mu?
        WebElement youtubeIcon= driver.findElement(By.xpath("(//yt-icon[@id='logo-icon'])[1]"));
        assertTrue(youtubeIcon.isDisplayed()); //isDisplayed() gorunuyor mu?

        WebElement tumu= driver.findElement(By.xpath("(//yt-chip-cloud-chip-renderer[@chip-style='STYLE_HOME_FILTER'])[1]"));
        assertTrue(tumu.isEnabled());

        //isSelected() : secilicmi?
        driver.get("https://the-internet.herokuapp.com/checkboxes");

        WebElement text=driver.findElement(By.xpath("//h3[text()='Checkboxes']"));
        assertTrue(text.isEnabled());

        WebElement checkbox1=driver.findElement(By.xpath("(//input[@type='checkbox'])[1]"));
        assertFalse(checkbox1.isSelected()); //secili degil.

        WebElement checkbox2=driver.findElement(By.xpath("(//input[@type='checkbox'])[2]"));
        assertTrue(checkbox2.isSelected()); //secili mi?

        driver.navigate().back();
        String actualTitle=driver.getTitle();
        assertEquals(expectedTitle,actualTitle);

        String expectedMessage="Youtube Ana Sayfası";
        assertFalse(expectedMessage.equals(actualTitle));

    }
}
