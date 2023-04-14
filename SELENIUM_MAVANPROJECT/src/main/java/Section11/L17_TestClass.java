package Section11;

import Section12.L05_BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import java.io.IOException;
import java.time.Duration;

@Listeners({Section11.L17_ITestListener.class})

public class L17_TestClass  extends L05_BasePage {

//    WebDriver driver;

    public L17_TestClass() throws IOException {
    }


    @BeforeSuite
    public void setUp() throws InterruptedException {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("http://teststore.automationtesting.co.uk/login?back=my-account");
        //for demonstration purpose only
        Thread.sleep(2000);


    }


    @Test
    public void enterEmail() throws InterruptedException, IOException {
        takeSnapShot(driver);
        Assert.fail();
        driver.findElement(By.cssSelector("section input[name='email']")).sendKeys("testtest261@test.com");

        //Thread.sleep(3000);
    }

    @Test
    public void enterPassword() throws InterruptedException {
        driver.findElement(By.cssSelector("[name='password']")).sendKeys("passpass261");
        Thread.sleep(3000);
    }

//    @AfterTest()
//    public  void takeASnapshot() throws IOException {
//        File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
//        File destFile = new File("D:\\screenshots\\"+new SimpleDateFormat("yyyy-MM-dd HH-mm-ss").format(new Date())+".png");
//        FileUtils.copyFile(scrFile,destFile);
//    }


}
