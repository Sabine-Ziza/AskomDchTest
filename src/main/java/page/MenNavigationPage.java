package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MenNavigationPage {
    private WebDriver driver;
    private By menImageText = By.linkText("Basic Blue Jeans");


    public MenNavigationPage(WebDriver driver) {

        this.driver = driver;
    }
    public AddToCartPage viewProduct(){
    driver.findElement(menImageText).click();
        return new AddToCartPage(driver);
    }


}
