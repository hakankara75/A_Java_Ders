package Selenium_Test;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import utilities.TestBase;

import java.time.Duration;

public class Selenium_JUnit_10_DropDown_TestBase_Alert_POM_Test extends TestBase {
    @Test
    public void alert() {
        /*
        alertler:
        1- sayfa ustunden acilir
        2- locate alinamaz
         */

        //kullanici letcode sitesine gider
        driver.get("https://letcode.in/waits");

        //kullanici simple alert butonuna basar
        WebElement simpleAlert = driver.findElement(By.id("accept"));
        simpleAlert.click();

        WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(6));
        wait.until(ExpectedConditions.alertIsPresent()); //alert gorunene kadar bekleme kodu

        String expectedText= "Finally I'm here, just to say Hi :)";
        String actualText= driver.switchTo().alert().getText();

        //  driver.switchTo().alert().accept();
       acceptAlert();  //bu da yukaridaki kod ile ayni isi yapar. TestBase classta metot olarak yaptik, oradan cagirdik

        //TestBase classtan metot kullandim
        assertString(expectedText,actualText);

    }

    @Test
    public void dropDown() {

        //Kullanici automationtesting sitesine gider
        driver.get("https://demo.automationtesting.in/Register.html");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        //skills dropdowndan indexe gore secim yapar
        WebElement skills= driver.findElement(By.xpath("(//select[@type='text'])[1]"));

        //select objesi olustur, icine locate ata
        Select select=new Select(skills);

        //indexe gore secim yapar
        select.selectByIndex(3);

        //date of birth drop down gorebilmek icin scroll yapar
        WebElement password= driver.findElement(By.id("secondpassword"));
        Actions actions=new Actions(driver);
        actions.scrollToElement(password);


        //date of birth den value ya gore secim yapar
        WebElement date= driver.findElement(By.xpath("(//select[@type='text'])[3]"));
        select=new Select(date);
        select.selectByValue("1921");
    }
}
