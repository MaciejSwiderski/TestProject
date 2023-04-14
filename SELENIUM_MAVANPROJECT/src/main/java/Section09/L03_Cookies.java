package Section09;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class L03_Cookies {

    public static void main(String[] args) throws InterruptedException {
//        System.setProperty("webdriver.chrome.driver","C:\\Program Files (x86)\\Java\\driver_v1\\Nowy folder\\chromedriver.exe");



        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("http://teststore.automationtesting.co.uk/");

        driver.findElement(By.cssSelector("[title] .hidden-sm-down")).click();
        Thread.sleep(1000);
        driver.findElement(By.cssSelector("section input[name='email']")).sendKeys("testtest261@test.com");
        Thread.sleep(1000);
        driver.findElement(By.cssSelector("[name='password']")).sendKeys("passpass261");
        Thread.sleep(1000);
        driver.findElement(By.cssSelector("button#submit-login")).click();
        Thread.sleep(1000);
        driver.findElement(By.linkText("CLOTHES")).click();
        Thread.sleep(1000);
        driver.findElement(By.cssSelector("img[alt='Hummingbird printed t-shirt']")).click();
        Thread.sleep(1000);
        driver.findElement(By.cssSelector(".add-to-cart.btn.btn-primary")).click();
        Thread.sleep(3000);
        driver.findElement(By.cssSelector(".btn.btn-secondary")).click();
        Thread.sleep(1000);

        driver.manage().deleteAllCookies();





    }
}
