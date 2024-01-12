package com.automationExercise.pom.pages;

import com.automationExercise.pom.methods.FrameworkSubroutine;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class ConfirmPurchasePage extends PlaceOrderPage {
    @FindBy(xpath = "//input[@name=\"name_on_card\"]")
    WebElement elNameOnCard;

    @FindBy(xpath = "//input[@name=\"card_number\"]")
    WebElement elCardNumber;

    @FindBy(xpath = "//input[@name=\"cvc\"]")
    WebElement elCVC;
    @FindBy(xpath = "//input[@name=\"expiry_month\"]")
    WebElement elExpiryMonth;
    @FindBy(xpath = "//input[@name=\"expiry_year\"]")
    WebElement elExpiryYear;
    @FindBy(xpath = "//button[@id=\"submit\"]")
    WebElement elPayAndConfirmOrder;

    public ConfirmPurchasePage() {
        try {
            PageFactory.initElements(FrameworkSubroutine.driver, this);

        } catch (Exception e) {
            System.out.println();
        }
    }

    public ConfirmPurchasePage setCardHoldersName(String name) {
        elNameOnCard.isDisplayed();
        elNameOnCard.sendKeys(name);
        return this;
    }

    public ConfirmPurchasePage setCardNo(String cardNumber) {
        elCardNumber.isDisplayed();
        elCardNumber.sendKeys(cardNumber);
        return this;
    }

    public ConfirmPurchasePage setCVC(String cvcNumber) {
        elCVC.isDisplayed();
        elCVC.sendKeys(cvcNumber);
        return this;
    }

    public ConfirmPurchasePage setExpiryMonth(String expiryMonth) {
        elExpiryMonth.isDisplayed();
        elExpiryMonth.sendKeys(expiryMonth);
        return this;
    }

    public ConfirmPurchasePage setExpiryYear(String expiryYear) {
        elExpiryYear.isDisplayed();
        elExpiryYear.sendKeys(expiryYear);
        return this;
    }

    public OrderConfirmationTextPage clickPayAndConfirmOrder() throws InterruptedException {
        elPayAndConfirmOrder.isDisplayed();
        elPayAndConfirmOrder.click();
        Thread.sleep(2000);
        return new OrderConfirmationTextPage();
    }

}
