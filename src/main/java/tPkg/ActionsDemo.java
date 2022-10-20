package tPkg;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.commons.io.FileUtils;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.io.File;
import java.io.IOException;

public class ActionsDemo {
    private String baseurl;
    private WebDriver driver;
    @Before
    public void setup(){
        WebDriverManager.chromedriver().setup();
         driver = new ChromeDriver();
        baseurl = ("https://www.google.com/");
        driver.manage().window().maximize();

    }

    @Test
    public void OpebDataM() throws InterruptedException, IOException {

        driver.get(baseurl);
        Actions action =new Actions(driver);
        WebElement element = driver.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[1]/div/div[2]/input"));

        action.doubleClick(element).perform();
        Thread.sleep(3000);

        takeScreen();

        action.sendKeys("wikipedia").perform();
        action.sendKeys(Keys.ENTER).perform();

        for (int i=0;i<12;i++){

            action.sendKeys(Keys.TAB).perform();

        }

        //Calling the screenshot method to take screenshot and places it in the folder that was created in the takeScreenshot method
        takeScreen();
        Thread.sleep(3000);


    }

    public void takeScreen() throws IOException {
        TakesScreenshot scrShot = (TakesScreenshot)driver;
        File srcFile = scrShot.getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(srcFile, new File("./Screenshots/"+System.currentTimeMillis()+".png"));


    }

    @After
    public void closeBrowser(){
        driver.quit();
    }
}
