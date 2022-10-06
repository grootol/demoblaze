Feature: logout feature

  check logout functionally

  Background: user must logged in account
    Given user is on login page
    When user enters login username as "admin" 
    And user enters login password as "admin"
    And user clicks on login button
    Then user is navigated to the home page
  
  @Logout
  Scenario: check logout with logged in user
    When user clicks on logout button
    Then account has logged out
