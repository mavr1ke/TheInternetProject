package com.internet.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage {
    public HomePage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//a[@href='/javascript_alerts']")
    WebElement alerts;

    public AlertsPage selectJSAlerts() {
    clickWithJS(alerts, 0, 200);
    return new AlertsPage(driver);
    }

    @FindBy(xpath = "//a[@href='/windows']")
    WebElement windows;

    public WindowsPage selectMultipleWindows() {
        clickWithJS(windows, 0, 350);
        return new WindowsPage(driver);
    }

    @FindBy(xpath = "//a[@href='/dropdown']")
    WebElement dropDown;

    public DropDownPage selectDropDownMenu() {
        click(dropDown);
        return new DropDownPage(driver);
    }

    @FindBy(xpath = "//a[@href='/redirector']")
    WebElement redirectLink;

    public RedirectPage selectRedirectLink() {
        clickWithJS(redirectLink, 0, 300);
        return new RedirectPage(driver);
    }
}
