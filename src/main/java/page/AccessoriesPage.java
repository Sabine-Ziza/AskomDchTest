package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AccessoriesPage {
    private WebDriver driver;
    private By accessoriesImageText = By.linkText("Boho Bangle Bracelet");
    public AccessoriesPage(WebDriver driver) {

        this.driver = driver;
    }
    public void viewAccessoriesProduct(){
        driver.findElement(accessoriesImageText).click();

    }
}
