package navigation;

import base.BaseTests;
import org.openqa.selenium.By;
import org.testng.annotations.Test;
import page.WomenNavigationPage;

import static org.testng.Assert.assertEquals;

public class TestWomenViewProduct extends BaseTests {
    @Test
    public void testWomenViewProduct(){
        WomenNavigationPage womenProduct = homePage.womenLink();
        womenProduct.viewWomenProduct();
        String ActualMessage = driver.findElement(By.className("product_title")).getText();
        assertEquals(ActualMessage,"Anchor Bracelet","incorrect website");
    }
}
