package dropdown;

import base.BaseTests;
import org.testng.annotations.Test;

public class DropdownTest extends BaseTests {
    @Test
    public void testSelectedProduct(){
    var selectedOption = homePage.clickDropdown();
        selectedOption.getSelectedProduct();
        selectedOption.selectFromStoreDropdown("Men’s Shirts  (1)");


    }
}
