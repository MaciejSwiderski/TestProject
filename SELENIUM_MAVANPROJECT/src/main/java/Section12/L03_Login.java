package Section12;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

public class L03_Login {

    WebDriver driver;

    @BeforeSuite
    public void setUp() throws InterruptedException, IOException {

        Properties prop = new Properties();
        FileInputStream data = new FileInputStream("C:\\Users\\user\\IdeaProjects\\SELENIUM_MAVANPROJECT\\src\\main\\java\\Section12\\L03_config.properties");
        prop.load(data);


        if(prop.getProperty("browser").equalsIgnoreCase("chrome")){
            System.setProperty("webdriver.chrome.driver","C:\\Program Files (x86)\\Java\\driver_v1\\chromedriver.exe");
             driver = new ChromeDriver();
        }else if(prop.getProperty("browser").equalsIgnoreCase("firefox")){
            FirefoxOptions options = new FirefoxOptions();
            options.setBinary("C:\\Program Files\\Mozilla Firefox\\firefox.exe");
            System.setProperty("webdriver.gecko.driver", "C:\\Program Files (x86)\\Java\\driver_v1\\geckodriver.exe");
            driver = new FirefoxDriver(options);

//            System.setProperty("webdriver.gecko.driver","C:\\Program Files (x86)\\Java\\driver_v1\\geckodriver.exe");
//             driver = new FirefoxDriver();

        }else if(prop.getProperty("browser").equalsIgnoreCase("edge")){
            System.setProperty("webdriver.edge.driver","C:\\Program Files (x86)\\Java\\driver_v1\\msedgedriver.exe");
             driver = new EdgeDriver();
        }

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        //for demonstration purpose only
        Thread.sleep(2000);

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
