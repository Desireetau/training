package Exercise1;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class number10 {
    private String baseurl;
    private WebDriver driver;

    @Before
    public void setup(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        baseurl = ("https://en.wikipedia.org/wiki/Main_Page");
        driver.manage().window().maximize();
    }
    @Test
    public void searchBlackPanther() throws InterruptedException {
        driver.get(baseurl);

        driver.findElement(By.id("searchInput")).sendKeys("Black Panther");
        Thread.sleep(2000);

        driver.findElement(By.id("searchButton")).click();
        Thread.sleep(2000);
    }
   /* @After
    public void closeWindow(){
        driver.quit();
    }*/

}
