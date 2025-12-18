package store;

import base.BaseTests;
import org.testng.annotations.Test;

public class StorePriceRangeTest extends BaseTests {
    @Test
    public void storePriceRangeTest(){
        var store = homePage.clickStoreLink();
        store.priceRangeSlider();

    }
}
