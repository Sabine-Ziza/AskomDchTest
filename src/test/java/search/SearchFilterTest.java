package search;

import base.BaseTests;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import page.SearchProduct;
import page.WomenNavigationPage;

import java.time.Duration;

import static org.testng.Assert.assertEquals;

public class SearchFilterTest extends BaseTests {


    @Test
    public void searchFilter() {
        WomenNavigationPage womenProduct = homePage.womenLink();
        womenProduct.textInSearchInput("Bra");

        SearchProduct searchProduct = new SearchProduct(driver);
        searchProduct.clickSearchButton();

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        String actualMessage = wait
                .until(ExpectedConditions.visibilityOfElementLocated(By.className("page-title")))
                .getText();

        assertEquals(actualMessage, "Search results: “Bra”", "incorrect product title");
    }

}
