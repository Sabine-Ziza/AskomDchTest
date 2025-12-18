package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class WomenNavigationPage {
    private WebDriver driver;
    private By womenImageText = By.linkText("Anchor Bracelet");
    private By searchInput = By.id("woocommerce-product-search-field-0");
    public WomenNavigationPage(WebDriver driver) {

        this.driver = driver;
    }
    public void viewWomenProduct(){
        driver.findElement(womenImageText).click();

    }
    public SearchProduct textInSearchInput(String searchText){
        driver.findElement(searchInput).sendKeys(searchText);
        return  new SearchProduct(driver);
    }
}
