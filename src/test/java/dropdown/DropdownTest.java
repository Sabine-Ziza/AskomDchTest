package dropdown;

import base.BaseTests;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.time.Duration;

import static org.testng.Assert.assertEquals;

public class DropdownTest extends BaseTests {
    @Test
    public void testSelectedProduct(){
    var selectedOption = homePage.clickDropdown();
        selectedOption.getSelectedProduct();
        selectedOption.selectFromStoreDropdown("Men’s Shirts  (1)");
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        WebElement message = wait.until(
                ExpectedConditions.visibilityOfElementLocated(
                        By.cssSelector(".woocommerce-products-header__title")
                )
        );
        assertEquals(message.getText().trim(),"Men's Shirts", "incorrect message");


    }
}
