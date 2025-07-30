package constants;

import base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePageConstants extends BasePage {
    public HomePageConstants(WebDriver driver) {
        super(driver);
    }
    public By COOKIE_BUTTONS = By.cssSelector(".style__Wrapper-sc-__sc-6ivys6-1.BpZxo.sc-927cf94c-1.dTumXG");
    public By COOKIE_AREA = By.cssSelector(".sc-927cf94c-0.kpliOC");

}
