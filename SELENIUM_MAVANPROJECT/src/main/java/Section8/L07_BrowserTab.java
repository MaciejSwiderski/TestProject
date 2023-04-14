package Section8;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.ArrayList;
import java.util.Iterator;

public class L07_BrowserTab {
    public static void main(String[] args) throws InterruptedException {


        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("https://www.automationtesting.co.uk/browserTabs.html");

        for(int i=0;i<3;i++){
            driver.findElement(By.xpath("//input[@value='Open Tab']")).click();
        }


        ArrayList<String> windowsHandles = new ArrayList<>(driver.getWindowHandles());

        System.out.println("There are "+windowsHandles.size()+" tabs open");

        Iterator<String> iterator = windowsHandles.iterator();

        // Use the iterator to iterate over the ArrayList
        while (iterator.hasNext()) {
            String number = iterator.next();
            System.out.println(number);
        }
        // for each loop
        for(String tabId : windowsHandles){
            //Thread.sleep(1500);
            System.out.println(tabId);
        }
        driver.switchTo().window(windowsHandles.get(0));







    }
}
