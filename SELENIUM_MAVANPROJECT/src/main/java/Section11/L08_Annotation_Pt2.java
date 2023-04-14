package Section11;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

import java.time.Duration;

public class L08_Annotation_Pt2 {

    WebDriver driver;

    @BeforeSuite
    public void setUp() throws InterruptedException {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        //for demonstration purpose only
        Thread.sleep(2000);
    }

    @BeforeMethod
    public void signIn() throws InterruptedException {
        driver.get("http://teststore.automationtesting.co.uk/");
        driver.findElement(By.cssSelector("[title] .hidden-sm-down")).click();
        driver.findElement(By.cssSelector("section input[name='email']")).sendKeys("testtest261@test.com");
        driver.findElement(By.cssSelector("[name='password']")).sendKeys("passpass261");
        driver.findElement(By.cssSelector("button#submit-login")).click();
        System.out.println("user has logged in");
        //for demonstration purpose only
        Thread.sleep(2000);
    }

    @Test
    public void test() throws InterruptedException {
        driver.findElement(By.linkText("CLOTHES")).click();
        System.out.println("user has clicked the clothes link");
        //for demonstration purpose only
        Thread.sleep(2000);
    }

    @AfterMethod
    public void signOut() throws InterruptedException {
        driver.findElement(By.cssSelector(".hidden-sm-down.logout")).click();
        System.out.println("user has logged out");
    }

    @AfterSuite
    public void end(){
        driver.close();
        driver.quit();
    }

}
