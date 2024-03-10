package com.internet.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class AlertsPage extends BasePage {
    public AlertsPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//button[@onclick='jsAlert()']")
    WebElement alertButton;

    public AlertsPage clickForAlert() {
        click(alertButton);
        driver.switchTo().alert().accept();
        return this;
    }

    @FindBy(id = "result")
    WebElement result;

    public AlertsPage verifyResult(String text) {
        Assert.assertTrue(result.getText().contains(text));
        return this;
    }

    @FindBy(xpath = "//button[@onclick='jsConfirm()']")
    WebElement cancel;

    public AlertsPage selectResult(String text) {
        click(cancel);
        if (text != null && text.equals("OK")) {
            driver.switchTo().alert().accept();
        } else if (text != null && text.equals("Cancel")) {
            driver.switchTo().alert().dismiss();
        }
        return this;
    }

    @FindBy(xpath = "//button[@onclick='jsPrompt()']")
    WebElement prompt;

    public AlertsPage sendMessageToAlert(String text) {
        click(prompt);
        if (text != null) {
            driver.switchTo().alert().sendKeys(text);
            driver.switchTo().alert().accept();
        }
        return this;
    }
}
