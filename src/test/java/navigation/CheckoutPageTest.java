package navigation;

import base.BaseTests;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import page.AddToCartPage;
import page.CheckoutPage;
import page.MenNavigationPage;

import java.time.Duration;

import static org.testng.Assert.assertEquals;

public class CheckoutPageTest extends BaseTests {
    @Test
    public void testCheckoutPage(){
        MenNavigationPage menProduct = homePage.menLink();
        menProduct.viewProduct();
        AddToCartPage addToCartPage = new AddToCartPage(driver);
        addToCartPage.clickCartButton();
        addToCartPage.clickViewLink();
        CheckoutPage checkoutPage = addToCartPage.clickCheckoutButton();


        checkoutPage.billingForm("sabine",
                "ingabire",
                "mukamira",
                "kk423",
                "456",
                "kigali",
                "12345",
                "078936275",
                "sarunda@gmail.com");
        checkoutPage.placeOrder();

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        WebElement actualMessage = wait.until(ExpectedConditions.visibilityOfElementLocated(By.tagName("p")));
        assertEquals(actualMessage.getText(),"Thank you. Your order has been received.","incorrect message");

    }
}
