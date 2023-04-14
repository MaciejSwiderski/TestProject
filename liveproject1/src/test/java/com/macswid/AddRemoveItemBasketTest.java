package com.macswid;

import base.BasePage;
import base.ExtentManager;
import base.Hooks;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import org.testng.asserts.Assertion;
import pageObject.*;

import java.io.IOException;
import java.time.Duration;

@Listeners(pageObject.Listeners.class)

public class AddRemoveItemBasketTest extends Hooks {

    public AddRemoveItemBasketTest() throws IOException {
        super();
    }

    @Test
    public void addRemoveItem() throws InterruptedException, IOException {

        ExtentManager.log("Starting AddRemoveItemBasketTest...");

        // creating an object of the automationtesting.co.uk webpage
        HomePage home = new HomePage();
        //handles cookie prompt
        home.getCookie().click();
        home.getTestStoreLink().click();

        // creating an object of the test store homepage
        ShopHomePage shopHome = new ShopHomePage();
        ExtentManager.pass("Reached the shop homepage");
        shopHome.getProdOne().click();

        // creating an object of the shop products page (when a product has been selected)
        ShopProductPage shopProd = new ShopProductPage();
        ExtentManager.pass("Reached the shop product page");
        Select option = new Select(shopProd.getSizeOption());
        option.selectByVisibleText("M");
        ExtentManager.pass("Have successfully selected product size");
        shopProd.getQuantIncrease().click();
        ExtentManager.pass("Have successfully increased quantity");
        shopProd.getAddToCartBtn().click();
        ExtentManager.pass("Have successfully added product to basket");

        Thread.sleep(3000);

        // creating an object of the cart content panel (once an item was added)
        ShopContentPanel cPanel = new ShopContentPanel();
        cPanel.getContinueShoppingBtn().click();
        shopProd.getHomepageLink().click();
        shopHome.getProdTwo().click();
        shopProd.getAddToCartBtn().click();
        cPanel.getcheckoutBtn().click();
        //creating an object for shopping cart page and deleteing item 2
        ShoppingCart cart = new ShoppingCart();
        cart.getDeleteItemTwo().click();
        //in order to wait till second item was deleted and no longer visible
        waitForElementInvisible(cart.getDeleteItemTwo(),Duration.ofSeconds(10));

        System.out.println(cart.getTotalAmount().getText());

//        Assert.assertEquals(cart.getTotalAmount().getText(),"$45.24");

        //Failure is order to take a snapshot
        try{

            Assert.assertEquals(cart.getTotalAmount().getText(),"$45.23");
            ExtentManager.pass("The total amount matches the expected amount.");
        } catch (AssertionError e) {
            Assert.fail("Cart amount did not match the expected amount, it found "+ cart.getTotalAmount().getText()+
                    " expected $45.23");
            ExtentManager.fail("The total amount did not matcg th expected amount.");
        }

    }
}
