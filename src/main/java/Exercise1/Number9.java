package Exercise1;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Number9 {
    public String baseurl;
    public WebDriver driver;

    @BeforeTest
    public void setup(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        baseurl = ("https://the-internet.herokuapp.com/dynamic_loading");
        driver.manage().window().maximize();
    }
    @Test
    public void printText() throws InterruptedException {
        driver.get(baseurl);

        String getText = driver.findElement(By.xpath("//*[@id=\"content\"]/div")).getText();
        Thread.sleep(2000);
        System.out.println(getText);
    }
    @AfterMethod
    public void closeWindow(){
        driver.quit();
    }
}
