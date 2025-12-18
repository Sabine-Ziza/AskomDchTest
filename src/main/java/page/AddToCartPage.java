package page;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class AddToCartPage {
    private WebDriver driver;
    private By viewLink = By.cssSelector(".button.wc-forward");
    private By addCartButton = By.cssSelector("form.cart button");
    private By productQuantity = By.xpath("//form[contains(@class,'cart')]//input[@type='number']");
    private By updateCartButton = By.cssSelector("button[name='update_cart']");
    private By proceedToCheckout = By.className("checkout-button");


    public AddToCartPage(WebDriver driver) {

        this.driver = driver;
    }

    public void clickCartButton() {
        driver.findElement(addCartButton).click();

    }

    public void clickViewLink() {
        driver.findElement(viewLink).click();
    }

    public void updateCart(int times) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement quantityField = wait.until(
                ExpectedConditions.visibilityOfElementLocated(productQuantity)

        );
        quantityField.click();
        quantityField.clear();
        for (int i = 0; i < times; i++) {
            quantityField.sendKeys(Keys.ARROW_UP);
        }
        driver.findElement(updateCartButton).click();
    }
    public CheckoutPage clickCheckoutButton(){
        driver.findElement(proceedToCheckout).click();
        return new CheckoutPage(driver);

    }
}


