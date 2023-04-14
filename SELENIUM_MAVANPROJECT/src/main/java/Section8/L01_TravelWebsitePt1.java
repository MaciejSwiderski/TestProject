package Section8;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class L01_TravelWebsitePt1 {


    public static void main(String[] args) {




        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("https://www.easyjet.com/en");

        driver.findElement(By.id("ensCloseBanner")).click();

        driver.findElement(By.cssSelector("input[name='origin']")).click();
        driver.findElement(By.cssSelector("input[name='origin']")).sendKeys("London");

        List<WebElement> origins = new WebDriverWait(driver, Duration.ofSeconds(20))
                .until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.cssSelector("#ui-id-1 li>a>span")));
                //driver.findElements(By.cssSelector("#ui-id-1 li>a>span"));

        for(WebElement origin:origins) {
            //System.out.println(origin.getText());
            if(origin.getText().contains("Luton")) {
                origin.click();
            }
        }


    }
}
