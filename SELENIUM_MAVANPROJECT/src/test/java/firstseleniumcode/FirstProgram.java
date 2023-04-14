package firstseleniumcode;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import static org.testng.Assert.assertEquals;

public class FirstProgram {
    //public static WebDriver driver;

    @Test
    public void eightComponents() {
//        WebDriver driver = new ChromeDriver();
////        driver.get("https://www.selenium.dev/selenium/web/web-form.html");
//        driver.get("https://www.automationtesting.co.uk/index.html");
//
//        String title = driver.getTitle();
//        assertEquals("Web form", title);
//
//        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(5000));
//
//        WebElement textBox = driver.findElement(By.name("my-text"));
//        WebElement submitButton = driver.findElement(By.cssSelector("button"));
//
//        textBox.sendKeys("Selenium");
//        submitButton.click();
//
//        WebElement message = driver.findElement(By.id("message"));
//        String value = message.getText();
//        assertEquals("Received!", value);

        //driver.quit();
        WebDriver driver = new ChromeDriver();
// Set implicit wait of 60 seconds
        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);

        // Launch a new web page and load Facebook using Get Command
        driver.get("https://www.facebook.com/");

        // Get the Title of web page
        String PageTitle = driver.getTitle();
        System.out.println("Title of page is :"+ PageTitle);

        // Get URL of current web page
        String PageURL = driver.getCurrentUrl();
        System.out.println("URL of current page is :" + PageURL);

        // Get Source code of current web page
        String PageSource = driver.getPageSource();
        int PageSource_Length = PageSource.length();
        System.out.println("Length of page source of current page is :" + PageSource_Length);

        // Get Runtime class of this object
        Class<? extends WebDriver> className = driver.getClass();
        System.out.println("className :" + className);

        // Close the current web page
        driver.close();

    }
}
