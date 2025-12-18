package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ForgotPasswordPage {
    private WebDriver driver;
    private By userEmail = By.id("user_login");
    private By resetButton = By.cssSelector("button[value='Reset password']");

    public ForgotPasswordPage(WebDriver driver) {
        this.driver = driver;
    }
    public void forgotPassword(String email){
        driver.findElement(userEmail).sendKeys((email));
        driver.findElement(resetButton).click();
    }
}
