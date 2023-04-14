package Section5;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.junit.Assert;


public class L09_Assertion_pt1 {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.get("https://www.automationtesting.co.uk");

        String pageTitle = driver.getTitle();
        Assert.assertEquals("Homepage",pageTitle);











    }
}
