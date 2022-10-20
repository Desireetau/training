package tPkg;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import util.ReadExcelFile;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

public class ddtExcel {

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

    @Test(dataProvider = "Testdata")
    public void  delegateRegistrationForm(String delName, String delLastName) throws InterruptedException {

        driver.get(baseurl);

        Forms.regPageElements.txtDelegateName(driver).clear();
        Forms.regPageElements.txtDelegateLastName(driver).clear();
        Thread.sleep(1000);

        Forms.regPageElements.txtDelegateName(driver).sendKeys(delName);
        Thread.sleep(3000);
        Forms.regPageElements.txtDelegateLastName(driver).sendKeys(delLastName);
        Thread.sleep(3000);
        Forms.regPageElements.txtLogin(driver).click();
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
    @DataProvider(name="Testdata")
    public Object[][] TestDataFeed() {

        ReadExcelFile configuration = new ReadExcelFile("src/main/resources/DelegatesDetails.xlsx");
        int rows = configuration.getRowCount(0);
        Object[][] delegate_Details = new Object[rows][2];
        for(int i=0;i<rows;i++)
        {
            delegate_Details[i][0] = configuration.getData(0, i, 0);
            delegate_Details[i][1] = configuration.getData(0, i, 1);
        }
        return delegate_Details;
    }
}
