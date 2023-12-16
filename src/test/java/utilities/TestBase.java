package utilities;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import org.apache.commons.io.FileUtils;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;

import static org.junit.Assert.assertTrue;

public class TestBase {
   protected static WebDriver driver;
    protected static ExtentReports extentReports; //Raporlamayı başlatır
    protected static ExtentHtmlReporter extentHtmlReporter;//Raporu HTML formatında düzenler
    protected static ExtentTest extentTest;//Tüm test aşamalarında extentTest objesi ile bilgi ekleriz
    @Before
    public void setUp()  {
        driver=new ChromeDriver();
        driver.manage().window().maximize();


        //Extent Report icin burasi. Yukarida driver atandigi icin asagideki driver atamasini kapattim
//        driver = new ChromeDriver(new ChromeOptions().addArguments("--remote-allow-origins=*"));
//        driver.manage().window().maximize();
//        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        //Extent Report icin asagisi
        //----------------------------------------------------------------------------------------
        extentReports = new ExtentReports();
        String tarih = new SimpleDateFormat("_hh_mm_ss_ddMMyyyy").format(new Date());
        String dosyaYolu = "TestOutput/reports/extentReport_"+tarih+".html";
        extentHtmlReporter = new ExtentHtmlReporter(dosyaYolu);
        extentReports.attachReporter(extentHtmlReporter);
        //Raporda gözükmesini istediğimiz bilgiler için
        extentReports.setSystemInfo("Browser","Chrome");
        extentReports.setSystemInfo("Tester","Hakan");
        extentHtmlReporter.config().setDocumentTitle("Extent Report");
        extentHtmlReporter.config().setReportName("Smoke Test Raporu");
        extentTest=extentReports.createTest("ExtentTest","Test Raporu");

    }
    @After
    public void tearDown() throws InterruptedException {
        extentReports.flush();  //Extent Report'u olusturur ve kapatir
        Thread.sleep(2000);
        driver.close();
    }

    /**
     * Hard wait istenemeyen wait. Butun kodlari durdurur.
     * Gozle testi izleyebilmek icin koyduk. Otomasyon testi kosarken kaldirilmali.
     * @param saniye int cinsinden saniye olarak verilmeli
     */
    public static void wait(int saniye){
        try {
            Thread.sleep(saniye*1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    /**
     * bu metot verilen iki stringin birbirine esit oldugunu dogrular
     * @param str1 verilecek olan 1. string parametresidir
     * @param str2 verilecek olan 2. string parametresidir
     */
    public static void assertString(String str1, String str2){

        assertTrue(str1.equals(str2));
    }

    /**
     * alerti reddeder / cancel yapar
     */
    public static void dismissAlert(){
        driver.switchTo().alert().dismiss();
    }

    /**
     * alerti accept yapar
     */
    public static void acceptAlert(){
        driver.switchTo().alert().accept();
    }

    /**
     * alerte text gondermek icin kullaniriz
     * @param str alertin icine gonderilecek olan string dir.
     */
   public static void sendKeysToAlert(String str) {

        driver.switchTo().alert().sendKeys(str);
   }
    /**
     * WebElement ScreenShot alir
     * @param element screen shot alinacak elementin locate verilir
     */
   public static void webElementScreenShoot(WebElement element){
       String tarih = new SimpleDateFormat("_hh_mm_ss_ddMMyyyy").format(new Date());
       String dosyaYolu= "TestOutput/webElementScreenShoot"+tarih+".png";

       try {
           FileUtils.copyFile(element.getScreenshotAs(OutputType.FILE), new File(dosyaYolu));
       }catch (IOException e) {
           throw new RuntimeException(e);
       }

   }
    /**
     * tum sayfanin screenshoot ini alir
     */
    public static void tumSayfaScreenShoot(){

        String tarih = new SimpleDateFormat("_hh_mm_ss_ddMMyyyy").format(new Date());
        String dosyaYolu= "TestOutput/screenshoot"+tarih+".png";
        TakesScreenshot takesScreenshot= (TakesScreenshot) driver;

        try {
            FileUtils.copyFile(takesScreenshot.getScreenshotAs(OutputType.FILE), new File(dosyaYolu));
        }catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    /**
     * sayfada mause tekerinin bir donusu kadar asagi iner
     */
    public static void pageDown(){
        Actions actions=new Actions(driver);
        actions.sendKeys(Keys.PAGE_DOWN).perform();
    }

    /**
     * sayfada mause tekerinin bir donusu kadar asagi iner
     */
    public static void pageUp(){
        Actions actions=new Actions(driver);
        actions.sendKeys(Keys.PAGE_UP).perform();
    }

    /**
     * bu metot ile locate verilen element gorunene kadar scroll yapilir
     * @param element scroll yapilacak elementin locate idir.
     */
    public static void scrollToElementByActions(WebElement element){
        Actions actions=new Actions(driver);
        actions.scrollToElement(element).perform();
    }

    public static void contextClickByJavascript( WebElement element){
        JavascriptExecutor javascriptExecutor= (JavascriptExecutor) driver;
        String script= "var element = arguments[0];" +
                "var evt= new MouseEvent('contextmenu', { bubbles: true, cancelable: true, view:window});"+
                "element.dispatchEvent(evt);"+
                "window.open(element.href, '_blanck');";

        javascriptExecutor.executeScript(script, element );
    }

}
