package Section12;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import java.io.IOException;

public class L05_Login extends L05_BasePage {


    public L05_Login() throws IOException {
    }

    @Test
    public void signIn() throws InterruptedException, IOException {
        driver = getDriver();
        driver.get(getUrl());
        driver.findElement(By.cssSelector("[title] .hidden-sm-down")).click();
        driver.findElement(By.cssSelector("section input[name='email']")).sendKeys("testtest261@test.com");
        driver.findElement(By.cssSelector("[name='password']")).sendKeys("passpass261");
        driver.findElement(By.cssSelector("button#submit-login")).click();

        takeSnapShot(driver);
        System.out.println("user has logged in");
        //for demonstration purpose only
        Thread.sleep(2000);
    }

}
