package com.sandeep.tests;

import org.testng.annotations.Test;

import com.sandeep.base.Basetest;
import com.sandeep.pages.LoginPage;
import com.sandeep.utils.ConfigReader;

public class LoginTest extends Basetest{
    private ConfigReader configReader = new ConfigReader();
    @Test
    public void verifyValidLogin() {

        driver.get(configReader.getProperty("url"));

        LoginPage loginPage = new LoginPage(driver);

        loginPage.login(
                configReader.getProperty("username"),
                configReader.getProperty("password"));
    }
}
