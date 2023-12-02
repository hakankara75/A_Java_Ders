package Selenium_Test;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

import static org.junit.Assert.*;

public class Selenium_JUnit_09_CheckBox_RadioButton_Test {

    static WebDriver driver;

    @Before
    public void setUp()  {
        driver=new ChromeDriver();
        driver.manage().window().maximize();

        //kullanici demoqa sayfasina gider
        driver.get("https://demo.automationtesting.in/Register.html");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

    }
    @After
    public void tearDown() throws InterruptedException {
        Thread.sleep(2000);
        driver.close();
    }

    @Test
    public void checkRadio() {

        //kullanici male secer
        WebElement male= driver.findElement(By.xpath("(//input[@type='radio'])[1]"));
        assertFalse(male.isSelected());
        male.click();
        assertTrue(male.isSelected());

        //kullanici female secer
        WebElement female= driver.findElement(By.xpath("(//input[@type='radio'])[2]"));
        assertFalse(female.isSelected());
        female.click();
        assertTrue(female.isSelected());

        //kullanici cricket secer
        WebElement cricket= driver.findElement(By.id("checkbox1"));
        assertFalse(cricket.isSelected());
        cricket.click();
        assertTrue(cricket.isSelected());



        //kullanici movie secer
        WebElement movie= driver.findElement(By.id("checkbox2"));
        assertFalse(movie.isSelected());
        movie.click();
        assertTrue(movie.isSelected());







    }
}
