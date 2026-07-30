package com.sandeep.stepdefinitions;

import com.sandeep.base.BaseTest;
import com.sandeep.pages.LoginPage;
import io.cucumber.java.en.*;

public class LoginSteps{
    LoginPage loginpage; 

    @Given("User launches the application")
    public void user_launches_the_application() {
        loginpage = new LoginPage(BaseTest.driver);
    }

    @When("User enters username {string}")
    public void user_enters_username(String username) {
        loginpage.enterUsername(username);
    }

    @When("User enters password {string}")
    public void user_enters_password(String password) {
        loginpage.enterPassword(password);          
    }

    @When("User clicks on Login button")
    public void user_clicks_login_button() {
        loginpage.clickLogin();
    }

    @Then("User should be navigated to the home page")
    public void user_should_be_navigated_to_home_page() {
        System.out.println("Login Successful");
    }
}
