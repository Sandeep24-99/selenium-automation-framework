package com.sandeep.base;
import org.openqa.selenium.WebDriver;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import com.sandeep.drivers.DriverFactory;
public class Basetest {
    protected WebDriver driver;
    protected DriverFactory driverFactory;

    @BeforeMethod
    public void setup() {
        driverFactory = new DriverFactory();
        driver = driverFactory.initializeDriver();
    }

    @AfterMethod
    public void tearDown() {
        if(driver != null) {
            driver.quit();
        }
    }
}   