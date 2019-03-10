package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;
import pages.AccountsLoginPage;

import java.util.concurrent.TimeUnit;

public class TestAccountPage {

    public WebDriver driver;
    public final String URL = "https://accounts.google.com";

    @BeforeSuite
    public void setup () {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Mykola\\IdeaProjects\\TestMaven\\src\\test\\java\\resources\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
        driver.navigate().to(URL);
    }


    @Test
    public void testVerifyLoginAsCorrectUser () {
        String expectedResult = "Вход – Google Аккаунты";
        AccountsLoginPage page = new AccountsLoginPage(driver);
        page.setAccountNameIntoLoginField("iovets.mykola@pdffiller.team");
        page.clickSubmitButton();
        page.setPasswordIntoPasswordField("japygoon2019");
        page.clickNextPasswordButton();
        Assert.assertEquals(driver.getTitle(), expectedResult);
    }


}
