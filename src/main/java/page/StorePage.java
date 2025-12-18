package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.interactions.Actions;

public class StorePage {

    WebDriver driver;

    private By sliderMin = By.className("from");
    private By sliderMax = By.className("to");
    private By filterButton = By.cssSelector("button[type='submit']");

    public StorePage(WebDriver driver) {
        this.driver = driver;
    }

    public void priceRangeSlider() {

        WebElement minHandle = driver.findElement(sliderMin);
        WebElement maxHandle = driver.findElement(sliderMax);


        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView(true);", minHandle);

        Actions actions = new Actions(driver);

        actions.clickAndHold(minHandle)
                .moveByOffset(20, 0)
                .release()
                .perform();

        actions.clickAndHold(maxHandle)
                .moveByOffset(-20, 0)
                .release()
                .perform();
        driver.findElement(filterButton).click();

    }
}
