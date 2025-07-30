package constants;

import base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CategoryPageConstants extends BasePage {
    public CategoryPageConstants(WebDriver driver) {
        super(driver);
    }
    public By SPAN = By.cssSelector("span");
}
