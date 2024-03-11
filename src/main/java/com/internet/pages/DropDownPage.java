package com.internet.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class DropDownPage extends BasePage {
    public DropDownPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(id = "dropdown")
    WebElement dropDown;

    public DropDownPage selectDropDownOption(String option) {
        Select select = new Select(dropDown);
        select.selectByVisibleText(option);

        List<WebElement> options = select.getOptions();
        for (int i = 0; i < options.size(); i++) {
            System.out.println(options.get(i).getText());
            System.out.println("***************************");
        }
        System.out.println(select.getFirstSelectedOption().getText() + " is selected");
        return this;
    }
}
