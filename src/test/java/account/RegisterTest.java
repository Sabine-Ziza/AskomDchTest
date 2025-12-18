package account;

import base.BaseTests;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import page.RegisterForm;

public class RegisterTest extends BaseTests {


    @Test
    public void clickRegisterButton(){
        RegisterForm accountPage = homePage.clickAccountLink();
        accountPage.fillRegisterForm("zazu","seranda@gmail.com","sabine1123");
        accountPage.clickRegisterButton();

    }


}
