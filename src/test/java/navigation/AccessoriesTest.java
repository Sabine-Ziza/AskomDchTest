package navigation;

import base.BaseTests;
import org.testng.annotations.Test;
import page.AccessoriesPage;

import static org.openqa.selenium.By.linkText;
import static org.testng.Assert.assertEquals;

public class AccessoriesTest extends BaseTests {
    @Test
    public void testAccessoriesViewProduct(){
        AccessoriesPage accessoriesPage = homePage.accesoriesLink();
        accessoriesPage.viewAccessoriesProduct();
        String product = driver.findElement(linkText("Accessories")).getText();
        assertEquals(product, "Accessories","wrong product");
    }
}
