package account;

import base.BaseTests;
import org.openqa.selenium.By;
import org.testng.annotations.Test;
import page.AccountDashboardPage;
import page.ForgotPasswordPage;
import page.LoginForm;

import static org.testng.Assert.assertEquals;

public class LoginFormTest extends BaseTests {
    @Test
    public void loginFormTest(){

        LoginForm loginForm = new LoginForm(driver);
        homePage.clickAccountLink();
        loginForm.fillLoginForm("zezu","sabine1123");
        loginForm.clickLoginButton();
        String actualTitle = driver.findElement(By.tagName("p")).getText();
        assertEquals(actualTitle, "Hello zazu (not zazu? Log out)", "incorrect message");

    }


}
