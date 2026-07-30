package com.sandeep.drivers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.sandeep.utils.ConfigReader;

public class DriverFactory {
    private WebDriver driver;
    private ConfigReader configReader;

    public WebDriver initializeDriver(){
        configReader = new ConfigReader();

        String browser = configReader.getProperty("browser");
        if (browser.equalsIgnoreCase("chrome")) {

            driver = new ChromeDriver();

        } else {

            throw new RuntimeException("Browser not supported: " + browser);

        }
        driver.manage().window().maximize();
        return driver;
    }
}
