package com.automationExercise.pom.pages;

import com.automationExercise.pom.BaseTest;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class CartPage extends BaseTest {

    @FindBy(xpath = "//a[@class='btn btn-default check_out']")
    WebElement elCheckoutButton;

    @FindBy(xpath = "//div[@class='modal-content']//a[@href='/login']")
    WebElement elRegistrationLink;


    public CartPage() {
        try {
            PageFactory.initElements(driver, this);

        } catch (Exception e) {
            System.out.println();
        }
    }


    public RegistrationPage clickCheckoutAndRegistrationButton() {
        elCheckoutButton.isDisplayed();
        elCheckoutButton.click();
        elRegistrationLink.isDisplayed();
        elRegistrationLink.click();
        return new RegistrationPage();
    }

}
