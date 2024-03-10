package com.internet.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

public class WindowsPage extends BasePage {
    public WindowsPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//a[@href='/windows/new']")
    WebElement newTab;

    public WindowsPage switchToNextTab(int index) {
        click(newTab);

        List<String> tabs = new ArrayList<>(driver.getWindowHandles());
        driver.switchTo().window(tabs.get(index));
        return this;
    }

    @FindBy(xpath = "//h3[text()='New Window']")
    WebElement newWindow;

    public WindowsPage verifyNewTabText(String text) {
        Assert.assertTrue(shouldHaveText(newWindow, text, 15));
        return this;
    }

    public boolean shouldHaveText(WebElement element, String text, int index) {
        return new WebDriverWait(driver, Duration.ofSeconds(index))
                .until(ExpectedConditions.textToBePresentInElement(element, text));
    }

}
