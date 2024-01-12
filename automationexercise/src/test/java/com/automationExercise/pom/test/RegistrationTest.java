package com.automationExercise.pom.test;

import com.automationExercise.pom.BaseTest;
import com.automationExercise.pom.methods.FunctionalMethods;
import com.automationExercise.pom.pages.CreateAccountPage;
import com.automationExercise.pom.pages.RegistrationPage;
import io.qameta.allure.Feature;
import org.testng.annotations.Test;

public class RegistrationTest extends BaseTest {
    CreateAccountPage createAccountPage;

    @Feature("Registration Page FillUp")
    @Test(priority = 4)
    public void verifySignupShouldSucceed() {
        createAccountPage = new CreateAccountPage();
        createAccountPage = new RegistrationPage().fillName("Automation")
                .fillEmail(FunctionalMethods.generateEmail()).clickSignupButton();
    }
}
