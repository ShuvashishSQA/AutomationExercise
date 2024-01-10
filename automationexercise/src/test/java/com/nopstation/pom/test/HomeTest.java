package com.nopstation.pom.test;

import com.nopstation.pom.BaseTest;
import com.nopstation.pom.pages.HomePage;
import com.nopstation.pom.pages.CardPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HomeTest extends BaseTest {
    HomePage homePage;
    CardPage cardPage;

    public HomeTest(){
        super();
    }


    @Test(priority = 0)
    public void verifyHomePageShouldSucceed(){
        HomePage homePage = new HomePage();
        Assert.assertTrue(homePage.isHomePageDisplay());
    }
    @Test(priority = 1)
    public void clickCardButtonShouldSucceed() throws Exception {
        cardPage = new HomePage()
                .clickCardPage();
//        Assert.assertTrue(cardPage.isRegisterButtonDisplay());
    }
}
