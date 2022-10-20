package Exercise2;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.commons.io.FileUtils;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.io.IOException;

public class Number1 {

    private String baseurl;

    private WebDriver driver;

    @Before
    public void setup(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        baseurl = ("https://datamateinc.com/registration/");
        driver.manage().window().maximize();
    }
    @Test

    public void datamateRegPage() throws InterruptedException, IOException {
        driver.get(baseurl);

        driver.findElement(By.xpath("//*[@id='wpforms-3337-field_0']")).sendKeys("John");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id=\'wpforms-3337-field_0-last\']")).sendKeys("Doe");
        Thread.sleep(2000);

        takeScreenShot();
        Thread.sleep(2000);
    }


    public void takeScreenShot() throws IOException {
        TakesScreenshot scrnShot = (TakesScreenshot)driver;
        File srcFile = scrnShot.getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(srcFile,new File("./Screenshots/"+System.currentTimeMillis()+".png"));

    }

    @After
    public void closeBrowser(){
        driver.close();
    }
}
