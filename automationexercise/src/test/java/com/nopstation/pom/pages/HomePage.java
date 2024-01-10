package com.nopstation.pom.pages;

import com.nopstation.pom.BaseTest;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends BaseTest {
    @FindBy(xpath = "//a[@href='/view_cart']")
    WebElement elCard;

    @FindBy(className="//div[@class='single-products']")
    WebElement elSingleProduct;

    @FindBy(xpath = "//a[@class='btn btn-default add-to-cart']")
    WebElement elAddtoCard;


    @FindBy(className = "brands_products")
    WebElement elBrandsProducts;

    @FindBy(xpath = "//div[@class='modal-content']//a[@href='/view_cart']")
    WebElement elViewCart;



    public HomePage(){
        PageFactory.initElements(driver,this);
    }

    public boolean isHomePageDisplay(){
        return elCard.isDisplayed();
    }

//    public boolean isSearchBoxDisplay(){
//        return elSmallSearchTerms.isDisplayed();
//    }

    public CardPage clickCardPage() throws Exception {
        FrmSubScrollToElement(driver,elBrandsProducts);
       // action.moveToElement(elSingleProduct).perform();
        Thread.sleep(3000);
        elAddtoCard.isDisplayed();
        elAddtoCard.click();
        Thread.sleep(3000);
        elViewCart.isDisplayed();
        elViewCart.click();
        Thread.sleep(3000);
        return new CardPage();
    }

//    public PlaceOrderPage mouseHoverToElectronics() throws InterruptedException {
//        elElectronics.isDisplayed();
//        Thread.sleep(2000);
//        action.moveToElement(elElectronics).build().perform();
//        return new PlaceOrderPage();
//    }
//    public PlaceOrderPage clickCellPhones() throws InterruptedException {
//        elCellPhones.isDisplayed();
//        elCellPhones.click();
//        Thread.sleep(2000);
//        return new PlaceOrderPage();
//    }
}
