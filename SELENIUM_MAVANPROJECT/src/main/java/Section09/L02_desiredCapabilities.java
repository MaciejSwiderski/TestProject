package Section09;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class L02_desiredCapabilities {

    public static void main(String[] args) {
//        System.setProperty("webdriver.chrome.driver","C:\\Program Files (x86)\\Java\\driver_v1\\Nowy folder\\chromedriver.exe");

//        DesiredCapabilities caps =  new DesiredCapabilities();
//        caps.setCapability(CapabilityType.BROWSER_NAME, "chrome");
//        caps.setCapability(CapabilityType.ACCEPT_INSECURE_CERTS,true);
//        caps.setCapability(CapabilityType.ACCEPT_INSECURE_CERTS, true);
//        ChromeOptions options = new ChromeOptions();
//        options.merge(caps);

//        ChromeOptions options = new ChromeOptions();
//        options.setCapability("nameOfCapability", "valueOfCapability");
//        WebDriver driver = new ChromeDriver(options);

        ChromeOptions options = new ChromeOptions();
        options.setAcceptInsecureCerts(true);
        WebDriver driver = new ChromeDriver(options);

        driver.get("https://expired.badssl.com/");



    }
}
