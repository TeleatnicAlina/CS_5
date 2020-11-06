package gener;

import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

import java.io.IOException;
import java.time.Duration;

import static uitests.TestingLogo.getDriver;


public  class GenericActions {
    private static final long timeout = 20L;

    public static void click(WebElement webElement) throws IOException {
        waitElement(webElement);
        webElement.click();
    }
    public static void waitElement(WebElement webElement) throws IOException {
        Wait<WebDriver> wait = new FluentWait<>(getDriver())
                .withTimeout(Duration.ofSeconds(timeout))
                .pollingEvery(Duration.ofSeconds(1))
                .ignoring(NoSuchElementException.class);
        wait.until(ExpectedConditions.visibilityOf(webElement));
    }
    public static void enterValue(WebElement webElement, String value) throws IOException {
        waitElement(webElement);
        webElement.clear();
        webElement.sendKeys(value);
    }
}
