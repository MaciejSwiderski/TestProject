package Section11;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import java.time.Duration;

public class L14_Enabled {

    WebDriver driver;

    @BeforeSuite
    public void setUp() throws InterruptedException {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("http://teststore.automationtesting.co.uk/login?back=my-account");
        //for demonstration purpose only
        Thread.sleep(2000);
    }

    @Test(enabled = false)
    public void enterEmail() throws InterruptedException {
        driver.findElement(By.cssSelector("section input[name='email']")).sendKeys("testtest261@test.com");
        Thread.sleep(3000);
    }

    @Test
    public void enterPassword() throws InterruptedException {
        driver.findElement(By.cssSelector("[name='password']")).sendKeys("passpass261");
        Thread.sleep(3000);
    }

}
