package Exercise2;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Number2 {
    private String baseurl;
    private WebDriver driver;

    @Before
    public void setup(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        baseurl = ("https://www.wikipedia.org/");
        driver.manage().window().maximize();
    }
    @Test
    public void searchMandela(){
        driver.get(baseurl);

        driver.findElement(By.xpath("//*[@id=\'searchInput\']")).sendKeys("Nelson Mandela");
        driver.findElement(By.xpath("//*[@id=\"search-form\"]/fieldset/button/i")).click();

        WebElement names = driver.findElement(By.xpath("//*[@id=\"mw-content-text\"]/div[1]/p[2]/b"));



    }
}
