package tPkg;

import io.github.bonigarcia.wdm.WebDriverManager;
import io.qameta.allure.Story;
import org.junit.After;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class handlingPopups {

    private String baseurl;

    private WebDriver driver;

    @BeforeMethod
    @Story("Pop Ups")
    public void setup(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        baseurl = ("http://the-internet.herokuapp.com");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
    }

    @Test
    public void openHerokuApp() throws InterruptedException {
        driver.get(baseurl + "/javascript_alerts");

        System.out.println("Opening the inter page");
        Thread.sleep(3000);

        WebElement jsAlert = driver.findElement(By.xpath("//*[@id=\"content\"]/div/ul/li[1]/button"));
        WebElement jsConfirm = driver.findElement(By.xpath("//*[@id=\"content\"]/div/ul/li[2]/button"));
        WebElement jsPrompt = driver.findElement(By.xpath("//*[@id=\"content\"]/div/ul/li[3]/button"));
        Thread.sleep(3000);

        jsAlert.click();
        driver.switchTo().alert().accept();
        Thread.sleep(3000);

        jsConfirm.click();
        System.out.println(driver.switchTo().alert().getText());
        driver.switchTo().alert().dismiss();
        Thread.sleep(3000);

        jsPrompt.click();
        driver.switchTo().alert().sendKeys("Selenium");
        Thread.sleep(4000);

        driver.switchTo().alert().accept();
        Thread.sleep(4000);
    }

    @After
    public void closeBrowser(){
        driver.quit();
    }


}
