package test;


import base.BaseTest;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class ProductTest extends BaseTest {

    @Parameterized.Parameter
    public String category;

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][] {
                {"Fit & Form"}
        });
    }
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
                .getCategory(category)
                .checkBasket()
                .clickCheapestProduct()
                .checkPrices();
    }
}
