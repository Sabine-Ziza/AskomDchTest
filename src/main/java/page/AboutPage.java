package page;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class AboutPage {

    private WebDriver driver;
    private WebDriverWait wait;
    private By youtubeIcon = By.cssSelector("a[href*='youtube.com']");

    public AboutPage(WebDriver driver){
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    public void viewAndScrollAboutPage(){

        WebElement youtubeElement = wait.until(ExpectedConditions.visibilityOfElementLocated(youtubeIcon));

        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", youtubeElement);

        wait.until(ExpectedConditions.elementToBeClickable(youtubeElement)).click();
    }
}
