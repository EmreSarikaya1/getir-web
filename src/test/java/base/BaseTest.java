package base;

import io.github.bonigarcia.wdm.WebDriverManager;
import managers.PageManager;
import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.rules.TestWatcher;
import org.junit.runner.Description;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import util.Reader;
import util.ScreenshotUtil;
import java.time.Duration;


public class BaseTest {
    protected WebDriver driver;
    protected PageManager pages;

    @Rule
    public TestWatcher watchman = new TestWatcher() {

        protected void failed(Throwable e, Description description) {
            ScreenshotUtil.takeScreenshot(driver, description.getMethodName());
        }
    };

    @Before
    public void setUp() {

        String browser = Reader.getProperty("driver");

        if (browser.equalsIgnoreCase("firefox")){
            WebDriverManager.firefoxdriver().setup();
            driver = new FirefoxDriver();
        }
        else if (browser.equalsIgnoreCase("chrome")){
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();
        }


        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();
        driver.get("https://getir.com");

        pages = new PageManager(driver);
    }

    @After
    public void tearDown() {
        ScreenshotUtil.takeScreenshot(driver, "testProduct");
        if (driver != null) {
            driver.quit();
        }
    }




}
