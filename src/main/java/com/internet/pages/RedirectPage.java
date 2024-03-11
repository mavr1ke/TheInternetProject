package com.internet.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RedirectPage extends BasePage {
    public RedirectPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(id = "redirect")
    WebElement redirect;

    public RedirectPage clickTriggerRedirect() {
        click(redirect);
        return this;
    }
}
