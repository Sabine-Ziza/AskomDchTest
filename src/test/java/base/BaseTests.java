package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import page.AddToCartPage;
import page.HomePage;
import page.MenNavigationPage;

public class BaseTests {
    protected WebDriver driver;
    protected HomePage homePage;
    protected MenNavigationPage menProductPage;
    protected AddToCartPage addToCartPage;
    @BeforeClass
    public void setUp(){
        System.setProperty("webDriver.chrome.driver", "resources/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://askomdch.com/");
        homePage = new HomePage(driver);
        menProductPage = new MenNavigationPage(driver);
        addToCartPage = new AddToCartPage(driver);

    }
    @AfterClass
    public void tearDown(){
//        driver.quit();
    }

}
