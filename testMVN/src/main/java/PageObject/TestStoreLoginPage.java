package PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class TestStoreLoginPage {
    WebDriver driver;

    public TestStoreLoginPage(WebDriver driver) {
        this.driver = driver;
    }

    By email = By.cssSelector("section input[name='email']");
    By password = By.cssSelector("[name='password']");
    By loginButton = By.cssSelector("button#submit-login");

    public WebElement getEmail(){
        return driver.findElement(email);
    }
    public WebElement getPassword(){
        return driver.findElement(password);
    }
    public WebElement getLoginButton(){
        return driver.findElement(loginButton);
    }

}
