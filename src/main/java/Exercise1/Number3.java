package Exercise1;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Number3 {
    private String baseurl;

    private WebDriver driver;

    @Before
    public void setup(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        baseurl = ("https://datamate.co.za/");
        driver.manage().window().maximize();
    }

    @Test
    public void openDatamateChrome() throws InterruptedException {
        driver.get(baseurl);

        driver.findElement(By.xpath("//*[@id=\"primary-menu\"]/li[2]/a/span/span")).click();
        Thread.sleep(2000);
    }

    @After
    public void closeWindow(){
        driver.quit();
    }

}
