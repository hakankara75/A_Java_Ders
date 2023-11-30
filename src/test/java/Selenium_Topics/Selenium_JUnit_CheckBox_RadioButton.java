package Selenium_Topics;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class Selenium_JUnit_CheckBox_RadioButton {


    WebDriver driver;

    @Before
    public void setUp()  {
        driver=new ChromeDriver();
        driver.manage().window().maximize();

        //kullanici demoqa sayfasina gider
        driver.get("https://demoqa.com/checkbox");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

    }
    @After
    public void tearDown() throws InterruptedException {
        Thread.sleep(2000);
        driver.close();
    }

    @Test
    public void checkBox_RadioButton() throws InterruptedException {

        WebElement parent= driver.findElement(By.xpath("//label[@for='tree-node-home']"));
        if(!parent.isSelected()) { //secili degilse
            Thread.sleep(2000);
            parent.click();
        }

        if(parent.isSelected()) { //secili ise
            Thread.sleep(2000);
            parent.click();
        }






    }
}
