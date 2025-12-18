package account;

import base.BaseTests;
import org.testng.annotations.Test;
import page.AccountDashboardPage;
import page.LoginForm;

public class LogoutTest extends BaseTests {
    @Test
    public void logoutTest(){
        LoginForm loginForm = new LoginForm(driver);
        homePage.clickAccountLink();
        loginForm.fillLoginForm("zazu","sabine1123");
        loginForm.clickLoginButton();
        AccountDashboardPage dashboardPage = new AccountDashboardPage(driver);
        dashboardPage.clickLogoutLink();
    }
}
