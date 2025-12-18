package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class CheckoutPage {
    private WebDriver driver;
    private By firstName = By.id("billing_first_name");
    private By lastName = By.id("billing_last_name");
    private By companyName = By.id("billing_company");
    private By address1 = By.id("billing_address_1");
    private By address2 = By.id("billing_address_2");
    private By city = By.id("billing_city");
    private By state = By.id("select2-billing_state-container");
    private By zipCode = By.id("billing_postcode");
    private By phone = By.id("billing_phone");
    private By email = By.id("billing_email");
    private By placeOrderButton = By.id("place_order");


    public CheckoutPage(WebDriver driver) {
        this.driver = driver;
    }
  public void  billingForm(String firstname,
                            String lastname,
                            String company,
                            String addressCode1,
                            String addressCode2,String cityName,
                            String zipCodeNum,String userPhone,
                            String userEmail){


        driver.findElement(firstName).sendKeys(firstname);
        driver.findElement(lastName).sendKeys(lastname);

      WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
      WebElement address = wait.until(
              ExpectedConditions.elementToBeClickable(companyName)
      );
      address.sendKeys(company);

      driver.findElement(address1).sendKeys(addressCode1);
      driver.findElement(address2).sendKeys(addressCode2);
      driver.findElement(city).sendKeys(cityName);
      driver.findElement(zipCode).sendKeys(zipCodeNum);
      driver.findElement(phone).sendKeys(userPhone);
      driver.findElement(email).sendKeys(userEmail);

  }
  public void placeOrder(){
    driver.findElement(placeOrderButton).click();
  }
}
