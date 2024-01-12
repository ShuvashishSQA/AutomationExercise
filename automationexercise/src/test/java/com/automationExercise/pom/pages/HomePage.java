package com.automationExercise.pom.pages;

import com.automationExercise.pom.BaseTest;
import com.automationExercise.pom.methods.FrameworkSubroutine;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends BaseTest {
    @FindBy(xpath = "//a[@href='/view_cart']")
    WebElement elCart;

    @FindBy(xpath = "//a[@class='btn btn-default add-to-cart']")
    WebElement elAddtoCard;


    @FindBy(className = "brands_products")
    WebElement elBrandsProducts;

    @FindBy(xpath = "//div[@class='modal-content']//a[@href='/view_cart']")
    WebElement elViewCart;


    public HomePage() {
        try {
            PageFactory.initElements(FrameworkSubroutine.driver, this);

        } catch (Exception e) {
            System.out.println();
        }
    }

    public boolean isHomePageDisplay() {
        return elCart.isDisplayed();
    }


    public CartPage clickCardPage() throws Exception {
        FrameworkSubroutine.FrmSubScrollToElement(FrameworkSubroutine.driver, elBrandsProducts);

        Thread.sleep(3000);
        elAddtoCard.isDisplayed();
        elAddtoCard.click();
        Thread.sleep(3000);
        elViewCart.isDisplayed();
        elViewCart.click();
        Thread.sleep(3000);
        return new CartPage();
    }

}
