package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SearchProduct {
    private WebDriver driver;
   private By SearchButton = By.cssSelector("button[value='Search']");
    public SearchProduct(WebDriver driver) {
        this.driver = driver;
    }
    public void clickSearchButton() {
        driver.findElement(SearchButton).click();
    }

}
