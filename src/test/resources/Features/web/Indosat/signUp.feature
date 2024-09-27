@SignUp
Feature: SignUp Feature

  @web @NavigateToSignUpPageIndosat @Regression @Sanity @Essential
  Scenario: Navigate to SignUp Page
    Given Verify user is on "Welcome" screen
    When User clicks "Create Account" button on "Welcome" screen
    Then Verify user is on "Create Account" screen

  @web @SingUpWithInvalidData @Regression @Sanity
  Scenario: SignUp with Invalid Data
    Given Verify user is on "Welcome" screen
    When User clicks "Create Account" button on "Welcome" screen
    Then Verify user is on "Create Account" screen
    When User fills "Fail" form data on "CREATE ACCOUNT" screen
    Then Verify Validation Error "Invalid Data" present on "Create Account" screen


  @web @SingUpWithDuplicateEmail @Regression @Sanity
  Scenario: SignUp with Duplicate Email
    Given Verify user is on "Welcome" screen
    When User clicks "Create Account" button on "Welcome" screen
    Then Verify user is on "Create Account" screen
    When User fills "EXISTING EMAIL" form data on "CREATE ACCOUNT" screen
    Then Verify Validation Error "EXISTING EMAIL" present on "Create Account" screen

#  @web @SingUpWithExistingPhoneNumber @Regression @Sanity
#  Scenario: SignUp with Existing Phone Number
#    Given Verify user is on "Welcome" screen
#    When User clicks "Create Account" button on "Welcome" screen
#    Then Verify user is on "Create Account" screen
#    When User fills "EXISTING PHONE NUMBER" form data on "CREATE ACCOUNT" screen
#    Then Verify Validation Error "EXISTING EMAIL" present on "Create Account" screen
#

  @web @SignUpWithValidData @Regression @Sanity
  Scenario: Navigate to email Verification Page
    Given Verify user is on "Welcome" screen
    When User clicks "Create Account" button on "Welcome" screen
    Then Verify user is on "Create Account" screen
    When User fills "All" form data on "CREATE ACCOUNT" screen
    Then Verify user is on "Email Validation" screen



