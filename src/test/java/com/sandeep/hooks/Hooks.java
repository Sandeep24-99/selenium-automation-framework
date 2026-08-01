package com.sandeep.hooks;

import org.openqa.selenium.chrome.ChromeDriver;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import com.sandeep.base.BaseTest;

public class Hooks extends BaseTest {

    @Before
    public void setup() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.saucedemo.com/");
    }

    @After
    public void tearDown() {
        if(driver != null) {
            driver.quit();
        }
    }
}