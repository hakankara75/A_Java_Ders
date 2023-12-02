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

public class Selenium_JUnit_09_CheckBox_RadioButton {


    static WebDriver driver;

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

        //checkBox
        driver.get("https://www.pazarama.com/bilgisayar-bilesenleri-k-K04044");
        WebElement kategori= driver.findElement(By.xpath("(//h3[@class='accordion__title flex justify-between items-center'])[1]"));
        kategori.click();

        WebElement anakart= driver.findElement(By.xpath("(//input[@class='form-input-checkbox'])[1]"));
        visibleWait(anakart, 15);
        assertFalse(anakart.isSelected());
        anakart.click();

    }

    @Test
    public void radio() {
        //RadioButton
        driver.get("https://demoqa.com/radio-button");
        WebElement yesRadio= driver.findElement(By.cssSelector("label[for='yesRadio']"));
        WebElement impressive=driver.findElement(By.cssSelector("label[for='impressiveRadio']"));

        //yes radio click yapilir impressive radio secili olmadigi dogrulanir
        yesRadio.click();
        assertFalse(impressive.isSelected());

        //impressive radio click yapilir yes. radio secili olmadigi dogrulanir
        impressive.click();
        assertFalse(yesRadio.isSelected());

        //noRadio secilemiyor
        WebElement noRadio = driver.findElement(By.cssSelector("label[for='noRadio']"));
        if(!noRadio.isSelected()){
            noRadio.click();
        }


    }

    public static void visibleWait(WebElement element, int sayi){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(sayi));
        wait.until(ExpectedConditions.visibilityOf(element));
    }
}
