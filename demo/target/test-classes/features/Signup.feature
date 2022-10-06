@Signup
Feature: signup feature

  check signup functionally

  Background: user must on website page
    Given user is on signup page

  @ValidSignup
  Scenario: check signup with valid credentials
    When user enters signup username as "admun" 
    And user enters signup password as "admun"
    And user clicks on signup button
    Then signup message "Sign up successful."

  @InvalidSignup
  Scenario: check signup with invalid credentials
    When user enters signup username as "admin"
    And user enters signup password as "admin"
    And user clicks on signup button
    Then signup message "This user already exist."

  @EmptySignup
  Scenario: check signup with empty textbox
    When user enters signup username as ""
    And user enters signup password as ""
    And user clicks on signup button
    Then signup message "Please fill out Username and Password."



