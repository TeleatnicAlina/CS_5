package uitests;

import gener.AssertThatWrapper;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pageobjects.HomePage;

import java.io.IOException;

import static gener.GenericActions.*;
import static org.hamcrest.Matchers.is;


public class TestingLogo extends BaseTest {

    public static WebDriver driver;

    @Test
    public void logoTest() throws IOException {
        // Create an instance of the driver
        setUpDriver();
        driver = new ChromeDriver();
        driver.get(url);
        driver.manage().window().maximize();
        HomePage homePage = new HomePage();
        String objectToSearch = "computer";
        enterValue(homePage.getSearchField(), objectToSearch);
        click(homePage.getSearchButton());
        waitElement(homePage.getLogo());
        AssertThatWrapper.assertThat("999 header is displayed", homePage.getLogo().isDisplayed(), is(true));
       // driver.quit();
    }

    public static WebDriver getDriver() {
        return driver;
    }
}
