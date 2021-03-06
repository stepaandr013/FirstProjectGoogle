package org.example.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class GooglePage extends Page {

    @FindBy(name = "q")
    private WebElement searchButton;

    @FindBy(xpath = "//div[@id=\"rso\"]/div")
    private List<WebElement> searchResult;

    public static final By SEARCH_RESULT_LOCATOR = By.xpath("//div[@id=\"rso\"]/div");

    public GooglePage(WebDriver driver) {
        super(driver);
    }

    public WebElement getSearchButton() {
        return searchButton;
    }

    public List<WebElement> getSearchResult() {
        return searchResult;
    }

    public void performSearch(String searchString){
        textReplay(searchButton, searchString);
        searchButton.submit();
    }

}
