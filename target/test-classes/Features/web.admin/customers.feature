@Customers
Feature: Customers Feature

  @admin @NavigateToLoginPageAdmin @Regression @Sanity @Essential
  Scenario: Navigate to Login Page
    Then Verify user is on "Login Credentials" screen

  @admin @Customer @SearchCustomerByUserId @Regression @Sanity
  Scenario: Search customer by registered user id
    Given Verify user is on "Login Credentials" screen
    When User fills "Valid" form data on "login" screen
    Then Verify user is on "homepage" screen
    When User clicks "Customers" link on "Customers" menu from sidebar
    Then Verify "Customer List" present on "Customers" screen and click
    And User clicks "User ID" dropdown on "Customers" screen
    And User fills "Valid User ID" form data on "Customers" screen
    And User clicks "Search" button on "Customers" screen
    Then Verify "Selected User" present on "Customers" screen and click

  @admin @Customer @SearchCustomerByLegalName @Regression @Sanity
  Scenario: Search customer by registered legal name
    Given Verify user is on "Login Credentials" screen
    When User fills "Valid" form data on "login" screen
    Then Verify user is on "homepage" screen
    When User clicks "Customers" link on "Customers" menu from sidebar
    Then Verify "Customer List" present on "Customers" screen and click
    And User clicks "Legal Name" dropdown on "Customers" screen
    And User fills "Valid Legal Name" form data on "Customers" screen
    And User clicks "Search" button on "Customers" screen
    Then Verify "Selected User" present on "Customers" screen and click

  @admin @Customer @SearchCustomerByName @Regression @Sanity
  Scenario: Search customer by registered name
    Given Verify user is on "Login Credentials" screen
    When User fills "Valid" form data on "login" screen
    Then Verify user is on "homepage" screen
    When User clicks "Customers" link on "Customers" menu from sidebar
    Then Verify "Customer List" present on "Customers" screen and click
    And User clicks "Name" dropdown on "Customers" screen
    And User fills "Valid Name" form data on "Customers" screen
    And User clicks "Search" button on "Customers" screen
    Then Verify "Selected User" present on "Customers" screen and click

  @admin @Customer @SearchCustomerByEmail @Regression @Sanity
  Scenario: Search customer by registered email
    Given Verify user is on "Login Credentials" screen
    When User fills "Valid" form data on "login" screen
    Then Verify user is on "homepage" screen
    When User clicks "Customers" link on "Customers" menu from sidebar
    Then Verify "Customer List" present on "Customers" screen and click
    And User clicks "Email" dropdown on "Customers" screen
    And User fills "Valid Email" form data on "Customers" screen
    And User clicks "Search" button on "Customers" screen
    Then Verify "Selected User" present on "Customers" screen and click

  @admin @Customer @SearchCustomerByUserType @Regression @Sanity
  Scenario: Search customer by registered user type
    Given Verify user is on "Login Credentials" screen
    When User fills "Valid" form data on "login" screen
    Then Verify user is on "homepage" screen
    When User clicks "Customers" link on "Customers" menu from sidebar
    Then Verify "Customer List" present on "Customers" screen and click
    And User clicks "User Type" dropdown on "Customers" screen
    And User fills "Valid User Type" form data on "Customers" screen
    And User clicks "Search" button on "Customers" screen
    Then Verify "Customer List" present on "Customers" screen and click

  @admin @Customer @SearchCustomerByPhone @Regression @Sanity
  Scenario: Search customer by registered phone
    Given Verify user is on "Login Credentials" screen
    When User fills "Valid" form data on "login" screen
    Then Verify user is on "homepage" screen
    When User clicks "Customers" link on "Customers" menu from sidebar
    Then Verify "Customer List" present on "Customers" screen and click
    And User clicks "Phone" dropdown on "Customers" screen
    And User fills "Valid Phone" form data on "Customers" screen
    And User clicks "Search" button on "Customers" screen
    Then Verify "Customer List" present on "Customers" screen and click

  @admin @Customer @SearchCustomerByRegisteredDate @Regression @Sanity
  Scenario: Search customer by registered date
    Given Verify user is on "Login Credentials" screen
    When User fills "Valid" form data on "login" screen
    Then Verify user is on "homepage" screen
    When User clicks "Customers" link on "Customers" menu from sidebar
    Then Verify "Customer List" present on "Customers" screen and click
    And User clicks "Registered Date" dropdown on "Customers" screen
    And User clicks "Search" button on "Customers" screen
    Then Verify "Customer List" present on "Customers" screen and click
