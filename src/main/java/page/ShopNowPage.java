package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ShopNowPage {
    private WebDriver driver;
    private By pagnation = By.className("page-numbers");
    public ShopNowPage(WebDriver driver){
        this.driver = driver;
    }
    public void shopNowPageNumber(){
        driver.findElement(pagnation).click();

    }
}
