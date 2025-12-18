package shopNow;

import base.BaseTests;
import org.testng.annotations.Test;

public class ShopNowTest extends BaseTests {
    @Test
    public void shopNowTest(){
        var shopNowButton = homePage.clickShopNowbutton();
        shopNowButton.shopNowPageNumber();
    }
}
