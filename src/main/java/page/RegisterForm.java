package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RegisterForm {
    private WebDriver driver;
    private By  userName = By.id("reg_username");
    private By UserEmail = By.id("reg_email");
    private By UserPassword = By.id("reg_password");
    private By registerButton = By.cssSelector("form.woocommerce-form-register button.woocommerce-Button");

    public RegisterForm(WebDriver driver){

        this.driver = driver;
    }
    public void fillRegisterForm(String username, String email, String password){

        driver.findElement(userName).sendKeys(username);
        driver.findElement(UserEmail).sendKeys(email);
        driver.findElement(UserPassword).sendKeys(password);
    }
    public void clickRegisterButton(){
        driver.findElement(registerButton).click();

    }

}
