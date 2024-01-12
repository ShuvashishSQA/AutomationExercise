package com.automationExercise.pom.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OrderConfirmationTextPage extends ConfirmPurchasePage {
    @FindBy(xpath = "//b[contains(text(),'Order Placed!')]")
    WebElement elOrderPlacedHeading;

    @FindBy(xpath = "//p[contains(text(),'Congratulations! Your order has been confirmed!')]")
    WebElement elOrderPlaceConfirmation;

    public OrderConfirmationTextPage() {
        try {
            PageFactory.initElements(driver, this);

        } catch (Exception e) {
            System.out.println();
        }
    }

    public OrderConfirmationTextPage verifyOrderPlacedHeading() {
        elOrderPlacedHeading.isDisplayed();
        elOrderPlaceConfirmation.isDisplayed();
        return this;
    }


}
