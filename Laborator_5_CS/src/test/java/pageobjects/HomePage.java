package pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.io.IOException;

import static uitests.TestingLogo.getDriver;


public class HomePage {
    public WebElement getSearchField() {
        return searchField;
    }

    public WebElement getSearchButton() {
        return searchButton;
    }

    public WebElement getLogo() {
        return logo;
    }

    @FindBy(xpath = "//*[@id=\"js-search-input\"]")
    private WebElement searchField;
    @FindBy(xpath = "//*[@id=\"js-search-form\"]/fieldset/button[2]")
    private WebElement searchButton;
    @FindBy(xpath = "//*[@id=\"header\"]/div[2]/div/h1")
    private WebElement logo;

    public HomePage() throws IOException {
        PageFactory.initElements(getDriver(), this);
    }
}