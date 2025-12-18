package navigation;

import base.BaseTests;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import page.AboutPage;

import java.time.Duration;

import static org.testng.Assert.assertEquals;

public class ViewAndScrollTest extends BaseTests {
    @Test
    public void testViewAndScrollAboutPage(){
        AboutPage aboutPage = homePage.aboutLink();
        aboutPage.viewAndScrollAboutPage();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(25));
       WebElement ActualApp = wait.until(ExpectedConditions.visibilityOfElementLocated(By.tagName("span")));
        assertEquals(ActualApp.getText(),"AskOmDch","incorrect website");

    }
}
