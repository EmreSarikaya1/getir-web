package pages;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import pageObjects.HomePageObjects;
import java.util.Optional;

public class HomePage extends HomePageObjects {

    public HomePage(WebDriver driver) {
        super(driver);
    }

    public HomePage closeCookie(){
        WebElement cookieArea = driver.findElement(COOKIE_AREA);
        cookieArea.findElements(COOKIE_BUTTONS).get(1)
                .click();
        return this;
    }

    public CategoryPage getCategory(){
        String categoryName = "Fit & Form";

       Optional<WebElement> category =  categories.stream()
               .filter(element -> element.getText().trim().equalsIgnoreCase(categoryName)).findFirst();
       category.get().click();

       return new CategoryPage(driver);
    }


}
