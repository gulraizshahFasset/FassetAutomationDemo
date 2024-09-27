@Account_Screen
Feature: Account tab

  @mobile @Android
  Scenario: Account tab is accessible from Home screen
    Given Verify user is on "WELCOME" screen
    When User clicks "LOGIN" button on "Welcome" screen
    Then Verify user is on "Login" screen
    When User clicks "LOGIN" button on "Login" screen
    Then Verify user is on "Login Credentials" screen
    When User fills "Valid" form data on "login" screen
    Then Verify user is on "Homepage" screen
    When User clicks "ACCOUNT" button on "HOMEPAGE" screen
    Then Verify user is on "ACCOUNT" screen