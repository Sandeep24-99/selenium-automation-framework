Feature: Login Functionality

  Scenario: Login with valid credentials

    Given User launches the application
    When User enters username "standard_user"
    And User enters password "secret_sauce"
    And User clicks on Login button
    Then User should be navigated to the home page