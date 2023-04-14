import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeDemo {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","C:\\Program Files (x86)\\Java\\driver_v1\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.get("https://www.automationtesting.co.uk");



    }
}
