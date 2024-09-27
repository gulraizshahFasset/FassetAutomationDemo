@Kyc
Feature: Kyc Request Feature

  @admin @NavigateToLoginPageAdmin @Regression @Sanity @Essential
  Scenario: Navigate to Login Page
    Then Verify user is on "Login Credentials" screen

  @admin @Kyc @SearchKycRequestByUserId @Regression @Sanity
  Scenario: Search kyc request by registered user id
    Given Verify user is on "Login Credentials" screen
    When User fills "Valid" form data on "login" screen
    Then Verify user is on "homepage" screen
    When User clicks "Kyc Request" link on "Customers" menu from sidebar
    Then Verify "Kyc Request List" present on "Kyc Request" screen and click
    And User clicks "Recommended by VIDA" tab on "Kyc Request" screen
    And User clicks "User ID" dropdown on "Kyc Request" screen
    And User fills "Valid User ID" form data on "Kyc Request" screen
    And User clicks "Search" button on "Kyc Request" screen
    Then Verify "Selected User" present on "Kyc Request" screen and click

  @admin @Kyc @SearchKycRequestByLegalName @Regression @Sanity
  Scenario: Search kyc request by registered legal name
    Given Verify user is on "Login Credentials" screen
    When User fills "Valid" form data on "login" screen
    Then Verify user is on "homepage" screen
    When User clicks "Kyc Request" link on "Customers" menu from sidebar
    Then Verify "Kyc Request List" present on "Kyc Request" screen and click
    And User clicks "Recommended by VIDA" tab on "Kyc Request" screen
    And User clicks "Legal Name" dropdown on "Kyc Request" screen
    And User fills "Valid Legal Name" form data on "Kyc Request" screen
    And User clicks "Search" button on "Kyc Request" screen
    Then Verify "Selected User" present on "Kyc Request" screen and click

  @admin @Kyc @SearchKycRequestByName @Regression @Sanity
  Scenario: Search kyc request by registered name
    Given Verify user is on "Login Credentials" screen
    When User fills "Valid" form data on "login" screen
    Then Verify user is on "homepage" screen
    When User clicks "Kyc Request" link on "Customers" menu from sidebar
    Then Verify "Kyc Request List" present on "Kyc Request" screen and click
    And User clicks "Recommended by VIDA" tab on "Kyc Request" screen
    And User clicks "Name" dropdown on "Kyc Request" screen
    And User fills "Valid Name" form data on "Kyc Request" screen
    And User clicks "Search" button on "Kyc Request" screen
    Then Verify "Selected User" present on "Kyc Request" screen and click

  @admin @Kyc @SearchKycRequestByEmail @Regression @Sanity
  Scenario: Search kyc request by registered email
    Given Verify user is on "Login Credentials" screen
    When User fills "Valid" form data on "login" screen
    Then Verify user is on "homepage" screen
    When User clicks "Kyc Request" link on "Customers" menu from sidebar
    Then Verify "Kyc Request List" present on "Kyc Request" screen and click
    And User clicks "Recommended by VIDA" tab on "Kyc Request" screen
    And User clicks "Email" dropdown on "Kyc Request" screen
    And User fills "Valid Email" form data on "Kyc Request" screen
    And User clicks "Search" button on "Kyc Request" screen
    Then Verify "Selected User" present on "Kyc Request" screen and click

  @admin @Kyc @SearchKycRequestByPhone @Regression @Sanity
  Scenario: Search kyc request by registered phone
    Given Verify user is on "Login Credentials" screen
    When User fills "Valid" form data on "login" screen
    Then Verify user is on "homepage" screen
    When User clicks "Kyc Request" link on "Customers" menu from sidebar
    Then Verify "Kyc Request List" present on "Kyc Request" screen and click
    And User clicks "Recommended by VIDA" tab on "Kyc Request" screen
    And User clicks "Phone" dropdown on "Kyc Request" screen
    And User fills "Valid Phone" form data on "Kyc Request" screen
    And User clicks "Search" button on "Kyc Request" screen
    Then Verify "Selected User" present on "Kyc Request" screen and click

  @admin @Kyc @SearchKycRequestByRegisteredDate @Regression @Sanity
  Scenario: Search kyc request by registered date
    Given Verify user is on "Login Credentials" screen
    When User fills "Valid" form data on "login" screen
    Then Verify user is on "homepage" screen
    When User clicks "Kyc Request" link on "Customers" menu from sidebar
    Then Verify "Kyc Request List" present on "Kyc Request" screen and click
    And User clicks "Recommended by VIDA" tab on "Kyc Request" screen
    And User clicks "Registered Date" dropdown on "Kyc Request" screen
    And User clicks "Search" button on "Kyc Request" screen
    Then Verify "Selected User" present on "Kyc Request" screen and click

  @admin @Kyc @SearchKycRequestBySubmittedDate @Regression @Sanity
  Scenario: Search kyc request by submitted date
    Given Verify user is on "Login Credentials" screen
    When User fills "Valid" form data on "login" screen
    Then Verify user is on "homepage" screen
    When User clicks "Kyc Request" link on "Customers" menu from sidebar
    Then Verify "Kyc Request List" present on "Kyc Request" screen and click
    And User clicks "Recommended by VIDA" tab on "Kyc Request" screen
    And User clicks "Submitted Date" dropdown on "Kyc Request" screen
    And User clicks "Search" button on "Kyc Request" screen
    Then Verify "Selected User" present on "Kyc Request" screen and click
