package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginForm {
    private WebDriver driver;
    private By username = By.name("username");
    private By userPassword = By.name("password");
    private By loginButton = By.cssSelector("button[value='Log in']");
    private By rememberMe = By.id("rememberme");
    private By forgotPassword = By.linkText("Lost your password?");

    public LoginForm(WebDriver driver){
        this.driver = driver;
    }
    public void fillLoginForm(String name, String password){
        driver.findElement(username).sendKeys(name);
        driver.findElement(userPassword).sendKeys(password);
        WebElement box = driver.findElement(rememberMe);
        if(box.isEnabled()){
            box.click();

        }
    }
    public ForgotPasswordPage clickforgotPassword(){
        driver.findElement(forgotPassword).click();
        return new ForgotPasswordPage(driver);
    }
    public AccountDashboardPage clickLoginButton(){
        driver.findElement(loginButton).click();
        return new AccountDashboardPage(driver);
    }
}
