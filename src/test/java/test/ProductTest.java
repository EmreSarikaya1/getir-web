package test;


import base.BaseTest;
import org.junit.Test;


public class ProductTest extends BaseTest {

    /**
     * Case 1.0
     * verifyCheapestProductPrice
     *
     * @throws InterruptedException
     */
    @Test
    public void verifyCheapestProductPriceTest() throws InterruptedException {
        pages.homePage()
                .closeCookie()
                .getCategory()
                .checkBasket()
                .clickCheapestProduct()
                .checkPrices();
    }
}
