package com.automationExercise.pom.pages;

import com.automationExercise.pom.BaseTest;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegistrationPage extends BaseTest {
    @FindBy(xpath = "//input[@name='name']")
    WebElement elName;

    @FindBy(xpath = "//div[@class='signup-form']//input[@name='email']")
    WebElement elEmail;

    @FindBy(xpath = "//button[contains(text(),'Signup')]")
    WebElement elSignup;

    public RegistrationPage() {
        try {
            PageFactory.initElements(driver, this);

        } catch (Exception e) {
            System.out.println();
        }
    }

    public RegistrationPage fillName(String name) {
        elName.isDisplayed();
        elName.sendKeys(name);
        return this;
    }

    public RegistrationPage fillEmail(String email) {
        elEmail.isDisplayed();
        elEmail.sendKeys(email);
        return this;
    }

    public CreateAccountPage clickSignupButton() {
        elSignup.isDisplayed();
        elSignup.click();
        return new CreateAccountPage();
    }
}
