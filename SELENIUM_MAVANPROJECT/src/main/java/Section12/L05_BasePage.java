package Section12;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;
import java.util.Properties;

public class L05_BasePage {

    public static WebDriver driver;
    private String url;
    private Properties prop;


    //using Constractors instead of initialising in methods
    public L05_BasePage() throws IOException {
         prop = new Properties();
         FileInputStream data = new FileInputStream(
         System.getProperty("user.dir")+ "\\src\\main\\java\\Section12\\L04_config.properties");

//        FileInputStream data = new FileInputStream("C:\\Users\\user\\IdeaProjects\\SELENIUM_MAVANPROJECT\\src\\main\\java\\Section12\\L04_config.properties");
        prop.load(data);

    }

    public WebDriver getDriver() throws IOException, InterruptedException {

//        Properties prop = new Properties();
//        FileInputStream data = new FileInputStream("C:\\Users\\user\\IdeaProjects\\SELENIUM_MAVANPROJECT\\src\\main\\java\\Section12\\L04_config.properties");
//        prop.load(data);

        if(prop.getProperty("browser").equalsIgnoreCase("chrome")){
            System.setProperty("webdriver.chrome.driver",
                    System.getProperty("user.dir")+"\\src\\main\\java\\Drivers\\chromedriver.exe");
//                    "C:\\Program Files (x86)\\Java\\driver_v1\\chromedriver.exe");
            driver = new ChromeDriver();
        }else if(prop.getProperty("browser").equalsIgnoreCase("firefox")){
            FirefoxOptions options = new FirefoxOptions();
            options.setBinary("C:\\Program Files\\Mozilla Firefox\\firefox.exe");
            System.setProperty("webdriver.gecko.driver",
                    System.getProperty("user.dir")+"\\src\\main\\java\\Drivers\\geckodriver.exe");

//                    "C:\\Program Files (x86)\\Java\\driver_v1\\geckodriver.exe");
            driver = new FirefoxDriver(options);
        }else if(prop.getProperty("browser").equalsIgnoreCase("edge")){
            System.setProperty("webdriver.edge.driver",
                    System.getProperty("user.dir")+"\\src\\main\\java\\Drivers\\msedgedriver.exe");
//                    "C:\\Program Files (x86)\\Java\\driver_v1\\msedgedriver.exe");
            driver = new EdgeDriver();
        }
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
            driver.get(prop.getProperty("url"));
        return driver;
    }

    public String getUrl() throws IOException {
//        Properties prop = new Properties();
//        FileInputStream data = new FileInputStream("C:\\Users\\user\\IdeaProjects\\SELENIUM_MAVANPROJECT\\src\\main\\java\\Section12\\L04_config.properties");
//        prop.load(data);
        url = prop.getProperty("url");
        return url;
    }
    public  void takeSnapShot(WebDriver webDriver) throws IOException {
        File scrFile = ((TakesScreenshot)webDriver).getScreenshotAs(OutputType.FILE);
        File destFile = new File("D:\\screenshots\\"+timeStamp()+".png");
        FileUtils.copyFile(scrFile,destFile);
    }

    public  String timeStamp(){
        return new SimpleDateFormat("yyyy-MM-dd HH-mm-ss").format(new Date());
    }
}
