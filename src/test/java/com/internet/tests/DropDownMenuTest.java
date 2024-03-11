package com.internet.tests;

import com.internet.pages.DropDownPage;
import com.internet.pages.HomePage;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class DropDownMenuTest extends TestBase {

    @BeforeMethod
    public void precondition() {
        new HomePage(driver).selectDropDownMenu();
    }

    @Test
    public void selectOldStyleTest() {
        new DropDownPage(driver).selectDropDownOption("Option 1");
    }
}
