package pages;

import static org.junit.Assert.*;
import org.openqa.selenium.WebDriver;
import pageObjects.ProductDetailObjects;

public class ProductDetail extends ProductDetailObjects {

    public ProductDetail(WebDriver driver) {
        super(driver);
    }
    CategoryPage categoryPage = new CategoryPage(driver);

    String price = driver.findElement(PRICE_AREA).getText();
    String categoryPrice = CategoryPage.getCheapestPrice();

    public void checkPrices(){
        assertEquals(price, categoryPrice);
    }

}
