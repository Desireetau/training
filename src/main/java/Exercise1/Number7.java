package Exercise1;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Number7 {
    public String baseurl;
    public WebDriver driver;

    @Before
    public void setup(){
        WebDriverManager.firefoxdriver().setup();
        driver = new FirefoxDriver();
        baseurl = ("https://www.google.com/");
        driver.manage().window().maximize();
    }

    @Test
    public void OpenGoogle() throws InterruptedException {
        driver.get(baseurl);

        /*StringString text = driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/img")).getText();
        System.out.println(text);
        String actualText = "Google";
        Assert.assertEquals(text,actualText);*/

        driver.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[1]/div/div[2]/input")).sendKeys("Yahoo");
        driver.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[3]/center/input[1]")).click();
        Thread.sleep(2000);
        driver.findElement(By.cssSelector("div.g:nth-child(20) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > a:nth-child(1) > h3:nth-child(2)")).click();

        Thread.sleep(3000);
    }
    @After
    public void closeWindow(){
        driver.quit();
    }
}
