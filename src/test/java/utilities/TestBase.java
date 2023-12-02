package utilities;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class TestBase {
   protected static WebDriver driver;
    @Before
    public void setUp()  {
        driver=new ChromeDriver();
        driver.manage().window().maximize();

    }
    @After
    public void tearDown() throws InterruptedException {
        Thread.sleep(2000);
        driver.close();
    }

}
