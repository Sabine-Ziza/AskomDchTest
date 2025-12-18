package checkout;

import base.BaseTests;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import page.AddToCartPage;
import page.MenNavigationPage;

import java.time.Duration;

import static org.testng.Assert.assertEquals;

public class CheckoutPageTest extends BaseTests {
    @Test
    public void testMenViewProductAndCheckout(){
        MenNavigationPage menProduct = homePage.menLink();
        menProduct.viewProduct();
        AddToCartPage addToCartPage = new AddToCartPage(driver);
        addToCartPage.clickCartButton();
        addToCartPage.clickViewLink();
        addToCartPage.updateCart(3);
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement actualMessage = wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("woocommerce-message")));
        assertEquals(actualMessage.getText(),"Cart updated.", "incorrect message");

    }
}
