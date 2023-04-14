package Section5;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Iterator;
import java.util.Set;


public class L12_Accordian {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("https://www.automationtesting.co.uk/accordion.html");
//        driver.findElement(By.cssSelector(".accordion > div:nth-of-type(1)")).click();
//        driver.findElement(By.cssSelector(".accordion > div:nth-of-type(1)")).click();
//        driver.findElement(By.cssSelector(".accordion > div:nth-of-type(3)")).click();
//        driver.findElement(By.cssSelector(".accordion > div:nth-of-type(3)")).click();
//        driver.findElement(By.cssSelector(".accordion > div:nth-of-type(5)")).click();
//        driver.findElement(By.cssSelector(".accordion > div:nth-of-type(5)")).click();

        for(int i=0;i<10;i++){
            driver.findElement(By.cssSelector(".accordion > div:nth-of-type(1)")).click();

        }



    }
}
