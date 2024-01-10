package com.nopstation.pom.pages;

import com.nopstation.pom.BaseTest;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import java.util.concurrent.ThreadLocalRandom;

public class CardPage extends BaseTest {

    @FindBy(id="register-button")
    WebElement elRegisterButton;

    @FindBy(id = "gender-male")
    WebElement elGenderMale;

    @FindBy(id="gender-female")
    WebElement elGenderFeMale;

    @FindBy(id="FirstName")
    WebElement elFirstName;

    @FindBy(id="LastName")
    WebElement elLastName;

    @FindBy(id="Email")
    WebElement elEmail;

    @FindBy(id="Company")
    WebElement elCompany;

    @FindBy(id="Newsletter")
    WebElement elNewsLetter;

    @FindBy(id="Password")
    WebElement elPassword;

    @FindBy(id="ConfirmPassword")
    WebElement elConfirmPassword;

    @FindBy(xpath = "//a[@class='ico-register']")
    WebElement elRegister;

    @FindBy(name = "DateOfBirthDay")
    WebElement elDateOfBirthDay;

    @FindBy(name = "DateOfBirthMonth")
    WebElement elDateOfBirthMonth;

    @FindBy(name = "DateOfBirthYear")
    WebElement elDateOfBirthYear;

    @FindBy(className = "result")
    WebElement elVerifyRegistrationMessage;
    @FindBy(xpath = "//a[@class='btn btn-default check_out']")
    WebElement elCheckoutButton;


    public CardPage(){
        PageFactory.initElements(driver,this);
    }

    public CardPage fillGender(String gender) throws Exception {
        syncTimeWait("1");
        objectVisibilityAssert("id", "gender-female");
        if (gender.equalsIgnoreCase("male")) {
            elGenderMale.click();
        } else {
            elGenderFeMale.click();
        }
        return this;
    }

    public CardPage fillFirstName(String firstName){
        elFirstName.isDisplayed();
        elFirstName.clear();
        elFirstName.sendKeys(firstName);
        return this;
    }

    public CardPage fillLastName(String lastName){
        elLastName.isDisplayed();
        elLastName.clear();
        elLastName.sendKeys(lastName);
        return this;
    }

    public CardPage fillEmail(String email){
        FrmSubScrollToElement(driver, elEmail);
        int int_random = ThreadLocalRandom.current().nextInt();
        String randomEmail = String.valueOf(int_random) + email;
        elEmail.isDisplayed();
        elEmail.clear();
        elEmail.sendKeys(randomEmail);
        return this;
    }

    public CardPage fillNewsLetter(String newsLetter){
        FrmSubScrollToElement(driver, elNewsLetter);
        objectVisibilityAssert("id", "Newsletter");
        elNewsLetter.isDisplayed();
        elNewsLetter.click();
        return this;
    }

    public CardPage fillPassword(String password){
        elPassword.isDisplayed();
        elPassword.clear();
        elPassword.sendKeys(password);
        return this;
    }

    public CardPage fillConfirmPassword(String confirmPassword){
        elConfirmPassword.isDisplayed();
        elConfirmPassword.clear();
        elConfirmPassword.sendKeys(confirmPassword);
        return this;
    }

    public CardPage fillCompanyName(String companyName){
        elCompany.isDisplayed();
        elCompany.clear();
        elCompany.sendKeys(companyName);
        return this;
    }

    public CardPage fillDateOfBirthDate(String day){
        Select dtBirth = new Select(elDateOfBirthDay);
        dtBirth.selectByIndex(Integer.parseInt(day));
        return this;
    }

    public CardPage fillDateOfBirthMonth(String month){
        Select dtBirth = new Select(elDateOfBirthMonth);
        dtBirth.selectByIndex(Integer.parseInt(month));
        return this;
    }

    public CardPage fillDateOfBirthYear(String year){
        Select dtBirth = new Select(elDateOfBirthYear);
        dtBirth.selectByValue(year);
        return this;
    }

    public CardPage clickRegisterButton() {
        elRegisterButton.isDisplayed();
        elRegisterButton.click();
        return this;
    }

    public CardPage clickCheckoutButton() {
        elCheckoutButton.isDisplayed();
        elCheckoutButton.click();
        return this;
    }

    public boolean verifyRegistration(){
        objectVisibilityAssert("class", "result");
        String message = elVerifyRegistrationMessage.getText();
        return message.equals("Your registration completed");
    }

    public boolean isRegisterButtonDisplay(){
        return elRegisterButton.isDisplayed();
    }
}
