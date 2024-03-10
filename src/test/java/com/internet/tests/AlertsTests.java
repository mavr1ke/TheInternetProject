package com.internet.tests;

import com.internet.pages.AlertsPage;
import com.internet.pages.HomePage;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AlertsTests extends TestBase {

    @BeforeMethod void precondition() {
        new HomePage(driver).selectJSAlerts();
    }

    @Test
    public void clickForAlertTest() {
        new AlertsPage(driver).clickForAlert().verifyResult("You successfully clicked an alert");
    }

    @Test
    public void selectResultTest() {
        new AlertsPage(driver).selectResult("Cancel").verifyResult("Cancel");
    }

    @Test
    public void sendMessageToAlertTest() {
        new AlertsPage(driver).sendMessageToAlert("Hello world!").verifyResult("Hello world!");
    }
}
