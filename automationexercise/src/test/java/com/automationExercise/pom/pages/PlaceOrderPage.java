package com.automationExercise.pom.pages;

import com.automationExercise.pom.BaseTest;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PlaceOrderPage extends BaseTest {

    @FindBy(xpath = "//h2[contains(text(),'Address Details')]")
    WebElement elAddressDetailsText;

    @FindBy(xpath = "//a[@href=\"/payment\"]")
    WebElement elPlaceOrder;

    public PlaceOrderPage() {
        try {
            PageFactory.initElements(driver, this);

        } catch (Exception e) {
            System.out.println();
        }
    }

    public ConfirmPurchasePage verifyAddressDetails() {
        elAddressDetailsText.isDisplayed();
        FrmSubScrollToElement(driver, elPlaceOrder);
        elPlaceOrder.click();
        return new ConfirmPurchasePage();
    }


}
