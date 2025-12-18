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
        loginForm.fillLoginForm("zazu","sabine1123");
        loginForm.clickLoginButton();

    }
    @Test
    public void logoutTest(){
        LoginForm loginForm = new LoginForm(driver);
        homePage.clickAccountLink();
        loginForm.fillLoginForm("zazu","sabine1123");
        loginForm.clickLoginButton();
        AccountDashboardPage dashboardPage = new AccountDashboardPage(driver);
        dashboardPage.clickLogoutLink();
    }
    @Test
    public void resetPasswordTest(){
        LoginForm loginForm = new LoginForm(driver);
        homePage.clickAccountLink();
        loginForm.fillLoginForm("zazu","sabine1123");
        loginForm.clickforgotPassword();
        ForgotPasswordPage forgotPasswordPage = new ForgotPasswordPage(driver);
        forgotPasswordPage.forgotPassword("saranda@gmail.com");
        String resetMessage = driver.findElement(By.className("woocommerce-message")).getText();
        assertEquals(resetMessage,"Password reset email has been sent.", "incorrect message" );
    }

}
