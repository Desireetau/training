package tPkg;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenDatamate {

    public static void main (String[] args) throws InterruptedException{

        WebDriver driver = new ChromeDriver();
        WebDriverManager.chromedriver().setup();
        driver.get("https://www.google.com/");
        driver.manage().window().maximize();
        Thread.sleep(3000);



        //driver.quit();
    }
}
