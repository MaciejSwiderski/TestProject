package Section5;

import com.google.gson.Gson;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class L04_Checkboxes {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.get("https://www.automationtesting.co.uk/dropdown.html");

        System.out.println(driver.findElement(By.cssSelector("input#cb_red")).isSelected());
//        System.out.println(driver.findElement(By.cssSelector("input#cb_green")).isSelected());






    }
}
