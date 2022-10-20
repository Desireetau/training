package tPkg;

import io.github.bonigarcia.wdm.WebDriverManager;
import io.qameta.allure.Story;
import org.apache.commons.io.FileUtils;
import org.junit.After;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

public class arraysDDThard {

    private String baseurl;

    private WebDriver driver;


    @BeforeMethod
    public void setup(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        baseurl = ("https://datamateinc.com/registration");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
    }

    @DataProvider(name = "Delegates")
    public Object [][] DelegatesDetails(){

        Object [][] DelePersonalInf = new Object[4][2];

        DelePersonalInf[0][0] ="Fikile";
        DelePersonalInf[0][1] ="fikile1";


        DelePersonalInf[1][0] ="Piet";
        DelePersonalInf[1][1] ="Piet1";


        DelePersonalInf[2][0] ="Nkosi";
        DelePersonalInf[2][1] ="Nkosi1";


        DelePersonalInf[3][0] ="Tim";
        DelePersonalInf[3][0] ="Tim1";
        return DelePersonalInf;
    }

    @Test(dataProvider = "Delegates")
    public void  delegateRegistrationForm(String delName, String delLastName) throws InterruptedException {

        driver.get(baseurl);

        Forms.regPageElements.txtDelegateName(driver).clear();
        Forms.regPageElements.txtDelegateLastName(driver).clear();
        Thread.sleep(1000);

        Forms.regPageElements.txtDelegateName(driver).sendKeys(delName);
        Forms.regPageElements.txtDelegateLastName(driver).sendKeys(delLastName);
        Thread.sleep(3000);
    }

    @AfterMethod
    public void closeBrowser(ITestResult result) throws IOException {

        //takes a screenshot for a failure, creates a directory first
        if (result.getStatus() == ITestResult.FAILURE ){
            TakesScreenshot ts = (TakesScreenshot)driver;
            File srcFile = ts.getScreenshotAs(OutputType.FILE);
            FileUtils.copyFile(srcFile, new File("./ScreenShots/"+ System.currentTimeMillis()+".png"));


        }

        else
        //takes a screenshot for a pass, creates a directory first.
        {
            File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
            String currentDir = System.getProperty("user.dir");
            FileUtils.copyFile(scrFile, new File(currentDir + ".\\TestResults\\"+System.currentTimeMillis()+".png"));

        }
        driver.close();
    }

}
