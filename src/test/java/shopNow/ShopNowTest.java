package shopNow;

import base.BaseTests;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class ShopNowTest extends BaseTests {
    @Test
    public void shopNowTest(){
        var shopNowButton = homePage.clickShopNowbutton();
        shopNowButton.shopNowPageNumber();
        String ActualMessage = driver.findElement(By.className("page-title")).getText();
        assertEquals(ActualMessage, "Store","wrong page title");
    }
}
