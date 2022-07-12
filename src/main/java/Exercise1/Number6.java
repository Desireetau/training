package Exercise1;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.checkerframework.checker.units.qual.A;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Number6 {
    private String baseurl;
    private WebDriver driver;

    @Before
    public void setup(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        baseurl = ("https://www.agiletestingalliance.org/");
        driver.manage().window().maximize();
    }

    @Test
    public void AgileTestingAlliance() throws InterruptedException {
        driver.get(baseurl);

        driver.findElement(By.linkText("Contact Us")).click();
        Thread.sleep(2000);
        driver.findElement(By.id("wpforms-12474-field_1")).sendKeys("Amos Sono");
        driver.findElement(By.name("wpforms[fields][2]")).sendKeys("sonoamos@gmail.com");
        driver.findElement(By.xpath("//*[@id=\"wpforms-12474-field_3\"]")).sendKeys("09955667");
        driver.findElement(By.xpath("//*[@id=\"wpforms-12474-field_4\"]")).sendKeys("This is a message");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id=\"recaptcha-anchor\"]/div[1]")).click();
        Thread.sleep(2000);

    }
    @After
    public void closeWindow(){
        driver.quit();
    }

}
