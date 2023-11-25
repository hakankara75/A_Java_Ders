package Selenium_Test;

import org.junit.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Selenium_JUnit_06_Annotations_Tes {

    WebDriver driver;
    @BeforeClass
    public static void beforeClass() { //class member oldugu icin static yaptik

        System.out.println("BeforeClass calisti");
    }
    @AfterClass
    public static void afterClass() {//class member oldugu icin static yaptik

        System.out.println("AfterClass calisti");
    }
    @Before
    public void before(){
        driver=new ChromeDriver();
        driver.manage().window().maximize();


    }
    @After
    public void after(){
        driver.close();
    }
    @Test
    public void test() throws InterruptedException {
//        WebDriver driver=new ChromeDriver(); bu kisimlari artik @Before altinda yazacagiz
//        driver.manage().window().maximize();

        driver.get("https://www.evidea.com/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15)); //SOFT sayfa yuklenene kadar asagidaki kodlari bekletir
        //eger implicitlyWait koymazsak site yuklenemeden java kodlarimiz calisir ve locate aldigimiz element henuz yuklenmedi ise hata aliriz
        Thread.sleep(2000);

    }

    @Test
    public void test2() throws InterruptedException {
        driver.get("https://www.teknosa.com/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        Thread.sleep(2000);
    }
}
