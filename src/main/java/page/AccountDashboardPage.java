package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AccountDashboardPage {
    private WebDriver driver;
    private By logoutLink = By.linkText("Logout");
    public AccountDashboardPage(WebDriver driver){
        this.driver = driver;
    }
    public void clickLogoutLink(){
        driver.findElement(logoutLink).click();
    }
}
