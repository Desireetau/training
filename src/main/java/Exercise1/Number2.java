package Exercise1;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Number2 {
    private String baseurl;
    private WebDriver driver;

    @BeforeMethod
    public void setup(){
        WebDriverManager.firefoxdriver().setup();
        driver = new FirefoxDriver();
        baseurl = ("https://en.wikipedia.org/wiki/Main_Page");
        driver.manage().window().maximize();
    }

    @Test
    public void openWiki() throws InterruptedException {
        driver.get(baseurl);

        driver.findElement(By.id("searchInput")).sendKeys("Selenium");
        Thread.sleep(2000);
        driver.findElement(By.id("searchButton")).click();
        Thread.sleep(2000);
    }

    @AfterMethod
    public void closeWindow(){
        driver.quit();
    }

}
