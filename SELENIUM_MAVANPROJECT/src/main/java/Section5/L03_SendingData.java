package Section5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class L03_SendingData {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.get("https://www.automationtesting.co.uk/contactForm.html");
        driver.findElement(By.cssSelector("input[name='first_name']")).sendKeys("John");
        driver.findElement(By.cssSelector("input[name='last_name']")).sendKeys("Smith");
        driver.findElement(By.cssSelector("input[name='email']")).sendKeys("johnsmith@test.com");
        driver.findElement(By.cssSelector("textarea[name='message']")).sendKeys("This is a message.");



    }
}
