package Section11;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.time.Duration;

public class L12_dataProvider {

    WebDriver driver;

    @BeforeSuite
    public void setUp() throws InterruptedException {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        //for demonstration purpose only
        Thread.sleep(2000);
    }

    @DataProvider
    public Object[][] getData(){
        Object[][] data = new Object[3][2];
        //data set 1
        data[0][0] = "testtest261@test.com";
        data[0][1] = "passpass261";
        //data set 2
        data[1][0] = "test@test.com";
        data[1][1] = "test123";
        //data set 3
        data[2][0] = "test23engulf@test.com";
        data[2][1] = "xxxxx";
      return data;
    }

    @Test(dataProvider = "getData")
    public void signIn(String email,String password) throws InterruptedException {
        driver.get("http://teststore.automationtesting.co.uk/");
        driver.findElement(By.cssSelector("[title] .hidden-sm-down")).click();
        driver.findElement(By.cssSelector("section input[name='email']")).sendKeys(email);
        driver.findElement(By.cssSelector("[name='password']")).sendKeys(password);
        driver.findElement(By.cssSelector("button#submit-login")).click();
        System.out.println("user has logged in");
        //for demonstration purpose only
        Thread.sleep(2000);
        driver.findElement(By.cssSelector(".hidden-sm-down.logout")).click();
        System.out.println("user has logged out");
    }

    @AfterSuite
    public void end(){
        driver.close();
        driver.quit();
    }
}
