package com.macswid;

import base.BasePage;
import base.ExtentManager;
import base.Hooks;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pageObject.*;

import java.io.IOException;

@org.testng.annotations.Listeners(pageObject.Listeners.class)

public class OrderCompleteTest extends Hooks {

    public OrderCompleteTest() throws IOException {
        super();
    }



    @Test
    public void endToEndTest() throws IOException, InterruptedException {

        ExtentManager.log("Starting OrderCompleteTest...");

        // creating an object of the automationtesting.co.uk webpage
        HomePage home = new HomePage();
        //handles cookie prompt
        home.getCookie().click();
        home.getTestStoreLink().click();
        ExtentManager.pass("Have successfully reached the store homepage");

        // creating an object of the test store homepage
        ShopHomePage shopHome = new ShopHomePage();
        shopHome.getProdOne().click();
        ExtentManager.pass("Have successfully clicked on product");

        // creating an object of the shop products page (when a product has been selected)
        ShopProductPage shopProd = new ShopProductPage();
        ExtentManager.pass("Have successfully reached shop product page");
        Select option = new Select(shopProd.getSizeOption());
        option.selectByVisibleText("M");
        ExtentManager.pass("Have successfully selected product size");
        shopProd.getQuantIncrease().click();
        ExtentManager.pass("Have successfully increased quantity");
        shopProd.getAddToCartBtn().click();
        ExtentManager.pass("Have successfully added item to cart");

//        Thread.sleep(3000);

        // creating an object of the cart content panel (once an item was added)
        ShopContentPanel cPanel = new ShopContentPanel();
        cPanel.getcheckoutBtn().click();

        // creating an object of the shopping cart page (all items selected)
        ShoppingCart cart = new ShoppingCart();
        ExtentManager.pass("Have successfully reached the shopping cart page");
        cart.getHavePromo().click();
        ExtentManager.pass("Have successfully selected the promo button");
        cart.getPromoTextbox().sendKeys("20OFF");
        cart.getPromoAddBtn().click();
//        Thread.sleep(3000);
        cart.getProceedCheckoutBtn().click();
        ExtentManager.pass("Have successfully selected the checkout button");

        // creating an object of the order personal information page
        OrderFormPersInfo pInfo  = new OrderFormPersInfo();
        pInfo.getGenderMr().click();
        pInfo.getFirstNameField().sendKeys("Natalie");
        pInfo.getLastnameField().sendKeys("Swiderska");
        pInfo.getEmailField().sendKeys("natswid@test.com");
        pInfo.getTermsConditionsCheckbox().click();
        pInfo.getContinueBtn().click();
        ExtentManager.pass("Have successfully entered customer details");

        // creating an object of the order delivery info page
        OrderFormDelivery orderDelivery = new OrderFormDelivery();
        orderDelivery.getAddressField().sendKeys("1321 Main Street");
        orderDelivery.getCityField().sendKeys("Huston");
        Select state = new Select(orderDelivery.getStateDropdown());
        state.selectByVisibleText("Texas");
        orderDelivery.getPostcodeField().sendKeys("77521");
        //Thread.sleep(3000);
        orderDelivery.getContinueBtn().click();
        ExtentManager.pass("Have successfully entered delivery info");
        //Thread.sleep(3000);

        // creating an object of the shipping method page
        OrderFormShippingMethod shipMethod = new OrderFormShippingMethod();
        shipMethod.getDeliveryMsgTextbox().sendKeys("If I am not in, please leave my delivery on my porch");
        shipMethod.getContinueBtn().click();
        ExtentManager.pass("Have successfully selected the shipping method");

        // creating an object of the payment options page
        OrderFormPayment orderPay = new OrderFormPayment();
        orderPay.getPayByCheckRadioBtn().click();
        orderPay.getTermsConditionsCheckbox().click();
        //Thread.sleep(3000);
        orderPay.getOrderBtn().click();
        ExtentManager.pass("Have successfully placed order");
    }
}
