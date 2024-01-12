package com.automationExercise.pom.test;

import com.automationExercise.pom.BaseTest;
import com.automationExercise.pom.pages.PlaceOrderPage;
import com.automationExercise.pom.pages.ConfirmPurchasePage;
import com.automationExercise.pom.pages.OrderConfirmationTextPage;
import io.qameta.allure.Description;
import io.qameta.allure.Feature;
import org.testng.annotations.Test;

public class PlaceOrderTest extends BaseTest {
    PlaceOrderPage placeOrderPage;
    ConfirmPurchasePage confirmPurchasePage;

    OrderConfirmationTextPage orderConfirmationTextPage;


    @Feature("Place Order")
    @Description("Verify that clicking on Place Order redirects to Payment Details form")
    @Test(priority = 6)
    public void verifyAddressDetailsTextAppears() {
        placeOrderPage = new PlaceOrderPage().verifyAddressDetails();
    }

    @Feature("Click Pay and Confirm button")
    @Test(priority = 7)
    public void clickPayAndConfirm() throws Exception {
        confirmPurchasePage = new ConfirmPurchasePage().setCardHoldersName("Shuvashish Bhattacharjee")
                .setCardNo("3566000020000410")
                .setCVC("123")
                .setExpiryMonth("03")
                .setExpiryYear("2026")
                .clickPayAndConfirmOrder();
    }

    @Feature(" Verify the success message 'Your order has been placed successfully!' ")
    @Test(priority = 8)
    public void verifyOrderPlaceConfirmation() {
        orderConfirmationTextPage = new OrderConfirmationTextPage().verifyOrderPlacedHeading();
    }

}
