package pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import pageObjects.CategoryPageObjects;
import util.Reader;

import java.util.Comparator;

public class CategoryPage extends CategoryPageObjects {
    public CategoryPage(WebDriver driver) {
        super(driver);
    }
    Actions action = new Actions(driver);
    String browser = Reader.getProperty("driver");

    public static WebElement cheapestProduct;
    private static String cheapestPrice;

    public CategoryPage checkBasket() {
        boolean isTrue = "empty".equals(basketArea.getAttribute("data-testid"));
        Assert.assertTrue(isTrue);
        return this;
    }

    private WebElement findCheapestProduct(){
         cheapestProduct = products.stream()
                .min(Comparator.comparing(product -> {
                    String priceText = product.findElement(SPAN).getText();

                    double price = Double.parseDouble(
                            priceText.replace("₺", "").replace(",", ".").trim()
                    );
                    return price;
                }
                )).orElseThrow(() -> new RuntimeException("Hiç ürün bulunamadı!"));

         cheapestPrice = cheapestProduct.findElement(By.cssSelector("span")).getText();
        return cheapestProduct;
    }

    public static String getCheapestPrice() {
        return cheapestPrice;
    }

    public ProductDetail clickCheapestProduct() {

        getCheapestPrice();
        if (browser.equalsIgnoreCase("chrome")){

            action.moveToElement(findCheapestProduct()).perform();
            findCheapestProduct().click();
        }
        else {
            scrollToElement(findCheapestProduct());
            findCheapestProduct().click();
        }
        return new ProductDetail(driver);
    }
}
