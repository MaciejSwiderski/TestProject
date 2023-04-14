import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class FireFoxDemo {


    public static void main(String[] args) {


        FirefoxOptions options = new FirefoxOptions();
        options.setBinary("C:\\Program Files\\Mozilla Firefox\\firefox.exe");
        System.setProperty("webdriver.gecko.driver", "C:\\Program Files (x86)\\Java\\driver_v1\\geckodriver.exe");
        WebDriver driver = new FirefoxDriver(options);

        driver.manage().window().maximize();
        driver.get("https://www.automationtesting.co.uk");

    }
}
