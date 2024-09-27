@Login
Feature: Login Feature

  @admin @NavigateToLoginPageAdmin @Regression @Sanity @Essential
  Scenario: Navigate to Login Page
    Then Verify user is on "Login Credentials" screen

  @admin @LoginThroughUnregisteredEmailAdmin @Regression @Sanity
  Scenario: Login with unregistered email
    Given Verify user is on "Login Credentials" screen
    When User fills "InValid Account" form data on "login" screen
    Then Verify Validation Error "USER NOT FOUND" present on "Login" screen

  @admin @LoginThroughRegisteredEmailAdmin @Regression @Sanity
  Scenario: Login without credentials
    Given Verify user is on "Login Credentials" screen
    When User clicks "Sign in" button on "Login" screen
    Then Verify Validation Error "The input is not valid E-mail!" is not present on "Login" screen

  @admin @LoginThroughRegisteredEmailAdmin @Regression @Sanity
  Scenario: Login with registered email
    Given Verify user is on "Login Credentials" screen
    When User fills "Valid" form data on "login" screen
    Then Verify user is on "homepage" screen

