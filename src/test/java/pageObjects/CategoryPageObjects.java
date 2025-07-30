package pageObjects;


import constants.CategoryPageConstants;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


import java.util.List;

public class CategoryPageObjects extends CategoryPageConstants {
    public CategoryPageObjects(WebDriver driver) {
        super(driver);
    }

    @FindBy(css = ".style__Wrapper-sc-__sc-1s8nvon-0.lgsEij")
    public WebElement basketArea;
    @FindBy(css = ".sc-c016d6c1-0.euLQar")
    public List<WebElement> products;





}
