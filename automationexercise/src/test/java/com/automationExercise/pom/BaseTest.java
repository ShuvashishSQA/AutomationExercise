package com.automationExercise.pom;

import com.automationExercise.pom.methods.FunctionalMethods;
import io.qameta.allure.Feature;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.*;

public class BaseTest extends FunctionalMethods {

    public BaseTest() {
        FrmReadConfigProperties();
        FrmExcelSheetDataFetch("Register");
        FrmExcelSheetDataFetch("Billing");
        FrmExcelSheetDataFetch("PaymentInformation");
    }

    @BeforeTest
    @Feature("Launching Browser")
    @Test(priority = 0)
    public void browserSetUp() {
        FrmBrowserDriverSetUp();
        action = new Actions(driver);
    }

    @AfterTest
    public void tearDown() throws InterruptedException {
        Thread.sleep(10000);
        driver.quit();
    }
}
