package TestCases;

import PageObject.TestStoreLoginPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class StoreLoginTest {


    @Test
    public void login(){
//        System.setProperty("webdriver.chrome.driver","C:\\Program Files (x86)\\Java\\driver_v1\\archive\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("http://teststore.automationtesting.co.uk/login?back=my-account");

        TestStoreLoginPage logPage = new TestStoreLoginPage(driver);
        logPage.getEmail().sendKeys("testtest261@test.com");
        logPage.getPassword().sendKeys("passpass261");
        logPage.getLoginButton().click();
    }
}
