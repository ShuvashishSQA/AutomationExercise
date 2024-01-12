package com.automationExercise.pom.test;

import com.automationExercise.pom.BaseTest;
import com.automationExercise.pom.pages.HomePage;
import com.automationExercise.pom.pages.CartPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HomeTest extends BaseTest {
    HomePage homePage;
    CartPage cartPage;


    @Test(priority = 1)
    public void verifyHomePageShouldSucceed() {
        homePage = new HomePage();
        Assert.assertTrue(homePage.isHomePageDisplay());
    }

    @Test(priority = 2)
    public void clickCardButtonShouldSucceed() throws Exception {
        cartPage = new HomePage()
                .clickCardPage();
    }
}
