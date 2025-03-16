package N11Tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.asserts.SoftAssert;

import java.time.Duration;

import static java.sql.DriverManager.getDriver;

public class BaseTest {

    // WebDriver driver;
    private static final ThreadLocal<WebDriver> driver = new ThreadLocal<>();
    SoftAssert softAssert;

    @BeforeClass
    @Parameters({"browser"})
    public void setup(String browser){
        switch (browser.toLowerCase()) {
            case "chrome":
                WebDriverManager.chromedriver().setup();
                driver.set(new ChromeDriver());
                break;
            case "firefox":
                WebDriverManager.firefoxdriver().setup();
                driver.set(new FirefoxDriver());
                break;
            default:
                throw new IllegalArgumentException("Invalid browser: " + browser + " | please use 'chrome' or 'firefox'");
        }

        getDriver().manage().window().maximize();
        getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        softAssert = new SoftAssert();

    }
    public static WebDriver getDriver() {
        return driver.get();
    }





    @AfterClass
    public void tearDown(){
        if (getDriver()!=null){
            getDriver().quit();
            driver.remove();
        }

        softAssert.assertAll("All tests are asserted");

    }
}
