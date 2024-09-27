@HomePage
Feature: HomePage Feature

  @web @NavigateToHomePage @Regression @Sanity @home
  Scenario: Navigate to Home Page
    Given Verify user is on "Welcome" screen
    When User clicks "LOGIN" button on "Welcome" screen
    Then Verify user is on "Login Credentials" screen
    When User fills "Valid" form data on "login" screen
    Then Verify user is on "homepage" screen


  @web @NavigateToWalletList @Regression @Sanity @home
  Scenario: Navigate to Wallet Page
    Given Verify user is on "Welcome" screen
    When User clicks "LOGIN" button on "Welcome" screen
    Then Verify user is on "Login Credentials" screen
    When User fills "Valid" form data on "login" screen
    Then Verify user is on "homepage" screen
    When User clicks "wallet" button on "homepage" screen
    Then Verify user is on "wallet" screen

  @web @NavigateToMarketList @Regression @Sanity @home
  Scenario: Navigate to Market Page
    Given Verify user is on "Welcome" screen
    When User clicks "LOGIN" button on "Welcome" screen
    Then Verify user is on "Login Credentials" screen
    When User fills "Valid" form data on "login" screen
    Then Verify user is on "homepage" screen
    When User clicks "market" button on "homepage" screen
    Then Verify user is on "market" screen

  @web @NavigateToAccount @Regression @Sanity @home
  Scenario: Navigate to Account Page
    Given Verify user is on "Welcome" screen
    When User clicks "LOGIN" button on "Welcome" screen
    Then Verify user is on "Login Credentials" screen
    When User fills "Valid" form data on "login" screen
    Then Verify user is on "homepage" screen
    When User clicks "account" button on "homepage" screen
    Then Verify user is on "account" screen


