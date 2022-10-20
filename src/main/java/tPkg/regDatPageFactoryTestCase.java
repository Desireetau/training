package tPkg;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

public class regDatPageFactoryTestCase {
    public static void main (String[] args) throws InterruptedException{

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://datamate.co.za/");
        driver.manage().window().maximize();

        Forms.regPageFactoryElements pf = PageFactory.initElements(driver, Forms.regPageFactoryElements.class);

        //Click training
        pf.tpfTraining.click();
        Thread.sleep(1000);

        pf.tpfDatabase.click();
        Thread.sleep(1000);
        
        pf.tpfRegistrationBtn.click();
        Thread.sleep(1000);
        pf.tpfTitle.sendKeys("Mr");
        pf.tpfDelegateName.sendKeys("Fikile");
        pf.tpfDelegateLastName.sendKeys("Modu");


        /*WebElement selectCountry = driver.findElement(By.xpath("//*[@id='wpforms-3337-field_15-container']/div"));
        Select country = new Select(selectCountry);
        country.selectByValue("Algeria");
        Thread.sleep(5000);*/

        String Title =driver.findElement(By.xpath("//*[@id='wpforms-3337-field_20-container']/label")).getText();
        System.out.println(Title);

        driver.quit();
    }
}
