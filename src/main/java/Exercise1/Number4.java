package Exercise1;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Number4 {

    private String baseurl;
    private WebDriver driver;

    @BeforeTest
    public void setup(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        baseurl = ("http://executeautomation.com/demosite/Login.html");
        driver.manage().window().maximize();
    }

    @Test
    public void openSite() throws InterruptedException {
        driver.get(baseurl);

        driver.findElement(By.xpath("//*[@id=\"userName\"]/p[1]/input")).sendKeys("Test");
        driver.findElement(By.xpath("//*[@id=\"userName\"]/p[2]/input")).sendKeys("Test");
        driver.findElement(By.xpath("//*[@id=\"userName\"]/p[3]/input")).click();
        Thread.sleep(1000);

        //Fill in fake data
        WebElement selectTitle = driver.findElement(By.xpath("//*[@id=\"TitleId\"]"));
        Select title = new Select(selectTitle);
        title.selectByVisibleText("Mr.");

        driver.findElement(By.id("Initial")).sendKeys("TM");
        driver.findElement(By.id("FirstName")).sendKeys("Thomas");
        driver.findElement(By.id("MiddleName")).sendKeys("Mona");
        driver.findElement(By.xpath("//*[@id=\"details\"]/table/tbody/tr[5]/td[2]/input[2]")).click();
        driver.findElement(By.xpath("//*[@id=\"details\"]/table/tbody/tr[6]/td[2]/input[2]")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//*[@id=\"details\"]/table/tbody/tr[7]/td/input")).click();

        Thread.sleep(3000);
        driver.findElement(By.xpath("//*[@id=\"cssmenu\"]/ul/li[1]/a/span")).click();
    }
    @AfterMethod
    public void closeWindow(){
        driver.quit();
    }


}
