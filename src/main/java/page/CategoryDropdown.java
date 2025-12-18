package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;
import java.util.stream.Collectors;

public class CategoryDropdown {
    private WebDriver driver;
    private By StoreDropdown = By.id("product_cat");
    public CategoryDropdown(WebDriver driver) {
        this.driver = driver;
    }
    public Select findDropdown(){

        return new Select(driver.findElement(StoreDropdown));
    }
    public void selectFromStoreDropdown(String productCategory){
        findDropdown().selectByVisibleText(productCategory);

    }

    public List<String> getSelectedProduct(){
        List<WebElement> selectedProducts = findDropdown().getAllSelectedOptions();
        return selectedProducts.stream().map(e->e.getText()).collect(Collectors.toList());

    }
}
