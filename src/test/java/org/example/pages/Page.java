package org.example.pages;


import org.openqa.selenium.WebElement;

public abstract class Page {
    protected void textReplay(WebElement textInput, String str) {
        textInput.click();
        textInput.clear();
        textInput.sendKeys(str);
        textInput.submit();
    }
}
