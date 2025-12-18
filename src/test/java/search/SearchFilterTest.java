package search;

import base.BaseTests;
import org.testng.annotations.Test;
import page.SearchProduct;
import page.WomenNavigationPage;

public class SearchFilterTest extends BaseTests {
    @Test
    public void searchFilter() {
        WomenNavigationPage womenProduct = homePage.womenLink();
        womenProduct.textInSearchInput("Bra");
        SearchProduct searchProduct = new SearchProduct(driver);
        searchProduct.clickSearchButton();
    }
}
