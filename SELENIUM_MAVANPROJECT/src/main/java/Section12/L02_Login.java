package Section12;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

public class L02_Login {

    WebDriver driver;

    @BeforeSuite
    public void setUp() throws InterruptedException, IOException {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        //for demonstration purpose only
        Thread.sleep(2000);
        Properties prop = new Properties();
        FileInputStream data = new FileInputStream("C:\\Users\\user\\IdeaProjects\\SELENIUM_MAVANPROJECT\\src\\main\\java\\Section12\\L02_config.properties");
        prop.load(data);
        driver.get(prop.getProperty("url"));
    }

    @Test
    public void signIn() throws InterruptedException {
        driver.findElement(By.cssSelector("[title] .hidden-sm-down")).click();
        driver.findElement(By.cssSelector("section input[name='email']")).sendKeys("testtest261@test.com");
        driver.findElement(By.cssSelector("[name='password']")).sendKeys("passpass261");
        driver.findElement(By.cssSelector("button#submit-login")).click();
        System.out.println("user has logged in");
        //for demonstration purpose only
        Thread.sleep(2000);
    }

}
