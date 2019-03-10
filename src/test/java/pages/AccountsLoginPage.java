package pages;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AccountsLoginPage {

    private WebDriver driver;

    public AccountsLoginPage(WebDriver driver) {
        this.driver = driver;
    }

    private By loginNameField = By.id("identifierId");
    private By nextButton = By.xpath("//div[@class='U26fgb O0WRkf zZhnYe e3Duub C0oVfc nDKKZc DL0QTb']");
    private By passwordInput = By.xpath("//input[@name='password']");
    private By nextButtonPassword = By.id("passwordNext");

    public void setAccountNameIntoLoginField (String loginName) {
        driver.findElement(loginNameField).sendKeys(loginName);
    }

    public void clickSubmitButton () {
        driver.findElement(nextButton).click();
    }

    public void setPasswordIntoPasswordField (String passwordValue) {
        driver.findElement(passwordInput).sendKeys(passwordValue);
    }

    public void clickNextPasswordButton () {
        driver.findElement(nextButtonPassword).click();
    }
}
