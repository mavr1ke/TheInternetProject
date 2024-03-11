package com.internet.tests;

import com.internet.pages.HomePage;
import com.internet.pages.RedirectPage;
import com.internet.pages.StatusCodesPage;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class StatusCodesTest extends TestBase {

    @BeforeMethod
    public void precondition() {
        new HomePage(driver).selectRedirectLink();
        new RedirectPage(driver).clickTriggerRedirect();
    }

    @Test
    public void checkStatusCodeTest() {
        new StatusCodesPage(driver).checkStatusCode();
    }
}
