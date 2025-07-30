package pageObjects;

import constants.HomePageConstants;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class HomePageObjects extends HomePageConstants {
    public HomePageObjects(WebDriver driver) {
        super(driver);
    }

    @FindBy(css = ".sc-b6b4847f-7.sc-6df7862-0.bMivQF.fPNFno")
    public WebElement categoryArea;

    @FindBy(css = ".sc-b6b4847f-7.sc-6df7862-0.bMivQF.fPNFno .sc-6df7862-1.gKLoSF")
    public List<WebElement> categories;



}
