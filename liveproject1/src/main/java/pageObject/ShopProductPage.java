package pageObject;

import base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.io.IOException;

public class ShopProductPage extends BasePage {

    public WebDriver driver;

    By sizeOption = By.cssSelector("select[name='group[1]']");  // [data-product-attribute='1']
    By quantityIncrease = By.cssSelector(".touchspin-up");
    By quantityDecrease = By.cssSelector(".touchspin-down");
    By addToCartBtn = By.cssSelector(".add-to-cart.btn.btn-primary");
    By homepageLink = By.xpath("//span[.='Home']");

    public ShopProductPage() throws IOException {
        super();
    }

    public WebElement getSizeOption() throws IOException, InterruptedException {
        this.driver = getDriver();
        return driver.findElement(sizeOption);
    }

    public WebElement getQuantIncrease() throws IOException, InterruptedException {
        this.driver = getDriver();
        return driver.findElement(quantityIncrease);
    }

    public WebElement getQuantDecrease() throws IOException, InterruptedException {
        this.driver = getDriver();
        return driver.findElement(quantityDecrease);
    }

    public WebElement getAddToCartBtn() throws IOException, InterruptedException {
        this.driver = getDriver();
        return driver.findElement(addToCartBtn);
    }

    public WebElement getHomepageLink() throws IOException, InterruptedException {
        this.driver = getDriver();
        return driver.findElement(homepageLink);
    }
}
