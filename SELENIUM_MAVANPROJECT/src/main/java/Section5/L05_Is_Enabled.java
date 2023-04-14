package Section5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class L05_Is_Enabled {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.get("https://www.automationtesting.co.uk/buttons.html");

//        driver.findElement(By.cssSelector("button#btn_four")).isEnabled();
        System.out.println(driver.findElement(By.cssSelector("button#btn_four")).isEnabled());
        System.out.println(driver.findElement(By.cssSelector("button#btn_three")).isEnabled());



    }
}
