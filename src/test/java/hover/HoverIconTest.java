package hover;

import base.BaseTests;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.time.Duration;

import static org.testng.Assert.assertEquals;

public class HoverIconTest extends BaseTests {
    @Test

    public void HoverIconTest() {

        homePage.hoverCartIcon();

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        WebElement message = wait.until(
                ExpectedConditions.visibilityOfElementLocated(
                        By.cssSelector(".widget_shopping_cart_content")
                )
        );

        String actualText = message.getText();
        assertEquals(actualText, "No products in the cart.", "incorrect text");
    }

}
