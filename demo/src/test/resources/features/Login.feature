@Login
Feature: login feature

  check login functionally

  Background: user must registration account
    Given user is on login page

  @ValidLogin
  Scenario: check login with valid credentials
    When user enters login username as "admin" 
    And user enters login password as "admin"
    And user clicks on login button
    Then user is navigated to the home page

  @InvalidPasswordLogin
  Scenario: check login with invalid password
    When user enters login username as "admin"
    And user enters login password as "admon"
    And user clicks on login button
    Then login message "Wrong password."

  @InvalidUsernameLogin
  Scenario: check login with invalid username
    When user enters login username as "admon"
    And user enters login password as "admin"
    And user clicks on login button
    Then login message "User does not exist."

  @EmptyLogin
  Scenario: check login with empty username and password
    When user enters login username as ""
    And user enters login password as ""
    And user clicks on login button
    Then login message "Please fill out Username and Password."



