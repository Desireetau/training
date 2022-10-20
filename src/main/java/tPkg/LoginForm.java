package tPkg;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import util.ReadExcelFile;

import java.time.Duration;

public class LoginForm {

    private String baseurl;

    private WebDriver driver;


    @BeforeMethod
    public void setup(){
        WebDriverManager.chromedriver().setup();
        /*ChromeOptions option = new ChromeOptions();
        option.setHeadless(true);*/
        driver = new ChromeDriver();
        baseurl = ("https://demosite.executeautomation.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
    }
    @Test(dataProvider="UserNames")
    public  void  Logins (String Username, String Passwrd) throws InterruptedException {

        driver.get(baseurl);
        Forms.regPageElements.txtUserName(driver).clear();
        Forms.regPageElements.txtPassword(driver).clear();
        Thread.sleep(1000);

        Forms.regPageElements.txtUserName(driver).sendKeys(Username);
        Forms.regPageElements.txtPassword(driver).sendKeys(Passwrd);
        Thread.sleep(3000);
    }

    @DataProvider(name = "UserNames")
        public Object[][] TestDataFeed() {

            ReadExcelFile configuration = new ReadExcelFile("src/main/resources/LoginDetails.xlsx");
            int rows = configuration.getRowCount(0);
            Object[][] LoginDetails = new Object[rows][2];
            for(int i=0;i<rows;i++)
            {
                LoginDetails[i][0] = configuration.getData(0, i, 0);
                LoginDetails[i][1] = configuration.getData(0, i, 1);
            }
            return LoginDetails;
        }

    @AfterMethod
    public void  TearDown(){
        driver.close();
    }

}
