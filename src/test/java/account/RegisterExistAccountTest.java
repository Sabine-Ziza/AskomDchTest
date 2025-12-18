package account;

import base.BaseTests;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import page.RegisterForm;

public class RegisterExistAccountTest extends BaseTests {
    private By errorMessage = By.cssSelector("ul.woocommerce-error li");
    @Test
    public void testRegisterUserWithExistIngAccount(){
        RegisterForm accountPage = homePage.clickAccountLink();
        accountPage.fillRegisterForm("zazu","sarinda@gmail.com","sabine1123");
        accountPage.clickRegisterButton();
        String actualMessage = driver.findElement(errorMessage).getText();
        Assert.assertEquals(actualMessage, "Error: An account is already registered with your email address. Please log in.",
                "incorrect error message");
    }
}
