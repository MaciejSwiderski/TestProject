package Section5;


import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class L10_Assertion_pt2 {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("https://www.automationtesting.co.uk");
        driver.findElement(By.cssSelector(".close-cookie-warning > span")).click();
        driver.findElement(By.linkText("TEST STORE")).click();
        driver.findElement(By.cssSelector("img[alt='Hummingbird printed t-shirt']")).click();
        driver.findElement(By.cssSelector(".add-to-cart.btn.btn-primary")).click();
       // driver.findElement(By.cssSelector(".product-total > .value")).getText();
        Thread.sleep(3000);
        String total = driver.findElement(By.cssSelector(".product-total > .value")).getText();
        System.out.println(driver.findElement(By.cssSelector(".product-total > .value")).getText());
        Assert.assertEquals("$26.12",total);












    }
}
