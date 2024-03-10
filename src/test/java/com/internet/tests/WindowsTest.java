package com.internet.tests;

import com.internet.pages.HomePage;
import com.internet.pages.WindowsPage;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class WindowsTest extends TestBase {

    @BeforeMethod
    public void precondition() {
        new HomePage(driver).selectMultipleWindows();
    }

    @Test
    public void selectNewTabTest() {
        new WindowsPage(driver).switchToNextTab(1).verifyNewTabText("New Window");
    }
}
