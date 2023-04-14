package com.ThirdSeleniumProject;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class L07_SureFire {
    WebDriver driver;


    @Test
    public void testng(){
        Assert.assertEquals("demo","demo");

    }
}
