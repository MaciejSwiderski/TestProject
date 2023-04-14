package base;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;
import java.util.Properties;

public class BasePage {

    private String url;
    private Properties prop;
    public static String screenShotDestinationPath;


    //using Constractors instead of initialising in methods. It gives access to a config file
    public BasePage() throws IOException {
        prop = new Properties();
        FileInputStream data = new FileInputStream(
                System.getProperty("user.dir")+ "\\src\\main\\resources\\config.properties");
//        FileInputStream data = new FileInputStream("C:\\Users\\user\\IdeaProjects\\SELENIUM_MAVANPROJECT\\src\\main\\java\\Section12\\L04_config.properties");
        prop.load(data);

    }

    public static WebDriver getDriver() throws IOException, InterruptedException {


        return WebDriverInstance.getDriver();
    }

    public String getUrl() throws IOException {
//        Properties prop = new Properties();
//        FileInputStream data = new FileInputStream("C:\\Users\\user\\IdeaProjects\\SELENIUM_MAVANPROJECT\\src\\main\\java\\Section12\\L04_config.properties");
//        prop.load(data);
        url = prop.getProperty("url");
        return url;
    }
    public  static String takeSnapShot(String name) throws IOException, InterruptedException {
        File srcFile = ((TakesScreenshot) getDriver()).getScreenshotAs(OutputType.FILE);
        String destFile = System.getProperty("user.dir") + "\\target\\screenshots\\" + timeStamp() + ".png";
        screenShotDestinationPath = destFile;
        //file:///C:/Users/user/IdeaProjects/liveproject1/target/screenshots/
        System.out.println(screenShotDestinationPath+" tutaj:");

        try {
            FileUtils.copyFile(srcFile, new File(destFile));
        } catch (IOException e) {
            e.printStackTrace();
        }

        return name;
    }

    public static String timeStamp(){
        return new SimpleDateFormat("yyyy-MM-dd_HH-mm-ss").format(new Date());
    }

    public static String getScreenShotDestinationPath(){
        return screenShotDestinationPath;

    }

    public static void waitForElementInvisible(WebElement element, Duration timer) throws IOException, InterruptedException {
        WebDriverWait wait = new WebDriverWait(getDriver(),timer);
        wait.until(ExpectedConditions.invisibilityOf(element));
    }
}
