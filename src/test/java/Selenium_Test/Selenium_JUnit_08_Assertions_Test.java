package Selenium_Test;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class Selenium_JUnit_08_Assertions_Test {

    static WebDriver driver;

    @Before
    public void setUp()  {
        driver=new ChromeDriver();
        driver.manage().window().maximize();

    }
    @After
    public void tearDown() throws InterruptedException {
        Thread.sleep(2000);
        //driver.close();
    }

    @Test
    public void assertion1() {

        //kullanici teskru sayfasina gider
        driver.get("https://testkru.com/Elements/Buttons");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        WebElement disableButton= driver.findElement(By.id("disabledButton"));
        assertTrue(disableButton.isDisplayed());  //gorunuyor
        assertFalse(disableButton.isEnabled()); // aktif olmadigini dogrular

        WebElement leftClick=driver.findElement(By.id("leftClick"));
        assertTrue(leftClick.isEnabled()); //aktif oldugunu dogrular

        leftClick.click();
        assertFalse(leftClick.isEnabled()); // aktif olmadigini dogrular

    }

    @Test
    public void isEnable1() {

        //kullanici instagram kayit sayfasina gelir
        driver.get("https://instagram.com/accounts/emailsignup");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        //sign up butonunun pasif oldugunu dogrular
        WebElement signUp = driver.findElement(By.cssSelector("button[type='submit']"));
        assertFalse(signUp.isEnabled());

        //sirasi ile text kutularini dolduracak
        WebElement mail= driver.findElement(By.xpath("//input[@name='emailOrPhone']"));
        mail.sendKeys("hakandenememail@mail.com");

        WebElement fullname= driver.findElement(By.xpath("//input[@name='fullName']"));
        fullname.sendKeys("hakanHakan75hakan");

        WebElement username= driver.findElement(By.xpath("//input[@name='username']"));
        username.sendKeys("hakanHakan75hakan");

        WebElement password= driver.findElement(By.xpath("//input[@name='password']"));
        password.sendKeys("hakan123.Hakan");


        //sign up butonunun aktif oldugunu dogrular
        assertTrue(signUp.isEnabled());
    }

    @Test
    public void shadowRoot() {

        //Kullanici Teknosa sitesine gider
        driver.get("https://www.teknosa.com");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        WebElement reklam= driver.findElement(By.id("button-1580496494"));
        reklam.click();

        /*
        asagidaki kod ile shadow root yapisina sahip tag'in locatini searchContext objesine atiyoruz.
        Boylece elementin Shadow DOM soy agaci yapisina ulasiliyor
         */
      SearchContext searchContext= driver.findElement(By.xpath("//efilli-layout-dynamic"));


        /*
        asagidkai kod click islemi yapilmak istenen elementi bulmak icin searchContext icindeki
        Shadow Dom icine bir element locate vererek aranir ve bir webelemente atanir.
         */
        WebElement coociesAccept= searchContext.findElement(By.xpath("//div[@id='31cd32c1-b03e-4463-948d-1347667e64a4']"));
        coociesAccept.click();

    }

    @Test
    public void shadowRoot2() {
        //Kullanici Teknosa sitesine gider
        driver.get("https://www.teknosa.com");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        WebElement reklam= driver.findElement(By.id("button-1580496494"));
        reklam.click();

        WebElement searchContext= driver.findElement(By.xpath("//efilli-layout-dynamic"));
        searchContext.click();

        WebElement coociesAccept= driver.findElement(By.xpath("//div[@id='31cd32c1-b03e-4463-948d-1347667e64a4']"));
        coociesAccept.click();
    }

    @Test
    public void shadowRoot3() {
        //Kullanici Teknosa sitesine gider
        driver.get("https://www.teknosa.com");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        WebElement reklam= driver.findElement(By.id("button-1580496494"));
        reklam.click();

        clickJSElementWithJavaScript("document.querySelector(\"body > efilli-layout-dynamic\").shadowRoot.querySelector(\"#\\\\33 1cd32c1-b03e-4463-948d-1347667e64a4\")");


    }

    public static void clickJSElementWithJavaScript(String javascriptYolu) {
        JavascriptExecutor jse = (JavascriptExecutor) driver;
        WebElement webElement = (WebElement) jse.executeScript("return " + javascriptYolu + "");
        jse.executeScript("arguments[0].click();", webElement);

    }
}
