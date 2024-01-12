package com.automationExercise.pom.test;

import com.automationExercise.pom.BaseTest;
import com.automationExercise.pom.pages.RegistrationPage;
import com.automationExercise.pom.pages.CartPage;
import org.testng.annotations.Test;

public class CardTest extends BaseTest {

    CartPage cartPage;
    RegistrationPage registrationPage;


    @Test(priority = 3)
    public void clickCheckoutButton() {
        cartPage = new CartPage();
        registrationPage = cartPage.clickCheckoutAndRegistrationButton();
    }

}
