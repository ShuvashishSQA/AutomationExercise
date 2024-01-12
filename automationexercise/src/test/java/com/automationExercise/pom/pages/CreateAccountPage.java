package com.automationExercise.pom.pages;

import com.automationExercise.pom.BaseTest;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class CreateAccountPage extends BaseTest {
    @FindBy(xpath = "//div[@id='uniform-id_gender1']")
    WebElement elGender;

    @FindBy(xpath = "//input[@id='password']")
    WebElement elPassword;

    @FindBy(id = "days")
    WebElement elDay;

    @FindBy(id = "months")
    WebElement elMonths;
    @FindBy(id = "years")
    WebElement elYears;
    @FindBy(id = "first_name")
    WebElement elFirstName;

    @FindBy(id = "last_name")
    WebElement elLastName;

    @FindBy(id = "address1")
    WebElement elAddress;

    @FindBy(id = "state")
    WebElement elState;

    @FindBy(id = "city")
    WebElement elCity;

    @FindBy(id = "zipcode")
    WebElement elZipCode;

    @FindBy(id = "mobile_number")
    WebElement elMobileNumber;

    @FindBy(xpath = "//button[contains(text(),'Create Account')]")
    WebElement elCreateAccount;

    @FindBy(xpath = "//h2[@style='color: green;']")
    WebElement elAccountVerification;
    @FindBy(xpath = "//a[contains(text(),'Continue')]")
    WebElement elContinue;
    @FindBy(xpath = "//i[@class='fa fa-user']//parent::a")
    WebElement elUserverification;

    @FindBy(xpath = "//a[@href='/view_cart']")
    WebElement elCart;

    @FindBy(xpath = "//a[contains(text(),'Proceed To Checkout')]")
    WebElement elCheckout;


    public CreateAccountPage() {
        try {
            PageFactory.initElements(driver, this);

        } catch (Exception e) {
            System.out.println();
        }
    }


    public CreateAccountPage setGender(String gender) {
        elGender.isDisplayed();
        elGender.click();
        return this;
    }

    public CreateAccountPage setPassword(String password) {
        elPassword.isDisplayed();
        elPassword.sendKeys(password);
        return this;
    }

    public CreateAccountPage setFirstName(String fName) {
        elFirstName.isDisplayed();
        elFirstName.sendKeys(fName);
        return this;
    }

    public CreateAccountPage setLastName(String lName) {
        elLastName.isDisplayed();
        elLastName.sendKeys(lName);
        return this;
    }

    public CreateAccountPage setAddress(String address) {
        elAddress.isDisplayed();
        elAddress.sendKeys(address);
        return this;
    }

    public CreateAccountPage setState(String state) {
        elState.isDisplayed();
        elState.sendKeys(state);
        return this;
    }

    public CreateAccountPage setCity(String city) {
        elCity.isDisplayed();
        elCity.sendKeys(city);
        return this;
    }

    public CreateAccountPage setZipCode(String zipCode) {
        elZipCode.isDisplayed();
        elZipCode.sendKeys(zipCode);
        return this;
    }

    public CreateAccountPage setMobileNumber(String mobileNumber) {
        elMobileNumber.isDisplayed();
        elMobileNumber.sendKeys(mobileNumber);
        return this;
    }

    public CreateAccountPage createAccountPage() {
        elCreateAccount.isDisplayed();
        elCreateAccount.click();
        return this;
    }

    public CreateAccountPage clickContinue() throws InterruptedException {
        elContinue.isDisplayed();
        elContinue.click();
        Thread.sleep(2000);
        return this;
    }

    public CreateAccountPage clickCart() throws InterruptedException {
        elCart.isDisplayed();
        elCart.click();
        Thread.sleep(2000);
        return this;
    }

    public CreateAccountPage verifyUserLoggedIn() throws InterruptedException {
        elUserverification.isDisplayed();
        Thread.sleep(2000);
        return this;
    }


    public CreateAccountPage verifyAccountCreation() {
        elAccountVerification.isDisplayed();
        boolean isDisplay = elAccountVerification.getText().equals("ACCOUNT CREATED!");
        return this;
    }

    public PlaceOrderPage clickCheckout() {
        elCheckout.isDisplayed();
        elCheckout.click();
        return new PlaceOrderPage();
    }

    public CreateAccountPage setDay(String day) throws Exception {

        Select days = new Select(elDay);
        days.selectByValue("19");
        Thread.sleep(2000);
        return this;
    }

    public CreateAccountPage setMonth() throws Exception {

        Select month = new Select(elMonths);
        month.selectByValue("11");
        Thread.sleep(2000);
        return this;
    }

    public CreateAccountPage setYear() throws Exception {

        Select years = new Select(elYears);
        years.selectByValue("2003");
        Thread.sleep(2000);
        return this;
    }


}
