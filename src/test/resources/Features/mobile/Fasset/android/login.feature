@Login
Feature: Login Feature

  @mobile @Android @NavigateToLoginPage @Regression @Sanity @Essential
  Scenario: Navigate to Login Page
    Given Verify user is on "Welcome" screen
    When User clicks "LOGIN" button on "Welcome" screen
    Then Verify user is on "Login" screen
    When User clicks "LOGIN" button on "Login" screen
    Then Verify user is on "Login Credentials" screen

  @mobile @Android @AndroidMobileWeb @LoginThroughValidCredentials @Regression @Sanity
  Scenario: Login with valid credentials
    Given Verify user is on "Welcome" screen
    When User clicks "LOGIN" button on "Welcome" screen
    Then Verify user is on "Login" screen
    When User clicks "LOGIN" button on "Login" screen
    Then Verify user is on "Login Credentials" screen
    When User fills "Valid" form data on "login" screen
    # Then Verify user is on "OTP Selection" screen-(need acc with TFA off for automation)
    Then Verify user is on "Homepage" screen

  @mobile @Android @AndroidMobileWeb @LoginThroughUnregisteredEmail @Regression @Sanity
  Scenario: Login with unregistered email
    Given Verify user is on "Welcome" screen
    When User clicks "LOGIN" button on "Welcome" screen
    Then Verify user is on "Login" screen
    When User clicks "LOGIN" button on "Login" screen
    Then Verify user is on "Login Credentials" screen
    When User fills "Invalid Account" form data on "login" screen
    Then Verify Validation Error "USER NOT FOUND" present on "Login" screen

  @mobile @Android @AndroidMobileWeb @LoginWithoutCredentials @Regression @Sanity
  Scenario: Login without credentials
    Given Verify user is on "Welcome" screen
    When User clicks "LOGIN" button on "Welcome" screen
    Then Verify user is on "Login" screen
    When User clicks "LOGIN" button on "Login" screen
    Then Verify user is on "Login Credentials" screen
    When User clicks "LOGIN" button on "Login Credentials" screen
    Then Verify Validation Error "EMAIL IS REQUIRED" present on "Login Credential" screen
