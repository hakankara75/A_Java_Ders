package Selenium_Test;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Selenium_JUnit_08_Assertions_Test {

    WebDriver driver;

    @Before
    public void setUp()  {
        driver=new ChromeDriver();
        driver.manage().window().maximize();

        //kullanici youtube sayfasina gider
        driver.get("https://www.teknosa.com");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

    }
    @After
    public void tearDown() throws InterruptedException {
        Thread.sleep(2000);
        //driver.close();
    }

    @Test
    public void name() {



    }
}
