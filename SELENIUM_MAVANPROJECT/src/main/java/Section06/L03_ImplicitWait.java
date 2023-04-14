package Section06;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class L03_ImplicitWait {

    public static void main(String[] args) {

        //System.setProperty("webdriver.chrome.driver","C:\\Program Files (x86)\\Java\\driver_v1\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();
//        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://www.automationtesting.co.uk/loader.html");
        driver.findElement(By.cssSelector("button#loaderBtn")).click();



    }
}
