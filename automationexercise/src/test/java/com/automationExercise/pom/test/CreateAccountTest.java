package com.automationExercise.pom.test;

import com.automationExercise.pom.BaseTest;
import com.automationExercise.pom.pages.CreateAccountPage;
import com.automationExercise.pom.pages.PlaceOrderPage;
import org.testng.annotations.Test;

public class CreateAccountTest extends BaseTest {

    @Test(priority = 5)
    public void fillData() throws Exception {
        PlaceOrderPage placeOrderPage = new CreateAccountPage()
                .setGender("test")
                .setPassword("pass1223")
                .setDay("3")
                .setMonth()
                .setYear()
                .setFirstName("Shuvashish")
                .setLastName("Bhattacharjee")
                .setAddress("nobin Street")
                .setState("India")
                .setCity("Calcutta")
                .setZipCode("123")
                .setMobileNumber("01995420554")
                .createAccountPage()
                .verifyAccountCreation()
                .clickContinue()
                .verifyUserLoggedIn()
                .clickCart()
                .clickCheckout();

    }
}
