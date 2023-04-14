package Section5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class L02_ClickingButtons {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
//        System.setProperty("webdriver.chrome.driver","C:\\Program Files (x86)\\Java\\driver_v1\\geckodriver.exe");
        driver.manage().window().maximize();
        driver.get("https://www.automationtesting.co.uk/buttons.html");
        driver.findElement(By.cssSelector("button#btn_three")).click();


    }
}
