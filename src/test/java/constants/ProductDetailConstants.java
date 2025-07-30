package constants;

import base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ProductDetailConstants extends BasePage {
    public ProductDetailConstants(WebDriver driver) {
        super(driver);
    }
    public By PRICE_AREA = By.cssSelector(".style__Text-sc-__sc-1nwjacj-0.iwTTHJ.sc-4e247a28-8.dKpOVg");
}
