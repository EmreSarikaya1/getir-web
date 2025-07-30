package managers;


import org.openqa.selenium.WebDriver;
import pages.HomePage;

public class PageManager {

    public WebDriver driver;
    private HomePage homePage;

    public PageManager(WebDriver driver) {

        this.driver = driver;
    }

    public HomePage homePage() {
        if (homePage == null) {
            homePage = new HomePage(driver);
        }
        return homePage;
    }

}
